/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CSU;
import org.hl7.v2xml.CSU1CONTENT;
import org.hl7.v2xml.CSU2CONTENT;
import org.hl7.v2xml.CSU3CONTENT;
import org.hl7.v2xml.CSU4CONTENT;
import org.hl7.v2xml.CSU5CONTENT;
import org.hl7.v2xml.CSU6CONTENT;
import org.hl7.v2xml.CSU7CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU1 <em>CSU1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU2 <em>CSU2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU3 <em>CSU3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU4 <em>CSU4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU5 <em>CSU5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU6 <em>CSU6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSUImpl#getCSU7 <em>CSU7</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSUImpl extends EObjectImpl implements CSU {
	/**
	 * The cached value of the '{@link #getCSU1() <em>CSU1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU1()
	 * @generated
	 * @ordered
	 */
	protected CSU1CONTENT cSU1;

	/**
	 * The cached value of the '{@link #getCSU2() <em>CSU2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU2()
	 * @generated
	 * @ordered
	 */
	protected CSU2CONTENT cSU2;

	/**
	 * The cached value of the '{@link #getCSU3() <em>CSU3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU3()
	 * @generated
	 * @ordered
	 */
	protected CSU3CONTENT cSU3;

	/**
	 * The cached value of the '{@link #getCSU4() <em>CSU4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU4()
	 * @generated
	 * @ordered
	 */
	protected CSU4CONTENT cSU4;

	/**
	 * The cached value of the '{@link #getCSU5() <em>CSU5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU5()
	 * @generated
	 * @ordered
	 */
	protected CSU5CONTENT cSU5;

	/**
	 * The cached value of the '{@link #getCSU6() <em>CSU6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU6()
	 * @generated
	 * @ordered
	 */
	protected CSU6CONTENT cSU6;

	/**
	 * The cached value of the '{@link #getCSU7() <em>CSU7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSU7()
	 * @generated
	 * @ordered
	 */
	protected CSU7CONTENT cSU7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCSU();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU1CONTENT getCSU1() {
		return cSU1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU1(CSU1CONTENT newCSU1, NotificationChain msgs) {
		CSU1CONTENT oldCSU1 = cSU1;
		cSU1 = newCSU1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU1, oldCSU1, newCSU1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU1(CSU1CONTENT newCSU1) {
		if (newCSU1 != cSU1) {
			NotificationChain msgs = null;
			if (cSU1 != null)
				msgs = ((InternalEObject)cSU1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU1, null, msgs);
			if (newCSU1 != null)
				msgs = ((InternalEObject)newCSU1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU1, null, msgs);
			msgs = basicSetCSU1(newCSU1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU1, newCSU1, newCSU1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU2CONTENT getCSU2() {
		return cSU2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU2(CSU2CONTENT newCSU2, NotificationChain msgs) {
		CSU2CONTENT oldCSU2 = cSU2;
		cSU2 = newCSU2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU2, oldCSU2, newCSU2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU2(CSU2CONTENT newCSU2) {
		if (newCSU2 != cSU2) {
			NotificationChain msgs = null;
			if (cSU2 != null)
				msgs = ((InternalEObject)cSU2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU2, null, msgs);
			if (newCSU2 != null)
				msgs = ((InternalEObject)newCSU2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU2, null, msgs);
			msgs = basicSetCSU2(newCSU2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU2, newCSU2, newCSU2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU3CONTENT getCSU3() {
		return cSU3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU3(CSU3CONTENT newCSU3, NotificationChain msgs) {
		CSU3CONTENT oldCSU3 = cSU3;
		cSU3 = newCSU3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU3, oldCSU3, newCSU3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU3(CSU3CONTENT newCSU3) {
		if (newCSU3 != cSU3) {
			NotificationChain msgs = null;
			if (cSU3 != null)
				msgs = ((InternalEObject)cSU3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU3, null, msgs);
			if (newCSU3 != null)
				msgs = ((InternalEObject)newCSU3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU3, null, msgs);
			msgs = basicSetCSU3(newCSU3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU3, newCSU3, newCSU3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU4CONTENT getCSU4() {
		return cSU4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU4(CSU4CONTENT newCSU4, NotificationChain msgs) {
		CSU4CONTENT oldCSU4 = cSU4;
		cSU4 = newCSU4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU4, oldCSU4, newCSU4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU4(CSU4CONTENT newCSU4) {
		if (newCSU4 != cSU4) {
			NotificationChain msgs = null;
			if (cSU4 != null)
				msgs = ((InternalEObject)cSU4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU4, null, msgs);
			if (newCSU4 != null)
				msgs = ((InternalEObject)newCSU4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU4, null, msgs);
			msgs = basicSetCSU4(newCSU4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU4, newCSU4, newCSU4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU5CONTENT getCSU5() {
		return cSU5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU5(CSU5CONTENT newCSU5, NotificationChain msgs) {
		CSU5CONTENT oldCSU5 = cSU5;
		cSU5 = newCSU5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU5, oldCSU5, newCSU5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU5(CSU5CONTENT newCSU5) {
		if (newCSU5 != cSU5) {
			NotificationChain msgs = null;
			if (cSU5 != null)
				msgs = ((InternalEObject)cSU5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU5, null, msgs);
			if (newCSU5 != null)
				msgs = ((InternalEObject)newCSU5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU5, null, msgs);
			msgs = basicSetCSU5(newCSU5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU5, newCSU5, newCSU5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU6CONTENT getCSU6() {
		return cSU6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU6(CSU6CONTENT newCSU6, NotificationChain msgs) {
		CSU6CONTENT oldCSU6 = cSU6;
		cSU6 = newCSU6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU6, oldCSU6, newCSU6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU6(CSU6CONTENT newCSU6) {
		if (newCSU6 != cSU6) {
			NotificationChain msgs = null;
			if (cSU6 != null)
				msgs = ((InternalEObject)cSU6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU6, null, msgs);
			if (newCSU6 != null)
				msgs = ((InternalEObject)newCSU6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU6, null, msgs);
			msgs = basicSetCSU6(newCSU6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU6, newCSU6, newCSU6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSU7CONTENT getCSU7() {
		return cSU7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSU7(CSU7CONTENT newCSU7, NotificationChain msgs) {
		CSU7CONTENT oldCSU7 = cSU7;
		cSU7 = newCSU7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU7, oldCSU7, newCSU7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSU7(CSU7CONTENT newCSU7) {
		if (newCSU7 != cSU7) {
			NotificationChain msgs = null;
			if (cSU7 != null)
				msgs = ((InternalEObject)cSU7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU7, null, msgs);
			if (newCSU7 != null)
				msgs = ((InternalEObject)newCSU7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSU__CSU7, null, msgs);
			msgs = basicSetCSU7(newCSU7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSU__CSU7, newCSU7, newCSU7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CSU__CSU1:
				return basicSetCSU1(null, msgs);
			case V2xmlPackage.CSU__CSU2:
				return basicSetCSU2(null, msgs);
			case V2xmlPackage.CSU__CSU3:
				return basicSetCSU3(null, msgs);
			case V2xmlPackage.CSU__CSU4:
				return basicSetCSU4(null, msgs);
			case V2xmlPackage.CSU__CSU5:
				return basicSetCSU5(null, msgs);
			case V2xmlPackage.CSU__CSU6:
				return basicSetCSU6(null, msgs);
			case V2xmlPackage.CSU__CSU7:
				return basicSetCSU7(null, msgs);
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
			case V2xmlPackage.CSU__CSU1:
				return getCSU1();
			case V2xmlPackage.CSU__CSU2:
				return getCSU2();
			case V2xmlPackage.CSU__CSU3:
				return getCSU3();
			case V2xmlPackage.CSU__CSU4:
				return getCSU4();
			case V2xmlPackage.CSU__CSU5:
				return getCSU5();
			case V2xmlPackage.CSU__CSU6:
				return getCSU6();
			case V2xmlPackage.CSU__CSU7:
				return getCSU7();
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
			case V2xmlPackage.CSU__CSU1:
				setCSU1((CSU1CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU2:
				setCSU2((CSU2CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU3:
				setCSU3((CSU3CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU4:
				setCSU4((CSU4CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU5:
				setCSU5((CSU5CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU6:
				setCSU6((CSU6CONTENT)newValue);
				return;
			case V2xmlPackage.CSU__CSU7:
				setCSU7((CSU7CONTENT)newValue);
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
			case V2xmlPackage.CSU__CSU1:
				setCSU1((CSU1CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU2:
				setCSU2((CSU2CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU3:
				setCSU3((CSU3CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU4:
				setCSU4((CSU4CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU5:
				setCSU5((CSU5CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU6:
				setCSU6((CSU6CONTENT)null);
				return;
			case V2xmlPackage.CSU__CSU7:
				setCSU7((CSU7CONTENT)null);
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
			case V2xmlPackage.CSU__CSU1:
				return cSU1 != null;
			case V2xmlPackage.CSU__CSU2:
				return cSU2 != null;
			case V2xmlPackage.CSU__CSU3:
				return cSU3 != null;
			case V2xmlPackage.CSU__CSU4:
				return cSU4 != null;
			case V2xmlPackage.CSU__CSU5:
				return cSU5 != null;
			case V2xmlPackage.CSU__CSU6:
				return cSU6 != null;
			case V2xmlPackage.CSU__CSU7:
				return cSU7 != null;
		}
		return super.eIsSet(featureID);
	}

} //CSUImpl
