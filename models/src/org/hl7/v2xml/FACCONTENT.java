/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FACCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC1 <em>FAC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC2 <em>FAC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC3 <em>FAC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC4 <em>FAC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC5 <em>FAC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC6 <em>FAC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC7 <em>FAC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC8 <em>FAC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC9 <em>FAC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC10 <em>FAC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC11 <em>FAC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getFAC12 <em>FAC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.FACCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT()
 * @model extendedMetaData="name='FAC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface FACCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>FAC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC1</em>' containment reference.
	 * @see #setFAC1(FAC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FAC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	FAC1CONTENT getFAC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FACCONTENT#getFAC1 <em>FAC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAC1</em>' containment reference.
	 * @see #getFAC1()
	 * @generated
	 */
	void setFAC1(FAC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>FAC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC2</em>' containment reference.
	 * @see #setFAC2(FAC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	FAC2CONTENT getFAC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FACCONTENT#getFAC2 <em>FAC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAC2</em>' containment reference.
	 * @see #getFAC2()
	 * @generated
	 */
	void setFAC2(FAC2CONTENT value);

	/**
	 * Returns the value of the '<em><b>FAC3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FAC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC3CONTENT> getFAC3();

	/**
	 * Returns the value of the '<em><b>FAC4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC4</em>' containment reference.
	 * @see #setFAC4(FAC4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FAC.4' namespace='##targetNamespace'"
	 * @generated
	 */
	FAC4CONTENT getFAC4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FACCONTENT#getFAC4 <em>FAC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAC4</em>' containment reference.
	 * @see #getFAC4()
	 * @generated
	 */
	void setFAC4(FAC4CONTENT value);

	/**
	 * Returns the value of the '<em><b>FAC5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC5CONTENT> getFAC5();

	/**
	 * Returns the value of the '<em><b>FAC6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC6CONTENT> getFAC6();

	/**
	 * Returns the value of the '<em><b>FAC7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC7CONTENT> getFAC7();

	/**
	 * Returns the value of the '<em><b>FAC8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC8CONTENT> getFAC8();

	/**
	 * Returns the value of the '<em><b>FAC9</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC9CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC9</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC9</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC9()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FAC.9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC9CONTENT> getFAC9();

	/**
	 * Returns the value of the '<em><b>FAC10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC10</em>' containment reference.
	 * @see #setFAC10(FAC10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.10' namespace='##targetNamespace'"
	 * @generated
	 */
	FAC10CONTENT getFAC10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FACCONTENT#getFAC10 <em>FAC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAC10</em>' containment reference.
	 * @see #getFAC10()
	 * @generated
	 */
	void setFAC10(FAC10CONTENT value);

	/**
	 * Returns the value of the '<em><b>FAC11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.FAC11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FAC11CONTENT> getFAC11();

	/**
	 * Returns the value of the '<em><b>FAC12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FAC12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FAC12</em>' containment reference.
	 * @see #setFAC12(FAC12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_FAC12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FAC.12' namespace='##targetNamespace'"
	 * @generated
	 */
	FAC12CONTENT getFAC12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FACCONTENT#getFAC12 <em>FAC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAC12</em>' containment reference.
	 * @see #getFAC12()
	 * @generated
	 */
	void setFAC12(FAC12CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getFACCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // FACCONTENT
