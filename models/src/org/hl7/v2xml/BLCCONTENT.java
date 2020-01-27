/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BLCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BLCCONTENT#getBLC1 <em>BLC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLCCONTENT#getBLC2 <em>BLC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBLCCONTENT()
 * @model extendedMetaData="name='BLC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BLCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>BLC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLC1</em>' containment reference.
	 * @see #setBLC1(BLC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLCCONTENT_BLC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	BLC1CONTENT getBLC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLCCONTENT#getBLC1 <em>BLC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLC1</em>' containment reference.
	 * @see #getBLC1()
	 * @generated
	 */
	void setBLC1(BLC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>BLC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLC2</em>' containment reference.
	 * @see #setBLC2(BLC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLCCONTENT_BLC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	BLC2CONTENT getBLC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLCCONTENT#getBLC2 <em>BLC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLC2</em>' containment reference.
	 * @see #getBLC2()
	 * @generated
	 */
	void setBLC2(BLC2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBLCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // BLCCONTENT
