/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OM6CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.OM6CONTENT#getOM61 <em>OM61</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM6CONTENT#getOM62 <em>OM62</em>}</li>
 *   <li>{@link org.hl7.v2xml.OM6CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getOM6CONTENT()
 * @model extendedMetaData="name='OM6.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface OM6CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>OM61</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM61</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM61</em>' containment reference.
	 * @see #setOM61(OM61CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM6CONTENT_OM61()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM6.1' namespace='##targetNamespace'"
	 * @generated
	 */
	OM61CONTENT getOM61();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM6CONTENT#getOM61 <em>OM61</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM61</em>' containment reference.
	 * @see #getOM61()
	 * @generated
	 */
	void setOM61(OM61CONTENT value);

	/**
	 * Returns the value of the '<em><b>OM62</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OM62</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OM62</em>' containment reference.
	 * @see #setOM62(OM62CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getOM6CONTENT_OM62()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='OM6.2' namespace='##targetNamespace'"
	 * @generated
	 */
	OM62CONTENT getOM62();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.OM6CONTENT#getOM62 <em>OM62</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OM62</em>' containment reference.
	 * @see #getOM62()
	 * @generated
	 */
	void setOM62(OM62CONTENT value);

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
	 * @see org.hl7.v2xml.V2xmlPackage#getOM6CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // OM6CONTENT
