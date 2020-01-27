/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CCP;
import org.hl7.v2xml.CCP1CONTENT;
import org.hl7.v2xml.CCP2CONTENT;
import org.hl7.v2xml.CCP3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CCP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CCPImpl#getCCP1 <em>CCP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CCPImpl#getCCP2 <em>CCP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CCPImpl#getCCP3 <em>CCP3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CCPImpl extends EObjectImpl implements CCP {
	/**
	 * The cached value of the '{@link #getCCP1() <em>CCP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCP1()
	 * @generated
	 * @ordered
	 */
	protected CCP1CONTENT cCP1;

	/**
	 * The cached value of the '{@link #getCCP2() <em>CCP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCP2()
	 * @generated
	 * @ordered
	 */
	protected CCP2CONTENT cCP2;

	/**
	 * The cached value of the '{@link #getCCP3() <em>CCP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCP3()
	 * @generated
	 * @ordered
	 */
	protected CCP3CONTENT cCP3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCCP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCP1CONTENT getCCP1() {
		return cCP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCP1(CCP1CONTENT newCCP1, NotificationChain msgs) {
		CCP1CONTENT oldCCP1 = cCP1;
		cCP1 = newCCP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP1, oldCCP1, newCCP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCP1(CCP1CONTENT newCCP1) {
		if (newCCP1 != cCP1) {
			NotificationChain msgs = null;
			if (cCP1 != null)
				msgs = ((InternalEObject)cCP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP1, null, msgs);
			if (newCCP1 != null)
				msgs = ((InternalEObject)newCCP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP1, null, msgs);
			msgs = basicSetCCP1(newCCP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP1, newCCP1, newCCP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCP2CONTENT getCCP2() {
		return cCP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCP2(CCP2CONTENT newCCP2, NotificationChain msgs) {
		CCP2CONTENT oldCCP2 = cCP2;
		cCP2 = newCCP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP2, oldCCP2, newCCP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCP2(CCP2CONTENT newCCP2) {
		if (newCCP2 != cCP2) {
			NotificationChain msgs = null;
			if (cCP2 != null)
				msgs = ((InternalEObject)cCP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP2, null, msgs);
			if (newCCP2 != null)
				msgs = ((InternalEObject)newCCP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP2, null, msgs);
			msgs = basicSetCCP2(newCCP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP2, newCCP2, newCCP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCP3CONTENT getCCP3() {
		return cCP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCP3(CCP3CONTENT newCCP3, NotificationChain msgs) {
		CCP3CONTENT oldCCP3 = cCP3;
		cCP3 = newCCP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP3, oldCCP3, newCCP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCP3(CCP3CONTENT newCCP3) {
		if (newCCP3 != cCP3) {
			NotificationChain msgs = null;
			if (cCP3 != null)
				msgs = ((InternalEObject)cCP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP3, null, msgs);
			if (newCCP3 != null)
				msgs = ((InternalEObject)newCCP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCP__CCP3, null, msgs);
			msgs = basicSetCCP3(newCCP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCP__CCP3, newCCP3, newCCP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CCP__CCP1:
				return basicSetCCP1(null, msgs);
			case V2xmlPackage.CCP__CCP2:
				return basicSetCCP2(null, msgs);
			case V2xmlPackage.CCP__CCP3:
				return basicSetCCP3(null, msgs);
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
			case V2xmlPackage.CCP__CCP1:
				return getCCP1();
			case V2xmlPackage.CCP__CCP2:
				return getCCP2();
			case V2xmlPackage.CCP__CCP3:
				return getCCP3();
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
			case V2xmlPackage.CCP__CCP1:
				setCCP1((CCP1CONTENT)newValue);
				return;
			case V2xmlPackage.CCP__CCP2:
				setCCP2((CCP2CONTENT)newValue);
				return;
			case V2xmlPackage.CCP__CCP3:
				setCCP3((CCP3CONTENT)newValue);
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
			case V2xmlPackage.CCP__CCP1:
				setCCP1((CCP1CONTENT)null);
				return;
			case V2xmlPackage.CCP__CCP2:
				setCCP2((CCP2CONTENT)null);
				return;
			case V2xmlPackage.CCP__CCP3:
				setCCP3((CCP3CONTENT)null);
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
			case V2xmlPackage.CCP__CCP1:
				return cCP1 != null;
			case V2xmlPackage.CCP__CCP2:
				return cCP2 != null;
			case V2xmlPackage.CCP__CCP3:
				return cCP3 != null;
		}
		return super.eIsSet(featureID);
	}

} //CCPImpl
