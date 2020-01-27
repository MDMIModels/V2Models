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

import org.hl7.v2xml.CTI1CONTENT;
import org.hl7.v2xml.CTI2CONTENT;
import org.hl7.v2xml.CTI3CONTENT;
import org.hl7.v2xml.CTICONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTICONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CTICONTENTImpl#getCTI1 <em>CTI1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTICONTENTImpl#getCTI2 <em>CTI2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTICONTENTImpl#getCTI3 <em>CTI3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTICONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTICONTENTImpl extends EObjectImpl implements CTICONTENT {
	/**
	 * The cached value of the '{@link #getCTI1() <em>CTI1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTI1()
	 * @generated
	 * @ordered
	 */
	protected CTI1CONTENT cTI1;

	/**
	 * The cached value of the '{@link #getCTI2() <em>CTI2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTI2()
	 * @generated
	 * @ordered
	 */
	protected CTI2CONTENT cTI2;

	/**
	 * The cached value of the '{@link #getCTI3() <em>CTI3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTI3()
	 * @generated
	 * @ordered
	 */
	protected CTI3CONTENT cTI3;

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
	protected CTICONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCTICONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTI1CONTENT getCTI1() {
		return cTI1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTI1(CTI1CONTENT newCTI1, NotificationChain msgs) {
		CTI1CONTENT oldCTI1 = cTI1;
		cTI1 = newCTI1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI1, oldCTI1, newCTI1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTI1(CTI1CONTENT newCTI1) {
		if (newCTI1 != cTI1) {
			NotificationChain msgs = null;
			if (cTI1 != null)
				msgs = ((InternalEObject)cTI1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI1, null, msgs);
			if (newCTI1 != null)
				msgs = ((InternalEObject)newCTI1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI1, null, msgs);
			msgs = basicSetCTI1(newCTI1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI1, newCTI1, newCTI1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTI2CONTENT getCTI2() {
		return cTI2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTI2(CTI2CONTENT newCTI2, NotificationChain msgs) {
		CTI2CONTENT oldCTI2 = cTI2;
		cTI2 = newCTI2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI2, oldCTI2, newCTI2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTI2(CTI2CONTENT newCTI2) {
		if (newCTI2 != cTI2) {
			NotificationChain msgs = null;
			if (cTI2 != null)
				msgs = ((InternalEObject)cTI2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI2, null, msgs);
			if (newCTI2 != null)
				msgs = ((InternalEObject)newCTI2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI2, null, msgs);
			msgs = basicSetCTI2(newCTI2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI2, newCTI2, newCTI2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTI3CONTENT getCTI3() {
		return cTI3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTI3(CTI3CONTENT newCTI3, NotificationChain msgs) {
		CTI3CONTENT oldCTI3 = cTI3;
		cTI3 = newCTI3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI3, oldCTI3, newCTI3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTI3(CTI3CONTENT newCTI3) {
		if (newCTI3 != cTI3) {
			NotificationChain msgs = null;
			if (cTI3 != null)
				msgs = ((InternalEObject)cTI3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI3, null, msgs);
			if (newCTI3 != null)
				msgs = ((InternalEObject)newCTI3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTICONTENT__CTI3, null, msgs);
			msgs = basicSetCTI3(newCTI3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTICONTENT__CTI3, newCTI3, newCTI3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CTICONTENT__ANY);
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
			case V2xmlPackage.CTICONTENT__CTI1:
				return basicSetCTI1(null, msgs);
			case V2xmlPackage.CTICONTENT__CTI2:
				return basicSetCTI2(null, msgs);
			case V2xmlPackage.CTICONTENT__CTI3:
				return basicSetCTI3(null, msgs);
			case V2xmlPackage.CTICONTENT__ANY:
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
			case V2xmlPackage.CTICONTENT__CTI1:
				return getCTI1();
			case V2xmlPackage.CTICONTENT__CTI2:
				return getCTI2();
			case V2xmlPackage.CTICONTENT__CTI3:
				return getCTI3();
			case V2xmlPackage.CTICONTENT__ANY:
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
			case V2xmlPackage.CTICONTENT__CTI1:
				setCTI1((CTI1CONTENT)newValue);
				return;
			case V2xmlPackage.CTICONTENT__CTI2:
				setCTI2((CTI2CONTENT)newValue);
				return;
			case V2xmlPackage.CTICONTENT__CTI3:
				setCTI3((CTI3CONTENT)newValue);
				return;
			case V2xmlPackage.CTICONTENT__ANY:
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
			case V2xmlPackage.CTICONTENT__CTI1:
				setCTI1((CTI1CONTENT)null);
				return;
			case V2xmlPackage.CTICONTENT__CTI2:
				setCTI2((CTI2CONTENT)null);
				return;
			case V2xmlPackage.CTICONTENT__CTI3:
				setCTI3((CTI3CONTENT)null);
				return;
			case V2xmlPackage.CTICONTENT__ANY:
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
			case V2xmlPackage.CTICONTENT__CTI1:
				return cTI1 != null;
			case V2xmlPackage.CTICONTENT__CTI2:
				return cTI2 != null;
			case V2xmlPackage.CTICONTENT__CTI3:
				return cTI3 != null;
			case V2xmlPackage.CTICONTENT__ANY:
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

} //CTICONTENTImpl
