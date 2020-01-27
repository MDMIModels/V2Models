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

import org.hl7.v2xml.TCD1CONTENT;
import org.hl7.v2xml.TCD2CONTENT;
import org.hl7.v2xml.TCD3CONTENT;
import org.hl7.v2xml.TCD4CONTENT;
import org.hl7.v2xml.TCD5CONTENT;
import org.hl7.v2xml.TCD6CONTENT;
import org.hl7.v2xml.TCD7CONTENT;
import org.hl7.v2xml.TCD8CONTENT;
import org.hl7.v2xml.TCDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD1 <em>TCD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD2 <em>TCD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD3 <em>TCD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD4 <em>TCD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD5 <em>TCD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD6 <em>TCD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD7 <em>TCD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getTCD8 <em>TCD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCDCONTENTImpl extends EObjectImpl implements TCDCONTENT {
	/**
	 * The cached value of the '{@link #getTCD1() <em>TCD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD1()
	 * @generated
	 * @ordered
	 */
	protected TCD1CONTENT tCD1;

	/**
	 * The cached value of the '{@link #getTCD2() <em>TCD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD2()
	 * @generated
	 * @ordered
	 */
	protected TCD2CONTENT tCD2;

	/**
	 * The cached value of the '{@link #getTCD3() <em>TCD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD3()
	 * @generated
	 * @ordered
	 */
	protected TCD3CONTENT tCD3;

	/**
	 * The cached value of the '{@link #getTCD4() <em>TCD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD4()
	 * @generated
	 * @ordered
	 */
	protected TCD4CONTENT tCD4;

	/**
	 * The cached value of the '{@link #getTCD5() <em>TCD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD5()
	 * @generated
	 * @ordered
	 */
	protected TCD5CONTENT tCD5;

	/**
	 * The cached value of the '{@link #getTCD6() <em>TCD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD6()
	 * @generated
	 * @ordered
	 */
	protected TCD6CONTENT tCD6;

	/**
	 * The cached value of the '{@link #getTCD7() <em>TCD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD7()
	 * @generated
	 * @ordered
	 */
	protected TCD7CONTENT tCD7;

	/**
	 * The cached value of the '{@link #getTCD8() <em>TCD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCD8()
	 * @generated
	 * @ordered
	 */
	protected TCD8CONTENT tCD8;

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
	protected TCDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTCDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD1CONTENT getTCD1() {
		return tCD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD1(TCD1CONTENT newTCD1, NotificationChain msgs) {
		TCD1CONTENT oldTCD1 = tCD1;
		tCD1 = newTCD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD1, oldTCD1, newTCD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD1(TCD1CONTENT newTCD1) {
		if (newTCD1 != tCD1) {
			NotificationChain msgs = null;
			if (tCD1 != null)
				msgs = ((InternalEObject)tCD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD1, null, msgs);
			if (newTCD1 != null)
				msgs = ((InternalEObject)newTCD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD1, null, msgs);
			msgs = basicSetTCD1(newTCD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD1, newTCD1, newTCD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD2CONTENT getTCD2() {
		return tCD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD2(TCD2CONTENT newTCD2, NotificationChain msgs) {
		TCD2CONTENT oldTCD2 = tCD2;
		tCD2 = newTCD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD2, oldTCD2, newTCD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD2(TCD2CONTENT newTCD2) {
		if (newTCD2 != tCD2) {
			NotificationChain msgs = null;
			if (tCD2 != null)
				msgs = ((InternalEObject)tCD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD2, null, msgs);
			if (newTCD2 != null)
				msgs = ((InternalEObject)newTCD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD2, null, msgs);
			msgs = basicSetTCD2(newTCD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD2, newTCD2, newTCD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD3CONTENT getTCD3() {
		return tCD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD3(TCD3CONTENT newTCD3, NotificationChain msgs) {
		TCD3CONTENT oldTCD3 = tCD3;
		tCD3 = newTCD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD3, oldTCD3, newTCD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD3(TCD3CONTENT newTCD3) {
		if (newTCD3 != tCD3) {
			NotificationChain msgs = null;
			if (tCD3 != null)
				msgs = ((InternalEObject)tCD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD3, null, msgs);
			if (newTCD3 != null)
				msgs = ((InternalEObject)newTCD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD3, null, msgs);
			msgs = basicSetTCD3(newTCD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD3, newTCD3, newTCD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD4CONTENT getTCD4() {
		return tCD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD4(TCD4CONTENT newTCD4, NotificationChain msgs) {
		TCD4CONTENT oldTCD4 = tCD4;
		tCD4 = newTCD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD4, oldTCD4, newTCD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD4(TCD4CONTENT newTCD4) {
		if (newTCD4 != tCD4) {
			NotificationChain msgs = null;
			if (tCD4 != null)
				msgs = ((InternalEObject)tCD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD4, null, msgs);
			if (newTCD4 != null)
				msgs = ((InternalEObject)newTCD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD4, null, msgs);
			msgs = basicSetTCD4(newTCD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD4, newTCD4, newTCD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD5CONTENT getTCD5() {
		return tCD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD5(TCD5CONTENT newTCD5, NotificationChain msgs) {
		TCD5CONTENT oldTCD5 = tCD5;
		tCD5 = newTCD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD5, oldTCD5, newTCD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD5(TCD5CONTENT newTCD5) {
		if (newTCD5 != tCD5) {
			NotificationChain msgs = null;
			if (tCD5 != null)
				msgs = ((InternalEObject)tCD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD5, null, msgs);
			if (newTCD5 != null)
				msgs = ((InternalEObject)newTCD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD5, null, msgs);
			msgs = basicSetTCD5(newTCD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD5, newTCD5, newTCD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD6CONTENT getTCD6() {
		return tCD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD6(TCD6CONTENT newTCD6, NotificationChain msgs) {
		TCD6CONTENT oldTCD6 = tCD6;
		tCD6 = newTCD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD6, oldTCD6, newTCD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD6(TCD6CONTENT newTCD6) {
		if (newTCD6 != tCD6) {
			NotificationChain msgs = null;
			if (tCD6 != null)
				msgs = ((InternalEObject)tCD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD6, null, msgs);
			if (newTCD6 != null)
				msgs = ((InternalEObject)newTCD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD6, null, msgs);
			msgs = basicSetTCD6(newTCD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD6, newTCD6, newTCD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD7CONTENT getTCD7() {
		return tCD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD7(TCD7CONTENT newTCD7, NotificationChain msgs) {
		TCD7CONTENT oldTCD7 = tCD7;
		tCD7 = newTCD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD7, oldTCD7, newTCD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD7(TCD7CONTENT newTCD7) {
		if (newTCD7 != tCD7) {
			NotificationChain msgs = null;
			if (tCD7 != null)
				msgs = ((InternalEObject)tCD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD7, null, msgs);
			if (newTCD7 != null)
				msgs = ((InternalEObject)newTCD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD7, null, msgs);
			msgs = basicSetTCD7(newTCD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD7, newTCD7, newTCD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCD8CONTENT getTCD8() {
		return tCD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCD8(TCD8CONTENT newTCD8, NotificationChain msgs) {
		TCD8CONTENT oldTCD8 = tCD8;
		tCD8 = newTCD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD8, oldTCD8, newTCD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCD8(TCD8CONTENT newTCD8) {
		if (newTCD8 != tCD8) {
			NotificationChain msgs = null;
			if (tCD8 != null)
				msgs = ((InternalEObject)tCD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD8, null, msgs);
			if (newTCD8 != null)
				msgs = ((InternalEObject)newTCD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCDCONTENT__TCD8, null, msgs);
			msgs = basicSetTCD8(newTCD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCDCONTENT__TCD8, newTCD8, newTCD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.TCDCONTENT__ANY);
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
			case V2xmlPackage.TCDCONTENT__TCD1:
				return basicSetTCD1(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD2:
				return basicSetTCD2(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD3:
				return basicSetTCD3(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD4:
				return basicSetTCD4(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD5:
				return basicSetTCD5(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD6:
				return basicSetTCD6(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD7:
				return basicSetTCD7(null, msgs);
			case V2xmlPackage.TCDCONTENT__TCD8:
				return basicSetTCD8(null, msgs);
			case V2xmlPackage.TCDCONTENT__ANY:
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
			case V2xmlPackage.TCDCONTENT__TCD1:
				return getTCD1();
			case V2xmlPackage.TCDCONTENT__TCD2:
				return getTCD2();
			case V2xmlPackage.TCDCONTENT__TCD3:
				return getTCD3();
			case V2xmlPackage.TCDCONTENT__TCD4:
				return getTCD4();
			case V2xmlPackage.TCDCONTENT__TCD5:
				return getTCD5();
			case V2xmlPackage.TCDCONTENT__TCD6:
				return getTCD6();
			case V2xmlPackage.TCDCONTENT__TCD7:
				return getTCD7();
			case V2xmlPackage.TCDCONTENT__TCD8:
				return getTCD8();
			case V2xmlPackage.TCDCONTENT__ANY:
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
			case V2xmlPackage.TCDCONTENT__TCD1:
				setTCD1((TCD1CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD2:
				setTCD2((TCD2CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD3:
				setTCD3((TCD3CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD4:
				setTCD4((TCD4CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD5:
				setTCD5((TCD5CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD6:
				setTCD6((TCD6CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD7:
				setTCD7((TCD7CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__TCD8:
				setTCD8((TCD8CONTENT)newValue);
				return;
			case V2xmlPackage.TCDCONTENT__ANY:
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
			case V2xmlPackage.TCDCONTENT__TCD1:
				setTCD1((TCD1CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD2:
				setTCD2((TCD2CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD3:
				setTCD3((TCD3CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD4:
				setTCD4((TCD4CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD5:
				setTCD5((TCD5CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD6:
				setTCD6((TCD6CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD7:
				setTCD7((TCD7CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__TCD8:
				setTCD8((TCD8CONTENT)null);
				return;
			case V2xmlPackage.TCDCONTENT__ANY:
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
			case V2xmlPackage.TCDCONTENT__TCD1:
				return tCD1 != null;
			case V2xmlPackage.TCDCONTENT__TCD2:
				return tCD2 != null;
			case V2xmlPackage.TCDCONTENT__TCD3:
				return tCD3 != null;
			case V2xmlPackage.TCDCONTENT__TCD4:
				return tCD4 != null;
			case V2xmlPackage.TCDCONTENT__TCD5:
				return tCD5 != null;
			case V2xmlPackage.TCDCONTENT__TCD6:
				return tCD6 != null;
			case V2xmlPackage.TCDCONTENT__TCD7:
				return tCD7 != null;
			case V2xmlPackage.TCDCONTENT__TCD8:
				return tCD8 != null;
			case V2xmlPackage.TCDCONTENT__ANY:
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

} //TCDCONTENTImpl
