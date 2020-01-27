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

import org.hl7.v2xml.FAC10CONTENT;
import org.hl7.v2xml.FAC11CONTENT;
import org.hl7.v2xml.FAC12CONTENT;
import org.hl7.v2xml.FAC1CONTENT;
import org.hl7.v2xml.FAC2CONTENT;
import org.hl7.v2xml.FAC3CONTENT;
import org.hl7.v2xml.FAC4CONTENT;
import org.hl7.v2xml.FAC5CONTENT;
import org.hl7.v2xml.FAC6CONTENT;
import org.hl7.v2xml.FAC7CONTENT;
import org.hl7.v2xml.FAC8CONTENT;
import org.hl7.v2xml.FAC9CONTENT;
import org.hl7.v2xml.FACCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FACCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC1 <em>FAC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC2 <em>FAC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC3 <em>FAC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC4 <em>FAC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC5 <em>FAC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC6 <em>FAC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC7 <em>FAC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC8 <em>FAC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC9 <em>FAC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC10 <em>FAC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC11 <em>FAC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getFAC12 <em>FAC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FACCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FACCONTENTImpl extends EObjectImpl implements FACCONTENT {
	/**
	 * The cached value of the '{@link #getFAC1() <em>FAC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC1()
	 * @generated
	 * @ordered
	 */
	protected FAC1CONTENT fAC1;

	/**
	 * The cached value of the '{@link #getFAC2() <em>FAC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC2()
	 * @generated
	 * @ordered
	 */
	protected FAC2CONTENT fAC2;

	/**
	 * The cached value of the '{@link #getFAC3() <em>FAC3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC3()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC3CONTENT> fAC3;

	/**
	 * The cached value of the '{@link #getFAC4() <em>FAC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC4()
	 * @generated
	 * @ordered
	 */
	protected FAC4CONTENT fAC4;

	/**
	 * The cached value of the '{@link #getFAC5() <em>FAC5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC5()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC5CONTENT> fAC5;

	/**
	 * The cached value of the '{@link #getFAC6() <em>FAC6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC6()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC6CONTENT> fAC6;

	/**
	 * The cached value of the '{@link #getFAC7() <em>FAC7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC7()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC7CONTENT> fAC7;

	/**
	 * The cached value of the '{@link #getFAC8() <em>FAC8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC8()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC8CONTENT> fAC8;

	/**
	 * The cached value of the '{@link #getFAC9() <em>FAC9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC9()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC9CONTENT> fAC9;

	/**
	 * The cached value of the '{@link #getFAC10() <em>FAC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC10()
	 * @generated
	 * @ordered
	 */
	protected FAC10CONTENT fAC10;

	/**
	 * The cached value of the '{@link #getFAC11() <em>FAC11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC11()
	 * @generated
	 * @ordered
	 */
	protected EList<FAC11CONTENT> fAC11;

	/**
	 * The cached value of the '{@link #getFAC12() <em>FAC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFAC12()
	 * @generated
	 * @ordered
	 */
	protected FAC12CONTENT fAC12;

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
	protected FACCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFACCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAC1CONTENT getFAC1() {
		return fAC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAC1(FAC1CONTENT newFAC1, NotificationChain msgs) {
		FAC1CONTENT oldFAC1 = fAC1;
		fAC1 = newFAC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC1, oldFAC1, newFAC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAC1(FAC1CONTENT newFAC1) {
		if (newFAC1 != fAC1) {
			NotificationChain msgs = null;
			if (fAC1 != null)
				msgs = ((InternalEObject)fAC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC1, null, msgs);
			if (newFAC1 != null)
				msgs = ((InternalEObject)newFAC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC1, null, msgs);
			msgs = basicSetFAC1(newFAC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC1, newFAC1, newFAC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAC2CONTENT getFAC2() {
		return fAC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAC2(FAC2CONTENT newFAC2, NotificationChain msgs) {
		FAC2CONTENT oldFAC2 = fAC2;
		fAC2 = newFAC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC2, oldFAC2, newFAC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAC2(FAC2CONTENT newFAC2) {
		if (newFAC2 != fAC2) {
			NotificationChain msgs = null;
			if (fAC2 != null)
				msgs = ((InternalEObject)fAC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC2, null, msgs);
			if (newFAC2 != null)
				msgs = ((InternalEObject)newFAC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC2, null, msgs);
			msgs = basicSetFAC2(newFAC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC2, newFAC2, newFAC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC3CONTENT> getFAC3() {
		if (fAC3 == null) {
			fAC3 = new EObjectContainmentEList<FAC3CONTENT>(FAC3CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC3);
		}
		return fAC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAC4CONTENT getFAC4() {
		return fAC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAC4(FAC4CONTENT newFAC4, NotificationChain msgs) {
		FAC4CONTENT oldFAC4 = fAC4;
		fAC4 = newFAC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC4, oldFAC4, newFAC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAC4(FAC4CONTENT newFAC4) {
		if (newFAC4 != fAC4) {
			NotificationChain msgs = null;
			if (fAC4 != null)
				msgs = ((InternalEObject)fAC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC4, null, msgs);
			if (newFAC4 != null)
				msgs = ((InternalEObject)newFAC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC4, null, msgs);
			msgs = basicSetFAC4(newFAC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC4, newFAC4, newFAC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC5CONTENT> getFAC5() {
		if (fAC5 == null) {
			fAC5 = new EObjectContainmentEList<FAC5CONTENT>(FAC5CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC5);
		}
		return fAC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC6CONTENT> getFAC6() {
		if (fAC6 == null) {
			fAC6 = new EObjectContainmentEList<FAC6CONTENT>(FAC6CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC6);
		}
		return fAC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC7CONTENT> getFAC7() {
		if (fAC7 == null) {
			fAC7 = new EObjectContainmentEList<FAC7CONTENT>(FAC7CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC7);
		}
		return fAC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC8CONTENT> getFAC8() {
		if (fAC8 == null) {
			fAC8 = new EObjectContainmentEList<FAC8CONTENT>(FAC8CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC8);
		}
		return fAC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC9CONTENT> getFAC9() {
		if (fAC9 == null) {
			fAC9 = new EObjectContainmentEList<FAC9CONTENT>(FAC9CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC9);
		}
		return fAC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAC10CONTENT getFAC10() {
		return fAC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAC10(FAC10CONTENT newFAC10, NotificationChain msgs) {
		FAC10CONTENT oldFAC10 = fAC10;
		fAC10 = newFAC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC10, oldFAC10, newFAC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAC10(FAC10CONTENT newFAC10) {
		if (newFAC10 != fAC10) {
			NotificationChain msgs = null;
			if (fAC10 != null)
				msgs = ((InternalEObject)fAC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC10, null, msgs);
			if (newFAC10 != null)
				msgs = ((InternalEObject)newFAC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC10, null, msgs);
			msgs = basicSetFAC10(newFAC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC10, newFAC10, newFAC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FAC11CONTENT> getFAC11() {
		if (fAC11 == null) {
			fAC11 = new EObjectContainmentEList<FAC11CONTENT>(FAC11CONTENT.class, this, V2xmlPackage.FACCONTENT__FAC11);
		}
		return fAC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FAC12CONTENT getFAC12() {
		return fAC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFAC12(FAC12CONTENT newFAC12, NotificationChain msgs) {
		FAC12CONTENT oldFAC12 = fAC12;
		fAC12 = newFAC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC12, oldFAC12, newFAC12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFAC12(FAC12CONTENT newFAC12) {
		if (newFAC12 != fAC12) {
			NotificationChain msgs = null;
			if (fAC12 != null)
				msgs = ((InternalEObject)fAC12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC12, null, msgs);
			if (newFAC12 != null)
				msgs = ((InternalEObject)newFAC12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FACCONTENT__FAC12, null, msgs);
			msgs = basicSetFAC12(newFAC12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FACCONTENT__FAC12, newFAC12, newFAC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.FACCONTENT__ANY);
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
			case V2xmlPackage.FACCONTENT__FAC1:
				return basicSetFAC1(null, msgs);
			case V2xmlPackage.FACCONTENT__FAC2:
				return basicSetFAC2(null, msgs);
			case V2xmlPackage.FACCONTENT__FAC3:
				return ((InternalEList<?>)getFAC3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC4:
				return basicSetFAC4(null, msgs);
			case V2xmlPackage.FACCONTENT__FAC5:
				return ((InternalEList<?>)getFAC5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC6:
				return ((InternalEList<?>)getFAC6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC7:
				return ((InternalEList<?>)getFAC7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC8:
				return ((InternalEList<?>)getFAC8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC9:
				return ((InternalEList<?>)getFAC9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC10:
				return basicSetFAC10(null, msgs);
			case V2xmlPackage.FACCONTENT__FAC11:
				return ((InternalEList<?>)getFAC11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FACCONTENT__FAC12:
				return basicSetFAC12(null, msgs);
			case V2xmlPackage.FACCONTENT__ANY:
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
			case V2xmlPackage.FACCONTENT__FAC1:
				return getFAC1();
			case V2xmlPackage.FACCONTENT__FAC2:
				return getFAC2();
			case V2xmlPackage.FACCONTENT__FAC3:
				return getFAC3();
			case V2xmlPackage.FACCONTENT__FAC4:
				return getFAC4();
			case V2xmlPackage.FACCONTENT__FAC5:
				return getFAC5();
			case V2xmlPackage.FACCONTENT__FAC6:
				return getFAC6();
			case V2xmlPackage.FACCONTENT__FAC7:
				return getFAC7();
			case V2xmlPackage.FACCONTENT__FAC8:
				return getFAC8();
			case V2xmlPackage.FACCONTENT__FAC9:
				return getFAC9();
			case V2xmlPackage.FACCONTENT__FAC10:
				return getFAC10();
			case V2xmlPackage.FACCONTENT__FAC11:
				return getFAC11();
			case V2xmlPackage.FACCONTENT__FAC12:
				return getFAC12();
			case V2xmlPackage.FACCONTENT__ANY:
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
			case V2xmlPackage.FACCONTENT__FAC1:
				setFAC1((FAC1CONTENT)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC2:
				setFAC2((FAC2CONTENT)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC3:
				getFAC3().clear();
				getFAC3().addAll((Collection<? extends FAC3CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC4:
				setFAC4((FAC4CONTENT)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC5:
				getFAC5().clear();
				getFAC5().addAll((Collection<? extends FAC5CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC6:
				getFAC6().clear();
				getFAC6().addAll((Collection<? extends FAC6CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC7:
				getFAC7().clear();
				getFAC7().addAll((Collection<? extends FAC7CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC8:
				getFAC8().clear();
				getFAC8().addAll((Collection<? extends FAC8CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC9:
				getFAC9().clear();
				getFAC9().addAll((Collection<? extends FAC9CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC10:
				setFAC10((FAC10CONTENT)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC11:
				getFAC11().clear();
				getFAC11().addAll((Collection<? extends FAC11CONTENT>)newValue);
				return;
			case V2xmlPackage.FACCONTENT__FAC12:
				setFAC12((FAC12CONTENT)newValue);
				return;
			case V2xmlPackage.FACCONTENT__ANY:
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
			case V2xmlPackage.FACCONTENT__FAC1:
				setFAC1((FAC1CONTENT)null);
				return;
			case V2xmlPackage.FACCONTENT__FAC2:
				setFAC2((FAC2CONTENT)null);
				return;
			case V2xmlPackage.FACCONTENT__FAC3:
				getFAC3().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC4:
				setFAC4((FAC4CONTENT)null);
				return;
			case V2xmlPackage.FACCONTENT__FAC5:
				getFAC5().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC6:
				getFAC6().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC7:
				getFAC7().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC8:
				getFAC8().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC9:
				getFAC9().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC10:
				setFAC10((FAC10CONTENT)null);
				return;
			case V2xmlPackage.FACCONTENT__FAC11:
				getFAC11().clear();
				return;
			case V2xmlPackage.FACCONTENT__FAC12:
				setFAC12((FAC12CONTENT)null);
				return;
			case V2xmlPackage.FACCONTENT__ANY:
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
			case V2xmlPackage.FACCONTENT__FAC1:
				return fAC1 != null;
			case V2xmlPackage.FACCONTENT__FAC2:
				return fAC2 != null;
			case V2xmlPackage.FACCONTENT__FAC3:
				return fAC3 != null && !fAC3.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC4:
				return fAC4 != null;
			case V2xmlPackage.FACCONTENT__FAC5:
				return fAC5 != null && !fAC5.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC6:
				return fAC6 != null && !fAC6.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC7:
				return fAC7 != null && !fAC7.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC8:
				return fAC8 != null && !fAC8.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC9:
				return fAC9 != null && !fAC9.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC10:
				return fAC10 != null;
			case V2xmlPackage.FACCONTENT__FAC11:
				return fAC11 != null && !fAC11.isEmpty();
			case V2xmlPackage.FACCONTENT__FAC12:
				return fAC12 != null;
			case V2xmlPackage.FACCONTENT__ANY:
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

} //FACCONTENTImpl
