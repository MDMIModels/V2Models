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

import org.hl7.v2xml.CM11CONTENT;
import org.hl7.v2xml.CM12CONTENT;
import org.hl7.v2xml.CM13CONTENT;
import org.hl7.v2xml.CM1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CM1CONTENTImpl#getCM11 <em>CM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM1CONTENTImpl#getCM12 <em>CM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM1CONTENTImpl#getCM13 <em>CM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CM1CONTENTImpl extends EObjectImpl implements CM1CONTENT {
	/**
	 * The cached value of the '{@link #getCM11() <em>CM11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM11()
	 * @generated
	 * @ordered
	 */
	protected CM11CONTENT cM11;

	/**
	 * The cached value of the '{@link #getCM12() <em>CM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM12()
	 * @generated
	 * @ordered
	 */
	protected CM12CONTENT cM12;

	/**
	 * The cached value of the '{@link #getCM13() <em>CM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM13()
	 * @generated
	 * @ordered
	 */
	protected CM13CONTENT cM13;

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
	protected CM1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCM1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM11CONTENT getCM11() {
		return cM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM11(CM11CONTENT newCM11, NotificationChain msgs) {
		CM11CONTENT oldCM11 = cM11;
		cM11 = newCM11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM11, oldCM11, newCM11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM11(CM11CONTENT newCM11) {
		if (newCM11 != cM11) {
			NotificationChain msgs = null;
			if (cM11 != null)
				msgs = ((InternalEObject)cM11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM11, null, msgs);
			if (newCM11 != null)
				msgs = ((InternalEObject)newCM11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM11, null, msgs);
			msgs = basicSetCM11(newCM11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM11, newCM11, newCM11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM12CONTENT getCM12() {
		return cM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM12(CM12CONTENT newCM12, NotificationChain msgs) {
		CM12CONTENT oldCM12 = cM12;
		cM12 = newCM12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM12, oldCM12, newCM12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM12(CM12CONTENT newCM12) {
		if (newCM12 != cM12) {
			NotificationChain msgs = null;
			if (cM12 != null)
				msgs = ((InternalEObject)cM12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM12, null, msgs);
			if (newCM12 != null)
				msgs = ((InternalEObject)newCM12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM12, null, msgs);
			msgs = basicSetCM12(newCM12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM12, newCM12, newCM12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM13CONTENT getCM13() {
		return cM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM13(CM13CONTENT newCM13, NotificationChain msgs) {
		CM13CONTENT oldCM13 = cM13;
		cM13 = newCM13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM13, oldCM13, newCM13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM13(CM13CONTENT newCM13) {
		if (newCM13 != cM13) {
			NotificationChain msgs = null;
			if (cM13 != null)
				msgs = ((InternalEObject)cM13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM13, null, msgs);
			if (newCM13 != null)
				msgs = ((InternalEObject)newCM13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM1CONTENT__CM13, null, msgs);
			msgs = basicSetCM13(newCM13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM1CONTENT__CM13, newCM13, newCM13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CM1CONTENT__ANY);
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
			case V2xmlPackage.CM1CONTENT__CM11:
				return basicSetCM11(null, msgs);
			case V2xmlPackage.CM1CONTENT__CM12:
				return basicSetCM12(null, msgs);
			case V2xmlPackage.CM1CONTENT__CM13:
				return basicSetCM13(null, msgs);
			case V2xmlPackage.CM1CONTENT__ANY:
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
			case V2xmlPackage.CM1CONTENT__CM11:
				return getCM11();
			case V2xmlPackage.CM1CONTENT__CM12:
				return getCM12();
			case V2xmlPackage.CM1CONTENT__CM13:
				return getCM13();
			case V2xmlPackage.CM1CONTENT__ANY:
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
			case V2xmlPackage.CM1CONTENT__CM11:
				setCM11((CM11CONTENT)newValue);
				return;
			case V2xmlPackage.CM1CONTENT__CM12:
				setCM12((CM12CONTENT)newValue);
				return;
			case V2xmlPackage.CM1CONTENT__CM13:
				setCM13((CM13CONTENT)newValue);
				return;
			case V2xmlPackage.CM1CONTENT__ANY:
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
			case V2xmlPackage.CM1CONTENT__CM11:
				setCM11((CM11CONTENT)null);
				return;
			case V2xmlPackage.CM1CONTENT__CM12:
				setCM12((CM12CONTENT)null);
				return;
			case V2xmlPackage.CM1CONTENT__CM13:
				setCM13((CM13CONTENT)null);
				return;
			case V2xmlPackage.CM1CONTENT__ANY:
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
			case V2xmlPackage.CM1CONTENT__CM11:
				return cM11 != null;
			case V2xmlPackage.CM1CONTENT__CM12:
				return cM12 != null;
			case V2xmlPackage.CM1CONTENT__CM13:
				return cM13 != null;
			case V2xmlPackage.CM1CONTENT__ANY:
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

} //CM1CONTENTImpl
