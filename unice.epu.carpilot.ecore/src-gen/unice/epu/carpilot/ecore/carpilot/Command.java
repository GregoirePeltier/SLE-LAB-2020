/**
 */
package unice.epu.carpilot.ecore.carpilot;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.Command#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link unice.epu.carpilot.ecore.carpilot.Direction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Direction
	 * @see #setDirection(Direction)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCommand_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.Command#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // Command
