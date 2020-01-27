/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMICONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RMICONTENT#getRMI1 <em>RMI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RMICONTENT#getRMI2 <em>RMI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.RMICONTENT#getRMI3 <em>RMI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.RMICONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRMICONTENT()
 * @model extendedMetaData="name='RMI.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RMICONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>RMI1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMI1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMI1</em>' containment reference.
	 * @see #setRMI1(RMI1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRMICONTENT_RMI1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RMI.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RMI1CONTENT getRMI1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RMICONTENT#getRMI1 <em>RMI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RMI1</em>' containment reference.
	 * @see #getRMI1()
	 * @generated
	 */
	void setRMI1(RMI1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RMI2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMI2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMI2</em>' containment reference.
	 * @see #setRMI2(RMI2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRMICONTENT_RMI2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RMI.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RMI2CONTENT getRMI2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RMICONTENT#getRMI2 <em>RMI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RMI2</em>' containment reference.
	 * @see #getRMI2()
	 * @generated
	 */
	void setRMI2(RMI2CONTENT value);

	/**
	 * Returns the value of the '<em><b>RMI3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RMI3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RMI3</em>' containment reference.
	 * @see #setRMI3(RMI3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRMICONTENT_RMI3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RMI.3' namespace='##targetNamespace'"
	 * @generated
	 */
	RMI3CONTENT getRMI3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RMICONTENT#getRMI3 <em>RMI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RMI3</em>' containment reference.
	 * @see #getRMI3()
	 * @generated
	 */
	void setRMI3(RMI3CONTENT value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.hl7.v2xml.V2xmlPackage#getRMICONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // RMICONTENT
