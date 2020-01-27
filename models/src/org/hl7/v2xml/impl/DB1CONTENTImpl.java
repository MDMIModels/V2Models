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

import org.hl7.v2xml.DB11CONTENT;
import org.hl7.v2xml.DB12CONTENT;
import org.hl7.v2xml.DB13CONTENT;
import org.hl7.v2xml.DB14CONTENT;
import org.hl7.v2xml.DB15CONTENT;
import org.hl7.v2xml.DB16CONTENT;
import org.hl7.v2xml.DB17CONTENT;
import org.hl7.v2xml.DB18CONTENT;
import org.hl7.v2xml.DB1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DB1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB11 <em>DB11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB12 <em>DB12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB13 <em>DB13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB14 <em>DB14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB15 <em>DB15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB16 <em>DB16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB17 <em>DB17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getDB18 <em>DB18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DB1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DB1CONTENTImpl extends EObjectImpl implements DB1CONTENT {
	/**
	 * The cached value of the '{@link #getDB11() <em>DB11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB11()
	 * @generated
	 * @ordered
	 */
	protected DB11CONTENT dB11;

	/**
	 * The cached value of the '{@link #getDB12() <em>DB12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB12()
	 * @generated
	 * @ordered
	 */
	protected DB12CONTENT dB12;

	/**
	 * The cached value of the '{@link #getDB13() <em>DB13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB13()
	 * @generated
	 * @ordered
	 */
	protected EList<DB13CONTENT> dB13;

	/**
	 * The cached value of the '{@link #getDB14() <em>DB14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB14()
	 * @generated
	 * @ordered
	 */
	protected DB14CONTENT dB14;

	/**
	 * The cached value of the '{@link #getDB15() <em>DB15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB15()
	 * @generated
	 * @ordered
	 */
	protected DB15CONTENT dB15;

	/**
	 * The cached value of the '{@link #getDB16() <em>DB16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB16()
	 * @generated
	 * @ordered
	 */
	protected DB16CONTENT dB16;

	/**
	 * The cached value of the '{@link #getDB17() <em>DB17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB17()
	 * @generated
	 * @ordered
	 */
	protected DB17CONTENT dB17;

	/**
	 * The cached value of the '{@link #getDB18() <em>DB18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDB18()
	 * @generated
	 * @ordered
	 */
	protected DB18CONTENT dB18;

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
	protected DB1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDB1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB11CONTENT getDB11() {
		return dB11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB11(DB11CONTENT newDB11, NotificationChain msgs) {
		DB11CONTENT oldDB11 = dB11;
		dB11 = newDB11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB11, oldDB11, newDB11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB11(DB11CONTENT newDB11) {
		if (newDB11 != dB11) {
			NotificationChain msgs = null;
			if (dB11 != null)
				msgs = ((InternalEObject)dB11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB11, null, msgs);
			if (newDB11 != null)
				msgs = ((InternalEObject)newDB11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB11, null, msgs);
			msgs = basicSetDB11(newDB11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB11, newDB11, newDB11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB12CONTENT getDB12() {
		return dB12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB12(DB12CONTENT newDB12, NotificationChain msgs) {
		DB12CONTENT oldDB12 = dB12;
		dB12 = newDB12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB12, oldDB12, newDB12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB12(DB12CONTENT newDB12) {
		if (newDB12 != dB12) {
			NotificationChain msgs = null;
			if (dB12 != null)
				msgs = ((InternalEObject)dB12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB12, null, msgs);
			if (newDB12 != null)
				msgs = ((InternalEObject)newDB12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB12, null, msgs);
			msgs = basicSetDB12(newDB12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB12, newDB12, newDB12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DB13CONTENT> getDB13() {
		if (dB13 == null) {
			dB13 = new EObjectContainmentEList<DB13CONTENT>(DB13CONTENT.class, this, V2xmlPackage.DB1CONTENT__DB13);
		}
		return dB13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB14CONTENT getDB14() {
		return dB14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB14(DB14CONTENT newDB14, NotificationChain msgs) {
		DB14CONTENT oldDB14 = dB14;
		dB14 = newDB14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB14, oldDB14, newDB14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB14(DB14CONTENT newDB14) {
		if (newDB14 != dB14) {
			NotificationChain msgs = null;
			if (dB14 != null)
				msgs = ((InternalEObject)dB14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB14, null, msgs);
			if (newDB14 != null)
				msgs = ((InternalEObject)newDB14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB14, null, msgs);
			msgs = basicSetDB14(newDB14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB14, newDB14, newDB14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB15CONTENT getDB15() {
		return dB15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB15(DB15CONTENT newDB15, NotificationChain msgs) {
		DB15CONTENT oldDB15 = dB15;
		dB15 = newDB15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB15, oldDB15, newDB15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB15(DB15CONTENT newDB15) {
		if (newDB15 != dB15) {
			NotificationChain msgs = null;
			if (dB15 != null)
				msgs = ((InternalEObject)dB15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB15, null, msgs);
			if (newDB15 != null)
				msgs = ((InternalEObject)newDB15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB15, null, msgs);
			msgs = basicSetDB15(newDB15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB15, newDB15, newDB15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB16CONTENT getDB16() {
		return dB16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB16(DB16CONTENT newDB16, NotificationChain msgs) {
		DB16CONTENT oldDB16 = dB16;
		dB16 = newDB16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB16, oldDB16, newDB16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB16(DB16CONTENT newDB16) {
		if (newDB16 != dB16) {
			NotificationChain msgs = null;
			if (dB16 != null)
				msgs = ((InternalEObject)dB16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB16, null, msgs);
			if (newDB16 != null)
				msgs = ((InternalEObject)newDB16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB16, null, msgs);
			msgs = basicSetDB16(newDB16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB16, newDB16, newDB16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB17CONTENT getDB17() {
		return dB17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB17(DB17CONTENT newDB17, NotificationChain msgs) {
		DB17CONTENT oldDB17 = dB17;
		dB17 = newDB17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB17, oldDB17, newDB17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB17(DB17CONTENT newDB17) {
		if (newDB17 != dB17) {
			NotificationChain msgs = null;
			if (dB17 != null)
				msgs = ((InternalEObject)dB17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB17, null, msgs);
			if (newDB17 != null)
				msgs = ((InternalEObject)newDB17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB17, null, msgs);
			msgs = basicSetDB17(newDB17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB17, newDB17, newDB17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DB18CONTENT getDB18() {
		return dB18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDB18(DB18CONTENT newDB18, NotificationChain msgs) {
		DB18CONTENT oldDB18 = dB18;
		dB18 = newDB18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB18, oldDB18, newDB18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDB18(DB18CONTENT newDB18) {
		if (newDB18 != dB18) {
			NotificationChain msgs = null;
			if (dB18 != null)
				msgs = ((InternalEObject)dB18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB18, null, msgs);
			if (newDB18 != null)
				msgs = ((InternalEObject)newDB18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DB1CONTENT__DB18, null, msgs);
			msgs = basicSetDB18(newDB18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DB1CONTENT__DB18, newDB18, newDB18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.DB1CONTENT__ANY);
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
			case V2xmlPackage.DB1CONTENT__DB11:
				return basicSetDB11(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB12:
				return basicSetDB12(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB13:
				return ((InternalEList<?>)getDB13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.DB1CONTENT__DB14:
				return basicSetDB14(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB15:
				return basicSetDB15(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB16:
				return basicSetDB16(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB17:
				return basicSetDB17(null, msgs);
			case V2xmlPackage.DB1CONTENT__DB18:
				return basicSetDB18(null, msgs);
			case V2xmlPackage.DB1CONTENT__ANY:
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
			case V2xmlPackage.DB1CONTENT__DB11:
				return getDB11();
			case V2xmlPackage.DB1CONTENT__DB12:
				return getDB12();
			case V2xmlPackage.DB1CONTENT__DB13:
				return getDB13();
			case V2xmlPackage.DB1CONTENT__DB14:
				return getDB14();
			case V2xmlPackage.DB1CONTENT__DB15:
				return getDB15();
			case V2xmlPackage.DB1CONTENT__DB16:
				return getDB16();
			case V2xmlPackage.DB1CONTENT__DB17:
				return getDB17();
			case V2xmlPackage.DB1CONTENT__DB18:
				return getDB18();
			case V2xmlPackage.DB1CONTENT__ANY:
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
			case V2xmlPackage.DB1CONTENT__DB11:
				setDB11((DB11CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB12:
				setDB12((DB12CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB13:
				getDB13().clear();
				getDB13().addAll((Collection<? extends DB13CONTENT>)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB14:
				setDB14((DB14CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB15:
				setDB15((DB15CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB16:
				setDB16((DB16CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB17:
				setDB17((DB17CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__DB18:
				setDB18((DB18CONTENT)newValue);
				return;
			case V2xmlPackage.DB1CONTENT__ANY:
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
			case V2xmlPackage.DB1CONTENT__DB11:
				setDB11((DB11CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB12:
				setDB12((DB12CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB13:
				getDB13().clear();
				return;
			case V2xmlPackage.DB1CONTENT__DB14:
				setDB14((DB14CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB15:
				setDB15((DB15CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB16:
				setDB16((DB16CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB17:
				setDB17((DB17CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__DB18:
				setDB18((DB18CONTENT)null);
				return;
			case V2xmlPackage.DB1CONTENT__ANY:
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
			case V2xmlPackage.DB1CONTENT__DB11:
				return dB11 != null;
			case V2xmlPackage.DB1CONTENT__DB12:
				return dB12 != null;
			case V2xmlPackage.DB1CONTENT__DB13:
				return dB13 != null && !dB13.isEmpty();
			case V2xmlPackage.DB1CONTENT__DB14:
				return dB14 != null;
			case V2xmlPackage.DB1CONTENT__DB15:
				return dB15 != null;
			case V2xmlPackage.DB1CONTENT__DB16:
				return dB16 != null;
			case V2xmlPackage.DB1CONTENT__DB17:
				return dB17 != null;
			case V2xmlPackage.DB1CONTENT__DB18:
				return dB18 != null;
			case V2xmlPackage.DB1CONTENT__ANY:
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

} //DB1CONTENTImpl
