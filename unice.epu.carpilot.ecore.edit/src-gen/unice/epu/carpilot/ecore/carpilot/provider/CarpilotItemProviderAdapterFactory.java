/**
 */
package unice.epu.carpilot.ecore.carpilot.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import unice.epu.carpilot.ecore.carpilot.util.CarpilotAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CarpilotItemProviderAdapterFactory extends CarpilotAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarpilotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.Car} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarItemProvider carItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.Car}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCarAdapter() {
		if (carItemProvider == null) {
			carItemProvider = new CarItemProvider(this);
		}

		return carItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.Rule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleItemProvider ruleItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRuleAdapter() {
		if (ruleItemProvider == null) {
			ruleItemProvider = new RuleItemProvider(this);
		}

		return ruleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.Command} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandItemProvider commandItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.Command}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandAdapter() {
		if (commandItemProvider == null) {
			commandItemProvider = new CommandItemProvider(this);
		}

		return commandItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.ColorCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorConditionItemProvider colorConditionItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.ColorCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorConditionAdapter() {
		if (colorConditionItemProvider == null) {
			colorConditionItemProvider = new ColorConditionItemProvider(this);
		}

		return colorConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.CommandEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandEffectItemProvider commandEffectItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.CommandEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommandEffectAdapter() {
		if (commandEffectItemProvider == null) {
			commandEffectItemProvider = new CommandEffectItemProvider(this);
		}

		return commandEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.DistanceCondition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceConditionItemProvider distanceConditionItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.DistanceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistanceConditionAdapter() {
		if (distanceConditionItemProvider == null) {
			distanceConditionItemProvider = new DistanceConditionItemProvider(this);
		}

		return distanceConditionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.AbilityEffect} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbilityEffectItemProvider abilityEffectItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.AbilityEffect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAbilityEffectAdapter() {
		if (abilityEffectItemProvider == null) {
			abilityEffectItemProvider = new AbilityEffectItemProvider(this);
		}

		return abilityEffectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link unice.epu.carpilot.ecore.carpilot.PersistingRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistingRuleItemProvider persistingRuleItemProvider;

	/**
	 * This creates an adapter for a {@link unice.epu.carpilot.ecore.carpilot.PersistingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPersistingRuleAdapter() {
		if (persistingRuleItemProvider == null) {
			persistingRuleItemProvider = new PersistingRuleItemProvider(this);
		}

		return persistingRuleItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (carItemProvider != null)
			carItemProvider.dispose();
		if (namedElementItemProvider != null)
			namedElementItemProvider.dispose();
		if (ruleItemProvider != null)
			ruleItemProvider.dispose();
		if (commandItemProvider != null)
			commandItemProvider.dispose();
		if (colorConditionItemProvider != null)
			colorConditionItemProvider.dispose();
		if (commandEffectItemProvider != null)
			commandEffectItemProvider.dispose();
		if (distanceConditionItemProvider != null)
			distanceConditionItemProvider.dispose();
		if (abilityEffectItemProvider != null)
			abilityEffectItemProvider.dispose();
		if (persistingRuleItemProvider != null)
			persistingRuleItemProvider.dispose();
	}

}
