/**
 */
package eu.coresense.CognitiveModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cognitive Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getName <em>Name</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getCore <em>Core</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getEfferent <em>Efferent</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getAfferent <em>Afferent</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getMeta <em>Meta</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.CognitiveModule#getCoupling <em>Coupling</em>}</li>
 * </ul>
 *
 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule()
 * @model
 * @generated
 */
public interface CognitiveModule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.CognitiveModule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' containment reference.
	 * @see #setCore(Core)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Core()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Core getCore();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.CognitiveModule#getCore <em>Core</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' containment reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Core value);

	/**
	 * Returns the value of the '<em><b>Efferent</b></em>' containment reference list.
	 * The list contents are of type {@link eu.coresense.CognitiveModule.Modelet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Efferent</em>' containment reference list.
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Efferent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modelet> getEfferent();

	/**
	 * Returns the value of the '<em><b>Afferent</b></em>' containment reference list.
	 * The list contents are of type {@link eu.coresense.CognitiveModule.Modelet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Afferent</em>' containment reference list.
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Afferent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Modelet> getAfferent();

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(Meta)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Meta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.CognitiveModule#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Coupling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupling</em>' containment reference.
	 * @see #setCoupling(Coupling)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getCognitiveModule_Coupling()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Coupling getCoupling();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.CognitiveModule#getCoupling <em>Coupling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupling</em>' containment reference.
	 * @see #getCoupling()
	 * @generated
	 */
	void setCoupling(Coupling value);

} // CognitiveModule
