/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ERRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR1 <em>ERR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR2 <em>ERR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR3 <em>ERR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR4 <em>ERR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR5 <em>ERR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR6 <em>ERR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR7 <em>ERR7</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR8 <em>ERR8</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR9 <em>ERR9</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR10 <em>ERR10</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR11 <em>ERR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getERR12 <em>ERR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.ERRCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT()
 * @model extendedMetaData="name='ERR.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ERRCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ERR1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR1CONTENT> getERR1();

	/**
	 * Returns the value of the '<em><b>ERR2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR2CONTENT> getERR2();

	/**
	 * Returns the value of the '<em><b>ERR3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR3</em>' containment reference.
	 * @see #setERR3(ERR3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ERR.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR3CONTENT getERR3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR3 <em>ERR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR3</em>' containment reference.
	 * @see #getERR3()
	 * @generated
	 */
	void setERR3(ERR3CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR4</em>' containment reference.
	 * @see #setERR4(ERR4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ERR.4' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR4CONTENT getERR4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR4 <em>ERR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR4</em>' containment reference.
	 * @see #getERR4()
	 * @generated
	 */
	void setERR4(ERR4CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR5</em>' containment reference.
	 * @see #setERR5(ERR5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.5' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR5CONTENT getERR5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR5 <em>ERR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR5</em>' containment reference.
	 * @see #getERR5()
	 * @generated
	 */
	void setERR5(ERR5CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR6CONTENT> getERR6();

	/**
	 * Returns the value of the '<em><b>ERR7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR7</em>' containment reference.
	 * @see #setERR7(ERR7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.7' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR7CONTENT getERR7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR7 <em>ERR7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR7</em>' containment reference.
	 * @see #getERR7()
	 * @generated
	 */
	void setERR7(ERR7CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR8</em>' containment reference.
	 * @see #setERR8(ERR8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.8' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR8CONTENT getERR8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR8 <em>ERR8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR8</em>' containment reference.
	 * @see #getERR8()
	 * @generated
	 */
	void setERR8(ERR8CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR9</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR9CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR9</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR9</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR9CONTENT> getERR9();

	/**
	 * Returns the value of the '<em><b>ERR10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR10</em>' containment reference.
	 * @see #setERR10(ERR10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.10' namespace='##targetNamespace'"
	 * @generated
	 */
	ERR10CONTENT getERR10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ERRCONTENT#getERR10 <em>ERR10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ERR10</em>' containment reference.
	 * @see #getERR10()
	 * @generated
	 */
	void setERR10(ERR10CONTENT value);

	/**
	 * Returns the value of the '<em><b>ERR11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR11CONTENT> getERR11();

	/**
	 * Returns the value of the '<em><b>ERR12</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ERR12CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ERR12</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ERR12</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_ERR12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ERR.12' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ERR12CONTENT> getERR12();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getERRCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ERRCONTENT
