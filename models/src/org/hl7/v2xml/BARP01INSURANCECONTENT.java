/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BARP01INSURANCECONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getIN1 <em>IN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getIN2 <em>IN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getIN3 <em>IN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getROL <em>ROL</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBARP01INSURANCECONTENT()
 * @model extendedMetaData="name='BAR_P01.INSURANCE.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BARP01INSURANCECONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>IN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN1</em>' containment reference.
	 * @see #setIN1(IN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01INSURANCECONTENT_IN1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='IN1' namespace='##targetNamespace'"
	 * @generated
	 */
	IN1CONTENT getIN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getIN1 <em>IN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IN1</em>' containment reference.
	 * @see #getIN1()
	 * @generated
	 */
	void setIN1(IN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>IN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN2</em>' containment reference.
	 * @see #setIN2(IN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01INSURANCECONTENT_IN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IN2' namespace='##targetNamespace'"
	 * @generated
	 */
	IN2CONTENT getIN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01INSURANCECONTENT#getIN2 <em>IN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IN2</em>' containment reference.
	 * @see #getIN2()
	 * @generated
	 */
	void setIN2(IN2CONTENT value);

	/**
	 * Returns the value of the '<em><b>IN3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.IN3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IN3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IN3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01INSURANCECONTENT_IN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IN3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IN3CONTENT> getIN3();

	/**
	 * Returns the value of the '<em><b>ROL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ROLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01INSURANCECONTENT_ROL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROLCONTENT> getROL();

} // BARP01INSURANCECONTENT
