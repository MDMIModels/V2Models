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

import org.hl7.v2xml.BARP01CONTENT;
import org.hl7.v2xml.BARP01VISITCONTENT;
import org.hl7.v2xml.EVNCONTENT;
import org.hl7.v2xml.MSHCONTENT;
import org.hl7.v2xml.PD1CONTENT;
import org.hl7.v2xml.PIDCONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.SFTCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BARP01CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getMSH <em>MSH</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getSFT <em>SFT</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getEVN <em>EVN</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getPID <em>PID</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getPD1 <em>PD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01CONTENTImpl#getBARP01VISIT <em>BARP01VISIT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BARP01CONTENTImpl extends EObjectImpl implements BARP01CONTENT {
	/**
	 * The cached value of the '{@link #getMSH() <em>MSH</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH()
	 * @generated
	 * @ordered
	 */
	protected MSHCONTENT mSH;

	/**
	 * The cached value of the '{@link #getSFT() <em>SFT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSFT()
	 * @generated
	 * @ordered
	 */
	protected EList<SFTCONTENT> sFT;

	/**
	 * The cached value of the '{@link #getEVN() <em>EVN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN()
	 * @generated
	 * @ordered
	 */
	protected EVNCONTENT eVN;

	/**
	 * The cached value of the '{@link #getPID() <em>PID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID()
	 * @generated
	 * @ordered
	 */
	protected PIDCONTENT pID;

	/**
	 * The cached value of the '{@link #getPD1() <em>PD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPD1()
	 * @generated
	 * @ordered
	 */
	protected PD1CONTENT pD1;

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
	 * The cached value of the '{@link #getBARP01VISIT() <em>BARP01VISIT</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBARP01VISIT()
	 * @generated
	 * @ordered
	 */
	protected EList<BARP01VISITCONTENT> bARP01VISIT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BARP01CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBARP01CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSHCONTENT getMSH() {
		return mSH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH(MSHCONTENT newMSH, NotificationChain msgs) {
		MSHCONTENT oldMSH = mSH;
		mSH = newMSH;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__MSH, oldMSH, newMSH);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH(MSHCONTENT newMSH) {
		if (newMSH != mSH) {
			NotificationChain msgs = null;
			if (mSH != null)
				msgs = ((InternalEObject)mSH).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__MSH, null, msgs);
			if (newMSH != null)
				msgs = ((InternalEObject)newMSH).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__MSH, null, msgs);
			msgs = basicSetMSH(newMSH, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__MSH, newMSH, newMSH));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SFTCONTENT> getSFT() {
		if (sFT == null) {
			sFT = new EObjectContainmentEList<SFTCONTENT>(SFTCONTENT.class, this, V2xmlPackage.BARP01CONTENT__SFT);
		}
		return sFT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVNCONTENT getEVN() {
		return eVN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN(EVNCONTENT newEVN, NotificationChain msgs) {
		EVNCONTENT oldEVN = eVN;
		eVN = newEVN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__EVN, oldEVN, newEVN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN(EVNCONTENT newEVN) {
		if (newEVN != eVN) {
			NotificationChain msgs = null;
			if (eVN != null)
				msgs = ((InternalEObject)eVN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__EVN, null, msgs);
			if (newEVN != null)
				msgs = ((InternalEObject)newEVN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__EVN, null, msgs);
			msgs = basicSetEVN(newEVN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__EVN, newEVN, newEVN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIDCONTENT getPID() {
		return pID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID(PIDCONTENT newPID, NotificationChain msgs) {
		PIDCONTENT oldPID = pID;
		pID = newPID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__PID, oldPID, newPID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID(PIDCONTENT newPID) {
		if (newPID != pID) {
			NotificationChain msgs = null;
			if (pID != null)
				msgs = ((InternalEObject)pID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__PID, null, msgs);
			if (newPID != null)
				msgs = ((InternalEObject)newPID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__PID, null, msgs);
			msgs = basicSetPID(newPID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__PID, newPID, newPID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PD1CONTENT getPD1() {
		return pD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPD1(PD1CONTENT newPD1, NotificationChain msgs) {
		PD1CONTENT oldPD1 = pD1;
		pD1 = newPD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__PD1, oldPD1, newPD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPD1(PD1CONTENT newPD1) {
		if (newPD1 != pD1) {
			NotificationChain msgs = null;
			if (pD1 != null)
				msgs = ((InternalEObject)pD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__PD1, null, msgs);
			if (newPD1 != null)
				msgs = ((InternalEObject)newPD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01CONTENT__PD1, null, msgs);
			msgs = basicSetPD1(newPD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01CONTENT__PD1, newPD1, newPD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROLCONTENT> getROL() {
		if (rOL == null) {
			rOL = new EObjectContainmentEList<ROLCONTENT>(ROLCONTENT.class, this, V2xmlPackage.BARP01CONTENT__ROL);
		}
		return rOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BARP01VISITCONTENT> getBARP01VISIT() {
		if (bARP01VISIT == null) {
			bARP01VISIT = new EObjectContainmentEList<BARP01VISITCONTENT>(BARP01VISITCONTENT.class, this, V2xmlPackage.BARP01CONTENT__BARP01VISIT);
		}
		return bARP01VISIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.BARP01CONTENT__MSH:
				return basicSetMSH(null, msgs);
			case V2xmlPackage.BARP01CONTENT__SFT:
				return ((InternalEList<?>)getSFT()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01CONTENT__EVN:
				return basicSetEVN(null, msgs);
			case V2xmlPackage.BARP01CONTENT__PID:
				return basicSetPID(null, msgs);
			case V2xmlPackage.BARP01CONTENT__PD1:
				return basicSetPD1(null, msgs);
			case V2xmlPackage.BARP01CONTENT__ROL:
				return ((InternalEList<?>)getROL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01CONTENT__BARP01VISIT:
				return ((InternalEList<?>)getBARP01VISIT()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.BARP01CONTENT__MSH:
				return getMSH();
			case V2xmlPackage.BARP01CONTENT__SFT:
				return getSFT();
			case V2xmlPackage.BARP01CONTENT__EVN:
				return getEVN();
			case V2xmlPackage.BARP01CONTENT__PID:
				return getPID();
			case V2xmlPackage.BARP01CONTENT__PD1:
				return getPD1();
			case V2xmlPackage.BARP01CONTENT__ROL:
				return getROL();
			case V2xmlPackage.BARP01CONTENT__BARP01VISIT:
				return getBARP01VISIT();
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
			case V2xmlPackage.BARP01CONTENT__MSH:
				setMSH((MSHCONTENT)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__SFT:
				getSFT().clear();
				getSFT().addAll((Collection<? extends SFTCONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__EVN:
				setEVN((EVNCONTENT)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__PID:
				setPID((PIDCONTENT)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__PD1:
				setPD1((PD1CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__ROL:
				getROL().clear();
				getROL().addAll((Collection<? extends ROLCONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01CONTENT__BARP01VISIT:
				getBARP01VISIT().clear();
				getBARP01VISIT().addAll((Collection<? extends BARP01VISITCONTENT>)newValue);
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
			case V2xmlPackage.BARP01CONTENT__MSH:
				setMSH((MSHCONTENT)null);
				return;
			case V2xmlPackage.BARP01CONTENT__SFT:
				getSFT().clear();
				return;
			case V2xmlPackage.BARP01CONTENT__EVN:
				setEVN((EVNCONTENT)null);
				return;
			case V2xmlPackage.BARP01CONTENT__PID:
				setPID((PIDCONTENT)null);
				return;
			case V2xmlPackage.BARP01CONTENT__PD1:
				setPD1((PD1CONTENT)null);
				return;
			case V2xmlPackage.BARP01CONTENT__ROL:
				getROL().clear();
				return;
			case V2xmlPackage.BARP01CONTENT__BARP01VISIT:
				getBARP01VISIT().clear();
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
			case V2xmlPackage.BARP01CONTENT__MSH:
				return mSH != null;
			case V2xmlPackage.BARP01CONTENT__SFT:
				return sFT != null && !sFT.isEmpty();
			case V2xmlPackage.BARP01CONTENT__EVN:
				return eVN != null;
			case V2xmlPackage.BARP01CONTENT__PID:
				return pID != null;
			case V2xmlPackage.BARP01CONTENT__PD1:
				return pD1 != null;
			case V2xmlPackage.BARP01CONTENT__ROL:
				return rOL != null && !rOL.isEmpty();
			case V2xmlPackage.BARP01CONTENT__BARP01VISIT:
				return bARP01VISIT != null && !bARP01VISIT.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BARP01CONTENTImpl
