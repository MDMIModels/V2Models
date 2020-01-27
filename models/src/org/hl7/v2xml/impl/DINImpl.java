/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DIN;
import org.hl7.v2xml.DIN1CONTENT;
import org.hl7.v2xml.DIN2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DIN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DINImpl#getDIN1 <em>DIN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DINImpl#getDIN2 <em>DIN2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DINImpl extends EObjectImpl implements DIN {
	/**
	 * The cached value of the '{@link #getDIN1() <em>DIN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIN1()
	 * @generated
	 * @ordered
	 */
	protected DIN1CONTENT dIN1;

	/**
	 * The cached value of the '{@link #getDIN2() <em>DIN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDIN2()
	 * @generated
	 * @ordered
	 */
	protected DIN2CONTENT dIN2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DINImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDIN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIN1CONTENT getDIN1() {
		return dIN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDIN1(DIN1CONTENT newDIN1, NotificationChain msgs) {
		DIN1CONTENT oldDIN1 = dIN1;
		dIN1 = newDIN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DIN__DIN1, oldDIN1, newDIN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDIN1(DIN1CONTENT newDIN1) {
		if (newDIN1 != dIN1) {
			NotificationChain msgs = null;
			if (dIN1 != null)
				msgs = ((InternalEObject)dIN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DIN__DIN1, null, msgs);
			if (newDIN1 != null)
				msgs = ((InternalEObject)newDIN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DIN__DIN1, null, msgs);
			msgs = basicSetDIN1(newDIN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DIN__DIN1, newDIN1, newDIN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DIN2CONTENT getDIN2() {
		return dIN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDIN2(DIN2CONTENT newDIN2, NotificationChain msgs) {
		DIN2CONTENT oldDIN2 = dIN2;
		dIN2 = newDIN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DIN__DIN2, oldDIN2, newDIN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDIN2(DIN2CONTENT newDIN2) {
		if (newDIN2 != dIN2) {
			NotificationChain msgs = null;
			if (dIN2 != null)
				msgs = ((InternalEObject)dIN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DIN__DIN2, null, msgs);
			if (newDIN2 != null)
				msgs = ((InternalEObject)newDIN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DIN__DIN2, null, msgs);
			msgs = basicSetDIN2(newDIN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DIN__DIN2, newDIN2, newDIN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DIN__DIN1:
				return basicSetDIN1(null, msgs);
			case V2xmlPackage.DIN__DIN2:
				return basicSetDIN2(null, msgs);
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
			case V2xmlPackage.DIN__DIN1:
				return getDIN1();
			case V2xmlPackage.DIN__DIN2:
				return getDIN2();
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
			case V2xmlPackage.DIN__DIN1:
				setDIN1((DIN1CONTENT)newValue);
				return;
			case V2xmlPackage.DIN__DIN2:
				setDIN2((DIN2CONTENT)newValue);
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
			case V2xmlPackage.DIN__DIN1:
				setDIN1((DIN1CONTENT)null);
				return;
			case V2xmlPackage.DIN__DIN2:
				setDIN2((DIN2CONTENT)null);
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
			case V2xmlPackage.DIN__DIN1:
				return dIN1 != null;
			case V2xmlPackage.DIN__DIN2:
				return dIN2 != null;
		}
		return super.eIsSet(featureID);
	}

} //DINImpl
