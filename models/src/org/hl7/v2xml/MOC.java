/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MOC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MOC#getMOC1 <em>MOC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MOC#getMOC2 <em>MOC2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMOC()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='MOC' kind='elementOnly'"
 * @generated
 */
public interface MOC extends EObject {
	/**
	 * Returns the value of the '<em><b>MOC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOC1</em>' containment reference.
	 * @see #setMOC1(MOC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMOC_MOC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MOC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	MOC1CONTENT getMOC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MOC#getMOC1 <em>MOC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOC1</em>' containment reference.
	 * @see #getMOC1()
	 * @generated
	 */
	void setMOC1(MOC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>MOC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MOC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MOC2</em>' containment reference.
	 * @see #setMOC2(MOC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMOC_MOC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MOC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	MOC2CONTENT getMOC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MOC#getMOC2 <em>MOC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MOC2</em>' containment reference.
	 * @see #getMOC2()
	 * @generated
	 */
	void setMOC2(MOC2CONTENT value);

} // MOC
