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

import org.hl7.v2xml.RCP1CONTENT;
import org.hl7.v2xml.RCP2CONTENT;
import org.hl7.v2xml.RCP3CONTENT;
import org.hl7.v2xml.RCP4CONTENT;
import org.hl7.v2xml.RCP5CONTENT;
import org.hl7.v2xml.RCP6CONTENT;
import org.hl7.v2xml.RCP7CONTENT;
import org.hl7.v2xml.RCPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RCPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP1 <em>RCP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP2 <em>RCP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP3 <em>RCP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP4 <em>RCP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP5 <em>RCP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP6 <em>RCP6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getRCP7 <em>RCP7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RCPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RCPCONTENTImpl extends EObjectImpl implements RCPCONTENT {
	/**
	 * The cached value of the '{@link #getRCP1() <em>RCP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP1()
	 * @generated
	 * @ordered
	 */
	protected RCP1CONTENT rCP1;

	/**
	 * The cached value of the '{@link #getRCP2() <em>RCP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP2()
	 * @generated
	 * @ordered
	 */
	protected RCP2CONTENT rCP2;

	/**
	 * The cached value of the '{@link #getRCP3() <em>RCP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP3()
	 * @generated
	 * @ordered
	 */
	protected RCP3CONTENT rCP3;

	/**
	 * The cached value of the '{@link #getRCP4() <em>RCP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP4()
	 * @generated
	 * @ordered
	 */
	protected RCP4CONTENT rCP4;

	/**
	 * The cached value of the '{@link #getRCP5() <em>RCP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP5()
	 * @generated
	 * @ordered
	 */
	protected RCP5CONTENT rCP5;

	/**
	 * The cached value of the '{@link #getRCP6() <em>RCP6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP6()
	 * @generated
	 * @ordered
	 */
	protected EList<RCP6CONTENT> rCP6;

	/**
	 * The cached value of the '{@link #getRCP7() <em>RCP7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRCP7()
	 * @generated
	 * @ordered
	 */
	protected EList<RCP7CONTENT> rCP7;

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
	protected RCPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRCPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCP1CONTENT getRCP1() {
		return rCP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCP1(RCP1CONTENT newRCP1, NotificationChain msgs) {
		RCP1CONTENT oldRCP1 = rCP1;
		rCP1 = newRCP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP1, oldRCP1, newRCP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCP1(RCP1CONTENT newRCP1) {
		if (newRCP1 != rCP1) {
			NotificationChain msgs = null;
			if (rCP1 != null)
				msgs = ((InternalEObject)rCP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP1, null, msgs);
			if (newRCP1 != null)
				msgs = ((InternalEObject)newRCP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP1, null, msgs);
			msgs = basicSetRCP1(newRCP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP1, newRCP1, newRCP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCP2CONTENT getRCP2() {
		return rCP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCP2(RCP2CONTENT newRCP2, NotificationChain msgs) {
		RCP2CONTENT oldRCP2 = rCP2;
		rCP2 = newRCP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP2, oldRCP2, newRCP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCP2(RCP2CONTENT newRCP2) {
		if (newRCP2 != rCP2) {
			NotificationChain msgs = null;
			if (rCP2 != null)
				msgs = ((InternalEObject)rCP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP2, null, msgs);
			if (newRCP2 != null)
				msgs = ((InternalEObject)newRCP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP2, null, msgs);
			msgs = basicSetRCP2(newRCP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP2, newRCP2, newRCP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCP3CONTENT getRCP3() {
		return rCP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCP3(RCP3CONTENT newRCP3, NotificationChain msgs) {
		RCP3CONTENT oldRCP3 = rCP3;
		rCP3 = newRCP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP3, oldRCP3, newRCP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCP3(RCP3CONTENT newRCP3) {
		if (newRCP3 != rCP3) {
			NotificationChain msgs = null;
			if (rCP3 != null)
				msgs = ((InternalEObject)rCP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP3, null, msgs);
			if (newRCP3 != null)
				msgs = ((InternalEObject)newRCP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP3, null, msgs);
			msgs = basicSetRCP3(newRCP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP3, newRCP3, newRCP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCP4CONTENT getRCP4() {
		return rCP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCP4(RCP4CONTENT newRCP4, NotificationChain msgs) {
		RCP4CONTENT oldRCP4 = rCP4;
		rCP4 = newRCP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP4, oldRCP4, newRCP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCP4(RCP4CONTENT newRCP4) {
		if (newRCP4 != rCP4) {
			NotificationChain msgs = null;
			if (rCP4 != null)
				msgs = ((InternalEObject)rCP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP4, null, msgs);
			if (newRCP4 != null)
				msgs = ((InternalEObject)newRCP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP4, null, msgs);
			msgs = basicSetRCP4(newRCP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP4, newRCP4, newRCP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RCP5CONTENT getRCP5() {
		return rCP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRCP5(RCP5CONTENT newRCP5, NotificationChain msgs) {
		RCP5CONTENT oldRCP5 = rCP5;
		rCP5 = newRCP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP5, oldRCP5, newRCP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRCP5(RCP5CONTENT newRCP5) {
		if (newRCP5 != rCP5) {
			NotificationChain msgs = null;
			if (rCP5 != null)
				msgs = ((InternalEObject)rCP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP5, null, msgs);
			if (newRCP5 != null)
				msgs = ((InternalEObject)newRCP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RCPCONTENT__RCP5, null, msgs);
			msgs = basicSetRCP5(newRCP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RCPCONTENT__RCP5, newRCP5, newRCP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RCP6CONTENT> getRCP6() {
		if (rCP6 == null) {
			rCP6 = new EObjectContainmentEList<RCP6CONTENT>(RCP6CONTENT.class, this, V2xmlPackage.RCPCONTENT__RCP6);
		}
		return rCP6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RCP7CONTENT> getRCP7() {
		if (rCP7 == null) {
			rCP7 = new EObjectContainmentEList<RCP7CONTENT>(RCP7CONTENT.class, this, V2xmlPackage.RCPCONTENT__RCP7);
		}
		return rCP7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RCPCONTENT__ANY);
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
			case V2xmlPackage.RCPCONTENT__RCP1:
				return basicSetRCP1(null, msgs);
			case V2xmlPackage.RCPCONTENT__RCP2:
				return basicSetRCP2(null, msgs);
			case V2xmlPackage.RCPCONTENT__RCP3:
				return basicSetRCP3(null, msgs);
			case V2xmlPackage.RCPCONTENT__RCP4:
				return basicSetRCP4(null, msgs);
			case V2xmlPackage.RCPCONTENT__RCP5:
				return basicSetRCP5(null, msgs);
			case V2xmlPackage.RCPCONTENT__RCP6:
				return ((InternalEList<?>)getRCP6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RCPCONTENT__RCP7:
				return ((InternalEList<?>)getRCP7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RCPCONTENT__ANY:
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
			case V2xmlPackage.RCPCONTENT__RCP1:
				return getRCP1();
			case V2xmlPackage.RCPCONTENT__RCP2:
				return getRCP2();
			case V2xmlPackage.RCPCONTENT__RCP3:
				return getRCP3();
			case V2xmlPackage.RCPCONTENT__RCP4:
				return getRCP4();
			case V2xmlPackage.RCPCONTENT__RCP5:
				return getRCP5();
			case V2xmlPackage.RCPCONTENT__RCP6:
				return getRCP6();
			case V2xmlPackage.RCPCONTENT__RCP7:
				return getRCP7();
			case V2xmlPackage.RCPCONTENT__ANY:
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
			case V2xmlPackage.RCPCONTENT__RCP1:
				setRCP1((RCP1CONTENT)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP2:
				setRCP2((RCP2CONTENT)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP3:
				setRCP3((RCP3CONTENT)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP4:
				setRCP4((RCP4CONTENT)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP5:
				setRCP5((RCP5CONTENT)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP6:
				getRCP6().clear();
				getRCP6().addAll((Collection<? extends RCP6CONTENT>)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__RCP7:
				getRCP7().clear();
				getRCP7().addAll((Collection<? extends RCP7CONTENT>)newValue);
				return;
			case V2xmlPackage.RCPCONTENT__ANY:
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
			case V2xmlPackage.RCPCONTENT__RCP1:
				setRCP1((RCP1CONTENT)null);
				return;
			case V2xmlPackage.RCPCONTENT__RCP2:
				setRCP2((RCP2CONTENT)null);
				return;
			case V2xmlPackage.RCPCONTENT__RCP3:
				setRCP3((RCP3CONTENT)null);
				return;
			case V2xmlPackage.RCPCONTENT__RCP4:
				setRCP4((RCP4CONTENT)null);
				return;
			case V2xmlPackage.RCPCONTENT__RCP5:
				setRCP5((RCP5CONTENT)null);
				return;
			case V2xmlPackage.RCPCONTENT__RCP6:
				getRCP6().clear();
				return;
			case V2xmlPackage.RCPCONTENT__RCP7:
				getRCP7().clear();
				return;
			case V2xmlPackage.RCPCONTENT__ANY:
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
			case V2xmlPackage.RCPCONTENT__RCP1:
				return rCP1 != null;
			case V2xmlPackage.RCPCONTENT__RCP2:
				return rCP2 != null;
			case V2xmlPackage.RCPCONTENT__RCP3:
				return rCP3 != null;
			case V2xmlPackage.RCPCONTENT__RCP4:
				return rCP4 != null;
			case V2xmlPackage.RCPCONTENT__RCP5:
				return rCP5 != null;
			case V2xmlPackage.RCPCONTENT__RCP6:
				return rCP6 != null && !rCP6.isEmpty();
			case V2xmlPackage.RCPCONTENT__RCP7:
				return rCP7 != null && !rCP7.isEmpty();
			case V2xmlPackage.RCPCONTENT__ANY:
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

} //RCPCONTENTImpl
