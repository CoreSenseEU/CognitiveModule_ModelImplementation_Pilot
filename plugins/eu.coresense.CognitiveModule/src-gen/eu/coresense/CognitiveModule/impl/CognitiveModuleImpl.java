/**
 */
package eu.coresense.CognitiveModule.impl;

import eu.coresense.CognitiveModule.CognitiveModule;
import eu.coresense.CognitiveModule.CognitiveModulePackage;
import eu.coresense.CognitiveModule.Core;
import eu.coresense.CognitiveModule.Coupling;
import eu.coresense.CognitiveModule.Meta;
import eu.coresense.CognitiveModule.Modelet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cognitive Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getCore <em>Core</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getEfferent <em>Efferent</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getAfferent <em>Afferent</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl#getCoupling <em>Coupling</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CognitiveModuleImpl extends MinimalEObjectImpl.Container implements CognitiveModule {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Core core;

	/**
	 * The cached value of the '{@link #getEfferent() <em>Efferent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEfferent()
	 * @generated
	 * @ordered
	 */
	protected EList<Modelet> efferent;

	/**
	 * The cached value of the '{@link #getAfferent() <em>Afferent</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfferent()
	 * @generated
	 * @ordered
	 */
	protected EList<Modelet> afferent;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected Meta meta;

	/**
	 * The cached value of the '{@link #getCoupling() <em>Coupling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupling()
	 * @generated
	 * @ordered
	 */
	protected Coupling coupling;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CognitiveModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CognitiveModulePackage.Literals.COGNITIVE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CognitiveModulePackage.COGNITIVE_MODULE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Core getCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Core newCore, NotificationChain msgs) {
		Core oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CognitiveModulePackage.COGNITIVE_MODULE__CORE, oldCore, newCore);
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
	@Override
	public void setCore(Core newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject) core).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__CORE, null, msgs);
			if (newCore != null)
				msgs = ((InternalEObject) newCore).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__CORE, null, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CognitiveModulePackage.COGNITIVE_MODULE__CORE,
					newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modelet> getEfferent() {
		if (efferent == null) {
			efferent = new EObjectContainmentEList<Modelet>(Modelet.class, this,
					CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT);
		}
		return efferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Modelet> getAfferent() {
		if (afferent == null) {
			afferent = new EObjectContainmentEList<Modelet>(Modelet.class, this,
					CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT);
		}
		return afferent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeta(Meta newMeta, NotificationChain msgs) {
		Meta oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CognitiveModulePackage.COGNITIVE_MODULE__META, oldMeta, newMeta);
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
	@Override
	public void setMeta(Meta newMeta) {
		if (newMeta != meta) {
			NotificationChain msgs = null;
			if (meta != null)
				msgs = ((InternalEObject) meta).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__META, null, msgs);
			if (newMeta != null)
				msgs = ((InternalEObject) newMeta).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__META, null, msgs);
			msgs = basicSetMeta(newMeta, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CognitiveModulePackage.COGNITIVE_MODULE__META,
					newMeta, newMeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coupling getCoupling() {
		return coupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoupling(Coupling newCoupling, NotificationChain msgs) {
		Coupling oldCoupling = coupling;
		coupling = newCoupling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					CognitiveModulePackage.COGNITIVE_MODULE__COUPLING, oldCoupling, newCoupling);
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
	@Override
	public void setCoupling(Coupling newCoupling) {
		if (newCoupling != coupling) {
			NotificationChain msgs = null;
			if (coupling != null)
				msgs = ((InternalEObject) coupling).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__COUPLING, null, msgs);
			if (newCoupling != null)
				msgs = ((InternalEObject) newCoupling).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - CognitiveModulePackage.COGNITIVE_MODULE__COUPLING, null, msgs);
			msgs = basicSetCoupling(newCoupling, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CognitiveModulePackage.COGNITIVE_MODULE__COUPLING,
					newCoupling, newCoupling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CognitiveModulePackage.COGNITIVE_MODULE__CORE:
			return basicSetCore(null, msgs);
		case CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT:
			return ((InternalEList<?>) getEfferent()).basicRemove(otherEnd, msgs);
		case CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT:
			return ((InternalEList<?>) getAfferent()).basicRemove(otherEnd, msgs);
		case CognitiveModulePackage.COGNITIVE_MODULE__META:
			return basicSetMeta(null, msgs);
		case CognitiveModulePackage.COGNITIVE_MODULE__COUPLING:
			return basicSetCoupling(null, msgs);
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
		case CognitiveModulePackage.COGNITIVE_MODULE__NAME:
			return getName();
		case CognitiveModulePackage.COGNITIVE_MODULE__CORE:
			return getCore();
		case CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT:
			return getEfferent();
		case CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT:
			return getAfferent();
		case CognitiveModulePackage.COGNITIVE_MODULE__META:
			return getMeta();
		case CognitiveModulePackage.COGNITIVE_MODULE__COUPLING:
			return getCoupling();
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
		case CognitiveModulePackage.COGNITIVE_MODULE__NAME:
			setName((String) newValue);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__CORE:
			setCore((Core) newValue);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT:
			getEfferent().clear();
			getEfferent().addAll((Collection<? extends Modelet>) newValue);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT:
			getAfferent().clear();
			getAfferent().addAll((Collection<? extends Modelet>) newValue);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__META:
			setMeta((Meta) newValue);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__COUPLING:
			setCoupling((Coupling) newValue);
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
		case CognitiveModulePackage.COGNITIVE_MODULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__CORE:
			setCore((Core) null);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT:
			getEfferent().clear();
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT:
			getAfferent().clear();
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__META:
			setMeta((Meta) null);
			return;
		case CognitiveModulePackage.COGNITIVE_MODULE__COUPLING:
			setCoupling((Coupling) null);
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
		case CognitiveModulePackage.COGNITIVE_MODULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case CognitiveModulePackage.COGNITIVE_MODULE__CORE:
			return core != null;
		case CognitiveModulePackage.COGNITIVE_MODULE__EFFERENT:
			return efferent != null && !efferent.isEmpty();
		case CognitiveModulePackage.COGNITIVE_MODULE__AFFERENT:
			return afferent != null && !afferent.isEmpty();
		case CognitiveModulePackage.COGNITIVE_MODULE__META:
			return meta != null;
		case CognitiveModulePackage.COGNITIVE_MODULE__COUPLING:
			return coupling != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CognitiveModuleImpl
