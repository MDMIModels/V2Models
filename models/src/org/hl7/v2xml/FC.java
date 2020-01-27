/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.FC#getFC1 <em>FC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.FC#getFC2 <em>FC2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getFC()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='FC' kind='elementOnly'"
 * @generated
 */
public interface FC extends EObject {
	/**
	 * Returns the value of the '<em><b>FC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FC1</em>' containment reference.
	 * @see #setFC1(FC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFC_FC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	FC1CONTENT getFC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FC#getFC1 <em>FC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FC1</em>' containment reference.
	 * @see #getFC1()
	 * @generated
	 */
	void setFC1(FC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>FC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FC2</em>' containment reference.
	 * @see #setFC2(FC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getFC_FC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	FC2CONTENT getFC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.FC#getFC2 <em>FC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FC2</em>' containment reference.
	 * @see #getFC2()
	 * @generated
	 */
	void setFC2(FC2CONTENT value);

} // FC
