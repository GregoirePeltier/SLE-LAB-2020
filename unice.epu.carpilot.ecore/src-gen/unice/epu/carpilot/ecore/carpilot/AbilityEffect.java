/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ability Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#getDirection <em>Direction</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#isDisable <em>Disable</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getAbilityEffect()
 * @model
 * @generated
 */
public interface AbilityEffect extends RuleEffect {
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
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getAbilityEffect_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable</em>' attribute.
	 * @see #setDisable(boolean)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getAbilityEffect_Disable()
	 * @model
	 * @generated
	 */
	boolean isDisable();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#isDisable <em>Disable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable</em>' attribute.
	 * @see #isDisable()
	 * @generated
	 */
	void setDisable(boolean value);

} // AbilityEffect
