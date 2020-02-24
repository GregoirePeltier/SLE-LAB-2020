/**
 */
package unice.epu.carpilot.ecore.carpilot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotFactory
 * @model kind="package"
 * @generated
 */
public interface CarpilotPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "carpilot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/carpilot";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "carpilot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CarpilotPackage eINSTANCE = unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl.init();

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.NamedElementImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__RULES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__ORDERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.RuleImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EFFECT = 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.ConditionImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CommandImpl <em>Command</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CommandImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCommand()
	 * @generated
	 */
	int COMMAND = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND__DIRECTION = 0;

	/**
	 * The number of structural features of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Command</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl <em>Color Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getColorCondition()
	 * @generated
	 */
	int COLOR_CONDITION = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONDITION__COLOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Camera</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONDITION__CAMERA = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Color Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Color Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOR_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.RuleEffectImpl <em>Rule Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.RuleEffectImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getRuleEffect()
	 * @generated
	 */
	int RULE_EFFECT = 6;

	/**
	 * The number of structural features of the '<em>Rule Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EFFECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Rule Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CommandEffectImpl <em>Command Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CommandEffectImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCommandEffect()
	 * @generated
	 */
	int COMMAND_EFFECT = 7;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EFFECT__COMMAND = RULE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Command Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EFFECT_FEATURE_COUNT = RULE_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Command Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_EFFECT_OPERATION_COUNT = RULE_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl <em>Distance Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getDistanceCondition()
	 * @generated
	 */
	int DISTANCE_CONDITION = 8;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION__SENSOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION__DISTANCE = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION__OPERATOR = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Distance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Distance Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.AbilityEffectImpl <em>Ability Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.AbilityEffectImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getAbilityEffect()
	 * @generated
	 */
	int ABILITY_EFFECT = 9;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_EFFECT__DIRECTION = RULE_EFFECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_EFFECT__DISABLE = RULE_EFFECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ability Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_EFFECT_FEATURE_COUNT = RULE_EFFECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Ability Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_EFFECT_OPERATION_COUNT = RULE_EFFECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.impl.PersistingRuleImpl <em>Persisting Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.impl.PersistingRuleImpl
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getPersistingRule()
	 * @generated
	 */
	int PERSISTING_RULE = 10;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTING_RULE__CONDITION = RULE__CONDITION;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTING_RULE__EFFECT = RULE__EFFECT;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTING_RULE__STOP = RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Persisting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTING_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Persisting Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTING_RULE_OPERATION_COUNT = RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.Direction
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 11;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.Camera <em>Camera</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.Camera
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 12;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.Color
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 13;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.Sensor <em>Sensor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.Sensor
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 14;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.AnalogOperand <em>Analog Operand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.AnalogOperand
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getAnalogOperand()
	 * @generated
	 */
	int ANALOG_OPERAND = 15;

	/**
	 * The meta object id for the '{@link unice.epu.carpilot.ecore.carpilot.NumericOperand <em>Numeric Operand</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unice.epu.carpilot.ecore.carpilot.NumericOperand
	 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getNumericOperand()
	 * @generated
	 */
	int NUMERIC_OPERAND = 16;

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the containment reference list '{@link unice.epu.carpilot.ecore.carpilot.Car#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Car#getRules()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Rules();

	/**
	 * Returns the meta object for the containment reference list '{@link unice.epu.carpilot.ecore.carpilot.Car#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Car#getOrders()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Orders();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference '{@link unice.epu.carpilot.ecore.carpilot.Rule#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Rule#getCondition()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link unice.epu.carpilot.ecore.carpilot.Rule#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Rule#getEffect()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Effect();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Command
	 * @generated
	 */
	EClass getCommand();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.Command#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Command#getDirection()
	 * @see #getCommand()
	 * @generated
	 */
	EAttribute getCommand_Direction();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition <em>Color Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Color Condition</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.ColorCondition
	 * @generated
	 */
	EClass getColorCondition();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.ColorCondition#getColor()
	 * @see #getColorCondition()
	 * @generated
	 */
	EAttribute getColorCondition_Color();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition#getCamera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.ColorCondition#getCamera()
	 * @see #getColorCondition()
	 * @generated
	 */
	EAttribute getColorCondition_Camera();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.RuleEffect <em>Rule Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Effect</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.RuleEffect
	 * @generated
	 */
	EClass getRuleEffect();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.CommandEffect <em>Command Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Effect</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.CommandEffect
	 * @generated
	 */
	EClass getCommandEffect();

	/**
	 * Returns the meta object for the containment reference '{@link unice.epu.carpilot.ecore.carpilot.CommandEffect#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.CommandEffect#getCommand()
	 * @see #getCommandEffect()
	 * @generated
	 */
	EReference getCommandEffect_Command();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition <em>Distance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Condition</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.DistanceCondition
	 * @generated
	 */
	EClass getDistanceCondition();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sensor</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.DistanceCondition#getSensor()
	 * @see #getDistanceCondition()
	 * @generated
	 */
	EAttribute getDistanceCondition_Sensor();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.DistanceCondition#getDistance()
	 * @see #getDistanceCondition()
	 * @generated
	 */
	EAttribute getDistanceCondition_Distance();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.DistanceCondition#getOperator()
	 * @see #getDistanceCondition()
	 * @generated
	 */
	EAttribute getDistanceCondition_Operator();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect <em>Ability Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability Effect</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.AbilityEffect
	 * @generated
	 */
	EClass getAbilityEffect();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.AbilityEffect#getDirection()
	 * @see #getAbilityEffect()
	 * @generated
	 */
	EAttribute getAbilityEffect_Direction();

	/**
	 * Returns the meta object for the attribute '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect#isDisable <em>Disable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disable</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.AbilityEffect#isDisable()
	 * @see #getAbilityEffect()
	 * @generated
	 */
	EAttribute getAbilityEffect_Disable();

	/**
	 * Returns the meta object for class '{@link unice.epu.carpilot.ecore.carpilot.PersistingRule <em>Persisting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persisting Rule</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.PersistingRule
	 * @generated
	 */
	EClass getPersistingRule();

	/**
	 * Returns the meta object for the containment reference '{@link unice.epu.carpilot.ecore.carpilot.PersistingRule#getStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stop</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.PersistingRule#getStop()
	 * @see #getPersistingRule()
	 * @generated
	 */
	EReference getPersistingRule_Stop();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Camera</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Camera
	 * @generated
	 */
	EEnum getCamera();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.Sensor
	 * @generated
	 */
	EEnum getSensor();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.AnalogOperand <em>Analog Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analog Operand</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.AnalogOperand
	 * @generated
	 */
	EEnum getAnalogOperand();

	/**
	 * Returns the meta object for enum '{@link unice.epu.carpilot.ecore.carpilot.NumericOperand <em>Numeric Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Numeric Operand</em>'.
	 * @see unice.epu.carpilot.ecore.carpilot.NumericOperand
	 * @generated
	 */
	EEnum getNumericOperand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CarpilotFactory getCarpilotFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__RULES = eINSTANCE.getCar_Rules();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__ORDERS = eINSTANCE.getCar_Orders();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.NamedElementImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.RuleImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__CONDITION = eINSTANCE.getRule_Condition();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EFFECT = eINSTANCE.getRule_Effect();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.ConditionImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CommandImpl <em>Command</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CommandImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCommand()
		 * @generated
		 */
		EClass COMMAND = eINSTANCE.getCommand();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND__DIRECTION = eINSTANCE.getCommand_Direction();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl <em>Color Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.ColorConditionImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getColorCondition()
		 * @generated
		 */
		EClass COLOR_CONDITION = eINSTANCE.getColorCondition();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_CONDITION__COLOR = eINSTANCE.getColorCondition_Color();

		/**
		 * The meta object literal for the '<em><b>Camera</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLOR_CONDITION__CAMERA = eINSTANCE.getColorCondition_Camera();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.RuleEffectImpl <em>Rule Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.RuleEffectImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getRuleEffect()
		 * @generated
		 */
		EClass RULE_EFFECT = eINSTANCE.getRuleEffect();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.CommandEffectImpl <em>Command Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CommandEffectImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCommandEffect()
		 * @generated
		 */
		EClass COMMAND_EFFECT = eINSTANCE.getCommandEffect();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMAND_EFFECT__COMMAND = eINSTANCE.getCommandEffect_Command();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl <em>Distance Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.DistanceConditionImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getDistanceCondition()
		 * @generated
		 */
		EClass DISTANCE_CONDITION = eINSTANCE.getDistanceCondition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_CONDITION__SENSOR = eINSTANCE.getDistanceCondition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_CONDITION__DISTANCE = eINSTANCE.getDistanceCondition_Distance();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_CONDITION__OPERATOR = eINSTANCE.getDistanceCondition_Operator();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.AbilityEffectImpl <em>Ability Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.AbilityEffectImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getAbilityEffect()
		 * @generated
		 */
		EClass ABILITY_EFFECT = eINSTANCE.getAbilityEffect();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY_EFFECT__DIRECTION = eINSTANCE.getAbilityEffect_Direction();

		/**
		 * The meta object literal for the '<em><b>Disable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY_EFFECT__DISABLE = eINSTANCE.getAbilityEffect_Disable();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.impl.PersistingRuleImpl <em>Persisting Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.impl.PersistingRuleImpl
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getPersistingRule()
		 * @generated
		 */
		EClass PERSISTING_RULE = eINSTANCE.getPersistingRule();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTING_RULE__STOP = eINSTANCE.getPersistingRule_Stop();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.Direction
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.Camera <em>Camera</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.Camera
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getCamera()
		 * @generated
		 */
		EEnum CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.Color
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.Sensor <em>Sensor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.Sensor
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getSensor()
		 * @generated
		 */
		EEnum SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.AnalogOperand <em>Analog Operand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.AnalogOperand
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getAnalogOperand()
		 * @generated
		 */
		EEnum ANALOG_OPERAND = eINSTANCE.getAnalogOperand();

		/**
		 * The meta object literal for the '{@link unice.epu.carpilot.ecore.carpilot.NumericOperand <em>Numeric Operand</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unice.epu.carpilot.ecore.carpilot.NumericOperand
		 * @see unice.epu.carpilot.ecore.carpilot.impl.CarpilotPackageImpl#getNumericOperand()
		 * @generated
		 */
		EEnum NUMERIC_OPERAND = eINSTANCE.getNumericOperand();

	}

} //CarpilotPackage
