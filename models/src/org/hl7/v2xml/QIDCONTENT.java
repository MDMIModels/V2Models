/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QIDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.QIDCONTENT#getQID1 <em>QID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.QIDCONTENT#getQID2 <em>QID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.QIDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getQIDCONTENT()
 * @model extendedMetaData="name='QID.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface QIDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>QID1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QID1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QID1</em>' containment reference.
	 * @see #setQID1(QID1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQIDCONTENT_QID1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QID.1' namespace='##targetNamespace'"
	 * @generated
	 */
	QID1CONTENT getQID1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QIDCONTENT#getQID1 <em>QID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QID1</em>' containment reference.
	 * @see #getQID1()
	 * @generated
	 */
	void setQID1(QID1CONTENT value);

	/**
	 * Returns the value of the '<em><b>QID2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QID2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QID2</em>' containment reference.
	 * @see #setQID2(QID2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQIDCONTENT_QID2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QID.2' namespace='##targetNamespace'"
	 * @generated
	 */
	QID2CONTENT getQID2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QIDCONTENT#getQID2 <em>QID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QID2</em>' containment reference.
	 * @see #getQID2()
	 * @generated
	 */
	void setQID2(QID2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getQIDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // QIDCONTENT
