/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.MO#getMO1 <em>MO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.MO#getMO2 <em>MO2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getMO()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='MO' kind='elementOnly'"
 * @generated
 */
public interface MO extends EObject {
	/**
	 * Returns the value of the '<em><b>MO1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MO1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MO1</em>' containment reference.
	 * @see #setMO1(MO1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMO_MO1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MO.1' namespace='##targetNamespace'"
	 * @generated
	 */
	MO1CONTENT getMO1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MO#getMO1 <em>MO1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MO1</em>' containment reference.
	 * @see #getMO1()
	 * @generated
	 */
	void setMO1(MO1CONTENT value);

	/**
	 * Returns the value of the '<em><b>MO2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MO2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MO2</em>' containment reference.
	 * @see #setMO2(MO2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getMO_MO2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MO.2' namespace='##targetNamespace'"
	 * @generated
	 */
	MO2CONTENT getMO2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.MO#getMO2 <em>MO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MO2</em>' containment reference.
	 * @see #getMO2()
	 * @generated
	 */
	void setMO2(MO2CONTENT value);

} // MO
