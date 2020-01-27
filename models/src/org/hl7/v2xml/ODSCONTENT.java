/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ODSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ODSCONTENT#getODS1 <em>ODS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODSCONTENT#getODS2 <em>ODS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODSCONTENT#getODS3 <em>ODS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODSCONTENT#getODS4 <em>ODS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.ODSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT()
 * @model extendedMetaData="name='ODS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ODSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ODS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODS1</em>' containment reference.
	 * @see #setODS1(ODS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT_ODS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ODS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ODS1CONTENT getODS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ODSCONTENT#getODS1 <em>ODS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ODS1</em>' containment reference.
	 * @see #getODS1()
	 * @generated
	 */
	void setODS1(ODS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ODS2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODS2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODS2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODS2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT_ODS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODS2CONTENT> getODS2();

	/**
	 * Returns the value of the '<em><b>ODS3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODS3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODS3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODS3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT_ODS3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ODS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODS3CONTENT> getODS3();

	/**
	 * Returns the value of the '<em><b>ODS4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ODS4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ODS4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ODS4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT_ODS4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ODS.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ODS4CONTENT> getODS4();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getODSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ODSCONTENT
