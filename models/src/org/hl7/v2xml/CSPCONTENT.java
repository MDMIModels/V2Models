/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CSPCONTENT#getCSP1 <em>CSP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSPCONTENT#getCSP2 <em>CSP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSPCONTENT#getCSP3 <em>CSP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSPCONTENT#getCSP4 <em>CSP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.CSPCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT()
 * @model extendedMetaData="name='CSP.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CSPCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CSP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSP1</em>' containment reference.
	 * @see #setCSP1(CSP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT_CSP1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CSP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CSP1CONTENT getCSP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSPCONTENT#getCSP1 <em>CSP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSP1</em>' containment reference.
	 * @see #getCSP1()
	 * @generated
	 */
	void setCSP1(CSP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CSP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSP2</em>' containment reference.
	 * @see #setCSP2(CSP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT_CSP2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CSP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CSP2CONTENT getCSP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSPCONTENT#getCSP2 <em>CSP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSP2</em>' containment reference.
	 * @see #getCSP2()
	 * @generated
	 */
	void setCSP2(CSP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>CSP3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSP3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSP3</em>' containment reference.
	 * @see #setCSP3(CSP3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT_CSP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CSP3CONTENT getCSP3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSPCONTENT#getCSP3 <em>CSP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSP3</em>' containment reference.
	 * @see #getCSP3()
	 * @generated
	 */
	void setCSP3(CSP3CONTENT value);

	/**
	 * Returns the value of the '<em><b>CSP4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CSP4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CSP4</em>' containment reference.
	 * @see #setCSP4(CSP4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT_CSP4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CSP.4' namespace='##targetNamespace'"
	 * @generated
	 */
	CSP4CONTENT getCSP4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CSPCONTENT#getCSP4 <em>CSP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CSP4</em>' containment reference.
	 * @see #getCSP4()
	 * @generated
	 */
	void setCSP4(CSP4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCSPCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CSPCONTENT
