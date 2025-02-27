/**
 */
package eu.coresense.CognitiveModule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modelet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.coresense.CognitiveModule.Modelet#getName <em>Name</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.Modelet#getTopic <em>Topic</em>}</li>
 *   <li>{@link eu.coresense.CognitiveModule.Modelet#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getModelet()
 * @model
 * @generated
 */
public interface Modelet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getModelet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.Modelet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getModelet_Topic()
	 * @model required="true"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.Modelet#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see eu.coresense.CognitiveModule.CognitiveModulePackage#getModelet_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link eu.coresense.CognitiveModule.Modelet#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Modelet
