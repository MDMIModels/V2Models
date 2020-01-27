/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RCD#getRCD1 <em>RCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RCD#getRCD2 <em>RCD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.RCD#getRCD3 <em>RCD3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRCD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='RCD' kind='elementOnly'"
 * @generated
 */
public interface RCD extends EObject {
	/**
	 * Returns the value of the '<em><b>RCD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCD1</em>' containment reference.
	 * @see #setRCD1(RCD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRCD_RCD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RCD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RCD1CONTENT getRCD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RCD#getRCD1 <em>RCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RCD1</em>' containment reference.
	 * @see #getRCD1()
	 * @generated
	 */
	void setRCD1(RCD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RCD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCD2</em>' containment reference.
	 * @see #setRCD2(RCD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRCD_RCD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RCD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RCD2CONTENT getRCD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RCD#getRCD2 <em>RCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RCD2</em>' containment reference.
	 * @see #getRCD2()
	 * @generated
	 */
	void setRCD2(RCD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>RCD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RCD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RCD3</em>' containment reference.
	 * @see #setRCD3(RCD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRCD_RCD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RCD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	RCD3CONTENT getRCD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RCD#getRCD3 <em>RCD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RCD3</em>' containment reference.
	 * @see #getRCD3()
	 * @generated
	 */
	void setRCD3(RCD3CONTENT value);

} // RCD
