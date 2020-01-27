/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AILCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL1 <em>AIL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL2 <em>AIL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL3 <em>AIL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL4 <em>AIL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL5 <em>AIL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL6 <em>AIL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL7 <em>AIL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL8 <em>AIL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL9 <em>AIL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL10 <em>AIL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL11 <em>AIL11</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAIL12 <em>AIL12</em>}</li>
 *   <li>{@link org.hl7.v2xml.AILCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT()
 * @model extendedMetaData="name='AIL.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface AILCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>AIL1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL1</em>' containment reference.
	 * @see #setAIL1(AIL1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AIL.1' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL1CONTENT getAIL1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL1 <em>AIL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL1</em>' containment reference.
	 * @see #getAIL1()
	 * @generated
	 */
	void setAIL1(AIL1CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL2</em>' containment reference.
	 * @see #setAIL2(AIL2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.2' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL2CONTENT getAIL2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL2 <em>AIL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL2</em>' containment reference.
	 * @see #getAIL2()
	 * @generated
	 */
	void setAIL2(AIL2CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AIL3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AIL3CONTENT> getAIL3();

	/**
	 * Returns the value of the '<em><b>AIL4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL4</em>' containment reference.
	 * @see #setAIL4(AIL4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.4' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL4CONTENT getAIL4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL4 <em>AIL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL4</em>' containment reference.
	 * @see #getAIL4()
	 * @generated
	 */
	void setAIL4(AIL4CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL5</em>' containment reference.
	 * @see #setAIL5(AIL5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.5' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL5CONTENT getAIL5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL5 <em>AIL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL5</em>' containment reference.
	 * @see #getAIL5()
	 * @generated
	 */
	void setAIL5(AIL5CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL6</em>' containment reference.
	 * @see #setAIL6(AIL6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.6' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL6CONTENT getAIL6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL6 <em>AIL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL6</em>' containment reference.
	 * @see #getAIL6()
	 * @generated
	 */
	void setAIL6(AIL6CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL7</em>' containment reference.
	 * @see #setAIL7(AIL7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.7' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL7CONTENT getAIL7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL7 <em>AIL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL7</em>' containment reference.
	 * @see #getAIL7()
	 * @generated
	 */
	void setAIL7(AIL7CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL8</em>' containment reference.
	 * @see #setAIL8(AIL8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.8' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL8CONTENT getAIL8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL8 <em>AIL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL8</em>' containment reference.
	 * @see #getAIL8()
	 * @generated
	 */
	void setAIL8(AIL8CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL9</em>' containment reference.
	 * @see #setAIL9(AIL9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.9' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL9CONTENT getAIL9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL9 <em>AIL9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL9</em>' containment reference.
	 * @see #getAIL9()
	 * @generated
	 */
	void setAIL9(AIL9CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL10</em>' containment reference.
	 * @see #setAIL10(AIL10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.10' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL10CONTENT getAIL10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL10 <em>AIL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL10</em>' containment reference.
	 * @see #getAIL10()
	 * @generated
	 */
	void setAIL10(AIL10CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL11</em>' containment reference.
	 * @see #setAIL11(AIL11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.11' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL11CONTENT getAIL11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL11 <em>AIL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL11</em>' containment reference.
	 * @see #getAIL11()
	 * @generated
	 */
	void setAIL11(AIL11CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIL12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIL12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIL12</em>' containment reference.
	 * @see #setAIL12(AIL12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_AIL12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIL.12' namespace='##targetNamespace'"
	 * @generated
	 */
	AIL12CONTENT getAIL12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AILCONTENT#getAIL12 <em>AIL12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIL12</em>' containment reference.
	 * @see #getAIL12()
	 * @generated
	 */
	void setAIL12(AIL12CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getAILCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AILCONTENT
