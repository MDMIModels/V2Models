/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PLN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PLN#getPLN1 <em>PLN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PLN#getPLN2 <em>PLN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PLN#getPLN3 <em>PLN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PLN#getPLN4 <em>PLN4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPLN()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='PLN' kind='elementOnly'"
 * @generated
 */
public interface PLN extends EObject {
	/**
	 * Returns the value of the '<em><b>PLN1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PLN1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PLN1</em>' containment reference.
	 * @see #setPLN1(PLN1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPLN_PLN1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PLN.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PLN1CONTENT getPLN1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PLN#getPLN1 <em>PLN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLN1</em>' containment reference.
	 * @see #getPLN1()
	 * @generated
	 */
	void setPLN1(PLN1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PLN2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PLN2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PLN2</em>' containment reference.
	 * @see #setPLN2(PLN2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPLN_PLN2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PLN.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PLN2CONTENT getPLN2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PLN#getPLN2 <em>PLN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLN2</em>' containment reference.
	 * @see #getPLN2()
	 * @generated
	 */
	void setPLN2(PLN2CONTENT value);

	/**
	 * Returns the value of the '<em><b>PLN3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PLN3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PLN3</em>' containment reference.
	 * @see #setPLN3(PLN3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPLN_PLN3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PLN.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PLN3CONTENT getPLN3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PLN#getPLN3 <em>PLN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLN3</em>' containment reference.
	 * @see #getPLN3()
	 * @generated
	 */
	void setPLN3(PLN3CONTENT value);

	/**
	 * Returns the value of the '<em><b>PLN4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PLN4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PLN4</em>' containment reference.
	 * @see #setPLN4(PLN4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPLN_PLN4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PLN.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PLN4CONTENT getPLN4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PLN#getPLN4 <em>PLN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PLN4</em>' containment reference.
	 * @see #getPLN4()
	 * @generated
	 */
	void setPLN4(PLN4CONTENT value);

} // PLN
