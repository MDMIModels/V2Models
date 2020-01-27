/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DDI;
import org.hl7.v2xml.DDI1CONTENT;
import org.hl7.v2xml.DDI2CONTENT;
import org.hl7.v2xml.DDI3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DDI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DDIImpl#getDDI1 <em>DDI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DDIImpl#getDDI2 <em>DDI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DDIImpl#getDDI3 <em>DDI3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDIImpl extends EObjectImpl implements DDI {
	/**
	 * The cached value of the '{@link #getDDI1() <em>DDI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDI1()
	 * @generated
	 * @ordered
	 */
	protected DDI1CONTENT dDI1;

	/**
	 * The cached value of the '{@link #getDDI2() <em>DDI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDI2()
	 * @generated
	 * @ordered
	 */
	protected DDI2CONTENT dDI2;

	/**
	 * The cached value of the '{@link #getDDI3() <em>DDI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDDI3()
	 * @generated
	 * @ordered
	 */
	protected DDI3CONTENT dDI3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DDIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDDI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDI1CONTENT getDDI1() {
		return dDI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDDI1(DDI1CONTENT newDDI1, NotificationChain msgs) {
		DDI1CONTENT oldDDI1 = dDI1;
		dDI1 = newDDI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI1, oldDDI1, newDDI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDI1(DDI1CONTENT newDDI1) {
		if (newDDI1 != dDI1) {
			NotificationChain msgs = null;
			if (dDI1 != null)
				msgs = ((InternalEObject)dDI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI1, null, msgs);
			if (newDDI1 != null)
				msgs = ((InternalEObject)newDDI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI1, null, msgs);
			msgs = basicSetDDI1(newDDI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI1, newDDI1, newDDI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDI2CONTENT getDDI2() {
		return dDI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDDI2(DDI2CONTENT newDDI2, NotificationChain msgs) {
		DDI2CONTENT oldDDI2 = dDI2;
		dDI2 = newDDI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI2, oldDDI2, newDDI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDI2(DDI2CONTENT newDDI2) {
		if (newDDI2 != dDI2) {
			NotificationChain msgs = null;
			if (dDI2 != null)
				msgs = ((InternalEObject)dDI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI2, null, msgs);
			if (newDDI2 != null)
				msgs = ((InternalEObject)newDDI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI2, null, msgs);
			msgs = basicSetDDI2(newDDI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI2, newDDI2, newDDI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDI3CONTENT getDDI3() {
		return dDI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDDI3(DDI3CONTENT newDDI3, NotificationChain msgs) {
		DDI3CONTENT oldDDI3 = dDI3;
		dDI3 = newDDI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI3, oldDDI3, newDDI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDDI3(DDI3CONTENT newDDI3) {
		if (newDDI3 != dDI3) {
			NotificationChain msgs = null;
			if (dDI3 != null)
				msgs = ((InternalEObject)dDI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI3, null, msgs);
			if (newDDI3 != null)
				msgs = ((InternalEObject)newDDI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DDI__DDI3, null, msgs);
			msgs = basicSetDDI3(newDDI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DDI__DDI3, newDDI3, newDDI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DDI__DDI1:
				return basicSetDDI1(null, msgs);
			case V2xmlPackage.DDI__DDI2:
				return basicSetDDI2(null, msgs);
			case V2xmlPackage.DDI__DDI3:
				return basicSetDDI3(null, msgs);
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
			case V2xmlPackage.DDI__DDI1:
				return getDDI1();
			case V2xmlPackage.DDI__DDI2:
				return getDDI2();
			case V2xmlPackage.DDI__DDI3:
				return getDDI3();
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
			case V2xmlPackage.DDI__DDI1:
				setDDI1((DDI1CONTENT)newValue);
				return;
			case V2xmlPackage.DDI__DDI2:
				setDDI2((DDI2CONTENT)newValue);
				return;
			case V2xmlPackage.DDI__DDI3:
				setDDI3((DDI3CONTENT)newValue);
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
			case V2xmlPackage.DDI__DDI1:
				setDDI1((DDI1CONTENT)null);
				return;
			case V2xmlPackage.DDI__DDI2:
				setDDI2((DDI2CONTENT)null);
				return;
			case V2xmlPackage.DDI__DDI3:
				setDDI3((DDI3CONTENT)null);
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
			case V2xmlPackage.DDI__DDI1:
				return dDI1 != null;
			case V2xmlPackage.DDI__DDI2:
				return dDI2 != null;
			case V2xmlPackage.DDI__DDI3:
				return dDI3 != null;
		}
		return super.eIsSet(featureID);
	}

} //DDIImpl
