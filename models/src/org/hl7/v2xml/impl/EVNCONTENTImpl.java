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

import org.hl7.v2xml.EVN1CONTENT;
import org.hl7.v2xml.EVN2CONTENT;
import org.hl7.v2xml.EVN3CONTENT;
import org.hl7.v2xml.EVN4CONTENT;
import org.hl7.v2xml.EVN5CONTENT;
import org.hl7.v2xml.EVN6CONTENT;
import org.hl7.v2xml.EVN7CONTENT;
import org.hl7.v2xml.EVNCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EVNCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN1 <em>EVN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN2 <em>EVN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN3 <em>EVN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN4 <em>EVN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN5 <em>EVN5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN6 <em>EVN6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getEVN7 <em>EVN7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EVNCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EVNCONTENTImpl extends EObjectImpl implements EVNCONTENT {
	/**
	 * The cached value of the '{@link #getEVN1() <em>EVN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN1()
	 * @generated
	 * @ordered
	 */
	protected EVN1CONTENT eVN1;

	/**
	 * The cached value of the '{@link #getEVN2() <em>EVN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN2()
	 * @generated
	 * @ordered
	 */
	protected EVN2CONTENT eVN2;

	/**
	 * The cached value of the '{@link #getEVN3() <em>EVN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN3()
	 * @generated
	 * @ordered
	 */
	protected EVN3CONTENT eVN3;

	/**
	 * The cached value of the '{@link #getEVN4() <em>EVN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN4()
	 * @generated
	 * @ordered
	 */
	protected EVN4CONTENT eVN4;

	/**
	 * The cached value of the '{@link #getEVN5() <em>EVN5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN5()
	 * @generated
	 * @ordered
	 */
	protected EList<EVN5CONTENT> eVN5;

	/**
	 * The cached value of the '{@link #getEVN6() <em>EVN6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN6()
	 * @generated
	 * @ordered
	 */
	protected EVN6CONTENT eVN6;

	/**
	 * The cached value of the '{@link #getEVN7() <em>EVN7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEVN7()
	 * @generated
	 * @ordered
	 */
	protected EVN7CONTENT eVN7;

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
	protected EVNCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEVNCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN1CONTENT getEVN1() {
		return eVN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN1(EVN1CONTENT newEVN1, NotificationChain msgs) {
		EVN1CONTENT oldEVN1 = eVN1;
		eVN1 = newEVN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN1, oldEVN1, newEVN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN1(EVN1CONTENT newEVN1) {
		if (newEVN1 != eVN1) {
			NotificationChain msgs = null;
			if (eVN1 != null)
				msgs = ((InternalEObject)eVN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN1, null, msgs);
			if (newEVN1 != null)
				msgs = ((InternalEObject)newEVN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN1, null, msgs);
			msgs = basicSetEVN1(newEVN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN1, newEVN1, newEVN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN2CONTENT getEVN2() {
		return eVN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN2(EVN2CONTENT newEVN2, NotificationChain msgs) {
		EVN2CONTENT oldEVN2 = eVN2;
		eVN2 = newEVN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN2, oldEVN2, newEVN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN2(EVN2CONTENT newEVN2) {
		if (newEVN2 != eVN2) {
			NotificationChain msgs = null;
			if (eVN2 != null)
				msgs = ((InternalEObject)eVN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN2, null, msgs);
			if (newEVN2 != null)
				msgs = ((InternalEObject)newEVN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN2, null, msgs);
			msgs = basicSetEVN2(newEVN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN2, newEVN2, newEVN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN3CONTENT getEVN3() {
		return eVN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN3(EVN3CONTENT newEVN3, NotificationChain msgs) {
		EVN3CONTENT oldEVN3 = eVN3;
		eVN3 = newEVN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN3, oldEVN3, newEVN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN3(EVN3CONTENT newEVN3) {
		if (newEVN3 != eVN3) {
			NotificationChain msgs = null;
			if (eVN3 != null)
				msgs = ((InternalEObject)eVN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN3, null, msgs);
			if (newEVN3 != null)
				msgs = ((InternalEObject)newEVN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN3, null, msgs);
			msgs = basicSetEVN3(newEVN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN3, newEVN3, newEVN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN4CONTENT getEVN4() {
		return eVN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN4(EVN4CONTENT newEVN4, NotificationChain msgs) {
		EVN4CONTENT oldEVN4 = eVN4;
		eVN4 = newEVN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN4, oldEVN4, newEVN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN4(EVN4CONTENT newEVN4) {
		if (newEVN4 != eVN4) {
			NotificationChain msgs = null;
			if (eVN4 != null)
				msgs = ((InternalEObject)eVN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN4, null, msgs);
			if (newEVN4 != null)
				msgs = ((InternalEObject)newEVN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN4, null, msgs);
			msgs = basicSetEVN4(newEVN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN4, newEVN4, newEVN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EVN5CONTENT> getEVN5() {
		if (eVN5 == null) {
			eVN5 = new EObjectContainmentEList<EVN5CONTENT>(EVN5CONTENT.class, this, V2xmlPackage.EVNCONTENT__EVN5);
		}
		return eVN5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN6CONTENT getEVN6() {
		return eVN6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN6(EVN6CONTENT newEVN6, NotificationChain msgs) {
		EVN6CONTENT oldEVN6 = eVN6;
		eVN6 = newEVN6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN6, oldEVN6, newEVN6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN6(EVN6CONTENT newEVN6) {
		if (newEVN6 != eVN6) {
			NotificationChain msgs = null;
			if (eVN6 != null)
				msgs = ((InternalEObject)eVN6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN6, null, msgs);
			if (newEVN6 != null)
				msgs = ((InternalEObject)newEVN6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN6, null, msgs);
			msgs = basicSetEVN6(newEVN6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN6, newEVN6, newEVN6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVN7CONTENT getEVN7() {
		return eVN7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEVN7(EVN7CONTENT newEVN7, NotificationChain msgs) {
		EVN7CONTENT oldEVN7 = eVN7;
		eVN7 = newEVN7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN7, oldEVN7, newEVN7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEVN7(EVN7CONTENT newEVN7) {
		if (newEVN7 != eVN7) {
			NotificationChain msgs = null;
			if (eVN7 != null)
				msgs = ((InternalEObject)eVN7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN7, null, msgs);
			if (newEVN7 != null)
				msgs = ((InternalEObject)newEVN7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EVNCONTENT__EVN7, null, msgs);
			msgs = basicSetEVN7(newEVN7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EVNCONTENT__EVN7, newEVN7, newEVN7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.EVNCONTENT__ANY);
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
			case V2xmlPackage.EVNCONTENT__EVN1:
				return basicSetEVN1(null, msgs);
			case V2xmlPackage.EVNCONTENT__EVN2:
				return basicSetEVN2(null, msgs);
			case V2xmlPackage.EVNCONTENT__EVN3:
				return basicSetEVN3(null, msgs);
			case V2xmlPackage.EVNCONTENT__EVN4:
				return basicSetEVN4(null, msgs);
			case V2xmlPackage.EVNCONTENT__EVN5:
				return ((InternalEList<?>)getEVN5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.EVNCONTENT__EVN6:
				return basicSetEVN6(null, msgs);
			case V2xmlPackage.EVNCONTENT__EVN7:
				return basicSetEVN7(null, msgs);
			case V2xmlPackage.EVNCONTENT__ANY:
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
			case V2xmlPackage.EVNCONTENT__EVN1:
				return getEVN1();
			case V2xmlPackage.EVNCONTENT__EVN2:
				return getEVN2();
			case V2xmlPackage.EVNCONTENT__EVN3:
				return getEVN3();
			case V2xmlPackage.EVNCONTENT__EVN4:
				return getEVN4();
			case V2xmlPackage.EVNCONTENT__EVN5:
				return getEVN5();
			case V2xmlPackage.EVNCONTENT__EVN6:
				return getEVN6();
			case V2xmlPackage.EVNCONTENT__EVN7:
				return getEVN7();
			case V2xmlPackage.EVNCONTENT__ANY:
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
			case V2xmlPackage.EVNCONTENT__EVN1:
				setEVN1((EVN1CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN2:
				setEVN2((EVN2CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN3:
				setEVN3((EVN3CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN4:
				setEVN4((EVN4CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN5:
				getEVN5().clear();
				getEVN5().addAll((Collection<? extends EVN5CONTENT>)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN6:
				setEVN6((EVN6CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__EVN7:
				setEVN7((EVN7CONTENT)newValue);
				return;
			case V2xmlPackage.EVNCONTENT__ANY:
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
			case V2xmlPackage.EVNCONTENT__EVN1:
				setEVN1((EVN1CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__EVN2:
				setEVN2((EVN2CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__EVN3:
				setEVN3((EVN3CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__EVN4:
				setEVN4((EVN4CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__EVN5:
				getEVN5().clear();
				return;
			case V2xmlPackage.EVNCONTENT__EVN6:
				setEVN6((EVN6CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__EVN7:
				setEVN7((EVN7CONTENT)null);
				return;
			case V2xmlPackage.EVNCONTENT__ANY:
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
			case V2xmlPackage.EVNCONTENT__EVN1:
				return eVN1 != null;
			case V2xmlPackage.EVNCONTENT__EVN2:
				return eVN2 != null;
			case V2xmlPackage.EVNCONTENT__EVN3:
				return eVN3 != null;
			case V2xmlPackage.EVNCONTENT__EVN4:
				return eVN4 != null;
			case V2xmlPackage.EVNCONTENT__EVN5:
				return eVN5 != null && !eVN5.isEmpty();
			case V2xmlPackage.EVNCONTENT__EVN6:
				return eVN6 != null;
			case V2xmlPackage.EVNCONTENT__EVN7:
				return eVN7 != null;
			case V2xmlPackage.EVNCONTENT__ANY:
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

} //EVNCONTENTImpl
