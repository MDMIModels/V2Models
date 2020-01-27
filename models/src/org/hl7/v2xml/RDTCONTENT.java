/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RDTCONTENT#getRDT1 <em>RDT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RDTCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRDTCONTENT()
 * @model extendedMetaData="name='RDT.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RDTCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>RDT1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDT1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDT1</em>' containment reference.
	 * @see #setRDT1(RDT1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRDTCONTENT_RDT1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RDT.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RDT1CONTENT getRDT1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RDTCONTENT#getRDT1 <em>RDT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDT1</em>' containment reference.
	 * @see #getRDT1()
	 * @generated
	 */
	void setRDT1(RDT1CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getRDTCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':1' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // RDTCONTENT
