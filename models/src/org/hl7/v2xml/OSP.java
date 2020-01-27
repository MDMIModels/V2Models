/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OSP#getOSP1 <em>OSP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.OSP#getOSP2 <em>OSP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.OSP#getOSP3 <em>OSP3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOSP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='OSP' kind='elementOnly'"
 * @generated
 */
public interface OSP extends EObject {
	/**
	 * Returns the value of the '<em><b>OSP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OSP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OSP1</em>' containment reference.
	 * @see #setOSP1(OSP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOSP_OSP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OSP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OSP1CONTENT getOSP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OSP#getOSP1 <em>OSP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OSP1</em>' containment reference.
	 * @see #getOSP1()
	 * @generated
	 */
	void setOSP1(OSP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>OSP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OSP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OSP2</em>' containment reference.
	 * @see #setOSP2(OSP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOSP_OSP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OSP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	OSP2CONTENT getOSP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OSP#getOSP2 <em>OSP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OSP2</em>' containment reference.
	 * @see #getOSP2()
	 * @generated
	 */
	void setOSP2(OSP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>OSP3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OSP3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OSP3</em>' containment reference.
	 * @see #setOSP3(OSP3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOSP_OSP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OSP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	OSP3CONTENT getOSP3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OSP#getOSP3 <em>OSP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OSP3</em>' containment reference.
	 * @see #getOSP3()
	 * @generated
	 */
	void setOSP3(OSP3CONTENT value);

} // OSP
