/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BLGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BLGCONTENT#getBLG1 <em>BLG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLGCONTENT#getBLG2 <em>BLG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLGCONTENT#getBLG3 <em>BLG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLGCONTENT#getBLG4 <em>BLG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.BLGCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT()
 * @model extendedMetaData="name='BLG.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BLGCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>BLG1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLG1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLG1</em>' containment reference.
	 * @see #setBLG1(BLG1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT_BLG1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLG.1' namespace='##targetNamespace'"
	 * @generated
	 */
	BLG1CONTENT getBLG1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLGCONTENT#getBLG1 <em>BLG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLG1</em>' containment reference.
	 * @see #getBLG1()
	 * @generated
	 */
	void setBLG1(BLG1CONTENT value);

	/**
	 * Returns the value of the '<em><b>BLG2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLG2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLG2</em>' containment reference.
	 * @see #setBLG2(BLG2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT_BLG2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLG.2' namespace='##targetNamespace'"
	 * @generated
	 */
	BLG2CONTENT getBLG2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLGCONTENT#getBLG2 <em>BLG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLG2</em>' containment reference.
	 * @see #getBLG2()
	 * @generated
	 */
	void setBLG2(BLG2CONTENT value);

	/**
	 * Returns the value of the '<em><b>BLG3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLG3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLG3</em>' containment reference.
	 * @see #setBLG3(BLG3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT_BLG3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLG.3' namespace='##targetNamespace'"
	 * @generated
	 */
	BLG3CONTENT getBLG3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLGCONTENT#getBLG3 <em>BLG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLG3</em>' containment reference.
	 * @see #getBLG3()
	 * @generated
	 */
	void setBLG3(BLG3CONTENT value);

	/**
	 * Returns the value of the '<em><b>BLG4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BLG4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BLG4</em>' containment reference.
	 * @see #setBLG4(BLG4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT_BLG4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BLG.4' namespace='##targetNamespace'"
	 * @generated
	 */
	BLG4CONTENT getBLG4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BLGCONTENT#getBLG4 <em>BLG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BLG4</em>' containment reference.
	 * @see #getBLG4()
	 * @generated
	 */
	void setBLG4(BLG4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBLGCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // BLGCONTENT
