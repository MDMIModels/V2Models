/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LANCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.LANCONTENT#getLAN1 <em>LAN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.LANCONTENT#getLAN2 <em>LAN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.LANCONTENT#getLAN3 <em>LAN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.LANCONTENT#getLAN4 <em>LAN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.LANCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT()
 * @model extendedMetaData="name='LAN.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface LANCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>LAN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN1</em>' containment reference.
	 * @see #setLAN1(LAN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT_LAN1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LAN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	LAN1CONTENT getLAN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LANCONTENT#getLAN1 <em>LAN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN1</em>' containment reference.
	 * @see #getLAN1()
	 * @generated
	 */
	void setLAN1(LAN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>LAN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN2</em>' containment reference.
	 * @see #setLAN2(LAN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT_LAN2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LAN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	LAN2CONTENT getLAN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LANCONTENT#getLAN2 <em>LAN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN2</em>' containment reference.
	 * @see #getLAN2()
	 * @generated
	 */
	void setLAN2(LAN2CONTENT value);

	/**
	 * Returns the value of the '<em><b>LAN3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LAN3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT_LAN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LAN.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LAN3CONTENT> getLAN3();

	/**
	 * Returns the value of the '<em><b>LAN4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LAN4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LAN4</em>' containment reference.
	 * @see #setLAN4(LAN4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT_LAN4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LAN.4' namespace='##targetNamespace'"
	 * @generated
	 */
	LAN4CONTENT getLAN4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LANCONTENT#getLAN4 <em>LAN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LAN4</em>' containment reference.
	 * @see #getLAN4()
	 * @generated
	 */
	void setLAN4(LAN4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getLANCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // LANCONTENT
