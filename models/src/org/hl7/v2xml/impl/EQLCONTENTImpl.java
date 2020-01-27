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

import org.hl7.v2xml.EQL1CONTENT;
import org.hl7.v2xml.EQL2CONTENT;
import org.hl7.v2xml.EQL3CONTENT;
import org.hl7.v2xml.EQL4CONTENT;
import org.hl7.v2xml.EQLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EQLCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EQLCONTENTImpl#getEQL1 <em>EQL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQLCONTENTImpl#getEQL2 <em>EQL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQLCONTENTImpl#getEQL3 <em>EQL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQLCONTENTImpl#getEQL4 <em>EQL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EQLCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EQLCONTENTImpl extends EObjectImpl implements EQLCONTENT {
	/**
	 * The cached value of the '{@link #getEQL1() <em>EQL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQL1()
	 * @generated
	 * @ordered
	 */
	protected EQL1CONTENT eQL1;

	/**
	 * The cached value of the '{@link #getEQL2() <em>EQL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQL2()
	 * @generated
	 * @ordered
	 */
	protected EQL2CONTENT eQL2;

	/**
	 * The cached value of the '{@link #getEQL3() <em>EQL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQL3()
	 * @generated
	 * @ordered
	 */
	protected EQL3CONTENT eQL3;

	/**
	 * The cached value of the '{@link #getEQL4() <em>EQL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEQL4()
	 * @generated
	 * @ordered
	 */
	protected EQL4CONTENT eQL4;

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
	protected EQLCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEQLCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQL1CONTENT getEQL1() {
		return eQL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQL1(EQL1CONTENT newEQL1, NotificationChain msgs) {
		EQL1CONTENT oldEQL1 = eQL1;
		eQL1 = newEQL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL1, oldEQL1, newEQL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQL1(EQL1CONTENT newEQL1) {
		if (newEQL1 != eQL1) {
			NotificationChain msgs = null;
			if (eQL1 != null)
				msgs = ((InternalEObject)eQL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL1, null, msgs);
			if (newEQL1 != null)
				msgs = ((InternalEObject)newEQL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL1, null, msgs);
			msgs = basicSetEQL1(newEQL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL1, newEQL1, newEQL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQL2CONTENT getEQL2() {
		return eQL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQL2(EQL2CONTENT newEQL2, NotificationChain msgs) {
		EQL2CONTENT oldEQL2 = eQL2;
		eQL2 = newEQL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL2, oldEQL2, newEQL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQL2(EQL2CONTENT newEQL2) {
		if (newEQL2 != eQL2) {
			NotificationChain msgs = null;
			if (eQL2 != null)
				msgs = ((InternalEObject)eQL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL2, null, msgs);
			if (newEQL2 != null)
				msgs = ((InternalEObject)newEQL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL2, null, msgs);
			msgs = basicSetEQL2(newEQL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL2, newEQL2, newEQL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQL3CONTENT getEQL3() {
		return eQL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQL3(EQL3CONTENT newEQL3, NotificationChain msgs) {
		EQL3CONTENT oldEQL3 = eQL3;
		eQL3 = newEQL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL3, oldEQL3, newEQL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQL3(EQL3CONTENT newEQL3) {
		if (newEQL3 != eQL3) {
			NotificationChain msgs = null;
			if (eQL3 != null)
				msgs = ((InternalEObject)eQL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL3, null, msgs);
			if (newEQL3 != null)
				msgs = ((InternalEObject)newEQL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL3, null, msgs);
			msgs = basicSetEQL3(newEQL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL3, newEQL3, newEQL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQL4CONTENT getEQL4() {
		return eQL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEQL4(EQL4CONTENT newEQL4, NotificationChain msgs) {
		EQL4CONTENT oldEQL4 = eQL4;
		eQL4 = newEQL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL4, oldEQL4, newEQL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEQL4(EQL4CONTENT newEQL4) {
		if (newEQL4 != eQL4) {
			NotificationChain msgs = null;
			if (eQL4 != null)
				msgs = ((InternalEObject)eQL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL4, null, msgs);
			if (newEQL4 != null)
				msgs = ((InternalEObject)newEQL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.EQLCONTENT__EQL4, null, msgs);
			msgs = basicSetEQL4(newEQL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.EQLCONTENT__EQL4, newEQL4, newEQL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.EQLCONTENT__ANY);
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
			case V2xmlPackage.EQLCONTENT__EQL1:
				return basicSetEQL1(null, msgs);
			case V2xmlPackage.EQLCONTENT__EQL2:
				return basicSetEQL2(null, msgs);
			case V2xmlPackage.EQLCONTENT__EQL3:
				return basicSetEQL3(null, msgs);
			case V2xmlPackage.EQLCONTENT__EQL4:
				return basicSetEQL4(null, msgs);
			case V2xmlPackage.EQLCONTENT__ANY:
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
			case V2xmlPackage.EQLCONTENT__EQL1:
				return getEQL1();
			case V2xmlPackage.EQLCONTENT__EQL2:
				return getEQL2();
			case V2xmlPackage.EQLCONTENT__EQL3:
				return getEQL3();
			case V2xmlPackage.EQLCONTENT__EQL4:
				return getEQL4();
			case V2xmlPackage.EQLCONTENT__ANY:
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
			case V2xmlPackage.EQLCONTENT__EQL1:
				setEQL1((EQL1CONTENT)newValue);
				return;
			case V2xmlPackage.EQLCONTENT__EQL2:
				setEQL2((EQL2CONTENT)newValue);
				return;
			case V2xmlPackage.EQLCONTENT__EQL3:
				setEQL3((EQL3CONTENT)newValue);
				return;
			case V2xmlPackage.EQLCONTENT__EQL4:
				setEQL4((EQL4CONTENT)newValue);
				return;
			case V2xmlPackage.EQLCONTENT__ANY:
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
			case V2xmlPackage.EQLCONTENT__EQL1:
				setEQL1((EQL1CONTENT)null);
				return;
			case V2xmlPackage.EQLCONTENT__EQL2:
				setEQL2((EQL2CONTENT)null);
				return;
			case V2xmlPackage.EQLCONTENT__EQL3:
				setEQL3((EQL3CONTENT)null);
				return;
			case V2xmlPackage.EQLCONTENT__EQL4:
				setEQL4((EQL4CONTENT)null);
				return;
			case V2xmlPackage.EQLCONTENT__ANY:
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
			case V2xmlPackage.EQLCONTENT__EQL1:
				return eQL1 != null;
			case V2xmlPackage.EQLCONTENT__EQL2:
				return eQL2 != null;
			case V2xmlPackage.EQLCONTENT__EQL3:
				return eQL3 != null;
			case V2xmlPackage.EQLCONTENT__EQL4:
				return eQL4 != null;
			case V2xmlPackage.EQLCONTENT__ANY:
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

} //EQLCONTENTImpl
