/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CF;
import org.hl7.v2xml.CF1CONTENT;
import org.hl7.v2xml.CF2CONTENT;
import org.hl7.v2xml.CF3CONTENT;
import org.hl7.v2xml.CF4CONTENT;
import org.hl7.v2xml.CF5CONTENT;
import org.hl7.v2xml.CF6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF1 <em>CF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF2 <em>CF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF3 <em>CF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF4 <em>CF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF5 <em>CF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CFImpl#getCF6 <em>CF6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFImpl extends EObjectImpl implements CF {
	/**
	 * The cached value of the '{@link #getCF1() <em>CF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF1()
	 * @generated
	 * @ordered
	 */
	protected CF1CONTENT cF1;

	/**
	 * The cached value of the '{@link #getCF2() <em>CF2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF2()
	 * @generated
	 * @ordered
	 */
	protected CF2CONTENT cF2;

	/**
	 * The cached value of the '{@link #getCF3() <em>CF3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF3()
	 * @generated
	 * @ordered
	 */
	protected CF3CONTENT cF3;

	/**
	 * The cached value of the '{@link #getCF4() <em>CF4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF4()
	 * @generated
	 * @ordered
	 */
	protected CF4CONTENT cF4;

	/**
	 * The cached value of the '{@link #getCF5() <em>CF5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF5()
	 * @generated
	 * @ordered
	 */
	protected CF5CONTENT cF5;

	/**
	 * The cached value of the '{@link #getCF6() <em>CF6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCF6()
	 * @generated
	 * @ordered
	 */
	protected CF6CONTENT cF6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCF();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF1CONTENT getCF1() {
		return cF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF1(CF1CONTENT newCF1, NotificationChain msgs) {
		CF1CONTENT oldCF1 = cF1;
		cF1 = newCF1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF1, oldCF1, newCF1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF1(CF1CONTENT newCF1) {
		if (newCF1 != cF1) {
			NotificationChain msgs = null;
			if (cF1 != null)
				msgs = ((InternalEObject)cF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF1, null, msgs);
			if (newCF1 != null)
				msgs = ((InternalEObject)newCF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF1, null, msgs);
			msgs = basicSetCF1(newCF1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF1, newCF1, newCF1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF2CONTENT getCF2() {
		return cF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF2(CF2CONTENT newCF2, NotificationChain msgs) {
		CF2CONTENT oldCF2 = cF2;
		cF2 = newCF2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF2, oldCF2, newCF2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF2(CF2CONTENT newCF2) {
		if (newCF2 != cF2) {
			NotificationChain msgs = null;
			if (cF2 != null)
				msgs = ((InternalEObject)cF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF2, null, msgs);
			if (newCF2 != null)
				msgs = ((InternalEObject)newCF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF2, null, msgs);
			msgs = basicSetCF2(newCF2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF2, newCF2, newCF2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF3CONTENT getCF3() {
		return cF3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF3(CF3CONTENT newCF3, NotificationChain msgs) {
		CF3CONTENT oldCF3 = cF3;
		cF3 = newCF3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF3, oldCF3, newCF3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF3(CF3CONTENT newCF3) {
		if (newCF3 != cF3) {
			NotificationChain msgs = null;
			if (cF3 != null)
				msgs = ((InternalEObject)cF3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF3, null, msgs);
			if (newCF3 != null)
				msgs = ((InternalEObject)newCF3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF3, null, msgs);
			msgs = basicSetCF3(newCF3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF3, newCF3, newCF3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF4CONTENT getCF4() {
		return cF4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF4(CF4CONTENT newCF4, NotificationChain msgs) {
		CF4CONTENT oldCF4 = cF4;
		cF4 = newCF4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF4, oldCF4, newCF4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF4(CF4CONTENT newCF4) {
		if (newCF4 != cF4) {
			NotificationChain msgs = null;
			if (cF4 != null)
				msgs = ((InternalEObject)cF4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF4, null, msgs);
			if (newCF4 != null)
				msgs = ((InternalEObject)newCF4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF4, null, msgs);
			msgs = basicSetCF4(newCF4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF4, newCF4, newCF4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF5CONTENT getCF5() {
		return cF5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF5(CF5CONTENT newCF5, NotificationChain msgs) {
		CF5CONTENT oldCF5 = cF5;
		cF5 = newCF5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF5, oldCF5, newCF5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF5(CF5CONTENT newCF5) {
		if (newCF5 != cF5) {
			NotificationChain msgs = null;
			if (cF5 != null)
				msgs = ((InternalEObject)cF5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF5, null, msgs);
			if (newCF5 != null)
				msgs = ((InternalEObject)newCF5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF5, null, msgs);
			msgs = basicSetCF5(newCF5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF5, newCF5, newCF5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CF6CONTENT getCF6() {
		return cF6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCF6(CF6CONTENT newCF6, NotificationChain msgs) {
		CF6CONTENT oldCF6 = cF6;
		cF6 = newCF6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF6, oldCF6, newCF6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCF6(CF6CONTENT newCF6) {
		if (newCF6 != cF6) {
			NotificationChain msgs = null;
			if (cF6 != null)
				msgs = ((InternalEObject)cF6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF6, null, msgs);
			if (newCF6 != null)
				msgs = ((InternalEObject)newCF6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CF__CF6, null, msgs);
			msgs = basicSetCF6(newCF6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CF__CF6, newCF6, newCF6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CF__CF1:
				return basicSetCF1(null, msgs);
			case V2xmlPackage.CF__CF2:
				return basicSetCF2(null, msgs);
			case V2xmlPackage.CF__CF3:
				return basicSetCF3(null, msgs);
			case V2xmlPackage.CF__CF4:
				return basicSetCF4(null, msgs);
			case V2xmlPackage.CF__CF5:
				return basicSetCF5(null, msgs);
			case V2xmlPackage.CF__CF6:
				return basicSetCF6(null, msgs);
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
			case V2xmlPackage.CF__CF1:
				return getCF1();
			case V2xmlPackage.CF__CF2:
				return getCF2();
			case V2xmlPackage.CF__CF3:
				return getCF3();
			case V2xmlPackage.CF__CF4:
				return getCF4();
			case V2xmlPackage.CF__CF5:
				return getCF5();
			case V2xmlPackage.CF__CF6:
				return getCF6();
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
			case V2xmlPackage.CF__CF1:
				setCF1((CF1CONTENT)newValue);
				return;
			case V2xmlPackage.CF__CF2:
				setCF2((CF2CONTENT)newValue);
				return;
			case V2xmlPackage.CF__CF3:
				setCF3((CF3CONTENT)newValue);
				return;
			case V2xmlPackage.CF__CF4:
				setCF4((CF4CONTENT)newValue);
				return;
			case V2xmlPackage.CF__CF5:
				setCF5((CF5CONTENT)newValue);
				return;
			case V2xmlPackage.CF__CF6:
				setCF6((CF6CONTENT)newValue);
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
			case V2xmlPackage.CF__CF1:
				setCF1((CF1CONTENT)null);
				return;
			case V2xmlPackage.CF__CF2:
				setCF2((CF2CONTENT)null);
				return;
			case V2xmlPackage.CF__CF3:
				setCF3((CF3CONTENT)null);
				return;
			case V2xmlPackage.CF__CF4:
				setCF4((CF4CONTENT)null);
				return;
			case V2xmlPackage.CF__CF5:
				setCF5((CF5CONTENT)null);
				return;
			case V2xmlPackage.CF__CF6:
				setCF6((CF6CONTENT)null);
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
			case V2xmlPackage.CF__CF1:
				return cF1 != null;
			case V2xmlPackage.CF__CF2:
				return cF2 != null;
			case V2xmlPackage.CF__CF3:
				return cF3 != null;
			case V2xmlPackage.CF__CF4:
				return cF4 != null;
			case V2xmlPackage.CF__CF5:
				return cF5 != null;
			case V2xmlPackage.CF__CF6:
				return cF6 != null;
		}
		return super.eIsSet(featureID);
	}

} //CFImpl
