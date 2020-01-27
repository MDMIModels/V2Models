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

import org.hl7.v2xml.MFA1CONTENT;
import org.hl7.v2xml.MFA2CONTENT;
import org.hl7.v2xml.MFA3CONTENT;
import org.hl7.v2xml.MFA4CONTENT;
import org.hl7.v2xml.MFA5CONTENT;
import org.hl7.v2xml.MFA6CONTENT;
import org.hl7.v2xml.MFACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MFACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA1 <em>MFA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA2 <em>MFA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA3 <em>MFA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA4 <em>MFA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA5 <em>MFA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getMFA6 <em>MFA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MFACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFACONTENTImpl extends EObjectImpl implements MFACONTENT {
	/**
	 * The cached value of the '{@link #getMFA1() <em>MFA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA1()
	 * @generated
	 * @ordered
	 */
	protected MFA1CONTENT mFA1;

	/**
	 * The cached value of the '{@link #getMFA2() <em>MFA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA2()
	 * @generated
	 * @ordered
	 */
	protected MFA2CONTENT mFA2;

	/**
	 * The cached value of the '{@link #getMFA3() <em>MFA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA3()
	 * @generated
	 * @ordered
	 */
	protected MFA3CONTENT mFA3;

	/**
	 * The cached value of the '{@link #getMFA4() <em>MFA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA4()
	 * @generated
	 * @ordered
	 */
	protected MFA4CONTENT mFA4;

	/**
	 * The cached value of the '{@link #getMFA5() <em>MFA5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA5()
	 * @generated
	 * @ordered
	 */
	protected EList<MFA5CONTENT> mFA5;

	/**
	 * The cached value of the '{@link #getMFA6() <em>MFA6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFA6()
	 * @generated
	 * @ordered
	 */
	protected EList<MFA6CONTENT> mFA6;

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
	protected MFACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMFACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA1CONTENT getMFA1() {
		return mFA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFA1(MFA1CONTENT newMFA1, NotificationChain msgs) {
		MFA1CONTENT oldMFA1 = mFA1;
		mFA1 = newMFA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA1, oldMFA1, newMFA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFA1(MFA1CONTENT newMFA1) {
		if (newMFA1 != mFA1) {
			NotificationChain msgs = null;
			if (mFA1 != null)
				msgs = ((InternalEObject)mFA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA1, null, msgs);
			if (newMFA1 != null)
				msgs = ((InternalEObject)newMFA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA1, null, msgs);
			msgs = basicSetMFA1(newMFA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA1, newMFA1, newMFA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA2CONTENT getMFA2() {
		return mFA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFA2(MFA2CONTENT newMFA2, NotificationChain msgs) {
		MFA2CONTENT oldMFA2 = mFA2;
		mFA2 = newMFA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA2, oldMFA2, newMFA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFA2(MFA2CONTENT newMFA2) {
		if (newMFA2 != mFA2) {
			NotificationChain msgs = null;
			if (mFA2 != null)
				msgs = ((InternalEObject)mFA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA2, null, msgs);
			if (newMFA2 != null)
				msgs = ((InternalEObject)newMFA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA2, null, msgs);
			msgs = basicSetMFA2(newMFA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA2, newMFA2, newMFA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA3CONTENT getMFA3() {
		return mFA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFA3(MFA3CONTENT newMFA3, NotificationChain msgs) {
		MFA3CONTENT oldMFA3 = mFA3;
		mFA3 = newMFA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA3, oldMFA3, newMFA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFA3(MFA3CONTENT newMFA3) {
		if (newMFA3 != mFA3) {
			NotificationChain msgs = null;
			if (mFA3 != null)
				msgs = ((InternalEObject)mFA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA3, null, msgs);
			if (newMFA3 != null)
				msgs = ((InternalEObject)newMFA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA3, null, msgs);
			msgs = basicSetMFA3(newMFA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA3, newMFA3, newMFA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MFA4CONTENT getMFA4() {
		return mFA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMFA4(MFA4CONTENT newMFA4, NotificationChain msgs) {
		MFA4CONTENT oldMFA4 = mFA4;
		mFA4 = newMFA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA4, oldMFA4, newMFA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFA4(MFA4CONTENT newMFA4) {
		if (newMFA4 != mFA4) {
			NotificationChain msgs = null;
			if (mFA4 != null)
				msgs = ((InternalEObject)mFA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA4, null, msgs);
			if (newMFA4 != null)
				msgs = ((InternalEObject)newMFA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MFACONTENT__MFA4, null, msgs);
			msgs = basicSetMFA4(newMFA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MFACONTENT__MFA4, newMFA4, newMFA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFA5CONTENT> getMFA5() {
		if (mFA5 == null) {
			mFA5 = new EObjectContainmentEList<MFA5CONTENT>(MFA5CONTENT.class, this, V2xmlPackage.MFACONTENT__MFA5);
		}
		return mFA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MFA6CONTENT> getMFA6() {
		if (mFA6 == null) {
			mFA6 = new EObjectContainmentEList<MFA6CONTENT>(MFA6CONTENT.class, this, V2xmlPackage.MFACONTENT__MFA6);
		}
		return mFA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MFACONTENT__ANY);
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
			case V2xmlPackage.MFACONTENT__MFA1:
				return basicSetMFA1(null, msgs);
			case V2xmlPackage.MFACONTENT__MFA2:
				return basicSetMFA2(null, msgs);
			case V2xmlPackage.MFACONTENT__MFA3:
				return basicSetMFA3(null, msgs);
			case V2xmlPackage.MFACONTENT__MFA4:
				return basicSetMFA4(null, msgs);
			case V2xmlPackage.MFACONTENT__MFA5:
				return ((InternalEList<?>)getMFA5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MFACONTENT__MFA6:
				return ((InternalEList<?>)getMFA6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MFACONTENT__ANY:
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
			case V2xmlPackage.MFACONTENT__MFA1:
				return getMFA1();
			case V2xmlPackage.MFACONTENT__MFA2:
				return getMFA2();
			case V2xmlPackage.MFACONTENT__MFA3:
				return getMFA3();
			case V2xmlPackage.MFACONTENT__MFA4:
				return getMFA4();
			case V2xmlPackage.MFACONTENT__MFA5:
				return getMFA5();
			case V2xmlPackage.MFACONTENT__MFA6:
				return getMFA6();
			case V2xmlPackage.MFACONTENT__ANY:
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
			case V2xmlPackage.MFACONTENT__MFA1:
				setMFA1((MFA1CONTENT)newValue);
				return;
			case V2xmlPackage.MFACONTENT__MFA2:
				setMFA2((MFA2CONTENT)newValue);
				return;
			case V2xmlPackage.MFACONTENT__MFA3:
				setMFA3((MFA3CONTENT)newValue);
				return;
			case V2xmlPackage.MFACONTENT__MFA4:
				setMFA4((MFA4CONTENT)newValue);
				return;
			case V2xmlPackage.MFACONTENT__MFA5:
				getMFA5().clear();
				getMFA5().addAll((Collection<? extends MFA5CONTENT>)newValue);
				return;
			case V2xmlPackage.MFACONTENT__MFA6:
				getMFA6().clear();
				getMFA6().addAll((Collection<? extends MFA6CONTENT>)newValue);
				return;
			case V2xmlPackage.MFACONTENT__ANY:
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
			case V2xmlPackage.MFACONTENT__MFA1:
				setMFA1((MFA1CONTENT)null);
				return;
			case V2xmlPackage.MFACONTENT__MFA2:
				setMFA2((MFA2CONTENT)null);
				return;
			case V2xmlPackage.MFACONTENT__MFA3:
				setMFA3((MFA3CONTENT)null);
				return;
			case V2xmlPackage.MFACONTENT__MFA4:
				setMFA4((MFA4CONTENT)null);
				return;
			case V2xmlPackage.MFACONTENT__MFA5:
				getMFA5().clear();
				return;
			case V2xmlPackage.MFACONTENT__MFA6:
				getMFA6().clear();
				return;
			case V2xmlPackage.MFACONTENT__ANY:
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
			case V2xmlPackage.MFACONTENT__MFA1:
				return mFA1 != null;
			case V2xmlPackage.MFACONTENT__MFA2:
				return mFA2 != null;
			case V2xmlPackage.MFACONTENT__MFA3:
				return mFA3 != null;
			case V2xmlPackage.MFACONTENT__MFA4:
				return mFA4 != null;
			case V2xmlPackage.MFACONTENT__MFA5:
				return mFA5 != null && !mFA5.isEmpty();
			case V2xmlPackage.MFACONTENT__MFA6:
				return mFA6 != null && !mFA6.isEmpty();
			case V2xmlPackage.MFACONTENT__ANY:
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

} //MFACONTENTImpl
