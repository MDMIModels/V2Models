/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.EIP;
import org.hl7.v2xml.EIP1CONTENT;
import org.hl7.v2xml.EIP2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EIP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EIPImpl#getEIP1 <em>EIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EIPImpl#getEIP2 <em>EIP2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIPImpl extends EObjectImpl implements EIP {
	/**
	 * The cached value of the '{@link #getEIP1() <em>EIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIP1()
	 * @generated
	 * @ordered
	 */
	protected EIP1CONTENT eIP1;

	/**
	 * The cached value of the '{@link #getEIP2() <em>EIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEIP2()
	 * @generated
	 * @ordered
	 */
	protected EIP2CONTENT eIP2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EIPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEIP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIP1CONTENT getEIP1() {
		return eIP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIP1(EIP1CONTENT newEIP1, NotificationChain msgs) {
		EIP1CONTENT oldEIP1 = eIP1;
		eIP1 = newEIP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EIP__EIP1, oldEIP1, newEIP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEIP1(EIP1CONTENT newEIP1) {
		if (newEIP1 != eIP1) {
			NotificationChain msgs = null;
			if (eIP1 != null)
				msgs = ((InternalEObject)eIP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EIP__EIP1, null, msgs);
			if (newEIP1 != null)
				msgs = ((InternalEObject)newEIP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EIP__EIP1, null, msgs);
			msgs = basicSetEIP1(newEIP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EIP__EIP1, newEIP1, newEIP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EIP2CONTENT getEIP2() {
		return eIP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEIP2(EIP2CONTENT newEIP2, NotificationChain msgs) {
		EIP2CONTENT oldEIP2 = eIP2;
		eIP2 = newEIP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EIP__EIP2, oldEIP2, newEIP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEIP2(EIP2CONTENT newEIP2) {
		if (newEIP2 != eIP2) {
			NotificationChain msgs = null;
			if (eIP2 != null)
				msgs = ((InternalEObject)eIP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EIP__EIP2, null, msgs);
			if (newEIP2 != null)
				msgs = ((InternalEObject)newEIP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EIP__EIP2, null, msgs);
			msgs = basicSetEIP2(newEIP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EIP__EIP2, newEIP2, newEIP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.EIP__EIP1:
				return basicSetEIP1(null, msgs);
			case V2xmlPackage.EIP__EIP2:
				return basicSetEIP2(null, msgs);
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
			case V2xmlPackage.EIP__EIP1:
				return getEIP1();
			case V2xmlPackage.EIP__EIP2:
				return getEIP2();
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
			case V2xmlPackage.EIP__EIP1:
				setEIP1((EIP1CONTENT)newValue);
				return;
			case V2xmlPackage.EIP__EIP2:
				setEIP2((EIP2CONTENT)newValue);
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
			case V2xmlPackage.EIP__EIP1:
				setEIP1((EIP1CONTENT)null);
				return;
			case V2xmlPackage.EIP__EIP2:
				setEIP2((EIP2CONTENT)null);
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
			case V2xmlPackage.EIP__EIP1:
				return eIP1 != null;
			case V2xmlPackage.EIP__EIP2:
				return eIP2 != null;
		}
		return super.eIsSet(featureID);
	}

} //EIPImpl
