/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DLN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DLN#getDLN1 <em>DLN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DLN#getDLN2 <em>DLN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.DLN#getDLN3 <em>DLN3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDLN()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DLN' kind='elementOnly'"
 * @generated
 */
public interface DLN extends EObject {
	/**
	 * Returns the value of the '<em><b>DLN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLN1</em>' containment reference.
	 * @see #setDLN1(DLN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDLN_DLN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DLN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DLN1CONTENT getDLN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DLN#getDLN1 <em>DLN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLN1</em>' containment reference.
	 * @see #getDLN1()
	 * @generated
	 */
	void setDLN1(DLN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DLN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLN2</em>' containment reference.
	 * @see #setDLN2(DLN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDLN_DLN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DLN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DLN2CONTENT getDLN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DLN#getDLN2 <em>DLN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLN2</em>' containment reference.
	 * @see #getDLN2()
	 * @generated
	 */
	void setDLN2(DLN2CONTENT value);

	/**
	 * Returns the value of the '<em><b>DLN3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLN3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLN3</em>' containment reference.
	 * @see #setDLN3(DLN3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDLN_DLN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DLN.3' namespace='##targetNamespace'"
	 * @generated
	 */
	DLN3CONTENT getDLN3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DLN#getDLN3 <em>DLN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLN3</em>' containment reference.
	 * @see #getDLN3()
	 * @generated
	 */
	void setDLN3(DLN3CONTENT value);

} // DLN
