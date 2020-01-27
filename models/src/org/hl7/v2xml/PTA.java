/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PTA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PTA#getPTA1 <em>PTA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PTA#getPTA2 <em>PTA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PTA#getPTA3 <em>PTA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PTA#getPTA4 <em>PTA4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPTA()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='PTA' kind='elementOnly'"
 * @generated
 */
public interface PTA extends EObject {
	/**
	 * Returns the value of the '<em><b>PTA1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTA1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTA1</em>' containment reference.
	 * @see #setPTA1(PTA1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPTA_PTA1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTA.1' namespace='##targetNamespace'"
	 * @generated
	 */
	PTA1CONTENT getPTA1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PTA#getPTA1 <em>PTA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTA1</em>' containment reference.
	 * @see #getPTA1()
	 * @generated
	 */
	void setPTA1(PTA1CONTENT value);

	/**
	 * Returns the value of the '<em><b>PTA2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTA2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTA2</em>' containment reference.
	 * @see #setPTA2(PTA2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPTA_PTA2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTA.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PTA2CONTENT getPTA2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PTA#getPTA2 <em>PTA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTA2</em>' containment reference.
	 * @see #getPTA2()
	 * @generated
	 */
	void setPTA2(PTA2CONTENT value);

	/**
	 * Returns the value of the '<em><b>PTA3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTA3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTA3</em>' containment reference.
	 * @see #setPTA3(PTA3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPTA_PTA3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTA.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PTA3CONTENT getPTA3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PTA#getPTA3 <em>PTA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTA3</em>' containment reference.
	 * @see #getPTA3()
	 * @generated
	 */
	void setPTA3(PTA3CONTENT value);

	/**
	 * Returns the value of the '<em><b>PTA4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PTA4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PTA4</em>' containment reference.
	 * @see #setPTA4(PTA4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPTA_PTA4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PTA.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PTA4CONTENT getPTA4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PTA#getPTA4 <em>PTA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PTA4</em>' containment reference.
	 * @see #getPTA4()
	 * @generated
	 */
	void setPTA4(PTA4CONTENT value);

} // PTA
