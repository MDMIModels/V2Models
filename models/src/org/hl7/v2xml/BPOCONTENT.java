/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPOCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO1 <em>BPO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO2 <em>BPO2</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO3 <em>BPO3</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO4 <em>BPO4</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO5 <em>BPO5</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO6 <em>BPO6</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO7 <em>BPO7</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO8 <em>BPO8</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO9 <em>BPO9</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO10 <em>BPO10</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO11 <em>BPO11</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO12 <em>BPO12</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO13 <em>BPO13</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getBPO14 <em>BPO14</em>}</li>
 *   <li>{@link org.hl7.v2xml.BPOCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT()
 * @model extendedMetaData="name='BPO.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface BPOCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>BPO1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO1</em>' containment reference.
	 * @see #setBPO1(BPO1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BPO.1' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO1CONTENT getBPO1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO1 <em>BPO1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO1</em>' containment reference.
	 * @see #getBPO1()
	 * @generated
	 */
	void setBPO1(BPO1CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO2</em>' containment reference.
	 * @see #setBPO2(BPO2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BPO.2' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO2CONTENT getBPO2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO2 <em>BPO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO2</em>' containment reference.
	 * @see #getBPO2()
	 * @generated
	 */
	void setBPO2(BPO2CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BPO3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPO3CONTENT> getBPO3();

	/**
	 * Returns the value of the '<em><b>BPO4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO4</em>' containment reference.
	 * @see #setBPO4(BPO4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BPO.4' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO4CONTENT getBPO4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO4 <em>BPO4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO4</em>' containment reference.
	 * @see #getBPO4()
	 * @generated
	 */
	void setBPO4(BPO4CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO5</em>' containment reference.
	 * @see #setBPO5(BPO5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.5' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO5CONTENT getBPO5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO5 <em>BPO5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO5</em>' containment reference.
	 * @see #getBPO5()
	 * @generated
	 */
	void setBPO5(BPO5CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO6</em>' containment reference.
	 * @see #setBPO6(BPO6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.6' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO6CONTENT getBPO6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO6 <em>BPO6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO6</em>' containment reference.
	 * @see #getBPO6()
	 * @generated
	 */
	void setBPO6(BPO6CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO7</em>' containment reference.
	 * @see #setBPO7(BPO7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.7' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO7CONTENT getBPO7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO7 <em>BPO7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO7</em>' containment reference.
	 * @see #getBPO7()
	 * @generated
	 */
	void setBPO7(BPO7CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO8</em>' containment reference.
	 * @see #setBPO8(BPO8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.8' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO8CONTENT getBPO8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO8 <em>BPO8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO8</em>' containment reference.
	 * @see #getBPO8()
	 * @generated
	 */
	void setBPO8(BPO8CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO9</em>' containment reference.
	 * @see #setBPO9(BPO9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.9' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO9CONTENT getBPO9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO9 <em>BPO9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO9</em>' containment reference.
	 * @see #getBPO9()
	 * @generated
	 */
	void setBPO9(BPO9CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO10</em>' containment reference.
	 * @see #setBPO10(BPO10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.10' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO10CONTENT getBPO10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO10 <em>BPO10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO10</em>' containment reference.
	 * @see #getBPO10()
	 * @generated
	 */
	void setBPO10(BPO10CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO11</em>' containment reference.
	 * @see #setBPO11(BPO11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.11' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO11CONTENT getBPO11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO11 <em>BPO11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO11</em>' containment reference.
	 * @see #getBPO11()
	 * @generated
	 */
	void setBPO11(BPO11CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO12</em>' containment reference.
	 * @see #setBPO12(BPO12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.12' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO12CONTENT getBPO12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO12 <em>BPO12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO12</em>' containment reference.
	 * @see #getBPO12()
	 * @generated
	 */
	void setBPO12(BPO12CONTENT value);

	/**
	 * Returns the value of the '<em><b>BPO13</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.BPO13CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO13</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO13</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.13' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BPO13CONTENT> getBPO13();

	/**
	 * Returns the value of the '<em><b>BPO14</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BPO14</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BPO14</em>' containment reference.
	 * @see #setBPO14(BPO14CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_BPO14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BPO.14' namespace='##targetNamespace'"
	 * @generated
	 */
	BPO14CONTENT getBPO14();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.BPOCONTENT#getBPO14 <em>BPO14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BPO14</em>' containment reference.
	 * @see #getBPO14()
	 * @generated
	 */
	void setBPO14(BPO14CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getBPOCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':14' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // BPOCONTENT
