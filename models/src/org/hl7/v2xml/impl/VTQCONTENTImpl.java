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

import org.hl7.v2xml.V2xmlPackage;
import org.hl7.v2xml.VTQ1CONTENT;
import org.hl7.v2xml.VTQ2CONTENT;
import org.hl7.v2xml.VTQ3CONTENT;
import org.hl7.v2xml.VTQ4CONTENT;
import org.hl7.v2xml.VTQ5CONTENT;
import org.hl7.v2xml.VTQCONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VTQCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getVTQ1 <em>VTQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getVTQ2 <em>VTQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getVTQ3 <em>VTQ3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getVTQ4 <em>VTQ4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getVTQ5 <em>VTQ5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VTQCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VTQCONTENTImpl extends EObjectImpl implements VTQCONTENT {
	/**
	 * The cached value of the '{@link #getVTQ1() <em>VTQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ1()
	 * @generated
	 * @ordered
	 */
	protected VTQ1CONTENT vTQ1;

	/**
	 * The cached value of the '{@link #getVTQ2() <em>VTQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ2()
	 * @generated
	 * @ordered
	 */
	protected VTQ2CONTENT vTQ2;

	/**
	 * The cached value of the '{@link #getVTQ3() <em>VTQ3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ3()
	 * @generated
	 * @ordered
	 */
	protected VTQ3CONTENT vTQ3;

	/**
	 * The cached value of the '{@link #getVTQ4() <em>VTQ4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ4()
	 * @generated
	 * @ordered
	 */
	protected VTQ4CONTENT vTQ4;

	/**
	 * The cached value of the '{@link #getVTQ5() <em>VTQ5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVTQ5()
	 * @generated
	 * @ordered
	 */
	protected EList<VTQ5CONTENT> vTQ5;

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
	protected VTQCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getVTQCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTQ1CONTENT getVTQ1() {
		return vTQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVTQ1(VTQ1CONTENT newVTQ1, NotificationChain msgs) {
		VTQ1CONTENT oldVTQ1 = vTQ1;
		vTQ1 = newVTQ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ1, oldVTQ1, newVTQ1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVTQ1(VTQ1CONTENT newVTQ1) {
		if (newVTQ1 != vTQ1) {
			NotificationChain msgs = null;
			if (vTQ1 != null)
				msgs = ((InternalEObject)vTQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ1, null, msgs);
			if (newVTQ1 != null)
				msgs = ((InternalEObject)newVTQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ1, null, msgs);
			msgs = basicSetVTQ1(newVTQ1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ1, newVTQ1, newVTQ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTQ2CONTENT getVTQ2() {
		return vTQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVTQ2(VTQ2CONTENT newVTQ2, NotificationChain msgs) {
		VTQ2CONTENT oldVTQ2 = vTQ2;
		vTQ2 = newVTQ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ2, oldVTQ2, newVTQ2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVTQ2(VTQ2CONTENT newVTQ2) {
		if (newVTQ2 != vTQ2) {
			NotificationChain msgs = null;
			if (vTQ2 != null)
				msgs = ((InternalEObject)vTQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ2, null, msgs);
			if (newVTQ2 != null)
				msgs = ((InternalEObject)newVTQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ2, null, msgs);
			msgs = basicSetVTQ2(newVTQ2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ2, newVTQ2, newVTQ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTQ3CONTENT getVTQ3() {
		return vTQ3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVTQ3(VTQ3CONTENT newVTQ3, NotificationChain msgs) {
		VTQ3CONTENT oldVTQ3 = vTQ3;
		vTQ3 = newVTQ3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ3, oldVTQ3, newVTQ3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVTQ3(VTQ3CONTENT newVTQ3) {
		if (newVTQ3 != vTQ3) {
			NotificationChain msgs = null;
			if (vTQ3 != null)
				msgs = ((InternalEObject)vTQ3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ3, null, msgs);
			if (newVTQ3 != null)
				msgs = ((InternalEObject)newVTQ3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ3, null, msgs);
			msgs = basicSetVTQ3(newVTQ3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ3, newVTQ3, newVTQ3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTQ4CONTENT getVTQ4() {
		return vTQ4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVTQ4(VTQ4CONTENT newVTQ4, NotificationChain msgs) {
		VTQ4CONTENT oldVTQ4 = vTQ4;
		vTQ4 = newVTQ4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ4, oldVTQ4, newVTQ4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVTQ4(VTQ4CONTENT newVTQ4) {
		if (newVTQ4 != vTQ4) {
			NotificationChain msgs = null;
			if (vTQ4 != null)
				msgs = ((InternalEObject)vTQ4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ4, null, msgs);
			if (newVTQ4 != null)
				msgs = ((InternalEObject)newVTQ4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VTQCONTENT__VTQ4, null, msgs);
			msgs = basicSetVTQ4(newVTQ4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VTQCONTENT__VTQ4, newVTQ4, newVTQ4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VTQ5CONTENT> getVTQ5() {
		if (vTQ5 == null) {
			vTQ5 = new EObjectContainmentEList<VTQ5CONTENT>(VTQ5CONTENT.class, this, V2xmlPackage.VTQCONTENT__VTQ5);
		}
		return vTQ5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.VTQCONTENT__ANY);
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
			case V2xmlPackage.VTQCONTENT__VTQ1:
				return basicSetVTQ1(null, msgs);
			case V2xmlPackage.VTQCONTENT__VTQ2:
				return basicSetVTQ2(null, msgs);
			case V2xmlPackage.VTQCONTENT__VTQ3:
				return basicSetVTQ3(null, msgs);
			case V2xmlPackage.VTQCONTENT__VTQ4:
				return basicSetVTQ4(null, msgs);
			case V2xmlPackage.VTQCONTENT__VTQ5:
				return ((InternalEList<?>)getVTQ5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.VTQCONTENT__ANY:
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
			case V2xmlPackage.VTQCONTENT__VTQ1:
				return getVTQ1();
			case V2xmlPackage.VTQCONTENT__VTQ2:
				return getVTQ2();
			case V2xmlPackage.VTQCONTENT__VTQ3:
				return getVTQ3();
			case V2xmlPackage.VTQCONTENT__VTQ4:
				return getVTQ4();
			case V2xmlPackage.VTQCONTENT__VTQ5:
				return getVTQ5();
			case V2xmlPackage.VTQCONTENT__ANY:
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
			case V2xmlPackage.VTQCONTENT__VTQ1:
				setVTQ1((VTQ1CONTENT)newValue);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ2:
				setVTQ2((VTQ2CONTENT)newValue);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ3:
				setVTQ3((VTQ3CONTENT)newValue);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ4:
				setVTQ4((VTQ4CONTENT)newValue);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ5:
				getVTQ5().clear();
				getVTQ5().addAll((Collection<? extends VTQ5CONTENT>)newValue);
				return;
			case V2xmlPackage.VTQCONTENT__ANY:
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
			case V2xmlPackage.VTQCONTENT__VTQ1:
				setVTQ1((VTQ1CONTENT)null);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ2:
				setVTQ2((VTQ2CONTENT)null);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ3:
				setVTQ3((VTQ3CONTENT)null);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ4:
				setVTQ4((VTQ4CONTENT)null);
				return;
			case V2xmlPackage.VTQCONTENT__VTQ5:
				getVTQ5().clear();
				return;
			case V2xmlPackage.VTQCONTENT__ANY:
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
			case V2xmlPackage.VTQCONTENT__VTQ1:
				return vTQ1 != null;
			case V2xmlPackage.VTQCONTENT__VTQ2:
				return vTQ2 != null;
			case V2xmlPackage.VTQCONTENT__VTQ3:
				return vTQ3 != null;
			case V2xmlPackage.VTQCONTENT__VTQ4:
				return vTQ4 != null;
			case V2xmlPackage.VTQCONTENT__VTQ5:
				return vTQ5 != null && !vTQ5.isEmpty();
			case V2xmlPackage.VTQCONTENT__ANY:
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

} //VTQCONTENTImpl
