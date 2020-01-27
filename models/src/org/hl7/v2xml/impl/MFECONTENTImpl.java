/**
 */
package org.hl7.v2xml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.MFE1CONTENT;
import org.hl7.v2xml.MFE2CONTENT;
import org.hl7.v2xml.MFE3CONTENT;
import org.hl7.v2xml.MFE4CONTENT;
import org.hl7.v2xml.MFE5CONTENT;
import org.hl7.v2xml.MFECONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFECONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getMFE1 <em>MFE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getMFE2 <em>MFE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getMFE3 <em>MFE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getMFE4 <em>MFE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getMFE5 <em>MFE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFECONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFECONTENTImpl extends EObjectImpl implements MFECONTENT {
	/**
	 * The cached value of the '{@link #getMFE1() <em>MFE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE1()
	 * @generated
	 * @ordered
	 */
	protected MFE1CONTENT mFE1;

	/**
	 * The cached value of the '{@link #getMFE2() <em>MFE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE2()
	 * @generated
	 * @ordered
	 */
	protected MFE2CONTENT mFE2;

	/**
	 * The cached value of the '{@link #getMFE3() <em>MFE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE3()
	 * @generated
	 * @ordered
	 */
	protected MFE3CONTENT mFE3;

	/**
	 * The cached value of the '{@link #getMFE4() <em>MFE4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE4()
	 * @generated
	 * @ordered
	 */
	protected EList<MFE4CONTENT> mFE4;

	/**
	 * The cached value of the '{@link #getMFE5() <em>MFE5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFE5()
	 * @generated
	 * @ordered
	 */
	protected EList<MFE5CONTENT> mFE5;

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
	protected MFECONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMFECONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFE1CONTENT getMFE1() {
		return mFE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFE1(MFE1CONTENT newMFE1, NotificationChain msgs) {
		MFE1CONTENT oldMFE1 = mFE1;
		mFE1 = newMFE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE1, oldMFE1, newMFE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFE1(MFE1CONTENT newMFE1) {
		if (newMFE1 != mFE1) {
			NotificationChain msgs = null;
			if (mFE1 != null)
				msgs = ((InternalEObject)mFE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE1, null, msgs);
			if (newMFE1 != null)
				msgs = ((InternalEObject)newMFE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE1, null, msgs);
			msgs = basicSetMFE1(newMFE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE1, newMFE1, newMFE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFE2CONTENT getMFE2() {
		return mFE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFE2(MFE2CONTENT newMFE2, NotificationChain msgs) {
		MFE2CONTENT oldMFE2 = mFE2;
		mFE2 = newMFE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE2, oldMFE2, newMFE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFE2(MFE2CONTENT newMFE2) {
		if (newMFE2 != mFE2) {
			NotificationChain msgs = null;
			if (mFE2 != null)
				msgs = ((InternalEObject)mFE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE2, null, msgs);
			if (newMFE2 != null)
				msgs = ((InternalEObject)newMFE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE2, null, msgs);
			msgs = basicSetMFE2(newMFE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE2, newMFE2, newMFE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFE3CONTENT getMFE3() {
		return mFE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFE3(MFE3CONTENT newMFE3, NotificationChain msgs) {
		MFE3CONTENT oldMFE3 = mFE3;
		mFE3 = newMFE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE3, oldMFE3, newMFE3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFE3(MFE3CONTENT newMFE3) {
		if (newMFE3 != mFE3) {
			NotificationChain msgs = null;
			if (mFE3 != null)
				msgs = ((InternalEObject)mFE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE3, null, msgs);
			if (newMFE3 != null)
				msgs = ((InternalEObject)newMFE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFECONTENT__MFE3, null, msgs);
			msgs = basicSetMFE3(newMFE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFECONTENT__MFE3, newMFE3, newMFE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFE4CONTENT> getMFE4() {
		if (mFE4 == null) {
			mFE4 = new EObjectContainmentEList<MFE4CONTENT>(MFE4CONTENT.class, this, V2xmlPackage.MFECONTENT__MFE4);
		}
		return mFE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFE5CONTENT> getMFE5() {
		if (mFE5 == null) {
			mFE5 = new EObjectContainmentEList<MFE5CONTENT>(MFE5CONTENT.class, this, V2xmlPackage.MFECONTENT__MFE5);
		}
		return mFE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MFECONTENT__ANY);
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
			case V2xmlPackage.MFECONTENT__MFE1:
				return basicSetMFE1(null, msgs);
			case V2xmlPackage.MFECONTENT__MFE2:
				return basicSetMFE2(null, msgs);
			case V2xmlPackage.MFECONTENT__MFE3:
				return basicSetMFE3(null, msgs);
			case V2xmlPackage.MFECONTENT__MFE4:
				return ((InternalEList<?>)getMFE4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MFECONTENT__MFE5:
				return ((InternalEList<?>)getMFE5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MFECONTENT__ANY:
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
			case V2xmlPackage.MFECONTENT__MFE1:
				return getMFE1();
			case V2xmlPackage.MFECONTENT__MFE2:
				return getMFE2();
			case V2xmlPackage.MFECONTENT__MFE3:
				return getMFE3();
			case V2xmlPackage.MFECONTENT__MFE4:
				return getMFE4();
			case V2xmlPackage.MFECONTENT__MFE5:
				return getMFE5();
			case V2xmlPackage.MFECONTENT__ANY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.MFECONTENT__MFE1:
				setMFE1((MFE1CONTENT)newValue);
				return;
			case V2xmlPackage.MFECONTENT__MFE2:
				setMFE2((MFE2CONTENT)newValue);
				return;
			case V2xmlPackage.MFECONTENT__MFE3:
				setMFE3((MFE3CONTENT)newValue);
				return;
			case V2xmlPackage.MFECONTENT__MFE4:
				getMFE4().clear();
				getMFE4().addAll((Collection<? extends MFE4CONTENT>)newValue);
				return;
			case V2xmlPackage.MFECONTENT__MFE5:
				getMFE5().clear();
				getMFE5().addAll((Collection<? extends MFE5CONTENT>)newValue);
				return;
			case V2xmlPackage.MFECONTENT__ANY:
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
			case V2xmlPackage.MFECONTENT__MFE1:
				setMFE1((MFE1CONTENT)null);
				return;
			case V2xmlPackage.MFECONTENT__MFE2:
				setMFE2((MFE2CONTENT)null);
				return;
			case V2xmlPackage.MFECONTENT__MFE3:
				setMFE3((MFE3CONTENT)null);
				return;
			case V2xmlPackage.MFECONTENT__MFE4:
				getMFE4().clear();
				return;
			case V2xmlPackage.MFECONTENT__MFE5:
				getMFE5().clear();
				return;
			case V2xmlPackage.MFECONTENT__ANY:
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
			case V2xmlPackage.MFECONTENT__MFE1:
				return mFE1 != null;
			case V2xmlPackage.MFECONTENT__MFE2:
				return mFE2 != null;
			case V2xmlPackage.MFECONTENT__MFE3:
				return mFE3 != null;
			case V2xmlPackage.MFECONTENT__MFE4:
				return mFE4 != null && !mFE4.isEmpty();
			case V2xmlPackage.MFECONTENT__MFE5:
				return mFE5 != null && !mFE5.isEmpty();
			case V2xmlPackage.MFECONTENT__ANY:
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

} //MFECONTENTImpl
