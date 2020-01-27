/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NDSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.NDSCONTENT#getNDS1 <em>NDS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.NDSCONTENT#getNDS2 <em>NDS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.NDSCONTENT#getNDS3 <em>NDS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.NDSCONTENT#getNDS4 <em>NDS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.NDSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT()
 * @model extendedMetaData="name='NDS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface NDSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>NDS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDS1</em>' containment reference.
	 * @see #setNDS1(NDS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT_NDS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NDS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	NDS1CONTENT getNDS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NDSCONTENT#getNDS1 <em>NDS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NDS1</em>' containment reference.
	 * @see #getNDS1()
	 * @generated
	 */
	void setNDS1(NDS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>NDS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDS2</em>' containment reference.
	 * @see #setNDS2(NDS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT_NDS2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NDS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	NDS2CONTENT getNDS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NDSCONTENT#getNDS2 <em>NDS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NDS2</em>' containment reference.
	 * @see #getNDS2()
	 * @generated
	 */
	void setNDS2(NDS2CONTENT value);

	/**
	 * Returns the value of the '<em><b>NDS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDS3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDS3</em>' containment reference.
	 * @see #setNDS3(NDS3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT_NDS3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NDS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	NDS3CONTENT getNDS3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NDSCONTENT#getNDS3 <em>NDS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NDS3</em>' containment reference.
	 * @see #getNDS3()
	 * @generated
	 */
	void setNDS3(NDS3CONTENT value);

	/**
	 * Returns the value of the '<em><b>NDS4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NDS4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NDS4</em>' containment reference.
	 * @see #setNDS4(NDS4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT_NDS4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NDS.4' namespace='##targetNamespace'"
	 * @generated
	 */
	NDS4CONTENT getNDS4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NDSCONTENT#getNDS4 <em>NDS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NDS4</em>' containment reference.
	 * @see #getNDS4()
	 * @generated
	 */
	void setNDS4(NDS4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getNDSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // NDSCONTENT
