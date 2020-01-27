/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CWE;
import org.hl7.v2xml.CWE1CONTENT;
import org.hl7.v2xml.CWE2CONTENT;
import org.hl7.v2xml.CWE3CONTENT;
import org.hl7.v2xml.CWE4CONTENT;
import org.hl7.v2xml.CWE5CONTENT;
import org.hl7.v2xml.CWE6CONTENT;
import org.hl7.v2xml.CWE7CONTENT;
import org.hl7.v2xml.CWE8CONTENT;
import org.hl7.v2xml.CWE9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CWE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE1 <em>CWE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE2 <em>CWE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE3 <em>CWE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE4 <em>CWE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE5 <em>CWE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE6 <em>CWE6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE7 <em>CWE7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE8 <em>CWE8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CWEImpl#getCWE9 <em>CWE9</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CWEImpl extends EObjectImpl implements CWE {
	/**
	 * The cached value of the '{@link #getCWE1() <em>CWE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE1()
	 * @generated
	 * @ordered
	 */
	protected CWE1CONTENT cWE1;

	/**
	 * The cached value of the '{@link #getCWE2() <em>CWE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE2()
	 * @generated
	 * @ordered
	 */
	protected CWE2CONTENT cWE2;

	/**
	 * The cached value of the '{@link #getCWE3() <em>CWE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE3()
	 * @generated
	 * @ordered
	 */
	protected CWE3CONTENT cWE3;

	/**
	 * The cached value of the '{@link #getCWE4() <em>CWE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE4()
	 * @generated
	 * @ordered
	 */
	protected CWE4CONTENT cWE4;

	/**
	 * The cached value of the '{@link #getCWE5() <em>CWE5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE5()
	 * @generated
	 * @ordered
	 */
	protected CWE5CONTENT cWE5;

	/**
	 * The cached value of the '{@link #getCWE6() <em>CWE6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE6()
	 * @generated
	 * @ordered
	 */
	protected CWE6CONTENT cWE6;

	/**
	 * The cached value of the '{@link #getCWE7() <em>CWE7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE7()
	 * @generated
	 * @ordered
	 */
	protected CWE7CONTENT cWE7;

	/**
	 * The cached value of the '{@link #getCWE8() <em>CWE8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE8()
	 * @generated
	 * @ordered
	 */
	protected CWE8CONTENT cWE8;

	/**
	 * The cached value of the '{@link #getCWE9() <em>CWE9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCWE9()
	 * @generated
	 * @ordered
	 */
	protected CWE9CONTENT cWE9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CWEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCWE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE1CONTENT getCWE1() {
		return cWE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE1(CWE1CONTENT newCWE1, NotificationChain msgs) {
		CWE1CONTENT oldCWE1 = cWE1;
		cWE1 = newCWE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE1, oldCWE1, newCWE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE1(CWE1CONTENT newCWE1) {
		if (newCWE1 != cWE1) {
			NotificationChain msgs = null;
			if (cWE1 != null)
				msgs = ((InternalEObject)cWE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE1, null, msgs);
			if (newCWE1 != null)
				msgs = ((InternalEObject)newCWE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE1, null, msgs);
			msgs = basicSetCWE1(newCWE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE1, newCWE1, newCWE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE2CONTENT getCWE2() {
		return cWE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE2(CWE2CONTENT newCWE2, NotificationChain msgs) {
		CWE2CONTENT oldCWE2 = cWE2;
		cWE2 = newCWE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE2, oldCWE2, newCWE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE2(CWE2CONTENT newCWE2) {
		if (newCWE2 != cWE2) {
			NotificationChain msgs = null;
			if (cWE2 != null)
				msgs = ((InternalEObject)cWE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE2, null, msgs);
			if (newCWE2 != null)
				msgs = ((InternalEObject)newCWE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE2, null, msgs);
			msgs = basicSetCWE2(newCWE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE2, newCWE2, newCWE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE3CONTENT getCWE3() {
		return cWE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE3(CWE3CONTENT newCWE3, NotificationChain msgs) {
		CWE3CONTENT oldCWE3 = cWE3;
		cWE3 = newCWE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE3, oldCWE3, newCWE3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE3(CWE3CONTENT newCWE3) {
		if (newCWE3 != cWE3) {
			NotificationChain msgs = null;
			if (cWE3 != null)
				msgs = ((InternalEObject)cWE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE3, null, msgs);
			if (newCWE3 != null)
				msgs = ((InternalEObject)newCWE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE3, null, msgs);
			msgs = basicSetCWE3(newCWE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE3, newCWE3, newCWE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE4CONTENT getCWE4() {
		return cWE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE4(CWE4CONTENT newCWE4, NotificationChain msgs) {
		CWE4CONTENT oldCWE4 = cWE4;
		cWE4 = newCWE4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE4, oldCWE4, newCWE4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE4(CWE4CONTENT newCWE4) {
		if (newCWE4 != cWE4) {
			NotificationChain msgs = null;
			if (cWE4 != null)
				msgs = ((InternalEObject)cWE4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE4, null, msgs);
			if (newCWE4 != null)
				msgs = ((InternalEObject)newCWE4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE4, null, msgs);
			msgs = basicSetCWE4(newCWE4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE4, newCWE4, newCWE4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE5CONTENT getCWE5() {
		return cWE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE5(CWE5CONTENT newCWE5, NotificationChain msgs) {
		CWE5CONTENT oldCWE5 = cWE5;
		cWE5 = newCWE5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE5, oldCWE5, newCWE5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE5(CWE5CONTENT newCWE5) {
		if (newCWE5 != cWE5) {
			NotificationChain msgs = null;
			if (cWE5 != null)
				msgs = ((InternalEObject)cWE5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE5, null, msgs);
			if (newCWE5 != null)
				msgs = ((InternalEObject)newCWE5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE5, null, msgs);
			msgs = basicSetCWE5(newCWE5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE5, newCWE5, newCWE5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE6CONTENT getCWE6() {
		return cWE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE6(CWE6CONTENT newCWE6, NotificationChain msgs) {
		CWE6CONTENT oldCWE6 = cWE6;
		cWE6 = newCWE6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE6, oldCWE6, newCWE6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE6(CWE6CONTENT newCWE6) {
		if (newCWE6 != cWE6) {
			NotificationChain msgs = null;
			if (cWE6 != null)
				msgs = ((InternalEObject)cWE6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE6, null, msgs);
			if (newCWE6 != null)
				msgs = ((InternalEObject)newCWE6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE6, null, msgs);
			msgs = basicSetCWE6(newCWE6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE6, newCWE6, newCWE6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE7CONTENT getCWE7() {
		return cWE7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE7(CWE7CONTENT newCWE7, NotificationChain msgs) {
		CWE7CONTENT oldCWE7 = cWE7;
		cWE7 = newCWE7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE7, oldCWE7, newCWE7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE7(CWE7CONTENT newCWE7) {
		if (newCWE7 != cWE7) {
			NotificationChain msgs = null;
			if (cWE7 != null)
				msgs = ((InternalEObject)cWE7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE7, null, msgs);
			if (newCWE7 != null)
				msgs = ((InternalEObject)newCWE7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE7, null, msgs);
			msgs = basicSetCWE7(newCWE7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE7, newCWE7, newCWE7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE8CONTENT getCWE8() {
		return cWE8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE8(CWE8CONTENT newCWE8, NotificationChain msgs) {
		CWE8CONTENT oldCWE8 = cWE8;
		cWE8 = newCWE8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE8, oldCWE8, newCWE8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE8(CWE8CONTENT newCWE8) {
		if (newCWE8 != cWE8) {
			NotificationChain msgs = null;
			if (cWE8 != null)
				msgs = ((InternalEObject)cWE8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE8, null, msgs);
			if (newCWE8 != null)
				msgs = ((InternalEObject)newCWE8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE8, null, msgs);
			msgs = basicSetCWE8(newCWE8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE8, newCWE8, newCWE8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CWE9CONTENT getCWE9() {
		return cWE9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCWE9(CWE9CONTENT newCWE9, NotificationChain msgs) {
		CWE9CONTENT oldCWE9 = cWE9;
		cWE9 = newCWE9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE9, oldCWE9, newCWE9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCWE9(CWE9CONTENT newCWE9) {
		if (newCWE9 != cWE9) {
			NotificationChain msgs = null;
			if (cWE9 != null)
				msgs = ((InternalEObject)cWE9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE9, null, msgs);
			if (newCWE9 != null)
				msgs = ((InternalEObject)newCWE9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CWE__CWE9, null, msgs);
			msgs = basicSetCWE9(newCWE9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CWE__CWE9, newCWE9, newCWE9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CWE__CWE1:
				return basicSetCWE1(null, msgs);
			case V2xmlPackage.CWE__CWE2:
				return basicSetCWE2(null, msgs);
			case V2xmlPackage.CWE__CWE3:
				return basicSetCWE3(null, msgs);
			case V2xmlPackage.CWE__CWE4:
				return basicSetCWE4(null, msgs);
			case V2xmlPackage.CWE__CWE5:
				return basicSetCWE5(null, msgs);
			case V2xmlPackage.CWE__CWE6:
				return basicSetCWE6(null, msgs);
			case V2xmlPackage.CWE__CWE7:
				return basicSetCWE7(null, msgs);
			case V2xmlPackage.CWE__CWE8:
				return basicSetCWE8(null, msgs);
			case V2xmlPackage.CWE__CWE9:
				return basicSetCWE9(null, msgs);
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
			case V2xmlPackage.CWE__CWE1:
				return getCWE1();
			case V2xmlPackage.CWE__CWE2:
				return getCWE2();
			case V2xmlPackage.CWE__CWE3:
				return getCWE3();
			case V2xmlPackage.CWE__CWE4:
				return getCWE4();
			case V2xmlPackage.CWE__CWE5:
				return getCWE5();
			case V2xmlPackage.CWE__CWE6:
				return getCWE6();
			case V2xmlPackage.CWE__CWE7:
				return getCWE7();
			case V2xmlPackage.CWE__CWE8:
				return getCWE8();
			case V2xmlPackage.CWE__CWE9:
				return getCWE9();
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
			case V2xmlPackage.CWE__CWE1:
				setCWE1((CWE1CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE2:
				setCWE2((CWE2CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE3:
				setCWE3((CWE3CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE4:
				setCWE4((CWE4CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE5:
				setCWE5((CWE5CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE6:
				setCWE6((CWE6CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE7:
				setCWE7((CWE7CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE8:
				setCWE8((CWE8CONTENT)newValue);
				return;
			case V2xmlPackage.CWE__CWE9:
				setCWE9((CWE9CONTENT)newValue);
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
			case V2xmlPackage.CWE__CWE1:
				setCWE1((CWE1CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE2:
				setCWE2((CWE2CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE3:
				setCWE3((CWE3CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE4:
				setCWE4((CWE4CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE5:
				setCWE5((CWE5CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE6:
				setCWE6((CWE6CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE7:
				setCWE7((CWE7CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE8:
				setCWE8((CWE8CONTENT)null);
				return;
			case V2xmlPackage.CWE__CWE9:
				setCWE9((CWE9CONTENT)null);
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
			case V2xmlPackage.CWE__CWE1:
				return cWE1 != null;
			case V2xmlPackage.CWE__CWE2:
				return cWE2 != null;
			case V2xmlPackage.CWE__CWE3:
				return cWE3 != null;
			case V2xmlPackage.CWE__CWE4:
				return cWE4 != null;
			case V2xmlPackage.CWE__CWE5:
				return cWE5 != null;
			case V2xmlPackage.CWE__CWE6:
				return cWE6 != null;
			case V2xmlPackage.CWE__CWE7:
				return cWE7 != null;
			case V2xmlPackage.CWE__CWE8:
				return cWE8 != null;
			case V2xmlPackage.CWE__CWE9:
				return cWE9 != null;
		}
		return super.eIsSet(featureID);
	}

} //CWEImpl
