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
import org.hl7.v2xml.XON;
import org.hl7.v2xml.XON10CONTENT;
import org.hl7.v2xml.XON1CONTENT;
import org.hl7.v2xml.XON2CONTENT;
import org.hl7.v2xml.XON3CONTENT;
import org.hl7.v2xml.XON4CONTENT;
import org.hl7.v2xml.XON5CONTENT;
import org.hl7.v2xml.XON6CONTENT;
import org.hl7.v2xml.XON7CONTENT;
import org.hl7.v2xml.XON8CONTENT;
import org.hl7.v2xml.XON9CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XON</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON1 <em>XON1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON2 <em>XON2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON3 <em>XON3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON4 <em>XON4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON5 <em>XON5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON6 <em>XON6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON7 <em>XON7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON8 <em>XON8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON9 <em>XON9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XONImpl#getXON10 <em>XON10</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XONImpl extends EObjectImpl implements XON {
	/**
	 * The cached value of the '{@link #getXON1() <em>XON1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON1()
	 * @generated
	 * @ordered
	 */
	protected XON1CONTENT xON1;

	/**
	 * The cached value of the '{@link #getXON2() <em>XON2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON2()
	 * @generated
	 * @ordered
	 */
	protected XON2CONTENT xON2;

	/**
	 * The cached value of the '{@link #getXON3() <em>XON3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON3()
	 * @generated
	 * @ordered
	 */
	protected XON3CONTENT xON3;

	/**
	 * The cached value of the '{@link #getXON4() <em>XON4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON4()
	 * @generated
	 * @ordered
	 */
	protected XON4CONTENT xON4;

	/**
	 * The cached value of the '{@link #getXON5() <em>XON5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON5()
	 * @generated
	 * @ordered
	 */
	protected XON5CONTENT xON5;

	/**
	 * The cached value of the '{@link #getXON6() <em>XON6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON6()
	 * @generated
	 * @ordered
	 */
	protected XON6CONTENT xON6;

	/**
	 * The cached value of the '{@link #getXON7() <em>XON7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON7()
	 * @generated
	 * @ordered
	 */
	protected XON7CONTENT xON7;

	/**
	 * The cached value of the '{@link #getXON8() <em>XON8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON8()
	 * @generated
	 * @ordered
	 */
	protected XON8CONTENT xON8;

	/**
	 * The cached value of the '{@link #getXON9() <em>XON9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON9()
	 * @generated
	 * @ordered
	 */
	protected XON9CONTENT xON9;

	/**
	 * The cached value of the '{@link #getXON10() <em>XON10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXON10()
	 * @generated
	 * @ordered
	 */
	protected XON10CONTENT xON10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getXON();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON1CONTENT getXON1() {
		return xON1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON1(XON1CONTENT newXON1, NotificationChain msgs) {
		XON1CONTENT oldXON1 = xON1;
		xON1 = newXON1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON1, oldXON1, newXON1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON1(XON1CONTENT newXON1) {
		if (newXON1 != xON1) {
			NotificationChain msgs = null;
			if (xON1 != null)
				msgs = ((InternalEObject)xON1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON1, null, msgs);
			if (newXON1 != null)
				msgs = ((InternalEObject)newXON1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON1, null, msgs);
			msgs = basicSetXON1(newXON1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON1, newXON1, newXON1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON2CONTENT getXON2() {
		return xON2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON2(XON2CONTENT newXON2, NotificationChain msgs) {
		XON2CONTENT oldXON2 = xON2;
		xON2 = newXON2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON2, oldXON2, newXON2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON2(XON2CONTENT newXON2) {
		if (newXON2 != xON2) {
			NotificationChain msgs = null;
			if (xON2 != null)
				msgs = ((InternalEObject)xON2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON2, null, msgs);
			if (newXON2 != null)
				msgs = ((InternalEObject)newXON2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON2, null, msgs);
			msgs = basicSetXON2(newXON2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON2, newXON2, newXON2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON3CONTENT getXON3() {
		return xON3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON3(XON3CONTENT newXON3, NotificationChain msgs) {
		XON3CONTENT oldXON3 = xON3;
		xON3 = newXON3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON3, oldXON3, newXON3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON3(XON3CONTENT newXON3) {
		if (newXON3 != xON3) {
			NotificationChain msgs = null;
			if (xON3 != null)
				msgs = ((InternalEObject)xON3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON3, null, msgs);
			if (newXON3 != null)
				msgs = ((InternalEObject)newXON3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON3, null, msgs);
			msgs = basicSetXON3(newXON3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON3, newXON3, newXON3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON4CONTENT getXON4() {
		return xON4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON4(XON4CONTENT newXON4, NotificationChain msgs) {
		XON4CONTENT oldXON4 = xON4;
		xON4 = newXON4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON4, oldXON4, newXON4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON4(XON4CONTENT newXON4) {
		if (newXON4 != xON4) {
			NotificationChain msgs = null;
			if (xON4 != null)
				msgs = ((InternalEObject)xON4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON4, null, msgs);
			if (newXON4 != null)
				msgs = ((InternalEObject)newXON4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON4, null, msgs);
			msgs = basicSetXON4(newXON4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON4, newXON4, newXON4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON5CONTENT getXON5() {
		return xON5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON5(XON5CONTENT newXON5, NotificationChain msgs) {
		XON5CONTENT oldXON5 = xON5;
		xON5 = newXON5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON5, oldXON5, newXON5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON5(XON5CONTENT newXON5) {
		if (newXON5 != xON5) {
			NotificationChain msgs = null;
			if (xON5 != null)
				msgs = ((InternalEObject)xON5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON5, null, msgs);
			if (newXON5 != null)
				msgs = ((InternalEObject)newXON5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON5, null, msgs);
			msgs = basicSetXON5(newXON5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON5, newXON5, newXON5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON6CONTENT getXON6() {
		return xON6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON6(XON6CONTENT newXON6, NotificationChain msgs) {
		XON6CONTENT oldXON6 = xON6;
		xON6 = newXON6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON6, oldXON6, newXON6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON6(XON6CONTENT newXON6) {
		if (newXON6 != xON6) {
			NotificationChain msgs = null;
			if (xON6 != null)
				msgs = ((InternalEObject)xON6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON6, null, msgs);
			if (newXON6 != null)
				msgs = ((InternalEObject)newXON6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON6, null, msgs);
			msgs = basicSetXON6(newXON6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON6, newXON6, newXON6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON7CONTENT getXON7() {
		return xON7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON7(XON7CONTENT newXON7, NotificationChain msgs) {
		XON7CONTENT oldXON7 = xON7;
		xON7 = newXON7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON7, oldXON7, newXON7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON7(XON7CONTENT newXON7) {
		if (newXON7 != xON7) {
			NotificationChain msgs = null;
			if (xON7 != null)
				msgs = ((InternalEObject)xON7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON7, null, msgs);
			if (newXON7 != null)
				msgs = ((InternalEObject)newXON7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON7, null, msgs);
			msgs = basicSetXON7(newXON7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON7, newXON7, newXON7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON8CONTENT getXON8() {
		return xON8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON8(XON8CONTENT newXON8, NotificationChain msgs) {
		XON8CONTENT oldXON8 = xON8;
		xON8 = newXON8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON8, oldXON8, newXON8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON8(XON8CONTENT newXON8) {
		if (newXON8 != xON8) {
			NotificationChain msgs = null;
			if (xON8 != null)
				msgs = ((InternalEObject)xON8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON8, null, msgs);
			if (newXON8 != null)
				msgs = ((InternalEObject)newXON8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON8, null, msgs);
			msgs = basicSetXON8(newXON8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON8, newXON8, newXON8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON9CONTENT getXON9() {
		return xON9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON9(XON9CONTENT newXON9, NotificationChain msgs) {
		XON9CONTENT oldXON9 = xON9;
		xON9 = newXON9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON9, oldXON9, newXON9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON9(XON9CONTENT newXON9) {
		if (newXON9 != xON9) {
			NotificationChain msgs = null;
			if (xON9 != null)
				msgs = ((InternalEObject)xON9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON9, null, msgs);
			if (newXON9 != null)
				msgs = ((InternalEObject)newXON9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON9, null, msgs);
			msgs = basicSetXON9(newXON9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON9, newXON9, newXON9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XON10CONTENT getXON10() {
		return xON10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXON10(XON10CONTENT newXON10, NotificationChain msgs) {
		XON10CONTENT oldXON10 = xON10;
		xON10 = newXON10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON10, oldXON10, newXON10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXON10(XON10CONTENT newXON10) {
		if (newXON10 != xON10) {
			NotificationChain msgs = null;
			if (xON10 != null)
				msgs = ((InternalEObject)xON10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON10, null, msgs);
			if (newXON10 != null)
				msgs = ((InternalEObject)newXON10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XON__XON10, null, msgs);
			msgs = basicSetXON10(newXON10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XON__XON10, newXON10, newXON10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.XON__XON1:
				return basicSetXON1(null, msgs);
			case V2xmlPackage.XON__XON2:
				return basicSetXON2(null, msgs);
			case V2xmlPackage.XON__XON3:
				return basicSetXON3(null, msgs);
			case V2xmlPackage.XON__XON4:
				return basicSetXON4(null, msgs);
			case V2xmlPackage.XON__XON5:
				return basicSetXON5(null, msgs);
			case V2xmlPackage.XON__XON6:
				return basicSetXON6(null, msgs);
			case V2xmlPackage.XON__XON7:
				return basicSetXON7(null, msgs);
			case V2xmlPackage.XON__XON8:
				return basicSetXON8(null, msgs);
			case V2xmlPackage.XON__XON9:
				return basicSetXON9(null, msgs);
			case V2xmlPackage.XON__XON10:
				return basicSetXON10(null, msgs);
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
			case V2xmlPackage.XON__XON1:
				return getXON1();
			case V2xmlPackage.XON__XON2:
				return getXON2();
			case V2xmlPackage.XON__XON3:
				return getXON3();
			case V2xmlPackage.XON__XON4:
				return getXON4();
			case V2xmlPackage.XON__XON5:
				return getXON5();
			case V2xmlPackage.XON__XON6:
				return getXON6();
			case V2xmlPackage.XON__XON7:
				return getXON7();
			case V2xmlPackage.XON__XON8:
				return getXON8();
			case V2xmlPackage.XON__XON9:
				return getXON9();
			case V2xmlPackage.XON__XON10:
				return getXON10();
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
			case V2xmlPackage.XON__XON1:
				setXON1((XON1CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON2:
				setXON2((XON2CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON3:
				setXON3((XON3CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON4:
				setXON4((XON4CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON5:
				setXON5((XON5CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON6:
				setXON6((XON6CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON7:
				setXON7((XON7CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON8:
				setXON8((XON8CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON9:
				setXON9((XON9CONTENT)newValue);
				return;
			case V2xmlPackage.XON__XON10:
				setXON10((XON10CONTENT)newValue);
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
			case V2xmlPackage.XON__XON1:
				setXON1((XON1CONTENT)null);
				return;
			case V2xmlPackage.XON__XON2:
				setXON2((XON2CONTENT)null);
				return;
			case V2xmlPackage.XON__XON3:
				setXON3((XON3CONTENT)null);
				return;
			case V2xmlPackage.XON__XON4:
				setXON4((XON4CONTENT)null);
				return;
			case V2xmlPackage.XON__XON5:
				setXON5((XON5CONTENT)null);
				return;
			case V2xmlPackage.XON__XON6:
				setXON6((XON6CONTENT)null);
				return;
			case V2xmlPackage.XON__XON7:
				setXON7((XON7CONTENT)null);
				return;
			case V2xmlPackage.XON__XON8:
				setXON8((XON8CONTENT)null);
				return;
			case V2xmlPackage.XON__XON9:
				setXON9((XON9CONTENT)null);
				return;
			case V2xmlPackage.XON__XON10:
				setXON10((XON10CONTENT)null);
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
			case V2xmlPackage.XON__XON1:
				return xON1 != null;
			case V2xmlPackage.XON__XON2:
				return xON2 != null;
			case V2xmlPackage.XON__XON3:
				return xON3 != null;
			case V2xmlPackage.XON__XON4:
				return xON4 != null;
			case V2xmlPackage.XON__XON5:
				return xON5 != null;
			case V2xmlPackage.XON__XON6:
				return xON6 != null;
			case V2xmlPackage.XON__XON7:
				return xON7 != null;
			case V2xmlPackage.XON__XON8:
				return xON8 != null;
			case V2xmlPackage.XON__XON9:
				return xON9 != null;
			case V2xmlPackage.XON__XON10:
				return xON10 != null;
		}
		return super.eIsSet(featureID);
	}

} //XONImpl
