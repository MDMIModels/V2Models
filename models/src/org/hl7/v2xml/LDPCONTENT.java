/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LDPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP1 <em>LDP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP2 <em>LDP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP3 <em>LDP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP4 <em>LDP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP5 <em>LDP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP6 <em>LDP6</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP7 <em>LDP7</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP8 <em>LDP8</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP9 <em>LDP9</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP10 <em>LDP10</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP11 <em>LDP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getLDP12 <em>LDP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.LDPCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT()
 * @model extendedMetaData="name='LDP.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface LDPCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>LDP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP1</em>' containment reference.
	 * @see #setLDP1(LDP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LDP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP1CONTENT getLDP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP1 <em>LDP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP1</em>' containment reference.
	 * @see #getLDP1()
	 * @generated
	 */
	void setLDP1(LDP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP2</em>' containment reference.
	 * @see #setLDP2(LDP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LDP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP2CONTENT getLDP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP2 <em>LDP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP2</em>' containment reference.
	 * @see #getLDP2()
	 * @generated
	 */
	void setLDP2(LDP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LDP3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LDP3CONTENT> getLDP3();

	/**
	 * Returns the value of the '<em><b>LDP4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LDP4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LDP4CONTENT> getLDP4();

	/**
	 * Returns the value of the '<em><b>LDP5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LDP5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LDP5CONTENT> getLDP5();

	/**
	 * Returns the value of the '<em><b>LDP6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP6</em>' containment reference.
	 * @see #setLDP6(LDP6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.6' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP6CONTENT getLDP6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP6 <em>LDP6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP6</em>' containment reference.
	 * @see #getLDP6()
	 * @generated
	 */
	void setLDP6(LDP6CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP7</em>' containment reference.
	 * @see #setLDP7(LDP7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.7' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP7CONTENT getLDP7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP7 <em>LDP7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP7</em>' containment reference.
	 * @see #getLDP7()
	 * @generated
	 */
	void setLDP7(LDP7CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP8</em>' containment reference.
	 * @see #setLDP8(LDP8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.8' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP8CONTENT getLDP8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP8 <em>LDP8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP8</em>' containment reference.
	 * @see #getLDP8()
	 * @generated
	 */
	void setLDP8(LDP8CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP9</em>' containment reference.
	 * @see #setLDP9(LDP9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.9' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP9CONTENT getLDP9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP9 <em>LDP9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP9</em>' containment reference.
	 * @see #getLDP9()
	 * @generated
	 */
	void setLDP9(LDP9CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP10</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LDP10CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP10</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP10</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.10' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LDP10CONTENT> getLDP10();

	/**
	 * Returns the value of the '<em><b>LDP11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP11</em>' containment reference.
	 * @see #setLDP11(LDP11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.11' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP11CONTENT getLDP11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP11 <em>LDP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP11</em>' containment reference.
	 * @see #getLDP11()
	 * @generated
	 */
	void setLDP11(LDP11CONTENT value);

	/**
	 * Returns the value of the '<em><b>LDP12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LDP12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LDP12</em>' containment reference.
	 * @see #setLDP12(LDP12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_LDP12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LDP.12' namespace='##targetNamespace'"
	 * @generated
	 */
	LDP12CONTENT getLDP12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LDPCONTENT#getLDP12 <em>LDP12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LDP12</em>' containment reference.
	 * @see #getLDP12()
	 * @generated
	 */
	void setLDP12(LDP12CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getLDPCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // LDPCONTENT
