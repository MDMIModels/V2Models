/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC1 <em>PDC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC2 <em>PDC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC3 <em>PDC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC4 <em>PDC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC5 <em>PDC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC6 <em>PDC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC7 <em>PDC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC8 <em>PDC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC9 <em>PDC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC10 <em>PDC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC11 <em>PDC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC12 <em>PDC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC13 <em>PDC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC14 <em>PDC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getPDC15 <em>PDC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT()
 * @model extendedMetaData="name='PDC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PDCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PDC1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDC1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PDC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDC1CONTENT> getPDC1();

	/**
	 * Returns the value of the '<em><b>PDC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC2</em>' containment reference.
	 * @see #setPDC2(PDC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PDC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC2CONTENT getPDC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC2 <em>PDC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC2</em>' containment reference.
	 * @see #getPDC2()
	 * @generated
	 */
	void setPDC2(PDC2CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC3</em>' containment reference.
	 * @see #setPDC3(PDC3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PDC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC3CONTENT getPDC3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC3 <em>PDC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC3</em>' containment reference.
	 * @see #getPDC3()
	 * @generated
	 */
	void setPDC3(PDC3CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC4</em>' containment reference.
	 * @see #setPDC4(PDC4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC4CONTENT getPDC4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC4 <em>PDC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC4</em>' containment reference.
	 * @see #getPDC4()
	 * @generated
	 */
	void setPDC4(PDC4CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC5</em>' containment reference.
	 * @see #setPDC5(PDC5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.5' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC5CONTENT getPDC5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC5 <em>PDC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC5</em>' containment reference.
	 * @see #getPDC5()
	 * @generated
	 */
	void setPDC5(PDC5CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDC6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDC6CONTENT> getPDC6();

	/**
	 * Returns the value of the '<em><b>PDC7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC7</em>' containment reference.
	 * @see #setPDC7(PDC7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.7' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC7CONTENT getPDC7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC7 <em>PDC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC7</em>' containment reference.
	 * @see #getPDC7()
	 * @generated
	 */
	void setPDC7(PDC7CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDC8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDC8CONTENT> getPDC8();

	/**
	 * Returns the value of the '<em><b>PDC9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC9</em>' containment reference.
	 * @see #setPDC9(PDC9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC9CONTENT getPDC9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC9 <em>PDC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC9</em>' containment reference.
	 * @see #getPDC9()
	 * @generated
	 */
	void setPDC9(PDC9CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC10</em>' containment reference.
	 * @see #setPDC10(PDC10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.10' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC10CONTENT getPDC10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC10 <em>PDC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC10</em>' containment reference.
	 * @see #getPDC10()
	 * @generated
	 */
	void setPDC10(PDC10CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC11</em>' containment reference.
	 * @see #setPDC11(PDC11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.11' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC11CONTENT getPDC11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC11 <em>PDC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC11</em>' containment reference.
	 * @see #getPDC11()
	 * @generated
	 */
	void setPDC11(PDC11CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC12</em>' containment reference.
	 * @see #setPDC12(PDC12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC12CONTENT getPDC12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC12 <em>PDC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC12</em>' containment reference.
	 * @see #getPDC12()
	 * @generated
	 */
	void setPDC12(PDC12CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC13</em>' containment reference.
	 * @see #setPDC13(PDC13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.13' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC13CONTENT getPDC13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC13 <em>PDC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC13</em>' containment reference.
	 * @see #getPDC13()
	 * @generated
	 */
	void setPDC13(PDC13CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC14</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC14</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC14</em>' containment reference.
	 * @see #setPDC14(PDC14CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.14' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC14CONTENT getPDC14();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC14 <em>PDC14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC14</em>' containment reference.
	 * @see #getPDC14()
	 * @generated
	 */
	void setPDC14(PDC14CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDC15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDC15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDC15</em>' containment reference.
	 * @see #setPDC15(PDC15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_PDC15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDC.15' namespace='##targetNamespace'"
	 * @generated
	 */
	PDC15CONTENT getPDC15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDCCONTENT#getPDC15 <em>PDC15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDC15</em>' containment reference.
	 * @see #getPDC15()
	 * @generated
	 */
	void setPDC15(PDC15CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPDCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':15' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PDCCONTENT
