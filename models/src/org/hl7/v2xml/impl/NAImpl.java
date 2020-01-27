/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.NA;
import org.hl7.v2xml.NA1CONTENT;
import org.hl7.v2xml.NA2CONTENT;
import org.hl7.v2xml.NA3CONTENT;
import org.hl7.v2xml.NA4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NAImpl#getNA1 <em>NA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NAImpl#getNA2 <em>NA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NAImpl#getNA3 <em>NA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NAImpl#getNA4 <em>NA4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NAImpl extends EObjectImpl implements NA {
	/**
	 * The cached value of the '{@link #getNA1() <em>NA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNA1()
	 * @generated
	 * @ordered
	 */
	protected NA1CONTENT nA1;

	/**
	 * The cached value of the '{@link #getNA2() <em>NA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNA2()
	 * @generated
	 * @ordered
	 */
	protected NA2CONTENT nA2;

	/**
	 * The cached value of the '{@link #getNA3() <em>NA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNA3()
	 * @generated
	 * @ordered
	 */
	protected NA3CONTENT nA3;

	/**
	 * The cached value of the '{@link #getNA4() <em>NA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNA4()
	 * @generated
	 * @ordered
	 */
	protected NA4CONTENT nA4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NA1CONTENT getNA1() {
		return nA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNA1(NA1CONTENT newNA1, NotificationChain msgs) {
		NA1CONTENT oldNA1 = nA1;
		nA1 = newNA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA1, oldNA1, newNA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNA1(NA1CONTENT newNA1) {
		if (newNA1 != nA1) {
			NotificationChain msgs = null;
			if (nA1 != null)
				msgs = ((InternalEObject)nA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA1, null, msgs);
			if (newNA1 != null)
				msgs = ((InternalEObject)newNA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA1, null, msgs);
			msgs = basicSetNA1(newNA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA1, newNA1, newNA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NA2CONTENT getNA2() {
		return nA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNA2(NA2CONTENT newNA2, NotificationChain msgs) {
		NA2CONTENT oldNA2 = nA2;
		nA2 = newNA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA2, oldNA2, newNA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNA2(NA2CONTENT newNA2) {
		if (newNA2 != nA2) {
			NotificationChain msgs = null;
			if (nA2 != null)
				msgs = ((InternalEObject)nA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA2, null, msgs);
			if (newNA2 != null)
				msgs = ((InternalEObject)newNA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA2, null, msgs);
			msgs = basicSetNA2(newNA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA2, newNA2, newNA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NA3CONTENT getNA3() {
		return nA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNA3(NA3CONTENT newNA3, NotificationChain msgs) {
		NA3CONTENT oldNA3 = nA3;
		nA3 = newNA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA3, oldNA3, newNA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNA3(NA3CONTENT newNA3) {
		if (newNA3 != nA3) {
			NotificationChain msgs = null;
			if (nA3 != null)
				msgs = ((InternalEObject)nA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA3, null, msgs);
			if (newNA3 != null)
				msgs = ((InternalEObject)newNA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA3, null, msgs);
			msgs = basicSetNA3(newNA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA3, newNA3, newNA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NA4CONTENT getNA4() {
		return nA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNA4(NA4CONTENT newNA4, NotificationChain msgs) {
		NA4CONTENT oldNA4 = nA4;
		nA4 = newNA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA4, oldNA4, newNA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNA4(NA4CONTENT newNA4) {
		if (newNA4 != nA4) {
			NotificationChain msgs = null;
			if (nA4 != null)
				msgs = ((InternalEObject)nA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA4, null, msgs);
			if (newNA4 != null)
				msgs = ((InternalEObject)newNA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NA__NA4, null, msgs);
			msgs = basicSetNA4(newNA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NA__NA4, newNA4, newNA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.NA__NA1:
				return basicSetNA1(null, msgs);
			case V2xmlPackage.NA__NA2:
				return basicSetNA2(null, msgs);
			case V2xmlPackage.NA__NA3:
				return basicSetNA3(null, msgs);
			case V2xmlPackage.NA__NA4:
				return basicSetNA4(null, msgs);
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
			case V2xmlPackage.NA__NA1:
				return getNA1();
			case V2xmlPackage.NA__NA2:
				return getNA2();
			case V2xmlPackage.NA__NA3:
				return getNA3();
			case V2xmlPackage.NA__NA4:
				return getNA4();
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
			case V2xmlPackage.NA__NA1:
				setNA1((NA1CONTENT)newValue);
				return;
			case V2xmlPackage.NA__NA2:
				setNA2((NA2CONTENT)newValue);
				return;
			case V2xmlPackage.NA__NA3:
				setNA3((NA3CONTENT)newValue);
				return;
			case V2xmlPackage.NA__NA4:
				setNA4((NA4CONTENT)newValue);
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
			case V2xmlPackage.NA__NA1:
				setNA1((NA1CONTENT)null);
				return;
			case V2xmlPackage.NA__NA2:
				setNA2((NA2CONTENT)null);
				return;
			case V2xmlPackage.NA__NA3:
				setNA3((NA3CONTENT)null);
				return;
			case V2xmlPackage.NA__NA4:
				setNA4((NA4CONTENT)null);
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
			case V2xmlPackage.NA__NA1:
				return nA1 != null;
			case V2xmlPackage.NA__NA2:
				return nA2 != null;
			case V2xmlPackage.NA__NA3:
				return nA3 != null;
			case V2xmlPackage.NA__NA4:
				return nA4 != null;
		}
		return super.eIsSet(featureID);
	}

} //NAImpl
