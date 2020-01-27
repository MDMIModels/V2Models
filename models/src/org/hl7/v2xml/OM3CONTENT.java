/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OM3CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM31 <em>OM31</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM32 <em>OM32</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM33 <em>OM33</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM34 <em>OM34</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM35 <em>OM35</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM36 <em>OM36</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getOM37 <em>OM37</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM3CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT()
 * @model extendedMetaData="name='OM3.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface OM3CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>OM31</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM31</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM31</em>' containment reference.
	 * @see #setOM31(OM31CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM31()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OM31CONTENT getOM31();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM3CONTENT#getOM31 <em>OM31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM31</em>' containment reference.
	 * @see #getOM31()
	 * @generated
	 */
	void setOM31(OM31CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM32</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM32</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM32</em>' containment reference.
	 * @see #setOM32(OM32CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM32()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.2' namespace='##targetNamespace'"
	 * @generated
	 */
	OM32CONTENT getOM32();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM3CONTENT#getOM32 <em>OM32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM32</em>' containment reference.
	 * @see #getOM32()
	 * @generated
	 */
	void setOM32(OM32CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM33</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM33</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM33</em>' containment reference.
	 * @see #setOM33(OM33CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM33()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.3' namespace='##targetNamespace'"
	 * @generated
	 */
	OM33CONTENT getOM33();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM3CONTENT#getOM33 <em>OM33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM33</em>' containment reference.
	 * @see #getOM33()
	 * @generated
	 */
	void setOM33(OM33CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM34</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM34CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM34</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM34</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM34()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM34CONTENT> getOM34();

	/**
	 * Returns the value of the '<em><b>OM35</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM35CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM35</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM35</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM35()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM35CONTENT> getOM35();

	/**
	 * Returns the value of the '<em><b>OM36</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM36CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM36</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM36</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM36()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM36CONTENT> getOM36();

	/**
	 * Returns the value of the '<em><b>OM37</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM37</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM37</em>' containment reference.
	 * @see #setOM37(OM37CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_OM37()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM3.7' namespace='##targetNamespace'"
	 * @generated
	 */
	OM37CONTENT getOM37();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM3CONTENT#getOM37 <em>OM37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM37</em>' containment reference.
	 * @see #getOM37()
	 * @generated
	 */
	void setOM37(OM37CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getOM3CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // OM3CONTENT
