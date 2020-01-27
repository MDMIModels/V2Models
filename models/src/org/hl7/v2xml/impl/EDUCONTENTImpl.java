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

import org.hl7.v2xml.EDU1CONTENT;
import org.hl7.v2xml.EDU2CONTENT;
import org.hl7.v2xml.EDU3CONTENT;
import org.hl7.v2xml.EDU4CONTENT;
import org.hl7.v2xml.EDU5CONTENT;
import org.hl7.v2xml.EDU6CONTENT;
import org.hl7.v2xml.EDU7CONTENT;
import org.hl7.v2xml.EDU8CONTENT;
import org.hl7.v2xml.EDU9CONTENT;
import org.hl7.v2xml.EDUCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EDUCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU1 <em>EDU1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU2 <em>EDU2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU3 <em>EDU3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU4 <em>EDU4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU5 <em>EDU5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU6 <em>EDU6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU7 <em>EDU7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU8 <em>EDU8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getEDU9 <em>EDU9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDUCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDUCONTENTImpl extends EObjectImpl implements EDUCONTENT {
	/**
	 * The cached value of the '{@link #getEDU1() <em>EDU1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU1()
	 * @generated
	 * @ordered
	 */
	protected EDU1CONTENT eDU1;

	/**
	 * The cached value of the '{@link #getEDU2() <em>EDU2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU2()
	 * @generated
	 * @ordered
	 */
	protected EDU2CONTENT eDU2;

	/**
	 * The cached value of the '{@link #getEDU3() <em>EDU3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU3()
	 * @generated
	 * @ordered
	 */
	protected EDU3CONTENT eDU3;

	/**
	 * The cached value of the '{@link #getEDU4() <em>EDU4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU4()
	 * @generated
	 * @ordered
	 */
	protected EDU4CONTENT eDU4;

	/**
	 * The cached value of the '{@link #getEDU5() <em>EDU5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU5()
	 * @generated
	 * @ordered
	 */
	protected EDU5CONTENT eDU5;

	/**
	 * The cached value of the '{@link #getEDU6() <em>EDU6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU6()
	 * @generated
	 * @ordered
	 */
	protected EDU6CONTENT eDU6;

	/**
	 * The cached value of the '{@link #getEDU7() <em>EDU7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU7()
	 * @generated
	 * @ordered
	 */
	protected EDU7CONTENT eDU7;

	/**
	 * The cached value of the '{@link #getEDU8() <em>EDU8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU8()
	 * @generated
	 * @ordered
	 */
	protected EDU8CONTENT eDU8;

	/**
	 * The cached value of the '{@link #getEDU9() <em>EDU9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDU9()
	 * @generated
	 * @ordered
	 */
	protected EList<EDU9CONTENT> eDU9;

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
	protected EDUCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEDUCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU1CONTENT getEDU1() {
		return eDU1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU1(EDU1CONTENT newEDU1, NotificationChain msgs) {
		EDU1CONTENT oldEDU1 = eDU1;
		eDU1 = newEDU1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU1, oldEDU1, newEDU1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU1(EDU1CONTENT newEDU1) {
		if (newEDU1 != eDU1) {
			NotificationChain msgs = null;
			if (eDU1 != null)
				msgs = ((InternalEObject)eDU1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU1, null, msgs);
			if (newEDU1 != null)
				msgs = ((InternalEObject)newEDU1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU1, null, msgs);
			msgs = basicSetEDU1(newEDU1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU1, newEDU1, newEDU1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU2CONTENT getEDU2() {
		return eDU2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU2(EDU2CONTENT newEDU2, NotificationChain msgs) {
		EDU2CONTENT oldEDU2 = eDU2;
		eDU2 = newEDU2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU2, oldEDU2, newEDU2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU2(EDU2CONTENT newEDU2) {
		if (newEDU2 != eDU2) {
			NotificationChain msgs = null;
			if (eDU2 != null)
				msgs = ((InternalEObject)eDU2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU2, null, msgs);
			if (newEDU2 != null)
				msgs = ((InternalEObject)newEDU2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU2, null, msgs);
			msgs = basicSetEDU2(newEDU2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU2, newEDU2, newEDU2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU3CONTENT getEDU3() {
		return eDU3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU3(EDU3CONTENT newEDU3, NotificationChain msgs) {
		EDU3CONTENT oldEDU3 = eDU3;
		eDU3 = newEDU3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU3, oldEDU3, newEDU3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU3(EDU3CONTENT newEDU3) {
		if (newEDU3 != eDU3) {
			NotificationChain msgs = null;
			if (eDU3 != null)
				msgs = ((InternalEObject)eDU3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU3, null, msgs);
			if (newEDU3 != null)
				msgs = ((InternalEObject)newEDU3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU3, null, msgs);
			msgs = basicSetEDU3(newEDU3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU3, newEDU3, newEDU3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU4CONTENT getEDU4() {
		return eDU4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU4(EDU4CONTENT newEDU4, NotificationChain msgs) {
		EDU4CONTENT oldEDU4 = eDU4;
		eDU4 = newEDU4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU4, oldEDU4, newEDU4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU4(EDU4CONTENT newEDU4) {
		if (newEDU4 != eDU4) {
			NotificationChain msgs = null;
			if (eDU4 != null)
				msgs = ((InternalEObject)eDU4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU4, null, msgs);
			if (newEDU4 != null)
				msgs = ((InternalEObject)newEDU4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU4, null, msgs);
			msgs = basicSetEDU4(newEDU4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU4, newEDU4, newEDU4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU5CONTENT getEDU5() {
		return eDU5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU5(EDU5CONTENT newEDU5, NotificationChain msgs) {
		EDU5CONTENT oldEDU5 = eDU5;
		eDU5 = newEDU5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU5, oldEDU5, newEDU5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU5(EDU5CONTENT newEDU5) {
		if (newEDU5 != eDU5) {
			NotificationChain msgs = null;
			if (eDU5 != null)
				msgs = ((InternalEObject)eDU5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU5, null, msgs);
			if (newEDU5 != null)
				msgs = ((InternalEObject)newEDU5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU5, null, msgs);
			msgs = basicSetEDU5(newEDU5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU5, newEDU5, newEDU5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU6CONTENT getEDU6() {
		return eDU6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU6(EDU6CONTENT newEDU6, NotificationChain msgs) {
		EDU6CONTENT oldEDU6 = eDU6;
		eDU6 = newEDU6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU6, oldEDU6, newEDU6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU6(EDU6CONTENT newEDU6) {
		if (newEDU6 != eDU6) {
			NotificationChain msgs = null;
			if (eDU6 != null)
				msgs = ((InternalEObject)eDU6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU6, null, msgs);
			if (newEDU6 != null)
				msgs = ((InternalEObject)newEDU6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU6, null, msgs);
			msgs = basicSetEDU6(newEDU6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU6, newEDU6, newEDU6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU7CONTENT getEDU7() {
		return eDU7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU7(EDU7CONTENT newEDU7, NotificationChain msgs) {
		EDU7CONTENT oldEDU7 = eDU7;
		eDU7 = newEDU7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU7, oldEDU7, newEDU7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU7(EDU7CONTENT newEDU7) {
		if (newEDU7 != eDU7) {
			NotificationChain msgs = null;
			if (eDU7 != null)
				msgs = ((InternalEObject)eDU7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU7, null, msgs);
			if (newEDU7 != null)
				msgs = ((InternalEObject)newEDU7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU7, null, msgs);
			msgs = basicSetEDU7(newEDU7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU7, newEDU7, newEDU7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDU8CONTENT getEDU8() {
		return eDU8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDU8(EDU8CONTENT newEDU8, NotificationChain msgs) {
		EDU8CONTENT oldEDU8 = eDU8;
		eDU8 = newEDU8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU8, oldEDU8, newEDU8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDU8(EDU8CONTENT newEDU8) {
		if (newEDU8 != eDU8) {
			NotificationChain msgs = null;
			if (eDU8 != null)
				msgs = ((InternalEObject)eDU8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU8, null, msgs);
			if (newEDU8 != null)
				msgs = ((InternalEObject)newEDU8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EDUCONTENT__EDU8, null, msgs);
			msgs = basicSetEDU8(newEDU8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EDUCONTENT__EDU8, newEDU8, newEDU8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EDU9CONTENT> getEDU9() {
		if (eDU9 == null) {
			eDU9 = new EObjectContainmentEList<EDU9CONTENT>(EDU9CONTENT.class, this, V2xmlPackage.EDUCONTENT__EDU9);
		}
		return eDU9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.EDUCONTENT__ANY);
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
			case V2xmlPackage.EDUCONTENT__EDU1:
				return basicSetEDU1(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU2:
				return basicSetEDU2(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU3:
				return basicSetEDU3(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU4:
				return basicSetEDU4(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU5:
				return basicSetEDU5(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU6:
				return basicSetEDU6(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU7:
				return basicSetEDU7(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU8:
				return basicSetEDU8(null, msgs);
			case V2xmlPackage.EDUCONTENT__EDU9:
				return ((InternalEList<?>)getEDU9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.EDUCONTENT__ANY:
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
			case V2xmlPackage.EDUCONTENT__EDU1:
				return getEDU1();
			case V2xmlPackage.EDUCONTENT__EDU2:
				return getEDU2();
			case V2xmlPackage.EDUCONTENT__EDU3:
				return getEDU3();
			case V2xmlPackage.EDUCONTENT__EDU4:
				return getEDU4();
			case V2xmlPackage.EDUCONTENT__EDU5:
				return getEDU5();
			case V2xmlPackage.EDUCONTENT__EDU6:
				return getEDU6();
			case V2xmlPackage.EDUCONTENT__EDU7:
				return getEDU7();
			case V2xmlPackage.EDUCONTENT__EDU8:
				return getEDU8();
			case V2xmlPackage.EDUCONTENT__EDU9:
				return getEDU9();
			case V2xmlPackage.EDUCONTENT__ANY:
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
			case V2xmlPackage.EDUCONTENT__EDU1:
				setEDU1((EDU1CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU2:
				setEDU2((EDU2CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU3:
				setEDU3((EDU3CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU4:
				setEDU4((EDU4CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU5:
				setEDU5((EDU5CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU6:
				setEDU6((EDU6CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU7:
				setEDU7((EDU7CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU8:
				setEDU8((EDU8CONTENT)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__EDU9:
				getEDU9().clear();
				getEDU9().addAll((Collection<? extends EDU9CONTENT>)newValue);
				return;
			case V2xmlPackage.EDUCONTENT__ANY:
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
			case V2xmlPackage.EDUCONTENT__EDU1:
				setEDU1((EDU1CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU2:
				setEDU2((EDU2CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU3:
				setEDU3((EDU3CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU4:
				setEDU4((EDU4CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU5:
				setEDU5((EDU5CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU6:
				setEDU6((EDU6CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU7:
				setEDU7((EDU7CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU8:
				setEDU8((EDU8CONTENT)null);
				return;
			case V2xmlPackage.EDUCONTENT__EDU9:
				getEDU9().clear();
				return;
			case V2xmlPackage.EDUCONTENT__ANY:
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
			case V2xmlPackage.EDUCONTENT__EDU1:
				return eDU1 != null;
			case V2xmlPackage.EDUCONTENT__EDU2:
				return eDU2 != null;
			case V2xmlPackage.EDUCONTENT__EDU3:
				return eDU3 != null;
			case V2xmlPackage.EDUCONTENT__EDU4:
				return eDU4 != null;
			case V2xmlPackage.EDUCONTENT__EDU5:
				return eDU5 != null;
			case V2xmlPackage.EDUCONTENT__EDU6:
				return eDU6 != null;
			case V2xmlPackage.EDUCONTENT__EDU7:
				return eDU7 != null;
			case V2xmlPackage.EDUCONTENT__EDU8:
				return eDU8 != null;
			case V2xmlPackage.EDUCONTENT__EDU9:
				return eDU9 != null && !eDU9.isEmpty();
			case V2xmlPackage.EDUCONTENT__ANY:
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

} //EDUCONTENTImpl
