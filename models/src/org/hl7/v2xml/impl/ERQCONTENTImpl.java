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

import org.hl7.v2xml.ERQ1CONTENT;
import org.hl7.v2xml.ERQ2CONTENT;
import org.hl7.v2xml.ERQ3CONTENT;
import org.hl7.v2xml.ERQCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERQCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ERQCONTENTImpl#getERQ1 <em>ERQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERQCONTENTImpl#getERQ2 <em>ERQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERQCONTENTImpl#getERQ3 <em>ERQ3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ERQCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERQCONTENTImpl extends EObjectImpl implements ERQCONTENT {
	/**
	 * The cached value of the '{@link #getERQ1() <em>ERQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERQ1()
	 * @generated
	 * @ordered
	 */
	protected ERQ1CONTENT eRQ1;

	/**
	 * The cached value of the '{@link #getERQ2() <em>ERQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERQ2()
	 * @generated
	 * @ordered
	 */
	protected ERQ2CONTENT eRQ2;

	/**
	 * The cached value of the '{@link #getERQ3() <em>ERQ3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getERQ3()
	 * @generated
	 * @ordered
	 */
	protected EList<ERQ3CONTENT> eRQ3;

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
	protected ERQCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getERQCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERQ1CONTENT getERQ1() {
		return eRQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERQ1(ERQ1CONTENT newERQ1, NotificationChain msgs) {
		ERQ1CONTENT oldERQ1 = eRQ1;
		eRQ1 = newERQ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERQCONTENT__ERQ1, oldERQ1, newERQ1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERQ1(ERQ1CONTENT newERQ1) {
		if (newERQ1 != eRQ1) {
			NotificationChain msgs = null;
			if (eRQ1 != null)
				msgs = ((InternalEObject)eRQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERQCONTENT__ERQ1, null, msgs);
			if (newERQ1 != null)
				msgs = ((InternalEObject)newERQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERQCONTENT__ERQ1, null, msgs);
			msgs = basicSetERQ1(newERQ1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERQCONTENT__ERQ1, newERQ1, newERQ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERQ2CONTENT getERQ2() {
		return eRQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetERQ2(ERQ2CONTENT newERQ2, NotificationChain msgs) {
		ERQ2CONTENT oldERQ2 = eRQ2;
		eRQ2 = newERQ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERQCONTENT__ERQ2, oldERQ2, newERQ2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setERQ2(ERQ2CONTENT newERQ2) {
		if (newERQ2 != eRQ2) {
			NotificationChain msgs = null;
			if (eRQ2 != null)
				msgs = ((InternalEObject)eRQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERQCONTENT__ERQ2, null, msgs);
			if (newERQ2 != null)
				msgs = ((InternalEObject)newERQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ERQCONTENT__ERQ2, null, msgs);
			msgs = basicSetERQ2(newERQ2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ERQCONTENT__ERQ2, newERQ2, newERQ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ERQ3CONTENT> getERQ3() {
		if (eRQ3 == null) {
			eRQ3 = new EObjectContainmentEList<ERQ3CONTENT>(ERQ3CONTENT.class, this, V2xmlPackage.ERQCONTENT__ERQ3);
		}
		return eRQ3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ERQCONTENT__ANY);
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
			case V2xmlPackage.ERQCONTENT__ERQ1:
				return basicSetERQ1(null, msgs);
			case V2xmlPackage.ERQCONTENT__ERQ2:
				return basicSetERQ2(null, msgs);
			case V2xmlPackage.ERQCONTENT__ERQ3:
				return ((InternalEList<?>)getERQ3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ERQCONTENT__ANY:
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
			case V2xmlPackage.ERQCONTENT__ERQ1:
				return getERQ1();
			case V2xmlPackage.ERQCONTENT__ERQ2:
				return getERQ2();
			case V2xmlPackage.ERQCONTENT__ERQ3:
				return getERQ3();
			case V2xmlPackage.ERQCONTENT__ANY:
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
			case V2xmlPackage.ERQCONTENT__ERQ1:
				setERQ1((ERQ1CONTENT)newValue);
				return;
			case V2xmlPackage.ERQCONTENT__ERQ2:
				setERQ2((ERQ2CONTENT)newValue);
				return;
			case V2xmlPackage.ERQCONTENT__ERQ3:
				getERQ3().clear();
				getERQ3().addAll((Collection<? extends ERQ3CONTENT>)newValue);
				return;
			case V2xmlPackage.ERQCONTENT__ANY:
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
			case V2xmlPackage.ERQCONTENT__ERQ1:
				setERQ1((ERQ1CONTENT)null);
				return;
			case V2xmlPackage.ERQCONTENT__ERQ2:
				setERQ2((ERQ2CONTENT)null);
				return;
			case V2xmlPackage.ERQCONTENT__ERQ3:
				getERQ3().clear();
				return;
			case V2xmlPackage.ERQCONTENT__ANY:
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
			case V2xmlPackage.ERQCONTENT__ERQ1:
				return eRQ1 != null;
			case V2xmlPackage.ERQCONTENT__ERQ2:
				return eRQ2 != null;
			case V2xmlPackage.ERQCONTENT__ERQ3:
				return eRQ3 != null && !eRQ3.isEmpty();
			case V2xmlPackage.ERQCONTENT__ANY:
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

} //ERQCONTENTImpl
