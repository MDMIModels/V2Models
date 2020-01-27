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

import org.hl7.v2xml.ODT1CONTENT;
import org.hl7.v2xml.ODT2CONTENT;
import org.hl7.v2xml.ODT3CONTENT;
import org.hl7.v2xml.ODTCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ODTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ODTCONTENTImpl#getODT1 <em>ODT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODTCONTENTImpl#getODT2 <em>ODT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODTCONTENTImpl#getODT3 <em>ODT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODTCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODTCONTENTImpl extends EObjectImpl implements ODTCONTENT {
	/**
	 * The cached value of the '{@link #getODT1() <em>ODT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODT1()
	 * @generated
	 * @ordered
	 */
	protected ODT1CONTENT oDT1;

	/**
	 * The cached value of the '{@link #getODT2() <em>ODT2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODT2()
	 * @generated
	 * @ordered
	 */
	protected EList<ODT2CONTENT> oDT2;

	/**
	 * The cached value of the '{@link #getODT3() <em>ODT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODT3()
	 * @generated
	 * @ordered
	 */
	protected ODT3CONTENT oDT3;

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
	protected ODTCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getODTCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODT1CONTENT getODT1() {
		return oDT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetODT1(ODT1CONTENT newODT1, NotificationChain msgs) {
		ODT1CONTENT oldODT1 = oDT1;
		oDT1 = newODT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODTCONTENT__ODT1, oldODT1, newODT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setODT1(ODT1CONTENT newODT1) {
		if (newODT1 != oDT1) {
			NotificationChain msgs = null;
			if (oDT1 != null)
				msgs = ((InternalEObject)oDT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODTCONTENT__ODT1, null, msgs);
			if (newODT1 != null)
				msgs = ((InternalEObject)newODT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODTCONTENT__ODT1, null, msgs);
			msgs = basicSetODT1(newODT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODTCONTENT__ODT1, newODT1, newODT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODT2CONTENT> getODT2() {
		if (oDT2 == null) {
			oDT2 = new EObjectContainmentEList<ODT2CONTENT>(ODT2CONTENT.class, this, V2xmlPackage.ODTCONTENT__ODT2);
		}
		return oDT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODT3CONTENT getODT3() {
		return oDT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetODT3(ODT3CONTENT newODT3, NotificationChain msgs) {
		ODT3CONTENT oldODT3 = oDT3;
		oDT3 = newODT3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODTCONTENT__ODT3, oldODT3, newODT3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setODT3(ODT3CONTENT newODT3) {
		if (newODT3 != oDT3) {
			NotificationChain msgs = null;
			if (oDT3 != null)
				msgs = ((InternalEObject)oDT3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODTCONTENT__ODT3, null, msgs);
			if (newODT3 != null)
				msgs = ((InternalEObject)newODT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODTCONTENT__ODT3, null, msgs);
			msgs = basicSetODT3(newODT3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODTCONTENT__ODT3, newODT3, newODT3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ODTCONTENT__ANY);
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
			case V2xmlPackage.ODTCONTENT__ODT1:
				return basicSetODT1(null, msgs);
			case V2xmlPackage.ODTCONTENT__ODT2:
				return ((InternalEList<?>)getODT2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ODTCONTENT__ODT3:
				return basicSetODT3(null, msgs);
			case V2xmlPackage.ODTCONTENT__ANY:
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
			case V2xmlPackage.ODTCONTENT__ODT1:
				return getODT1();
			case V2xmlPackage.ODTCONTENT__ODT2:
				return getODT2();
			case V2xmlPackage.ODTCONTENT__ODT3:
				return getODT3();
			case V2xmlPackage.ODTCONTENT__ANY:
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
			case V2xmlPackage.ODTCONTENT__ODT1:
				setODT1((ODT1CONTENT)newValue);
				return;
			case V2xmlPackage.ODTCONTENT__ODT2:
				getODT2().clear();
				getODT2().addAll((Collection<? extends ODT2CONTENT>)newValue);
				return;
			case V2xmlPackage.ODTCONTENT__ODT3:
				setODT3((ODT3CONTENT)newValue);
				return;
			case V2xmlPackage.ODTCONTENT__ANY:
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
			case V2xmlPackage.ODTCONTENT__ODT1:
				setODT1((ODT1CONTENT)null);
				return;
			case V2xmlPackage.ODTCONTENT__ODT2:
				getODT2().clear();
				return;
			case V2xmlPackage.ODTCONTENT__ODT3:
				setODT3((ODT3CONTENT)null);
				return;
			case V2xmlPackage.ODTCONTENT__ANY:
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
			case V2xmlPackage.ODTCONTENT__ODT1:
				return oDT1 != null;
			case V2xmlPackage.ODTCONTENT__ODT2:
				return oDT2 != null && !oDT2.isEmpty();
			case V2xmlPackage.ODTCONTENT__ODT3:
				return oDT3 != null;
			case V2xmlPackage.ODTCONTENT__ANY:
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

} //ODTCONTENTImpl
