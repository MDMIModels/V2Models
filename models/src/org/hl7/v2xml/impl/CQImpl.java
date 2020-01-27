/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CQ;
import org.hl7.v2xml.CQ1CONTENT;
import org.hl7.v2xml.CQ2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CQImpl#getCQ1 <em>CQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CQImpl#getCQ2 <em>CQ2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CQImpl extends EObjectImpl implements CQ {
	/**
	 * The cached value of the '{@link #getCQ1() <em>CQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCQ1()
	 * @generated
	 * @ordered
	 */
	protected CQ1CONTENT cQ1;

	/**
	 * The cached value of the '{@link #getCQ2() <em>CQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCQ2()
	 * @generated
	 * @ordered
	 */
	protected CQ2CONTENT cQ2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCQ();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CQ1CONTENT getCQ1() {
		return cQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCQ1(CQ1CONTENT newCQ1, NotificationChain msgs) {
		CQ1CONTENT oldCQ1 = cQ1;
		cQ1 = newCQ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CQ__CQ1, oldCQ1, newCQ1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCQ1(CQ1CONTENT newCQ1) {
		if (newCQ1 != cQ1) {
			NotificationChain msgs = null;
			if (cQ1 != null)
				msgs = ((InternalEObject)cQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CQ__CQ1, null, msgs);
			if (newCQ1 != null)
				msgs = ((InternalEObject)newCQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CQ__CQ1, null, msgs);
			msgs = basicSetCQ1(newCQ1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CQ__CQ1, newCQ1, newCQ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CQ2CONTENT getCQ2() {
		return cQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCQ2(CQ2CONTENT newCQ2, NotificationChain msgs) {
		CQ2CONTENT oldCQ2 = cQ2;
		cQ2 = newCQ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CQ__CQ2, oldCQ2, newCQ2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCQ2(CQ2CONTENT newCQ2) {
		if (newCQ2 != cQ2) {
			NotificationChain msgs = null;
			if (cQ2 != null)
				msgs = ((InternalEObject)cQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CQ__CQ2, null, msgs);
			if (newCQ2 != null)
				msgs = ((InternalEObject)newCQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CQ__CQ2, null, msgs);
			msgs = basicSetCQ2(newCQ2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CQ__CQ2, newCQ2, newCQ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CQ__CQ1:
				return basicSetCQ1(null, msgs);
			case V2xmlPackage.CQ__CQ2:
				return basicSetCQ2(null, msgs);
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
			case V2xmlPackage.CQ__CQ1:
				return getCQ1();
			case V2xmlPackage.CQ__CQ2:
				return getCQ2();
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
			case V2xmlPackage.CQ__CQ1:
				setCQ1((CQ1CONTENT)newValue);
				return;
			case V2xmlPackage.CQ__CQ2:
				setCQ2((CQ2CONTENT)newValue);
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
			case V2xmlPackage.CQ__CQ1:
				setCQ1((CQ1CONTENT)null);
				return;
			case V2xmlPackage.CQ__CQ2:
				setCQ2((CQ2CONTENT)null);
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
			case V2xmlPackage.CQ__CQ1:
				return cQ1 != null;
			case V2xmlPackage.CQ__CQ2:
				return cQ2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CQImpl
