/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.JCC;
import org.hl7.v2xml.JCC1CONTENT;
import org.hl7.v2xml.JCC2CONTENT;
import org.hl7.v2xml.JCC3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JCC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.JCCImpl#getJCC1 <em>JCC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.JCCImpl#getJCC2 <em>JCC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.JCCImpl#getJCC3 <em>JCC3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JCCImpl extends EObjectImpl implements JCC {
	/**
	 * The cached value of the '{@link #getJCC1() <em>JCC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJCC1()
	 * @generated
	 * @ordered
	 */
	protected JCC1CONTENT jCC1;

	/**
	 * The cached value of the '{@link #getJCC2() <em>JCC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJCC2()
	 * @generated
	 * @ordered
	 */
	protected JCC2CONTENT jCC2;

	/**
	 * The cached value of the '{@link #getJCC3() <em>JCC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJCC3()
	 * @generated
	 * @ordered
	 */
	protected JCC3CONTENT jCC3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JCCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getJCC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JCC1CONTENT getJCC1() {
		return jCC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJCC1(JCC1CONTENT newJCC1, NotificationChain msgs) {
		JCC1CONTENT oldJCC1 = jCC1;
		jCC1 = newJCC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC1, oldJCC1, newJCC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJCC1(JCC1CONTENT newJCC1) {
		if (newJCC1 != jCC1) {
			NotificationChain msgs = null;
			if (jCC1 != null)
				msgs = ((InternalEObject)jCC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC1, null, msgs);
			if (newJCC1 != null)
				msgs = ((InternalEObject)newJCC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC1, null, msgs);
			msgs = basicSetJCC1(newJCC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC1, newJCC1, newJCC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JCC2CONTENT getJCC2() {
		return jCC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJCC2(JCC2CONTENT newJCC2, NotificationChain msgs) {
		JCC2CONTENT oldJCC2 = jCC2;
		jCC2 = newJCC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC2, oldJCC2, newJCC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJCC2(JCC2CONTENT newJCC2) {
		if (newJCC2 != jCC2) {
			NotificationChain msgs = null;
			if (jCC2 != null)
				msgs = ((InternalEObject)jCC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC2, null, msgs);
			if (newJCC2 != null)
				msgs = ((InternalEObject)newJCC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC2, null, msgs);
			msgs = basicSetJCC2(newJCC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC2, newJCC2, newJCC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JCC3CONTENT getJCC3() {
		return jCC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJCC3(JCC3CONTENT newJCC3, NotificationChain msgs) {
		JCC3CONTENT oldJCC3 = jCC3;
		jCC3 = newJCC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC3, oldJCC3, newJCC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJCC3(JCC3CONTENT newJCC3) {
		if (newJCC3 != jCC3) {
			NotificationChain msgs = null;
			if (jCC3 != null)
				msgs = ((InternalEObject)jCC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC3, null, msgs);
			if (newJCC3 != null)
				msgs = ((InternalEObject)newJCC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.JCC__JCC3, null, msgs);
			msgs = basicSetJCC3(newJCC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.JCC__JCC3, newJCC3, newJCC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.JCC__JCC1:
				return basicSetJCC1(null, msgs);
			case V2xmlPackage.JCC__JCC2:
				return basicSetJCC2(null, msgs);
			case V2xmlPackage.JCC__JCC3:
				return basicSetJCC3(null, msgs);
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
			case V2xmlPackage.JCC__JCC1:
				return getJCC1();
			case V2xmlPackage.JCC__JCC2:
				return getJCC2();
			case V2xmlPackage.JCC__JCC3:
				return getJCC3();
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
			case V2xmlPackage.JCC__JCC1:
				setJCC1((JCC1CONTENT)newValue);
				return;
			case V2xmlPackage.JCC__JCC2:
				setJCC2((JCC2CONTENT)newValue);
				return;
			case V2xmlPackage.JCC__JCC3:
				setJCC3((JCC3CONTENT)newValue);
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
			case V2xmlPackage.JCC__JCC1:
				setJCC1((JCC1CONTENT)null);
				return;
			case V2xmlPackage.JCC__JCC2:
				setJCC2((JCC2CONTENT)null);
				return;
			case V2xmlPackage.JCC__JCC3:
				setJCC3((JCC3CONTENT)null);
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
			case V2xmlPackage.JCC__JCC1:
				return jCC1 != null;
			case V2xmlPackage.JCC__JCC2:
				return jCC2 != null;
			case V2xmlPackage.JCC__JCC3:
				return jCC3 != null;
		}
		return super.eIsSet(featureID);
	}

} //JCCImpl
