/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MRGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG1 <em>MRG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG2 <em>MRG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG3 <em>MRG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG4 <em>MRG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG5 <em>MRG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG6 <em>MRG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getMRG7 <em>MRG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.MRGCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT()
 * @model extendedMetaData="name='MRG.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface MRGCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>MRG1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MRG1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='MRG.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MRG1CONTENT> getMRG1();

	/**
	 * Returns the value of the '<em><b>MRG2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MRG2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MRG2CONTENT> getMRG2();

	/**
	 * Returns the value of the '<em><b>MRG3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG3</em>' containment reference.
	 * @see #setMRG3(MRG3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.3' namespace='##targetNamespace'"
	 * @generated
	 */
	MRG3CONTENT getMRG3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MRGCONTENT#getMRG3 <em>MRG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRG3</em>' containment reference.
	 * @see #getMRG3()
	 * @generated
	 */
	void setMRG3(MRG3CONTENT value);

	/**
	 * Returns the value of the '<em><b>MRG4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG4</em>' containment reference.
	 * @see #setMRG4(MRG4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.4' namespace='##targetNamespace'"
	 * @generated
	 */
	MRG4CONTENT getMRG4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MRGCONTENT#getMRG4 <em>MRG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRG4</em>' containment reference.
	 * @see #getMRG4()
	 * @generated
	 */
	void setMRG4(MRG4CONTENT value);

	/**
	 * Returns the value of the '<em><b>MRG5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG5</em>' containment reference.
	 * @see #setMRG5(MRG5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.5' namespace='##targetNamespace'"
	 * @generated
	 */
	MRG5CONTENT getMRG5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MRGCONTENT#getMRG5 <em>MRG5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRG5</em>' containment reference.
	 * @see #getMRG5()
	 * @generated
	 */
	void setMRG5(MRG5CONTENT value);

	/**
	 * Returns the value of the '<em><b>MRG6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG6</em>' containment reference.
	 * @see #setMRG6(MRG6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.6' namespace='##targetNamespace'"
	 * @generated
	 */
	MRG6CONTENT getMRG6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MRGCONTENT#getMRG6 <em>MRG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MRG6</em>' containment reference.
	 * @see #getMRG6()
	 * @generated
	 */
	void setMRG6(MRG6CONTENT value);

	/**
	 * Returns the value of the '<em><b>MRG7</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.MRG7CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MRG7</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MRG7</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_MRG7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MRG.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MRG7CONTENT> getMRG7();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getMRGCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':7' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // MRGCONTENT
