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

import org.hl7.v2xml.OVR1CONTENT;
import org.hl7.v2xml.OVR2CONTENT;
import org.hl7.v2xml.OVR3CONTENT;
import org.hl7.v2xml.OVR4CONTENT;
import org.hl7.v2xml.OVR5CONTENT;
import org.hl7.v2xml.OVRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OVRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getOVR1 <em>OVR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getOVR2 <em>OVR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getOVR3 <em>OVR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getOVR4 <em>OVR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getOVR5 <em>OVR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OVRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OVRCONTENTImpl extends EObjectImpl implements OVRCONTENT {
	/**
	 * The cached value of the '{@link #getOVR1() <em>OVR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR1()
	 * @generated
	 * @ordered
	 */
	protected OVR1CONTENT oVR1;

	/**
	 * The cached value of the '{@link #getOVR2() <em>OVR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR2()
	 * @generated
	 * @ordered
	 */
	protected OVR2CONTENT oVR2;

	/**
	 * The cached value of the '{@link #getOVR3() <em>OVR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR3()
	 * @generated
	 * @ordered
	 */
	protected OVR3CONTENT oVR3;

	/**
	 * The cached value of the '{@link #getOVR4() <em>OVR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR4()
	 * @generated
	 * @ordered
	 */
	protected OVR4CONTENT oVR4;

	/**
	 * The cached value of the '{@link #getOVR5() <em>OVR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOVR5()
	 * @generated
	 * @ordered
	 */
	protected OVR5CONTENT oVR5;

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
	protected OVRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOVRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVR1CONTENT getOVR1() {
		return oVR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOVR1(OVR1CONTENT newOVR1, NotificationChain msgs) {
		OVR1CONTENT oldOVR1 = oVR1;
		oVR1 = newOVR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR1, oldOVR1, newOVR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVR1(OVR1CONTENT newOVR1) {
		if (newOVR1 != oVR1) {
			NotificationChain msgs = null;
			if (oVR1 != null)
				msgs = ((InternalEObject)oVR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR1, null, msgs);
			if (newOVR1 != null)
				msgs = ((InternalEObject)newOVR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR1, null, msgs);
			msgs = basicSetOVR1(newOVR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR1, newOVR1, newOVR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVR2CONTENT getOVR2() {
		return oVR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOVR2(OVR2CONTENT newOVR2, NotificationChain msgs) {
		OVR2CONTENT oldOVR2 = oVR2;
		oVR2 = newOVR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR2, oldOVR2, newOVR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVR2(OVR2CONTENT newOVR2) {
		if (newOVR2 != oVR2) {
			NotificationChain msgs = null;
			if (oVR2 != null)
				msgs = ((InternalEObject)oVR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR2, null, msgs);
			if (newOVR2 != null)
				msgs = ((InternalEObject)newOVR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR2, null, msgs);
			msgs = basicSetOVR2(newOVR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR2, newOVR2, newOVR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVR3CONTENT getOVR3() {
		return oVR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOVR3(OVR3CONTENT newOVR3, NotificationChain msgs) {
		OVR3CONTENT oldOVR3 = oVR3;
		oVR3 = newOVR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR3, oldOVR3, newOVR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVR3(OVR3CONTENT newOVR3) {
		if (newOVR3 != oVR3) {
			NotificationChain msgs = null;
			if (oVR3 != null)
				msgs = ((InternalEObject)oVR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR3, null, msgs);
			if (newOVR3 != null)
				msgs = ((InternalEObject)newOVR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR3, null, msgs);
			msgs = basicSetOVR3(newOVR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR3, newOVR3, newOVR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVR4CONTENT getOVR4() {
		return oVR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOVR4(OVR4CONTENT newOVR4, NotificationChain msgs) {
		OVR4CONTENT oldOVR4 = oVR4;
		oVR4 = newOVR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR4, oldOVR4, newOVR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVR4(OVR4CONTENT newOVR4) {
		if (newOVR4 != oVR4) {
			NotificationChain msgs = null;
			if (oVR4 != null)
				msgs = ((InternalEObject)oVR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR4, null, msgs);
			if (newOVR4 != null)
				msgs = ((InternalEObject)newOVR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR4, null, msgs);
			msgs = basicSetOVR4(newOVR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR4, newOVR4, newOVR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OVR5CONTENT getOVR5() {
		return oVR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOVR5(OVR5CONTENT newOVR5, NotificationChain msgs) {
		OVR5CONTENT oldOVR5 = oVR5;
		oVR5 = newOVR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR5, oldOVR5, newOVR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOVR5(OVR5CONTENT newOVR5) {
		if (newOVR5 != oVR5) {
			NotificationChain msgs = null;
			if (oVR5 != null)
				msgs = ((InternalEObject)oVR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR5, null, msgs);
			if (newOVR5 != null)
				msgs = ((InternalEObject)newOVR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OVRCONTENT__OVR5, null, msgs);
			msgs = basicSetOVR5(newOVR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OVRCONTENT__OVR5, newOVR5, newOVR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OVRCONTENT__ANY);
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
			case V2xmlPackage.OVRCONTENT__OVR1:
				return basicSetOVR1(null, msgs);
			case V2xmlPackage.OVRCONTENT__OVR2:
				return basicSetOVR2(null, msgs);
			case V2xmlPackage.OVRCONTENT__OVR3:
				return basicSetOVR3(null, msgs);
			case V2xmlPackage.OVRCONTENT__OVR4:
				return basicSetOVR4(null, msgs);
			case V2xmlPackage.OVRCONTENT__OVR5:
				return basicSetOVR5(null, msgs);
			case V2xmlPackage.OVRCONTENT__ANY:
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
			case V2xmlPackage.OVRCONTENT__OVR1:
				return getOVR1();
			case V2xmlPackage.OVRCONTENT__OVR2:
				return getOVR2();
			case V2xmlPackage.OVRCONTENT__OVR3:
				return getOVR3();
			case V2xmlPackage.OVRCONTENT__OVR4:
				return getOVR4();
			case V2xmlPackage.OVRCONTENT__OVR5:
				return getOVR5();
			case V2xmlPackage.OVRCONTENT__ANY:
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
			case V2xmlPackage.OVRCONTENT__OVR1:
				setOVR1((OVR1CONTENT)newValue);
				return;
			case V2xmlPackage.OVRCONTENT__OVR2:
				setOVR2((OVR2CONTENT)newValue);
				return;
			case V2xmlPackage.OVRCONTENT__OVR3:
				setOVR3((OVR3CONTENT)newValue);
				return;
			case V2xmlPackage.OVRCONTENT__OVR4:
				setOVR4((OVR4CONTENT)newValue);
				return;
			case V2xmlPackage.OVRCONTENT__OVR5:
				setOVR5((OVR5CONTENT)newValue);
				return;
			case V2xmlPackage.OVRCONTENT__ANY:
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
			case V2xmlPackage.OVRCONTENT__OVR1:
				setOVR1((OVR1CONTENT)null);
				return;
			case V2xmlPackage.OVRCONTENT__OVR2:
				setOVR2((OVR2CONTENT)null);
				return;
			case V2xmlPackage.OVRCONTENT__OVR3:
				setOVR3((OVR3CONTENT)null);
				return;
			case V2xmlPackage.OVRCONTENT__OVR4:
				setOVR4((OVR4CONTENT)null);
				return;
			case V2xmlPackage.OVRCONTENT__OVR5:
				setOVR5((OVR5CONTENT)null);
				return;
			case V2xmlPackage.OVRCONTENT__ANY:
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
			case V2xmlPackage.OVRCONTENT__OVR1:
				return oVR1 != null;
			case V2xmlPackage.OVRCONTENT__OVR2:
				return oVR2 != null;
			case V2xmlPackage.OVRCONTENT__OVR3:
				return oVR3 != null;
			case V2xmlPackage.OVRCONTENT__OVR4:
				return oVR4 != null;
			case V2xmlPackage.OVRCONTENT__OVR5:
				return oVR5 != null;
			case V2xmlPackage.OVRCONTENT__ANY:
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

} //OVRCONTENTImpl
