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

import org.hl7.v2xml.QRD10CONTENT;
import org.hl7.v2xml.QRD11CONTENT;
import org.hl7.v2xml.QRD12CONTENT;
import org.hl7.v2xml.QRD1CONTENT;
import org.hl7.v2xml.QRD2CONTENT;
import org.hl7.v2xml.QRD3CONTENT;
import org.hl7.v2xml.QRD4CONTENT;
import org.hl7.v2xml.QRD5CONTENT;
import org.hl7.v2xml.QRD6CONTENT;
import org.hl7.v2xml.QRD7CONTENT;
import org.hl7.v2xml.QRD8CONTENT;
import org.hl7.v2xml.QRD9CONTENT;
import org.hl7.v2xml.QRDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QRDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD1 <em>QRD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD2 <em>QRD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD3 <em>QRD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD4 <em>QRD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD5 <em>QRD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD6 <em>QRD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD7 <em>QRD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD8 <em>QRD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD9 <em>QRD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD10 <em>QRD10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD11 <em>QRD11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getQRD12 <em>QRD12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.QRDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QRDCONTENTImpl extends EObjectImpl implements QRDCONTENT {
	/**
	 * The cached value of the '{@link #getQRD1() <em>QRD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD1()
	 * @generated
	 * @ordered
	 */
	protected QRD1CONTENT qRD1;

	/**
	 * The cached value of the '{@link #getQRD2() <em>QRD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD2()
	 * @generated
	 * @ordered
	 */
	protected QRD2CONTENT qRD2;

	/**
	 * The cached value of the '{@link #getQRD3() <em>QRD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD3()
	 * @generated
	 * @ordered
	 */
	protected QRD3CONTENT qRD3;

	/**
	 * The cached value of the '{@link #getQRD4() <em>QRD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD4()
	 * @generated
	 * @ordered
	 */
	protected QRD4CONTENT qRD4;

	/**
	 * The cached value of the '{@link #getQRD5() <em>QRD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD5()
	 * @generated
	 * @ordered
	 */
	protected QRD5CONTENT qRD5;

	/**
	 * The cached value of the '{@link #getQRD6() <em>QRD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD6()
	 * @generated
	 * @ordered
	 */
	protected QRD6CONTENT qRD6;

	/**
	 * The cached value of the '{@link #getQRD7() <em>QRD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD7()
	 * @generated
	 * @ordered
	 */
	protected QRD7CONTENT qRD7;

	/**
	 * The cached value of the '{@link #getQRD8() <em>QRD8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD8()
	 * @generated
	 * @ordered
	 */
	protected EList<QRD8CONTENT> qRD8;

	/**
	 * The cached value of the '{@link #getQRD9() <em>QRD9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD9()
	 * @generated
	 * @ordered
	 */
	protected EList<QRD9CONTENT> qRD9;

	/**
	 * The cached value of the '{@link #getQRD10() <em>QRD10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD10()
	 * @generated
	 * @ordered
	 */
	protected EList<QRD10CONTENT> qRD10;

	/**
	 * The cached value of the '{@link #getQRD11() <em>QRD11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD11()
	 * @generated
	 * @ordered
	 */
	protected EList<QRD11CONTENT> qRD11;

	/**
	 * The cached value of the '{@link #getQRD12() <em>QRD12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQRD12()
	 * @generated
	 * @ordered
	 */
	protected QRD12CONTENT qRD12;

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
	protected QRDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getQRDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD1CONTENT getQRD1() {
		return qRD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD1(QRD1CONTENT newQRD1, NotificationChain msgs) {
		QRD1CONTENT oldQRD1 = qRD1;
		qRD1 = newQRD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD1, oldQRD1, newQRD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD1(QRD1CONTENT newQRD1) {
		if (newQRD1 != qRD1) {
			NotificationChain msgs = null;
			if (qRD1 != null)
				msgs = ((InternalEObject)qRD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD1, null, msgs);
			if (newQRD1 != null)
				msgs = ((InternalEObject)newQRD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD1, null, msgs);
			msgs = basicSetQRD1(newQRD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD1, newQRD1, newQRD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD2CONTENT getQRD2() {
		return qRD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD2(QRD2CONTENT newQRD2, NotificationChain msgs) {
		QRD2CONTENT oldQRD2 = qRD2;
		qRD2 = newQRD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD2, oldQRD2, newQRD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD2(QRD2CONTENT newQRD2) {
		if (newQRD2 != qRD2) {
			NotificationChain msgs = null;
			if (qRD2 != null)
				msgs = ((InternalEObject)qRD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD2, null, msgs);
			if (newQRD2 != null)
				msgs = ((InternalEObject)newQRD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD2, null, msgs);
			msgs = basicSetQRD2(newQRD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD2, newQRD2, newQRD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD3CONTENT getQRD3() {
		return qRD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD3(QRD3CONTENT newQRD3, NotificationChain msgs) {
		QRD3CONTENT oldQRD3 = qRD3;
		qRD3 = newQRD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD3, oldQRD3, newQRD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD3(QRD3CONTENT newQRD3) {
		if (newQRD3 != qRD3) {
			NotificationChain msgs = null;
			if (qRD3 != null)
				msgs = ((InternalEObject)qRD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD3, null, msgs);
			if (newQRD3 != null)
				msgs = ((InternalEObject)newQRD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD3, null, msgs);
			msgs = basicSetQRD3(newQRD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD3, newQRD3, newQRD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD4CONTENT getQRD4() {
		return qRD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD4(QRD4CONTENT newQRD4, NotificationChain msgs) {
		QRD4CONTENT oldQRD4 = qRD4;
		qRD4 = newQRD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD4, oldQRD4, newQRD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD4(QRD4CONTENT newQRD4) {
		if (newQRD4 != qRD4) {
			NotificationChain msgs = null;
			if (qRD4 != null)
				msgs = ((InternalEObject)qRD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD4, null, msgs);
			if (newQRD4 != null)
				msgs = ((InternalEObject)newQRD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD4, null, msgs);
			msgs = basicSetQRD4(newQRD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD4, newQRD4, newQRD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD5CONTENT getQRD5() {
		return qRD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD5(QRD5CONTENT newQRD5, NotificationChain msgs) {
		QRD5CONTENT oldQRD5 = qRD5;
		qRD5 = newQRD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD5, oldQRD5, newQRD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD5(QRD5CONTENT newQRD5) {
		if (newQRD5 != qRD5) {
			NotificationChain msgs = null;
			if (qRD5 != null)
				msgs = ((InternalEObject)qRD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD5, null, msgs);
			if (newQRD5 != null)
				msgs = ((InternalEObject)newQRD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD5, null, msgs);
			msgs = basicSetQRD5(newQRD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD5, newQRD5, newQRD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD6CONTENT getQRD6() {
		return qRD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD6(QRD6CONTENT newQRD6, NotificationChain msgs) {
		QRD6CONTENT oldQRD6 = qRD6;
		qRD6 = newQRD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD6, oldQRD6, newQRD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD6(QRD6CONTENT newQRD6) {
		if (newQRD6 != qRD6) {
			NotificationChain msgs = null;
			if (qRD6 != null)
				msgs = ((InternalEObject)qRD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD6, null, msgs);
			if (newQRD6 != null)
				msgs = ((InternalEObject)newQRD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD6, null, msgs);
			msgs = basicSetQRD6(newQRD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD6, newQRD6, newQRD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD7CONTENT getQRD7() {
		return qRD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD7(QRD7CONTENT newQRD7, NotificationChain msgs) {
		QRD7CONTENT oldQRD7 = qRD7;
		qRD7 = newQRD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD7, oldQRD7, newQRD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD7(QRD7CONTENT newQRD7) {
		if (newQRD7 != qRD7) {
			NotificationChain msgs = null;
			if (qRD7 != null)
				msgs = ((InternalEObject)qRD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD7, null, msgs);
			if (newQRD7 != null)
				msgs = ((InternalEObject)newQRD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD7, null, msgs);
			msgs = basicSetQRD7(newQRD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD7, newQRD7, newQRD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRD8CONTENT> getQRD8() {
		if (qRD8 == null) {
			qRD8 = new EObjectContainmentEList<QRD8CONTENT>(QRD8CONTENT.class, this, V2xmlPackage.QRDCONTENT__QRD8);
		}
		return qRD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRD9CONTENT> getQRD9() {
		if (qRD9 == null) {
			qRD9 = new EObjectContainmentEList<QRD9CONTENT>(QRD9CONTENT.class, this, V2xmlPackage.QRDCONTENT__QRD9);
		}
		return qRD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRD10CONTENT> getQRD10() {
		if (qRD10 == null) {
			qRD10 = new EObjectContainmentEList<QRD10CONTENT>(QRD10CONTENT.class, this, V2xmlPackage.QRDCONTENT__QRD10);
		}
		return qRD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QRD11CONTENT> getQRD11() {
		if (qRD11 == null) {
			qRD11 = new EObjectContainmentEList<QRD11CONTENT>(QRD11CONTENT.class, this, V2xmlPackage.QRDCONTENT__QRD11);
		}
		return qRD11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QRD12CONTENT getQRD12() {
		return qRD12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQRD12(QRD12CONTENT newQRD12, NotificationChain msgs) {
		QRD12CONTENT oldQRD12 = qRD12;
		qRD12 = newQRD12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD12, oldQRD12, newQRD12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQRD12(QRD12CONTENT newQRD12) {
		if (newQRD12 != qRD12) {
			NotificationChain msgs = null;
			if (qRD12 != null)
				msgs = ((InternalEObject)qRD12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD12, null, msgs);
			if (newQRD12 != null)
				msgs = ((InternalEObject)newQRD12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.QRDCONTENT__QRD12, null, msgs);
			msgs = basicSetQRD12(newQRD12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.QRDCONTENT__QRD12, newQRD12, newQRD12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.QRDCONTENT__ANY);
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
			case V2xmlPackage.QRDCONTENT__QRD1:
				return basicSetQRD1(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD2:
				return basicSetQRD2(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD3:
				return basicSetQRD3(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD4:
				return basicSetQRD4(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD5:
				return basicSetQRD5(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD6:
				return basicSetQRD6(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD7:
				return basicSetQRD7(null, msgs);
			case V2xmlPackage.QRDCONTENT__QRD8:
				return ((InternalEList<?>)getQRD8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRDCONTENT__QRD9:
				return ((InternalEList<?>)getQRD9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRDCONTENT__QRD10:
				return ((InternalEList<?>)getQRD10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRDCONTENT__QRD11:
				return ((InternalEList<?>)getQRD11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.QRDCONTENT__QRD12:
				return basicSetQRD12(null, msgs);
			case V2xmlPackage.QRDCONTENT__ANY:
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
			case V2xmlPackage.QRDCONTENT__QRD1:
				return getQRD1();
			case V2xmlPackage.QRDCONTENT__QRD2:
				return getQRD2();
			case V2xmlPackage.QRDCONTENT__QRD3:
				return getQRD3();
			case V2xmlPackage.QRDCONTENT__QRD4:
				return getQRD4();
			case V2xmlPackage.QRDCONTENT__QRD5:
				return getQRD5();
			case V2xmlPackage.QRDCONTENT__QRD6:
				return getQRD6();
			case V2xmlPackage.QRDCONTENT__QRD7:
				return getQRD7();
			case V2xmlPackage.QRDCONTENT__QRD8:
				return getQRD8();
			case V2xmlPackage.QRDCONTENT__QRD9:
				return getQRD9();
			case V2xmlPackage.QRDCONTENT__QRD10:
				return getQRD10();
			case V2xmlPackage.QRDCONTENT__QRD11:
				return getQRD11();
			case V2xmlPackage.QRDCONTENT__QRD12:
				return getQRD12();
			case V2xmlPackage.QRDCONTENT__ANY:
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
			case V2xmlPackage.QRDCONTENT__QRD1:
				setQRD1((QRD1CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD2:
				setQRD2((QRD2CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD3:
				setQRD3((QRD3CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD4:
				setQRD4((QRD4CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD5:
				setQRD5((QRD5CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD6:
				setQRD6((QRD6CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD7:
				setQRD7((QRD7CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD8:
				getQRD8().clear();
				getQRD8().addAll((Collection<? extends QRD8CONTENT>)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD9:
				getQRD9().clear();
				getQRD9().addAll((Collection<? extends QRD9CONTENT>)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD10:
				getQRD10().clear();
				getQRD10().addAll((Collection<? extends QRD10CONTENT>)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD11:
				getQRD11().clear();
				getQRD11().addAll((Collection<? extends QRD11CONTENT>)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__QRD12:
				setQRD12((QRD12CONTENT)newValue);
				return;
			case V2xmlPackage.QRDCONTENT__ANY:
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
			case V2xmlPackage.QRDCONTENT__QRD1:
				setQRD1((QRD1CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD2:
				setQRD2((QRD2CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD3:
				setQRD3((QRD3CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD4:
				setQRD4((QRD4CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD5:
				setQRD5((QRD5CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD6:
				setQRD6((QRD6CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD7:
				setQRD7((QRD7CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__QRD8:
				getQRD8().clear();
				return;
			case V2xmlPackage.QRDCONTENT__QRD9:
				getQRD9().clear();
				return;
			case V2xmlPackage.QRDCONTENT__QRD10:
				getQRD10().clear();
				return;
			case V2xmlPackage.QRDCONTENT__QRD11:
				getQRD11().clear();
				return;
			case V2xmlPackage.QRDCONTENT__QRD12:
				setQRD12((QRD12CONTENT)null);
				return;
			case V2xmlPackage.QRDCONTENT__ANY:
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
			case V2xmlPackage.QRDCONTENT__QRD1:
				return qRD1 != null;
			case V2xmlPackage.QRDCONTENT__QRD2:
				return qRD2 != null;
			case V2xmlPackage.QRDCONTENT__QRD3:
				return qRD3 != null;
			case V2xmlPackage.QRDCONTENT__QRD4:
				return qRD4 != null;
			case V2xmlPackage.QRDCONTENT__QRD5:
				return qRD5 != null;
			case V2xmlPackage.QRDCONTENT__QRD6:
				return qRD6 != null;
			case V2xmlPackage.QRDCONTENT__QRD7:
				return qRD7 != null;
			case V2xmlPackage.QRDCONTENT__QRD8:
				return qRD8 != null && !qRD8.isEmpty();
			case V2xmlPackage.QRDCONTENT__QRD9:
				return qRD9 != null && !qRD9.isEmpty();
			case V2xmlPackage.QRDCONTENT__QRD10:
				return qRD10 != null && !qRD10.isEmpty();
			case V2xmlPackage.QRDCONTENT__QRD11:
				return qRD11 != null && !qRD11.isEmpty();
			case V2xmlPackage.QRDCONTENT__QRD12:
				return qRD12 != null;
			case V2xmlPackage.QRDCONTENT__ANY:
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

} //QRDCONTENTImpl
