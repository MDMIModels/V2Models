/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>INVCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV1 <em>INV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV2 <em>INV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV3 <em>INV3</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV4 <em>INV4</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV5 <em>INV5</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV6 <em>INV6</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV7 <em>INV7</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV8 <em>INV8</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV9 <em>INV9</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV10 <em>INV10</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV11 <em>INV11</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV12 <em>INV12</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV13 <em>INV13</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV14 <em>INV14</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV15 <em>INV15</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV16 <em>INV16</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV17 <em>INV17</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV18 <em>INV18</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV19 <em>INV19</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getINV20 <em>INV20</em>}</li>
 *   <li>{@link org.hl7.v2xml.INVCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT()
 * @model extendedMetaData="name='INV.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface INVCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>INV1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV1</em>' containment reference.
	 * @see #setINV1(INV1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='INV.1' namespace='##targetNamespace'"
	 * @generated
	 */
	INV1CONTENT getINV1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV1 <em>INV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV1</em>' containment reference.
	 * @see #getINV1()
	 * @generated
	 */
	void setINV1(INV1CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.INV2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='INV.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<INV2CONTENT> getINV2();

	/**
	 * Returns the value of the '<em><b>INV3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV3</em>' containment reference.
	 * @see #setINV3(INV3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.3' namespace='##targetNamespace'"
	 * @generated
	 */
	INV3CONTENT getINV3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV3 <em>INV3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV3</em>' containment reference.
	 * @see #getINV3()
	 * @generated
	 */
	void setINV3(INV3CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV4</em>' containment reference.
	 * @see #setINV4(INV4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.4' namespace='##targetNamespace'"
	 * @generated
	 */
	INV4CONTENT getINV4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV4 <em>INV4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV4</em>' containment reference.
	 * @see #getINV4()
	 * @generated
	 */
	void setINV4(INV4CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV5</em>' containment reference.
	 * @see #setINV5(INV5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.5' namespace='##targetNamespace'"
	 * @generated
	 */
	INV5CONTENT getINV5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV5 <em>INV5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV5</em>' containment reference.
	 * @see #getINV5()
	 * @generated
	 */
	void setINV5(INV5CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV6</em>' containment reference.
	 * @see #setINV6(INV6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.6' namespace='##targetNamespace'"
	 * @generated
	 */
	INV6CONTENT getINV6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV6 <em>INV6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV6</em>' containment reference.
	 * @see #getINV6()
	 * @generated
	 */
	void setINV6(INV6CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV7</em>' containment reference.
	 * @see #setINV7(INV7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.7' namespace='##targetNamespace'"
	 * @generated
	 */
	INV7CONTENT getINV7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV7 <em>INV7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV7</em>' containment reference.
	 * @see #getINV7()
	 * @generated
	 */
	void setINV7(INV7CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV8</em>' containment reference.
	 * @see #setINV8(INV8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.8' namespace='##targetNamespace'"
	 * @generated
	 */
	INV8CONTENT getINV8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV8 <em>INV8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV8</em>' containment reference.
	 * @see #getINV8()
	 * @generated
	 */
	void setINV8(INV8CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV9</em>' containment reference.
	 * @see #setINV9(INV9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.9' namespace='##targetNamespace'"
	 * @generated
	 */
	INV9CONTENT getINV9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV9 <em>INV9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV9</em>' containment reference.
	 * @see #getINV9()
	 * @generated
	 */
	void setINV9(INV9CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV10</em>' containment reference.
	 * @see #setINV10(INV10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.10' namespace='##targetNamespace'"
	 * @generated
	 */
	INV10CONTENT getINV10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV10 <em>INV10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV10</em>' containment reference.
	 * @see #getINV10()
	 * @generated
	 */
	void setINV10(INV10CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV11</em>' containment reference.
	 * @see #setINV11(INV11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.11' namespace='##targetNamespace'"
	 * @generated
	 */
	INV11CONTENT getINV11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV11 <em>INV11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV11</em>' containment reference.
	 * @see #getINV11()
	 * @generated
	 */
	void setINV11(INV11CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV12</em>' containment reference.
	 * @see #setINV12(INV12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.12' namespace='##targetNamespace'"
	 * @generated
	 */
	INV12CONTENT getINV12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV12 <em>INV12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV12</em>' containment reference.
	 * @see #getINV12()
	 * @generated
	 */
	void setINV12(INV12CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV13</em>' containment reference.
	 * @see #setINV13(INV13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.13' namespace='##targetNamespace'"
	 * @generated
	 */
	INV13CONTENT getINV13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV13 <em>INV13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV13</em>' containment reference.
	 * @see #getINV13()
	 * @generated
	 */
	void setINV13(INV13CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV14</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV14</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV14</em>' containment reference.
	 * @see #setINV14(INV14CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.14' namespace='##targetNamespace'"
	 * @generated
	 */
	INV14CONTENT getINV14();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV14 <em>INV14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV14</em>' containment reference.
	 * @see #getINV14()
	 * @generated
	 */
	void setINV14(INV14CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV15</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.INV15CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV15</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV15</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.15' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<INV15CONTENT> getINV15();

	/**
	 * Returns the value of the '<em><b>INV16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV16</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV16</em>' containment reference.
	 * @see #setINV16(INV16CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.16' namespace='##targetNamespace'"
	 * @generated
	 */
	INV16CONTENT getINV16();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV16 <em>INV16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV16</em>' containment reference.
	 * @see #getINV16()
	 * @generated
	 */
	void setINV16(INV16CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV17</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV17</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV17</em>' containment reference.
	 * @see #setINV17(INV17CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.17' namespace='##targetNamespace'"
	 * @generated
	 */
	INV17CONTENT getINV17();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV17 <em>INV17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV17</em>' containment reference.
	 * @see #getINV17()
	 * @generated
	 */
	void setINV17(INV17CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV18</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV18</em>' containment reference.
	 * @see #setINV18(INV18CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.18' namespace='##targetNamespace'"
	 * @generated
	 */
	INV18CONTENT getINV18();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV18 <em>INV18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV18</em>' containment reference.
	 * @see #getINV18()
	 * @generated
	 */
	void setINV18(INV18CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV19</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV19</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV19</em>' containment reference.
	 * @see #setINV19(INV19CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.19' namespace='##targetNamespace'"
	 * @generated
	 */
	INV19CONTENT getINV19();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV19 <em>INV19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV19</em>' containment reference.
	 * @see #getINV19()
	 * @generated
	 */
	void setINV19(INV19CONTENT value);

	/**
	 * Returns the value of the '<em><b>INV20</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>INV20</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INV20</em>' containment reference.
	 * @see #setINV20(INV20CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_INV20()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INV.20' namespace='##targetNamespace'"
	 * @generated
	 */
	INV20CONTENT getINV20();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.INVCONTENT#getINV20 <em>INV20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INV20</em>' containment reference.
	 * @see #getINV20()
	 * @generated
	 */
	void setINV20(INV20CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getINVCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':20' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // INVCONTENT
