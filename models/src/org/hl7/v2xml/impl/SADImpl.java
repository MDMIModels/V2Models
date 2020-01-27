/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SAD;
import org.hl7.v2xml.SAD1CONTENT;
import org.hl7.v2xml.SAD2CONTENT;
import org.hl7.v2xml.SAD3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SAD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SADImpl#getSAD1 <em>SAD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SADImpl#getSAD2 <em>SAD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SADImpl#getSAD3 <em>SAD3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SADImpl extends EObjectImpl implements SAD {
	/**
	 * The cached value of the '{@link #getSAD1() <em>SAD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAD1()
	 * @generated
	 * @ordered
	 */
	protected SAD1CONTENT sAD1;

	/**
	 * The cached value of the '{@link #getSAD2() <em>SAD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAD2()
	 * @generated
	 * @ordered
	 */
	protected SAD2CONTENT sAD2;

	/**
	 * The cached value of the '{@link #getSAD3() <em>SAD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSAD3()
	 * @generated
	 * @ordered
	 */
	protected SAD3CONTENT sAD3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSAD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAD1CONTENT getSAD1() {
		return sAD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAD1(SAD1CONTENT newSAD1, NotificationChain msgs) {
		SAD1CONTENT oldSAD1 = sAD1;
		sAD1 = newSAD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD1, oldSAD1, newSAD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAD1(SAD1CONTENT newSAD1) {
		if (newSAD1 != sAD1) {
			NotificationChain msgs = null;
			if (sAD1 != null)
				msgs = ((InternalEObject)sAD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD1, null, msgs);
			if (newSAD1 != null)
				msgs = ((InternalEObject)newSAD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD1, null, msgs);
			msgs = basicSetSAD1(newSAD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD1, newSAD1, newSAD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAD2CONTENT getSAD2() {
		return sAD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAD2(SAD2CONTENT newSAD2, NotificationChain msgs) {
		SAD2CONTENT oldSAD2 = sAD2;
		sAD2 = newSAD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD2, oldSAD2, newSAD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAD2(SAD2CONTENT newSAD2) {
		if (newSAD2 != sAD2) {
			NotificationChain msgs = null;
			if (sAD2 != null)
				msgs = ((InternalEObject)sAD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD2, null, msgs);
			if (newSAD2 != null)
				msgs = ((InternalEObject)newSAD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD2, null, msgs);
			msgs = basicSetSAD2(newSAD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD2, newSAD2, newSAD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAD3CONTENT getSAD3() {
		return sAD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSAD3(SAD3CONTENT newSAD3, NotificationChain msgs) {
		SAD3CONTENT oldSAD3 = sAD3;
		sAD3 = newSAD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD3, oldSAD3, newSAD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSAD3(SAD3CONTENT newSAD3) {
		if (newSAD3 != sAD3) {
			NotificationChain msgs = null;
			if (sAD3 != null)
				msgs = ((InternalEObject)sAD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD3, null, msgs);
			if (newSAD3 != null)
				msgs = ((InternalEObject)newSAD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SAD__SAD3, null, msgs);
			msgs = basicSetSAD3(newSAD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SAD__SAD3, newSAD3, newSAD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SAD__SAD1:
				return basicSetSAD1(null, msgs);
			case V2xmlPackage.SAD__SAD2:
				return basicSetSAD2(null, msgs);
			case V2xmlPackage.SAD__SAD3:
				return basicSetSAD3(null, msgs);
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
			case V2xmlPackage.SAD__SAD1:
				return getSAD1();
			case V2xmlPackage.SAD__SAD2:
				return getSAD2();
			case V2xmlPackage.SAD__SAD3:
				return getSAD3();
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
			case V2xmlPackage.SAD__SAD1:
				setSAD1((SAD1CONTENT)newValue);
				return;
			case V2xmlPackage.SAD__SAD2:
				setSAD2((SAD2CONTENT)newValue);
				return;
			case V2xmlPackage.SAD__SAD3:
				setSAD3((SAD3CONTENT)newValue);
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
			case V2xmlPackage.SAD__SAD1:
				setSAD1((SAD1CONTENT)null);
				return;
			case V2xmlPackage.SAD__SAD2:
				setSAD2((SAD2CONTENT)null);
				return;
			case V2xmlPackage.SAD__SAD3:
				setSAD3((SAD3CONTENT)null);
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
			case V2xmlPackage.SAD__SAD1:
				return sAD1 != null;
			case V2xmlPackage.SAD__SAD2:
				return sAD2 != null;
			case V2xmlPackage.SAD__SAD3:
				return sAD3 != null;
		}
		return super.eIsSet(featureID);
	}

} //SADImpl
