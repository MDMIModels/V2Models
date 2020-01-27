/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.V2xmlPackage;
import org.hl7.v2xml.XAD;
import org.hl7.v2xml.XAD10CONTENT;
import org.hl7.v2xml.XAD11CONTENT;
import org.hl7.v2xml.XAD12CONTENT;
import org.hl7.v2xml.XAD13CONTENT;
import org.hl7.v2xml.XAD14CONTENT;
import org.hl7.v2xml.XAD1CONTENT;
import org.hl7.v2xml.XAD2CONTENT;
import org.hl7.v2xml.XAD3CONTENT;
import org.hl7.v2xml.XAD4CONTENT;
import org.hl7.v2xml.XAD5CONTENT;
import org.hl7.v2xml.XAD6CONTENT;
import org.hl7.v2xml.XAD7CONTENT;
import org.hl7.v2xml.XAD8CONTENT;
import org.hl7.v2xml.XAD9CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XAD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD1 <em>XAD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD2 <em>XAD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD3 <em>XAD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD4 <em>XAD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD5 <em>XAD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD6 <em>XAD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD7 <em>XAD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD8 <em>XAD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD9 <em>XAD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD10 <em>XAD10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD11 <em>XAD11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD12 <em>XAD12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD13 <em>XAD13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XADImpl#getXAD14 <em>XAD14</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XADImpl extends EObjectImpl implements XAD {
	/**
	 * The cached value of the '{@link #getXAD1() <em>XAD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD1()
	 * @generated
	 * @ordered
	 */
	protected XAD1CONTENT xAD1;

	/**
	 * The cached value of the '{@link #getXAD2() <em>XAD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD2()
	 * @generated
	 * @ordered
	 */
	protected XAD2CONTENT xAD2;

	/**
	 * The cached value of the '{@link #getXAD3() <em>XAD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD3()
	 * @generated
	 * @ordered
	 */
	protected XAD3CONTENT xAD3;

	/**
	 * The cached value of the '{@link #getXAD4() <em>XAD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD4()
	 * @generated
	 * @ordered
	 */
	protected XAD4CONTENT xAD4;

	/**
	 * The cached value of the '{@link #getXAD5() <em>XAD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD5()
	 * @generated
	 * @ordered
	 */
	protected XAD5CONTENT xAD5;

	/**
	 * The cached value of the '{@link #getXAD6() <em>XAD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD6()
	 * @generated
	 * @ordered
	 */
	protected XAD6CONTENT xAD6;

	/**
	 * The cached value of the '{@link #getXAD7() <em>XAD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD7()
	 * @generated
	 * @ordered
	 */
	protected XAD7CONTENT xAD7;

	/**
	 * The cached value of the '{@link #getXAD8() <em>XAD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD8()
	 * @generated
	 * @ordered
	 */
	protected XAD8CONTENT xAD8;

	/**
	 * The cached value of the '{@link #getXAD9() <em>XAD9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD9()
	 * @generated
	 * @ordered
	 */
	protected XAD9CONTENT xAD9;

	/**
	 * The cached value of the '{@link #getXAD10() <em>XAD10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD10()
	 * @generated
	 * @ordered
	 */
	protected XAD10CONTENT xAD10;

	/**
	 * The cached value of the '{@link #getXAD11() <em>XAD11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD11()
	 * @generated
	 * @ordered
	 */
	protected XAD11CONTENT xAD11;

	/**
	 * The cached value of the '{@link #getXAD12() <em>XAD12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD12()
	 * @generated
	 * @ordered
	 */
	protected XAD12CONTENT xAD12;

	/**
	 * The cached value of the '{@link #getXAD13() <em>XAD13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD13()
	 * @generated
	 * @ordered
	 */
	protected XAD13CONTENT xAD13;

	/**
	 * The cached value of the '{@link #getXAD14() <em>XAD14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXAD14()
	 * @generated
	 * @ordered
	 */
	protected XAD14CONTENT xAD14;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getXAD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD1CONTENT getXAD1() {
		return xAD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD1(XAD1CONTENT newXAD1, NotificationChain msgs) {
		XAD1CONTENT oldXAD1 = xAD1;
		xAD1 = newXAD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD1, oldXAD1, newXAD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD1(XAD1CONTENT newXAD1) {
		if (newXAD1 != xAD1) {
			NotificationChain msgs = null;
			if (xAD1 != null)
				msgs = ((InternalEObject)xAD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD1, null, msgs);
			if (newXAD1 != null)
				msgs = ((InternalEObject)newXAD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD1, null, msgs);
			msgs = basicSetXAD1(newXAD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD1, newXAD1, newXAD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD2CONTENT getXAD2() {
		return xAD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD2(XAD2CONTENT newXAD2, NotificationChain msgs) {
		XAD2CONTENT oldXAD2 = xAD2;
		xAD2 = newXAD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD2, oldXAD2, newXAD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD2(XAD2CONTENT newXAD2) {
		if (newXAD2 != xAD2) {
			NotificationChain msgs = null;
			if (xAD2 != null)
				msgs = ((InternalEObject)xAD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD2, null, msgs);
			if (newXAD2 != null)
				msgs = ((InternalEObject)newXAD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD2, null, msgs);
			msgs = basicSetXAD2(newXAD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD2, newXAD2, newXAD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD3CONTENT getXAD3() {
		return xAD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD3(XAD3CONTENT newXAD3, NotificationChain msgs) {
		XAD3CONTENT oldXAD3 = xAD3;
		xAD3 = newXAD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD3, oldXAD3, newXAD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD3(XAD3CONTENT newXAD3) {
		if (newXAD3 != xAD3) {
			NotificationChain msgs = null;
			if (xAD3 != null)
				msgs = ((InternalEObject)xAD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD3, null, msgs);
			if (newXAD3 != null)
				msgs = ((InternalEObject)newXAD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD3, null, msgs);
			msgs = basicSetXAD3(newXAD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD3, newXAD3, newXAD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD4CONTENT getXAD4() {
		return xAD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD4(XAD4CONTENT newXAD4, NotificationChain msgs) {
		XAD4CONTENT oldXAD4 = xAD4;
		xAD4 = newXAD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD4, oldXAD4, newXAD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD4(XAD4CONTENT newXAD4) {
		if (newXAD4 != xAD4) {
			NotificationChain msgs = null;
			if (xAD4 != null)
				msgs = ((InternalEObject)xAD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD4, null, msgs);
			if (newXAD4 != null)
				msgs = ((InternalEObject)newXAD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD4, null, msgs);
			msgs = basicSetXAD4(newXAD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD4, newXAD4, newXAD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD5CONTENT getXAD5() {
		return xAD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD5(XAD5CONTENT newXAD5, NotificationChain msgs) {
		XAD5CONTENT oldXAD5 = xAD5;
		xAD5 = newXAD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD5, oldXAD5, newXAD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD5(XAD5CONTENT newXAD5) {
		if (newXAD5 != xAD5) {
			NotificationChain msgs = null;
			if (xAD5 != null)
				msgs = ((InternalEObject)xAD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD5, null, msgs);
			if (newXAD5 != null)
				msgs = ((InternalEObject)newXAD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD5, null, msgs);
			msgs = basicSetXAD5(newXAD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD5, newXAD5, newXAD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD6CONTENT getXAD6() {
		return xAD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD6(XAD6CONTENT newXAD6, NotificationChain msgs) {
		XAD6CONTENT oldXAD6 = xAD6;
		xAD6 = newXAD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD6, oldXAD6, newXAD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD6(XAD6CONTENT newXAD6) {
		if (newXAD6 != xAD6) {
			NotificationChain msgs = null;
			if (xAD6 != null)
				msgs = ((InternalEObject)xAD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD6, null, msgs);
			if (newXAD6 != null)
				msgs = ((InternalEObject)newXAD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD6, null, msgs);
			msgs = basicSetXAD6(newXAD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD6, newXAD6, newXAD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD7CONTENT getXAD7() {
		return xAD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD7(XAD7CONTENT newXAD7, NotificationChain msgs) {
		XAD7CONTENT oldXAD7 = xAD7;
		xAD7 = newXAD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD7, oldXAD7, newXAD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD7(XAD7CONTENT newXAD7) {
		if (newXAD7 != xAD7) {
			NotificationChain msgs = null;
			if (xAD7 != null)
				msgs = ((InternalEObject)xAD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD7, null, msgs);
			if (newXAD7 != null)
				msgs = ((InternalEObject)newXAD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD7, null, msgs);
			msgs = basicSetXAD7(newXAD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD7, newXAD7, newXAD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD8CONTENT getXAD8() {
		return xAD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD8(XAD8CONTENT newXAD8, NotificationChain msgs) {
		XAD8CONTENT oldXAD8 = xAD8;
		xAD8 = newXAD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD8, oldXAD8, newXAD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD8(XAD8CONTENT newXAD8) {
		if (newXAD8 != xAD8) {
			NotificationChain msgs = null;
			if (xAD8 != null)
				msgs = ((InternalEObject)xAD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD8, null, msgs);
			if (newXAD8 != null)
				msgs = ((InternalEObject)newXAD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD8, null, msgs);
			msgs = basicSetXAD8(newXAD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD8, newXAD8, newXAD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD9CONTENT getXAD9() {
		return xAD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD9(XAD9CONTENT newXAD9, NotificationChain msgs) {
		XAD9CONTENT oldXAD9 = xAD9;
		xAD9 = newXAD9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD9, oldXAD9, newXAD9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD9(XAD9CONTENT newXAD9) {
		if (newXAD9 != xAD9) {
			NotificationChain msgs = null;
			if (xAD9 != null)
				msgs = ((InternalEObject)xAD9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD9, null, msgs);
			if (newXAD9 != null)
				msgs = ((InternalEObject)newXAD9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD9, null, msgs);
			msgs = basicSetXAD9(newXAD9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD9, newXAD9, newXAD9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD10CONTENT getXAD10() {
		return xAD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD10(XAD10CONTENT newXAD10, NotificationChain msgs) {
		XAD10CONTENT oldXAD10 = xAD10;
		xAD10 = newXAD10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD10, oldXAD10, newXAD10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD10(XAD10CONTENT newXAD10) {
		if (newXAD10 != xAD10) {
			NotificationChain msgs = null;
			if (xAD10 != null)
				msgs = ((InternalEObject)xAD10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD10, null, msgs);
			if (newXAD10 != null)
				msgs = ((InternalEObject)newXAD10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD10, null, msgs);
			msgs = basicSetXAD10(newXAD10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD10, newXAD10, newXAD10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD11CONTENT getXAD11() {
		return xAD11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD11(XAD11CONTENT newXAD11, NotificationChain msgs) {
		XAD11CONTENT oldXAD11 = xAD11;
		xAD11 = newXAD11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD11, oldXAD11, newXAD11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD11(XAD11CONTENT newXAD11) {
		if (newXAD11 != xAD11) {
			NotificationChain msgs = null;
			if (xAD11 != null)
				msgs = ((InternalEObject)xAD11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD11, null, msgs);
			if (newXAD11 != null)
				msgs = ((InternalEObject)newXAD11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD11, null, msgs);
			msgs = basicSetXAD11(newXAD11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD11, newXAD11, newXAD11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD12CONTENT getXAD12() {
		return xAD12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD12(XAD12CONTENT newXAD12, NotificationChain msgs) {
		XAD12CONTENT oldXAD12 = xAD12;
		xAD12 = newXAD12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD12, oldXAD12, newXAD12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD12(XAD12CONTENT newXAD12) {
		if (newXAD12 != xAD12) {
			NotificationChain msgs = null;
			if (xAD12 != null)
				msgs = ((InternalEObject)xAD12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD12, null, msgs);
			if (newXAD12 != null)
				msgs = ((InternalEObject)newXAD12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD12, null, msgs);
			msgs = basicSetXAD12(newXAD12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD12, newXAD12, newXAD12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD13CONTENT getXAD13() {
		return xAD13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD13(XAD13CONTENT newXAD13, NotificationChain msgs) {
		XAD13CONTENT oldXAD13 = xAD13;
		xAD13 = newXAD13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD13, oldXAD13, newXAD13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD13(XAD13CONTENT newXAD13) {
		if (newXAD13 != xAD13) {
			NotificationChain msgs = null;
			if (xAD13 != null)
				msgs = ((InternalEObject)xAD13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD13, null, msgs);
			if (newXAD13 != null)
				msgs = ((InternalEObject)newXAD13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD13, null, msgs);
			msgs = basicSetXAD13(newXAD13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD13, newXAD13, newXAD13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAD14CONTENT getXAD14() {
		return xAD14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXAD14(XAD14CONTENT newXAD14, NotificationChain msgs) {
		XAD14CONTENT oldXAD14 = xAD14;
		xAD14 = newXAD14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD14, oldXAD14, newXAD14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXAD14(XAD14CONTENT newXAD14) {
		if (newXAD14 != xAD14) {
			NotificationChain msgs = null;
			if (xAD14 != null)
				msgs = ((InternalEObject)xAD14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD14, null, msgs);
			if (newXAD14 != null)
				msgs = ((InternalEObject)newXAD14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XAD__XAD14, null, msgs);
			msgs = basicSetXAD14(newXAD14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XAD__XAD14, newXAD14, newXAD14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.XAD__XAD1:
				return basicSetXAD1(null, msgs);
			case V2xmlPackage.XAD__XAD2:
				return basicSetXAD2(null, msgs);
			case V2xmlPackage.XAD__XAD3:
				return basicSetXAD3(null, msgs);
			case V2xmlPackage.XAD__XAD4:
				return basicSetXAD4(null, msgs);
			case V2xmlPackage.XAD__XAD5:
				return basicSetXAD5(null, msgs);
			case V2xmlPackage.XAD__XAD6:
				return basicSetXAD6(null, msgs);
			case V2xmlPackage.XAD__XAD7:
				return basicSetXAD7(null, msgs);
			case V2xmlPackage.XAD__XAD8:
				return basicSetXAD8(null, msgs);
			case V2xmlPackage.XAD__XAD9:
				return basicSetXAD9(null, msgs);
			case V2xmlPackage.XAD__XAD10:
				return basicSetXAD10(null, msgs);
			case V2xmlPackage.XAD__XAD11:
				return basicSetXAD11(null, msgs);
			case V2xmlPackage.XAD__XAD12:
				return basicSetXAD12(null, msgs);
			case V2xmlPackage.XAD__XAD13:
				return basicSetXAD13(null, msgs);
			case V2xmlPackage.XAD__XAD14:
				return basicSetXAD14(null, msgs);
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
			case V2xmlPackage.XAD__XAD1:
				return getXAD1();
			case V2xmlPackage.XAD__XAD2:
				return getXAD2();
			case V2xmlPackage.XAD__XAD3:
				return getXAD3();
			case V2xmlPackage.XAD__XAD4:
				return getXAD4();
			case V2xmlPackage.XAD__XAD5:
				return getXAD5();
			case V2xmlPackage.XAD__XAD6:
				return getXAD6();
			case V2xmlPackage.XAD__XAD7:
				return getXAD7();
			case V2xmlPackage.XAD__XAD8:
				return getXAD8();
			case V2xmlPackage.XAD__XAD9:
				return getXAD9();
			case V2xmlPackage.XAD__XAD10:
				return getXAD10();
			case V2xmlPackage.XAD__XAD11:
				return getXAD11();
			case V2xmlPackage.XAD__XAD12:
				return getXAD12();
			case V2xmlPackage.XAD__XAD13:
				return getXAD13();
			case V2xmlPackage.XAD__XAD14:
				return getXAD14();
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
			case V2xmlPackage.XAD__XAD1:
				setXAD1((XAD1CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD2:
				setXAD2((XAD2CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD3:
				setXAD3((XAD3CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD4:
				setXAD4((XAD4CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD5:
				setXAD5((XAD5CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD6:
				setXAD6((XAD6CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD7:
				setXAD7((XAD7CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD8:
				setXAD8((XAD8CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD9:
				setXAD9((XAD9CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD10:
				setXAD10((XAD10CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD11:
				setXAD11((XAD11CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD12:
				setXAD12((XAD12CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD13:
				setXAD13((XAD13CONTENT)newValue);
				return;
			case V2xmlPackage.XAD__XAD14:
				setXAD14((XAD14CONTENT)newValue);
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
			case V2xmlPackage.XAD__XAD1:
				setXAD1((XAD1CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD2:
				setXAD2((XAD2CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD3:
				setXAD3((XAD3CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD4:
				setXAD4((XAD4CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD5:
				setXAD5((XAD5CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD6:
				setXAD6((XAD6CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD7:
				setXAD7((XAD7CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD8:
				setXAD8((XAD8CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD9:
				setXAD9((XAD9CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD10:
				setXAD10((XAD10CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD11:
				setXAD11((XAD11CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD12:
				setXAD12((XAD12CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD13:
				setXAD13((XAD13CONTENT)null);
				return;
			case V2xmlPackage.XAD__XAD14:
				setXAD14((XAD14CONTENT)null);
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
			case V2xmlPackage.XAD__XAD1:
				return xAD1 != null;
			case V2xmlPackage.XAD__XAD2:
				return xAD2 != null;
			case V2xmlPackage.XAD__XAD3:
				return xAD3 != null;
			case V2xmlPackage.XAD__XAD4:
				return xAD4 != null;
			case V2xmlPackage.XAD__XAD5:
				return xAD5 != null;
			case V2xmlPackage.XAD__XAD6:
				return xAD6 != null;
			case V2xmlPackage.XAD__XAD7:
				return xAD7 != null;
			case V2xmlPackage.XAD__XAD8:
				return xAD8 != null;
			case V2xmlPackage.XAD__XAD9:
				return xAD9 != null;
			case V2xmlPackage.XAD__XAD10:
				return xAD10 != null;
			case V2xmlPackage.XAD__XAD11:
				return xAD11 != null;
			case V2xmlPackage.XAD__XAD12:
				return xAD12 != null;
			case V2xmlPackage.XAD__XAD13:
				return xAD13 != null;
			case V2xmlPackage.XAD__XAD14:
				return xAD14 != null;
		}
		return super.eIsSet(featureID);
	}

} //XADImpl
