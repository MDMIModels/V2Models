/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SCV</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SCV#getSCV1 <em>SCV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SCV#getSCV2 <em>SCV2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSCV()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='SCV' kind='elementOnly'"
 * @generated
 */
public interface SCV extends EObject {
	/**
	 * Returns the value of the '<em><b>SCV1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCV1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCV1</em>' containment reference.
	 * @see #setSCV1(SCV1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSCV_SCV1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SCV.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SCV1CONTENT getSCV1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SCV#getSCV1 <em>SCV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCV1</em>' containment reference.
	 * @see #getSCV1()
	 * @generated
	 */
	void setSCV1(SCV1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SCV2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SCV2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SCV2</em>' containment reference.
	 * @see #setSCV2(SCV2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSCV_SCV2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SCV.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SCV2CONTENT getSCV2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SCV#getSCV2 <em>SCV2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SCV2</em>' containment reference.
	 * @see #getSCV2()
	 * @generated
	 */
	void setSCV2(SCV2CONTENT value);

} // SCV
