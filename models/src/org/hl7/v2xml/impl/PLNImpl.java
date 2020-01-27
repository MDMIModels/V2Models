/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PLN;
import org.hl7.v2xml.PLN1CONTENT;
import org.hl7.v2xml.PLN2CONTENT;
import org.hl7.v2xml.PLN3CONTENT;
import org.hl7.v2xml.PLN4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PLN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PLNImpl#getPLN1 <em>PLN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLNImpl#getPLN2 <em>PLN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLNImpl#getPLN3 <em>PLN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLNImpl#getPLN4 <em>PLN4</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLNImpl extends EObjectImpl implements PLN {
	/**
	 * The cached value of the '{@link #getPLN1() <em>PLN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLN1()
	 * @generated
	 * @ordered
	 */
	protected PLN1CONTENT pLN1;

	/**
	 * The cached value of the '{@link #getPLN2() <em>PLN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLN2()
	 * @generated
	 * @ordered
	 */
	protected PLN2CONTENT pLN2;

	/**
	 * The cached value of the '{@link #getPLN3() <em>PLN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLN3()
	 * @generated
	 * @ordered
	 */
	protected PLN3CONTENT pLN3;

	/**
	 * The cached value of the '{@link #getPLN4() <em>PLN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPLN4()
	 * @generated
	 * @ordered
	 */
	protected PLN4CONTENT pLN4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPLN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLN1CONTENT getPLN1() {
		return pLN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPLN1(PLN1CONTENT newPLN1, NotificationChain msgs) {
		PLN1CONTENT oldPLN1 = pLN1;
		pLN1 = newPLN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN1, oldPLN1, newPLN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPLN1(PLN1CONTENT newPLN1) {
		if (newPLN1 != pLN1) {
			NotificationChain msgs = null;
			if (pLN1 != null)
				msgs = ((InternalEObject)pLN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN1, null, msgs);
			if (newPLN1 != null)
				msgs = ((InternalEObject)newPLN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN1, null, msgs);
			msgs = basicSetPLN1(newPLN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN1, newPLN1, newPLN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLN2CONTENT getPLN2() {
		return pLN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPLN2(PLN2CONTENT newPLN2, NotificationChain msgs) {
		PLN2CONTENT oldPLN2 = pLN2;
		pLN2 = newPLN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN2, oldPLN2, newPLN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPLN2(PLN2CONTENT newPLN2) {
		if (newPLN2 != pLN2) {
			NotificationChain msgs = null;
			if (pLN2 != null)
				msgs = ((InternalEObject)pLN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN2, null, msgs);
			if (newPLN2 != null)
				msgs = ((InternalEObject)newPLN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN2, null, msgs);
			msgs = basicSetPLN2(newPLN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN2, newPLN2, newPLN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLN3CONTENT getPLN3() {
		return pLN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPLN3(PLN3CONTENT newPLN3, NotificationChain msgs) {
		PLN3CONTENT oldPLN3 = pLN3;
		pLN3 = newPLN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN3, oldPLN3, newPLN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPLN3(PLN3CONTENT newPLN3) {
		if (newPLN3 != pLN3) {
			NotificationChain msgs = null;
			if (pLN3 != null)
				msgs = ((InternalEObject)pLN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN3, null, msgs);
			if (newPLN3 != null)
				msgs = ((InternalEObject)newPLN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN3, null, msgs);
			msgs = basicSetPLN3(newPLN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN3, newPLN3, newPLN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PLN4CONTENT getPLN4() {
		return pLN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPLN4(PLN4CONTENT newPLN4, NotificationChain msgs) {
		PLN4CONTENT oldPLN4 = pLN4;
		pLN4 = newPLN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN4, oldPLN4, newPLN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPLN4(PLN4CONTENT newPLN4) {
		if (newPLN4 != pLN4) {
			NotificationChain msgs = null;
			if (pLN4 != null)
				msgs = ((InternalEObject)pLN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN4, null, msgs);
			if (newPLN4 != null)
				msgs = ((InternalEObject)newPLN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PLN__PLN4, null, msgs);
			msgs = basicSetPLN4(newPLN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PLN__PLN4, newPLN4, newPLN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PLN__PLN1:
				return basicSetPLN1(null, msgs);
			case V2xmlPackage.PLN__PLN2:
				return basicSetPLN2(null, msgs);
			case V2xmlPackage.PLN__PLN3:
				return basicSetPLN3(null, msgs);
			case V2xmlPackage.PLN__PLN4:
				return basicSetPLN4(null, msgs);
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
			case V2xmlPackage.PLN__PLN1:
				return getPLN1();
			case V2xmlPackage.PLN__PLN2:
				return getPLN2();
			case V2xmlPackage.PLN__PLN3:
				return getPLN3();
			case V2xmlPackage.PLN__PLN4:
				return getPLN4();
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
			case V2xmlPackage.PLN__PLN1:
				setPLN1((PLN1CONTENT)newValue);
				return;
			case V2xmlPackage.PLN__PLN2:
				setPLN2((PLN2CONTENT)newValue);
				return;
			case V2xmlPackage.PLN__PLN3:
				setPLN3((PLN3CONTENT)newValue);
				return;
			case V2xmlPackage.PLN__PLN4:
				setPLN4((PLN4CONTENT)newValue);
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
			case V2xmlPackage.PLN__PLN1:
				setPLN1((PLN1CONTENT)null);
				return;
			case V2xmlPackage.PLN__PLN2:
				setPLN2((PLN2CONTENT)null);
				return;
			case V2xmlPackage.PLN__PLN3:
				setPLN3((PLN3CONTENT)null);
				return;
			case V2xmlPackage.PLN__PLN4:
				setPLN4((PLN4CONTENT)null);
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
			case V2xmlPackage.PLN__PLN1:
				return pLN1 != null;
			case V2xmlPackage.PLN__PLN2:
				return pLN2 != null;
			case V2xmlPackage.PLN__PLN3:
				return pLN3 != null;
			case V2xmlPackage.PLN__PLN4:
				return pLN4 != null;
		}
		return super.eIsSet(featureID);
	}

} //PLNImpl
