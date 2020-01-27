/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.VR#getVR1 <em>VR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.VR#getVR2 <em>VR2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getVR()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='VR' kind='elementOnly'"
 * @generated
 */
public interface VR extends EObject {
	/**
	 * Returns the value of the '<em><b>VR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VR1</em>' containment reference.
	 * @see #setVR1(VR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVR_VR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	VR1CONTENT getVR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VR#getVR1 <em>VR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VR1</em>' containment reference.
	 * @see #getVR1()
	 * @generated
	 */
	void setVR1(VR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>VR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VR2</em>' containment reference.
	 * @see #setVR2(VR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVR_VR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	VR2CONTENT getVR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VR#getVR2 <em>VR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VR2</em>' containment reference.
	 * @see #getVR2()
	 * @generated
	 */
	void setVR2(VR2CONTENT value);

} // VR
