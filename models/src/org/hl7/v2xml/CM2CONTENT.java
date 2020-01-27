/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CM2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.CM2CONTENT#getCM21 <em>CM21</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM2CONTENT#getCM22 <em>CM22</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM2CONTENT#getCM23 <em>CM23</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM2CONTENT#getCM24 <em>CM24</em>}</li>
 *   <li>{@link org.hl7.v2xml.CM2CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT()
 * @model extendedMetaData="name='CM2.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface CM2CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>CM21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM21</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM21</em>' containment reference.
	 * @see #setCM21(CM21CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT_CM21()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM2.1' namespace='##targetNamespace'"
	 * @generated
	 */
	CM21CONTENT getCM21();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM2CONTENT#getCM21 <em>CM21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM21</em>' containment reference.
	 * @see #getCM21()
	 * @generated
	 */
	void setCM21(CM21CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM22</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM22</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM22</em>' containment reference.
	 * @see #setCM22(CM22CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT_CM22()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM2.2' namespace='##targetNamespace'"
	 * @generated
	 */
	CM22CONTENT getCM22();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM2CONTENT#getCM22 <em>CM22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM22</em>' containment reference.
	 * @see #getCM22()
	 * @generated
	 */
	void setCM22(CM22CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM23</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM23</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM23</em>' containment reference.
	 * @see #setCM23(CM23CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT_CM23()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CM2.3' namespace='##targetNamespace'"
	 * @generated
	 */
	CM23CONTENT getCM23();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.CM2CONTENT#getCM23 <em>CM23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CM23</em>' containment reference.
	 * @see #getCM23()
	 * @generated
	 */
	void setCM23(CM23CONTENT value);

	/**
	 * Returns the value of the '<em><b>CM24</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.CM24CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CM24</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CM24</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT_CM24()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='CM2.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CM24CONTENT> getCM24();

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
	 * @see org.hl7.v2xml.V2xmlPackage#getCM2CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':4' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CM2CONTENT
