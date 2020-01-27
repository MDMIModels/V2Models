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

import org.hl7.v2xml.APR1CONTENT;
import org.hl7.v2xml.APR2CONTENT;
import org.hl7.v2xml.APR3CONTENT;
import org.hl7.v2xml.APR4CONTENT;
import org.hl7.v2xml.APR5CONTENT;
import org.hl7.v2xml.APRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>APRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAPR1 <em>APR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAPR2 <em>APR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAPR3 <em>APR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAPR4 <em>APR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAPR5 <em>APR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.APRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APRCONTENTImpl extends EObjectImpl implements APRCONTENT {
	/**
	 * The cached value of the '{@link #getAPR1() <em>APR1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR1()
	 * @generated
	 * @ordered
	 */
	protected EList<APR1CONTENT> aPR1;

	/**
	 * The cached value of the '{@link #getAPR2() <em>APR2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR2()
	 * @generated
	 * @ordered
	 */
	protected EList<APR2CONTENT> aPR2;

	/**
	 * The cached value of the '{@link #getAPR3() <em>APR3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR3()
	 * @generated
	 * @ordered
	 */
	protected EList<APR3CONTENT> aPR3;

	/**
	 * The cached value of the '{@link #getAPR4() <em>APR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR4()
	 * @generated
	 * @ordered
	 */
	protected APR4CONTENT aPR4;

	/**
	 * The cached value of the '{@link #getAPR5() <em>APR5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPR5()
	 * @generated
	 * @ordered
	 */
	protected EList<APR5CONTENT> aPR5;

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
	protected APRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAPRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APR1CONTENT> getAPR1() {
		if (aPR1 == null) {
			aPR1 = new EObjectContainmentEList<APR1CONTENT>(APR1CONTENT.class, this, V2xmlPackage.APRCONTENT__APR1);
		}
		return aPR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APR2CONTENT> getAPR2() {
		if (aPR2 == null) {
			aPR2 = new EObjectContainmentEList<APR2CONTENT>(APR2CONTENT.class, this, V2xmlPackage.APRCONTENT__APR2);
		}
		return aPR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APR3CONTENT> getAPR3() {
		if (aPR3 == null) {
			aPR3 = new EObjectContainmentEList<APR3CONTENT>(APR3CONTENT.class, this, V2xmlPackage.APRCONTENT__APR3);
		}
		return aPR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APR4CONTENT getAPR4() {
		return aPR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPR4(APR4CONTENT newAPR4, NotificationChain msgs) {
		APR4CONTENT oldAPR4 = aPR4;
		aPR4 = newAPR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.APRCONTENT__APR4, oldAPR4, newAPR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPR4(APR4CONTENT newAPR4) {
		if (newAPR4 != aPR4) {
			NotificationChain msgs = null;
			if (aPR4 != null)
				msgs = ((InternalEObject)aPR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.APRCONTENT__APR4, null, msgs);
			if (newAPR4 != null)
				msgs = ((InternalEObject)newAPR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.APRCONTENT__APR4, null, msgs);
			msgs = basicSetAPR4(newAPR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.APRCONTENT__APR4, newAPR4, newAPR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APR5CONTENT> getAPR5() {
		if (aPR5 == null) {
			aPR5 = new EObjectContainmentEList<APR5CONTENT>(APR5CONTENT.class, this, V2xmlPackage.APRCONTENT__APR5);
		}
		return aPR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.APRCONTENT__ANY);
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
			case V2xmlPackage.APRCONTENT__APR1:
				return ((InternalEList<?>)getAPR1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.APRCONTENT__APR2:
				return ((InternalEList<?>)getAPR2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.APRCONTENT__APR3:
				return ((InternalEList<?>)getAPR3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.APRCONTENT__APR4:
				return basicSetAPR4(null, msgs);
			case V2xmlPackage.APRCONTENT__APR5:
				return ((InternalEList<?>)getAPR5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.APRCONTENT__ANY:
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
			case V2xmlPackage.APRCONTENT__APR1:
				return getAPR1();
			case V2xmlPackage.APRCONTENT__APR2:
				return getAPR2();
			case V2xmlPackage.APRCONTENT__APR3:
				return getAPR3();
			case V2xmlPackage.APRCONTENT__APR4:
				return getAPR4();
			case V2xmlPackage.APRCONTENT__APR5:
				return getAPR5();
			case V2xmlPackage.APRCONTENT__ANY:
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
			case V2xmlPackage.APRCONTENT__APR1:
				getAPR1().clear();
				getAPR1().addAll((Collection<? extends APR1CONTENT>)newValue);
				return;
			case V2xmlPackage.APRCONTENT__APR2:
				getAPR2().clear();
				getAPR2().addAll((Collection<? extends APR2CONTENT>)newValue);
				return;
			case V2xmlPackage.APRCONTENT__APR3:
				getAPR3().clear();
				getAPR3().addAll((Collection<? extends APR3CONTENT>)newValue);
				return;
			case V2xmlPackage.APRCONTENT__APR4:
				setAPR4((APR4CONTENT)newValue);
				return;
			case V2xmlPackage.APRCONTENT__APR5:
				getAPR5().clear();
				getAPR5().addAll((Collection<? extends APR5CONTENT>)newValue);
				return;
			case V2xmlPackage.APRCONTENT__ANY:
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
			case V2xmlPackage.APRCONTENT__APR1:
				getAPR1().clear();
				return;
			case V2xmlPackage.APRCONTENT__APR2:
				getAPR2().clear();
				return;
			case V2xmlPackage.APRCONTENT__APR3:
				getAPR3().clear();
				return;
			case V2xmlPackage.APRCONTENT__APR4:
				setAPR4((APR4CONTENT)null);
				return;
			case V2xmlPackage.APRCONTENT__APR5:
				getAPR5().clear();
				return;
			case V2xmlPackage.APRCONTENT__ANY:
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
			case V2xmlPackage.APRCONTENT__APR1:
				return aPR1 != null && !aPR1.isEmpty();
			case V2xmlPackage.APRCONTENT__APR2:
				return aPR2 != null && !aPR2.isEmpty();
			case V2xmlPackage.APRCONTENT__APR3:
				return aPR3 != null && !aPR3.isEmpty();
			case V2xmlPackage.APRCONTENT__APR4:
				return aPR4 != null;
			case V2xmlPackage.APRCONTENT__APR5:
				return aPR5 != null && !aPR5.isEmpty();
			case V2xmlPackage.APRCONTENT__ANY:
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

} //APRCONTENTImpl
