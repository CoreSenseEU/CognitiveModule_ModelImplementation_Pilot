/**
 */
package eu.coresense.CognitiveModule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.coresense.CognitiveModule.CognitiveModuleFactory
 * @model kind="package"
 * @generated
 */
public interface CognitiveModulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CognitiveModule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://coresense.eu/CognitiveModule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CognitiveModule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CognitiveModulePackage eINSTANCE = eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.coresense.CognitiveModule.impl.CoreImpl <em>Core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.CognitiveModule.impl.CoreImpl
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCore()
	 * @generated
	 */
	int CORE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.coresense.CognitiveModule.impl.ModeletImpl <em>Modelet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.CognitiveModule.impl.ModeletImpl
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getModelet()
	 * @generated
	 */
	int MODELET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELET__TOPIC = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELET__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Modelet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Modelet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODELET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.coresense.CognitiveModule.impl.MetaImpl <em>Meta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.CognitiveModule.impl.MetaImpl
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getMeta()
	 * @generated
	 */
	int META = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META__NAME = 0;

	/**
	 * The number of structural features of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Meta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.coresense.CognitiveModule.impl.CouplingImpl <em>Coupling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.CognitiveModule.impl.CouplingImpl
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCoupling()
	 * @generated
	 */
	int COUPLING = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING__NAME = 0;

	/**
	 * The number of structural features of the '<em>Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Coupling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPLING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl <em>Cognitive Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModuleImpl
	 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCognitiveModule()
	 * @generated
	 */
	int COGNITIVE_MODULE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__CORE = 1;

	/**
	 * The feature id for the '<em><b>Efferent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__EFFERENT = 2;

	/**
	 * The feature id for the '<em><b>Afferent</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__AFFERENT = 3;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__META = 4;

	/**
	 * The feature id for the '<em><b>Coupling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE__COUPLING = 5;

	/**
	 * The number of structural features of the '<em>Cognitive Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Cognitive Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COGNITIVE_MODULE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link eu.coresense.CognitiveModule.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Core</em>'.
	 * @see eu.coresense.CognitiveModule.Core
	 * @generated
	 */
	EClass getCore();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Core#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.coresense.CognitiveModule.Core#getName()
	 * @see #getCore()
	 * @generated
	 */
	EAttribute getCore_Name();

	/**
	 * Returns the meta object for class '{@link eu.coresense.CognitiveModule.Modelet <em>Modelet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modelet</em>'.
	 * @see eu.coresense.CognitiveModule.Modelet
	 * @generated
	 */
	EClass getModelet();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Modelet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.coresense.CognitiveModule.Modelet#getName()
	 * @see #getModelet()
	 * @generated
	 */
	EAttribute getModelet_Name();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Modelet#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see eu.coresense.CognitiveModule.Modelet#getTopic()
	 * @see #getModelet()
	 * @generated
	 */
	EAttribute getModelet_Topic();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Modelet#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see eu.coresense.CognitiveModule.Modelet#getType()
	 * @see #getModelet()
	 * @generated
	 */
	EAttribute getModelet_Type();

	/**
	 * Returns the meta object for class '{@link eu.coresense.CognitiveModule.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta</em>'.
	 * @see eu.coresense.CognitiveModule.Meta
	 * @generated
	 */
	EClass getMeta();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Meta#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.coresense.CognitiveModule.Meta#getName()
	 * @see #getMeta()
	 * @generated
	 */
	EAttribute getMeta_Name();

	/**
	 * Returns the meta object for class '{@link eu.coresense.CognitiveModule.Coupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupling</em>'.
	 * @see eu.coresense.CognitiveModule.Coupling
	 * @generated
	 */
	EClass getCoupling();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.Coupling#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.coresense.CognitiveModule.Coupling#getName()
	 * @see #getCoupling()
	 * @generated
	 */
	EAttribute getCoupling_Name();

	/**
	 * Returns the meta object for class '{@link eu.coresense.CognitiveModule.CognitiveModule <em>Cognitive Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cognitive Module</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule
	 * @generated
	 */
	EClass getCognitiveModule();

	/**
	 * Returns the meta object for the attribute '{@link eu.coresense.CognitiveModule.CognitiveModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getName()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EAttribute getCognitiveModule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eu.coresense.CognitiveModule.CognitiveModule#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Core</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getCore()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EReference getCognitiveModule_Core();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.coresense.CognitiveModule.CognitiveModule#getEfferent <em>Efferent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Efferent</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getEfferent()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EReference getCognitiveModule_Efferent();

	/**
	 * Returns the meta object for the containment reference list '{@link eu.coresense.CognitiveModule.CognitiveModule#getAfferent <em>Afferent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Afferent</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getAfferent()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EReference getCognitiveModule_Afferent();

	/**
	 * Returns the meta object for the containment reference '{@link eu.coresense.CognitiveModule.CognitiveModule#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getMeta()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EReference getCognitiveModule_Meta();

	/**
	 * Returns the meta object for the containment reference '{@link eu.coresense.CognitiveModule.CognitiveModule#getCoupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coupling</em>'.
	 * @see eu.coresense.CognitiveModule.CognitiveModule#getCoupling()
	 * @see #getCognitiveModule()
	 * @generated
	 */
	EReference getCognitiveModule_Coupling();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CognitiveModuleFactory getCognitiveModuleFactory();

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
		 * The meta object literal for the '{@link eu.coresense.CognitiveModule.impl.CoreImpl <em>Core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.CognitiveModule.impl.CoreImpl
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCore()
		 * @generated
		 */
		EClass CORE = eINSTANCE.getCore();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE__NAME = eINSTANCE.getCore_Name();

		/**
		 * The meta object literal for the '{@link eu.coresense.CognitiveModule.impl.ModeletImpl <em>Modelet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.CognitiveModule.impl.ModeletImpl
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getModelet()
		 * @generated
		 */
		EClass MODELET = eINSTANCE.getModelet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELET__NAME = eINSTANCE.getModelet_Name();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELET__TOPIC = eINSTANCE.getModelet_Topic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODELET__TYPE = eINSTANCE.getModelet_Type();

		/**
		 * The meta object literal for the '{@link eu.coresense.CognitiveModule.impl.MetaImpl <em>Meta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.CognitiveModule.impl.MetaImpl
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getMeta()
		 * @generated
		 */
		EClass META = eINSTANCE.getMeta();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META__NAME = eINSTANCE.getMeta_Name();

		/**
		 * The meta object literal for the '{@link eu.coresense.CognitiveModule.impl.CouplingImpl <em>Coupling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.CognitiveModule.impl.CouplingImpl
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCoupling()
		 * @generated
		 */
		EClass COUPLING = eINSTANCE.getCoupling();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPLING__NAME = eINSTANCE.getCoupling_Name();

		/**
		 * The meta object literal for the '{@link eu.coresense.CognitiveModule.impl.CognitiveModuleImpl <em>Cognitive Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModuleImpl
		 * @see eu.coresense.CognitiveModule.impl.CognitiveModulePackageImpl#getCognitiveModule()
		 * @generated
		 */
		EClass COGNITIVE_MODULE = eINSTANCE.getCognitiveModule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COGNITIVE_MODULE__NAME = eINSTANCE.getCognitiveModule_Name();

		/**
		 * The meta object literal for the '<em><b>Core</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGNITIVE_MODULE__CORE = eINSTANCE.getCognitiveModule_Core();

		/**
		 * The meta object literal for the '<em><b>Efferent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGNITIVE_MODULE__EFFERENT = eINSTANCE.getCognitiveModule_Efferent();

		/**
		 * The meta object literal for the '<em><b>Afferent</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGNITIVE_MODULE__AFFERENT = eINSTANCE.getCognitiveModule_Afferent();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGNITIVE_MODULE__META = eINSTANCE.getCognitiveModule_Meta();

		/**
		 * The meta object literal for the '<em><b>Coupling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COGNITIVE_MODULE__COUPLING = eINSTANCE.getCognitiveModule_Coupling();

	}

} //CognitiveModulePackage
