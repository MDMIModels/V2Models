/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DTN;
import org.hl7.v2xml.DTN1CONTENT;
import org.hl7.v2xml.DTN2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DTNImpl#getDTN1 <em>DTN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DTNImpl#getDTN2 <em>DTN2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DTNImpl extends EObjectImpl implements DTN {
	/**
	 * The cached value of the '{@link #getDTN1() <em>DTN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTN1()
	 * @generated
	 * @ordered
	 */
	protected DTN1CONTENT dTN1;

	/**
	 * The cached value of the '{@link #getDTN2() <em>DTN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDTN2()
	 * @generated
	 * @ordered
	 */
	protected DTN2CONTENT dTN2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDTN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTN1CONTENT getDTN1() {
		return dTN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDTN1(DTN1CONTENT newDTN1, NotificationChain msgs) {
		DTN1CONTENT oldDTN1 = dTN1;
		dTN1 = newDTN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DTN__DTN1, oldDTN1, newDTN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTN1(DTN1CONTENT newDTN1) {
		if (newDTN1 != dTN1) {
			NotificationChain msgs = null;
			if (dTN1 != null)
				msgs = ((InternalEObject)dTN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DTN__DTN1, null, msgs);
			if (newDTN1 != null)
				msgs = ((InternalEObject)newDTN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DTN__DTN1, null, msgs);
			msgs = basicSetDTN1(newDTN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DTN__DTN1, newDTN1, newDTN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTN2CONTENT getDTN2() {
		return dTN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDTN2(DTN2CONTENT newDTN2, NotificationChain msgs) {
		DTN2CONTENT oldDTN2 = dTN2;
		dTN2 = newDTN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DTN__DTN2, oldDTN2, newDTN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDTN2(DTN2CONTENT newDTN2) {
		if (newDTN2 != dTN2) {
			NotificationChain msgs = null;
			if (dTN2 != null)
				msgs = ((InternalEObject)dTN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DTN__DTN2, null, msgs);
			if (newDTN2 != null)
				msgs = ((InternalEObject)newDTN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DTN__DTN2, null, msgs);
			msgs = basicSetDTN2(newDTN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DTN__DTN2, newDTN2, newDTN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DTN__DTN1:
				return basicSetDTN1(null, msgs);
			case V2xmlPackage.DTN__DTN2:
				return basicSetDTN2(null, msgs);
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
			case V2xmlPackage.DTN__DTN1:
				return getDTN1();
			case V2xmlPackage.DTN__DTN2:
				return getDTN2();
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
			case V2xmlPackage.DTN__DTN1:
				setDTN1((DTN1CONTENT)newValue);
				return;
			case V2xmlPackage.DTN__DTN2:
				setDTN2((DTN2CONTENT)newValue);
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
			case V2xmlPackage.DTN__DTN1:
				setDTN1((DTN1CONTENT)null);
				return;
			case V2xmlPackage.DTN__DTN2:
				setDTN2((DTN2CONTENT)null);
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
			case V2xmlPackage.DTN__DTN1:
				return dTN1 != null;
			case V2xmlPackage.DTN__DTN2:
				return dTN2 != null;
		}
		return super.eIsSet(featureID);
	}

} //DTNImpl
