/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>APRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAPR1 <em>APR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAPR2 <em>APR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAPR3 <em>APR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAPR4 <em>APR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAPR5 <em>APR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.APRCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT()
 * @model extendedMetaData="name='APR.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface APRCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>APR1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.APR1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_APR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APR1CONTENT> getAPR1();

	/**
	 * Returns the value of the '<em><b>APR2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.APR2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_APR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APR2CONTENT> getAPR2();

	/**
	 * Returns the value of the '<em><b>APR3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.APR3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_APR3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APR3CONTENT> getAPR3();

	/**
	 * Returns the value of the '<em><b>APR4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR4</em>' containment reference.
	 * @see #setAPR4(APR4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_APR4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR.4' namespace='##targetNamespace'"
	 * @generated
	 */
	APR4CONTENT getAPR4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.APRCONTENT#getAPR4 <em>APR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>APR4</em>' containment reference.
	 * @see #getAPR4()
	 * @generated
	 */
	void setAPR4(APR4CONTENT value);

	/**
	 * Returns the value of the '<em><b>APR5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.APR5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>APR5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>APR5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_APR5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='APR.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<APR5CONTENT> getAPR5();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getAPRCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // APRCONTENT
