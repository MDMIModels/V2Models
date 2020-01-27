/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PT#getPT1 <em>PT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PT#getPT2 <em>PT2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPT()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='PT' kind='elementOnly'"
 * @generated
 */
public interface PT extends EObject {
	/**
	 * Returns the value of the '<em><b>PT1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PT1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT1</em>' containment reference.
	 * @see #setPT1(PT1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPT_PT1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PT.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PT1CONTENT getPT1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PT#getPT1 <em>PT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT1</em>' containment reference.
	 * @see #getPT1()
	 * @generated
	 */
	void setPT1(PT1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PT2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PT2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PT2</em>' containment reference.
	 * @see #setPT2(PT2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPT_PT2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PT.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PT2CONTENT getPT2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PT#getPT2 <em>PT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PT2</em>' containment reference.
	 * @see #getPT2()
	 * @generated
	 */
	void setPT2(PT2CONTENT value);

} // PT
