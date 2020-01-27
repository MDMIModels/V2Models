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

import org.hl7.v2xml.ECD1CONTENT;
import org.hl7.v2xml.ECD2CONTENT;
import org.hl7.v2xml.ECD3CONTENT;
import org.hl7.v2xml.ECD4CONTENT;
import org.hl7.v2xml.ECD5CONTENT;
import org.hl7.v2xml.ECDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getECD1 <em>ECD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getECD2 <em>ECD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getECD3 <em>ECD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getECD4 <em>ECD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getECD5 <em>ECD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ECDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECDCONTENTImpl extends EObjectImpl implements ECDCONTENT {
	/**
	 * The cached value of the '{@link #getECD1() <em>ECD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD1()
	 * @generated
	 * @ordered
	 */
	protected ECD1CONTENT eCD1;

	/**
	 * The cached value of the '{@link #getECD2() <em>ECD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD2()
	 * @generated
	 * @ordered
	 */
	protected ECD2CONTENT eCD2;

	/**
	 * The cached value of the '{@link #getECD3() <em>ECD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD3()
	 * @generated
	 * @ordered
	 */
	protected ECD3CONTENT eCD3;

	/**
	 * The cached value of the '{@link #getECD4() <em>ECD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD4()
	 * @generated
	 * @ordered
	 */
	protected ECD4CONTENT eCD4;

	/**
	 * The cached value of the '{@link #getECD5() <em>ECD5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getECD5()
	 * @generated
	 * @ordered
	 */
	protected EList<ECD5CONTENT> eCD5;

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
	protected ECDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getECDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECD1CONTENT getECD1() {
		return eCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECD1(ECD1CONTENT newECD1, NotificationChain msgs) {
		ECD1CONTENT oldECD1 = eCD1;
		eCD1 = newECD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD1, oldECD1, newECD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECD1(ECD1CONTENT newECD1) {
		if (newECD1 != eCD1) {
			NotificationChain msgs = null;
			if (eCD1 != null)
				msgs = ((InternalEObject)eCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD1, null, msgs);
			if (newECD1 != null)
				msgs = ((InternalEObject)newECD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD1, null, msgs);
			msgs = basicSetECD1(newECD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD1, newECD1, newECD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECD2CONTENT getECD2() {
		return eCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECD2(ECD2CONTENT newECD2, NotificationChain msgs) {
		ECD2CONTENT oldECD2 = eCD2;
		eCD2 = newECD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD2, oldECD2, newECD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECD2(ECD2CONTENT newECD2) {
		if (newECD2 != eCD2) {
			NotificationChain msgs = null;
			if (eCD2 != null)
				msgs = ((InternalEObject)eCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD2, null, msgs);
			if (newECD2 != null)
				msgs = ((InternalEObject)newECD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD2, null, msgs);
			msgs = basicSetECD2(newECD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD2, newECD2, newECD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECD3CONTENT getECD3() {
		return eCD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECD3(ECD3CONTENT newECD3, NotificationChain msgs) {
		ECD3CONTENT oldECD3 = eCD3;
		eCD3 = newECD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD3, oldECD3, newECD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECD3(ECD3CONTENT newECD3) {
		if (newECD3 != eCD3) {
			NotificationChain msgs = null;
			if (eCD3 != null)
				msgs = ((InternalEObject)eCD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD3, null, msgs);
			if (newECD3 != null)
				msgs = ((InternalEObject)newECD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD3, null, msgs);
			msgs = basicSetECD3(newECD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD3, newECD3, newECD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECD4CONTENT getECD4() {
		return eCD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetECD4(ECD4CONTENT newECD4, NotificationChain msgs) {
		ECD4CONTENT oldECD4 = eCD4;
		eCD4 = newECD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD4, oldECD4, newECD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setECD4(ECD4CONTENT newECD4) {
		if (newECD4 != eCD4) {
			NotificationChain msgs = null;
			if (eCD4 != null)
				msgs = ((InternalEObject)eCD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD4, null, msgs);
			if (newECD4 != null)
				msgs = ((InternalEObject)newECD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ECDCONTENT__ECD4, null, msgs);
			msgs = basicSetECD4(newECD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ECDCONTENT__ECD4, newECD4, newECD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ECD5CONTENT> getECD5() {
		if (eCD5 == null) {
			eCD5 = new EObjectContainmentEList<ECD5CONTENT>(ECD5CONTENT.class, this, V2xmlPackage.ECDCONTENT__ECD5);
		}
		return eCD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ECDCONTENT__ANY);
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
			case V2xmlPackage.ECDCONTENT__ECD1:
				return basicSetECD1(null, msgs);
			case V2xmlPackage.ECDCONTENT__ECD2:
				return basicSetECD2(null, msgs);
			case V2xmlPackage.ECDCONTENT__ECD3:
				return basicSetECD3(null, msgs);
			case V2xmlPackage.ECDCONTENT__ECD4:
				return basicSetECD4(null, msgs);
			case V2xmlPackage.ECDCONTENT__ECD5:
				return ((InternalEList<?>)getECD5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ECDCONTENT__ANY:
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
			case V2xmlPackage.ECDCONTENT__ECD1:
				return getECD1();
			case V2xmlPackage.ECDCONTENT__ECD2:
				return getECD2();
			case V2xmlPackage.ECDCONTENT__ECD3:
				return getECD3();
			case V2xmlPackage.ECDCONTENT__ECD4:
				return getECD4();
			case V2xmlPackage.ECDCONTENT__ECD5:
				return getECD5();
			case V2xmlPackage.ECDCONTENT__ANY:
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
			case V2xmlPackage.ECDCONTENT__ECD1:
				setECD1((ECD1CONTENT)newValue);
				return;
			case V2xmlPackage.ECDCONTENT__ECD2:
				setECD2((ECD2CONTENT)newValue);
				return;
			case V2xmlPackage.ECDCONTENT__ECD3:
				setECD3((ECD3CONTENT)newValue);
				return;
			case V2xmlPackage.ECDCONTENT__ECD4:
				setECD4((ECD4CONTENT)newValue);
				return;
			case V2xmlPackage.ECDCONTENT__ECD5:
				getECD5().clear();
				getECD5().addAll((Collection<? extends ECD5CONTENT>)newValue);
				return;
			case V2xmlPackage.ECDCONTENT__ANY:
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
			case V2xmlPackage.ECDCONTENT__ECD1:
				setECD1((ECD1CONTENT)null);
				return;
			case V2xmlPackage.ECDCONTENT__ECD2:
				setECD2((ECD2CONTENT)null);
				return;
			case V2xmlPackage.ECDCONTENT__ECD3:
				setECD3((ECD3CONTENT)null);
				return;
			case V2xmlPackage.ECDCONTENT__ECD4:
				setECD4((ECD4CONTENT)null);
				return;
			case V2xmlPackage.ECDCONTENT__ECD5:
				getECD5().clear();
				return;
			case V2xmlPackage.ECDCONTENT__ANY:
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
			case V2xmlPackage.ECDCONTENT__ECD1:
				return eCD1 != null;
			case V2xmlPackage.ECDCONTENT__ECD2:
				return eCD2 != null;
			case V2xmlPackage.ECDCONTENT__ECD3:
				return eCD3 != null;
			case V2xmlPackage.ECDCONTENT__ECD4:
				return eCD4 != null;
			case V2xmlPackage.ECDCONTENT__ECD5:
				return eCD5 != null && !eCD5.isEmpty();
			case V2xmlPackage.ECDCONTENT__ANY:
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

} //ECDCONTENTImpl
