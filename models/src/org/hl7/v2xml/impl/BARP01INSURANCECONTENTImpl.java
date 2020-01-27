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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.BARP01INSURANCECONTENT;
import org.hl7.v2xml.IN1CONTENT;
import org.hl7.v2xml.IN2CONTENT;
import org.hl7.v2xml.IN3CONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BARP01INSURANCECONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BARP01INSURANCECONTENTImpl#getIN1 <em>IN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01INSURANCECONTENTImpl#getIN2 <em>IN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01INSURANCECONTENTImpl#getIN3 <em>IN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01INSURANCECONTENTImpl#getROL <em>ROL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BARP01INSURANCECONTENTImpl extends EObjectImpl implements BARP01INSURANCECONTENT {
	/**
	 * The cached value of the '{@link #getIN1() <em>IN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN1()
	 * @generated
	 * @ordered
	 */
	protected IN1CONTENT iN1;

	/**
	 * The cached value of the '{@link #getIN2() <em>IN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN2()
	 * @generated
	 * @ordered
	 */
	protected IN2CONTENT iN2;

	/**
	 * The cached value of the '{@link #getIN3() <em>IN3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN3()
	 * @generated
	 * @ordered
	 */
	protected EList<IN3CONTENT> iN3;

	/**
	 * The cached value of the '{@link #getROL() <em>ROL</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL()
	 * @generated
	 * @ordered
	 */
	protected EList<ROLCONTENT> rOL;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BARP01INSURANCECONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBARP01INSURANCECONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN1CONTENT getIN1() {
		return iN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN1(IN1CONTENT newIN1, NotificationChain msgs) {
		IN1CONTENT oldIN1 = iN1;
		iN1 = newIN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01INSURANCECONTENT__IN1, oldIN1, newIN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN1(IN1CONTENT newIN1) {
		if (newIN1 != iN1) {
			NotificationChain msgs = null;
			if (iN1 != null)
				msgs = ((InternalEObject)iN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01INSURANCECONTENT__IN1, null, msgs);
			if (newIN1 != null)
				msgs = ((InternalEObject)newIN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01INSURANCECONTENT__IN1, null, msgs);
			msgs = basicSetIN1(newIN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01INSURANCECONTENT__IN1, newIN1, newIN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN2CONTENT getIN2() {
		return iN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN2(IN2CONTENT newIN2, NotificationChain msgs) {
		IN2CONTENT oldIN2 = iN2;
		iN2 = newIN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01INSURANCECONTENT__IN2, oldIN2, newIN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN2(IN2CONTENT newIN2) {
		if (newIN2 != iN2) {
			NotificationChain msgs = null;
			if (iN2 != null)
				msgs = ((InternalEObject)iN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01INSURANCECONTENT__IN2, null, msgs);
			if (newIN2 != null)
				msgs = ((InternalEObject)newIN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01INSURANCECONTENT__IN2, null, msgs);
			msgs = basicSetIN2(newIN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01INSURANCECONTENT__IN2, newIN2, newIN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN3CONTENT> getIN3() {
		if (iN3 == null) {
			iN3 = new EObjectContainmentEList<IN3CONTENT>(IN3CONTENT.class, this, V2xmlPackage.BARP01INSURANCECONTENT__IN3);
		}
		return iN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROLCONTENT> getROL() {
		if (rOL == null) {
			rOL = new EObjectContainmentEList<ROLCONTENT>(ROLCONTENT.class, this, V2xmlPackage.BARP01INSURANCECONTENT__ROL);
		}
		return rOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.BARP01INSURANCECONTENT__IN1:
				return basicSetIN1(null, msgs);
			case V2xmlPackage.BARP01INSURANCECONTENT__IN2:
				return basicSetIN2(null, msgs);
			case V2xmlPackage.BARP01INSURANCECONTENT__IN3:
				return ((InternalEList<?>)getIN3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01INSURANCECONTENT__ROL:
				return ((InternalEList<?>)getROL()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.BARP01INSURANCECONTENT__IN1:
				return getIN1();
			case V2xmlPackage.BARP01INSURANCECONTENT__IN2:
				return getIN2();
			case V2xmlPackage.BARP01INSURANCECONTENT__IN3:
				return getIN3();
			case V2xmlPackage.BARP01INSURANCECONTENT__ROL:
				return getROL();
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
			case V2xmlPackage.BARP01INSURANCECONTENT__IN1:
				setIN1((IN1CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN2:
				setIN2((IN2CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN3:
				getIN3().clear();
				getIN3().addAll((Collection<? extends IN3CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__ROL:
				getROL().clear();
				getROL().addAll((Collection<? extends ROLCONTENT>)newValue);
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
			case V2xmlPackage.BARP01INSURANCECONTENT__IN1:
				setIN1((IN1CONTENT)null);
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN2:
				setIN2((IN2CONTENT)null);
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN3:
				getIN3().clear();
				return;
			case V2xmlPackage.BARP01INSURANCECONTENT__ROL:
				getROL().clear();
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
			case V2xmlPackage.BARP01INSURANCECONTENT__IN1:
				return iN1 != null;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN2:
				return iN2 != null;
			case V2xmlPackage.BARP01INSURANCECONTENT__IN3:
				return iN3 != null && !iN3.isEmpty();
			case V2xmlPackage.BARP01INSURANCECONTENT__ROL:
				return rOL != null && !rOL.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BARP01INSURANCECONTENTImpl
