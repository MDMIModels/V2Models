/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERQCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ERQCONTENT#getERQ1 <em>ERQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERQCONTENT#getERQ2 <em>ERQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERQCONTENT#getERQ3 <em>ERQ3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERQCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getERQCONTENT()
 * @model extendedMetaData="name='ERQ.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ERQCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ERQ1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERQ1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERQ1</em>' containment reference.
	 * @see #setERQ1(ERQ1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERQCONTENT_ERQ1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERQ.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ERQ1CONTENT getERQ1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERQCONTENT#getERQ1 <em>ERQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERQ1</em>' containment reference.
	 * @see #getERQ1()
	 * @generated
	 */
	void setERQ1(ERQ1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERQ2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERQ2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERQ2</em>' containment reference.
	 * @see #setERQ2(ERQ2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERQCONTENT_ERQ2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ERQ.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ERQ2CONTENT getERQ2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERQCONTENT#getERQ2 <em>ERQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERQ2</em>' containment reference.
	 * @see #getERQ2()
	 * @generated
	 */
	void setERQ2(ERQ2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERQ3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERQ3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERQ3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERQ3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERQCONTENT_ERQ3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERQ.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERQ3CONTENT> getERQ3();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getERQCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ERQCONTENT
