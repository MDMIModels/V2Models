/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM0CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM01 <em>CM01</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM02 <em>CM02</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM03 <em>CM03</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM04 <em>CM04</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM05 <em>CM05</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM06 <em>CM06</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM07 <em>CM07</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM08 <em>CM08</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM09 <em>CM09</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM010 <em>CM010</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getCM011 <em>CM011</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM0CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT()
 * @model extendedMetaData="name='CM0.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CM0CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CM01</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM01</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM01</em>' containment reference.
	 * @see #setCM01(CM01CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM01()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CM01CONTENT getCM01();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM01 <em>CM01</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM01</em>' containment reference.
	 * @see #getCM01()
	 * @generated
	 */
	void setCM01(CM01CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM02</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM02</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM02</em>' containment reference.
	 * @see #setCM02(CM02CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM02()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM0.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CM02CONTENT getCM02();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM02 <em>CM02</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM02</em>' containment reference.
	 * @see #getCM02()
	 * @generated
	 */
	void setCM02(CM02CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM03</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM03CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM03</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM03</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM03()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM03CONTENT> getCM03();

	/**
	 * Returns the value of the '<em><b>CM04</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM04</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM04</em>' containment reference.
	 * @see #setCM04(CM04CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM04()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM0.4' namespace='##targetNamespace'"
	 * @generated
	 */
	CM04CONTENT getCM04();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM04 <em>CM04</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM04</em>' containment reference.
	 * @see #getCM04()
	 * @generated
	 */
	void setCM04(CM04CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM05</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM05CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM05</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM05</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM05()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM05CONTENT> getCM05();

	/**
	 * Returns the value of the '<em><b>CM06</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM06</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM06</em>' containment reference.
	 * @see #setCM06(CM06CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM06()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.6' namespace='##targetNamespace'"
	 * @generated
	 */
	CM06CONTENT getCM06();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM06 <em>CM06</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM06</em>' containment reference.
	 * @see #getCM06()
	 * @generated
	 */
	void setCM06(CM06CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM07</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM07</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM07</em>' containment reference.
	 * @see #setCM07(CM07CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM07()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.7' namespace='##targetNamespace'"
	 * @generated
	 */
	CM07CONTENT getCM07();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM07 <em>CM07</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM07</em>' containment reference.
	 * @see #getCM07()
	 * @generated
	 */
	void setCM07(CM07CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM08</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM08</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM08</em>' containment reference.
	 * @see #setCM08(CM08CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM08()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.8' namespace='##targetNamespace'"
	 * @generated
	 */
	CM08CONTENT getCM08();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM08 <em>CM08</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM08</em>' containment reference.
	 * @see #getCM08()
	 * @generated
	 */
	void setCM08(CM08CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM09</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM09CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM09</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM09</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM09()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM09CONTENT> getCM09();

	/**
	 * Returns the value of the '<em><b>CM010</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM010</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM010</em>' containment reference.
	 * @see #setCM010(CM010CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM010()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.10' namespace='##targetNamespace'"
	 * @generated
	 */
	CM010CONTENT getCM010();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM0CONTENT#getCM010 <em>CM010</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM010</em>' containment reference.
	 * @see #getCM010()
	 * @generated
	 */
	void setCM010(CM010CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM011</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM011CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM011</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM011</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_CM011()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM0.11' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM011CONTENT> getCM011();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCM0CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':11' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CM0CONTENT
