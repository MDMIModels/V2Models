/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.OSP;
import org.hl7.v2xml.OSP1CONTENT;
import org.hl7.v2xml.OSP2CONTENT;
import org.hl7.v2xml.OSP3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OSPImpl#getOSP1 <em>OSP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSPImpl#getOSP2 <em>OSP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSPImpl#getOSP3 <em>OSP3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSPImpl extends EObjectImpl implements OSP {
	/**
	 * The cached value of the '{@link #getOSP1() <em>OSP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSP1()
	 * @generated
	 * @ordered
	 */
	protected OSP1CONTENT oSP1;

	/**
	 * The cached value of the '{@link #getOSP2() <em>OSP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSP2()
	 * @generated
	 * @ordered
	 */
	protected OSP2CONTENT oSP2;

	/**
	 * The cached value of the '{@link #getOSP3() <em>OSP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSP3()
	 * @generated
	 * @ordered
	 */
	protected OSP3CONTENT oSP3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOSP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSP1CONTENT getOSP1() {
		return oSP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSP1(OSP1CONTENT newOSP1, NotificationChain msgs) {
		OSP1CONTENT oldOSP1 = oSP1;
		oSP1 = newOSP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP1, oldOSP1, newOSP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSP1(OSP1CONTENT newOSP1) {
		if (newOSP1 != oSP1) {
			NotificationChain msgs = null;
			if (oSP1 != null)
				msgs = ((InternalEObject)oSP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP1, null, msgs);
			if (newOSP1 != null)
				msgs = ((InternalEObject)newOSP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP1, null, msgs);
			msgs = basicSetOSP1(newOSP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP1, newOSP1, newOSP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSP2CONTENT getOSP2() {
		return oSP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSP2(OSP2CONTENT newOSP2, NotificationChain msgs) {
		OSP2CONTENT oldOSP2 = oSP2;
		oSP2 = newOSP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP2, oldOSP2, newOSP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSP2(OSP2CONTENT newOSP2) {
		if (newOSP2 != oSP2) {
			NotificationChain msgs = null;
			if (oSP2 != null)
				msgs = ((InternalEObject)oSP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP2, null, msgs);
			if (newOSP2 != null)
				msgs = ((InternalEObject)newOSP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP2, null, msgs);
			msgs = basicSetOSP2(newOSP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP2, newOSP2, newOSP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSP3CONTENT getOSP3() {
		return oSP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSP3(OSP3CONTENT newOSP3, NotificationChain msgs) {
		OSP3CONTENT oldOSP3 = oSP3;
		oSP3 = newOSP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP3, oldOSP3, newOSP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSP3(OSP3CONTENT newOSP3) {
		if (newOSP3 != oSP3) {
			NotificationChain msgs = null;
			if (oSP3 != null)
				msgs = ((InternalEObject)oSP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP3, null, msgs);
			if (newOSP3 != null)
				msgs = ((InternalEObject)newOSP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSP__OSP3, null, msgs);
			msgs = basicSetOSP3(newOSP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSP__OSP3, newOSP3, newOSP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.OSP__OSP1:
				return basicSetOSP1(null, msgs);
			case V2xmlPackage.OSP__OSP2:
				return basicSetOSP2(null, msgs);
			case V2xmlPackage.OSP__OSP3:
				return basicSetOSP3(null, msgs);
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
			case V2xmlPackage.OSP__OSP1:
				return getOSP1();
			case V2xmlPackage.OSP__OSP2:
				return getOSP2();
			case V2xmlPackage.OSP__OSP3:
				return getOSP3();
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
			case V2xmlPackage.OSP__OSP1:
				setOSP1((OSP1CONTENT)newValue);
				return;
			case V2xmlPackage.OSP__OSP2:
				setOSP2((OSP2CONTENT)newValue);
				return;
			case V2xmlPackage.OSP__OSP3:
				setOSP3((OSP3CONTENT)newValue);
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
			case V2xmlPackage.OSP__OSP1:
				setOSP1((OSP1CONTENT)null);
				return;
			case V2xmlPackage.OSP__OSP2:
				setOSP2((OSP2CONTENT)null);
				return;
			case V2xmlPackage.OSP__OSP3:
				setOSP3((OSP3CONTENT)null);
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
			case V2xmlPackage.OSP__OSP1:
				return oSP1 != null;
			case V2xmlPackage.OSP__OSP2:
				return oSP2 != null;
			case V2xmlPackage.OSP__OSP3:
				return oSP3 != null;
		}
		return super.eIsSet(featureID);
	}

} //OSPImpl
