/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CCD;
import org.hl7.v2xml.CCD1CONTENT;
import org.hl7.v2xml.CCD2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CCD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CCDImpl#getCCD1 <em>CCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CCDImpl#getCCD2 <em>CCD2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CCDImpl extends EObjectImpl implements CCD {
	/**
	 * The cached value of the '{@link #getCCD1() <em>CCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCD1()
	 * @generated
	 * @ordered
	 */
	protected CCD1CONTENT cCD1;

	/**
	 * The cached value of the '{@link #getCCD2() <em>CCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCD2()
	 * @generated
	 * @ordered
	 */
	protected CCD2CONTENT cCD2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CCDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCCD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCD1CONTENT getCCD1() {
		return cCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCD1(CCD1CONTENT newCCD1, NotificationChain msgs) {
		CCD1CONTENT oldCCD1 = cCD1;
		cCD1 = newCCD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCD__CCD1, oldCCD1, newCCD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCD1(CCD1CONTENT newCCD1) {
		if (newCCD1 != cCD1) {
			NotificationChain msgs = null;
			if (cCD1 != null)
				msgs = ((InternalEObject)cCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCD__CCD1, null, msgs);
			if (newCCD1 != null)
				msgs = ((InternalEObject)newCCD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCD__CCD1, null, msgs);
			msgs = basicSetCCD1(newCCD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCD__CCD1, newCCD1, newCCD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCD2CONTENT getCCD2() {
		return cCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCCD2(CCD2CONTENT newCCD2, NotificationChain msgs) {
		CCD2CONTENT oldCCD2 = cCD2;
		cCD2 = newCCD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCD__CCD2, oldCCD2, newCCD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCD2(CCD2CONTENT newCCD2) {
		if (newCCD2 != cCD2) {
			NotificationChain msgs = null;
			if (cCD2 != null)
				msgs = ((InternalEObject)cCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCD__CCD2, null, msgs);
			if (newCCD2 != null)
				msgs = ((InternalEObject)newCCD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CCD__CCD2, null, msgs);
			msgs = basicSetCCD2(newCCD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CCD__CCD2, newCCD2, newCCD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CCD__CCD1:
				return basicSetCCD1(null, msgs);
			case V2xmlPackage.CCD__CCD2:
				return basicSetCCD2(null, msgs);
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
			case V2xmlPackage.CCD__CCD1:
				return getCCD1();
			case V2xmlPackage.CCD__CCD2:
				return getCCD2();
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
			case V2xmlPackage.CCD__CCD1:
				setCCD1((CCD1CONTENT)newValue);
				return;
			case V2xmlPackage.CCD__CCD2:
				setCCD2((CCD2CONTENT)newValue);
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
			case V2xmlPackage.CCD__CCD1:
				setCCD1((CCD1CONTENT)null);
				return;
			case V2xmlPackage.CCD__CCD2:
				setCCD2((CCD2CONTENT)null);
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
			case V2xmlPackage.CCD__CCD1:
				return cCD1 != null;
			case V2xmlPackage.CCD__CCD2:
				return cCD2 != null;
		}
		return super.eIsSet(featureID);
	}

} //CCDImpl
