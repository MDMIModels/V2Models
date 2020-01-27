/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VARCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR1 <em>VAR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR2 <em>VAR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR3 <em>VAR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR4 <em>VAR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR5 <em>VAR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getVAR6 <em>VAR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.VARCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT()
 * @model extendedMetaData="name='VAR.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface VARCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>VAR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR1</em>' containment reference.
	 * @see #setVAR1(VAR1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VAR.1' namespace='##targetNamespace'"
	 * @generated
	 */
	VAR1CONTENT getVAR1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VARCONTENT#getVAR1 <em>VAR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAR1</em>' containment reference.
	 * @see #getVAR1()
	 * @generated
	 */
	void setVAR1(VAR1CONTENT value);

	/**
	 * Returns the value of the '<em><b>VAR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR2</em>' containment reference.
	 * @see #setVAR2(VAR2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR2()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VAR.2' namespace='##targetNamespace'"
	 * @generated
	 */
	VAR2CONTENT getVAR2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VARCONTENT#getVAR2 <em>VAR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAR2</em>' containment reference.
	 * @see #getVAR2()
	 * @generated
	 */
	void setVAR2(VAR2CONTENT value);

	/**
	 * Returns the value of the '<em><b>VAR3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR3</em>' containment reference.
	 * @see #setVAR3(VAR3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VAR.3' namespace='##targetNamespace'"
	 * @generated
	 */
	VAR3CONTENT getVAR3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VARCONTENT#getVAR3 <em>VAR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAR3</em>' containment reference.
	 * @see #getVAR3()
	 * @generated
	 */
	void setVAR3(VAR3CONTENT value);

	/**
	 * Returns the value of the '<em><b>VAR4</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.VAR4CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR4</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VAR.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VAR4CONTENT> getVAR4();

	/**
	 * Returns the value of the '<em><b>VAR5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR5</em>' containment reference.
	 * @see #setVAR5(VAR5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VAR.5' namespace='##targetNamespace'"
	 * @generated
	 */
	VAR5CONTENT getVAR5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.VARCONTENT#getVAR5 <em>VAR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VAR5</em>' containment reference.
	 * @see #getVAR5()
	 * @generated
	 */
	void setVAR5(VAR5CONTENT value);

	/**
	 * Returns the value of the '<em><b>VAR6</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.VAR6CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VAR6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VAR6</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_VAR6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VAR.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VAR6CONTENT> getVAR6();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getVARCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // VARCONTENT
