/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PRL;
import org.hl7.v2xml.PRL1CONTENT;
import org.hl7.v2xml.PRL2CONTENT;
import org.hl7.v2xml.PRL3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PRLImpl#getPRL1 <em>PRL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRLImpl#getPRL2 <em>PRL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRLImpl#getPRL3 <em>PRL3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRLImpl extends EObjectImpl implements PRL {
	/**
	 * The cached value of the '{@link #getPRL1() <em>PRL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRL1()
	 * @generated
	 * @ordered
	 */
	protected PRL1CONTENT pRL1;

	/**
	 * The cached value of the '{@link #getPRL2() <em>PRL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRL2()
	 * @generated
	 * @ordered
	 */
	protected PRL2CONTENT pRL2;

	/**
	 * The cached value of the '{@link #getPRL3() <em>PRL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRL3()
	 * @generated
	 * @ordered
	 */
	protected PRL3CONTENT pRL3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPRL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRL1CONTENT getPRL1() {
		return pRL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRL1(PRL1CONTENT newPRL1, NotificationChain msgs) {
		PRL1CONTENT oldPRL1 = pRL1;
		pRL1 = newPRL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL1, oldPRL1, newPRL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRL1(PRL1CONTENT newPRL1) {
		if (newPRL1 != pRL1) {
			NotificationChain msgs = null;
			if (pRL1 != null)
				msgs = ((InternalEObject)pRL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL1, null, msgs);
			if (newPRL1 != null)
				msgs = ((InternalEObject)newPRL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL1, null, msgs);
			msgs = basicSetPRL1(newPRL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL1, newPRL1, newPRL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRL2CONTENT getPRL2() {
		return pRL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRL2(PRL2CONTENT newPRL2, NotificationChain msgs) {
		PRL2CONTENT oldPRL2 = pRL2;
		pRL2 = newPRL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL2, oldPRL2, newPRL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRL2(PRL2CONTENT newPRL2) {
		if (newPRL2 != pRL2) {
			NotificationChain msgs = null;
			if (pRL2 != null)
				msgs = ((InternalEObject)pRL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL2, null, msgs);
			if (newPRL2 != null)
				msgs = ((InternalEObject)newPRL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL2, null, msgs);
			msgs = basicSetPRL2(newPRL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL2, newPRL2, newPRL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRL3CONTENT getPRL3() {
		return pRL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRL3(PRL3CONTENT newPRL3, NotificationChain msgs) {
		PRL3CONTENT oldPRL3 = pRL3;
		pRL3 = newPRL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL3, oldPRL3, newPRL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRL3(PRL3CONTENT newPRL3) {
		if (newPRL3 != pRL3) {
			NotificationChain msgs = null;
			if (pRL3 != null)
				msgs = ((InternalEObject)pRL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL3, null, msgs);
			if (newPRL3 != null)
				msgs = ((InternalEObject)newPRL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRL__PRL3, null, msgs);
			msgs = basicSetPRL3(newPRL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRL__PRL3, newPRL3, newPRL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PRL__PRL1:
				return basicSetPRL1(null, msgs);
			case V2xmlPackage.PRL__PRL2:
				return basicSetPRL2(null, msgs);
			case V2xmlPackage.PRL__PRL3:
				return basicSetPRL3(null, msgs);
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
			case V2xmlPackage.PRL__PRL1:
				return getPRL1();
			case V2xmlPackage.PRL__PRL2:
				return getPRL2();
			case V2xmlPackage.PRL__PRL3:
				return getPRL3();
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
			case V2xmlPackage.PRL__PRL1:
				setPRL1((PRL1CONTENT)newValue);
				return;
			case V2xmlPackage.PRL__PRL2:
				setPRL2((PRL2CONTENT)newValue);
				return;
			case V2xmlPackage.PRL__PRL3:
				setPRL3((PRL3CONTENT)newValue);
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
			case V2xmlPackage.PRL__PRL1:
				setPRL1((PRL1CONTENT)null);
				return;
			case V2xmlPackage.PRL__PRL2:
				setPRL2((PRL2CONTENT)null);
				return;
			case V2xmlPackage.PRL__PRL3:
				setPRL3((PRL3CONTENT)null);
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
			case V2xmlPackage.PRL__PRL1:
				return pRL1 != null;
			case V2xmlPackage.PRL__PRL2:
				return pRL2 != null;
			case V2xmlPackage.PRL__PRL3:
				return pRL3 != null;
		}
		return super.eIsSet(featureID);
	}

} //PRLImpl
