/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.ICD;
import org.hl7.v2xml.ICD1CONTENT;
import org.hl7.v2xml.ICD2CONTENT;
import org.hl7.v2xml.ICD3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ICD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ICDImpl#getICD1 <em>ICD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ICDImpl#getICD2 <em>ICD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ICDImpl#getICD3 <em>ICD3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ICDImpl extends EObjectImpl implements ICD {
	/**
	 * The cached value of the '{@link #getICD1() <em>ICD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICD1()
	 * @generated
	 * @ordered
	 */
	protected ICD1CONTENT iCD1;

	/**
	 * The cached value of the '{@link #getICD2() <em>ICD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICD2()
	 * @generated
	 * @ordered
	 */
	protected ICD2CONTENT iCD2;

	/**
	 * The cached value of the '{@link #getICD3() <em>ICD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getICD3()
	 * @generated
	 * @ordered
	 */
	protected ICD3CONTENT iCD3;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ICDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getICD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICD1CONTENT getICD1() {
		return iCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetICD1(ICD1CONTENT newICD1, NotificationChain msgs) {
		ICD1CONTENT oldICD1 = iCD1;
		iCD1 = newICD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD1, oldICD1, newICD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setICD1(ICD1CONTENT newICD1) {
		if (newICD1 != iCD1) {
			NotificationChain msgs = null;
			if (iCD1 != null)
				msgs = ((InternalEObject)iCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD1, null, msgs);
			if (newICD1 != null)
				msgs = ((InternalEObject)newICD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD1, null, msgs);
			msgs = basicSetICD1(newICD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD1, newICD1, newICD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICD2CONTENT getICD2() {
		return iCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetICD2(ICD2CONTENT newICD2, NotificationChain msgs) {
		ICD2CONTENT oldICD2 = iCD2;
		iCD2 = newICD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD2, oldICD2, newICD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setICD2(ICD2CONTENT newICD2) {
		if (newICD2 != iCD2) {
			NotificationChain msgs = null;
			if (iCD2 != null)
				msgs = ((InternalEObject)iCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD2, null, msgs);
			if (newICD2 != null)
				msgs = ((InternalEObject)newICD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD2, null, msgs);
			msgs = basicSetICD2(newICD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD2, newICD2, newICD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICD3CONTENT getICD3() {
		return iCD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetICD3(ICD3CONTENT newICD3, NotificationChain msgs) {
		ICD3CONTENT oldICD3 = iCD3;
		iCD3 = newICD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD3, oldICD3, newICD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setICD3(ICD3CONTENT newICD3) {
		if (newICD3 != iCD3) {
			NotificationChain msgs = null;
			if (iCD3 != null)
				msgs = ((InternalEObject)iCD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD3, null, msgs);
			if (newICD3 != null)
				msgs = ((InternalEObject)newICD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ICD__ICD3, null, msgs);
			msgs = basicSetICD3(newICD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ICD__ICD3, newICD3, newICD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ICD__ICD1:
				return basicSetICD1(null, msgs);
			case V2xmlPackage.ICD__ICD2:
				return basicSetICD2(null, msgs);
			case V2xmlPackage.ICD__ICD3:
				return basicSetICD3(null, msgs);
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
			case V2xmlPackage.ICD__ICD1:
				return getICD1();
			case V2xmlPackage.ICD__ICD2:
				return getICD2();
			case V2xmlPackage.ICD__ICD3:
				return getICD3();
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
			case V2xmlPackage.ICD__ICD1:
				setICD1((ICD1CONTENT)newValue);
				return;
			case V2xmlPackage.ICD__ICD2:
				setICD2((ICD2CONTENT)newValue);
				return;
			case V2xmlPackage.ICD__ICD3:
				setICD3((ICD3CONTENT)newValue);
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
			case V2xmlPackage.ICD__ICD1:
				setICD1((ICD1CONTENT)null);
				return;
			case V2xmlPackage.ICD__ICD2:
				setICD2((ICD2CONTENT)null);
				return;
			case V2xmlPackage.ICD__ICD3:
				setICD3((ICD3CONTENT)null);
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
			case V2xmlPackage.ICD__ICD1:
				return iCD1 != null;
			case V2xmlPackage.ICD__ICD2:
				return iCD2 != null;
			case V2xmlPackage.ICD__ICD3:
				return iCD3 != null;
		}
		return super.eIsSet(featureID);
	}

} //ICDImpl
