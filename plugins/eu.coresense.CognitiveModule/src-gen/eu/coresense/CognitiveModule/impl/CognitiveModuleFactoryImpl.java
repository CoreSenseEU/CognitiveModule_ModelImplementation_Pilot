/**
 */
package eu.coresense.CognitiveModule.impl;

import eu.coresense.CognitiveModule.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CognitiveModuleFactoryImpl extends EFactoryImpl implements CognitiveModuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CognitiveModuleFactory init() {
		try {
			CognitiveModuleFactory theCognitiveModuleFactory = (CognitiveModuleFactory) EPackage.Registry.INSTANCE
					.getEFactory(CognitiveModulePackage.eNS_URI);
			if (theCognitiveModuleFactory != null) {
				return theCognitiveModuleFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CognitiveModuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveModuleFactoryImpl() {
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
		case CognitiveModulePackage.CORE:
			return createCore();
		case CognitiveModulePackage.MODELET:
			return createModelet();
		case CognitiveModulePackage.META:
			return createMeta();
		case CognitiveModulePackage.COUPLING:
			return createCoupling();
		case CognitiveModulePackage.COGNITIVE_MODULE:
			return createCognitiveModule();
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
	public Core createCore() {
		CoreImpl core = new CoreImpl();
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modelet createModelet() {
		ModeletImpl modelet = new ModeletImpl();
		return modelet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Meta createMeta() {
		MetaImpl meta = new MetaImpl();
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Coupling createCoupling() {
		CouplingImpl coupling = new CouplingImpl();
		return coupling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveModule createCognitiveModule() {
		CognitiveModuleImpl cognitiveModule = new CognitiveModuleImpl();
		return cognitiveModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CognitiveModulePackage getCognitiveModulePackage() {
		return (CognitiveModulePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CognitiveModulePackage getPackage() {
		return CognitiveModulePackage.eINSTANCE;
	}

} //CognitiveModuleFactoryImpl
