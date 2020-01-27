/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DLN;
import org.hl7.v2xml.DLN1CONTENT;
import org.hl7.v2xml.DLN2CONTENT;
import org.hl7.v2xml.DLN3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DLN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DLNImpl#getDLN1 <em>DLN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLNImpl#getDLN2 <em>DLN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLNImpl#getDLN3 <em>DLN3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DLNImpl extends EObjectImpl implements DLN {
	/**
	 * The cached value of the '{@link #getDLN1() <em>DLN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLN1()
	 * @generated
	 * @ordered
	 */
	protected DLN1CONTENT dLN1;

	/**
	 * The cached value of the '{@link #getDLN2() <em>DLN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLN2()
	 * @generated
	 * @ordered
	 */
	protected DLN2CONTENT dLN2;

	/**
	 * The cached value of the '{@link #getDLN3() <em>DLN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLN3()
	 * @generated
	 * @ordered
	 */
	protected DLN3CONTENT dLN3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DLNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDLN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLN1CONTENT getDLN1() {
		return dLN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLN1(DLN1CONTENT newDLN1, NotificationChain msgs) {
		DLN1CONTENT oldDLN1 = dLN1;
		dLN1 = newDLN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN1, oldDLN1, newDLN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLN1(DLN1CONTENT newDLN1) {
		if (newDLN1 != dLN1) {
			NotificationChain msgs = null;
			if (dLN1 != null)
				msgs = ((InternalEObject)dLN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN1, null, msgs);
			if (newDLN1 != null)
				msgs = ((InternalEObject)newDLN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN1, null, msgs);
			msgs = basicSetDLN1(newDLN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN1, newDLN1, newDLN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLN2CONTENT getDLN2() {
		return dLN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLN2(DLN2CONTENT newDLN2, NotificationChain msgs) {
		DLN2CONTENT oldDLN2 = dLN2;
		dLN2 = newDLN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN2, oldDLN2, newDLN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLN2(DLN2CONTENT newDLN2) {
		if (newDLN2 != dLN2) {
			NotificationChain msgs = null;
			if (dLN2 != null)
				msgs = ((InternalEObject)dLN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN2, null, msgs);
			if (newDLN2 != null)
				msgs = ((InternalEObject)newDLN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN2, null, msgs);
			msgs = basicSetDLN2(newDLN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN2, newDLN2, newDLN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLN3CONTENT getDLN3() {
		return dLN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLN3(DLN3CONTENT newDLN3, NotificationChain msgs) {
		DLN3CONTENT oldDLN3 = dLN3;
		dLN3 = newDLN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN3, oldDLN3, newDLN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLN3(DLN3CONTENT newDLN3) {
		if (newDLN3 != dLN3) {
			NotificationChain msgs = null;
			if (dLN3 != null)
				msgs = ((InternalEObject)dLN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN3, null, msgs);
			if (newDLN3 != null)
				msgs = ((InternalEObject)newDLN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLN__DLN3, null, msgs);
			msgs = basicSetDLN3(newDLN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLN__DLN3, newDLN3, newDLN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DLN__DLN1:
				return basicSetDLN1(null, msgs);
			case V2xmlPackage.DLN__DLN2:
				return basicSetDLN2(null, msgs);
			case V2xmlPackage.DLN__DLN3:
				return basicSetDLN3(null, msgs);
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
			case V2xmlPackage.DLN__DLN1:
				return getDLN1();
			case V2xmlPackage.DLN__DLN2:
				return getDLN2();
			case V2xmlPackage.DLN__DLN3:
				return getDLN3();
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
			case V2xmlPackage.DLN__DLN1:
				setDLN1((DLN1CONTENT)newValue);
				return;
			case V2xmlPackage.DLN__DLN2:
				setDLN2((DLN2CONTENT)newValue);
				return;
			case V2xmlPackage.DLN__DLN3:
				setDLN3((DLN3CONTENT)newValue);
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
			case V2xmlPackage.DLN__DLN1:
				setDLN1((DLN1CONTENT)null);
				return;
			case V2xmlPackage.DLN__DLN2:
				setDLN2((DLN2CONTENT)null);
				return;
			case V2xmlPackage.DLN__DLN3:
				setDLN3((DLN3CONTENT)null);
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
			case V2xmlPackage.DLN__DLN1:
				return dLN1 != null;
			case V2xmlPackage.DLN__DLN2:
				return dLN2 != null;
			case V2xmlPackage.DLN__DLN3:
				return dLN3 != null;
		}
		return super.eIsSet(featureID);
	}

} //DLNImpl
