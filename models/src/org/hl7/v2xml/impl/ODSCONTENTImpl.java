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

import org.hl7.v2xml.ODS1CONTENT;
import org.hl7.v2xml.ODS2CONTENT;
import org.hl7.v2xml.ODS3CONTENT;
import org.hl7.v2xml.ODS4CONTENT;
import org.hl7.v2xml.ODSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ODSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ODSCONTENTImpl#getODS1 <em>ODS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODSCONTENTImpl#getODS2 <em>ODS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODSCONTENTImpl#getODS3 <em>ODS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODSCONTENTImpl#getODS4 <em>ODS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ODSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ODSCONTENTImpl extends EObjectImpl implements ODSCONTENT {
	/**
	 * The cached value of the '{@link #getODS1() <em>ODS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODS1()
	 * @generated
	 * @ordered
	 */
	protected ODS1CONTENT oDS1;

	/**
	 * The cached value of the '{@link #getODS2() <em>ODS2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODS2()
	 * @generated
	 * @ordered
	 */
	protected EList<ODS2CONTENT> oDS2;

	/**
	 * The cached value of the '{@link #getODS3() <em>ODS3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODS3()
	 * @generated
	 * @ordered
	 */
	protected EList<ODS3CONTENT> oDS3;

	/**
	 * The cached value of the '{@link #getODS4() <em>ODS4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getODS4()
	 * @generated
	 * @ordered
	 */
	protected EList<ODS4CONTENT> oDS4;

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
	protected ODSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getODSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ODS1CONTENT getODS1() {
		return oDS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetODS1(ODS1CONTENT newODS1, NotificationChain msgs) {
		ODS1CONTENT oldODS1 = oDS1;
		oDS1 = newODS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODSCONTENT__ODS1, oldODS1, newODS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setODS1(ODS1CONTENT newODS1) {
		if (newODS1 != oDS1) {
			NotificationChain msgs = null;
			if (oDS1 != null)
				msgs = ((InternalEObject)oDS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODSCONTENT__ODS1, null, msgs);
			if (newODS1 != null)
				msgs = ((InternalEObject)newODS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ODSCONTENT__ODS1, null, msgs);
			msgs = basicSetODS1(newODS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ODSCONTENT__ODS1, newODS1, newODS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODS2CONTENT> getODS2() {
		if (oDS2 == null) {
			oDS2 = new EObjectContainmentEList<ODS2CONTENT>(ODS2CONTENT.class, this, V2xmlPackage.ODSCONTENT__ODS2);
		}
		return oDS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODS3CONTENT> getODS3() {
		if (oDS3 == null) {
			oDS3 = new EObjectContainmentEList<ODS3CONTENT>(ODS3CONTENT.class, this, V2xmlPackage.ODSCONTENT__ODS3);
		}
		return oDS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ODS4CONTENT> getODS4() {
		if (oDS4 == null) {
			oDS4 = new EObjectContainmentEList<ODS4CONTENT>(ODS4CONTENT.class, this, V2xmlPackage.ODSCONTENT__ODS4);
		}
		return oDS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ODSCONTENT__ANY);
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
			case V2xmlPackage.ODSCONTENT__ODS1:
				return basicSetODS1(null, msgs);
			case V2xmlPackage.ODSCONTENT__ODS2:
				return ((InternalEList<?>)getODS2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ODSCONTENT__ODS3:
				return ((InternalEList<?>)getODS3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ODSCONTENT__ODS4:
				return ((InternalEList<?>)getODS4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ODSCONTENT__ANY:
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
			case V2xmlPackage.ODSCONTENT__ODS1:
				return getODS1();
			case V2xmlPackage.ODSCONTENT__ODS2:
				return getODS2();
			case V2xmlPackage.ODSCONTENT__ODS3:
				return getODS3();
			case V2xmlPackage.ODSCONTENT__ODS4:
				return getODS4();
			case V2xmlPackage.ODSCONTENT__ANY:
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
			case V2xmlPackage.ODSCONTENT__ODS1:
				setODS1((ODS1CONTENT)newValue);
				return;
			case V2xmlPackage.ODSCONTENT__ODS2:
				getODS2().clear();
				getODS2().addAll((Collection<? extends ODS2CONTENT>)newValue);
				return;
			case V2xmlPackage.ODSCONTENT__ODS3:
				getODS3().clear();
				getODS3().addAll((Collection<? extends ODS3CONTENT>)newValue);
				return;
			case V2xmlPackage.ODSCONTENT__ODS4:
				getODS4().clear();
				getODS4().addAll((Collection<? extends ODS4CONTENT>)newValue);
				return;
			case V2xmlPackage.ODSCONTENT__ANY:
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
			case V2xmlPackage.ODSCONTENT__ODS1:
				setODS1((ODS1CONTENT)null);
				return;
			case V2xmlPackage.ODSCONTENT__ODS2:
				getODS2().clear();
				return;
			case V2xmlPackage.ODSCONTENT__ODS3:
				getODS3().clear();
				return;
			case V2xmlPackage.ODSCONTENT__ODS4:
				getODS4().clear();
				return;
			case V2xmlPackage.ODSCONTENT__ANY:
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
			case V2xmlPackage.ODSCONTENT__ODS1:
				return oDS1 != null;
			case V2xmlPackage.ODSCONTENT__ODS2:
				return oDS2 != null && !oDS2.isEmpty();
			case V2xmlPackage.ODSCONTENT__ODS3:
				return oDS3 != null && !oDS3.isEmpty();
			case V2xmlPackage.ODSCONTENT__ODS4:
				return oDS4 != null && !oDS4.isEmpty();
			case V2xmlPackage.ODSCONTENT__ANY:
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

} //ODSCONTENTImpl
