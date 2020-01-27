/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SCV;
import org.hl7.v2xml.SCV1CONTENT;
import org.hl7.v2xml.SCV2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SCVImpl#getSCV1 <em>SCV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCVImpl#getSCV2 <em>SCV2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCVImpl extends EObjectImpl implements SCV {
	/**
	 * The cached value of the '{@link #getSCV1() <em>SCV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCV1()
	 * @generated
	 * @ordered
	 */
	protected SCV1CONTENT sCV1;

	/**
	 * The cached value of the '{@link #getSCV2() <em>SCV2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCV2()
	 * @generated
	 * @ordered
	 */
	protected SCV2CONTENT sCV2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SCVImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSCV();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCV1CONTENT getSCV1() {
		return sCV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCV1(SCV1CONTENT newSCV1, NotificationChain msgs) {
		SCV1CONTENT oldSCV1 = sCV1;
		sCV1 = newSCV1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCV__SCV1, oldSCV1, newSCV1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCV1(SCV1CONTENT newSCV1) {
		if (newSCV1 != sCV1) {
			NotificationChain msgs = null;
			if (sCV1 != null)
				msgs = ((InternalEObject)sCV1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCV__SCV1, null, msgs);
			if (newSCV1 != null)
				msgs = ((InternalEObject)newSCV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCV__SCV1, null, msgs);
			msgs = basicSetSCV1(newSCV1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCV__SCV1, newSCV1, newSCV1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCV2CONTENT getSCV2() {
		return sCV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCV2(SCV2CONTENT newSCV2, NotificationChain msgs) {
		SCV2CONTENT oldSCV2 = sCV2;
		sCV2 = newSCV2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCV__SCV2, oldSCV2, newSCV2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCV2(SCV2CONTENT newSCV2) {
		if (newSCV2 != sCV2) {
			NotificationChain msgs = null;
			if (sCV2 != null)
				msgs = ((InternalEObject)sCV2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCV__SCV2, null, msgs);
			if (newSCV2 != null)
				msgs = ((InternalEObject)newSCV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCV__SCV2, null, msgs);
			msgs = basicSetSCV2(newSCV2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCV__SCV2, newSCV2, newSCV2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SCV__SCV1:
				return basicSetSCV1(null, msgs);
			case V2xmlPackage.SCV__SCV2:
				return basicSetSCV2(null, msgs);
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
			case V2xmlPackage.SCV__SCV1:
				return getSCV1();
			case V2xmlPackage.SCV__SCV2:
				return getSCV2();
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
			case V2xmlPackage.SCV__SCV1:
				setSCV1((SCV1CONTENT)newValue);
				return;
			case V2xmlPackage.SCV__SCV2:
				setSCV2((SCV2CONTENT)newValue);
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
			case V2xmlPackage.SCV__SCV1:
				setSCV1((SCV1CONTENT)null);
				return;
			case V2xmlPackage.SCV__SCV2:
				setSCV2((SCV2CONTENT)null);
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
			case V2xmlPackage.SCV__SCV1:
				return sCV1 != null;
			case V2xmlPackage.SCV__SCV2:
				return sCV2 != null;
		}
		return super.eIsSet(featureID);
	}

} //SCVImpl
