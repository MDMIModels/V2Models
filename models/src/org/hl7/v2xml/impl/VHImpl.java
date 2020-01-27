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
import org.hl7.v2xml.VH;
import org.hl7.v2xml.VH1CONTENT;
import org.hl7.v2xml.VH2CONTENT;
import org.hl7.v2xml.VH3CONTENT;
import org.hl7.v2xml.VH4CONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.VHImpl#getVH1 <em>VH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VHImpl#getVH2 <em>VH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VHImpl#getVH3 <em>VH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VHImpl#getVH4 <em>VH4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VHImpl extends EObjectImpl implements VH {
	/**
	 * The cached value of the '{@link #getVH1() <em>VH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVH1()
	 * @generated
	 * @ordered
	 */
	protected VH1CONTENT vH1;

	/**
	 * The cached value of the '{@link #getVH2() <em>VH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVH2()
	 * @generated
	 * @ordered
	 */
	protected VH2CONTENT vH2;

	/**
	 * The cached value of the '{@link #getVH3() <em>VH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVH3()
	 * @generated
	 * @ordered
	 */
	protected VH3CONTENT vH3;

	/**
	 * The cached value of the '{@link #getVH4() <em>VH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVH4()
	 * @generated
	 * @ordered
	 */
	protected VH4CONTENT vH4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getVH();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VH1CONTENT getVH1() {
		return vH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVH1(VH1CONTENT newVH1, NotificationChain msgs) {
		VH1CONTENT oldVH1 = vH1;
		vH1 = newVH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH1, oldVH1, newVH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVH1(VH1CONTENT newVH1) {
		if (newVH1 != vH1) {
			NotificationChain msgs = null;
			if (vH1 != null)
				msgs = ((InternalEObject)vH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH1, null, msgs);
			if (newVH1 != null)
				msgs = ((InternalEObject)newVH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH1, null, msgs);
			msgs = basicSetVH1(newVH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH1, newVH1, newVH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VH2CONTENT getVH2() {
		return vH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVH2(VH2CONTENT newVH2, NotificationChain msgs) {
		VH2CONTENT oldVH2 = vH2;
		vH2 = newVH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH2, oldVH2, newVH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVH2(VH2CONTENT newVH2) {
		if (newVH2 != vH2) {
			NotificationChain msgs = null;
			if (vH2 != null)
				msgs = ((InternalEObject)vH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH2, null, msgs);
			if (newVH2 != null)
				msgs = ((InternalEObject)newVH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH2, null, msgs);
			msgs = basicSetVH2(newVH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH2, newVH2, newVH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VH3CONTENT getVH3() {
		return vH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVH3(VH3CONTENT newVH3, NotificationChain msgs) {
		VH3CONTENT oldVH3 = vH3;
		vH3 = newVH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH3, oldVH3, newVH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVH3(VH3CONTENT newVH3) {
		if (newVH3 != vH3) {
			NotificationChain msgs = null;
			if (vH3 != null)
				msgs = ((InternalEObject)vH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH3, null, msgs);
			if (newVH3 != null)
				msgs = ((InternalEObject)newVH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH3, null, msgs);
			msgs = basicSetVH3(newVH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH3, newVH3, newVH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VH4CONTENT getVH4() {
		return vH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVH4(VH4CONTENT newVH4, NotificationChain msgs) {
		VH4CONTENT oldVH4 = vH4;
		vH4 = newVH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH4, oldVH4, newVH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVH4(VH4CONTENT newVH4) {
		if (newVH4 != vH4) {
			NotificationChain msgs = null;
			if (vH4 != null)
				msgs = ((InternalEObject)vH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH4, null, msgs);
			if (newVH4 != null)
				msgs = ((InternalEObject)newVH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VH__VH4, null, msgs);
			msgs = basicSetVH4(newVH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VH__VH4, newVH4, newVH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.VH__VH1:
				return basicSetVH1(null, msgs);
			case V2xmlPackage.VH__VH2:
				return basicSetVH2(null, msgs);
			case V2xmlPackage.VH__VH3:
				return basicSetVH3(null, msgs);
			case V2xmlPackage.VH__VH4:
				return basicSetVH4(null, msgs);
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
			case V2xmlPackage.VH__VH1:
				return getVH1();
			case V2xmlPackage.VH__VH2:
				return getVH2();
			case V2xmlPackage.VH__VH3:
				return getVH3();
			case V2xmlPackage.VH__VH4:
				return getVH4();
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
			case V2xmlPackage.VH__VH1:
				setVH1((VH1CONTENT)newValue);
				return;
			case V2xmlPackage.VH__VH2:
				setVH2((VH2CONTENT)newValue);
				return;
			case V2xmlPackage.VH__VH3:
				setVH3((VH3CONTENT)newValue);
				return;
			case V2xmlPackage.VH__VH4:
				setVH4((VH4CONTENT)newValue);
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
			case V2xmlPackage.VH__VH1:
				setVH1((VH1CONTENT)null);
				return;
			case V2xmlPackage.VH__VH2:
				setVH2((VH2CONTENT)null);
				return;
			case V2xmlPackage.VH__VH3:
				setVH3((VH3CONTENT)null);
				return;
			case V2xmlPackage.VH__VH4:
				setVH4((VH4CONTENT)null);
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
			case V2xmlPackage.VH__VH1:
				return vH1 != null;
			case V2xmlPackage.VH__VH2:
				return vH2 != null;
			case V2xmlPackage.VH__VH3:
				return vH3 != null;
			case V2xmlPackage.VH__VH4:
				return vH4 != null;
		}
		return super.eIsSet(featureID);
	}

} //VHImpl
