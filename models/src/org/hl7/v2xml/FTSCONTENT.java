/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FTSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.FTSCONTENT#getFTS1 <em>FTS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.FTSCONTENT#getFTS2 <em>FTS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.FTSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getFTSCONTENT()
 * @model extendedMetaData="name='FTS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface FTSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>FTS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FTS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTS1</em>' containment reference.
	 * @see #setFTS1(FTS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFTSCONTENT_FTS1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FTS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	FTS1CONTENT getFTS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FTSCONTENT#getFTS1 <em>FTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTS1</em>' containment reference.
	 * @see #getFTS1()
	 * @generated
	 */
	void setFTS1(FTS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>FTS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FTS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTS2</em>' containment reference.
	 * @see #setFTS2(FTS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFTSCONTENT_FTS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FTS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	FTS2CONTENT getFTS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FTSCONTENT#getFTS2 <em>FTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTS2</em>' containment reference.
	 * @see #getFTS2()
	 * @generated
	 */
	void setFTS2(FTS2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getFTSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // FTSCONTENT
