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

import org.hl7.v2xml.EQU1CONTENT;
import org.hl7.v2xml.EQU2CONTENT;
import org.hl7.v2xml.EQU3CONTENT;
import org.hl7.v2xml.EQU4CONTENT;
import org.hl7.v2xml.EQU5CONTENT;
import org.hl7.v2xml.EQUCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EQUCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getEQU1 <em>EQU1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getEQU2 <em>EQU2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getEQU3 <em>EQU3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getEQU4 <em>EQU4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getEQU5 <em>EQU5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQUCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EQUCONTENTImpl extends EObjectImpl implements EQUCONTENT {
	/**
	 * The cached value of the '{@link #getEQU1() <em>EQU1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU1()
	 * @generated
	 * @ordered
	 */
	protected EQU1CONTENT eQU1;

	/**
	 * The cached value of the '{@link #getEQU2() <em>EQU2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU2()
	 * @generated
	 * @ordered
	 */
	protected EQU2CONTENT eQU2;

	/**
	 * The cached value of the '{@link #getEQU3() <em>EQU3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU3()
	 * @generated
	 * @ordered
	 */
	protected EQU3CONTENT eQU3;

	/**
	 * The cached value of the '{@link #getEQU4() <em>EQU4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU4()
	 * @generated
	 * @ordered
	 */
	protected EQU4CONTENT eQU4;

	/**
	 * The cached value of the '{@link #getEQU5() <em>EQU5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQU5()
	 * @generated
	 * @ordered
	 */
	protected EQU5CONTENT eQU5;

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
	protected EQUCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEQUCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQU1CONTENT getEQU1() {
		return eQU1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQU1(EQU1CONTENT newEQU1, NotificationChain msgs) {
		EQU1CONTENT oldEQU1 = eQU1;
		eQU1 = newEQU1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU1, oldEQU1, newEQU1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQU1(EQU1CONTENT newEQU1) {
		if (newEQU1 != eQU1) {
			NotificationChain msgs = null;
			if (eQU1 != null)
				msgs = ((InternalEObject)eQU1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU1, null, msgs);
			if (newEQU1 != null)
				msgs = ((InternalEObject)newEQU1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU1, null, msgs);
			msgs = basicSetEQU1(newEQU1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU1, newEQU1, newEQU1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQU2CONTENT getEQU2() {
		return eQU2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQU2(EQU2CONTENT newEQU2, NotificationChain msgs) {
		EQU2CONTENT oldEQU2 = eQU2;
		eQU2 = newEQU2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU2, oldEQU2, newEQU2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQU2(EQU2CONTENT newEQU2) {
		if (newEQU2 != eQU2) {
			NotificationChain msgs = null;
			if (eQU2 != null)
				msgs = ((InternalEObject)eQU2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU2, null, msgs);
			if (newEQU2 != null)
				msgs = ((InternalEObject)newEQU2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU2, null, msgs);
			msgs = basicSetEQU2(newEQU2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU2, newEQU2, newEQU2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQU3CONTENT getEQU3() {
		return eQU3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQU3(EQU3CONTENT newEQU3, NotificationChain msgs) {
		EQU3CONTENT oldEQU3 = eQU3;
		eQU3 = newEQU3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU3, oldEQU3, newEQU3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQU3(EQU3CONTENT newEQU3) {
		if (newEQU3 != eQU3) {
			NotificationChain msgs = null;
			if (eQU3 != null)
				msgs = ((InternalEObject)eQU3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU3, null, msgs);
			if (newEQU3 != null)
				msgs = ((InternalEObject)newEQU3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU3, null, msgs);
			msgs = basicSetEQU3(newEQU3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU3, newEQU3, newEQU3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQU4CONTENT getEQU4() {
		return eQU4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQU4(EQU4CONTENT newEQU4, NotificationChain msgs) {
		EQU4CONTENT oldEQU4 = eQU4;
		eQU4 = newEQU4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU4, oldEQU4, newEQU4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQU4(EQU4CONTENT newEQU4) {
		if (newEQU4 != eQU4) {
			NotificationChain msgs = null;
			if (eQU4 != null)
				msgs = ((InternalEObject)eQU4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU4, null, msgs);
			if (newEQU4 != null)
				msgs = ((InternalEObject)newEQU4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU4, null, msgs);
			msgs = basicSetEQU4(newEQU4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU4, newEQU4, newEQU4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQU5CONTENT getEQU5() {
		return eQU5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQU5(EQU5CONTENT newEQU5, NotificationChain msgs) {
		EQU5CONTENT oldEQU5 = eQU5;
		eQU5 = newEQU5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU5, oldEQU5, newEQU5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQU5(EQU5CONTENT newEQU5) {
		if (newEQU5 != eQU5) {
			NotificationChain msgs = null;
			if (eQU5 != null)
				msgs = ((InternalEObject)eQU5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU5, null, msgs);
			if (newEQU5 != null)
				msgs = ((InternalEObject)newEQU5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQUCONTENT__EQU5, null, msgs);
			msgs = basicSetEQU5(newEQU5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQUCONTENT__EQU5, newEQU5, newEQU5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.EQUCONTENT__ANY);
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
			case V2xmlPackage.EQUCONTENT__EQU1:
				return basicSetEQU1(null, msgs);
			case V2xmlPackage.EQUCONTENT__EQU2:
				return basicSetEQU2(null, msgs);
			case V2xmlPackage.EQUCONTENT__EQU3:
				return basicSetEQU3(null, msgs);
			case V2xmlPackage.EQUCONTENT__EQU4:
				return basicSetEQU4(null, msgs);
			case V2xmlPackage.EQUCONTENT__EQU5:
				return basicSetEQU5(null, msgs);
			case V2xmlPackage.EQUCONTENT__ANY:
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
			case V2xmlPackage.EQUCONTENT__EQU1:
				return getEQU1();
			case V2xmlPackage.EQUCONTENT__EQU2:
				return getEQU2();
			case V2xmlPackage.EQUCONTENT__EQU3:
				return getEQU3();
			case V2xmlPackage.EQUCONTENT__EQU4:
				return getEQU4();
			case V2xmlPackage.EQUCONTENT__EQU5:
				return getEQU5();
			case V2xmlPackage.EQUCONTENT__ANY:
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
			case V2xmlPackage.EQUCONTENT__EQU1:
				setEQU1((EQU1CONTENT)newValue);
				return;
			case V2xmlPackage.EQUCONTENT__EQU2:
				setEQU2((EQU2CONTENT)newValue);
				return;
			case V2xmlPackage.EQUCONTENT__EQU3:
				setEQU3((EQU3CONTENT)newValue);
				return;
			case V2xmlPackage.EQUCONTENT__EQU4:
				setEQU4((EQU4CONTENT)newValue);
				return;
			case V2xmlPackage.EQUCONTENT__EQU5:
				setEQU5((EQU5CONTENT)newValue);
				return;
			case V2xmlPackage.EQUCONTENT__ANY:
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
			case V2xmlPackage.EQUCONTENT__EQU1:
				setEQU1((EQU1CONTENT)null);
				return;
			case V2xmlPackage.EQUCONTENT__EQU2:
				setEQU2((EQU2CONTENT)null);
				return;
			case V2xmlPackage.EQUCONTENT__EQU3:
				setEQU3((EQU3CONTENT)null);
				return;
			case V2xmlPackage.EQUCONTENT__EQU4:
				setEQU4((EQU4CONTENT)null);
				return;
			case V2xmlPackage.EQUCONTENT__EQU5:
				setEQU5((EQU5CONTENT)null);
				return;
			case V2xmlPackage.EQUCONTENT__ANY:
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
			case V2xmlPackage.EQUCONTENT__EQU1:
				return eQU1 != null;
			case V2xmlPackage.EQUCONTENT__EQU2:
				return eQU2 != null;
			case V2xmlPackage.EQUCONTENT__EQU3:
				return eQU3 != null;
			case V2xmlPackage.EQUCONTENT__EQU4:
				return eQU4 != null;
			case V2xmlPackage.EQUCONTENT__EQU5:
				return eQU5 != null;
			case V2xmlPackage.EQUCONTENT__ANY:
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

} //EQUCONTENTImpl
