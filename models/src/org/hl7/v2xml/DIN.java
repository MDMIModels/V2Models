/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DIN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DIN#getDIN1 <em>DIN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DIN#getDIN2 <em>DIN2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDIN()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DIN' kind='elementOnly'"
 * @generated
 */
public interface DIN extends EObject {
	/**
	 * Returns the value of the '<em><b>DIN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIN1</em>' containment reference.
	 * @see #setDIN1(DIN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDIN_DIN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DIN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DIN1CONTENT getDIN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DIN#getDIN1 <em>DIN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIN1</em>' containment reference.
	 * @see #getDIN1()
	 * @generated
	 */
	void setDIN1(DIN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DIN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DIN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DIN2</em>' containment reference.
	 * @see #setDIN2(DIN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDIN_DIN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DIN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DIN2CONTENT getDIN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DIN#getDIN2 <em>DIN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIN2</em>' containment reference.
	 * @see #getDIN2()
	 * @generated
	 */
	void setDIN2(DIN2CONTENT value);

} // DIN
