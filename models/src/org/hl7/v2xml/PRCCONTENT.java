/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC1 <em>PRC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC2 <em>PRC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC3 <em>PRC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC4 <em>PRC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC5 <em>PRC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC6 <em>PRC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC7 <em>PRC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC8 <em>PRC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC9 <em>PRC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC10 <em>PRC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC11 <em>PRC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC12 <em>PRC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC13 <em>PRC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC14 <em>PRC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC15 <em>PRC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC16 <em>PRC16</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC17 <em>PRC17</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getPRC18 <em>PRC18</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT()
 * @model extendedMetaData="name='PRC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PRCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PRC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC1</em>' containment reference.
	 * @see #setPRC1(PRC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PRC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC1CONTENT getPRC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC1 <em>PRC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC1</em>' containment reference.
	 * @see #getPRC1()
	 * @generated
	 */
	void setPRC1(PRC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC2CONTENT> getPRC2();

	/**
	 * Returns the value of the '<em><b>PRC3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC3CONTENT> getPRC3();

	/**
	 * Returns the value of the '<em><b>PRC4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC4CONTENT> getPRC4();

	/**
	 * Returns the value of the '<em><b>PRC5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC5CONTENT> getPRC5();

	/**
	 * Returns the value of the '<em><b>PRC6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC6CONTENT> getPRC6();

	/**
	 * Returns the value of the '<em><b>PRC7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC7</em>' containment reference.
	 * @see #setPRC7(PRC7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.7' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC7CONTENT getPRC7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC7 <em>PRC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC7</em>' containment reference.
	 * @see #getPRC7()
	 * @generated
	 */
	void setPRC7(PRC7CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC8</em>' containment reference.
	 * @see #setPRC8(PRC8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC8CONTENT getPRC8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC8 <em>PRC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC8</em>' containment reference.
	 * @see #getPRC8()
	 * @generated
	 */
	void setPRC8(PRC8CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC9</em>' containment reference.
	 * @see #setPRC9(PRC9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC9CONTENT getPRC9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC9 <em>PRC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC9</em>' containment reference.
	 * @see #getPRC9()
	 * @generated
	 */
	void setPRC9(PRC9CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC10</em>' containment reference.
	 * @see #setPRC10(PRC10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.10' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC10CONTENT getPRC10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC10 <em>PRC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC10</em>' containment reference.
	 * @see #getPRC10()
	 * @generated
	 */
	void setPRC10(PRC10CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC11</em>' containment reference.
	 * @see #setPRC11(PRC11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.11' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC11CONTENT getPRC11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC11 <em>PRC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC11</em>' containment reference.
	 * @see #getPRC11()
	 * @generated
	 */
	void setPRC11(PRC11CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC12</em>' containment reference.
	 * @see #setPRC12(PRC12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC12CONTENT getPRC12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC12 <em>PRC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC12</em>' containment reference.
	 * @see #getPRC12()
	 * @generated
	 */
	void setPRC12(PRC12CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC13</em>' containment reference.
	 * @see #setPRC13(PRC13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.13' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC13CONTENT getPRC13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC13 <em>PRC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC13</em>' containment reference.
	 * @see #getPRC13()
	 * @generated
	 */
	void setPRC13(PRC13CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC14</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PRC14CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC14</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC14</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.14' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PRC14CONTENT> getPRC14();

	/**
	 * Returns the value of the '<em><b>PRC15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC15</em>' containment reference.
	 * @see #setPRC15(PRC15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.15' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC15CONTENT getPRC15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC15 <em>PRC15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC15</em>' containment reference.
	 * @see #getPRC15()
	 * @generated
	 */
	void setPRC15(PRC15CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC16</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC16</em>' containment reference.
	 * @see #setPRC16(PRC16CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.16' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC16CONTENT getPRC16();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC16 <em>PRC16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC16</em>' containment reference.
	 * @see #getPRC16()
	 * @generated
	 */
	void setPRC16(PRC16CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC17</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC17</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC17</em>' containment reference.
	 * @see #setPRC17(PRC17CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.17' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC17CONTENT getPRC17();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC17 <em>PRC17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC17</em>' containment reference.
	 * @see #getPRC17()
	 * @generated
	 */
	void setPRC17(PRC17CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRC18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRC18</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRC18</em>' containment reference.
	 * @see #setPRC18(PRC18CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_PRC18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRC.18' namespace='##targetNamespace'"
	 * @generated
	 */
	PRC18CONTENT getPRC18();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRCCONTENT#getPRC18 <em>PRC18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRC18</em>' containment reference.
	 * @see #getPRC18()
	 * @generated
	 */
	void setPRC18(PRC18CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPRCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':18' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PRCCONTENT
