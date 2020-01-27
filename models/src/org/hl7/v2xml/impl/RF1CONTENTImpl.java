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

import org.hl7.v2xml.RF110CONTENT;
import org.hl7.v2xml.RF111CONTENT;
import org.hl7.v2xml.RF11CONTENT;
import org.hl7.v2xml.RF12CONTENT;
import org.hl7.v2xml.RF13CONTENT;
import org.hl7.v2xml.RF14CONTENT;
import org.hl7.v2xml.RF15CONTENT;
import org.hl7.v2xml.RF16CONTENT;
import org.hl7.v2xml.RF17CONTENT;
import org.hl7.v2xml.RF18CONTENT;
import org.hl7.v2xml.RF19CONTENT;
import org.hl7.v2xml.RF1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RF1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF11 <em>RF11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF12 <em>RF12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF13 <em>RF13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF14 <em>RF14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF15 <em>RF15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF16 <em>RF16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF17 <em>RF17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF18 <em>RF18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF19 <em>RF19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF110 <em>RF110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getRF111 <em>RF111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RF1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RF1CONTENTImpl extends EObjectImpl implements RF1CONTENT {
	/**
	 * The cached value of the '{@link #getRF11() <em>RF11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF11()
	 * @generated
	 * @ordered
	 */
	protected RF11CONTENT rF11;

	/**
	 * The cached value of the '{@link #getRF12() <em>RF12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF12()
	 * @generated
	 * @ordered
	 */
	protected RF12CONTENT rF12;

	/**
	 * The cached value of the '{@link #getRF13() <em>RF13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF13()
	 * @generated
	 * @ordered
	 */
	protected RF13CONTENT rF13;

	/**
	 * The cached value of the '{@link #getRF14() <em>RF14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF14()
	 * @generated
	 * @ordered
	 */
	protected EList<RF14CONTENT> rF14;

	/**
	 * The cached value of the '{@link #getRF15() <em>RF15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF15()
	 * @generated
	 * @ordered
	 */
	protected RF15CONTENT rF15;

	/**
	 * The cached value of the '{@link #getRF16() <em>RF16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF16()
	 * @generated
	 * @ordered
	 */
	protected RF16CONTENT rF16;

	/**
	 * The cached value of the '{@link #getRF17() <em>RF17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF17()
	 * @generated
	 * @ordered
	 */
	protected RF17CONTENT rF17;

	/**
	 * The cached value of the '{@link #getRF18() <em>RF18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF18()
	 * @generated
	 * @ordered
	 */
	protected RF18CONTENT rF18;

	/**
	 * The cached value of the '{@link #getRF19() <em>RF19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF19()
	 * @generated
	 * @ordered
	 */
	protected RF19CONTENT rF19;

	/**
	 * The cached value of the '{@link #getRF110() <em>RF110</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF110()
	 * @generated
	 * @ordered
	 */
	protected EList<RF110CONTENT> rF110;

	/**
	 * The cached value of the '{@link #getRF111() <em>RF111</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRF111()
	 * @generated
	 * @ordered
	 */
	protected EList<RF111CONTENT> rF111;

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
	protected RF1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRF1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF11CONTENT getRF11() {
		return rF11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF11(RF11CONTENT newRF11, NotificationChain msgs) {
		RF11CONTENT oldRF11 = rF11;
		rF11 = newRF11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF11, oldRF11, newRF11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF11(RF11CONTENT newRF11) {
		if (newRF11 != rF11) {
			NotificationChain msgs = null;
			if (rF11 != null)
				msgs = ((InternalEObject)rF11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF11, null, msgs);
			if (newRF11 != null)
				msgs = ((InternalEObject)newRF11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF11, null, msgs);
			msgs = basicSetRF11(newRF11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF11, newRF11, newRF11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF12CONTENT getRF12() {
		return rF12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF12(RF12CONTENT newRF12, NotificationChain msgs) {
		RF12CONTENT oldRF12 = rF12;
		rF12 = newRF12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF12, oldRF12, newRF12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF12(RF12CONTENT newRF12) {
		if (newRF12 != rF12) {
			NotificationChain msgs = null;
			if (rF12 != null)
				msgs = ((InternalEObject)rF12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF12, null, msgs);
			if (newRF12 != null)
				msgs = ((InternalEObject)newRF12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF12, null, msgs);
			msgs = basicSetRF12(newRF12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF12, newRF12, newRF12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF13CONTENT getRF13() {
		return rF13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF13(RF13CONTENT newRF13, NotificationChain msgs) {
		RF13CONTENT oldRF13 = rF13;
		rF13 = newRF13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF13, oldRF13, newRF13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF13(RF13CONTENT newRF13) {
		if (newRF13 != rF13) {
			NotificationChain msgs = null;
			if (rF13 != null)
				msgs = ((InternalEObject)rF13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF13, null, msgs);
			if (newRF13 != null)
				msgs = ((InternalEObject)newRF13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF13, null, msgs);
			msgs = basicSetRF13(newRF13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF13, newRF13, newRF13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RF14CONTENT> getRF14() {
		if (rF14 == null) {
			rF14 = new EObjectContainmentEList<RF14CONTENT>(RF14CONTENT.class, this, V2xmlPackage.RF1CONTENT__RF14);
		}
		return rF14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF15CONTENT getRF15() {
		return rF15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF15(RF15CONTENT newRF15, NotificationChain msgs) {
		RF15CONTENT oldRF15 = rF15;
		rF15 = newRF15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF15, oldRF15, newRF15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF15(RF15CONTENT newRF15) {
		if (newRF15 != rF15) {
			NotificationChain msgs = null;
			if (rF15 != null)
				msgs = ((InternalEObject)rF15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF15, null, msgs);
			if (newRF15 != null)
				msgs = ((InternalEObject)newRF15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF15, null, msgs);
			msgs = basicSetRF15(newRF15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF15, newRF15, newRF15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF16CONTENT getRF16() {
		return rF16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF16(RF16CONTENT newRF16, NotificationChain msgs) {
		RF16CONTENT oldRF16 = rF16;
		rF16 = newRF16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF16, oldRF16, newRF16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF16(RF16CONTENT newRF16) {
		if (newRF16 != rF16) {
			NotificationChain msgs = null;
			if (rF16 != null)
				msgs = ((InternalEObject)rF16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF16, null, msgs);
			if (newRF16 != null)
				msgs = ((InternalEObject)newRF16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF16, null, msgs);
			msgs = basicSetRF16(newRF16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF16, newRF16, newRF16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF17CONTENT getRF17() {
		return rF17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF17(RF17CONTENT newRF17, NotificationChain msgs) {
		RF17CONTENT oldRF17 = rF17;
		rF17 = newRF17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF17, oldRF17, newRF17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF17(RF17CONTENT newRF17) {
		if (newRF17 != rF17) {
			NotificationChain msgs = null;
			if (rF17 != null)
				msgs = ((InternalEObject)rF17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF17, null, msgs);
			if (newRF17 != null)
				msgs = ((InternalEObject)newRF17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF17, null, msgs);
			msgs = basicSetRF17(newRF17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF17, newRF17, newRF17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF18CONTENT getRF18() {
		return rF18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF18(RF18CONTENT newRF18, NotificationChain msgs) {
		RF18CONTENT oldRF18 = rF18;
		rF18 = newRF18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF18, oldRF18, newRF18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF18(RF18CONTENT newRF18) {
		if (newRF18 != rF18) {
			NotificationChain msgs = null;
			if (rF18 != null)
				msgs = ((InternalEObject)rF18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF18, null, msgs);
			if (newRF18 != null)
				msgs = ((InternalEObject)newRF18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF18, null, msgs);
			msgs = basicSetRF18(newRF18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF18, newRF18, newRF18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RF19CONTENT getRF19() {
		return rF19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRF19(RF19CONTENT newRF19, NotificationChain msgs) {
		RF19CONTENT oldRF19 = rF19;
		rF19 = newRF19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF19, oldRF19, newRF19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRF19(RF19CONTENT newRF19) {
		if (newRF19 != rF19) {
			NotificationChain msgs = null;
			if (rF19 != null)
				msgs = ((InternalEObject)rF19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF19, null, msgs);
			if (newRF19 != null)
				msgs = ((InternalEObject)newRF19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RF1CONTENT__RF19, null, msgs);
			msgs = basicSetRF19(newRF19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RF1CONTENT__RF19, newRF19, newRF19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RF110CONTENT> getRF110() {
		if (rF110 == null) {
			rF110 = new EObjectContainmentEList<RF110CONTENT>(RF110CONTENT.class, this, V2xmlPackage.RF1CONTENT__RF110);
		}
		return rF110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RF111CONTENT> getRF111() {
		if (rF111 == null) {
			rF111 = new EObjectContainmentEList<RF111CONTENT>(RF111CONTENT.class, this, V2xmlPackage.RF1CONTENT__RF111);
		}
		return rF111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RF1CONTENT__ANY);
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
			case V2xmlPackage.RF1CONTENT__RF11:
				return basicSetRF11(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF12:
				return basicSetRF12(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF13:
				return basicSetRF13(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF14:
				return ((InternalEList<?>)getRF14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RF1CONTENT__RF15:
				return basicSetRF15(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF16:
				return basicSetRF16(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF17:
				return basicSetRF17(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF18:
				return basicSetRF18(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF19:
				return basicSetRF19(null, msgs);
			case V2xmlPackage.RF1CONTENT__RF110:
				return ((InternalEList<?>)getRF110()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RF1CONTENT__RF111:
				return ((InternalEList<?>)getRF111()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RF1CONTENT__ANY:
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
			case V2xmlPackage.RF1CONTENT__RF11:
				return getRF11();
			case V2xmlPackage.RF1CONTENT__RF12:
				return getRF12();
			case V2xmlPackage.RF1CONTENT__RF13:
				return getRF13();
			case V2xmlPackage.RF1CONTENT__RF14:
				return getRF14();
			case V2xmlPackage.RF1CONTENT__RF15:
				return getRF15();
			case V2xmlPackage.RF1CONTENT__RF16:
				return getRF16();
			case V2xmlPackage.RF1CONTENT__RF17:
				return getRF17();
			case V2xmlPackage.RF1CONTENT__RF18:
				return getRF18();
			case V2xmlPackage.RF1CONTENT__RF19:
				return getRF19();
			case V2xmlPackage.RF1CONTENT__RF110:
				return getRF110();
			case V2xmlPackage.RF1CONTENT__RF111:
				return getRF111();
			case V2xmlPackage.RF1CONTENT__ANY:
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
			case V2xmlPackage.RF1CONTENT__RF11:
				setRF11((RF11CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF12:
				setRF12((RF12CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF13:
				setRF13((RF13CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF14:
				getRF14().clear();
				getRF14().addAll((Collection<? extends RF14CONTENT>)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF15:
				setRF15((RF15CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF16:
				setRF16((RF16CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF17:
				setRF17((RF17CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF18:
				setRF18((RF18CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF19:
				setRF19((RF19CONTENT)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF110:
				getRF110().clear();
				getRF110().addAll((Collection<? extends RF110CONTENT>)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__RF111:
				getRF111().clear();
				getRF111().addAll((Collection<? extends RF111CONTENT>)newValue);
				return;
			case V2xmlPackage.RF1CONTENT__ANY:
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
			case V2xmlPackage.RF1CONTENT__RF11:
				setRF11((RF11CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF12:
				setRF12((RF12CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF13:
				setRF13((RF13CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF14:
				getRF14().clear();
				return;
			case V2xmlPackage.RF1CONTENT__RF15:
				setRF15((RF15CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF16:
				setRF16((RF16CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF17:
				setRF17((RF17CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF18:
				setRF18((RF18CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF19:
				setRF19((RF19CONTENT)null);
				return;
			case V2xmlPackage.RF1CONTENT__RF110:
				getRF110().clear();
				return;
			case V2xmlPackage.RF1CONTENT__RF111:
				getRF111().clear();
				return;
			case V2xmlPackage.RF1CONTENT__ANY:
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
			case V2xmlPackage.RF1CONTENT__RF11:
				return rF11 != null;
			case V2xmlPackage.RF1CONTENT__RF12:
				return rF12 != null;
			case V2xmlPackage.RF1CONTENT__RF13:
				return rF13 != null;
			case V2xmlPackage.RF1CONTENT__RF14:
				return rF14 != null && !rF14.isEmpty();
			case V2xmlPackage.RF1CONTENT__RF15:
				return rF15 != null;
			case V2xmlPackage.RF1CONTENT__RF16:
				return rF16 != null;
			case V2xmlPackage.RF1CONTENT__RF17:
				return rF17 != null;
			case V2xmlPackage.RF1CONTENT__RF18:
				return rF18 != null;
			case V2xmlPackage.RF1CONTENT__RF19:
				return rF19 != null;
			case V2xmlPackage.RF1CONTENT__RF110:
				return rF110 != null && !rF110.isEmpty();
			case V2xmlPackage.RF1CONTENT__RF111:
				return rF111 != null && !rF111.isEmpty();
			case V2xmlPackage.RF1CONTENT__ANY:
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

} //RF1CONTENTImpl
