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

import org.hl7.v2xml.AL11CONTENT;
import org.hl7.v2xml.AL12CONTENT;
import org.hl7.v2xml.AL13CONTENT;
import org.hl7.v2xml.AL14CONTENT;
import org.hl7.v2xml.AL15CONTENT;
import org.hl7.v2xml.AL16CONTENT;
import org.hl7.v2xml.AL1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AL1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL11 <em>AL11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL12 <em>AL12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL13 <em>AL13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL14 <em>AL14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL15 <em>AL15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAL16 <em>AL16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AL1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AL1CONTENTImpl extends EObjectImpl implements AL1CONTENT {
	/**
	 * The cached value of the '{@link #getAL11() <em>AL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL11()
	 * @generated
	 * @ordered
	 */
	protected AL11CONTENT aL11;

	/**
	 * The cached value of the '{@link #getAL12() <em>AL12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL12()
	 * @generated
	 * @ordered
	 */
	protected AL12CONTENT aL12;

	/**
	 * The cached value of the '{@link #getAL13() <em>AL13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL13()
	 * @generated
	 * @ordered
	 */
	protected AL13CONTENT aL13;

	/**
	 * The cached value of the '{@link #getAL14() <em>AL14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL14()
	 * @generated
	 * @ordered
	 */
	protected AL14CONTENT aL14;

	/**
	 * The cached value of the '{@link #getAL15() <em>AL15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL15()
	 * @generated
	 * @ordered
	 */
	protected EList<AL15CONTENT> aL15;

	/**
	 * The cached value of the '{@link #getAL16() <em>AL16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL16()
	 * @generated
	 * @ordered
	 */
	protected AL16CONTENT aL16;

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
	protected AL1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAL1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AL11CONTENT getAL11() {
		return aL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAL11(AL11CONTENT newAL11, NotificationChain msgs) {
		AL11CONTENT oldAL11 = aL11;
		aL11 = newAL11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL11, oldAL11, newAL11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAL11(AL11CONTENT newAL11) {
		if (newAL11 != aL11) {
			NotificationChain msgs = null;
			if (aL11 != null)
				msgs = ((InternalEObject)aL11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL11, null, msgs);
			if (newAL11 != null)
				msgs = ((InternalEObject)newAL11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL11, null, msgs);
			msgs = basicSetAL11(newAL11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL11, newAL11, newAL11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AL12CONTENT getAL12() {
		return aL12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAL12(AL12CONTENT newAL12, NotificationChain msgs) {
		AL12CONTENT oldAL12 = aL12;
		aL12 = newAL12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL12, oldAL12, newAL12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAL12(AL12CONTENT newAL12) {
		if (newAL12 != aL12) {
			NotificationChain msgs = null;
			if (aL12 != null)
				msgs = ((InternalEObject)aL12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL12, null, msgs);
			if (newAL12 != null)
				msgs = ((InternalEObject)newAL12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL12, null, msgs);
			msgs = basicSetAL12(newAL12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL12, newAL12, newAL12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AL13CONTENT getAL13() {
		return aL13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAL13(AL13CONTENT newAL13, NotificationChain msgs) {
		AL13CONTENT oldAL13 = aL13;
		aL13 = newAL13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL13, oldAL13, newAL13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAL13(AL13CONTENT newAL13) {
		if (newAL13 != aL13) {
			NotificationChain msgs = null;
			if (aL13 != null)
				msgs = ((InternalEObject)aL13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL13, null, msgs);
			if (newAL13 != null)
				msgs = ((InternalEObject)newAL13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL13, null, msgs);
			msgs = basicSetAL13(newAL13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL13, newAL13, newAL13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AL14CONTENT getAL14() {
		return aL14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAL14(AL14CONTENT newAL14, NotificationChain msgs) {
		AL14CONTENT oldAL14 = aL14;
		aL14 = newAL14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL14, oldAL14, newAL14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAL14(AL14CONTENT newAL14) {
		if (newAL14 != aL14) {
			NotificationChain msgs = null;
			if (aL14 != null)
				msgs = ((InternalEObject)aL14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL14, null, msgs);
			if (newAL14 != null)
				msgs = ((InternalEObject)newAL14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL14, null, msgs);
			msgs = basicSetAL14(newAL14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL14, newAL14, newAL14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AL15CONTENT> getAL15() {
		if (aL15 == null) {
			aL15 = new EObjectContainmentEList<AL15CONTENT>(AL15CONTENT.class, this, V2xmlPackage.AL1CONTENT__AL15);
		}
		return aL15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AL16CONTENT getAL16() {
		return aL16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAL16(AL16CONTENT newAL16, NotificationChain msgs) {
		AL16CONTENT oldAL16 = aL16;
		aL16 = newAL16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL16, oldAL16, newAL16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAL16(AL16CONTENT newAL16) {
		if (newAL16 != aL16) {
			NotificationChain msgs = null;
			if (aL16 != null)
				msgs = ((InternalEObject)aL16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL16, null, msgs);
			if (newAL16 != null)
				msgs = ((InternalEObject)newAL16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AL1CONTENT__AL16, null, msgs);
			msgs = basicSetAL16(newAL16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AL1CONTENT__AL16, newAL16, newAL16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AL1CONTENT__ANY);
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
			case V2xmlPackage.AL1CONTENT__AL11:
				return basicSetAL11(null, msgs);
			case V2xmlPackage.AL1CONTENT__AL12:
				return basicSetAL12(null, msgs);
			case V2xmlPackage.AL1CONTENT__AL13:
				return basicSetAL13(null, msgs);
			case V2xmlPackage.AL1CONTENT__AL14:
				return basicSetAL14(null, msgs);
			case V2xmlPackage.AL1CONTENT__AL15:
				return ((InternalEList<?>)getAL15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AL1CONTENT__AL16:
				return basicSetAL16(null, msgs);
			case V2xmlPackage.AL1CONTENT__ANY:
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
			case V2xmlPackage.AL1CONTENT__AL11:
				return getAL11();
			case V2xmlPackage.AL1CONTENT__AL12:
				return getAL12();
			case V2xmlPackage.AL1CONTENT__AL13:
				return getAL13();
			case V2xmlPackage.AL1CONTENT__AL14:
				return getAL14();
			case V2xmlPackage.AL1CONTENT__AL15:
				return getAL15();
			case V2xmlPackage.AL1CONTENT__AL16:
				return getAL16();
			case V2xmlPackage.AL1CONTENT__ANY:
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
			case V2xmlPackage.AL1CONTENT__AL11:
				setAL11((AL11CONTENT)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__AL12:
				setAL12((AL12CONTENT)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__AL13:
				setAL13((AL13CONTENT)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__AL14:
				setAL14((AL14CONTENT)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__AL15:
				getAL15().clear();
				getAL15().addAll((Collection<? extends AL15CONTENT>)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__AL16:
				setAL16((AL16CONTENT)newValue);
				return;
			case V2xmlPackage.AL1CONTENT__ANY:
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
			case V2xmlPackage.AL1CONTENT__AL11:
				setAL11((AL11CONTENT)null);
				return;
			case V2xmlPackage.AL1CONTENT__AL12:
				setAL12((AL12CONTENT)null);
				return;
			case V2xmlPackage.AL1CONTENT__AL13:
				setAL13((AL13CONTENT)null);
				return;
			case V2xmlPackage.AL1CONTENT__AL14:
				setAL14((AL14CONTENT)null);
				return;
			case V2xmlPackage.AL1CONTENT__AL15:
				getAL15().clear();
				return;
			case V2xmlPackage.AL1CONTENT__AL16:
				setAL16((AL16CONTENT)null);
				return;
			case V2xmlPackage.AL1CONTENT__ANY:
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
			case V2xmlPackage.AL1CONTENT__AL11:
				return aL11 != null;
			case V2xmlPackage.AL1CONTENT__AL12:
				return aL12 != null;
			case V2xmlPackage.AL1CONTENT__AL13:
				return aL13 != null;
			case V2xmlPackage.AL1CONTENT__AL14:
				return aL14 != null;
			case V2xmlPackage.AL1CONTENT__AL15:
				return aL15 != null && !aL15.isEmpty();
			case V2xmlPackage.AL1CONTENT__AL16:
				return aL16 != null;
			case V2xmlPackage.AL1CONTENT__ANY:
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

} //AL1CONTENTImpl
