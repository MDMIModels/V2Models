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

import org.hl7.v2xml.RXC1CONTENT;
import org.hl7.v2xml.RXC2CONTENT;
import org.hl7.v2xml.RXC3CONTENT;
import org.hl7.v2xml.RXC4CONTENT;
import org.hl7.v2xml.RXC5CONTENT;
import org.hl7.v2xml.RXC6CONTENT;
import org.hl7.v2xml.RXC7CONTENT;
import org.hl7.v2xml.RXC8CONTENT;
import org.hl7.v2xml.RXC9CONTENT;
import org.hl7.v2xml.RXCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC1 <em>RXC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC2 <em>RXC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC3 <em>RXC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC4 <em>RXC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC5 <em>RXC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC6 <em>RXC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC7 <em>RXC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC8 <em>RXC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getRXC9 <em>RXC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXCCONTENTImpl extends EObjectImpl implements RXCCONTENT {
	/**
	 * The cached value of the '{@link #getRXC1() <em>RXC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC1()
	 * @generated
	 * @ordered
	 */
	protected RXC1CONTENT rXC1;

	/**
	 * The cached value of the '{@link #getRXC2() <em>RXC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC2()
	 * @generated
	 * @ordered
	 */
	protected RXC2CONTENT rXC2;

	/**
	 * The cached value of the '{@link #getRXC3() <em>RXC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC3()
	 * @generated
	 * @ordered
	 */
	protected RXC3CONTENT rXC3;

	/**
	 * The cached value of the '{@link #getRXC4() <em>RXC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC4()
	 * @generated
	 * @ordered
	 */
	protected RXC4CONTENT rXC4;

	/**
	 * The cached value of the '{@link #getRXC5() <em>RXC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC5()
	 * @generated
	 * @ordered
	 */
	protected RXC5CONTENT rXC5;

	/**
	 * The cached value of the '{@link #getRXC6() <em>RXC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC6()
	 * @generated
	 * @ordered
	 */
	protected RXC6CONTENT rXC6;

	/**
	 * The cached value of the '{@link #getRXC7() <em>RXC7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC7()
	 * @generated
	 * @ordered
	 */
	protected EList<RXC7CONTENT> rXC7;

	/**
	 * The cached value of the '{@link #getRXC8() <em>RXC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC8()
	 * @generated
	 * @ordered
	 */
	protected RXC8CONTENT rXC8;

	/**
	 * The cached value of the '{@link #getRXC9() <em>RXC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXC9()
	 * @generated
	 * @ordered
	 */
	protected RXC9CONTENT rXC9;

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
	protected RXCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC1CONTENT getRXC1() {
		return rXC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC1(RXC1CONTENT newRXC1, NotificationChain msgs) {
		RXC1CONTENT oldRXC1 = rXC1;
		rXC1 = newRXC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC1, oldRXC1, newRXC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC1(RXC1CONTENT newRXC1) {
		if (newRXC1 != rXC1) {
			NotificationChain msgs = null;
			if (rXC1 != null)
				msgs = ((InternalEObject)rXC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC1, null, msgs);
			if (newRXC1 != null)
				msgs = ((InternalEObject)newRXC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC1, null, msgs);
			msgs = basicSetRXC1(newRXC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC1, newRXC1, newRXC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC2CONTENT getRXC2() {
		return rXC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC2(RXC2CONTENT newRXC2, NotificationChain msgs) {
		RXC2CONTENT oldRXC2 = rXC2;
		rXC2 = newRXC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC2, oldRXC2, newRXC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC2(RXC2CONTENT newRXC2) {
		if (newRXC2 != rXC2) {
			NotificationChain msgs = null;
			if (rXC2 != null)
				msgs = ((InternalEObject)rXC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC2, null, msgs);
			if (newRXC2 != null)
				msgs = ((InternalEObject)newRXC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC2, null, msgs);
			msgs = basicSetRXC2(newRXC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC2, newRXC2, newRXC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC3CONTENT getRXC3() {
		return rXC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC3(RXC3CONTENT newRXC3, NotificationChain msgs) {
		RXC3CONTENT oldRXC3 = rXC3;
		rXC3 = newRXC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC3, oldRXC3, newRXC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC3(RXC3CONTENT newRXC3) {
		if (newRXC3 != rXC3) {
			NotificationChain msgs = null;
			if (rXC3 != null)
				msgs = ((InternalEObject)rXC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC3, null, msgs);
			if (newRXC3 != null)
				msgs = ((InternalEObject)newRXC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC3, null, msgs);
			msgs = basicSetRXC3(newRXC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC3, newRXC3, newRXC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC4CONTENT getRXC4() {
		return rXC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC4(RXC4CONTENT newRXC4, NotificationChain msgs) {
		RXC4CONTENT oldRXC4 = rXC4;
		rXC4 = newRXC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC4, oldRXC4, newRXC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC4(RXC4CONTENT newRXC4) {
		if (newRXC4 != rXC4) {
			NotificationChain msgs = null;
			if (rXC4 != null)
				msgs = ((InternalEObject)rXC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC4, null, msgs);
			if (newRXC4 != null)
				msgs = ((InternalEObject)newRXC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC4, null, msgs);
			msgs = basicSetRXC4(newRXC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC4, newRXC4, newRXC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC5CONTENT getRXC5() {
		return rXC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC5(RXC5CONTENT newRXC5, NotificationChain msgs) {
		RXC5CONTENT oldRXC5 = rXC5;
		rXC5 = newRXC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC5, oldRXC5, newRXC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC5(RXC5CONTENT newRXC5) {
		if (newRXC5 != rXC5) {
			NotificationChain msgs = null;
			if (rXC5 != null)
				msgs = ((InternalEObject)rXC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC5, null, msgs);
			if (newRXC5 != null)
				msgs = ((InternalEObject)newRXC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC5, null, msgs);
			msgs = basicSetRXC5(newRXC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC5, newRXC5, newRXC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC6CONTENT getRXC6() {
		return rXC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC6(RXC6CONTENT newRXC6, NotificationChain msgs) {
		RXC6CONTENT oldRXC6 = rXC6;
		rXC6 = newRXC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC6, oldRXC6, newRXC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC6(RXC6CONTENT newRXC6) {
		if (newRXC6 != rXC6) {
			NotificationChain msgs = null;
			if (rXC6 != null)
				msgs = ((InternalEObject)rXC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC6, null, msgs);
			if (newRXC6 != null)
				msgs = ((InternalEObject)newRXC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC6, null, msgs);
			msgs = basicSetRXC6(newRXC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC6, newRXC6, newRXC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXC7CONTENT> getRXC7() {
		if (rXC7 == null) {
			rXC7 = new EObjectContainmentEList<RXC7CONTENT>(RXC7CONTENT.class, this, V2xmlPackage.RXCCONTENT__RXC7);
		}
		return rXC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC8CONTENT getRXC8() {
		return rXC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC8(RXC8CONTENT newRXC8, NotificationChain msgs) {
		RXC8CONTENT oldRXC8 = rXC8;
		rXC8 = newRXC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC8, oldRXC8, newRXC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC8(RXC8CONTENT newRXC8) {
		if (newRXC8 != rXC8) {
			NotificationChain msgs = null;
			if (rXC8 != null)
				msgs = ((InternalEObject)rXC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC8, null, msgs);
			if (newRXC8 != null)
				msgs = ((InternalEObject)newRXC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC8, null, msgs);
			msgs = basicSetRXC8(newRXC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC8, newRXC8, newRXC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXC9CONTENT getRXC9() {
		return rXC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXC9(RXC9CONTENT newRXC9, NotificationChain msgs) {
		RXC9CONTENT oldRXC9 = rXC9;
		rXC9 = newRXC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC9, oldRXC9, newRXC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXC9(RXC9CONTENT newRXC9) {
		if (newRXC9 != rXC9) {
			NotificationChain msgs = null;
			if (rXC9 != null)
				msgs = ((InternalEObject)rXC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC9, null, msgs);
			if (newRXC9 != null)
				msgs = ((InternalEObject)newRXC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXCCONTENT__RXC9, null, msgs);
			msgs = basicSetRXC9(newRXC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXCCONTENT__RXC9, newRXC9, newRXC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXCCONTENT__ANY);
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
			case V2xmlPackage.RXCCONTENT__RXC1:
				return basicSetRXC1(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC2:
				return basicSetRXC2(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC3:
				return basicSetRXC3(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC4:
				return basicSetRXC4(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC5:
				return basicSetRXC5(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC6:
				return basicSetRXC6(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC7:
				return ((InternalEList<?>)getRXC7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXCCONTENT__RXC8:
				return basicSetRXC8(null, msgs);
			case V2xmlPackage.RXCCONTENT__RXC9:
				return basicSetRXC9(null, msgs);
			case V2xmlPackage.RXCCONTENT__ANY:
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
			case V2xmlPackage.RXCCONTENT__RXC1:
				return getRXC1();
			case V2xmlPackage.RXCCONTENT__RXC2:
				return getRXC2();
			case V2xmlPackage.RXCCONTENT__RXC3:
				return getRXC3();
			case V2xmlPackage.RXCCONTENT__RXC4:
				return getRXC4();
			case V2xmlPackage.RXCCONTENT__RXC5:
				return getRXC5();
			case V2xmlPackage.RXCCONTENT__RXC6:
				return getRXC6();
			case V2xmlPackage.RXCCONTENT__RXC7:
				return getRXC7();
			case V2xmlPackage.RXCCONTENT__RXC8:
				return getRXC8();
			case V2xmlPackage.RXCCONTENT__RXC9:
				return getRXC9();
			case V2xmlPackage.RXCCONTENT__ANY:
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
			case V2xmlPackage.RXCCONTENT__RXC1:
				setRXC1((RXC1CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC2:
				setRXC2((RXC2CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC3:
				setRXC3((RXC3CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC4:
				setRXC4((RXC4CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC5:
				setRXC5((RXC5CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC6:
				setRXC6((RXC6CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC7:
				getRXC7().clear();
				getRXC7().addAll((Collection<? extends RXC7CONTENT>)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC8:
				setRXC8((RXC8CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__RXC9:
				setRXC9((RXC9CONTENT)newValue);
				return;
			case V2xmlPackage.RXCCONTENT__ANY:
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
			case V2xmlPackage.RXCCONTENT__RXC1:
				setRXC1((RXC1CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC2:
				setRXC2((RXC2CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC3:
				setRXC3((RXC3CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC4:
				setRXC4((RXC4CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC5:
				setRXC5((RXC5CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC6:
				setRXC6((RXC6CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC7:
				getRXC7().clear();
				return;
			case V2xmlPackage.RXCCONTENT__RXC8:
				setRXC8((RXC8CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__RXC9:
				setRXC9((RXC9CONTENT)null);
				return;
			case V2xmlPackage.RXCCONTENT__ANY:
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
			case V2xmlPackage.RXCCONTENT__RXC1:
				return rXC1 != null;
			case V2xmlPackage.RXCCONTENT__RXC2:
				return rXC2 != null;
			case V2xmlPackage.RXCCONTENT__RXC3:
				return rXC3 != null;
			case V2xmlPackage.RXCCONTENT__RXC4:
				return rXC4 != null;
			case V2xmlPackage.RXCCONTENT__RXC5:
				return rXC5 != null;
			case V2xmlPackage.RXCCONTENT__RXC6:
				return rXC6 != null;
			case V2xmlPackage.RXCCONTENT__RXC7:
				return rXC7 != null && !rXC7.isEmpty();
			case V2xmlPackage.RXCCONTENT__RXC8:
				return rXC8 != null;
			case V2xmlPackage.RXCCONTENT__RXC9:
				return rXC9 != null;
			case V2xmlPackage.RXCCONTENT__ANY:
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

} //RXCCONTENTImpl
