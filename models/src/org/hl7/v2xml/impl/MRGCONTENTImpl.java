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

import org.hl7.v2xml.MRG1CONTENT;
import org.hl7.v2xml.MRG2CONTENT;
import org.hl7.v2xml.MRG3CONTENT;
import org.hl7.v2xml.MRG4CONTENT;
import org.hl7.v2xml.MRG5CONTENT;
import org.hl7.v2xml.MRG6CONTENT;
import org.hl7.v2xml.MRG7CONTENT;
import org.hl7.v2xml.MRGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MRGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG1 <em>MRG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG2 <em>MRG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG3 <em>MRG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG4 <em>MRG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG5 <em>MRG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG6 <em>MRG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getMRG7 <em>MRG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MRGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MRGCONTENTImpl extends EObjectImpl implements MRGCONTENT {
	/**
	 * The cached value of the '{@link #getMRG1() <em>MRG1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG1()
	 * @generated
	 * @ordered
	 */
	protected EList<MRG1CONTENT> mRG1;

	/**
	 * The cached value of the '{@link #getMRG2() <em>MRG2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG2()
	 * @generated
	 * @ordered
	 */
	protected EList<MRG2CONTENT> mRG2;

	/**
	 * The cached value of the '{@link #getMRG3() <em>MRG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG3()
	 * @generated
	 * @ordered
	 */
	protected MRG3CONTENT mRG3;

	/**
	 * The cached value of the '{@link #getMRG4() <em>MRG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG4()
	 * @generated
	 * @ordered
	 */
	protected MRG4CONTENT mRG4;

	/**
	 * The cached value of the '{@link #getMRG5() <em>MRG5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG5()
	 * @generated
	 * @ordered
	 */
	protected MRG5CONTENT mRG5;

	/**
	 * The cached value of the '{@link #getMRG6() <em>MRG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG6()
	 * @generated
	 * @ordered
	 */
	protected MRG6CONTENT mRG6;

	/**
	 * The cached value of the '{@link #getMRG7() <em>MRG7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMRG7()
	 * @generated
	 * @ordered
	 */
	protected EList<MRG7CONTENT> mRG7;

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
	protected MRGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMRGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRG1CONTENT> getMRG1() {
		if (mRG1 == null) {
			mRG1 = new EObjectContainmentEList<MRG1CONTENT>(MRG1CONTENT.class, this, V2xmlPackage.MRGCONTENT__MRG1);
		}
		return mRG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRG2CONTENT> getMRG2() {
		if (mRG2 == null) {
			mRG2 = new EObjectContainmentEList<MRG2CONTENT>(MRG2CONTENT.class, this, V2xmlPackage.MRGCONTENT__MRG2);
		}
		return mRG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRG3CONTENT getMRG3() {
		return mRG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRG3(MRG3CONTENT newMRG3, NotificationChain msgs) {
		MRG3CONTENT oldMRG3 = mRG3;
		mRG3 = newMRG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG3, oldMRG3, newMRG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRG3(MRG3CONTENT newMRG3) {
		if (newMRG3 != mRG3) {
			NotificationChain msgs = null;
			if (mRG3 != null)
				msgs = ((InternalEObject)mRG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG3, null, msgs);
			if (newMRG3 != null)
				msgs = ((InternalEObject)newMRG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG3, null, msgs);
			msgs = basicSetMRG3(newMRG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG3, newMRG3, newMRG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRG4CONTENT getMRG4() {
		return mRG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRG4(MRG4CONTENT newMRG4, NotificationChain msgs) {
		MRG4CONTENT oldMRG4 = mRG4;
		mRG4 = newMRG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG4, oldMRG4, newMRG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRG4(MRG4CONTENT newMRG4) {
		if (newMRG4 != mRG4) {
			NotificationChain msgs = null;
			if (mRG4 != null)
				msgs = ((InternalEObject)mRG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG4, null, msgs);
			if (newMRG4 != null)
				msgs = ((InternalEObject)newMRG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG4, null, msgs);
			msgs = basicSetMRG4(newMRG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG4, newMRG4, newMRG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRG5CONTENT getMRG5() {
		return mRG5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRG5(MRG5CONTENT newMRG5, NotificationChain msgs) {
		MRG5CONTENT oldMRG5 = mRG5;
		mRG5 = newMRG5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG5, oldMRG5, newMRG5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRG5(MRG5CONTENT newMRG5) {
		if (newMRG5 != mRG5) {
			NotificationChain msgs = null;
			if (mRG5 != null)
				msgs = ((InternalEObject)mRG5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG5, null, msgs);
			if (newMRG5 != null)
				msgs = ((InternalEObject)newMRG5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG5, null, msgs);
			msgs = basicSetMRG5(newMRG5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG5, newMRG5, newMRG5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRG6CONTENT getMRG6() {
		return mRG6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMRG6(MRG6CONTENT newMRG6, NotificationChain msgs) {
		MRG6CONTENT oldMRG6 = mRG6;
		mRG6 = newMRG6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG6, oldMRG6, newMRG6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMRG6(MRG6CONTENT newMRG6) {
		if (newMRG6 != mRG6) {
			NotificationChain msgs = null;
			if (mRG6 != null)
				msgs = ((InternalEObject)mRG6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG6, null, msgs);
			if (newMRG6 != null)
				msgs = ((InternalEObject)newMRG6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MRGCONTENT__MRG6, null, msgs);
			msgs = basicSetMRG6(newMRG6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MRGCONTENT__MRG6, newMRG6, newMRG6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MRG7CONTENT> getMRG7() {
		if (mRG7 == null) {
			mRG7 = new EObjectContainmentEList<MRG7CONTENT>(MRG7CONTENT.class, this, V2xmlPackage.MRGCONTENT__MRG7);
		}
		return mRG7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MRGCONTENT__ANY);
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
			case V2xmlPackage.MRGCONTENT__MRG1:
				return ((InternalEList<?>)getMRG1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MRGCONTENT__MRG2:
				return ((InternalEList<?>)getMRG2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MRGCONTENT__MRG3:
				return basicSetMRG3(null, msgs);
			case V2xmlPackage.MRGCONTENT__MRG4:
				return basicSetMRG4(null, msgs);
			case V2xmlPackage.MRGCONTENT__MRG5:
				return basicSetMRG5(null, msgs);
			case V2xmlPackage.MRGCONTENT__MRG6:
				return basicSetMRG6(null, msgs);
			case V2xmlPackage.MRGCONTENT__MRG7:
				return ((InternalEList<?>)getMRG7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MRGCONTENT__ANY:
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
			case V2xmlPackage.MRGCONTENT__MRG1:
				return getMRG1();
			case V2xmlPackage.MRGCONTENT__MRG2:
				return getMRG2();
			case V2xmlPackage.MRGCONTENT__MRG3:
				return getMRG3();
			case V2xmlPackage.MRGCONTENT__MRG4:
				return getMRG4();
			case V2xmlPackage.MRGCONTENT__MRG5:
				return getMRG5();
			case V2xmlPackage.MRGCONTENT__MRG6:
				return getMRG6();
			case V2xmlPackage.MRGCONTENT__MRG7:
				return getMRG7();
			case V2xmlPackage.MRGCONTENT__ANY:
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
			case V2xmlPackage.MRGCONTENT__MRG1:
				getMRG1().clear();
				getMRG1().addAll((Collection<? extends MRG1CONTENT>)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG2:
				getMRG2().clear();
				getMRG2().addAll((Collection<? extends MRG2CONTENT>)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG3:
				setMRG3((MRG3CONTENT)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG4:
				setMRG4((MRG4CONTENT)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG5:
				setMRG5((MRG5CONTENT)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG6:
				setMRG6((MRG6CONTENT)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__MRG7:
				getMRG7().clear();
				getMRG7().addAll((Collection<? extends MRG7CONTENT>)newValue);
				return;
			case V2xmlPackage.MRGCONTENT__ANY:
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
			case V2xmlPackage.MRGCONTENT__MRG1:
				getMRG1().clear();
				return;
			case V2xmlPackage.MRGCONTENT__MRG2:
				getMRG2().clear();
				return;
			case V2xmlPackage.MRGCONTENT__MRG3:
				setMRG3((MRG3CONTENT)null);
				return;
			case V2xmlPackage.MRGCONTENT__MRG4:
				setMRG4((MRG4CONTENT)null);
				return;
			case V2xmlPackage.MRGCONTENT__MRG5:
				setMRG5((MRG5CONTENT)null);
				return;
			case V2xmlPackage.MRGCONTENT__MRG6:
				setMRG6((MRG6CONTENT)null);
				return;
			case V2xmlPackage.MRGCONTENT__MRG7:
				getMRG7().clear();
				return;
			case V2xmlPackage.MRGCONTENT__ANY:
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
			case V2xmlPackage.MRGCONTENT__MRG1:
				return mRG1 != null && !mRG1.isEmpty();
			case V2xmlPackage.MRGCONTENT__MRG2:
				return mRG2 != null && !mRG2.isEmpty();
			case V2xmlPackage.MRGCONTENT__MRG3:
				return mRG3 != null;
			case V2xmlPackage.MRGCONTENT__MRG4:
				return mRG4 != null;
			case V2xmlPackage.MRGCONTENT__MRG5:
				return mRG5 != null;
			case V2xmlPackage.MRGCONTENT__MRG6:
				return mRG6 != null;
			case V2xmlPackage.MRGCONTENT__MRG7:
				return mRG7 != null && !mRG7.isEmpty();
			case V2xmlPackage.MRGCONTENT__ANY:
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

} //MRGCONTENTImpl
