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

import org.hl7.v2xml.BARP01PROCEDURECONTENT;
import org.hl7.v2xml.PR1CONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BARP01PROCEDURECONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BARP01PROCEDURECONTENTImpl#getPR1 <em>PR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01PROCEDURECONTENTImpl#getROL <em>ROL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BARP01PROCEDURECONTENTImpl extends EObjectImpl implements BARP01PROCEDURECONTENT {
	/**
	 * The cached value of the '{@link #getPR1() <em>PR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR1()
	 * @generated
	 * @ordered
	 */
	protected PR1CONTENT pR1;

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
	protected BARP01PROCEDURECONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBARP01PROCEDURECONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR1CONTENT getPR1() {
		return pR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR1(PR1CONTENT newPR1, NotificationChain msgs) {
		PR1CONTENT oldPR1 = pR1;
		pR1 = newPR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01PROCEDURECONTENT__PR1, oldPR1, newPR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR1(PR1CONTENT newPR1) {
		if (newPR1 != pR1) {
			NotificationChain msgs = null;
			if (pR1 != null)
				msgs = ((InternalEObject)pR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01PROCEDURECONTENT__PR1, null, msgs);
			if (newPR1 != null)
				msgs = ((InternalEObject)newPR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01PROCEDURECONTENT__PR1, null, msgs);
			msgs = basicSetPR1(newPR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01PROCEDURECONTENT__PR1, newPR1, newPR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROLCONTENT> getROL() {
		if (rOL == null) {
			rOL = new EObjectContainmentEList<ROLCONTENT>(ROLCONTENT.class, this, V2xmlPackage.BARP01PROCEDURECONTENT__ROL);
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
			case V2xmlPackage.BARP01PROCEDURECONTENT__PR1:
				return basicSetPR1(null, msgs);
			case V2xmlPackage.BARP01PROCEDURECONTENT__ROL:
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
			case V2xmlPackage.BARP01PROCEDURECONTENT__PR1:
				return getPR1();
			case V2xmlPackage.BARP01PROCEDURECONTENT__ROL:
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
			case V2xmlPackage.BARP01PROCEDURECONTENT__PR1:
				setPR1((PR1CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01PROCEDURECONTENT__ROL:
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
			case V2xmlPackage.BARP01PROCEDURECONTENT__PR1:
				setPR1((PR1CONTENT)null);
				return;
			case V2xmlPackage.BARP01PROCEDURECONTENT__ROL:
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
			case V2xmlPackage.BARP01PROCEDURECONTENT__PR1:
				return pR1 != null;
			case V2xmlPackage.BARP01PROCEDURECONTENT__ROL:
				return rOL != null && !rOL.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BARP01PROCEDURECONTENTImpl
