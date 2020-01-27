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

import org.hl7.v2xml.CSS1CONTENT;
import org.hl7.v2xml.CSS2CONTENT;
import org.hl7.v2xml.CSS3CONTENT;
import org.hl7.v2xml.CSSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CSSCONTENTImpl#getCSS1 <em>CSS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSSCONTENTImpl#getCSS2 <em>CSS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSSCONTENTImpl#getCSS3 <em>CSS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSSCONTENTImpl extends EObjectImpl implements CSSCONTENT {
	/**
	 * The cached value of the '{@link #getCSS1() <em>CSS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSS1()
	 * @generated
	 * @ordered
	 */
	protected CSS1CONTENT cSS1;

	/**
	 * The cached value of the '{@link #getCSS2() <em>CSS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSS2()
	 * @generated
	 * @ordered
	 */
	protected CSS2CONTENT cSS2;

	/**
	 * The cached value of the '{@link #getCSS3() <em>CSS3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSS3()
	 * @generated
	 * @ordered
	 */
	protected EList<CSS3CONTENT> cSS3;

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
	protected CSSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCSSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS1CONTENT getCSS1() {
		return cSS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSS1(CSS1CONTENT newCSS1, NotificationChain msgs) {
		CSS1CONTENT oldCSS1 = cSS1;
		cSS1 = newCSS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSSCONTENT__CSS1, oldCSS1, newCSS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSS1(CSS1CONTENT newCSS1) {
		if (newCSS1 != cSS1) {
			NotificationChain msgs = null;
			if (cSS1 != null)
				msgs = ((InternalEObject)cSS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSSCONTENT__CSS1, null, msgs);
			if (newCSS1 != null)
				msgs = ((InternalEObject)newCSS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSSCONTENT__CSS1, null, msgs);
			msgs = basicSetCSS1(newCSS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSSCONTENT__CSS1, newCSS1, newCSS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSS2CONTENT getCSS2() {
		return cSS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSS2(CSS2CONTENT newCSS2, NotificationChain msgs) {
		CSS2CONTENT oldCSS2 = cSS2;
		cSS2 = newCSS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSSCONTENT__CSS2, oldCSS2, newCSS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSS2(CSS2CONTENT newCSS2) {
		if (newCSS2 != cSS2) {
			NotificationChain msgs = null;
			if (cSS2 != null)
				msgs = ((InternalEObject)cSS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSSCONTENT__CSS2, null, msgs);
			if (newCSS2 != null)
				msgs = ((InternalEObject)newCSS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSSCONTENT__CSS2, null, msgs);
			msgs = basicSetCSS2(newCSS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSSCONTENT__CSS2, newCSS2, newCSS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSS3CONTENT> getCSS3() {
		if (cSS3 == null) {
			cSS3 = new EObjectContainmentEList<CSS3CONTENT>(CSS3CONTENT.class, this, V2xmlPackage.CSSCONTENT__CSS3);
		}
		return cSS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CSSCONTENT__ANY);
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
			case V2xmlPackage.CSSCONTENT__CSS1:
				return basicSetCSS1(null, msgs);
			case V2xmlPackage.CSSCONTENT__CSS2:
				return basicSetCSS2(null, msgs);
			case V2xmlPackage.CSSCONTENT__CSS3:
				return ((InternalEList<?>)getCSS3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSSCONTENT__ANY:
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
			case V2xmlPackage.CSSCONTENT__CSS1:
				return getCSS1();
			case V2xmlPackage.CSSCONTENT__CSS2:
				return getCSS2();
			case V2xmlPackage.CSSCONTENT__CSS3:
				return getCSS3();
			case V2xmlPackage.CSSCONTENT__ANY:
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
			case V2xmlPackage.CSSCONTENT__CSS1:
				setCSS1((CSS1CONTENT)newValue);
				return;
			case V2xmlPackage.CSSCONTENT__CSS2:
				setCSS2((CSS2CONTENT)newValue);
				return;
			case V2xmlPackage.CSSCONTENT__CSS3:
				getCSS3().clear();
				getCSS3().addAll((Collection<? extends CSS3CONTENT>)newValue);
				return;
			case V2xmlPackage.CSSCONTENT__ANY:
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
			case V2xmlPackage.CSSCONTENT__CSS1:
				setCSS1((CSS1CONTENT)null);
				return;
			case V2xmlPackage.CSSCONTENT__CSS2:
				setCSS2((CSS2CONTENT)null);
				return;
			case V2xmlPackage.CSSCONTENT__CSS3:
				getCSS3().clear();
				return;
			case V2xmlPackage.CSSCONTENT__ANY:
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
			case V2xmlPackage.CSSCONTENT__CSS1:
				return cSS1 != null;
			case V2xmlPackage.CSSCONTENT__CSS2:
				return cSS2 != null;
			case V2xmlPackage.CSSCONTENT__CSS3:
				return cSS3 != null && !cSS3.isEmpty();
			case V2xmlPackage.CSSCONTENT__ANY:
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

} //CSSCONTENTImpl
