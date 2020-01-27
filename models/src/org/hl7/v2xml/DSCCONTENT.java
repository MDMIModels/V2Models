/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DSCCONTENT#getDSC1 <em>DSC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DSCCONTENT#getDSC2 <em>DSC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.DSCCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDSCCONTENT()
 * @model extendedMetaData="name='DSC.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface DSCCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>DSC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSC1</em>' containment reference.
	 * @see #setDSC1(DSC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDSCCONTENT_DSC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DSC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DSC1CONTENT getDSC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DSCCONTENT#getDSC1 <em>DSC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSC1</em>' containment reference.
	 * @see #getDSC1()
	 * @generated
	 */
	void setDSC1(DSC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DSC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DSC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DSC2</em>' containment reference.
	 * @see #setDSC2(DSC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDSCCONTENT_DSC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DSC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DSC2CONTENT getDSC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DSCCONTENT#getDSC2 <em>DSC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSC2</em>' containment reference.
	 * @see #getDSC2()
	 * @generated
	 */
	void setDSC2(DSC2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getDSCCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // DSCCONTENT
