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
import org.hl7.v2xml.WVS;
import org.hl7.v2xml.WVS1CONTENT;
import org.hl7.v2xml.WVS2CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WVS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.WVSImpl#getWVS1 <em>WVS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.WVSImpl#getWVS2 <em>WVS2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WVSImpl extends EObjectImpl implements WVS {
	/**
	 * The cached value of the '{@link #getWVS1() <em>WVS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWVS1()
	 * @generated
	 * @ordered
	 */
	protected WVS1CONTENT wVS1;

	/**
	 * The cached value of the '{@link #getWVS2() <em>WVS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWVS2()
	 * @generated
	 * @ordered
	 */
	protected WVS2CONTENT wVS2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WVSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getWVS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WVS1CONTENT getWVS1() {
		return wVS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWVS1(WVS1CONTENT newWVS1, NotificationChain msgs) {
		WVS1CONTENT oldWVS1 = wVS1;
		wVS1 = newWVS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVS__WVS1, oldWVS1, newWVS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWVS1(WVS1CONTENT newWVS1) {
		if (newWVS1 != wVS1) {
			NotificationChain msgs = null;
			if (wVS1 != null)
				msgs = ((InternalEObject)wVS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVS__WVS1, null, msgs);
			if (newWVS1 != null)
				msgs = ((InternalEObject)newWVS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVS__WVS1, null, msgs);
			msgs = basicSetWVS1(newWVS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVS__WVS1, newWVS1, newWVS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WVS2CONTENT getWVS2() {
		return wVS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWVS2(WVS2CONTENT newWVS2, NotificationChain msgs) {
		WVS2CONTENT oldWVS2 = wVS2;
		wVS2 = newWVS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVS__WVS2, oldWVS2, newWVS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWVS2(WVS2CONTENT newWVS2) {
		if (newWVS2 != wVS2) {
			NotificationChain msgs = null;
			if (wVS2 != null)
				msgs = ((InternalEObject)wVS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVS__WVS2, null, msgs);
			if (newWVS2 != null)
				msgs = ((InternalEObject)newWVS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.WVS__WVS2, null, msgs);
			msgs = basicSetWVS2(newWVS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.WVS__WVS2, newWVS2, newWVS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.WVS__WVS1:
				return basicSetWVS1(null, msgs);
			case V2xmlPackage.WVS__WVS2:
				return basicSetWVS2(null, msgs);
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
			case V2xmlPackage.WVS__WVS1:
				return getWVS1();
			case V2xmlPackage.WVS__WVS2:
				return getWVS2();
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
			case V2xmlPackage.WVS__WVS1:
				setWVS1((WVS1CONTENT)newValue);
				return;
			case V2xmlPackage.WVS__WVS2:
				setWVS2((WVS2CONTENT)newValue);
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
			case V2xmlPackage.WVS__WVS1:
				setWVS1((WVS1CONTENT)null);
				return;
			case V2xmlPackage.WVS__WVS2:
				setWVS2((WVS2CONTENT)null);
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
			case V2xmlPackage.WVS__WVS1:
				return wVS1 != null;
			case V2xmlPackage.WVS__WVS2:
				return wVS2 != null;
		}
		return super.eIsSet(featureID);
	}

} //WVSImpl
