/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matching Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.MatchingEffect#getFailsafe <em>Failsafe</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getMatchingEffect()
 * @model
 * @generated
 */
public interface MatchingEffect extends RuleEffect {

	/**
	 * Returns the value of the '<em><b>Failsafe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failsafe</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failsafe</em>' containment reference.
	 * @see #setFailsafe(Command)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getMatchingEffect_Failsafe()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getFailsafe();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.MatchingEffect#getFailsafe <em>Failsafe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failsafe</em>' containment reference.
	 * @see #getFailsafe()
	 * @generated
	 */
	void setFailsafe(Command value);
} // MatchingEffect
