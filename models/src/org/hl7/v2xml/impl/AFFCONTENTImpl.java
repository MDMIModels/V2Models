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

import org.hl7.v2xml.AFF1CONTENT;
import org.hl7.v2xml.AFF2CONTENT;
import org.hl7.v2xml.AFF3CONTENT;
import org.hl7.v2xml.AFF4CONTENT;
import org.hl7.v2xml.AFF5CONTENT;
import org.hl7.v2xml.AFFCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AFFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAFF1 <em>AFF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAFF2 <em>AFF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAFF3 <em>AFF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAFF4 <em>AFF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAFF5 <em>AFF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AFFCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AFFCONTENTImpl extends EObjectImpl implements AFFCONTENT {
	/**
	 * The cached value of the '{@link #getAFF1() <em>AFF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF1()
	 * @generated
	 * @ordered
	 */
	protected AFF1CONTENT aFF1;

	/**
	 * The cached value of the '{@link #getAFF2() <em>AFF2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF2()
	 * @generated
	 * @ordered
	 */
	protected AFF2CONTENT aFF2;

	/**
	 * The cached value of the '{@link #getAFF3() <em>AFF3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF3()
	 * @generated
	 * @ordered
	 */
	protected AFF3CONTENT aFF3;

	/**
	 * The cached value of the '{@link #getAFF4() <em>AFF4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF4()
	 * @generated
	 * @ordered
	 */
	protected EList<AFF4CONTENT> aFF4;

	/**
	 * The cached value of the '{@link #getAFF5() <em>AFF5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAFF5()
	 * @generated
	 * @ordered
	 */
	protected AFF5CONTENT aFF5;

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
	protected AFFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAFFCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFF1CONTENT getAFF1() {
		return aFF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAFF1(AFF1CONTENT newAFF1, NotificationChain msgs) {
		AFF1CONTENT oldAFF1 = aFF1;
		aFF1 = newAFF1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF1, oldAFF1, newAFF1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAFF1(AFF1CONTENT newAFF1) {
		if (newAFF1 != aFF1) {
			NotificationChain msgs = null;
			if (aFF1 != null)
				msgs = ((InternalEObject)aFF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF1, null, msgs);
			if (newAFF1 != null)
				msgs = ((InternalEObject)newAFF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF1, null, msgs);
			msgs = basicSetAFF1(newAFF1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF1, newAFF1, newAFF1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFF2CONTENT getAFF2() {
		return aFF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAFF2(AFF2CONTENT newAFF2, NotificationChain msgs) {
		AFF2CONTENT oldAFF2 = aFF2;
		aFF2 = newAFF2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF2, oldAFF2, newAFF2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAFF2(AFF2CONTENT newAFF2) {
		if (newAFF2 != aFF2) {
			NotificationChain msgs = null;
			if (aFF2 != null)
				msgs = ((InternalEObject)aFF2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF2, null, msgs);
			if (newAFF2 != null)
				msgs = ((InternalEObject)newAFF2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF2, null, msgs);
			msgs = basicSetAFF2(newAFF2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF2, newAFF2, newAFF2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFF3CONTENT getAFF3() {
		return aFF3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAFF3(AFF3CONTENT newAFF3, NotificationChain msgs) {
		AFF3CONTENT oldAFF3 = aFF3;
		aFF3 = newAFF3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF3, oldAFF3, newAFF3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAFF3(AFF3CONTENT newAFF3) {
		if (newAFF3 != aFF3) {
			NotificationChain msgs = null;
			if (aFF3 != null)
				msgs = ((InternalEObject)aFF3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF3, null, msgs);
			if (newAFF3 != null)
				msgs = ((InternalEObject)newAFF3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF3, null, msgs);
			msgs = basicSetAFF3(newAFF3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF3, newAFF3, newAFF3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AFF4CONTENT> getAFF4() {
		if (aFF4 == null) {
			aFF4 = new EObjectContainmentEList<AFF4CONTENT>(AFF4CONTENT.class, this, V2xmlPackage.AFFCONTENT__AFF4);
		}
		return aFF4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AFF5CONTENT getAFF5() {
		return aFF5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAFF5(AFF5CONTENT newAFF5, NotificationChain msgs) {
		AFF5CONTENT oldAFF5 = aFF5;
		aFF5 = newAFF5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF5, oldAFF5, newAFF5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAFF5(AFF5CONTENT newAFF5) {
		if (newAFF5 != aFF5) {
			NotificationChain msgs = null;
			if (aFF5 != null)
				msgs = ((InternalEObject)aFF5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF5, null, msgs);
			if (newAFF5 != null)
				msgs = ((InternalEObject)newAFF5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AFFCONTENT__AFF5, null, msgs);
			msgs = basicSetAFF5(newAFF5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AFFCONTENT__AFF5, newAFF5, newAFF5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AFFCONTENT__ANY);
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
			case V2xmlPackage.AFFCONTENT__AFF1:
				return basicSetAFF1(null, msgs);
			case V2xmlPackage.AFFCONTENT__AFF2:
				return basicSetAFF2(null, msgs);
			case V2xmlPackage.AFFCONTENT__AFF3:
				return basicSetAFF3(null, msgs);
			case V2xmlPackage.AFFCONTENT__AFF4:
				return ((InternalEList<?>)getAFF4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AFFCONTENT__AFF5:
				return basicSetAFF5(null, msgs);
			case V2xmlPackage.AFFCONTENT__ANY:
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
			case V2xmlPackage.AFFCONTENT__AFF1:
				return getAFF1();
			case V2xmlPackage.AFFCONTENT__AFF2:
				return getAFF2();
			case V2xmlPackage.AFFCONTENT__AFF3:
				return getAFF3();
			case V2xmlPackage.AFFCONTENT__AFF4:
				return getAFF4();
			case V2xmlPackage.AFFCONTENT__AFF5:
				return getAFF5();
			case V2xmlPackage.AFFCONTENT__ANY:
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
			case V2xmlPackage.AFFCONTENT__AFF1:
				setAFF1((AFF1CONTENT)newValue);
				return;
			case V2xmlPackage.AFFCONTENT__AFF2:
				setAFF2((AFF2CONTENT)newValue);
				return;
			case V2xmlPackage.AFFCONTENT__AFF3:
				setAFF3((AFF3CONTENT)newValue);
				return;
			case V2xmlPackage.AFFCONTENT__AFF4:
				getAFF4().clear();
				getAFF4().addAll((Collection<? extends AFF4CONTENT>)newValue);
				return;
			case V2xmlPackage.AFFCONTENT__AFF5:
				setAFF5((AFF5CONTENT)newValue);
				return;
			case V2xmlPackage.AFFCONTENT__ANY:
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
			case V2xmlPackage.AFFCONTENT__AFF1:
				setAFF1((AFF1CONTENT)null);
				return;
			case V2xmlPackage.AFFCONTENT__AFF2:
				setAFF2((AFF2CONTENT)null);
				return;
			case V2xmlPackage.AFFCONTENT__AFF3:
				setAFF3((AFF3CONTENT)null);
				return;
			case V2xmlPackage.AFFCONTENT__AFF4:
				getAFF4().clear();
				return;
			case V2xmlPackage.AFFCONTENT__AFF5:
				setAFF5((AFF5CONTENT)null);
				return;
			case V2xmlPackage.AFFCONTENT__ANY:
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
			case V2xmlPackage.AFFCONTENT__AFF1:
				return aFF1 != null;
			case V2xmlPackage.AFFCONTENT__AFF2:
				return aFF2 != null;
			case V2xmlPackage.AFFCONTENT__AFF3:
				return aFF3 != null;
			case V2xmlPackage.AFFCONTENT__AFF4:
				return aFF4 != null && !aFF4.isEmpty();
			case V2xmlPackage.AFFCONTENT__AFF5:
				return aFF5 != null;
			case V2xmlPackage.AFFCONTENT__ANY:
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

} //AFFCONTENTImpl
