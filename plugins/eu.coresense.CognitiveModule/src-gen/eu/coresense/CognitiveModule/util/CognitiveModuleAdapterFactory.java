/**
 */
package eu.coresense.CognitiveModule.util;

import eu.coresense.CognitiveModule.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.coresense.CognitiveModule.CognitiveModulePackage
 * @generated
 */
public class CognitiveModuleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CognitiveModulePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveModuleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CognitiveModulePackage.eINSTANCE;
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
	protected CognitiveModuleSwitch<Adapter> modelSwitch = new CognitiveModuleSwitch<Adapter>() {
		@Override
		public Adapter caseCore(Core object) {
			return createCoreAdapter();
		}

		@Override
		public Adapter caseModelet(Modelet object) {
			return createModeletAdapter();
		}

		@Override
		public Adapter caseMeta(Meta object) {
			return createMetaAdapter();
		}

		@Override
		public Adapter caseCoupling(Coupling object) {
			return createCouplingAdapter();
		}

		@Override
		public Adapter caseCognitiveModule(CognitiveModule object) {
			return createCognitiveModuleAdapter();
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
	 * Creates a new adapter for an object of class '{@link eu.coresense.CognitiveModule.Core <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.coresense.CognitiveModule.Core
	 * @generated
	 */
	public Adapter createCoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.coresense.CognitiveModule.Modelet <em>Modelet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.coresense.CognitiveModule.Modelet
	 * @generated
	 */
	public Adapter createModeletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.coresense.CognitiveModule.Meta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.coresense.CognitiveModule.Meta
	 * @generated
	 */
	public Adapter createMetaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.coresense.CognitiveModule.Coupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.coresense.CognitiveModule.Coupling
	 * @generated
	 */
	public Adapter createCouplingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link eu.coresense.CognitiveModule.CognitiveModule <em>Cognitive Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.coresense.CognitiveModule.CognitiveModule
	 * @generated
	 */
	public Adapter createCognitiveModuleAdapter() {
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

} //CognitiveModuleAdapterFactory
