/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QRFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF1 <em>QRF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF2 <em>QRF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF3 <em>QRF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF4 <em>QRF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF5 <em>QRF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF6 <em>QRF6</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF7 <em>QRF7</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF8 <em>QRF8</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF9 <em>QRF9</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getQRF10 <em>QRF10</em>}</li>
 *   <li>{@link org.hl7.v2xml.QRFCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT()
 * @model extendedMetaData="name='QRF.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface QRFCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>QRF1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='QRF.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF1CONTENT> getQRF1();

	/**
	 * Returns the value of the '<em><b>QRF2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF2</em>' containment reference.
	 * @see #setQRF2(QRF2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.2' namespace='##targetNamespace'"
	 * @generated
	 */
	QRF2CONTENT getQRF2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRFCONTENT#getQRF2 <em>QRF2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRF2</em>' containment reference.
	 * @see #getQRF2()
	 * @generated
	 */
	void setQRF2(QRF2CONTENT value);

	/**
	 * Returns the value of the '<em><b>QRF3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF3</em>' containment reference.
	 * @see #setQRF3(QRF3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.3' namespace='##targetNamespace'"
	 * @generated
	 */
	QRF3CONTENT getQRF3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRFCONTENT#getQRF3 <em>QRF3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRF3</em>' containment reference.
	 * @see #getQRF3()
	 * @generated
	 */
	void setQRF3(QRF3CONTENT value);

	/**
	 * Returns the value of the '<em><b>QRF4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF4CONTENT> getQRF4();

	/**
	 * Returns the value of the '<em><b>QRF5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF5CONTENT> getQRF5();

	/**
	 * Returns the value of the '<em><b>QRF6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF6CONTENT> getQRF6();

	/**
	 * Returns the value of the '<em><b>QRF7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF7CONTENT> getQRF7();

	/**
	 * Returns the value of the '<em><b>QRF8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.QRF8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QRF8CONTENT> getQRF8();

	/**
	 * Returns the value of the '<em><b>QRF9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF9</em>' containment reference.
	 * @see #setQRF9(QRF9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.9' namespace='##targetNamespace'"
	 * @generated
	 */
	QRF9CONTENT getQRF9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRFCONTENT#getQRF9 <em>QRF9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRF9</em>' containment reference.
	 * @see #getQRF9()
	 * @generated
	 */
	void setQRF9(QRF9CONTENT value);

	/**
	 * Returns the value of the '<em><b>QRF10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QRF10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QRF10</em>' containment reference.
	 * @see #setQRF10(QRF10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_QRF10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QRF.10' namespace='##targetNamespace'"
	 * @generated
	 */
	QRF10CONTENT getQRF10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QRFCONTENT#getQRF10 <em>QRF10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QRF10</em>' containment reference.
	 * @see #getQRF10()
	 * @generated
	 */
	void setQRF10(QRF10CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getQRFCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // QRFCONTENT
