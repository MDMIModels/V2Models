/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD1 <em>URD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD2 <em>URD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD3 <em>URD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD4 <em>URD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD5 <em>URD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD6 <em>URD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getURD7 <em>URD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.URDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT()
 * @model extendedMetaData="name='URD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface URDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>URD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD1</em>' containment reference.
	 * @see #setURD1(URD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	URD1CONTENT getURD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URDCONTENT#getURD1 <em>URD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URD1</em>' containment reference.
	 * @see #getURD1()
	 * @generated
	 */
	void setURD1(URD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>URD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD2</em>' containment reference.
	 * @see #setURD2(URD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	URD2CONTENT getURD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URDCONTENT#getURD2 <em>URD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URD2</em>' containment reference.
	 * @see #getURD2()
	 * @generated
	 */
	void setURD2(URD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>URD3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URD3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='URD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URD3CONTENT> getURD3();

	/**
	 * Returns the value of the '<em><b>URD4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URD4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URD4CONTENT> getURD4();

	/**
	 * Returns the value of the '<em><b>URD5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URD5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URD5CONTENT> getURD5();

	/**
	 * Returns the value of the '<em><b>URD6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URD6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URD6CONTENT> getURD6();

	/**
	 * Returns the value of the '<em><b>URD7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URD7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URD7</em>' containment reference.
	 * @see #setURD7(URD7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_URD7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URD.7' namespace='##targetNamespace'"
	 * @generated
	 */
	URD7CONTENT getURD7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URDCONTENT#getURD7 <em>URD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URD7</em>' containment reference.
	 * @see #getURD7()
	 * @generated
	 */
	void setURD7(URD7CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getURDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // URDCONTENT
