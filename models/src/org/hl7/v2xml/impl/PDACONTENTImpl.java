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

import org.hl7.v2xml.PDA1CONTENT;
import org.hl7.v2xml.PDA2CONTENT;
import org.hl7.v2xml.PDA3CONTENT;
import org.hl7.v2xml.PDA4CONTENT;
import org.hl7.v2xml.PDA5CONTENT;
import org.hl7.v2xml.PDA6CONTENT;
import org.hl7.v2xml.PDA7CONTENT;
import org.hl7.v2xml.PDA8CONTENT;
import org.hl7.v2xml.PDA9CONTENT;
import org.hl7.v2xml.PDACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA1 <em>PDA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA2 <em>PDA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA3 <em>PDA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA4 <em>PDA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA5 <em>PDA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA6 <em>PDA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA7 <em>PDA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA8 <em>PDA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getPDA9 <em>PDA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDACONTENTImpl extends EObjectImpl implements PDACONTENT {
	/**
	 * The cached value of the '{@link #getPDA1() <em>PDA1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA1()
	 * @generated
	 * @ordered
	 */
	protected EList<PDA1CONTENT> pDA1;

	/**
	 * The cached value of the '{@link #getPDA2() <em>PDA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA2()
	 * @generated
	 * @ordered
	 */
	protected PDA2CONTENT pDA2;

	/**
	 * The cached value of the '{@link #getPDA3() <em>PDA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA3()
	 * @generated
	 * @ordered
	 */
	protected PDA3CONTENT pDA3;

	/**
	 * The cached value of the '{@link #getPDA4() <em>PDA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA4()
	 * @generated
	 * @ordered
	 */
	protected PDA4CONTENT pDA4;

	/**
	 * The cached value of the '{@link #getPDA5() <em>PDA5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA5()
	 * @generated
	 * @ordered
	 */
	protected PDA5CONTENT pDA5;

	/**
	 * The cached value of the '{@link #getPDA6() <em>PDA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA6()
	 * @generated
	 * @ordered
	 */
	protected PDA6CONTENT pDA6;

	/**
	 * The cached value of the '{@link #getPDA7() <em>PDA7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA7()
	 * @generated
	 * @ordered
	 */
	protected PDA7CONTENT pDA7;

	/**
	 * The cached value of the '{@link #getPDA8() <em>PDA8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA8()
	 * @generated
	 * @ordered
	 */
	protected PDA8CONTENT pDA8;

	/**
	 * The cached value of the '{@link #getPDA9() <em>PDA9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDA9()
	 * @generated
	 * @ordered
	 */
	protected PDA9CONTENT pDA9;

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
	protected PDACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPDACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDA1CONTENT> getPDA1() {
		if (pDA1 == null) {
			pDA1 = new EObjectContainmentEList<PDA1CONTENT>(PDA1CONTENT.class, this, V2xmlPackage.PDACONTENT__PDA1);
		}
		return pDA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA2CONTENT getPDA2() {
		return pDA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA2(PDA2CONTENT newPDA2, NotificationChain msgs) {
		PDA2CONTENT oldPDA2 = pDA2;
		pDA2 = newPDA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA2, oldPDA2, newPDA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA2(PDA2CONTENT newPDA2) {
		if (newPDA2 != pDA2) {
			NotificationChain msgs = null;
			if (pDA2 != null)
				msgs = ((InternalEObject)pDA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA2, null, msgs);
			if (newPDA2 != null)
				msgs = ((InternalEObject)newPDA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA2, null, msgs);
			msgs = basicSetPDA2(newPDA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA2, newPDA2, newPDA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA3CONTENT getPDA3() {
		return pDA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA3(PDA3CONTENT newPDA3, NotificationChain msgs) {
		PDA3CONTENT oldPDA3 = pDA3;
		pDA3 = newPDA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA3, oldPDA3, newPDA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA3(PDA3CONTENT newPDA3) {
		if (newPDA3 != pDA3) {
			NotificationChain msgs = null;
			if (pDA3 != null)
				msgs = ((InternalEObject)pDA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA3, null, msgs);
			if (newPDA3 != null)
				msgs = ((InternalEObject)newPDA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA3, null, msgs);
			msgs = basicSetPDA3(newPDA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA3, newPDA3, newPDA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA4CONTENT getPDA4() {
		return pDA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA4(PDA4CONTENT newPDA4, NotificationChain msgs) {
		PDA4CONTENT oldPDA4 = pDA4;
		pDA4 = newPDA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA4, oldPDA4, newPDA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA4(PDA4CONTENT newPDA4) {
		if (newPDA4 != pDA4) {
			NotificationChain msgs = null;
			if (pDA4 != null)
				msgs = ((InternalEObject)pDA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA4, null, msgs);
			if (newPDA4 != null)
				msgs = ((InternalEObject)newPDA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA4, null, msgs);
			msgs = basicSetPDA4(newPDA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA4, newPDA4, newPDA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA5CONTENT getPDA5() {
		return pDA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA5(PDA5CONTENT newPDA5, NotificationChain msgs) {
		PDA5CONTENT oldPDA5 = pDA5;
		pDA5 = newPDA5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA5, oldPDA5, newPDA5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA5(PDA5CONTENT newPDA5) {
		if (newPDA5 != pDA5) {
			NotificationChain msgs = null;
			if (pDA5 != null)
				msgs = ((InternalEObject)pDA5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA5, null, msgs);
			if (newPDA5 != null)
				msgs = ((InternalEObject)newPDA5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA5, null, msgs);
			msgs = basicSetPDA5(newPDA5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA5, newPDA5, newPDA5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA6CONTENT getPDA6() {
		return pDA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA6(PDA6CONTENT newPDA6, NotificationChain msgs) {
		PDA6CONTENT oldPDA6 = pDA6;
		pDA6 = newPDA6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA6, oldPDA6, newPDA6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA6(PDA6CONTENT newPDA6) {
		if (newPDA6 != pDA6) {
			NotificationChain msgs = null;
			if (pDA6 != null)
				msgs = ((InternalEObject)pDA6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA6, null, msgs);
			if (newPDA6 != null)
				msgs = ((InternalEObject)newPDA6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA6, null, msgs);
			msgs = basicSetPDA6(newPDA6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA6, newPDA6, newPDA6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA7CONTENT getPDA7() {
		return pDA7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA7(PDA7CONTENT newPDA7, NotificationChain msgs) {
		PDA7CONTENT oldPDA7 = pDA7;
		pDA7 = newPDA7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA7, oldPDA7, newPDA7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA7(PDA7CONTENT newPDA7) {
		if (newPDA7 != pDA7) {
			NotificationChain msgs = null;
			if (pDA7 != null)
				msgs = ((InternalEObject)pDA7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA7, null, msgs);
			if (newPDA7 != null)
				msgs = ((InternalEObject)newPDA7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA7, null, msgs);
			msgs = basicSetPDA7(newPDA7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA7, newPDA7, newPDA7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA8CONTENT getPDA8() {
		return pDA8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA8(PDA8CONTENT newPDA8, NotificationChain msgs) {
		PDA8CONTENT oldPDA8 = pDA8;
		pDA8 = newPDA8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA8, oldPDA8, newPDA8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA8(PDA8CONTENT newPDA8) {
		if (newPDA8 != pDA8) {
			NotificationChain msgs = null;
			if (pDA8 != null)
				msgs = ((InternalEObject)pDA8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA8, null, msgs);
			if (newPDA8 != null)
				msgs = ((InternalEObject)newPDA8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA8, null, msgs);
			msgs = basicSetPDA8(newPDA8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA8, newPDA8, newPDA8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDA9CONTENT getPDA9() {
		return pDA9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDA9(PDA9CONTENT newPDA9, NotificationChain msgs) {
		PDA9CONTENT oldPDA9 = pDA9;
		pDA9 = newPDA9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA9, oldPDA9, newPDA9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDA9(PDA9CONTENT newPDA9) {
		if (newPDA9 != pDA9) {
			NotificationChain msgs = null;
			if (pDA9 != null)
				msgs = ((InternalEObject)pDA9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA9, null, msgs);
			if (newPDA9 != null)
				msgs = ((InternalEObject)newPDA9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDACONTENT__PDA9, null, msgs);
			msgs = basicSetPDA9(newPDA9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDACONTENT__PDA9, newPDA9, newPDA9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PDACONTENT__ANY);
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
			case V2xmlPackage.PDACONTENT__PDA1:
				return ((InternalEList<?>)getPDA1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PDACONTENT__PDA2:
				return basicSetPDA2(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA3:
				return basicSetPDA3(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA4:
				return basicSetPDA4(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA5:
				return basicSetPDA5(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA6:
				return basicSetPDA6(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA7:
				return basicSetPDA7(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA8:
				return basicSetPDA8(null, msgs);
			case V2xmlPackage.PDACONTENT__PDA9:
				return basicSetPDA9(null, msgs);
			case V2xmlPackage.PDACONTENT__ANY:
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
			case V2xmlPackage.PDACONTENT__PDA1:
				return getPDA1();
			case V2xmlPackage.PDACONTENT__PDA2:
				return getPDA2();
			case V2xmlPackage.PDACONTENT__PDA3:
				return getPDA3();
			case V2xmlPackage.PDACONTENT__PDA4:
				return getPDA4();
			case V2xmlPackage.PDACONTENT__PDA5:
				return getPDA5();
			case V2xmlPackage.PDACONTENT__PDA6:
				return getPDA6();
			case V2xmlPackage.PDACONTENT__PDA7:
				return getPDA7();
			case V2xmlPackage.PDACONTENT__PDA8:
				return getPDA8();
			case V2xmlPackage.PDACONTENT__PDA9:
				return getPDA9();
			case V2xmlPackage.PDACONTENT__ANY:
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
			case V2xmlPackage.PDACONTENT__PDA1:
				getPDA1().clear();
				getPDA1().addAll((Collection<? extends PDA1CONTENT>)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA2:
				setPDA2((PDA2CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA3:
				setPDA3((PDA3CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA4:
				setPDA4((PDA4CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA5:
				setPDA5((PDA5CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA6:
				setPDA6((PDA6CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA7:
				setPDA7((PDA7CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA8:
				setPDA8((PDA8CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__PDA9:
				setPDA9((PDA9CONTENT)newValue);
				return;
			case V2xmlPackage.PDACONTENT__ANY:
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
			case V2xmlPackage.PDACONTENT__PDA1:
				getPDA1().clear();
				return;
			case V2xmlPackage.PDACONTENT__PDA2:
				setPDA2((PDA2CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA3:
				setPDA3((PDA3CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA4:
				setPDA4((PDA4CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA5:
				setPDA5((PDA5CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA6:
				setPDA6((PDA6CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA7:
				setPDA7((PDA7CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA8:
				setPDA8((PDA8CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__PDA9:
				setPDA9((PDA9CONTENT)null);
				return;
			case V2xmlPackage.PDACONTENT__ANY:
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
			case V2xmlPackage.PDACONTENT__PDA1:
				return pDA1 != null && !pDA1.isEmpty();
			case V2xmlPackage.PDACONTENT__PDA2:
				return pDA2 != null;
			case V2xmlPackage.PDACONTENT__PDA3:
				return pDA3 != null;
			case V2xmlPackage.PDACONTENT__PDA4:
				return pDA4 != null;
			case V2xmlPackage.PDACONTENT__PDA5:
				return pDA5 != null;
			case V2xmlPackage.PDACONTENT__PDA6:
				return pDA6 != null;
			case V2xmlPackage.PDACONTENT__PDA7:
				return pDA7 != null;
			case V2xmlPackage.PDACONTENT__PDA8:
				return pDA8 != null;
			case V2xmlPackage.PDACONTENT__PDA9:
				return pDA9 != null;
			case V2xmlPackage.PDACONTENT__ANY:
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

} //PDACONTENTImpl
