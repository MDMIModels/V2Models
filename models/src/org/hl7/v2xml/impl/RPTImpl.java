/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RPT;
import org.hl7.v2xml.RPT10CONTENT;
import org.hl7.v2xml.RPT11CONTENT;
import org.hl7.v2xml.RPT1CONTENT;
import org.hl7.v2xml.RPT2CONTENT;
import org.hl7.v2xml.RPT3CONTENT;
import org.hl7.v2xml.RPT4CONTENT;
import org.hl7.v2xml.RPT5CONTENT;
import org.hl7.v2xml.RPT6CONTENT;
import org.hl7.v2xml.RPT7CONTENT;
import org.hl7.v2xml.RPT8CONTENT;
import org.hl7.v2xml.RPT9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RPT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT1 <em>RPT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT2 <em>RPT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT3 <em>RPT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT4 <em>RPT4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT5 <em>RPT5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT6 <em>RPT6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT7 <em>RPT7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT8 <em>RPT8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT9 <em>RPT9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT10 <em>RPT10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RPTImpl#getRPT11 <em>RPT11</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RPTImpl extends EObjectImpl implements RPT {
	/**
	 * The cached value of the '{@link #getRPT1() <em>RPT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT1()
	 * @generated
	 * @ordered
	 */
	protected RPT1CONTENT rPT1;

	/**
	 * The cached value of the '{@link #getRPT2() <em>RPT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT2()
	 * @generated
	 * @ordered
	 */
	protected RPT2CONTENT rPT2;

	/**
	 * The cached value of the '{@link #getRPT3() <em>RPT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT3()
	 * @generated
	 * @ordered
	 */
	protected RPT3CONTENT rPT3;

	/**
	 * The cached value of the '{@link #getRPT4() <em>RPT4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT4()
	 * @generated
	 * @ordered
	 */
	protected RPT4CONTENT rPT4;

	/**
	 * The cached value of the '{@link #getRPT5() <em>RPT5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT5()
	 * @generated
	 * @ordered
	 */
	protected RPT5CONTENT rPT5;

	/**
	 * The cached value of the '{@link #getRPT6() <em>RPT6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT6()
	 * @generated
	 * @ordered
	 */
	protected RPT6CONTENT rPT6;

	/**
	 * The cached value of the '{@link #getRPT7() <em>RPT7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT7()
	 * @generated
	 * @ordered
	 */
	protected RPT7CONTENT rPT7;

	/**
	 * The cached value of the '{@link #getRPT8() <em>RPT8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT8()
	 * @generated
	 * @ordered
	 */
	protected RPT8CONTENT rPT8;

	/**
	 * The cached value of the '{@link #getRPT9() <em>RPT9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT9()
	 * @generated
	 * @ordered
	 */
	protected RPT9CONTENT rPT9;

	/**
	 * The cached value of the '{@link #getRPT10() <em>RPT10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT10()
	 * @generated
	 * @ordered
	 */
	protected RPT10CONTENT rPT10;

	/**
	 * The cached value of the '{@link #getRPT11() <em>RPT11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPT11()
	 * @generated
	 * @ordered
	 */
	protected RPT11CONTENT rPT11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RPTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRPT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT1CONTENT getRPT1() {
		return rPT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT1(RPT1CONTENT newRPT1, NotificationChain msgs) {
		RPT1CONTENT oldRPT1 = rPT1;
		rPT1 = newRPT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT1, oldRPT1, newRPT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT1(RPT1CONTENT newRPT1) {
		if (newRPT1 != rPT1) {
			NotificationChain msgs = null;
			if (rPT1 != null)
				msgs = ((InternalEObject)rPT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT1, null, msgs);
			if (newRPT1 != null)
				msgs = ((InternalEObject)newRPT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT1, null, msgs);
			msgs = basicSetRPT1(newRPT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT1, newRPT1, newRPT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT2CONTENT getRPT2() {
		return rPT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT2(RPT2CONTENT newRPT2, NotificationChain msgs) {
		RPT2CONTENT oldRPT2 = rPT2;
		rPT2 = newRPT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT2, oldRPT2, newRPT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT2(RPT2CONTENT newRPT2) {
		if (newRPT2 != rPT2) {
			NotificationChain msgs = null;
			if (rPT2 != null)
				msgs = ((InternalEObject)rPT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT2, null, msgs);
			if (newRPT2 != null)
				msgs = ((InternalEObject)newRPT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT2, null, msgs);
			msgs = basicSetRPT2(newRPT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT2, newRPT2, newRPT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT3CONTENT getRPT3() {
		return rPT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT3(RPT3CONTENT newRPT3, NotificationChain msgs) {
		RPT3CONTENT oldRPT3 = rPT3;
		rPT3 = newRPT3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT3, oldRPT3, newRPT3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT3(RPT3CONTENT newRPT3) {
		if (newRPT3 != rPT3) {
			NotificationChain msgs = null;
			if (rPT3 != null)
				msgs = ((InternalEObject)rPT3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT3, null, msgs);
			if (newRPT3 != null)
				msgs = ((InternalEObject)newRPT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT3, null, msgs);
			msgs = basicSetRPT3(newRPT3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT3, newRPT3, newRPT3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT4CONTENT getRPT4() {
		return rPT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT4(RPT4CONTENT newRPT4, NotificationChain msgs) {
		RPT4CONTENT oldRPT4 = rPT4;
		rPT4 = newRPT4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT4, oldRPT4, newRPT4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT4(RPT4CONTENT newRPT4) {
		if (newRPT4 != rPT4) {
			NotificationChain msgs = null;
			if (rPT4 != null)
				msgs = ((InternalEObject)rPT4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT4, null, msgs);
			if (newRPT4 != null)
				msgs = ((InternalEObject)newRPT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT4, null, msgs);
			msgs = basicSetRPT4(newRPT4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT4, newRPT4, newRPT4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT5CONTENT getRPT5() {
		return rPT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT5(RPT5CONTENT newRPT5, NotificationChain msgs) {
		RPT5CONTENT oldRPT5 = rPT5;
		rPT5 = newRPT5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT5, oldRPT5, newRPT5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT5(RPT5CONTENT newRPT5) {
		if (newRPT5 != rPT5) {
			NotificationChain msgs = null;
			if (rPT5 != null)
				msgs = ((InternalEObject)rPT5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT5, null, msgs);
			if (newRPT5 != null)
				msgs = ((InternalEObject)newRPT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT5, null, msgs);
			msgs = basicSetRPT5(newRPT5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT5, newRPT5, newRPT5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT6CONTENT getRPT6() {
		return rPT6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT6(RPT6CONTENT newRPT6, NotificationChain msgs) {
		RPT6CONTENT oldRPT6 = rPT6;
		rPT6 = newRPT6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT6, oldRPT6, newRPT6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT6(RPT6CONTENT newRPT6) {
		if (newRPT6 != rPT6) {
			NotificationChain msgs = null;
			if (rPT6 != null)
				msgs = ((InternalEObject)rPT6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT6, null, msgs);
			if (newRPT6 != null)
				msgs = ((InternalEObject)newRPT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT6, null, msgs);
			msgs = basicSetRPT6(newRPT6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT6, newRPT6, newRPT6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT7CONTENT getRPT7() {
		return rPT7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT7(RPT7CONTENT newRPT7, NotificationChain msgs) {
		RPT7CONTENT oldRPT7 = rPT7;
		rPT7 = newRPT7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT7, oldRPT7, newRPT7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT7(RPT7CONTENT newRPT7) {
		if (newRPT7 != rPT7) {
			NotificationChain msgs = null;
			if (rPT7 != null)
				msgs = ((InternalEObject)rPT7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT7, null, msgs);
			if (newRPT7 != null)
				msgs = ((InternalEObject)newRPT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT7, null, msgs);
			msgs = basicSetRPT7(newRPT7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT7, newRPT7, newRPT7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT8CONTENT getRPT8() {
		return rPT8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT8(RPT8CONTENT newRPT8, NotificationChain msgs) {
		RPT8CONTENT oldRPT8 = rPT8;
		rPT8 = newRPT8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT8, oldRPT8, newRPT8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT8(RPT8CONTENT newRPT8) {
		if (newRPT8 != rPT8) {
			NotificationChain msgs = null;
			if (rPT8 != null)
				msgs = ((InternalEObject)rPT8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT8, null, msgs);
			if (newRPT8 != null)
				msgs = ((InternalEObject)newRPT8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT8, null, msgs);
			msgs = basicSetRPT8(newRPT8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT8, newRPT8, newRPT8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT9CONTENT getRPT9() {
		return rPT9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT9(RPT9CONTENT newRPT9, NotificationChain msgs) {
		RPT9CONTENT oldRPT9 = rPT9;
		rPT9 = newRPT9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT9, oldRPT9, newRPT9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT9(RPT9CONTENT newRPT9) {
		if (newRPT9 != rPT9) {
			NotificationChain msgs = null;
			if (rPT9 != null)
				msgs = ((InternalEObject)rPT9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT9, null, msgs);
			if (newRPT9 != null)
				msgs = ((InternalEObject)newRPT9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT9, null, msgs);
			msgs = basicSetRPT9(newRPT9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT9, newRPT9, newRPT9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT10CONTENT getRPT10() {
		return rPT10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT10(RPT10CONTENT newRPT10, NotificationChain msgs) {
		RPT10CONTENT oldRPT10 = rPT10;
		rPT10 = newRPT10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT10, oldRPT10, newRPT10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT10(RPT10CONTENT newRPT10) {
		if (newRPT10 != rPT10) {
			NotificationChain msgs = null;
			if (rPT10 != null)
				msgs = ((InternalEObject)rPT10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT10, null, msgs);
			if (newRPT10 != null)
				msgs = ((InternalEObject)newRPT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT10, null, msgs);
			msgs = basicSetRPT10(newRPT10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT10, newRPT10, newRPT10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPT11CONTENT getRPT11() {
		return rPT11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRPT11(RPT11CONTENT newRPT11, NotificationChain msgs) {
		RPT11CONTENT oldRPT11 = rPT11;
		rPT11 = newRPT11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT11, oldRPT11, newRPT11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPT11(RPT11CONTENT newRPT11) {
		if (newRPT11 != rPT11) {
			NotificationChain msgs = null;
			if (rPT11 != null)
				msgs = ((InternalEObject)rPT11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT11, null, msgs);
			if (newRPT11 != null)
				msgs = ((InternalEObject)newRPT11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RPT__RPT11, null, msgs);
			msgs = basicSetRPT11(newRPT11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RPT__RPT11, newRPT11, newRPT11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RPT__RPT1:
				return basicSetRPT1(null, msgs);
			case V2xmlPackage.RPT__RPT2:
				return basicSetRPT2(null, msgs);
			case V2xmlPackage.RPT__RPT3:
				return basicSetRPT3(null, msgs);
			case V2xmlPackage.RPT__RPT4:
				return basicSetRPT4(null, msgs);
			case V2xmlPackage.RPT__RPT5:
				return basicSetRPT5(null, msgs);
			case V2xmlPackage.RPT__RPT6:
				return basicSetRPT6(null, msgs);
			case V2xmlPackage.RPT__RPT7:
				return basicSetRPT7(null, msgs);
			case V2xmlPackage.RPT__RPT8:
				return basicSetRPT8(null, msgs);
			case V2xmlPackage.RPT__RPT9:
				return basicSetRPT9(null, msgs);
			case V2xmlPackage.RPT__RPT10:
				return basicSetRPT10(null, msgs);
			case V2xmlPackage.RPT__RPT11:
				return basicSetRPT11(null, msgs);
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
			case V2xmlPackage.RPT__RPT1:
				return getRPT1();
			case V2xmlPackage.RPT__RPT2:
				return getRPT2();
			case V2xmlPackage.RPT__RPT3:
				return getRPT3();
			case V2xmlPackage.RPT__RPT4:
				return getRPT4();
			case V2xmlPackage.RPT__RPT5:
				return getRPT5();
			case V2xmlPackage.RPT__RPT6:
				return getRPT6();
			case V2xmlPackage.RPT__RPT7:
				return getRPT7();
			case V2xmlPackage.RPT__RPT8:
				return getRPT8();
			case V2xmlPackage.RPT__RPT9:
				return getRPT9();
			case V2xmlPackage.RPT__RPT10:
				return getRPT10();
			case V2xmlPackage.RPT__RPT11:
				return getRPT11();
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
			case V2xmlPackage.RPT__RPT1:
				setRPT1((RPT1CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT2:
				setRPT2((RPT2CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT3:
				setRPT3((RPT3CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT4:
				setRPT4((RPT4CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT5:
				setRPT5((RPT5CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT6:
				setRPT6((RPT6CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT7:
				setRPT7((RPT7CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT8:
				setRPT8((RPT8CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT9:
				setRPT9((RPT9CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT10:
				setRPT10((RPT10CONTENT)newValue);
				return;
			case V2xmlPackage.RPT__RPT11:
				setRPT11((RPT11CONTENT)newValue);
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
			case V2xmlPackage.RPT__RPT1:
				setRPT1((RPT1CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT2:
				setRPT2((RPT2CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT3:
				setRPT3((RPT3CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT4:
				setRPT4((RPT4CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT5:
				setRPT5((RPT5CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT6:
				setRPT6((RPT6CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT7:
				setRPT7((RPT7CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT8:
				setRPT8((RPT8CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT9:
				setRPT9((RPT9CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT10:
				setRPT10((RPT10CONTENT)null);
				return;
			case V2xmlPackage.RPT__RPT11:
				setRPT11((RPT11CONTENT)null);
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
			case V2xmlPackage.RPT__RPT1:
				return rPT1 != null;
			case V2xmlPackage.RPT__RPT2:
				return rPT2 != null;
			case V2xmlPackage.RPT__RPT3:
				return rPT3 != null;
			case V2xmlPackage.RPT__RPT4:
				return rPT4 != null;
			case V2xmlPackage.RPT__RPT5:
				return rPT5 != null;
			case V2xmlPackage.RPT__RPT6:
				return rPT6 != null;
			case V2xmlPackage.RPT__RPT7:
				return rPT7 != null;
			case V2xmlPackage.RPT__RPT8:
				return rPT8 != null;
			case V2xmlPackage.RPT__RPT9:
				return rPT9 != null;
			case V2xmlPackage.RPT__RPT10:
				return rPT10 != null;
			case V2xmlPackage.RPT__RPT11:
				return rPT11 != null;
		}
		return super.eIsSet(featureID);
	}

} //RPTImpl
