/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CX;
import org.hl7.v2xml.CX10CONTENT;
import org.hl7.v2xml.CX1CONTENT;
import org.hl7.v2xml.CX2CONTENT;
import org.hl7.v2xml.CX3CONTENT;
import org.hl7.v2xml.CX4CONTENT;
import org.hl7.v2xml.CX5CONTENT;
import org.hl7.v2xml.CX6CONTENT;
import org.hl7.v2xml.CX7CONTENT;
import org.hl7.v2xml.CX8CONTENT;
import org.hl7.v2xml.CX9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX1 <em>CX1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX2 <em>CX2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX3 <em>CX3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX4 <em>CX4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX5 <em>CX5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX6 <em>CX6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX7 <em>CX7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX8 <em>CX8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX9 <em>CX9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CXImpl#getCX10 <em>CX10</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CXImpl extends EObjectImpl implements CX {
	/**
	 * The cached value of the '{@link #getCX1() <em>CX1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX1()
	 * @generated
	 * @ordered
	 */
	protected CX1CONTENT cX1;

	/**
	 * The cached value of the '{@link #getCX2() <em>CX2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX2()
	 * @generated
	 * @ordered
	 */
	protected CX2CONTENT cX2;

	/**
	 * The cached value of the '{@link #getCX3() <em>CX3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX3()
	 * @generated
	 * @ordered
	 */
	protected CX3CONTENT cX3;

	/**
	 * The cached value of the '{@link #getCX4() <em>CX4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX4()
	 * @generated
	 * @ordered
	 */
	protected CX4CONTENT cX4;

	/**
	 * The cached value of the '{@link #getCX5() <em>CX5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX5()
	 * @generated
	 * @ordered
	 */
	protected CX5CONTENT cX5;

	/**
	 * The cached value of the '{@link #getCX6() <em>CX6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX6()
	 * @generated
	 * @ordered
	 */
	protected CX6CONTENT cX6;

	/**
	 * The cached value of the '{@link #getCX7() <em>CX7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX7()
	 * @generated
	 * @ordered
	 */
	protected CX7CONTENT cX7;

	/**
	 * The cached value of the '{@link #getCX8() <em>CX8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX8()
	 * @generated
	 * @ordered
	 */
	protected CX8CONTENT cX8;

	/**
	 * The cached value of the '{@link #getCX9() <em>CX9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX9()
	 * @generated
	 * @ordered
	 */
	protected CX9CONTENT cX9;

	/**
	 * The cached value of the '{@link #getCX10() <em>CX10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCX10()
	 * @generated
	 * @ordered
	 */
	protected CX10CONTENT cX10;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCX();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX1CONTENT getCX1() {
		return cX1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX1(CX1CONTENT newCX1, NotificationChain msgs) {
		CX1CONTENT oldCX1 = cX1;
		cX1 = newCX1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX1, oldCX1, newCX1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX1(CX1CONTENT newCX1) {
		if (newCX1 != cX1) {
			NotificationChain msgs = null;
			if (cX1 != null)
				msgs = ((InternalEObject)cX1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX1, null, msgs);
			if (newCX1 != null)
				msgs = ((InternalEObject)newCX1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX1, null, msgs);
			msgs = basicSetCX1(newCX1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX1, newCX1, newCX1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX2CONTENT getCX2() {
		return cX2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX2(CX2CONTENT newCX2, NotificationChain msgs) {
		CX2CONTENT oldCX2 = cX2;
		cX2 = newCX2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX2, oldCX2, newCX2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX2(CX2CONTENT newCX2) {
		if (newCX2 != cX2) {
			NotificationChain msgs = null;
			if (cX2 != null)
				msgs = ((InternalEObject)cX2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX2, null, msgs);
			if (newCX2 != null)
				msgs = ((InternalEObject)newCX2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX2, null, msgs);
			msgs = basicSetCX2(newCX2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX2, newCX2, newCX2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX3CONTENT getCX3() {
		return cX3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX3(CX3CONTENT newCX3, NotificationChain msgs) {
		CX3CONTENT oldCX3 = cX3;
		cX3 = newCX3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX3, oldCX3, newCX3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX3(CX3CONTENT newCX3) {
		if (newCX3 != cX3) {
			NotificationChain msgs = null;
			if (cX3 != null)
				msgs = ((InternalEObject)cX3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX3, null, msgs);
			if (newCX3 != null)
				msgs = ((InternalEObject)newCX3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX3, null, msgs);
			msgs = basicSetCX3(newCX3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX3, newCX3, newCX3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX4CONTENT getCX4() {
		return cX4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX4(CX4CONTENT newCX4, NotificationChain msgs) {
		CX4CONTENT oldCX4 = cX4;
		cX4 = newCX4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX4, oldCX4, newCX4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX4(CX4CONTENT newCX4) {
		if (newCX4 != cX4) {
			NotificationChain msgs = null;
			if (cX4 != null)
				msgs = ((InternalEObject)cX4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX4, null, msgs);
			if (newCX4 != null)
				msgs = ((InternalEObject)newCX4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX4, null, msgs);
			msgs = basicSetCX4(newCX4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX4, newCX4, newCX4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX5CONTENT getCX5() {
		return cX5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX5(CX5CONTENT newCX5, NotificationChain msgs) {
		CX5CONTENT oldCX5 = cX5;
		cX5 = newCX5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX5, oldCX5, newCX5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX5(CX5CONTENT newCX5) {
		if (newCX5 != cX5) {
			NotificationChain msgs = null;
			if (cX5 != null)
				msgs = ((InternalEObject)cX5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX5, null, msgs);
			if (newCX5 != null)
				msgs = ((InternalEObject)newCX5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX5, null, msgs);
			msgs = basicSetCX5(newCX5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX5, newCX5, newCX5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX6CONTENT getCX6() {
		return cX6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX6(CX6CONTENT newCX6, NotificationChain msgs) {
		CX6CONTENT oldCX6 = cX6;
		cX6 = newCX6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX6, oldCX6, newCX6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX6(CX6CONTENT newCX6) {
		if (newCX6 != cX6) {
			NotificationChain msgs = null;
			if (cX6 != null)
				msgs = ((InternalEObject)cX6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX6, null, msgs);
			if (newCX6 != null)
				msgs = ((InternalEObject)newCX6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX6, null, msgs);
			msgs = basicSetCX6(newCX6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX6, newCX6, newCX6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX7CONTENT getCX7() {
		return cX7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX7(CX7CONTENT newCX7, NotificationChain msgs) {
		CX7CONTENT oldCX7 = cX7;
		cX7 = newCX7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX7, oldCX7, newCX7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX7(CX7CONTENT newCX7) {
		if (newCX7 != cX7) {
			NotificationChain msgs = null;
			if (cX7 != null)
				msgs = ((InternalEObject)cX7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX7, null, msgs);
			if (newCX7 != null)
				msgs = ((InternalEObject)newCX7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX7, null, msgs);
			msgs = basicSetCX7(newCX7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX7, newCX7, newCX7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX8CONTENT getCX8() {
		return cX8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX8(CX8CONTENT newCX8, NotificationChain msgs) {
		CX8CONTENT oldCX8 = cX8;
		cX8 = newCX8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX8, oldCX8, newCX8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX8(CX8CONTENT newCX8) {
		if (newCX8 != cX8) {
			NotificationChain msgs = null;
			if (cX8 != null)
				msgs = ((InternalEObject)cX8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX8, null, msgs);
			if (newCX8 != null)
				msgs = ((InternalEObject)newCX8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX8, null, msgs);
			msgs = basicSetCX8(newCX8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX8, newCX8, newCX8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX9CONTENT getCX9() {
		return cX9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX9(CX9CONTENT newCX9, NotificationChain msgs) {
		CX9CONTENT oldCX9 = cX9;
		cX9 = newCX9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX9, oldCX9, newCX9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX9(CX9CONTENT newCX9) {
		if (newCX9 != cX9) {
			NotificationChain msgs = null;
			if (cX9 != null)
				msgs = ((InternalEObject)cX9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX9, null, msgs);
			if (newCX9 != null)
				msgs = ((InternalEObject)newCX9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX9, null, msgs);
			msgs = basicSetCX9(newCX9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX9, newCX9, newCX9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CX10CONTENT getCX10() {
		return cX10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCX10(CX10CONTENT newCX10, NotificationChain msgs) {
		CX10CONTENT oldCX10 = cX10;
		cX10 = newCX10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX10, oldCX10, newCX10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCX10(CX10CONTENT newCX10) {
		if (newCX10 != cX10) {
			NotificationChain msgs = null;
			if (cX10 != null)
				msgs = ((InternalEObject)cX10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX10, null, msgs);
			if (newCX10 != null)
				msgs = ((InternalEObject)newCX10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CX__CX10, null, msgs);
			msgs = basicSetCX10(newCX10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CX__CX10, newCX10, newCX10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CX__CX1:
				return basicSetCX1(null, msgs);
			case V2xmlPackage.CX__CX2:
				return basicSetCX2(null, msgs);
			case V2xmlPackage.CX__CX3:
				return basicSetCX3(null, msgs);
			case V2xmlPackage.CX__CX4:
				return basicSetCX4(null, msgs);
			case V2xmlPackage.CX__CX5:
				return basicSetCX5(null, msgs);
			case V2xmlPackage.CX__CX6:
				return basicSetCX6(null, msgs);
			case V2xmlPackage.CX__CX7:
				return basicSetCX7(null, msgs);
			case V2xmlPackage.CX__CX8:
				return basicSetCX8(null, msgs);
			case V2xmlPackage.CX__CX9:
				return basicSetCX9(null, msgs);
			case V2xmlPackage.CX__CX10:
				return basicSetCX10(null, msgs);
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
			case V2xmlPackage.CX__CX1:
				return getCX1();
			case V2xmlPackage.CX__CX2:
				return getCX2();
			case V2xmlPackage.CX__CX3:
				return getCX3();
			case V2xmlPackage.CX__CX4:
				return getCX4();
			case V2xmlPackage.CX__CX5:
				return getCX5();
			case V2xmlPackage.CX__CX6:
				return getCX6();
			case V2xmlPackage.CX__CX7:
				return getCX7();
			case V2xmlPackage.CX__CX8:
				return getCX8();
			case V2xmlPackage.CX__CX9:
				return getCX9();
			case V2xmlPackage.CX__CX10:
				return getCX10();
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
			case V2xmlPackage.CX__CX1:
				setCX1((CX1CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX2:
				setCX2((CX2CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX3:
				setCX3((CX3CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX4:
				setCX4((CX4CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX5:
				setCX5((CX5CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX6:
				setCX6((CX6CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX7:
				setCX7((CX7CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX8:
				setCX8((CX8CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX9:
				setCX9((CX9CONTENT)newValue);
				return;
			case V2xmlPackage.CX__CX10:
				setCX10((CX10CONTENT)newValue);
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
			case V2xmlPackage.CX__CX1:
				setCX1((CX1CONTENT)null);
				return;
			case V2xmlPackage.CX__CX2:
				setCX2((CX2CONTENT)null);
				return;
			case V2xmlPackage.CX__CX3:
				setCX3((CX3CONTENT)null);
				return;
			case V2xmlPackage.CX__CX4:
				setCX4((CX4CONTENT)null);
				return;
			case V2xmlPackage.CX__CX5:
				setCX5((CX5CONTENT)null);
				return;
			case V2xmlPackage.CX__CX6:
				setCX6((CX6CONTENT)null);
				return;
			case V2xmlPackage.CX__CX7:
				setCX7((CX7CONTENT)null);
				return;
			case V2xmlPackage.CX__CX8:
				setCX8((CX8CONTENT)null);
				return;
			case V2xmlPackage.CX__CX9:
				setCX9((CX9CONTENT)null);
				return;
			case V2xmlPackage.CX__CX10:
				setCX10((CX10CONTENT)null);
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
			case V2xmlPackage.CX__CX1:
				return cX1 != null;
			case V2xmlPackage.CX__CX2:
				return cX2 != null;
			case V2xmlPackage.CX__CX3:
				return cX3 != null;
			case V2xmlPackage.CX__CX4:
				return cX4 != null;
			case V2xmlPackage.CX__CX5:
				return cX5 != null;
			case V2xmlPackage.CX__CX6:
				return cX6 != null;
			case V2xmlPackage.CX__CX7:
				return cX7 != null;
			case V2xmlPackage.CX__CX8:
				return cX8 != null;
			case V2xmlPackage.CX__CX9:
				return cX9 != null;
			case V2xmlPackage.CX__CX10:
				return cX10 != null;
		}
		return super.eIsSet(featureID);
	}

} //CXImpl
