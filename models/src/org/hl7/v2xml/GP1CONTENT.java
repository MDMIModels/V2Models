/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GP1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getGP11 <em>GP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getGP12 <em>GP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getGP13 <em>GP13</em>}</li>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getGP14 <em>GP14</em>}</li>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getGP15 <em>GP15</em>}</li>
 *   <li>{@link org.hl7.v2xml.GP1CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT()
 * @model extendedMetaData="name='GP1.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface GP1CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>GP11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP11</em>' containment reference.
	 * @see #setGP11(GP11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_GP11()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GP1.1' namespace='##targetNamespace'"
	 * @generated
	 */
	GP11CONTENT getGP11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.GP1CONTENT#getGP11 <em>GP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GP11</em>' containment reference.
	 * @see #getGP11()
	 * @generated
	 */
	void setGP11(GP11CONTENT value);

	/**
	 * Returns the value of the '<em><b>GP12</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GP12CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP12</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP12</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_GP12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP1.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GP12CONTENT> getGP12();

	/**
	 * Returns the value of the '<em><b>GP13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP13</em>' containment reference.
	 * @see #setGP13(GP13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_GP13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP1.3' namespace='##targetNamespace'"
	 * @generated
	 */
	GP13CONTENT getGP13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.GP1CONTENT#getGP13 <em>GP13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GP13</em>' containment reference.
	 * @see #getGP13()
	 * @generated
	 */
	void setGP13(GP13CONTENT value);

	/**
	 * Returns the value of the '<em><b>GP14</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.GP14CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP14</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP14</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_GP14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP1.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GP14CONTENT> getGP14();

	/**
	 * Returns the value of the '<em><b>GP15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GP15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GP15</em>' containment reference.
	 * @see #setGP15(GP15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_GP15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GP1.5' namespace='##targetNamespace'"
	 * @generated
	 */
	GP15CONTENT getGP15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.GP1CONTENT#getGP15 <em>GP15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GP15</em>' containment reference.
	 * @see #getGP15()
	 * @generated
	 */
	void setGP15(GP15CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getGP1CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // GP1CONTENT
