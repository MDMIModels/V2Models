/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.hl7.v2xml.PR113CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PR113CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PR113CONTENTImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR113CONTENTImpl#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR113CONTENTImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR113CONTENTImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PR113CONTENTImpl extends CEImpl implements PR113CONTENT {
	/**
	 * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEM_EDEFAULT = "403";

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected String item = ITEM_EDEFAULT;

	/**
	 * This is true if the Item attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean itemESet;

	/**
	 * The default value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_NAME_EDEFAULT = "Consent Code";

	/**
	 * The cached value of the '{@link #getLongName() <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongName()
	 * @generated
	 * @ordered
	 */
	protected String longName = LONG_NAME_EDEFAULT;

	/**
	 * This is true if the Long Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean longNameESet;

	/**
	 * The default value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected static final String TABLE_EDEFAULT = "HL70059";

	/**
	 * The cached value of the '{@link #getTable() <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTable()
	 * @generated
	 * @ordered
	 */
	protected String table = TABLE_EDEFAULT;

	/**
	 * This is true if the Table attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tableESet;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "CE";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PR113CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPR113CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getItem() {
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItem(String newItem) {
		String oldItem = item;
		item = newItem;
		boolean oldItemESet = itemESet;
		itemESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR113CONTENT__ITEM, oldItem, item, !oldItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetItem() {
		String oldItem = item;
		boolean oldItemESet = itemESet;
		item = ITEM_EDEFAULT;
		itemESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V2xmlPackage.PR113CONTENT__ITEM, oldItem, ITEM_EDEFAULT, oldItemESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItem() {
		return itemESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongName(String newLongName) {
		String oldLongName = longName;
		longName = newLongName;
		boolean oldLongNameESet = longNameESet;
		longNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR113CONTENT__LONG_NAME, oldLongName, longName, !oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLongName() {
		String oldLongName = longName;
		boolean oldLongNameESet = longNameESet;
		longName = LONG_NAME_EDEFAULT;
		longNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V2xmlPackage.PR113CONTENT__LONG_NAME, oldLongName, LONG_NAME_EDEFAULT, oldLongNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLongName() {
		return longNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTable() {
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTable(String newTable) {
		String oldTable = table;
		table = newTable;
		boolean oldTableESet = tableESet;
		tableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR113CONTENT__TABLE, oldTable, table, !oldTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTable() {
		String oldTable = table;
		boolean oldTableESet = tableESet;
		table = TABLE_EDEFAULT;
		tableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V2xmlPackage.PR113CONTENT__TABLE, oldTable, TABLE_EDEFAULT, oldTableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTable() {
		return tableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR113CONTENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		String oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, V2xmlPackage.PR113CONTENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V2xmlPackage.PR113CONTENT__ITEM:
				return getItem();
			case V2xmlPackage.PR113CONTENT__LONG_NAME:
				return getLongName();
			case V2xmlPackage.PR113CONTENT__TABLE:
				return getTable();
			case V2xmlPackage.PR113CONTENT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.PR113CONTENT__ITEM:
				setItem((String)newValue);
				return;
			case V2xmlPackage.PR113CONTENT__LONG_NAME:
				setLongName((String)newValue);
				return;
			case V2xmlPackage.PR113CONTENT__TABLE:
				setTable((String)newValue);
				return;
			case V2xmlPackage.PR113CONTENT__TYPE:
				setType((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case V2xmlPackage.PR113CONTENT__ITEM:
				unsetItem();
				return;
			case V2xmlPackage.PR113CONTENT__LONG_NAME:
				unsetLongName();
				return;
			case V2xmlPackage.PR113CONTENT__TABLE:
				unsetTable();
				return;
			case V2xmlPackage.PR113CONTENT__TYPE:
				unsetType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case V2xmlPackage.PR113CONTENT__ITEM:
				return isSetItem();
			case V2xmlPackage.PR113CONTENT__LONG_NAME:
				return isSetLongName();
			case V2xmlPackage.PR113CONTENT__TABLE:
				return isSetTable();
			case V2xmlPackage.PR113CONTENT__TYPE:
				return isSetType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (item: ");
		if (itemESet) result.append(item); else result.append("<unset>");
		result.append(", longName: ");
		if (longNameESet) result.append(longName); else result.append("<unset>");
		result.append(", table: ");
		if (tableESet) result.append(table); else result.append("<unset>");
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PR113CONTENTImpl
