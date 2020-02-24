/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getSensor <em>Sensor</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getDistance <em>Distance</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getDistanceCondition()
 * @model
 * @generated
 */
public interface DistanceCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Sensor</b></em>' attribute.
	 * The default value is <code>"front"</code>.
	 * The literals are from the enumeration {@link unice.epu.carpilot.ecore.carpilot.Sensor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensor</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Sensor
	 * @see #setSensor(Sensor)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getDistanceCondition_Sensor()
	 * @model default="front"
	 * @generated
	 */
	Sensor getSensor();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getSensor <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensor</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Sensor
	 * @see #getSensor()
	 * @generated
	 */
	void setSensor(Sensor value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(float)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getDistanceCondition_Distance()
	 * @model
	 * @generated
	 */
	float getDistance();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(float value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link unice.epu.carpilot.ecore.carpilot.AnalogOperand}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.AnalogOperand
	 * @see #setOperator(AnalogOperand)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getDistanceCondition_Operator()
	 * @model
	 * @generated
	 */
	AnalogOperand getOperator();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.AnalogOperand
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AnalogOperand value);

} // DistanceCondition
