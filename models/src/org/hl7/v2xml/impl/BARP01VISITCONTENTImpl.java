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

import org.hl7.v2xml.ACCCONTENT;
import org.hl7.v2xml.AL1CONTENT;
import org.hl7.v2xml.BARP01INSURANCECONTENT;
import org.hl7.v2xml.BARP01PROCEDURECONTENT;
import org.hl7.v2xml.BARP01VISITCONTENT;
import org.hl7.v2xml.DB1CONTENT;
import org.hl7.v2xml.DG1CONTENT;
import org.hl7.v2xml.DRGCONTENT;
import org.hl7.v2xml.GT1CONTENT;
import org.hl7.v2xml.NK1CONTENT;
import org.hl7.v2xml.OBXCONTENT;
import org.hl7.v2xml.PV1CONTENT;
import org.hl7.v2xml.PV2CONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.UB1CONTENT;
import org.hl7.v2xml.UB2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BARP01VISITCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getPV1 <em>PV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getPV2 <em>PV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getROL <em>ROL</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getDB1 <em>DB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getOBX <em>OBX</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getAL1 <em>AL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getDG1 <em>DG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getDRG <em>DRG</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getBARP01PROCEDURE <em>BARP01PROCEDURE</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getGT1 <em>GT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getNK1 <em>NK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getBARP01INSURANCE <em>BARP01INSURANCE</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getACC <em>ACC</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getUB1 <em>UB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BARP01VISITCONTENTImpl#getUB2 <em>UB2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BARP01VISITCONTENTImpl extends EObjectImpl implements BARP01VISITCONTENT {
	/**
	 * The cached value of the '{@link #getPV1() <em>PV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV1()
	 * @generated
	 * @ordered
	 */
	protected PV1CONTENT pV1;

	/**
	 * The cached value of the '{@link #getPV2() <em>PV2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV2()
	 * @generated
	 * @ordered
	 */
	protected PV2CONTENT pV2;

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
	 * The cached value of the '{@link #getDB1() <em>DB1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB1()
	 * @generated
	 * @ordered
	 */
	protected EList<DB1CONTENT> dB1;

	/**
	 * The cached value of the '{@link #getOBX() <em>OBX</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX()
	 * @generated
	 * @ordered
	 */
	protected EList<OBXCONTENT> oBX;

	/**
	 * The cached value of the '{@link #getAL1() <em>AL1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAL1()
	 * @generated
	 * @ordered
	 */
	protected EList<AL1CONTENT> aL1;

	/**
	 * The cached value of the '{@link #getDG1() <em>DG1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDG1()
	 * @generated
	 * @ordered
	 */
	protected EList<DG1CONTENT> dG1;

	/**
	 * The cached value of the '{@link #getDRG() <em>DRG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG()
	 * @generated
	 * @ordered
	 */
	protected DRGCONTENT dRG;

	/**
	 * The cached value of the '{@link #getBARP01PROCEDURE() <em>BARP01PROCEDURE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBARP01PROCEDURE()
	 * @generated
	 * @ordered
	 */
	protected EList<BARP01PROCEDURECONTENT> bARP01PROCEDURE;

	/**
	 * The cached value of the '{@link #getGT1() <em>GT1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT1()
	 * @generated
	 * @ordered
	 */
	protected EList<GT1CONTENT> gT1;

	/**
	 * The cached value of the '{@link #getNK1() <em>NK1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK1()
	 * @generated
	 * @ordered
	 */
	protected EList<NK1CONTENT> nK1;

	/**
	 * The cached value of the '{@link #getBARP01INSURANCE() <em>BARP01INSURANCE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBARP01INSURANCE()
	 * @generated
	 * @ordered
	 */
	protected EList<BARP01INSURANCECONTENT> bARP01INSURANCE;

	/**
	 * The cached value of the '{@link #getACC() <em>ACC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC()
	 * @generated
	 * @ordered
	 */
	protected ACCCONTENT aCC;

	/**
	 * The cached value of the '{@link #getUB1() <em>UB1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB1()
	 * @generated
	 * @ordered
	 */
	protected UB1CONTENT uB1;

	/**
	 * The cached value of the '{@link #getUB2() <em>UB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB2()
	 * @generated
	 * @ordered
	 */
	protected UB2CONTENT uB2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BARP01VISITCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBARP01VISITCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV1CONTENT getPV1() {
		return pV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV1(PV1CONTENT newPV1, NotificationChain msgs) {
		PV1CONTENT oldPV1 = pV1;
		pV1 = newPV1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__PV1, oldPV1, newPV1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV1(PV1CONTENT newPV1) {
		if (newPV1 != pV1) {
			NotificationChain msgs = null;
			if (pV1 != null)
				msgs = ((InternalEObject)pV1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__PV1, null, msgs);
			if (newPV1 != null)
				msgs = ((InternalEObject)newPV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__PV1, null, msgs);
			msgs = basicSetPV1(newPV1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__PV1, newPV1, newPV1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV2CONTENT getPV2() {
		return pV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV2(PV2CONTENT newPV2, NotificationChain msgs) {
		PV2CONTENT oldPV2 = pV2;
		pV2 = newPV2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__PV2, oldPV2, newPV2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV2(PV2CONTENT newPV2) {
		if (newPV2 != pV2) {
			NotificationChain msgs = null;
			if (pV2 != null)
				msgs = ((InternalEObject)pV2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__PV2, null, msgs);
			if (newPV2 != null)
				msgs = ((InternalEObject)newPV2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__PV2, null, msgs);
			msgs = basicSetPV2(newPV2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__PV2, newPV2, newPV2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROLCONTENT> getROL() {
		if (rOL == null) {
			rOL = new EObjectContainmentEList<ROLCONTENT>(ROLCONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__ROL);
		}
		return rOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DB1CONTENT> getDB1() {
		if (dB1 == null) {
			dB1 = new EObjectContainmentEList<DB1CONTENT>(DB1CONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__DB1);
		}
		return dB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBXCONTENT> getOBX() {
		if (oBX == null) {
			oBX = new EObjectContainmentEList<OBXCONTENT>(OBXCONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__OBX);
		}
		return oBX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AL1CONTENT> getAL1() {
		if (aL1 == null) {
			aL1 = new EObjectContainmentEList<AL1CONTENT>(AL1CONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__AL1);
		}
		return aL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DG1CONTENT> getDG1() {
		if (dG1 == null) {
			dG1 = new EObjectContainmentEList<DG1CONTENT>(DG1CONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__DG1);
		}
		return dG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRGCONTENT getDRG() {
		return dRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG(DRGCONTENT newDRG, NotificationChain msgs) {
		DRGCONTENT oldDRG = dRG;
		dRG = newDRG;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__DRG, oldDRG, newDRG);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG(DRGCONTENT newDRG) {
		if (newDRG != dRG) {
			NotificationChain msgs = null;
			if (dRG != null)
				msgs = ((InternalEObject)dRG).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__DRG, null, msgs);
			if (newDRG != null)
				msgs = ((InternalEObject)newDRG).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__DRG, null, msgs);
			msgs = basicSetDRG(newDRG, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__DRG, newDRG, newDRG));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BARP01PROCEDURECONTENT> getBARP01PROCEDURE() {
		if (bARP01PROCEDURE == null) {
			bARP01PROCEDURE = new EObjectContainmentEList<BARP01PROCEDURECONTENT>(BARP01PROCEDURECONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE);
		}
		return bARP01PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT1CONTENT> getGT1() {
		if (gT1 == null) {
			gT1 = new EObjectContainmentEList<GT1CONTENT>(GT1CONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__GT1);
		}
		return gT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK1CONTENT> getNK1() {
		if (nK1 == null) {
			nK1 = new EObjectContainmentEList<NK1CONTENT>(NK1CONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__NK1);
		}
		return nK1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BARP01INSURANCECONTENT> getBARP01INSURANCE() {
		if (bARP01INSURANCE == null) {
			bARP01INSURANCE = new EObjectContainmentEList<BARP01INSURANCECONTENT>(BARP01INSURANCECONTENT.class, this, V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE);
		}
		return bARP01INSURANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCCONTENT getACC() {
		return aCC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC(ACCCONTENT newACC, NotificationChain msgs) {
		ACCCONTENT oldACC = aCC;
		aCC = newACC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__ACC, oldACC, newACC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC(ACCCONTENT newACC) {
		if (newACC != aCC) {
			NotificationChain msgs = null;
			if (aCC != null)
				msgs = ((InternalEObject)aCC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__ACC, null, msgs);
			if (newACC != null)
				msgs = ((InternalEObject)newACC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__ACC, null, msgs);
			msgs = basicSetACC(newACC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__ACC, newACC, newACC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB1CONTENT getUB1() {
		return uB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB1(UB1CONTENT newUB1, NotificationChain msgs) {
		UB1CONTENT oldUB1 = uB1;
		uB1 = newUB1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__UB1, oldUB1, newUB1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB1(UB1CONTENT newUB1) {
		if (newUB1 != uB1) {
			NotificationChain msgs = null;
			if (uB1 != null)
				msgs = ((InternalEObject)uB1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__UB1, null, msgs);
			if (newUB1 != null)
				msgs = ((InternalEObject)newUB1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__UB1, null, msgs);
			msgs = basicSetUB1(newUB1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__UB1, newUB1, newUB1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB2CONTENT getUB2() {
		return uB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB2(UB2CONTENT newUB2, NotificationChain msgs) {
		UB2CONTENT oldUB2 = uB2;
		uB2 = newUB2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__UB2, oldUB2, newUB2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB2(UB2CONTENT newUB2) {
		if (newUB2 != uB2) {
			NotificationChain msgs = null;
			if (uB2 != null)
				msgs = ((InternalEObject)uB2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__UB2, null, msgs);
			if (newUB2 != null)
				msgs = ((InternalEObject)newUB2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BARP01VISITCONTENT__UB2, null, msgs);
			msgs = basicSetUB2(newUB2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BARP01VISITCONTENT__UB2, newUB2, newUB2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.BARP01VISITCONTENT__PV1:
				return basicSetPV1(null, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__PV2:
				return basicSetPV2(null, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__ROL:
				return ((InternalEList<?>)getROL()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__DB1:
				return ((InternalEList<?>)getDB1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__OBX:
				return ((InternalEList<?>)getOBX()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__AL1:
				return ((InternalEList<?>)getAL1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__DG1:
				return ((InternalEList<?>)getDG1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__DRG:
				return basicSetDRG(null, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE:
				return ((InternalEList<?>)getBARP01PROCEDURE()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__GT1:
				return ((InternalEList<?>)getGT1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__NK1:
				return ((InternalEList<?>)getNK1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE:
				return ((InternalEList<?>)getBARP01INSURANCE()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__ACC:
				return basicSetACC(null, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__UB1:
				return basicSetUB1(null, msgs);
			case V2xmlPackage.BARP01VISITCONTENT__UB2:
				return basicSetUB2(null, msgs);
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
			case V2xmlPackage.BARP01VISITCONTENT__PV1:
				return getPV1();
			case V2xmlPackage.BARP01VISITCONTENT__PV2:
				return getPV2();
			case V2xmlPackage.BARP01VISITCONTENT__ROL:
				return getROL();
			case V2xmlPackage.BARP01VISITCONTENT__DB1:
				return getDB1();
			case V2xmlPackage.BARP01VISITCONTENT__OBX:
				return getOBX();
			case V2xmlPackage.BARP01VISITCONTENT__AL1:
				return getAL1();
			case V2xmlPackage.BARP01VISITCONTENT__DG1:
				return getDG1();
			case V2xmlPackage.BARP01VISITCONTENT__DRG:
				return getDRG();
			case V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE:
				return getBARP01PROCEDURE();
			case V2xmlPackage.BARP01VISITCONTENT__GT1:
				return getGT1();
			case V2xmlPackage.BARP01VISITCONTENT__NK1:
				return getNK1();
			case V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE:
				return getBARP01INSURANCE();
			case V2xmlPackage.BARP01VISITCONTENT__ACC:
				return getACC();
			case V2xmlPackage.BARP01VISITCONTENT__UB1:
				return getUB1();
			case V2xmlPackage.BARP01VISITCONTENT__UB2:
				return getUB2();
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
			case V2xmlPackage.BARP01VISITCONTENT__PV1:
				setPV1((PV1CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__PV2:
				setPV2((PV2CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__ROL:
				getROL().clear();
				getROL().addAll((Collection<? extends ROLCONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DB1:
				getDB1().clear();
				getDB1().addAll((Collection<? extends DB1CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__OBX:
				getOBX().clear();
				getOBX().addAll((Collection<? extends OBXCONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__AL1:
				getAL1().clear();
				getAL1().addAll((Collection<? extends AL1CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DG1:
				getDG1().clear();
				getDG1().addAll((Collection<? extends DG1CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DRG:
				setDRG((DRGCONTENT)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE:
				getBARP01PROCEDURE().clear();
				getBARP01PROCEDURE().addAll((Collection<? extends BARP01PROCEDURECONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__GT1:
				getGT1().clear();
				getGT1().addAll((Collection<? extends GT1CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__NK1:
				getNK1().clear();
				getNK1().addAll((Collection<? extends NK1CONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE:
				getBARP01INSURANCE().clear();
				getBARP01INSURANCE().addAll((Collection<? extends BARP01INSURANCECONTENT>)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__ACC:
				setACC((ACCCONTENT)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__UB1:
				setUB1((UB1CONTENT)newValue);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__UB2:
				setUB2((UB2CONTENT)newValue);
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
			case V2xmlPackage.BARP01VISITCONTENT__PV1:
				setPV1((PV1CONTENT)null);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__PV2:
				setPV2((PV2CONTENT)null);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__ROL:
				getROL().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DB1:
				getDB1().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__OBX:
				getOBX().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__AL1:
				getAL1().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DG1:
				getDG1().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__DRG:
				setDRG((DRGCONTENT)null);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE:
				getBARP01PROCEDURE().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__GT1:
				getGT1().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__NK1:
				getNK1().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE:
				getBARP01INSURANCE().clear();
				return;
			case V2xmlPackage.BARP01VISITCONTENT__ACC:
				setACC((ACCCONTENT)null);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__UB1:
				setUB1((UB1CONTENT)null);
				return;
			case V2xmlPackage.BARP01VISITCONTENT__UB2:
				setUB2((UB2CONTENT)null);
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
			case V2xmlPackage.BARP01VISITCONTENT__PV1:
				return pV1 != null;
			case V2xmlPackage.BARP01VISITCONTENT__PV2:
				return pV2 != null;
			case V2xmlPackage.BARP01VISITCONTENT__ROL:
				return rOL != null && !rOL.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__DB1:
				return dB1 != null && !dB1.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__OBX:
				return oBX != null && !oBX.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__AL1:
				return aL1 != null && !aL1.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__DG1:
				return dG1 != null && !dG1.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__DRG:
				return dRG != null;
			case V2xmlPackage.BARP01VISITCONTENT__BARP01PROCEDURE:
				return bARP01PROCEDURE != null && !bARP01PROCEDURE.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__GT1:
				return gT1 != null && !gT1.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__NK1:
				return nK1 != null && !nK1.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__BARP01INSURANCE:
				return bARP01INSURANCE != null && !bARP01INSURANCE.isEmpty();
			case V2xmlPackage.BARP01VISITCONTENT__ACC:
				return aCC != null;
			case V2xmlPackage.BARP01VISITCONTENT__UB1:
				return uB1 != null;
			case V2xmlPackage.BARP01VISITCONTENT__UB2:
				return uB2 != null;
		}
		return super.eIsSet(featureID);
	}

} //BARP01VISITCONTENTImpl
