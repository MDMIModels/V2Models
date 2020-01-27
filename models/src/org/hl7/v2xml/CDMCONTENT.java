/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDMCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM1 <em>CDM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM2 <em>CDM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM3 <em>CDM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM4 <em>CDM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM5 <em>CDM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM6 <em>CDM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM7 <em>CDM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM8 <em>CDM8</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM9 <em>CDM9</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM10 <em>CDM10</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM11 <em>CDM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM12 <em>CDM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getCDM13 <em>CDM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.CDMCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT()
 * @model extendedMetaData="name='CDM.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CDMCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CDM1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM1</em>' containment reference.
	 * @see #setCDM1(CDM1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CDM.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM1CONTENT getCDM1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM1 <em>CDM1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM1</em>' containment reference.
	 * @see #getCDM1()
	 * @generated
	 */
	void setCDM1(CDM1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM2CONTENT> getCDM2();

	/**
	 * Returns the value of the '<em><b>CDM3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM3</em>' containment reference.
	 * @see #setCDM3(CDM3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CDM.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM3CONTENT getCDM3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM3 <em>CDM3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM3</em>' containment reference.
	 * @see #getCDM3()
	 * @generated
	 */
	void setCDM3(CDM3CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM4</em>' containment reference.
	 * @see #setCDM4(CDM4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.4' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM4CONTENT getCDM4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM4 <em>CDM4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM4</em>' containment reference.
	 * @see #getCDM4()
	 * @generated
	 */
	void setCDM4(CDM4CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM5</em>' containment reference.
	 * @see #setCDM5(CDM5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.5' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM5CONTENT getCDM5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM5 <em>CDM5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM5</em>' containment reference.
	 * @see #getCDM5()
	 * @generated
	 */
	void setCDM5(CDM5CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM6CONTENT> getCDM6();

	/**
	 * Returns the value of the '<em><b>CDM7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM7CONTENT> getCDM7();

	/**
	 * Returns the value of the '<em><b>CDM8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM8</em>' containment reference.
	 * @see #setCDM8(CDM8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.8' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM8CONTENT getCDM8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM8 <em>CDM8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM8</em>' containment reference.
	 * @see #getCDM8()
	 * @generated
	 */
	void setCDM8(CDM8CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM9</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM9CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM9</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM9</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM9CONTENT> getCDM9();

	/**
	 * Returns the value of the '<em><b>CDM10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM10</em>' containment reference.
	 * @see #setCDM10(CDM10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.10' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM10CONTENT getCDM10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM10 <em>CDM10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM10</em>' containment reference.
	 * @see #getCDM10()
	 * @generated
	 */
	void setCDM10(CDM10CONTENT value);

	/**
	 * Returns the value of the '<em><b>CDM11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM11CONTENT> getCDM11();

	/**
	 * Returns the value of the '<em><b>CDM12</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CDM12CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM12</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM12</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.12' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CDM12CONTENT> getCDM12();

	/**
	 * Returns the value of the '<em><b>CDM13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CDM13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CDM13</em>' containment reference.
	 * @see #setCDM13(CDM13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_CDM13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CDM.13' namespace='##targetNamespace'"
	 * @generated
	 */
	CDM13CONTENT getCDM13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CDMCONTENT#getCDM13 <em>CDM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CDM13</em>' containment reference.
	 * @see #getCDM13()
	 * @generated
	 */
	void setCDM13(CDM13CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCDMCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':13' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CDMCONTENT
