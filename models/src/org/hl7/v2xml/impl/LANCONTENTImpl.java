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

import org.hl7.v2xml.LAN1CONTENT;
import org.hl7.v2xml.LAN2CONTENT;
import org.hl7.v2xml.LAN3CONTENT;
import org.hl7.v2xml.LAN4CONTENT;
import org.hl7.v2xml.LANCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LANCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LANCONTENTImpl#getLAN1 <em>LAN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LANCONTENTImpl#getLAN2 <em>LAN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LANCONTENTImpl#getLAN3 <em>LAN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LANCONTENTImpl#getLAN4 <em>LAN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LANCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LANCONTENTImpl extends EObjectImpl implements LANCONTENT {
	/**
	 * The cached value of the '{@link #getLAN1() <em>LAN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAN1()
	 * @generated
	 * @ordered
	 */
	protected LAN1CONTENT lAN1;

	/**
	 * The cached value of the '{@link #getLAN2() <em>LAN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAN2()
	 * @generated
	 * @ordered
	 */
	protected LAN2CONTENT lAN2;

	/**
	 * The cached value of the '{@link #getLAN3() <em>LAN3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAN3()
	 * @generated
	 * @ordered
	 */
	protected EList<LAN3CONTENT> lAN3;

	/**
	 * The cached value of the '{@link #getLAN4() <em>LAN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLAN4()
	 * @generated
	 * @ordered
	 */
	protected LAN4CONTENT lAN4;

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
	protected LANCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLANCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LAN1CONTENT getLAN1() {
		return lAN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLAN1(LAN1CONTENT newLAN1, NotificationChain msgs) {
		LAN1CONTENT oldLAN1 = lAN1;
		lAN1 = newLAN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN1, oldLAN1, newLAN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLAN1(LAN1CONTENT newLAN1) {
		if (newLAN1 != lAN1) {
			NotificationChain msgs = null;
			if (lAN1 != null)
				msgs = ((InternalEObject)lAN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN1, null, msgs);
			if (newLAN1 != null)
				msgs = ((InternalEObject)newLAN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN1, null, msgs);
			msgs = basicSetLAN1(newLAN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN1, newLAN1, newLAN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LAN2CONTENT getLAN2() {
		return lAN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLAN2(LAN2CONTENT newLAN2, NotificationChain msgs) {
		LAN2CONTENT oldLAN2 = lAN2;
		lAN2 = newLAN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN2, oldLAN2, newLAN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLAN2(LAN2CONTENT newLAN2) {
		if (newLAN2 != lAN2) {
			NotificationChain msgs = null;
			if (lAN2 != null)
				msgs = ((InternalEObject)lAN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN2, null, msgs);
			if (newLAN2 != null)
				msgs = ((InternalEObject)newLAN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN2, null, msgs);
			msgs = basicSetLAN2(newLAN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN2, newLAN2, newLAN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LAN3CONTENT> getLAN3() {
		if (lAN3 == null) {
			lAN3 = new EObjectContainmentEList<LAN3CONTENT>(LAN3CONTENT.class, this, V2xmlPackage.LANCONTENT__LAN3);
		}
		return lAN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LAN4CONTENT getLAN4() {
		return lAN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLAN4(LAN4CONTENT newLAN4, NotificationChain msgs) {
		LAN4CONTENT oldLAN4 = lAN4;
		lAN4 = newLAN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN4, oldLAN4, newLAN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLAN4(LAN4CONTENT newLAN4) {
		if (newLAN4 != lAN4) {
			NotificationChain msgs = null;
			if (lAN4 != null)
				msgs = ((InternalEObject)lAN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN4, null, msgs);
			if (newLAN4 != null)
				msgs = ((InternalEObject)newLAN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LANCONTENT__LAN4, null, msgs);
			msgs = basicSetLAN4(newLAN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LANCONTENT__LAN4, newLAN4, newLAN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LANCONTENT__ANY);
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
			case V2xmlPackage.LANCONTENT__LAN1:
				return basicSetLAN1(null, msgs);
			case V2xmlPackage.LANCONTENT__LAN2:
				return basicSetLAN2(null, msgs);
			case V2xmlPackage.LANCONTENT__LAN3:
				return ((InternalEList<?>)getLAN3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LANCONTENT__LAN4:
				return basicSetLAN4(null, msgs);
			case V2xmlPackage.LANCONTENT__ANY:
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
			case V2xmlPackage.LANCONTENT__LAN1:
				return getLAN1();
			case V2xmlPackage.LANCONTENT__LAN2:
				return getLAN2();
			case V2xmlPackage.LANCONTENT__LAN3:
				return getLAN3();
			case V2xmlPackage.LANCONTENT__LAN4:
				return getLAN4();
			case V2xmlPackage.LANCONTENT__ANY:
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
			case V2xmlPackage.LANCONTENT__LAN1:
				setLAN1((LAN1CONTENT)newValue);
				return;
			case V2xmlPackage.LANCONTENT__LAN2:
				setLAN2((LAN2CONTENT)newValue);
				return;
			case V2xmlPackage.LANCONTENT__LAN3:
				getLAN3().clear();
				getLAN3().addAll((Collection<? extends LAN3CONTENT>)newValue);
				return;
			case V2xmlPackage.LANCONTENT__LAN4:
				setLAN4((LAN4CONTENT)newValue);
				return;
			case V2xmlPackage.LANCONTENT__ANY:
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
			case V2xmlPackage.LANCONTENT__LAN1:
				setLAN1((LAN1CONTENT)null);
				return;
			case V2xmlPackage.LANCONTENT__LAN2:
				setLAN2((LAN2CONTENT)null);
				return;
			case V2xmlPackage.LANCONTENT__LAN3:
				getLAN3().clear();
				return;
			case V2xmlPackage.LANCONTENT__LAN4:
				setLAN4((LAN4CONTENT)null);
				return;
			case V2xmlPackage.LANCONTENT__ANY:
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
			case V2xmlPackage.LANCONTENT__LAN1:
				return lAN1 != null;
			case V2xmlPackage.LANCONTENT__LAN2:
				return lAN2 != null;
			case V2xmlPackage.LANCONTENT__LAN3:
				return lAN3 != null && !lAN3.isEmpty();
			case V2xmlPackage.LANCONTENT__LAN4:
				return lAN4 != null;
			case V2xmlPackage.LANCONTENT__ANY:
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

} //LANCONTENTImpl
