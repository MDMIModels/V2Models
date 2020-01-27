/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CCP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CCP#getCCP1 <em>CCP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CCP#getCCP2 <em>CCP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.CCP#getCCP3 <em>CCP3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCCP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='CCP' kind='elementOnly'"
 * @generated
 */
public interface CCP extends EObject {
	/**
	 * Returns the value of the '<em><b>CCP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCP1</em>' containment reference.
	 * @see #setCCP1(CCP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCCP_CCP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CCP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CCP1CONTENT getCCP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CCP#getCCP1 <em>CCP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCP1</em>' containment reference.
	 * @see #getCCP1()
	 * @generated
	 */
	void setCCP1(CCP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CCP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCP2</em>' containment reference.
	 * @see #setCCP2(CCP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCCP_CCP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CCP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CCP2CONTENT getCCP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CCP#getCCP2 <em>CCP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCP2</em>' containment reference.
	 * @see #getCCP2()
	 * @generated
	 */
	void setCCP2(CCP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>CCP3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CCP3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCP3</em>' containment reference.
	 * @see #setCCP3(CCP3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCCP_CCP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CCP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CCP3CONTENT getCCP3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CCP#getCCP3 <em>CCP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCP3</em>' containment reference.
	 * @see #getCCP3()
	 * @generated
	 */
	void setCCP3(CCP3CONTENT value);

} // CCP
