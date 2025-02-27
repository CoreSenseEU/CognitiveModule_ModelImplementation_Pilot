/**
 */
package eu.coresense.CognitiveModule.impl;

import eu.coresense.CognitiveModule.CognitiveModule;
import eu.coresense.CognitiveModule.CognitiveModuleFactory;
import eu.coresense.CognitiveModule.CognitiveModulePackage;
import eu.coresense.CognitiveModule.Core;
import eu.coresense.CognitiveModule.Coupling;
import eu.coresense.CognitiveModule.Meta;
import eu.coresense.CognitiveModule.Modelet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CognitiveModulePackageImpl extends EPackageImpl implements CognitiveModulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couplingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cognitiveModuleEClass = null;

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
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CognitiveModulePackageImpl() {
		super(eNS_URI, CognitiveModuleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CognitiveModulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CognitiveModulePackage init() {
		if (isInited)
			return (CognitiveModulePackage) EPackage.Registry.INSTANCE.getEPackage(CognitiveModulePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCognitiveModulePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CognitiveModulePackageImpl theCognitiveModulePackage = registeredCognitiveModulePackage instanceof CognitiveModulePackageImpl
				? (CognitiveModulePackageImpl) registeredCognitiveModulePackage
				: new CognitiveModulePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theCognitiveModulePackage.createPackageContents();

		// Initialize created meta-data
		theCognitiveModulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCognitiveModulePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CognitiveModulePackage.eNS_URI, theCognitiveModulePackage);
		return theCognitiveModulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCore() {
		return coreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCore_Name() {
		return (EAttribute) coreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelet() {
		return modeletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelet_Name() {
		return (EAttribute) modeletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelet_Topic() {
		return (EAttribute) modeletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelet_Type() {
		return (EAttribute) modeletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeta() {
		return metaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeta_Name() {
		return (EAttribute) metaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCoupling() {
		return couplingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCoupling_Name() {
		return (EAttribute) couplingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCognitiveModule() {
		return cognitiveModuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCognitiveModule_Name() {
		return (EAttribute) cognitiveModuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCognitiveModule_Core() {
		return (EReference) cognitiveModuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCognitiveModule_Efferent() {
		return (EReference) cognitiveModuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCognitiveModule_Afferent() {
		return (EReference) cognitiveModuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCognitiveModule_Meta() {
		return (EReference) cognitiveModuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCognitiveModule_Coupling() {
		return (EReference) cognitiveModuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveModuleFactory getCognitiveModuleFactory() {
		return (CognitiveModuleFactory) getEFactoryInstance();
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
		coreEClass = createEClass(CORE);
		createEAttribute(coreEClass, CORE__NAME);

		modeletEClass = createEClass(MODELET);
		createEAttribute(modeletEClass, MODELET__NAME);
		createEAttribute(modeletEClass, MODELET__TOPIC);
		createEAttribute(modeletEClass, MODELET__TYPE);

		metaEClass = createEClass(META);
		createEAttribute(metaEClass, META__NAME);

		couplingEClass = createEClass(COUPLING);
		createEAttribute(couplingEClass, COUPLING__NAME);

		cognitiveModuleEClass = createEClass(COGNITIVE_MODULE);
		createEAttribute(cognitiveModuleEClass, COGNITIVE_MODULE__NAME);
		createEReference(cognitiveModuleEClass, COGNITIVE_MODULE__CORE);
		createEReference(cognitiveModuleEClass, COGNITIVE_MODULE__EFFERENT);
		createEReference(cognitiveModuleEClass, COGNITIVE_MODULE__AFFERENT);
		createEReference(cognitiveModuleEClass, COGNITIVE_MODULE__META);
		createEReference(cognitiveModuleEClass, COGNITIVE_MODULE__COUPLING);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(coreEClass, Core.class, "Core", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCore_Name(), ecorePackage.getEString(), "name", null, 1, 1, Core.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeletEClass, Modelet.class, "Modelet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelet_Name(), ecorePackage.getEString(), "name", null, 1, 1, Modelet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelet_Topic(), ecorePackage.getEString(), "topic", null, 1, 1, Modelet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelet_Type(), ecorePackage.getEString(), "type", null, 1, 1, Modelet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaEClass, Meta.class, "Meta", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeta_Name(), ecorePackage.getEString(), "name", null, 1, 1, Meta.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(couplingEClass, Coupling.class, "Coupling", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoupling_Name(), ecorePackage.getEString(), "name", null, 1, 1, Coupling.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cognitiveModuleEClass, CognitiveModule.class, "CognitiveModule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCognitiveModule_Name(), ecorePackage.getEString(), "name", null, 1, 1, CognitiveModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCognitiveModule_Core(), this.getCore(), null, "core", null, 1, 1, CognitiveModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCognitiveModule_Efferent(), this.getModelet(), null, "efferent", null, 0, -1,
				CognitiveModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCognitiveModule_Afferent(), this.getModelet(), null, "afferent", null, 0, -1,
				CognitiveModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCognitiveModule_Meta(), this.getMeta(), null, "meta", null, 1, 1, CognitiveModule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCognitiveModule_Coupling(), this.getCoupling(), null, "coupling", null, 1, 1,
				CognitiveModule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CognitiveModulePackageImpl
