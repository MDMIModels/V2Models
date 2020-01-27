/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ECRCONTENT#getECR1 <em>ECR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECRCONTENT#getECR2 <em>ECR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECRCONTENT#getECR3 <em>ECR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECRCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getECRCONTENT()
 * @model extendedMetaData="name='ECR.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ECRCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ECR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECR1</em>' containment reference.
	 * @see #setECR1(ECR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECRCONTENT_ECR1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ECR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ECR1CONTENT getECR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECRCONTENT#getECR1 <em>ECR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECR1</em>' containment reference.
	 * @see #getECR1()
	 * @generated
	 */
	void setECR1(ECR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECR2</em>' containment reference.
	 * @see #setECR2(ECR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECRCONTENT_ECR2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ECR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ECR2CONTENT getECR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECRCONTENT#getECR2 <em>ECR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECR2</em>' containment reference.
	 * @see #getECR2()
	 * @generated
	 */
	void setECR2(ECR2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECR3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ECR3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECR3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECR3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getECRCONTENT_ECR3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECR.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ECR3CONTENT> getECR3();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getECRCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ECRCONTENT
