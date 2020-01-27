/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RF1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF11 <em>RF11</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF12 <em>RF12</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF13 <em>RF13</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF14 <em>RF14</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF15 <em>RF15</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF16 <em>RF16</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF17 <em>RF17</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF18 <em>RF18</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF19 <em>RF19</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF110 <em>RF110</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getRF111 <em>RF111</em>}</li>
 *   <li>{@link org.hl7.v2xml.RF1CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT()
 * @model extendedMetaData="name='RF1.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RF1CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>RF11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF11</em>' containment reference.
	 * @see #setRF11(RF11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RF11CONTENT getRF11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF11 <em>RF11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF11</em>' containment reference.
	 * @see #getRF11()
	 * @generated
	 */
	void setRF11(RF11CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF12</em>' containment reference.
	 * @see #setRF12(RF12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RF12CONTENT getRF12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF12 <em>RF12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF12</em>' containment reference.
	 * @see #getRF12()
	 * @generated
	 */
	void setRF12(RF12CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF13</em>' containment reference.
	 * @see #setRF13(RF13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.3' namespace='##targetNamespace'"
	 * @generated
	 */
	RF13CONTENT getRF13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF13 <em>RF13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF13</em>' containment reference.
	 * @see #getRF13()
	 * @generated
	 */
	void setRF13(RF13CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF14</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RF14CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF14</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF14</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RF14CONTENT> getRF14();

	/**
	 * Returns the value of the '<em><b>RF15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF15</em>' containment reference.
	 * @see #setRF15(RF15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.5' namespace='##targetNamespace'"
	 * @generated
	 */
	RF15CONTENT getRF15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF15 <em>RF15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF15</em>' containment reference.
	 * @see #getRF15()
	 * @generated
	 */
	void setRF15(RF15CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF16</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF16</em>' containment reference.
	 * @see #setRF16(RF16CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF16()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RF1.6' namespace='##targetNamespace'"
	 * @generated
	 */
	RF16CONTENT getRF16();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF16 <em>RF16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF16</em>' containment reference.
	 * @see #getRF16()
	 * @generated
	 */
	void setRF16(RF16CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF17</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF17</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF17</em>' containment reference.
	 * @see #setRF17(RF17CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.7' namespace='##targetNamespace'"
	 * @generated
	 */
	RF17CONTENT getRF17();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF17 <em>RF17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF17</em>' containment reference.
	 * @see #getRF17()
	 * @generated
	 */
	void setRF17(RF17CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF18</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF18</em>' containment reference.
	 * @see #setRF18(RF18CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.8' namespace='##targetNamespace'"
	 * @generated
	 */
	RF18CONTENT getRF18();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF18 <em>RF18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF18</em>' containment reference.
	 * @see #getRF18()
	 * @generated
	 */
	void setRF18(RF18CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF19</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF19</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF19</em>' containment reference.
	 * @see #setRF19(RF19CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.9' namespace='##targetNamespace'"
	 * @generated
	 */
	RF19CONTENT getRF19();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RF1CONTENT#getRF19 <em>RF19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF19</em>' containment reference.
	 * @see #getRF19()
	 * @generated
	 */
	void setRF19(RF19CONTENT value);

	/**
	 * Returns the value of the '<em><b>RF110</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RF110CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF110</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF110</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF110()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.10' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RF110CONTENT> getRF110();

	/**
	 * Returns the value of the '<em><b>RF111</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RF111CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF111</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF111</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_RF111()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RF1.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RF111CONTENT> getRF111();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getRF1CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // RF1CONTENT
