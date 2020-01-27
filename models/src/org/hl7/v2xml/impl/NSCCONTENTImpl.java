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

import org.hl7.v2xml.NSC1CONTENT;
import org.hl7.v2xml.NSC2CONTENT;
import org.hl7.v2xml.NSC3CONTENT;
import org.hl7.v2xml.NSC4CONTENT;
import org.hl7.v2xml.NSC5CONTENT;
import org.hl7.v2xml.NSC6CONTENT;
import org.hl7.v2xml.NSC7CONTENT;
import org.hl7.v2xml.NSC8CONTENT;
import org.hl7.v2xml.NSC9CONTENT;
import org.hl7.v2xml.NSCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC1 <em>NSC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC2 <em>NSC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC3 <em>NSC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC4 <em>NSC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC5 <em>NSC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC6 <em>NSC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC7 <em>NSC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC8 <em>NSC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getNSC9 <em>NSC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSCCONTENTImpl extends EObjectImpl implements NSCCONTENT {
	/**
	 * The cached value of the '{@link #getNSC1() <em>NSC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC1()
	 * @generated
	 * @ordered
	 */
	protected NSC1CONTENT nSC1;

	/**
	 * The cached value of the '{@link #getNSC2() <em>NSC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC2()
	 * @generated
	 * @ordered
	 */
	protected NSC2CONTENT nSC2;

	/**
	 * The cached value of the '{@link #getNSC3() <em>NSC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC3()
	 * @generated
	 * @ordered
	 */
	protected NSC3CONTENT nSC3;

	/**
	 * The cached value of the '{@link #getNSC4() <em>NSC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC4()
	 * @generated
	 * @ordered
	 */
	protected NSC4CONTENT nSC4;

	/**
	 * The cached value of the '{@link #getNSC5() <em>NSC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC5()
	 * @generated
	 * @ordered
	 */
	protected NSC5CONTENT nSC5;

	/**
	 * The cached value of the '{@link #getNSC6() <em>NSC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC6()
	 * @generated
	 * @ordered
	 */
	protected NSC6CONTENT nSC6;

	/**
	 * The cached value of the '{@link #getNSC7() <em>NSC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC7()
	 * @generated
	 * @ordered
	 */
	protected NSC7CONTENT nSC7;

	/**
	 * The cached value of the '{@link #getNSC8() <em>NSC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC8()
	 * @generated
	 * @ordered
	 */
	protected NSC8CONTENT nSC8;

	/**
	 * The cached value of the '{@link #getNSC9() <em>NSC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNSC9()
	 * @generated
	 * @ordered
	 */
	protected NSC9CONTENT nSC9;

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
	protected NSCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNSCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC1CONTENT getNSC1() {
		return nSC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC1(NSC1CONTENT newNSC1, NotificationChain msgs) {
		NSC1CONTENT oldNSC1 = nSC1;
		nSC1 = newNSC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC1, oldNSC1, newNSC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC1(NSC1CONTENT newNSC1) {
		if (newNSC1 != nSC1) {
			NotificationChain msgs = null;
			if (nSC1 != null)
				msgs = ((InternalEObject)nSC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC1, null, msgs);
			if (newNSC1 != null)
				msgs = ((InternalEObject)newNSC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC1, null, msgs);
			msgs = basicSetNSC1(newNSC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC1, newNSC1, newNSC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC2CONTENT getNSC2() {
		return nSC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC2(NSC2CONTENT newNSC2, NotificationChain msgs) {
		NSC2CONTENT oldNSC2 = nSC2;
		nSC2 = newNSC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC2, oldNSC2, newNSC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC2(NSC2CONTENT newNSC2) {
		if (newNSC2 != nSC2) {
			NotificationChain msgs = null;
			if (nSC2 != null)
				msgs = ((InternalEObject)nSC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC2, null, msgs);
			if (newNSC2 != null)
				msgs = ((InternalEObject)newNSC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC2, null, msgs);
			msgs = basicSetNSC2(newNSC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC2, newNSC2, newNSC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC3CONTENT getNSC3() {
		return nSC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC3(NSC3CONTENT newNSC3, NotificationChain msgs) {
		NSC3CONTENT oldNSC3 = nSC3;
		nSC3 = newNSC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC3, oldNSC3, newNSC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC3(NSC3CONTENT newNSC3) {
		if (newNSC3 != nSC3) {
			NotificationChain msgs = null;
			if (nSC3 != null)
				msgs = ((InternalEObject)nSC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC3, null, msgs);
			if (newNSC3 != null)
				msgs = ((InternalEObject)newNSC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC3, null, msgs);
			msgs = basicSetNSC3(newNSC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC3, newNSC3, newNSC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC4CONTENT getNSC4() {
		return nSC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC4(NSC4CONTENT newNSC4, NotificationChain msgs) {
		NSC4CONTENT oldNSC4 = nSC4;
		nSC4 = newNSC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC4, oldNSC4, newNSC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC4(NSC4CONTENT newNSC4) {
		if (newNSC4 != nSC4) {
			NotificationChain msgs = null;
			if (nSC4 != null)
				msgs = ((InternalEObject)nSC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC4, null, msgs);
			if (newNSC4 != null)
				msgs = ((InternalEObject)newNSC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC4, null, msgs);
			msgs = basicSetNSC4(newNSC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC4, newNSC4, newNSC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC5CONTENT getNSC5() {
		return nSC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC5(NSC5CONTENT newNSC5, NotificationChain msgs) {
		NSC5CONTENT oldNSC5 = nSC5;
		nSC5 = newNSC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC5, oldNSC5, newNSC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC5(NSC5CONTENT newNSC5) {
		if (newNSC5 != nSC5) {
			NotificationChain msgs = null;
			if (nSC5 != null)
				msgs = ((InternalEObject)nSC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC5, null, msgs);
			if (newNSC5 != null)
				msgs = ((InternalEObject)newNSC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC5, null, msgs);
			msgs = basicSetNSC5(newNSC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC5, newNSC5, newNSC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC6CONTENT getNSC6() {
		return nSC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC6(NSC6CONTENT newNSC6, NotificationChain msgs) {
		NSC6CONTENT oldNSC6 = nSC6;
		nSC6 = newNSC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC6, oldNSC6, newNSC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC6(NSC6CONTENT newNSC6) {
		if (newNSC6 != nSC6) {
			NotificationChain msgs = null;
			if (nSC6 != null)
				msgs = ((InternalEObject)nSC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC6, null, msgs);
			if (newNSC6 != null)
				msgs = ((InternalEObject)newNSC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC6, null, msgs);
			msgs = basicSetNSC6(newNSC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC6, newNSC6, newNSC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC7CONTENT getNSC7() {
		return nSC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC7(NSC7CONTENT newNSC7, NotificationChain msgs) {
		NSC7CONTENT oldNSC7 = nSC7;
		nSC7 = newNSC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC7, oldNSC7, newNSC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC7(NSC7CONTENT newNSC7) {
		if (newNSC7 != nSC7) {
			NotificationChain msgs = null;
			if (nSC7 != null)
				msgs = ((InternalEObject)nSC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC7, null, msgs);
			if (newNSC7 != null)
				msgs = ((InternalEObject)newNSC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC7, null, msgs);
			msgs = basicSetNSC7(newNSC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC7, newNSC7, newNSC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC8CONTENT getNSC8() {
		return nSC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC8(NSC8CONTENT newNSC8, NotificationChain msgs) {
		NSC8CONTENT oldNSC8 = nSC8;
		nSC8 = newNSC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC8, oldNSC8, newNSC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC8(NSC8CONTENT newNSC8) {
		if (newNSC8 != nSC8) {
			NotificationChain msgs = null;
			if (nSC8 != null)
				msgs = ((InternalEObject)nSC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC8, null, msgs);
			if (newNSC8 != null)
				msgs = ((InternalEObject)newNSC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC8, null, msgs);
			msgs = basicSetNSC8(newNSC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC8, newNSC8, newNSC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NSC9CONTENT getNSC9() {
		return nSC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNSC9(NSC9CONTENT newNSC9, NotificationChain msgs) {
		NSC9CONTENT oldNSC9 = nSC9;
		nSC9 = newNSC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC9, oldNSC9, newNSC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNSC9(NSC9CONTENT newNSC9) {
		if (newNSC9 != nSC9) {
			NotificationChain msgs = null;
			if (nSC9 != null)
				msgs = ((InternalEObject)nSC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC9, null, msgs);
			if (newNSC9 != null)
				msgs = ((InternalEObject)newNSC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSCCONTENT__NSC9, null, msgs);
			msgs = basicSetNSC9(newNSC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSCCONTENT__NSC9, newNSC9, newNSC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NSCCONTENT__ANY);
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
			case V2xmlPackage.NSCCONTENT__NSC1:
				return basicSetNSC1(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC2:
				return basicSetNSC2(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC3:
				return basicSetNSC3(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC4:
				return basicSetNSC4(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC5:
				return basicSetNSC5(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC6:
				return basicSetNSC6(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC7:
				return basicSetNSC7(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC8:
				return basicSetNSC8(null, msgs);
			case V2xmlPackage.NSCCONTENT__NSC9:
				return basicSetNSC9(null, msgs);
			case V2xmlPackage.NSCCONTENT__ANY:
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
			case V2xmlPackage.NSCCONTENT__NSC1:
				return getNSC1();
			case V2xmlPackage.NSCCONTENT__NSC2:
				return getNSC2();
			case V2xmlPackage.NSCCONTENT__NSC3:
				return getNSC3();
			case V2xmlPackage.NSCCONTENT__NSC4:
				return getNSC4();
			case V2xmlPackage.NSCCONTENT__NSC5:
				return getNSC5();
			case V2xmlPackage.NSCCONTENT__NSC6:
				return getNSC6();
			case V2xmlPackage.NSCCONTENT__NSC7:
				return getNSC7();
			case V2xmlPackage.NSCCONTENT__NSC8:
				return getNSC8();
			case V2xmlPackage.NSCCONTENT__NSC9:
				return getNSC9();
			case V2xmlPackage.NSCCONTENT__ANY:
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
			case V2xmlPackage.NSCCONTENT__NSC1:
				setNSC1((NSC1CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC2:
				setNSC2((NSC2CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC3:
				setNSC3((NSC3CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC4:
				setNSC4((NSC4CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC5:
				setNSC5((NSC5CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC6:
				setNSC6((NSC6CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC7:
				setNSC7((NSC7CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC8:
				setNSC8((NSC8CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__NSC9:
				setNSC9((NSC9CONTENT)newValue);
				return;
			case V2xmlPackage.NSCCONTENT__ANY:
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
			case V2xmlPackage.NSCCONTENT__NSC1:
				setNSC1((NSC1CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC2:
				setNSC2((NSC2CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC3:
				setNSC3((NSC3CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC4:
				setNSC4((NSC4CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC5:
				setNSC5((NSC5CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC6:
				setNSC6((NSC6CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC7:
				setNSC7((NSC7CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC8:
				setNSC8((NSC8CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__NSC9:
				setNSC9((NSC9CONTENT)null);
				return;
			case V2xmlPackage.NSCCONTENT__ANY:
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
			case V2xmlPackage.NSCCONTENT__NSC1:
				return nSC1 != null;
			case V2xmlPackage.NSCCONTENT__NSC2:
				return nSC2 != null;
			case V2xmlPackage.NSCCONTENT__NSC3:
				return nSC3 != null;
			case V2xmlPackage.NSCCONTENT__NSC4:
				return nSC4 != null;
			case V2xmlPackage.NSCCONTENT__NSC5:
				return nSC5 != null;
			case V2xmlPackage.NSCCONTENT__NSC6:
				return nSC6 != null;
			case V2xmlPackage.NSCCONTENT__NSC7:
				return nSC7 != null;
			case V2xmlPackage.NSCCONTENT__NSC8:
				return nSC8 != null;
			case V2xmlPackage.NSCCONTENT__NSC9:
				return nSC9 != null;
			case V2xmlPackage.NSCCONTENT__ANY:
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

} //NSCCONTENTImpl
