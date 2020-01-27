/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RGSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.RGSCONTENT#getRGS1 <em>RGS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.RGSCONTENT#getRGS2 <em>RGS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.RGSCONTENT#getRGS3 <em>RGS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.RGSCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getRGSCONTENT()
 * @model extendedMetaData="name='RGS.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RGSCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>RGS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RGS1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RGS1</em>' containment reference.
	 * @see #setRGS1(RGS1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRGSCONTENT_RGS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RGS.1' namespace='##targetNamespace'"
	 * @generated
	 */
	RGS1CONTENT getRGS1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RGSCONTENT#getRGS1 <em>RGS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RGS1</em>' containment reference.
	 * @see #getRGS1()
	 * @generated
	 */
	void setRGS1(RGS1CONTENT value);

	/**
	 * Returns the value of the '<em><b>RGS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RGS2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RGS2</em>' containment reference.
	 * @see #setRGS2(RGS2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRGSCONTENT_RGS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RGS.2' namespace='##targetNamespace'"
	 * @generated
	 */
	RGS2CONTENT getRGS2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RGSCONTENT#getRGS2 <em>RGS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RGS2</em>' containment reference.
	 * @see #getRGS2()
	 * @generated
	 */
	void setRGS2(RGS2CONTENT value);

	/**
	 * Returns the value of the '<em><b>RGS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RGS3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RGS3</em>' containment reference.
	 * @see #setRGS3(RGS3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getRGSCONTENT_RGS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RGS.3' namespace='##targetNamespace'"
	 * @generated
	 */
	RGS3CONTENT getRGS3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.RGSCONTENT#getRGS3 <em>RGS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RGS3</em>' containment reference.
	 * @see #getRGS3()
	 * @generated
	 */
	void setRGS3(RGS3CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getRGSCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':3' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // RGSCONTENT
