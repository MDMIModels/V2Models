/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PT;
import org.hl7.v2xml.PT1CONTENT;
import org.hl7.v2xml.PT2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PTImpl#getPT1 <em>PT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTImpl#getPT2 <em>PT2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTImpl extends EObjectImpl implements PT {
	/**
	 * The cached value of the '{@link #getPT1() <em>PT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPT1()
	 * @generated
	 * @ordered
	 */
	protected PT1CONTENT pT1;

	/**
	 * The cached value of the '{@link #getPT2() <em>PT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPT2()
	 * @generated
	 * @ordered
	 */
	protected PT2CONTENT pT2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PT1CONTENT getPT1() {
		return pT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPT1(PT1CONTENT newPT1, NotificationChain msgs) {
		PT1CONTENT oldPT1 = pT1;
		pT1 = newPT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PT__PT1, oldPT1, newPT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPT1(PT1CONTENT newPT1) {
		if (newPT1 != pT1) {
			NotificationChain msgs = null;
			if (pT1 != null)
				msgs = ((InternalEObject)pT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PT__PT1, null, msgs);
			if (newPT1 != null)
				msgs = ((InternalEObject)newPT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PT__PT1, null, msgs);
			msgs = basicSetPT1(newPT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PT__PT1, newPT1, newPT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PT2CONTENT getPT2() {
		return pT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPT2(PT2CONTENT newPT2, NotificationChain msgs) {
		PT2CONTENT oldPT2 = pT2;
		pT2 = newPT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PT__PT2, oldPT2, newPT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPT2(PT2CONTENT newPT2) {
		if (newPT2 != pT2) {
			NotificationChain msgs = null;
			if (pT2 != null)
				msgs = ((InternalEObject)pT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PT__PT2, null, msgs);
			if (newPT2 != null)
				msgs = ((InternalEObject)newPT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PT__PT2, null, msgs);
			msgs = basicSetPT2(newPT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PT__PT2, newPT2, newPT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PT__PT1:
				return basicSetPT1(null, msgs);
			case V2xmlPackage.PT__PT2:
				return basicSetPT2(null, msgs);
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
			case V2xmlPackage.PT__PT1:
				return getPT1();
			case V2xmlPackage.PT__PT2:
				return getPT2();
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
			case V2xmlPackage.PT__PT1:
				setPT1((PT1CONTENT)newValue);
				return;
			case V2xmlPackage.PT__PT2:
				setPT2((PT2CONTENT)newValue);
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
			case V2xmlPackage.PT__PT1:
				setPT1((PT1CONTENT)null);
				return;
			case V2xmlPackage.PT__PT2:
				setPT2((PT2CONTENT)null);
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
			case V2xmlPackage.PT__PT1:
				return pT1 != null;
			case V2xmlPackage.PT__PT2:
				return pT2 != null;
		}
		return super.eIsSet(featureID);
	}

} //PTImpl
