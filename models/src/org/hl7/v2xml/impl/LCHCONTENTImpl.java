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

import org.hl7.v2xml.LCH1CONTENT;
import org.hl7.v2xml.LCH2CONTENT;
import org.hl7.v2xml.LCH3CONTENT;
import org.hl7.v2xml.LCH4CONTENT;
import org.hl7.v2xml.LCH5CONTENT;
import org.hl7.v2xml.LCHCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LCHCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getLCH1 <em>LCH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getLCH2 <em>LCH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getLCH3 <em>LCH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getLCH4 <em>LCH4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getLCH5 <em>LCH5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCHCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCHCONTENTImpl extends EObjectImpl implements LCHCONTENT {
	/**
	 * The cached value of the '{@link #getLCH1() <em>LCH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH1()
	 * @generated
	 * @ordered
	 */
	protected LCH1CONTENT lCH1;

	/**
	 * The cached value of the '{@link #getLCH2() <em>LCH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH2()
	 * @generated
	 * @ordered
	 */
	protected LCH2CONTENT lCH2;

	/**
	 * The cached value of the '{@link #getLCH3() <em>LCH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH3()
	 * @generated
	 * @ordered
	 */
	protected LCH3CONTENT lCH3;

	/**
	 * The cached value of the '{@link #getLCH4() <em>LCH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH4()
	 * @generated
	 * @ordered
	 */
	protected LCH4CONTENT lCH4;

	/**
	 * The cached value of the '{@link #getLCH5() <em>LCH5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCH5()
	 * @generated
	 * @ordered
	 */
	protected LCH5CONTENT lCH5;

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
	protected LCHCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLCHCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCH1CONTENT getLCH1() {
		return lCH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCH1(LCH1CONTENT newLCH1, NotificationChain msgs) {
		LCH1CONTENT oldLCH1 = lCH1;
		lCH1 = newLCH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH1, oldLCH1, newLCH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCH1(LCH1CONTENT newLCH1) {
		if (newLCH1 != lCH1) {
			NotificationChain msgs = null;
			if (lCH1 != null)
				msgs = ((InternalEObject)lCH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH1, null, msgs);
			if (newLCH1 != null)
				msgs = ((InternalEObject)newLCH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH1, null, msgs);
			msgs = basicSetLCH1(newLCH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH1, newLCH1, newLCH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCH2CONTENT getLCH2() {
		return lCH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCH2(LCH2CONTENT newLCH2, NotificationChain msgs) {
		LCH2CONTENT oldLCH2 = lCH2;
		lCH2 = newLCH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH2, oldLCH2, newLCH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCH2(LCH2CONTENT newLCH2) {
		if (newLCH2 != lCH2) {
			NotificationChain msgs = null;
			if (lCH2 != null)
				msgs = ((InternalEObject)lCH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH2, null, msgs);
			if (newLCH2 != null)
				msgs = ((InternalEObject)newLCH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH2, null, msgs);
			msgs = basicSetLCH2(newLCH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH2, newLCH2, newLCH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCH3CONTENT getLCH3() {
		return lCH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCH3(LCH3CONTENT newLCH3, NotificationChain msgs) {
		LCH3CONTENT oldLCH3 = lCH3;
		lCH3 = newLCH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH3, oldLCH3, newLCH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCH3(LCH3CONTENT newLCH3) {
		if (newLCH3 != lCH3) {
			NotificationChain msgs = null;
			if (lCH3 != null)
				msgs = ((InternalEObject)lCH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH3, null, msgs);
			if (newLCH3 != null)
				msgs = ((InternalEObject)newLCH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH3, null, msgs);
			msgs = basicSetLCH3(newLCH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH3, newLCH3, newLCH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCH4CONTENT getLCH4() {
		return lCH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCH4(LCH4CONTENT newLCH4, NotificationChain msgs) {
		LCH4CONTENT oldLCH4 = lCH4;
		lCH4 = newLCH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH4, oldLCH4, newLCH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCH4(LCH4CONTENT newLCH4) {
		if (newLCH4 != lCH4) {
			NotificationChain msgs = null;
			if (lCH4 != null)
				msgs = ((InternalEObject)lCH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH4, null, msgs);
			if (newLCH4 != null)
				msgs = ((InternalEObject)newLCH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH4, null, msgs);
			msgs = basicSetLCH4(newLCH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH4, newLCH4, newLCH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCH5CONTENT getLCH5() {
		return lCH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCH5(LCH5CONTENT newLCH5, NotificationChain msgs) {
		LCH5CONTENT oldLCH5 = lCH5;
		lCH5 = newLCH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH5, oldLCH5, newLCH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCH5(LCH5CONTENT newLCH5) {
		if (newLCH5 != lCH5) {
			NotificationChain msgs = null;
			if (lCH5 != null)
				msgs = ((InternalEObject)lCH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH5, null, msgs);
			if (newLCH5 != null)
				msgs = ((InternalEObject)newLCH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCHCONTENT__LCH5, null, msgs);
			msgs = basicSetLCH5(newLCH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCHCONTENT__LCH5, newLCH5, newLCH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LCHCONTENT__ANY);
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
			case V2xmlPackage.LCHCONTENT__LCH1:
				return basicSetLCH1(null, msgs);
			case V2xmlPackage.LCHCONTENT__LCH2:
				return basicSetLCH2(null, msgs);
			case V2xmlPackage.LCHCONTENT__LCH3:
				return basicSetLCH3(null, msgs);
			case V2xmlPackage.LCHCONTENT__LCH4:
				return basicSetLCH4(null, msgs);
			case V2xmlPackage.LCHCONTENT__LCH5:
				return basicSetLCH5(null, msgs);
			case V2xmlPackage.LCHCONTENT__ANY:
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
			case V2xmlPackage.LCHCONTENT__LCH1:
				return getLCH1();
			case V2xmlPackage.LCHCONTENT__LCH2:
				return getLCH2();
			case V2xmlPackage.LCHCONTENT__LCH3:
				return getLCH3();
			case V2xmlPackage.LCHCONTENT__LCH4:
				return getLCH4();
			case V2xmlPackage.LCHCONTENT__LCH5:
				return getLCH5();
			case V2xmlPackage.LCHCONTENT__ANY:
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
			case V2xmlPackage.LCHCONTENT__LCH1:
				setLCH1((LCH1CONTENT)newValue);
				return;
			case V2xmlPackage.LCHCONTENT__LCH2:
				setLCH2((LCH2CONTENT)newValue);
				return;
			case V2xmlPackage.LCHCONTENT__LCH3:
				setLCH3((LCH3CONTENT)newValue);
				return;
			case V2xmlPackage.LCHCONTENT__LCH4:
				setLCH4((LCH4CONTENT)newValue);
				return;
			case V2xmlPackage.LCHCONTENT__LCH5:
				setLCH5((LCH5CONTENT)newValue);
				return;
			case V2xmlPackage.LCHCONTENT__ANY:
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
			case V2xmlPackage.LCHCONTENT__LCH1:
				setLCH1((LCH1CONTENT)null);
				return;
			case V2xmlPackage.LCHCONTENT__LCH2:
				setLCH2((LCH2CONTENT)null);
				return;
			case V2xmlPackage.LCHCONTENT__LCH3:
				setLCH3((LCH3CONTENT)null);
				return;
			case V2xmlPackage.LCHCONTENT__LCH4:
				setLCH4((LCH4CONTENT)null);
				return;
			case V2xmlPackage.LCHCONTENT__LCH5:
				setLCH5((LCH5CONTENT)null);
				return;
			case V2xmlPackage.LCHCONTENT__ANY:
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
			case V2xmlPackage.LCHCONTENT__LCH1:
				return lCH1 != null;
			case V2xmlPackage.LCHCONTENT__LCH2:
				return lCH2 != null;
			case V2xmlPackage.LCHCONTENT__LCH3:
				return lCH3 != null;
			case V2xmlPackage.LCHCONTENT__LCH4:
				return lCH4 != null;
			case V2xmlPackage.LCHCONTENT__LCH5:
				return lCH5 != null;
			case V2xmlPackage.LCHCONTENT__ANY:
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

} //LCHCONTENTImpl
