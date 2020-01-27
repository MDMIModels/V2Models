/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getECD1 <em>ECD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getECD2 <em>ECD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getECD3 <em>ECD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getECD4 <em>ECD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getECD5 <em>ECD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.ECDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT()
 * @model extendedMetaData="name='ECD.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface ECDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>ECD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD1</em>' containment reference.
	 * @see #setECD1(ECD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_ECD1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ECD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ECD1CONTENT getECD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECDCONTENT#getECD1 <em>ECD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECD1</em>' containment reference.
	 * @see #getECD1()
	 * @generated
	 */
	void setECD1(ECD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD2</em>' containment reference.
	 * @see #setECD2(ECD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_ECD2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ECD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ECD2CONTENT getECD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECDCONTENT#getECD2 <em>ECD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECD2</em>' containment reference.
	 * @see #getECD2()
	 * @generated
	 */
	void setECD2(ECD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD3</em>' containment reference.
	 * @see #setECD3(ECD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_ECD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ECD3CONTENT getECD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECDCONTENT#getECD3 <em>ECD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECD3</em>' containment reference.
	 * @see #getECD3()
	 * @generated
	 */
	void setECD3(ECD3CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECD4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD4</em>' containment reference.
	 * @see #setECD4(ECD4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_ECD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	ECD4CONTENT getECD4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ECDCONTENT#getECD4 <em>ECD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ECD4</em>' containment reference.
	 * @see #getECD4()
	 * @generated
	 */
	void setECD4(ECD4CONTENT value);

	/**
	 * Returns the value of the '<em><b>ECD5</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.ECD5CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ECD5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ECD5</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_ECD5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ECD.5' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ECD5CONTENT> getECD5();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getECDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // ECDCONTENT
