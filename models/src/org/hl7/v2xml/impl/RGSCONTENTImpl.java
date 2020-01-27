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

import org.hl7.v2xml.RGS1CONTENT;
import org.hl7.v2xml.RGS2CONTENT;
import org.hl7.v2xml.RGS3CONTENT;
import org.hl7.v2xml.RGSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RGSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RGSCONTENTImpl#getRGS1 <em>RGS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RGSCONTENTImpl#getRGS2 <em>RGS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RGSCONTENTImpl#getRGS3 <em>RGS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RGSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RGSCONTENTImpl extends EObjectImpl implements RGSCONTENT {
	/**
	 * The cached value of the '{@link #getRGS1() <em>RGS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGS1()
	 * @generated
	 * @ordered
	 */
	protected RGS1CONTENT rGS1;

	/**
	 * The cached value of the '{@link #getRGS2() <em>RGS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGS2()
	 * @generated
	 * @ordered
	 */
	protected RGS2CONTENT rGS2;

	/**
	 * The cached value of the '{@link #getRGS3() <em>RGS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGS3()
	 * @generated
	 * @ordered
	 */
	protected RGS3CONTENT rGS3;

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
	protected RGSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRGSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGS1CONTENT getRGS1() {
		return rGS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRGS1(RGS1CONTENT newRGS1, NotificationChain msgs) {
		RGS1CONTENT oldRGS1 = rGS1;
		rGS1 = newRGS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS1, oldRGS1, newRGS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGS1(RGS1CONTENT newRGS1) {
		if (newRGS1 != rGS1) {
			NotificationChain msgs = null;
			if (rGS1 != null)
				msgs = ((InternalEObject)rGS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS1, null, msgs);
			if (newRGS1 != null)
				msgs = ((InternalEObject)newRGS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS1, null, msgs);
			msgs = basicSetRGS1(newRGS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS1, newRGS1, newRGS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGS2CONTENT getRGS2() {
		return rGS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRGS2(RGS2CONTENT newRGS2, NotificationChain msgs) {
		RGS2CONTENT oldRGS2 = rGS2;
		rGS2 = newRGS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS2, oldRGS2, newRGS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGS2(RGS2CONTENT newRGS2) {
		if (newRGS2 != rGS2) {
			NotificationChain msgs = null;
			if (rGS2 != null)
				msgs = ((InternalEObject)rGS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS2, null, msgs);
			if (newRGS2 != null)
				msgs = ((InternalEObject)newRGS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS2, null, msgs);
			msgs = basicSetRGS2(newRGS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS2, newRGS2, newRGS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGS3CONTENT getRGS3() {
		return rGS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRGS3(RGS3CONTENT newRGS3, NotificationChain msgs) {
		RGS3CONTENT oldRGS3 = rGS3;
		rGS3 = newRGS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS3, oldRGS3, newRGS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGS3(RGS3CONTENT newRGS3) {
		if (newRGS3 != rGS3) {
			NotificationChain msgs = null;
			if (rGS3 != null)
				msgs = ((InternalEObject)rGS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS3, null, msgs);
			if (newRGS3 != null)
				msgs = ((InternalEObject)newRGS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RGSCONTENT__RGS3, null, msgs);
			msgs = basicSetRGS3(newRGS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RGSCONTENT__RGS3, newRGS3, newRGS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RGSCONTENT__ANY);
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
			case V2xmlPackage.RGSCONTENT__RGS1:
				return basicSetRGS1(null, msgs);
			case V2xmlPackage.RGSCONTENT__RGS2:
				return basicSetRGS2(null, msgs);
			case V2xmlPackage.RGSCONTENT__RGS3:
				return basicSetRGS3(null, msgs);
			case V2xmlPackage.RGSCONTENT__ANY:
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
			case V2xmlPackage.RGSCONTENT__RGS1:
				return getRGS1();
			case V2xmlPackage.RGSCONTENT__RGS2:
				return getRGS2();
			case V2xmlPackage.RGSCONTENT__RGS3:
				return getRGS3();
			case V2xmlPackage.RGSCONTENT__ANY:
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
			case V2xmlPackage.RGSCONTENT__RGS1:
				setRGS1((RGS1CONTENT)newValue);
				return;
			case V2xmlPackage.RGSCONTENT__RGS2:
				setRGS2((RGS2CONTENT)newValue);
				return;
			case V2xmlPackage.RGSCONTENT__RGS3:
				setRGS3((RGS3CONTENT)newValue);
				return;
			case V2xmlPackage.RGSCONTENT__ANY:
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
			case V2xmlPackage.RGSCONTENT__RGS1:
				setRGS1((RGS1CONTENT)null);
				return;
			case V2xmlPackage.RGSCONTENT__RGS2:
				setRGS2((RGS2CONTENT)null);
				return;
			case V2xmlPackage.RGSCONTENT__RGS3:
				setRGS3((RGS3CONTENT)null);
				return;
			case V2xmlPackage.RGSCONTENT__ANY:
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
			case V2xmlPackage.RGSCONTENT__RGS1:
				return rGS1 != null;
			case V2xmlPackage.RGSCONTENT__RGS2:
				return rGS2 != null;
			case V2xmlPackage.RGSCONTENT__RGS3:
				return rGS3 != null;
			case V2xmlPackage.RGSCONTENT__ANY:
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

} //RGSCONTENTImpl
