/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DR;
import org.hl7.v2xml.DR1CONTENT;
import org.hl7.v2xml.DR2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DRImpl#getDR1 <em>DR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRImpl#getDR2 <em>DR2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DRImpl extends EObjectImpl implements DR {
	/**
	 * The cached value of the '{@link #getDR1() <em>DR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDR1()
	 * @generated
	 * @ordered
	 */
	protected DR1CONTENT dR1;

	/**
	 * The cached value of the '{@link #getDR2() <em>DR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDR2()
	 * @generated
	 * @ordered
	 */
	protected DR2CONTENT dR2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DR1CONTENT getDR1() {
		return dR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDR1(DR1CONTENT newDR1, NotificationChain msgs) {
		DR1CONTENT oldDR1 = dR1;
		dR1 = newDR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DR__DR1, oldDR1, newDR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDR1(DR1CONTENT newDR1) {
		if (newDR1 != dR1) {
			NotificationChain msgs = null;
			if (dR1 != null)
				msgs = ((InternalEObject)dR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DR__DR1, null, msgs);
			if (newDR1 != null)
				msgs = ((InternalEObject)newDR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DR__DR1, null, msgs);
			msgs = basicSetDR1(newDR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DR__DR1, newDR1, newDR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DR2CONTENT getDR2() {
		return dR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDR2(DR2CONTENT newDR2, NotificationChain msgs) {
		DR2CONTENT oldDR2 = dR2;
		dR2 = newDR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DR__DR2, oldDR2, newDR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDR2(DR2CONTENT newDR2) {
		if (newDR2 != dR2) {
			NotificationChain msgs = null;
			if (dR2 != null)
				msgs = ((InternalEObject)dR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DR__DR2, null, msgs);
			if (newDR2 != null)
				msgs = ((InternalEObject)newDR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DR__DR2, null, msgs);
			msgs = basicSetDR2(newDR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DR__DR2, newDR2, newDR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DR__DR1:
				return basicSetDR1(null, msgs);
			case V2xmlPackage.DR__DR2:
				return basicSetDR2(null, msgs);
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
			case V2xmlPackage.DR__DR1:
				return getDR1();
			case V2xmlPackage.DR__DR2:
				return getDR2();
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
			case V2xmlPackage.DR__DR1:
				setDR1((DR1CONTENT)newValue);
				return;
			case V2xmlPackage.DR__DR2:
				setDR2((DR2CONTENT)newValue);
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
			case V2xmlPackage.DR__DR1:
				setDR1((DR1CONTENT)null);
				return;
			case V2xmlPackage.DR__DR2:
				setDR2((DR2CONTENT)null);
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
			case V2xmlPackage.DR__DR1:
				return dR1 != null;
			case V2xmlPackage.DR__DR2:
				return dR2 != null;
		}
		return super.eIsSet(featureID);
	}

} //DRImpl
