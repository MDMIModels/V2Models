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

import org.hl7.v2xml.DSC1CONTENT;
import org.hl7.v2xml.DSC2CONTENT;
import org.hl7.v2xml.DSCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DSCCONTENTImpl#getDSC1 <em>DSC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSCCONTENTImpl#getDSC2 <em>DSC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSCCONTENTImpl extends EObjectImpl implements DSCCONTENT {
	/**
	 * The cached value of the '{@link #getDSC1() <em>DSC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSC1()
	 * @generated
	 * @ordered
	 */
	protected DSC1CONTENT dSC1;

	/**
	 * The cached value of the '{@link #getDSC2() <em>DSC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSC2()
	 * @generated
	 * @ordered
	 */
	protected DSC2CONTENT dSC2;

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
	protected DSCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDSCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSC1CONTENT getDSC1() {
		return dSC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSC1(DSC1CONTENT newDSC1, NotificationChain msgs) {
		DSC1CONTENT oldDSC1 = dSC1;
		dSC1 = newDSC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSCCONTENT__DSC1, oldDSC1, newDSC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSC1(DSC1CONTENT newDSC1) {
		if (newDSC1 != dSC1) {
			NotificationChain msgs = null;
			if (dSC1 != null)
				msgs = ((InternalEObject)dSC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSCCONTENT__DSC1, null, msgs);
			if (newDSC1 != null)
				msgs = ((InternalEObject)newDSC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSCCONTENT__DSC1, null, msgs);
			msgs = basicSetDSC1(newDSC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSCCONTENT__DSC1, newDSC1, newDSC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSC2CONTENT getDSC2() {
		return dSC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSC2(DSC2CONTENT newDSC2, NotificationChain msgs) {
		DSC2CONTENT oldDSC2 = dSC2;
		dSC2 = newDSC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSCCONTENT__DSC2, oldDSC2, newDSC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSC2(DSC2CONTENT newDSC2) {
		if (newDSC2 != dSC2) {
			NotificationChain msgs = null;
			if (dSC2 != null)
				msgs = ((InternalEObject)dSC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSCCONTENT__DSC2, null, msgs);
			if (newDSC2 != null)
				msgs = ((InternalEObject)newDSC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSCCONTENT__DSC2, null, msgs);
			msgs = basicSetDSC2(newDSC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSCCONTENT__DSC2, newDSC2, newDSC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.DSCCONTENT__ANY);
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
			case V2xmlPackage.DSCCONTENT__DSC1:
				return basicSetDSC1(null, msgs);
			case V2xmlPackage.DSCCONTENT__DSC2:
				return basicSetDSC2(null, msgs);
			case V2xmlPackage.DSCCONTENT__ANY:
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
			case V2xmlPackage.DSCCONTENT__DSC1:
				return getDSC1();
			case V2xmlPackage.DSCCONTENT__DSC2:
				return getDSC2();
			case V2xmlPackage.DSCCONTENT__ANY:
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
			case V2xmlPackage.DSCCONTENT__DSC1:
				setDSC1((DSC1CONTENT)newValue);
				return;
			case V2xmlPackage.DSCCONTENT__DSC2:
				setDSC2((DSC2CONTENT)newValue);
				return;
			case V2xmlPackage.DSCCONTENT__ANY:
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
			case V2xmlPackage.DSCCONTENT__DSC1:
				setDSC1((DSC1CONTENT)null);
				return;
			case V2xmlPackage.DSCCONTENT__DSC2:
				setDSC2((DSC2CONTENT)null);
				return;
			case V2xmlPackage.DSCCONTENT__ANY:
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
			case V2xmlPackage.DSCCONTENT__DSC1:
				return dSC1 != null;
			case V2xmlPackage.DSCCONTENT__DSC2:
				return dSC2 != null;
			case V2xmlPackage.DSCCONTENT__ANY:
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

} //DSCCONTENTImpl
