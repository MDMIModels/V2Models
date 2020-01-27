/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.ERL;
import org.hl7.v2xml.ERL1CONTENT;
import org.hl7.v2xml.ERL2CONTENT;
import org.hl7.v2xml.ERL3CONTENT;
import org.hl7.v2xml.ERL4CONTENT;
import org.hl7.v2xml.ERL5CONTENT;
import org.hl7.v2xml.ERL6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL1 <em>ERL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL2 <em>ERL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL3 <em>ERL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL4 <em>ERL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL5 <em>ERL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERLImpl#getERL6 <em>ERL6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERLImpl extends EObjectImpl implements ERL {
	/**
	 * The cached value of the '{@link #getERL1() <em>ERL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL1()
	 * @generated
	 * @ordered
	 */
	protected ERL1CONTENT eRL1;

	/**
	 * The cached value of the '{@link #getERL2() <em>ERL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL2()
	 * @generated
	 * @ordered
	 */
	protected ERL2CONTENT eRL2;

	/**
	 * The cached value of the '{@link #getERL3() <em>ERL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL3()
	 * @generated
	 * @ordered
	 */
	protected ERL3CONTENT eRL3;

	/**
	 * The cached value of the '{@link #getERL4() <em>ERL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL4()
	 * @generated
	 * @ordered
	 */
	protected ERL4CONTENT eRL4;

	/**
	 * The cached value of the '{@link #getERL5() <em>ERL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL5()
	 * @generated
	 * @ordered
	 */
	protected ERL5CONTENT eRL5;

	/**
	 * The cached value of the '{@link #getERL6() <em>ERL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERL6()
	 * @generated
	 * @ordered
	 */
	protected ERL6CONTENT eRL6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ERLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getERL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL1CONTENT getERL1() {
		return eRL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL1(ERL1CONTENT newERL1, NotificationChain msgs) {
		ERL1CONTENT oldERL1 = eRL1;
		eRL1 = newERL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL1, oldERL1, newERL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL1(ERL1CONTENT newERL1) {
		if (newERL1 != eRL1) {
			NotificationChain msgs = null;
			if (eRL1 != null)
				msgs = ((InternalEObject)eRL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL1, null, msgs);
			if (newERL1 != null)
				msgs = ((InternalEObject)newERL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL1, null, msgs);
			msgs = basicSetERL1(newERL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL1, newERL1, newERL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL2CONTENT getERL2() {
		return eRL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL2(ERL2CONTENT newERL2, NotificationChain msgs) {
		ERL2CONTENT oldERL2 = eRL2;
		eRL2 = newERL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL2, oldERL2, newERL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL2(ERL2CONTENT newERL2) {
		if (newERL2 != eRL2) {
			NotificationChain msgs = null;
			if (eRL2 != null)
				msgs = ((InternalEObject)eRL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL2, null, msgs);
			if (newERL2 != null)
				msgs = ((InternalEObject)newERL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL2, null, msgs);
			msgs = basicSetERL2(newERL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL2, newERL2, newERL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL3CONTENT getERL3() {
		return eRL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL3(ERL3CONTENT newERL3, NotificationChain msgs) {
		ERL3CONTENT oldERL3 = eRL3;
		eRL3 = newERL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL3, oldERL3, newERL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL3(ERL3CONTENT newERL3) {
		if (newERL3 != eRL3) {
			NotificationChain msgs = null;
			if (eRL3 != null)
				msgs = ((InternalEObject)eRL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL3, null, msgs);
			if (newERL3 != null)
				msgs = ((InternalEObject)newERL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL3, null, msgs);
			msgs = basicSetERL3(newERL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL3, newERL3, newERL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL4CONTENT getERL4() {
		return eRL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL4(ERL4CONTENT newERL4, NotificationChain msgs) {
		ERL4CONTENT oldERL4 = eRL4;
		eRL4 = newERL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL4, oldERL4, newERL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL4(ERL4CONTENT newERL4) {
		if (newERL4 != eRL4) {
			NotificationChain msgs = null;
			if (eRL4 != null)
				msgs = ((InternalEObject)eRL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL4, null, msgs);
			if (newERL4 != null)
				msgs = ((InternalEObject)newERL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL4, null, msgs);
			msgs = basicSetERL4(newERL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL4, newERL4, newERL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL5CONTENT getERL5() {
		return eRL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL5(ERL5CONTENT newERL5, NotificationChain msgs) {
		ERL5CONTENT oldERL5 = eRL5;
		eRL5 = newERL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL5, oldERL5, newERL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL5(ERL5CONTENT newERL5) {
		if (newERL5 != eRL5) {
			NotificationChain msgs = null;
			if (eRL5 != null)
				msgs = ((InternalEObject)eRL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL5, null, msgs);
			if (newERL5 != null)
				msgs = ((InternalEObject)newERL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL5, null, msgs);
			msgs = basicSetERL5(newERL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL5, newERL5, newERL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERL6CONTENT getERL6() {
		return eRL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERL6(ERL6CONTENT newERL6, NotificationChain msgs) {
		ERL6CONTENT oldERL6 = eRL6;
		eRL6 = newERL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL6, oldERL6, newERL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERL6(ERL6CONTENT newERL6) {
		if (newERL6 != eRL6) {
			NotificationChain msgs = null;
			if (eRL6 != null)
				msgs = ((InternalEObject)eRL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL6, null, msgs);
			if (newERL6 != null)
				msgs = ((InternalEObject)newERL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERL__ERL6, null, msgs);
			msgs = basicSetERL6(newERL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERL__ERL6, newERL6, newERL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ERL__ERL1:
				return basicSetERL1(null, msgs);
			case V2xmlPackage.ERL__ERL2:
				return basicSetERL2(null, msgs);
			case V2xmlPackage.ERL__ERL3:
				return basicSetERL3(null, msgs);
			case V2xmlPackage.ERL__ERL4:
				return basicSetERL4(null, msgs);
			case V2xmlPackage.ERL__ERL5:
				return basicSetERL5(null, msgs);
			case V2xmlPackage.ERL__ERL6:
				return basicSetERL6(null, msgs);
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
			case V2xmlPackage.ERL__ERL1:
				return getERL1();
			case V2xmlPackage.ERL__ERL2:
				return getERL2();
			case V2xmlPackage.ERL__ERL3:
				return getERL3();
			case V2xmlPackage.ERL__ERL4:
				return getERL4();
			case V2xmlPackage.ERL__ERL5:
				return getERL5();
			case V2xmlPackage.ERL__ERL6:
				return getERL6();
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
			case V2xmlPackage.ERL__ERL1:
				setERL1((ERL1CONTENT)newValue);
				return;
			case V2xmlPackage.ERL__ERL2:
				setERL2((ERL2CONTENT)newValue);
				return;
			case V2xmlPackage.ERL__ERL3:
				setERL3((ERL3CONTENT)newValue);
				return;
			case V2xmlPackage.ERL__ERL4:
				setERL4((ERL4CONTENT)newValue);
				return;
			case V2xmlPackage.ERL__ERL5:
				setERL5((ERL5CONTENT)newValue);
				return;
			case V2xmlPackage.ERL__ERL6:
				setERL6((ERL6CONTENT)newValue);
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
			case V2xmlPackage.ERL__ERL1:
				setERL1((ERL1CONTENT)null);
				return;
			case V2xmlPackage.ERL__ERL2:
				setERL2((ERL2CONTENT)null);
				return;
			case V2xmlPackage.ERL__ERL3:
				setERL3((ERL3CONTENT)null);
				return;
			case V2xmlPackage.ERL__ERL4:
				setERL4((ERL4CONTENT)null);
				return;
			case V2xmlPackage.ERL__ERL5:
				setERL5((ERL5CONTENT)null);
				return;
			case V2xmlPackage.ERL__ERL6:
				setERL6((ERL6CONTENT)null);
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
			case V2xmlPackage.ERL__ERL1:
				return eRL1 != null;
			case V2xmlPackage.ERL__ERL2:
				return eRL2 != null;
			case V2xmlPackage.ERL__ERL3:
				return eRL3 != null;
			case V2xmlPackage.ERL__ERL4:
				return eRL4 != null;
			case V2xmlPackage.ERL__ERL5:
				return eRL5 != null;
			case V2xmlPackage.ERL__ERL6:
				return eRL6 != null;
		}
		return super.eIsSet(featureID);
	}

} //ERLImpl
