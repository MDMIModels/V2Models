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

import org.hl7.v2xml.NPU1CONTENT;
import org.hl7.v2xml.NPU2CONTENT;
import org.hl7.v2xml.NPUCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NPUCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NPUCONTENTImpl#getNPU1 <em>NPU1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NPUCONTENTImpl#getNPU2 <em>NPU2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NPUCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NPUCONTENTImpl extends EObjectImpl implements NPUCONTENT {
	/**
	 * The cached value of the '{@link #getNPU1() <em>NPU1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPU1()
	 * @generated
	 * @ordered
	 */
	protected NPU1CONTENT nPU1;

	/**
	 * The cached value of the '{@link #getNPU2() <em>NPU2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNPU2()
	 * @generated
	 * @ordered
	 */
	protected NPU2CONTENT nPU2;

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
	protected NPUCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNPUCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPU1CONTENT getNPU1() {
		return nPU1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNPU1(NPU1CONTENT newNPU1, NotificationChain msgs) {
		NPU1CONTENT oldNPU1 = nPU1;
		nPU1 = newNPU1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NPUCONTENT__NPU1, oldNPU1, newNPU1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNPU1(NPU1CONTENT newNPU1) {
		if (newNPU1 != nPU1) {
			NotificationChain msgs = null;
			if (nPU1 != null)
				msgs = ((InternalEObject)nPU1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NPUCONTENT__NPU1, null, msgs);
			if (newNPU1 != null)
				msgs = ((InternalEObject)newNPU1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NPUCONTENT__NPU1, null, msgs);
			msgs = basicSetNPU1(newNPU1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NPUCONTENT__NPU1, newNPU1, newNPU1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NPU2CONTENT getNPU2() {
		return nPU2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNPU2(NPU2CONTENT newNPU2, NotificationChain msgs) {
		NPU2CONTENT oldNPU2 = nPU2;
		nPU2 = newNPU2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NPUCONTENT__NPU2, oldNPU2, newNPU2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNPU2(NPU2CONTENT newNPU2) {
		if (newNPU2 != nPU2) {
			NotificationChain msgs = null;
			if (nPU2 != null)
				msgs = ((InternalEObject)nPU2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NPUCONTENT__NPU2, null, msgs);
			if (newNPU2 != null)
				msgs = ((InternalEObject)newNPU2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NPUCONTENT__NPU2, null, msgs);
			msgs = basicSetNPU2(newNPU2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NPUCONTENT__NPU2, newNPU2, newNPU2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NPUCONTENT__ANY);
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
			case V2xmlPackage.NPUCONTENT__NPU1:
				return basicSetNPU1(null, msgs);
			case V2xmlPackage.NPUCONTENT__NPU2:
				return basicSetNPU2(null, msgs);
			case V2xmlPackage.NPUCONTENT__ANY:
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
			case V2xmlPackage.NPUCONTENT__NPU1:
				return getNPU1();
			case V2xmlPackage.NPUCONTENT__NPU2:
				return getNPU2();
			case V2xmlPackage.NPUCONTENT__ANY:
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
			case V2xmlPackage.NPUCONTENT__NPU1:
				setNPU1((NPU1CONTENT)newValue);
				return;
			case V2xmlPackage.NPUCONTENT__NPU2:
				setNPU2((NPU2CONTENT)newValue);
				return;
			case V2xmlPackage.NPUCONTENT__ANY:
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
			case V2xmlPackage.NPUCONTENT__NPU1:
				setNPU1((NPU1CONTENT)null);
				return;
			case V2xmlPackage.NPUCONTENT__NPU2:
				setNPU2((NPU2CONTENT)null);
				return;
			case V2xmlPackage.NPUCONTENT__ANY:
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
			case V2xmlPackage.NPUCONTENT__NPU1:
				return nPU1 != null;
			case V2xmlPackage.NPUCONTENT__NPU2:
				return nPU2 != null;
			case V2xmlPackage.NPUCONTENT__ANY:
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

} //NPUCONTENTImpl
