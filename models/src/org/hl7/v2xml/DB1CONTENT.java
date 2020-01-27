/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB11 <em>DB11</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB12 <em>DB12</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB13 <em>DB13</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB14 <em>DB14</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB15 <em>DB15</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB16 <em>DB16</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB17 <em>DB17</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getDB18 <em>DB18</em>}</li>
 *   <li>{@link org.hl7.v2xml.DB1CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT()
 * @model extendedMetaData="name='DB1.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface DB1CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>DB11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB11</em>' containment reference.
	 * @see #setDB11(DB11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB11()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DB1.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DB11CONTENT getDB11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB11 <em>DB11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB11</em>' containment reference.
	 * @see #getDB11()
	 * @generated
	 */
	void setDB11(DB11CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB12</em>' containment reference.
	 * @see #setDB12(DB12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DB12CONTENT getDB12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB12 <em>DB12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB12</em>' containment reference.
	 * @see #getDB12()
	 * @generated
	 */
	void setDB12(DB12CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB13</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.DB13CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB13</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB13</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DB13CONTENT> getDB13();

	/**
	 * Returns the value of the '<em><b>DB14</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB14</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB14</em>' containment reference.
	 * @see #setDB14(DB14CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.4' namespace='##targetNamespace'"
	 * @generated
	 */
	DB14CONTENT getDB14();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB14 <em>DB14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB14</em>' containment reference.
	 * @see #getDB14()
	 * @generated
	 */
	void setDB14(DB14CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB15</em>' containment reference.
	 * @see #setDB15(DB15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.5' namespace='##targetNamespace'"
	 * @generated
	 */
	DB15CONTENT getDB15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB15 <em>DB15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB15</em>' containment reference.
	 * @see #getDB15()
	 * @generated
	 */
	void setDB15(DB15CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB16</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB16</em>' containment reference.
	 * @see #setDB16(DB16CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.6' namespace='##targetNamespace'"
	 * @generated
	 */
	DB16CONTENT getDB16();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB16 <em>DB16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB16</em>' containment reference.
	 * @see #getDB16()
	 * @generated
	 */
	void setDB16(DB16CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB17</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB17</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB17</em>' containment reference.
	 * @see #setDB17(DB17CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.7' namespace='##targetNamespace'"
	 * @generated
	 */
	DB17CONTENT getDB17();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB17 <em>DB17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB17</em>' containment reference.
	 * @see #getDB17()
	 * @generated
	 */
	void setDB17(DB17CONTENT value);

	/**
	 * Returns the value of the '<em><b>DB18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DB18</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DB18</em>' containment reference.
	 * @see #setDB18(DB18CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_DB18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DB1.8' namespace='##targetNamespace'"
	 * @generated
	 */
	DB18CONTENT getDB18();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DB1CONTENT#getDB18 <em>DB18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DB18</em>' containment reference.
	 * @see #getDB18()
	 * @generated
	 */
	void setDB18(DB18CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getDB1CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // DB1CONTENT
