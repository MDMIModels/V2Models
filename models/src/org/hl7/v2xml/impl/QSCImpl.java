/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.QSC;
import org.hl7.v2xml.QSC1CONTENT;
import org.hl7.v2xml.QSC2CONTENT;
import org.hl7.v2xml.QSC3CONTENT;
import org.hl7.v2xml.QSC4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QSC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QSCImpl#getQSC1 <em>QSC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QSCImpl#getQSC2 <em>QSC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QSCImpl#getQSC3 <em>QSC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QSCImpl#getQSC4 <em>QSC4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QSCImpl extends EObjectImpl implements QSC {
	/**
	 * The cached value of the '{@link #getQSC1() <em>QSC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQSC1()
	 * @generated
	 * @ordered
	 */
	protected QSC1CONTENT qSC1;

	/**
	 * The cached value of the '{@link #getQSC2() <em>QSC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQSC2()
	 * @generated
	 * @ordered
	 */
	protected QSC2CONTENT qSC2;

	/**
	 * The cached value of the '{@link #getQSC3() <em>QSC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQSC3()
	 * @generated
	 * @ordered
	 */
	protected QSC3CONTENT qSC3;

	/**
	 * The cached value of the '{@link #getQSC4() <em>QSC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQSC4()
	 * @generated
	 * @ordered
	 */
	protected QSC4CONTENT qSC4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QSCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQSC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSC1CONTENT getQSC1() {
		return qSC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQSC1(QSC1CONTENT newQSC1, NotificationChain msgs) {
		QSC1CONTENT oldQSC1 = qSC1;
		qSC1 = newQSC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC1, oldQSC1, newQSC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQSC1(QSC1CONTENT newQSC1) {
		if (newQSC1 != qSC1) {
			NotificationChain msgs = null;
			if (qSC1 != null)
				msgs = ((InternalEObject)qSC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC1, null, msgs);
			if (newQSC1 != null)
				msgs = ((InternalEObject)newQSC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC1, null, msgs);
			msgs = basicSetQSC1(newQSC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC1, newQSC1, newQSC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSC2CONTENT getQSC2() {
		return qSC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQSC2(QSC2CONTENT newQSC2, NotificationChain msgs) {
		QSC2CONTENT oldQSC2 = qSC2;
		qSC2 = newQSC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC2, oldQSC2, newQSC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQSC2(QSC2CONTENT newQSC2) {
		if (newQSC2 != qSC2) {
			NotificationChain msgs = null;
			if (qSC2 != null)
				msgs = ((InternalEObject)qSC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC2, null, msgs);
			if (newQSC2 != null)
				msgs = ((InternalEObject)newQSC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC2, null, msgs);
			msgs = basicSetQSC2(newQSC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC2, newQSC2, newQSC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSC3CONTENT getQSC3() {
		return qSC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQSC3(QSC3CONTENT newQSC3, NotificationChain msgs) {
		QSC3CONTENT oldQSC3 = qSC3;
		qSC3 = newQSC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC3, oldQSC3, newQSC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQSC3(QSC3CONTENT newQSC3) {
		if (newQSC3 != qSC3) {
			NotificationChain msgs = null;
			if (qSC3 != null)
				msgs = ((InternalEObject)qSC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC3, null, msgs);
			if (newQSC3 != null)
				msgs = ((InternalEObject)newQSC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC3, null, msgs);
			msgs = basicSetQSC3(newQSC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC3, newQSC3, newQSC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QSC4CONTENT getQSC4() {
		return qSC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQSC4(QSC4CONTENT newQSC4, NotificationChain msgs) {
		QSC4CONTENT oldQSC4 = qSC4;
		qSC4 = newQSC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC4, oldQSC4, newQSC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQSC4(QSC4CONTENT newQSC4) {
		if (newQSC4 != qSC4) {
			NotificationChain msgs = null;
			if (qSC4 != null)
				msgs = ((InternalEObject)qSC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC4, null, msgs);
			if (newQSC4 != null)
				msgs = ((InternalEObject)newQSC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QSC__QSC4, null, msgs);
			msgs = basicSetQSC4(newQSC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QSC__QSC4, newQSC4, newQSC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.QSC__QSC1:
				return basicSetQSC1(null, msgs);
			case V2xmlPackage.QSC__QSC2:
				return basicSetQSC2(null, msgs);
			case V2xmlPackage.QSC__QSC3:
				return basicSetQSC3(null, msgs);
			case V2xmlPackage.QSC__QSC4:
				return basicSetQSC4(null, msgs);
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
			case V2xmlPackage.QSC__QSC1:
				return getQSC1();
			case V2xmlPackage.QSC__QSC2:
				return getQSC2();
			case V2xmlPackage.QSC__QSC3:
				return getQSC3();
			case V2xmlPackage.QSC__QSC4:
				return getQSC4();
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
			case V2xmlPackage.QSC__QSC1:
				setQSC1((QSC1CONTENT)newValue);
				return;
			case V2xmlPackage.QSC__QSC2:
				setQSC2((QSC2CONTENT)newValue);
				return;
			case V2xmlPackage.QSC__QSC3:
				setQSC3((QSC3CONTENT)newValue);
				return;
			case V2xmlPackage.QSC__QSC4:
				setQSC4((QSC4CONTENT)newValue);
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
			case V2xmlPackage.QSC__QSC1:
				setQSC1((QSC1CONTENT)null);
				return;
			case V2xmlPackage.QSC__QSC2:
				setQSC2((QSC2CONTENT)null);
				return;
			case V2xmlPackage.QSC__QSC3:
				setQSC3((QSC3CONTENT)null);
				return;
			case V2xmlPackage.QSC__QSC4:
				setQSC4((QSC4CONTENT)null);
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
			case V2xmlPackage.QSC__QSC1:
				return qSC1 != null;
			case V2xmlPackage.QSC__QSC2:
				return qSC2 != null;
			case V2xmlPackage.QSC__QSC3:
				return qSC3 != null;
			case V2xmlPackage.QSC__QSC4:
				return qSC4 != null;
		}
		return super.eIsSet(featureID);
	}

} //QSCImpl
