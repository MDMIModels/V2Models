/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SIDCONTENT#getSID1 <em>SID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SIDCONTENT#getSID2 <em>SID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.SIDCONTENT#getSID3 <em>SID3</em>}</li>
 *   <li>{@link org.hl7.v2xml.SIDCONTENT#getSID4 <em>SID4</em>}</li>
 *   <li>{@link org.hl7.v2xml.SIDCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT()
 * @model extendedMetaData="name='SID.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface SIDCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>SID1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SID1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SID1</em>' containment reference.
	 * @see #setSID1(SID1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT_SID1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SID.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SID1CONTENT getSID1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SIDCONTENT#getSID1 <em>SID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SID1</em>' containment reference.
	 * @see #getSID1()
	 * @generated
	 */
	void setSID1(SID1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SID2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SID2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SID2</em>' containment reference.
	 * @see #setSID2(SID2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT_SID2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SID.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SID2CONTENT getSID2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SIDCONTENT#getSID2 <em>SID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SID2</em>' containment reference.
	 * @see #getSID2()
	 * @generated
	 */
	void setSID2(SID2CONTENT value);

	/**
	 * Returns the value of the '<em><b>SID3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SID3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SID3</em>' containment reference.
	 * @see #setSID3(SID3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT_SID3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SID.3' namespace='##targetNamespace'"
	 * @generated
	 */
	SID3CONTENT getSID3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SIDCONTENT#getSID3 <em>SID3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SID3</em>' containment reference.
	 * @see #getSID3()
	 * @generated
	 */
	void setSID3(SID3CONTENT value);

	/**
	 * Returns the value of the '<em><b>SID4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SID4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SID4</em>' containment reference.
	 * @see #setSID4(SID4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT_SID4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SID.4' namespace='##targetNamespace'"
	 * @generated
	 */
	SID4CONTENT getSID4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SIDCONTENT#getSID4 <em>SID4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SID4</em>' containment reference.
	 * @see #getSID4()
	 * @generated
	 */
	void setSID4(SID4CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getSIDCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // SIDCONTENT
