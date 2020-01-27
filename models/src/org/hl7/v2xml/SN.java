/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SN#getSN1 <em>SN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SN#getSN2 <em>SN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.SN#getSN3 <em>SN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.SN#getSN4 <em>SN4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSN()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='SN' kind='elementOnly'"
 * @generated
 */
public interface SN extends EObject {
	/**
	 * Returns the value of the '<em><b>SN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SN1</em>' containment reference.
	 * @see #setSN1(SN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSN_SN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SN1CONTENT getSN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SN#getSN1 <em>SN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SN1</em>' containment reference.
	 * @see #getSN1()
	 * @generated
	 */
	void setSN1(SN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SN2</em>' containment reference.
	 * @see #setSN2(SN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSN_SN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SN2CONTENT getSN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SN#getSN2 <em>SN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SN2</em>' containment reference.
	 * @see #getSN2()
	 * @generated
	 */
	void setSN2(SN2CONTENT value);

	/**
	 * Returns the value of the '<em><b>SN3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SN3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SN3</em>' containment reference.
	 * @see #setSN3(SN3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSN_SN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SN.3' namespace='##targetNamespace'"
	 * @generated
	 */
	SN3CONTENT getSN3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SN#getSN3 <em>SN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SN3</em>' containment reference.
	 * @see #getSN3()
	 * @generated
	 */
	void setSN3(SN3CONTENT value);

	/**
	 * Returns the value of the '<em><b>SN4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SN4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SN4</em>' containment reference.
	 * @see #setSN4(SN4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSN_SN4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SN.4' namespace='##targetNamespace'"
	 * @generated
	 */
	SN4CONTENT getSN4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SN#getSN4 <em>SN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SN4</em>' containment reference.
	 * @see #getSN4()
	 * @generated
	 */
	void setSN4(SN4CONTENT value);

} // SN
