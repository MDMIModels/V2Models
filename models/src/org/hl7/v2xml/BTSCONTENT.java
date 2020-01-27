/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BTSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BTSCONTENT#getBTS1 <em>BTS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BTSCONTENT#getBTS2 <em>BTS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BTSCONTENT#getBTS3 <em>BTS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.BTSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBTSCONTENT()
 * @model extendedMetaData="name='BTS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BTSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>BTS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTS1</em>' containment reference.
	 * @see #setBTS1(BTS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBTSCONTENT_BTS1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BTS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	BTS1CONTENT getBTS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BTSCONTENT#getBTS1 <em>BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BTS1</em>' containment reference.
	 * @see #getBTS1()
	 * @generated
	 */
	void setBTS1(BTS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>BTS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTS2</em>' containment reference.
	 * @see #setBTS2(BTS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBTSCONTENT_BTS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BTS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	BTS2CONTENT getBTS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BTSCONTENT#getBTS2 <em>BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BTS2</em>' containment reference.
	 * @see #getBTS2()
	 * @generated
	 */
	void setBTS2(BTS2CONTENT value);

	/**
	 * Returns the value of the '<em><b>BTS3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BTS3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BTS3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BTS3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBTSCONTENT_BTS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BTS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BTS3CONTENT> getBTS3();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBTSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // BTSCONTENT
