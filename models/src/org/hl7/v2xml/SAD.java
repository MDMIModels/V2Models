/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SAD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SAD#getSAD1 <em>SAD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SAD#getSAD2 <em>SAD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.SAD#getSAD3 <em>SAD3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSAD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='SAD' kind='elementOnly'"
 * @generated
 */
public interface SAD extends EObject {
	/**
	 * Returns the value of the '<em><b>SAD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAD1</em>' containment reference.
	 * @see #setSAD1(SAD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSAD_SAD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SAD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SAD1CONTENT getSAD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SAD#getSAD1 <em>SAD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAD1</em>' containment reference.
	 * @see #getSAD1()
	 * @generated
	 */
	void setSAD1(SAD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SAD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAD2</em>' containment reference.
	 * @see #setSAD2(SAD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSAD_SAD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SAD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SAD2CONTENT getSAD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SAD#getSAD2 <em>SAD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAD2</em>' containment reference.
	 * @see #getSAD2()
	 * @generated
	 */
	void setSAD2(SAD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>SAD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SAD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SAD3</em>' containment reference.
	 * @see #setSAD3(SAD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSAD_SAD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SAD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	SAD3CONTENT getSAD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SAD#getSAD3 <em>SAD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SAD3</em>' containment reference.
	 * @see #getSAD3()
	 * @generated
	 */
	void setSAD3(SAD3CONTENT value);

} // SAD
