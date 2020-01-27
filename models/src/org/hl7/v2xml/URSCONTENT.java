/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS1 <em>URS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS2 <em>URS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS3 <em>URS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS4 <em>URS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS5 <em>URS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS6 <em>URS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS7 <em>URS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS8 <em>URS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getURS9 <em>URS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.URSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT()
 * @model extendedMetaData="name='URS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface URSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>URS1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='URS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS1CONTENT> getURS1();

	/**
	 * Returns the value of the '<em><b>URS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS2</em>' containment reference.
	 * @see #setURS2(URS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	URS2CONTENT getURS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URSCONTENT#getURS2 <em>URS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URS2</em>' containment reference.
	 * @see #getURS2()
	 * @generated
	 */
	void setURS2(URS2CONTENT value);

	/**
	 * Returns the value of the '<em><b>URS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS3</em>' containment reference.
	 * @see #setURS3(URS3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	URS3CONTENT getURS3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URSCONTENT#getURS3 <em>URS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URS3</em>' containment reference.
	 * @see #getURS3()
	 * @generated
	 */
	void setURS3(URS3CONTENT value);

	/**
	 * Returns the value of the '<em><b>URS4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS4CONTENT> getURS4();

	/**
	 * Returns the value of the '<em><b>URS5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS5CONTENT> getURS5();

	/**
	 * Returns the value of the '<em><b>URS6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS6CONTENT> getURS6();

	/**
	 * Returns the value of the '<em><b>URS7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS7CONTENT> getURS7();

	/**
	 * Returns the value of the '<em><b>URS8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.URS8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URS8CONTENT> getURS8();

	/**
	 * Returns the value of the '<em><b>URS9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>URS9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>URS9</em>' containment reference.
	 * @see #setURS9(URS9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_URS9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='URS.9' namespace='##targetNamespace'"
	 * @generated
	 */
	URS9CONTENT getURS9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.URSCONTENT#getURS9 <em>URS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URS9</em>' containment reference.
	 * @see #getURS9()
	 * @generated
	 */
	void setURS9(URS9CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getURSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // URSCONTENT
