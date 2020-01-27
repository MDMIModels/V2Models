/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LCCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.LCCCONTENT#getLCC1 <em>LCC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.LCCCONTENT#getLCC2 <em>LCC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.LCCCONTENT#getLCC3 <em>LCC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.LCCCONTENT#getLCC4 <em>LCC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.LCCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT()
 * @model extendedMetaData="name='LCC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface LCCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>LCC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCC1</em>' containment reference.
	 * @see #setLCC1(LCC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT_LCC1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LCC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	LCC1CONTENT getLCC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LCCCONTENT#getLCC1 <em>LCC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCC1</em>' containment reference.
	 * @see #getLCC1()
	 * @generated
	 */
	void setLCC1(LCC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>LCC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCC2</em>' containment reference.
	 * @see #setLCC2(LCC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT_LCC2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LCC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	LCC2CONTENT getLCC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.LCCCONTENT#getLCC2 <em>LCC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LCC2</em>' containment reference.
	 * @see #getLCC2()
	 * @generated
	 */
	void setLCC2(LCC2CONTENT value);

	/**
	 * Returns the value of the '<em><b>LCC3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LCC3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCC3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCC3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT_LCC3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LCC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LCC3CONTENT> getLCC3();

	/**
	 * Returns the value of the '<em><b>LCC4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.LCC4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LCC4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LCC4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT_LCC4()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LCC.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LCC4CONTENT> getLCC4();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getLCCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // LCCCONTENT
