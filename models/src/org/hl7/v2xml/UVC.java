/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UVC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.UVC#getUVC1 <em>UVC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.UVC#getUVC2 <em>UVC2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getUVC()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='UVC' kind='elementOnly'"
 * @generated
 */
public interface UVC extends EObject {
	/**
	 * Returns the value of the '<em><b>UVC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UVC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UVC1</em>' containment reference.
	 * @see #setUVC1(UVC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getUVC_UVC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UVC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	UVC1CONTENT getUVC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.UVC#getUVC1 <em>UVC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UVC1</em>' containment reference.
	 * @see #getUVC1()
	 * @generated
	 */
	void setUVC1(UVC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>UVC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UVC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UVC2</em>' containment reference.
	 * @see #setUVC2(UVC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getUVC_UVC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='UVC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	UVC2CONTENT getUVC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.UVC#getUVC2 <em>UVC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UVC2</em>' containment reference.
	 * @see #getUVC2()
	 * @generated
	 */
	void setUVC2(UVC2CONTENT value);

} // UVC
