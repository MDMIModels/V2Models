/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.JCC#getJCC1 <em>JCC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.JCC#getJCC2 <em>JCC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.JCC#getJCC3 <em>JCC3</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getJCC()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='JCC' kind='elementOnly'"
 * @generated
 */
public interface JCC extends EObject {
	/**
	 * Returns the value of the '<em><b>JCC1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JCC1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JCC1</em>' containment reference.
	 * @see #setJCC1(JCC1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getJCC_JCC1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JCC.1' namespace='##targetNamespace'"
	 * @generated
	 */
	JCC1CONTENT getJCC1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.JCC#getJCC1 <em>JCC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JCC1</em>' containment reference.
	 * @see #getJCC1()
	 * @generated
	 */
	void setJCC1(JCC1CONTENT value);

	/**
	 * Returns the value of the '<em><b>JCC2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JCC2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JCC2</em>' containment reference.
	 * @see #setJCC2(JCC2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getJCC_JCC2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JCC.2' namespace='##targetNamespace'"
	 * @generated
	 */
	JCC2CONTENT getJCC2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.JCC#getJCC2 <em>JCC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JCC2</em>' containment reference.
	 * @see #getJCC2()
	 * @generated
	 */
	void setJCC2(JCC2CONTENT value);

	/**
	 * Returns the value of the '<em><b>JCC3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JCC3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JCC3</em>' containment reference.
	 * @see #setJCC3(JCC3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getJCC_JCC3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='JCC.3' namespace='##targetNamespace'"
	 * @generated
	 */
	JCC3CONTENT getJCC3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.JCC#getJCC3 <em>JCC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JCC3</em>' containment reference.
	 * @see #getJCC3()
	 * @generated
	 */
	void setJCC3(JCC3CONTENT value);

} // JCC
