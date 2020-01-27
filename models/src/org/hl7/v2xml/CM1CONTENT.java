/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CM1CONTENT#getCM11 <em>CM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM1CONTENT#getCM12 <em>CM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM1CONTENT#getCM13 <em>CM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM1CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCM1CONTENT()
 * @model extendedMetaData="name='CM1.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CM1CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CM11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM11</em>' containment reference.
	 * @see #setCM11(CM11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM1CONTENT_CM11()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM1.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CM11CONTENT getCM11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM1CONTENT#getCM11 <em>CM11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM11</em>' containment reference.
	 * @see #getCM11()
	 * @generated
	 */
	void setCM11(CM11CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM12</em>' containment reference.
	 * @see #setCM12(CM12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM1CONTENT_CM12()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM1.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CM12CONTENT getCM12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM1CONTENT#getCM12 <em>CM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM12</em>' containment reference.
	 * @see #getCM12()
	 * @generated
	 */
	void setCM12(CM12CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM13</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM13</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM13</em>' containment reference.
	 * @see #setCM13(CM13CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM1CONTENT_CM13()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM1.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CM13CONTENT getCM13();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM1CONTENT#getCM13 <em>CM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM13</em>' containment reference.
	 * @see #getCM13()
	 * @generated
	 */
	void setCM13(CM13CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCM1CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CM1CONTENT
