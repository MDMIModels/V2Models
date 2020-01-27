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

import org.hl7.v2xml.NDS1CONTENT;
import org.hl7.v2xml.NDS2CONTENT;
import org.hl7.v2xml.NDS3CONTENT;
import org.hl7.v2xml.NDS4CONTENT;
import org.hl7.v2xml.NDSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NDSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NDSCONTENTImpl#getNDS1 <em>NDS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDSCONTENTImpl#getNDS2 <em>NDS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDSCONTENTImpl#getNDS3 <em>NDS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDSCONTENTImpl#getNDS4 <em>NDS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NDSCONTENTImpl extends EObjectImpl implements NDSCONTENT {
	/**
	 * The cached value of the '{@link #getNDS1() <em>NDS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDS1()
	 * @generated
	 * @ordered
	 */
	protected NDS1CONTENT nDS1;

	/**
	 * The cached value of the '{@link #getNDS2() <em>NDS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDS2()
	 * @generated
	 * @ordered
	 */
	protected NDS2CONTENT nDS2;

	/**
	 * The cached value of the '{@link #getNDS3() <em>NDS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDS3()
	 * @generated
	 * @ordered
	 */
	protected NDS3CONTENT nDS3;

	/**
	 * The cached value of the '{@link #getNDS4() <em>NDS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDS4()
	 * @generated
	 * @ordered
	 */
	protected NDS4CONTENT nDS4;

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
	protected NDSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNDSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDS1CONTENT getNDS1() {
		return nDS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDS1(NDS1CONTENT newNDS1, NotificationChain msgs) {
		NDS1CONTENT oldNDS1 = nDS1;
		nDS1 = newNDS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS1, oldNDS1, newNDS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDS1(NDS1CONTENT newNDS1) {
		if (newNDS1 != nDS1) {
			NotificationChain msgs = null;
			if (nDS1 != null)
				msgs = ((InternalEObject)nDS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS1, null, msgs);
			if (newNDS1 != null)
				msgs = ((InternalEObject)newNDS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS1, null, msgs);
			msgs = basicSetNDS1(newNDS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS1, newNDS1, newNDS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDS2CONTENT getNDS2() {
		return nDS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDS2(NDS2CONTENT newNDS2, NotificationChain msgs) {
		NDS2CONTENT oldNDS2 = nDS2;
		nDS2 = newNDS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS2, oldNDS2, newNDS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDS2(NDS2CONTENT newNDS2) {
		if (newNDS2 != nDS2) {
			NotificationChain msgs = null;
			if (nDS2 != null)
				msgs = ((InternalEObject)nDS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS2, null, msgs);
			if (newNDS2 != null)
				msgs = ((InternalEObject)newNDS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS2, null, msgs);
			msgs = basicSetNDS2(newNDS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS2, newNDS2, newNDS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDS3CONTENT getNDS3() {
		return nDS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDS3(NDS3CONTENT newNDS3, NotificationChain msgs) {
		NDS3CONTENT oldNDS3 = nDS3;
		nDS3 = newNDS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS3, oldNDS3, newNDS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDS3(NDS3CONTENT newNDS3) {
		if (newNDS3 != nDS3) {
			NotificationChain msgs = null;
			if (nDS3 != null)
				msgs = ((InternalEObject)nDS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS3, null, msgs);
			if (newNDS3 != null)
				msgs = ((InternalEObject)newNDS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS3, null, msgs);
			msgs = basicSetNDS3(newNDS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS3, newNDS3, newNDS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDS4CONTENT getNDS4() {
		return nDS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDS4(NDS4CONTENT newNDS4, NotificationChain msgs) {
		NDS4CONTENT oldNDS4 = nDS4;
		nDS4 = newNDS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS4, oldNDS4, newNDS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDS4(NDS4CONTENT newNDS4) {
		if (newNDS4 != nDS4) {
			NotificationChain msgs = null;
			if (nDS4 != null)
				msgs = ((InternalEObject)nDS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS4, null, msgs);
			if (newNDS4 != null)
				msgs = ((InternalEObject)newNDS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDSCONTENT__NDS4, null, msgs);
			msgs = basicSetNDS4(newNDS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDSCONTENT__NDS4, newNDS4, newNDS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NDSCONTENT__ANY);
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
			case V2xmlPackage.NDSCONTENT__NDS1:
				return basicSetNDS1(null, msgs);
			case V2xmlPackage.NDSCONTENT__NDS2:
				return basicSetNDS2(null, msgs);
			case V2xmlPackage.NDSCONTENT__NDS3:
				return basicSetNDS3(null, msgs);
			case V2xmlPackage.NDSCONTENT__NDS4:
				return basicSetNDS4(null, msgs);
			case V2xmlPackage.NDSCONTENT__ANY:
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
			case V2xmlPackage.NDSCONTENT__NDS1:
				return getNDS1();
			case V2xmlPackage.NDSCONTENT__NDS2:
				return getNDS2();
			case V2xmlPackage.NDSCONTENT__NDS3:
				return getNDS3();
			case V2xmlPackage.NDSCONTENT__NDS4:
				return getNDS4();
			case V2xmlPackage.NDSCONTENT__ANY:
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
			case V2xmlPackage.NDSCONTENT__NDS1:
				setNDS1((NDS1CONTENT)newValue);
				return;
			case V2xmlPackage.NDSCONTENT__NDS2:
				setNDS2((NDS2CONTENT)newValue);
				return;
			case V2xmlPackage.NDSCONTENT__NDS3:
				setNDS3((NDS3CONTENT)newValue);
				return;
			case V2xmlPackage.NDSCONTENT__NDS4:
				setNDS4((NDS4CONTENT)newValue);
				return;
			case V2xmlPackage.NDSCONTENT__ANY:
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
			case V2xmlPackage.NDSCONTENT__NDS1:
				setNDS1((NDS1CONTENT)null);
				return;
			case V2xmlPackage.NDSCONTENT__NDS2:
				setNDS2((NDS2CONTENT)null);
				return;
			case V2xmlPackage.NDSCONTENT__NDS3:
				setNDS3((NDS3CONTENT)null);
				return;
			case V2xmlPackage.NDSCONTENT__NDS4:
				setNDS4((NDS4CONTENT)null);
				return;
			case V2xmlPackage.NDSCONTENT__ANY:
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
			case V2xmlPackage.NDSCONTENT__NDS1:
				return nDS1 != null;
			case V2xmlPackage.NDSCONTENT__NDS2:
				return nDS2 != null;
			case V2xmlPackage.NDSCONTENT__NDS3:
				return nDS3 != null;
			case V2xmlPackage.NDSCONTENT__NDS4:
				return nDS4 != null;
			case V2xmlPackage.NDSCONTENT__ANY:
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

} //NDSCONTENTImpl
