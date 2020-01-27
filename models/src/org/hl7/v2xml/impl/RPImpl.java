/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RP;
import org.hl7.v2xml.RP1CONTENT;
import org.hl7.v2xml.RP2CONTENT;
import org.hl7.v2xml.RP3CONTENT;
import org.hl7.v2xml.RP4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RPImpl#getRP1 <em>RP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPImpl#getRP2 <em>RP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPImpl#getRP3 <em>RP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPImpl#getRP4 <em>RP4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPImpl extends EObjectImpl implements RP {
	/**
	 * The cached value of the '{@link #getRP1() <em>RP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRP1()
	 * @generated
	 * @ordered
	 */
	protected RP1CONTENT rP1;

	/**
	 * The cached value of the '{@link #getRP2() <em>RP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRP2()
	 * @generated
	 * @ordered
	 */
	protected RP2CONTENT rP2;

	/**
	 * The cached value of the '{@link #getRP3() <em>RP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRP3()
	 * @generated
	 * @ordered
	 */
	protected RP3CONTENT rP3;

	/**
	 * The cached value of the '{@link #getRP4() <em>RP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRP4()
	 * @generated
	 * @ordered
	 */
	protected RP4CONTENT rP4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RP1CONTENT getRP1() {
		return rP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRP1(RP1CONTENT newRP1, NotificationChain msgs) {
		RP1CONTENT oldRP1 = rP1;
		rP1 = newRP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP1, oldRP1, newRP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRP1(RP1CONTENT newRP1) {
		if (newRP1 != rP1) {
			NotificationChain msgs = null;
			if (rP1 != null)
				msgs = ((InternalEObject)rP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP1, null, msgs);
			if (newRP1 != null)
				msgs = ((InternalEObject)newRP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP1, null, msgs);
			msgs = basicSetRP1(newRP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP1, newRP1, newRP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RP2CONTENT getRP2() {
		return rP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRP2(RP2CONTENT newRP2, NotificationChain msgs) {
		RP2CONTENT oldRP2 = rP2;
		rP2 = newRP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP2, oldRP2, newRP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRP2(RP2CONTENT newRP2) {
		if (newRP2 != rP2) {
			NotificationChain msgs = null;
			if (rP2 != null)
				msgs = ((InternalEObject)rP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP2, null, msgs);
			if (newRP2 != null)
				msgs = ((InternalEObject)newRP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP2, null, msgs);
			msgs = basicSetRP2(newRP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP2, newRP2, newRP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RP3CONTENT getRP3() {
		return rP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRP3(RP3CONTENT newRP3, NotificationChain msgs) {
		RP3CONTENT oldRP3 = rP3;
		rP3 = newRP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP3, oldRP3, newRP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRP3(RP3CONTENT newRP3) {
		if (newRP3 != rP3) {
			NotificationChain msgs = null;
			if (rP3 != null)
				msgs = ((InternalEObject)rP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP3, null, msgs);
			if (newRP3 != null)
				msgs = ((InternalEObject)newRP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP3, null, msgs);
			msgs = basicSetRP3(newRP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP3, newRP3, newRP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RP4CONTENT getRP4() {
		return rP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRP4(RP4CONTENT newRP4, NotificationChain msgs) {
		RP4CONTENT oldRP4 = rP4;
		rP4 = newRP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP4, oldRP4, newRP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRP4(RP4CONTENT newRP4) {
		if (newRP4 != rP4) {
			NotificationChain msgs = null;
			if (rP4 != null)
				msgs = ((InternalEObject)rP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP4, null, msgs);
			if (newRP4 != null)
				msgs = ((InternalEObject)newRP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RP__RP4, null, msgs);
			msgs = basicSetRP4(newRP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RP__RP4, newRP4, newRP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RP__RP1:
				return basicSetRP1(null, msgs);
			case V2xmlPackage.RP__RP2:
				return basicSetRP2(null, msgs);
			case V2xmlPackage.RP__RP3:
				return basicSetRP3(null, msgs);
			case V2xmlPackage.RP__RP4:
				return basicSetRP4(null, msgs);
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
			case V2xmlPackage.RP__RP1:
				return getRP1();
			case V2xmlPackage.RP__RP2:
				return getRP2();
			case V2xmlPackage.RP__RP3:
				return getRP3();
			case V2xmlPackage.RP__RP4:
				return getRP4();
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
			case V2xmlPackage.RP__RP1:
				setRP1((RP1CONTENT)newValue);
				return;
			case V2xmlPackage.RP__RP2:
				setRP2((RP2CONTENT)newValue);
				return;
			case V2xmlPackage.RP__RP3:
				setRP3((RP3CONTENT)newValue);
				return;
			case V2xmlPackage.RP__RP4:
				setRP4((RP4CONTENT)newValue);
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
			case V2xmlPackage.RP__RP1:
				setRP1((RP1CONTENT)null);
				return;
			case V2xmlPackage.RP__RP2:
				setRP2((RP2CONTENT)null);
				return;
			case V2xmlPackage.RP__RP3:
				setRP3((RP3CONTENT)null);
				return;
			case V2xmlPackage.RP__RP4:
				setRP4((RP4CONTENT)null);
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
			case V2xmlPackage.RP__RP1:
				return rP1 != null;
			case V2xmlPackage.RP__RP2:
				return rP2 != null;
			case V2xmlPackage.RP__RP3:
				return rP3 != null;
			case V2xmlPackage.RP__RP4:
				return rP4 != null;
		}
		return super.eIsSet(featureID);
	}

} //RPImpl
