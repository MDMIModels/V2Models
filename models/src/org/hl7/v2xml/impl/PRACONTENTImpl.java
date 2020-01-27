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

import org.hl7.v2xml.PRA10CONTENT;
import org.hl7.v2xml.PRA11CONTENT;
import org.hl7.v2xml.PRA12CONTENT;
import org.hl7.v2xml.PRA1CONTENT;
import org.hl7.v2xml.PRA2CONTENT;
import org.hl7.v2xml.PRA3CONTENT;
import org.hl7.v2xml.PRA4CONTENT;
import org.hl7.v2xml.PRA5CONTENT;
import org.hl7.v2xml.PRA6CONTENT;
import org.hl7.v2xml.PRA7CONTENT;
import org.hl7.v2xml.PRA8CONTENT;
import org.hl7.v2xml.PRA9CONTENT;
import org.hl7.v2xml.PRACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA1 <em>PRA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA2 <em>PRA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA3 <em>PRA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA4 <em>PRA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA5 <em>PRA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA6 <em>PRA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA7 <em>PRA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA8 <em>PRA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA9 <em>PRA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA10 <em>PRA10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA11 <em>PRA11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getPRA12 <em>PRA12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRACONTENTImpl extends EObjectImpl implements PRACONTENT {
	/**
	 * The cached value of the '{@link #getPRA1() <em>PRA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA1()
	 * @generated
	 * @ordered
	 */
	protected PRA1CONTENT pRA1;

	/**
	 * The cached value of the '{@link #getPRA2() <em>PRA2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA2()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA2CONTENT> pRA2;

	/**
	 * The cached value of the '{@link #getPRA3() <em>PRA3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA3()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA3CONTENT> pRA3;

	/**
	 * The cached value of the '{@link #getPRA4() <em>PRA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA4()
	 * @generated
	 * @ordered
	 */
	protected PRA4CONTENT pRA4;

	/**
	 * The cached value of the '{@link #getPRA5() <em>PRA5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA5()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA5CONTENT> pRA5;

	/**
	 * The cached value of the '{@link #getPRA6() <em>PRA6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA6()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA6CONTENT> pRA6;

	/**
	 * The cached value of the '{@link #getPRA7() <em>PRA7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA7()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA7CONTENT> pRA7;

	/**
	 * The cached value of the '{@link #getPRA8() <em>PRA8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA8()
	 * @generated
	 * @ordered
	 */
	protected PRA8CONTENT pRA8;

	/**
	 * The cached value of the '{@link #getPRA9() <em>PRA9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA9()
	 * @generated
	 * @ordered
	 */
	protected PRA9CONTENT pRA9;

	/**
	 * The cached value of the '{@link #getPRA10() <em>PRA10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA10()
	 * @generated
	 * @ordered
	 */
	protected PRA10CONTENT pRA10;

	/**
	 * The cached value of the '{@link #getPRA11() <em>PRA11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA11()
	 * @generated
	 * @ordered
	 */
	protected EList<PRA11CONTENT> pRA11;

	/**
	 * The cached value of the '{@link #getPRA12() <em>PRA12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRA12()
	 * @generated
	 * @ordered
	 */
	protected PRA12CONTENT pRA12;

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
	protected PRACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPRACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA1CONTENT getPRA1() {
		return pRA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA1(PRA1CONTENT newPRA1, NotificationChain msgs) {
		PRA1CONTENT oldPRA1 = pRA1;
		pRA1 = newPRA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA1, oldPRA1, newPRA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA1(PRA1CONTENT newPRA1) {
		if (newPRA1 != pRA1) {
			NotificationChain msgs = null;
			if (pRA1 != null)
				msgs = ((InternalEObject)pRA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA1, null, msgs);
			if (newPRA1 != null)
				msgs = ((InternalEObject)newPRA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA1, null, msgs);
			msgs = basicSetPRA1(newPRA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA1, newPRA1, newPRA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA2CONTENT> getPRA2() {
		if (pRA2 == null) {
			pRA2 = new EObjectContainmentEList<PRA2CONTENT>(PRA2CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA2);
		}
		return pRA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA3CONTENT> getPRA3() {
		if (pRA3 == null) {
			pRA3 = new EObjectContainmentEList<PRA3CONTENT>(PRA3CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA3);
		}
		return pRA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA4CONTENT getPRA4() {
		return pRA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA4(PRA4CONTENT newPRA4, NotificationChain msgs) {
		PRA4CONTENT oldPRA4 = pRA4;
		pRA4 = newPRA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA4, oldPRA4, newPRA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA4(PRA4CONTENT newPRA4) {
		if (newPRA4 != pRA4) {
			NotificationChain msgs = null;
			if (pRA4 != null)
				msgs = ((InternalEObject)pRA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA4, null, msgs);
			if (newPRA4 != null)
				msgs = ((InternalEObject)newPRA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA4, null, msgs);
			msgs = basicSetPRA4(newPRA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA4, newPRA4, newPRA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA5CONTENT> getPRA5() {
		if (pRA5 == null) {
			pRA5 = new EObjectContainmentEList<PRA5CONTENT>(PRA5CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA5);
		}
		return pRA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA6CONTENT> getPRA6() {
		if (pRA6 == null) {
			pRA6 = new EObjectContainmentEList<PRA6CONTENT>(PRA6CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA6);
		}
		return pRA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA7CONTENT> getPRA7() {
		if (pRA7 == null) {
			pRA7 = new EObjectContainmentEList<PRA7CONTENT>(PRA7CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA7);
		}
		return pRA7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA8CONTENT getPRA8() {
		return pRA8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA8(PRA8CONTENT newPRA8, NotificationChain msgs) {
		PRA8CONTENT oldPRA8 = pRA8;
		pRA8 = newPRA8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA8, oldPRA8, newPRA8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA8(PRA8CONTENT newPRA8) {
		if (newPRA8 != pRA8) {
			NotificationChain msgs = null;
			if (pRA8 != null)
				msgs = ((InternalEObject)pRA8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA8, null, msgs);
			if (newPRA8 != null)
				msgs = ((InternalEObject)newPRA8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA8, null, msgs);
			msgs = basicSetPRA8(newPRA8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA8, newPRA8, newPRA8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA9CONTENT getPRA9() {
		return pRA9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA9(PRA9CONTENT newPRA9, NotificationChain msgs) {
		PRA9CONTENT oldPRA9 = pRA9;
		pRA9 = newPRA9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA9, oldPRA9, newPRA9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA9(PRA9CONTENT newPRA9) {
		if (newPRA9 != pRA9) {
			NotificationChain msgs = null;
			if (pRA9 != null)
				msgs = ((InternalEObject)pRA9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA9, null, msgs);
			if (newPRA9 != null)
				msgs = ((InternalEObject)newPRA9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA9, null, msgs);
			msgs = basicSetPRA9(newPRA9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA9, newPRA9, newPRA9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA10CONTENT getPRA10() {
		return pRA10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA10(PRA10CONTENT newPRA10, NotificationChain msgs) {
		PRA10CONTENT oldPRA10 = pRA10;
		pRA10 = newPRA10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA10, oldPRA10, newPRA10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA10(PRA10CONTENT newPRA10) {
		if (newPRA10 != pRA10) {
			NotificationChain msgs = null;
			if (pRA10 != null)
				msgs = ((InternalEObject)pRA10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA10, null, msgs);
			if (newPRA10 != null)
				msgs = ((InternalEObject)newPRA10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA10, null, msgs);
			msgs = basicSetPRA10(newPRA10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA10, newPRA10, newPRA10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRA11CONTENT> getPRA11() {
		if (pRA11 == null) {
			pRA11 = new EObjectContainmentEList<PRA11CONTENT>(PRA11CONTENT.class, this, V2xmlPackage.PRACONTENT__PRA11);
		}
		return pRA11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRA12CONTENT getPRA12() {
		return pRA12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRA12(PRA12CONTENT newPRA12, NotificationChain msgs) {
		PRA12CONTENT oldPRA12 = pRA12;
		pRA12 = newPRA12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA12, oldPRA12, newPRA12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRA12(PRA12CONTENT newPRA12) {
		if (newPRA12 != pRA12) {
			NotificationChain msgs = null;
			if (pRA12 != null)
				msgs = ((InternalEObject)pRA12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA12, null, msgs);
			if (newPRA12 != null)
				msgs = ((InternalEObject)newPRA12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRACONTENT__PRA12, null, msgs);
			msgs = basicSetPRA12(newPRA12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRACONTENT__PRA12, newPRA12, newPRA12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PRACONTENT__ANY);
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
			case V2xmlPackage.PRACONTENT__PRA1:
				return basicSetPRA1(null, msgs);
			case V2xmlPackage.PRACONTENT__PRA2:
				return ((InternalEList<?>)getPRA2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA3:
				return ((InternalEList<?>)getPRA3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA4:
				return basicSetPRA4(null, msgs);
			case V2xmlPackage.PRACONTENT__PRA5:
				return ((InternalEList<?>)getPRA5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA6:
				return ((InternalEList<?>)getPRA6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA7:
				return ((InternalEList<?>)getPRA7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA8:
				return basicSetPRA8(null, msgs);
			case V2xmlPackage.PRACONTENT__PRA9:
				return basicSetPRA9(null, msgs);
			case V2xmlPackage.PRACONTENT__PRA10:
				return basicSetPRA10(null, msgs);
			case V2xmlPackage.PRACONTENT__PRA11:
				return ((InternalEList<?>)getPRA11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRACONTENT__PRA12:
				return basicSetPRA12(null, msgs);
			case V2xmlPackage.PRACONTENT__ANY:
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
			case V2xmlPackage.PRACONTENT__PRA1:
				return getPRA1();
			case V2xmlPackage.PRACONTENT__PRA2:
				return getPRA2();
			case V2xmlPackage.PRACONTENT__PRA3:
				return getPRA3();
			case V2xmlPackage.PRACONTENT__PRA4:
				return getPRA4();
			case V2xmlPackage.PRACONTENT__PRA5:
				return getPRA5();
			case V2xmlPackage.PRACONTENT__PRA6:
				return getPRA6();
			case V2xmlPackage.PRACONTENT__PRA7:
				return getPRA7();
			case V2xmlPackage.PRACONTENT__PRA8:
				return getPRA8();
			case V2xmlPackage.PRACONTENT__PRA9:
				return getPRA9();
			case V2xmlPackage.PRACONTENT__PRA10:
				return getPRA10();
			case V2xmlPackage.PRACONTENT__PRA11:
				return getPRA11();
			case V2xmlPackage.PRACONTENT__PRA12:
				return getPRA12();
			case V2xmlPackage.PRACONTENT__ANY:
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
			case V2xmlPackage.PRACONTENT__PRA1:
				setPRA1((PRA1CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA2:
				getPRA2().clear();
				getPRA2().addAll((Collection<? extends PRA2CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA3:
				getPRA3().clear();
				getPRA3().addAll((Collection<? extends PRA3CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA4:
				setPRA4((PRA4CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA5:
				getPRA5().clear();
				getPRA5().addAll((Collection<? extends PRA5CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA6:
				getPRA6().clear();
				getPRA6().addAll((Collection<? extends PRA6CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA7:
				getPRA7().clear();
				getPRA7().addAll((Collection<? extends PRA7CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA8:
				setPRA8((PRA8CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA9:
				setPRA9((PRA9CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA10:
				setPRA10((PRA10CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA11:
				getPRA11().clear();
				getPRA11().addAll((Collection<? extends PRA11CONTENT>)newValue);
				return;
			case V2xmlPackage.PRACONTENT__PRA12:
				setPRA12((PRA12CONTENT)newValue);
				return;
			case V2xmlPackage.PRACONTENT__ANY:
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
			case V2xmlPackage.PRACONTENT__PRA1:
				setPRA1((PRA1CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__PRA2:
				getPRA2().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA3:
				getPRA3().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA4:
				setPRA4((PRA4CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__PRA5:
				getPRA5().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA6:
				getPRA6().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA7:
				getPRA7().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA8:
				setPRA8((PRA8CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__PRA9:
				setPRA9((PRA9CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__PRA10:
				setPRA10((PRA10CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__PRA11:
				getPRA11().clear();
				return;
			case V2xmlPackage.PRACONTENT__PRA12:
				setPRA12((PRA12CONTENT)null);
				return;
			case V2xmlPackage.PRACONTENT__ANY:
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
			case V2xmlPackage.PRACONTENT__PRA1:
				return pRA1 != null;
			case V2xmlPackage.PRACONTENT__PRA2:
				return pRA2 != null && !pRA2.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA3:
				return pRA3 != null && !pRA3.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA4:
				return pRA4 != null;
			case V2xmlPackage.PRACONTENT__PRA5:
				return pRA5 != null && !pRA5.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA6:
				return pRA6 != null && !pRA6.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA7:
				return pRA7 != null && !pRA7.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA8:
				return pRA8 != null;
			case V2xmlPackage.PRACONTENT__PRA9:
				return pRA9 != null;
			case V2xmlPackage.PRACONTENT__PRA10:
				return pRA10 != null;
			case V2xmlPackage.PRACONTENT__PRA11:
				return pRA11 != null && !pRA11.isEmpty();
			case V2xmlPackage.PRACONTENT__PRA12:
				return pRA12 != null;
			case V2xmlPackage.PRACONTENT__ANY:
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

} //PRACONTENTImpl
