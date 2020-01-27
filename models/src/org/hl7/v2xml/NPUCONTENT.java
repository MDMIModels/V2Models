/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NPUCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.NPUCONTENT#getNPU1 <em>NPU1</em>}</li>
 *   <li>{@link org.hl7.v2xml.NPUCONTENT#getNPU2 <em>NPU2</em>}</li>
 *   <li>{@link org.hl7.v2xml.NPUCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getNPUCONTENT()
 * @model extendedMetaData="name='NPU.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface NPUCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>NPU1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NPU1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NPU1</em>' containment reference.
	 * @see #setNPU1(NPU1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNPUCONTENT_NPU1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NPU.1' namespace='##targetNamespace'"
	 * @generated
	 */
	NPU1CONTENT getNPU1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NPUCONTENT#getNPU1 <em>NPU1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NPU1</em>' containment reference.
	 * @see #getNPU1()
	 * @generated
	 */
	void setNPU1(NPU1CONTENT value);

	/**
	 * Returns the value of the '<em><b>NPU2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NPU2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NPU2</em>' containment reference.
	 * @see #setNPU2(NPU2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getNPUCONTENT_NPU2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NPU.2' namespace='##targetNamespace'"
	 * @generated
	 */
	NPU2CONTENT getNPU2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.NPUCONTENT#getNPU2 <em>NPU2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NPU2</em>' containment reference.
	 * @see #getNPU2()
	 * @generated
	 */
	void setNPU2(NPU2CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getNPUCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // NPUCONTENT
