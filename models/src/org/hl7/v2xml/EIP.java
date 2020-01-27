/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.EIP#getEIP1 <em>EIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.EIP#getEIP2 <em>EIP2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getEIP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='EIP' kind='elementOnly'"
 * @generated
 */
public interface EIP extends EObject {
	/**
	 * Returns the value of the '<em><b>EIP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EIP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIP1</em>' containment reference.
	 * @see #setEIP1(EIP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEIP_EIP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EIP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EIP1CONTENT getEIP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EIP#getEIP1 <em>EIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIP1</em>' containment reference.
	 * @see #getEIP1()
	 * @generated
	 */
	void setEIP1(EIP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>EIP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EIP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EIP2</em>' containment reference.
	 * @see #setEIP2(EIP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getEIP_EIP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='EIP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	EIP2CONTENT getEIP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EIP#getEIP2 <em>EIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EIP2</em>' containment reference.
	 * @see #getEIP2()
	 * @generated
	 */
	void setEIP2(EIP2CONTENT value);

} // EIP
