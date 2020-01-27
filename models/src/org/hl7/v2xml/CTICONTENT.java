/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CTICONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CTICONTENT#getCTI1 <em>CTI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTICONTENT#getCTI2 <em>CTI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTICONTENT#getCTI3 <em>CTI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.CTICONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCTICONTENT()
 * @model extendedMetaData="name='CTI.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CTICONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CTI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTI1</em>' containment reference.
	 * @see #setCTI1(CTI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCTICONTENT_CTI1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CTI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CTI1CONTENT getCTI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CTICONTENT#getCTI1 <em>CTI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTI1</em>' containment reference.
	 * @see #getCTI1()
	 * @generated
	 */
	void setCTI1(CTI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CTI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTI2</em>' containment reference.
	 * @see #setCTI2(CTI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCTICONTENT_CTI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CTI2CONTENT getCTI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CTICONTENT#getCTI2 <em>CTI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTI2</em>' containment reference.
	 * @see #getCTI2()
	 * @generated
	 */
	void setCTI2(CTI2CONTENT value);

	/**
	 * Returns the value of the '<em><b>CTI3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CTI3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CTI3</em>' containment reference.
	 * @see #setCTI3(CTI3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCTICONTENT_CTI3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CTI.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CTI3CONTENT getCTI3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CTICONTENT#getCTI3 <em>CTI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CTI3</em>' containment reference.
	 * @see #getCTI3()
	 * @generated
	 */
	void setCTI3(CTI3CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCTICONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CTICONTENT
