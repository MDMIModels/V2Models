/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SRT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SRT#getSRT1 <em>SRT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SRT#getSRT2 <em>SRT2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSRT()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='SRT' kind='elementOnly'"
 * @generated
 */
public interface SRT extends EObject {
	/**
	 * Returns the value of the '<em><b>SRT1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRT1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRT1</em>' containment reference.
	 * @see #setSRT1(SRT1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSRT_SRT1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SRT.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SRT1CONTENT getSRT1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SRT#getSRT1 <em>SRT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRT1</em>' containment reference.
	 * @see #getSRT1()
	 * @generated
	 */
	void setSRT1(SRT1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SRT2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SRT2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SRT2</em>' containment reference.
	 * @see #setSRT2(SRT2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSRT_SRT2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SRT.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SRT2CONTENT getSRT2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SRT#getSRT2 <em>SRT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SRT2</em>' containment reference.
	 * @see #getSRT2()
	 * @generated
	 */
	void setSRT2(SRT2CONTENT value);

} // SRT
