/**
 */
package eu.coresense.CognitiveModule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eu.coresense.CognitiveModule.CognitiveModulePackage
 * @generated
 */
public interface CognitiveModuleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CognitiveModuleFactory eINSTANCE = eu.coresense.CognitiveModule.impl.CognitiveModuleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Core</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Core</em>'.
	 * @generated
	 */
	Core createCore();

	/**
	 * Returns a new object of class '<em>Modelet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modelet</em>'.
	 * @generated
	 */
	Modelet createModelet();

	/**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
	Meta createMeta();

	/**
	 * Returns a new object of class '<em>Coupling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupling</em>'.
	 * @generated
	 */
	Coupling createCoupling();

	/**
	 * Returns a new object of class '<em>Cognitive Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cognitive Module</em>'.
	 * @generated
	 */
	CognitiveModule createCognitiveModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CognitiveModulePackage getCognitiveModulePackage();

} //CognitiveModuleFactory
