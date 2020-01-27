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

import org.hl7.v2xml.CM21CONTENT;
import org.hl7.v2xml.CM22CONTENT;
import org.hl7.v2xml.CM23CONTENT;
import org.hl7.v2xml.CM24CONTENT;
import org.hl7.v2xml.CM2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CM2CONTENTImpl#getCM21 <em>CM21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM2CONTENTImpl#getCM22 <em>CM22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM2CONTENTImpl#getCM23 <em>CM23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM2CONTENTImpl#getCM24 <em>CM24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CM2CONTENTImpl extends EObjectImpl implements CM2CONTENT {
	/**
	 * The cached value of the '{@link #getCM21() <em>CM21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM21()
	 * @generated
	 * @ordered
	 */
	protected CM21CONTENT cM21;

	/**
	 * The cached value of the '{@link #getCM22() <em>CM22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM22()
	 * @generated
	 * @ordered
	 */
	protected CM22CONTENT cM22;

	/**
	 * The cached value of the '{@link #getCM23() <em>CM23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM23()
	 * @generated
	 * @ordered
	 */
	protected CM23CONTENT cM23;

	/**
	 * The cached value of the '{@link #getCM24() <em>CM24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM24()
	 * @generated
	 * @ordered
	 */
	protected EList<CM24CONTENT> cM24;

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
	protected CM2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCM2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM21CONTENT getCM21() {
		return cM21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM21(CM21CONTENT newCM21, NotificationChain msgs) {
		CM21CONTENT oldCM21 = cM21;
		cM21 = newCM21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM21, oldCM21, newCM21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM21(CM21CONTENT newCM21) {
		if (newCM21 != cM21) {
			NotificationChain msgs = null;
			if (cM21 != null)
				msgs = ((InternalEObject)cM21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM21, null, msgs);
			if (newCM21 != null)
				msgs = ((InternalEObject)newCM21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM21, null, msgs);
			msgs = basicSetCM21(newCM21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM21, newCM21, newCM21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM22CONTENT getCM22() {
		return cM22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM22(CM22CONTENT newCM22, NotificationChain msgs) {
		CM22CONTENT oldCM22 = cM22;
		cM22 = newCM22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM22, oldCM22, newCM22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM22(CM22CONTENT newCM22) {
		if (newCM22 != cM22) {
			NotificationChain msgs = null;
			if (cM22 != null)
				msgs = ((InternalEObject)cM22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM22, null, msgs);
			if (newCM22 != null)
				msgs = ((InternalEObject)newCM22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM22, null, msgs);
			msgs = basicSetCM22(newCM22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM22, newCM22, newCM22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM23CONTENT getCM23() {
		return cM23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM23(CM23CONTENT newCM23, NotificationChain msgs) {
		CM23CONTENT oldCM23 = cM23;
		cM23 = newCM23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM23, oldCM23, newCM23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM23(CM23CONTENT newCM23) {
		if (newCM23 != cM23) {
			NotificationChain msgs = null;
			if (cM23 != null)
				msgs = ((InternalEObject)cM23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM23, null, msgs);
			if (newCM23 != null)
				msgs = ((InternalEObject)newCM23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM2CONTENT__CM23, null, msgs);
			msgs = basicSetCM23(newCM23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM2CONTENT__CM23, newCM23, newCM23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM24CONTENT> getCM24() {
		if (cM24 == null) {
			cM24 = new EObjectContainmentEList<CM24CONTENT>(CM24CONTENT.class, this, V2xmlPackage.CM2CONTENT__CM24);
		}
		return cM24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CM2CONTENT__ANY);
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
			case V2xmlPackage.CM2CONTENT__CM21:
				return basicSetCM21(null, msgs);
			case V2xmlPackage.CM2CONTENT__CM22:
				return basicSetCM22(null, msgs);
			case V2xmlPackage.CM2CONTENT__CM23:
				return basicSetCM23(null, msgs);
			case V2xmlPackage.CM2CONTENT__CM24:
				return ((InternalEList<?>)getCM24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CM2CONTENT__ANY:
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
			case V2xmlPackage.CM2CONTENT__CM21:
				return getCM21();
			case V2xmlPackage.CM2CONTENT__CM22:
				return getCM22();
			case V2xmlPackage.CM2CONTENT__CM23:
				return getCM23();
			case V2xmlPackage.CM2CONTENT__CM24:
				return getCM24();
			case V2xmlPackage.CM2CONTENT__ANY:
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
			case V2xmlPackage.CM2CONTENT__CM21:
				setCM21((CM21CONTENT)newValue);
				return;
			case V2xmlPackage.CM2CONTENT__CM22:
				setCM22((CM22CONTENT)newValue);
				return;
			case V2xmlPackage.CM2CONTENT__CM23:
				setCM23((CM23CONTENT)newValue);
				return;
			case V2xmlPackage.CM2CONTENT__CM24:
				getCM24().clear();
				getCM24().addAll((Collection<? extends CM24CONTENT>)newValue);
				return;
			case V2xmlPackage.CM2CONTENT__ANY:
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
			case V2xmlPackage.CM2CONTENT__CM21:
				setCM21((CM21CONTENT)null);
				return;
			case V2xmlPackage.CM2CONTENT__CM22:
				setCM22((CM22CONTENT)null);
				return;
			case V2xmlPackage.CM2CONTENT__CM23:
				setCM23((CM23CONTENT)null);
				return;
			case V2xmlPackage.CM2CONTENT__CM24:
				getCM24().clear();
				return;
			case V2xmlPackage.CM2CONTENT__ANY:
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
			case V2xmlPackage.CM2CONTENT__CM21:
				return cM21 != null;
			case V2xmlPackage.CM2CONTENT__CM22:
				return cM22 != null;
			case V2xmlPackage.CM2CONTENT__CM23:
				return cM23 != null;
			case V2xmlPackage.CM2CONTENT__CM24:
				return cM24 != null && !cM24.isEmpty();
			case V2xmlPackage.CM2CONTENT__ANY:
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

} //CM2CONTENTImpl
