/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CCD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CCD#getCCD1 <em>CCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CCD#getCCD2 <em>CCD2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCCD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='CCD' kind='elementOnly'"
 * @generated
 */
public interface CCD extends EObject {
	/**
	 * Returns the value of the '<em><b>CCD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCD1</em>' containment reference.
	 * @see #setCCD1(CCD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCCD_CCD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CCD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CCD1CONTENT getCCD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CCD#getCCD1 <em>CCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCD1</em>' containment reference.
	 * @see #getCCD1()
	 * @generated
	 */
	void setCCD1(CCD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CCD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCD2</em>' containment reference.
	 * @see #setCCD2(CCD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCCD_CCD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CCD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CCD2CONTENT getCCD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CCD#getCCD2 <em>CCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCD2</em>' containment reference.
	 * @see #getCCD2()
	 * @generated
	 */
	void setCCD2(CCD2CONTENT value);

} // CCD
