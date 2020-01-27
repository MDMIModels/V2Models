/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.ICD#getICD1 <em>ICD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.ICD#getICD2 <em>ICD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.ICD#getICD3 <em>ICD3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getICD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='ICD' kind='elementOnly'"
 * @generated
 */
public interface ICD extends EObject {
	/**
	 * Returns the value of the '<em><b>ICD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICD1</em>' containment reference.
	 * @see #setICD1(ICD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getICD_ICD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ICD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	ICD1CONTENT getICD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ICD#getICD1 <em>ICD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICD1</em>' containment reference.
	 * @see #getICD1()
	 * @generated
	 */
	void setICD1(ICD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>ICD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICD2</em>' containment reference.
	 * @see #setICD2(ICD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getICD_ICD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ICD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	ICD2CONTENT getICD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ICD#getICD2 <em>ICD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICD2</em>' containment reference.
	 * @see #getICD2()
	 * @generated
	 */
	void setICD2(ICD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>ICD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICD3</em>' containment reference.
	 * @see #setICD3(ICD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getICD_ICD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ICD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	ICD3CONTENT getICD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.ICD#getICD3 <em>ICD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICD3</em>' containment reference.
	 * @see #getICD3()
	 * @generated
	 */
	void setICD3(ICD3CONTENT value);

} // ICD
