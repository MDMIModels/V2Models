/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RDFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RDFCONTENT#getRDF1 <em>RDF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RDFCONTENT#getRDF2 <em>RDF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.RDFCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRDFCONTENT()
 * @model extendedMetaData="name='RDF.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RDFCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>RDF1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF1</em>' containment reference.
	 * @see #setRDF1(RDF1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRDFCONTENT_RDF1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RDF.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RDF1CONTENT getRDF1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RDFCONTENT#getRDF1 <em>RDF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDF1</em>' containment reference.
	 * @see #getRDF1()
	 * @generated
	 */
	void setRDF1(RDF1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RDF2</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.RDF2CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDF2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDF2</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getRDFCONTENT_RDF2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RDF.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RDF2CONTENT> getRDF2();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getRDFCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // RDFCONTENT
