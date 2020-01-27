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

import org.hl7.v2xml.PRD1CONTENT;
import org.hl7.v2xml.PRD2CONTENT;
import org.hl7.v2xml.PRD3CONTENT;
import org.hl7.v2xml.PRD4CONTENT;
import org.hl7.v2xml.PRD5CONTENT;
import org.hl7.v2xml.PRD6CONTENT;
import org.hl7.v2xml.PRD7CONTENT;
import org.hl7.v2xml.PRD8CONTENT;
import org.hl7.v2xml.PRD9CONTENT;
import org.hl7.v2xml.PRDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD1 <em>PRD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD2 <em>PRD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD3 <em>PRD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD4 <em>PRD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD5 <em>PRD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD6 <em>PRD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD7 <em>PRD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD8 <em>PRD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getPRD9 <em>PRD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRDCONTENTImpl extends EObjectImpl implements PRDCONTENT {
	/**
	 * The cached value of the '{@link #getPRD1() <em>PRD1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD1()
	 * @generated
	 * @ordered
	 */
	protected EList<PRD1CONTENT> pRD1;

	/**
	 * The cached value of the '{@link #getPRD2() <em>PRD2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD2()
	 * @generated
	 * @ordered
	 */
	protected EList<PRD2CONTENT> pRD2;

	/**
	 * The cached value of the '{@link #getPRD3() <em>PRD3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD3()
	 * @generated
	 * @ordered
	 */
	protected EList<PRD3CONTENT> pRD3;

	/**
	 * The cached value of the '{@link #getPRD4() <em>PRD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD4()
	 * @generated
	 * @ordered
	 */
	protected PRD4CONTENT pRD4;

	/**
	 * The cached value of the '{@link #getPRD5() <em>PRD5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD5()
	 * @generated
	 * @ordered
	 */
	protected EList<PRD5CONTENT> pRD5;

	/**
	 * The cached value of the '{@link #getPRD6() <em>PRD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD6()
	 * @generated
	 * @ordered
	 */
	protected PRD6CONTENT pRD6;

	/**
	 * The cached value of the '{@link #getPRD7() <em>PRD7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD7()
	 * @generated
	 * @ordered
	 */
	protected EList<PRD7CONTENT> pRD7;

	/**
	 * The cached value of the '{@link #getPRD8() <em>PRD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD8()
	 * @generated
	 * @ordered
	 */
	protected PRD8CONTENT pRD8;

	/**
	 * The cached value of the '{@link #getPRD9() <em>PRD9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRD9()
	 * @generated
	 * @ordered
	 */
	protected PRD9CONTENT pRD9;

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
	protected PRDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPRDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRD1CONTENT> getPRD1() {
		if (pRD1 == null) {
			pRD1 = new EObjectContainmentEList<PRD1CONTENT>(PRD1CONTENT.class, this, V2xmlPackage.PRDCONTENT__PRD1);
		}
		return pRD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRD2CONTENT> getPRD2() {
		if (pRD2 == null) {
			pRD2 = new EObjectContainmentEList<PRD2CONTENT>(PRD2CONTENT.class, this, V2xmlPackage.PRDCONTENT__PRD2);
		}
		return pRD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRD3CONTENT> getPRD3() {
		if (pRD3 == null) {
			pRD3 = new EObjectContainmentEList<PRD3CONTENT>(PRD3CONTENT.class, this, V2xmlPackage.PRDCONTENT__PRD3);
		}
		return pRD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRD4CONTENT getPRD4() {
		return pRD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRD4(PRD4CONTENT newPRD4, NotificationChain msgs) {
		PRD4CONTENT oldPRD4 = pRD4;
		pRD4 = newPRD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD4, oldPRD4, newPRD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRD4(PRD4CONTENT newPRD4) {
		if (newPRD4 != pRD4) {
			NotificationChain msgs = null;
			if (pRD4 != null)
				msgs = ((InternalEObject)pRD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD4, null, msgs);
			if (newPRD4 != null)
				msgs = ((InternalEObject)newPRD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD4, null, msgs);
			msgs = basicSetPRD4(newPRD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD4, newPRD4, newPRD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRD5CONTENT> getPRD5() {
		if (pRD5 == null) {
			pRD5 = new EObjectContainmentEList<PRD5CONTENT>(PRD5CONTENT.class, this, V2xmlPackage.PRDCONTENT__PRD5);
		}
		return pRD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRD6CONTENT getPRD6() {
		return pRD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRD6(PRD6CONTENT newPRD6, NotificationChain msgs) {
		PRD6CONTENT oldPRD6 = pRD6;
		pRD6 = newPRD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD6, oldPRD6, newPRD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRD6(PRD6CONTENT newPRD6) {
		if (newPRD6 != pRD6) {
			NotificationChain msgs = null;
			if (pRD6 != null)
				msgs = ((InternalEObject)pRD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD6, null, msgs);
			if (newPRD6 != null)
				msgs = ((InternalEObject)newPRD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD6, null, msgs);
			msgs = basicSetPRD6(newPRD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD6, newPRD6, newPRD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRD7CONTENT> getPRD7() {
		if (pRD7 == null) {
			pRD7 = new EObjectContainmentEList<PRD7CONTENT>(PRD7CONTENT.class, this, V2xmlPackage.PRDCONTENT__PRD7);
		}
		return pRD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRD8CONTENT getPRD8() {
		return pRD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRD8(PRD8CONTENT newPRD8, NotificationChain msgs) {
		PRD8CONTENT oldPRD8 = pRD8;
		pRD8 = newPRD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD8, oldPRD8, newPRD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRD8(PRD8CONTENT newPRD8) {
		if (newPRD8 != pRD8) {
			NotificationChain msgs = null;
			if (pRD8 != null)
				msgs = ((InternalEObject)pRD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD8, null, msgs);
			if (newPRD8 != null)
				msgs = ((InternalEObject)newPRD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD8, null, msgs);
			msgs = basicSetPRD8(newPRD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD8, newPRD8, newPRD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRD9CONTENT getPRD9() {
		return pRD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRD9(PRD9CONTENT newPRD9, NotificationChain msgs) {
		PRD9CONTENT oldPRD9 = pRD9;
		pRD9 = newPRD9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD9, oldPRD9, newPRD9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRD9(PRD9CONTENT newPRD9) {
		if (newPRD9 != pRD9) {
			NotificationChain msgs = null;
			if (pRD9 != null)
				msgs = ((InternalEObject)pRD9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD9, null, msgs);
			if (newPRD9 != null)
				msgs = ((InternalEObject)newPRD9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRDCONTENT__PRD9, null, msgs);
			msgs = basicSetPRD9(newPRD9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRDCONTENT__PRD9, newPRD9, newPRD9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PRDCONTENT__ANY);
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
			case V2xmlPackage.PRDCONTENT__PRD1:
				return ((InternalEList<?>)getPRD1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRDCONTENT__PRD2:
				return ((InternalEList<?>)getPRD2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRDCONTENT__PRD3:
				return ((InternalEList<?>)getPRD3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRDCONTENT__PRD4:
				return basicSetPRD4(null, msgs);
			case V2xmlPackage.PRDCONTENT__PRD5:
				return ((InternalEList<?>)getPRD5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRDCONTENT__PRD6:
				return basicSetPRD6(null, msgs);
			case V2xmlPackage.PRDCONTENT__PRD7:
				return ((InternalEList<?>)getPRD7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRDCONTENT__PRD8:
				return basicSetPRD8(null, msgs);
			case V2xmlPackage.PRDCONTENT__PRD9:
				return basicSetPRD9(null, msgs);
			case V2xmlPackage.PRDCONTENT__ANY:
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
			case V2xmlPackage.PRDCONTENT__PRD1:
				return getPRD1();
			case V2xmlPackage.PRDCONTENT__PRD2:
				return getPRD2();
			case V2xmlPackage.PRDCONTENT__PRD3:
				return getPRD3();
			case V2xmlPackage.PRDCONTENT__PRD4:
				return getPRD4();
			case V2xmlPackage.PRDCONTENT__PRD5:
				return getPRD5();
			case V2xmlPackage.PRDCONTENT__PRD6:
				return getPRD6();
			case V2xmlPackage.PRDCONTENT__PRD7:
				return getPRD7();
			case V2xmlPackage.PRDCONTENT__PRD8:
				return getPRD8();
			case V2xmlPackage.PRDCONTENT__PRD9:
				return getPRD9();
			case V2xmlPackage.PRDCONTENT__ANY:
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
			case V2xmlPackage.PRDCONTENT__PRD1:
				getPRD1().clear();
				getPRD1().addAll((Collection<? extends PRD1CONTENT>)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD2:
				getPRD2().clear();
				getPRD2().addAll((Collection<? extends PRD2CONTENT>)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD3:
				getPRD3().clear();
				getPRD3().addAll((Collection<? extends PRD3CONTENT>)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD4:
				setPRD4((PRD4CONTENT)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD5:
				getPRD5().clear();
				getPRD5().addAll((Collection<? extends PRD5CONTENT>)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD6:
				setPRD6((PRD6CONTENT)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD7:
				getPRD7().clear();
				getPRD7().addAll((Collection<? extends PRD7CONTENT>)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD8:
				setPRD8((PRD8CONTENT)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__PRD9:
				setPRD9((PRD9CONTENT)newValue);
				return;
			case V2xmlPackage.PRDCONTENT__ANY:
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
			case V2xmlPackage.PRDCONTENT__PRD1:
				getPRD1().clear();
				return;
			case V2xmlPackage.PRDCONTENT__PRD2:
				getPRD2().clear();
				return;
			case V2xmlPackage.PRDCONTENT__PRD3:
				getPRD3().clear();
				return;
			case V2xmlPackage.PRDCONTENT__PRD4:
				setPRD4((PRD4CONTENT)null);
				return;
			case V2xmlPackage.PRDCONTENT__PRD5:
				getPRD5().clear();
				return;
			case V2xmlPackage.PRDCONTENT__PRD6:
				setPRD6((PRD6CONTENT)null);
				return;
			case V2xmlPackage.PRDCONTENT__PRD7:
				getPRD7().clear();
				return;
			case V2xmlPackage.PRDCONTENT__PRD8:
				setPRD8((PRD8CONTENT)null);
				return;
			case V2xmlPackage.PRDCONTENT__PRD9:
				setPRD9((PRD9CONTENT)null);
				return;
			case V2xmlPackage.PRDCONTENT__ANY:
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
			case V2xmlPackage.PRDCONTENT__PRD1:
				return pRD1 != null && !pRD1.isEmpty();
			case V2xmlPackage.PRDCONTENT__PRD2:
				return pRD2 != null && !pRD2.isEmpty();
			case V2xmlPackage.PRDCONTENT__PRD3:
				return pRD3 != null && !pRD3.isEmpty();
			case V2xmlPackage.PRDCONTENT__PRD4:
				return pRD4 != null;
			case V2xmlPackage.PRDCONTENT__PRD5:
				return pRD5 != null && !pRD5.isEmpty();
			case V2xmlPackage.PRDCONTENT__PRD6:
				return pRD6 != null;
			case V2xmlPackage.PRDCONTENT__PRD7:
				return pRD7 != null && !pRD7.isEmpty();
			case V2xmlPackage.PRDCONTENT__PRD8:
				return pRD8 != null;
			case V2xmlPackage.PRDCONTENT__PRD9:
				return pRD9 != null;
			case V2xmlPackage.PRDCONTENT__ANY:
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

} //PRDCONTENTImpl
