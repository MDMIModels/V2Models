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

import org.hl7.v2xml.ERR10CONTENT;
import org.hl7.v2xml.ERR11CONTENT;
import org.hl7.v2xml.ERR12CONTENT;
import org.hl7.v2xml.ERR1CONTENT;
import org.hl7.v2xml.ERR2CONTENT;
import org.hl7.v2xml.ERR3CONTENT;
import org.hl7.v2xml.ERR4CONTENT;
import org.hl7.v2xml.ERR5CONTENT;
import org.hl7.v2xml.ERR6CONTENT;
import org.hl7.v2xml.ERR7CONTENT;
import org.hl7.v2xml.ERR8CONTENT;
import org.hl7.v2xml.ERR9CONTENT;
import org.hl7.v2xml.ERRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR1 <em>ERR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR2 <em>ERR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR3 <em>ERR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR4 <em>ERR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR5 <em>ERR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR6 <em>ERR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR7 <em>ERR7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR8 <em>ERR8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR9 <em>ERR9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR10 <em>ERR10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR11 <em>ERR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getERR12 <em>ERR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERRCONTENTImpl extends EObjectImpl implements ERRCONTENT {
	/**
	 * The cached value of the '{@link #getERR1() <em>ERR1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR1()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR1CONTENT> eRR1;

	/**
	 * The cached value of the '{@link #getERR2() <em>ERR2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR2()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR2CONTENT> eRR2;

	/**
	 * The cached value of the '{@link #getERR3() <em>ERR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR3()
	 * @generated
	 * @ordered
	 */
	protected ERR3CONTENT eRR3;

	/**
	 * The cached value of the '{@link #getERR4() <em>ERR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR4()
	 * @generated
	 * @ordered
	 */
	protected ERR4CONTENT eRR4;

	/**
	 * The cached value of the '{@link #getERR5() <em>ERR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR5()
	 * @generated
	 * @ordered
	 */
	protected ERR5CONTENT eRR5;

	/**
	 * The cached value of the '{@link #getERR6() <em>ERR6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR6()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR6CONTENT> eRR6;

	/**
	 * The cached value of the '{@link #getERR7() <em>ERR7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR7()
	 * @generated
	 * @ordered
	 */
	protected ERR7CONTENT eRR7;

	/**
	 * The cached value of the '{@link #getERR8() <em>ERR8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR8()
	 * @generated
	 * @ordered
	 */
	protected ERR8CONTENT eRR8;

	/**
	 * The cached value of the '{@link #getERR9() <em>ERR9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR9()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR9CONTENT> eRR9;

	/**
	 * The cached value of the '{@link #getERR10() <em>ERR10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR10()
	 * @generated
	 * @ordered
	 */
	protected ERR10CONTENT eRR10;

	/**
	 * The cached value of the '{@link #getERR11() <em>ERR11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR11()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR11CONTENT> eRR11;

	/**
	 * The cached value of the '{@link #getERR12() <em>ERR12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERR12()
	 * @generated
	 * @ordered
	 */
	protected EList<ERR12CONTENT> eRR12;

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
	protected ERRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getERRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR1CONTENT> getERR1() {
		if (eRR1 == null) {
			eRR1 = new EObjectContainmentEList<ERR1CONTENT>(ERR1CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR1);
		}
		return eRR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR2CONTENT> getERR2() {
		if (eRR2 == null) {
			eRR2 = new EObjectContainmentEList<ERR2CONTENT>(ERR2CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR2);
		}
		return eRR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR3CONTENT getERR3() {
		return eRR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR3(ERR3CONTENT newERR3, NotificationChain msgs) {
		ERR3CONTENT oldERR3 = eRR3;
		eRR3 = newERR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR3, oldERR3, newERR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR3(ERR3CONTENT newERR3) {
		if (newERR3 != eRR3) {
			NotificationChain msgs = null;
			if (eRR3 != null)
				msgs = ((InternalEObject)eRR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR3, null, msgs);
			if (newERR3 != null)
				msgs = ((InternalEObject)newERR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR3, null, msgs);
			msgs = basicSetERR3(newERR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR3, newERR3, newERR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR4CONTENT getERR4() {
		return eRR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR4(ERR4CONTENT newERR4, NotificationChain msgs) {
		ERR4CONTENT oldERR4 = eRR4;
		eRR4 = newERR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR4, oldERR4, newERR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR4(ERR4CONTENT newERR4) {
		if (newERR4 != eRR4) {
			NotificationChain msgs = null;
			if (eRR4 != null)
				msgs = ((InternalEObject)eRR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR4, null, msgs);
			if (newERR4 != null)
				msgs = ((InternalEObject)newERR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR4, null, msgs);
			msgs = basicSetERR4(newERR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR4, newERR4, newERR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR5CONTENT getERR5() {
		return eRR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR5(ERR5CONTENT newERR5, NotificationChain msgs) {
		ERR5CONTENT oldERR5 = eRR5;
		eRR5 = newERR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR5, oldERR5, newERR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR5(ERR5CONTENT newERR5) {
		if (newERR5 != eRR5) {
			NotificationChain msgs = null;
			if (eRR5 != null)
				msgs = ((InternalEObject)eRR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR5, null, msgs);
			if (newERR5 != null)
				msgs = ((InternalEObject)newERR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR5, null, msgs);
			msgs = basicSetERR5(newERR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR5, newERR5, newERR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR6CONTENT> getERR6() {
		if (eRR6 == null) {
			eRR6 = new EObjectContainmentEList<ERR6CONTENT>(ERR6CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR6);
		}
		return eRR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR7CONTENT getERR7() {
		return eRR7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR7(ERR7CONTENT newERR7, NotificationChain msgs) {
		ERR7CONTENT oldERR7 = eRR7;
		eRR7 = newERR7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR7, oldERR7, newERR7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR7(ERR7CONTENT newERR7) {
		if (newERR7 != eRR7) {
			NotificationChain msgs = null;
			if (eRR7 != null)
				msgs = ((InternalEObject)eRR7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR7, null, msgs);
			if (newERR7 != null)
				msgs = ((InternalEObject)newERR7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR7, null, msgs);
			msgs = basicSetERR7(newERR7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR7, newERR7, newERR7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR8CONTENT getERR8() {
		return eRR8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR8(ERR8CONTENT newERR8, NotificationChain msgs) {
		ERR8CONTENT oldERR8 = eRR8;
		eRR8 = newERR8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR8, oldERR8, newERR8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR8(ERR8CONTENT newERR8) {
		if (newERR8 != eRR8) {
			NotificationChain msgs = null;
			if (eRR8 != null)
				msgs = ((InternalEObject)eRR8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR8, null, msgs);
			if (newERR8 != null)
				msgs = ((InternalEObject)newERR8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR8, null, msgs);
			msgs = basicSetERR8(newERR8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR8, newERR8, newERR8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR9CONTENT> getERR9() {
		if (eRR9 == null) {
			eRR9 = new EObjectContainmentEList<ERR9CONTENT>(ERR9CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR9);
		}
		return eRR9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERR10CONTENT getERR10() {
		return eRR10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERR10(ERR10CONTENT newERR10, NotificationChain msgs) {
		ERR10CONTENT oldERR10 = eRR10;
		eRR10 = newERR10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR10, oldERR10, newERR10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERR10(ERR10CONTENT newERR10) {
		if (newERR10 != eRR10) {
			NotificationChain msgs = null;
			if (eRR10 != null)
				msgs = ((InternalEObject)eRR10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR10, null, msgs);
			if (newERR10 != null)
				msgs = ((InternalEObject)newERR10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERRCONTENT__ERR10, null, msgs);
			msgs = basicSetERR10(newERR10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERRCONTENT__ERR10, newERR10, newERR10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR11CONTENT> getERR11() {
		if (eRR11 == null) {
			eRR11 = new EObjectContainmentEList<ERR11CONTENT>(ERR11CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR11);
		}
		return eRR11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERR12CONTENT> getERR12() {
		if (eRR12 == null) {
			eRR12 = new EObjectContainmentEList<ERR12CONTENT>(ERR12CONTENT.class, this, V2xmlPackage.ERRCONTENT__ERR12);
		}
		return eRR12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ERRCONTENT__ANY);
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
			case V2xmlPackage.ERRCONTENT__ERR1:
				return ((InternalEList<?>)getERR1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ERR2:
				return ((InternalEList<?>)getERR2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ERR3:
				return basicSetERR3(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR4:
				return basicSetERR4(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR5:
				return basicSetERR5(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR6:
				return ((InternalEList<?>)getERR6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ERR7:
				return basicSetERR7(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR8:
				return basicSetERR8(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR9:
				return ((InternalEList<?>)getERR9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ERR10:
				return basicSetERR10(null, msgs);
			case V2xmlPackage.ERRCONTENT__ERR11:
				return ((InternalEList<?>)getERR11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ERR12:
				return ((InternalEList<?>)getERR12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERRCONTENT__ANY:
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
			case V2xmlPackage.ERRCONTENT__ERR1:
				return getERR1();
			case V2xmlPackage.ERRCONTENT__ERR2:
				return getERR2();
			case V2xmlPackage.ERRCONTENT__ERR3:
				return getERR3();
			case V2xmlPackage.ERRCONTENT__ERR4:
				return getERR4();
			case V2xmlPackage.ERRCONTENT__ERR5:
				return getERR5();
			case V2xmlPackage.ERRCONTENT__ERR6:
				return getERR6();
			case V2xmlPackage.ERRCONTENT__ERR7:
				return getERR7();
			case V2xmlPackage.ERRCONTENT__ERR8:
				return getERR8();
			case V2xmlPackage.ERRCONTENT__ERR9:
				return getERR9();
			case V2xmlPackage.ERRCONTENT__ERR10:
				return getERR10();
			case V2xmlPackage.ERRCONTENT__ERR11:
				return getERR11();
			case V2xmlPackage.ERRCONTENT__ERR12:
				return getERR12();
			case V2xmlPackage.ERRCONTENT__ANY:
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
			case V2xmlPackage.ERRCONTENT__ERR1:
				getERR1().clear();
				getERR1().addAll((Collection<? extends ERR1CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR2:
				getERR2().clear();
				getERR2().addAll((Collection<? extends ERR2CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR3:
				setERR3((ERR3CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR4:
				setERR4((ERR4CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR5:
				setERR5((ERR5CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR6:
				getERR6().clear();
				getERR6().addAll((Collection<? extends ERR6CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR7:
				setERR7((ERR7CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR8:
				setERR8((ERR8CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR9:
				getERR9().clear();
				getERR9().addAll((Collection<? extends ERR9CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR10:
				setERR10((ERR10CONTENT)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR11:
				getERR11().clear();
				getERR11().addAll((Collection<? extends ERR11CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ERR12:
				getERR12().clear();
				getERR12().addAll((Collection<? extends ERR12CONTENT>)newValue);
				return;
			case V2xmlPackage.ERRCONTENT__ANY:
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
			case V2xmlPackage.ERRCONTENT__ERR1:
				getERR1().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ERR2:
				getERR2().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ERR3:
				setERR3((ERR3CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR4:
				setERR4((ERR4CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR5:
				setERR5((ERR5CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR6:
				getERR6().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ERR7:
				setERR7((ERR7CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR8:
				setERR8((ERR8CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR9:
				getERR9().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ERR10:
				setERR10((ERR10CONTENT)null);
				return;
			case V2xmlPackage.ERRCONTENT__ERR11:
				getERR11().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ERR12:
				getERR12().clear();
				return;
			case V2xmlPackage.ERRCONTENT__ANY:
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
			case V2xmlPackage.ERRCONTENT__ERR1:
				return eRR1 != null && !eRR1.isEmpty();
			case V2xmlPackage.ERRCONTENT__ERR2:
				return eRR2 != null && !eRR2.isEmpty();
			case V2xmlPackage.ERRCONTENT__ERR3:
				return eRR3 != null;
			case V2xmlPackage.ERRCONTENT__ERR4:
				return eRR4 != null;
			case V2xmlPackage.ERRCONTENT__ERR5:
				return eRR5 != null;
			case V2xmlPackage.ERRCONTENT__ERR6:
				return eRR6 != null && !eRR6.isEmpty();
			case V2xmlPackage.ERRCONTENT__ERR7:
				return eRR7 != null;
			case V2xmlPackage.ERRCONTENT__ERR8:
				return eRR8 != null;
			case V2xmlPackage.ERRCONTENT__ERR9:
				return eRR9 != null && !eRR9.isEmpty();
			case V2xmlPackage.ERRCONTENT__ERR10:
				return eRR10 != null;
			case V2xmlPackage.ERRCONTENT__ERR11:
				return eRR11 != null && !eRR11.isEmpty();
			case V2xmlPackage.ERRCONTENT__ERR12:
				return eRR12 != null && !eRR12.isEmpty();
			case V2xmlPackage.ERRCONTENT__ANY:
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

} //ERRCONTENTImpl
