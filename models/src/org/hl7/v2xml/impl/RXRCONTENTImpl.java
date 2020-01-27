/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.RXR1CONTENT;
import org.hl7.v2xml.RXR2CONTENT;
import org.hl7.v2xml.RXR3CONTENT;
import org.hl7.v2xml.RXR4CONTENT;
import org.hl7.v2xml.RXR5CONTENT;
import org.hl7.v2xml.RXR6CONTENT;
import org.hl7.v2xml.RXRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR1 <em>RXR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR2 <em>RXR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR3 <em>RXR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR4 <em>RXR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR5 <em>RXR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getRXR6 <em>RXR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXRCONTENTImpl extends EObjectImpl implements RXRCONTENT {
	/**
	 * The cached value of the '{@link #getRXR1() <em>RXR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR1()
	 * @generated
	 * @ordered
	 */
	protected RXR1CONTENT rXR1;

	/**
	 * The cached value of the '{@link #getRXR2() <em>RXR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR2()
	 * @generated
	 * @ordered
	 */
	protected RXR2CONTENT rXR2;

	/**
	 * The cached value of the '{@link #getRXR3() <em>RXR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR3()
	 * @generated
	 * @ordered
	 */
	protected RXR3CONTENT rXR3;

	/**
	 * The cached value of the '{@link #getRXR4() <em>RXR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR4()
	 * @generated
	 * @ordered
	 */
	protected RXR4CONTENT rXR4;

	/**
	 * The cached value of the '{@link #getRXR5() <em>RXR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR5()
	 * @generated
	 * @ordered
	 */
	protected RXR5CONTENT rXR5;

	/**
	 * The cached value of the '{@link #getRXR6() <em>RXR6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXR6()
	 * @generated
	 * @ordered
	 */
	protected RXR6CONTENT rXR6;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RXRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR1CONTENT getRXR1() {
		return rXR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR1(RXR1CONTENT newRXR1, NotificationChain msgs) {
		RXR1CONTENT oldRXR1 = rXR1;
		rXR1 = newRXR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR1, oldRXR1, newRXR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR1(RXR1CONTENT newRXR1) {
		if (newRXR1 != rXR1) {
			NotificationChain msgs = null;
			if (rXR1 != null)
				msgs = ((InternalEObject)rXR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR1, null, msgs);
			if (newRXR1 != null)
				msgs = ((InternalEObject)newRXR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR1, null, msgs);
			msgs = basicSetRXR1(newRXR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR1, newRXR1, newRXR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR2CONTENT getRXR2() {
		return rXR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR2(RXR2CONTENT newRXR2, NotificationChain msgs) {
		RXR2CONTENT oldRXR2 = rXR2;
		rXR2 = newRXR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR2, oldRXR2, newRXR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR2(RXR2CONTENT newRXR2) {
		if (newRXR2 != rXR2) {
			NotificationChain msgs = null;
			if (rXR2 != null)
				msgs = ((InternalEObject)rXR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR2, null, msgs);
			if (newRXR2 != null)
				msgs = ((InternalEObject)newRXR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR2, null, msgs);
			msgs = basicSetRXR2(newRXR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR2, newRXR2, newRXR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR3CONTENT getRXR3() {
		return rXR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR3(RXR3CONTENT newRXR3, NotificationChain msgs) {
		RXR3CONTENT oldRXR3 = rXR3;
		rXR3 = newRXR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR3, oldRXR3, newRXR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR3(RXR3CONTENT newRXR3) {
		if (newRXR3 != rXR3) {
			NotificationChain msgs = null;
			if (rXR3 != null)
				msgs = ((InternalEObject)rXR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR3, null, msgs);
			if (newRXR3 != null)
				msgs = ((InternalEObject)newRXR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR3, null, msgs);
			msgs = basicSetRXR3(newRXR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR3, newRXR3, newRXR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR4CONTENT getRXR4() {
		return rXR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR4(RXR4CONTENT newRXR4, NotificationChain msgs) {
		RXR4CONTENT oldRXR4 = rXR4;
		rXR4 = newRXR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR4, oldRXR4, newRXR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR4(RXR4CONTENT newRXR4) {
		if (newRXR4 != rXR4) {
			NotificationChain msgs = null;
			if (rXR4 != null)
				msgs = ((InternalEObject)rXR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR4, null, msgs);
			if (newRXR4 != null)
				msgs = ((InternalEObject)newRXR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR4, null, msgs);
			msgs = basicSetRXR4(newRXR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR4, newRXR4, newRXR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR5CONTENT getRXR5() {
		return rXR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR5(RXR5CONTENT newRXR5, NotificationChain msgs) {
		RXR5CONTENT oldRXR5 = rXR5;
		rXR5 = newRXR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR5, oldRXR5, newRXR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR5(RXR5CONTENT newRXR5) {
		if (newRXR5 != rXR5) {
			NotificationChain msgs = null;
			if (rXR5 != null)
				msgs = ((InternalEObject)rXR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR5, null, msgs);
			if (newRXR5 != null)
				msgs = ((InternalEObject)newRXR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR5, null, msgs);
			msgs = basicSetRXR5(newRXR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR5, newRXR5, newRXR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXR6CONTENT getRXR6() {
		return rXR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXR6(RXR6CONTENT newRXR6, NotificationChain msgs) {
		RXR6CONTENT oldRXR6 = rXR6;
		rXR6 = newRXR6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR6, oldRXR6, newRXR6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXR6(RXR6CONTENT newRXR6) {
		if (newRXR6 != rXR6) {
			NotificationChain msgs = null;
			if (rXR6 != null)
				msgs = ((InternalEObject)rXR6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR6, null, msgs);
			if (newRXR6 != null)
				msgs = ((InternalEObject)newRXR6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXRCONTENT__RXR6, null, msgs);
			msgs = basicSetRXR6(newRXR6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXRCONTENT__RXR6, newRXR6, newRXR6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXRCONTENT__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.RXRCONTENT__RXR1:
				return basicSetRXR1(null, msgs);
			case V2xmlPackage.RXRCONTENT__RXR2:
				return basicSetRXR2(null, msgs);
			case V2xmlPackage.RXRCONTENT__RXR3:
				return basicSetRXR3(null, msgs);
			case V2xmlPackage.RXRCONTENT__RXR4:
				return basicSetRXR4(null, msgs);
			case V2xmlPackage.RXRCONTENT__RXR5:
				return basicSetRXR5(null, msgs);
			case V2xmlPackage.RXRCONTENT__RXR6:
				return basicSetRXR6(null, msgs);
			case V2xmlPackage.RXRCONTENT__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.RXRCONTENT__RXR1:
				return getRXR1();
			case V2xmlPackage.RXRCONTENT__RXR2:
				return getRXR2();
			case V2xmlPackage.RXRCONTENT__RXR3:
				return getRXR3();
			case V2xmlPackage.RXRCONTENT__RXR4:
				return getRXR4();
			case V2xmlPackage.RXRCONTENT__RXR5:
				return getRXR5();
			case V2xmlPackage.RXRCONTENT__RXR6:
				return getRXR6();
			case V2xmlPackage.RXRCONTENT__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
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
			case V2xmlPackage.RXRCONTENT__RXR1:
				setRXR1((RXR1CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__RXR2:
				setRXR2((RXR2CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__RXR3:
				setRXR3((RXR3CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__RXR4:
				setRXR4((RXR4CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__RXR5:
				setRXR5((RXR5CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__RXR6:
				setRXR6((RXR6CONTENT)newValue);
				return;
			case V2xmlPackage.RXRCONTENT__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
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
			case V2xmlPackage.RXRCONTENT__RXR1:
				setRXR1((RXR1CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__RXR2:
				setRXR2((RXR2CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__RXR3:
				setRXR3((RXR3CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__RXR4:
				setRXR4((RXR4CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__RXR5:
				setRXR5((RXR5CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__RXR6:
				setRXR6((RXR6CONTENT)null);
				return;
			case V2xmlPackage.RXRCONTENT__ANY:
				getAny().clear();
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
			case V2xmlPackage.RXRCONTENT__RXR1:
				return rXR1 != null;
			case V2xmlPackage.RXRCONTENT__RXR2:
				return rXR2 != null;
			case V2xmlPackage.RXRCONTENT__RXR3:
				return rXR3 != null;
			case V2xmlPackage.RXRCONTENT__RXR4:
				return rXR4 != null;
			case V2xmlPackage.RXRCONTENT__RXR5:
				return rXR5 != null;
			case V2xmlPackage.RXRCONTENT__RXR6:
				return rXR6 != null;
			case V2xmlPackage.RXRCONTENT__ANY:
				return any != null && !any.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(')');
		return result.toString();
	}

} //RXRCONTENTImpl
