/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BARP01CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getMSH <em>MSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getSFT <em>SFT</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getEVN <em>EVN</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getPID <em>PID</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getPD1 <em>PD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01CONTENT#getBARP01VISIT <em>BARP01VISIT</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT()
 * @model extendedMetaData="name='BAR_P01.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BARP01CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>MSH</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MSH</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MSH</em>' containment reference.
	 * @see #setMSH(MSHCONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_MSH()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MSH' namespace='##targetNamespace'"
	 * @generated
	 */
	MSHCONTENT getMSH();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01CONTENT#getMSH <em>MSH</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MSH</em>' containment reference.
	 * @see #getMSH()
	 * @generated
	 */
	void setMSH(MSHCONTENT value);

	/**
	 * Returns the value of the '<em><b>SFT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.SFTCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SFT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SFT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_SFT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SFT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SFTCONTENT> getSFT();

	/**
	 * Returns the value of the '<em><b>EVN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EVN</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EVN</em>' containment reference.
	 * @see #setEVN(EVNCONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_EVN()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EVN' namespace='##targetNamespace'"
	 * @generated
	 */
	EVNCONTENT getEVN();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01CONTENT#getEVN <em>EVN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EVN</em>' containment reference.
	 * @see #getEVN()
	 * @generated
	 */
	void setEVN(EVNCONTENT value);

	/**
	 * Returns the value of the '<em><b>PID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PID</em>' containment reference.
	 * @see #setPID(PIDCONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_PID()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PID' namespace='##targetNamespace'"
	 * @generated
	 */
	PIDCONTENT getPID();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01CONTENT#getPID <em>PID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PID</em>' containment reference.
	 * @see #getPID()
	 * @generated
	 */
	void setPID(PIDCONTENT value);

	/**
	 * Returns the value of the '<em><b>PD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD1</em>' containment reference.
	 * @see #setPD1(PD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_PD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1' namespace='##targetNamespace'"
	 * @generated
	 */
	PD1CONTENT getPD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01CONTENT#getPD1 <em>PD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD1</em>' containment reference.
	 * @see #getPD1()
	 * @generated
	 */
	void setPD1(PD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ROL</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ROLCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ROL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ROL</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_ROL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROLCONTENT> getROL();

	/**
	 * Returns the value of the '<em><b>BARP01VISIT</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BARP01VISITCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BARP01VISIT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BARP01VISIT</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01CONTENT_BARP01VISIT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BAR_P01.VISIT' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BARP01VISITCONTENT> getBARP01VISIT();

} // BARP01CONTENT
