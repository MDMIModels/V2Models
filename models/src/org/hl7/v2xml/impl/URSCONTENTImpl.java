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

import org.hl7.v2xml.URS1CONTENT;
import org.hl7.v2xml.URS2CONTENT;
import org.hl7.v2xml.URS3CONTENT;
import org.hl7.v2xml.URS4CONTENT;
import org.hl7.v2xml.URS5CONTENT;
import org.hl7.v2xml.URS6CONTENT;
import org.hl7.v2xml.URS7CONTENT;
import org.hl7.v2xml.URS8CONTENT;
import org.hl7.v2xml.URS9CONTENT;
import org.hl7.v2xml.URSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS1 <em>URS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS2 <em>URS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS3 <em>URS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS4 <em>URS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS5 <em>URS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS6 <em>URS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS7 <em>URS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS8 <em>URS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getURS9 <em>URS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.URSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URSCONTENTImpl extends EObjectImpl implements URSCONTENT {
	/**
	 * The cached value of the '{@link #getURS1() <em>URS1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS1()
	 * @generated
	 * @ordered
	 */
	protected EList<URS1CONTENT> uRS1;

	/**
	 * The cached value of the '{@link #getURS2() <em>URS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS2()
	 * @generated
	 * @ordered
	 */
	protected URS2CONTENT uRS2;

	/**
	 * The cached value of the '{@link #getURS3() <em>URS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS3()
	 * @generated
	 * @ordered
	 */
	protected URS3CONTENT uRS3;

	/**
	 * The cached value of the '{@link #getURS4() <em>URS4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS4()
	 * @generated
	 * @ordered
	 */
	protected EList<URS4CONTENT> uRS4;

	/**
	 * The cached value of the '{@link #getURS5() <em>URS5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS5()
	 * @generated
	 * @ordered
	 */
	protected EList<URS5CONTENT> uRS5;

	/**
	 * The cached value of the '{@link #getURS6() <em>URS6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS6()
	 * @generated
	 * @ordered
	 */
	protected EList<URS6CONTENT> uRS6;

	/**
	 * The cached value of the '{@link #getURS7() <em>URS7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS7()
	 * @generated
	 * @ordered
	 */
	protected EList<URS7CONTENT> uRS7;

	/**
	 * The cached value of the '{@link #getURS8() <em>URS8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS8()
	 * @generated
	 * @ordered
	 */
	protected EList<URS8CONTENT> uRS8;

	/**
	 * The cached value of the '{@link #getURS9() <em>URS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getURS9()
	 * @generated
	 * @ordered
	 */
	protected URS9CONTENT uRS9;

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
	protected URSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getURSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS1CONTENT> getURS1() {
		if (uRS1 == null) {
			uRS1 = new EObjectContainmentEList<URS1CONTENT>(URS1CONTENT.class, this, V2xmlPackage.URSCONTENT__URS1);
		}
		return uRS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URS2CONTENT getURS2() {
		return uRS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURS2(URS2CONTENT newURS2, NotificationChain msgs) {
		URS2CONTENT oldURS2 = uRS2;
		uRS2 = newURS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS2, oldURS2, newURS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURS2(URS2CONTENT newURS2) {
		if (newURS2 != uRS2) {
			NotificationChain msgs = null;
			if (uRS2 != null)
				msgs = ((InternalEObject)uRS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS2, null, msgs);
			if (newURS2 != null)
				msgs = ((InternalEObject)newURS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS2, null, msgs);
			msgs = basicSetURS2(newURS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS2, newURS2, newURS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URS3CONTENT getURS3() {
		return uRS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURS3(URS3CONTENT newURS3, NotificationChain msgs) {
		URS3CONTENT oldURS3 = uRS3;
		uRS3 = newURS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS3, oldURS3, newURS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURS3(URS3CONTENT newURS3) {
		if (newURS3 != uRS3) {
			NotificationChain msgs = null;
			if (uRS3 != null)
				msgs = ((InternalEObject)uRS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS3, null, msgs);
			if (newURS3 != null)
				msgs = ((InternalEObject)newURS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS3, null, msgs);
			msgs = basicSetURS3(newURS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS3, newURS3, newURS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS4CONTENT> getURS4() {
		if (uRS4 == null) {
			uRS4 = new EObjectContainmentEList<URS4CONTENT>(URS4CONTENT.class, this, V2xmlPackage.URSCONTENT__URS4);
		}
		return uRS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS5CONTENT> getURS5() {
		if (uRS5 == null) {
			uRS5 = new EObjectContainmentEList<URS5CONTENT>(URS5CONTENT.class, this, V2xmlPackage.URSCONTENT__URS5);
		}
		return uRS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS6CONTENT> getURS6() {
		if (uRS6 == null) {
			uRS6 = new EObjectContainmentEList<URS6CONTENT>(URS6CONTENT.class, this, V2xmlPackage.URSCONTENT__URS6);
		}
		return uRS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS7CONTENT> getURS7() {
		if (uRS7 == null) {
			uRS7 = new EObjectContainmentEList<URS7CONTENT>(URS7CONTENT.class, this, V2xmlPackage.URSCONTENT__URS7);
		}
		return uRS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<URS8CONTENT> getURS8() {
		if (uRS8 == null) {
			uRS8 = new EObjectContainmentEList<URS8CONTENT>(URS8CONTENT.class, this, V2xmlPackage.URSCONTENT__URS8);
		}
		return uRS8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URS9CONTENT getURS9() {
		return uRS9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetURS9(URS9CONTENT newURS9, NotificationChain msgs) {
		URS9CONTENT oldURS9 = uRS9;
		uRS9 = newURS9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS9, oldURS9, newURS9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setURS9(URS9CONTENT newURS9) {
		if (newURS9 != uRS9) {
			NotificationChain msgs = null;
			if (uRS9 != null)
				msgs = ((InternalEObject)uRS9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS9, null, msgs);
			if (newURS9 != null)
				msgs = ((InternalEObject)newURS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.URSCONTENT__URS9, null, msgs);
			msgs = basicSetURS9(newURS9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.URSCONTENT__URS9, newURS9, newURS9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.URSCONTENT__ANY);
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
			case V2xmlPackage.URSCONTENT__URS1:
				return ((InternalEList<?>)getURS1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS2:
				return basicSetURS2(null, msgs);
			case V2xmlPackage.URSCONTENT__URS3:
				return basicSetURS3(null, msgs);
			case V2xmlPackage.URSCONTENT__URS4:
				return ((InternalEList<?>)getURS4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS5:
				return ((InternalEList<?>)getURS5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS6:
				return ((InternalEList<?>)getURS6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS7:
				return ((InternalEList<?>)getURS7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS8:
				return ((InternalEList<?>)getURS8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.URSCONTENT__URS9:
				return basicSetURS9(null, msgs);
			case V2xmlPackage.URSCONTENT__ANY:
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
			case V2xmlPackage.URSCONTENT__URS1:
				return getURS1();
			case V2xmlPackage.URSCONTENT__URS2:
				return getURS2();
			case V2xmlPackage.URSCONTENT__URS3:
				return getURS3();
			case V2xmlPackage.URSCONTENT__URS4:
				return getURS4();
			case V2xmlPackage.URSCONTENT__URS5:
				return getURS5();
			case V2xmlPackage.URSCONTENT__URS6:
				return getURS6();
			case V2xmlPackage.URSCONTENT__URS7:
				return getURS7();
			case V2xmlPackage.URSCONTENT__URS8:
				return getURS8();
			case V2xmlPackage.URSCONTENT__URS9:
				return getURS9();
			case V2xmlPackage.URSCONTENT__ANY:
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
			case V2xmlPackage.URSCONTENT__URS1:
				getURS1().clear();
				getURS1().addAll((Collection<? extends URS1CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS2:
				setURS2((URS2CONTENT)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS3:
				setURS3((URS3CONTENT)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS4:
				getURS4().clear();
				getURS4().addAll((Collection<? extends URS4CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS5:
				getURS5().clear();
				getURS5().addAll((Collection<? extends URS5CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS6:
				getURS6().clear();
				getURS6().addAll((Collection<? extends URS6CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS7:
				getURS7().clear();
				getURS7().addAll((Collection<? extends URS7CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS8:
				getURS8().clear();
				getURS8().addAll((Collection<? extends URS8CONTENT>)newValue);
				return;
			case V2xmlPackage.URSCONTENT__URS9:
				setURS9((URS9CONTENT)newValue);
				return;
			case V2xmlPackage.URSCONTENT__ANY:
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
			case V2xmlPackage.URSCONTENT__URS1:
				getURS1().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS2:
				setURS2((URS2CONTENT)null);
				return;
			case V2xmlPackage.URSCONTENT__URS3:
				setURS3((URS3CONTENT)null);
				return;
			case V2xmlPackage.URSCONTENT__URS4:
				getURS4().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS5:
				getURS5().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS6:
				getURS6().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS7:
				getURS7().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS8:
				getURS8().clear();
				return;
			case V2xmlPackage.URSCONTENT__URS9:
				setURS9((URS9CONTENT)null);
				return;
			case V2xmlPackage.URSCONTENT__ANY:
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
			case V2xmlPackage.URSCONTENT__URS1:
				return uRS1 != null && !uRS1.isEmpty();
			case V2xmlPackage.URSCONTENT__URS2:
				return uRS2 != null;
			case V2xmlPackage.URSCONTENT__URS3:
				return uRS3 != null;
			case V2xmlPackage.URSCONTENT__URS4:
				return uRS4 != null && !uRS4.isEmpty();
			case V2xmlPackage.URSCONTENT__URS5:
				return uRS5 != null && !uRS5.isEmpty();
			case V2xmlPackage.URSCONTENT__URS6:
				return uRS6 != null && !uRS6.isEmpty();
			case V2xmlPackage.URSCONTENT__URS7:
				return uRS7 != null && !uRS7.isEmpty();
			case V2xmlPackage.URSCONTENT__URS8:
				return uRS8 != null && !uRS8.isEmpty();
			case V2xmlPackage.URSCONTENT__URS9:
				return uRS9 != null;
			case V2xmlPackage.URSCONTENT__ANY:
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

} //URSCONTENTImpl
