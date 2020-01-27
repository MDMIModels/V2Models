/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.TS#getTS1 <em>TS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.TS#getTS2 <em>TS2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getTS()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='TS' kind='elementOnly'"
 * @generated
 */
public interface TS extends EObject {
	/**
	 * Returns the value of the '<em><b>TS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TS1</em>' containment reference.
	 * @see #setTS1(TS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getTS_TS1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	TS1CONTENT getTS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.TS#getTS1 <em>TS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TS1</em>' containment reference.
	 * @see #getTS1()
	 * @generated
	 */
	void setTS1(TS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>TS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TS2</em>' containment reference.
	 * @see #setTS2(TS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getTS_TS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	TS2CONTENT getTS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.TS#getTS2 <em>TS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TS2</em>' containment reference.
	 * @see #getTS2()
	 * @generated
	 */
	void setTS2(TS2CONTENT value);

} // TS
