/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.MA;
import org.hl7.v2xml.MA1CONTENT;
import org.hl7.v2xml.MA2CONTENT;
import org.hl7.v2xml.MA3CONTENT;
import org.hl7.v2xml.MA4CONTENT;
import org.hl7.v2xml.MA5CONTENT;
import org.hl7.v2xml.MA6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA1 <em>MA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA2 <em>MA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA3 <em>MA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA4 <em>MA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA5 <em>MA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MAImpl#getMA6 <em>MA6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MAImpl extends EObjectImpl implements MA {
	/**
	 * The cached value of the '{@link #getMA1() <em>MA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA1()
	 * @generated
	 * @ordered
	 */
	protected MA1CONTENT mA1;

	/**
	 * The cached value of the '{@link #getMA2() <em>MA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA2()
	 * @generated
	 * @ordered
	 */
	protected MA2CONTENT mA2;

	/**
	 * The cached value of the '{@link #getMA3() <em>MA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA3()
	 * @generated
	 * @ordered
	 */
	protected MA3CONTENT mA3;

	/**
	 * The cached value of the '{@link #getMA4() <em>MA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA4()
	 * @generated
	 * @ordered
	 */
	protected MA4CONTENT mA4;

	/**
	 * The cached value of the '{@link #getMA5() <em>MA5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA5()
	 * @generated
	 * @ordered
	 */
	protected MA5CONTENT mA5;

	/**
	 * The cached value of the '{@link #getMA6() <em>MA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMA6()
	 * @generated
	 * @ordered
	 */
	protected MA6CONTENT mA6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA1CONTENT getMA1() {
		return mA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA1(MA1CONTENT newMA1, NotificationChain msgs) {
		MA1CONTENT oldMA1 = mA1;
		mA1 = newMA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA1, oldMA1, newMA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA1(MA1CONTENT newMA1) {
		if (newMA1 != mA1) {
			NotificationChain msgs = null;
			if (mA1 != null)
				msgs = ((InternalEObject)mA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA1, null, msgs);
			if (newMA1 != null)
				msgs = ((InternalEObject)newMA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA1, null, msgs);
			msgs = basicSetMA1(newMA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA1, newMA1, newMA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA2CONTENT getMA2() {
		return mA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA2(MA2CONTENT newMA2, NotificationChain msgs) {
		MA2CONTENT oldMA2 = mA2;
		mA2 = newMA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA2, oldMA2, newMA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA2(MA2CONTENT newMA2) {
		if (newMA2 != mA2) {
			NotificationChain msgs = null;
			if (mA2 != null)
				msgs = ((InternalEObject)mA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA2, null, msgs);
			if (newMA2 != null)
				msgs = ((InternalEObject)newMA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA2, null, msgs);
			msgs = basicSetMA2(newMA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA2, newMA2, newMA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA3CONTENT getMA3() {
		return mA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA3(MA3CONTENT newMA3, NotificationChain msgs) {
		MA3CONTENT oldMA3 = mA3;
		mA3 = newMA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA3, oldMA3, newMA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA3(MA3CONTENT newMA3) {
		if (newMA3 != mA3) {
			NotificationChain msgs = null;
			if (mA3 != null)
				msgs = ((InternalEObject)mA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA3, null, msgs);
			if (newMA3 != null)
				msgs = ((InternalEObject)newMA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA3, null, msgs);
			msgs = basicSetMA3(newMA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA3, newMA3, newMA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA4CONTENT getMA4() {
		return mA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA4(MA4CONTENT newMA4, NotificationChain msgs) {
		MA4CONTENT oldMA4 = mA4;
		mA4 = newMA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA4, oldMA4, newMA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA4(MA4CONTENT newMA4) {
		if (newMA4 != mA4) {
			NotificationChain msgs = null;
			if (mA4 != null)
				msgs = ((InternalEObject)mA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA4, null, msgs);
			if (newMA4 != null)
				msgs = ((InternalEObject)newMA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA4, null, msgs);
			msgs = basicSetMA4(newMA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA4, newMA4, newMA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA5CONTENT getMA5() {
		return mA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA5(MA5CONTENT newMA5, NotificationChain msgs) {
		MA5CONTENT oldMA5 = mA5;
		mA5 = newMA5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA5, oldMA5, newMA5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA5(MA5CONTENT newMA5) {
		if (newMA5 != mA5) {
			NotificationChain msgs = null;
			if (mA5 != null)
				msgs = ((InternalEObject)mA5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA5, null, msgs);
			if (newMA5 != null)
				msgs = ((InternalEObject)newMA5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA5, null, msgs);
			msgs = basicSetMA5(newMA5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA5, newMA5, newMA5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MA6CONTENT getMA6() {
		return mA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMA6(MA6CONTENT newMA6, NotificationChain msgs) {
		MA6CONTENT oldMA6 = mA6;
		mA6 = newMA6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA6, oldMA6, newMA6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMA6(MA6CONTENT newMA6) {
		if (newMA6 != mA6) {
			NotificationChain msgs = null;
			if (mA6 != null)
				msgs = ((InternalEObject)mA6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA6, null, msgs);
			if (newMA6 != null)
				msgs = ((InternalEObject)newMA6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MA__MA6, null, msgs);
			msgs = basicSetMA6(newMA6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MA__MA6, newMA6, newMA6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MA__MA1:
				return basicSetMA1(null, msgs);
			case V2xmlPackage.MA__MA2:
				return basicSetMA2(null, msgs);
			case V2xmlPackage.MA__MA3:
				return basicSetMA3(null, msgs);
			case V2xmlPackage.MA__MA4:
				return basicSetMA4(null, msgs);
			case V2xmlPackage.MA__MA5:
				return basicSetMA5(null, msgs);
			case V2xmlPackage.MA__MA6:
				return basicSetMA6(null, msgs);
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
			case V2xmlPackage.MA__MA1:
				return getMA1();
			case V2xmlPackage.MA__MA2:
				return getMA2();
			case V2xmlPackage.MA__MA3:
				return getMA3();
			case V2xmlPackage.MA__MA4:
				return getMA4();
			case V2xmlPackage.MA__MA5:
				return getMA5();
			case V2xmlPackage.MA__MA6:
				return getMA6();
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
			case V2xmlPackage.MA__MA1:
				setMA1((MA1CONTENT)newValue);
				return;
			case V2xmlPackage.MA__MA2:
				setMA2((MA2CONTENT)newValue);
				return;
			case V2xmlPackage.MA__MA3:
				setMA3((MA3CONTENT)newValue);
				return;
			case V2xmlPackage.MA__MA4:
				setMA4((MA4CONTENT)newValue);
				return;
			case V2xmlPackage.MA__MA5:
				setMA5((MA5CONTENT)newValue);
				return;
			case V2xmlPackage.MA__MA6:
				setMA6((MA6CONTENT)newValue);
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
			case V2xmlPackage.MA__MA1:
				setMA1((MA1CONTENT)null);
				return;
			case V2xmlPackage.MA__MA2:
				setMA2((MA2CONTENT)null);
				return;
			case V2xmlPackage.MA__MA3:
				setMA3((MA3CONTENT)null);
				return;
			case V2xmlPackage.MA__MA4:
				setMA4((MA4CONTENT)null);
				return;
			case V2xmlPackage.MA__MA5:
				setMA5((MA5CONTENT)null);
				return;
			case V2xmlPackage.MA__MA6:
				setMA6((MA6CONTENT)null);
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
			case V2xmlPackage.MA__MA1:
				return mA1 != null;
			case V2xmlPackage.MA__MA2:
				return mA2 != null;
			case V2xmlPackage.MA__MA3:
				return mA3 != null;
			case V2xmlPackage.MA__MA4:
				return mA4 != null;
			case V2xmlPackage.MA__MA5:
				return mA5 != null;
			case V2xmlPackage.MA__MA6:
				return mA6 != null;
		}
		return super.eIsSet(featureID);
	}

} //MAImpl
