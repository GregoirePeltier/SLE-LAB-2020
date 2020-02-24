/**
 */
package unice.epu.carpilot.ecore.carpilot;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.Car#getRules <em>Rules</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.Car#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCar()
 * @model
 * @generated
 */
public interface Car extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link unice.epu.carpilot.ecore.carpilot.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCar_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link unice.epu.carpilot.ecore.carpilot.Command}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getCar_Orders()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Command> getOrders();

} // Car
