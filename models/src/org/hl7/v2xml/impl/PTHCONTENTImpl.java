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

import org.hl7.v2xml.PTH1CONTENT;
import org.hl7.v2xml.PTH2CONTENT;
import org.hl7.v2xml.PTH3CONTENT;
import org.hl7.v2xml.PTH4CONTENT;
import org.hl7.v2xml.PTH5CONTENT;
import org.hl7.v2xml.PTH6CONTENT;
import org.hl7.v2xml.PTHCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTHCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH1 <em>PTH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH2 <em>PTH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH3 <em>PTH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH4 <em>PTH4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH5 <em>PTH5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getPTH6 <em>PTH6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PTHCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTHCONTENTImpl extends EObjectImpl implements PTHCONTENT {
	/**
	 * The cached value of the '{@link #getPTH1() <em>PTH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH1()
	 * @generated
	 * @ordered
	 */
	protected PTH1CONTENT pTH1;

	/**
	 * The cached value of the '{@link #getPTH2() <em>PTH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH2()
	 * @generated
	 * @ordered
	 */
	protected PTH2CONTENT pTH2;

	/**
	 * The cached value of the '{@link #getPTH3() <em>PTH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH3()
	 * @generated
	 * @ordered
	 */
	protected PTH3CONTENT pTH3;

	/**
	 * The cached value of the '{@link #getPTH4() <em>PTH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH4()
	 * @generated
	 * @ordered
	 */
	protected PTH4CONTENT pTH4;

	/**
	 * The cached value of the '{@link #getPTH5() <em>PTH5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH5()
	 * @generated
	 * @ordered
	 */
	protected PTH5CONTENT pTH5;

	/**
	 * The cached value of the '{@link #getPTH6() <em>PTH6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTH6()
	 * @generated
	 * @ordered
	 */
	protected PTH6CONTENT pTH6;

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
	protected PTHCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPTHCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH1CONTENT getPTH1() {
		return pTH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH1(PTH1CONTENT newPTH1, NotificationChain msgs) {
		PTH1CONTENT oldPTH1 = pTH1;
		pTH1 = newPTH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH1, oldPTH1, newPTH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH1(PTH1CONTENT newPTH1) {
		if (newPTH1 != pTH1) {
			NotificationChain msgs = null;
			if (pTH1 != null)
				msgs = ((InternalEObject)pTH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH1, null, msgs);
			if (newPTH1 != null)
				msgs = ((InternalEObject)newPTH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH1, null, msgs);
			msgs = basicSetPTH1(newPTH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH1, newPTH1, newPTH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH2CONTENT getPTH2() {
		return pTH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH2(PTH2CONTENT newPTH2, NotificationChain msgs) {
		PTH2CONTENT oldPTH2 = pTH2;
		pTH2 = newPTH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH2, oldPTH2, newPTH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH2(PTH2CONTENT newPTH2) {
		if (newPTH2 != pTH2) {
			NotificationChain msgs = null;
			if (pTH2 != null)
				msgs = ((InternalEObject)pTH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH2, null, msgs);
			if (newPTH2 != null)
				msgs = ((InternalEObject)newPTH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH2, null, msgs);
			msgs = basicSetPTH2(newPTH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH2, newPTH2, newPTH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH3CONTENT getPTH3() {
		return pTH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH3(PTH3CONTENT newPTH3, NotificationChain msgs) {
		PTH3CONTENT oldPTH3 = pTH3;
		pTH3 = newPTH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH3, oldPTH3, newPTH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH3(PTH3CONTENT newPTH3) {
		if (newPTH3 != pTH3) {
			NotificationChain msgs = null;
			if (pTH3 != null)
				msgs = ((InternalEObject)pTH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH3, null, msgs);
			if (newPTH3 != null)
				msgs = ((InternalEObject)newPTH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH3, null, msgs);
			msgs = basicSetPTH3(newPTH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH3, newPTH3, newPTH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH4CONTENT getPTH4() {
		return pTH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH4(PTH4CONTENT newPTH4, NotificationChain msgs) {
		PTH4CONTENT oldPTH4 = pTH4;
		pTH4 = newPTH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH4, oldPTH4, newPTH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH4(PTH4CONTENT newPTH4) {
		if (newPTH4 != pTH4) {
			NotificationChain msgs = null;
			if (pTH4 != null)
				msgs = ((InternalEObject)pTH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH4, null, msgs);
			if (newPTH4 != null)
				msgs = ((InternalEObject)newPTH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH4, null, msgs);
			msgs = basicSetPTH4(newPTH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH4, newPTH4, newPTH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH5CONTENT getPTH5() {
		return pTH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH5(PTH5CONTENT newPTH5, NotificationChain msgs) {
		PTH5CONTENT oldPTH5 = pTH5;
		pTH5 = newPTH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH5, oldPTH5, newPTH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH5(PTH5CONTENT newPTH5) {
		if (newPTH5 != pTH5) {
			NotificationChain msgs = null;
			if (pTH5 != null)
				msgs = ((InternalEObject)pTH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH5, null, msgs);
			if (newPTH5 != null)
				msgs = ((InternalEObject)newPTH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH5, null, msgs);
			msgs = basicSetPTH5(newPTH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH5, newPTH5, newPTH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTH6CONTENT getPTH6() {
		return pTH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPTH6(PTH6CONTENT newPTH6, NotificationChain msgs) {
		PTH6CONTENT oldPTH6 = pTH6;
		pTH6 = newPTH6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH6, oldPTH6, newPTH6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTH6(PTH6CONTENT newPTH6) {
		if (newPTH6 != pTH6) {
			NotificationChain msgs = null;
			if (pTH6 != null)
				msgs = ((InternalEObject)pTH6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH6, null, msgs);
			if (newPTH6 != null)
				msgs = ((InternalEObject)newPTH6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PTHCONTENT__PTH6, null, msgs);
			msgs = basicSetPTH6(newPTH6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PTHCONTENT__PTH6, newPTH6, newPTH6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PTHCONTENT__ANY);
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
			case V2xmlPackage.PTHCONTENT__PTH1:
				return basicSetPTH1(null, msgs);
			case V2xmlPackage.PTHCONTENT__PTH2:
				return basicSetPTH2(null, msgs);
			case V2xmlPackage.PTHCONTENT__PTH3:
				return basicSetPTH3(null, msgs);
			case V2xmlPackage.PTHCONTENT__PTH4:
				return basicSetPTH4(null, msgs);
			case V2xmlPackage.PTHCONTENT__PTH5:
				return basicSetPTH5(null, msgs);
			case V2xmlPackage.PTHCONTENT__PTH6:
				return basicSetPTH6(null, msgs);
			case V2xmlPackage.PTHCONTENT__ANY:
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
			case V2xmlPackage.PTHCONTENT__PTH1:
				return getPTH1();
			case V2xmlPackage.PTHCONTENT__PTH2:
				return getPTH2();
			case V2xmlPackage.PTHCONTENT__PTH3:
				return getPTH3();
			case V2xmlPackage.PTHCONTENT__PTH4:
				return getPTH4();
			case V2xmlPackage.PTHCONTENT__PTH5:
				return getPTH5();
			case V2xmlPackage.PTHCONTENT__PTH6:
				return getPTH6();
			case V2xmlPackage.PTHCONTENT__ANY:
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
			case V2xmlPackage.PTHCONTENT__PTH1:
				setPTH1((PTH1CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__PTH2:
				setPTH2((PTH2CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__PTH3:
				setPTH3((PTH3CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__PTH4:
				setPTH4((PTH4CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__PTH5:
				setPTH5((PTH5CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__PTH6:
				setPTH6((PTH6CONTENT)newValue);
				return;
			case V2xmlPackage.PTHCONTENT__ANY:
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
			case V2xmlPackage.PTHCONTENT__PTH1:
				setPTH1((PTH1CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__PTH2:
				setPTH2((PTH2CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__PTH3:
				setPTH3((PTH3CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__PTH4:
				setPTH4((PTH4CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__PTH5:
				setPTH5((PTH5CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__PTH6:
				setPTH6((PTH6CONTENT)null);
				return;
			case V2xmlPackage.PTHCONTENT__ANY:
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
			case V2xmlPackage.PTHCONTENT__PTH1:
				return pTH1 != null;
			case V2xmlPackage.PTHCONTENT__PTH2:
				return pTH2 != null;
			case V2xmlPackage.PTHCONTENT__PTH3:
				return pTH3 != null;
			case V2xmlPackage.PTHCONTENT__PTH4:
				return pTH4 != null;
			case V2xmlPackage.PTHCONTENT__PTH5:
				return pTH5 != null;
			case V2xmlPackage.PTHCONTENT__PTH6:
				return pTH6 != null;
			case V2xmlPackage.PTHCONTENT__ANY:
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

} //PTHCONTENTImpl
