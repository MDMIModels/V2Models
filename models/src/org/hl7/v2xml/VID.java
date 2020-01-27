/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.VID#getVID1 <em>VID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.VID#getVID2 <em>VID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.VID#getVID3 <em>VID3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getVID()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='VID' kind='elementOnly'"
 * @generated
 */
public interface VID extends EObject {
	/**
	 * Returns the value of the '<em><b>VID1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VID1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VID1</em>' containment reference.
	 * @see #setVID1(VID1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVID_VID1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VID.1' namespace='##targetNamespace'"
	 * @generated
	 */
	VID1CONTENT getVID1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VID#getVID1 <em>VID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VID1</em>' containment reference.
	 * @see #getVID1()
	 * @generated
	 */
	void setVID1(VID1CONTENT value);

	/**
	 * Returns the value of the '<em><b>VID2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VID2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VID2</em>' containment reference.
	 * @see #setVID2(VID2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVID_VID2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VID.2' namespace='##targetNamespace'"
	 * @generated
	 */
	VID2CONTENT getVID2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VID#getVID2 <em>VID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VID2</em>' containment reference.
	 * @see #getVID2()
	 * @generated
	 */
	void setVID2(VID2CONTENT value);

	/**
	 * Returns the value of the '<em><b>VID3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VID3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VID3</em>' containment reference.
	 * @see #setVID3(VID3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVID_VID3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VID.3' namespace='##targetNamespace'"
	 * @generated
	 */
	VID3CONTENT getVID3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VID#getVID3 <em>VID3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VID3</em>' containment reference.
	 * @see #getVID3()
	 * @generated
	 */
	void setVID3(VID3CONTENT value);

} // VID
