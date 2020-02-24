/**
 */
package unice.epu.carpilot.ecore.carpilot.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import unice.epu.carpilot.ecore.carpilot.CarpilotPackage;
import unice.epu.carpilot.ecore.carpilot.Condition;
import unice.epu.carpilot.ecore.carpilot.PersistingRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Persisting Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unice.epu.carpilot.ecore.carpilot.impl.PersistingRuleImpl#getStop <em>Stop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersistingRuleImpl extends RuleImpl implements PersistingRule {
	/**
	 * The cached value of the '{@link #getStop() <em>Stop</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStop()
	 * @generated
	 * @ordered
	 */
	protected Condition stop;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CarpilotPackage.Literals.PERSISTING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getStop() {
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStop(Condition newStop, NotificationChain msgs) {
		Condition oldStop = stop;
		stop = newStop;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CarpilotPackage.PERSISTING_RULE__STOP, oldStop, newStop);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStop(Condition newStop) {
		if (newStop != stop) {
			NotificationChain msgs = null;
			if (stop != null)
				msgs = ((InternalEObject) stop).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CarpilotPackage.PERSISTING_RULE__STOP, null, msgs);
			if (newStop != null)
				msgs = ((InternalEObject) newStop).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CarpilotPackage.PERSISTING_RULE__STOP, null, msgs);
			msgs = basicSetStop(newStop, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CarpilotPackage.PERSISTING_RULE__STOP, newStop,
					newStop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CarpilotPackage.PERSISTING_RULE__STOP:
			return basicSetStop(null, msgs);
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
		case CarpilotPackage.PERSISTING_RULE__STOP:
			return getStop();
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
		case CarpilotPackage.PERSISTING_RULE__STOP:
			setStop((Condition) newValue);
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
		case CarpilotPackage.PERSISTING_RULE__STOP:
			setStop((Condition) null);
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
		case CarpilotPackage.PERSISTING_RULE__STOP:
			return stop != null;
		}
		return super.eIsSet(featureID);
	}

} //PersistingRuleImpl
