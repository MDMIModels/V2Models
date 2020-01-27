/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CSSCONTENT#getCSS1 <em>CSS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSSCONTENT#getCSS2 <em>CSS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSSCONTENT#getCSS3 <em>CSS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCSSCONTENT()
 * @model extendedMetaData="name='CSS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CSSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CSS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS1</em>' containment reference.
	 * @see #setCSS1(CSS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSSCONTENT_CSS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CSS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CSS1CONTENT getCSS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSSCONTENT#getCSS1 <em>CSS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSS1</em>' containment reference.
	 * @see #getCSS1()
	 * @generated
	 */
	void setCSS1(CSS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CSS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS2</em>' containment reference.
	 * @see #setCSS2(CSS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSSCONTENT_CSS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CSS2CONTENT getCSS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSSCONTENT#getCSS2 <em>CSS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSS2</em>' containment reference.
	 * @see #getCSS2()
	 * @generated
	 */
	void setCSS2(CSS2CONTENT value);

	/**
	 * Returns the value of the '<em><b>CSS3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CSS3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSS3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSS3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCSSCONTENT_CSS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CSS3CONTENT> getCSS3();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCSSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CSSCONTENT
