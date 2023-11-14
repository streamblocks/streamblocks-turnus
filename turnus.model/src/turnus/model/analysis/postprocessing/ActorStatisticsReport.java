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
package turnus.model.analysis.postprocessing;

import java.util.Map;

import turnus.model.dataflow.Network;
import turnus.model.mapping.NetworkPartitioning;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Statistics Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getNetwork <em>Network</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getExecutionTime <em>Execution Time</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getPartitions <em>Partitions</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getIdleTimes <em>Idle Times</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getBlockedReadingTimes <em>Blocked Reading Times</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getBlockedWritingTimes <em>Blocked Writing Times</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getProcessingTimes <em>Processing Times</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getAverageOccupancy <em>Average Occupancy</em>}</li>
 *   <li>{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getOccupancyDeviation <em>Occupancy Deviation</em>}</li>
 * </ul>
 *
 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport()
 * @model
 * @generated
 */
public interface ActorStatisticsReport extends PostProcessingData {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' reference.
	 * @see #setNetwork(Network)
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_Network()
	 * @model
	 * @generated
	 */
	Network getNetwork();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getNetwork <em>Network</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' reference.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(Network value);

	/**
	 * Returns the value of the '<em><b>Execution Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Time</em>' attribute.
	 * @see #setExecutionTime(double)
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_ExecutionTime()
	 * @model
	 * @generated
	 */
	double getExecutionTime();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getExecutionTime <em>Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Time</em>' attribute.
	 * @see #getExecutionTime()
	 * @generated
	 */
	void setExecutionTime(double value);

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link turnus.model.analysis.postprocessing.StatisticalActorPartition},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' map.
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_Partitions()
	 * @model mapType="turnus.model.analysis.postprocessing.PartitionToActorStatisticalActorPartition&lt;org.eclipse.emf.ecore.EString, turnus.model.analysis.postprocessing.StatisticalActorPartition&gt;"
	 * @generated
	 */
	Map<String, StatisticalActorPartition> getPartitions();

	/**
	 * Returns the value of the '<em><b>Idle Times</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Times</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Times</em>' map.
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_IdleTimes()
	 * @model mapType="turnus.model.analysis.map.StringToDoubleMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	Map<String, Double> getIdleTimes();

	/**
	 * Returns the value of the '<em><b>Blocked Reading Times</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked Reading Times</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked Reading Times</em>' map.
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_BlockedReadingTimes()
	 * @model mapType="turnus.model.analysis.map.StringToDoubleMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	Map<String, Double> getBlockedReadingTimes();

	/**
	 * Returns the value of the '<em><b>Blocked Writing Times</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked Writing Times</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked Writing Times</em>' map.
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_BlockedWritingTimes()
	 * @model mapType="turnus.model.analysis.map.StringToDoubleMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	Map<String, Double> getBlockedWritingTimes();

	/**
	 * Returns the value of the '<em><b>Processing Times</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.Double},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing Times</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing Times</em>' map.
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_ProcessingTimes()
	 * @model mapType="turnus.model.analysis.map.StringToDoubleMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EDoubleObject&gt;"
	 * @generated
	 */
	Map<String, Double> getProcessingTimes();

	/**
	 * Returns the value of the '<em><b>Average Occupancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Occupancy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Occupancy</em>' attribute.
	 * @see #setAverageOccupancy(double)
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_AverageOccupancy()
	 * @model
	 * @generated
	 */
	double getAverageOccupancy();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getAverageOccupancy <em>Average Occupancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Occupancy</em>' attribute.
	 * @see #getAverageOccupancy()
	 * @generated
	 */
	void setAverageOccupancy(double value);

	/**
	 * Returns the value of the '<em><b>Occupancy Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupancy Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupancy Deviation</em>' attribute.
	 * @see #setOccupancyDeviation(double)
	 * @see turnus.model.analysis.postprocessing.PostprocessingPackage#getActorStatisticsReport_OccupancyDeviation()
	 * @model
	 * @generated
	 */
	double getOccupancyDeviation();

	/**
	 * Sets the value of the '{@link turnus.model.analysis.postprocessing.ActorStatisticsReport#getOccupancyDeviation <em>Occupancy Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupancy Deviation</em>' attribute.
	 * @see #getOccupancyDeviation()
	 * @generated
	 */
	void setOccupancyDeviation(double value);
	
	NetworkPartitioning asNetworkPartitioning();

} // ActorStatisticsReport
