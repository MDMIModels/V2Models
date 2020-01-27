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

import org.hl7.v2xml.ECR1CONTENT;
import org.hl7.v2xml.ECR2CONTENT;
import org.hl7.v2xml.ECR3CONTENT;
import org.hl7.v2xml.ECRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ECRCONTENTImpl#getECR1 <em>ECR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECRCONTENTImpl#getECR2 <em>ECR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECRCONTENTImpl#getECR3 <em>ECR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECRCONTENTImpl extends EObjectImpl implements ECRCONTENT {
	/**
	 * The cached value of the '{@link #getECR1() <em>ECR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECR1()
	 * @generated
	 * @ordered
	 */
	protected ECR1CONTENT eCR1;

	/**
	 * The cached value of the '{@link #getECR2() <em>ECR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECR2()
	 * @generated
	 * @ordered
	 */
	protected ECR2CONTENT eCR2;

	/**
	 * The cached value of the '{@link #getECR3() <em>ECR3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECR3()
	 * @generated
	 * @ordered
	 */
	protected EList<ECR3CONTENT> eCR3;

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
	protected ECRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getECRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECR1CONTENT getECR1() {
		return eCR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECR1(ECR1CONTENT newECR1, NotificationChain msgs) {
		ECR1CONTENT oldECR1 = eCR1;
		eCR1 = newECR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECRCONTENT__ECR1, oldECR1, newECR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECR1(ECR1CONTENT newECR1) {
		if (newECR1 != eCR1) {
			NotificationChain msgs = null;
			if (eCR1 != null)
				msgs = ((InternalEObject)eCR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECRCONTENT__ECR1, null, msgs);
			if (newECR1 != null)
				msgs = ((InternalEObject)newECR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECRCONTENT__ECR1, null, msgs);
			msgs = basicSetECR1(newECR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECRCONTENT__ECR1, newECR1, newECR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECR2CONTENT getECR2() {
		return eCR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECR2(ECR2CONTENT newECR2, NotificationChain msgs) {
		ECR2CONTENT oldECR2 = eCR2;
		eCR2 = newECR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECRCONTENT__ECR2, oldECR2, newECR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECR2(ECR2CONTENT newECR2) {
		if (newECR2 != eCR2) {
			NotificationChain msgs = null;
			if (eCR2 != null)
				msgs = ((InternalEObject)eCR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECRCONTENT__ECR2, null, msgs);
			if (newECR2 != null)
				msgs = ((InternalEObject)newECR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECRCONTENT__ECR2, null, msgs);
			msgs = basicSetECR2(newECR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECRCONTENT__ECR2, newECR2, newECR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECR3CONTENT> getECR3() {
		if (eCR3 == null) {
			eCR3 = new EObjectContainmentEList<ECR3CONTENT>(ECR3CONTENT.class, this, V2xmlPackage.ECRCONTENT__ECR3);
		}
		return eCR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ECRCONTENT__ANY);
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
			case V2xmlPackage.ECRCONTENT__ECR1:
				return basicSetECR1(null, msgs);
			case V2xmlPackage.ECRCONTENT__ECR2:
				return basicSetECR2(null, msgs);
			case V2xmlPackage.ECRCONTENT__ECR3:
				return ((InternalEList<?>)getECR3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ECRCONTENT__ANY:
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
			case V2xmlPackage.ECRCONTENT__ECR1:
				return getECR1();
			case V2xmlPackage.ECRCONTENT__ECR2:
				return getECR2();
			case V2xmlPackage.ECRCONTENT__ECR3:
				return getECR3();
			case V2xmlPackage.ECRCONTENT__ANY:
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
			case V2xmlPackage.ECRCONTENT__ECR1:
				setECR1((ECR1CONTENT)newValue);
				return;
			case V2xmlPackage.ECRCONTENT__ECR2:
				setECR2((ECR2CONTENT)newValue);
				return;
			case V2xmlPackage.ECRCONTENT__ECR3:
				getECR3().clear();
				getECR3().addAll((Collection<? extends ECR3CONTENT>)newValue);
				return;
			case V2xmlPackage.ECRCONTENT__ANY:
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
			case V2xmlPackage.ECRCONTENT__ECR1:
				setECR1((ECR1CONTENT)null);
				return;
			case V2xmlPackage.ECRCONTENT__ECR2:
				setECR2((ECR2CONTENT)null);
				return;
			case V2xmlPackage.ECRCONTENT__ECR3:
				getECR3().clear();
				return;
			case V2xmlPackage.ECRCONTENT__ANY:
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
			case V2xmlPackage.ECRCONTENT__ECR1:
				return eCR1 != null;
			case V2xmlPackage.ECRCONTENT__ECR2:
				return eCR2 != null;
			case V2xmlPackage.ECRCONTENT__ECR3:
				return eCR3 != null && !eCR3.isEmpty();
			case V2xmlPackage.ECRCONTENT__ANY:
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

} //ECRCONTENTImpl
