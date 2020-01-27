/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.DLT;
import org.hl7.v2xml.DLT1CONTENT;
import org.hl7.v2xml.DLT2CONTENT;
import org.hl7.v2xml.DLT3CONTENT;
import org.hl7.v2xml.DLT4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DLT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DLTImpl#getDLT1 <em>DLT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLTImpl#getDLT2 <em>DLT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLTImpl#getDLT3 <em>DLT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DLTImpl#getDLT4 <em>DLT4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DLTImpl extends EObjectImpl implements DLT {
	/**
	 * The cached value of the '{@link #getDLT1() <em>DLT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLT1()
	 * @generated
	 * @ordered
	 */
	protected DLT1CONTENT dLT1;

	/**
	 * The cached value of the '{@link #getDLT2() <em>DLT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLT2()
	 * @generated
	 * @ordered
	 */
	protected DLT2CONTENT dLT2;

	/**
	 * The cached value of the '{@link #getDLT3() <em>DLT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLT3()
	 * @generated
	 * @ordered
	 */
	protected DLT3CONTENT dLT3;

	/**
	 * The cached value of the '{@link #getDLT4() <em>DLT4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDLT4()
	 * @generated
	 * @ordered
	 */
	protected DLT4CONTENT dLT4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DLTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDLT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLT1CONTENT getDLT1() {
		return dLT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLT1(DLT1CONTENT newDLT1, NotificationChain msgs) {
		DLT1CONTENT oldDLT1 = dLT1;
		dLT1 = newDLT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT1, oldDLT1, newDLT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLT1(DLT1CONTENT newDLT1) {
		if (newDLT1 != dLT1) {
			NotificationChain msgs = null;
			if (dLT1 != null)
				msgs = ((InternalEObject)dLT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT1, null, msgs);
			if (newDLT1 != null)
				msgs = ((InternalEObject)newDLT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT1, null, msgs);
			msgs = basicSetDLT1(newDLT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT1, newDLT1, newDLT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLT2CONTENT getDLT2() {
		return dLT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLT2(DLT2CONTENT newDLT2, NotificationChain msgs) {
		DLT2CONTENT oldDLT2 = dLT2;
		dLT2 = newDLT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT2, oldDLT2, newDLT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLT2(DLT2CONTENT newDLT2) {
		if (newDLT2 != dLT2) {
			NotificationChain msgs = null;
			if (dLT2 != null)
				msgs = ((InternalEObject)dLT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT2, null, msgs);
			if (newDLT2 != null)
				msgs = ((InternalEObject)newDLT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT2, null, msgs);
			msgs = basicSetDLT2(newDLT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT2, newDLT2, newDLT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLT3CONTENT getDLT3() {
		return dLT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLT3(DLT3CONTENT newDLT3, NotificationChain msgs) {
		DLT3CONTENT oldDLT3 = dLT3;
		dLT3 = newDLT3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT3, oldDLT3, newDLT3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLT3(DLT3CONTENT newDLT3) {
		if (newDLT3 != dLT3) {
			NotificationChain msgs = null;
			if (dLT3 != null)
				msgs = ((InternalEObject)dLT3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT3, null, msgs);
			if (newDLT3 != null)
				msgs = ((InternalEObject)newDLT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT3, null, msgs);
			msgs = basicSetDLT3(newDLT3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT3, newDLT3, newDLT3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DLT4CONTENT getDLT4() {
		return dLT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDLT4(DLT4CONTENT newDLT4, NotificationChain msgs) {
		DLT4CONTENT oldDLT4 = dLT4;
		dLT4 = newDLT4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT4, oldDLT4, newDLT4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDLT4(DLT4CONTENT newDLT4) {
		if (newDLT4 != dLT4) {
			NotificationChain msgs = null;
			if (dLT4 != null)
				msgs = ((InternalEObject)dLT4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT4, null, msgs);
			if (newDLT4 != null)
				msgs = ((InternalEObject)newDLT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DLT__DLT4, null, msgs);
			msgs = basicSetDLT4(newDLT4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DLT__DLT4, newDLT4, newDLT4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.DLT__DLT1:
				return basicSetDLT1(null, msgs);
			case V2xmlPackage.DLT__DLT2:
				return basicSetDLT2(null, msgs);
			case V2xmlPackage.DLT__DLT3:
				return basicSetDLT3(null, msgs);
			case V2xmlPackage.DLT__DLT4:
				return basicSetDLT4(null, msgs);
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
			case V2xmlPackage.DLT__DLT1:
				return getDLT1();
			case V2xmlPackage.DLT__DLT2:
				return getDLT2();
			case V2xmlPackage.DLT__DLT3:
				return getDLT3();
			case V2xmlPackage.DLT__DLT4:
				return getDLT4();
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
			case V2xmlPackage.DLT__DLT1:
				setDLT1((DLT1CONTENT)newValue);
				return;
			case V2xmlPackage.DLT__DLT2:
				setDLT2((DLT2CONTENT)newValue);
				return;
			case V2xmlPackage.DLT__DLT3:
				setDLT3((DLT3CONTENT)newValue);
				return;
			case V2xmlPackage.DLT__DLT4:
				setDLT4((DLT4CONTENT)newValue);
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
			case V2xmlPackage.DLT__DLT1:
				setDLT1((DLT1CONTENT)null);
				return;
			case V2xmlPackage.DLT__DLT2:
				setDLT2((DLT2CONTENT)null);
				return;
			case V2xmlPackage.DLT__DLT3:
				setDLT3((DLT3CONTENT)null);
				return;
			case V2xmlPackage.DLT__DLT4:
				setDLT4((DLT4CONTENT)null);
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
			case V2xmlPackage.DLT__DLT1:
				return dLT1 != null;
			case V2xmlPackage.DLT__DLT2:
				return dLT2 != null;
			case V2xmlPackage.DLT__DLT3:
				return dLT3 != null;
			case V2xmlPackage.DLT__DLT4:
				return dLT4 != null;
		}
		return super.eIsSet(featureID);
	}

} //DLTImpl
