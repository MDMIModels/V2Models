/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.AUI#getAUI1 <em>AUI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AUI#getAUI2 <em>AUI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AUI#getAUI3 <em>AUI3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAUI()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='AUI' kind='elementOnly'"
 * @generated
 */
public interface AUI extends EObject {
	/**
	 * Returns the value of the '<em><b>AUI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUI1</em>' containment reference.
	 * @see #setAUI1(AUI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAUI_AUI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AUI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	AUI1CONTENT getAUI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AUI#getAUI1 <em>AUI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUI1</em>' containment reference.
	 * @see #getAUI1()
	 * @generated
	 */
	void setAUI1(AUI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>AUI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUI2</em>' containment reference.
	 * @see #setAUI2(AUI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAUI_AUI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AUI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	AUI2CONTENT getAUI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AUI#getAUI2 <em>AUI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUI2</em>' containment reference.
	 * @see #getAUI2()
	 * @generated
	 */
	void setAUI2(AUI2CONTENT value);

	/**
	 * Returns the value of the '<em><b>AUI3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUI3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUI3</em>' containment reference.
	 * @see #setAUI3(AUI3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAUI_AUI3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AUI.3' namespace='##targetNamespace'"
	 * @generated
	 */
	AUI3CONTENT getAUI3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AUI#getAUI3 <em>AUI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUI3</em>' containment reference.
	 * @see #getAUI3()
	 * @generated
	 */
	void setAUI3(AUI3CONTENT value);

} // AUI
