/**
 */
package unice.epu.carpilot.ecore.carpilot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getColor <em>Color</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getCamera <em>Camera</em>}</li>
 * </ul>
 *
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getColorCondition()
 * @model
 * @generated
 */
public interface ColorCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link unice.epu.carpilot.ecore.carpilot.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Color
	 * @see #setColor(Color)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getColorCondition_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Camera</b></em>' attribute.
	 * The literals are from the enumeration {@link unice.epu.carpilot.ecore.carpilot.Camera}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Camera
	 * @see #setCamera(Camera)
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#getColorCondition_Camera()
	 * @model
	 * @generated
	 */
	Camera getCamera();

	/**
	 * Sets the value of the '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getCamera <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera</em>' attribute.
	 * @see unice.epu.carpilot.ecore.carpilot.Camera
	 * @see #getCamera()
	 * @generated
	 */
	void setCamera(Camera value);

} // ColorCondition
