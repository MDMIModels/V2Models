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

import org.hl7.v2xml.RMI1CONTENT;
import org.hl7.v2xml.RMI2CONTENT;
import org.hl7.v2xml.RMI3CONTENT;
import org.hl7.v2xml.RMICONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RMICONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RMICONTENTImpl#getRMI1 <em>RMI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMICONTENTImpl#getRMI2 <em>RMI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMICONTENTImpl#getRMI3 <em>RMI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RMICONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RMICONTENTImpl extends EObjectImpl implements RMICONTENT {
	/**
	 * The cached value of the '{@link #getRMI1() <em>RMI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMI1()
	 * @generated
	 * @ordered
	 */
	protected RMI1CONTENT rMI1;

	/**
	 * The cached value of the '{@link #getRMI2() <em>RMI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMI2()
	 * @generated
	 * @ordered
	 */
	protected RMI2CONTENT rMI2;

	/**
	 * The cached value of the '{@link #getRMI3() <em>RMI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRMI3()
	 * @generated
	 * @ordered
	 */
	protected RMI3CONTENT rMI3;

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
	protected RMICONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRMICONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMI1CONTENT getRMI1() {
		return rMI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMI1(RMI1CONTENT newRMI1, NotificationChain msgs) {
		RMI1CONTENT oldRMI1 = rMI1;
		rMI1 = newRMI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI1, oldRMI1, newRMI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMI1(RMI1CONTENT newRMI1) {
		if (newRMI1 != rMI1) {
			NotificationChain msgs = null;
			if (rMI1 != null)
				msgs = ((InternalEObject)rMI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI1, null, msgs);
			if (newRMI1 != null)
				msgs = ((InternalEObject)newRMI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI1, null, msgs);
			msgs = basicSetRMI1(newRMI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI1, newRMI1, newRMI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMI2CONTENT getRMI2() {
		return rMI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMI2(RMI2CONTENT newRMI2, NotificationChain msgs) {
		RMI2CONTENT oldRMI2 = rMI2;
		rMI2 = newRMI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI2, oldRMI2, newRMI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMI2(RMI2CONTENT newRMI2) {
		if (newRMI2 != rMI2) {
			NotificationChain msgs = null;
			if (rMI2 != null)
				msgs = ((InternalEObject)rMI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI2, null, msgs);
			if (newRMI2 != null)
				msgs = ((InternalEObject)newRMI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI2, null, msgs);
			msgs = basicSetRMI2(newRMI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI2, newRMI2, newRMI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMI3CONTENT getRMI3() {
		return rMI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRMI3(RMI3CONTENT newRMI3, NotificationChain msgs) {
		RMI3CONTENT oldRMI3 = rMI3;
		rMI3 = newRMI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI3, oldRMI3, newRMI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRMI3(RMI3CONTENT newRMI3) {
		if (newRMI3 != rMI3) {
			NotificationChain msgs = null;
			if (rMI3 != null)
				msgs = ((InternalEObject)rMI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI3, null, msgs);
			if (newRMI3 != null)
				msgs = ((InternalEObject)newRMI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RMICONTENT__RMI3, null, msgs);
			msgs = basicSetRMI3(newRMI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RMICONTENT__RMI3, newRMI3, newRMI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RMICONTENT__ANY);
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
			case V2xmlPackage.RMICONTENT__RMI1:
				return basicSetRMI1(null, msgs);
			case V2xmlPackage.RMICONTENT__RMI2:
				return basicSetRMI2(null, msgs);
			case V2xmlPackage.RMICONTENT__RMI3:
				return basicSetRMI3(null, msgs);
			case V2xmlPackage.RMICONTENT__ANY:
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
			case V2xmlPackage.RMICONTENT__RMI1:
				return getRMI1();
			case V2xmlPackage.RMICONTENT__RMI2:
				return getRMI2();
			case V2xmlPackage.RMICONTENT__RMI3:
				return getRMI3();
			case V2xmlPackage.RMICONTENT__ANY:
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
			case V2xmlPackage.RMICONTENT__RMI1:
				setRMI1((RMI1CONTENT)newValue);
				return;
			case V2xmlPackage.RMICONTENT__RMI2:
				setRMI2((RMI2CONTENT)newValue);
				return;
			case V2xmlPackage.RMICONTENT__RMI3:
				setRMI3((RMI3CONTENT)newValue);
				return;
			case V2xmlPackage.RMICONTENT__ANY:
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
			case V2xmlPackage.RMICONTENT__RMI1:
				setRMI1((RMI1CONTENT)null);
				return;
			case V2xmlPackage.RMICONTENT__RMI2:
				setRMI2((RMI2CONTENT)null);
				return;
			case V2xmlPackage.RMICONTENT__RMI3:
				setRMI3((RMI3CONTENT)null);
				return;
			case V2xmlPackage.RMICONTENT__ANY:
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
			case V2xmlPackage.RMICONTENT__RMI1:
				return rMI1 != null;
			case V2xmlPackage.RMICONTENT__RMI2:
				return rMI2 != null;
			case V2xmlPackage.RMICONTENT__RMI3:
				return rMI3 != null;
			case V2xmlPackage.RMICONTENT__ANY:
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

} //RMICONTENTImpl
