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

import org.hl7.v2xml.V2xmlPackage;
import org.hl7.v2xml.VAR1CONTENT;
import org.hl7.v2xml.VAR2CONTENT;
import org.hl7.v2xml.VAR3CONTENT;
import org.hl7.v2xml.VAR4CONTENT;
import org.hl7.v2xml.VAR5CONTENT;
import org.hl7.v2xml.VAR6CONTENT;
import org.hl7.v2xml.VARCONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VARCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR1 <em>VAR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR2 <em>VAR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR3 <em>VAR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR4 <em>VAR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR5 <em>VAR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getVAR6 <em>VAR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.VARCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VARCONTENTImpl extends EObjectImpl implements VARCONTENT {
	/**
	 * The cached value of the '{@link #getVAR1() <em>VAR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR1()
	 * @generated
	 * @ordered
	 */
	protected VAR1CONTENT vAR1;

	/**
	 * The cached value of the '{@link #getVAR2() <em>VAR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR2()
	 * @generated
	 * @ordered
	 */
	protected VAR2CONTENT vAR2;

	/**
	 * The cached value of the '{@link #getVAR3() <em>VAR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR3()
	 * @generated
	 * @ordered
	 */
	protected VAR3CONTENT vAR3;

	/**
	 * The cached value of the '{@link #getVAR4() <em>VAR4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR4()
	 * @generated
	 * @ordered
	 */
	protected EList<VAR4CONTENT> vAR4;

	/**
	 * The cached value of the '{@link #getVAR5() <em>VAR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR5()
	 * @generated
	 * @ordered
	 */
	protected VAR5CONTENT vAR5;

	/**
	 * The cached value of the '{@link #getVAR6() <em>VAR6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAR6()
	 * @generated
	 * @ordered
	 */
	protected EList<VAR6CONTENT> vAR6;

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
	protected VARCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getVARCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAR1CONTENT getVAR1() {
		return vAR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVAR1(VAR1CONTENT newVAR1, NotificationChain msgs) {
		VAR1CONTENT oldVAR1 = vAR1;
		vAR1 = newVAR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR1, oldVAR1, newVAR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAR1(VAR1CONTENT newVAR1) {
		if (newVAR1 != vAR1) {
			NotificationChain msgs = null;
			if (vAR1 != null)
				msgs = ((InternalEObject)vAR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR1, null, msgs);
			if (newVAR1 != null)
				msgs = ((InternalEObject)newVAR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR1, null, msgs);
			msgs = basicSetVAR1(newVAR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR1, newVAR1, newVAR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAR2CONTENT getVAR2() {
		return vAR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVAR2(VAR2CONTENT newVAR2, NotificationChain msgs) {
		VAR2CONTENT oldVAR2 = vAR2;
		vAR2 = newVAR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR2, oldVAR2, newVAR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAR2(VAR2CONTENT newVAR2) {
		if (newVAR2 != vAR2) {
			NotificationChain msgs = null;
			if (vAR2 != null)
				msgs = ((InternalEObject)vAR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR2, null, msgs);
			if (newVAR2 != null)
				msgs = ((InternalEObject)newVAR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR2, null, msgs);
			msgs = basicSetVAR2(newVAR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR2, newVAR2, newVAR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAR3CONTENT getVAR3() {
		return vAR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVAR3(VAR3CONTENT newVAR3, NotificationChain msgs) {
		VAR3CONTENT oldVAR3 = vAR3;
		vAR3 = newVAR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR3, oldVAR3, newVAR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAR3(VAR3CONTENT newVAR3) {
		if (newVAR3 != vAR3) {
			NotificationChain msgs = null;
			if (vAR3 != null)
				msgs = ((InternalEObject)vAR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR3, null, msgs);
			if (newVAR3 != null)
				msgs = ((InternalEObject)newVAR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR3, null, msgs);
			msgs = basicSetVAR3(newVAR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR3, newVAR3, newVAR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VAR4CONTENT> getVAR4() {
		if (vAR4 == null) {
			vAR4 = new EObjectContainmentEList<VAR4CONTENT>(VAR4CONTENT.class, this, V2xmlPackage.VARCONTENT__VAR4);
		}
		return vAR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VAR5CONTENT getVAR5() {
		return vAR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVAR5(VAR5CONTENT newVAR5, NotificationChain msgs) {
		VAR5CONTENT oldVAR5 = vAR5;
		vAR5 = newVAR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR5, oldVAR5, newVAR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAR5(VAR5CONTENT newVAR5) {
		if (newVAR5 != vAR5) {
			NotificationChain msgs = null;
			if (vAR5 != null)
				msgs = ((InternalEObject)vAR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR5, null, msgs);
			if (newVAR5 != null)
				msgs = ((InternalEObject)newVAR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.VARCONTENT__VAR5, null, msgs);
			msgs = basicSetVAR5(newVAR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.VARCONTENT__VAR5, newVAR5, newVAR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VAR6CONTENT> getVAR6() {
		if (vAR6 == null) {
			vAR6 = new EObjectContainmentEList<VAR6CONTENT>(VAR6CONTENT.class, this, V2xmlPackage.VARCONTENT__VAR6);
		}
		return vAR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.VARCONTENT__ANY);
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
			case V2xmlPackage.VARCONTENT__VAR1:
				return basicSetVAR1(null, msgs);
			case V2xmlPackage.VARCONTENT__VAR2:
				return basicSetVAR2(null, msgs);
			case V2xmlPackage.VARCONTENT__VAR3:
				return basicSetVAR3(null, msgs);
			case V2xmlPackage.VARCONTENT__VAR4:
				return ((InternalEList<?>)getVAR4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.VARCONTENT__VAR5:
				return basicSetVAR5(null, msgs);
			case V2xmlPackage.VARCONTENT__VAR6:
				return ((InternalEList<?>)getVAR6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.VARCONTENT__ANY:
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
			case V2xmlPackage.VARCONTENT__VAR1:
				return getVAR1();
			case V2xmlPackage.VARCONTENT__VAR2:
				return getVAR2();
			case V2xmlPackage.VARCONTENT__VAR3:
				return getVAR3();
			case V2xmlPackage.VARCONTENT__VAR4:
				return getVAR4();
			case V2xmlPackage.VARCONTENT__VAR5:
				return getVAR5();
			case V2xmlPackage.VARCONTENT__VAR6:
				return getVAR6();
			case V2xmlPackage.VARCONTENT__ANY:
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
			case V2xmlPackage.VARCONTENT__VAR1:
				setVAR1((VAR1CONTENT)newValue);
				return;
			case V2xmlPackage.VARCONTENT__VAR2:
				setVAR2((VAR2CONTENT)newValue);
				return;
			case V2xmlPackage.VARCONTENT__VAR3:
				setVAR3((VAR3CONTENT)newValue);
				return;
			case V2xmlPackage.VARCONTENT__VAR4:
				getVAR4().clear();
				getVAR4().addAll((Collection<? extends VAR4CONTENT>)newValue);
				return;
			case V2xmlPackage.VARCONTENT__VAR5:
				setVAR5((VAR5CONTENT)newValue);
				return;
			case V2xmlPackage.VARCONTENT__VAR6:
				getVAR6().clear();
				getVAR6().addAll((Collection<? extends VAR6CONTENT>)newValue);
				return;
			case V2xmlPackage.VARCONTENT__ANY:
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
			case V2xmlPackage.VARCONTENT__VAR1:
				setVAR1((VAR1CONTENT)null);
				return;
			case V2xmlPackage.VARCONTENT__VAR2:
				setVAR2((VAR2CONTENT)null);
				return;
			case V2xmlPackage.VARCONTENT__VAR3:
				setVAR3((VAR3CONTENT)null);
				return;
			case V2xmlPackage.VARCONTENT__VAR4:
				getVAR4().clear();
				return;
			case V2xmlPackage.VARCONTENT__VAR5:
				setVAR5((VAR5CONTENT)null);
				return;
			case V2xmlPackage.VARCONTENT__VAR6:
				getVAR6().clear();
				return;
			case V2xmlPackage.VARCONTENT__ANY:
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
			case V2xmlPackage.VARCONTENT__VAR1:
				return vAR1 != null;
			case V2xmlPackage.VARCONTENT__VAR2:
				return vAR2 != null;
			case V2xmlPackage.VARCONTENT__VAR3:
				return vAR3 != null;
			case V2xmlPackage.VARCONTENT__VAR4:
				return vAR4 != null && !vAR4.isEmpty();
			case V2xmlPackage.VARCONTENT__VAR5:
				return vAR5 != null;
			case V2xmlPackage.VARCONTENT__VAR6:
				return vAR6 != null && !vAR6.isEmpty();
			case V2xmlPackage.VARCONTENT__ANY:
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

} //VARCONTENTImpl
