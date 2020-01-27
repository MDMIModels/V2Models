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

import org.hl7.v2xml.RQ11CONTENT;
import org.hl7.v2xml.RQ12CONTENT;
import org.hl7.v2xml.RQ13CONTENT;
import org.hl7.v2xml.RQ14CONTENT;
import org.hl7.v2xml.RQ15CONTENT;
import org.hl7.v2xml.RQ16CONTENT;
import org.hl7.v2xml.RQ17CONTENT;
import org.hl7.v2xml.RQ1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RQ1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ11 <em>RQ11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ12 <em>RQ12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ13 <em>RQ13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ14 <em>RQ14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ15 <em>RQ15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ16 <em>RQ16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getRQ17 <em>RQ17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQ1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RQ1CONTENTImpl extends EObjectImpl implements RQ1CONTENT {
	/**
	 * The cached value of the '{@link #getRQ11() <em>RQ11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ11()
	 * @generated
	 * @ordered
	 */
	protected RQ11CONTENT rQ11;

	/**
	 * The cached value of the '{@link #getRQ12() <em>RQ12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ12()
	 * @generated
	 * @ordered
	 */
	protected RQ12CONTENT rQ12;

	/**
	 * The cached value of the '{@link #getRQ13() <em>RQ13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ13()
	 * @generated
	 * @ordered
	 */
	protected RQ13CONTENT rQ13;

	/**
	 * The cached value of the '{@link #getRQ14() <em>RQ14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ14()
	 * @generated
	 * @ordered
	 */
	protected RQ14CONTENT rQ14;

	/**
	 * The cached value of the '{@link #getRQ15() <em>RQ15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ15()
	 * @generated
	 * @ordered
	 */
	protected RQ15CONTENT rQ15;

	/**
	 * The cached value of the '{@link #getRQ16() <em>RQ16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ16()
	 * @generated
	 * @ordered
	 */
	protected RQ16CONTENT rQ16;

	/**
	 * The cached value of the '{@link #getRQ17() <em>RQ17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQ17()
	 * @generated
	 * @ordered
	 */
	protected RQ17CONTENT rQ17;

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
	protected RQ1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRQ1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ11CONTENT getRQ11() {
		return rQ11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ11(RQ11CONTENT newRQ11, NotificationChain msgs) {
		RQ11CONTENT oldRQ11 = rQ11;
		rQ11 = newRQ11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ11, oldRQ11, newRQ11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ11(RQ11CONTENT newRQ11) {
		if (newRQ11 != rQ11) {
			NotificationChain msgs = null;
			if (rQ11 != null)
				msgs = ((InternalEObject)rQ11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ11, null, msgs);
			if (newRQ11 != null)
				msgs = ((InternalEObject)newRQ11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ11, null, msgs);
			msgs = basicSetRQ11(newRQ11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ11, newRQ11, newRQ11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ12CONTENT getRQ12() {
		return rQ12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ12(RQ12CONTENT newRQ12, NotificationChain msgs) {
		RQ12CONTENT oldRQ12 = rQ12;
		rQ12 = newRQ12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ12, oldRQ12, newRQ12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ12(RQ12CONTENT newRQ12) {
		if (newRQ12 != rQ12) {
			NotificationChain msgs = null;
			if (rQ12 != null)
				msgs = ((InternalEObject)rQ12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ12, null, msgs);
			if (newRQ12 != null)
				msgs = ((InternalEObject)newRQ12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ12, null, msgs);
			msgs = basicSetRQ12(newRQ12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ12, newRQ12, newRQ12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ13CONTENT getRQ13() {
		return rQ13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ13(RQ13CONTENT newRQ13, NotificationChain msgs) {
		RQ13CONTENT oldRQ13 = rQ13;
		rQ13 = newRQ13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ13, oldRQ13, newRQ13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ13(RQ13CONTENT newRQ13) {
		if (newRQ13 != rQ13) {
			NotificationChain msgs = null;
			if (rQ13 != null)
				msgs = ((InternalEObject)rQ13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ13, null, msgs);
			if (newRQ13 != null)
				msgs = ((InternalEObject)newRQ13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ13, null, msgs);
			msgs = basicSetRQ13(newRQ13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ13, newRQ13, newRQ13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ14CONTENT getRQ14() {
		return rQ14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ14(RQ14CONTENT newRQ14, NotificationChain msgs) {
		RQ14CONTENT oldRQ14 = rQ14;
		rQ14 = newRQ14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ14, oldRQ14, newRQ14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ14(RQ14CONTENT newRQ14) {
		if (newRQ14 != rQ14) {
			NotificationChain msgs = null;
			if (rQ14 != null)
				msgs = ((InternalEObject)rQ14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ14, null, msgs);
			if (newRQ14 != null)
				msgs = ((InternalEObject)newRQ14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ14, null, msgs);
			msgs = basicSetRQ14(newRQ14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ14, newRQ14, newRQ14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ15CONTENT getRQ15() {
		return rQ15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ15(RQ15CONTENT newRQ15, NotificationChain msgs) {
		RQ15CONTENT oldRQ15 = rQ15;
		rQ15 = newRQ15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ15, oldRQ15, newRQ15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ15(RQ15CONTENT newRQ15) {
		if (newRQ15 != rQ15) {
			NotificationChain msgs = null;
			if (rQ15 != null)
				msgs = ((InternalEObject)rQ15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ15, null, msgs);
			if (newRQ15 != null)
				msgs = ((InternalEObject)newRQ15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ15, null, msgs);
			msgs = basicSetRQ15(newRQ15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ15, newRQ15, newRQ15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ16CONTENT getRQ16() {
		return rQ16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ16(RQ16CONTENT newRQ16, NotificationChain msgs) {
		RQ16CONTENT oldRQ16 = rQ16;
		rQ16 = newRQ16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ16, oldRQ16, newRQ16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ16(RQ16CONTENT newRQ16) {
		if (newRQ16 != rQ16) {
			NotificationChain msgs = null;
			if (rQ16 != null)
				msgs = ((InternalEObject)rQ16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ16, null, msgs);
			if (newRQ16 != null)
				msgs = ((InternalEObject)newRQ16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ16, null, msgs);
			msgs = basicSetRQ16(newRQ16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ16, newRQ16, newRQ16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQ17CONTENT getRQ17() {
		return rQ17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQ17(RQ17CONTENT newRQ17, NotificationChain msgs) {
		RQ17CONTENT oldRQ17 = rQ17;
		rQ17 = newRQ17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ17, oldRQ17, newRQ17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQ17(RQ17CONTENT newRQ17) {
		if (newRQ17 != rQ17) {
			NotificationChain msgs = null;
			if (rQ17 != null)
				msgs = ((InternalEObject)rQ17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ17, null, msgs);
			if (newRQ17 != null)
				msgs = ((InternalEObject)newRQ17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQ1CONTENT__RQ17, null, msgs);
			msgs = basicSetRQ17(newRQ17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQ1CONTENT__RQ17, newRQ17, newRQ17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RQ1CONTENT__ANY);
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
			case V2xmlPackage.RQ1CONTENT__RQ11:
				return basicSetRQ11(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ12:
				return basicSetRQ12(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ13:
				return basicSetRQ13(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ14:
				return basicSetRQ14(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ15:
				return basicSetRQ15(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ16:
				return basicSetRQ16(null, msgs);
			case V2xmlPackage.RQ1CONTENT__RQ17:
				return basicSetRQ17(null, msgs);
			case V2xmlPackage.RQ1CONTENT__ANY:
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
			case V2xmlPackage.RQ1CONTENT__RQ11:
				return getRQ11();
			case V2xmlPackage.RQ1CONTENT__RQ12:
				return getRQ12();
			case V2xmlPackage.RQ1CONTENT__RQ13:
				return getRQ13();
			case V2xmlPackage.RQ1CONTENT__RQ14:
				return getRQ14();
			case V2xmlPackage.RQ1CONTENT__RQ15:
				return getRQ15();
			case V2xmlPackage.RQ1CONTENT__RQ16:
				return getRQ16();
			case V2xmlPackage.RQ1CONTENT__RQ17:
				return getRQ17();
			case V2xmlPackage.RQ1CONTENT__ANY:
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
			case V2xmlPackage.RQ1CONTENT__RQ11:
				setRQ11((RQ11CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ12:
				setRQ12((RQ12CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ13:
				setRQ13((RQ13CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ14:
				setRQ14((RQ14CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ15:
				setRQ15((RQ15CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ16:
				setRQ16((RQ16CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ17:
				setRQ17((RQ17CONTENT)newValue);
				return;
			case V2xmlPackage.RQ1CONTENT__ANY:
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
			case V2xmlPackage.RQ1CONTENT__RQ11:
				setRQ11((RQ11CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ12:
				setRQ12((RQ12CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ13:
				setRQ13((RQ13CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ14:
				setRQ14((RQ14CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ15:
				setRQ15((RQ15CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ16:
				setRQ16((RQ16CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__RQ17:
				setRQ17((RQ17CONTENT)null);
				return;
			case V2xmlPackage.RQ1CONTENT__ANY:
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
			case V2xmlPackage.RQ1CONTENT__RQ11:
				return rQ11 != null;
			case V2xmlPackage.RQ1CONTENT__RQ12:
				return rQ12 != null;
			case V2xmlPackage.RQ1CONTENT__RQ13:
				return rQ13 != null;
			case V2xmlPackage.RQ1CONTENT__RQ14:
				return rQ14 != null;
			case V2xmlPackage.RQ1CONTENT__RQ15:
				return rQ15 != null;
			case V2xmlPackage.RQ1CONTENT__RQ16:
				return rQ16 != null;
			case V2xmlPackage.RQ1CONTENT__RQ17:
				return rQ17 != null;
			case V2xmlPackage.RQ1CONTENT__ANY:
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

} //RQ1CONTENTImpl
