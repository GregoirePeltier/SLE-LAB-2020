/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import unice.epu.carpilot.ecore.carpilot.Car;
import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Rule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Car</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.CarImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.CarImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CarImpl extends NamedElementImpl implements Car {
	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Command> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarpilotPackage.Literals.CAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, CarpilotPackage.CAR__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Command> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Command>(Command.class, this, CarpilotPackage.CAR__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CarpilotPackage.CAR__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
		case CarpilotPackage.CAR__ORDERS:
			return ((InternalEList<?>) getOrders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CarpilotPackage.CAR__RULES:
			return getRules();
		case CarpilotPackage.CAR__ORDERS:
			return getOrders();
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
		case CarpilotPackage.CAR__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case CarpilotPackage.CAR__ORDERS:
			getOrders().clear();
			getOrders().addAll((Collection<? extends Command>) newValue);
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
		case CarpilotPackage.CAR__RULES:
			getRules().clear();
			return;
		case CarpilotPackage.CAR__ORDERS:
			getOrders().clear();
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
		case CarpilotPackage.CAR__RULES:
			return rules != null && !rules.isEmpty();
		case CarpilotPackage.CAR__ORDERS:
			return orders != null && !orders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarImpl
