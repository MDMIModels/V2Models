/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WVI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.WVI#getWVI1 <em>WVI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.WVI#getWVI2 <em>WVI2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getWVI()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='WVI' kind='elementOnly'"
 * @generated
 */
public interface WVI extends EObject {
	/**
	 * Returns the value of the '<em><b>WVI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WVI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WVI1</em>' containment reference.
	 * @see #setWVI1(WVI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getWVI_WVI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WVI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	WVI1CONTENT getWVI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.WVI#getWVI1 <em>WVI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WVI1</em>' containment reference.
	 * @see #getWVI1()
	 * @generated
	 */
	void setWVI1(WVI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>WVI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WVI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WVI2</em>' containment reference.
	 * @see #setWVI2(WVI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getWVI_WVI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='WVI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	WVI2CONTENT getWVI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.WVI#getWVI2 <em>WVI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WVI2</em>' containment reference.
	 * @see #getWVI2()
	 * @generated
	 */
	void setWVI2(WVI2CONTENT value);

} // WVI
