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
package turnus.model.analysis.postprocessing.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import turnus.model.analysis.postprocessing.PostProcessingData;
import turnus.model.analysis.postprocessing.PostProcessingReport;
import turnus.model.analysis.postprocessing.PostprocessingPackage;
import turnus.model.dataflow.Network;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Post Processing Report</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#getDate <em>Date</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#getNetwork <em>Network</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#getTime <em>Time</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#isDeadlock <em>Deadlock</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.impl.PostProcessingReportImpl#getReports <em>Reports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostProcessingReportImpl extends MinimalEObjectImpl.Container implements PostProcessingReport {
	/**
	 * The default value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected static final String ALGORITHM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected String algorithm = ALGORITHM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNetwork() <em>Network</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetwork()
	 * @generated
	 * @ordered
	 */
	protected Network network;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected double time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #isDeadlock() <em>Deadlock</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDeadlock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEADLOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeadlock() <em>Deadlock</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isDeadlock()
	 * @generated
	 * @ordered
	 */
	protected boolean deadlock = DEADLOCK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReports() <em>Reports</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReports()
	 * @generated
	 * @ordered
	 */
	protected EList<PostProcessingData> reports;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PostProcessingReportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PostprocessingPackage.Literals.POST_PROCESSING_REPORT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(String newAlgorithm) {
		String oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostprocessingPackage.POST_PROCESSING_REPORT__ALGORITHM, oldAlgorithm, algorithm));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostprocessingPackage.POST_PROCESSING_REPORT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network getNetwork() {
		if (network != null && network.eIsProxy()) {
			InternalEObject oldNetwork = (InternalEObject)network;
			network = (Network)eResolveProxy(oldNetwork);
			if (network != oldNetwork) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK, oldNetwork, network));
			}
		}
		return network;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Network basicGetNetwork() {
		return network;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetwork(Network newNetwork) {
		Network oldNetwork = network;
		network = newNetwork;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK, oldNetwork, network));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(double newTime) {
		double oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostprocessingPackage.POST_PROCESSING_REPORT__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDeadlock() {
		return deadlock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeadlock(boolean newDeadlock) {
		boolean oldDeadlock = deadlock;
		deadlock = newDeadlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PostprocessingPackage.POST_PROCESSING_REPORT__DEADLOCK, oldDeadlock, deadlock));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<PostProcessingData> getReports() {
		if (reports == null) {
			reports = new EObjectResolvingEList<PostProcessingData>(PostProcessingData.class, this, PostprocessingPackage.POST_PROCESSING_REPORT__REPORTS);
		}
		return reports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PostprocessingPackage.POST_PROCESSING_REPORT__ALGORITHM:
				return getAlgorithm();
			case PostprocessingPackage.POST_PROCESSING_REPORT__DATE:
				return getDate();
			case PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK:
				if (resolve) return getNetwork();
				return basicGetNetwork();
			case PostprocessingPackage.POST_PROCESSING_REPORT__TIME:
				return getTime();
			case PostprocessingPackage.POST_PROCESSING_REPORT__DEADLOCK:
				return isDeadlock();
			case PostprocessingPackage.POST_PROCESSING_REPORT__REPORTS:
				return getReports();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PostprocessingPackage.POST_PROCESSING_REPORT__ALGORITHM:
				setAlgorithm((String)newValue);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__DATE:
				setDate((Date)newValue);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK:
				setNetwork((Network)newValue);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__TIME:
				setTime((Double)newValue);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__DEADLOCK:
				setDeadlock((Boolean)newValue);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__REPORTS:
				getReports().clear();
				getReports().addAll((Collection<? extends PostProcessingData>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PostprocessingPackage.POST_PROCESSING_REPORT__ALGORITHM:
				setAlgorithm(ALGORITHM_EDEFAULT);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK:
				setNetwork((Network)null);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__DEADLOCK:
				setDeadlock(DEADLOCK_EDEFAULT);
				return;
			case PostprocessingPackage.POST_PROCESSING_REPORT__REPORTS:
				getReports().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PostprocessingPackage.POST_PROCESSING_REPORT__ALGORITHM:
				return ALGORITHM_EDEFAULT == null ? algorithm != null : !ALGORITHM_EDEFAULT.equals(algorithm);
			case PostprocessingPackage.POST_PROCESSING_REPORT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case PostprocessingPackage.POST_PROCESSING_REPORT__NETWORK:
				return network != null;
			case PostprocessingPackage.POST_PROCESSING_REPORT__TIME:
				return time != TIME_EDEFAULT;
			case PostprocessingPackage.POST_PROCESSING_REPORT__DEADLOCK:
				return deadlock != DEADLOCK_EDEFAULT;
			case PostprocessingPackage.POST_PROCESSING_REPORT__REPORTS:
				return reports != null && !reports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * ª
	 * @generated NOT
	 */
	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("\n[POST PROCESSING REPORT]");
		b.append(String.format("\n Network...........................: %s", getNetwork().getName()));
		b.append(String.format("\n Execution time....................: %s", getTime()));
		b.append(String.format("\n Deadlock..........................: %s", isDeadlock()));
		b.append("\n\n Reports:\n");

		for (PostProcessingData report : getReports()) {
			b.append(report.toString());
		}

		b.append("\n\n");

		return b.toString();
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T getReport(Class<T> type) {
		for (PostProcessingData report : getReports()) {
			if (type.isAssignableFrom(report.getClass())) {
				return (T) report;
			}
		}
		return null;
	}

} // PostProcessingReportImpl
