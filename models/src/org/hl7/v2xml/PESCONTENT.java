/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PESCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES1 <em>PES1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES2 <em>PES2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES3 <em>PES3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES4 <em>PES4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES5 <em>PES5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES6 <em>PES6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES7 <em>PES7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES8 <em>PES8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES9 <em>PES9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES10 <em>PES10</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES11 <em>PES11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES12 <em>PES12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getPES13 <em>PES13</em>}</li>
 *   <li>{@link org.hl7.v2xml.PESCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT()
 * @model extendedMetaData="name='PES.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PESCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PES1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES1CONTENT> getPES1();

	/**
	 * Returns the value of the '<em><b>PES2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES2CONTENT> getPES2();

	/**
	 * Returns the value of the '<em><b>PES3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES3CONTENT> getPES3();

	/**
	 * Returns the value of the '<em><b>PES4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES4CONTENT> getPES4();

	/**
	 * Returns the value of the '<em><b>PES5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES5</em>' containment reference.
	 * @see #setPES5(PES5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.5' namespace='##targetNamespace'"
	 * @generated
	 */
	PES5CONTENT getPES5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES5 <em>PES5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES5</em>' containment reference.
	 * @see #getPES5()
	 * @generated
	 */
	void setPES5(PES5CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES6</em>' containment reference.
	 * @see #setPES6(PES6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.6' namespace='##targetNamespace'"
	 * @generated
	 */
	PES6CONTENT getPES6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES6 <em>PES6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES6</em>' containment reference.
	 * @see #getPES6()
	 * @generated
	 */
	void setPES6(PES6CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES7CONTENT> getPES7();

	/**
	 * Returns the value of the '<em><b>PES8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES8</em>' containment reference.
	 * @see #setPES8(PES8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PES8CONTENT getPES8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES8 <em>PES8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES8</em>' containment reference.
	 * @see #getPES8()
	 * @generated
	 */
	void setPES8(PES8CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES9</em>' containment reference.
	 * @see #setPES9(PES9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PES9CONTENT getPES9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES9 <em>PES9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES9</em>' containment reference.
	 * @see #getPES9()
	 * @generated
	 */
	void setPES9(PES9CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES10</em>' containment reference.
	 * @see #setPES10(PES10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES10()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PES.10' namespace='##targetNamespace'"
	 * @generated
	 */
	PES10CONTENT getPES10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES10 <em>PES10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES10</em>' containment reference.
	 * @see #getPES10()
	 * @generated
	 */
	void setPES10(PES10CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES11CONTENT> getPES11();

	/**
	 * Returns the value of the '<em><b>PES12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES12</em>' containment reference.
	 * @see #setPES12(PES12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PES12CONTENT getPES12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PESCONTENT#getPES12 <em>PES12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PES12</em>' containment reference.
	 * @see #getPES12()
	 * @generated
	 */
	void setPES12(PES12CONTENT value);

	/**
	 * Returns the value of the '<em><b>PES13</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PES13CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PES13</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PES13</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_PES13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PES.13' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PES13CONTENT> getPES13();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPESCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PESCONTENT
