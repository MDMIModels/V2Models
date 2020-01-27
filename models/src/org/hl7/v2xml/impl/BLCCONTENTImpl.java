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

import org.hl7.v2xml.BLC1CONTENT;
import org.hl7.v2xml.BLC2CONTENT;
import org.hl7.v2xml.BLCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BLCCONTENTImpl#getBLC1 <em>BLC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLCCONTENTImpl#getBLC2 <em>BLC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BLCCONTENTImpl extends EObjectImpl implements BLCCONTENT {
	/**
	 * The cached value of the '{@link #getBLC1() <em>BLC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLC1()
	 * @generated
	 * @ordered
	 */
	protected BLC1CONTENT bLC1;

	/**
	 * The cached value of the '{@link #getBLC2() <em>BLC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLC2()
	 * @generated
	 * @ordered
	 */
	protected BLC2CONTENT bLC2;

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
	protected BLCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBLCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLC1CONTENT getBLC1() {
		return bLC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLC1(BLC1CONTENT newBLC1, NotificationChain msgs) {
		BLC1CONTENT oldBLC1 = bLC1;
		bLC1 = newBLC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLCCONTENT__BLC1, oldBLC1, newBLC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLC1(BLC1CONTENT newBLC1) {
		if (newBLC1 != bLC1) {
			NotificationChain msgs = null;
			if (bLC1 != null)
				msgs = ((InternalEObject)bLC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLCCONTENT__BLC1, null, msgs);
			if (newBLC1 != null)
				msgs = ((InternalEObject)newBLC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLCCONTENT__BLC1, null, msgs);
			msgs = basicSetBLC1(newBLC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLCCONTENT__BLC1, newBLC1, newBLC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLC2CONTENT getBLC2() {
		return bLC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLC2(BLC2CONTENT newBLC2, NotificationChain msgs) {
		BLC2CONTENT oldBLC2 = bLC2;
		bLC2 = newBLC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLCCONTENT__BLC2, oldBLC2, newBLC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLC2(BLC2CONTENT newBLC2) {
		if (newBLC2 != bLC2) {
			NotificationChain msgs = null;
			if (bLC2 != null)
				msgs = ((InternalEObject)bLC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLCCONTENT__BLC2, null, msgs);
			if (newBLC2 != null)
				msgs = ((InternalEObject)newBLC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLCCONTENT__BLC2, null, msgs);
			msgs = basicSetBLC2(newBLC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLCCONTENT__BLC2, newBLC2, newBLC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BLCCONTENT__ANY);
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
			case V2xmlPackage.BLCCONTENT__BLC1:
				return basicSetBLC1(null, msgs);
			case V2xmlPackage.BLCCONTENT__BLC2:
				return basicSetBLC2(null, msgs);
			case V2xmlPackage.BLCCONTENT__ANY:
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
			case V2xmlPackage.BLCCONTENT__BLC1:
				return getBLC1();
			case V2xmlPackage.BLCCONTENT__BLC2:
				return getBLC2();
			case V2xmlPackage.BLCCONTENT__ANY:
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
			case V2xmlPackage.BLCCONTENT__BLC1:
				setBLC1((BLC1CONTENT)newValue);
				return;
			case V2xmlPackage.BLCCONTENT__BLC2:
				setBLC2((BLC2CONTENT)newValue);
				return;
			case V2xmlPackage.BLCCONTENT__ANY:
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
			case V2xmlPackage.BLCCONTENT__BLC1:
				setBLC1((BLC1CONTENT)null);
				return;
			case V2xmlPackage.BLCCONTENT__BLC2:
				setBLC2((BLC2CONTENT)null);
				return;
			case V2xmlPackage.BLCCONTENT__ANY:
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
			case V2xmlPackage.BLCCONTENT__BLC1:
				return bLC1 != null;
			case V2xmlPackage.BLCCONTENT__BLC2:
				return bLC2 != null;
			case V2xmlPackage.BLCCONTENT__ANY:
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

} //BLCCONTENTImpl
