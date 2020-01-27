/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SRT;
import org.hl7.v2xml.SRT1CONTENT;
import org.hl7.v2xml.SRT2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SRT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SRTImpl#getSRT1 <em>SRT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SRTImpl#getSRT2 <em>SRT2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SRTImpl extends EObjectImpl implements SRT {
	/**
	 * The cached value of the '{@link #getSRT1() <em>SRT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRT1()
	 * @generated
	 * @ordered
	 */
	protected SRT1CONTENT sRT1;

	/**
	 * The cached value of the '{@link #getSRT2() <em>SRT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSRT2()
	 * @generated
	 * @ordered
	 */
	protected SRT2CONTENT sRT2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SRTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSRT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRT1CONTENT getSRT1() {
		return sRT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSRT1(SRT1CONTENT newSRT1, NotificationChain msgs) {
		SRT1CONTENT oldSRT1 = sRT1;
		sRT1 = newSRT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SRT__SRT1, oldSRT1, newSRT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSRT1(SRT1CONTENT newSRT1) {
		if (newSRT1 != sRT1) {
			NotificationChain msgs = null;
			if (sRT1 != null)
				msgs = ((InternalEObject)sRT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SRT__SRT1, null, msgs);
			if (newSRT1 != null)
				msgs = ((InternalEObject)newSRT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SRT__SRT1, null, msgs);
			msgs = basicSetSRT1(newSRT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SRT__SRT1, newSRT1, newSRT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SRT2CONTENT getSRT2() {
		return sRT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSRT2(SRT2CONTENT newSRT2, NotificationChain msgs) {
		SRT2CONTENT oldSRT2 = sRT2;
		sRT2 = newSRT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SRT__SRT2, oldSRT2, newSRT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSRT2(SRT2CONTENT newSRT2) {
		if (newSRT2 != sRT2) {
			NotificationChain msgs = null;
			if (sRT2 != null)
				msgs = ((InternalEObject)sRT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SRT__SRT2, null, msgs);
			if (newSRT2 != null)
				msgs = ((InternalEObject)newSRT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SRT__SRT2, null, msgs);
			msgs = basicSetSRT2(newSRT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SRT__SRT2, newSRT2, newSRT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SRT__SRT1:
				return basicSetSRT1(null, msgs);
			case V2xmlPackage.SRT__SRT2:
				return basicSetSRT2(null, msgs);
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
			case V2xmlPackage.SRT__SRT1:
				return getSRT1();
			case V2xmlPackage.SRT__SRT2:
				return getSRT2();
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
			case V2xmlPackage.SRT__SRT1:
				setSRT1((SRT1CONTENT)newValue);
				return;
			case V2xmlPackage.SRT__SRT2:
				setSRT2((SRT2CONTENT)newValue);
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
			case V2xmlPackage.SRT__SRT1:
				setSRT1((SRT1CONTENT)null);
				return;
			case V2xmlPackage.SRT__SRT2:
				setSRT2((SRT2CONTENT)null);
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
			case V2xmlPackage.SRT__SRT1:
				return sRT1 != null;
			case V2xmlPackage.SRT__SRT2:
				return sRT2 != null;
		}
		return super.eIsSet(featureID);
	}

} //SRTImpl
