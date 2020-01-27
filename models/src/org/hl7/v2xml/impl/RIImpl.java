/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RI;
import org.hl7.v2xml.RI1CONTENT;
import org.hl7.v2xml.RI2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RIImpl#getRI1 <em>RI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RIImpl#getRI2 <em>RI2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RIImpl extends EObjectImpl implements RI {
	/**
	 * The cached value of the '{@link #getRI1() <em>RI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRI1()
	 * @generated
	 * @ordered
	 */
	protected RI1CONTENT rI1;

	/**
	 * The cached value of the '{@link #getRI2() <em>RI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRI2()
	 * @generated
	 * @ordered
	 */
	protected RI2CONTENT rI2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RI1CONTENT getRI1() {
		return rI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRI1(RI1CONTENT newRI1, NotificationChain msgs) {
		RI1CONTENT oldRI1 = rI1;
		rI1 = newRI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RI__RI1, oldRI1, newRI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRI1(RI1CONTENT newRI1) {
		if (newRI1 != rI1) {
			NotificationChain msgs = null;
			if (rI1 != null)
				msgs = ((InternalEObject)rI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RI__RI1, null, msgs);
			if (newRI1 != null)
				msgs = ((InternalEObject)newRI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RI__RI1, null, msgs);
			msgs = basicSetRI1(newRI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RI__RI1, newRI1, newRI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RI2CONTENT getRI2() {
		return rI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRI2(RI2CONTENT newRI2, NotificationChain msgs) {
		RI2CONTENT oldRI2 = rI2;
		rI2 = newRI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RI__RI2, oldRI2, newRI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRI2(RI2CONTENT newRI2) {
		if (newRI2 != rI2) {
			NotificationChain msgs = null;
			if (rI2 != null)
				msgs = ((InternalEObject)rI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RI__RI2, null, msgs);
			if (newRI2 != null)
				msgs = ((InternalEObject)newRI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RI__RI2, null, msgs);
			msgs = basicSetRI2(newRI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RI__RI2, newRI2, newRI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RI__RI1:
				return basicSetRI1(null, msgs);
			case V2xmlPackage.RI__RI2:
				return basicSetRI2(null, msgs);
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
			case V2xmlPackage.RI__RI1:
				return getRI1();
			case V2xmlPackage.RI__RI2:
				return getRI2();
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
			case V2xmlPackage.RI__RI1:
				setRI1((RI1CONTENT)newValue);
				return;
			case V2xmlPackage.RI__RI2:
				setRI2((RI2CONTENT)newValue);
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
			case V2xmlPackage.RI__RI1:
				setRI1((RI1CONTENT)null);
				return;
			case V2xmlPackage.RI__RI2:
				setRI2((RI2CONTENT)null);
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
			case V2xmlPackage.RI__RI1:
				return rI1 != null;
			case V2xmlPackage.RI__RI2:
				return rI2 != null;
		}
		return super.eIsSet(featureID);
	}

} //RIImpl
