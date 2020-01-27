/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DLD;
import org.hl7.v2xml.DLD1CONTENT;
import org.hl7.v2xml.DLD2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DLD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DLDImpl#getDLD1 <em>DLD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLDImpl#getDLD2 <em>DLD2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DLDImpl extends EObjectImpl implements DLD {
	/**
	 * The cached value of the '{@link #getDLD1() <em>DLD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLD1()
	 * @generated
	 * @ordered
	 */
	protected DLD1CONTENT dLD1;

	/**
	 * The cached value of the '{@link #getDLD2() <em>DLD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLD2()
	 * @generated
	 * @ordered
	 */
	protected DLD2CONTENT dLD2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DLDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDLD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLD1CONTENT getDLD1() {
		return dLD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLD1(DLD1CONTENT newDLD1, NotificationChain msgs) {
		DLD1CONTENT oldDLD1 = dLD1;
		dLD1 = newDLD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLD__DLD1, oldDLD1, newDLD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLD1(DLD1CONTENT newDLD1) {
		if (newDLD1 != dLD1) {
			NotificationChain msgs = null;
			if (dLD1 != null)
				msgs = ((InternalEObject)dLD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLD__DLD1, null, msgs);
			if (newDLD1 != null)
				msgs = ((InternalEObject)newDLD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLD__DLD1, null, msgs);
			msgs = basicSetDLD1(newDLD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLD__DLD1, newDLD1, newDLD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLD2CONTENT getDLD2() {
		return dLD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLD2(DLD2CONTENT newDLD2, NotificationChain msgs) {
		DLD2CONTENT oldDLD2 = dLD2;
		dLD2 = newDLD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLD__DLD2, oldDLD2, newDLD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLD2(DLD2CONTENT newDLD2) {
		if (newDLD2 != dLD2) {
			NotificationChain msgs = null;
			if (dLD2 != null)
				msgs = ((InternalEObject)dLD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLD__DLD2, null, msgs);
			if (newDLD2 != null)
				msgs = ((InternalEObject)newDLD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLD__DLD2, null, msgs);
			msgs = basicSetDLD2(newDLD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLD__DLD2, newDLD2, newDLD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DLD__DLD1:
				return basicSetDLD1(null, msgs);
			case V2xmlPackage.DLD__DLD2:
				return basicSetDLD2(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case V2xmlPackage.DLD__DLD1:
				return getDLD1();
			case V2xmlPackage.DLD__DLD2:
				return getDLD2();
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
			case V2xmlPackage.DLD__DLD1:
				setDLD1((DLD1CONTENT)newValue);
				return;
			case V2xmlPackage.DLD__DLD2:
				setDLD2((DLD2CONTENT)newValue);
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
			case V2xmlPackage.DLD__DLD1:
				setDLD1((DLD1CONTENT)null);
				return;
			case V2xmlPackage.DLD__DLD2:
				setDLD2((DLD2CONTENT)null);
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
			case V2xmlPackage.DLD__DLD1:
				return dLD1 != null;
			case V2xmlPackage.DLD__DLD2:
				return dLD2 != null;
		}
		return super.eIsSet(featureID);
	}

} //DLDImpl
