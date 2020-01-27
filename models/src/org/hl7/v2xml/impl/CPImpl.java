/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CP;
import org.hl7.v2xml.CP1CONTENT;
import org.hl7.v2xml.CP2CONTENT;
import org.hl7.v2xml.CP3CONTENT;
import org.hl7.v2xml.CP4CONTENT;
import org.hl7.v2xml.CP5CONTENT;
import org.hl7.v2xml.CP6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP1 <em>CP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP2 <em>CP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP3 <em>CP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP4 <em>CP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP5 <em>CP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CPImpl#getCP6 <em>CP6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPImpl extends EObjectImpl implements CP {
	/**
	 * The cached value of the '{@link #getCP1() <em>CP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP1()
	 * @generated
	 * @ordered
	 */
	protected CP1CONTENT cP1;

	/**
	 * The cached value of the '{@link #getCP2() <em>CP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP2()
	 * @generated
	 * @ordered
	 */
	protected CP2CONTENT cP2;

	/**
	 * The cached value of the '{@link #getCP3() <em>CP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP3()
	 * @generated
	 * @ordered
	 */
	protected CP3CONTENT cP3;

	/**
	 * The cached value of the '{@link #getCP4() <em>CP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP4()
	 * @generated
	 * @ordered
	 */
	protected CP4CONTENT cP4;

	/**
	 * The cached value of the '{@link #getCP5() <em>CP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP5()
	 * @generated
	 * @ordered
	 */
	protected CP5CONTENT cP5;

	/**
	 * The cached value of the '{@link #getCP6() <em>CP6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP6()
	 * @generated
	 * @ordered
	 */
	protected CP6CONTENT cP6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP1CONTENT getCP1() {
		return cP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP1(CP1CONTENT newCP1, NotificationChain msgs) {
		CP1CONTENT oldCP1 = cP1;
		cP1 = newCP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP1, oldCP1, newCP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP1(CP1CONTENT newCP1) {
		if (newCP1 != cP1) {
			NotificationChain msgs = null;
			if (cP1 != null)
				msgs = ((InternalEObject)cP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP1, null, msgs);
			if (newCP1 != null)
				msgs = ((InternalEObject)newCP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP1, null, msgs);
			msgs = basicSetCP1(newCP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP1, newCP1, newCP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP2CONTENT getCP2() {
		return cP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP2(CP2CONTENT newCP2, NotificationChain msgs) {
		CP2CONTENT oldCP2 = cP2;
		cP2 = newCP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP2, oldCP2, newCP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP2(CP2CONTENT newCP2) {
		if (newCP2 != cP2) {
			NotificationChain msgs = null;
			if (cP2 != null)
				msgs = ((InternalEObject)cP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP2, null, msgs);
			if (newCP2 != null)
				msgs = ((InternalEObject)newCP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP2, null, msgs);
			msgs = basicSetCP2(newCP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP2, newCP2, newCP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP3CONTENT getCP3() {
		return cP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP3(CP3CONTENT newCP3, NotificationChain msgs) {
		CP3CONTENT oldCP3 = cP3;
		cP3 = newCP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP3, oldCP3, newCP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP3(CP3CONTENT newCP3) {
		if (newCP3 != cP3) {
			NotificationChain msgs = null;
			if (cP3 != null)
				msgs = ((InternalEObject)cP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP3, null, msgs);
			if (newCP3 != null)
				msgs = ((InternalEObject)newCP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP3, null, msgs);
			msgs = basicSetCP3(newCP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP3, newCP3, newCP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP4CONTENT getCP4() {
		return cP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP4(CP4CONTENT newCP4, NotificationChain msgs) {
		CP4CONTENT oldCP4 = cP4;
		cP4 = newCP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP4, oldCP4, newCP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP4(CP4CONTENT newCP4) {
		if (newCP4 != cP4) {
			NotificationChain msgs = null;
			if (cP4 != null)
				msgs = ((InternalEObject)cP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP4, null, msgs);
			if (newCP4 != null)
				msgs = ((InternalEObject)newCP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP4, null, msgs);
			msgs = basicSetCP4(newCP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP4, newCP4, newCP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP5CONTENT getCP5() {
		return cP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP5(CP5CONTENT newCP5, NotificationChain msgs) {
		CP5CONTENT oldCP5 = cP5;
		cP5 = newCP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP5, oldCP5, newCP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP5(CP5CONTENT newCP5) {
		if (newCP5 != cP5) {
			NotificationChain msgs = null;
			if (cP5 != null)
				msgs = ((InternalEObject)cP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP5, null, msgs);
			if (newCP5 != null)
				msgs = ((InternalEObject)newCP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP5, null, msgs);
			msgs = basicSetCP5(newCP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP5, newCP5, newCP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CP6CONTENT getCP6() {
		return cP6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCP6(CP6CONTENT newCP6, NotificationChain msgs) {
		CP6CONTENT oldCP6 = cP6;
		cP6 = newCP6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP6, oldCP6, newCP6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP6(CP6CONTENT newCP6) {
		if (newCP6 != cP6) {
			NotificationChain msgs = null;
			if (cP6 != null)
				msgs = ((InternalEObject)cP6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP6, null, msgs);
			if (newCP6 != null)
				msgs = ((InternalEObject)newCP6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CP__CP6, null, msgs);
			msgs = basicSetCP6(newCP6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CP__CP6, newCP6, newCP6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CP__CP1:
				return basicSetCP1(null, msgs);
			case V2xmlPackage.CP__CP2:
				return basicSetCP2(null, msgs);
			case V2xmlPackage.CP__CP3:
				return basicSetCP3(null, msgs);
			case V2xmlPackage.CP__CP4:
				return basicSetCP4(null, msgs);
			case V2xmlPackage.CP__CP5:
				return basicSetCP5(null, msgs);
			case V2xmlPackage.CP__CP6:
				return basicSetCP6(null, msgs);
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
			case V2xmlPackage.CP__CP1:
				return getCP1();
			case V2xmlPackage.CP__CP2:
				return getCP2();
			case V2xmlPackage.CP__CP3:
				return getCP3();
			case V2xmlPackage.CP__CP4:
				return getCP4();
			case V2xmlPackage.CP__CP5:
				return getCP5();
			case V2xmlPackage.CP__CP6:
				return getCP6();
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
			case V2xmlPackage.CP__CP1:
				setCP1((CP1CONTENT)newValue);
				return;
			case V2xmlPackage.CP__CP2:
				setCP2((CP2CONTENT)newValue);
				return;
			case V2xmlPackage.CP__CP3:
				setCP3((CP3CONTENT)newValue);
				return;
			case V2xmlPackage.CP__CP4:
				setCP4((CP4CONTENT)newValue);
				return;
			case V2xmlPackage.CP__CP5:
				setCP5((CP5CONTENT)newValue);
				return;
			case V2xmlPackage.CP__CP6:
				setCP6((CP6CONTENT)newValue);
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
			case V2xmlPackage.CP__CP1:
				setCP1((CP1CONTENT)null);
				return;
			case V2xmlPackage.CP__CP2:
				setCP2((CP2CONTENT)null);
				return;
			case V2xmlPackage.CP__CP3:
				setCP3((CP3CONTENT)null);
				return;
			case V2xmlPackage.CP__CP4:
				setCP4((CP4CONTENT)null);
				return;
			case V2xmlPackage.CP__CP5:
				setCP5((CP5CONTENT)null);
				return;
			case V2xmlPackage.CP__CP6:
				setCP6((CP6CONTENT)null);
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
			case V2xmlPackage.CP__CP1:
				return cP1 != null;
			case V2xmlPackage.CP__CP2:
				return cP2 != null;
			case V2xmlPackage.CP__CP3:
				return cP3 != null;
			case V2xmlPackage.CP__CP4:
				return cP4 != null;
			case V2xmlPackage.CP__CP5:
				return cP5 != null;
			case V2xmlPackage.CP__CP6:
				return cP6 != null;
		}
		return super.eIsSet(featureID);
	}

} //CPImpl
