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

import org.hl7.v2xml.CNS1CONTENT;
import org.hl7.v2xml.CNS2CONTENT;
import org.hl7.v2xml.CNS3CONTENT;
import org.hl7.v2xml.CNS4CONTENT;
import org.hl7.v2xml.CNS5CONTENT;
import org.hl7.v2xml.CNS6CONTENT;
import org.hl7.v2xml.CNSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CNSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS1 <em>CNS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS2 <em>CNS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS3 <em>CNS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS4 <em>CNS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS5 <em>CNS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getCNS6 <em>CNS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CNSCONTENTImpl extends EObjectImpl implements CNSCONTENT {
	/**
	 * The cached value of the '{@link #getCNS1() <em>CNS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS1()
	 * @generated
	 * @ordered
	 */
	protected CNS1CONTENT cNS1;

	/**
	 * The cached value of the '{@link #getCNS2() <em>CNS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS2()
	 * @generated
	 * @ordered
	 */
	protected CNS2CONTENT cNS2;

	/**
	 * The cached value of the '{@link #getCNS3() <em>CNS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS3()
	 * @generated
	 * @ordered
	 */
	protected CNS3CONTENT cNS3;

	/**
	 * The cached value of the '{@link #getCNS4() <em>CNS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS4()
	 * @generated
	 * @ordered
	 */
	protected CNS4CONTENT cNS4;

	/**
	 * The cached value of the '{@link #getCNS5() <em>CNS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS5()
	 * @generated
	 * @ordered
	 */
	protected CNS5CONTENT cNS5;

	/**
	 * The cached value of the '{@link #getCNS6() <em>CNS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNS6()
	 * @generated
	 * @ordered
	 */
	protected CNS6CONTENT cNS6;

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
	protected CNSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCNSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS1CONTENT getCNS1() {
		return cNS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS1(CNS1CONTENT newCNS1, NotificationChain msgs) {
		CNS1CONTENT oldCNS1 = cNS1;
		cNS1 = newCNS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS1, oldCNS1, newCNS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS1(CNS1CONTENT newCNS1) {
		if (newCNS1 != cNS1) {
			NotificationChain msgs = null;
			if (cNS1 != null)
				msgs = ((InternalEObject)cNS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS1, null, msgs);
			if (newCNS1 != null)
				msgs = ((InternalEObject)newCNS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS1, null, msgs);
			msgs = basicSetCNS1(newCNS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS1, newCNS1, newCNS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS2CONTENT getCNS2() {
		return cNS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS2(CNS2CONTENT newCNS2, NotificationChain msgs) {
		CNS2CONTENT oldCNS2 = cNS2;
		cNS2 = newCNS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS2, oldCNS2, newCNS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS2(CNS2CONTENT newCNS2) {
		if (newCNS2 != cNS2) {
			NotificationChain msgs = null;
			if (cNS2 != null)
				msgs = ((InternalEObject)cNS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS2, null, msgs);
			if (newCNS2 != null)
				msgs = ((InternalEObject)newCNS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS2, null, msgs);
			msgs = basicSetCNS2(newCNS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS2, newCNS2, newCNS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS3CONTENT getCNS3() {
		return cNS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS3(CNS3CONTENT newCNS3, NotificationChain msgs) {
		CNS3CONTENT oldCNS3 = cNS3;
		cNS3 = newCNS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS3, oldCNS3, newCNS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS3(CNS3CONTENT newCNS3) {
		if (newCNS3 != cNS3) {
			NotificationChain msgs = null;
			if (cNS3 != null)
				msgs = ((InternalEObject)cNS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS3, null, msgs);
			if (newCNS3 != null)
				msgs = ((InternalEObject)newCNS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS3, null, msgs);
			msgs = basicSetCNS3(newCNS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS3, newCNS3, newCNS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS4CONTENT getCNS4() {
		return cNS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS4(CNS4CONTENT newCNS4, NotificationChain msgs) {
		CNS4CONTENT oldCNS4 = cNS4;
		cNS4 = newCNS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS4, oldCNS4, newCNS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS4(CNS4CONTENT newCNS4) {
		if (newCNS4 != cNS4) {
			NotificationChain msgs = null;
			if (cNS4 != null)
				msgs = ((InternalEObject)cNS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS4, null, msgs);
			if (newCNS4 != null)
				msgs = ((InternalEObject)newCNS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS4, null, msgs);
			msgs = basicSetCNS4(newCNS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS4, newCNS4, newCNS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS5CONTENT getCNS5() {
		return cNS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS5(CNS5CONTENT newCNS5, NotificationChain msgs) {
		CNS5CONTENT oldCNS5 = cNS5;
		cNS5 = newCNS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS5, oldCNS5, newCNS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS5(CNS5CONTENT newCNS5) {
		if (newCNS5 != cNS5) {
			NotificationChain msgs = null;
			if (cNS5 != null)
				msgs = ((InternalEObject)cNS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS5, null, msgs);
			if (newCNS5 != null)
				msgs = ((InternalEObject)newCNS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS5, null, msgs);
			msgs = basicSetCNS5(newCNS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS5, newCNS5, newCNS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNS6CONTENT getCNS6() {
		return cNS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNS6(CNS6CONTENT newCNS6, NotificationChain msgs) {
		CNS6CONTENT oldCNS6 = cNS6;
		cNS6 = newCNS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS6, oldCNS6, newCNS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNS6(CNS6CONTENT newCNS6) {
		if (newCNS6 != cNS6) {
			NotificationChain msgs = null;
			if (cNS6 != null)
				msgs = ((InternalEObject)cNS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS6, null, msgs);
			if (newCNS6 != null)
				msgs = ((InternalEObject)newCNS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNSCONTENT__CNS6, null, msgs);
			msgs = basicSetCNS6(newCNS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNSCONTENT__CNS6, newCNS6, newCNS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CNSCONTENT__ANY);
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
			case V2xmlPackage.CNSCONTENT__CNS1:
				return basicSetCNS1(null, msgs);
			case V2xmlPackage.CNSCONTENT__CNS2:
				return basicSetCNS2(null, msgs);
			case V2xmlPackage.CNSCONTENT__CNS3:
				return basicSetCNS3(null, msgs);
			case V2xmlPackage.CNSCONTENT__CNS4:
				return basicSetCNS4(null, msgs);
			case V2xmlPackage.CNSCONTENT__CNS5:
				return basicSetCNS5(null, msgs);
			case V2xmlPackage.CNSCONTENT__CNS6:
				return basicSetCNS6(null, msgs);
			case V2xmlPackage.CNSCONTENT__ANY:
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
			case V2xmlPackage.CNSCONTENT__CNS1:
				return getCNS1();
			case V2xmlPackage.CNSCONTENT__CNS2:
				return getCNS2();
			case V2xmlPackage.CNSCONTENT__CNS3:
				return getCNS3();
			case V2xmlPackage.CNSCONTENT__CNS4:
				return getCNS4();
			case V2xmlPackage.CNSCONTENT__CNS5:
				return getCNS5();
			case V2xmlPackage.CNSCONTENT__CNS6:
				return getCNS6();
			case V2xmlPackage.CNSCONTENT__ANY:
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
			case V2xmlPackage.CNSCONTENT__CNS1:
				setCNS1((CNS1CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__CNS2:
				setCNS2((CNS2CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__CNS3:
				setCNS3((CNS3CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__CNS4:
				setCNS4((CNS4CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__CNS5:
				setCNS5((CNS5CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__CNS6:
				setCNS6((CNS6CONTENT)newValue);
				return;
			case V2xmlPackage.CNSCONTENT__ANY:
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
			case V2xmlPackage.CNSCONTENT__CNS1:
				setCNS1((CNS1CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__CNS2:
				setCNS2((CNS2CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__CNS3:
				setCNS3((CNS3CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__CNS4:
				setCNS4((CNS4CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__CNS5:
				setCNS5((CNS5CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__CNS6:
				setCNS6((CNS6CONTENT)null);
				return;
			case V2xmlPackage.CNSCONTENT__ANY:
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
			case V2xmlPackage.CNSCONTENT__CNS1:
				return cNS1 != null;
			case V2xmlPackage.CNSCONTENT__CNS2:
				return cNS2 != null;
			case V2xmlPackage.CNSCONTENT__CNS3:
				return cNS3 != null;
			case V2xmlPackage.CNSCONTENT__CNS4:
				return cNS4 != null;
			case V2xmlPackage.CNSCONTENT__CNS5:
				return cNS5 != null;
			case V2xmlPackage.CNSCONTENT__CNS6:
				return cNS6 != null;
			case V2xmlPackage.CNSCONTENT__ANY:
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

} //CNSCONTENTImpl
