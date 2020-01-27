/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BARP01PROCEDURECONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BARP01PROCEDURECONTENT#getPR1 <em>PR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01PROCEDURECONTENT#getROL <em>ROL</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBARP01PROCEDURECONTENT()
 * @model extendedMetaData="name='BAR_P01.PROCEDURE.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BARP01PROCEDURECONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PR1</em>' containment reference.
	 * @see #setPR1(PR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01PROCEDURECONTENT_PR1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PR1' namespace='##targetNamespace'"
	 * @generated
	 */
	PR1CONTENT getPR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01PROCEDURECONTENT#getPR1 <em>PR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PR1</em>' containment reference.
	 * @see #getPR1()
	 * @generated
	 */
	void setPR1(PR1CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01PROCEDURECONTENT_ROL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROLCONTENT> getROL();

} // BARP01PROCEDURECONTENT
