/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OM2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM21 <em>OM21</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM22 <em>OM22</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM23 <em>OM23</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM24 <em>OM24</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM25 <em>OM25</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM26 <em>OM26</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM27 <em>OM27</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM28 <em>OM28</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM29 <em>OM29</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getOM210 <em>OM210</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM2CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT()
 * @model extendedMetaData="name='OM2.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface OM2CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>OM21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM21</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM21</em>' containment reference.
	 * @see #setOM21(OM21CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM21()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OM21CONTENT getOM21();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM21 <em>OM21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM21</em>' containment reference.
	 * @see #getOM21()
	 * @generated
	 */
	void setOM21(OM21CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM22</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM22</em>' containment reference.
	 * @see #setOM22(OM22CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM22()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.2' namespace='##targetNamespace'"
	 * @generated
	 */
	OM22CONTENT getOM22();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM22 <em>OM22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM22</em>' containment reference.
	 * @see #getOM22()
	 * @generated
	 */
	void setOM22(OM22CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM23</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM23CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM23</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM23</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM23CONTENT> getOM23();

	/**
	 * Returns the value of the '<em><b>OM24</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM24</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM24</em>' containment reference.
	 * @see #setOM24(OM24CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM24()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.4' namespace='##targetNamespace'"
	 * @generated
	 */
	OM24CONTENT getOM24();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM24 <em>OM24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM24</em>' containment reference.
	 * @see #getOM24()
	 * @generated
	 */
	void setOM24(OM24CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM25</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM25</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM25</em>' containment reference.
	 * @see #setOM25(OM25CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM25()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.5' namespace='##targetNamespace'"
	 * @generated
	 */
	OM25CONTENT getOM25();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM25 <em>OM25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM25</em>' containment reference.
	 * @see #getOM25()
	 * @generated
	 */
	void setOM25(OM25CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM26</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM26CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM26</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM26</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM26()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.6' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM26CONTENT> getOM26();

	/**
	 * Returns the value of the '<em><b>OM27</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM27CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM27</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM27</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM27()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.7' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM27CONTENT> getOM27();

	/**
	 * Returns the value of the '<em><b>OM28</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM28</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM28</em>' containment reference.
	 * @see #setOM28(OM28CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM28()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.8' namespace='##targetNamespace'"
	 * @generated
	 */
	OM28CONTENT getOM28();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM28 <em>OM28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM28</em>' containment reference.
	 * @see #getOM28()
	 * @generated
	 */
	void setOM28(OM28CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM29</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.OM29CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM29</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM29</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM29()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.9' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OM29CONTENT> getOM29();

	/**
	 * Returns the value of the '<em><b>OM210</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM210</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM210</em>' containment reference.
	 * @see #setOM210(OM210CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_OM210()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM2.10' namespace='##targetNamespace'"
	 * @generated
	 */
	OM210CONTENT getOM210();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM2CONTENT#getOM210 <em>OM210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM210</em>' containment reference.
	 * @see #getOM210()
	 * @generated
	 */
	void setOM210(OM210CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getOM2CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // OM2CONTENT
