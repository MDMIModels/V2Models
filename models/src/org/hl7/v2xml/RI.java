/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RI#getRI1 <em>RI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RI#getRI2 <em>RI2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRI()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='RI' kind='elementOnly'"
 * @generated
 */
public interface RI extends EObject {
	/**
	 * Returns the value of the '<em><b>RI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RI1</em>' containment reference.
	 * @see #setRI1(RI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRI_RI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RI1CONTENT getRI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RI#getRI1 <em>RI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RI1</em>' containment reference.
	 * @see #getRI1()
	 * @generated
	 */
	void setRI1(RI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RI2</em>' containment reference.
	 * @see #setRI2(RI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRI_RI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RI2CONTENT getRI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RI#getRI2 <em>RI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RI2</em>' containment reference.
	 * @see #getRI2()
	 * @generated
	 */
	void setRI2(RI2CONTENT value);

} // RI
