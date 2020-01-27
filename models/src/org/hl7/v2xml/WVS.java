/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.WVS#getWVS1 <em>WVS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.WVS#getWVS2 <em>WVS2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getWVS()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='WVS' kind='elementOnly'"
 * @generated
 */
public interface WVS extends EObject {
	/**
	 * Returns the value of the '<em><b>WVS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WVS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WVS1</em>' containment reference.
	 * @see #setWVS1(WVS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getWVS_WVS1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WVS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	WVS1CONTENT getWVS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.WVS#getWVS1 <em>WVS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WVS1</em>' containment reference.
	 * @see #getWVS1()
	 * @generated
	 */
	void setWVS1(WVS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>WVS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WVS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WVS2</em>' containment reference.
	 * @see #setWVS2(WVS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getWVS_WVS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WVS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	WVS2CONTENT getWVS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.WVS#getWVS2 <em>WVS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WVS2</em>' containment reference.
	 * @see #getWVS2()
	 * @generated
	 */
	void setWVS2(WVS2CONTENT value);

} // WVS
