/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.QPD1CONTENT;
import org.hl7.v2xml.QPD2CONTENT;
import org.hl7.v2xml.QPD3CONTENT;
import org.hl7.v2xml.QPDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QPDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QPDCONTENTImpl#getQPD1 <em>QPD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QPDCONTENTImpl#getQPD2 <em>QPD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QPDCONTENTImpl#getQPD3 <em>QPD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QPDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QPDCONTENTImpl extends EObjectImpl implements QPDCONTENT {
	/**
	 * The cached value of the '{@link #getQPD1() <em>QPD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPD1()
	 * @generated
	 * @ordered
	 */
	protected QPD1CONTENT qPD1;

	/**
	 * The cached value of the '{@link #getQPD2() <em>QPD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPD2()
	 * @generated
	 * @ordered
	 */
	protected QPD2CONTENT qPD2;

	/**
	 * The cached value of the '{@link #getQPD3() <em>QPD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQPD3()
	 * @generated
	 * @ordered
	 */
	protected QPD3CONTENT qPD3;

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
	protected QPDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQPDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPD1CONTENT getQPD1() {
		return qPD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQPD1(QPD1CONTENT newQPD1, NotificationChain msgs) {
		QPD1CONTENT oldQPD1 = qPD1;
		qPD1 = newQPD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD1, oldQPD1, newQPD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQPD1(QPD1CONTENT newQPD1) {
		if (newQPD1 != qPD1) {
			NotificationChain msgs = null;
			if (qPD1 != null)
				msgs = ((InternalEObject)qPD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD1, null, msgs);
			if (newQPD1 != null)
				msgs = ((InternalEObject)newQPD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD1, null, msgs);
			msgs = basicSetQPD1(newQPD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD1, newQPD1, newQPD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPD2CONTENT getQPD2() {
		return qPD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQPD2(QPD2CONTENT newQPD2, NotificationChain msgs) {
		QPD2CONTENT oldQPD2 = qPD2;
		qPD2 = newQPD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD2, oldQPD2, newQPD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQPD2(QPD2CONTENT newQPD2) {
		if (newQPD2 != qPD2) {
			NotificationChain msgs = null;
			if (qPD2 != null)
				msgs = ((InternalEObject)qPD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD2, null, msgs);
			if (newQPD2 != null)
				msgs = ((InternalEObject)newQPD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD2, null, msgs);
			msgs = basicSetQPD2(newQPD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD2, newQPD2, newQPD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPD3CONTENT getQPD3() {
		return qPD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQPD3(QPD3CONTENT newQPD3, NotificationChain msgs) {
		QPD3CONTENT oldQPD3 = qPD3;
		qPD3 = newQPD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD3, oldQPD3, newQPD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQPD3(QPD3CONTENT newQPD3) {
		if (newQPD3 != qPD3) {
			NotificationChain msgs = null;
			if (qPD3 != null)
				msgs = ((InternalEObject)qPD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD3, null, msgs);
			if (newQPD3 != null)
				msgs = ((InternalEObject)newQPD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QPDCONTENT__QPD3, null, msgs);
			msgs = basicSetQPD3(newQPD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QPDCONTENT__QPD3, newQPD3, newQPD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QPDCONTENT__ANY);
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
			case V2xmlPackage.QPDCONTENT__QPD1:
				return basicSetQPD1(null, msgs);
			case V2xmlPackage.QPDCONTENT__QPD2:
				return basicSetQPD2(null, msgs);
			case V2xmlPackage.QPDCONTENT__QPD3:
				return basicSetQPD3(null, msgs);
			case V2xmlPackage.QPDCONTENT__ANY:
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
			case V2xmlPackage.QPDCONTENT__QPD1:
				return getQPD1();
			case V2xmlPackage.QPDCONTENT__QPD2:
				return getQPD2();
			case V2xmlPackage.QPDCONTENT__QPD3:
				return getQPD3();
			case V2xmlPackage.QPDCONTENT__ANY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.QPDCONTENT__QPD1:
				setQPD1((QPD1CONTENT)newValue);
				return;
			case V2xmlPackage.QPDCONTENT__QPD2:
				setQPD2((QPD2CONTENT)newValue);
				return;
			case V2xmlPackage.QPDCONTENT__QPD3:
				setQPD3((QPD3CONTENT)newValue);
				return;
			case V2xmlPackage.QPDCONTENT__ANY:
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
			case V2xmlPackage.QPDCONTENT__QPD1:
				setQPD1((QPD1CONTENT)null);
				return;
			case V2xmlPackage.QPDCONTENT__QPD2:
				setQPD2((QPD2CONTENT)null);
				return;
			case V2xmlPackage.QPDCONTENT__QPD3:
				setQPD3((QPD3CONTENT)null);
				return;
			case V2xmlPackage.QPDCONTENT__ANY:
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
			case V2xmlPackage.QPDCONTENT__QPD1:
				return qPD1 != null;
			case V2xmlPackage.QPDCONTENT__QPD2:
				return qPD2 != null;
			case V2xmlPackage.QPDCONTENT__QPD3:
				return qPD3 != null;
			case V2xmlPackage.QPDCONTENT__ANY:
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

} //QPDCONTENTImpl
