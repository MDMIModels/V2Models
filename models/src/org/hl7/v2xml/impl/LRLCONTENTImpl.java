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

import org.hl7.v2xml.LRL1CONTENT;
import org.hl7.v2xml.LRL2CONTENT;
import org.hl7.v2xml.LRL3CONTENT;
import org.hl7.v2xml.LRL4CONTENT;
import org.hl7.v2xml.LRL5CONTENT;
import org.hl7.v2xml.LRL6CONTENT;
import org.hl7.v2xml.LRLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LRLCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL1 <em>LRL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL2 <em>LRL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL3 <em>LRL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL4 <em>LRL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL5 <em>LRL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getLRL6 <em>LRL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LRLCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LRLCONTENTImpl extends EObjectImpl implements LRLCONTENT {
	/**
	 * The cached value of the '{@link #getLRL1() <em>LRL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL1()
	 * @generated
	 * @ordered
	 */
	protected LRL1CONTENT lRL1;

	/**
	 * The cached value of the '{@link #getLRL2() <em>LRL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL2()
	 * @generated
	 * @ordered
	 */
	protected LRL2CONTENT lRL2;

	/**
	 * The cached value of the '{@link #getLRL3() <em>LRL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL3()
	 * @generated
	 * @ordered
	 */
	protected LRL3CONTENT lRL3;

	/**
	 * The cached value of the '{@link #getLRL4() <em>LRL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL4()
	 * @generated
	 * @ordered
	 */
	protected LRL4CONTENT lRL4;

	/**
	 * The cached value of the '{@link #getLRL5() <em>LRL5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL5()
	 * @generated
	 * @ordered
	 */
	protected EList<LRL5CONTENT> lRL5;

	/**
	 * The cached value of the '{@link #getLRL6() <em>LRL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLRL6()
	 * @generated
	 * @ordered
	 */
	protected LRL6CONTENT lRL6;

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
	protected LRLCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLRLCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRL1CONTENT getLRL1() {
		return lRL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLRL1(LRL1CONTENT newLRL1, NotificationChain msgs) {
		LRL1CONTENT oldLRL1 = lRL1;
		lRL1 = newLRL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL1, oldLRL1, newLRL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLRL1(LRL1CONTENT newLRL1) {
		if (newLRL1 != lRL1) {
			NotificationChain msgs = null;
			if (lRL1 != null)
				msgs = ((InternalEObject)lRL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL1, null, msgs);
			if (newLRL1 != null)
				msgs = ((InternalEObject)newLRL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL1, null, msgs);
			msgs = basicSetLRL1(newLRL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL1, newLRL1, newLRL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRL2CONTENT getLRL2() {
		return lRL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLRL2(LRL2CONTENT newLRL2, NotificationChain msgs) {
		LRL2CONTENT oldLRL2 = lRL2;
		lRL2 = newLRL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL2, oldLRL2, newLRL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLRL2(LRL2CONTENT newLRL2) {
		if (newLRL2 != lRL2) {
			NotificationChain msgs = null;
			if (lRL2 != null)
				msgs = ((InternalEObject)lRL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL2, null, msgs);
			if (newLRL2 != null)
				msgs = ((InternalEObject)newLRL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL2, null, msgs);
			msgs = basicSetLRL2(newLRL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL2, newLRL2, newLRL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRL3CONTENT getLRL3() {
		return lRL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLRL3(LRL3CONTENT newLRL3, NotificationChain msgs) {
		LRL3CONTENT oldLRL3 = lRL3;
		lRL3 = newLRL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL3, oldLRL3, newLRL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLRL3(LRL3CONTENT newLRL3) {
		if (newLRL3 != lRL3) {
			NotificationChain msgs = null;
			if (lRL3 != null)
				msgs = ((InternalEObject)lRL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL3, null, msgs);
			if (newLRL3 != null)
				msgs = ((InternalEObject)newLRL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL3, null, msgs);
			msgs = basicSetLRL3(newLRL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL3, newLRL3, newLRL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRL4CONTENT getLRL4() {
		return lRL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLRL4(LRL4CONTENT newLRL4, NotificationChain msgs) {
		LRL4CONTENT oldLRL4 = lRL4;
		lRL4 = newLRL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL4, oldLRL4, newLRL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLRL4(LRL4CONTENT newLRL4) {
		if (newLRL4 != lRL4) {
			NotificationChain msgs = null;
			if (lRL4 != null)
				msgs = ((InternalEObject)lRL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL4, null, msgs);
			if (newLRL4 != null)
				msgs = ((InternalEObject)newLRL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL4, null, msgs);
			msgs = basicSetLRL4(newLRL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL4, newLRL4, newLRL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LRL5CONTENT> getLRL5() {
		if (lRL5 == null) {
			lRL5 = new EObjectContainmentEList<LRL5CONTENT>(LRL5CONTENT.class, this, V2xmlPackage.LRLCONTENT__LRL5);
		}
		return lRL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LRL6CONTENT getLRL6() {
		return lRL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLRL6(LRL6CONTENT newLRL6, NotificationChain msgs) {
		LRL6CONTENT oldLRL6 = lRL6;
		lRL6 = newLRL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL6, oldLRL6, newLRL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLRL6(LRL6CONTENT newLRL6) {
		if (newLRL6 != lRL6) {
			NotificationChain msgs = null;
			if (lRL6 != null)
				msgs = ((InternalEObject)lRL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL6, null, msgs);
			if (newLRL6 != null)
				msgs = ((InternalEObject)newLRL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LRLCONTENT__LRL6, null, msgs);
			msgs = basicSetLRL6(newLRL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LRLCONTENT__LRL6, newLRL6, newLRL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LRLCONTENT__ANY);
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
			case V2xmlPackage.LRLCONTENT__LRL1:
				return basicSetLRL1(null, msgs);
			case V2xmlPackage.LRLCONTENT__LRL2:
				return basicSetLRL2(null, msgs);
			case V2xmlPackage.LRLCONTENT__LRL3:
				return basicSetLRL3(null, msgs);
			case V2xmlPackage.LRLCONTENT__LRL4:
				return basicSetLRL4(null, msgs);
			case V2xmlPackage.LRLCONTENT__LRL5:
				return ((InternalEList<?>)getLRL5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LRLCONTENT__LRL6:
				return basicSetLRL6(null, msgs);
			case V2xmlPackage.LRLCONTENT__ANY:
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
			case V2xmlPackage.LRLCONTENT__LRL1:
				return getLRL1();
			case V2xmlPackage.LRLCONTENT__LRL2:
				return getLRL2();
			case V2xmlPackage.LRLCONTENT__LRL3:
				return getLRL3();
			case V2xmlPackage.LRLCONTENT__LRL4:
				return getLRL4();
			case V2xmlPackage.LRLCONTENT__LRL5:
				return getLRL5();
			case V2xmlPackage.LRLCONTENT__LRL6:
				return getLRL6();
			case V2xmlPackage.LRLCONTENT__ANY:
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
			case V2xmlPackage.LRLCONTENT__LRL1:
				setLRL1((LRL1CONTENT)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__LRL2:
				setLRL2((LRL2CONTENT)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__LRL3:
				setLRL3((LRL3CONTENT)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__LRL4:
				setLRL4((LRL4CONTENT)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__LRL5:
				getLRL5().clear();
				getLRL5().addAll((Collection<? extends LRL5CONTENT>)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__LRL6:
				setLRL6((LRL6CONTENT)newValue);
				return;
			case V2xmlPackage.LRLCONTENT__ANY:
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
			case V2xmlPackage.LRLCONTENT__LRL1:
				setLRL1((LRL1CONTENT)null);
				return;
			case V2xmlPackage.LRLCONTENT__LRL2:
				setLRL2((LRL2CONTENT)null);
				return;
			case V2xmlPackage.LRLCONTENT__LRL3:
				setLRL3((LRL3CONTENT)null);
				return;
			case V2xmlPackage.LRLCONTENT__LRL4:
				setLRL4((LRL4CONTENT)null);
				return;
			case V2xmlPackage.LRLCONTENT__LRL5:
				getLRL5().clear();
				return;
			case V2xmlPackage.LRLCONTENT__LRL6:
				setLRL6((LRL6CONTENT)null);
				return;
			case V2xmlPackage.LRLCONTENT__ANY:
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
			case V2xmlPackage.LRLCONTENT__LRL1:
				return lRL1 != null;
			case V2xmlPackage.LRLCONTENT__LRL2:
				return lRL2 != null;
			case V2xmlPackage.LRLCONTENT__LRL3:
				return lRL3 != null;
			case V2xmlPackage.LRLCONTENT__LRL4:
				return lRL4 != null;
			case V2xmlPackage.LRLCONTENT__LRL5:
				return lRL5 != null && !lRL5.isEmpty();
			case V2xmlPackage.LRLCONTENT__LRL6:
				return lRL6 != null;
			case V2xmlPackage.LRLCONTENT__ANY:
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

} //LRLCONTENTImpl
