/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LOCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC1 <em>LOC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC2 <em>LOC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC3 <em>LOC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC4 <em>LOC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC5 <em>LOC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC6 <em>LOC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC7 <em>LOC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC8 <em>LOC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getLOC9 <em>LOC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.LOCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT()
 * @model extendedMetaData="name='LOC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface LOCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>LOC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC1</em>' containment reference.
	 * @see #setLOC1(LOC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LOC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	LOC1CONTENT getLOC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LOCCONTENT#getLOC1 <em>LOC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOC1</em>' containment reference.
	 * @see #getLOC1()
	 * @generated
	 */
	void setLOC1(LOC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>LOC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC2</em>' containment reference.
	 * @see #setLOC2(LOC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	LOC2CONTENT getLOC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LOCCONTENT#getLOC2 <em>LOC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOC2</em>' containment reference.
	 * @see #getLOC2()
	 * @generated
	 */
	void setLOC2(LOC2CONTENT value);

	/**
	 * Returns the value of the '<em><b>LOC3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LOC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC3CONTENT> getLOC3();

	/**
	 * Returns the value of the '<em><b>LOC4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC4CONTENT> getLOC4();

	/**
	 * Returns the value of the '<em><b>LOC5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC5CONTENT> getLOC5();

	/**
	 * Returns the value of the '<em><b>LOC6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC6CONTENT> getLOC6();

	/**
	 * Returns the value of the '<em><b>LOC7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC7CONTENT> getLOC7();

	/**
	 * Returns the value of the '<em><b>LOC8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LOC8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LOC8CONTENT> getLOC8();

	/**
	 * Returns the value of the '<em><b>LOC9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LOC9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LOC9</em>' containment reference.
	 * @see #setLOC9(LOC9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_LOC9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LOC.9' namespace='##targetNamespace'"
	 * @generated
	 */
	LOC9CONTENT getLOC9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LOCCONTENT#getLOC9 <em>LOC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOC9</em>' containment reference.
	 * @see #getLOC9()
	 * @generated
	 */
	void setLOC9(LOC9CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getLOCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // LOCCONTENT
