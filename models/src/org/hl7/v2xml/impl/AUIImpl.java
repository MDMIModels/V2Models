/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.AUI;
import org.hl7.v2xml.AUI1CONTENT;
import org.hl7.v2xml.AUI2CONTENT;
import org.hl7.v2xml.AUI3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AUI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AUIImpl#getAUI1 <em>AUI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUIImpl#getAUI2 <em>AUI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUIImpl#getAUI3 <em>AUI3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AUIImpl extends EObjectImpl implements AUI {
	/**
	 * The cached value of the '{@link #getAUI1() <em>AUI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUI1()
	 * @generated
	 * @ordered
	 */
	protected AUI1CONTENT aUI1;

	/**
	 * The cached value of the '{@link #getAUI2() <em>AUI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUI2()
	 * @generated
	 * @ordered
	 */
	protected AUI2CONTENT aUI2;

	/**
	 * The cached value of the '{@link #getAUI3() <em>AUI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUI3()
	 * @generated
	 * @ordered
	 */
	protected AUI3CONTENT aUI3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AUIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAUI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUI1CONTENT getAUI1() {
		return aUI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUI1(AUI1CONTENT newAUI1, NotificationChain msgs) {
		AUI1CONTENT oldAUI1 = aUI1;
		aUI1 = newAUI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI1, oldAUI1, newAUI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUI1(AUI1CONTENT newAUI1) {
		if (newAUI1 != aUI1) {
			NotificationChain msgs = null;
			if (aUI1 != null)
				msgs = ((InternalEObject)aUI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI1, null, msgs);
			if (newAUI1 != null)
				msgs = ((InternalEObject)newAUI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI1, null, msgs);
			msgs = basicSetAUI1(newAUI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI1, newAUI1, newAUI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUI2CONTENT getAUI2() {
		return aUI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUI2(AUI2CONTENT newAUI2, NotificationChain msgs) {
		AUI2CONTENT oldAUI2 = aUI2;
		aUI2 = newAUI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI2, oldAUI2, newAUI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUI2(AUI2CONTENT newAUI2) {
		if (newAUI2 != aUI2) {
			NotificationChain msgs = null;
			if (aUI2 != null)
				msgs = ((InternalEObject)aUI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI2, null, msgs);
			if (newAUI2 != null)
				msgs = ((InternalEObject)newAUI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI2, null, msgs);
			msgs = basicSetAUI2(newAUI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI2, newAUI2, newAUI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUI3CONTENT getAUI3() {
		return aUI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUI3(AUI3CONTENT newAUI3, NotificationChain msgs) {
		AUI3CONTENT oldAUI3 = aUI3;
		aUI3 = newAUI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI3, oldAUI3, newAUI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUI3(AUI3CONTENT newAUI3) {
		if (newAUI3 != aUI3) {
			NotificationChain msgs = null;
			if (aUI3 != null)
				msgs = ((InternalEObject)aUI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI3, null, msgs);
			if (newAUI3 != null)
				msgs = ((InternalEObject)newAUI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUI__AUI3, null, msgs);
			msgs = basicSetAUI3(newAUI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUI__AUI3, newAUI3, newAUI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.AUI__AUI1:
				return basicSetAUI1(null, msgs);
			case V2xmlPackage.AUI__AUI2:
				return basicSetAUI2(null, msgs);
			case V2xmlPackage.AUI__AUI3:
				return basicSetAUI3(null, msgs);
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
			case V2xmlPackage.AUI__AUI1:
				return getAUI1();
			case V2xmlPackage.AUI__AUI2:
				return getAUI2();
			case V2xmlPackage.AUI__AUI3:
				return getAUI3();
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
			case V2xmlPackage.AUI__AUI1:
				setAUI1((AUI1CONTENT)newValue);
				return;
			case V2xmlPackage.AUI__AUI2:
				setAUI2((AUI2CONTENT)newValue);
				return;
			case V2xmlPackage.AUI__AUI3:
				setAUI3((AUI3CONTENT)newValue);
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
			case V2xmlPackage.AUI__AUI1:
				setAUI1((AUI1CONTENT)null);
				return;
			case V2xmlPackage.AUI__AUI2:
				setAUI2((AUI2CONTENT)null);
				return;
			case V2xmlPackage.AUI__AUI3:
				setAUI3((AUI3CONTENT)null);
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
			case V2xmlPackage.AUI__AUI1:
				return aUI1 != null;
			case V2xmlPackage.AUI__AUI2:
				return aUI2 != null;
			case V2xmlPackage.AUI__AUI3:
				return aUI3 != null;
		}
		return super.eIsSet(featureID);
	}

} //AUIImpl
