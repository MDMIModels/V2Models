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
import org.hl7.v2xml.XPN;
import org.hl7.v2xml.XPN10CONTENT;
import org.hl7.v2xml.XPN11CONTENT;
import org.hl7.v2xml.XPN12CONTENT;
import org.hl7.v2xml.XPN13CONTENT;
import org.hl7.v2xml.XPN14CONTENT;
import org.hl7.v2xml.XPN1CONTENT;
import org.hl7.v2xml.XPN2CONTENT;
import org.hl7.v2xml.XPN3CONTENT;
import org.hl7.v2xml.XPN4CONTENT;
import org.hl7.v2xml.XPN5CONTENT;
import org.hl7.v2xml.XPN6CONTENT;
import org.hl7.v2xml.XPN7CONTENT;
import org.hl7.v2xml.XPN8CONTENT;
import org.hl7.v2xml.XPN9CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XPN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN1 <em>XPN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN2 <em>XPN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN3 <em>XPN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN4 <em>XPN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN5 <em>XPN5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN6 <em>XPN6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN7 <em>XPN7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN8 <em>XPN8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN9 <em>XPN9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN10 <em>XPN10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN11 <em>XPN11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN12 <em>XPN12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN13 <em>XPN13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.XPNImpl#getXPN14 <em>XPN14</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XPNImpl extends EObjectImpl implements XPN {
	/**
	 * The cached value of the '{@link #getXPN1() <em>XPN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN1()
	 * @generated
	 * @ordered
	 */
	protected XPN1CONTENT xPN1;

	/**
	 * The cached value of the '{@link #getXPN2() <em>XPN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN2()
	 * @generated
	 * @ordered
	 */
	protected XPN2CONTENT xPN2;

	/**
	 * The cached value of the '{@link #getXPN3() <em>XPN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN3()
	 * @generated
	 * @ordered
	 */
	protected XPN3CONTENT xPN3;

	/**
	 * The cached value of the '{@link #getXPN4() <em>XPN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN4()
	 * @generated
	 * @ordered
	 */
	protected XPN4CONTENT xPN4;

	/**
	 * The cached value of the '{@link #getXPN5() <em>XPN5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN5()
	 * @generated
	 * @ordered
	 */
	protected XPN5CONTENT xPN5;

	/**
	 * The cached value of the '{@link #getXPN6() <em>XPN6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN6()
	 * @generated
	 * @ordered
	 */
	protected XPN6CONTENT xPN6;

	/**
	 * The cached value of the '{@link #getXPN7() <em>XPN7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN7()
	 * @generated
	 * @ordered
	 */
	protected XPN7CONTENT xPN7;

	/**
	 * The cached value of the '{@link #getXPN8() <em>XPN8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN8()
	 * @generated
	 * @ordered
	 */
	protected XPN8CONTENT xPN8;

	/**
	 * The cached value of the '{@link #getXPN9() <em>XPN9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN9()
	 * @generated
	 * @ordered
	 */
	protected XPN9CONTENT xPN9;

	/**
	 * The cached value of the '{@link #getXPN10() <em>XPN10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN10()
	 * @generated
	 * @ordered
	 */
	protected XPN10CONTENT xPN10;

	/**
	 * The cached value of the '{@link #getXPN11() <em>XPN11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN11()
	 * @generated
	 * @ordered
	 */
	protected XPN11CONTENT xPN11;

	/**
	 * The cached value of the '{@link #getXPN12() <em>XPN12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN12()
	 * @generated
	 * @ordered
	 */
	protected XPN12CONTENT xPN12;

	/**
	 * The cached value of the '{@link #getXPN13() <em>XPN13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN13()
	 * @generated
	 * @ordered
	 */
	protected XPN13CONTENT xPN13;

	/**
	 * The cached value of the '{@link #getXPN14() <em>XPN14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPN14()
	 * @generated
	 * @ordered
	 */
	protected XPN14CONTENT xPN14;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getXPN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN1CONTENT getXPN1() {
		return xPN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN1(XPN1CONTENT newXPN1, NotificationChain msgs) {
		XPN1CONTENT oldXPN1 = xPN1;
		xPN1 = newXPN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN1, oldXPN1, newXPN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN1(XPN1CONTENT newXPN1) {
		if (newXPN1 != xPN1) {
			NotificationChain msgs = null;
			if (xPN1 != null)
				msgs = ((InternalEObject)xPN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN1, null, msgs);
			if (newXPN1 != null)
				msgs = ((InternalEObject)newXPN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN1, null, msgs);
			msgs = basicSetXPN1(newXPN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN1, newXPN1, newXPN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN2CONTENT getXPN2() {
		return xPN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN2(XPN2CONTENT newXPN2, NotificationChain msgs) {
		XPN2CONTENT oldXPN2 = xPN2;
		xPN2 = newXPN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN2, oldXPN2, newXPN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN2(XPN2CONTENT newXPN2) {
		if (newXPN2 != xPN2) {
			NotificationChain msgs = null;
			if (xPN2 != null)
				msgs = ((InternalEObject)xPN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN2, null, msgs);
			if (newXPN2 != null)
				msgs = ((InternalEObject)newXPN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN2, null, msgs);
			msgs = basicSetXPN2(newXPN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN2, newXPN2, newXPN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN3CONTENT getXPN3() {
		return xPN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN3(XPN3CONTENT newXPN3, NotificationChain msgs) {
		XPN3CONTENT oldXPN3 = xPN3;
		xPN3 = newXPN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN3, oldXPN3, newXPN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN3(XPN3CONTENT newXPN3) {
		if (newXPN3 != xPN3) {
			NotificationChain msgs = null;
			if (xPN3 != null)
				msgs = ((InternalEObject)xPN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN3, null, msgs);
			if (newXPN3 != null)
				msgs = ((InternalEObject)newXPN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN3, null, msgs);
			msgs = basicSetXPN3(newXPN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN3, newXPN3, newXPN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN4CONTENT getXPN4() {
		return xPN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN4(XPN4CONTENT newXPN4, NotificationChain msgs) {
		XPN4CONTENT oldXPN4 = xPN4;
		xPN4 = newXPN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN4, oldXPN4, newXPN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN4(XPN4CONTENT newXPN4) {
		if (newXPN4 != xPN4) {
			NotificationChain msgs = null;
			if (xPN4 != null)
				msgs = ((InternalEObject)xPN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN4, null, msgs);
			if (newXPN4 != null)
				msgs = ((InternalEObject)newXPN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN4, null, msgs);
			msgs = basicSetXPN4(newXPN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN4, newXPN4, newXPN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN5CONTENT getXPN5() {
		return xPN5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN5(XPN5CONTENT newXPN5, NotificationChain msgs) {
		XPN5CONTENT oldXPN5 = xPN5;
		xPN5 = newXPN5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN5, oldXPN5, newXPN5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN5(XPN5CONTENT newXPN5) {
		if (newXPN5 != xPN5) {
			NotificationChain msgs = null;
			if (xPN5 != null)
				msgs = ((InternalEObject)xPN5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN5, null, msgs);
			if (newXPN5 != null)
				msgs = ((InternalEObject)newXPN5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN5, null, msgs);
			msgs = basicSetXPN5(newXPN5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN5, newXPN5, newXPN5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN6CONTENT getXPN6() {
		return xPN6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN6(XPN6CONTENT newXPN6, NotificationChain msgs) {
		XPN6CONTENT oldXPN6 = xPN6;
		xPN6 = newXPN6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN6, oldXPN6, newXPN6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN6(XPN6CONTENT newXPN6) {
		if (newXPN6 != xPN6) {
			NotificationChain msgs = null;
			if (xPN6 != null)
				msgs = ((InternalEObject)xPN6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN6, null, msgs);
			if (newXPN6 != null)
				msgs = ((InternalEObject)newXPN6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN6, null, msgs);
			msgs = basicSetXPN6(newXPN6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN6, newXPN6, newXPN6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN7CONTENT getXPN7() {
		return xPN7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN7(XPN7CONTENT newXPN7, NotificationChain msgs) {
		XPN7CONTENT oldXPN7 = xPN7;
		xPN7 = newXPN7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN7, oldXPN7, newXPN7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN7(XPN7CONTENT newXPN7) {
		if (newXPN7 != xPN7) {
			NotificationChain msgs = null;
			if (xPN7 != null)
				msgs = ((InternalEObject)xPN7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN7, null, msgs);
			if (newXPN7 != null)
				msgs = ((InternalEObject)newXPN7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN7, null, msgs);
			msgs = basicSetXPN7(newXPN7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN7, newXPN7, newXPN7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN8CONTENT getXPN8() {
		return xPN8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN8(XPN8CONTENT newXPN8, NotificationChain msgs) {
		XPN8CONTENT oldXPN8 = xPN8;
		xPN8 = newXPN8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN8, oldXPN8, newXPN8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN8(XPN8CONTENT newXPN8) {
		if (newXPN8 != xPN8) {
			NotificationChain msgs = null;
			if (xPN8 != null)
				msgs = ((InternalEObject)xPN8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN8, null, msgs);
			if (newXPN8 != null)
				msgs = ((InternalEObject)newXPN8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN8, null, msgs);
			msgs = basicSetXPN8(newXPN8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN8, newXPN8, newXPN8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN9CONTENT getXPN9() {
		return xPN9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN9(XPN9CONTENT newXPN9, NotificationChain msgs) {
		XPN9CONTENT oldXPN9 = xPN9;
		xPN9 = newXPN9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN9, oldXPN9, newXPN9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN9(XPN9CONTENT newXPN9) {
		if (newXPN9 != xPN9) {
			NotificationChain msgs = null;
			if (xPN9 != null)
				msgs = ((InternalEObject)xPN9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN9, null, msgs);
			if (newXPN9 != null)
				msgs = ((InternalEObject)newXPN9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN9, null, msgs);
			msgs = basicSetXPN9(newXPN9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN9, newXPN9, newXPN9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN10CONTENT getXPN10() {
		return xPN10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN10(XPN10CONTENT newXPN10, NotificationChain msgs) {
		XPN10CONTENT oldXPN10 = xPN10;
		xPN10 = newXPN10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN10, oldXPN10, newXPN10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN10(XPN10CONTENT newXPN10) {
		if (newXPN10 != xPN10) {
			NotificationChain msgs = null;
			if (xPN10 != null)
				msgs = ((InternalEObject)xPN10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN10, null, msgs);
			if (newXPN10 != null)
				msgs = ((InternalEObject)newXPN10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN10, null, msgs);
			msgs = basicSetXPN10(newXPN10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN10, newXPN10, newXPN10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN11CONTENT getXPN11() {
		return xPN11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN11(XPN11CONTENT newXPN11, NotificationChain msgs) {
		XPN11CONTENT oldXPN11 = xPN11;
		xPN11 = newXPN11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN11, oldXPN11, newXPN11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN11(XPN11CONTENT newXPN11) {
		if (newXPN11 != xPN11) {
			NotificationChain msgs = null;
			if (xPN11 != null)
				msgs = ((InternalEObject)xPN11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN11, null, msgs);
			if (newXPN11 != null)
				msgs = ((InternalEObject)newXPN11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN11, null, msgs);
			msgs = basicSetXPN11(newXPN11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN11, newXPN11, newXPN11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN12CONTENT getXPN12() {
		return xPN12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN12(XPN12CONTENT newXPN12, NotificationChain msgs) {
		XPN12CONTENT oldXPN12 = xPN12;
		xPN12 = newXPN12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN12, oldXPN12, newXPN12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN12(XPN12CONTENT newXPN12) {
		if (newXPN12 != xPN12) {
			NotificationChain msgs = null;
			if (xPN12 != null)
				msgs = ((InternalEObject)xPN12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN12, null, msgs);
			if (newXPN12 != null)
				msgs = ((InternalEObject)newXPN12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN12, null, msgs);
			msgs = basicSetXPN12(newXPN12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN12, newXPN12, newXPN12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN13CONTENT getXPN13() {
		return xPN13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN13(XPN13CONTENT newXPN13, NotificationChain msgs) {
		XPN13CONTENT oldXPN13 = xPN13;
		xPN13 = newXPN13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN13, oldXPN13, newXPN13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN13(XPN13CONTENT newXPN13) {
		if (newXPN13 != xPN13) {
			NotificationChain msgs = null;
			if (xPN13 != null)
				msgs = ((InternalEObject)xPN13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN13, null, msgs);
			if (newXPN13 != null)
				msgs = ((InternalEObject)newXPN13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN13, null, msgs);
			msgs = basicSetXPN13(newXPN13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN13, newXPN13, newXPN13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XPN14CONTENT getXPN14() {
		return xPN14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXPN14(XPN14CONTENT newXPN14, NotificationChain msgs) {
		XPN14CONTENT oldXPN14 = xPN14;
		xPN14 = newXPN14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN14, oldXPN14, newXPN14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPN14(XPN14CONTENT newXPN14) {
		if (newXPN14 != xPN14) {
			NotificationChain msgs = null;
			if (xPN14 != null)
				msgs = ((InternalEObject)xPN14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN14, null, msgs);
			if (newXPN14 != null)
				msgs = ((InternalEObject)newXPN14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.XPN__XPN14, null, msgs);
			msgs = basicSetXPN14(newXPN14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.XPN__XPN14, newXPN14, newXPN14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.XPN__XPN1:
				return basicSetXPN1(null, msgs);
			case V2xmlPackage.XPN__XPN2:
				return basicSetXPN2(null, msgs);
			case V2xmlPackage.XPN__XPN3:
				return basicSetXPN3(null, msgs);
			case V2xmlPackage.XPN__XPN4:
				return basicSetXPN4(null, msgs);
			case V2xmlPackage.XPN__XPN5:
				return basicSetXPN5(null, msgs);
			case V2xmlPackage.XPN__XPN6:
				return basicSetXPN6(null, msgs);
			case V2xmlPackage.XPN__XPN7:
				return basicSetXPN7(null, msgs);
			case V2xmlPackage.XPN__XPN8:
				return basicSetXPN8(null, msgs);
			case V2xmlPackage.XPN__XPN9:
				return basicSetXPN9(null, msgs);
			case V2xmlPackage.XPN__XPN10:
				return basicSetXPN10(null, msgs);
			case V2xmlPackage.XPN__XPN11:
				return basicSetXPN11(null, msgs);
			case V2xmlPackage.XPN__XPN12:
				return basicSetXPN12(null, msgs);
			case V2xmlPackage.XPN__XPN13:
				return basicSetXPN13(null, msgs);
			case V2xmlPackage.XPN__XPN14:
				return basicSetXPN14(null, msgs);
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
			case V2xmlPackage.XPN__XPN1:
				return getXPN1();
			case V2xmlPackage.XPN__XPN2:
				return getXPN2();
			case V2xmlPackage.XPN__XPN3:
				return getXPN3();
			case V2xmlPackage.XPN__XPN4:
				return getXPN4();
			case V2xmlPackage.XPN__XPN5:
				return getXPN5();
			case V2xmlPackage.XPN__XPN6:
				return getXPN6();
			case V2xmlPackage.XPN__XPN7:
				return getXPN7();
			case V2xmlPackage.XPN__XPN8:
				return getXPN8();
			case V2xmlPackage.XPN__XPN9:
				return getXPN9();
			case V2xmlPackage.XPN__XPN10:
				return getXPN10();
			case V2xmlPackage.XPN__XPN11:
				return getXPN11();
			case V2xmlPackage.XPN__XPN12:
				return getXPN12();
			case V2xmlPackage.XPN__XPN13:
				return getXPN13();
			case V2xmlPackage.XPN__XPN14:
				return getXPN14();
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
			case V2xmlPackage.XPN__XPN1:
				setXPN1((XPN1CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN2:
				setXPN2((XPN2CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN3:
				setXPN3((XPN3CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN4:
				setXPN4((XPN4CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN5:
				setXPN5((XPN5CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN6:
				setXPN6((XPN6CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN7:
				setXPN7((XPN7CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN8:
				setXPN8((XPN8CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN9:
				setXPN9((XPN9CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN10:
				setXPN10((XPN10CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN11:
				setXPN11((XPN11CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN12:
				setXPN12((XPN12CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN13:
				setXPN13((XPN13CONTENT)newValue);
				return;
			case V2xmlPackage.XPN__XPN14:
				setXPN14((XPN14CONTENT)newValue);
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
			case V2xmlPackage.XPN__XPN1:
				setXPN1((XPN1CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN2:
				setXPN2((XPN2CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN3:
				setXPN3((XPN3CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN4:
				setXPN4((XPN4CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN5:
				setXPN5((XPN5CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN6:
				setXPN6((XPN6CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN7:
				setXPN7((XPN7CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN8:
				setXPN8((XPN8CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN9:
				setXPN9((XPN9CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN10:
				setXPN10((XPN10CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN11:
				setXPN11((XPN11CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN12:
				setXPN12((XPN12CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN13:
				setXPN13((XPN13CONTENT)null);
				return;
			case V2xmlPackage.XPN__XPN14:
				setXPN14((XPN14CONTENT)null);
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
			case V2xmlPackage.XPN__XPN1:
				return xPN1 != null;
			case V2xmlPackage.XPN__XPN2:
				return xPN2 != null;
			case V2xmlPackage.XPN__XPN3:
				return xPN3 != null;
			case V2xmlPackage.XPN__XPN4:
				return xPN4 != null;
			case V2xmlPackage.XPN__XPN5:
				return xPN5 != null;
			case V2xmlPackage.XPN__XPN6:
				return xPN6 != null;
			case V2xmlPackage.XPN__XPN7:
				return xPN7 != null;
			case V2xmlPackage.XPN__XPN8:
				return xPN8 != null;
			case V2xmlPackage.XPN__XPN9:
				return xPN9 != null;
			case V2xmlPackage.XPN__XPN10:
				return xPN10 != null;
			case V2xmlPackage.XPN__XPN11:
				return xPN11 != null;
			case V2xmlPackage.XPN__XPN12:
				return xPN12 != null;
			case V2xmlPackage.XPN__XPN13:
				return xPN13 != null;
			case V2xmlPackage.XPN__XPN14:
				return xPN14 != null;
		}
		return super.eIsSet(featureID);
	}

} //XPNImpl
