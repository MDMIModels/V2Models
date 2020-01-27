/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.TS;
import org.hl7.v2xml.TS1CONTENT;
import org.hl7.v2xml.TS2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TSImpl#getTS1 <em>TS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TSImpl#getTS2 <em>TS2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSImpl extends EObjectImpl implements TS {
	/**
	 * The cached value of the '{@link #getTS1() <em>TS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTS1()
	 * @generated
	 * @ordered
	 */
	protected TS1CONTENT tS1;

	/**
	 * The cached value of the '{@link #getTS2() <em>TS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTS2()
	 * @generated
	 * @ordered
	 */
	protected TS2CONTENT tS2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS1CONTENT getTS1() {
		return tS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTS1(TS1CONTENT newTS1, NotificationChain msgs) {
		TS1CONTENT oldTS1 = tS1;
		tS1 = newTS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TS__TS1, oldTS1, newTS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTS1(TS1CONTENT newTS1) {
		if (newTS1 != tS1) {
			NotificationChain msgs = null;
			if (tS1 != null)
				msgs = ((InternalEObject)tS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TS__TS1, null, msgs);
			if (newTS1 != null)
				msgs = ((InternalEObject)newTS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TS__TS1, null, msgs);
			msgs = basicSetTS1(newTS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TS__TS1, newTS1, newTS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS2CONTENT getTS2() {
		return tS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTS2(TS2CONTENT newTS2, NotificationChain msgs) {
		TS2CONTENT oldTS2 = tS2;
		tS2 = newTS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TS__TS2, oldTS2, newTS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTS2(TS2CONTENT newTS2) {
		if (newTS2 != tS2) {
			NotificationChain msgs = null;
			if (tS2 != null)
				msgs = ((InternalEObject)tS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TS__TS2, null, msgs);
			if (newTS2 != null)
				msgs = ((InternalEObject)newTS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TS__TS2, null, msgs);
			msgs = basicSetTS2(newTS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TS__TS2, newTS2, newTS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.TS__TS1:
				return basicSetTS1(null, msgs);
			case V2xmlPackage.TS__TS2:
				return basicSetTS2(null, msgs);
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
			case V2xmlPackage.TS__TS1:
				return getTS1();
			case V2xmlPackage.TS__TS2:
				return getTS2();
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
			case V2xmlPackage.TS__TS1:
				setTS1((TS1CONTENT)newValue);
				return;
			case V2xmlPackage.TS__TS2:
				setTS2((TS2CONTENT)newValue);
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
			case V2xmlPackage.TS__TS1:
				setTS1((TS1CONTENT)null);
				return;
			case V2xmlPackage.TS__TS2:
				setTS2((TS2CONTENT)null);
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
			case V2xmlPackage.TS__TS1:
				return tS1 != null;
			case V2xmlPackage.TS__TS2:
				return tS2 != null;
		}
		return super.eIsSet(featureID);
	}

} //TSImpl
