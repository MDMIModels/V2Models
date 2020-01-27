/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.ED;
import org.hl7.v2xml.ED1CONTENT;
import org.hl7.v2xml.ED2CONTENT;
import org.hl7.v2xml.ED3CONTENT;
import org.hl7.v2xml.ED4CONTENT;
import org.hl7.v2xml.ED5CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EDImpl#getED1 <em>ED1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDImpl#getED2 <em>ED2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDImpl#getED3 <em>ED3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDImpl#getED4 <em>ED4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EDImpl#getED5 <em>ED5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EDImpl extends EObjectImpl implements ED {
	/**
	 * The cached value of the '{@link #getED1() <em>ED1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getED1()
	 * @generated
	 * @ordered
	 */
	protected ED1CONTENT eD1;

	/**
	 * The cached value of the '{@link #getED2() <em>ED2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getED2()
	 * @generated
	 * @ordered
	 */
	protected ED2CONTENT eD2;

	/**
	 * The cached value of the '{@link #getED3() <em>ED3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getED3()
	 * @generated
	 * @ordered
	 */
	protected ED3CONTENT eD3;

	/**
	 * The cached value of the '{@link #getED4() <em>ED4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getED4()
	 * @generated
	 * @ordered
	 */
	protected ED4CONTENT eD4;

	/**
	 * The cached value of the '{@link #getED5() <em>ED5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getED5()
	 * @generated
	 * @ordered
	 */
	protected ED5CONTENT eD5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getED();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED1CONTENT getED1() {
		return eD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetED1(ED1CONTENT newED1, NotificationChain msgs) {
		ED1CONTENT oldED1 = eD1;
		eD1 = newED1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED1, oldED1, newED1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setED1(ED1CONTENT newED1) {
		if (newED1 != eD1) {
			NotificationChain msgs = null;
			if (eD1 != null)
				msgs = ((InternalEObject)eD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED1, null, msgs);
			if (newED1 != null)
				msgs = ((InternalEObject)newED1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED1, null, msgs);
			msgs = basicSetED1(newED1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED1, newED1, newED1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED2CONTENT getED2() {
		return eD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetED2(ED2CONTENT newED2, NotificationChain msgs) {
		ED2CONTENT oldED2 = eD2;
		eD2 = newED2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED2, oldED2, newED2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setED2(ED2CONTENT newED2) {
		if (newED2 != eD2) {
			NotificationChain msgs = null;
			if (eD2 != null)
				msgs = ((InternalEObject)eD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED2, null, msgs);
			if (newED2 != null)
				msgs = ((InternalEObject)newED2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED2, null, msgs);
			msgs = basicSetED2(newED2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED2, newED2, newED2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED3CONTENT getED3() {
		return eD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetED3(ED3CONTENT newED3, NotificationChain msgs) {
		ED3CONTENT oldED3 = eD3;
		eD3 = newED3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED3, oldED3, newED3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setED3(ED3CONTENT newED3) {
		if (newED3 != eD3) {
			NotificationChain msgs = null;
			if (eD3 != null)
				msgs = ((InternalEObject)eD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED3, null, msgs);
			if (newED3 != null)
				msgs = ((InternalEObject)newED3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED3, null, msgs);
			msgs = basicSetED3(newED3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED3, newED3, newED3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED4CONTENT getED4() {
		return eD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetED4(ED4CONTENT newED4, NotificationChain msgs) {
		ED4CONTENT oldED4 = eD4;
		eD4 = newED4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED4, oldED4, newED4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setED4(ED4CONTENT newED4) {
		if (newED4 != eD4) {
			NotificationChain msgs = null;
			if (eD4 != null)
				msgs = ((InternalEObject)eD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED4, null, msgs);
			if (newED4 != null)
				msgs = ((InternalEObject)newED4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED4, null, msgs);
			msgs = basicSetED4(newED4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED4, newED4, newED4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED5CONTENT getED5() {
		return eD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetED5(ED5CONTENT newED5, NotificationChain msgs) {
		ED5CONTENT oldED5 = eD5;
		eD5 = newED5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED5, oldED5, newED5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setED5(ED5CONTENT newED5) {
		if (newED5 != eD5) {
			NotificationChain msgs = null;
			if (eD5 != null)
				msgs = ((InternalEObject)eD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED5, null, msgs);
			if (newED5 != null)
				msgs = ((InternalEObject)newED5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ED__ED5, null, msgs);
			msgs = basicSetED5(newED5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ED__ED5, newED5, newED5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ED__ED1:
				return basicSetED1(null, msgs);
			case V2xmlPackage.ED__ED2:
				return basicSetED2(null, msgs);
			case V2xmlPackage.ED__ED3:
				return basicSetED3(null, msgs);
			case V2xmlPackage.ED__ED4:
				return basicSetED4(null, msgs);
			case V2xmlPackage.ED__ED5:
				return basicSetED5(null, msgs);
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
			case V2xmlPackage.ED__ED1:
				return getED1();
			case V2xmlPackage.ED__ED2:
				return getED2();
			case V2xmlPackage.ED__ED3:
				return getED3();
			case V2xmlPackage.ED__ED4:
				return getED4();
			case V2xmlPackage.ED__ED5:
				return getED5();
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
			case V2xmlPackage.ED__ED1:
				setED1((ED1CONTENT)newValue);
				return;
			case V2xmlPackage.ED__ED2:
				setED2((ED2CONTENT)newValue);
				return;
			case V2xmlPackage.ED__ED3:
				setED3((ED3CONTENT)newValue);
				return;
			case V2xmlPackage.ED__ED4:
				setED4((ED4CONTENT)newValue);
				return;
			case V2xmlPackage.ED__ED5:
				setED5((ED5CONTENT)newValue);
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
			case V2xmlPackage.ED__ED1:
				setED1((ED1CONTENT)null);
				return;
			case V2xmlPackage.ED__ED2:
				setED2((ED2CONTENT)null);
				return;
			case V2xmlPackage.ED__ED3:
				setED3((ED3CONTENT)null);
				return;
			case V2xmlPackage.ED__ED4:
				setED4((ED4CONTENT)null);
				return;
			case V2xmlPackage.ED__ED5:
				setED5((ED5CONTENT)null);
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
			case V2xmlPackage.ED__ED1:
				return eD1 != null;
			case V2xmlPackage.ED__ED2:
				return eD2 != null;
			case V2xmlPackage.ED__ED3:
				return eD3 != null;
			case V2xmlPackage.ED__ED4:
				return eD4 != null;
			case V2xmlPackage.ED__ED5:
				return eD5 != null;
		}
		return super.eIsSet(featureID);
	}

} //EDImpl
