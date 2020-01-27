/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RCD;
import org.hl7.v2xml.RCD1CONTENT;
import org.hl7.v2xml.RCD2CONTENT;
import org.hl7.v2xml.RCD3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RCDImpl#getRCD1 <em>RCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCDImpl#getRCD2 <em>RCD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCDImpl#getRCD3 <em>RCD3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RCDImpl extends EObjectImpl implements RCD {
	/**
	 * The cached value of the '{@link #getRCD1() <em>RCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCD1()
	 * @generated
	 * @ordered
	 */
	protected RCD1CONTENT rCD1;

	/**
	 * The cached value of the '{@link #getRCD2() <em>RCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCD2()
	 * @generated
	 * @ordered
	 */
	protected RCD2CONTENT rCD2;

	/**
	 * The cached value of the '{@link #getRCD3() <em>RCD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCD3()
	 * @generated
	 * @ordered
	 */
	protected RCD3CONTENT rCD3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RCDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRCD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCD1CONTENT getRCD1() {
		return rCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCD1(RCD1CONTENT newRCD1, NotificationChain msgs) {
		RCD1CONTENT oldRCD1 = rCD1;
		rCD1 = newRCD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD1, oldRCD1, newRCD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCD1(RCD1CONTENT newRCD1) {
		if (newRCD1 != rCD1) {
			NotificationChain msgs = null;
			if (rCD1 != null)
				msgs = ((InternalEObject)rCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD1, null, msgs);
			if (newRCD1 != null)
				msgs = ((InternalEObject)newRCD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD1, null, msgs);
			msgs = basicSetRCD1(newRCD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD1, newRCD1, newRCD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCD2CONTENT getRCD2() {
		return rCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCD2(RCD2CONTENT newRCD2, NotificationChain msgs) {
		RCD2CONTENT oldRCD2 = rCD2;
		rCD2 = newRCD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD2, oldRCD2, newRCD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCD2(RCD2CONTENT newRCD2) {
		if (newRCD2 != rCD2) {
			NotificationChain msgs = null;
			if (rCD2 != null)
				msgs = ((InternalEObject)rCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD2, null, msgs);
			if (newRCD2 != null)
				msgs = ((InternalEObject)newRCD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD2, null, msgs);
			msgs = basicSetRCD2(newRCD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD2, newRCD2, newRCD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCD3CONTENT getRCD3() {
		return rCD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCD3(RCD3CONTENT newRCD3, NotificationChain msgs) {
		RCD3CONTENT oldRCD3 = rCD3;
		rCD3 = newRCD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD3, oldRCD3, newRCD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCD3(RCD3CONTENT newRCD3) {
		if (newRCD3 != rCD3) {
			NotificationChain msgs = null;
			if (rCD3 != null)
				msgs = ((InternalEObject)rCD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD3, null, msgs);
			if (newRCD3 != null)
				msgs = ((InternalEObject)newRCD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCD__RCD3, null, msgs);
			msgs = basicSetRCD3(newRCD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCD__RCD3, newRCD3, newRCD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RCD__RCD1:
				return basicSetRCD1(null, msgs);
			case V2xmlPackage.RCD__RCD2:
				return basicSetRCD2(null, msgs);
			case V2xmlPackage.RCD__RCD3:
				return basicSetRCD3(null, msgs);
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
			case V2xmlPackage.RCD__RCD1:
				return getRCD1();
			case V2xmlPackage.RCD__RCD2:
				return getRCD2();
			case V2xmlPackage.RCD__RCD3:
				return getRCD3();
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
			case V2xmlPackage.RCD__RCD1:
				setRCD1((RCD1CONTENT)newValue);
				return;
			case V2xmlPackage.RCD__RCD2:
				setRCD2((RCD2CONTENT)newValue);
				return;
			case V2xmlPackage.RCD__RCD3:
				setRCD3((RCD3CONTENT)newValue);
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
			case V2xmlPackage.RCD__RCD1:
				setRCD1((RCD1CONTENT)null);
				return;
			case V2xmlPackage.RCD__RCD2:
				setRCD2((RCD2CONTENT)null);
				return;
			case V2xmlPackage.RCD__RCD3:
				setRCD3((RCD3CONTENT)null);
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
			case V2xmlPackage.RCD__RCD1:
				return rCD1 != null;
			case V2xmlPackage.RCD__RCD2:
				return rCD2 != null;
			case V2xmlPackage.RCD__RCD3:
				return rCD3 != null;
		}
		return super.eIsSet(featureID);
	}

} //RCDImpl
