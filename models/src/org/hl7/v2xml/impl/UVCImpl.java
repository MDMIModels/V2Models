/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.UVC;
import org.hl7.v2xml.UVC1CONTENT;
import org.hl7.v2xml.UVC2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UVC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.UVCImpl#getUVC1 <em>UVC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UVCImpl#getUVC2 <em>UVC2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UVCImpl extends EObjectImpl implements UVC {
	/**
	 * The cached value of the '{@link #getUVC1() <em>UVC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUVC1()
	 * @generated
	 * @ordered
	 */
	protected UVC1CONTENT uVC1;

	/**
	 * The cached value of the '{@link #getUVC2() <em>UVC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUVC2()
	 * @generated
	 * @ordered
	 */
	protected UVC2CONTENT uVC2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UVCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getUVC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UVC1CONTENT getUVC1() {
		return uVC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUVC1(UVC1CONTENT newUVC1, NotificationChain msgs) {
		UVC1CONTENT oldUVC1 = uVC1;
		uVC1 = newUVC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UVC__UVC1, oldUVC1, newUVC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUVC1(UVC1CONTENT newUVC1) {
		if (newUVC1 != uVC1) {
			NotificationChain msgs = null;
			if (uVC1 != null)
				msgs = ((InternalEObject)uVC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UVC__UVC1, null, msgs);
			if (newUVC1 != null)
				msgs = ((InternalEObject)newUVC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UVC__UVC1, null, msgs);
			msgs = basicSetUVC1(newUVC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UVC__UVC1, newUVC1, newUVC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UVC2CONTENT getUVC2() {
		return uVC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUVC2(UVC2CONTENT newUVC2, NotificationChain msgs) {
		UVC2CONTENT oldUVC2 = uVC2;
		uVC2 = newUVC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UVC__UVC2, oldUVC2, newUVC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUVC2(UVC2CONTENT newUVC2) {
		if (newUVC2 != uVC2) {
			NotificationChain msgs = null;
			if (uVC2 != null)
				msgs = ((InternalEObject)uVC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UVC__UVC2, null, msgs);
			if (newUVC2 != null)
				msgs = ((InternalEObject)newUVC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UVC__UVC2, null, msgs);
			msgs = basicSetUVC2(newUVC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UVC__UVC2, newUVC2, newUVC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.UVC__UVC1:
				return basicSetUVC1(null, msgs);
			case V2xmlPackage.UVC__UVC2:
				return basicSetUVC2(null, msgs);
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
			case V2xmlPackage.UVC__UVC1:
				return getUVC1();
			case V2xmlPackage.UVC__UVC2:
				return getUVC2();
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
			case V2xmlPackage.UVC__UVC1:
				setUVC1((UVC1CONTENT)newValue);
				return;
			case V2xmlPackage.UVC__UVC2:
				setUVC2((UVC2CONTENT)newValue);
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
			case V2xmlPackage.UVC__UVC1:
				setUVC1((UVC1CONTENT)null);
				return;
			case V2xmlPackage.UVC__UVC2:
				setUVC2((UVC2CONTENT)null);
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
			case V2xmlPackage.UVC__UVC1:
				return uVC1 != null;
			case V2xmlPackage.UVC__UVC2:
				return uVC2 != null;
		}
		return super.eIsSet(featureID);
	}

} //UVCImpl
