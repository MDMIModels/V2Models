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

import org.hl7.v2xml.GP11CONTENT;
import org.hl7.v2xml.GP12CONTENT;
import org.hl7.v2xml.GP13CONTENT;
import org.hl7.v2xml.GP14CONTENT;
import org.hl7.v2xml.GP15CONTENT;
import org.hl7.v2xml.GP1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GP1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getGP11 <em>GP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getGP12 <em>GP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getGP13 <em>GP13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getGP14 <em>GP14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getGP15 <em>GP15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GP1CONTENTImpl extends EObjectImpl implements GP1CONTENT {
	/**
	 * The cached value of the '{@link #getGP11() <em>GP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP11()
	 * @generated
	 * @ordered
	 */
	protected GP11CONTENT gP11;

	/**
	 * The cached value of the '{@link #getGP12() <em>GP12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP12()
	 * @generated
	 * @ordered
	 */
	protected EList<GP12CONTENT> gP12;

	/**
	 * The cached value of the '{@link #getGP13() <em>GP13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP13()
	 * @generated
	 * @ordered
	 */
	protected GP13CONTENT gP13;

	/**
	 * The cached value of the '{@link #getGP14() <em>GP14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP14()
	 * @generated
	 * @ordered
	 */
	protected EList<GP14CONTENT> gP14;

	/**
	 * The cached value of the '{@link #getGP15() <em>GP15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP15()
	 * @generated
	 * @ordered
	 */
	protected GP15CONTENT gP15;

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
	protected GP1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getGP1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP11CONTENT getGP11() {
		return gP11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP11(GP11CONTENT newGP11, NotificationChain msgs) {
		GP11CONTENT oldGP11 = gP11;
		gP11 = newGP11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP11, oldGP11, newGP11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP11(GP11CONTENT newGP11) {
		if (newGP11 != gP11) {
			NotificationChain msgs = null;
			if (gP11 != null)
				msgs = ((InternalEObject)gP11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP11, null, msgs);
			if (newGP11 != null)
				msgs = ((InternalEObject)newGP11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP11, null, msgs);
			msgs = basicSetGP11(newGP11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP11, newGP11, newGP11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP12CONTENT> getGP12() {
		if (gP12 == null) {
			gP12 = new EObjectContainmentEList<GP12CONTENT>(GP12CONTENT.class, this, V2xmlPackage.GP1CONTENT__GP12);
		}
		return gP12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP13CONTENT getGP13() {
		return gP13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP13(GP13CONTENT newGP13, NotificationChain msgs) {
		GP13CONTENT oldGP13 = gP13;
		gP13 = newGP13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP13, oldGP13, newGP13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP13(GP13CONTENT newGP13) {
		if (newGP13 != gP13) {
			NotificationChain msgs = null;
			if (gP13 != null)
				msgs = ((InternalEObject)gP13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP13, null, msgs);
			if (newGP13 != null)
				msgs = ((InternalEObject)newGP13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP13, null, msgs);
			msgs = basicSetGP13(newGP13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP13, newGP13, newGP13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP14CONTENT> getGP14() {
		if (gP14 == null) {
			gP14 = new EObjectContainmentEList<GP14CONTENT>(GP14CONTENT.class, this, V2xmlPackage.GP1CONTENT__GP14);
		}
		return gP14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP15CONTENT getGP15() {
		return gP15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP15(GP15CONTENT newGP15, NotificationChain msgs) {
		GP15CONTENT oldGP15 = gP15;
		gP15 = newGP15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP15, oldGP15, newGP15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP15(GP15CONTENT newGP15) {
		if (newGP15 != gP15) {
			NotificationChain msgs = null;
			if (gP15 != null)
				msgs = ((InternalEObject)gP15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP15, null, msgs);
			if (newGP15 != null)
				msgs = ((InternalEObject)newGP15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP1CONTENT__GP15, null, msgs);
			msgs = basicSetGP15(newGP15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP1CONTENT__GP15, newGP15, newGP15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.GP1CONTENT__ANY);
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
			case V2xmlPackage.GP1CONTENT__GP11:
				return basicSetGP11(null, msgs);
			case V2xmlPackage.GP1CONTENT__GP12:
				return ((InternalEList<?>)getGP12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GP1CONTENT__GP13:
				return basicSetGP13(null, msgs);
			case V2xmlPackage.GP1CONTENT__GP14:
				return ((InternalEList<?>)getGP14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GP1CONTENT__GP15:
				return basicSetGP15(null, msgs);
			case V2xmlPackage.GP1CONTENT__ANY:
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
			case V2xmlPackage.GP1CONTENT__GP11:
				return getGP11();
			case V2xmlPackage.GP1CONTENT__GP12:
				return getGP12();
			case V2xmlPackage.GP1CONTENT__GP13:
				return getGP13();
			case V2xmlPackage.GP1CONTENT__GP14:
				return getGP14();
			case V2xmlPackage.GP1CONTENT__GP15:
				return getGP15();
			case V2xmlPackage.GP1CONTENT__ANY:
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
			case V2xmlPackage.GP1CONTENT__GP11:
				setGP11((GP11CONTENT)newValue);
				return;
			case V2xmlPackage.GP1CONTENT__GP12:
				getGP12().clear();
				getGP12().addAll((Collection<? extends GP12CONTENT>)newValue);
				return;
			case V2xmlPackage.GP1CONTENT__GP13:
				setGP13((GP13CONTENT)newValue);
				return;
			case V2xmlPackage.GP1CONTENT__GP14:
				getGP14().clear();
				getGP14().addAll((Collection<? extends GP14CONTENT>)newValue);
				return;
			case V2xmlPackage.GP1CONTENT__GP15:
				setGP15((GP15CONTENT)newValue);
				return;
			case V2xmlPackage.GP1CONTENT__ANY:
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
			case V2xmlPackage.GP1CONTENT__GP11:
				setGP11((GP11CONTENT)null);
				return;
			case V2xmlPackage.GP1CONTENT__GP12:
				getGP12().clear();
				return;
			case V2xmlPackage.GP1CONTENT__GP13:
				setGP13((GP13CONTENT)null);
				return;
			case V2xmlPackage.GP1CONTENT__GP14:
				getGP14().clear();
				return;
			case V2xmlPackage.GP1CONTENT__GP15:
				setGP15((GP15CONTENT)null);
				return;
			case V2xmlPackage.GP1CONTENT__ANY:
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
			case V2xmlPackage.GP1CONTENT__GP11:
				return gP11 != null;
			case V2xmlPackage.GP1CONTENT__GP12:
				return gP12 != null && !gP12.isEmpty();
			case V2xmlPackage.GP1CONTENT__GP13:
				return gP13 != null;
			case V2xmlPackage.GP1CONTENT__GP14:
				return gP14 != null && !gP14.isEmpty();
			case V2xmlPackage.GP1CONTENT__GP15:
				return gP15 != null;
			case V2xmlPackage.GP1CONTENT__ANY:
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

} //GP1CONTENTImpl
