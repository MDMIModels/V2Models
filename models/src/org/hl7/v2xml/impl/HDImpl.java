/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.HD;
import org.hl7.v2xml.HD1CONTENT;
import org.hl7.v2xml.HD2CONTENT;
import org.hl7.v2xml.HD3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.HDImpl#getHD1 <em>HD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.HDImpl#getHD2 <em>HD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.HDImpl#getHD3 <em>HD3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HDImpl extends EObjectImpl implements HD {
	/**
	 * The cached value of the '{@link #getHD1() <em>HD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHD1()
	 * @generated
	 * @ordered
	 */
	protected HD1CONTENT hD1;

	/**
	 * The cached value of the '{@link #getHD2() <em>HD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHD2()
	 * @generated
	 * @ordered
	 */
	protected HD2CONTENT hD2;

	/**
	 * The cached value of the '{@link #getHD3() <em>HD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHD3()
	 * @generated
	 * @ordered
	 */
	protected HD3CONTENT hD3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getHD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HD1CONTENT getHD1() {
		return hD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHD1(HD1CONTENT newHD1, NotificationChain msgs) {
		HD1CONTENT oldHD1 = hD1;
		hD1 = newHD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD1, oldHD1, newHD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHD1(HD1CONTENT newHD1) {
		if (newHD1 != hD1) {
			NotificationChain msgs = null;
			if (hD1 != null)
				msgs = ((InternalEObject)hD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD1, null, msgs);
			if (newHD1 != null)
				msgs = ((InternalEObject)newHD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD1, null, msgs);
			msgs = basicSetHD1(newHD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD1, newHD1, newHD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HD2CONTENT getHD2() {
		return hD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHD2(HD2CONTENT newHD2, NotificationChain msgs) {
		HD2CONTENT oldHD2 = hD2;
		hD2 = newHD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD2, oldHD2, newHD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHD2(HD2CONTENT newHD2) {
		if (newHD2 != hD2) {
			NotificationChain msgs = null;
			if (hD2 != null)
				msgs = ((InternalEObject)hD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD2, null, msgs);
			if (newHD2 != null)
				msgs = ((InternalEObject)newHD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD2, null, msgs);
			msgs = basicSetHD2(newHD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD2, newHD2, newHD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HD3CONTENT getHD3() {
		return hD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHD3(HD3CONTENT newHD3, NotificationChain msgs) {
		HD3CONTENT oldHD3 = hD3;
		hD3 = newHD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD3, oldHD3, newHD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHD3(HD3CONTENT newHD3) {
		if (newHD3 != hD3) {
			NotificationChain msgs = null;
			if (hD3 != null)
				msgs = ((InternalEObject)hD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD3, null, msgs);
			if (newHD3 != null)
				msgs = ((InternalEObject)newHD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.HD__HD3, null, msgs);
			msgs = basicSetHD3(newHD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.HD__HD3, newHD3, newHD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.HD__HD1:
				return basicSetHD1(null, msgs);
			case V2xmlPackage.HD__HD2:
				return basicSetHD2(null, msgs);
			case V2xmlPackage.HD__HD3:
				return basicSetHD3(null, msgs);
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
			case V2xmlPackage.HD__HD1:
				return getHD1();
			case V2xmlPackage.HD__HD2:
				return getHD2();
			case V2xmlPackage.HD__HD3:
				return getHD3();
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
			case V2xmlPackage.HD__HD1:
				setHD1((HD1CONTENT)newValue);
				return;
			case V2xmlPackage.HD__HD2:
				setHD2((HD2CONTENT)newValue);
				return;
			case V2xmlPackage.HD__HD3:
				setHD3((HD3CONTENT)newValue);
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
			case V2xmlPackage.HD__HD1:
				setHD1((HD1CONTENT)null);
				return;
			case V2xmlPackage.HD__HD2:
				setHD2((HD2CONTENT)null);
				return;
			case V2xmlPackage.HD__HD3:
				setHD3((HD3CONTENT)null);
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
			case V2xmlPackage.HD__HD1:
				return hD1 != null;
			case V2xmlPackage.HD__HD2:
				return hD2 != null;
			case V2xmlPackage.HD__HD3:
				return hD3 != null;
		}
		return super.eIsSet(featureID);
	}

} //HDImpl
