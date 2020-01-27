/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DLD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DLD#getDLD1 <em>DLD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DLD#getDLD2 <em>DLD2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDLD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DLD' kind='elementOnly'"
 * @generated
 */
public interface DLD extends EObject {
	/**
	 * Returns the value of the '<em><b>DLD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLD1</em>' containment reference.
	 * @see #setDLD1(DLD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDLD_DLD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DLD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DLD1CONTENT getDLD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DLD#getDLD1 <em>DLD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLD1</em>' containment reference.
	 * @see #getDLD1()
	 * @generated
	 */
	void setDLD1(DLD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DLD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DLD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DLD2</em>' containment reference.
	 * @see #setDLD2(DLD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDLD_DLD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DLD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DLD2CONTENT getDLD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DLD#getDLD2 <em>DLD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DLD2</em>' containment reference.
	 * @see #getDLD2()
	 * @generated
	 */
	void setDLD2(DLD2CONTENT value);

} // DLD
