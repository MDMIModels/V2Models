/**
 */
package org.hl7.v2xml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.QRI1CONTENT;
import org.hl7.v2xml.QRI2CONTENT;
import org.hl7.v2xml.QRI3CONTENT;
import org.hl7.v2xml.QRICONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QRICONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QRICONTENTImpl#getQRI1 <em>QRI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRICONTENTImpl#getQRI2 <em>QRI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRICONTENTImpl#getQRI3 <em>QRI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRICONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRICONTENTImpl extends EObjectImpl implements QRICONTENT {
	/**
	 * The cached value of the '{@link #getQRI1() <em>QRI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRI1()
	 * @generated
	 * @ordered
	 */
	protected QRI1CONTENT qRI1;

	/**
	 * The cached value of the '{@link #getQRI2() <em>QRI2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRI2()
	 * @generated
	 * @ordered
	 */
	protected EList<QRI2CONTENT> qRI2;

	/**
	 * The cached value of the '{@link #getQRI3() <em>QRI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRI3()
	 * @generated
	 * @ordered
	 */
	protected QRI3CONTENT qRI3;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QRICONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQRICONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRI1CONTENT getQRI1() {
		return qRI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRI1(QRI1CONTENT newQRI1, NotificationChain msgs) {
		QRI1CONTENT oldQRI1 = qRI1;
		qRI1 = newQRI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRICONTENT__QRI1, oldQRI1, newQRI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRI1(QRI1CONTENT newQRI1) {
		if (newQRI1 != qRI1) {
			NotificationChain msgs = null;
			if (qRI1 != null)
				msgs = ((InternalEObject)qRI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRICONTENT__QRI1, null, msgs);
			if (newQRI1 != null)
				msgs = ((InternalEObject)newQRI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRICONTENT__QRI1, null, msgs);
			msgs = basicSetQRI1(newQRI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRICONTENT__QRI1, newQRI1, newQRI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRI2CONTENT> getQRI2() {
		if (qRI2 == null) {
			qRI2 = new EObjectContainmentEList<QRI2CONTENT>(QRI2CONTENT.class, this, V2xmlPackage.QRICONTENT__QRI2);
		}
		return qRI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRI3CONTENT getQRI3() {
		return qRI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRI3(QRI3CONTENT newQRI3, NotificationChain msgs) {
		QRI3CONTENT oldQRI3 = qRI3;
		qRI3 = newQRI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRICONTENT__QRI3, oldQRI3, newQRI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRI3(QRI3CONTENT newQRI3) {
		if (newQRI3 != qRI3) {
			NotificationChain msgs = null;
			if (qRI3 != null)
				msgs = ((InternalEObject)qRI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRICONTENT__QRI3, null, msgs);
			if (newQRI3 != null)
				msgs = ((InternalEObject)newQRI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRICONTENT__QRI3, null, msgs);
			msgs = basicSetQRI3(newQRI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRICONTENT__QRI3, newQRI3, newQRI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QRICONTENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.QRICONTENT__QRI1:
				return basicSetQRI1(null, msgs);
			case V2xmlPackage.QRICONTENT__QRI2:
				return ((InternalEList<?>)getQRI2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRICONTENT__QRI3:
				return basicSetQRI3(null, msgs);
			case V2xmlPackage.QRICONTENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.QRICONTENT__QRI1:
				return getQRI1();
			case V2xmlPackage.QRICONTENT__QRI2:
				return getQRI2();
			case V2xmlPackage.QRICONTENT__QRI3:
				return getQRI3();
			case V2xmlPackage.QRICONTENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.QRICONTENT__QRI1:
				setQRI1((QRI1CONTENT)newValue);
				return;
			case V2xmlPackage.QRICONTENT__QRI2:
				getQRI2().clear();
				getQRI2().addAll((Collection<? extends QRI2CONTENT>)newValue);
				return;
			case V2xmlPackage.QRICONTENT__QRI3:
				setQRI3((QRI3CONTENT)newValue);
				return;
			case V2xmlPackage.QRICONTENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case V2xmlPackage.QRICONTENT__QRI1:
				setQRI1((QRI1CONTENT)null);
				return;
			case V2xmlPackage.QRICONTENT__QRI2:
				getQRI2().clear();
				return;
			case V2xmlPackage.QRICONTENT__QRI3:
				setQRI3((QRI3CONTENT)null);
				return;
			case V2xmlPackage.QRICONTENT__ANY:
				getAny().clear();
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
			case V2xmlPackage.QRICONTENT__QRI1:
				return qRI1 != null;
			case V2xmlPackage.QRICONTENT__QRI2:
				return qRI2 != null && !qRI2.isEmpty();
			case V2xmlPackage.QRICONTENT__QRI3:
				return qRI3 != null;
			case V2xmlPackage.QRICONTENT__ANY:
				return any != null && !any.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //QRICONTENTImpl
