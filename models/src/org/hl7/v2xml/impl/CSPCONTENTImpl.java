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

import org.hl7.v2xml.CSP1CONTENT;
import org.hl7.v2xml.CSP2CONTENT;
import org.hl7.v2xml.CSP3CONTENT;
import org.hl7.v2xml.CSP4CONTENT;
import org.hl7.v2xml.CSPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CSPCONTENTImpl#getCSP1 <em>CSP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSPCONTENTImpl#getCSP2 <em>CSP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSPCONTENTImpl#getCSP3 <em>CSP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSPCONTENTImpl#getCSP4 <em>CSP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSPCONTENTImpl extends EObjectImpl implements CSPCONTENT {
	/**
	 * The cached value of the '{@link #getCSP1() <em>CSP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSP1()
	 * @generated
	 * @ordered
	 */
	protected CSP1CONTENT cSP1;

	/**
	 * The cached value of the '{@link #getCSP2() <em>CSP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSP2()
	 * @generated
	 * @ordered
	 */
	protected CSP2CONTENT cSP2;

	/**
	 * The cached value of the '{@link #getCSP3() <em>CSP3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSP3()
	 * @generated
	 * @ordered
	 */
	protected CSP3CONTENT cSP3;

	/**
	 * The cached value of the '{@link #getCSP4() <em>CSP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSP4()
	 * @generated
	 * @ordered
	 */
	protected CSP4CONTENT cSP4;

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
	protected CSPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCSPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP1CONTENT getCSP1() {
		return cSP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSP1(CSP1CONTENT newCSP1, NotificationChain msgs) {
		CSP1CONTENT oldCSP1 = cSP1;
		cSP1 = newCSP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP1, oldCSP1, newCSP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSP1(CSP1CONTENT newCSP1) {
		if (newCSP1 != cSP1) {
			NotificationChain msgs = null;
			if (cSP1 != null)
				msgs = ((InternalEObject)cSP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP1, null, msgs);
			if (newCSP1 != null)
				msgs = ((InternalEObject)newCSP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP1, null, msgs);
			msgs = basicSetCSP1(newCSP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP1, newCSP1, newCSP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP2CONTENT getCSP2() {
		return cSP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSP2(CSP2CONTENT newCSP2, NotificationChain msgs) {
		CSP2CONTENT oldCSP2 = cSP2;
		cSP2 = newCSP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP2, oldCSP2, newCSP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSP2(CSP2CONTENT newCSP2) {
		if (newCSP2 != cSP2) {
			NotificationChain msgs = null;
			if (cSP2 != null)
				msgs = ((InternalEObject)cSP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP2, null, msgs);
			if (newCSP2 != null)
				msgs = ((InternalEObject)newCSP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP2, null, msgs);
			msgs = basicSetCSP2(newCSP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP2, newCSP2, newCSP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP3CONTENT getCSP3() {
		return cSP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSP3(CSP3CONTENT newCSP3, NotificationChain msgs) {
		CSP3CONTENT oldCSP3 = cSP3;
		cSP3 = newCSP3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP3, oldCSP3, newCSP3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSP3(CSP3CONTENT newCSP3) {
		if (newCSP3 != cSP3) {
			NotificationChain msgs = null;
			if (cSP3 != null)
				msgs = ((InternalEObject)cSP3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP3, null, msgs);
			if (newCSP3 != null)
				msgs = ((InternalEObject)newCSP3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP3, null, msgs);
			msgs = basicSetCSP3(newCSP3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP3, newCSP3, newCSP3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSP4CONTENT getCSP4() {
		return cSP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSP4(CSP4CONTENT newCSP4, NotificationChain msgs) {
		CSP4CONTENT oldCSP4 = cSP4;
		cSP4 = newCSP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP4, oldCSP4, newCSP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSP4(CSP4CONTENT newCSP4) {
		if (newCSP4 != cSP4) {
			NotificationChain msgs = null;
			if (cSP4 != null)
				msgs = ((InternalEObject)cSP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP4, null, msgs);
			if (newCSP4 != null)
				msgs = ((InternalEObject)newCSP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSPCONTENT__CSP4, null, msgs);
			msgs = basicSetCSP4(newCSP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSPCONTENT__CSP4, newCSP4, newCSP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CSPCONTENT__ANY);
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
			case V2xmlPackage.CSPCONTENT__CSP1:
				return basicSetCSP1(null, msgs);
			case V2xmlPackage.CSPCONTENT__CSP2:
				return basicSetCSP2(null, msgs);
			case V2xmlPackage.CSPCONTENT__CSP3:
				return basicSetCSP3(null, msgs);
			case V2xmlPackage.CSPCONTENT__CSP4:
				return basicSetCSP4(null, msgs);
			case V2xmlPackage.CSPCONTENT__ANY:
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
			case V2xmlPackage.CSPCONTENT__CSP1:
				return getCSP1();
			case V2xmlPackage.CSPCONTENT__CSP2:
				return getCSP2();
			case V2xmlPackage.CSPCONTENT__CSP3:
				return getCSP3();
			case V2xmlPackage.CSPCONTENT__CSP4:
				return getCSP4();
			case V2xmlPackage.CSPCONTENT__ANY:
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
			case V2xmlPackage.CSPCONTENT__CSP1:
				setCSP1((CSP1CONTENT)newValue);
				return;
			case V2xmlPackage.CSPCONTENT__CSP2:
				setCSP2((CSP2CONTENT)newValue);
				return;
			case V2xmlPackage.CSPCONTENT__CSP3:
				setCSP3((CSP3CONTENT)newValue);
				return;
			case V2xmlPackage.CSPCONTENT__CSP4:
				setCSP4((CSP4CONTENT)newValue);
				return;
			case V2xmlPackage.CSPCONTENT__ANY:
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
			case V2xmlPackage.CSPCONTENT__CSP1:
				setCSP1((CSP1CONTENT)null);
				return;
			case V2xmlPackage.CSPCONTENT__CSP2:
				setCSP2((CSP2CONTENT)null);
				return;
			case V2xmlPackage.CSPCONTENT__CSP3:
				setCSP3((CSP3CONTENT)null);
				return;
			case V2xmlPackage.CSPCONTENT__CSP4:
				setCSP4((CSP4CONTENT)null);
				return;
			case V2xmlPackage.CSPCONTENT__ANY:
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
			case V2xmlPackage.CSPCONTENT__CSP1:
				return cSP1 != null;
			case V2xmlPackage.CSPCONTENT__CSP2:
				return cSP2 != null;
			case V2xmlPackage.CSPCONTENT__CSP3:
				return cSP3 != null;
			case V2xmlPackage.CSPCONTENT__CSP4:
				return cSP4 != null;
			case V2xmlPackage.CSPCONTENT__ANY:
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

} //CSPCONTENTImpl
