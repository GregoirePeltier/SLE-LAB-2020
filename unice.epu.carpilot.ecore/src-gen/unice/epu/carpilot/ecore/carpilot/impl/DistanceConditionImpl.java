/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import unice.epu.carpilot.ecore.carpilot.AnalogOperand;
import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.ecore.carpilot.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl#getSensor <em>Sensor</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceConditionImpl extends ConditionImpl implements DistanceCondition {
	/**
	 * The default value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected static final Sensor SENSOR_EDEFAULT = Sensor.FRONT;

	/**
	 * The cached value of the '{@link #getSensor() <em>Sensor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensor()
	 * @generated
	 * @ordered
	 */
	protected Sensor sensor = SENSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final float DISTANCE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected float distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final AnalogOperand OPERATOR_EDEFAULT = AnalogOperand.GREATER;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected AnalogOperand operator = OPERATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarpilotPackage.Literals.DISTANCE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getSensor() {
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensor(Sensor newSensor) {
		Sensor oldSensor = sensor;
		sensor = newSensor == null ? SENSOR_EDEFAULT : newSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.DISTANCE_CONDITION__SENSOR, oldSensor,
					sensor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(float newDistance) {
		float oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.DISTANCE_CONDITION__DISTANCE,
					oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogOperand getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(AnalogOperand newOperator) {
		AnalogOperand oldOperator = operator;
		operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.DISTANCE_CONDITION__OPERATOR,
					oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CarpilotPackage.DISTANCE_CONDITION__SENSOR:
			return getSensor();
		case CarpilotPackage.DISTANCE_CONDITION__DISTANCE:
			return getDistance();
		case CarpilotPackage.DISTANCE_CONDITION__OPERATOR:
			return getOperator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case CarpilotPackage.DISTANCE_CONDITION__SENSOR:
			setSensor((Sensor) newValue);
			return;
		case CarpilotPackage.DISTANCE_CONDITION__DISTANCE:
			setDistance((Float) newValue);
			return;
		case CarpilotPackage.DISTANCE_CONDITION__OPERATOR:
			setOperator((AnalogOperand) newValue);
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
		case CarpilotPackage.DISTANCE_CONDITION__SENSOR:
			setSensor(SENSOR_EDEFAULT);
			return;
		case CarpilotPackage.DISTANCE_CONDITION__DISTANCE:
			setDistance(DISTANCE_EDEFAULT);
			return;
		case CarpilotPackage.DISTANCE_CONDITION__OPERATOR:
			setOperator(OPERATOR_EDEFAULT);
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
		case CarpilotPackage.DISTANCE_CONDITION__SENSOR:
			return sensor != SENSOR_EDEFAULT;
		case CarpilotPackage.DISTANCE_CONDITION__DISTANCE:
			return distance != DISTANCE_EDEFAULT;
		case CarpilotPackage.DISTANCE_CONDITION__OPERATOR:
			return operator != OPERATOR_EDEFAULT;
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
		result.append(" (sensor: ");
		result.append(sensor);
		result.append(", distance: ");
		result.append(distance);
		result.append(", operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

} //DistanceConditionImpl
