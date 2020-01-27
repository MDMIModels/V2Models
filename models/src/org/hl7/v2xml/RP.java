/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RP#getRP1 <em>RP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RP#getRP2 <em>RP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.RP#getRP3 <em>RP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.RP#getRP4 <em>RP4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='RP' kind='elementOnly'"
 * @generated
 */
public interface RP extends EObject {
	/**
	 * Returns the value of the '<em><b>RP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RP1</em>' containment reference.
	 * @see #setRP1(RP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRP_RP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RP1CONTENT getRP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RP#getRP1 <em>RP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RP1</em>' containment reference.
	 * @see #getRP1()
	 * @generated
	 */
	void setRP1(RP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RP2</em>' containment reference.
	 * @see #setRP2(RP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRP_RP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RP2CONTENT getRP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RP#getRP2 <em>RP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RP2</em>' containment reference.
	 * @see #getRP2()
	 * @generated
	 */
	void setRP2(RP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>RP3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RP3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RP3</em>' containment reference.
	 * @see #setRP3(RP3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRP_RP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	RP3CONTENT getRP3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RP#getRP3 <em>RP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RP3</em>' containment reference.
	 * @see #getRP3()
	 * @generated
	 */
	void setRP3(RP3CONTENT value);

	/**
	 * Returns the value of the '<em><b>RP4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RP4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RP4</em>' containment reference.
	 * @see #setRP4(RP4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRP_RP4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RP.4' namespace='##targetNamespace'"
	 * @generated
	 */
	RP4CONTENT getRP4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RP#getRP4 <em>RP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RP4</em>' containment reference.
	 * @see #getRP4()
	 * @generated
	 */
	void setRP4(RP4CONTENT value);

} // RP
