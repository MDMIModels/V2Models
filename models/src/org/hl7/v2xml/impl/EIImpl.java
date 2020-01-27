/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.EI;
import org.hl7.v2xml.EI1CONTENT;
import org.hl7.v2xml.EI2CONTENT;
import org.hl7.v2xml.EI3CONTENT;
import org.hl7.v2xml.EI4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EIImpl#getEI1 <em>EI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EIImpl#getEI2 <em>EI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EIImpl#getEI3 <em>EI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EIImpl#getEI4 <em>EI4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EIImpl extends EObjectImpl implements EI {
	/**
	 * The cached value of the '{@link #getEI1() <em>EI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEI1()
	 * @generated
	 * @ordered
	 */
	protected EI1CONTENT eI1;

	/**
	 * The cached value of the '{@link #getEI2() <em>EI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEI2()
	 * @generated
	 * @ordered
	 */
	protected EI2CONTENT eI2;

	/**
	 * The cached value of the '{@link #getEI3() <em>EI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEI3()
	 * @generated
	 * @ordered
	 */
	protected EI3CONTENT eI3;

	/**
	 * The cached value of the '{@link #getEI4() <em>EI4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEI4()
	 * @generated
	 * @ordered
	 */
	protected EI4CONTENT eI4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEI();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EI1CONTENT getEI1() {
		return eI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEI1(EI1CONTENT newEI1, NotificationChain msgs) {
		EI1CONTENT oldEI1 = eI1;
		eI1 = newEI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI1, oldEI1, newEI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEI1(EI1CONTENT newEI1) {
		if (newEI1 != eI1) {
			NotificationChain msgs = null;
			if (eI1 != null)
				msgs = ((InternalEObject)eI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI1, null, msgs);
			if (newEI1 != null)
				msgs = ((InternalEObject)newEI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI1, null, msgs);
			msgs = basicSetEI1(newEI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI1, newEI1, newEI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EI2CONTENT getEI2() {
		return eI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEI2(EI2CONTENT newEI2, NotificationChain msgs) {
		EI2CONTENT oldEI2 = eI2;
		eI2 = newEI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI2, oldEI2, newEI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEI2(EI2CONTENT newEI2) {
		if (newEI2 != eI2) {
			NotificationChain msgs = null;
			if (eI2 != null)
				msgs = ((InternalEObject)eI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI2, null, msgs);
			if (newEI2 != null)
				msgs = ((InternalEObject)newEI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI2, null, msgs);
			msgs = basicSetEI2(newEI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI2, newEI2, newEI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EI3CONTENT getEI3() {
		return eI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEI3(EI3CONTENT newEI3, NotificationChain msgs) {
		EI3CONTENT oldEI3 = eI3;
		eI3 = newEI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI3, oldEI3, newEI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEI3(EI3CONTENT newEI3) {
		if (newEI3 != eI3) {
			NotificationChain msgs = null;
			if (eI3 != null)
				msgs = ((InternalEObject)eI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI3, null, msgs);
			if (newEI3 != null)
				msgs = ((InternalEObject)newEI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI3, null, msgs);
			msgs = basicSetEI3(newEI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI3, newEI3, newEI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EI4CONTENT getEI4() {
		return eI4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEI4(EI4CONTENT newEI4, NotificationChain msgs) {
		EI4CONTENT oldEI4 = eI4;
		eI4 = newEI4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI4, oldEI4, newEI4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEI4(EI4CONTENT newEI4) {
		if (newEI4 != eI4) {
			NotificationChain msgs = null;
			if (eI4 != null)
				msgs = ((InternalEObject)eI4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI4, null, msgs);
			if (newEI4 != null)
				msgs = ((InternalEObject)newEI4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EI__EI4, null, msgs);
			msgs = basicSetEI4(newEI4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EI__EI4, newEI4, newEI4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.EI__EI1:
				return basicSetEI1(null, msgs);
			case V2xmlPackage.EI__EI2:
				return basicSetEI2(null, msgs);
			case V2xmlPackage.EI__EI3:
				return basicSetEI3(null, msgs);
			case V2xmlPackage.EI__EI4:
				return basicSetEI4(null, msgs);
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
			case V2xmlPackage.EI__EI1:
				return getEI1();
			case V2xmlPackage.EI__EI2:
				return getEI2();
			case V2xmlPackage.EI__EI3:
				return getEI3();
			case V2xmlPackage.EI__EI4:
				return getEI4();
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
			case V2xmlPackage.EI__EI1:
				setEI1((EI1CONTENT)newValue);
				return;
			case V2xmlPackage.EI__EI2:
				setEI2((EI2CONTENT)newValue);
				return;
			case V2xmlPackage.EI__EI3:
				setEI3((EI3CONTENT)newValue);
				return;
			case V2xmlPackage.EI__EI4:
				setEI4((EI4CONTENT)newValue);
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
			case V2xmlPackage.EI__EI1:
				setEI1((EI1CONTENT)null);
				return;
			case V2xmlPackage.EI__EI2:
				setEI2((EI2CONTENT)null);
				return;
			case V2xmlPackage.EI__EI3:
				setEI3((EI3CONTENT)null);
				return;
			case V2xmlPackage.EI__EI4:
				setEI4((EI4CONTENT)null);
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
			case V2xmlPackage.EI__EI1:
				return eI1 != null;
			case V2xmlPackage.EI__EI2:
				return eI2 != null;
			case V2xmlPackage.EI__EI3:
				return eI3 != null;
			case V2xmlPackage.EI__EI4:
				return eI4 != null;
		}
		return super.eIsSet(featureID);
	}

} //EIImpl
