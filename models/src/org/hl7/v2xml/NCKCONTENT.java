/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NCKCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.NCKCONTENT#getNCK1 <em>NCK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.NCKCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getNCKCONTENT()
 * @model extendedMetaData="name='NCK.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface NCKCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>NCK1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NCK1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NCK1</em>' containment reference.
	 * @see #setNCK1(NCK1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNCKCONTENT_NCK1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NCK.1' namespace='##targetNamespace'"
	 * @generated
	 */
	NCK1CONTENT getNCK1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NCKCONTENT#getNCK1 <em>NCK1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NCK1</em>' containment reference.
	 * @see #getNCK1()
	 * @generated
	 */
	void setNCK1(NCK1CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getNCKCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // NCKCONTENT
