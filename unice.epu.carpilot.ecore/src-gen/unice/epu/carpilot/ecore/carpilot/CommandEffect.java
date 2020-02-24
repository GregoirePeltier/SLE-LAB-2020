/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.CommandEffect#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCommandEffect()
 * @model
 * @generated
 */
public interface CommandEffect extends RuleEffect {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(Command)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCommandEffect_Command()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Command getCommand();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.CommandEffect#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(Command value);

} // CommandEffect
