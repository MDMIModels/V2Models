/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BARP01VISITCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getPV1 <em>PV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getPV2 <em>PV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getDB1 <em>DB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getOBX <em>OBX</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getAL1 <em>AL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getDG1 <em>DG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getDRG <em>DRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getBARP01PROCEDURE <em>BARP01PROCEDURE</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getGT1 <em>GT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getNK1 <em>NK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getBARP01INSURANCE <em>BARP01INSURANCE</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getACC <em>ACC</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getUB1 <em>UB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BARP01VISITCONTENT#getUB2 <em>UB2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT()
 * @model extendedMetaData="name='BAR_P01.VISIT.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BARP01VISITCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PV1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PV1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PV1</em>' containment reference.
	 * @see #setPV1(PV1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_PV1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PV1' namespace='##targetNamespace'"
	 * @generated
	 */
	PV1CONTENT getPV1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getPV1 <em>PV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PV1</em>' containment reference.
	 * @see #getPV1()
	 * @generated
	 */
	void setPV1(PV1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PV2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PV2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PV2</em>' containment reference.
	 * @see #setPV2(PV2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_PV2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PV2' namespace='##targetNamespace'"
	 * @generated
	 */
	PV2CONTENT getPV2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getPV2 <em>PV2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PV2</em>' containment reference.
	 * @see #getPV2()
	 * @generated
	 */
	void setPV2(PV2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_ROL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ROL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ROLCONTENT> getROL();

	/**
	 * Returns the value of the '<em><b>DB1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DB1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_DB1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DB1CONTENT> getDB1();

	/**
	 * Returns the value of the '<em><b>OBX</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OBXCONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OBX</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OBX</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_OBX()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OBX' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OBXCONTENT> getOBX();

	/**
	 * Returns the value of the '<em><b>AL1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AL1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AL1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AL1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_AL1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AL1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AL1CONTENT> getAL1();

	/**
	 * Returns the value of the '<em><b>DG1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DG1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DG1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DG1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_DG1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DG1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DG1CONTENT> getDG1();

	/**
	 * Returns the value of the '<em><b>DRG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DRG</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DRG</em>' containment reference.
	 * @see #setDRG(DRGCONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_DRG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DRG' namespace='##targetNamespace'"
	 * @generated
	 */
	DRGCONTENT getDRG();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getDRG <em>DRG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DRG</em>' containment reference.
	 * @see #getDRG()
	 * @generated
	 */
	void setDRG(DRGCONTENT value);

	/**
	 * Returns the value of the '<em><b>BARP01PROCEDURE</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BARP01PROCEDURECONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BARP01PROCEDURE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BARP01PROCEDURE</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_BARP01PROCEDURE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BAR_P01.PROCEDURE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BARP01PROCEDURECONTENT> getBARP01PROCEDURE();

	/**
	 * Returns the value of the '<em><b>GT1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GT1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GT1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GT1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_GT1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GT1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GT1CONTENT> getGT1();

	/**
	 * Returns the value of the '<em><b>NK1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.NK1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NK1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NK1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_NK1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NK1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<NK1CONTENT> getNK1();

	/**
	 * Returns the value of the '<em><b>BARP01INSURANCE</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BARP01INSURANCECONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BARP01INSURANCE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BARP01INSURANCE</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_BARP01INSURANCE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BAR_P01.INSURANCE' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BARP01INSURANCECONTENT> getBARP01INSURANCE();

	/**
	 * Returns the value of the '<em><b>ACC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACC</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACC</em>' containment reference.
	 * @see #setACC(ACCCONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_ACC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ACC' namespace='##targetNamespace'"
	 * @generated
	 */
	ACCCONTENT getACC();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getACC <em>ACC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACC</em>' containment reference.
	 * @see #getACC()
	 * @generated
	 */
	void setACC(ACCCONTENT value);

	/**
	 * Returns the value of the '<em><b>UB1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UB1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UB1</em>' containment reference.
	 * @see #setUB1(UB1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_UB1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UB1' namespace='##targetNamespace'"
	 * @generated
	 */
	UB1CONTENT getUB1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getUB1 <em>UB1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UB1</em>' containment reference.
	 * @see #getUB1()
	 * @generated
	 */
	void setUB1(UB1CONTENT value);

	/**
	 * Returns the value of the '<em><b>UB2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UB2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UB2</em>' containment reference.
	 * @see #setUB2(UB2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBARP01VISITCONTENT_UB2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UB2' namespace='##targetNamespace'"
	 * @generated
	 */
	UB2CONTENT getUB2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BARP01VISITCONTENT#getUB2 <em>UB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UB2</em>' containment reference.
	 * @see #getUB2()
	 * @generated
	 */
	void setUB2(UB2CONTENT value);

} // BARP01VISITCONTENT
