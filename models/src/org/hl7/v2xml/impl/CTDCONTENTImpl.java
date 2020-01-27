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

import org.hl7.v2xml.CTD1CONTENT;
import org.hl7.v2xml.CTD2CONTENT;
import org.hl7.v2xml.CTD3CONTENT;
import org.hl7.v2xml.CTD4CONTENT;
import org.hl7.v2xml.CTD5CONTENT;
import org.hl7.v2xml.CTD6CONTENT;
import org.hl7.v2xml.CTD7CONTENT;
import org.hl7.v2xml.CTDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CTDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD1 <em>CTD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD2 <em>CTD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD3 <em>CTD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD4 <em>CTD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD5 <em>CTD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD6 <em>CTD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getCTD7 <em>CTD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CTDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CTDCONTENTImpl extends EObjectImpl implements CTDCONTENT {
	/**
	 * The cached value of the '{@link #getCTD1() <em>CTD1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD1()
	 * @generated
	 * @ordered
	 */
	protected EList<CTD1CONTENT> cTD1;

	/**
	 * The cached value of the '{@link #getCTD2() <em>CTD2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD2()
	 * @generated
	 * @ordered
	 */
	protected EList<CTD2CONTENT> cTD2;

	/**
	 * The cached value of the '{@link #getCTD3() <em>CTD3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD3()
	 * @generated
	 * @ordered
	 */
	protected EList<CTD3CONTENT> cTD3;

	/**
	 * The cached value of the '{@link #getCTD4() <em>CTD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD4()
	 * @generated
	 * @ordered
	 */
	protected CTD4CONTENT cTD4;

	/**
	 * The cached value of the '{@link #getCTD5() <em>CTD5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD5()
	 * @generated
	 * @ordered
	 */
	protected EList<CTD5CONTENT> cTD5;

	/**
	 * The cached value of the '{@link #getCTD6() <em>CTD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD6()
	 * @generated
	 * @ordered
	 */
	protected CTD6CONTENT cTD6;

	/**
	 * The cached value of the '{@link #getCTD7() <em>CTD7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCTD7()
	 * @generated
	 * @ordered
	 */
	protected EList<CTD7CONTENT> cTD7;

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
	protected CTDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCTDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTD1CONTENT> getCTD1() {
		if (cTD1 == null) {
			cTD1 = new EObjectContainmentEList<CTD1CONTENT>(CTD1CONTENT.class, this, V2xmlPackage.CTDCONTENT__CTD1);
		}
		return cTD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTD2CONTENT> getCTD2() {
		if (cTD2 == null) {
			cTD2 = new EObjectContainmentEList<CTD2CONTENT>(CTD2CONTENT.class, this, V2xmlPackage.CTDCONTENT__CTD2);
		}
		return cTD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTD3CONTENT> getCTD3() {
		if (cTD3 == null) {
			cTD3 = new EObjectContainmentEList<CTD3CONTENT>(CTD3CONTENT.class, this, V2xmlPackage.CTDCONTENT__CTD3);
		}
		return cTD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTD4CONTENT getCTD4() {
		return cTD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTD4(CTD4CONTENT newCTD4, NotificationChain msgs) {
		CTD4CONTENT oldCTD4 = cTD4;
		cTD4 = newCTD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTDCONTENT__CTD4, oldCTD4, newCTD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTD4(CTD4CONTENT newCTD4) {
		if (newCTD4 != cTD4) {
			NotificationChain msgs = null;
			if (cTD4 != null)
				msgs = ((InternalEObject)cTD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTDCONTENT__CTD4, null, msgs);
			if (newCTD4 != null)
				msgs = ((InternalEObject)newCTD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTDCONTENT__CTD4, null, msgs);
			msgs = basicSetCTD4(newCTD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTDCONTENT__CTD4, newCTD4, newCTD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTD5CONTENT> getCTD5() {
		if (cTD5 == null) {
			cTD5 = new EObjectContainmentEList<CTD5CONTENT>(CTD5CONTENT.class, this, V2xmlPackage.CTDCONTENT__CTD5);
		}
		return cTD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CTD6CONTENT getCTD6() {
		return cTD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCTD6(CTD6CONTENT newCTD6, NotificationChain msgs) {
		CTD6CONTENT oldCTD6 = cTD6;
		cTD6 = newCTD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTDCONTENT__CTD6, oldCTD6, newCTD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCTD6(CTD6CONTENT newCTD6) {
		if (newCTD6 != cTD6) {
			NotificationChain msgs = null;
			if (cTD6 != null)
				msgs = ((InternalEObject)cTD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTDCONTENT__CTD6, null, msgs);
			if (newCTD6 != null)
				msgs = ((InternalEObject)newCTD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CTDCONTENT__CTD6, null, msgs);
			msgs = basicSetCTD6(newCTD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CTDCONTENT__CTD6, newCTD6, newCTD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CTD7CONTENT> getCTD7() {
		if (cTD7 == null) {
			cTD7 = new EObjectContainmentEList<CTD7CONTENT>(CTD7CONTENT.class, this, V2xmlPackage.CTDCONTENT__CTD7);
		}
		return cTD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CTDCONTENT__ANY);
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
			case V2xmlPackage.CTDCONTENT__CTD1:
				return ((InternalEList<?>)getCTD1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CTDCONTENT__CTD2:
				return ((InternalEList<?>)getCTD2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CTDCONTENT__CTD3:
				return ((InternalEList<?>)getCTD3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CTDCONTENT__CTD4:
				return basicSetCTD4(null, msgs);
			case V2xmlPackage.CTDCONTENT__CTD5:
				return ((InternalEList<?>)getCTD5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CTDCONTENT__CTD6:
				return basicSetCTD6(null, msgs);
			case V2xmlPackage.CTDCONTENT__CTD7:
				return ((InternalEList<?>)getCTD7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CTDCONTENT__ANY:
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
			case V2xmlPackage.CTDCONTENT__CTD1:
				return getCTD1();
			case V2xmlPackage.CTDCONTENT__CTD2:
				return getCTD2();
			case V2xmlPackage.CTDCONTENT__CTD3:
				return getCTD3();
			case V2xmlPackage.CTDCONTENT__CTD4:
				return getCTD4();
			case V2xmlPackage.CTDCONTENT__CTD5:
				return getCTD5();
			case V2xmlPackage.CTDCONTENT__CTD6:
				return getCTD6();
			case V2xmlPackage.CTDCONTENT__CTD7:
				return getCTD7();
			case V2xmlPackage.CTDCONTENT__ANY:
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
			case V2xmlPackage.CTDCONTENT__CTD1:
				getCTD1().clear();
				getCTD1().addAll((Collection<? extends CTD1CONTENT>)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD2:
				getCTD2().clear();
				getCTD2().addAll((Collection<? extends CTD2CONTENT>)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD3:
				getCTD3().clear();
				getCTD3().addAll((Collection<? extends CTD3CONTENT>)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD4:
				setCTD4((CTD4CONTENT)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD5:
				getCTD5().clear();
				getCTD5().addAll((Collection<? extends CTD5CONTENT>)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD6:
				setCTD6((CTD6CONTENT)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__CTD7:
				getCTD7().clear();
				getCTD7().addAll((Collection<? extends CTD7CONTENT>)newValue);
				return;
			case V2xmlPackage.CTDCONTENT__ANY:
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
			case V2xmlPackage.CTDCONTENT__CTD1:
				getCTD1().clear();
				return;
			case V2xmlPackage.CTDCONTENT__CTD2:
				getCTD2().clear();
				return;
			case V2xmlPackage.CTDCONTENT__CTD3:
				getCTD3().clear();
				return;
			case V2xmlPackage.CTDCONTENT__CTD4:
				setCTD4((CTD4CONTENT)null);
				return;
			case V2xmlPackage.CTDCONTENT__CTD5:
				getCTD5().clear();
				return;
			case V2xmlPackage.CTDCONTENT__CTD6:
				setCTD6((CTD6CONTENT)null);
				return;
			case V2xmlPackage.CTDCONTENT__CTD7:
				getCTD7().clear();
				return;
			case V2xmlPackage.CTDCONTENT__ANY:
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
			case V2xmlPackage.CTDCONTENT__CTD1:
				return cTD1 != null && !cTD1.isEmpty();
			case V2xmlPackage.CTDCONTENT__CTD2:
				return cTD2 != null && !cTD2.isEmpty();
			case V2xmlPackage.CTDCONTENT__CTD3:
				return cTD3 != null && !cTD3.isEmpty();
			case V2xmlPackage.CTDCONTENT__CTD4:
				return cTD4 != null;
			case V2xmlPackage.CTDCONTENT__CTD5:
				return cTD5 != null && !cTD5.isEmpty();
			case V2xmlPackage.CTDCONTENT__CTD6:
				return cTD6 != null;
			case V2xmlPackage.CTDCONTENT__CTD7:
				return cTD7 != null && !cTD7.isEmpty();
			case V2xmlPackage.CTDCONTENT__ANY:
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

} //CTDCONTENTImpl
