/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.MSG;
import org.hl7.v2xml.MSG1CONTENT;
import org.hl7.v2xml.MSG2CONTENT;
import org.hl7.v2xml.MSG3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MSGImpl#getMSG1 <em>MSG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSGImpl#getMSG2 <em>MSG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSGImpl#getMSG3 <em>MSG3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSGImpl extends EObjectImpl implements MSG {
	/**
	 * The cached value of the '{@link #getMSG1() <em>MSG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSG1()
	 * @generated
	 * @ordered
	 */
	protected MSG1CONTENT mSG1;

	/**
	 * The cached value of the '{@link #getMSG2() <em>MSG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSG2()
	 * @generated
	 * @ordered
	 */
	protected MSG2CONTENT mSG2;

	/**
	 * The cached value of the '{@link #getMSG3() <em>MSG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSG3()
	 * @generated
	 * @ordered
	 */
	protected MSG3CONTENT mSG3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMSG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSG1CONTENT getMSG1() {
		return mSG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSG1(MSG1CONTENT newMSG1, NotificationChain msgs) {
		MSG1CONTENT oldMSG1 = mSG1;
		mSG1 = newMSG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG1, oldMSG1, newMSG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSG1(MSG1CONTENT newMSG1) {
		if (newMSG1 != mSG1) {
			NotificationChain msgs = null;
			if (mSG1 != null)
				msgs = ((InternalEObject)mSG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG1, null, msgs);
			if (newMSG1 != null)
				msgs = ((InternalEObject)newMSG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG1, null, msgs);
			msgs = basicSetMSG1(newMSG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG1, newMSG1, newMSG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSG2CONTENT getMSG2() {
		return mSG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSG2(MSG2CONTENT newMSG2, NotificationChain msgs) {
		MSG2CONTENT oldMSG2 = mSG2;
		mSG2 = newMSG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG2, oldMSG2, newMSG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSG2(MSG2CONTENT newMSG2) {
		if (newMSG2 != mSG2) {
			NotificationChain msgs = null;
			if (mSG2 != null)
				msgs = ((InternalEObject)mSG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG2, null, msgs);
			if (newMSG2 != null)
				msgs = ((InternalEObject)newMSG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG2, null, msgs);
			msgs = basicSetMSG2(newMSG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG2, newMSG2, newMSG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSG3CONTENT getMSG3() {
		return mSG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSG3(MSG3CONTENT newMSG3, NotificationChain msgs) {
		MSG3CONTENT oldMSG3 = mSG3;
		mSG3 = newMSG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG3, oldMSG3, newMSG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSG3(MSG3CONTENT newMSG3) {
		if (newMSG3 != mSG3) {
			NotificationChain msgs = null;
			if (mSG3 != null)
				msgs = ((InternalEObject)mSG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG3, null, msgs);
			if (newMSG3 != null)
				msgs = ((InternalEObject)newMSG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSG__MSG3, null, msgs);
			msgs = basicSetMSG3(newMSG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSG__MSG3, newMSG3, newMSG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MSG__MSG1:
				return basicSetMSG1(null, msgs);
			case V2xmlPackage.MSG__MSG2:
				return basicSetMSG2(null, msgs);
			case V2xmlPackage.MSG__MSG3:
				return basicSetMSG3(null, msgs);
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
			case V2xmlPackage.MSG__MSG1:
				return getMSG1();
			case V2xmlPackage.MSG__MSG2:
				return getMSG2();
			case V2xmlPackage.MSG__MSG3:
				return getMSG3();
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
			case V2xmlPackage.MSG__MSG1:
				setMSG1((MSG1CONTENT)newValue);
				return;
			case V2xmlPackage.MSG__MSG2:
				setMSG2((MSG2CONTENT)newValue);
				return;
			case V2xmlPackage.MSG__MSG3:
				setMSG3((MSG3CONTENT)newValue);
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
			case V2xmlPackage.MSG__MSG1:
				setMSG1((MSG1CONTENT)null);
				return;
			case V2xmlPackage.MSG__MSG2:
				setMSG2((MSG2CONTENT)null);
				return;
			case V2xmlPackage.MSG__MSG3:
				setMSG3((MSG3CONTENT)null);
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
			case V2xmlPackage.MSG__MSG1:
				return mSG1 != null;
			case V2xmlPackage.MSG__MSG2:
				return mSG2 != null;
			case V2xmlPackage.MSG__MSG3:
				return mSG3 != null;
		}
		return super.eIsSet(featureID);
	}

} //MSGImpl
