/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.NR#getNR1 <em>NR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.NR#getNR2 <em>NR2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getNR()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='NR' kind='elementOnly'"
 * @generated
 */
public interface NR extends EObject {
	/**
	 * Returns the value of the '<em><b>NR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NR1</em>' containment reference.
	 * @see #setNR1(NR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNR_NR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	NR1CONTENT getNR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NR#getNR1 <em>NR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NR1</em>' containment reference.
	 * @see #getNR1()
	 * @generated
	 */
	void setNR1(NR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>NR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NR2</em>' containment reference.
	 * @see #setNR2(NR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNR_NR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	NR2CONTENT getNR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NR#getNR2 <em>NR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NR2</em>' containment reference.
	 * @see #getNR2()
	 * @generated
	 */
	void setNR2(NR2CONTENT value);

} // NR
