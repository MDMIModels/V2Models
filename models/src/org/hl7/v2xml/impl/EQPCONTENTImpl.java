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

import org.hl7.v2xml.EQP1CONTENT;
import org.hl7.v2xml.EQP2CONTENT;
import org.hl7.v2xml.EQP3CONTENT;
import org.hl7.v2xml.EQP4CONTENT;
import org.hl7.v2xml.EQP5CONTENT;
import org.hl7.v2xml.EQPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EQPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getEQP1 <em>EQP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getEQP2 <em>EQP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getEQP3 <em>EQP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getEQP4 <em>EQP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getEQP5 <em>EQP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EQPCONTENTImpl extends EObjectImpl implements EQPCONTENT {
	/**
	 * The cached value of the '{@link #getEQP1() <em>EQP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP1()
	 * @generated
	 * @ordered
	 */
	protected EQP1CONTENT eQP1;

	/**
	 * The cached value of the '{@link #getEQP2() <em>EQP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP2()
	 * @generated
	 * @ordered
	 */
	protected EQP2CONTENT eQP2;

	/**
	 * The cached value of the '{@link #getEQP3() <em>EQP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP3()
	 * @generated
	 * @ordered
	 */
	protected EQP3CONTENT eQP3;

	/**
	 * The cached value of the '{@link #getEQP4() <em>EQP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP4()
	 * @generated
	 * @ordered
	 */
	protected EQP4CONTENT eQP4;

	/**
	 * The cached value of the '{@link #getEQP5() <em>EQP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQP5()
	 * @generated
	 * @ordered
	 */
	protected EQP5CONTENT eQP5;

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
	protected EQPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEQPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQP1CONTENT getEQP1() {
		return eQP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQP1(EQP1CONTENT newEQP1, NotificationChain msgs) {
		EQP1CONTENT oldEQP1 = eQP1;
		eQP1 = newEQP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP1, oldEQP1, newEQP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQP1(EQP1CONTENT newEQP1) {
		if (newEQP1 != eQP1) {
			NotificationChain msgs = null;
			if (eQP1 != null)
				msgs = ((InternalEObject)eQP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP1, null, msgs);
			if (newEQP1 != null)
				msgs = ((InternalEObject)newEQP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP1, null, msgs);
			msgs = basicSetEQP1(newEQP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP1, newEQP1, newEQP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQP2CONTENT getEQP2() {
		return eQP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQP2(EQP2CONTENT newEQP2, NotificationChain msgs) {
		EQP2CONTENT oldEQP2 = eQP2;
		eQP2 = newEQP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP2, oldEQP2, newEQP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQP2(EQP2CONTENT newEQP2) {
		if (newEQP2 != eQP2) {
			NotificationChain msgs = null;
			if (eQP2 != null)
				msgs = ((InternalEObject)eQP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP2, null, msgs);
			if (newEQP2 != null)
				msgs = ((InternalEObject)newEQP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP2, null, msgs);
			msgs = basicSetEQP2(newEQP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP2, newEQP2, newEQP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQP3CONTENT getEQP3() {
		return eQP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQP3(EQP3CONTENT newEQP3, NotificationChain msgs) {
		EQP3CONTENT oldEQP3 = eQP3;
		eQP3 = newEQP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP3, oldEQP3, newEQP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQP3(EQP3CONTENT newEQP3) {
		if (newEQP3 != eQP3) {
			NotificationChain msgs = null;
			if (eQP3 != null)
				msgs = ((InternalEObject)eQP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP3, null, msgs);
			if (newEQP3 != null)
				msgs = ((InternalEObject)newEQP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP3, null, msgs);
			msgs = basicSetEQP3(newEQP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP3, newEQP3, newEQP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQP4CONTENT getEQP4() {
		return eQP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQP4(EQP4CONTENT newEQP4, NotificationChain msgs) {
		EQP4CONTENT oldEQP4 = eQP4;
		eQP4 = newEQP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP4, oldEQP4, newEQP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQP4(EQP4CONTENT newEQP4) {
		if (newEQP4 != eQP4) {
			NotificationChain msgs = null;
			if (eQP4 != null)
				msgs = ((InternalEObject)eQP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP4, null, msgs);
			if (newEQP4 != null)
				msgs = ((InternalEObject)newEQP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP4, null, msgs);
			msgs = basicSetEQP4(newEQP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP4, newEQP4, newEQP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQP5CONTENT getEQP5() {
		return eQP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQP5(EQP5CONTENT newEQP5, NotificationChain msgs) {
		EQP5CONTENT oldEQP5 = eQP5;
		eQP5 = newEQP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP5, oldEQP5, newEQP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQP5(EQP5CONTENT newEQP5) {
		if (newEQP5 != eQP5) {
			NotificationChain msgs = null;
			if (eQP5 != null)
				msgs = ((InternalEObject)eQP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP5, null, msgs);
			if (newEQP5 != null)
				msgs = ((InternalEObject)newEQP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQPCONTENT__EQP5, null, msgs);
			msgs = basicSetEQP5(newEQP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQPCONTENT__EQP5, newEQP5, newEQP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.EQPCONTENT__ANY);
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
			case V2xmlPackage.EQPCONTENT__EQP1:
				return basicSetEQP1(null, msgs);
			case V2xmlPackage.EQPCONTENT__EQP2:
				return basicSetEQP2(null, msgs);
			case V2xmlPackage.EQPCONTENT__EQP3:
				return basicSetEQP3(null, msgs);
			case V2xmlPackage.EQPCONTENT__EQP4:
				return basicSetEQP4(null, msgs);
			case V2xmlPackage.EQPCONTENT__EQP5:
				return basicSetEQP5(null, msgs);
			case V2xmlPackage.EQPCONTENT__ANY:
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
			case V2xmlPackage.EQPCONTENT__EQP1:
				return getEQP1();
			case V2xmlPackage.EQPCONTENT__EQP2:
				return getEQP2();
			case V2xmlPackage.EQPCONTENT__EQP3:
				return getEQP3();
			case V2xmlPackage.EQPCONTENT__EQP4:
				return getEQP4();
			case V2xmlPackage.EQPCONTENT__EQP5:
				return getEQP5();
			case V2xmlPackage.EQPCONTENT__ANY:
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
			case V2xmlPackage.EQPCONTENT__EQP1:
				setEQP1((EQP1CONTENT)newValue);
				return;
			case V2xmlPackage.EQPCONTENT__EQP2:
				setEQP2((EQP2CONTENT)newValue);
				return;
			case V2xmlPackage.EQPCONTENT__EQP3:
				setEQP3((EQP3CONTENT)newValue);
				return;
			case V2xmlPackage.EQPCONTENT__EQP4:
				setEQP4((EQP4CONTENT)newValue);
				return;
			case V2xmlPackage.EQPCONTENT__EQP5:
				setEQP5((EQP5CONTENT)newValue);
				return;
			case V2xmlPackage.EQPCONTENT__ANY:
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
			case V2xmlPackage.EQPCONTENT__EQP1:
				setEQP1((EQP1CONTENT)null);
				return;
			case V2xmlPackage.EQPCONTENT__EQP2:
				setEQP2((EQP2CONTENT)null);
				return;
			case V2xmlPackage.EQPCONTENT__EQP3:
				setEQP3((EQP3CONTENT)null);
				return;
			case V2xmlPackage.EQPCONTENT__EQP4:
				setEQP4((EQP4CONTENT)null);
				return;
			case V2xmlPackage.EQPCONTENT__EQP5:
				setEQP5((EQP5CONTENT)null);
				return;
			case V2xmlPackage.EQPCONTENT__ANY:
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
			case V2xmlPackage.EQPCONTENT__EQP1:
				return eQP1 != null;
			case V2xmlPackage.EQPCONTENT__EQP2:
				return eQP2 != null;
			case V2xmlPackage.EQPCONTENT__EQP3:
				return eQP3 != null;
			case V2xmlPackage.EQPCONTENT__EQP4:
				return eQP4 != null;
			case V2xmlPackage.EQPCONTENT__EQP5:
				return eQP5 != null;
			case V2xmlPackage.EQPCONTENT__ANY:
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

} //EQPCONTENTImpl
