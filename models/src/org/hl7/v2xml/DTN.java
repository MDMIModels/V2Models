/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DTN#getDTN1 <em>DTN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DTN#getDTN2 <em>DTN2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDTN()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DTN' kind='elementOnly'"
 * @generated
 */
public interface DTN extends EObject {
	/**
	 * Returns the value of the '<em><b>DTN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTN1</em>' containment reference.
	 * @see #setDTN1(DTN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDTN_DTN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DTN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DTN1CONTENT getDTN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DTN#getDTN1 <em>DTN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTN1</em>' containment reference.
	 * @see #getDTN1()
	 * @generated
	 */
	void setDTN1(DTN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DTN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DTN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DTN2</em>' containment reference.
	 * @see #setDTN2(DTN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDTN_DTN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DTN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DTN2CONTENT getDTN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DTN#getDTN2 <em>DTN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DTN2</em>' containment reference.
	 * @see #getDTN2()
	 * @generated
	 */
	void setDTN2(DTN2CONTENT value);

} // DTN
