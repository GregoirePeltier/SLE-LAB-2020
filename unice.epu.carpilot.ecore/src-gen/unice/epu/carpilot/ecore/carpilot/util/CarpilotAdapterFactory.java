/**
 */
package unice.epu.carpilot.ecore.carpilot.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import unice.epu.carpilot.ecore.carpilot.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see unice.epu.carpilot.ecore.carpilot.CarpilotPackage
 * @generated
 */
public class CarpilotAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CarpilotPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpilotAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CarpilotPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarpilotSwitch<Adapter> modelSwitch = new CarpilotSwitch<Adapter>() {
		@Override
		public Adapter caseCar(Car object) {
			return createCarAdapter();
		}

		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseRule(Rule object) {
			return createRuleAdapter();
		}

		@Override
		public Adapter caseCondition(Condition object) {
			return createConditionAdapter();
		}

		@Override
		public Adapter caseCommand(Command object) {
			return createCommandAdapter();
		}

		@Override
		public Adapter caseColorCondition(ColorCondition object) {
			return createColorConditionAdapter();
		}

		@Override
		public Adapter caseRuleEffect(RuleEffect object) {
			return createRuleEffectAdapter();
		}

		@Override
		public Adapter caseCommandEffect(CommandEffect object) {
			return createCommandEffectAdapter();
		}

		@Override
		public Adapter caseDistanceCondition(DistanceCondition object) {
			return createDistanceConditionAdapter();
		}

		@Override
		public Adapter caseAbilityEffect(AbilityEffect object) {
			return createAbilityEffectAdapter();
		}

		@Override
		public Adapter casePersistingRule(PersistingRule object) {
			return createPersistingRuleAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.Car
	 * @generated
	 */
	public Adapter createCarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.Command <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.Command
	 * @generated
	 */
	public Adapter createCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.ColorCondition <em>Color Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.ColorCondition
	 * @generated
	 */
	public Adapter createColorConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.RuleEffect <em>Rule Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.RuleEffect
	 * @generated
	 */
	public Adapter createRuleEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.CommandEffect <em>Command Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.CommandEffect
	 * @generated
	 */
	public Adapter createCommandEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.DistanceCondition <em>Distance Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.DistanceCondition
	 * @generated
	 */
	public Adapter createDistanceConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.AbilityEffect <em>Ability Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.AbilityEffect
	 * @generated
	 */
	public Adapter createAbilityEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link unice.epu.carpilot.ecore.carpilot.PersistingRule <em>Persisting Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see unice.epu.carpilot.ecore.carpilot.PersistingRule
	 * @generated
	 */
	public Adapter createPersistingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CarpilotAdapterFactory
