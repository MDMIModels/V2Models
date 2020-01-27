/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OCD#getOCD1 <em>OCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.OCD#getOCD2 <em>OCD2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOCD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='OCD' kind='elementOnly'"
 * @generated
 */
public interface OCD extends EObject {
	/**
	 * Returns the value of the '<em><b>OCD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OCD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCD1</em>' containment reference.
	 * @see #setOCD1(OCD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOCD_OCD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OCD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OCD1CONTENT getOCD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OCD#getOCD1 <em>OCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCD1</em>' containment reference.
	 * @see #getOCD1()
	 * @generated
	 */
	void setOCD1(OCD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>OCD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OCD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OCD2</em>' containment reference.
	 * @see #setOCD2(OCD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOCD_OCD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OCD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	OCD2CONTENT getOCD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OCD#getOCD2 <em>OCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OCD2</em>' containment reference.
	 * @see #getOCD2()
	 * @generated
	 */
	void setOCD2(OCD2CONTENT value);

} // OCD
