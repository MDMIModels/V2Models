/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EQLCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.EQLCONTENT#getEQL1 <em>EQL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.EQLCONTENT#getEQL2 <em>EQL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.EQLCONTENT#getEQL3 <em>EQL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.EQLCONTENT#getEQL4 <em>EQL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.EQLCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT()
 * @model extendedMetaData="name='EQL.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface EQLCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>EQL1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQL1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQL1</em>' containment reference.
	 * @see #setEQL1(EQL1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT_EQL1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EQL.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EQL1CONTENT getEQL1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EQLCONTENT#getEQL1 <em>EQL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EQL1</em>' containment reference.
	 * @see #getEQL1()
	 * @generated
	 */
	void setEQL1(EQL1CONTENT value);

	/**
	 * Returns the value of the '<em><b>EQL2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQL2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQL2</em>' containment reference.
	 * @see #setEQL2(EQL2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT_EQL2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EQL.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EQL2CONTENT getEQL2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EQLCONTENT#getEQL2 <em>EQL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EQL2</em>' containment reference.
	 * @see #getEQL2()
	 * @generated
	 */
	void setEQL2(EQL2CONTENT value);

	/**
	 * Returns the value of the '<em><b>EQL3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQL3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQL3</em>' containment reference.
	 * @see #setEQL3(EQL3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT_EQL3()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EQL.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EQL3CONTENT getEQL3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EQLCONTENT#getEQL3 <em>EQL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EQL3</em>' containment reference.
	 * @see #getEQL3()
	 * @generated
	 */
	void setEQL3(EQL3CONTENT value);

	/**
	 * Returns the value of the '<em><b>EQL4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EQL4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EQL4</em>' containment reference.
	 * @see #setEQL4(EQL4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT_EQL4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EQL.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EQL4CONTENT getEQL4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EQLCONTENT#getEQL4 <em>EQL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EQL4</em>' containment reference.
	 * @see #getEQL4()
	 * @generated
	 */
	void setEQL4(EQL4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getEQLCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // EQLCONTENT
