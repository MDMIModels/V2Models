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

import org.hl7.v2xml.LOC1CONTENT;
import org.hl7.v2xml.LOC2CONTENT;
import org.hl7.v2xml.LOC3CONTENT;
import org.hl7.v2xml.LOC4CONTENT;
import org.hl7.v2xml.LOC5CONTENT;
import org.hl7.v2xml.LOC6CONTENT;
import org.hl7.v2xml.LOC7CONTENT;
import org.hl7.v2xml.LOC8CONTENT;
import org.hl7.v2xml.LOC9CONTENT;
import org.hl7.v2xml.LOCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LOCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC1 <em>LOC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC2 <em>LOC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC3 <em>LOC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC4 <em>LOC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC5 <em>LOC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC6 <em>LOC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC7 <em>LOC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC8 <em>LOC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getLOC9 <em>LOC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LOCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LOCCONTENTImpl extends EObjectImpl implements LOCCONTENT {
	/**
	 * The cached value of the '{@link #getLOC1() <em>LOC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC1()
	 * @generated
	 * @ordered
	 */
	protected LOC1CONTENT lOC1;

	/**
	 * The cached value of the '{@link #getLOC2() <em>LOC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC2()
	 * @generated
	 * @ordered
	 */
	protected LOC2CONTENT lOC2;

	/**
	 * The cached value of the '{@link #getLOC3() <em>LOC3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC3()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC3CONTENT> lOC3;

	/**
	 * The cached value of the '{@link #getLOC4() <em>LOC4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC4()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC4CONTENT> lOC4;

	/**
	 * The cached value of the '{@link #getLOC5() <em>LOC5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC5()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC5CONTENT> lOC5;

	/**
	 * The cached value of the '{@link #getLOC6() <em>LOC6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC6()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC6CONTENT> lOC6;

	/**
	 * The cached value of the '{@link #getLOC7() <em>LOC7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC7()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC7CONTENT> lOC7;

	/**
	 * The cached value of the '{@link #getLOC8() <em>LOC8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC8()
	 * @generated
	 * @ordered
	 */
	protected EList<LOC8CONTENT> lOC8;

	/**
	 * The cached value of the '{@link #getLOC9() <em>LOC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLOC9()
	 * @generated
	 * @ordered
	 */
	protected LOC9CONTENT lOC9;

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
	protected LOCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLOCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOC1CONTENT getLOC1() {
		return lOC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOC1(LOC1CONTENT newLOC1, NotificationChain msgs) {
		LOC1CONTENT oldLOC1 = lOC1;
		lOC1 = newLOC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC1, oldLOC1, newLOC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLOC1(LOC1CONTENT newLOC1) {
		if (newLOC1 != lOC1) {
			NotificationChain msgs = null;
			if (lOC1 != null)
				msgs = ((InternalEObject)lOC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC1, null, msgs);
			if (newLOC1 != null)
				msgs = ((InternalEObject)newLOC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC1, null, msgs);
			msgs = basicSetLOC1(newLOC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC1, newLOC1, newLOC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOC2CONTENT getLOC2() {
		return lOC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOC2(LOC2CONTENT newLOC2, NotificationChain msgs) {
		LOC2CONTENT oldLOC2 = lOC2;
		lOC2 = newLOC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC2, oldLOC2, newLOC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLOC2(LOC2CONTENT newLOC2) {
		if (newLOC2 != lOC2) {
			NotificationChain msgs = null;
			if (lOC2 != null)
				msgs = ((InternalEObject)lOC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC2, null, msgs);
			if (newLOC2 != null)
				msgs = ((InternalEObject)newLOC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC2, null, msgs);
			msgs = basicSetLOC2(newLOC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC2, newLOC2, newLOC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC3CONTENT> getLOC3() {
		if (lOC3 == null) {
			lOC3 = new EObjectContainmentEList<LOC3CONTENT>(LOC3CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC3);
		}
		return lOC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC4CONTENT> getLOC4() {
		if (lOC4 == null) {
			lOC4 = new EObjectContainmentEList<LOC4CONTENT>(LOC4CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC4);
		}
		return lOC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC5CONTENT> getLOC5() {
		if (lOC5 == null) {
			lOC5 = new EObjectContainmentEList<LOC5CONTENT>(LOC5CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC5);
		}
		return lOC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC6CONTENT> getLOC6() {
		if (lOC6 == null) {
			lOC6 = new EObjectContainmentEList<LOC6CONTENT>(LOC6CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC6);
		}
		return lOC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC7CONTENT> getLOC7() {
		if (lOC7 == null) {
			lOC7 = new EObjectContainmentEList<LOC7CONTENT>(LOC7CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC7);
		}
		return lOC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LOC8CONTENT> getLOC8() {
		if (lOC8 == null) {
			lOC8 = new EObjectContainmentEList<LOC8CONTENT>(LOC8CONTENT.class, this, V2xmlPackage.LOCCONTENT__LOC8);
		}
		return lOC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOC9CONTENT getLOC9() {
		return lOC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLOC9(LOC9CONTENT newLOC9, NotificationChain msgs) {
		LOC9CONTENT oldLOC9 = lOC9;
		lOC9 = newLOC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC9, oldLOC9, newLOC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLOC9(LOC9CONTENT newLOC9) {
		if (newLOC9 != lOC9) {
			NotificationChain msgs = null;
			if (lOC9 != null)
				msgs = ((InternalEObject)lOC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC9, null, msgs);
			if (newLOC9 != null)
				msgs = ((InternalEObject)newLOC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LOCCONTENT__LOC9, null, msgs);
			msgs = basicSetLOC9(newLOC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LOCCONTENT__LOC9, newLOC9, newLOC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LOCCONTENT__ANY);
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
			case V2xmlPackage.LOCCONTENT__LOC1:
				return basicSetLOC1(null, msgs);
			case V2xmlPackage.LOCCONTENT__LOC2:
				return basicSetLOC2(null, msgs);
			case V2xmlPackage.LOCCONTENT__LOC3:
				return ((InternalEList<?>)getLOC3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC4:
				return ((InternalEList<?>)getLOC4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC5:
				return ((InternalEList<?>)getLOC5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC6:
				return ((InternalEList<?>)getLOC6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC7:
				return ((InternalEList<?>)getLOC7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC8:
				return ((InternalEList<?>)getLOC8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LOCCONTENT__LOC9:
				return basicSetLOC9(null, msgs);
			case V2xmlPackage.LOCCONTENT__ANY:
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
			case V2xmlPackage.LOCCONTENT__LOC1:
				return getLOC1();
			case V2xmlPackage.LOCCONTENT__LOC2:
				return getLOC2();
			case V2xmlPackage.LOCCONTENT__LOC3:
				return getLOC3();
			case V2xmlPackage.LOCCONTENT__LOC4:
				return getLOC4();
			case V2xmlPackage.LOCCONTENT__LOC5:
				return getLOC5();
			case V2xmlPackage.LOCCONTENT__LOC6:
				return getLOC6();
			case V2xmlPackage.LOCCONTENT__LOC7:
				return getLOC7();
			case V2xmlPackage.LOCCONTENT__LOC8:
				return getLOC8();
			case V2xmlPackage.LOCCONTENT__LOC9:
				return getLOC9();
			case V2xmlPackage.LOCCONTENT__ANY:
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
			case V2xmlPackage.LOCCONTENT__LOC1:
				setLOC1((LOC1CONTENT)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC2:
				setLOC2((LOC2CONTENT)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC3:
				getLOC3().clear();
				getLOC3().addAll((Collection<? extends LOC3CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC4:
				getLOC4().clear();
				getLOC4().addAll((Collection<? extends LOC4CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC5:
				getLOC5().clear();
				getLOC5().addAll((Collection<? extends LOC5CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC6:
				getLOC6().clear();
				getLOC6().addAll((Collection<? extends LOC6CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC7:
				getLOC7().clear();
				getLOC7().addAll((Collection<? extends LOC7CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC8:
				getLOC8().clear();
				getLOC8().addAll((Collection<? extends LOC8CONTENT>)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__LOC9:
				setLOC9((LOC9CONTENT)newValue);
				return;
			case V2xmlPackage.LOCCONTENT__ANY:
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
			case V2xmlPackage.LOCCONTENT__LOC1:
				setLOC1((LOC1CONTENT)null);
				return;
			case V2xmlPackage.LOCCONTENT__LOC2:
				setLOC2((LOC2CONTENT)null);
				return;
			case V2xmlPackage.LOCCONTENT__LOC3:
				getLOC3().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC4:
				getLOC4().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC5:
				getLOC5().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC6:
				getLOC6().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC7:
				getLOC7().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC8:
				getLOC8().clear();
				return;
			case V2xmlPackage.LOCCONTENT__LOC9:
				setLOC9((LOC9CONTENT)null);
				return;
			case V2xmlPackage.LOCCONTENT__ANY:
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
			case V2xmlPackage.LOCCONTENT__LOC1:
				return lOC1 != null;
			case V2xmlPackage.LOCCONTENT__LOC2:
				return lOC2 != null;
			case V2xmlPackage.LOCCONTENT__LOC3:
				return lOC3 != null && !lOC3.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC4:
				return lOC4 != null && !lOC4.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC5:
				return lOC5 != null && !lOC5.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC6:
				return lOC6 != null && !lOC6.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC7:
				return lOC7 != null && !lOC7.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC8:
				return lOC8 != null && !lOC8.isEmpty();
			case V2xmlPackage.LOCCONTENT__LOC9:
				return lOC9 != null;
			case V2xmlPackage.LOCCONTENT__ANY:
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

} //LOCCONTENTImpl
