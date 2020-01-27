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

import org.hl7.v2xml.QRF10CONTENT;
import org.hl7.v2xml.QRF1CONTENT;
import org.hl7.v2xml.QRF2CONTENT;
import org.hl7.v2xml.QRF3CONTENT;
import org.hl7.v2xml.QRF4CONTENT;
import org.hl7.v2xml.QRF5CONTENT;
import org.hl7.v2xml.QRF6CONTENT;
import org.hl7.v2xml.QRF7CONTENT;
import org.hl7.v2xml.QRF8CONTENT;
import org.hl7.v2xml.QRF9CONTENT;
import org.hl7.v2xml.QRFCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QRFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF1 <em>QRF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF2 <em>QRF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF3 <em>QRF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF4 <em>QRF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF5 <em>QRF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF6 <em>QRF6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF7 <em>QRF7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF8 <em>QRF8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF9 <em>QRF9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getQRF10 <em>QRF10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRFCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRFCONTENTImpl extends EObjectImpl implements QRFCONTENT {
	/**
	 * The cached value of the '{@link #getQRF1() <em>QRF1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF1()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF1CONTENT> qRF1;

	/**
	 * The cached value of the '{@link #getQRF2() <em>QRF2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF2()
	 * @generated
	 * @ordered
	 */
	protected QRF2CONTENT qRF2;

	/**
	 * The cached value of the '{@link #getQRF3() <em>QRF3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF3()
	 * @generated
	 * @ordered
	 */
	protected QRF3CONTENT qRF3;

	/**
	 * The cached value of the '{@link #getQRF4() <em>QRF4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF4()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF4CONTENT> qRF4;

	/**
	 * The cached value of the '{@link #getQRF5() <em>QRF5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF5()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF5CONTENT> qRF5;

	/**
	 * The cached value of the '{@link #getQRF6() <em>QRF6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF6()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF6CONTENT> qRF6;

	/**
	 * The cached value of the '{@link #getQRF7() <em>QRF7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF7()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF7CONTENT> qRF7;

	/**
	 * The cached value of the '{@link #getQRF8() <em>QRF8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF8()
	 * @generated
	 * @ordered
	 */
	protected EList<QRF8CONTENT> qRF8;

	/**
	 * The cached value of the '{@link #getQRF9() <em>QRF9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF9()
	 * @generated
	 * @ordered
	 */
	protected QRF9CONTENT qRF9;

	/**
	 * The cached value of the '{@link #getQRF10() <em>QRF10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRF10()
	 * @generated
	 * @ordered
	 */
	protected QRF10CONTENT qRF10;

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
	protected QRFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQRFCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF1CONTENT> getQRF1() {
		if (qRF1 == null) {
			qRF1 = new EObjectContainmentEList<QRF1CONTENT>(QRF1CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF1);
		}
		return qRF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRF2CONTENT getQRF2() {
		return qRF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRF2(QRF2CONTENT newQRF2, NotificationChain msgs) {
		QRF2CONTENT oldQRF2 = qRF2;
		qRF2 = newQRF2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF2, oldQRF2, newQRF2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRF2(QRF2CONTENT newQRF2) {
		if (newQRF2 != qRF2) {
			NotificationChain msgs = null;
			if (qRF2 != null)
				msgs = ((InternalEObject)qRF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF2, null, msgs);
			if (newQRF2 != null)
				msgs = ((InternalEObject)newQRF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF2, null, msgs);
			msgs = basicSetQRF2(newQRF2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF2, newQRF2, newQRF2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRF3CONTENT getQRF3() {
		return qRF3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRF3(QRF3CONTENT newQRF3, NotificationChain msgs) {
		QRF3CONTENT oldQRF3 = qRF3;
		qRF3 = newQRF3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF3, oldQRF3, newQRF3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRF3(QRF3CONTENT newQRF3) {
		if (newQRF3 != qRF3) {
			NotificationChain msgs = null;
			if (qRF3 != null)
				msgs = ((InternalEObject)qRF3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF3, null, msgs);
			if (newQRF3 != null)
				msgs = ((InternalEObject)newQRF3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF3, null, msgs);
			msgs = basicSetQRF3(newQRF3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF3, newQRF3, newQRF3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF4CONTENT> getQRF4() {
		if (qRF4 == null) {
			qRF4 = new EObjectContainmentEList<QRF4CONTENT>(QRF4CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF4);
		}
		return qRF4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF5CONTENT> getQRF5() {
		if (qRF5 == null) {
			qRF5 = new EObjectContainmentEList<QRF5CONTENT>(QRF5CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF5);
		}
		return qRF5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF6CONTENT> getQRF6() {
		if (qRF6 == null) {
			qRF6 = new EObjectContainmentEList<QRF6CONTENT>(QRF6CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF6);
		}
		return qRF6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF7CONTENT> getQRF7() {
		if (qRF7 == null) {
			qRF7 = new EObjectContainmentEList<QRF7CONTENT>(QRF7CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF7);
		}
		return qRF7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRF8CONTENT> getQRF8() {
		if (qRF8 == null) {
			qRF8 = new EObjectContainmentEList<QRF8CONTENT>(QRF8CONTENT.class, this, V2xmlPackage.QRFCONTENT__QRF8);
		}
		return qRF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRF9CONTENT getQRF9() {
		return qRF9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRF9(QRF9CONTENT newQRF9, NotificationChain msgs) {
		QRF9CONTENT oldQRF9 = qRF9;
		qRF9 = newQRF9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF9, oldQRF9, newQRF9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRF9(QRF9CONTENT newQRF9) {
		if (newQRF9 != qRF9) {
			NotificationChain msgs = null;
			if (qRF9 != null)
				msgs = ((InternalEObject)qRF9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF9, null, msgs);
			if (newQRF9 != null)
				msgs = ((InternalEObject)newQRF9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF9, null, msgs);
			msgs = basicSetQRF9(newQRF9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF9, newQRF9, newQRF9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRF10CONTENT getQRF10() {
		return qRF10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRF10(QRF10CONTENT newQRF10, NotificationChain msgs) {
		QRF10CONTENT oldQRF10 = qRF10;
		qRF10 = newQRF10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF10, oldQRF10, newQRF10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRF10(QRF10CONTENT newQRF10) {
		if (newQRF10 != qRF10) {
			NotificationChain msgs = null;
			if (qRF10 != null)
				msgs = ((InternalEObject)qRF10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF10, null, msgs);
			if (newQRF10 != null)
				msgs = ((InternalEObject)newQRF10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRFCONTENT__QRF10, null, msgs);
			msgs = basicSetQRF10(newQRF10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRFCONTENT__QRF10, newQRF10, newQRF10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QRFCONTENT__ANY);
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
			case V2xmlPackage.QRFCONTENT__QRF1:
				return ((InternalEList<?>)getQRF1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF2:
				return basicSetQRF2(null, msgs);
			case V2xmlPackage.QRFCONTENT__QRF3:
				return basicSetQRF3(null, msgs);
			case V2xmlPackage.QRFCONTENT__QRF4:
				return ((InternalEList<?>)getQRF4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF5:
				return ((InternalEList<?>)getQRF5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF6:
				return ((InternalEList<?>)getQRF6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF7:
				return ((InternalEList<?>)getQRF7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF8:
				return ((InternalEList<?>)getQRF8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRFCONTENT__QRF9:
				return basicSetQRF9(null, msgs);
			case V2xmlPackage.QRFCONTENT__QRF10:
				return basicSetQRF10(null, msgs);
			case V2xmlPackage.QRFCONTENT__ANY:
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
			case V2xmlPackage.QRFCONTENT__QRF1:
				return getQRF1();
			case V2xmlPackage.QRFCONTENT__QRF2:
				return getQRF2();
			case V2xmlPackage.QRFCONTENT__QRF3:
				return getQRF3();
			case V2xmlPackage.QRFCONTENT__QRF4:
				return getQRF4();
			case V2xmlPackage.QRFCONTENT__QRF5:
				return getQRF5();
			case V2xmlPackage.QRFCONTENT__QRF6:
				return getQRF6();
			case V2xmlPackage.QRFCONTENT__QRF7:
				return getQRF7();
			case V2xmlPackage.QRFCONTENT__QRF8:
				return getQRF8();
			case V2xmlPackage.QRFCONTENT__QRF9:
				return getQRF9();
			case V2xmlPackage.QRFCONTENT__QRF10:
				return getQRF10();
			case V2xmlPackage.QRFCONTENT__ANY:
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
			case V2xmlPackage.QRFCONTENT__QRF1:
				getQRF1().clear();
				getQRF1().addAll((Collection<? extends QRF1CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF2:
				setQRF2((QRF2CONTENT)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF3:
				setQRF3((QRF3CONTENT)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF4:
				getQRF4().clear();
				getQRF4().addAll((Collection<? extends QRF4CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF5:
				getQRF5().clear();
				getQRF5().addAll((Collection<? extends QRF5CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF6:
				getQRF6().clear();
				getQRF6().addAll((Collection<? extends QRF6CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF7:
				getQRF7().clear();
				getQRF7().addAll((Collection<? extends QRF7CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF8:
				getQRF8().clear();
				getQRF8().addAll((Collection<? extends QRF8CONTENT>)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF9:
				setQRF9((QRF9CONTENT)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__QRF10:
				setQRF10((QRF10CONTENT)newValue);
				return;
			case V2xmlPackage.QRFCONTENT__ANY:
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
			case V2xmlPackage.QRFCONTENT__QRF1:
				getQRF1().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF2:
				setQRF2((QRF2CONTENT)null);
				return;
			case V2xmlPackage.QRFCONTENT__QRF3:
				setQRF3((QRF3CONTENT)null);
				return;
			case V2xmlPackage.QRFCONTENT__QRF4:
				getQRF4().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF5:
				getQRF5().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF6:
				getQRF6().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF7:
				getQRF7().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF8:
				getQRF8().clear();
				return;
			case V2xmlPackage.QRFCONTENT__QRF9:
				setQRF9((QRF9CONTENT)null);
				return;
			case V2xmlPackage.QRFCONTENT__QRF10:
				setQRF10((QRF10CONTENT)null);
				return;
			case V2xmlPackage.QRFCONTENT__ANY:
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
			case V2xmlPackage.QRFCONTENT__QRF1:
				return qRF1 != null && !qRF1.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF2:
				return qRF2 != null;
			case V2xmlPackage.QRFCONTENT__QRF3:
				return qRF3 != null;
			case V2xmlPackage.QRFCONTENT__QRF4:
				return qRF4 != null && !qRF4.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF5:
				return qRF5 != null && !qRF5.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF6:
				return qRF6 != null && !qRF6.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF7:
				return qRF7 != null && !qRF7.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF8:
				return qRF8 != null && !qRF8.isEmpty();
			case V2xmlPackage.QRFCONTENT__QRF9:
				return qRF9 != null;
			case V2xmlPackage.QRFCONTENT__QRF10:
				return qRF10 != null;
			case V2xmlPackage.QRFCONTENT__ANY:
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

} //QRFCONTENTImpl
