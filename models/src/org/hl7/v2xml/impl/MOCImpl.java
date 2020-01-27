/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.MOC;
import org.hl7.v2xml.MOC1CONTENT;
import org.hl7.v2xml.MOC2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MOCImpl#getMOC1 <em>MOC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MOCImpl#getMOC2 <em>MOC2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOCImpl extends EObjectImpl implements MOC {
	/**
	 * The cached value of the '{@link #getMOC1() <em>MOC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOC1()
	 * @generated
	 * @ordered
	 */
	protected MOC1CONTENT mOC1;

	/**
	 * The cached value of the '{@link #getMOC2() <em>MOC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOC2()
	 * @generated
	 * @ordered
	 */
	protected MOC2CONTENT mOC2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMOC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOC1CONTENT getMOC1() {
		return mOC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOC1(MOC1CONTENT newMOC1, NotificationChain msgs) {
		MOC1CONTENT oldMOC1 = mOC1;
		mOC1 = newMOC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOC__MOC1, oldMOC1, newMOC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOC1(MOC1CONTENT newMOC1) {
		if (newMOC1 != mOC1) {
			NotificationChain msgs = null;
			if (mOC1 != null)
				msgs = ((InternalEObject)mOC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOC__MOC1, null, msgs);
			if (newMOC1 != null)
				msgs = ((InternalEObject)newMOC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOC__MOC1, null, msgs);
			msgs = basicSetMOC1(newMOC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOC__MOC1, newMOC1, newMOC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOC2CONTENT getMOC2() {
		return mOC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOC2(MOC2CONTENT newMOC2, NotificationChain msgs) {
		MOC2CONTENT oldMOC2 = mOC2;
		mOC2 = newMOC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOC__MOC2, oldMOC2, newMOC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOC2(MOC2CONTENT newMOC2) {
		if (newMOC2 != mOC2) {
			NotificationChain msgs = null;
			if (mOC2 != null)
				msgs = ((InternalEObject)mOC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOC__MOC2, null, msgs);
			if (newMOC2 != null)
				msgs = ((InternalEObject)newMOC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOC__MOC2, null, msgs);
			msgs = basicSetMOC2(newMOC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOC__MOC2, newMOC2, newMOC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MOC__MOC1:
				return basicSetMOC1(null, msgs);
			case V2xmlPackage.MOC__MOC2:
				return basicSetMOC2(null, msgs);
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
			case V2xmlPackage.MOC__MOC1:
				return getMOC1();
			case V2xmlPackage.MOC__MOC2:
				return getMOC2();
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
			case V2xmlPackage.MOC__MOC1:
				setMOC1((MOC1CONTENT)newValue);
				return;
			case V2xmlPackage.MOC__MOC2:
				setMOC2((MOC2CONTENT)newValue);
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
			case V2xmlPackage.MOC__MOC1:
				setMOC1((MOC1CONTENT)null);
				return;
			case V2xmlPackage.MOC__MOC2:
				setMOC2((MOC2CONTENT)null);
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
			case V2xmlPackage.MOC__MOC1:
				return mOC1 != null;
			case V2xmlPackage.MOC__MOC2:
				return mOC2 != null;
		}
		return super.eIsSet(featureID);
	}

} //MOCImpl
