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

import org.hl7.v2xml.LCC1CONTENT;
import org.hl7.v2xml.LCC2CONTENT;
import org.hl7.v2xml.LCC3CONTENT;
import org.hl7.v2xml.LCC4CONTENT;
import org.hl7.v2xml.LCCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LCCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LCCCONTENTImpl#getLCC1 <em>LCC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCCCONTENTImpl#getLCC2 <em>LCC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCCCONTENTImpl#getLCC3 <em>LCC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCCCONTENTImpl#getLCC4 <em>LCC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LCCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LCCCONTENTImpl extends EObjectImpl implements LCCCONTENT {
	/**
	 * The cached value of the '{@link #getLCC1() <em>LCC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCC1()
	 * @generated
	 * @ordered
	 */
	protected LCC1CONTENT lCC1;

	/**
	 * The cached value of the '{@link #getLCC2() <em>LCC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCC2()
	 * @generated
	 * @ordered
	 */
	protected LCC2CONTENT lCC2;

	/**
	 * The cached value of the '{@link #getLCC3() <em>LCC3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCC3()
	 * @generated
	 * @ordered
	 */
	protected EList<LCC3CONTENT> lCC3;

	/**
	 * The cached value of the '{@link #getLCC4() <em>LCC4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLCC4()
	 * @generated
	 * @ordered
	 */
	protected EList<LCC4CONTENT> lCC4;

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
	protected LCCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLCCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCC1CONTENT getLCC1() {
		return lCC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCC1(LCC1CONTENT newLCC1, NotificationChain msgs) {
		LCC1CONTENT oldLCC1 = lCC1;
		lCC1 = newLCC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCCCONTENT__LCC1, oldLCC1, newLCC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCC1(LCC1CONTENT newLCC1) {
		if (newLCC1 != lCC1) {
			NotificationChain msgs = null;
			if (lCC1 != null)
				msgs = ((InternalEObject)lCC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCCCONTENT__LCC1, null, msgs);
			if (newLCC1 != null)
				msgs = ((InternalEObject)newLCC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCCCONTENT__LCC1, null, msgs);
			msgs = basicSetLCC1(newLCC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCCCONTENT__LCC1, newLCC1, newLCC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCC2CONTENT getLCC2() {
		return lCC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLCC2(LCC2CONTENT newLCC2, NotificationChain msgs) {
		LCC2CONTENT oldLCC2 = lCC2;
		lCC2 = newLCC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCCCONTENT__LCC2, oldLCC2, newLCC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLCC2(LCC2CONTENT newLCC2) {
		if (newLCC2 != lCC2) {
			NotificationChain msgs = null;
			if (lCC2 != null)
				msgs = ((InternalEObject)lCC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCCCONTENT__LCC2, null, msgs);
			if (newLCC2 != null)
				msgs = ((InternalEObject)newLCC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LCCCONTENT__LCC2, null, msgs);
			msgs = basicSetLCC2(newLCC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LCCCONTENT__LCC2, newLCC2, newLCC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LCC3CONTENT> getLCC3() {
		if (lCC3 == null) {
			lCC3 = new EObjectContainmentEList<LCC3CONTENT>(LCC3CONTENT.class, this, V2xmlPackage.LCCCONTENT__LCC3);
		}
		return lCC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LCC4CONTENT> getLCC4() {
		if (lCC4 == null) {
			lCC4 = new EObjectContainmentEList<LCC4CONTENT>(LCC4CONTENT.class, this, V2xmlPackage.LCCCONTENT__LCC4);
		}
		return lCC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LCCCONTENT__ANY);
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
			case V2xmlPackage.LCCCONTENT__LCC1:
				return basicSetLCC1(null, msgs);
			case V2xmlPackage.LCCCONTENT__LCC2:
				return basicSetLCC2(null, msgs);
			case V2xmlPackage.LCCCONTENT__LCC3:
				return ((InternalEList<?>)getLCC3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LCCCONTENT__LCC4:
				return ((InternalEList<?>)getLCC4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LCCCONTENT__ANY:
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
			case V2xmlPackage.LCCCONTENT__LCC1:
				return getLCC1();
			case V2xmlPackage.LCCCONTENT__LCC2:
				return getLCC2();
			case V2xmlPackage.LCCCONTENT__LCC3:
				return getLCC3();
			case V2xmlPackage.LCCCONTENT__LCC4:
				return getLCC4();
			case V2xmlPackage.LCCCONTENT__ANY:
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
			case V2xmlPackage.LCCCONTENT__LCC1:
				setLCC1((LCC1CONTENT)newValue);
				return;
			case V2xmlPackage.LCCCONTENT__LCC2:
				setLCC2((LCC2CONTENT)newValue);
				return;
			case V2xmlPackage.LCCCONTENT__LCC3:
				getLCC3().clear();
				getLCC3().addAll((Collection<? extends LCC3CONTENT>)newValue);
				return;
			case V2xmlPackage.LCCCONTENT__LCC4:
				getLCC4().clear();
				getLCC4().addAll((Collection<? extends LCC4CONTENT>)newValue);
				return;
			case V2xmlPackage.LCCCONTENT__ANY:
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
			case V2xmlPackage.LCCCONTENT__LCC1:
				setLCC1((LCC1CONTENT)null);
				return;
			case V2xmlPackage.LCCCONTENT__LCC2:
				setLCC2((LCC2CONTENT)null);
				return;
			case V2xmlPackage.LCCCONTENT__LCC3:
				getLCC3().clear();
				return;
			case V2xmlPackage.LCCCONTENT__LCC4:
				getLCC4().clear();
				return;
			case V2xmlPackage.LCCCONTENT__ANY:
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
			case V2xmlPackage.LCCCONTENT__LCC1:
				return lCC1 != null;
			case V2xmlPackage.LCCCONTENT__LCC2:
				return lCC2 != null;
			case V2xmlPackage.LCCCONTENT__LCC3:
				return lCC3 != null && !lCC3.isEmpty();
			case V2xmlPackage.LCCCONTENT__LCC4:
				return lCC4 != null && !lCC4.isEmpty();
			case V2xmlPackage.LCCCONTENT__ANY:
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

} //LCCCONTENTImpl
