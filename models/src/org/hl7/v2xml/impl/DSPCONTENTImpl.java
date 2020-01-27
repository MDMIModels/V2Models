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

import org.hl7.v2xml.DSP1CONTENT;
import org.hl7.v2xml.DSP2CONTENT;
import org.hl7.v2xml.DSP3CONTENT;
import org.hl7.v2xml.DSP4CONTENT;
import org.hl7.v2xml.DSP5CONTENT;
import org.hl7.v2xml.DSPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getDSP1 <em>DSP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getDSP2 <em>DSP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getDSP3 <em>DSP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getDSP4 <em>DSP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getDSP5 <em>DSP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DSPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DSPCONTENTImpl extends EObjectImpl implements DSPCONTENT {
	/**
	 * The cached value of the '{@link #getDSP1() <em>DSP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP1()
	 * @generated
	 * @ordered
	 */
	protected DSP1CONTENT dSP1;

	/**
	 * The cached value of the '{@link #getDSP2() <em>DSP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP2()
	 * @generated
	 * @ordered
	 */
	protected DSP2CONTENT dSP2;

	/**
	 * The cached value of the '{@link #getDSP3() <em>DSP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP3()
	 * @generated
	 * @ordered
	 */
	protected DSP3CONTENT dSP3;

	/**
	 * The cached value of the '{@link #getDSP4() <em>DSP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP4()
	 * @generated
	 * @ordered
	 */
	protected DSP4CONTENT dSP4;

	/**
	 * The cached value of the '{@link #getDSP5() <em>DSP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDSP5()
	 * @generated
	 * @ordered
	 */
	protected DSP5CONTENT dSP5;

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
	protected DSPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDSPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP1CONTENT getDSP1() {
		return dSP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSP1(DSP1CONTENT newDSP1, NotificationChain msgs) {
		DSP1CONTENT oldDSP1 = dSP1;
		dSP1 = newDSP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP1, oldDSP1, newDSP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSP1(DSP1CONTENT newDSP1) {
		if (newDSP1 != dSP1) {
			NotificationChain msgs = null;
			if (dSP1 != null)
				msgs = ((InternalEObject)dSP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP1, null, msgs);
			if (newDSP1 != null)
				msgs = ((InternalEObject)newDSP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP1, null, msgs);
			msgs = basicSetDSP1(newDSP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP1, newDSP1, newDSP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP2CONTENT getDSP2() {
		return dSP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSP2(DSP2CONTENT newDSP2, NotificationChain msgs) {
		DSP2CONTENT oldDSP2 = dSP2;
		dSP2 = newDSP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP2, oldDSP2, newDSP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSP2(DSP2CONTENT newDSP2) {
		if (newDSP2 != dSP2) {
			NotificationChain msgs = null;
			if (dSP2 != null)
				msgs = ((InternalEObject)dSP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP2, null, msgs);
			if (newDSP2 != null)
				msgs = ((InternalEObject)newDSP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP2, null, msgs);
			msgs = basicSetDSP2(newDSP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP2, newDSP2, newDSP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP3CONTENT getDSP3() {
		return dSP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSP3(DSP3CONTENT newDSP3, NotificationChain msgs) {
		DSP3CONTENT oldDSP3 = dSP3;
		dSP3 = newDSP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP3, oldDSP3, newDSP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSP3(DSP3CONTENT newDSP3) {
		if (newDSP3 != dSP3) {
			NotificationChain msgs = null;
			if (dSP3 != null)
				msgs = ((InternalEObject)dSP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP3, null, msgs);
			if (newDSP3 != null)
				msgs = ((InternalEObject)newDSP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP3, null, msgs);
			msgs = basicSetDSP3(newDSP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP3, newDSP3, newDSP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP4CONTENT getDSP4() {
		return dSP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSP4(DSP4CONTENT newDSP4, NotificationChain msgs) {
		DSP4CONTENT oldDSP4 = dSP4;
		dSP4 = newDSP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP4, oldDSP4, newDSP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSP4(DSP4CONTENT newDSP4) {
		if (newDSP4 != dSP4) {
			NotificationChain msgs = null;
			if (dSP4 != null)
				msgs = ((InternalEObject)dSP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP4, null, msgs);
			if (newDSP4 != null)
				msgs = ((InternalEObject)newDSP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP4, null, msgs);
			msgs = basicSetDSP4(newDSP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP4, newDSP4, newDSP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSP5CONTENT getDSP5() {
		return dSP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDSP5(DSP5CONTENT newDSP5, NotificationChain msgs) {
		DSP5CONTENT oldDSP5 = dSP5;
		dSP5 = newDSP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP5, oldDSP5, newDSP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDSP5(DSP5CONTENT newDSP5) {
		if (newDSP5 != dSP5) {
			NotificationChain msgs = null;
			if (dSP5 != null)
				msgs = ((InternalEObject)dSP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP5, null, msgs);
			if (newDSP5 != null)
				msgs = ((InternalEObject)newDSP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DSPCONTENT__DSP5, null, msgs);
			msgs = basicSetDSP5(newDSP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DSPCONTENT__DSP5, newDSP5, newDSP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.DSPCONTENT__ANY);
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
			case V2xmlPackage.DSPCONTENT__DSP1:
				return basicSetDSP1(null, msgs);
			case V2xmlPackage.DSPCONTENT__DSP2:
				return basicSetDSP2(null, msgs);
			case V2xmlPackage.DSPCONTENT__DSP3:
				return basicSetDSP3(null, msgs);
			case V2xmlPackage.DSPCONTENT__DSP4:
				return basicSetDSP4(null, msgs);
			case V2xmlPackage.DSPCONTENT__DSP5:
				return basicSetDSP5(null, msgs);
			case V2xmlPackage.DSPCONTENT__ANY:
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
			case V2xmlPackage.DSPCONTENT__DSP1:
				return getDSP1();
			case V2xmlPackage.DSPCONTENT__DSP2:
				return getDSP2();
			case V2xmlPackage.DSPCONTENT__DSP3:
				return getDSP3();
			case V2xmlPackage.DSPCONTENT__DSP4:
				return getDSP4();
			case V2xmlPackage.DSPCONTENT__DSP5:
				return getDSP5();
			case V2xmlPackage.DSPCONTENT__ANY:
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
			case V2xmlPackage.DSPCONTENT__DSP1:
				setDSP1((DSP1CONTENT)newValue);
				return;
			case V2xmlPackage.DSPCONTENT__DSP2:
				setDSP2((DSP2CONTENT)newValue);
				return;
			case V2xmlPackage.DSPCONTENT__DSP3:
				setDSP3((DSP3CONTENT)newValue);
				return;
			case V2xmlPackage.DSPCONTENT__DSP4:
				setDSP4((DSP4CONTENT)newValue);
				return;
			case V2xmlPackage.DSPCONTENT__DSP5:
				setDSP5((DSP5CONTENT)newValue);
				return;
			case V2xmlPackage.DSPCONTENT__ANY:
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
			case V2xmlPackage.DSPCONTENT__DSP1:
				setDSP1((DSP1CONTENT)null);
				return;
			case V2xmlPackage.DSPCONTENT__DSP2:
				setDSP2((DSP2CONTENT)null);
				return;
			case V2xmlPackage.DSPCONTENT__DSP3:
				setDSP3((DSP3CONTENT)null);
				return;
			case V2xmlPackage.DSPCONTENT__DSP4:
				setDSP4((DSP4CONTENT)null);
				return;
			case V2xmlPackage.DSPCONTENT__DSP5:
				setDSP5((DSP5CONTENT)null);
				return;
			case V2xmlPackage.DSPCONTENT__ANY:
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
			case V2xmlPackage.DSPCONTENT__DSP1:
				return dSP1 != null;
			case V2xmlPackage.DSPCONTENT__DSP2:
				return dSP2 != null;
			case V2xmlPackage.DSPCONTENT__DSP3:
				return dSP3 != null;
			case V2xmlPackage.DSPCONTENT__DSP4:
				return dSP4 != null;
			case V2xmlPackage.DSPCONTENT__DSP5:
				return dSP5 != null;
			case V2xmlPackage.DSPCONTENT__ANY:
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

} //DSPCONTENTImpl
