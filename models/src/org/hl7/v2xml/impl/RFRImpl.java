/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.RFR;
import org.hl7.v2xml.RFR1CONTENT;
import org.hl7.v2xml.RFR2CONTENT;
import org.hl7.v2xml.RFR3CONTENT;
import org.hl7.v2xml.RFR4CONTENT;
import org.hl7.v2xml.RFR5CONTENT;
import org.hl7.v2xml.RFR6CONTENT;
import org.hl7.v2xml.RFR7CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR1 <em>RFR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR2 <em>RFR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR3 <em>RFR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR4 <em>RFR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR5 <em>RFR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR6 <em>RFR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RFRImpl#getRFR7 <em>RFR7</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RFRImpl extends EObjectImpl implements RFR {
	/**
	 * The cached value of the '{@link #getRFR1() <em>RFR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR1()
	 * @generated
	 * @ordered
	 */
	protected RFR1CONTENT rFR1;

	/**
	 * The cached value of the '{@link #getRFR2() <em>RFR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR2()
	 * @generated
	 * @ordered
	 */
	protected RFR2CONTENT rFR2;

	/**
	 * The cached value of the '{@link #getRFR3() <em>RFR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR3()
	 * @generated
	 * @ordered
	 */
	protected RFR3CONTENT rFR3;

	/**
	 * The cached value of the '{@link #getRFR4() <em>RFR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR4()
	 * @generated
	 * @ordered
	 */
	protected RFR4CONTENT rFR4;

	/**
	 * The cached value of the '{@link #getRFR5() <em>RFR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR5()
	 * @generated
	 * @ordered
	 */
	protected RFR5CONTENT rFR5;

	/**
	 * The cached value of the '{@link #getRFR6() <em>RFR6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR6()
	 * @generated
	 * @ordered
	 */
	protected RFR6CONTENT rFR6;

	/**
	 * The cached value of the '{@link #getRFR7() <em>RFR7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFR7()
	 * @generated
	 * @ordered
	 */
	protected RFR7CONTENT rFR7;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRFR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR1CONTENT getRFR1() {
		return rFR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR1(RFR1CONTENT newRFR1, NotificationChain msgs) {
		RFR1CONTENT oldRFR1 = rFR1;
		rFR1 = newRFR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR1, oldRFR1, newRFR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR1(RFR1CONTENT newRFR1) {
		if (newRFR1 != rFR1) {
			NotificationChain msgs = null;
			if (rFR1 != null)
				msgs = ((InternalEObject)rFR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR1, null, msgs);
			if (newRFR1 != null)
				msgs = ((InternalEObject)newRFR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR1, null, msgs);
			msgs = basicSetRFR1(newRFR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR1, newRFR1, newRFR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR2CONTENT getRFR2() {
		return rFR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR2(RFR2CONTENT newRFR2, NotificationChain msgs) {
		RFR2CONTENT oldRFR2 = rFR2;
		rFR2 = newRFR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR2, oldRFR2, newRFR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR2(RFR2CONTENT newRFR2) {
		if (newRFR2 != rFR2) {
			NotificationChain msgs = null;
			if (rFR2 != null)
				msgs = ((InternalEObject)rFR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR2, null, msgs);
			if (newRFR2 != null)
				msgs = ((InternalEObject)newRFR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR2, null, msgs);
			msgs = basicSetRFR2(newRFR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR2, newRFR2, newRFR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR3CONTENT getRFR3() {
		return rFR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR3(RFR3CONTENT newRFR3, NotificationChain msgs) {
		RFR3CONTENT oldRFR3 = rFR3;
		rFR3 = newRFR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR3, oldRFR3, newRFR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR3(RFR3CONTENT newRFR3) {
		if (newRFR3 != rFR3) {
			NotificationChain msgs = null;
			if (rFR3 != null)
				msgs = ((InternalEObject)rFR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR3, null, msgs);
			if (newRFR3 != null)
				msgs = ((InternalEObject)newRFR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR3, null, msgs);
			msgs = basicSetRFR3(newRFR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR3, newRFR3, newRFR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR4CONTENT getRFR4() {
		return rFR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR4(RFR4CONTENT newRFR4, NotificationChain msgs) {
		RFR4CONTENT oldRFR4 = rFR4;
		rFR4 = newRFR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR4, oldRFR4, newRFR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR4(RFR4CONTENT newRFR4) {
		if (newRFR4 != rFR4) {
			NotificationChain msgs = null;
			if (rFR4 != null)
				msgs = ((InternalEObject)rFR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR4, null, msgs);
			if (newRFR4 != null)
				msgs = ((InternalEObject)newRFR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR4, null, msgs);
			msgs = basicSetRFR4(newRFR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR4, newRFR4, newRFR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR5CONTENT getRFR5() {
		return rFR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR5(RFR5CONTENT newRFR5, NotificationChain msgs) {
		RFR5CONTENT oldRFR5 = rFR5;
		rFR5 = newRFR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR5, oldRFR5, newRFR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR5(RFR5CONTENT newRFR5) {
		if (newRFR5 != rFR5) {
			NotificationChain msgs = null;
			if (rFR5 != null)
				msgs = ((InternalEObject)rFR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR5, null, msgs);
			if (newRFR5 != null)
				msgs = ((InternalEObject)newRFR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR5, null, msgs);
			msgs = basicSetRFR5(newRFR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR5, newRFR5, newRFR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR6CONTENT getRFR6() {
		return rFR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR6(RFR6CONTENT newRFR6, NotificationChain msgs) {
		RFR6CONTENT oldRFR6 = rFR6;
		rFR6 = newRFR6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR6, oldRFR6, newRFR6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR6(RFR6CONTENT newRFR6) {
		if (newRFR6 != rFR6) {
			NotificationChain msgs = null;
			if (rFR6 != null)
				msgs = ((InternalEObject)rFR6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR6, null, msgs);
			if (newRFR6 != null)
				msgs = ((InternalEObject)newRFR6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR6, null, msgs);
			msgs = basicSetRFR6(newRFR6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR6, newRFR6, newRFR6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RFR7CONTENT getRFR7() {
		return rFR7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRFR7(RFR7CONTENT newRFR7, NotificationChain msgs) {
		RFR7CONTENT oldRFR7 = rFR7;
		rFR7 = newRFR7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR7, oldRFR7, newRFR7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRFR7(RFR7CONTENT newRFR7) {
		if (newRFR7 != rFR7) {
			NotificationChain msgs = null;
			if (rFR7 != null)
				msgs = ((InternalEObject)rFR7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR7, null, msgs);
			if (newRFR7 != null)
				msgs = ((InternalEObject)newRFR7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RFR__RFR7, null, msgs);
			msgs = basicSetRFR7(newRFR7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RFR__RFR7, newRFR7, newRFR7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RFR__RFR1:
				return basicSetRFR1(null, msgs);
			case V2xmlPackage.RFR__RFR2:
				return basicSetRFR2(null, msgs);
			case V2xmlPackage.RFR__RFR3:
				return basicSetRFR3(null, msgs);
			case V2xmlPackage.RFR__RFR4:
				return basicSetRFR4(null, msgs);
			case V2xmlPackage.RFR__RFR5:
				return basicSetRFR5(null, msgs);
			case V2xmlPackage.RFR__RFR6:
				return basicSetRFR6(null, msgs);
			case V2xmlPackage.RFR__RFR7:
				return basicSetRFR7(null, msgs);
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
			case V2xmlPackage.RFR__RFR1:
				return getRFR1();
			case V2xmlPackage.RFR__RFR2:
				return getRFR2();
			case V2xmlPackage.RFR__RFR3:
				return getRFR3();
			case V2xmlPackage.RFR__RFR4:
				return getRFR4();
			case V2xmlPackage.RFR__RFR5:
				return getRFR5();
			case V2xmlPackage.RFR__RFR6:
				return getRFR6();
			case V2xmlPackage.RFR__RFR7:
				return getRFR7();
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
			case V2xmlPackage.RFR__RFR1:
				setRFR1((RFR1CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR2:
				setRFR2((RFR2CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR3:
				setRFR3((RFR3CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR4:
				setRFR4((RFR4CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR5:
				setRFR5((RFR5CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR6:
				setRFR6((RFR6CONTENT)newValue);
				return;
			case V2xmlPackage.RFR__RFR7:
				setRFR7((RFR7CONTENT)newValue);
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
			case V2xmlPackage.RFR__RFR1:
				setRFR1((RFR1CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR2:
				setRFR2((RFR2CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR3:
				setRFR3((RFR3CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR4:
				setRFR4((RFR4CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR5:
				setRFR5((RFR5CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR6:
				setRFR6((RFR6CONTENT)null);
				return;
			case V2xmlPackage.RFR__RFR7:
				setRFR7((RFR7CONTENT)null);
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
			case V2xmlPackage.RFR__RFR1:
				return rFR1 != null;
			case V2xmlPackage.RFR__RFR2:
				return rFR2 != null;
			case V2xmlPackage.RFR__RFR3:
				return rFR3 != null;
			case V2xmlPackage.RFR__RFR4:
				return rFR4 != null;
			case V2xmlPackage.RFR__RFR5:
				return rFR5 != null;
			case V2xmlPackage.RFR__RFR6:
				return rFR6 != null;
			case V2xmlPackage.RFR__RFR7:
				return rFR7 != null;
		}
		return super.eIsSet(featureID);
	}

} //RFRImpl
