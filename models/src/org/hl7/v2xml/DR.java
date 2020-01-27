/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.DR#getDR1 <em>DR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.DR#getDR2 <em>DR2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getDR()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='DR' kind='elementOnly'"
 * @generated
 */
public interface DR extends EObject {
	/**
	 * Returns the value of the '<em><b>DR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DR1</em>' containment reference.
	 * @see #setDR1(DR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDR_DR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	DR1CONTENT getDR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DR#getDR1 <em>DR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DR1</em>' containment reference.
	 * @see #getDR1()
	 * @generated
	 */
	void setDR1(DR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>DR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DR2</em>' containment reference.
	 * @see #setDR2(DR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getDR_DR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	DR2CONTENT getDR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.DR#getDR2 <em>DR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DR2</em>' containment reference.
	 * @see #getDR2()
	 * @generated
	 */
	void setDR2(DR2CONTENT value);

} // DR
