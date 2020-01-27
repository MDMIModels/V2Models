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

import org.hl7.v2xml.QID1CONTENT;
import org.hl7.v2xml.QID2CONTENT;
import org.hl7.v2xml.QIDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QIDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QIDCONTENTImpl#getQID1 <em>QID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QIDCONTENTImpl#getQID2 <em>QID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QIDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QIDCONTENTImpl extends EObjectImpl implements QIDCONTENT {
	/**
	 * The cached value of the '{@link #getQID1() <em>QID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQID1()
	 * @generated
	 * @ordered
	 */
	protected QID1CONTENT qID1;

	/**
	 * The cached value of the '{@link #getQID2() <em>QID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQID2()
	 * @generated
	 * @ordered
	 */
	protected QID2CONTENT qID2;

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
	protected QIDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQIDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QID1CONTENT getQID1() {
		return qID1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQID1(QID1CONTENT newQID1, NotificationChain msgs) {
		QID1CONTENT oldQID1 = qID1;
		qID1 = newQID1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIDCONTENT__QID1, oldQID1, newQID1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQID1(QID1CONTENT newQID1) {
		if (newQID1 != qID1) {
			NotificationChain msgs = null;
			if (qID1 != null)
				msgs = ((InternalEObject)qID1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIDCONTENT__QID1, null, msgs);
			if (newQID1 != null)
				msgs = ((InternalEObject)newQID1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIDCONTENT__QID1, null, msgs);
			msgs = basicSetQID1(newQID1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIDCONTENT__QID1, newQID1, newQID1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QID2CONTENT getQID2() {
		return qID2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQID2(QID2CONTENT newQID2, NotificationChain msgs) {
		QID2CONTENT oldQID2 = qID2;
		qID2 = newQID2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIDCONTENT__QID2, oldQID2, newQID2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQID2(QID2CONTENT newQID2) {
		if (newQID2 != qID2) {
			NotificationChain msgs = null;
			if (qID2 != null)
				msgs = ((InternalEObject)qID2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIDCONTENT__QID2, null, msgs);
			if (newQID2 != null)
				msgs = ((InternalEObject)newQID2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QIDCONTENT__QID2, null, msgs);
			msgs = basicSetQID2(newQID2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QIDCONTENT__QID2, newQID2, newQID2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QIDCONTENT__ANY);
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
			case V2xmlPackage.QIDCONTENT__QID1:
				return basicSetQID1(null, msgs);
			case V2xmlPackage.QIDCONTENT__QID2:
				return basicSetQID2(null, msgs);
			case V2xmlPackage.QIDCONTENT__ANY:
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
			case V2xmlPackage.QIDCONTENT__QID1:
				return getQID1();
			case V2xmlPackage.QIDCONTENT__QID2:
				return getQID2();
			case V2xmlPackage.QIDCONTENT__ANY:
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
			case V2xmlPackage.QIDCONTENT__QID1:
				setQID1((QID1CONTENT)newValue);
				return;
			case V2xmlPackage.QIDCONTENT__QID2:
				setQID2((QID2CONTENT)newValue);
				return;
			case V2xmlPackage.QIDCONTENT__ANY:
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
			case V2xmlPackage.QIDCONTENT__QID1:
				setQID1((QID1CONTENT)null);
				return;
			case V2xmlPackage.QIDCONTENT__QID2:
				setQID2((QID2CONTENT)null);
				return;
			case V2xmlPackage.QIDCONTENT__ANY:
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
			case V2xmlPackage.QIDCONTENT__QID1:
				return qID1 != null;
			case V2xmlPackage.QIDCONTENT__QID2:
				return qID2 != null;
			case V2xmlPackage.QIDCONTENT__ANY:
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

} //QIDCONTENTImpl
