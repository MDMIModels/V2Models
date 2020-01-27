/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MSG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MSG#getMSG1 <em>MSG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MSG#getMSG2 <em>MSG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.MSG#getMSG3 <em>MSG3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMSG()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='MSG' kind='elementOnly'"
 * @generated
 */
public interface MSG extends EObject {
	/**
	 * Returns the value of the '<em><b>MSG1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSG1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSG1</em>' containment reference.
	 * @see #setMSG1(MSG1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMSG_MSG1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MSG.1' namespace='##targetNamespace'"
	 * @generated
	 */
	MSG1CONTENT getMSG1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MSG#getMSG1 <em>MSG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSG1</em>' containment reference.
	 * @see #getMSG1()
	 * @generated
	 */
	void setMSG1(MSG1CONTENT value);

	/**
	 * Returns the value of the '<em><b>MSG2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSG2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSG2</em>' containment reference.
	 * @see #setMSG2(MSG2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMSG_MSG2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MSG.2' namespace='##targetNamespace'"
	 * @generated
	 */
	MSG2CONTENT getMSG2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MSG#getMSG2 <em>MSG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSG2</em>' containment reference.
	 * @see #getMSG2()
	 * @generated
	 */
	void setMSG2(MSG2CONTENT value);

	/**
	 * Returns the value of the '<em><b>MSG3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSG3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSG3</em>' containment reference.
	 * @see #setMSG3(MSG3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMSG_MSG3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MSG.3' namespace='##targetNamespace'"
	 * @generated
	 */
	MSG3CONTENT getMSG3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MSG#getMSG3 <em>MSG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSG3</em>' containment reference.
	 * @see #getMSG3()
	 * @generated
	 */
	void setMSG3(MSG3CONTENT value);

} // MSG
