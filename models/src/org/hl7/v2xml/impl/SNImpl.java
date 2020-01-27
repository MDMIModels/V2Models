/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SN;
import org.hl7.v2xml.SN1CONTENT;
import org.hl7.v2xml.SN2CONTENT;
import org.hl7.v2xml.SN3CONTENT;
import org.hl7.v2xml.SN4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SNImpl#getSN1 <em>SN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SNImpl#getSN2 <em>SN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SNImpl#getSN3 <em>SN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SNImpl#getSN4 <em>SN4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SNImpl extends EObjectImpl implements SN {
	/**
	 * The cached value of the '{@link #getSN1() <em>SN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSN1()
	 * @generated
	 * @ordered
	 */
	protected SN1CONTENT sN1;

	/**
	 * The cached value of the '{@link #getSN2() <em>SN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSN2()
	 * @generated
	 * @ordered
	 */
	protected SN2CONTENT sN2;

	/**
	 * The cached value of the '{@link #getSN3() <em>SN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSN3()
	 * @generated
	 * @ordered
	 */
	protected SN3CONTENT sN3;

	/**
	 * The cached value of the '{@link #getSN4() <em>SN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSN4()
	 * @generated
	 * @ordered
	 */
	protected SN4CONTENT sN4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN1CONTENT getSN1() {
		return sN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSN1(SN1CONTENT newSN1, NotificationChain msgs) {
		SN1CONTENT oldSN1 = sN1;
		sN1 = newSN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN1, oldSN1, newSN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSN1(SN1CONTENT newSN1) {
		if (newSN1 != sN1) {
			NotificationChain msgs = null;
			if (sN1 != null)
				msgs = ((InternalEObject)sN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN1, null, msgs);
			if (newSN1 != null)
				msgs = ((InternalEObject)newSN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN1, null, msgs);
			msgs = basicSetSN1(newSN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN1, newSN1, newSN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN2CONTENT getSN2() {
		return sN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSN2(SN2CONTENT newSN2, NotificationChain msgs) {
		SN2CONTENT oldSN2 = sN2;
		sN2 = newSN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN2, oldSN2, newSN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSN2(SN2CONTENT newSN2) {
		if (newSN2 != sN2) {
			NotificationChain msgs = null;
			if (sN2 != null)
				msgs = ((InternalEObject)sN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN2, null, msgs);
			if (newSN2 != null)
				msgs = ((InternalEObject)newSN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN2, null, msgs);
			msgs = basicSetSN2(newSN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN2, newSN2, newSN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN3CONTENT getSN3() {
		return sN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSN3(SN3CONTENT newSN3, NotificationChain msgs) {
		SN3CONTENT oldSN3 = sN3;
		sN3 = newSN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN3, oldSN3, newSN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSN3(SN3CONTENT newSN3) {
		if (newSN3 != sN3) {
			NotificationChain msgs = null;
			if (sN3 != null)
				msgs = ((InternalEObject)sN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN3, null, msgs);
			if (newSN3 != null)
				msgs = ((InternalEObject)newSN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN3, null, msgs);
			msgs = basicSetSN3(newSN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN3, newSN3, newSN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SN4CONTENT getSN4() {
		return sN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSN4(SN4CONTENT newSN4, NotificationChain msgs) {
		SN4CONTENT oldSN4 = sN4;
		sN4 = newSN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN4, oldSN4, newSN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSN4(SN4CONTENT newSN4) {
		if (newSN4 != sN4) {
			NotificationChain msgs = null;
			if (sN4 != null)
				msgs = ((InternalEObject)sN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN4, null, msgs);
			if (newSN4 != null)
				msgs = ((InternalEObject)newSN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SN__SN4, null, msgs);
			msgs = basicSetSN4(newSN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SN__SN4, newSN4, newSN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SN__SN1:
				return basicSetSN1(null, msgs);
			case V2xmlPackage.SN__SN2:
				return basicSetSN2(null, msgs);
			case V2xmlPackage.SN__SN3:
				return basicSetSN3(null, msgs);
			case V2xmlPackage.SN__SN4:
				return basicSetSN4(null, msgs);
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
			case V2xmlPackage.SN__SN1:
				return getSN1();
			case V2xmlPackage.SN__SN2:
				return getSN2();
			case V2xmlPackage.SN__SN3:
				return getSN3();
			case V2xmlPackage.SN__SN4:
				return getSN4();
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
			case V2xmlPackage.SN__SN1:
				setSN1((SN1CONTENT)newValue);
				return;
			case V2xmlPackage.SN__SN2:
				setSN2((SN2CONTENT)newValue);
				return;
			case V2xmlPackage.SN__SN3:
				setSN3((SN3CONTENT)newValue);
				return;
			case V2xmlPackage.SN__SN4:
				setSN4((SN4CONTENT)newValue);
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
			case V2xmlPackage.SN__SN1:
				setSN1((SN1CONTENT)null);
				return;
			case V2xmlPackage.SN__SN2:
				setSN2((SN2CONTENT)null);
				return;
			case V2xmlPackage.SN__SN3:
				setSN3((SN3CONTENT)null);
				return;
			case V2xmlPackage.SN__SN4:
				setSN4((SN4CONTENT)null);
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
			case V2xmlPackage.SN__SN1:
				return sN1 != null;
			case V2xmlPackage.SN__SN2:
				return sN2 != null;
			case V2xmlPackage.SN__SN3:
				return sN3 != null;
			case V2xmlPackage.SN__SN4:
				return sN4 != null;
		}
		return super.eIsSet(featureID);
	}

} //SNImpl
