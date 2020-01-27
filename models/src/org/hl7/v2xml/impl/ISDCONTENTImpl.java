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

import org.hl7.v2xml.ISD1CONTENT;
import org.hl7.v2xml.ISD2CONTENT;
import org.hl7.v2xml.ISD3CONTENT;
import org.hl7.v2xml.ISDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ISDCONTENTImpl#getISD1 <em>ISD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ISDCONTENTImpl#getISD2 <em>ISD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ISDCONTENTImpl#getISD3 <em>ISD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ISDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISDCONTENTImpl extends EObjectImpl implements ISDCONTENT {
	/**
	 * The cached value of the '{@link #getISD1() <em>ISD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISD1()
	 * @generated
	 * @ordered
	 */
	protected ISD1CONTENT iSD1;

	/**
	 * The cached value of the '{@link #getISD2() <em>ISD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISD2()
	 * @generated
	 * @ordered
	 */
	protected ISD2CONTENT iSD2;

	/**
	 * The cached value of the '{@link #getISD3() <em>ISD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getISD3()
	 * @generated
	 * @ordered
	 */
	protected ISD3CONTENT iSD3;

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
	protected ISDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getISDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISD1CONTENT getISD1() {
		return iSD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISD1(ISD1CONTENT newISD1, NotificationChain msgs) {
		ISD1CONTENT oldISD1 = iSD1;
		iSD1 = newISD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD1, oldISD1, newISD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISD1(ISD1CONTENT newISD1) {
		if (newISD1 != iSD1) {
			NotificationChain msgs = null;
			if (iSD1 != null)
				msgs = ((InternalEObject)iSD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD1, null, msgs);
			if (newISD1 != null)
				msgs = ((InternalEObject)newISD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD1, null, msgs);
			msgs = basicSetISD1(newISD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD1, newISD1, newISD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISD2CONTENT getISD2() {
		return iSD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISD2(ISD2CONTENT newISD2, NotificationChain msgs) {
		ISD2CONTENT oldISD2 = iSD2;
		iSD2 = newISD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD2, oldISD2, newISD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISD2(ISD2CONTENT newISD2) {
		if (newISD2 != iSD2) {
			NotificationChain msgs = null;
			if (iSD2 != null)
				msgs = ((InternalEObject)iSD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD2, null, msgs);
			if (newISD2 != null)
				msgs = ((InternalEObject)newISD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD2, null, msgs);
			msgs = basicSetISD2(newISD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD2, newISD2, newISD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISD3CONTENT getISD3() {
		return iSD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetISD3(ISD3CONTENT newISD3, NotificationChain msgs) {
		ISD3CONTENT oldISD3 = iSD3;
		iSD3 = newISD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD3, oldISD3, newISD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISD3(ISD3CONTENT newISD3) {
		if (newISD3 != iSD3) {
			NotificationChain msgs = null;
			if (iSD3 != null)
				msgs = ((InternalEObject)iSD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD3, null, msgs);
			if (newISD3 != null)
				msgs = ((InternalEObject)newISD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ISDCONTENT__ISD3, null, msgs);
			msgs = basicSetISD3(newISD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ISDCONTENT__ISD3, newISD3, newISD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ISDCONTENT__ANY);
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
			case V2xmlPackage.ISDCONTENT__ISD1:
				return basicSetISD1(null, msgs);
			case V2xmlPackage.ISDCONTENT__ISD2:
				return basicSetISD2(null, msgs);
			case V2xmlPackage.ISDCONTENT__ISD3:
				return basicSetISD3(null, msgs);
			case V2xmlPackage.ISDCONTENT__ANY:
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
			case V2xmlPackage.ISDCONTENT__ISD1:
				return getISD1();
			case V2xmlPackage.ISDCONTENT__ISD2:
				return getISD2();
			case V2xmlPackage.ISDCONTENT__ISD3:
				return getISD3();
			case V2xmlPackage.ISDCONTENT__ANY:
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
			case V2xmlPackage.ISDCONTENT__ISD1:
				setISD1((ISD1CONTENT)newValue);
				return;
			case V2xmlPackage.ISDCONTENT__ISD2:
				setISD2((ISD2CONTENT)newValue);
				return;
			case V2xmlPackage.ISDCONTENT__ISD3:
				setISD3((ISD3CONTENT)newValue);
				return;
			case V2xmlPackage.ISDCONTENT__ANY:
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
			case V2xmlPackage.ISDCONTENT__ISD1:
				setISD1((ISD1CONTENT)null);
				return;
			case V2xmlPackage.ISDCONTENT__ISD2:
				setISD2((ISD2CONTENT)null);
				return;
			case V2xmlPackage.ISDCONTENT__ISD3:
				setISD3((ISD3CONTENT)null);
				return;
			case V2xmlPackage.ISDCONTENT__ANY:
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
			case V2xmlPackage.ISDCONTENT__ISD1:
				return iSD1 != null;
			case V2xmlPackage.ISDCONTENT__ISD2:
				return iSD2 != null;
			case V2xmlPackage.ISDCONTENT__ISD3:
				return iSD3 != null;
			case V2xmlPackage.ISDCONTENT__ANY:
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

} //ISDCONTENTImpl
