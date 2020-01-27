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

import org.hl7.v2xml.PES10CONTENT;
import org.hl7.v2xml.PES11CONTENT;
import org.hl7.v2xml.PES12CONTENT;
import org.hl7.v2xml.PES13CONTENT;
import org.hl7.v2xml.PES1CONTENT;
import org.hl7.v2xml.PES2CONTENT;
import org.hl7.v2xml.PES3CONTENT;
import org.hl7.v2xml.PES4CONTENT;
import org.hl7.v2xml.PES5CONTENT;
import org.hl7.v2xml.PES6CONTENT;
import org.hl7.v2xml.PES7CONTENT;
import org.hl7.v2xml.PES8CONTENT;
import org.hl7.v2xml.PES9CONTENT;
import org.hl7.v2xml.PESCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PESCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES1 <em>PES1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES2 <em>PES2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES3 <em>PES3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES4 <em>PES4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES5 <em>PES5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES6 <em>PES6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES7 <em>PES7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES8 <em>PES8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES9 <em>PES9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES10 <em>PES10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES11 <em>PES11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES12 <em>PES12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getPES13 <em>PES13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PESCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PESCONTENTImpl extends EObjectImpl implements PESCONTENT {
	/**
	 * The cached value of the '{@link #getPES1() <em>PES1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES1()
	 * @generated
	 * @ordered
	 */
	protected EList<PES1CONTENT> pES1;

	/**
	 * The cached value of the '{@link #getPES2() <em>PES2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES2()
	 * @generated
	 * @ordered
	 */
	protected EList<PES2CONTENT> pES2;

	/**
	 * The cached value of the '{@link #getPES3() <em>PES3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES3()
	 * @generated
	 * @ordered
	 */
	protected EList<PES3CONTENT> pES3;

	/**
	 * The cached value of the '{@link #getPES4() <em>PES4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES4()
	 * @generated
	 * @ordered
	 */
	protected EList<PES4CONTENT> pES4;

	/**
	 * The cached value of the '{@link #getPES5() <em>PES5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES5()
	 * @generated
	 * @ordered
	 */
	protected PES5CONTENT pES5;

	/**
	 * The cached value of the '{@link #getPES6() <em>PES6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES6()
	 * @generated
	 * @ordered
	 */
	protected PES6CONTENT pES6;

	/**
	 * The cached value of the '{@link #getPES7() <em>PES7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES7()
	 * @generated
	 * @ordered
	 */
	protected EList<PES7CONTENT> pES7;

	/**
	 * The cached value of the '{@link #getPES8() <em>PES8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES8()
	 * @generated
	 * @ordered
	 */
	protected PES8CONTENT pES8;

	/**
	 * The cached value of the '{@link #getPES9() <em>PES9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES9()
	 * @generated
	 * @ordered
	 */
	protected PES9CONTENT pES9;

	/**
	 * The cached value of the '{@link #getPES10() <em>PES10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES10()
	 * @generated
	 * @ordered
	 */
	protected PES10CONTENT pES10;

	/**
	 * The cached value of the '{@link #getPES11() <em>PES11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES11()
	 * @generated
	 * @ordered
	 */
	protected EList<PES11CONTENT> pES11;

	/**
	 * The cached value of the '{@link #getPES12() <em>PES12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES12()
	 * @generated
	 * @ordered
	 */
	protected PES12CONTENT pES12;

	/**
	 * The cached value of the '{@link #getPES13() <em>PES13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPES13()
	 * @generated
	 * @ordered
	 */
	protected EList<PES13CONTENT> pES13;

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
	protected PESCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPESCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES1CONTENT> getPES1() {
		if (pES1 == null) {
			pES1 = new EObjectContainmentEList<PES1CONTENT>(PES1CONTENT.class, this, V2xmlPackage.PESCONTENT__PES1);
		}
		return pES1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES2CONTENT> getPES2() {
		if (pES2 == null) {
			pES2 = new EObjectContainmentEList<PES2CONTENT>(PES2CONTENT.class, this, V2xmlPackage.PESCONTENT__PES2);
		}
		return pES2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES3CONTENT> getPES3() {
		if (pES3 == null) {
			pES3 = new EObjectContainmentEList<PES3CONTENT>(PES3CONTENT.class, this, V2xmlPackage.PESCONTENT__PES3);
		}
		return pES3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES4CONTENT> getPES4() {
		if (pES4 == null) {
			pES4 = new EObjectContainmentEList<PES4CONTENT>(PES4CONTENT.class, this, V2xmlPackage.PESCONTENT__PES4);
		}
		return pES4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES5CONTENT getPES5() {
		return pES5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES5(PES5CONTENT newPES5, NotificationChain msgs) {
		PES5CONTENT oldPES5 = pES5;
		pES5 = newPES5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES5, oldPES5, newPES5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES5(PES5CONTENT newPES5) {
		if (newPES5 != pES5) {
			NotificationChain msgs = null;
			if (pES5 != null)
				msgs = ((InternalEObject)pES5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES5, null, msgs);
			if (newPES5 != null)
				msgs = ((InternalEObject)newPES5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES5, null, msgs);
			msgs = basicSetPES5(newPES5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES5, newPES5, newPES5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES6CONTENT getPES6() {
		return pES6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES6(PES6CONTENT newPES6, NotificationChain msgs) {
		PES6CONTENT oldPES6 = pES6;
		pES6 = newPES6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES6, oldPES6, newPES6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES6(PES6CONTENT newPES6) {
		if (newPES6 != pES6) {
			NotificationChain msgs = null;
			if (pES6 != null)
				msgs = ((InternalEObject)pES6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES6, null, msgs);
			if (newPES6 != null)
				msgs = ((InternalEObject)newPES6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES6, null, msgs);
			msgs = basicSetPES6(newPES6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES6, newPES6, newPES6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES7CONTENT> getPES7() {
		if (pES7 == null) {
			pES7 = new EObjectContainmentEList<PES7CONTENT>(PES7CONTENT.class, this, V2xmlPackage.PESCONTENT__PES7);
		}
		return pES7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES8CONTENT getPES8() {
		return pES8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES8(PES8CONTENT newPES8, NotificationChain msgs) {
		PES8CONTENT oldPES8 = pES8;
		pES8 = newPES8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES8, oldPES8, newPES8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES8(PES8CONTENT newPES8) {
		if (newPES8 != pES8) {
			NotificationChain msgs = null;
			if (pES8 != null)
				msgs = ((InternalEObject)pES8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES8, null, msgs);
			if (newPES8 != null)
				msgs = ((InternalEObject)newPES8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES8, null, msgs);
			msgs = basicSetPES8(newPES8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES8, newPES8, newPES8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES9CONTENT getPES9() {
		return pES9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES9(PES9CONTENT newPES9, NotificationChain msgs) {
		PES9CONTENT oldPES9 = pES9;
		pES9 = newPES9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES9, oldPES9, newPES9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES9(PES9CONTENT newPES9) {
		if (newPES9 != pES9) {
			NotificationChain msgs = null;
			if (pES9 != null)
				msgs = ((InternalEObject)pES9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES9, null, msgs);
			if (newPES9 != null)
				msgs = ((InternalEObject)newPES9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES9, null, msgs);
			msgs = basicSetPES9(newPES9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES9, newPES9, newPES9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES10CONTENT getPES10() {
		return pES10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES10(PES10CONTENT newPES10, NotificationChain msgs) {
		PES10CONTENT oldPES10 = pES10;
		pES10 = newPES10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES10, oldPES10, newPES10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES10(PES10CONTENT newPES10) {
		if (newPES10 != pES10) {
			NotificationChain msgs = null;
			if (pES10 != null)
				msgs = ((InternalEObject)pES10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES10, null, msgs);
			if (newPES10 != null)
				msgs = ((InternalEObject)newPES10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES10, null, msgs);
			msgs = basicSetPES10(newPES10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES10, newPES10, newPES10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES11CONTENT> getPES11() {
		if (pES11 == null) {
			pES11 = new EObjectContainmentEList<PES11CONTENT>(PES11CONTENT.class, this, V2xmlPackage.PESCONTENT__PES11);
		}
		return pES11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PES12CONTENT getPES12() {
		return pES12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPES12(PES12CONTENT newPES12, NotificationChain msgs) {
		PES12CONTENT oldPES12 = pES12;
		pES12 = newPES12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES12, oldPES12, newPES12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPES12(PES12CONTENT newPES12) {
		if (newPES12 != pES12) {
			NotificationChain msgs = null;
			if (pES12 != null)
				msgs = ((InternalEObject)pES12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES12, null, msgs);
			if (newPES12 != null)
				msgs = ((InternalEObject)newPES12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PESCONTENT__PES12, null, msgs);
			msgs = basicSetPES12(newPES12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PESCONTENT__PES12, newPES12, newPES12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PES13CONTENT> getPES13() {
		if (pES13 == null) {
			pES13 = new EObjectContainmentEList<PES13CONTENT>(PES13CONTENT.class, this, V2xmlPackage.PESCONTENT__PES13);
		}
		return pES13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PESCONTENT__ANY);
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
			case V2xmlPackage.PESCONTENT__PES1:
				return ((InternalEList<?>)getPES1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES2:
				return ((InternalEList<?>)getPES2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES3:
				return ((InternalEList<?>)getPES3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES4:
				return ((InternalEList<?>)getPES4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES5:
				return basicSetPES5(null, msgs);
			case V2xmlPackage.PESCONTENT__PES6:
				return basicSetPES6(null, msgs);
			case V2xmlPackage.PESCONTENT__PES7:
				return ((InternalEList<?>)getPES7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES8:
				return basicSetPES8(null, msgs);
			case V2xmlPackage.PESCONTENT__PES9:
				return basicSetPES9(null, msgs);
			case V2xmlPackage.PESCONTENT__PES10:
				return basicSetPES10(null, msgs);
			case V2xmlPackage.PESCONTENT__PES11:
				return ((InternalEList<?>)getPES11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__PES12:
				return basicSetPES12(null, msgs);
			case V2xmlPackage.PESCONTENT__PES13:
				return ((InternalEList<?>)getPES13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PESCONTENT__ANY:
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
			case V2xmlPackage.PESCONTENT__PES1:
				return getPES1();
			case V2xmlPackage.PESCONTENT__PES2:
				return getPES2();
			case V2xmlPackage.PESCONTENT__PES3:
				return getPES3();
			case V2xmlPackage.PESCONTENT__PES4:
				return getPES4();
			case V2xmlPackage.PESCONTENT__PES5:
				return getPES5();
			case V2xmlPackage.PESCONTENT__PES6:
				return getPES6();
			case V2xmlPackage.PESCONTENT__PES7:
				return getPES7();
			case V2xmlPackage.PESCONTENT__PES8:
				return getPES8();
			case V2xmlPackage.PESCONTENT__PES9:
				return getPES9();
			case V2xmlPackage.PESCONTENT__PES10:
				return getPES10();
			case V2xmlPackage.PESCONTENT__PES11:
				return getPES11();
			case V2xmlPackage.PESCONTENT__PES12:
				return getPES12();
			case V2xmlPackage.PESCONTENT__PES13:
				return getPES13();
			case V2xmlPackage.PESCONTENT__ANY:
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
			case V2xmlPackage.PESCONTENT__PES1:
				getPES1().clear();
				getPES1().addAll((Collection<? extends PES1CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES2:
				getPES2().clear();
				getPES2().addAll((Collection<? extends PES2CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES3:
				getPES3().clear();
				getPES3().addAll((Collection<? extends PES3CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES4:
				getPES4().clear();
				getPES4().addAll((Collection<? extends PES4CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES5:
				setPES5((PES5CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES6:
				setPES6((PES6CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES7:
				getPES7().clear();
				getPES7().addAll((Collection<? extends PES7CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES8:
				setPES8((PES8CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES9:
				setPES9((PES9CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES10:
				setPES10((PES10CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES11:
				getPES11().clear();
				getPES11().addAll((Collection<? extends PES11CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES12:
				setPES12((PES12CONTENT)newValue);
				return;
			case V2xmlPackage.PESCONTENT__PES13:
				getPES13().clear();
				getPES13().addAll((Collection<? extends PES13CONTENT>)newValue);
				return;
			case V2xmlPackage.PESCONTENT__ANY:
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
			case V2xmlPackage.PESCONTENT__PES1:
				getPES1().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES2:
				getPES2().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES3:
				getPES3().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES4:
				getPES4().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES5:
				setPES5((PES5CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES6:
				setPES6((PES6CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES7:
				getPES7().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES8:
				setPES8((PES8CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES9:
				setPES9((PES9CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES10:
				setPES10((PES10CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES11:
				getPES11().clear();
				return;
			case V2xmlPackage.PESCONTENT__PES12:
				setPES12((PES12CONTENT)null);
				return;
			case V2xmlPackage.PESCONTENT__PES13:
				getPES13().clear();
				return;
			case V2xmlPackage.PESCONTENT__ANY:
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
			case V2xmlPackage.PESCONTENT__PES1:
				return pES1 != null && !pES1.isEmpty();
			case V2xmlPackage.PESCONTENT__PES2:
				return pES2 != null && !pES2.isEmpty();
			case V2xmlPackage.PESCONTENT__PES3:
				return pES3 != null && !pES3.isEmpty();
			case V2xmlPackage.PESCONTENT__PES4:
				return pES4 != null && !pES4.isEmpty();
			case V2xmlPackage.PESCONTENT__PES5:
				return pES5 != null;
			case V2xmlPackage.PESCONTENT__PES6:
				return pES6 != null;
			case V2xmlPackage.PESCONTENT__PES7:
				return pES7 != null && !pES7.isEmpty();
			case V2xmlPackage.PESCONTENT__PES8:
				return pES8 != null;
			case V2xmlPackage.PESCONTENT__PES9:
				return pES9 != null;
			case V2xmlPackage.PESCONTENT__PES10:
				return pES10 != null;
			case V2xmlPackage.PESCONTENT__PES11:
				return pES11 != null && !pES11.isEmpty();
			case V2xmlPackage.PESCONTENT__PES12:
				return pES12 != null;
			case V2xmlPackage.PESCONTENT__PES13:
				return pES13 != null && !pES13.isEmpty();
			case V2xmlPackage.PESCONTENT__ANY:
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

} //PESCONTENTImpl
