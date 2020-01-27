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

import org.hl7.v2xml.SFT1CONTENT;
import org.hl7.v2xml.SFT2CONTENT;
import org.hl7.v2xml.SFT3CONTENT;
import org.hl7.v2xml.SFT4CONTENT;
import org.hl7.v2xml.SFT5CONTENT;
import org.hl7.v2xml.SFT6CONTENT;
import org.hl7.v2xml.SFTCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SFTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT1 <em>SFT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT2 <em>SFT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT3 <em>SFT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT4 <em>SFT4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT5 <em>SFT5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getSFT6 <em>SFT6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SFTCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SFTCONTENTImpl extends EObjectImpl implements SFTCONTENT {
	/**
	 * The cached value of the '{@link #getSFT1() <em>SFT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT1()
	 * @generated
	 * @ordered
	 */
	protected SFT1CONTENT sFT1;

	/**
	 * The cached value of the '{@link #getSFT2() <em>SFT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT2()
	 * @generated
	 * @ordered
	 */
	protected SFT2CONTENT sFT2;

	/**
	 * The cached value of the '{@link #getSFT3() <em>SFT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT3()
	 * @generated
	 * @ordered
	 */
	protected SFT3CONTENT sFT3;

	/**
	 * The cached value of the '{@link #getSFT4() <em>SFT4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT4()
	 * @generated
	 * @ordered
	 */
	protected SFT4CONTENT sFT4;

	/**
	 * The cached value of the '{@link #getSFT5() <em>SFT5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT5()
	 * @generated
	 * @ordered
	 */
	protected SFT5CONTENT sFT5;

	/**
	 * The cached value of the '{@link #getSFT6() <em>SFT6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT6()
	 * @generated
	 * @ordered
	 */
	protected SFT6CONTENT sFT6;

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
	protected SFTCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSFTCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT1CONTENT getSFT1() {
		return sFT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT1(SFT1CONTENT newSFT1, NotificationChain msgs) {
		SFT1CONTENT oldSFT1 = sFT1;
		sFT1 = newSFT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT1, oldSFT1, newSFT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT1(SFT1CONTENT newSFT1) {
		if (newSFT1 != sFT1) {
			NotificationChain msgs = null;
			if (sFT1 != null)
				msgs = ((InternalEObject)sFT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT1, null, msgs);
			if (newSFT1 != null)
				msgs = ((InternalEObject)newSFT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT1, null, msgs);
			msgs = basicSetSFT1(newSFT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT1, newSFT1, newSFT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT2CONTENT getSFT2() {
		return sFT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT2(SFT2CONTENT newSFT2, NotificationChain msgs) {
		SFT2CONTENT oldSFT2 = sFT2;
		sFT2 = newSFT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT2, oldSFT2, newSFT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT2(SFT2CONTENT newSFT2) {
		if (newSFT2 != sFT2) {
			NotificationChain msgs = null;
			if (sFT2 != null)
				msgs = ((InternalEObject)sFT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT2, null, msgs);
			if (newSFT2 != null)
				msgs = ((InternalEObject)newSFT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT2, null, msgs);
			msgs = basicSetSFT2(newSFT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT2, newSFT2, newSFT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT3CONTENT getSFT3() {
		return sFT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT3(SFT3CONTENT newSFT3, NotificationChain msgs) {
		SFT3CONTENT oldSFT3 = sFT3;
		sFT3 = newSFT3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT3, oldSFT3, newSFT3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT3(SFT3CONTENT newSFT3) {
		if (newSFT3 != sFT3) {
			NotificationChain msgs = null;
			if (sFT3 != null)
				msgs = ((InternalEObject)sFT3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT3, null, msgs);
			if (newSFT3 != null)
				msgs = ((InternalEObject)newSFT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT3, null, msgs);
			msgs = basicSetSFT3(newSFT3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT3, newSFT3, newSFT3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT4CONTENT getSFT4() {
		return sFT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT4(SFT4CONTENT newSFT4, NotificationChain msgs) {
		SFT4CONTENT oldSFT4 = sFT4;
		sFT4 = newSFT4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT4, oldSFT4, newSFT4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT4(SFT4CONTENT newSFT4) {
		if (newSFT4 != sFT4) {
			NotificationChain msgs = null;
			if (sFT4 != null)
				msgs = ((InternalEObject)sFT4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT4, null, msgs);
			if (newSFT4 != null)
				msgs = ((InternalEObject)newSFT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT4, null, msgs);
			msgs = basicSetSFT4(newSFT4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT4, newSFT4, newSFT4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT5CONTENT getSFT5() {
		return sFT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT5(SFT5CONTENT newSFT5, NotificationChain msgs) {
		SFT5CONTENT oldSFT5 = sFT5;
		sFT5 = newSFT5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT5, oldSFT5, newSFT5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT5(SFT5CONTENT newSFT5) {
		if (newSFT5 != sFT5) {
			NotificationChain msgs = null;
			if (sFT5 != null)
				msgs = ((InternalEObject)sFT5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT5, null, msgs);
			if (newSFT5 != null)
				msgs = ((InternalEObject)newSFT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT5, null, msgs);
			msgs = basicSetSFT5(newSFT5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT5, newSFT5, newSFT5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFT6CONTENT getSFT6() {
		return sFT6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSFT6(SFT6CONTENT newSFT6, NotificationChain msgs) {
		SFT6CONTENT oldSFT6 = sFT6;
		sFT6 = newSFT6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT6, oldSFT6, newSFT6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSFT6(SFT6CONTENT newSFT6) {
		if (newSFT6 != sFT6) {
			NotificationChain msgs = null;
			if (sFT6 != null)
				msgs = ((InternalEObject)sFT6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT6, null, msgs);
			if (newSFT6 != null)
				msgs = ((InternalEObject)newSFT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SFTCONTENT__SFT6, null, msgs);
			msgs = basicSetSFT6(newSFT6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SFTCONTENT__SFT6, newSFT6, newSFT6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SFTCONTENT__ANY);
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
			case V2xmlPackage.SFTCONTENT__SFT1:
				return basicSetSFT1(null, msgs);
			case V2xmlPackage.SFTCONTENT__SFT2:
				return basicSetSFT2(null, msgs);
			case V2xmlPackage.SFTCONTENT__SFT3:
				return basicSetSFT3(null, msgs);
			case V2xmlPackage.SFTCONTENT__SFT4:
				return basicSetSFT4(null, msgs);
			case V2xmlPackage.SFTCONTENT__SFT5:
				return basicSetSFT5(null, msgs);
			case V2xmlPackage.SFTCONTENT__SFT6:
				return basicSetSFT6(null, msgs);
			case V2xmlPackage.SFTCONTENT__ANY:
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
			case V2xmlPackage.SFTCONTENT__SFT1:
				return getSFT1();
			case V2xmlPackage.SFTCONTENT__SFT2:
				return getSFT2();
			case V2xmlPackage.SFTCONTENT__SFT3:
				return getSFT3();
			case V2xmlPackage.SFTCONTENT__SFT4:
				return getSFT4();
			case V2xmlPackage.SFTCONTENT__SFT5:
				return getSFT5();
			case V2xmlPackage.SFTCONTENT__SFT6:
				return getSFT6();
			case V2xmlPackage.SFTCONTENT__ANY:
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
			case V2xmlPackage.SFTCONTENT__SFT1:
				setSFT1((SFT1CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__SFT2:
				setSFT2((SFT2CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__SFT3:
				setSFT3((SFT3CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__SFT4:
				setSFT4((SFT4CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__SFT5:
				setSFT5((SFT5CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__SFT6:
				setSFT6((SFT6CONTENT)newValue);
				return;
			case V2xmlPackage.SFTCONTENT__ANY:
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
			case V2xmlPackage.SFTCONTENT__SFT1:
				setSFT1((SFT1CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__SFT2:
				setSFT2((SFT2CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__SFT3:
				setSFT3((SFT3CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__SFT4:
				setSFT4((SFT4CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__SFT5:
				setSFT5((SFT5CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__SFT6:
				setSFT6((SFT6CONTENT)null);
				return;
			case V2xmlPackage.SFTCONTENT__ANY:
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
			case V2xmlPackage.SFTCONTENT__SFT1:
				return sFT1 != null;
			case V2xmlPackage.SFTCONTENT__SFT2:
				return sFT2 != null;
			case V2xmlPackage.SFTCONTENT__SFT3:
				return sFT3 != null;
			case V2xmlPackage.SFTCONTENT__SFT4:
				return sFT4 != null;
			case V2xmlPackage.SFTCONTENT__SFT5:
				return sFT5 != null;
			case V2xmlPackage.SFTCONTENT__SFT6:
				return sFT6 != null;
			case V2xmlPackage.SFTCONTENT__ANY:
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

} //SFTCONTENTImpl
