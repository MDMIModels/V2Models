/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.ELD;
import org.hl7.v2xml.ELD1CONTENT;
import org.hl7.v2xml.ELD2CONTENT;
import org.hl7.v2xml.ELD3CONTENT;
import org.hl7.v2xml.ELD4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ELD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ELDImpl#getELD1 <em>ELD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ELDImpl#getELD2 <em>ELD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ELDImpl#getELD3 <em>ELD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ELDImpl#getELD4 <em>ELD4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ELDImpl extends EObjectImpl implements ELD {
	/**
	 * The cached value of the '{@link #getELD1() <em>ELD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELD1()
	 * @generated
	 * @ordered
	 */
	protected ELD1CONTENT eLD1;

	/**
	 * The cached value of the '{@link #getELD2() <em>ELD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELD2()
	 * @generated
	 * @ordered
	 */
	protected ELD2CONTENT eLD2;

	/**
	 * The cached value of the '{@link #getELD3() <em>ELD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELD3()
	 * @generated
	 * @ordered
	 */
	protected ELD3CONTENT eLD3;

	/**
	 * The cached value of the '{@link #getELD4() <em>ELD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getELD4()
	 * @generated
	 * @ordered
	 */
	protected ELD4CONTENT eLD4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ELDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getELD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELD1CONTENT getELD1() {
		return eLD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELD1(ELD1CONTENT newELD1, NotificationChain msgs) {
		ELD1CONTENT oldELD1 = eLD1;
		eLD1 = newELD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD1, oldELD1, newELD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELD1(ELD1CONTENT newELD1) {
		if (newELD1 != eLD1) {
			NotificationChain msgs = null;
			if (eLD1 != null)
				msgs = ((InternalEObject)eLD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD1, null, msgs);
			if (newELD1 != null)
				msgs = ((InternalEObject)newELD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD1, null, msgs);
			msgs = basicSetELD1(newELD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD1, newELD1, newELD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELD2CONTENT getELD2() {
		return eLD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELD2(ELD2CONTENT newELD2, NotificationChain msgs) {
		ELD2CONTENT oldELD2 = eLD2;
		eLD2 = newELD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD2, oldELD2, newELD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELD2(ELD2CONTENT newELD2) {
		if (newELD2 != eLD2) {
			NotificationChain msgs = null;
			if (eLD2 != null)
				msgs = ((InternalEObject)eLD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD2, null, msgs);
			if (newELD2 != null)
				msgs = ((InternalEObject)newELD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD2, null, msgs);
			msgs = basicSetELD2(newELD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD2, newELD2, newELD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELD3CONTENT getELD3() {
		return eLD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELD3(ELD3CONTENT newELD3, NotificationChain msgs) {
		ELD3CONTENT oldELD3 = eLD3;
		eLD3 = newELD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD3, oldELD3, newELD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELD3(ELD3CONTENT newELD3) {
		if (newELD3 != eLD3) {
			NotificationChain msgs = null;
			if (eLD3 != null)
				msgs = ((InternalEObject)eLD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD3, null, msgs);
			if (newELD3 != null)
				msgs = ((InternalEObject)newELD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD3, null, msgs);
			msgs = basicSetELD3(newELD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD3, newELD3, newELD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ELD4CONTENT getELD4() {
		return eLD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetELD4(ELD4CONTENT newELD4, NotificationChain msgs) {
		ELD4CONTENT oldELD4 = eLD4;
		eLD4 = newELD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD4, oldELD4, newELD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setELD4(ELD4CONTENT newELD4) {
		if (newELD4 != eLD4) {
			NotificationChain msgs = null;
			if (eLD4 != null)
				msgs = ((InternalEObject)eLD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD4, null, msgs);
			if (newELD4 != null)
				msgs = ((InternalEObject)newELD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ELD__ELD4, null, msgs);
			msgs = basicSetELD4(newELD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ELD__ELD4, newELD4, newELD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ELD__ELD1:
				return basicSetELD1(null, msgs);
			case V2xmlPackage.ELD__ELD2:
				return basicSetELD2(null, msgs);
			case V2xmlPackage.ELD__ELD3:
				return basicSetELD3(null, msgs);
			case V2xmlPackage.ELD__ELD4:
				return basicSetELD4(null, msgs);
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
			case V2xmlPackage.ELD__ELD1:
				return getELD1();
			case V2xmlPackage.ELD__ELD2:
				return getELD2();
			case V2xmlPackage.ELD__ELD3:
				return getELD3();
			case V2xmlPackage.ELD__ELD4:
				return getELD4();
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
			case V2xmlPackage.ELD__ELD1:
				setELD1((ELD1CONTENT)newValue);
				return;
			case V2xmlPackage.ELD__ELD2:
				setELD2((ELD2CONTENT)newValue);
				return;
			case V2xmlPackage.ELD__ELD3:
				setELD3((ELD3CONTENT)newValue);
				return;
			case V2xmlPackage.ELD__ELD4:
				setELD4((ELD4CONTENT)newValue);
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
			case V2xmlPackage.ELD__ELD1:
				setELD1((ELD1CONTENT)null);
				return;
			case V2xmlPackage.ELD__ELD2:
				setELD2((ELD2CONTENT)null);
				return;
			case V2xmlPackage.ELD__ELD3:
				setELD3((ELD3CONTENT)null);
				return;
			case V2xmlPackage.ELD__ELD4:
				setELD4((ELD4CONTENT)null);
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
			case V2xmlPackage.ELD__ELD1:
				return eLD1 != null;
			case V2xmlPackage.ELD__ELD2:
				return eLD2 != null;
			case V2xmlPackage.ELD__ELD3:
				return eLD3 != null;
			case V2xmlPackage.ELD__ELD4:
				return eLD4 != null;
		}
		return super.eIsSet(featureID);
	}

} //ELDImpl
