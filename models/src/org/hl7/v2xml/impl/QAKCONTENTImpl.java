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

import org.hl7.v2xml.QAK1CONTENT;
import org.hl7.v2xml.QAK2CONTENT;
import org.hl7.v2xml.QAK3CONTENT;
import org.hl7.v2xml.QAK4CONTENT;
import org.hl7.v2xml.QAK5CONTENT;
import org.hl7.v2xml.QAK6CONTENT;
import org.hl7.v2xml.QAKCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QAKCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK1 <em>QAK1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK2 <em>QAK2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK3 <em>QAK3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK4 <em>QAK4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK5 <em>QAK5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getQAK6 <em>QAK6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QAKCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QAKCONTENTImpl extends EObjectImpl implements QAKCONTENT {
	/**
	 * The cached value of the '{@link #getQAK1() <em>QAK1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK1()
	 * @generated
	 * @ordered
	 */
	protected QAK1CONTENT qAK1;

	/**
	 * The cached value of the '{@link #getQAK2() <em>QAK2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK2()
	 * @generated
	 * @ordered
	 */
	protected QAK2CONTENT qAK2;

	/**
	 * The cached value of the '{@link #getQAK3() <em>QAK3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK3()
	 * @generated
	 * @ordered
	 */
	protected QAK3CONTENT qAK3;

	/**
	 * The cached value of the '{@link #getQAK4() <em>QAK4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK4()
	 * @generated
	 * @ordered
	 */
	protected QAK4CONTENT qAK4;

	/**
	 * The cached value of the '{@link #getQAK5() <em>QAK5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK5()
	 * @generated
	 * @ordered
	 */
	protected QAK5CONTENT qAK5;

	/**
	 * The cached value of the '{@link #getQAK6() <em>QAK6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQAK6()
	 * @generated
	 * @ordered
	 */
	protected QAK6CONTENT qAK6;

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
	protected QAKCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQAKCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK1CONTENT getQAK1() {
		return qAK1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK1(QAK1CONTENT newQAK1, NotificationChain msgs) {
		QAK1CONTENT oldQAK1 = qAK1;
		qAK1 = newQAK1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK1, oldQAK1, newQAK1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK1(QAK1CONTENT newQAK1) {
		if (newQAK1 != qAK1) {
			NotificationChain msgs = null;
			if (qAK1 != null)
				msgs = ((InternalEObject)qAK1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK1, null, msgs);
			if (newQAK1 != null)
				msgs = ((InternalEObject)newQAK1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK1, null, msgs);
			msgs = basicSetQAK1(newQAK1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK1, newQAK1, newQAK1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK2CONTENT getQAK2() {
		return qAK2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK2(QAK2CONTENT newQAK2, NotificationChain msgs) {
		QAK2CONTENT oldQAK2 = qAK2;
		qAK2 = newQAK2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK2, oldQAK2, newQAK2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK2(QAK2CONTENT newQAK2) {
		if (newQAK2 != qAK2) {
			NotificationChain msgs = null;
			if (qAK2 != null)
				msgs = ((InternalEObject)qAK2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK2, null, msgs);
			if (newQAK2 != null)
				msgs = ((InternalEObject)newQAK2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK2, null, msgs);
			msgs = basicSetQAK2(newQAK2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK2, newQAK2, newQAK2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK3CONTENT getQAK3() {
		return qAK3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK3(QAK3CONTENT newQAK3, NotificationChain msgs) {
		QAK3CONTENT oldQAK3 = qAK3;
		qAK3 = newQAK3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK3, oldQAK3, newQAK3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK3(QAK3CONTENT newQAK3) {
		if (newQAK3 != qAK3) {
			NotificationChain msgs = null;
			if (qAK3 != null)
				msgs = ((InternalEObject)qAK3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK3, null, msgs);
			if (newQAK3 != null)
				msgs = ((InternalEObject)newQAK3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK3, null, msgs);
			msgs = basicSetQAK3(newQAK3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK3, newQAK3, newQAK3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK4CONTENT getQAK4() {
		return qAK4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK4(QAK4CONTENT newQAK4, NotificationChain msgs) {
		QAK4CONTENT oldQAK4 = qAK4;
		qAK4 = newQAK4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK4, oldQAK4, newQAK4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK4(QAK4CONTENT newQAK4) {
		if (newQAK4 != qAK4) {
			NotificationChain msgs = null;
			if (qAK4 != null)
				msgs = ((InternalEObject)qAK4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK4, null, msgs);
			if (newQAK4 != null)
				msgs = ((InternalEObject)newQAK4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK4, null, msgs);
			msgs = basicSetQAK4(newQAK4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK4, newQAK4, newQAK4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK5CONTENT getQAK5() {
		return qAK5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK5(QAK5CONTENT newQAK5, NotificationChain msgs) {
		QAK5CONTENT oldQAK5 = qAK5;
		qAK5 = newQAK5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK5, oldQAK5, newQAK5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK5(QAK5CONTENT newQAK5) {
		if (newQAK5 != qAK5) {
			NotificationChain msgs = null;
			if (qAK5 != null)
				msgs = ((InternalEObject)qAK5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK5, null, msgs);
			if (newQAK5 != null)
				msgs = ((InternalEObject)newQAK5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK5, null, msgs);
			msgs = basicSetQAK5(newQAK5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK5, newQAK5, newQAK5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAK6CONTENT getQAK6() {
		return qAK6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQAK6(QAK6CONTENT newQAK6, NotificationChain msgs) {
		QAK6CONTENT oldQAK6 = qAK6;
		qAK6 = newQAK6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK6, oldQAK6, newQAK6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQAK6(QAK6CONTENT newQAK6) {
		if (newQAK6 != qAK6) {
			NotificationChain msgs = null;
			if (qAK6 != null)
				msgs = ((InternalEObject)qAK6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK6, null, msgs);
			if (newQAK6 != null)
				msgs = ((InternalEObject)newQAK6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QAKCONTENT__QAK6, null, msgs);
			msgs = basicSetQAK6(newQAK6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QAKCONTENT__QAK6, newQAK6, newQAK6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QAKCONTENT__ANY);
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
			case V2xmlPackage.QAKCONTENT__QAK1:
				return basicSetQAK1(null, msgs);
			case V2xmlPackage.QAKCONTENT__QAK2:
				return basicSetQAK2(null, msgs);
			case V2xmlPackage.QAKCONTENT__QAK3:
				return basicSetQAK3(null, msgs);
			case V2xmlPackage.QAKCONTENT__QAK4:
				return basicSetQAK4(null, msgs);
			case V2xmlPackage.QAKCONTENT__QAK5:
				return basicSetQAK5(null, msgs);
			case V2xmlPackage.QAKCONTENT__QAK6:
				return basicSetQAK6(null, msgs);
			case V2xmlPackage.QAKCONTENT__ANY:
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
			case V2xmlPackage.QAKCONTENT__QAK1:
				return getQAK1();
			case V2xmlPackage.QAKCONTENT__QAK2:
				return getQAK2();
			case V2xmlPackage.QAKCONTENT__QAK3:
				return getQAK3();
			case V2xmlPackage.QAKCONTENT__QAK4:
				return getQAK4();
			case V2xmlPackage.QAKCONTENT__QAK5:
				return getQAK5();
			case V2xmlPackage.QAKCONTENT__QAK6:
				return getQAK6();
			case V2xmlPackage.QAKCONTENT__ANY:
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
			case V2xmlPackage.QAKCONTENT__QAK1:
				setQAK1((QAK1CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__QAK2:
				setQAK2((QAK2CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__QAK3:
				setQAK3((QAK3CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__QAK4:
				setQAK4((QAK4CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__QAK5:
				setQAK5((QAK5CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__QAK6:
				setQAK6((QAK6CONTENT)newValue);
				return;
			case V2xmlPackage.QAKCONTENT__ANY:
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
			case V2xmlPackage.QAKCONTENT__QAK1:
				setQAK1((QAK1CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__QAK2:
				setQAK2((QAK2CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__QAK3:
				setQAK3((QAK3CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__QAK4:
				setQAK4((QAK4CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__QAK5:
				setQAK5((QAK5CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__QAK6:
				setQAK6((QAK6CONTENT)null);
				return;
			case V2xmlPackage.QAKCONTENT__ANY:
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
			case V2xmlPackage.QAKCONTENT__QAK1:
				return qAK1 != null;
			case V2xmlPackage.QAKCONTENT__QAK2:
				return qAK2 != null;
			case V2xmlPackage.QAKCONTENT__QAK3:
				return qAK3 != null;
			case V2xmlPackage.QAKCONTENT__QAK4:
				return qAK4 != null;
			case V2xmlPackage.QAKCONTENT__QAK5:
				return qAK5 != null;
			case V2xmlPackage.QAKCONTENT__QAK6:
				return qAK6 != null;
			case V2xmlPackage.QAKCONTENT__ANY:
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

} //QAKCONTENTImpl
