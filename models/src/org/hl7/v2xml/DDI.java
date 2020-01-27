/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DDI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DDI#getDDI1 <em>DDI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DDI#getDDI2 <em>DDI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.DDI#getDDI3 <em>DDI3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDDI()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DDI' kind='elementOnly'"
 * @generated
 */
public interface DDI extends EObject {
	/**
	 * Returns the value of the '<em><b>DDI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDI1</em>' containment reference.
	 * @see #setDDI1(DDI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDDI_DDI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DDI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DDI1CONTENT getDDI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DDI#getDDI1 <em>DDI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDI1</em>' containment reference.
	 * @see #getDDI1()
	 * @generated
	 */
	void setDDI1(DDI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DDI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDI2</em>' containment reference.
	 * @see #setDDI2(DDI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDDI_DDI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DDI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DDI2CONTENT getDDI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DDI#getDDI2 <em>DDI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDI2</em>' containment reference.
	 * @see #getDDI2()
	 * @generated
	 */
	void setDDI2(DDI2CONTENT value);

	/**
	 * Returns the value of the '<em><b>DDI3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DDI3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DDI3</em>' containment reference.
	 * @see #setDDI3(DDI3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDDI_DDI3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DDI.3' namespace='##targetNamespace'"
	 * @generated
	 */
	DDI3CONTENT getDDI3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DDI#getDDI3 <em>DDI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DDI3</em>' containment reference.
	 * @see #getDDI3()
	 * @generated
	 */
	void setDDI3(DDI3CONTENT value);

} // DDI
