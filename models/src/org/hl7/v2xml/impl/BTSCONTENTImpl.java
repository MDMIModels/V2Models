/**
 */
package org.hl7.v2xml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.BTS1CONTENT;
import org.hl7.v2xml.BTS2CONTENT;
import org.hl7.v2xml.BTS3CONTENT;
import org.hl7.v2xml.BTSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BTSCONTENTImpl#getBTS1 <em>BTS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTSCONTENTImpl#getBTS2 <em>BTS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTSCONTENTImpl#getBTS3 <em>BTS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTSCONTENTImpl extends EObjectImpl implements BTSCONTENT {
	/**
	 * The cached value of the '{@link #getBTS1() <em>BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTS1()
	 * @generated
	 * @ordered
	 */
	protected BTS1CONTENT bTS1;

	/**
	 * The cached value of the '{@link #getBTS2() <em>BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTS2()
	 * @generated
	 * @ordered
	 */
	protected BTS2CONTENT bTS2;

	/**
	 * The cached value of the '{@link #getBTS3() <em>BTS3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTS3()
	 * @generated
	 * @ordered
	 */
	protected EList<BTS3CONTENT> bTS3;

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
	protected BTSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBTSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTS1CONTENT getBTS1() {
		return bTS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTS1(BTS1CONTENT newBTS1, NotificationChain msgs) {
		BTS1CONTENT oldBTS1 = bTS1;
		bTS1 = newBTS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTSCONTENT__BTS1, oldBTS1, newBTS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTS1(BTS1CONTENT newBTS1) {
		if (newBTS1 != bTS1) {
			NotificationChain msgs = null;
			if (bTS1 != null)
				msgs = ((InternalEObject)bTS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTSCONTENT__BTS1, null, msgs);
			if (newBTS1 != null)
				msgs = ((InternalEObject)newBTS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTSCONTENT__BTS1, null, msgs);
			msgs = basicSetBTS1(newBTS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTSCONTENT__BTS1, newBTS1, newBTS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTS2CONTENT getBTS2() {
		return bTS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTS2(BTS2CONTENT newBTS2, NotificationChain msgs) {
		BTS2CONTENT oldBTS2 = bTS2;
		bTS2 = newBTS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTSCONTENT__BTS2, oldBTS2, newBTS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTS2(BTS2CONTENT newBTS2) {
		if (newBTS2 != bTS2) {
			NotificationChain msgs = null;
			if (bTS2 != null)
				msgs = ((InternalEObject)bTS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTSCONTENT__BTS2, null, msgs);
			if (newBTS2 != null)
				msgs = ((InternalEObject)newBTS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTSCONTENT__BTS2, null, msgs);
			msgs = basicSetBTS2(newBTS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTSCONTENT__BTS2, newBTS2, newBTS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTS3CONTENT> getBTS3() {
		if (bTS3 == null) {
			bTS3 = new EObjectContainmentEList<BTS3CONTENT>(BTS3CONTENT.class, this, V2xmlPackage.BTSCONTENT__BTS3);
		}
		return bTS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BTSCONTENT__ANY);
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
			case V2xmlPackage.BTSCONTENT__BTS1:
				return basicSetBTS1(null, msgs);
			case V2xmlPackage.BTSCONTENT__BTS2:
				return basicSetBTS2(null, msgs);
			case V2xmlPackage.BTSCONTENT__BTS3:
				return ((InternalEList<?>)getBTS3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BTSCONTENT__ANY:
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
			case V2xmlPackage.BTSCONTENT__BTS1:
				return getBTS1();
			case V2xmlPackage.BTSCONTENT__BTS2:
				return getBTS2();
			case V2xmlPackage.BTSCONTENT__BTS3:
				return getBTS3();
			case V2xmlPackage.BTSCONTENT__ANY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.BTSCONTENT__BTS1:
				setBTS1((BTS1CONTENT)newValue);
				return;
			case V2xmlPackage.BTSCONTENT__BTS2:
				setBTS2((BTS2CONTENT)newValue);
				return;
			case V2xmlPackage.BTSCONTENT__BTS3:
				getBTS3().clear();
				getBTS3().addAll((Collection<? extends BTS3CONTENT>)newValue);
				return;
			case V2xmlPackage.BTSCONTENT__ANY:
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
			case V2xmlPackage.BTSCONTENT__BTS1:
				setBTS1((BTS1CONTENT)null);
				return;
			case V2xmlPackage.BTSCONTENT__BTS2:
				setBTS2((BTS2CONTENT)null);
				return;
			case V2xmlPackage.BTSCONTENT__BTS3:
				getBTS3().clear();
				return;
			case V2xmlPackage.BTSCONTENT__ANY:
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
			case V2xmlPackage.BTSCONTENT__BTS1:
				return bTS1 != null;
			case V2xmlPackage.BTSCONTENT__BTS2:
				return bTS2 != null;
			case V2xmlPackage.BTSCONTENT__BTS3:
				return bTS3 != null && !bTS3.isEmpty();
			case V2xmlPackage.BTSCONTENT__ANY:
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

} //BTSCONTENTImpl
