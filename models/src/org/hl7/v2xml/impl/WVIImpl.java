/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.V2xmlPackage;
import org.hl7.v2xml.WVI;
import org.hl7.v2xml.WVI1CONTENT;
import org.hl7.v2xml.WVI2CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WVI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.WVIImpl#getWVI1 <em>WVI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.WVIImpl#getWVI2 <em>WVI2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WVIImpl extends EObjectImpl implements WVI {
	/**
	 * The cached value of the '{@link #getWVI1() <em>WVI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWVI1()
	 * @generated
	 * @ordered
	 */
	protected WVI1CONTENT wVI1;

	/**
	 * The cached value of the '{@link #getWVI2() <em>WVI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWVI2()
	 * @generated
	 * @ordered
	 */
	protected WVI2CONTENT wVI2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WVIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getWVI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WVI1CONTENT getWVI1() {
		return wVI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWVI1(WVI1CONTENT newWVI1, NotificationChain msgs) {
		WVI1CONTENT oldWVI1 = wVI1;
		wVI1 = newWVI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVI__WVI1, oldWVI1, newWVI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWVI1(WVI1CONTENT newWVI1) {
		if (newWVI1 != wVI1) {
			NotificationChain msgs = null;
			if (wVI1 != null)
				msgs = ((InternalEObject)wVI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVI__WVI1, null, msgs);
			if (newWVI1 != null)
				msgs = ((InternalEObject)newWVI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVI__WVI1, null, msgs);
			msgs = basicSetWVI1(newWVI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVI__WVI1, newWVI1, newWVI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WVI2CONTENT getWVI2() {
		return wVI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWVI2(WVI2CONTENT newWVI2, NotificationChain msgs) {
		WVI2CONTENT oldWVI2 = wVI2;
		wVI2 = newWVI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVI__WVI2, oldWVI2, newWVI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWVI2(WVI2CONTENT newWVI2) {
		if (newWVI2 != wVI2) {
			NotificationChain msgs = null;
			if (wVI2 != null)
				msgs = ((InternalEObject)wVI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVI__WVI2, null, msgs);
			if (newWVI2 != null)
				msgs = ((InternalEObject)newWVI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVI__WVI2, null, msgs);
			msgs = basicSetWVI2(newWVI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVI__WVI2, newWVI2, newWVI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.WVI__WVI1:
				return basicSetWVI1(null, msgs);
			case V2xmlPackage.WVI__WVI2:
				return basicSetWVI2(null, msgs);
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
			case V2xmlPackage.WVI__WVI1:
				return getWVI1();
			case V2xmlPackage.WVI__WVI2:
				return getWVI2();
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
			case V2xmlPackage.WVI__WVI1:
				setWVI1((WVI1CONTENT)newValue);
				return;
			case V2xmlPackage.WVI__WVI2:
				setWVI2((WVI2CONTENT)newValue);
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
			case V2xmlPackage.WVI__WVI1:
				setWVI1((WVI1CONTENT)null);
				return;
			case V2xmlPackage.WVI__WVI2:
				setWVI2((WVI2CONTENT)null);
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
			case V2xmlPackage.WVI__WVI1:
				return wVI1 != null;
			case V2xmlPackage.WVI__WVI2:
				return wVI2 != null;
		}
		return super.eIsSet(featureID);
	}

} //WVIImpl
