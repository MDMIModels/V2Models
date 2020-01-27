/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.OCD;
import org.hl7.v2xml.OCD1CONTENT;
import org.hl7.v2xml.OCD2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OCDImpl#getOCD1 <em>OCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OCDImpl#getOCD2 <em>OCD2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OCDImpl extends EObjectImpl implements OCD {
	/**
	 * The cached value of the '{@link #getOCD1() <em>OCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCD1()
	 * @generated
	 * @ordered
	 */
	protected OCD1CONTENT oCD1;

	/**
	 * The cached value of the '{@link #getOCD2() <em>OCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCD2()
	 * @generated
	 * @ordered
	 */
	protected OCD2CONTENT oCD2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOCD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCD1CONTENT getOCD1() {
		return oCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOCD1(OCD1CONTENT newOCD1, NotificationChain msgs) {
		OCD1CONTENT oldOCD1 = oCD1;
		oCD1 = newOCD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OCD__OCD1, oldOCD1, newOCD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOCD1(OCD1CONTENT newOCD1) {
		if (newOCD1 != oCD1) {
			NotificationChain msgs = null;
			if (oCD1 != null)
				msgs = ((InternalEObject)oCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OCD__OCD1, null, msgs);
			if (newOCD1 != null)
				msgs = ((InternalEObject)newOCD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OCD__OCD1, null, msgs);
			msgs = basicSetOCD1(newOCD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OCD__OCD1, newOCD1, newOCD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCD2CONTENT getOCD2() {
		return oCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOCD2(OCD2CONTENT newOCD2, NotificationChain msgs) {
		OCD2CONTENT oldOCD2 = oCD2;
		oCD2 = newOCD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OCD__OCD2, oldOCD2, newOCD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOCD2(OCD2CONTENT newOCD2) {
		if (newOCD2 != oCD2) {
			NotificationChain msgs = null;
			if (oCD2 != null)
				msgs = ((InternalEObject)oCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OCD__OCD2, null, msgs);
			if (newOCD2 != null)
				msgs = ((InternalEObject)newOCD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OCD__OCD2, null, msgs);
			msgs = basicSetOCD2(newOCD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OCD__OCD2, newOCD2, newOCD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.OCD__OCD1:
				return basicSetOCD1(null, msgs);
			case V2xmlPackage.OCD__OCD2:
				return basicSetOCD2(null, msgs);
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
			case V2xmlPackage.OCD__OCD1:
				return getOCD1();
			case V2xmlPackage.OCD__OCD2:
				return getOCD2();
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
			case V2xmlPackage.OCD__OCD1:
				setOCD1((OCD1CONTENT)newValue);
				return;
			case V2xmlPackage.OCD__OCD2:
				setOCD2((OCD2CONTENT)newValue);
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
			case V2xmlPackage.OCD__OCD1:
				setOCD1((OCD1CONTENT)null);
				return;
			case V2xmlPackage.OCD__OCD2:
				setOCD2((OCD2CONTENT)null);
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
			case V2xmlPackage.OCD__OCD1:
				return oCD1 != null;
			case V2xmlPackage.OCD__OCD2:
				return oCD2 != null;
		}
		return super.eIsSet(featureID);
	}

} //OCDImpl
