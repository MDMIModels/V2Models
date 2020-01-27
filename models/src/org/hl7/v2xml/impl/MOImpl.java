/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.MO;
import org.hl7.v2xml.MO1CONTENT;
import org.hl7.v2xml.MO2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MOImpl#getMO1 <em>MO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MOImpl#getMO2 <em>MO2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOImpl extends EObjectImpl implements MO {
	/**
	 * The cached value of the '{@link #getMO1() <em>MO1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMO1()
	 * @generated
	 * @ordered
	 */
	protected MO1CONTENT mO1;

	/**
	 * The cached value of the '{@link #getMO2() <em>MO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMO2()
	 * @generated
	 * @ordered
	 */
	protected MO2CONTENT mO2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MO1CONTENT getMO1() {
		return mO1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMO1(MO1CONTENT newMO1, NotificationChain msgs) {
		MO1CONTENT oldMO1 = mO1;
		mO1 = newMO1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MO__MO1, oldMO1, newMO1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMO1(MO1CONTENT newMO1) {
		if (newMO1 != mO1) {
			NotificationChain msgs = null;
			if (mO1 != null)
				msgs = ((InternalEObject)mO1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MO__MO1, null, msgs);
			if (newMO1 != null)
				msgs = ((InternalEObject)newMO1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MO__MO1, null, msgs);
			msgs = basicSetMO1(newMO1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MO__MO1, newMO1, newMO1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MO2CONTENT getMO2() {
		return mO2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMO2(MO2CONTENT newMO2, NotificationChain msgs) {
		MO2CONTENT oldMO2 = mO2;
		mO2 = newMO2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MO__MO2, oldMO2, newMO2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMO2(MO2CONTENT newMO2) {
		if (newMO2 != mO2) {
			NotificationChain msgs = null;
			if (mO2 != null)
				msgs = ((InternalEObject)mO2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MO__MO2, null, msgs);
			if (newMO2 != null)
				msgs = ((InternalEObject)newMO2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MO__MO2, null, msgs);
			msgs = basicSetMO2(newMO2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MO__MO2, newMO2, newMO2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MO__MO1:
				return basicSetMO1(null, msgs);
			case V2xmlPackage.MO__MO2:
				return basicSetMO2(null, msgs);
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
			case V2xmlPackage.MO__MO1:
				return getMO1();
			case V2xmlPackage.MO__MO2:
				return getMO2();
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
			case V2xmlPackage.MO__MO1:
				setMO1((MO1CONTENT)newValue);
				return;
			case V2xmlPackage.MO__MO2:
				setMO2((MO2CONTENT)newValue);
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
			case V2xmlPackage.MO__MO1:
				setMO1((MO1CONTENT)null);
				return;
			case V2xmlPackage.MO__MO2:
				setMO2((MO2CONTENT)null);
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
			case V2xmlPackage.MO__MO1:
				return mO1 != null;
			case V2xmlPackage.MO__MO2:
				return mO2 != null;
		}
		return super.eIsSet(featureID);
	}

} //MOImpl
