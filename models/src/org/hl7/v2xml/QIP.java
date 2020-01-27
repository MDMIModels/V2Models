/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QIP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.QIP#getQIP1 <em>QIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.QIP#getQIP2 <em>QIP2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getQIP()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='QIP' kind='elementOnly'"
 * @generated
 */
public interface QIP extends EObject {
	/**
	 * Returns the value of the '<em><b>QIP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QIP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QIP1</em>' containment reference.
	 * @see #setQIP1(QIP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQIP_QIP1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QIP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	QIP1CONTENT getQIP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QIP#getQIP1 <em>QIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QIP1</em>' containment reference.
	 * @see #getQIP1()
	 * @generated
	 */
	void setQIP1(QIP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>QIP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QIP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QIP2</em>' containment reference.
	 * @see #setQIP2(QIP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getQIP_QIP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='QIP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	QIP2CONTENT getQIP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.QIP#getQIP2 <em>QIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QIP2</em>' containment reference.
	 * @see #getQIP2()
	 * @generated
	 */
	void setQIP2(QIP2CONTENT value);

} // QIP
