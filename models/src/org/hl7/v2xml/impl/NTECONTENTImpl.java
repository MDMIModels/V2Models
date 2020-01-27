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

import org.hl7.v2xml.NTE1CONTENT;
import org.hl7.v2xml.NTE2CONTENT;
import org.hl7.v2xml.NTE3CONTENT;
import org.hl7.v2xml.NTE4CONTENT;
import org.hl7.v2xml.NTECONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NTECONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NTECONTENTImpl#getNTE1 <em>NTE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NTECONTENTImpl#getNTE2 <em>NTE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NTECONTENTImpl#getNTE3 <em>NTE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NTECONTENTImpl#getNTE4 <em>NTE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NTECONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NTECONTENTImpl extends EObjectImpl implements NTECONTENT {
	/**
	 * The cached value of the '{@link #getNTE1() <em>NTE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTE1()
	 * @generated
	 * @ordered
	 */
	protected NTE1CONTENT nTE1;

	/**
	 * The cached value of the '{@link #getNTE2() <em>NTE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTE2()
	 * @generated
	 * @ordered
	 */
	protected NTE2CONTENT nTE2;

	/**
	 * The cached value of the '{@link #getNTE3() <em>NTE3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTE3()
	 * @generated
	 * @ordered
	 */
	protected EList<NTE3CONTENT> nTE3;

	/**
	 * The cached value of the '{@link #getNTE4() <em>NTE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNTE4()
	 * @generated
	 * @ordered
	 */
	protected NTE4CONTENT nTE4;

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
	protected NTECONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNTECONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NTE1CONTENT getNTE1() {
		return nTE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTE1(NTE1CONTENT newNTE1, NotificationChain msgs) {
		NTE1CONTENT oldNTE1 = nTE1;
		nTE1 = newNTE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE1, oldNTE1, newNTE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNTE1(NTE1CONTENT newNTE1) {
		if (newNTE1 != nTE1) {
			NotificationChain msgs = null;
			if (nTE1 != null)
				msgs = ((InternalEObject)nTE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE1, null, msgs);
			if (newNTE1 != null)
				msgs = ((InternalEObject)newNTE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE1, null, msgs);
			msgs = basicSetNTE1(newNTE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE1, newNTE1, newNTE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NTE2CONTENT getNTE2() {
		return nTE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTE2(NTE2CONTENT newNTE2, NotificationChain msgs) {
		NTE2CONTENT oldNTE2 = nTE2;
		nTE2 = newNTE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE2, oldNTE2, newNTE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNTE2(NTE2CONTENT newNTE2) {
		if (newNTE2 != nTE2) {
			NotificationChain msgs = null;
			if (nTE2 != null)
				msgs = ((InternalEObject)nTE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE2, null, msgs);
			if (newNTE2 != null)
				msgs = ((InternalEObject)newNTE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE2, null, msgs);
			msgs = basicSetNTE2(newNTE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE2, newNTE2, newNTE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NTE3CONTENT> getNTE3() {
		if (nTE3 == null) {
			nTE3 = new EObjectContainmentEList<NTE3CONTENT>(NTE3CONTENT.class, this, V2xmlPackage.NTECONTENT__NTE3);
		}
		return nTE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NTE4CONTENT getNTE4() {
		return nTE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNTE4(NTE4CONTENT newNTE4, NotificationChain msgs) {
		NTE4CONTENT oldNTE4 = nTE4;
		nTE4 = newNTE4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE4, oldNTE4, newNTE4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNTE4(NTE4CONTENT newNTE4) {
		if (newNTE4 != nTE4) {
			NotificationChain msgs = null;
			if (nTE4 != null)
				msgs = ((InternalEObject)nTE4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE4, null, msgs);
			if (newNTE4 != null)
				msgs = ((InternalEObject)newNTE4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NTECONTENT__NTE4, null, msgs);
			msgs = basicSetNTE4(newNTE4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NTECONTENT__NTE4, newNTE4, newNTE4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NTECONTENT__ANY);
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
			case V2xmlPackage.NTECONTENT__NTE1:
				return basicSetNTE1(null, msgs);
			case V2xmlPackage.NTECONTENT__NTE2:
				return basicSetNTE2(null, msgs);
			case V2xmlPackage.NTECONTENT__NTE3:
				return ((InternalEList<?>)getNTE3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NTECONTENT__NTE4:
				return basicSetNTE4(null, msgs);
			case V2xmlPackage.NTECONTENT__ANY:
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
			case V2xmlPackage.NTECONTENT__NTE1:
				return getNTE1();
			case V2xmlPackage.NTECONTENT__NTE2:
				return getNTE2();
			case V2xmlPackage.NTECONTENT__NTE3:
				return getNTE3();
			case V2xmlPackage.NTECONTENT__NTE4:
				return getNTE4();
			case V2xmlPackage.NTECONTENT__ANY:
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
			case V2xmlPackage.NTECONTENT__NTE1:
				setNTE1((NTE1CONTENT)newValue);
				return;
			case V2xmlPackage.NTECONTENT__NTE2:
				setNTE2((NTE2CONTENT)newValue);
				return;
			case V2xmlPackage.NTECONTENT__NTE3:
				getNTE3().clear();
				getNTE3().addAll((Collection<? extends NTE3CONTENT>)newValue);
				return;
			case V2xmlPackage.NTECONTENT__NTE4:
				setNTE4((NTE4CONTENT)newValue);
				return;
			case V2xmlPackage.NTECONTENT__ANY:
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
			case V2xmlPackage.NTECONTENT__NTE1:
				setNTE1((NTE1CONTENT)null);
				return;
			case V2xmlPackage.NTECONTENT__NTE2:
				setNTE2((NTE2CONTENT)null);
				return;
			case V2xmlPackage.NTECONTENT__NTE3:
				getNTE3().clear();
				return;
			case V2xmlPackage.NTECONTENT__NTE4:
				setNTE4((NTE4CONTENT)null);
				return;
			case V2xmlPackage.NTECONTENT__ANY:
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
			case V2xmlPackage.NTECONTENT__NTE1:
				return nTE1 != null;
			case V2xmlPackage.NTECONTENT__NTE2:
				return nTE2 != null;
			case V2xmlPackage.NTECONTENT__NTE3:
				return nTE3 != null && !nTE3.isEmpty();
			case V2xmlPackage.NTECONTENT__NTE4:
				return nTE4 != null;
			case V2xmlPackage.NTECONTENT__ANY:
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

} //NTECONTENTImpl
