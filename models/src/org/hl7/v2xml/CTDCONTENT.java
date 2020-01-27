/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD1 <em>CTD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD2 <em>CTD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD3 <em>CTD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD4 <em>CTD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD5 <em>CTD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD6 <em>CTD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getCTD7 <em>CTD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT()
 * @model extendedMetaData="name='CTD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CTDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CTD1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTD1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CTD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTD1CONTENT> getCTD1();

	/**
	 * Returns the value of the '<em><b>CTD2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTD2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTD2CONTENT> getCTD2();

	/**
	 * Returns the value of the '<em><b>CTD3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTD3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTD3CONTENT> getCTD3();

	/**
	 * Returns the value of the '<em><b>CTD4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD4</em>' containment reference.
	 * @see #setCTD4(CTD4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	CTD4CONTENT getCTD4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CTDCONTENT#getCTD4 <em>CTD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTD4</em>' containment reference.
	 * @see #getCTD4()
	 * @generated
	 */
	void setCTD4(CTD4CONTENT value);

	/**
	 * Returns the value of the '<em><b>CTD5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTD5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTD5CONTENT> getCTD5();

	/**
	 * Returns the value of the '<em><b>CTD6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD6</em>' containment reference.
	 * @see #setCTD6(CTD6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.6' namespace='##targetNamespace'"
	 * @generated
	 */
	CTD6CONTENT getCTD6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CTDCONTENT#getCTD6 <em>CTD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTD6</em>' containment reference.
	 * @see #getCTD6()
	 * @generated
	 */
	void setCTD6(CTD6CONTENT value);

	/**
	 * Returns the value of the '<em><b>CTD7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CTD7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTD7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTD7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_CTD7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTD.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CTD7CONTENT> getCTD7();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCTDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CTDCONTENT
