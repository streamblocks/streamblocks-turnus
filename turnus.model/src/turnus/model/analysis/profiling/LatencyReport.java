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
package turnus.model.analysis.profiling;

import java.util.List;

import turnus.model.analysis.AnalysisReport;
import turnus.model.dataflow.Network;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Latency Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getTime <em>Time</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getMappingFile <em>Mapping File</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getBufferFile <em>Buffer File</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getSource <em>Source</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getTargets <em>Targets</em>}</li>
 *   <li>{@link turnus.model.analysis.profiling.LatencyReport#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport()
 * @model
 * @generated
 */
public interface LatencyReport extends AnalysisReport {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(double)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_Time()
	 * @model
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.LatencyReport#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

	/**
	 * Returns the value of the '<em><b>Mapping File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping File</em>' attribute.
	 * @see #setMappingFile(String)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_MappingFile()
	 * @model
	 * @generated
	 */
	String getMappingFile();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.LatencyReport#getMappingFile <em>Mapping File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping File</em>' attribute.
	 * @see #getMappingFile()
	 * @generated
	 */
	void setMappingFile(String value);

	/**
	 * Returns the value of the '<em><b>Buffer File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer File</em>' attribute.
	 * @see #setBufferFile(String)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_BufferFile()
	 * @model
	 * @generated
	 */
	String getBufferFile();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.LatencyReport#getBufferFile <em>Buffer File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer File</em>' attribute.
	 * @see #getBufferFile()
	 * @generated
	 */
	void setBufferFile(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(LatencyData)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_Source()
	 * @model containment="true"
	 * @generated
	 */
	LatencyData getSource();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.LatencyReport#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LatencyData value);

	/**
	 * Returns the value of the '<em><b>Targets</b></em>' containment reference list.
	 * The list contents are of type {@link turnus.model.analysis.profiling.LatencyData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Targets</em>' containment reference list.
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_Targets()
	 * @model containment="true"
	 * @generated
	 */
	List<LatencyData> getTargets();

	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see turnus.model.analysis.profiling.ProfilingPackage#getLatencyReport_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.profiling.LatencyReport#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

} // LatencyReport
