/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ADDCONTENT#getADD1 <em>ADD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ADDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getADDCONTENT()
 * @model extendedMetaData="name='ADD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ADDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ADD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ADD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ADD1</em>' containment reference.
	 * @see #setADD1(ADD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getADDCONTENT_ADD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ADD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ADD1CONTENT getADD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ADDCONTENT#getADD1 <em>ADD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ADD1</em>' containment reference.
	 * @see #getADD1()
	 * @generated
	 */
	void setADD1(ADD1CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getADDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ADDCONTENT
