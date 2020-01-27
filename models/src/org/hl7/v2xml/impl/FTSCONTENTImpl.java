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

import org.hl7.v2xml.FTS1CONTENT;
import org.hl7.v2xml.FTS2CONTENT;
import org.hl7.v2xml.FTSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FTSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FTSCONTENTImpl#getFTS1 <em>FTS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FTSCONTENTImpl#getFTS2 <em>FTS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FTSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FTSCONTENTImpl extends EObjectImpl implements FTSCONTENT {
	/**
	 * The cached value of the '{@link #getFTS1() <em>FTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTS1()
	 * @generated
	 * @ordered
	 */
	protected FTS1CONTENT fTS1;

	/**
	 * The cached value of the '{@link #getFTS2() <em>FTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFTS2()
	 * @generated
	 * @ordered
	 */
	protected FTS2CONTENT fTS2;

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
	protected FTSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFTSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTS1CONTENT getFTS1() {
		return fTS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTS1(FTS1CONTENT newFTS1, NotificationChain msgs) {
		FTS1CONTENT oldFTS1 = fTS1;
		fTS1 = newFTS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FTSCONTENT__FTS1, oldFTS1, newFTS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTS1(FTS1CONTENT newFTS1) {
		if (newFTS1 != fTS1) {
			NotificationChain msgs = null;
			if (fTS1 != null)
				msgs = ((InternalEObject)fTS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FTSCONTENT__FTS1, null, msgs);
			if (newFTS1 != null)
				msgs = ((InternalEObject)newFTS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FTSCONTENT__FTS1, null, msgs);
			msgs = basicSetFTS1(newFTS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FTSCONTENT__FTS1, newFTS1, newFTS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FTS2CONTENT getFTS2() {
		return fTS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFTS2(FTS2CONTENT newFTS2, NotificationChain msgs) {
		FTS2CONTENT oldFTS2 = fTS2;
		fTS2 = newFTS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FTSCONTENT__FTS2, oldFTS2, newFTS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFTS2(FTS2CONTENT newFTS2) {
		if (newFTS2 != fTS2) {
			NotificationChain msgs = null;
			if (fTS2 != null)
				msgs = ((InternalEObject)fTS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FTSCONTENT__FTS2, null, msgs);
			if (newFTS2 != null)
				msgs = ((InternalEObject)newFTS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FTSCONTENT__FTS2, null, msgs);
			msgs = basicSetFTS2(newFTS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FTSCONTENT__FTS2, newFTS2, newFTS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.FTSCONTENT__ANY);
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
			case V2xmlPackage.FTSCONTENT__FTS1:
				return basicSetFTS1(null, msgs);
			case V2xmlPackage.FTSCONTENT__FTS2:
				return basicSetFTS2(null, msgs);
			case V2xmlPackage.FTSCONTENT__ANY:
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
			case V2xmlPackage.FTSCONTENT__FTS1:
				return getFTS1();
			case V2xmlPackage.FTSCONTENT__FTS2:
				return getFTS2();
			case V2xmlPackage.FTSCONTENT__ANY:
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
			case V2xmlPackage.FTSCONTENT__FTS1:
				setFTS1((FTS1CONTENT)newValue);
				return;
			case V2xmlPackage.FTSCONTENT__FTS2:
				setFTS2((FTS2CONTENT)newValue);
				return;
			case V2xmlPackage.FTSCONTENT__ANY:
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
			case V2xmlPackage.FTSCONTENT__FTS1:
				setFTS1((FTS1CONTENT)null);
				return;
			case V2xmlPackage.FTSCONTENT__FTS2:
				setFTS2((FTS2CONTENT)null);
				return;
			case V2xmlPackage.FTSCONTENT__ANY:
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
			case V2xmlPackage.FTSCONTENT__FTS1:
				return fTS1 != null;
			case V2xmlPackage.FTSCONTENT__FTS2:
				return fTS2 != null;
			case V2xmlPackage.FTSCONTENT__ANY:
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

} //FTSCONTENTImpl
