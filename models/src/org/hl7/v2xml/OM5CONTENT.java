/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OM5CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OM5CONTENT#getOM51 <em>OM51</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM5CONTENT#getOM52 <em>OM52</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM5CONTENT#getOM53 <em>OM53</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM5CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOM5CONTENT()
 * @model extendedMetaData="name='OM5.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface OM5CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>OM51</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM51</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM51</em>' containment reference.
	 * @see #setOM51(OM51CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM5CONTENT_OM51()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM5.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OM51CONTENT getOM51();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM5CONTENT#getOM51 <em>OM51</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM51</em>' containment reference.
	 * @see #getOM51()
	 * @generated
	 */
	void setOM51(OM51CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM52</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM52CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM52</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM52</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM5CONTENT_OM52()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM5.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM52CONTENT> getOM52();

	/**
	 * Returns the value of the '<em><b>OM53</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM53</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM53</em>' containment reference.
	 * @see #setOM53(OM53CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM5CONTENT_OM53()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM5.3' namespace='##targetNamespace'"
	 * @generated
	 */
	OM53CONTENT getOM53();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM5CONTENT#getOM53 <em>OM53</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM53</em>' containment reference.
	 * @see #getOM53()
	 * @generated
	 */
	void setOM53(OM53CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getOM5CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // OM5CONTENT
