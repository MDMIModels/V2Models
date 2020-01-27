/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CNE;
import org.hl7.v2xml.CNE1CONTENT;
import org.hl7.v2xml.CNE2CONTENT;
import org.hl7.v2xml.CNE3CONTENT;
import org.hl7.v2xml.CNE4CONTENT;
import org.hl7.v2xml.CNE5CONTENT;
import org.hl7.v2xml.CNE6CONTENT;
import org.hl7.v2xml.CNE7CONTENT;
import org.hl7.v2xml.CNE8CONTENT;
import org.hl7.v2xml.CNE9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CNE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE1 <em>CNE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE2 <em>CNE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE3 <em>CNE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE4 <em>CNE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE5 <em>CNE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE6 <em>CNE6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE7 <em>CNE7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE8 <em>CNE8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNEImpl#getCNE9 <em>CNE9</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CNEImpl extends EObjectImpl implements CNE {
	/**
	 * The cached value of the '{@link #getCNE1() <em>CNE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE1()
	 * @generated
	 * @ordered
	 */
	protected CNE1CONTENT cNE1;

	/**
	 * The cached value of the '{@link #getCNE2() <em>CNE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE2()
	 * @generated
	 * @ordered
	 */
	protected CNE2CONTENT cNE2;

	/**
	 * The cached value of the '{@link #getCNE3() <em>CNE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE3()
	 * @generated
	 * @ordered
	 */
	protected CNE3CONTENT cNE3;

	/**
	 * The cached value of the '{@link #getCNE4() <em>CNE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE4()
	 * @generated
	 * @ordered
	 */
	protected CNE4CONTENT cNE4;

	/**
	 * The cached value of the '{@link #getCNE5() <em>CNE5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE5()
	 * @generated
	 * @ordered
	 */
	protected CNE5CONTENT cNE5;

	/**
	 * The cached value of the '{@link #getCNE6() <em>CNE6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE6()
	 * @generated
	 * @ordered
	 */
	protected CNE6CONTENT cNE6;

	/**
	 * The cached value of the '{@link #getCNE7() <em>CNE7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE7()
	 * @generated
	 * @ordered
	 */
	protected CNE7CONTENT cNE7;

	/**
	 * The cached value of the '{@link #getCNE8() <em>CNE8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE8()
	 * @generated
	 * @ordered
	 */
	protected CNE8CONTENT cNE8;

	/**
	 * The cached value of the '{@link #getCNE9() <em>CNE9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNE9()
	 * @generated
	 * @ordered
	 */
	protected CNE9CONTENT cNE9;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCNE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE1CONTENT getCNE1() {
		return cNE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE1(CNE1CONTENT newCNE1, NotificationChain msgs) {
		CNE1CONTENT oldCNE1 = cNE1;
		cNE1 = newCNE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE1, oldCNE1, newCNE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE1(CNE1CONTENT newCNE1) {
		if (newCNE1 != cNE1) {
			NotificationChain msgs = null;
			if (cNE1 != null)
				msgs = ((InternalEObject)cNE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE1, null, msgs);
			if (newCNE1 != null)
				msgs = ((InternalEObject)newCNE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE1, null, msgs);
			msgs = basicSetCNE1(newCNE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE1, newCNE1, newCNE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE2CONTENT getCNE2() {
		return cNE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE2(CNE2CONTENT newCNE2, NotificationChain msgs) {
		CNE2CONTENT oldCNE2 = cNE2;
		cNE2 = newCNE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE2, oldCNE2, newCNE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE2(CNE2CONTENT newCNE2) {
		if (newCNE2 != cNE2) {
			NotificationChain msgs = null;
			if (cNE2 != null)
				msgs = ((InternalEObject)cNE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE2, null, msgs);
			if (newCNE2 != null)
				msgs = ((InternalEObject)newCNE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE2, null, msgs);
			msgs = basicSetCNE2(newCNE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE2, newCNE2, newCNE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE3CONTENT getCNE3() {
		return cNE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE3(CNE3CONTENT newCNE3, NotificationChain msgs) {
		CNE3CONTENT oldCNE3 = cNE3;
		cNE3 = newCNE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE3, oldCNE3, newCNE3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE3(CNE3CONTENT newCNE3) {
		if (newCNE3 != cNE3) {
			NotificationChain msgs = null;
			if (cNE3 != null)
				msgs = ((InternalEObject)cNE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE3, null, msgs);
			if (newCNE3 != null)
				msgs = ((InternalEObject)newCNE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE3, null, msgs);
			msgs = basicSetCNE3(newCNE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE3, newCNE3, newCNE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE4CONTENT getCNE4() {
		return cNE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE4(CNE4CONTENT newCNE4, NotificationChain msgs) {
		CNE4CONTENT oldCNE4 = cNE4;
		cNE4 = newCNE4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE4, oldCNE4, newCNE4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE4(CNE4CONTENT newCNE4) {
		if (newCNE4 != cNE4) {
			NotificationChain msgs = null;
			if (cNE4 != null)
				msgs = ((InternalEObject)cNE4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE4, null, msgs);
			if (newCNE4 != null)
				msgs = ((InternalEObject)newCNE4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE4, null, msgs);
			msgs = basicSetCNE4(newCNE4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE4, newCNE4, newCNE4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE5CONTENT getCNE5() {
		return cNE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE5(CNE5CONTENT newCNE5, NotificationChain msgs) {
		CNE5CONTENT oldCNE5 = cNE5;
		cNE5 = newCNE5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE5, oldCNE5, newCNE5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE5(CNE5CONTENT newCNE5) {
		if (newCNE5 != cNE5) {
			NotificationChain msgs = null;
			if (cNE5 != null)
				msgs = ((InternalEObject)cNE5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE5, null, msgs);
			if (newCNE5 != null)
				msgs = ((InternalEObject)newCNE5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE5, null, msgs);
			msgs = basicSetCNE5(newCNE5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE5, newCNE5, newCNE5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE6CONTENT getCNE6() {
		return cNE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE6(CNE6CONTENT newCNE6, NotificationChain msgs) {
		CNE6CONTENT oldCNE6 = cNE6;
		cNE6 = newCNE6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE6, oldCNE6, newCNE6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE6(CNE6CONTENT newCNE6) {
		if (newCNE6 != cNE6) {
			NotificationChain msgs = null;
			if (cNE6 != null)
				msgs = ((InternalEObject)cNE6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE6, null, msgs);
			if (newCNE6 != null)
				msgs = ((InternalEObject)newCNE6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE6, null, msgs);
			msgs = basicSetCNE6(newCNE6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE6, newCNE6, newCNE6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE7CONTENT getCNE7() {
		return cNE7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE7(CNE7CONTENT newCNE7, NotificationChain msgs) {
		CNE7CONTENT oldCNE7 = cNE7;
		cNE7 = newCNE7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE7, oldCNE7, newCNE7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE7(CNE7CONTENT newCNE7) {
		if (newCNE7 != cNE7) {
			NotificationChain msgs = null;
			if (cNE7 != null)
				msgs = ((InternalEObject)cNE7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE7, null, msgs);
			if (newCNE7 != null)
				msgs = ((InternalEObject)newCNE7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE7, null, msgs);
			msgs = basicSetCNE7(newCNE7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE7, newCNE7, newCNE7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE8CONTENT getCNE8() {
		return cNE8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE8(CNE8CONTENT newCNE8, NotificationChain msgs) {
		CNE8CONTENT oldCNE8 = cNE8;
		cNE8 = newCNE8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE8, oldCNE8, newCNE8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE8(CNE8CONTENT newCNE8) {
		if (newCNE8 != cNE8) {
			NotificationChain msgs = null;
			if (cNE8 != null)
				msgs = ((InternalEObject)cNE8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE8, null, msgs);
			if (newCNE8 != null)
				msgs = ((InternalEObject)newCNE8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE8, null, msgs);
			msgs = basicSetCNE8(newCNE8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE8, newCNE8, newCNE8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNE9CONTENT getCNE9() {
		return cNE9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNE9(CNE9CONTENT newCNE9, NotificationChain msgs) {
		CNE9CONTENT oldCNE9 = cNE9;
		cNE9 = newCNE9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE9, oldCNE9, newCNE9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNE9(CNE9CONTENT newCNE9) {
		if (newCNE9 != cNE9) {
			NotificationChain msgs = null;
			if (cNE9 != null)
				msgs = ((InternalEObject)cNE9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE9, null, msgs);
			if (newCNE9 != null)
				msgs = ((InternalEObject)newCNE9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNE__CNE9, null, msgs);
			msgs = basicSetCNE9(newCNE9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNE__CNE9, newCNE9, newCNE9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CNE__CNE1:
				return basicSetCNE1(null, msgs);
			case V2xmlPackage.CNE__CNE2:
				return basicSetCNE2(null, msgs);
			case V2xmlPackage.CNE__CNE3:
				return basicSetCNE3(null, msgs);
			case V2xmlPackage.CNE__CNE4:
				return basicSetCNE4(null, msgs);
			case V2xmlPackage.CNE__CNE5:
				return basicSetCNE5(null, msgs);
			case V2xmlPackage.CNE__CNE6:
				return basicSetCNE6(null, msgs);
			case V2xmlPackage.CNE__CNE7:
				return basicSetCNE7(null, msgs);
			case V2xmlPackage.CNE__CNE8:
				return basicSetCNE8(null, msgs);
			case V2xmlPackage.CNE__CNE9:
				return basicSetCNE9(null, msgs);
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
			case V2xmlPackage.CNE__CNE1:
				return getCNE1();
			case V2xmlPackage.CNE__CNE2:
				return getCNE2();
			case V2xmlPackage.CNE__CNE3:
				return getCNE3();
			case V2xmlPackage.CNE__CNE4:
				return getCNE4();
			case V2xmlPackage.CNE__CNE5:
				return getCNE5();
			case V2xmlPackage.CNE__CNE6:
				return getCNE6();
			case V2xmlPackage.CNE__CNE7:
				return getCNE7();
			case V2xmlPackage.CNE__CNE8:
				return getCNE8();
			case V2xmlPackage.CNE__CNE9:
				return getCNE9();
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
			case V2xmlPackage.CNE__CNE1:
				setCNE1((CNE1CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE2:
				setCNE2((CNE2CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE3:
				setCNE3((CNE3CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE4:
				setCNE4((CNE4CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE5:
				setCNE5((CNE5CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE6:
				setCNE6((CNE6CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE7:
				setCNE7((CNE7CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE8:
				setCNE8((CNE8CONTENT)newValue);
				return;
			case V2xmlPackage.CNE__CNE9:
				setCNE9((CNE9CONTENT)newValue);
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
			case V2xmlPackage.CNE__CNE1:
				setCNE1((CNE1CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE2:
				setCNE2((CNE2CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE3:
				setCNE3((CNE3CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE4:
				setCNE4((CNE4CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE5:
				setCNE5((CNE5CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE6:
				setCNE6((CNE6CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE7:
				setCNE7((CNE7CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE8:
				setCNE8((CNE8CONTENT)null);
				return;
			case V2xmlPackage.CNE__CNE9:
				setCNE9((CNE9CONTENT)null);
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
			case V2xmlPackage.CNE__CNE1:
				return cNE1 != null;
			case V2xmlPackage.CNE__CNE2:
				return cNE2 != null;
			case V2xmlPackage.CNE__CNE3:
				return cNE3 != null;
			case V2xmlPackage.CNE__CNE4:
				return cNE4 != null;
			case V2xmlPackage.CNE__CNE5:
				return cNE5 != null;
			case V2xmlPackage.CNE__CNE6:
				return cNE6 != null;
			case V2xmlPackage.CNE__CNE7:
				return cNE7 != null;
			case V2xmlPackage.CNE__CNE8:
				return cNE8 != null;
			case V2xmlPackage.CNE__CNE9:
				return cNE9 != null;
		}
		return super.eIsSet(featureID);
	}

} //CNEImpl
