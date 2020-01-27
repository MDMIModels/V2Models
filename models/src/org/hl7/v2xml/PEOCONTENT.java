/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PEOCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO1 <em>PEO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO2 <em>PEO2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO3 <em>PEO3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO4 <em>PEO4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO5 <em>PEO5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO6 <em>PEO6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO7 <em>PEO7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO8 <em>PEO8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO9 <em>PEO9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO10 <em>PEO10</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO11 <em>PEO11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO12 <em>PEO12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO13 <em>PEO13</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO14 <em>PEO14</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO15 <em>PEO15</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO16 <em>PEO16</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO17 <em>PEO17</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO18 <em>PEO18</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO19 <em>PEO19</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO20 <em>PEO20</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO21 <em>PEO21</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO22 <em>PEO22</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO23 <em>PEO23</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO24 <em>PEO24</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getPEO25 <em>PEO25</em>}</li>
 *   <li>{@link org.hl7.v2xml.PEOCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT()
 * @model extendedMetaData="name='PEO.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PEOCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PEO1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO1CONTENT> getPEO1();

	/**
	 * Returns the value of the '<em><b>PEO2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO2CONTENT> getPEO2();

	/**
	 * Returns the value of the '<em><b>PEO3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO3</em>' containment reference.
	 * @see #setPEO3(PEO3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PEO.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO3CONTENT getPEO3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO3 <em>PEO3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO3</em>' containment reference.
	 * @see #getPEO3()
	 * @generated
	 */
	void setPEO3(PEO3CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO4</em>' containment reference.
	 * @see #setPEO4(PEO4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO4CONTENT getPEO4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO4 <em>PEO4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO4</em>' containment reference.
	 * @see #getPEO4()
	 * @generated
	 */
	void setPEO4(PEO4CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO5</em>' containment reference.
	 * @see #setPEO5(PEO5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.5' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO5CONTENT getPEO5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO5 <em>PEO5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO5</em>' containment reference.
	 * @see #getPEO5()
	 * @generated
	 */
	void setPEO5(PEO5CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO6</em>' containment reference.
	 * @see #setPEO6(PEO6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.6' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO6CONTENT getPEO6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO6 <em>PEO6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO6</em>' containment reference.
	 * @see #getPEO6()
	 * @generated
	 */
	void setPEO6(PEO6CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO7CONTENT> getPEO7();

	/**
	 * Returns the value of the '<em><b>PEO8</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO8CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO8</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO8</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.8' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO8CONTENT> getPEO8();

	/**
	 * Returns the value of the '<em><b>PEO9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO9</em>' containment reference.
	 * @see #setPEO9(PEO9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO9CONTENT getPEO9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO9 <em>PEO9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO9</em>' containment reference.
	 * @see #getPEO9()
	 * @generated
	 */
	void setPEO9(PEO9CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO10</em>' containment reference.
	 * @see #setPEO10(PEO10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.10' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO10CONTENT getPEO10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO10 <em>PEO10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO10</em>' containment reference.
	 * @see #getPEO10()
	 * @generated
	 */
	void setPEO10(PEO10CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO11CONTENT> getPEO11();

	/**
	 * Returns the value of the '<em><b>PEO12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO12</em>' containment reference.
	 * @see #setPEO12(PEO12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO12CONTENT getPEO12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO12 <em>PEO12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO12</em>' containment reference.
	 * @see #getPEO12()
	 * @generated
	 */
	void setPEO12(PEO12CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO13</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO13CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO13</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO13</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.13' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO13CONTENT> getPEO13();

	/**
	 * Returns the value of the '<em><b>PEO14</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO14CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO14</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO14</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.14' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO14CONTENT> getPEO14();

	/**
	 * Returns the value of the '<em><b>PEO15</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO15CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO15</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO15</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.15' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO15CONTENT> getPEO15();

	/**
	 * Returns the value of the '<em><b>PEO16</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO16CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO16</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO16</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.16' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO16CONTENT> getPEO16();

	/**
	 * Returns the value of the '<em><b>PEO17</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO17CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO17</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO17</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.17' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO17CONTENT> getPEO17();

	/**
	 * Returns the value of the '<em><b>PEO18</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO18CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO18</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO18</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.18' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO18CONTENT> getPEO18();

	/**
	 * Returns the value of the '<em><b>PEO19</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO19CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO19</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO19</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.19' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO19CONTENT> getPEO19();

	/**
	 * Returns the value of the '<em><b>PEO20</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO20CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO20</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO20</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO20()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.20' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO20CONTENT> getPEO20();

	/**
	 * Returns the value of the '<em><b>PEO21</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PEO21CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO21</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO21</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO21()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.21' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PEO21CONTENT> getPEO21();

	/**
	 * Returns the value of the '<em><b>PEO22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO22</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO22</em>' containment reference.
	 * @see #setPEO22(PEO22CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO22()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.22' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO22CONTENT getPEO22();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO22 <em>PEO22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO22</em>' containment reference.
	 * @see #getPEO22()
	 * @generated
	 */
	void setPEO22(PEO22CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO23</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO23</em>' containment reference.
	 * @see #setPEO23(PEO23CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.23' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO23CONTENT getPEO23();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO23 <em>PEO23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO23</em>' containment reference.
	 * @see #getPEO23()
	 * @generated
	 */
	void setPEO23(PEO23CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO24</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO24</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO24</em>' containment reference.
	 * @see #setPEO24(PEO24CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO24()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.24' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO24CONTENT getPEO24();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO24 <em>PEO24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO24</em>' containment reference.
	 * @see #getPEO24()
	 * @generated
	 */
	void setPEO24(PEO24CONTENT value);

	/**
	 * Returns the value of the '<em><b>PEO25</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PEO25</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PEO25</em>' containment reference.
	 * @see #setPEO25(PEO25CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_PEO25()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PEO.25' namespace='##targetNamespace'"
	 * @generated
	 */
	PEO25CONTENT getPEO25();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PEOCONTENT#getPEO25 <em>PEO25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PEO25</em>' containment reference.
	 * @see #getPEO25()
	 * @generated
	 */
	void setPEO25(PEO25CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPEOCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':25' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PEOCONTENT
