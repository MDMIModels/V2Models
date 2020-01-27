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

import org.hl7.v2xml.BLG1CONTENT;
import org.hl7.v2xml.BLG2CONTENT;
import org.hl7.v2xml.BLG3CONTENT;
import org.hl7.v2xml.BLG4CONTENT;
import org.hl7.v2xml.BLGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BLGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BLGCONTENTImpl#getBLG1 <em>BLG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLGCONTENTImpl#getBLG2 <em>BLG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLGCONTENTImpl#getBLG3 <em>BLG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLGCONTENTImpl#getBLG4 <em>BLG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BLGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BLGCONTENTImpl extends EObjectImpl implements BLGCONTENT {
	/**
	 * The cached value of the '{@link #getBLG1() <em>BLG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLG1()
	 * @generated
	 * @ordered
	 */
	protected BLG1CONTENT bLG1;

	/**
	 * The cached value of the '{@link #getBLG2() <em>BLG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLG2()
	 * @generated
	 * @ordered
	 */
	protected BLG2CONTENT bLG2;

	/**
	 * The cached value of the '{@link #getBLG3() <em>BLG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLG3()
	 * @generated
	 * @ordered
	 */
	protected BLG3CONTENT bLG3;

	/**
	 * The cached value of the '{@link #getBLG4() <em>BLG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBLG4()
	 * @generated
	 * @ordered
	 */
	protected BLG4CONTENT bLG4;

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
	protected BLGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBLGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLG1CONTENT getBLG1() {
		return bLG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLG1(BLG1CONTENT newBLG1, NotificationChain msgs) {
		BLG1CONTENT oldBLG1 = bLG1;
		bLG1 = newBLG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG1, oldBLG1, newBLG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLG1(BLG1CONTENT newBLG1) {
		if (newBLG1 != bLG1) {
			NotificationChain msgs = null;
			if (bLG1 != null)
				msgs = ((InternalEObject)bLG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG1, null, msgs);
			if (newBLG1 != null)
				msgs = ((InternalEObject)newBLG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG1, null, msgs);
			msgs = basicSetBLG1(newBLG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG1, newBLG1, newBLG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLG2CONTENT getBLG2() {
		return bLG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLG2(BLG2CONTENT newBLG2, NotificationChain msgs) {
		BLG2CONTENT oldBLG2 = bLG2;
		bLG2 = newBLG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG2, oldBLG2, newBLG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLG2(BLG2CONTENT newBLG2) {
		if (newBLG2 != bLG2) {
			NotificationChain msgs = null;
			if (bLG2 != null)
				msgs = ((InternalEObject)bLG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG2, null, msgs);
			if (newBLG2 != null)
				msgs = ((InternalEObject)newBLG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG2, null, msgs);
			msgs = basicSetBLG2(newBLG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG2, newBLG2, newBLG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLG3CONTENT getBLG3() {
		return bLG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLG3(BLG3CONTENT newBLG3, NotificationChain msgs) {
		BLG3CONTENT oldBLG3 = bLG3;
		bLG3 = newBLG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG3, oldBLG3, newBLG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLG3(BLG3CONTENT newBLG3) {
		if (newBLG3 != bLG3) {
			NotificationChain msgs = null;
			if (bLG3 != null)
				msgs = ((InternalEObject)bLG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG3, null, msgs);
			if (newBLG3 != null)
				msgs = ((InternalEObject)newBLG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG3, null, msgs);
			msgs = basicSetBLG3(newBLG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG3, newBLG3, newBLG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BLG4CONTENT getBLG4() {
		return bLG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBLG4(BLG4CONTENT newBLG4, NotificationChain msgs) {
		BLG4CONTENT oldBLG4 = bLG4;
		bLG4 = newBLG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG4, oldBLG4, newBLG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBLG4(BLG4CONTENT newBLG4) {
		if (newBLG4 != bLG4) {
			NotificationChain msgs = null;
			if (bLG4 != null)
				msgs = ((InternalEObject)bLG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG4, null, msgs);
			if (newBLG4 != null)
				msgs = ((InternalEObject)newBLG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BLGCONTENT__BLG4, null, msgs);
			msgs = basicSetBLG4(newBLG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BLGCONTENT__BLG4, newBLG4, newBLG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BLGCONTENT__ANY);
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
			case V2xmlPackage.BLGCONTENT__BLG1:
				return basicSetBLG1(null, msgs);
			case V2xmlPackage.BLGCONTENT__BLG2:
				return basicSetBLG2(null, msgs);
			case V2xmlPackage.BLGCONTENT__BLG3:
				return basicSetBLG3(null, msgs);
			case V2xmlPackage.BLGCONTENT__BLG4:
				return basicSetBLG4(null, msgs);
			case V2xmlPackage.BLGCONTENT__ANY:
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
			case V2xmlPackage.BLGCONTENT__BLG1:
				return getBLG1();
			case V2xmlPackage.BLGCONTENT__BLG2:
				return getBLG2();
			case V2xmlPackage.BLGCONTENT__BLG3:
				return getBLG3();
			case V2xmlPackage.BLGCONTENT__BLG4:
				return getBLG4();
			case V2xmlPackage.BLGCONTENT__ANY:
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
			case V2xmlPackage.BLGCONTENT__BLG1:
				setBLG1((BLG1CONTENT)newValue);
				return;
			case V2xmlPackage.BLGCONTENT__BLG2:
				setBLG2((BLG2CONTENT)newValue);
				return;
			case V2xmlPackage.BLGCONTENT__BLG3:
				setBLG3((BLG3CONTENT)newValue);
				return;
			case V2xmlPackage.BLGCONTENT__BLG4:
				setBLG4((BLG4CONTENT)newValue);
				return;
			case V2xmlPackage.BLGCONTENT__ANY:
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
			case V2xmlPackage.BLGCONTENT__BLG1:
				setBLG1((BLG1CONTENT)null);
				return;
			case V2xmlPackage.BLGCONTENT__BLG2:
				setBLG2((BLG2CONTENT)null);
				return;
			case V2xmlPackage.BLGCONTENT__BLG3:
				setBLG3((BLG3CONTENT)null);
				return;
			case V2xmlPackage.BLGCONTENT__BLG4:
				setBLG4((BLG4CONTENT)null);
				return;
			case V2xmlPackage.BLGCONTENT__ANY:
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
			case V2xmlPackage.BLGCONTENT__BLG1:
				return bLG1 != null;
			case V2xmlPackage.BLGCONTENT__BLG2:
				return bLG2 != null;
			case V2xmlPackage.BLGCONTENT__BLG3:
				return bLG3 != null;
			case V2xmlPackage.BLGCONTENT__BLG4:
				return bLG4 != null;
			case V2xmlPackage.BLGCONTENT__ANY:
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

} //BLGCONTENTImpl
