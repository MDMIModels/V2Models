/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFECONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getMFE1 <em>MFE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getMFE2 <em>MFE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getMFE3 <em>MFE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getMFE4 <em>MFE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getMFE5 <em>MFE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.MFECONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT()
 * @model extendedMetaData="name='MFE.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface MFECONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>MFE1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE1</em>' containment reference.
	 * @see #setMFE1(MFE1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_MFE1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MFE.1' namespace='##targetNamespace'"
	 * @generated
	 */
	MFE1CONTENT getMFE1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MFECONTENT#getMFE1 <em>MFE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFE1</em>' containment reference.
	 * @see #getMFE1()
	 * @generated
	 */
	void setMFE1(MFE1CONTENT value);

	/**
	 * Returns the value of the '<em><b>MFE2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE2</em>' containment reference.
	 * @see #setMFE2(MFE2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_MFE2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MFE.2' namespace='##targetNamespace'"
	 * @generated
	 */
	MFE2CONTENT getMFE2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MFECONTENT#getMFE2 <em>MFE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFE2</em>' containment reference.
	 * @see #getMFE2()
	 * @generated
	 */
	void setMFE2(MFE2CONTENT value);

	/**
	 * Returns the value of the '<em><b>MFE3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE3</em>' containment reference.
	 * @see #setMFE3(MFE3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_MFE3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MFE.3' namespace='##targetNamespace'"
	 * @generated
	 */
	MFE3CONTENT getMFE3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MFECONTENT#getMFE3 <em>MFE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFE3</em>' containment reference.
	 * @see #getMFE3()
	 * @generated
	 */
	void setMFE3(MFE3CONTENT value);

	/**
	 * Returns the value of the '<em><b>MFE4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MFE4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_MFE4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MFE.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFE4CONTENT> getMFE4();

	/**
	 * Returns the value of the '<em><b>MFE5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MFE5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MFE5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MFE5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_MFE5()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MFE.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MFE5CONTENT> getMFE5();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getMFECONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // MFECONTENT
