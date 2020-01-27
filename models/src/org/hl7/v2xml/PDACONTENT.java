/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PDACONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA1 <em>PDA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA2 <em>PDA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA3 <em>PDA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA4 <em>PDA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA5 <em>PDA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA6 <em>PDA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA7 <em>PDA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA8 <em>PDA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getPDA9 <em>PDA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.PDACONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT()
 * @model extendedMetaData="name='PDA.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PDACONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PDA1</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PDA1CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA1</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PDA1CONTENT> getPDA1();

	/**
	 * Returns the value of the '<em><b>PDA2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA2</em>' containment reference.
	 * @see #setPDA2(PDA2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA2CONTENT getPDA2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA2 <em>PDA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA2</em>' containment reference.
	 * @see #getPDA2()
	 * @generated
	 */
	void setPDA2(PDA2CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA3</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA3</em>' containment reference.
	 * @see #setPDA3(PDA3CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.3' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA3CONTENT getPDA3();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA3 <em>PDA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA3</em>' containment reference.
	 * @see #getPDA3()
	 * @generated
	 */
	void setPDA3(PDA3CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA4</em>' containment reference.
	 * @see #setPDA4(PDA4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.4' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA4CONTENT getPDA4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA4 <em>PDA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA4</em>' containment reference.
	 * @see #getPDA4()
	 * @generated
	 */
	void setPDA4(PDA4CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA5</em>' containment reference.
	 * @see #setPDA5(PDA5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.5' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA5CONTENT getPDA5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA5 <em>PDA5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA5</em>' containment reference.
	 * @see #getPDA5()
	 * @generated
	 */
	void setPDA5(PDA5CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA6</em>' containment reference.
	 * @see #setPDA6(PDA6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.6' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA6CONTENT getPDA6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA6 <em>PDA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA6</em>' containment reference.
	 * @see #getPDA6()
	 * @generated
	 */
	void setPDA6(PDA6CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA7</em>' containment reference.
	 * @see #setPDA7(PDA7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.7' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA7CONTENT getPDA7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA7 <em>PDA7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA7</em>' containment reference.
	 * @see #getPDA7()
	 * @generated
	 */
	void setPDA7(PDA7CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA8</em>' containment reference.
	 * @see #setPDA8(PDA8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA8CONTENT getPDA8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA8 <em>PDA8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA8</em>' containment reference.
	 * @see #getPDA8()
	 * @generated
	 */
	void setPDA8(PDA8CONTENT value);

	/**
	 * Returns the value of the '<em><b>PDA9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PDA9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PDA9</em>' containment reference.
	 * @see #setPDA9(PDA9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_PDA9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PDA.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PDA9CONTENT getPDA9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PDACONTENT#getPDA9 <em>PDA9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDA9</em>' containment reference.
	 * @see #getPDA9()
	 * @generated
	 */
	void setPDA9(PDA9CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getPDACONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':9' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PDACONTENT
