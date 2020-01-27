/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AIPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP1 <em>AIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP2 <em>AIP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP3 <em>AIP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP4 <em>AIP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP5 <em>AIP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP6 <em>AIP6</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP7 <em>AIP7</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP8 <em>AIP8</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP9 <em>AIP9</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP10 <em>AIP10</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP11 <em>AIP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAIP12 <em>AIP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.AIPCONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT()
 * @model extendedMetaData="name='AIP.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface AIPCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>AIP1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP1</em>' containment reference.
	 * @see #setAIP1(AIP1CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AIP.1' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP1CONTENT getAIP1();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP1 <em>AIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP1</em>' containment reference.
	 * @see #getAIP1()
	 * @generated
	 */
	void setAIP1(AIP1CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP2</em>' containment reference.
	 * @see #setAIP2(AIP2CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.2' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP2CONTENT getAIP2();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP2 <em>AIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP2</em>' containment reference.
	 * @see #getAIP2()
	 * @generated
	 */
	void setAIP2(AIP2CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP3</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.AIP3CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP3</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AIP3CONTENT> getAIP3();

	/**
	 * Returns the value of the '<em><b>AIP4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP4</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP4</em>' containment reference.
	 * @see #setAIP4(AIP4CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP4()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.4' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP4CONTENT getAIP4();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP4 <em>AIP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP4</em>' containment reference.
	 * @see #getAIP4()
	 * @generated
	 */
	void setAIP4(AIP4CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP5</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP5</em>' containment reference.
	 * @see #setAIP5(AIP5CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP5()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.5' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP5CONTENT getAIP5();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP5 <em>AIP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP5</em>' containment reference.
	 * @see #getAIP5()
	 * @generated
	 */
	void setAIP5(AIP5CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP6</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP6</em>' containment reference.
	 * @see #setAIP6(AIP6CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP6()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.6' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP6CONTENT getAIP6();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP6 <em>AIP6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP6</em>' containment reference.
	 * @see #getAIP6()
	 * @generated
	 */
	void setAIP6(AIP6CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP7</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP7</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP7</em>' containment reference.
	 * @see #setAIP7(AIP7CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP7()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.7' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP7CONTENT getAIP7();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP7 <em>AIP7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP7</em>' containment reference.
	 * @see #getAIP7()
	 * @generated
	 */
	void setAIP7(AIP7CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP8</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP8</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP8</em>' containment reference.
	 * @see #setAIP8(AIP8CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP8()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.8' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP8CONTENT getAIP8();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP8 <em>AIP8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP8</em>' containment reference.
	 * @see #getAIP8()
	 * @generated
	 */
	void setAIP8(AIP8CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP9</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP9</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP9</em>' containment reference.
	 * @see #setAIP9(AIP9CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP9()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.9' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP9CONTENT getAIP9();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP9 <em>AIP9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP9</em>' containment reference.
	 * @see #getAIP9()
	 * @generated
	 */
	void setAIP9(AIP9CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP10</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP10</em>' containment reference.
	 * @see #setAIP10(AIP10CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.10' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP10CONTENT getAIP10();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP10 <em>AIP10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP10</em>' containment reference.
	 * @see #getAIP10()
	 * @generated
	 */
	void setAIP10(AIP10CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP11</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP11</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP11</em>' containment reference.
	 * @see #setAIP11(AIP11CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.11' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP11CONTENT getAIP11();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP11 <em>AIP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP11</em>' containment reference.
	 * @see #getAIP11()
	 * @generated
	 */
	void setAIP11(AIP11CONTENT value);

	/**
	 * Returns the value of the '<em><b>AIP12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AIP12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AIP12</em>' containment reference.
	 * @see #setAIP12(AIP12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_AIP12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AIP.12' namespace='##targetNamespace'"
	 * @generated
	 */
	AIP12CONTENT getAIP12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.AIPCONTENT#getAIP12 <em>AIP12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AIP12</em>' containment reference.
	 * @see #getAIP12()
	 * @generated
	 */
	void setAIP12(AIP12CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getAIPCONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':12' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // AIPCONTENT
