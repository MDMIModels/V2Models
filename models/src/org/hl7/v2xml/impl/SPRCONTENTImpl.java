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

import org.hl7.v2xml.SPR1CONTENT;
import org.hl7.v2xml.SPR2CONTENT;
import org.hl7.v2xml.SPR3CONTENT;
import org.hl7.v2xml.SPR4CONTENT;
import org.hl7.v2xml.SPRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SPRCONTENTImpl#getSPR1 <em>SPR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPRCONTENTImpl#getSPR2 <em>SPR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPRCONTENTImpl#getSPR3 <em>SPR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPRCONTENTImpl#getSPR4 <em>SPR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPRCONTENTImpl extends EObjectImpl implements SPRCONTENT {
	/**
	 * The cached value of the '{@link #getSPR1() <em>SPR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPR1()
	 * @generated
	 * @ordered
	 */
	protected SPR1CONTENT sPR1;

	/**
	 * The cached value of the '{@link #getSPR2() <em>SPR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPR2()
	 * @generated
	 * @ordered
	 */
	protected SPR2CONTENT sPR2;

	/**
	 * The cached value of the '{@link #getSPR3() <em>SPR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPR3()
	 * @generated
	 * @ordered
	 */
	protected SPR3CONTENT sPR3;

	/**
	 * The cached value of the '{@link #getSPR4() <em>SPR4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPR4()
	 * @generated
	 * @ordered
	 */
	protected EList<SPR4CONTENT> sPR4;

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
	protected SPRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSPRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPR1CONTENT getSPR1() {
		return sPR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPR1(SPR1CONTENT newSPR1, NotificationChain msgs) {
		SPR1CONTENT oldSPR1 = sPR1;
		sPR1 = newSPR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR1, oldSPR1, newSPR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPR1(SPR1CONTENT newSPR1) {
		if (newSPR1 != sPR1) {
			NotificationChain msgs = null;
			if (sPR1 != null)
				msgs = ((InternalEObject)sPR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR1, null, msgs);
			if (newSPR1 != null)
				msgs = ((InternalEObject)newSPR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR1, null, msgs);
			msgs = basicSetSPR1(newSPR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR1, newSPR1, newSPR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPR2CONTENT getSPR2() {
		return sPR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPR2(SPR2CONTENT newSPR2, NotificationChain msgs) {
		SPR2CONTENT oldSPR2 = sPR2;
		sPR2 = newSPR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR2, oldSPR2, newSPR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPR2(SPR2CONTENT newSPR2) {
		if (newSPR2 != sPR2) {
			NotificationChain msgs = null;
			if (sPR2 != null)
				msgs = ((InternalEObject)sPR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR2, null, msgs);
			if (newSPR2 != null)
				msgs = ((InternalEObject)newSPR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR2, null, msgs);
			msgs = basicSetSPR2(newSPR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR2, newSPR2, newSPR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPR3CONTENT getSPR3() {
		return sPR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPR3(SPR3CONTENT newSPR3, NotificationChain msgs) {
		SPR3CONTENT oldSPR3 = sPR3;
		sPR3 = newSPR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR3, oldSPR3, newSPR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPR3(SPR3CONTENT newSPR3) {
		if (newSPR3 != sPR3) {
			NotificationChain msgs = null;
			if (sPR3 != null)
				msgs = ((InternalEObject)sPR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR3, null, msgs);
			if (newSPR3 != null)
				msgs = ((InternalEObject)newSPR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPRCONTENT__SPR3, null, msgs);
			msgs = basicSetSPR3(newSPR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPRCONTENT__SPR3, newSPR3, newSPR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPR4CONTENT> getSPR4() {
		if (sPR4 == null) {
			sPR4 = new EObjectContainmentEList<SPR4CONTENT>(SPR4CONTENT.class, this, V2xmlPackage.SPRCONTENT__SPR4);
		}
		return sPR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SPRCONTENT__ANY);
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
			case V2xmlPackage.SPRCONTENT__SPR1:
				return basicSetSPR1(null, msgs);
			case V2xmlPackage.SPRCONTENT__SPR2:
				return basicSetSPR2(null, msgs);
			case V2xmlPackage.SPRCONTENT__SPR3:
				return basicSetSPR3(null, msgs);
			case V2xmlPackage.SPRCONTENT__SPR4:
				return ((InternalEList<?>)getSPR4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPRCONTENT__ANY:
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
			case V2xmlPackage.SPRCONTENT__SPR1:
				return getSPR1();
			case V2xmlPackage.SPRCONTENT__SPR2:
				return getSPR2();
			case V2xmlPackage.SPRCONTENT__SPR3:
				return getSPR3();
			case V2xmlPackage.SPRCONTENT__SPR4:
				return getSPR4();
			case V2xmlPackage.SPRCONTENT__ANY:
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
			case V2xmlPackage.SPRCONTENT__SPR1:
				setSPR1((SPR1CONTENT)newValue);
				return;
			case V2xmlPackage.SPRCONTENT__SPR2:
				setSPR2((SPR2CONTENT)newValue);
				return;
			case V2xmlPackage.SPRCONTENT__SPR3:
				setSPR3((SPR3CONTENT)newValue);
				return;
			case V2xmlPackage.SPRCONTENT__SPR4:
				getSPR4().clear();
				getSPR4().addAll((Collection<? extends SPR4CONTENT>)newValue);
				return;
			case V2xmlPackage.SPRCONTENT__ANY:
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
			case V2xmlPackage.SPRCONTENT__SPR1:
				setSPR1((SPR1CONTENT)null);
				return;
			case V2xmlPackage.SPRCONTENT__SPR2:
				setSPR2((SPR2CONTENT)null);
				return;
			case V2xmlPackage.SPRCONTENT__SPR3:
				setSPR3((SPR3CONTENT)null);
				return;
			case V2xmlPackage.SPRCONTENT__SPR4:
				getSPR4().clear();
				return;
			case V2xmlPackage.SPRCONTENT__ANY:
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
			case V2xmlPackage.SPRCONTENT__SPR1:
				return sPR1 != null;
			case V2xmlPackage.SPRCONTENT__SPR2:
				return sPR2 != null;
			case V2xmlPackage.SPRCONTENT__SPR3:
				return sPR3 != null;
			case V2xmlPackage.SPRCONTENT__SPR4:
				return sPR4 != null && !sPR4.isEmpty();
			case V2xmlPackage.SPRCONTENT__ANY:
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

} //SPRCONTENTImpl
