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
import org.hl7.v2xml.VID;
import org.hl7.v2xml.VID1CONTENT;
import org.hl7.v2xml.VID2CONTENT;
import org.hl7.v2xml.VID3CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.VIDImpl#getVID1 <em>VID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VIDImpl#getVID2 <em>VID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VIDImpl#getVID3 <em>VID3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VIDImpl extends EObjectImpl implements VID {
	/**
	 * The cached value of the '{@link #getVID1() <em>VID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVID1()
	 * @generated
	 * @ordered
	 */
	protected VID1CONTENT vID1;

	/**
	 * The cached value of the '{@link #getVID2() <em>VID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVID2()
	 * @generated
	 * @ordered
	 */
	protected VID2CONTENT vID2;

	/**
	 * The cached value of the '{@link #getVID3() <em>VID3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVID3()
	 * @generated
	 * @ordered
	 */
	protected VID3CONTENT vID3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VIDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getVID();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VID1CONTENT getVID1() {
		return vID1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVID1(VID1CONTENT newVID1, NotificationChain msgs) {
		VID1CONTENT oldVID1 = vID1;
		vID1 = newVID1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID1, oldVID1, newVID1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVID1(VID1CONTENT newVID1) {
		if (newVID1 != vID1) {
			NotificationChain msgs = null;
			if (vID1 != null)
				msgs = ((InternalEObject)vID1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID1, null, msgs);
			if (newVID1 != null)
				msgs = ((InternalEObject)newVID1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID1, null, msgs);
			msgs = basicSetVID1(newVID1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID1, newVID1, newVID1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VID2CONTENT getVID2() {
		return vID2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVID2(VID2CONTENT newVID2, NotificationChain msgs) {
		VID2CONTENT oldVID2 = vID2;
		vID2 = newVID2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID2, oldVID2, newVID2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVID2(VID2CONTENT newVID2) {
		if (newVID2 != vID2) {
			NotificationChain msgs = null;
			if (vID2 != null)
				msgs = ((InternalEObject)vID2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID2, null, msgs);
			if (newVID2 != null)
				msgs = ((InternalEObject)newVID2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID2, null, msgs);
			msgs = basicSetVID2(newVID2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID2, newVID2, newVID2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VID3CONTENT getVID3() {
		return vID3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVID3(VID3CONTENT newVID3, NotificationChain msgs) {
		VID3CONTENT oldVID3 = vID3;
		vID3 = newVID3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID3, oldVID3, newVID3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVID3(VID3CONTENT newVID3) {
		if (newVID3 != vID3) {
			NotificationChain msgs = null;
			if (vID3 != null)
				msgs = ((InternalEObject)vID3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID3, null, msgs);
			if (newVID3 != null)
				msgs = ((InternalEObject)newVID3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VID__VID3, null, msgs);
			msgs = basicSetVID3(newVID3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VID__VID3, newVID3, newVID3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.VID__VID1:
				return basicSetVID1(null, msgs);
			case V2xmlPackage.VID__VID2:
				return basicSetVID2(null, msgs);
			case V2xmlPackage.VID__VID3:
				return basicSetVID3(null, msgs);
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
			case V2xmlPackage.VID__VID1:
				return getVID1();
			case V2xmlPackage.VID__VID2:
				return getVID2();
			case V2xmlPackage.VID__VID3:
				return getVID3();
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
			case V2xmlPackage.VID__VID1:
				setVID1((VID1CONTENT)newValue);
				return;
			case V2xmlPackage.VID__VID2:
				setVID2((VID2CONTENT)newValue);
				return;
			case V2xmlPackage.VID__VID3:
				setVID3((VID3CONTENT)newValue);
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
			case V2xmlPackage.VID__VID1:
				setVID1((VID1CONTENT)null);
				return;
			case V2xmlPackage.VID__VID2:
				setVID2((VID2CONTENT)null);
				return;
			case V2xmlPackage.VID__VID3:
				setVID3((VID3CONTENT)null);
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
			case V2xmlPackage.VID__VID1:
				return vID1 != null;
			case V2xmlPackage.VID__VID2:
				return vID2 != null;
			case V2xmlPackage.VID__VID3:
				return vID3 != null;
		}
		return super.eIsSet(featureID);
	}

} //VIDImpl
