/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import unice.epu.carpilot.ecore.carpilot.AbilityEffect;
import unice.epu.carpilot.ecore.carpilot.AnalogOperand;
import unice.epu.carpilot.ecore.carpilot.Camera;
import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.ecore.carpilot.CarpilotFactory;
import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.Color;
import unice.epu.carpilot.ecore.carpilot.ColorCondition;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.CommandEffect;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.ecore.carpilot.DistanceCondition;
import unice.epu.carpilot.ecore.carpilot.NamedElement;
import unice.epu.carpilot.ecore.carpilot.NumericOperand;
import unice.epu.carpilot.ecore.carpilot.PersistingRule;
import unice.epu.carpilot.ecore.carpilot.Rule;
import unice.epu.carpilot.ecore.carpilot.RuleEffect;
import unice.epu.carpilot.ecore.carpilot.Sensor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CarpilotPackageImpl extends EPackageImpl implements CarpilotPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass carEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass distanceConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abilityEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cameraEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sensorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum analogOperandEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numericOperandEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CarpilotPackageImpl() {
		super(eNS_URI, CarpilotFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link CarpilotPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CarpilotPackage init() {
		if (isInited)
			return (CarpilotPackage) EPackage.Registry.INSTANCE.getEPackage(CarpilotPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCarpilotPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CarpilotPackageImpl theCarpilotPackage = registeredCarpilotPackage instanceof CarpilotPackageImpl
				? (CarpilotPackageImpl) registeredCarpilotPackage
				: new CarpilotPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCarpilotPackage.createPackageContents();

		// Initialize created meta-data
		theCarpilotPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCarpilotPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CarpilotPackage.eNS_URI, theCarpilotPackage);
		return theCarpilotPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCar() {
		return carEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCar_Rules() {
		return (EReference) carEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCar_Orders() {
		return (EReference) carEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Condition() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Effect() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommand() {
		return commandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommand_Direction() {
		return (EAttribute) commandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorCondition() {
		return colorConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorCondition_Color() {
		return (EAttribute) colorConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorCondition_Camera() {
		return (EAttribute) colorConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleEffect() {
		return ruleEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandEffect() {
		return commandEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommandEffect_Command() {
		return (EReference) commandEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDistanceCondition() {
		return distanceConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceCondition_Sensor() {
		return (EAttribute) distanceConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceCondition_Distance() {
		return (EAttribute) distanceConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDistanceCondition_Operator() {
		return (EAttribute) distanceConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbilityEffect() {
		return abilityEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbilityEffect_Direction() {
		return (EAttribute) abilityEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbilityEffect_Disable() {
		return (EAttribute) abilityEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistingRule() {
		return persistingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistingRule_Stop() {
		return (EReference) persistingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCamera() {
		return cameraEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSensor() {
		return sensorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAnalogOperand() {
		return analogOperandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumericOperand() {
		return numericOperandEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpilotFactory getCarpilotFactory() {
		return (CarpilotFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		carEClass = createEClass(CAR);
		createEReference(carEClass, CAR__RULES);
		createEReference(carEClass, CAR__ORDERS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		ruleEClass = createEClass(RULE);
		createEReference(ruleEClass, RULE__CONDITION);
		createEReference(ruleEClass, RULE__EFFECT);

		conditionEClass = createEClass(CONDITION);

		commandEClass = createEClass(COMMAND);
		createEAttribute(commandEClass, COMMAND__DIRECTION);

		colorConditionEClass = createEClass(COLOR_CONDITION);
		createEAttribute(colorConditionEClass, COLOR_CONDITION__COLOR);
		createEAttribute(colorConditionEClass, COLOR_CONDITION__CAMERA);

		ruleEffectEClass = createEClass(RULE_EFFECT);

		commandEffectEClass = createEClass(COMMAND_EFFECT);
		createEReference(commandEffectEClass, COMMAND_EFFECT__COMMAND);

		distanceConditionEClass = createEClass(DISTANCE_CONDITION);
		createEAttribute(distanceConditionEClass, DISTANCE_CONDITION__SENSOR);
		createEAttribute(distanceConditionEClass, DISTANCE_CONDITION__DISTANCE);
		createEAttribute(distanceConditionEClass, DISTANCE_CONDITION__OPERATOR);

		abilityEffectEClass = createEClass(ABILITY_EFFECT);
		createEAttribute(abilityEffectEClass, ABILITY_EFFECT__DIRECTION);
		createEAttribute(abilityEffectEClass, ABILITY_EFFECT__DISABLE);

		persistingRuleEClass = createEClass(PERSISTING_RULE);
		createEReference(persistingRuleEClass, PERSISTING_RULE__STOP);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		cameraEEnum = createEEnum(CAMERA);
		colorEEnum = createEEnum(COLOR);
		sensorEEnum = createEEnum(SENSOR);
		analogOperandEEnum = createEEnum(ANALOG_OPERAND);
		numericOperandEEnum = createEEnum(NUMERIC_OPERAND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		carEClass.getESuperTypes().add(this.getNamedElement());
		colorConditionEClass.getESuperTypes().add(this.getCondition());
		commandEffectEClass.getESuperTypes().add(this.getRuleEffect());
		distanceConditionEClass.getESuperTypes().add(this.getCondition());
		abilityEffectEClass.getESuperTypes().add(this.getRuleEffect());
		persistingRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(carEClass, Car.class, "Car", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCar_Rules(), this.getRule(), null, "rules", null, 0, -1, Car.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCar_Orders(), this.getCommand(), null, "orders", null, 1, -1, Car.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRule_Condition(), this.getCondition(), null, "condition", null, 0, 1, Rule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Effect(), this.getRuleEffect(), null, "effect", null, 1, 1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEClass, Command.class, "Command", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommand_Direction(), this.getDirection(), "direction", null, 0, 1, Command.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorConditionEClass, ColorCondition.class, "ColorCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorCondition_Color(), this.getColor(), "color", null, 0, 1, ColorCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorCondition_Camera(), this.getCamera(), "camera", null, 0, 1, ColorCondition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEffectEClass, RuleEffect.class, "RuleEffect", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(commandEffectEClass, CommandEffect.class, "CommandEffect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommandEffect_Command(), this.getCommand(), null, "command", null, 1, 1, CommandEffect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(distanceConditionEClass, DistanceCondition.class, "DistanceCondition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDistanceCondition_Sensor(), this.getSensor(), "sensor", "front", 0, 1,
				DistanceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceCondition_Distance(), ecorePackage.getEFloat(), "distance", null, 0, 1,
				DistanceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDistanceCondition_Operator(), this.getAnalogOperand(), "operator", null, 0, 1,
				DistanceCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(abilityEffectEClass, AbilityEffect.class, "AbilityEffect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbilityEffect_Direction(), this.getDirection(), "direction", null, 0, 1, AbilityEffect.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbilityEffect_Disable(), ecorePackage.getEBoolean(), "disable", null, 0, 1,
				AbilityEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(persistingRuleEClass, PersistingRule.class, "PersistingRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistingRule_Stop(), this.getCondition(), null, "stop", null, 0, 1, PersistingRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.FORWARD);
		addEEnumLiteral(directionEEnum, Direction.LEFT);
		addEEnumLiteral(directionEEnum, Direction.RIGHT);
		addEEnumLiteral(directionEEnum, Direction.BACKWARD);
		addEEnumLiteral(directionEEnum, Direction.STOP);

		initEEnum(cameraEEnum, Camera.class, "Camera");
		addEEnumLiteral(cameraEEnum, Camera.VERY_RIGHT);
		addEEnumLiteral(cameraEEnum, Camera.VERY_LEFT);
		addEEnumLiteral(cameraEEnum, Camera.LEFT);
		addEEnumLiteral(cameraEEnum, Camera.RIGHT);
		addEEnumLiteral(cameraEEnum, Camera.CENTER);

		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.BLUE);
		addEEnumLiteral(colorEEnum, Color.ORANGE);
		addEEnumLiteral(colorEEnum, Color.BLACK);
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BUILDING);

		initEEnum(sensorEEnum, Sensor.class, "Sensor");
		addEEnumLiteral(sensorEEnum, Sensor.FRONT);
		addEEnumLiteral(sensorEEnum, Sensor.DISTANCE_LEFT);
		addEEnumLiteral(sensorEEnum, Sensor.DISTANCE_RIGHT);

		initEEnum(analogOperandEEnum, AnalogOperand.class, "AnalogOperand");
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.GREATER);
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.GREATER_EQUALS);
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.EQUALS);
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.NOTEQUALS);
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.LOWER_EQUALS);
		addEEnumLiteral(analogOperandEEnum, AnalogOperand.LOWER);

		initEEnum(numericOperandEEnum, NumericOperand.class, "NumericOperand");
		addEEnumLiteral(numericOperandEEnum, NumericOperand.EQUALS);
		addEEnumLiteral(numericOperandEEnum, NumericOperand.NOTEQUALS);

		// Create resource
		createResource(eNS_URI);
	}

} //CarpilotPackageImpl
