/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRACONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA1 <em>PRA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA2 <em>PRA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA3 <em>PRA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA4 <em>PRA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA5 <em>PRA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA6 <em>PRA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA7 <em>PRA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA8 <em>PRA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA9 <em>PRA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA10 <em>PRA10</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA11 <em>PRA11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getPRA12 <em>PRA12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRACONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT()
 * @model extendedMetaData="name='PRA.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PRACONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PRA1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA1</em>' containment reference.
	 * @see #setPRA1(PRA1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA1CONTENT getPRA1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA1 <em>PRA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA1</em>' containment reference.
	 * @see #getPRA1()
	 * @generated
	 */
	void setPRA1(PRA1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRA2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA2CONTENT> getPRA2();

	/**
	 * Returns the value of the '<em><b>PRA3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA3CONTENT> getPRA3();

	/**
	 * Returns the value of the '<em><b>PRA4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA4</em>' containment reference.
	 * @see #setPRA4(PRA4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA4CONTENT getPRA4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA4 <em>PRA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA4</em>' containment reference.
	 * @see #getPRA4()
	 * @generated
	 */
	void setPRA4(PRA4CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRA5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA5CONTENT> getPRA5();

	/**
	 * Returns the value of the '<em><b>PRA6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA6CONTENT> getPRA6();

	/**
	 * Returns the value of the '<em><b>PRA7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA7CONTENT> getPRA7();

	/**
	 * Returns the value of the '<em><b>PRA8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA8</em>' containment reference.
	 * @see #setPRA8(PRA8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA8CONTENT getPRA8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA8 <em>PRA8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA8</em>' containment reference.
	 * @see #getPRA8()
	 * @generated
	 */
	void setPRA8(PRA8CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRA9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA9</em>' containment reference.
	 * @see #setPRA9(PRA9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA9CONTENT getPRA9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA9 <em>PRA9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA9</em>' containment reference.
	 * @see #getPRA9()
	 * @generated
	 */
	void setPRA9(PRA9CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRA10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA10</em>' containment reference.
	 * @see #setPRA10(PRA10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.10' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA10CONTENT getPRA10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA10 <em>PRA10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA10</em>' containment reference.
	 * @see #getPRA10()
	 * @generated
	 */
	void setPRA10(PRA10CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRA11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRA11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRA11CONTENT> getPRA11();

	/**
	 * Returns the value of the '<em><b>PRA12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRA12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRA12</em>' containment reference.
	 * @see #setPRA12(PRA12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_PRA12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRA.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PRA12CONTENT getPRA12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRACONTENT#getPRA12 <em>PRA12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRA12</em>' containment reference.
	 * @see #getPRA12()
	 * @generated
	 */
	void setPRA12(PRA12CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPRACONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PRACONTENT
