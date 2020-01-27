/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ELD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ELD#getELD1 <em>ELD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ELD#getELD2 <em>ELD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ELD#getELD3 <em>ELD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ELD#getELD4 <em>ELD4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getELD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='ELD' kind='elementOnly'"
 * @generated
 */
public interface ELD extends EObject {
	/**
	 * Returns the value of the '<em><b>ELD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELD1</em>' containment reference.
	 * @see #setELD1(ELD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getELD_ELD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ELD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ELD1CONTENT getELD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ELD#getELD1 <em>ELD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELD1</em>' containment reference.
	 * @see #getELD1()
	 * @generated
	 */
	void setELD1(ELD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ELD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELD2</em>' containment reference.
	 * @see #setELD2(ELD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getELD_ELD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ELD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ELD2CONTENT getELD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ELD#getELD2 <em>ELD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELD2</em>' containment reference.
	 * @see #getELD2()
	 * @generated
	 */
	void setELD2(ELD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ELD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELD3</em>' containment reference.
	 * @see #setELD3(ELD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getELD_ELD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ELD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ELD3CONTENT getELD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ELD#getELD3 <em>ELD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELD3</em>' containment reference.
	 * @see #getELD3()
	 * @generated
	 */
	void setELD3(ELD3CONTENT value);

	/**
	 * Returns the value of the '<em><b>ELD4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ELD4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ELD4</em>' containment reference.
	 * @see #setELD4(ELD4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getELD_ELD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ELD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	ELD4CONTENT getELD4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ELD#getELD4 <em>ELD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ELD4</em>' containment reference.
	 * @see #getELD4()
	 * @generated
	 */
	void setELD4(ELD4CONTENT value);

} // ELD
