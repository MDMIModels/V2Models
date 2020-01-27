/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CQ#getCQ1 <em>CQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.CQ#getCQ2 <em>CQ2</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCQ()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='CQ' kind='elementOnly'"
 * @generated
 */
public interface CQ extends EObject {
	/**
	 * Returns the value of the '<em><b>CQ1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CQ1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CQ1</em>' containment reference.
	 * @see #setCQ1(CQ1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCQ_CQ1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CQ.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CQ1CONTENT getCQ1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CQ#getCQ1 <em>CQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CQ1</em>' containment reference.
	 * @see #getCQ1()
	 * @generated
	 */
	void setCQ1(CQ1CONTENT value);

	/**
	 * Returns the value of the '<em><b>CQ2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CQ2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CQ2</em>' containment reference.
	 * @see #setCQ2(CQ2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCQ_CQ2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CQ.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CQ2CONTENT getCQ2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CQ#getCQ2 <em>CQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CQ2</em>' containment reference.
	 * @see #getCQ2()
	 * @generated
	 */
	void setCQ2(CQ2CONTENT value);

} // CQ
