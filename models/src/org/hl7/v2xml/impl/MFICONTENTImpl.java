/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.MFI1CONTENT;
import org.hl7.v2xml.MFI2CONTENT;
import org.hl7.v2xml.MFI3CONTENT;
import org.hl7.v2xml.MFI4CONTENT;
import org.hl7.v2xml.MFI5CONTENT;
import org.hl7.v2xml.MFI6CONTENT;
import org.hl7.v2xml.MFICONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFICONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI1 <em>MFI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI2 <em>MFI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI3 <em>MFI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI4 <em>MFI4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI5 <em>MFI5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getMFI6 <em>MFI6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFICONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFICONTENTImpl extends EObjectImpl implements MFICONTENT {
	/**
	 * The cached value of the '{@link #getMFI1() <em>MFI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI1()
	 * @generated
	 * @ordered
	 */
	protected MFI1CONTENT mFI1;

	/**
	 * The cached value of the '{@link #getMFI2() <em>MFI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI2()
	 * @generated
	 * @ordered
	 */
	protected MFI2CONTENT mFI2;

	/**
	 * The cached value of the '{@link #getMFI3() <em>MFI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI3()
	 * @generated
	 * @ordered
	 */
	protected MFI3CONTENT mFI3;

	/**
	 * The cached value of the '{@link #getMFI4() <em>MFI4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI4()
	 * @generated
	 * @ordered
	 */
	protected MFI4CONTENT mFI4;

	/**
	 * The cached value of the '{@link #getMFI5() <em>MFI5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI5()
	 * @generated
	 * @ordered
	 */
	protected MFI5CONTENT mFI5;

	/**
	 * The cached value of the '{@link #getMFI6() <em>MFI6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFI6()
	 * @generated
	 * @ordered
	 */
	protected MFI6CONTENT mFI6;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MFICONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMFICONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI1CONTENT getMFI1() {
		return mFI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI1(MFI1CONTENT newMFI1, NotificationChain msgs) {
		MFI1CONTENT oldMFI1 = mFI1;
		mFI1 = newMFI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI1, oldMFI1, newMFI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI1(MFI1CONTENT newMFI1) {
		if (newMFI1 != mFI1) {
			NotificationChain msgs = null;
			if (mFI1 != null)
				msgs = ((InternalEObject)mFI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI1, null, msgs);
			if (newMFI1 != null)
				msgs = ((InternalEObject)newMFI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI1, null, msgs);
			msgs = basicSetMFI1(newMFI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI1, newMFI1, newMFI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI2CONTENT getMFI2() {
		return mFI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI2(MFI2CONTENT newMFI2, NotificationChain msgs) {
		MFI2CONTENT oldMFI2 = mFI2;
		mFI2 = newMFI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI2, oldMFI2, newMFI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI2(MFI2CONTENT newMFI2) {
		if (newMFI2 != mFI2) {
			NotificationChain msgs = null;
			if (mFI2 != null)
				msgs = ((InternalEObject)mFI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI2, null, msgs);
			if (newMFI2 != null)
				msgs = ((InternalEObject)newMFI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI2, null, msgs);
			msgs = basicSetMFI2(newMFI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI2, newMFI2, newMFI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI3CONTENT getMFI3() {
		return mFI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI3(MFI3CONTENT newMFI3, NotificationChain msgs) {
		MFI3CONTENT oldMFI3 = mFI3;
		mFI3 = newMFI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI3, oldMFI3, newMFI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI3(MFI3CONTENT newMFI3) {
		if (newMFI3 != mFI3) {
			NotificationChain msgs = null;
			if (mFI3 != null)
				msgs = ((InternalEObject)mFI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI3, null, msgs);
			if (newMFI3 != null)
				msgs = ((InternalEObject)newMFI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI3, null, msgs);
			msgs = basicSetMFI3(newMFI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI3, newMFI3, newMFI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI4CONTENT getMFI4() {
		return mFI4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI4(MFI4CONTENT newMFI4, NotificationChain msgs) {
		MFI4CONTENT oldMFI4 = mFI4;
		mFI4 = newMFI4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI4, oldMFI4, newMFI4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI4(MFI4CONTENT newMFI4) {
		if (newMFI4 != mFI4) {
			NotificationChain msgs = null;
			if (mFI4 != null)
				msgs = ((InternalEObject)mFI4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI4, null, msgs);
			if (newMFI4 != null)
				msgs = ((InternalEObject)newMFI4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI4, null, msgs);
			msgs = basicSetMFI4(newMFI4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI4, newMFI4, newMFI4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI5CONTENT getMFI5() {
		return mFI5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI5(MFI5CONTENT newMFI5, NotificationChain msgs) {
		MFI5CONTENT oldMFI5 = mFI5;
		mFI5 = newMFI5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI5, oldMFI5, newMFI5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI5(MFI5CONTENT newMFI5) {
		if (newMFI5 != mFI5) {
			NotificationChain msgs = null;
			if (mFI5 != null)
				msgs = ((InternalEObject)mFI5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI5, null, msgs);
			if (newMFI5 != null)
				msgs = ((InternalEObject)newMFI5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI5, null, msgs);
			msgs = basicSetMFI5(newMFI5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI5, newMFI5, newMFI5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFI6CONTENT getMFI6() {
		return mFI6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFI6(MFI6CONTENT newMFI6, NotificationChain msgs) {
		MFI6CONTENT oldMFI6 = mFI6;
		mFI6 = newMFI6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI6, oldMFI6, newMFI6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFI6(MFI6CONTENT newMFI6) {
		if (newMFI6 != mFI6) {
			NotificationChain msgs = null;
			if (mFI6 != null)
				msgs = ((InternalEObject)mFI6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI6, null, msgs);
			if (newMFI6 != null)
				msgs = ((InternalEObject)newMFI6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFICONTENT__MFI6, null, msgs);
			msgs = basicSetMFI6(newMFI6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFICONTENT__MFI6, newMFI6, newMFI6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MFICONTENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.MFICONTENT__MFI1:
				return basicSetMFI1(null, msgs);
			case V2xmlPackage.MFICONTENT__MFI2:
				return basicSetMFI2(null, msgs);
			case V2xmlPackage.MFICONTENT__MFI3:
				return basicSetMFI3(null, msgs);
			case V2xmlPackage.MFICONTENT__MFI4:
				return basicSetMFI4(null, msgs);
			case V2xmlPackage.MFICONTENT__MFI5:
				return basicSetMFI5(null, msgs);
			case V2xmlPackage.MFICONTENT__MFI6:
				return basicSetMFI6(null, msgs);
			case V2xmlPackage.MFICONTENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.MFICONTENT__MFI1:
				return getMFI1();
			case V2xmlPackage.MFICONTENT__MFI2:
				return getMFI2();
			case V2xmlPackage.MFICONTENT__MFI3:
				return getMFI3();
			case V2xmlPackage.MFICONTENT__MFI4:
				return getMFI4();
			case V2xmlPackage.MFICONTENT__MFI5:
				return getMFI5();
			case V2xmlPackage.MFICONTENT__MFI6:
				return getMFI6();
			case V2xmlPackage.MFICONTENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case V2xmlPackage.MFICONTENT__MFI1:
				setMFI1((MFI1CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__MFI2:
				setMFI2((MFI2CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__MFI3:
				setMFI3((MFI3CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__MFI4:
				setMFI4((MFI4CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__MFI5:
				setMFI5((MFI5CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__MFI6:
				setMFI6((MFI6CONTENT)newValue);
				return;
			case V2xmlPackage.MFICONTENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case V2xmlPackage.MFICONTENT__MFI1:
				setMFI1((MFI1CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__MFI2:
				setMFI2((MFI2CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__MFI3:
				setMFI3((MFI3CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__MFI4:
				setMFI4((MFI4CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__MFI5:
				setMFI5((MFI5CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__MFI6:
				setMFI6((MFI6CONTENT)null);
				return;
			case V2xmlPackage.MFICONTENT__ANY:
				getAny().clear();
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
			case V2xmlPackage.MFICONTENT__MFI1:
				return mFI1 != null;
			case V2xmlPackage.MFICONTENT__MFI2:
				return mFI2 != null;
			case V2xmlPackage.MFICONTENT__MFI3:
				return mFI3 != null;
			case V2xmlPackage.MFICONTENT__MFI4:
				return mFI4 != null;
			case V2xmlPackage.MFICONTENT__MFI5:
				return mFI5 != null;
			case V2xmlPackage.MFICONTENT__MFI6:
				return mFI6 != null;
			case V2xmlPackage.MFICONTENT__ANY:
				return any != null && !any.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //MFICONTENTImpl
