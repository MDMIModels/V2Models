/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.FN;
import org.hl7.v2xml.FN1CONTENT;
import org.hl7.v2xml.FN2CONTENT;
import org.hl7.v2xml.FN3CONTENT;
import org.hl7.v2xml.FN4CONTENT;
import org.hl7.v2xml.FN5CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FNImpl#getFN1 <em>FN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FNImpl#getFN2 <em>FN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FNImpl#getFN3 <em>FN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FNImpl#getFN4 <em>FN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FNImpl#getFN5 <em>FN5</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNImpl extends EObjectImpl implements FN {
	/**
	 * The cached value of the '{@link #getFN1() <em>FN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFN1()
	 * @generated
	 * @ordered
	 */
	protected FN1CONTENT fN1;

	/**
	 * The cached value of the '{@link #getFN2() <em>FN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFN2()
	 * @generated
	 * @ordered
	 */
	protected FN2CONTENT fN2;

	/**
	 * The cached value of the '{@link #getFN3() <em>FN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFN3()
	 * @generated
	 * @ordered
	 */
	protected FN3CONTENT fN3;

	/**
	 * The cached value of the '{@link #getFN4() <em>FN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFN4()
	 * @generated
	 * @ordered
	 */
	protected FN4CONTENT fN4;

	/**
	 * The cached value of the '{@link #getFN5() <em>FN5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFN5()
	 * @generated
	 * @ordered
	 */
	protected FN5CONTENT fN5;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN1CONTENT getFN1() {
		return fN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFN1(FN1CONTENT newFN1, NotificationChain msgs) {
		FN1CONTENT oldFN1 = fN1;
		fN1 = newFN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN1, oldFN1, newFN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFN1(FN1CONTENT newFN1) {
		if (newFN1 != fN1) {
			NotificationChain msgs = null;
			if (fN1 != null)
				msgs = ((InternalEObject)fN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN1, null, msgs);
			if (newFN1 != null)
				msgs = ((InternalEObject)newFN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN1, null, msgs);
			msgs = basicSetFN1(newFN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN1, newFN1, newFN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN2CONTENT getFN2() {
		return fN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFN2(FN2CONTENT newFN2, NotificationChain msgs) {
		FN2CONTENT oldFN2 = fN2;
		fN2 = newFN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN2, oldFN2, newFN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFN2(FN2CONTENT newFN2) {
		if (newFN2 != fN2) {
			NotificationChain msgs = null;
			if (fN2 != null)
				msgs = ((InternalEObject)fN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN2, null, msgs);
			if (newFN2 != null)
				msgs = ((InternalEObject)newFN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN2, null, msgs);
			msgs = basicSetFN2(newFN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN2, newFN2, newFN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN3CONTENT getFN3() {
		return fN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFN3(FN3CONTENT newFN3, NotificationChain msgs) {
		FN3CONTENT oldFN3 = fN3;
		fN3 = newFN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN3, oldFN3, newFN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFN3(FN3CONTENT newFN3) {
		if (newFN3 != fN3) {
			NotificationChain msgs = null;
			if (fN3 != null)
				msgs = ((InternalEObject)fN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN3, null, msgs);
			if (newFN3 != null)
				msgs = ((InternalEObject)newFN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN3, null, msgs);
			msgs = basicSetFN3(newFN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN3, newFN3, newFN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN4CONTENT getFN4() {
		return fN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFN4(FN4CONTENT newFN4, NotificationChain msgs) {
		FN4CONTENT oldFN4 = fN4;
		fN4 = newFN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN4, oldFN4, newFN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFN4(FN4CONTENT newFN4) {
		if (newFN4 != fN4) {
			NotificationChain msgs = null;
			if (fN4 != null)
				msgs = ((InternalEObject)fN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN4, null, msgs);
			if (newFN4 != null)
				msgs = ((InternalEObject)newFN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN4, null, msgs);
			msgs = basicSetFN4(newFN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN4, newFN4, newFN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FN5CONTENT getFN5() {
		return fN5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFN5(FN5CONTENT newFN5, NotificationChain msgs) {
		FN5CONTENT oldFN5 = fN5;
		fN5 = newFN5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN5, oldFN5, newFN5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFN5(FN5CONTENT newFN5) {
		if (newFN5 != fN5) {
			NotificationChain msgs = null;
			if (fN5 != null)
				msgs = ((InternalEObject)fN5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN5, null, msgs);
			if (newFN5 != null)
				msgs = ((InternalEObject)newFN5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FN__FN5, null, msgs);
			msgs = basicSetFN5(newFN5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FN__FN5, newFN5, newFN5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.FN__FN1:
				return basicSetFN1(null, msgs);
			case V2xmlPackage.FN__FN2:
				return basicSetFN2(null, msgs);
			case V2xmlPackage.FN__FN3:
				return basicSetFN3(null, msgs);
			case V2xmlPackage.FN__FN4:
				return basicSetFN4(null, msgs);
			case V2xmlPackage.FN__FN5:
				return basicSetFN5(null, msgs);
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
			case V2xmlPackage.FN__FN1:
				return getFN1();
			case V2xmlPackage.FN__FN2:
				return getFN2();
			case V2xmlPackage.FN__FN3:
				return getFN3();
			case V2xmlPackage.FN__FN4:
				return getFN4();
			case V2xmlPackage.FN__FN5:
				return getFN5();
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
			case V2xmlPackage.FN__FN1:
				setFN1((FN1CONTENT)newValue);
				return;
			case V2xmlPackage.FN__FN2:
				setFN2((FN2CONTENT)newValue);
				return;
			case V2xmlPackage.FN__FN3:
				setFN3((FN3CONTENT)newValue);
				return;
			case V2xmlPackage.FN__FN4:
				setFN4((FN4CONTENT)newValue);
				return;
			case V2xmlPackage.FN__FN5:
				setFN5((FN5CONTENT)newValue);
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
			case V2xmlPackage.FN__FN1:
				setFN1((FN1CONTENT)null);
				return;
			case V2xmlPackage.FN__FN2:
				setFN2((FN2CONTENT)null);
				return;
			case V2xmlPackage.FN__FN3:
				setFN3((FN3CONTENT)null);
				return;
			case V2xmlPackage.FN__FN4:
				setFN4((FN4CONTENT)null);
				return;
			case V2xmlPackage.FN__FN5:
				setFN5((FN5CONTENT)null);
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
			case V2xmlPackage.FN__FN1:
				return fN1 != null;
			case V2xmlPackage.FN__FN2:
				return fN2 != null;
			case V2xmlPackage.FN__FN3:
				return fN3 != null;
			case V2xmlPackage.FN__FN4:
				return fN4 != null;
			case V2xmlPackage.FN__FN5:
				return fN5 != null;
		}
		return super.eIsSet(featureID);
	}

} //FNImpl
