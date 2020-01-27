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
import org.hl7.v2xml.VR;
import org.hl7.v2xml.VR1CONTENT;
import org.hl7.v2xml.VR2CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.VRImpl#getVR1 <em>VR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VRImpl#getVR2 <em>VR2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VRImpl extends EObjectImpl implements VR {
	/**
	 * The cached value of the '{@link #getVR1() <em>VR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVR1()
	 * @generated
	 * @ordered
	 */
	protected VR1CONTENT vR1;

	/**
	 * The cached value of the '{@link #getVR2() <em>VR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVR2()
	 * @generated
	 * @ordered
	 */
	protected VR2CONTENT vR2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getVR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VR1CONTENT getVR1() {
		return vR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVR1(VR1CONTENT newVR1, NotificationChain msgs) {
		VR1CONTENT oldVR1 = vR1;
		vR1 = newVR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VR__VR1, oldVR1, newVR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVR1(VR1CONTENT newVR1) {
		if (newVR1 != vR1) {
			NotificationChain msgs = null;
			if (vR1 != null)
				msgs = ((InternalEObject)vR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VR__VR1, null, msgs);
			if (newVR1 != null)
				msgs = ((InternalEObject)newVR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VR__VR1, null, msgs);
			msgs = basicSetVR1(newVR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VR__VR1, newVR1, newVR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VR2CONTENT getVR2() {
		return vR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVR2(VR2CONTENT newVR2, NotificationChain msgs) {
		VR2CONTENT oldVR2 = vR2;
		vR2 = newVR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VR__VR2, oldVR2, newVR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVR2(VR2CONTENT newVR2) {
		if (newVR2 != vR2) {
			NotificationChain msgs = null;
			if (vR2 != null)
				msgs = ((InternalEObject)vR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VR__VR2, null, msgs);
			if (newVR2 != null)
				msgs = ((InternalEObject)newVR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VR__VR2, null, msgs);
			msgs = basicSetVR2(newVR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VR__VR2, newVR2, newVR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.VR__VR1:
				return basicSetVR1(null, msgs);
			case V2xmlPackage.VR__VR2:
				return basicSetVR2(null, msgs);
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
			case V2xmlPackage.VR__VR1:
				return getVR1();
			case V2xmlPackage.VR__VR2:
				return getVR2();
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
			case V2xmlPackage.VR__VR1:
				setVR1((VR1CONTENT)newValue);
				return;
			case V2xmlPackage.VR__VR2:
				setVR2((VR2CONTENT)newValue);
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
			case V2xmlPackage.VR__VR1:
				setVR1((VR1CONTENT)null);
				return;
			case V2xmlPackage.VR__VR2:
				setVR2((VR2CONTENT)null);
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
			case V2xmlPackage.VR__VR1:
				return vR1 != null;
			case V2xmlPackage.VR__VR2:
				return vR2 != null;
		}
		return super.eIsSet(featureID);
	}

} //VRImpl
