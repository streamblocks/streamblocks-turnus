/* 
 * TURNUS - www.turnus.co
 * 
 * Copyright (C) 2010-2016 EPFL SCI STI MM
 *
 * This file is part of TURNUS.
 *
 * TURNUS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * TURNUS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with TURNUS.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Additional permission under GNU GPL version 3 section 7
 * 
 * If you modify this Program, or any covered work, by linking or combining it
 * with Eclipse (or a modified version of Eclipse or an Eclipse plugin or 
 * an Eclipse library), containing parts covered by the terms of the 
 * Eclipse Public License (EPL), the licensors of this Program grant you 
 * additional permission to convey the resulting work.  Corresponding Source 
 * for a non-source form of such a combination shall include the source code 
 * for the parts of Eclipse libraries used as well as that of the  covered work.
 * 
 */
package turnus.analysis.ui.partitioning;

import static turnus.common.TurnusExtensions.NETWORK_WEIGHT;
import static turnus.common.TurnusExtensions.TRACE;
import static turnus.common.TurnusExtensions.TRACEZ;
import static turnus.common.TurnusOptions.ACTION_WEIGHTS;
import static turnus.common.TurnusOptions.ANALYSIS_PARTITIONING_UNITS;
import static turnus.common.TurnusOptions.TRACE_FILE;
import static turnus.common.TurnusOptions.SCHEDULING_POLICY;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import turnus.analysis.partitioning.WorkloadBalancePartitioningCli;
import turnus.common.TurnusException;
import turnus.common.configuration.Configuration;
import turnus.common.io.Logger;
import turnus.model.analysis.AnalysisFactory;
import turnus.model.common.EScheduler;
import turnus.ui.util.EclipseUtils;
import turnus.ui.widget.WidgetComboBox;
import turnus.ui.widget.WidgetSelectFileCombo;
import turnus.ui.widget.WidgetSpinnerInteger;
import turnus.ui.wizard.AbstractWizardPage;

/**
 * 
 * @author Malgorzata Michalska
 *
 */
public class WorkloadBalancePartitioningWizard extends Wizard implements IWorkbenchWizard {

	/**
	 * The unique file page which contains the input and output file widgets
	 * 
	 * @author Simone Casale Brunet
	 *
	 */
	private class OptionsPage extends AbstractWizardPage {

		private WidgetSelectFileCombo wTraceFile;
		private WidgetSelectFileCombo wWeightsFile;
		private WidgetSpinnerInteger wUnits;
		private WidgetComboBox wSchedulers;

		private OptionsPage() {
			super("Workload Balance Partitioning algorithm");
			setTitle("Workload Balance Partitioning algorithm");
			setDescription("Select the options and run the analysis");
		}

		@Override
		protected void createWidgets(Composite container) {
			IProject project = EclipseUtils.getCurrentProject();

			// -- Trace File 
			String[] traceExtensions = { TRACE, TRACEZ };
			List<String> initialTraceFiles = new ArrayList<>();
			if (project != null && project.isOpen()) {
				initialTraceFiles = EclipseUtils.getPathsFromContainer(project, traceExtensions);
			}
			
			wTraceFile = new WidgetSelectFileCombo("Trace", "Trace file", traceExtensions, null, container);
			if (!initialTraceFiles.isEmpty())
				wTraceFile.setChoices(initialTraceFiles.toArray(new String[0]));
			addWidget(wTraceFile);
			
			// -- Weights File 
			String[] weightsExtension = { NETWORK_WEIGHT };
			List<String> initialExdfFiles = new ArrayList<>();
			if (project != null && project.isOpen()) {
				initialExdfFiles = EclipseUtils.getPathsFromContainer(project, weightsExtension);
			}

			wWeightsFile = new WidgetSelectFileCombo("Weights", "The network weight file", weightsExtension, null,
					container);
			if (!initialExdfFiles.isEmpty())
				wWeightsFile.setChoices(initialExdfFiles.toArray(new String[0]));
			addWidget(wWeightsFile);

			// -- Units
			wUnits = new WidgetSpinnerInteger("Units", "Select the number of available units", 1, Integer.MAX_VALUE, 1,
					2, container);
			addWidget(wUnits);
			
			// -- Scheduler
			List<String> scheds = new ArrayList<>();
			for (var s : EScheduler.values()){
				scheds.add(s.getName());
			}
			
			String[] schedulers = scheds.toArray(new String[0]);
			wSchedulers = new WidgetComboBox("Scheduler", "Select a scheduler", schedulers , schedulers[0],
					container);

		}

		public File getWeightsFile() {
			return wWeightsFile.getValue();
		}

		public File getTraceFile() {
			return wTraceFile.getValue();
		}

		public int getUnits() {
			return wUnits.getValue().intValue();
		}
		
		public String getSchedulingPolicy() {
			return wSchedulers.getValue();
		}

	}

	private OptionsPage optionsPage;

	public WorkloadBalancePartitioningWizard() {
		super();
		optionsPage = new OptionsPage();

		setNeedsProgressMonitor(true);

		EclipseUtils.openDefaultConsole();
	}

	@Override
	public void addPages() {
		addPage(optionsPage);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}

	@Override
	public boolean performFinish() {
		final Configuration configuration = new Configuration();
		configuration.setValue(TRACE_FILE, optionsPage.getTraceFile());
		configuration.setValue(ACTION_WEIGHTS, optionsPage.getWeightsFile());
		configuration.setValue(ANALYSIS_PARTITIONING_UNITS, optionsPage.getUnits());
		configuration.setValue(SCHEDULING_POLICY, optionsPage.getSchedulingPolicy());

		final Job job = new Job("Workload Balance Partitioning algorithm") {

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				try {
					new WorkloadBalancePartitioningCli().start(configuration, monitor);
					EclipseUtils.refreshWorkspace(monitor);
				} catch (TurnusException e) {
					Logger.error(e.getMessage());
				}
				return Status.OK_STATUS;
			}

		};

		job.setUser(true);
		job.schedule();

		return true;
	}

}
