/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SPRCONTENT#getSPR1 <em>SPR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPRCONTENT#getSPR2 <em>SPR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPRCONTENT#getSPR3 <em>SPR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPRCONTENT#getSPR4 <em>SPR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPRCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT()
 * @model extendedMetaData="name='SPR.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface SPRCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>SPR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPR1</em>' containment reference.
	 * @see #setSPR1(SPR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT_SPR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SPR1CONTENT getSPR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPRCONTENT#getSPR1 <em>SPR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPR1</em>' containment reference.
	 * @see #getSPR1()
	 * @generated
	 */
	void setSPR1(SPR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPR2</em>' containment reference.
	 * @see #setSPR2(SPR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT_SPR2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SPR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SPR2CONTENT getSPR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPRCONTENT#getSPR2 <em>SPR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPR2</em>' containment reference.
	 * @see #getSPR2()
	 * @generated
	 */
	void setSPR2(SPR2CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPR3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPR3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPR3</em>' containment reference.
	 * @see #setSPR3(SPR3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT_SPR3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SPR.3' namespace='##targetNamespace'"
	 * @generated
	 */
	SPR3CONTENT getSPR3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPRCONTENT#getSPR3 <em>SPR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPR3</em>' containment reference.
	 * @see #getSPR3()
	 * @generated
	 */
	void setSPR3(SPR3CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPR4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SPR4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPR4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPR4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT_SPR4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPR.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SPR4CONTENT> getSPR4();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getSPRCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // SPRCONTENT
