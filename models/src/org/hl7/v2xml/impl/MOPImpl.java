/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.MOP;
import org.hl7.v2xml.MOP1CONTENT;
import org.hl7.v2xml.MOP2CONTENT;
import org.hl7.v2xml.MOP3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MOP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MOPImpl#getMOP1 <em>MOP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MOPImpl#getMOP2 <em>MOP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MOPImpl#getMOP3 <em>MOP3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MOPImpl extends EObjectImpl implements MOP {
	/**
	 * The cached value of the '{@link #getMOP1() <em>MOP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOP1()
	 * @generated
	 * @ordered
	 */
	protected MOP1CONTENT mOP1;

	/**
	 * The cached value of the '{@link #getMOP2() <em>MOP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOP2()
	 * @generated
	 * @ordered
	 */
	protected MOP2CONTENT mOP2;

	/**
	 * The cached value of the '{@link #getMOP3() <em>MOP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMOP3()
	 * @generated
	 * @ordered
	 */
	protected MOP3CONTENT mOP3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MOPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMOP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOP1CONTENT getMOP1() {
		return mOP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOP1(MOP1CONTENT newMOP1, NotificationChain msgs) {
		MOP1CONTENT oldMOP1 = mOP1;
		mOP1 = newMOP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP1, oldMOP1, newMOP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOP1(MOP1CONTENT newMOP1) {
		if (newMOP1 != mOP1) {
			NotificationChain msgs = null;
			if (mOP1 != null)
				msgs = ((InternalEObject)mOP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP1, null, msgs);
			if (newMOP1 != null)
				msgs = ((InternalEObject)newMOP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP1, null, msgs);
			msgs = basicSetMOP1(newMOP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP1, newMOP1, newMOP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOP2CONTENT getMOP2() {
		return mOP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOP2(MOP2CONTENT newMOP2, NotificationChain msgs) {
		MOP2CONTENT oldMOP2 = mOP2;
		mOP2 = newMOP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP2, oldMOP2, newMOP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOP2(MOP2CONTENT newMOP2) {
		if (newMOP2 != mOP2) {
			NotificationChain msgs = null;
			if (mOP2 != null)
				msgs = ((InternalEObject)mOP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP2, null, msgs);
			if (newMOP2 != null)
				msgs = ((InternalEObject)newMOP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP2, null, msgs);
			msgs = basicSetMOP2(newMOP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP2, newMOP2, newMOP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOP3CONTENT getMOP3() {
		return mOP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMOP3(MOP3CONTENT newMOP3, NotificationChain msgs) {
		MOP3CONTENT oldMOP3 = mOP3;
		mOP3 = newMOP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP3, oldMOP3, newMOP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMOP3(MOP3CONTENT newMOP3) {
		if (newMOP3 != mOP3) {
			NotificationChain msgs = null;
			if (mOP3 != null)
				msgs = ((InternalEObject)mOP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP3, null, msgs);
			if (newMOP3 != null)
				msgs = ((InternalEObject)newMOP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MOP__MOP3, null, msgs);
			msgs = basicSetMOP3(newMOP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MOP__MOP3, newMOP3, newMOP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MOP__MOP1:
				return basicSetMOP1(null, msgs);
			case V2xmlPackage.MOP__MOP2:
				return basicSetMOP2(null, msgs);
			case V2xmlPackage.MOP__MOP3:
				return basicSetMOP3(null, msgs);
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
			case V2xmlPackage.MOP__MOP1:
				return getMOP1();
			case V2xmlPackage.MOP__MOP2:
				return getMOP2();
			case V2xmlPackage.MOP__MOP3:
				return getMOP3();
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
			case V2xmlPackage.MOP__MOP1:
				setMOP1((MOP1CONTENT)newValue);
				return;
			case V2xmlPackage.MOP__MOP2:
				setMOP2((MOP2CONTENT)newValue);
				return;
			case V2xmlPackage.MOP__MOP3:
				setMOP3((MOP3CONTENT)newValue);
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
			case V2xmlPackage.MOP__MOP1:
				setMOP1((MOP1CONTENT)null);
				return;
			case V2xmlPackage.MOP__MOP2:
				setMOP2((MOP2CONTENT)null);
				return;
			case V2xmlPackage.MOP__MOP3:
				setMOP3((MOP3CONTENT)null);
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
			case V2xmlPackage.MOP__MOP1:
				return mOP1 != null;
			case V2xmlPackage.MOP__MOP2:
				return mOP2 != null;
			case V2xmlPackage.MOP__MOP3:
				return mOP3 != null;
		}
		return super.eIsSet(featureID);
	}

} //MOPImpl
