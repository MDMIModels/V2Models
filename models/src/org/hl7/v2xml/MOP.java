/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MOP#getMOP1 <em>MOP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MOP#getMOP2 <em>MOP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.MOP#getMOP3 <em>MOP3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMOP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='MOP' kind='elementOnly'"
 * @generated
 */
public interface MOP extends EObject {
	/**
	 * Returns the value of the '<em><b>MOP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOP1</em>' containment reference.
	 * @see #setMOP1(MOP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMOP_MOP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MOP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	MOP1CONTENT getMOP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MOP#getMOP1 <em>MOP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOP1</em>' containment reference.
	 * @see #getMOP1()
	 * @generated
	 */
	void setMOP1(MOP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>MOP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOP2</em>' containment reference.
	 * @see #setMOP2(MOP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMOP_MOP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MOP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	MOP2CONTENT getMOP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MOP#getMOP2 <em>MOP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOP2</em>' containment reference.
	 * @see #getMOP2()
	 * @generated
	 */
	void setMOP2(MOP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>MOP3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOP3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOP3</em>' containment reference.
	 * @see #setMOP3(MOP3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMOP_MOP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MOP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	MOP3CONTENT getMOP3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MOP#getMOP3 <em>MOP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOP3</em>' containment reference.
	 * @see #getMOP3()
	 * @generated
	 */
	void setMOP3(MOP3CONTENT value);

} // MOP
