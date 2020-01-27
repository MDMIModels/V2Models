/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RMC;
import org.hl7.v2xml.RMC1CONTENT;
import org.hl7.v2xml.RMC2CONTENT;
import org.hl7.v2xml.RMC3CONTENT;
import org.hl7.v2xml.RMC4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RMC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RMCImpl#getRMC1 <em>RMC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMCImpl#getRMC2 <em>RMC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMCImpl#getRMC3 <em>RMC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMCImpl#getRMC4 <em>RMC4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RMCImpl extends EObjectImpl implements RMC {
	/**
	 * The cached value of the '{@link #getRMC1() <em>RMC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMC1()
	 * @generated
	 * @ordered
	 */
	protected RMC1CONTENT rMC1;

	/**
	 * The cached value of the '{@link #getRMC2() <em>RMC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMC2()
	 * @generated
	 * @ordered
	 */
	protected RMC2CONTENT rMC2;

	/**
	 * The cached value of the '{@link #getRMC3() <em>RMC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMC3()
	 * @generated
	 * @ordered
	 */
	protected RMC3CONTENT rMC3;

	/**
	 * The cached value of the '{@link #getRMC4() <em>RMC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMC4()
	 * @generated
	 * @ordered
	 */
	protected RMC4CONTENT rMC4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RMCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRMC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMC1CONTENT getRMC1() {
		return rMC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMC1(RMC1CONTENT newRMC1, NotificationChain msgs) {
		RMC1CONTENT oldRMC1 = rMC1;
		rMC1 = newRMC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC1, oldRMC1, newRMC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMC1(RMC1CONTENT newRMC1) {
		if (newRMC1 != rMC1) {
			NotificationChain msgs = null;
			if (rMC1 != null)
				msgs = ((InternalEObject)rMC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC1, null, msgs);
			if (newRMC1 != null)
				msgs = ((InternalEObject)newRMC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC1, null, msgs);
			msgs = basicSetRMC1(newRMC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC1, newRMC1, newRMC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMC2CONTENT getRMC2() {
		return rMC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMC2(RMC2CONTENT newRMC2, NotificationChain msgs) {
		RMC2CONTENT oldRMC2 = rMC2;
		rMC2 = newRMC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC2, oldRMC2, newRMC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMC2(RMC2CONTENT newRMC2) {
		if (newRMC2 != rMC2) {
			NotificationChain msgs = null;
			if (rMC2 != null)
				msgs = ((InternalEObject)rMC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC2, null, msgs);
			if (newRMC2 != null)
				msgs = ((InternalEObject)newRMC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC2, null, msgs);
			msgs = basicSetRMC2(newRMC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC2, newRMC2, newRMC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMC3CONTENT getRMC3() {
		return rMC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMC3(RMC3CONTENT newRMC3, NotificationChain msgs) {
		RMC3CONTENT oldRMC3 = rMC3;
		rMC3 = newRMC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC3, oldRMC3, newRMC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMC3(RMC3CONTENT newRMC3) {
		if (newRMC3 != rMC3) {
			NotificationChain msgs = null;
			if (rMC3 != null)
				msgs = ((InternalEObject)rMC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC3, null, msgs);
			if (newRMC3 != null)
				msgs = ((InternalEObject)newRMC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC3, null, msgs);
			msgs = basicSetRMC3(newRMC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC3, newRMC3, newRMC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMC4CONTENT getRMC4() {
		return rMC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMC4(RMC4CONTENT newRMC4, NotificationChain msgs) {
		RMC4CONTENT oldRMC4 = rMC4;
		rMC4 = newRMC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC4, oldRMC4, newRMC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMC4(RMC4CONTENT newRMC4) {
		if (newRMC4 != rMC4) {
			NotificationChain msgs = null;
			if (rMC4 != null)
				msgs = ((InternalEObject)rMC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC4, null, msgs);
			if (newRMC4 != null)
				msgs = ((InternalEObject)newRMC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMC__RMC4, null, msgs);
			msgs = basicSetRMC4(newRMC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMC__RMC4, newRMC4, newRMC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RMC__RMC1:
				return basicSetRMC1(null, msgs);
			case V2xmlPackage.RMC__RMC2:
				return basicSetRMC2(null, msgs);
			case V2xmlPackage.RMC__RMC3:
				return basicSetRMC3(null, msgs);
			case V2xmlPackage.RMC__RMC4:
				return basicSetRMC4(null, msgs);
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
			case V2xmlPackage.RMC__RMC1:
				return getRMC1();
			case V2xmlPackage.RMC__RMC2:
				return getRMC2();
			case V2xmlPackage.RMC__RMC3:
				return getRMC3();
			case V2xmlPackage.RMC__RMC4:
				return getRMC4();
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
			case V2xmlPackage.RMC__RMC1:
				setRMC1((RMC1CONTENT)newValue);
				return;
			case V2xmlPackage.RMC__RMC2:
				setRMC2((RMC2CONTENT)newValue);
				return;
			case V2xmlPackage.RMC__RMC3:
				setRMC3((RMC3CONTENT)newValue);
				return;
			case V2xmlPackage.RMC__RMC4:
				setRMC4((RMC4CONTENT)newValue);
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
			case V2xmlPackage.RMC__RMC1:
				setRMC1((RMC1CONTENT)null);
				return;
			case V2xmlPackage.RMC__RMC2:
				setRMC2((RMC2CONTENT)null);
				return;
			case V2xmlPackage.RMC__RMC3:
				setRMC3((RMC3CONTENT)null);
				return;
			case V2xmlPackage.RMC__RMC4:
				setRMC4((RMC4CONTENT)null);
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
			case V2xmlPackage.RMC__RMC1:
				return rMC1 != null;
			case V2xmlPackage.RMC__RMC2:
				return rMC2 != null;
			case V2xmlPackage.RMC__RMC3:
				return rMC3 != null;
			case V2xmlPackage.RMC__RMC4:
				return rMC4 != null;
		}
		return super.eIsSet(featureID);
	}

} //RMCImpl
