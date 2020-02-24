/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import unice.epu.carpilot.ecore.carpilot.Camera;
import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.Color;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Color Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl#getColor <em>Color</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl#getCamera <em>Camera</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ColorConditionImpl extends ConditionImpl implements ColorCondition {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final Color COLOR_EDEFAULT = Color.RED;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected Color color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCamera() <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected static final Camera CAMERA_EDEFAULT = Camera.VERY_RIGHT;

	/**
	 * The cached value of the '{@link #getCamera() <em>Camera</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCamera()
	 * @generated
	 * @ordered
	 */
	protected Camera camera = CAMERA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarpilotPackage.Literals.COLOR_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		Color oldColor = color;
		color = newColor == null ? COLOR_EDEFAULT : newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.COLOR_CONDITION__COLOR, oldColor,
					color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera getCamera() {
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCamera(Camera newCamera) {
		Camera oldCamera = camera;
		camera = newCamera == null ? CAMERA_EDEFAULT : newCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.COLOR_CONDITION__CAMERA, oldCamera,
					camera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CarpilotPackage.COLOR_CONDITION__COLOR:
			return getColor();
		case CarpilotPackage.COLOR_CONDITION__CAMERA:
			return getCamera();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CarpilotPackage.COLOR_CONDITION__COLOR:
			setColor((Color) newValue);
			return;
		case CarpilotPackage.COLOR_CONDITION__CAMERA:
			setCamera((Camera) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case CarpilotPackage.COLOR_CONDITION__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case CarpilotPackage.COLOR_CONDITION__CAMERA:
			setCamera(CAMERA_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case CarpilotPackage.COLOR_CONDITION__COLOR:
			return color != COLOR_EDEFAULT;
		case CarpilotPackage.COLOR_CONDITION__CAMERA:
			return camera != CAMERA_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (color: ");
		result.append(color);
		result.append(", camera: ");
		result.append(camera);
		result.append(')');
		return result.toString();
	}

} //ColorConditionImpl
