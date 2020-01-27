/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.QIP;
import org.hl7.v2xml.QIP1CONTENT;
import org.hl7.v2xml.QIP2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QIP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QIPImpl#getQIP1 <em>QIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QIPImpl#getQIP2 <em>QIP2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QIPImpl extends EObjectImpl implements QIP {
	/**
	 * The cached value of the '{@link #getQIP1() <em>QIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQIP1()
	 * @generated
	 * @ordered
	 */
	protected QIP1CONTENT qIP1;

	/**
	 * The cached value of the '{@link #getQIP2() <em>QIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQIP2()
	 * @generated
	 * @ordered
	 */
	protected QIP2CONTENT qIP2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QIPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQIP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIP1CONTENT getQIP1() {
		return qIP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQIP1(QIP1CONTENT newQIP1, NotificationChain msgs) {
		QIP1CONTENT oldQIP1 = qIP1;
		qIP1 = newQIP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIP__QIP1, oldQIP1, newQIP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQIP1(QIP1CONTENT newQIP1) {
		if (newQIP1 != qIP1) {
			NotificationChain msgs = null;
			if (qIP1 != null)
				msgs = ((InternalEObject)qIP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIP__QIP1, null, msgs);
			if (newQIP1 != null)
				msgs = ((InternalEObject)newQIP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIP__QIP1, null, msgs);
			msgs = basicSetQIP1(newQIP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIP__QIP1, newQIP1, newQIP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QIP2CONTENT getQIP2() {
		return qIP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQIP2(QIP2CONTENT newQIP2, NotificationChain msgs) {
		QIP2CONTENT oldQIP2 = qIP2;
		qIP2 = newQIP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIP__QIP2, oldQIP2, newQIP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQIP2(QIP2CONTENT newQIP2) {
		if (newQIP2 != qIP2) {
			NotificationChain msgs = null;
			if (qIP2 != null)
				msgs = ((InternalEObject)qIP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIP__QIP2, null, msgs);
			if (newQIP2 != null)
				msgs = ((InternalEObject)newQIP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIP__QIP2, null, msgs);
			msgs = basicSetQIP2(newQIP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIP__QIP2, newQIP2, newQIP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.QIP__QIP1:
				return basicSetQIP1(null, msgs);
			case V2xmlPackage.QIP__QIP2:
				return basicSetQIP2(null, msgs);
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
			case V2xmlPackage.QIP__QIP1:
				return getQIP1();
			case V2xmlPackage.QIP__QIP2:
				return getQIP2();
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
			case V2xmlPackage.QIP__QIP1:
				setQIP1((QIP1CONTENT)newValue);
				return;
			case V2xmlPackage.QIP__QIP2:
				setQIP2((QIP2CONTENT)newValue);
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
			case V2xmlPackage.QIP__QIP1:
				setQIP1((QIP1CONTENT)null);
				return;
			case V2xmlPackage.QIP__QIP2:
				setQIP2((QIP2CONTENT)null);
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
			case V2xmlPackage.QIP__QIP1:
				return qIP1 != null;
			case V2xmlPackage.QIP__QIP2:
				return qIP2 != null;
		}
		return super.eIsSet(featureID);
	}

} //QIPImpl
