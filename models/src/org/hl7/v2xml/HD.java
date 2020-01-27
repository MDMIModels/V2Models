/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.HD#getHD1 <em>HD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.HD#getHD2 <em>HD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.HD#getHD3 <em>HD3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getHD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='HD' kind='elementOnly'"
 * @generated
 */
public interface HD extends EObject {
	/**
	 * Returns the value of the '<em><b>HD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HD1</em>' containment reference.
	 * @see #setHD1(HD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getHD_HD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	HD1CONTENT getHD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.HD#getHD1 <em>HD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HD1</em>' containment reference.
	 * @see #getHD1()
	 * @generated
	 */
	void setHD1(HD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>HD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HD2</em>' containment reference.
	 * @see #setHD2(HD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getHD_HD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	HD2CONTENT getHD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.HD#getHD2 <em>HD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HD2</em>' containment reference.
	 * @see #getHD2()
	 * @generated
	 */
	void setHD2(HD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>HD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HD3</em>' containment reference.
	 * @see #setHD3(HD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getHD_HD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	HD3CONTENT getHD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.HD#getHD3 <em>HD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HD3</em>' containment reference.
	 * @see #getHD3()
	 * @generated
	 */
	void setHD3(HD3CONTENT value);

} // HD
