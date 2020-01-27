/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.NR;
import org.hl7.v2xml.NR1CONTENT;
import org.hl7.v2xml.NR2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NRImpl#getNR1 <em>NR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NRImpl#getNR2 <em>NR2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NRImpl extends EObjectImpl implements NR {
	/**
	 * The cached value of the '{@link #getNR1() <em>NR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNR1()
	 * @generated
	 * @ordered
	 */
	protected NR1CONTENT nR1;

	/**
	 * The cached value of the '{@link #getNR2() <em>NR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNR2()
	 * @generated
	 * @ordered
	 */
	protected NR2CONTENT nR2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NR1CONTENT getNR1() {
		return nR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNR1(NR1CONTENT newNR1, NotificationChain msgs) {
		NR1CONTENT oldNR1 = nR1;
		nR1 = newNR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NR__NR1, oldNR1, newNR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNR1(NR1CONTENT newNR1) {
		if (newNR1 != nR1) {
			NotificationChain msgs = null;
			if (nR1 != null)
				msgs = ((InternalEObject)nR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NR__NR1, null, msgs);
			if (newNR1 != null)
				msgs = ((InternalEObject)newNR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NR__NR1, null, msgs);
			msgs = basicSetNR1(newNR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NR__NR1, newNR1, newNR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NR2CONTENT getNR2() {
		return nR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNR2(NR2CONTENT newNR2, NotificationChain msgs) {
		NR2CONTENT oldNR2 = nR2;
		nR2 = newNR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NR__NR2, oldNR2, newNR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNR2(NR2CONTENT newNR2) {
		if (newNR2 != nR2) {
			NotificationChain msgs = null;
			if (nR2 != null)
				msgs = ((InternalEObject)nR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NR__NR2, null, msgs);
			if (newNR2 != null)
				msgs = ((InternalEObject)newNR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NR__NR2, null, msgs);
			msgs = basicSetNR2(newNR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NR__NR2, newNR2, newNR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.NR__NR1:
				return basicSetNR1(null, msgs);
			case V2xmlPackage.NR__NR2:
				return basicSetNR2(null, msgs);
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
			case V2xmlPackage.NR__NR1:
				return getNR1();
			case V2xmlPackage.NR__NR2:
				return getNR2();
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
			case V2xmlPackage.NR__NR1:
				setNR1((NR1CONTENT)newValue);
				return;
			case V2xmlPackage.NR__NR2:
				setNR2((NR2CONTENT)newValue);
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
			case V2xmlPackage.NR__NR1:
				setNR1((NR1CONTENT)null);
				return;
			case V2xmlPackage.NR__NR2:
				setNR2((NR2CONTENT)null);
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
			case V2xmlPackage.NR__NR1:
				return nR1 != null;
			case V2xmlPackage.NR__NR2:
				return nR2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NRImpl
