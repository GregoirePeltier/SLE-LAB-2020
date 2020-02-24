/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unice.epu.carpilot.ecore.carpilot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarpilotFactoryImpl extends EFactoryImpl implements CarpilotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CarpilotFactory init() {
		try {
			CarpilotFactory theCarpilotFactory = (CarpilotFactory) EPackage.Registry.INSTANCE
					.getEFactory(CarpilotPackage.eNS_URI);
			if (theCarpilotFactory != null) {
				return theCarpilotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CarpilotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpilotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CarpilotPackage.CAR:
			return createCar();
		case CarpilotPackage.NAMED_ELEMENT:
			return createNamedElement();
		case CarpilotPackage.RULE:
			return createRule();
		case CarpilotPackage.COMMAND:
			return createCommand();
		case CarpilotPackage.COLOR_CONDITION:
			return createColorCondition();
		case CarpilotPackage.COMMAND_EFFECT:
			return createCommandEffect();
		case CarpilotPackage.DISTANCE_CONDITION:
			return createDistanceCondition();
		case CarpilotPackage.ABILITY_EFFECT:
			return createAbilityEffect();
		case CarpilotPackage.PERSISTING_RULE:
			return createPersistingRule();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CarpilotPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		case CarpilotPackage.CAMERA:
			return createCameraFromString(eDataType, initialValue);
		case CarpilotPackage.COLOR:
			return createColorFromString(eDataType, initialValue);
		case CarpilotPackage.SENSOR:
			return createSensorFromString(eDataType, initialValue);
		case CarpilotPackage.ANALOG_OPERAND:
			return createAnalogOperandFromString(eDataType, initialValue);
		case CarpilotPackage.NUMERIC_OPERAND:
			return createNumericOperandFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CarpilotPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		case CarpilotPackage.CAMERA:
			return convertCameraToString(eDataType, instanceValue);
		case CarpilotPackage.COLOR:
			return convertColorToString(eDataType, instanceValue);
		case CarpilotPackage.SENSOR:
			return convertSensorToString(eDataType, instanceValue);
		case CarpilotPackage.ANALOG_OPERAND:
			return convertAnalogOperandToString(eDataType, instanceValue);
		case CarpilotPackage.NUMERIC_OPERAND:
			return convertNumericOperandToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car createCar() {
		CarImpl car = new CarImpl();
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Command createCommand() {
		CommandImpl command = new CommandImpl();
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorCondition createColorCondition() {
		ColorConditionImpl colorCondition = new ColorConditionImpl();
		return colorCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandEffect createCommandEffect() {
		CommandEffectImpl commandEffect = new CommandEffectImpl();
		return commandEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistanceCondition createDistanceCondition() {
		DistanceConditionImpl distanceCondition = new DistanceConditionImpl();
		return distanceCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbilityEffect createAbilityEffect() {
		AbilityEffectImpl abilityEffect = new AbilityEffectImpl();
		return abilityEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistingRule createPersistingRule() {
		PersistingRuleImpl persistingRule = new PersistingRuleImpl();
		return persistingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCameraFromString(EDataType eDataType, String initialValue) {
		Camera result = Camera.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCameraToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensorFromString(EDataType eDataType, String initialValue) {
		Sensor result = Sensor.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnalogOperand createAnalogOperandFromString(EDataType eDataType, String initialValue) {
		AnalogOperand result = AnalogOperand.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAnalogOperandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericOperand createNumericOperandFromString(EDataType eDataType, String initialValue) {
		NumericOperand result = NumericOperand.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumericOperandToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpilotPackage getCarpilotPackage() {
		return (CarpilotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CarpilotPackage getPackage() {
		return CarpilotPackage.eINSTANCE;
	}

} //CarpilotFactoryImpl
