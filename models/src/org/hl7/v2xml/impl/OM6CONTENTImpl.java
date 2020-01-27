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

import org.hl7.v2xml.OM61CONTENT;
import org.hl7.v2xml.OM62CONTENT;
import org.hl7.v2xml.OM6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM6CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM6CONTENTImpl#getOM61 <em>OM61</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM6CONTENTImpl#getOM62 <em>OM62</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM6CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM6CONTENTImpl extends EObjectImpl implements OM6CONTENT {
	/**
	 * The cached value of the '{@link #getOM61() <em>OM61</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM61()
	 * @generated
	 * @ordered
	 */
	protected OM61CONTENT oM61;

	/**
	 * The cached value of the '{@link #getOM62() <em>OM62</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM62()
	 * @generated
	 * @ordered
	 */
	protected OM62CONTENT oM62;

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
	protected OM6CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM6CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM61CONTENT getOM61() {
		return oM61;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM61(OM61CONTENT newOM61, NotificationChain msgs) {
		OM61CONTENT oldOM61 = oM61;
		oM61 = newOM61;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM6CONTENT__OM61, oldOM61, newOM61);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM61(OM61CONTENT newOM61) {
		if (newOM61 != oM61) {
			NotificationChain msgs = null;
			if (oM61 != null)
				msgs = ((InternalEObject)oM61).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM6CONTENT__OM61, null, msgs);
			if (newOM61 != null)
				msgs = ((InternalEObject)newOM61).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM6CONTENT__OM61, null, msgs);
			msgs = basicSetOM61(newOM61, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM6CONTENT__OM61, newOM61, newOM61));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM62CONTENT getOM62() {
		return oM62;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM62(OM62CONTENT newOM62, NotificationChain msgs) {
		OM62CONTENT oldOM62 = oM62;
		oM62 = newOM62;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM6CONTENT__OM62, oldOM62, newOM62);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM62(OM62CONTENT newOM62) {
		if (newOM62 != oM62) {
			NotificationChain msgs = null;
			if (oM62 != null)
				msgs = ((InternalEObject)oM62).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM6CONTENT__OM62, null, msgs);
			if (newOM62 != null)
				msgs = ((InternalEObject)newOM62).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM6CONTENT__OM62, null, msgs);
			msgs = basicSetOM62(newOM62, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM6CONTENT__OM62, newOM62, newOM62));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM6CONTENT__ANY);
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
			case V2xmlPackage.OM6CONTENT__OM61:
				return basicSetOM61(null, msgs);
			case V2xmlPackage.OM6CONTENT__OM62:
				return basicSetOM62(null, msgs);
			case V2xmlPackage.OM6CONTENT__ANY:
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
			case V2xmlPackage.OM6CONTENT__OM61:
				return getOM61();
			case V2xmlPackage.OM6CONTENT__OM62:
				return getOM62();
			case V2xmlPackage.OM6CONTENT__ANY:
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
			case V2xmlPackage.OM6CONTENT__OM61:
				setOM61((OM61CONTENT)newValue);
				return;
			case V2xmlPackage.OM6CONTENT__OM62:
				setOM62((OM62CONTENT)newValue);
				return;
			case V2xmlPackage.OM6CONTENT__ANY:
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
			case V2xmlPackage.OM6CONTENT__OM61:
				setOM61((OM61CONTENT)null);
				return;
			case V2xmlPackage.OM6CONTENT__OM62:
				setOM62((OM62CONTENT)null);
				return;
			case V2xmlPackage.OM6CONTENT__ANY:
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
			case V2xmlPackage.OM6CONTENT__OM61:
				return oM61 != null;
			case V2xmlPackage.OM6CONTENT__OM62:
				return oM62 != null;
			case V2xmlPackage.OM6CONTENT__ANY:
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

} //OM6CONTENTImpl
