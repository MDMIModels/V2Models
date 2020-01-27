/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ODTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ODTCONTENT#getODT1 <em>ODT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODTCONTENT#getODT2 <em>ODT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODTCONTENT#getODT3 <em>ODT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODTCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getODTCONTENT()
 * @model extendedMetaData="name='ODT.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ODTCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ODT1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODT1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODT1</em>' containment reference.
	 * @see #setODT1(ODT1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getODTCONTENT_ODT1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ODT.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ODT1CONTENT getODT1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ODTCONTENT#getODT1 <em>ODT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ODT1</em>' containment reference.
	 * @see #getODT1()
	 * @generated
	 */
	void setODT1(ODT1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ODT2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODT2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODT2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODT2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getODTCONTENT_ODT2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODT.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODT2CONTENT> getODT2();

	/**
	 * Returns the value of the '<em><b>ODT3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODT3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODT3</em>' containment reference.
	 * @see #setODT3(ODT3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getODTCONTENT_ODT3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODT.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ODT3CONTENT getODT3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ODTCONTENT#getODT3 <em>ODT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ODT3</em>' containment reference.
	 * @see #getODT3()
	 * @generated
	 */
	void setODT3(ODT3CONTENT value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.hl7.v2xml.V2xmlPackage#getODTCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ODTCONTENT
