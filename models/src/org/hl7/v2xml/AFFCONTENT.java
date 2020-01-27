/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AFFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAFF1 <em>AFF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAFF2 <em>AFF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAFF3 <em>AFF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAFF4 <em>AFF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAFF5 <em>AFF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.AFFCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT()
 * @model extendedMetaData="name='AFF.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface AFFCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>AFF1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF1</em>' containment reference.
	 * @see #setAFF1(AFF1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_AFF1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AFF.1' namespace='##targetNamespace'"
	 * @generated
	 */
	AFF1CONTENT getAFF1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AFFCONTENT#getAFF1 <em>AFF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFF1</em>' containment reference.
	 * @see #getAFF1()
	 * @generated
	 */
	void setAFF1(AFF1CONTENT value);

	/**
	 * Returns the value of the '<em><b>AFF2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF2</em>' containment reference.
	 * @see #setAFF2(AFF2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_AFF2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AFF.2' namespace='##targetNamespace'"
	 * @generated
	 */
	AFF2CONTENT getAFF2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AFFCONTENT#getAFF2 <em>AFF2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFF2</em>' containment reference.
	 * @see #getAFF2()
	 * @generated
	 */
	void setAFF2(AFF2CONTENT value);

	/**
	 * Returns the value of the '<em><b>AFF3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF3</em>' containment reference.
	 * @see #setAFF3(AFF3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_AFF3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AFF.3' namespace='##targetNamespace'"
	 * @generated
	 */
	AFF3CONTENT getAFF3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AFFCONTENT#getAFF3 <em>AFF3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFF3</em>' containment reference.
	 * @see #getAFF3()
	 * @generated
	 */
	void setAFF3(AFF3CONTENT value);

	/**
	 * Returns the value of the '<em><b>AFF4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AFF4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_AFF4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AFF.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AFF4CONTENT> getAFF4();

	/**
	 * Returns the value of the '<em><b>AFF5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AFF5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AFF5</em>' containment reference.
	 * @see #setAFF5(AFF5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_AFF5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AFF.5' namespace='##targetNamespace'"
	 * @generated
	 */
	AFF5CONTENT getAFF5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AFFCONTENT#getAFF5 <em>AFF5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AFF5</em>' containment reference.
	 * @see #getAFF5()
	 * @generated
	 */
	void setAFF5(AFF5CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getAFFCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AFFCONTENT
