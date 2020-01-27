/**
 */
package org.hl7.v2xml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPS7CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specimen Role
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.SPS7CONTENT#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPS7CONTENT#getTable <em>Table</em>}</li>
 *   <li>{@link org.hl7.v2xml.SPS7CONTENT#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getSPS7CONTENT()
 * @model extendedMetaData="name='SPS.7.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface SPS7CONTENT extends CWE {
	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * The default value is <code>"Specimen Role"</code>.
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
	 * @see org.hl7.v2xml.V2xmlPackage#getSPS7CONTENT_LongName()
	 * @model default="Specimen Role" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LongName'"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getLongName <em>Long Name</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLongName()
	 * @see #getLongName()
	 * @see #setLongName(String)
	 * @generated
	 */
	void unsetLongName();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getLongName <em>Long Name</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * The default value is <code>"HL70369"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #isSetTable()
	 * @see #unsetTable()
	 * @see #setTable(String)
	 * @see org.hl7.v2xml.V2xmlPackage#getSPS7CONTENT_Table()
	 * @model default="HL70369" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Table'"
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #isSetTable()
	 * @see #unsetTable()
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

	/**
	 * Unsets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTable()
	 * @see #getTable()
	 * @see #setTable(String)
	 * @generated
	 */
	void unsetTable();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getTable <em>Table</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Table</em>' attribute is set.
	 * @see #unsetTable()
	 * @see #getTable()
	 * @see #setTable(String)
	 * @generated
	 */
	boolean isSetTable();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"CWE"</code>.
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
	 * @see org.hl7.v2xml.V2xmlPackage#getSPS7CONTENT_Type()
	 * @model default="CWE" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getType <em>Type</em>}' attribute.
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
	 * Unsets the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.hl7.v2xml.SPS7CONTENT#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // SPS7CONTENT
