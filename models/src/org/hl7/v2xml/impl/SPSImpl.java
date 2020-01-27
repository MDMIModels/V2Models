/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.SPS;
import org.hl7.v2xml.SPS1CONTENT;
import org.hl7.v2xml.SPS2CONTENT;
import org.hl7.v2xml.SPS3CONTENT;
import org.hl7.v2xml.SPS4CONTENT;
import org.hl7.v2xml.SPS5CONTENT;
import org.hl7.v2xml.SPS6CONTENT;
import org.hl7.v2xml.SPS7CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS1 <em>SPS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS2 <em>SPS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS3 <em>SPS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS4 <em>SPS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS5 <em>SPS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS6 <em>SPS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPSImpl#getSPS7 <em>SPS7</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPSImpl extends EObjectImpl implements SPS {
	/**
	 * The cached value of the '{@link #getSPS1() <em>SPS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS1()
	 * @generated
	 * @ordered
	 */
	protected SPS1CONTENT sPS1;

	/**
	 * The cached value of the '{@link #getSPS2() <em>SPS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS2()
	 * @generated
	 * @ordered
	 */
	protected SPS2CONTENT sPS2;

	/**
	 * The cached value of the '{@link #getSPS3() <em>SPS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS3()
	 * @generated
	 * @ordered
	 */
	protected SPS3CONTENT sPS3;

	/**
	 * The cached value of the '{@link #getSPS4() <em>SPS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS4()
	 * @generated
	 * @ordered
	 */
	protected SPS4CONTENT sPS4;

	/**
	 * The cached value of the '{@link #getSPS5() <em>SPS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS5()
	 * @generated
	 * @ordered
	 */
	protected SPS5CONTENT sPS5;

	/**
	 * The cached value of the '{@link #getSPS6() <em>SPS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS6()
	 * @generated
	 * @ordered
	 */
	protected SPS6CONTENT sPS6;

	/**
	 * The cached value of the '{@link #getSPS7() <em>SPS7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPS7()
	 * @generated
	 * @ordered
	 */
	protected SPS7CONTENT sPS7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSPS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS1CONTENT getSPS1() {
		return sPS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS1(SPS1CONTENT newSPS1, NotificationChain msgs) {
		SPS1CONTENT oldSPS1 = sPS1;
		sPS1 = newSPS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS1, oldSPS1, newSPS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS1(SPS1CONTENT newSPS1) {
		if (newSPS1 != sPS1) {
			NotificationChain msgs = null;
			if (sPS1 != null)
				msgs = ((InternalEObject)sPS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS1, null, msgs);
			if (newSPS1 != null)
				msgs = ((InternalEObject)newSPS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS1, null, msgs);
			msgs = basicSetSPS1(newSPS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS1, newSPS1, newSPS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS2CONTENT getSPS2() {
		return sPS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS2(SPS2CONTENT newSPS2, NotificationChain msgs) {
		SPS2CONTENT oldSPS2 = sPS2;
		sPS2 = newSPS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS2, oldSPS2, newSPS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS2(SPS2CONTENT newSPS2) {
		if (newSPS2 != sPS2) {
			NotificationChain msgs = null;
			if (sPS2 != null)
				msgs = ((InternalEObject)sPS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS2, null, msgs);
			if (newSPS2 != null)
				msgs = ((InternalEObject)newSPS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS2, null, msgs);
			msgs = basicSetSPS2(newSPS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS2, newSPS2, newSPS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS3CONTENT getSPS3() {
		return sPS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS3(SPS3CONTENT newSPS3, NotificationChain msgs) {
		SPS3CONTENT oldSPS3 = sPS3;
		sPS3 = newSPS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS3, oldSPS3, newSPS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS3(SPS3CONTENT newSPS3) {
		if (newSPS3 != sPS3) {
			NotificationChain msgs = null;
			if (sPS3 != null)
				msgs = ((InternalEObject)sPS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS3, null, msgs);
			if (newSPS3 != null)
				msgs = ((InternalEObject)newSPS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS3, null, msgs);
			msgs = basicSetSPS3(newSPS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS3, newSPS3, newSPS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS4CONTENT getSPS4() {
		return sPS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS4(SPS4CONTENT newSPS4, NotificationChain msgs) {
		SPS4CONTENT oldSPS4 = sPS4;
		sPS4 = newSPS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS4, oldSPS4, newSPS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS4(SPS4CONTENT newSPS4) {
		if (newSPS4 != sPS4) {
			NotificationChain msgs = null;
			if (sPS4 != null)
				msgs = ((InternalEObject)sPS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS4, null, msgs);
			if (newSPS4 != null)
				msgs = ((InternalEObject)newSPS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS4, null, msgs);
			msgs = basicSetSPS4(newSPS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS4, newSPS4, newSPS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS5CONTENT getSPS5() {
		return sPS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS5(SPS5CONTENT newSPS5, NotificationChain msgs) {
		SPS5CONTENT oldSPS5 = sPS5;
		sPS5 = newSPS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS5, oldSPS5, newSPS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS5(SPS5CONTENT newSPS5) {
		if (newSPS5 != sPS5) {
			NotificationChain msgs = null;
			if (sPS5 != null)
				msgs = ((InternalEObject)sPS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS5, null, msgs);
			if (newSPS5 != null)
				msgs = ((InternalEObject)newSPS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS5, null, msgs);
			msgs = basicSetSPS5(newSPS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS5, newSPS5, newSPS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS6CONTENT getSPS6() {
		return sPS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS6(SPS6CONTENT newSPS6, NotificationChain msgs) {
		SPS6CONTENT oldSPS6 = sPS6;
		sPS6 = newSPS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS6, oldSPS6, newSPS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS6(SPS6CONTENT newSPS6) {
		if (newSPS6 != sPS6) {
			NotificationChain msgs = null;
			if (sPS6 != null)
				msgs = ((InternalEObject)sPS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS6, null, msgs);
			if (newSPS6 != null)
				msgs = ((InternalEObject)newSPS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS6, null, msgs);
			msgs = basicSetSPS6(newSPS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS6, newSPS6, newSPS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPS7CONTENT getSPS7() {
		return sPS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPS7(SPS7CONTENT newSPS7, NotificationChain msgs) {
		SPS7CONTENT oldSPS7 = sPS7;
		sPS7 = newSPS7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS7, oldSPS7, newSPS7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPS7(SPS7CONTENT newSPS7) {
		if (newSPS7 != sPS7) {
			NotificationChain msgs = null;
			if (sPS7 != null)
				msgs = ((InternalEObject)sPS7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS7, null, msgs);
			if (newSPS7 != null)
				msgs = ((InternalEObject)newSPS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPS__SPS7, null, msgs);
			msgs = basicSetSPS7(newSPS7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPS__SPS7, newSPS7, newSPS7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.SPS__SPS1:
				return basicSetSPS1(null, msgs);
			case V2xmlPackage.SPS__SPS2:
				return basicSetSPS2(null, msgs);
			case V2xmlPackage.SPS__SPS3:
				return basicSetSPS3(null, msgs);
			case V2xmlPackage.SPS__SPS4:
				return basicSetSPS4(null, msgs);
			case V2xmlPackage.SPS__SPS5:
				return basicSetSPS5(null, msgs);
			case V2xmlPackage.SPS__SPS6:
				return basicSetSPS6(null, msgs);
			case V2xmlPackage.SPS__SPS7:
				return basicSetSPS7(null, msgs);
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
			case V2xmlPackage.SPS__SPS1:
				return getSPS1();
			case V2xmlPackage.SPS__SPS2:
				return getSPS2();
			case V2xmlPackage.SPS__SPS3:
				return getSPS3();
			case V2xmlPackage.SPS__SPS4:
				return getSPS4();
			case V2xmlPackage.SPS__SPS5:
				return getSPS5();
			case V2xmlPackage.SPS__SPS6:
				return getSPS6();
			case V2xmlPackage.SPS__SPS7:
				return getSPS7();
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
			case V2xmlPackage.SPS__SPS1:
				setSPS1((SPS1CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS2:
				setSPS2((SPS2CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS3:
				setSPS3((SPS3CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS4:
				setSPS4((SPS4CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS5:
				setSPS5((SPS5CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS6:
				setSPS6((SPS6CONTENT)newValue);
				return;
			case V2xmlPackage.SPS__SPS7:
				setSPS7((SPS7CONTENT)newValue);
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
			case V2xmlPackage.SPS__SPS1:
				setSPS1((SPS1CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS2:
				setSPS2((SPS2CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS3:
				setSPS3((SPS3CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS4:
				setSPS4((SPS4CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS5:
				setSPS5((SPS5CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS6:
				setSPS6((SPS6CONTENT)null);
				return;
			case V2xmlPackage.SPS__SPS7:
				setSPS7((SPS7CONTENT)null);
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
			case V2xmlPackage.SPS__SPS1:
				return sPS1 != null;
			case V2xmlPackage.SPS__SPS2:
				return sPS2 != null;
			case V2xmlPackage.SPS__SPS3:
				return sPS3 != null;
			case V2xmlPackage.SPS__SPS4:
				return sPS4 != null;
			case V2xmlPackage.SPS__SPS5:
				return sPS5 != null;
			case V2xmlPackage.SPS__SPS6:
				return sPS6 != null;
			case V2xmlPackage.SPS__SPS7:
				return sPS7 != null;
		}
		return super.eIsSet(featureID);
	}

} //SPSImpl
