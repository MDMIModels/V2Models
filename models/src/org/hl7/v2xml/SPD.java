/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SPD#getSPD1 <em>SPD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPD#getSPD2 <em>SPD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPD#getSPD3 <em>SPD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPD#getSPD4 <em>SPD4</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSPD()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='SPD' kind='elementOnly'"
 * @generated
 */
public interface SPD extends EObject {
	/**
	 * Returns the value of the '<em><b>SPD1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPD1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPD1</em>' containment reference.
	 * @see #setSPD1(SPD1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPD_SPD1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPD.1' namespace='##targetNamespace'"
	 * @generated
	 */
	SPD1CONTENT getSPD1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPD#getSPD1 <em>SPD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPD1</em>' containment reference.
	 * @see #getSPD1()
	 * @generated
	 */
	void setSPD1(SPD1CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPD2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPD2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPD2</em>' containment reference.
	 * @see #setSPD2(SPD2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPD_SPD2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPD.2' namespace='##targetNamespace'"
	 * @generated
	 */
	SPD2CONTENT getSPD2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPD#getSPD2 <em>SPD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPD2</em>' containment reference.
	 * @see #getSPD2()
	 * @generated
	 */
	void setSPD2(SPD2CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPD3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPD3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPD3</em>' containment reference.
	 * @see #setSPD3(SPD3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPD_SPD3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPD.3' namespace='##targetNamespace'"
	 * @generated
	 */
	SPD3CONTENT getSPD3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPD#getSPD3 <em>SPD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPD3</em>' containment reference.
	 * @see #getSPD3()
	 * @generated
	 */
	void setSPD3(SPD3CONTENT value);

	/**
	 * Returns the value of the '<em><b>SPD4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPD4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPD4</em>' containment reference.
	 * @see #setSPD4(SPD4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPD_SPD4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPD.4' namespace='##targetNamespace'"
	 * @generated
	 */
	SPD4CONTENT getSPD4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPD#getSPD4 <em>SPD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPD4</em>' containment reference.
	 * @see #getSPD4()
	 * @generated
	 */
	void setSPD4(SPD4CONTENT value);

} // SPD
