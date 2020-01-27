/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QPDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.QPDCONTENT#getQPD1 <em>QPD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.QPDCONTENT#getQPD2 <em>QPD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.QPDCONTENT#getQPD3 <em>QPD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.QPDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getQPDCONTENT()
 * @model extendedMetaData="name='QPD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface QPDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>QPD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPD1</em>' containment reference.
	 * @see #setQPD1(QPD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQPDCONTENT_QPD1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QPD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	QPD1CONTENT getQPD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QPDCONTENT#getQPD1 <em>QPD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QPD1</em>' containment reference.
	 * @see #getQPD1()
	 * @generated
	 */
	void setQPD1(QPD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>QPD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPD2</em>' containment reference.
	 * @see #setQPD2(QPD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQPDCONTENT_QPD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QPD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	QPD2CONTENT getQPD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QPDCONTENT#getQPD2 <em>QPD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QPD2</em>' containment reference.
	 * @see #getQPD2()
	 * @generated
	 */
	void setQPD2(QPD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>QPD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QPD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QPD3</em>' containment reference.
	 * @see #setQPD3(QPD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQPDCONTENT_QPD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QPD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	QPD3CONTENT getQPD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QPDCONTENT#getQPD3 <em>QPD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QPD3</em>' containment reference.
	 * @see #getQPD3()
	 * @generated
	 */
	void setQPD3(QPD3CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getQPDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // QPDCONTENT
