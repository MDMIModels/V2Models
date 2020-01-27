/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PRL#getPRL1 <em>PRL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRL#getPRL2 <em>PRL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRL#getPRL3 <em>PRL3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPRL()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='PRL' kind='elementOnly'"
 * @generated
 */
public interface PRL extends EObject {
	/**
	 * Returns the value of the '<em><b>PRL1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRL1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRL1</em>' containment reference.
	 * @see #setPRL1(PRL1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRL_PRL1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRL.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PRL1CONTENT getPRL1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRL#getPRL1 <em>PRL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRL1</em>' containment reference.
	 * @see #getPRL1()
	 * @generated
	 */
	void setPRL1(PRL1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRL2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRL2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRL2</em>' containment reference.
	 * @see #setPRL2(PRL2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRL_PRL2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRL.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PRL2CONTENT getPRL2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRL#getPRL2 <em>PRL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRL2</em>' containment reference.
	 * @see #getPRL2()
	 * @generated
	 */
	void setPRL2(PRL2CONTENT value);

	/**
	 * Returns the value of the '<em><b>PRL3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRL3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRL3</em>' containment reference.
	 * @see #setPRL3(PRL3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRL_PRL3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PRL.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PRL3CONTENT getPRL3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRL#getPRL3 <em>PRL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRL3</em>' containment reference.
	 * @see #getPRL3()
	 * @generated
	 */
	void setPRL3(PRL3CONTENT value);

} // PRL
