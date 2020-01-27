/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QRICONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.QRICONTENT#getQRI1 <em>QRI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRICONTENT#getQRI2 <em>QRI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRICONTENT#getQRI3 <em>QRI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRICONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getQRICONTENT()
 * @model extendedMetaData="name='QRI.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface QRICONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>QRI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRI1</em>' containment reference.
	 * @see #setQRI1(QRI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRICONTENT_QRI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	QRI1CONTENT getQRI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRICONTENT#getQRI1 <em>QRI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRI1</em>' containment reference.
	 * @see #getQRI1()
	 * @generated
	 */
	void setQRI1(QRI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>QRI2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRI2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRI2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRI2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRICONTENT_QRI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRI2CONTENT> getQRI2();

	/**
	 * Returns the value of the '<em><b>QRI3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRI3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRI3</em>' containment reference.
	 * @see #setQRI3(QRI3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRICONTENT_QRI3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRI.3' namespace='##targetNamespace'"
	 * @generated
	 */
	QRI3CONTENT getQRI3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRICONTENT#getQRI3 <em>QRI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRI3</em>' containment reference.
	 * @see #getQRI3()
	 * @generated
	 */
	void setQRI3(QRI3CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getQRICONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // QRICONTENT
