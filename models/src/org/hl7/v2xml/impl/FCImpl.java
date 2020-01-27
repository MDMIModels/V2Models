/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.FC;
import org.hl7.v2xml.FC1CONTENT;
import org.hl7.v2xml.FC2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FCImpl#getFC1 <em>FC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FCImpl#getFC2 <em>FC2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FCImpl extends EObjectImpl implements FC {
	/**
	 * The cached value of the '{@link #getFC1() <em>FC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFC1()
	 * @generated
	 * @ordered
	 */
	protected FC1CONTENT fC1;

	/**
	 * The cached value of the '{@link #getFC2() <em>FC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFC2()
	 * @generated
	 * @ordered
	 */
	protected FC2CONTENT fC2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FC1CONTENT getFC1() {
		return fC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFC1(FC1CONTENT newFC1, NotificationChain msgs) {
		FC1CONTENT oldFC1 = fC1;
		fC1 = newFC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FC__FC1, oldFC1, newFC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFC1(FC1CONTENT newFC1) {
		if (newFC1 != fC1) {
			NotificationChain msgs = null;
			if (fC1 != null)
				msgs = ((InternalEObject)fC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FC__FC1, null, msgs);
			if (newFC1 != null)
				msgs = ((InternalEObject)newFC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FC__FC1, null, msgs);
			msgs = basicSetFC1(newFC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FC__FC1, newFC1, newFC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FC2CONTENT getFC2() {
		return fC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFC2(FC2CONTENT newFC2, NotificationChain msgs) {
		FC2CONTENT oldFC2 = fC2;
		fC2 = newFC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FC__FC2, oldFC2, newFC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFC2(FC2CONTENT newFC2) {
		if (newFC2 != fC2) {
			NotificationChain msgs = null;
			if (fC2 != null)
				msgs = ((InternalEObject)fC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FC__FC2, null, msgs);
			if (newFC2 != null)
				msgs = ((InternalEObject)newFC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FC__FC2, null, msgs);
			msgs = basicSetFC2(newFC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FC__FC2, newFC2, newFC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.FC__FC1:
				return basicSetFC1(null, msgs);
			case V2xmlPackage.FC__FC2:
				return basicSetFC2(null, msgs);
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
			case V2xmlPackage.FC__FC1:
				return getFC1();
			case V2xmlPackage.FC__FC2:
				return getFC2();
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
			case V2xmlPackage.FC__FC1:
				setFC1((FC1CONTENT)newValue);
				return;
			case V2xmlPackage.FC__FC2:
				setFC2((FC2CONTENT)newValue);
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
			case V2xmlPackage.FC__FC1:
				setFC1((FC1CONTENT)null);
				return;
			case V2xmlPackage.FC__FC2:
				setFC2((FC2CONTENT)null);
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
			case V2xmlPackage.FC__FC1:
				return fC1 != null;
			case V2xmlPackage.FC__FC2:
				return fC2 != null;
		}
		return super.eIsSet(featureID);
	}

} //FCImpl
