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
import org.hl7.v2xml.XTN;
import org.hl7.v2xml.XTN10CONTENT;
import org.hl7.v2xml.XTN11CONTENT;
import org.hl7.v2xml.XTN12CONTENT;
import org.hl7.v2xml.XTN1CONTENT;
import org.hl7.v2xml.XTN2CONTENT;
import org.hl7.v2xml.XTN3CONTENT;
import org.hl7.v2xml.XTN4CONTENT;
import org.hl7.v2xml.XTN5CONTENT;
import org.hl7.v2xml.XTN6CONTENT;
import org.hl7.v2xml.XTN7CONTENT;
import org.hl7.v2xml.XTN8CONTENT;
import org.hl7.v2xml.XTN9CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XTN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN1 <em>XTN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN2 <em>XTN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN3 <em>XTN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN4 <em>XTN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN5 <em>XTN5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN6 <em>XTN6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN7 <em>XTN7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN8 <em>XTN8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN9 <em>XTN9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN10 <em>XTN10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN11 <em>XTN11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XTNImpl#getXTN12 <em>XTN12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTNImpl extends EObjectImpl implements XTN {
	/**
	 * The cached value of the '{@link #getXTN1() <em>XTN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN1()
	 * @generated
	 * @ordered
	 */
	protected XTN1CONTENT xTN1;

	/**
	 * The cached value of the '{@link #getXTN2() <em>XTN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN2()
	 * @generated
	 * @ordered
	 */
	protected XTN2CONTENT xTN2;

	/**
	 * The cached value of the '{@link #getXTN3() <em>XTN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN3()
	 * @generated
	 * @ordered
	 */
	protected XTN3CONTENT xTN3;

	/**
	 * The cached value of the '{@link #getXTN4() <em>XTN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN4()
	 * @generated
	 * @ordered
	 */
	protected XTN4CONTENT xTN4;

	/**
	 * The cached value of the '{@link #getXTN5() <em>XTN5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN5()
	 * @generated
	 * @ordered
	 */
	protected XTN5CONTENT xTN5;

	/**
	 * The cached value of the '{@link #getXTN6() <em>XTN6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN6()
	 * @generated
	 * @ordered
	 */
	protected XTN6CONTENT xTN6;

	/**
	 * The cached value of the '{@link #getXTN7() <em>XTN7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN7()
	 * @generated
	 * @ordered
	 */
	protected XTN7CONTENT xTN7;

	/**
	 * The cached value of the '{@link #getXTN8() <em>XTN8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN8()
	 * @generated
	 * @ordered
	 */
	protected XTN8CONTENT xTN8;

	/**
	 * The cached value of the '{@link #getXTN9() <em>XTN9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN9()
	 * @generated
	 * @ordered
	 */
	protected XTN9CONTENT xTN9;

	/**
	 * The cached value of the '{@link #getXTN10() <em>XTN10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN10()
	 * @generated
	 * @ordered
	 */
	protected XTN10CONTENT xTN10;

	/**
	 * The cached value of the '{@link #getXTN11() <em>XTN11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN11()
	 * @generated
	 * @ordered
	 */
	protected XTN11CONTENT xTN11;

	/**
	 * The cached value of the '{@link #getXTN12() <em>XTN12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXTN12()
	 * @generated
	 * @ordered
	 */
	protected XTN12CONTENT xTN12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getXTN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN1CONTENT getXTN1() {
		return xTN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN1(XTN1CONTENT newXTN1, NotificationChain msgs) {
		XTN1CONTENT oldXTN1 = xTN1;
		xTN1 = newXTN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN1, oldXTN1, newXTN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN1(XTN1CONTENT newXTN1) {
		if (newXTN1 != xTN1) {
			NotificationChain msgs = null;
			if (xTN1 != null)
				msgs = ((InternalEObject)xTN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN1, null, msgs);
			if (newXTN1 != null)
				msgs = ((InternalEObject)newXTN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN1, null, msgs);
			msgs = basicSetXTN1(newXTN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN1, newXTN1, newXTN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN2CONTENT getXTN2() {
		return xTN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN2(XTN2CONTENT newXTN2, NotificationChain msgs) {
		XTN2CONTENT oldXTN2 = xTN2;
		xTN2 = newXTN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN2, oldXTN2, newXTN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN2(XTN2CONTENT newXTN2) {
		if (newXTN2 != xTN2) {
			NotificationChain msgs = null;
			if (xTN2 != null)
				msgs = ((InternalEObject)xTN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN2, null, msgs);
			if (newXTN2 != null)
				msgs = ((InternalEObject)newXTN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN2, null, msgs);
			msgs = basicSetXTN2(newXTN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN2, newXTN2, newXTN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN3CONTENT getXTN3() {
		return xTN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN3(XTN3CONTENT newXTN3, NotificationChain msgs) {
		XTN3CONTENT oldXTN3 = xTN3;
		xTN3 = newXTN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN3, oldXTN3, newXTN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN3(XTN3CONTENT newXTN3) {
		if (newXTN3 != xTN3) {
			NotificationChain msgs = null;
			if (xTN3 != null)
				msgs = ((InternalEObject)xTN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN3, null, msgs);
			if (newXTN3 != null)
				msgs = ((InternalEObject)newXTN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN3, null, msgs);
			msgs = basicSetXTN3(newXTN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN3, newXTN3, newXTN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN4CONTENT getXTN4() {
		return xTN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN4(XTN4CONTENT newXTN4, NotificationChain msgs) {
		XTN4CONTENT oldXTN4 = xTN4;
		xTN4 = newXTN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN4, oldXTN4, newXTN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN4(XTN4CONTENT newXTN4) {
		if (newXTN4 != xTN4) {
			NotificationChain msgs = null;
			if (xTN4 != null)
				msgs = ((InternalEObject)xTN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN4, null, msgs);
			if (newXTN4 != null)
				msgs = ((InternalEObject)newXTN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN4, null, msgs);
			msgs = basicSetXTN4(newXTN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN4, newXTN4, newXTN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN5CONTENT getXTN5() {
		return xTN5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN5(XTN5CONTENT newXTN5, NotificationChain msgs) {
		XTN5CONTENT oldXTN5 = xTN5;
		xTN5 = newXTN5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN5, oldXTN5, newXTN5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN5(XTN5CONTENT newXTN5) {
		if (newXTN5 != xTN5) {
			NotificationChain msgs = null;
			if (xTN5 != null)
				msgs = ((InternalEObject)xTN5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN5, null, msgs);
			if (newXTN5 != null)
				msgs = ((InternalEObject)newXTN5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN5, null, msgs);
			msgs = basicSetXTN5(newXTN5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN5, newXTN5, newXTN5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN6CONTENT getXTN6() {
		return xTN6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN6(XTN6CONTENT newXTN6, NotificationChain msgs) {
		XTN6CONTENT oldXTN6 = xTN6;
		xTN6 = newXTN6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN6, oldXTN6, newXTN6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN6(XTN6CONTENT newXTN6) {
		if (newXTN6 != xTN6) {
			NotificationChain msgs = null;
			if (xTN6 != null)
				msgs = ((InternalEObject)xTN6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN6, null, msgs);
			if (newXTN6 != null)
				msgs = ((InternalEObject)newXTN6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN6, null, msgs);
			msgs = basicSetXTN6(newXTN6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN6, newXTN6, newXTN6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN7CONTENT getXTN7() {
		return xTN7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN7(XTN7CONTENT newXTN7, NotificationChain msgs) {
		XTN7CONTENT oldXTN7 = xTN7;
		xTN7 = newXTN7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN7, oldXTN7, newXTN7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN7(XTN7CONTENT newXTN7) {
		if (newXTN7 != xTN7) {
			NotificationChain msgs = null;
			if (xTN7 != null)
				msgs = ((InternalEObject)xTN7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN7, null, msgs);
			if (newXTN7 != null)
				msgs = ((InternalEObject)newXTN7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN7, null, msgs);
			msgs = basicSetXTN7(newXTN7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN7, newXTN7, newXTN7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN8CONTENT getXTN8() {
		return xTN8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN8(XTN8CONTENT newXTN8, NotificationChain msgs) {
		XTN8CONTENT oldXTN8 = xTN8;
		xTN8 = newXTN8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN8, oldXTN8, newXTN8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN8(XTN8CONTENT newXTN8) {
		if (newXTN8 != xTN8) {
			NotificationChain msgs = null;
			if (xTN8 != null)
				msgs = ((InternalEObject)xTN8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN8, null, msgs);
			if (newXTN8 != null)
				msgs = ((InternalEObject)newXTN8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN8, null, msgs);
			msgs = basicSetXTN8(newXTN8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN8, newXTN8, newXTN8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN9CONTENT getXTN9() {
		return xTN9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN9(XTN9CONTENT newXTN9, NotificationChain msgs) {
		XTN9CONTENT oldXTN9 = xTN9;
		xTN9 = newXTN9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN9, oldXTN9, newXTN9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN9(XTN9CONTENT newXTN9) {
		if (newXTN9 != xTN9) {
			NotificationChain msgs = null;
			if (xTN9 != null)
				msgs = ((InternalEObject)xTN9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN9, null, msgs);
			if (newXTN9 != null)
				msgs = ((InternalEObject)newXTN9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN9, null, msgs);
			msgs = basicSetXTN9(newXTN9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN9, newXTN9, newXTN9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN10CONTENT getXTN10() {
		return xTN10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN10(XTN10CONTENT newXTN10, NotificationChain msgs) {
		XTN10CONTENT oldXTN10 = xTN10;
		xTN10 = newXTN10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN10, oldXTN10, newXTN10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN10(XTN10CONTENT newXTN10) {
		if (newXTN10 != xTN10) {
			NotificationChain msgs = null;
			if (xTN10 != null)
				msgs = ((InternalEObject)xTN10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN10, null, msgs);
			if (newXTN10 != null)
				msgs = ((InternalEObject)newXTN10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN10, null, msgs);
			msgs = basicSetXTN10(newXTN10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN10, newXTN10, newXTN10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN11CONTENT getXTN11() {
		return xTN11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN11(XTN11CONTENT newXTN11, NotificationChain msgs) {
		XTN11CONTENT oldXTN11 = xTN11;
		xTN11 = newXTN11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN11, oldXTN11, newXTN11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN11(XTN11CONTENT newXTN11) {
		if (newXTN11 != xTN11) {
			NotificationChain msgs = null;
			if (xTN11 != null)
				msgs = ((InternalEObject)xTN11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN11, null, msgs);
			if (newXTN11 != null)
				msgs = ((InternalEObject)newXTN11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN11, null, msgs);
			msgs = basicSetXTN11(newXTN11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN11, newXTN11, newXTN11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTN12CONTENT getXTN12() {
		return xTN12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXTN12(XTN12CONTENT newXTN12, NotificationChain msgs) {
		XTN12CONTENT oldXTN12 = xTN12;
		xTN12 = newXTN12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN12, oldXTN12, newXTN12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXTN12(XTN12CONTENT newXTN12) {
		if (newXTN12 != xTN12) {
			NotificationChain msgs = null;
			if (xTN12 != null)
				msgs = ((InternalEObject)xTN12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN12, null, msgs);
			if (newXTN12 != null)
				msgs = ((InternalEObject)newXTN12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XTN__XTN12, null, msgs);
			msgs = basicSetXTN12(newXTN12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XTN__XTN12, newXTN12, newXTN12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.XTN__XTN1:
				return basicSetXTN1(null, msgs);
			case V2xmlPackage.XTN__XTN2:
				return basicSetXTN2(null, msgs);
			case V2xmlPackage.XTN__XTN3:
				return basicSetXTN3(null, msgs);
			case V2xmlPackage.XTN__XTN4:
				return basicSetXTN4(null, msgs);
			case V2xmlPackage.XTN__XTN5:
				return basicSetXTN5(null, msgs);
			case V2xmlPackage.XTN__XTN6:
				return basicSetXTN6(null, msgs);
			case V2xmlPackage.XTN__XTN7:
				return basicSetXTN7(null, msgs);
			case V2xmlPackage.XTN__XTN8:
				return basicSetXTN8(null, msgs);
			case V2xmlPackage.XTN__XTN9:
				return basicSetXTN9(null, msgs);
			case V2xmlPackage.XTN__XTN10:
				return basicSetXTN10(null, msgs);
			case V2xmlPackage.XTN__XTN11:
				return basicSetXTN11(null, msgs);
			case V2xmlPackage.XTN__XTN12:
				return basicSetXTN12(null, msgs);
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
			case V2xmlPackage.XTN__XTN1:
				return getXTN1();
			case V2xmlPackage.XTN__XTN2:
				return getXTN2();
			case V2xmlPackage.XTN__XTN3:
				return getXTN3();
			case V2xmlPackage.XTN__XTN4:
				return getXTN4();
			case V2xmlPackage.XTN__XTN5:
				return getXTN5();
			case V2xmlPackage.XTN__XTN6:
				return getXTN6();
			case V2xmlPackage.XTN__XTN7:
				return getXTN7();
			case V2xmlPackage.XTN__XTN8:
				return getXTN8();
			case V2xmlPackage.XTN__XTN9:
				return getXTN9();
			case V2xmlPackage.XTN__XTN10:
				return getXTN10();
			case V2xmlPackage.XTN__XTN11:
				return getXTN11();
			case V2xmlPackage.XTN__XTN12:
				return getXTN12();
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
			case V2xmlPackage.XTN__XTN1:
				setXTN1((XTN1CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN2:
				setXTN2((XTN2CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN3:
				setXTN3((XTN3CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN4:
				setXTN4((XTN4CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN5:
				setXTN5((XTN5CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN6:
				setXTN6((XTN6CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN7:
				setXTN7((XTN7CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN8:
				setXTN8((XTN8CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN9:
				setXTN9((XTN9CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN10:
				setXTN10((XTN10CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN11:
				setXTN11((XTN11CONTENT)newValue);
				return;
			case V2xmlPackage.XTN__XTN12:
				setXTN12((XTN12CONTENT)newValue);
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
			case V2xmlPackage.XTN__XTN1:
				setXTN1((XTN1CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN2:
				setXTN2((XTN2CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN3:
				setXTN3((XTN3CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN4:
				setXTN4((XTN4CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN5:
				setXTN5((XTN5CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN6:
				setXTN6((XTN6CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN7:
				setXTN7((XTN7CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN8:
				setXTN8((XTN8CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN9:
				setXTN9((XTN9CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN10:
				setXTN10((XTN10CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN11:
				setXTN11((XTN11CONTENT)null);
				return;
			case V2xmlPackage.XTN__XTN12:
				setXTN12((XTN12CONTENT)null);
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
			case V2xmlPackage.XTN__XTN1:
				return xTN1 != null;
			case V2xmlPackage.XTN__XTN2:
				return xTN2 != null;
			case V2xmlPackage.XTN__XTN3:
				return xTN3 != null;
			case V2xmlPackage.XTN__XTN4:
				return xTN4 != null;
			case V2xmlPackage.XTN__XTN5:
				return xTN5 != null;
			case V2xmlPackage.XTN__XTN6:
				return xTN6 != null;
			case V2xmlPackage.XTN__XTN7:
				return xTN7 != null;
			case V2xmlPackage.XTN__XTN8:
				return xTN8 != null;
			case V2xmlPackage.XTN__XTN9:
				return xTN9 != null;
			case V2xmlPackage.XTN__XTN10:
				return xTN10 != null;
			case V2xmlPackage.XTN__XTN11:
				return xTN11 != null;
			case V2xmlPackage.XTN__XTN12:
				return xTN12 != null;
		}
		return super.eIsSet(featureID);
	}

} //XTNImpl
