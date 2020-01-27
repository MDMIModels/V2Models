/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD1 <em>PRD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD2 <em>PRD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD3 <em>PRD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD4 <em>PRD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD5 <em>PRD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD6 <em>PRD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD7 <em>PRD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD8 <em>PRD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getPRD9 <em>PRD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT()
 * @model extendedMetaData="name='PRD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PRDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PRD1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRD1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PRD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRD1CONTENT> getPRD1();

	/**
	 * Returns the value of the '<em><b>PRD2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRD2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRD2CONTENT> getPRD2();

	/**
	 * Returns the value of the '<em><b>PRD3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRD3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRD3CONTENT> getPRD3();

	/**
	 * Returns the value of the '<em><b>PRD4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD4</em>' containment reference.
	 * @see #setPRD4(PRD4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PRD4CONTENT getPRD4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRDCONTENT#getPRD4 <em>PRD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRD4</em>' containment reference.
	 * @see #getPRD4()
	 * @generated
	 */
	void setPRD4(PRD4CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRD5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRD5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRD5CONTENT> getPRD5();

	/**
	 * Returns the value of the '<em><b>PRD6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD6</em>' containment reference.
	 * @see #setPRD6(PRD6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.6' namespace='##targetNamespace'"
	 * @generated
	 */
	PRD6CONTENT getPRD6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRDCONTENT#getPRD6 <em>PRD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRD6</em>' containment reference.
	 * @see #getPRD6()
	 * @generated
	 */
	void setPRD6(PRD6CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRD7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRD7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRD7CONTENT> getPRD7();

	/**
	 * Returns the value of the '<em><b>PRD8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD8</em>' containment reference.
	 * @see #setPRD8(PRD8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PRD8CONTENT getPRD8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRDCONTENT#getPRD8 <em>PRD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRD8</em>' containment reference.
	 * @see #getPRD8()
	 * @generated
	 */
	void setPRD8(PRD8CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRD9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRD9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRD9</em>' containment reference.
	 * @see #setPRD9(PRD9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_PRD9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRD.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PRD9CONTENT getPRD9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRDCONTENT#getPRD9 <em>PRD9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRD9</em>' containment reference.
	 * @see #getPRD9()
	 * @generated
	 */
	void setPRD9(PRD9CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPRDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PRDCONTENT
