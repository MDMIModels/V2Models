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

import org.hl7.v2xml.SID1CONTENT;
import org.hl7.v2xml.SID2CONTENT;
import org.hl7.v2xml.SID3CONTENT;
import org.hl7.v2xml.SID4CONTENT;
import org.hl7.v2xml.SIDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SIDCONTENTImpl#getSID1 <em>SID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SIDCONTENTImpl#getSID2 <em>SID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SIDCONTENTImpl#getSID3 <em>SID3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SIDCONTENTImpl#getSID4 <em>SID4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SIDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIDCONTENTImpl extends EObjectImpl implements SIDCONTENT {
	/**
	 * The cached value of the '{@link #getSID1() <em>SID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSID1()
	 * @generated
	 * @ordered
	 */
	protected SID1CONTENT sID1;

	/**
	 * The cached value of the '{@link #getSID2() <em>SID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSID2()
	 * @generated
	 * @ordered
	 */
	protected SID2CONTENT sID2;

	/**
	 * The cached value of the '{@link #getSID3() <em>SID3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSID3()
	 * @generated
	 * @ordered
	 */
	protected SID3CONTENT sID3;

	/**
	 * The cached value of the '{@link #getSID4() <em>SID4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSID4()
	 * @generated
	 * @ordered
	 */
	protected SID4CONTENT sID4;

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
	protected SIDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSIDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SID1CONTENT getSID1() {
		return sID1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSID1(SID1CONTENT newSID1, NotificationChain msgs) {
		SID1CONTENT oldSID1 = sID1;
		sID1 = newSID1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID1, oldSID1, newSID1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSID1(SID1CONTENT newSID1) {
		if (newSID1 != sID1) {
			NotificationChain msgs = null;
			if (sID1 != null)
				msgs = ((InternalEObject)sID1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID1, null, msgs);
			if (newSID1 != null)
				msgs = ((InternalEObject)newSID1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID1, null, msgs);
			msgs = basicSetSID1(newSID1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID1, newSID1, newSID1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SID2CONTENT getSID2() {
		return sID2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSID2(SID2CONTENT newSID2, NotificationChain msgs) {
		SID2CONTENT oldSID2 = sID2;
		sID2 = newSID2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID2, oldSID2, newSID2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSID2(SID2CONTENT newSID2) {
		if (newSID2 != sID2) {
			NotificationChain msgs = null;
			if (sID2 != null)
				msgs = ((InternalEObject)sID2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID2, null, msgs);
			if (newSID2 != null)
				msgs = ((InternalEObject)newSID2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID2, null, msgs);
			msgs = basicSetSID2(newSID2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID2, newSID2, newSID2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SID3CONTENT getSID3() {
		return sID3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSID3(SID3CONTENT newSID3, NotificationChain msgs) {
		SID3CONTENT oldSID3 = sID3;
		sID3 = newSID3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID3, oldSID3, newSID3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSID3(SID3CONTENT newSID3) {
		if (newSID3 != sID3) {
			NotificationChain msgs = null;
			if (sID3 != null)
				msgs = ((InternalEObject)sID3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID3, null, msgs);
			if (newSID3 != null)
				msgs = ((InternalEObject)newSID3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID3, null, msgs);
			msgs = basicSetSID3(newSID3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID3, newSID3, newSID3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SID4CONTENT getSID4() {
		return sID4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSID4(SID4CONTENT newSID4, NotificationChain msgs) {
		SID4CONTENT oldSID4 = sID4;
		sID4 = newSID4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID4, oldSID4, newSID4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSID4(SID4CONTENT newSID4) {
		if (newSID4 != sID4) {
			NotificationChain msgs = null;
			if (sID4 != null)
				msgs = ((InternalEObject)sID4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID4, null, msgs);
			if (newSID4 != null)
				msgs = ((InternalEObject)newSID4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SIDCONTENT__SID4, null, msgs);
			msgs = basicSetSID4(newSID4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SIDCONTENT__SID4, newSID4, newSID4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SIDCONTENT__ANY);
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
			case V2xmlPackage.SIDCONTENT__SID1:
				return basicSetSID1(null, msgs);
			case V2xmlPackage.SIDCONTENT__SID2:
				return basicSetSID2(null, msgs);
			case V2xmlPackage.SIDCONTENT__SID3:
				return basicSetSID3(null, msgs);
			case V2xmlPackage.SIDCONTENT__SID4:
				return basicSetSID4(null, msgs);
			case V2xmlPackage.SIDCONTENT__ANY:
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
			case V2xmlPackage.SIDCONTENT__SID1:
				return getSID1();
			case V2xmlPackage.SIDCONTENT__SID2:
				return getSID2();
			case V2xmlPackage.SIDCONTENT__SID3:
				return getSID3();
			case V2xmlPackage.SIDCONTENT__SID4:
				return getSID4();
			case V2xmlPackage.SIDCONTENT__ANY:
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
			case V2xmlPackage.SIDCONTENT__SID1:
				setSID1((SID1CONTENT)newValue);
				return;
			case V2xmlPackage.SIDCONTENT__SID2:
				setSID2((SID2CONTENT)newValue);
				return;
			case V2xmlPackage.SIDCONTENT__SID3:
				setSID3((SID3CONTENT)newValue);
				return;
			case V2xmlPackage.SIDCONTENT__SID4:
				setSID4((SID4CONTENT)newValue);
				return;
			case V2xmlPackage.SIDCONTENT__ANY:
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
			case V2xmlPackage.SIDCONTENT__SID1:
				setSID1((SID1CONTENT)null);
				return;
			case V2xmlPackage.SIDCONTENT__SID2:
				setSID2((SID2CONTENT)null);
				return;
			case V2xmlPackage.SIDCONTENT__SID3:
				setSID3((SID3CONTENT)null);
				return;
			case V2xmlPackage.SIDCONTENT__SID4:
				setSID4((SID4CONTENT)null);
				return;
			case V2xmlPackage.SIDCONTENT__ANY:
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
			case V2xmlPackage.SIDCONTENT__SID1:
				return sID1 != null;
			case V2xmlPackage.SIDCONTENT__SID2:
				return sID2 != null;
			case V2xmlPackage.SIDCONTENT__SID3:
				return sID3 != null;
			case V2xmlPackage.SIDCONTENT__SID4:
				return sID4 != null;
			case V2xmlPackage.SIDCONTENT__ANY:
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

} //SIDCONTENTImpl
