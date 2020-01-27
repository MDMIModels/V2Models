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

import org.hl7.v2xml.OM51CONTENT;
import org.hl7.v2xml.OM52CONTENT;
import org.hl7.v2xml.OM53CONTENT;
import org.hl7.v2xml.OM5CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM5CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM5CONTENTImpl#getOM51 <em>OM51</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM5CONTENTImpl#getOM52 <em>OM52</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM5CONTENTImpl#getOM53 <em>OM53</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM5CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM5CONTENTImpl extends EObjectImpl implements OM5CONTENT {
	/**
	 * The cached value of the '{@link #getOM51() <em>OM51</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM51()
	 * @generated
	 * @ordered
	 */
	protected OM51CONTENT oM51;

	/**
	 * The cached value of the '{@link #getOM52() <em>OM52</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM52()
	 * @generated
	 * @ordered
	 */
	protected EList<OM52CONTENT> oM52;

	/**
	 * The cached value of the '{@link #getOM53() <em>OM53</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM53()
	 * @generated
	 * @ordered
	 */
	protected OM53CONTENT oM53;

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
	protected OM5CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM5CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM51CONTENT getOM51() {
		return oM51;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM51(OM51CONTENT newOM51, NotificationChain msgs) {
		OM51CONTENT oldOM51 = oM51;
		oM51 = newOM51;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM5CONTENT__OM51, oldOM51, newOM51);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM51(OM51CONTENT newOM51) {
		if (newOM51 != oM51) {
			NotificationChain msgs = null;
			if (oM51 != null)
				msgs = ((InternalEObject)oM51).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM5CONTENT__OM51, null, msgs);
			if (newOM51 != null)
				msgs = ((InternalEObject)newOM51).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM5CONTENT__OM51, null, msgs);
			msgs = basicSetOM51(newOM51, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM5CONTENT__OM51, newOM51, newOM51));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM52CONTENT> getOM52() {
		if (oM52 == null) {
			oM52 = new EObjectContainmentEList<OM52CONTENT>(OM52CONTENT.class, this, V2xmlPackage.OM5CONTENT__OM52);
		}
		return oM52;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM53CONTENT getOM53() {
		return oM53;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM53(OM53CONTENT newOM53, NotificationChain msgs) {
		OM53CONTENT oldOM53 = oM53;
		oM53 = newOM53;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM5CONTENT__OM53, oldOM53, newOM53);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM53(OM53CONTENT newOM53) {
		if (newOM53 != oM53) {
			NotificationChain msgs = null;
			if (oM53 != null)
				msgs = ((InternalEObject)oM53).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM5CONTENT__OM53, null, msgs);
			if (newOM53 != null)
				msgs = ((InternalEObject)newOM53).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM5CONTENT__OM53, null, msgs);
			msgs = basicSetOM53(newOM53, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM5CONTENT__OM53, newOM53, newOM53));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM5CONTENT__ANY);
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
			case V2xmlPackage.OM5CONTENT__OM51:
				return basicSetOM51(null, msgs);
			case V2xmlPackage.OM5CONTENT__OM52:
				return ((InternalEList<?>)getOM52()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM5CONTENT__OM53:
				return basicSetOM53(null, msgs);
			case V2xmlPackage.OM5CONTENT__ANY:
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
			case V2xmlPackage.OM5CONTENT__OM51:
				return getOM51();
			case V2xmlPackage.OM5CONTENT__OM52:
				return getOM52();
			case V2xmlPackage.OM5CONTENT__OM53:
				return getOM53();
			case V2xmlPackage.OM5CONTENT__ANY:
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
			case V2xmlPackage.OM5CONTENT__OM51:
				setOM51((OM51CONTENT)newValue);
				return;
			case V2xmlPackage.OM5CONTENT__OM52:
				getOM52().clear();
				getOM52().addAll((Collection<? extends OM52CONTENT>)newValue);
				return;
			case V2xmlPackage.OM5CONTENT__OM53:
				setOM53((OM53CONTENT)newValue);
				return;
			case V2xmlPackage.OM5CONTENT__ANY:
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
			case V2xmlPackage.OM5CONTENT__OM51:
				setOM51((OM51CONTENT)null);
				return;
			case V2xmlPackage.OM5CONTENT__OM52:
				getOM52().clear();
				return;
			case V2xmlPackage.OM5CONTENT__OM53:
				setOM53((OM53CONTENT)null);
				return;
			case V2xmlPackage.OM5CONTENT__ANY:
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
			case V2xmlPackage.OM5CONTENT__OM51:
				return oM51 != null;
			case V2xmlPackage.OM5CONTENT__OM52:
				return oM52 != null && !oM52.isEmpty();
			case V2xmlPackage.OM5CONTENT__OM53:
				return oM53 != null;
			case V2xmlPackage.OM5CONTENT__ANY:
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

} //OM5CONTENTImpl
