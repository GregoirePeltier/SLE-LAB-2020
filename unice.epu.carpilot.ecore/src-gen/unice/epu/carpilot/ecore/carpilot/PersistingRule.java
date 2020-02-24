/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persisting Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.PersistingRule#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getPersistingRule()
 * @model
 * @generated
 */
public interface PersistingRule extends Rule {
	/**
	 * Returns the value of the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop</em>' containment reference.
	 * @see #setStop(Condition)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getPersistingRule_Stop()
	 * @model containment="true"
	 * @generated
	 */
	Condition getStop();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.PersistingRule#getStop <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop</em>' containment reference.
	 * @see #getStop()
	 * @generated
	 */
	void setStop(Condition value);

} // PersistingRule
