/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ISDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ISDCONTENT#getISD1 <em>ISD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ISDCONTENT#getISD2 <em>ISD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ISDCONTENT#getISD3 <em>ISD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ISDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getISDCONTENT()
 * @model extendedMetaData="name='ISD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ISDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ISD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISD1</em>' containment reference.
	 * @see #setISD1(ISD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getISDCONTENT_ISD1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ISD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ISD1CONTENT getISD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ISDCONTENT#getISD1 <em>ISD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISD1</em>' containment reference.
	 * @see #getISD1()
	 * @generated
	 */
	void setISD1(ISD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ISD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISD2</em>' containment reference.
	 * @see #setISD2(ISD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getISDCONTENT_ISD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ISD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ISD2CONTENT getISD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ISDCONTENT#getISD2 <em>ISD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISD2</em>' containment reference.
	 * @see #getISD2()
	 * @generated
	 */
	void setISD2(ISD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ISD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ISD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ISD3</em>' containment reference.
	 * @see #setISD3(ISD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getISDCONTENT_ISD3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ISD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ISD3CONTENT getISD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ISDCONTENT#getISD3 <em>ISD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISD3</em>' containment reference.
	 * @see #getISD3()
	 * @generated
	 */
	void setISD3(ISD3CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getISDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ISDCONTENT
