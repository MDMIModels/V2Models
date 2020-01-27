/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Escape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.EscapeType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.v2xml.EscapeType#getEscape <em>Escape</em>}</li>
 *   <li>{@link org.hl7.v2xml.EscapeType#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getEscapeType()
 * @model annotation="http://org.hl7.v2.v25/Metadata appinfo='\n\t\t\t\t&lt;package xmlns=\"urn:hl7-org:v2xml\"&gt;datatypes&lt;/package&gt;\n\t\t\t'"
 *        extendedMetaData="name='escapeType' kind='mixed'"
 * @generated
 */
public interface EscapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.hl7.v2xml.V2xmlPackage#getEscapeType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Escape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Escape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Escape</em>' attribute.
	 * @see #setEscape(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getEscapeType_Escape()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='escape'"
	 * @generated
	 */
	String getEscape();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EscapeType#getEscape <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Escape</em>' attribute.
	 * @see #getEscape()
	 * @generated
	 */
	void setEscape(String value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getEscapeType_V()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='V'"
	 * @generated
	 */
	String getV();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.EscapeType#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(String value);

} // EscapeType
