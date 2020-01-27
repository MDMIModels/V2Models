/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTECONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.NTECONTENT#getNTE1 <em>NTE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.NTECONTENT#getNTE2 <em>NTE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.NTECONTENT#getNTE3 <em>NTE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.NTECONTENT#getNTE4 <em>NTE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.NTECONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT()
 * @model extendedMetaData="name='NTE.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface NTECONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>NTE1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTE1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTE1</em>' containment reference.
	 * @see #setNTE1(NTE1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT_NTE1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NTE.1' namespace='##targetNamespace'"
	 * @generated
	 */
	NTE1CONTENT getNTE1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NTECONTENT#getNTE1 <em>NTE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTE1</em>' containment reference.
	 * @see #getNTE1()
	 * @generated
	 */
	void setNTE1(NTE1CONTENT value);

	/**
	 * Returns the value of the '<em><b>NTE2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTE2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTE2</em>' containment reference.
	 * @see #setNTE2(NTE2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT_NTE2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NTE.2' namespace='##targetNamespace'"
	 * @generated
	 */
	NTE2CONTENT getNTE2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NTECONTENT#getNTE2 <em>NTE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTE2</em>' containment reference.
	 * @see #getNTE2()
	 * @generated
	 */
	void setNTE2(NTE2CONTENT value);

	/**
	 * Returns the value of the '<em><b>NTE3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NTE3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTE3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTE3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT_NTE3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NTE.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NTE3CONTENT> getNTE3();

	/**
	 * Returns the value of the '<em><b>NTE4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NTE4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NTE4</em>' containment reference.
	 * @see #setNTE4(NTE4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT_NTE4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NTE.4' namespace='##targetNamespace'"
	 * @generated
	 */
	NTE4CONTENT getNTE4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NTECONTENT#getNTE4 <em>NTE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NTE4</em>' containment reference.
	 * @see #getNTE4()
	 * @generated
	 */
	void setNTE4(NTE4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getNTECONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // NTECONTENT
