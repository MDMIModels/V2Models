/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SPD;
import org.hl7.v2xml.SPD1CONTENT;
import org.hl7.v2xml.SPD2CONTENT;
import org.hl7.v2xml.SPD3CONTENT;
import org.hl7.v2xml.SPD4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SPDImpl#getSPD1 <em>SPD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPDImpl#getSPD2 <em>SPD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPDImpl#getSPD3 <em>SPD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPDImpl#getSPD4 <em>SPD4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPDImpl extends EObjectImpl implements SPD {
	/**
	 * The cached value of the '{@link #getSPD1() <em>SPD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPD1()
	 * @generated
	 * @ordered
	 */
	protected SPD1CONTENT sPD1;

	/**
	 * The cached value of the '{@link #getSPD2() <em>SPD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPD2()
	 * @generated
	 * @ordered
	 */
	protected SPD2CONTENT sPD2;

	/**
	 * The cached value of the '{@link #getSPD3() <em>SPD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPD3()
	 * @generated
	 * @ordered
	 */
	protected SPD3CONTENT sPD3;

	/**
	 * The cached value of the '{@link #getSPD4() <em>SPD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPD4()
	 * @generated
	 * @ordered
	 */
	protected SPD4CONTENT sPD4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSPD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD1CONTENT getSPD1() {
		return sPD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPD1(SPD1CONTENT newSPD1, NotificationChain msgs) {
		SPD1CONTENT oldSPD1 = sPD1;
		sPD1 = newSPD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD1, oldSPD1, newSPD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPD1(SPD1CONTENT newSPD1) {
		if (newSPD1 != sPD1) {
			NotificationChain msgs = null;
			if (sPD1 != null)
				msgs = ((InternalEObject)sPD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD1, null, msgs);
			if (newSPD1 != null)
				msgs = ((InternalEObject)newSPD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD1, null, msgs);
			msgs = basicSetSPD1(newSPD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD1, newSPD1, newSPD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD2CONTENT getSPD2() {
		return sPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPD2(SPD2CONTENT newSPD2, NotificationChain msgs) {
		SPD2CONTENT oldSPD2 = sPD2;
		sPD2 = newSPD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD2, oldSPD2, newSPD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPD2(SPD2CONTENT newSPD2) {
		if (newSPD2 != sPD2) {
			NotificationChain msgs = null;
			if (sPD2 != null)
				msgs = ((InternalEObject)sPD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD2, null, msgs);
			if (newSPD2 != null)
				msgs = ((InternalEObject)newSPD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD2, null, msgs);
			msgs = basicSetSPD2(newSPD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD2, newSPD2, newSPD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD3CONTENT getSPD3() {
		return sPD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPD3(SPD3CONTENT newSPD3, NotificationChain msgs) {
		SPD3CONTENT oldSPD3 = sPD3;
		sPD3 = newSPD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD3, oldSPD3, newSPD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPD3(SPD3CONTENT newSPD3) {
		if (newSPD3 != sPD3) {
			NotificationChain msgs = null;
			if (sPD3 != null)
				msgs = ((InternalEObject)sPD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD3, null, msgs);
			if (newSPD3 != null)
				msgs = ((InternalEObject)newSPD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD3, null, msgs);
			msgs = basicSetSPD3(newSPD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD3, newSPD3, newSPD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPD4CONTENT getSPD4() {
		return sPD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPD4(SPD4CONTENT newSPD4, NotificationChain msgs) {
		SPD4CONTENT oldSPD4 = sPD4;
		sPD4 = newSPD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD4, oldSPD4, newSPD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPD4(SPD4CONTENT newSPD4) {
		if (newSPD4 != sPD4) {
			NotificationChain msgs = null;
			if (sPD4 != null)
				msgs = ((InternalEObject)sPD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD4, null, msgs);
			if (newSPD4 != null)
				msgs = ((InternalEObject)newSPD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPD__SPD4, null, msgs);
			msgs = basicSetSPD4(newSPD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPD__SPD4, newSPD4, newSPD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SPD__SPD1:
				return basicSetSPD1(null, msgs);
			case V2xmlPackage.SPD__SPD2:
				return basicSetSPD2(null, msgs);
			case V2xmlPackage.SPD__SPD3:
				return basicSetSPD3(null, msgs);
			case V2xmlPackage.SPD__SPD4:
				return basicSetSPD4(null, msgs);
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
			case V2xmlPackage.SPD__SPD1:
				return getSPD1();
			case V2xmlPackage.SPD__SPD2:
				return getSPD2();
			case V2xmlPackage.SPD__SPD3:
				return getSPD3();
			case V2xmlPackage.SPD__SPD4:
				return getSPD4();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.SPD__SPD1:
				setSPD1((SPD1CONTENT)newValue);
				return;
			case V2xmlPackage.SPD__SPD2:
				setSPD2((SPD2CONTENT)newValue);
				return;
			case V2xmlPackage.SPD__SPD3:
				setSPD3((SPD3CONTENT)newValue);
				return;
			case V2xmlPackage.SPD__SPD4:
				setSPD4((SPD4CONTENT)newValue);
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
			case V2xmlPackage.SPD__SPD1:
				setSPD1((SPD1CONTENT)null);
				return;
			case V2xmlPackage.SPD__SPD2:
				setSPD2((SPD2CONTENT)null);
				return;
			case V2xmlPackage.SPD__SPD3:
				setSPD3((SPD3CONTENT)null);
				return;
			case V2xmlPackage.SPD__SPD4:
				setSPD4((SPD4CONTENT)null);
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
			case V2xmlPackage.SPD__SPD1:
				return sPD1 != null;
			case V2xmlPackage.SPD__SPD2:
				return sPD2 != null;
			case V2xmlPackage.SPD__SPD3:
				return sPD3 != null;
			case V2xmlPackage.SPD__SPD4:
				return sPD4 != null;
		}
		return super.eIsSet(featureID);
	}

} //SPDImpl
