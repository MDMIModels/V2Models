/**
 */
package org.hl7.v2xml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PRD7CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provider Identifiers
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PRD7CONTENT#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRD7CONTENT#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.hl7.v2xml.PRD7CONTENT#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPRD7CONTENT()
 * @model extendedMetaData="name='PRD.7.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PRD7CONTENT extends PLN {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' attribute.
	 * The default value is <code>"1162"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' attribute.
	 * @see #isSetItem()
	 * @see #unsetItem()
	 * @see #setItem(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRD7CONTENT_Item()
	 * @model default="1162" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Item'"
	 * @generated
	 */
	String getItem();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' attribute.
	 * @see #isSetItem()
	 * @see #unsetItem()
	 * @see #getItem()
	 * @generated
	 */
	void setItem(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getItem <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetItem()
	 * @see #getItem()
	 * @see #setItem(String)
	 * @generated
	 */
	void unsetItem();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getItem <em>Item</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Item</em>' attribute is set.
	 * @see #unsetItem()
	 * @see #getItem()
	 * @see #setItem(String)
	 * @generated
	 */
	boolean isSetItem();

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * The default value is <code>"Provider Identifiers"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #setLongName(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRD7CONTENT_LongName()
	 * @model default="Provider Identifiers" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LongName'"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #isSetLongName()
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	void unsetLongName();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getLongName <em>Long Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Long Name</em>' attribute is set.
	 * @see #unsetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	boolean isSetLongName();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"PLN"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getPRD7CONTENT_Type()
	 * @model default="PLN" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.PRD7CONTENT#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // PRD7CONTENT
