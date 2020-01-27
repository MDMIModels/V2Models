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

import org.hl7.v2xml.MSA1CONTENT;
import org.hl7.v2xml.MSA2CONTENT;
import org.hl7.v2xml.MSA3CONTENT;
import org.hl7.v2xml.MSA4CONTENT;
import org.hl7.v2xml.MSA5CONTENT;
import org.hl7.v2xml.MSA6CONTENT;
import org.hl7.v2xml.MSACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA1 <em>MSA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA2 <em>MSA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA3 <em>MSA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA4 <em>MSA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA5 <em>MSA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getMSA6 <em>MSA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSACONTENTImpl extends EObjectImpl implements MSACONTENT {
	/**
	 * The cached value of the '{@link #getMSA1() <em>MSA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA1()
	 * @generated
	 * @ordered
	 */
	protected MSA1CONTENT mSA1;

	/**
	 * The cached value of the '{@link #getMSA2() <em>MSA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA2()
	 * @generated
	 * @ordered
	 */
	protected MSA2CONTENT mSA2;

	/**
	 * The cached value of the '{@link #getMSA3() <em>MSA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA3()
	 * @generated
	 * @ordered
	 */
	protected MSA3CONTENT mSA3;

	/**
	 * The cached value of the '{@link #getMSA4() <em>MSA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA4()
	 * @generated
	 * @ordered
	 */
	protected MSA4CONTENT mSA4;

	/**
	 * The cached value of the '{@link #getMSA5() <em>MSA5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA5()
	 * @generated
	 * @ordered
	 */
	protected MSA5CONTENT mSA5;

	/**
	 * The cached value of the '{@link #getMSA6() <em>MSA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSA6()
	 * @generated
	 * @ordered
	 */
	protected MSA6CONTENT mSA6;

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
	protected MSACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMSACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA1CONTENT getMSA1() {
		return mSA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA1(MSA1CONTENT newMSA1, NotificationChain msgs) {
		MSA1CONTENT oldMSA1 = mSA1;
		mSA1 = newMSA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA1, oldMSA1, newMSA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA1(MSA1CONTENT newMSA1) {
		if (newMSA1 != mSA1) {
			NotificationChain msgs = null;
			if (mSA1 != null)
				msgs = ((InternalEObject)mSA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA1, null, msgs);
			if (newMSA1 != null)
				msgs = ((InternalEObject)newMSA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA1, null, msgs);
			msgs = basicSetMSA1(newMSA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA1, newMSA1, newMSA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA2CONTENT getMSA2() {
		return mSA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA2(MSA2CONTENT newMSA2, NotificationChain msgs) {
		MSA2CONTENT oldMSA2 = mSA2;
		mSA2 = newMSA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA2, oldMSA2, newMSA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA2(MSA2CONTENT newMSA2) {
		if (newMSA2 != mSA2) {
			NotificationChain msgs = null;
			if (mSA2 != null)
				msgs = ((InternalEObject)mSA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA2, null, msgs);
			if (newMSA2 != null)
				msgs = ((InternalEObject)newMSA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA2, null, msgs);
			msgs = basicSetMSA2(newMSA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA2, newMSA2, newMSA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA3CONTENT getMSA3() {
		return mSA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA3(MSA3CONTENT newMSA3, NotificationChain msgs) {
		MSA3CONTENT oldMSA3 = mSA3;
		mSA3 = newMSA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA3, oldMSA3, newMSA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA3(MSA3CONTENT newMSA3) {
		if (newMSA3 != mSA3) {
			NotificationChain msgs = null;
			if (mSA3 != null)
				msgs = ((InternalEObject)mSA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA3, null, msgs);
			if (newMSA3 != null)
				msgs = ((InternalEObject)newMSA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA3, null, msgs);
			msgs = basicSetMSA3(newMSA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA3, newMSA3, newMSA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA4CONTENT getMSA4() {
		return mSA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA4(MSA4CONTENT newMSA4, NotificationChain msgs) {
		MSA4CONTENT oldMSA4 = mSA4;
		mSA4 = newMSA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA4, oldMSA4, newMSA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA4(MSA4CONTENT newMSA4) {
		if (newMSA4 != mSA4) {
			NotificationChain msgs = null;
			if (mSA4 != null)
				msgs = ((InternalEObject)mSA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA4, null, msgs);
			if (newMSA4 != null)
				msgs = ((InternalEObject)newMSA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA4, null, msgs);
			msgs = basicSetMSA4(newMSA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA4, newMSA4, newMSA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA5CONTENT getMSA5() {
		return mSA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA5(MSA5CONTENT newMSA5, NotificationChain msgs) {
		MSA5CONTENT oldMSA5 = mSA5;
		mSA5 = newMSA5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA5, oldMSA5, newMSA5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA5(MSA5CONTENT newMSA5) {
		if (newMSA5 != mSA5) {
			NotificationChain msgs = null;
			if (mSA5 != null)
				msgs = ((InternalEObject)mSA5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA5, null, msgs);
			if (newMSA5 != null)
				msgs = ((InternalEObject)newMSA5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA5, null, msgs);
			msgs = basicSetMSA5(newMSA5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA5, newMSA5, newMSA5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSA6CONTENT getMSA6() {
		return mSA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSA6(MSA6CONTENT newMSA6, NotificationChain msgs) {
		MSA6CONTENT oldMSA6 = mSA6;
		mSA6 = newMSA6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA6, oldMSA6, newMSA6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSA6(MSA6CONTENT newMSA6) {
		if (newMSA6 != mSA6) {
			NotificationChain msgs = null;
			if (mSA6 != null)
				msgs = ((InternalEObject)mSA6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA6, null, msgs);
			if (newMSA6 != null)
				msgs = ((InternalEObject)newMSA6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSACONTENT__MSA6, null, msgs);
			msgs = basicSetMSA6(newMSA6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSACONTENT__MSA6, newMSA6, newMSA6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MSACONTENT__ANY);
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
			case V2xmlPackage.MSACONTENT__MSA1:
				return basicSetMSA1(null, msgs);
			case V2xmlPackage.MSACONTENT__MSA2:
				return basicSetMSA2(null, msgs);
			case V2xmlPackage.MSACONTENT__MSA3:
				return basicSetMSA3(null, msgs);
			case V2xmlPackage.MSACONTENT__MSA4:
				return basicSetMSA4(null, msgs);
			case V2xmlPackage.MSACONTENT__MSA5:
				return basicSetMSA5(null, msgs);
			case V2xmlPackage.MSACONTENT__MSA6:
				return basicSetMSA6(null, msgs);
			case V2xmlPackage.MSACONTENT__ANY:
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
			case V2xmlPackage.MSACONTENT__MSA1:
				return getMSA1();
			case V2xmlPackage.MSACONTENT__MSA2:
				return getMSA2();
			case V2xmlPackage.MSACONTENT__MSA3:
				return getMSA3();
			case V2xmlPackage.MSACONTENT__MSA4:
				return getMSA4();
			case V2xmlPackage.MSACONTENT__MSA5:
				return getMSA5();
			case V2xmlPackage.MSACONTENT__MSA6:
				return getMSA6();
			case V2xmlPackage.MSACONTENT__ANY:
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
			case V2xmlPackage.MSACONTENT__MSA1:
				setMSA1((MSA1CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__MSA2:
				setMSA2((MSA2CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__MSA3:
				setMSA3((MSA3CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__MSA4:
				setMSA4((MSA4CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__MSA5:
				setMSA5((MSA5CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__MSA6:
				setMSA6((MSA6CONTENT)newValue);
				return;
			case V2xmlPackage.MSACONTENT__ANY:
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
			case V2xmlPackage.MSACONTENT__MSA1:
				setMSA1((MSA1CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__MSA2:
				setMSA2((MSA2CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__MSA3:
				setMSA3((MSA3CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__MSA4:
				setMSA4((MSA4CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__MSA5:
				setMSA5((MSA5CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__MSA6:
				setMSA6((MSA6CONTENT)null);
				return;
			case V2xmlPackage.MSACONTENT__ANY:
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
			case V2xmlPackage.MSACONTENT__MSA1:
				return mSA1 != null;
			case V2xmlPackage.MSACONTENT__MSA2:
				return mSA2 != null;
			case V2xmlPackage.MSACONTENT__MSA3:
				return mSA3 != null;
			case V2xmlPackage.MSACONTENT__MSA4:
				return mSA4 != null;
			case V2xmlPackage.MSACONTENT__MSA5:
				return mSA5 != null;
			case V2xmlPackage.MSACONTENT__MSA6:
				return mSA6 != null;
			case V2xmlPackage.MSACONTENT__ANY:
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

} //MSACONTENTImpl
