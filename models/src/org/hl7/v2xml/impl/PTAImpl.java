/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PTA;
import org.hl7.v2xml.PTA1CONTENT;
import org.hl7.v2xml.PTA2CONTENT;
import org.hl7.v2xml.PTA3CONTENT;
import org.hl7.v2xml.PTA4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PTAImpl#getPTA1 <em>PTA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTAImpl#getPTA2 <em>PTA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTAImpl#getPTA3 <em>PTA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTAImpl#getPTA4 <em>PTA4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTAImpl extends EObjectImpl implements PTA {
	/**
	 * The cached value of the '{@link #getPTA1() <em>PTA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTA1()
	 * @generated
	 * @ordered
	 */
	protected PTA1CONTENT pTA1;

	/**
	 * The cached value of the '{@link #getPTA2() <em>PTA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTA2()
	 * @generated
	 * @ordered
	 */
	protected PTA2CONTENT pTA2;

	/**
	 * The cached value of the '{@link #getPTA3() <em>PTA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTA3()
	 * @generated
	 * @ordered
	 */
	protected PTA3CONTENT pTA3;

	/**
	 * The cached value of the '{@link #getPTA4() <em>PTA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTA4()
	 * @generated
	 * @ordered
	 */
	protected PTA4CONTENT pTA4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPTA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTA1CONTENT getPTA1() {
		return pTA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTA1(PTA1CONTENT newPTA1, NotificationChain msgs) {
		PTA1CONTENT oldPTA1 = pTA1;
		pTA1 = newPTA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA1, oldPTA1, newPTA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTA1(PTA1CONTENT newPTA1) {
		if (newPTA1 != pTA1) {
			NotificationChain msgs = null;
			if (pTA1 != null)
				msgs = ((InternalEObject)pTA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA1, null, msgs);
			if (newPTA1 != null)
				msgs = ((InternalEObject)newPTA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA1, null, msgs);
			msgs = basicSetPTA1(newPTA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA1, newPTA1, newPTA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTA2CONTENT getPTA2() {
		return pTA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTA2(PTA2CONTENT newPTA2, NotificationChain msgs) {
		PTA2CONTENT oldPTA2 = pTA2;
		pTA2 = newPTA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA2, oldPTA2, newPTA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTA2(PTA2CONTENT newPTA2) {
		if (newPTA2 != pTA2) {
			NotificationChain msgs = null;
			if (pTA2 != null)
				msgs = ((InternalEObject)pTA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA2, null, msgs);
			if (newPTA2 != null)
				msgs = ((InternalEObject)newPTA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA2, null, msgs);
			msgs = basicSetPTA2(newPTA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA2, newPTA2, newPTA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTA3CONTENT getPTA3() {
		return pTA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTA3(PTA3CONTENT newPTA3, NotificationChain msgs) {
		PTA3CONTENT oldPTA3 = pTA3;
		pTA3 = newPTA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA3, oldPTA3, newPTA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTA3(PTA3CONTENT newPTA3) {
		if (newPTA3 != pTA3) {
			NotificationChain msgs = null;
			if (pTA3 != null)
				msgs = ((InternalEObject)pTA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA3, null, msgs);
			if (newPTA3 != null)
				msgs = ((InternalEObject)newPTA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA3, null, msgs);
			msgs = basicSetPTA3(newPTA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA3, newPTA3, newPTA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTA4CONTENT getPTA4() {
		return pTA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTA4(PTA4CONTENT newPTA4, NotificationChain msgs) {
		PTA4CONTENT oldPTA4 = pTA4;
		pTA4 = newPTA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA4, oldPTA4, newPTA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTA4(PTA4CONTENT newPTA4) {
		if (newPTA4 != pTA4) {
			NotificationChain msgs = null;
			if (pTA4 != null)
				msgs = ((InternalEObject)pTA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA4, null, msgs);
			if (newPTA4 != null)
				msgs = ((InternalEObject)newPTA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTA__PTA4, null, msgs);
			msgs = basicSetPTA4(newPTA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTA__PTA4, newPTA4, newPTA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PTA__PTA1:
				return basicSetPTA1(null, msgs);
			case V2xmlPackage.PTA__PTA2:
				return basicSetPTA2(null, msgs);
			case V2xmlPackage.PTA__PTA3:
				return basicSetPTA3(null, msgs);
			case V2xmlPackage.PTA__PTA4:
				return basicSetPTA4(null, msgs);
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
			case V2xmlPackage.PTA__PTA1:
				return getPTA1();
			case V2xmlPackage.PTA__PTA2:
				return getPTA2();
			case V2xmlPackage.PTA__PTA3:
				return getPTA3();
			case V2xmlPackage.PTA__PTA4:
				return getPTA4();
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
			case V2xmlPackage.PTA__PTA1:
				setPTA1((PTA1CONTENT)newValue);
				return;
			case V2xmlPackage.PTA__PTA2:
				setPTA2((PTA2CONTENT)newValue);
				return;
			case V2xmlPackage.PTA__PTA3:
				setPTA3((PTA3CONTENT)newValue);
				return;
			case V2xmlPackage.PTA__PTA4:
				setPTA4((PTA4CONTENT)newValue);
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
			case V2xmlPackage.PTA__PTA1:
				setPTA1((PTA1CONTENT)null);
				return;
			case V2xmlPackage.PTA__PTA2:
				setPTA2((PTA2CONTENT)null);
				return;
			case V2xmlPackage.PTA__PTA3:
				setPTA3((PTA3CONTENT)null);
				return;
			case V2xmlPackage.PTA__PTA4:
				setPTA4((PTA4CONTENT)null);
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
			case V2xmlPackage.PTA__PTA1:
				return pTA1 != null;
			case V2xmlPackage.PTA__PTA2:
				return pTA2 != null;
			case V2xmlPackage.PTA__PTA3:
				return pTA3 != null;
			case V2xmlPackage.PTA__PTA4:
				return pTA4 != null;
		}
		return super.eIsSet(featureID);
	}

} //PTAImpl
