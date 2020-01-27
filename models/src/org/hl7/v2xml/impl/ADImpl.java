/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.AD;
import org.hl7.v2xml.AD1CONTENT;
import org.hl7.v2xml.AD2CONTENT;
import org.hl7.v2xml.AD3CONTENT;
import org.hl7.v2xml.AD4CONTENT;
import org.hl7.v2xml.AD5CONTENT;
import org.hl7.v2xml.AD6CONTENT;
import org.hl7.v2xml.AD7CONTENT;
import org.hl7.v2xml.AD8CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD1 <em>AD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD2 <em>AD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD3 <em>AD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD4 <em>AD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD5 <em>AD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD6 <em>AD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD7 <em>AD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ADImpl#getAD8 <em>AD8</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADImpl extends EObjectImpl implements AD {
	/**
	 * The cached value of the '{@link #getAD1() <em>AD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD1()
	 * @generated
	 * @ordered
	 */
	protected AD1CONTENT aD1;

	/**
	 * The cached value of the '{@link #getAD2() <em>AD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD2()
	 * @generated
	 * @ordered
	 */
	protected AD2CONTENT aD2;

	/**
	 * The cached value of the '{@link #getAD3() <em>AD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD3()
	 * @generated
	 * @ordered
	 */
	protected AD3CONTENT aD3;

	/**
	 * The cached value of the '{@link #getAD4() <em>AD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD4()
	 * @generated
	 * @ordered
	 */
	protected AD4CONTENT aD4;

	/**
	 * The cached value of the '{@link #getAD5() <em>AD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD5()
	 * @generated
	 * @ordered
	 */
	protected AD5CONTENT aD5;

	/**
	 * The cached value of the '{@link #getAD6() <em>AD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD6()
	 * @generated
	 * @ordered
	 */
	protected AD6CONTENT aD6;

	/**
	 * The cached value of the '{@link #getAD7() <em>AD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD7()
	 * @generated
	 * @ordered
	 */
	protected AD7CONTENT aD7;

	/**
	 * The cached value of the '{@link #getAD8() <em>AD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAD8()
	 * @generated
	 * @ordered
	 */
	protected AD8CONTENT aD8;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD1CONTENT getAD1() {
		return aD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD1(AD1CONTENT newAD1, NotificationChain msgs) {
		AD1CONTENT oldAD1 = aD1;
		aD1 = newAD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD1, oldAD1, newAD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD1(AD1CONTENT newAD1) {
		if (newAD1 != aD1) {
			NotificationChain msgs = null;
			if (aD1 != null)
				msgs = ((InternalEObject)aD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD1, null, msgs);
			if (newAD1 != null)
				msgs = ((InternalEObject)newAD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD1, null, msgs);
			msgs = basicSetAD1(newAD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD1, newAD1, newAD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD2CONTENT getAD2() {
		return aD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD2(AD2CONTENT newAD2, NotificationChain msgs) {
		AD2CONTENT oldAD2 = aD2;
		aD2 = newAD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD2, oldAD2, newAD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD2(AD2CONTENT newAD2) {
		if (newAD2 != aD2) {
			NotificationChain msgs = null;
			if (aD2 != null)
				msgs = ((InternalEObject)aD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD2, null, msgs);
			if (newAD2 != null)
				msgs = ((InternalEObject)newAD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD2, null, msgs);
			msgs = basicSetAD2(newAD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD2, newAD2, newAD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD3CONTENT getAD3() {
		return aD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD3(AD3CONTENT newAD3, NotificationChain msgs) {
		AD3CONTENT oldAD3 = aD3;
		aD3 = newAD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD3, oldAD3, newAD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD3(AD3CONTENT newAD3) {
		if (newAD3 != aD3) {
			NotificationChain msgs = null;
			if (aD3 != null)
				msgs = ((InternalEObject)aD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD3, null, msgs);
			if (newAD3 != null)
				msgs = ((InternalEObject)newAD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD3, null, msgs);
			msgs = basicSetAD3(newAD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD3, newAD3, newAD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD4CONTENT getAD4() {
		return aD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD4(AD4CONTENT newAD4, NotificationChain msgs) {
		AD4CONTENT oldAD4 = aD4;
		aD4 = newAD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD4, oldAD4, newAD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD4(AD4CONTENT newAD4) {
		if (newAD4 != aD4) {
			NotificationChain msgs = null;
			if (aD4 != null)
				msgs = ((InternalEObject)aD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD4, null, msgs);
			if (newAD4 != null)
				msgs = ((InternalEObject)newAD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD4, null, msgs);
			msgs = basicSetAD4(newAD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD4, newAD4, newAD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD5CONTENT getAD5() {
		return aD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD5(AD5CONTENT newAD5, NotificationChain msgs) {
		AD5CONTENT oldAD5 = aD5;
		aD5 = newAD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD5, oldAD5, newAD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD5(AD5CONTENT newAD5) {
		if (newAD5 != aD5) {
			NotificationChain msgs = null;
			if (aD5 != null)
				msgs = ((InternalEObject)aD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD5, null, msgs);
			if (newAD5 != null)
				msgs = ((InternalEObject)newAD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD5, null, msgs);
			msgs = basicSetAD5(newAD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD5, newAD5, newAD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD6CONTENT getAD6() {
		return aD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD6(AD6CONTENT newAD6, NotificationChain msgs) {
		AD6CONTENT oldAD6 = aD6;
		aD6 = newAD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD6, oldAD6, newAD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD6(AD6CONTENT newAD6) {
		if (newAD6 != aD6) {
			NotificationChain msgs = null;
			if (aD6 != null)
				msgs = ((InternalEObject)aD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD6, null, msgs);
			if (newAD6 != null)
				msgs = ((InternalEObject)newAD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD6, null, msgs);
			msgs = basicSetAD6(newAD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD6, newAD6, newAD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD7CONTENT getAD7() {
		return aD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD7(AD7CONTENT newAD7, NotificationChain msgs) {
		AD7CONTENT oldAD7 = aD7;
		aD7 = newAD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD7, oldAD7, newAD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD7(AD7CONTENT newAD7) {
		if (newAD7 != aD7) {
			NotificationChain msgs = null;
			if (aD7 != null)
				msgs = ((InternalEObject)aD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD7, null, msgs);
			if (newAD7 != null)
				msgs = ((InternalEObject)newAD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD7, null, msgs);
			msgs = basicSetAD7(newAD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD7, newAD7, newAD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AD8CONTENT getAD8() {
		return aD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAD8(AD8CONTENT newAD8, NotificationChain msgs) {
		AD8CONTENT oldAD8 = aD8;
		aD8 = newAD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD8, oldAD8, newAD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAD8(AD8CONTENT newAD8) {
		if (newAD8 != aD8) {
			NotificationChain msgs = null;
			if (aD8 != null)
				msgs = ((InternalEObject)aD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD8, null, msgs);
			if (newAD8 != null)
				msgs = ((InternalEObject)newAD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AD__AD8, null, msgs);
			msgs = basicSetAD8(newAD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AD__AD8, newAD8, newAD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.AD__AD1:
				return basicSetAD1(null, msgs);
			case V2xmlPackage.AD__AD2:
				return basicSetAD2(null, msgs);
			case V2xmlPackage.AD__AD3:
				return basicSetAD3(null, msgs);
			case V2xmlPackage.AD__AD4:
				return basicSetAD4(null, msgs);
			case V2xmlPackage.AD__AD5:
				return basicSetAD5(null, msgs);
			case V2xmlPackage.AD__AD6:
				return basicSetAD6(null, msgs);
			case V2xmlPackage.AD__AD7:
				return basicSetAD7(null, msgs);
			case V2xmlPackage.AD__AD8:
				return basicSetAD8(null, msgs);
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
			case V2xmlPackage.AD__AD1:
				return getAD1();
			case V2xmlPackage.AD__AD2:
				return getAD2();
			case V2xmlPackage.AD__AD3:
				return getAD3();
			case V2xmlPackage.AD__AD4:
				return getAD4();
			case V2xmlPackage.AD__AD5:
				return getAD5();
			case V2xmlPackage.AD__AD6:
				return getAD6();
			case V2xmlPackage.AD__AD7:
				return getAD7();
			case V2xmlPackage.AD__AD8:
				return getAD8();
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
			case V2xmlPackage.AD__AD1:
				setAD1((AD1CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD2:
				setAD2((AD2CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD3:
				setAD3((AD3CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD4:
				setAD4((AD4CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD5:
				setAD5((AD5CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD6:
				setAD6((AD6CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD7:
				setAD7((AD7CONTENT)newValue);
				return;
			case V2xmlPackage.AD__AD8:
				setAD8((AD8CONTENT)newValue);
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
			case V2xmlPackage.AD__AD1:
				setAD1((AD1CONTENT)null);
				return;
			case V2xmlPackage.AD__AD2:
				setAD2((AD2CONTENT)null);
				return;
			case V2xmlPackage.AD__AD3:
				setAD3((AD3CONTENT)null);
				return;
			case V2xmlPackage.AD__AD4:
				setAD4((AD4CONTENT)null);
				return;
			case V2xmlPackage.AD__AD5:
				setAD5((AD5CONTENT)null);
				return;
			case V2xmlPackage.AD__AD6:
				setAD6((AD6CONTENT)null);
				return;
			case V2xmlPackage.AD__AD7:
				setAD7((AD7CONTENT)null);
				return;
			case V2xmlPackage.AD__AD8:
				setAD8((AD8CONTENT)null);
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
			case V2xmlPackage.AD__AD1:
				return aD1 != null;
			case V2xmlPackage.AD__AD2:
				return aD2 != null;
			case V2xmlPackage.AD__AD3:
				return aD3 != null;
			case V2xmlPackage.AD__AD4:
				return aD4 != null;
			case V2xmlPackage.AD__AD5:
				return aD5 != null;
			case V2xmlPackage.AD__AD6:
				return aD6 != null;
			case V2xmlPackage.AD__AD7:
				return aD7 != null;
			case V2xmlPackage.AD__AD8:
				return aD8 != null;
		}
		return super.eIsSet(featureID);
	}

} //ADImpl
