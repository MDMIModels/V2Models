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

import org.hl7.v2xml.OM31CONTENT;
import org.hl7.v2xml.OM32CONTENT;
import org.hl7.v2xml.OM33CONTENT;
import org.hl7.v2xml.OM34CONTENT;
import org.hl7.v2xml.OM35CONTENT;
import org.hl7.v2xml.OM36CONTENT;
import org.hl7.v2xml.OM37CONTENT;
import org.hl7.v2xml.OM3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM3CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM31 <em>OM31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM32 <em>OM32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM33 <em>OM33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM34 <em>OM34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM35 <em>OM35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM36 <em>OM36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getOM37 <em>OM37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM3CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM3CONTENTImpl extends EObjectImpl implements OM3CONTENT {
	/**
	 * The cached value of the '{@link #getOM31() <em>OM31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM31()
	 * @generated
	 * @ordered
	 */
	protected OM31CONTENT oM31;

	/**
	 * The cached value of the '{@link #getOM32() <em>OM32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM32()
	 * @generated
	 * @ordered
	 */
	protected OM32CONTENT oM32;

	/**
	 * The cached value of the '{@link #getOM33() <em>OM33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM33()
	 * @generated
	 * @ordered
	 */
	protected OM33CONTENT oM33;

	/**
	 * The cached value of the '{@link #getOM34() <em>OM34</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM34()
	 * @generated
	 * @ordered
	 */
	protected EList<OM34CONTENT> oM34;

	/**
	 * The cached value of the '{@link #getOM35() <em>OM35</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM35()
	 * @generated
	 * @ordered
	 */
	protected EList<OM35CONTENT> oM35;

	/**
	 * The cached value of the '{@link #getOM36() <em>OM36</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM36()
	 * @generated
	 * @ordered
	 */
	protected EList<OM36CONTENT> oM36;

	/**
	 * The cached value of the '{@link #getOM37() <em>OM37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM37()
	 * @generated
	 * @ordered
	 */
	protected OM37CONTENT oM37;

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
	protected OM3CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM3CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM31CONTENT getOM31() {
		return oM31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM31(OM31CONTENT newOM31, NotificationChain msgs) {
		OM31CONTENT oldOM31 = oM31;
		oM31 = newOM31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM31, oldOM31, newOM31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM31(OM31CONTENT newOM31) {
		if (newOM31 != oM31) {
			NotificationChain msgs = null;
			if (oM31 != null)
				msgs = ((InternalEObject)oM31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM31, null, msgs);
			if (newOM31 != null)
				msgs = ((InternalEObject)newOM31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM31, null, msgs);
			msgs = basicSetOM31(newOM31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM31, newOM31, newOM31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM32CONTENT getOM32() {
		return oM32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM32(OM32CONTENT newOM32, NotificationChain msgs) {
		OM32CONTENT oldOM32 = oM32;
		oM32 = newOM32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM32, oldOM32, newOM32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM32(OM32CONTENT newOM32) {
		if (newOM32 != oM32) {
			NotificationChain msgs = null;
			if (oM32 != null)
				msgs = ((InternalEObject)oM32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM32, null, msgs);
			if (newOM32 != null)
				msgs = ((InternalEObject)newOM32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM32, null, msgs);
			msgs = basicSetOM32(newOM32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM32, newOM32, newOM32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM33CONTENT getOM33() {
		return oM33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM33(OM33CONTENT newOM33, NotificationChain msgs) {
		OM33CONTENT oldOM33 = oM33;
		oM33 = newOM33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM33, oldOM33, newOM33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM33(OM33CONTENT newOM33) {
		if (newOM33 != oM33) {
			NotificationChain msgs = null;
			if (oM33 != null)
				msgs = ((InternalEObject)oM33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM33, null, msgs);
			if (newOM33 != null)
				msgs = ((InternalEObject)newOM33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM33, null, msgs);
			msgs = basicSetOM33(newOM33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM33, newOM33, newOM33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM34CONTENT> getOM34() {
		if (oM34 == null) {
			oM34 = new EObjectContainmentEList<OM34CONTENT>(OM34CONTENT.class, this, V2xmlPackage.OM3CONTENT__OM34);
		}
		return oM34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM35CONTENT> getOM35() {
		if (oM35 == null) {
			oM35 = new EObjectContainmentEList<OM35CONTENT>(OM35CONTENT.class, this, V2xmlPackage.OM3CONTENT__OM35);
		}
		return oM35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM36CONTENT> getOM36() {
		if (oM36 == null) {
			oM36 = new EObjectContainmentEList<OM36CONTENT>(OM36CONTENT.class, this, V2xmlPackage.OM3CONTENT__OM36);
		}
		return oM36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM37CONTENT getOM37() {
		return oM37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM37(OM37CONTENT newOM37, NotificationChain msgs) {
		OM37CONTENT oldOM37 = oM37;
		oM37 = newOM37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM37, oldOM37, newOM37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM37(OM37CONTENT newOM37) {
		if (newOM37 != oM37) {
			NotificationChain msgs = null;
			if (oM37 != null)
				msgs = ((InternalEObject)oM37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM37, null, msgs);
			if (newOM37 != null)
				msgs = ((InternalEObject)newOM37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM3CONTENT__OM37, null, msgs);
			msgs = basicSetOM37(newOM37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM3CONTENT__OM37, newOM37, newOM37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM3CONTENT__ANY);
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
			case V2xmlPackage.OM3CONTENT__OM31:
				return basicSetOM31(null, msgs);
			case V2xmlPackage.OM3CONTENT__OM32:
				return basicSetOM32(null, msgs);
			case V2xmlPackage.OM3CONTENT__OM33:
				return basicSetOM33(null, msgs);
			case V2xmlPackage.OM3CONTENT__OM34:
				return ((InternalEList<?>)getOM34()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM3CONTENT__OM35:
				return ((InternalEList<?>)getOM35()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM3CONTENT__OM36:
				return ((InternalEList<?>)getOM36()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM3CONTENT__OM37:
				return basicSetOM37(null, msgs);
			case V2xmlPackage.OM3CONTENT__ANY:
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
			case V2xmlPackage.OM3CONTENT__OM31:
				return getOM31();
			case V2xmlPackage.OM3CONTENT__OM32:
				return getOM32();
			case V2xmlPackage.OM3CONTENT__OM33:
				return getOM33();
			case V2xmlPackage.OM3CONTENT__OM34:
				return getOM34();
			case V2xmlPackage.OM3CONTENT__OM35:
				return getOM35();
			case V2xmlPackage.OM3CONTENT__OM36:
				return getOM36();
			case V2xmlPackage.OM3CONTENT__OM37:
				return getOM37();
			case V2xmlPackage.OM3CONTENT__ANY:
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
			case V2xmlPackage.OM3CONTENT__OM31:
				setOM31((OM31CONTENT)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM32:
				setOM32((OM32CONTENT)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM33:
				setOM33((OM33CONTENT)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM34:
				getOM34().clear();
				getOM34().addAll((Collection<? extends OM34CONTENT>)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM35:
				getOM35().clear();
				getOM35().addAll((Collection<? extends OM35CONTENT>)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM36:
				getOM36().clear();
				getOM36().addAll((Collection<? extends OM36CONTENT>)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__OM37:
				setOM37((OM37CONTENT)newValue);
				return;
			case V2xmlPackage.OM3CONTENT__ANY:
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
			case V2xmlPackage.OM3CONTENT__OM31:
				setOM31((OM31CONTENT)null);
				return;
			case V2xmlPackage.OM3CONTENT__OM32:
				setOM32((OM32CONTENT)null);
				return;
			case V2xmlPackage.OM3CONTENT__OM33:
				setOM33((OM33CONTENT)null);
				return;
			case V2xmlPackage.OM3CONTENT__OM34:
				getOM34().clear();
				return;
			case V2xmlPackage.OM3CONTENT__OM35:
				getOM35().clear();
				return;
			case V2xmlPackage.OM3CONTENT__OM36:
				getOM36().clear();
				return;
			case V2xmlPackage.OM3CONTENT__OM37:
				setOM37((OM37CONTENT)null);
				return;
			case V2xmlPackage.OM3CONTENT__ANY:
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
			case V2xmlPackage.OM3CONTENT__OM31:
				return oM31 != null;
			case V2xmlPackage.OM3CONTENT__OM32:
				return oM32 != null;
			case V2xmlPackage.OM3CONTENT__OM33:
				return oM33 != null;
			case V2xmlPackage.OM3CONTENT__OM34:
				return oM34 != null && !oM34.isEmpty();
			case V2xmlPackage.OM3CONTENT__OM35:
				return oM35 != null && !oM35.isEmpty();
			case V2xmlPackage.OM3CONTENT__OM36:
				return oM36 != null && !oM36.isEmpty();
			case V2xmlPackage.OM3CONTENT__OM37:
				return oM37 != null;
			case V2xmlPackage.OM3CONTENT__ANY:
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

} //OM3CONTENTImpl
