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

import org.hl7.v2xml.URD1CONTENT;
import org.hl7.v2xml.URD2CONTENT;
import org.hl7.v2xml.URD3CONTENT;
import org.hl7.v2xml.URD4CONTENT;
import org.hl7.v2xml.URD5CONTENT;
import org.hl7.v2xml.URD6CONTENT;
import org.hl7.v2xml.URD7CONTENT;
import org.hl7.v2xml.URDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD1 <em>URD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD2 <em>URD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD3 <em>URD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD4 <em>URD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD5 <em>URD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD6 <em>URD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getURD7 <em>URD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URDCONTENTImpl extends EObjectImpl implements URDCONTENT {
	/**
	 * The cached value of the '{@link #getURD1() <em>URD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD1()
	 * @generated
	 * @ordered
	 */
	protected URD1CONTENT uRD1;

	/**
	 * The cached value of the '{@link #getURD2() <em>URD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD2()
	 * @generated
	 * @ordered
	 */
	protected URD2CONTENT uRD2;

	/**
	 * The cached value of the '{@link #getURD3() <em>URD3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD3()
	 * @generated
	 * @ordered
	 */
	protected EList<URD3CONTENT> uRD3;

	/**
	 * The cached value of the '{@link #getURD4() <em>URD4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD4()
	 * @generated
	 * @ordered
	 */
	protected EList<URD4CONTENT> uRD4;

	/**
	 * The cached value of the '{@link #getURD5() <em>URD5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD5()
	 * @generated
	 * @ordered
	 */
	protected EList<URD5CONTENT> uRD5;

	/**
	 * The cached value of the '{@link #getURD6() <em>URD6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD6()
	 * @generated
	 * @ordered
	 */
	protected EList<URD6CONTENT> uRD6;

	/**
	 * The cached value of the '{@link #getURD7() <em>URD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURD7()
	 * @generated
	 * @ordered
	 */
	protected URD7CONTENT uRD7;

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
	protected URDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getURDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URD1CONTENT getURD1() {
		return uRD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURD1(URD1CONTENT newURD1, NotificationChain msgs) {
		URD1CONTENT oldURD1 = uRD1;
		uRD1 = newURD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD1, oldURD1, newURD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURD1(URD1CONTENT newURD1) {
		if (newURD1 != uRD1) {
			NotificationChain msgs = null;
			if (uRD1 != null)
				msgs = ((InternalEObject)uRD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD1, null, msgs);
			if (newURD1 != null)
				msgs = ((InternalEObject)newURD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD1, null, msgs);
			msgs = basicSetURD1(newURD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD1, newURD1, newURD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URD2CONTENT getURD2() {
		return uRD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURD2(URD2CONTENT newURD2, NotificationChain msgs) {
		URD2CONTENT oldURD2 = uRD2;
		uRD2 = newURD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD2, oldURD2, newURD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURD2(URD2CONTENT newURD2) {
		if (newURD2 != uRD2) {
			NotificationChain msgs = null;
			if (uRD2 != null)
				msgs = ((InternalEObject)uRD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD2, null, msgs);
			if (newURD2 != null)
				msgs = ((InternalEObject)newURD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD2, null, msgs);
			msgs = basicSetURD2(newURD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD2, newURD2, newURD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URD3CONTENT> getURD3() {
		if (uRD3 == null) {
			uRD3 = new EObjectContainmentEList<URD3CONTENT>(URD3CONTENT.class, this, V2xmlPackage.URDCONTENT__URD3);
		}
		return uRD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URD4CONTENT> getURD4() {
		if (uRD4 == null) {
			uRD4 = new EObjectContainmentEList<URD4CONTENT>(URD4CONTENT.class, this, V2xmlPackage.URDCONTENT__URD4);
		}
		return uRD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URD5CONTENT> getURD5() {
		if (uRD5 == null) {
			uRD5 = new EObjectContainmentEList<URD5CONTENT>(URD5CONTENT.class, this, V2xmlPackage.URDCONTENT__URD5);
		}
		return uRD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URD6CONTENT> getURD6() {
		if (uRD6 == null) {
			uRD6 = new EObjectContainmentEList<URD6CONTENT>(URD6CONTENT.class, this, V2xmlPackage.URDCONTENT__URD6);
		}
		return uRD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URD7CONTENT getURD7() {
		return uRD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURD7(URD7CONTENT newURD7, NotificationChain msgs) {
		URD7CONTENT oldURD7 = uRD7;
		uRD7 = newURD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD7, oldURD7, newURD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURD7(URD7CONTENT newURD7) {
		if (newURD7 != uRD7) {
			NotificationChain msgs = null;
			if (uRD7 != null)
				msgs = ((InternalEObject)uRD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD7, null, msgs);
			if (newURD7 != null)
				msgs = ((InternalEObject)newURD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URDCONTENT__URD7, null, msgs);
			msgs = basicSetURD7(newURD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URDCONTENT__URD7, newURD7, newURD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.URDCONTENT__ANY);
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
			case V2xmlPackage.URDCONTENT__URD1:
				return basicSetURD1(null, msgs);
			case V2xmlPackage.URDCONTENT__URD2:
				return basicSetURD2(null, msgs);
			case V2xmlPackage.URDCONTENT__URD3:
				return ((InternalEList<?>)getURD3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URDCONTENT__URD4:
				return ((InternalEList<?>)getURD4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URDCONTENT__URD5:
				return ((InternalEList<?>)getURD5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URDCONTENT__URD6:
				return ((InternalEList<?>)getURD6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URDCONTENT__URD7:
				return basicSetURD7(null, msgs);
			case V2xmlPackage.URDCONTENT__ANY:
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
			case V2xmlPackage.URDCONTENT__URD1:
				return getURD1();
			case V2xmlPackage.URDCONTENT__URD2:
				return getURD2();
			case V2xmlPackage.URDCONTENT__URD3:
				return getURD3();
			case V2xmlPackage.URDCONTENT__URD4:
				return getURD4();
			case V2xmlPackage.URDCONTENT__URD5:
				return getURD5();
			case V2xmlPackage.URDCONTENT__URD6:
				return getURD6();
			case V2xmlPackage.URDCONTENT__URD7:
				return getURD7();
			case V2xmlPackage.URDCONTENT__ANY:
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
			case V2xmlPackage.URDCONTENT__URD1:
				setURD1((URD1CONTENT)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD2:
				setURD2((URD2CONTENT)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD3:
				getURD3().clear();
				getURD3().addAll((Collection<? extends URD3CONTENT>)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD4:
				getURD4().clear();
				getURD4().addAll((Collection<? extends URD4CONTENT>)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD5:
				getURD5().clear();
				getURD5().addAll((Collection<? extends URD5CONTENT>)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD6:
				getURD6().clear();
				getURD6().addAll((Collection<? extends URD6CONTENT>)newValue);
				return;
			case V2xmlPackage.URDCONTENT__URD7:
				setURD7((URD7CONTENT)newValue);
				return;
			case V2xmlPackage.URDCONTENT__ANY:
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
			case V2xmlPackage.URDCONTENT__URD1:
				setURD1((URD1CONTENT)null);
				return;
			case V2xmlPackage.URDCONTENT__URD2:
				setURD2((URD2CONTENT)null);
				return;
			case V2xmlPackage.URDCONTENT__URD3:
				getURD3().clear();
				return;
			case V2xmlPackage.URDCONTENT__URD4:
				getURD4().clear();
				return;
			case V2xmlPackage.URDCONTENT__URD5:
				getURD5().clear();
				return;
			case V2xmlPackage.URDCONTENT__URD6:
				getURD6().clear();
				return;
			case V2xmlPackage.URDCONTENT__URD7:
				setURD7((URD7CONTENT)null);
				return;
			case V2xmlPackage.URDCONTENT__ANY:
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
			case V2xmlPackage.URDCONTENT__URD1:
				return uRD1 != null;
			case V2xmlPackage.URDCONTENT__URD2:
				return uRD2 != null;
			case V2xmlPackage.URDCONTENT__URD3:
				return uRD3 != null && !uRD3.isEmpty();
			case V2xmlPackage.URDCONTENT__URD4:
				return uRD4 != null && !uRD4.isEmpty();
			case V2xmlPackage.URDCONTENT__URD5:
				return uRD5 != null && !uRD5.isEmpty();
			case V2xmlPackage.URDCONTENT__URD6:
				return uRD6 != null && !uRD6.isEmpty();
			case V2xmlPackage.URDCONTENT__URD7:
				return uRD7 != null;
			case V2xmlPackage.URDCONTENT__ANY:
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

} //URDCONTENTImpl
