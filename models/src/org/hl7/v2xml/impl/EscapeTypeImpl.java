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

import org.hl7.v2xml.EscapeType;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escape Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.EscapeTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EscapeTypeImpl#getEscape <em>Escape</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.EscapeTypeImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EscapeTypeImpl extends EObjectImpl implements EscapeType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getEscape() <em>Escape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEscape()
	 * @generated
	 * @ordered
	 */
	protected static final String ESCAPE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected static final String V_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected String v = V_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscapeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getEscapeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, V2xmlPackage.ESCAPE_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEscape() {
		return (String)getMixed().get(V2xmlPackage.eINSTANCE.getEscapeType_Escape(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEscape(String newEscape) {
		((FeatureMap.Internal)getMixed()).set(V2xmlPackage.eINSTANCE.getEscapeType_Escape(), newEscape);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(String newV) {
		String oldV = v;
		v = newV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ESCAPE_TYPE__V, oldV, v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.ESCAPE_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
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
			case V2xmlPackage.ESCAPE_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case V2xmlPackage.ESCAPE_TYPE__ESCAPE:
				return getEscape();
			case V2xmlPackage.ESCAPE_TYPE__V:
				return getV();
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
			case V2xmlPackage.ESCAPE_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case V2xmlPackage.ESCAPE_TYPE__ESCAPE:
				setEscape((String)newValue);
				return;
			case V2xmlPackage.ESCAPE_TYPE__V:
				setV((String)newValue);
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
			case V2xmlPackage.ESCAPE_TYPE__MIXED:
				getMixed().clear();
				return;
			case V2xmlPackage.ESCAPE_TYPE__ESCAPE:
				setEscape(ESCAPE_EDEFAULT);
				return;
			case V2xmlPackage.ESCAPE_TYPE__V:
				setV(V_EDEFAULT);
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
			case V2xmlPackage.ESCAPE_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case V2xmlPackage.ESCAPE_TYPE__ESCAPE:
				return ESCAPE_EDEFAULT == null ? getEscape() != null : !ESCAPE_EDEFAULT.equals(getEscape());
			case V2xmlPackage.ESCAPE_TYPE__V:
				return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", v: ");
		result.append(v);
		result.append(')');
		return result.toString();
	}

} //EscapeTypeImpl
