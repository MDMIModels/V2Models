/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PIP;
import org.hl7.v2xml.PIP1CONTENT;
import org.hl7.v2xml.PIP2CONTENT;
import org.hl7.v2xml.PIP3CONTENT;
import org.hl7.v2xml.PIP4CONTENT;
import org.hl7.v2xml.PIP5CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PIPImpl#getPIP1 <em>PIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIPImpl#getPIP2 <em>PIP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIPImpl#getPIP3 <em>PIP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIPImpl#getPIP4 <em>PIP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIPImpl#getPIP5 <em>PIP5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIPImpl extends EObjectImpl implements PIP {
	/**
	 * The cached value of the '{@link #getPIP1() <em>PIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPIP1()
	 * @generated
	 * @ordered
	 */
	protected PIP1CONTENT pIP1;

	/**
	 * The cached value of the '{@link #getPIP2() <em>PIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPIP2()
	 * @generated
	 * @ordered
	 */
	protected PIP2CONTENT pIP2;

	/**
	 * The cached value of the '{@link #getPIP3() <em>PIP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPIP3()
	 * @generated
	 * @ordered
	 */
	protected PIP3CONTENT pIP3;

	/**
	 * The cached value of the '{@link #getPIP4() <em>PIP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPIP4()
	 * @generated
	 * @ordered
	 */
	protected PIP4CONTENT pIP4;

	/**
	 * The cached value of the '{@link #getPIP5() <em>PIP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPIP5()
	 * @generated
	 * @ordered
	 */
	protected PIP5CONTENT pIP5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PIPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPIP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIP1CONTENT getPIP1() {
		return pIP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPIP1(PIP1CONTENT newPIP1, NotificationChain msgs) {
		PIP1CONTENT oldPIP1 = pIP1;
		pIP1 = newPIP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP1, oldPIP1, newPIP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIP1(PIP1CONTENT newPIP1) {
		if (newPIP1 != pIP1) {
			NotificationChain msgs = null;
			if (pIP1 != null)
				msgs = ((InternalEObject)pIP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP1, null, msgs);
			if (newPIP1 != null)
				msgs = ((InternalEObject)newPIP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP1, null, msgs);
			msgs = basicSetPIP1(newPIP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP1, newPIP1, newPIP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIP2CONTENT getPIP2() {
		return pIP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPIP2(PIP2CONTENT newPIP2, NotificationChain msgs) {
		PIP2CONTENT oldPIP2 = pIP2;
		pIP2 = newPIP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP2, oldPIP2, newPIP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIP2(PIP2CONTENT newPIP2) {
		if (newPIP2 != pIP2) {
			NotificationChain msgs = null;
			if (pIP2 != null)
				msgs = ((InternalEObject)pIP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP2, null, msgs);
			if (newPIP2 != null)
				msgs = ((InternalEObject)newPIP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP2, null, msgs);
			msgs = basicSetPIP2(newPIP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP2, newPIP2, newPIP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIP3CONTENT getPIP3() {
		return pIP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPIP3(PIP3CONTENT newPIP3, NotificationChain msgs) {
		PIP3CONTENT oldPIP3 = pIP3;
		pIP3 = newPIP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP3, oldPIP3, newPIP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIP3(PIP3CONTENT newPIP3) {
		if (newPIP3 != pIP3) {
			NotificationChain msgs = null;
			if (pIP3 != null)
				msgs = ((InternalEObject)pIP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP3, null, msgs);
			if (newPIP3 != null)
				msgs = ((InternalEObject)newPIP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP3, null, msgs);
			msgs = basicSetPIP3(newPIP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP3, newPIP3, newPIP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIP4CONTENT getPIP4() {
		return pIP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPIP4(PIP4CONTENT newPIP4, NotificationChain msgs) {
		PIP4CONTENT oldPIP4 = pIP4;
		pIP4 = newPIP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP4, oldPIP4, newPIP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIP4(PIP4CONTENT newPIP4) {
		if (newPIP4 != pIP4) {
			NotificationChain msgs = null;
			if (pIP4 != null)
				msgs = ((InternalEObject)pIP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP4, null, msgs);
			if (newPIP4 != null)
				msgs = ((InternalEObject)newPIP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP4, null, msgs);
			msgs = basicSetPIP4(newPIP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP4, newPIP4, newPIP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIP5CONTENT getPIP5() {
		return pIP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPIP5(PIP5CONTENT newPIP5, NotificationChain msgs) {
		PIP5CONTENT oldPIP5 = pIP5;
		pIP5 = newPIP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP5, oldPIP5, newPIP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPIP5(PIP5CONTENT newPIP5) {
		if (newPIP5 != pIP5) {
			NotificationChain msgs = null;
			if (pIP5 != null)
				msgs = ((InternalEObject)pIP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP5, null, msgs);
			if (newPIP5 != null)
				msgs = ((InternalEObject)newPIP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIP__PIP5, null, msgs);
			msgs = basicSetPIP5(newPIP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIP__PIP5, newPIP5, newPIP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PIP__PIP1:
				return basicSetPIP1(null, msgs);
			case V2xmlPackage.PIP__PIP2:
				return basicSetPIP2(null, msgs);
			case V2xmlPackage.PIP__PIP3:
				return basicSetPIP3(null, msgs);
			case V2xmlPackage.PIP__PIP4:
				return basicSetPIP4(null, msgs);
			case V2xmlPackage.PIP__PIP5:
				return basicSetPIP5(null, msgs);
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
			case V2xmlPackage.PIP__PIP1:
				return getPIP1();
			case V2xmlPackage.PIP__PIP2:
				return getPIP2();
			case V2xmlPackage.PIP__PIP3:
				return getPIP3();
			case V2xmlPackage.PIP__PIP4:
				return getPIP4();
			case V2xmlPackage.PIP__PIP5:
				return getPIP5();
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
			case V2xmlPackage.PIP__PIP1:
				setPIP1((PIP1CONTENT)newValue);
				return;
			case V2xmlPackage.PIP__PIP2:
				setPIP2((PIP2CONTENT)newValue);
				return;
			case V2xmlPackage.PIP__PIP3:
				setPIP3((PIP3CONTENT)newValue);
				return;
			case V2xmlPackage.PIP__PIP4:
				setPIP4((PIP4CONTENT)newValue);
				return;
			case V2xmlPackage.PIP__PIP5:
				setPIP5((PIP5CONTENT)newValue);
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
			case V2xmlPackage.PIP__PIP1:
				setPIP1((PIP1CONTENT)null);
				return;
			case V2xmlPackage.PIP__PIP2:
				setPIP2((PIP2CONTENT)null);
				return;
			case V2xmlPackage.PIP__PIP3:
				setPIP3((PIP3CONTENT)null);
				return;
			case V2xmlPackage.PIP__PIP4:
				setPIP4((PIP4CONTENT)null);
				return;
			case V2xmlPackage.PIP__PIP5:
				setPIP5((PIP5CONTENT)null);
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
			case V2xmlPackage.PIP__PIP1:
				return pIP1 != null;
			case V2xmlPackage.PIP__PIP2:
				return pIP2 != null;
			case V2xmlPackage.PIP__PIP3:
				return pIP3 != null;
			case V2xmlPackage.PIP__PIP4:
				return pIP4 != null;
			case V2xmlPackage.PIP__PIP5:
				return pIP5 != null;
		}
		return super.eIsSet(featureID);
	}

} //PIPImpl
