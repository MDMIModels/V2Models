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

import org.hl7.v2xml.LDP10CONTENT;
import org.hl7.v2xml.LDP11CONTENT;
import org.hl7.v2xml.LDP12CONTENT;
import org.hl7.v2xml.LDP1CONTENT;
import org.hl7.v2xml.LDP2CONTENT;
import org.hl7.v2xml.LDP3CONTENT;
import org.hl7.v2xml.LDP4CONTENT;
import org.hl7.v2xml.LDP5CONTENT;
import org.hl7.v2xml.LDP6CONTENT;
import org.hl7.v2xml.LDP7CONTENT;
import org.hl7.v2xml.LDP8CONTENT;
import org.hl7.v2xml.LDP9CONTENT;
import org.hl7.v2xml.LDPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LDPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP1 <em>LDP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP2 <em>LDP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP3 <em>LDP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP4 <em>LDP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP5 <em>LDP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP6 <em>LDP6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP7 <em>LDP7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP8 <em>LDP8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP9 <em>LDP9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP10 <em>LDP10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP11 <em>LDP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getLDP12 <em>LDP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LDPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LDPCONTENTImpl extends EObjectImpl implements LDPCONTENT {
	/**
	 * The cached value of the '{@link #getLDP1() <em>LDP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP1()
	 * @generated
	 * @ordered
	 */
	protected LDP1CONTENT lDP1;

	/**
	 * The cached value of the '{@link #getLDP2() <em>LDP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP2()
	 * @generated
	 * @ordered
	 */
	protected LDP2CONTENT lDP2;

	/**
	 * The cached value of the '{@link #getLDP3() <em>LDP3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP3()
	 * @generated
	 * @ordered
	 */
	protected EList<LDP3CONTENT> lDP3;

	/**
	 * The cached value of the '{@link #getLDP4() <em>LDP4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP4()
	 * @generated
	 * @ordered
	 */
	protected EList<LDP4CONTENT> lDP4;

	/**
	 * The cached value of the '{@link #getLDP5() <em>LDP5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP5()
	 * @generated
	 * @ordered
	 */
	protected EList<LDP5CONTENT> lDP5;

	/**
	 * The cached value of the '{@link #getLDP6() <em>LDP6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP6()
	 * @generated
	 * @ordered
	 */
	protected LDP6CONTENT lDP6;

	/**
	 * The cached value of the '{@link #getLDP7() <em>LDP7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP7()
	 * @generated
	 * @ordered
	 */
	protected LDP7CONTENT lDP7;

	/**
	 * The cached value of the '{@link #getLDP8() <em>LDP8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP8()
	 * @generated
	 * @ordered
	 */
	protected LDP8CONTENT lDP8;

	/**
	 * The cached value of the '{@link #getLDP9() <em>LDP9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP9()
	 * @generated
	 * @ordered
	 */
	protected LDP9CONTENT lDP9;

	/**
	 * The cached value of the '{@link #getLDP10() <em>LDP10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP10()
	 * @generated
	 * @ordered
	 */
	protected EList<LDP10CONTENT> lDP10;

	/**
	 * The cached value of the '{@link #getLDP11() <em>LDP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP11()
	 * @generated
	 * @ordered
	 */
	protected LDP11CONTENT lDP11;

	/**
	 * The cached value of the '{@link #getLDP12() <em>LDP12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLDP12()
	 * @generated
	 * @ordered
	 */
	protected LDP12CONTENT lDP12;

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
	protected LDPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLDPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP1CONTENT getLDP1() {
		return lDP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP1(LDP1CONTENT newLDP1, NotificationChain msgs) {
		LDP1CONTENT oldLDP1 = lDP1;
		lDP1 = newLDP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP1, oldLDP1, newLDP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP1(LDP1CONTENT newLDP1) {
		if (newLDP1 != lDP1) {
			NotificationChain msgs = null;
			if (lDP1 != null)
				msgs = ((InternalEObject)lDP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP1, null, msgs);
			if (newLDP1 != null)
				msgs = ((InternalEObject)newLDP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP1, null, msgs);
			msgs = basicSetLDP1(newLDP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP1, newLDP1, newLDP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP2CONTENT getLDP2() {
		return lDP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP2(LDP2CONTENT newLDP2, NotificationChain msgs) {
		LDP2CONTENT oldLDP2 = lDP2;
		lDP2 = newLDP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP2, oldLDP2, newLDP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP2(LDP2CONTENT newLDP2) {
		if (newLDP2 != lDP2) {
			NotificationChain msgs = null;
			if (lDP2 != null)
				msgs = ((InternalEObject)lDP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP2, null, msgs);
			if (newLDP2 != null)
				msgs = ((InternalEObject)newLDP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP2, null, msgs);
			msgs = basicSetLDP2(newLDP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP2, newLDP2, newLDP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDP3CONTENT> getLDP3() {
		if (lDP3 == null) {
			lDP3 = new EObjectContainmentEList<LDP3CONTENT>(LDP3CONTENT.class, this, V2xmlPackage.LDPCONTENT__LDP3);
		}
		return lDP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDP4CONTENT> getLDP4() {
		if (lDP4 == null) {
			lDP4 = new EObjectContainmentEList<LDP4CONTENT>(LDP4CONTENT.class, this, V2xmlPackage.LDPCONTENT__LDP4);
		}
		return lDP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDP5CONTENT> getLDP5() {
		if (lDP5 == null) {
			lDP5 = new EObjectContainmentEList<LDP5CONTENT>(LDP5CONTENT.class, this, V2xmlPackage.LDPCONTENT__LDP5);
		}
		return lDP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP6CONTENT getLDP6() {
		return lDP6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP6(LDP6CONTENT newLDP6, NotificationChain msgs) {
		LDP6CONTENT oldLDP6 = lDP6;
		lDP6 = newLDP6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP6, oldLDP6, newLDP6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP6(LDP6CONTENT newLDP6) {
		if (newLDP6 != lDP6) {
			NotificationChain msgs = null;
			if (lDP6 != null)
				msgs = ((InternalEObject)lDP6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP6, null, msgs);
			if (newLDP6 != null)
				msgs = ((InternalEObject)newLDP6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP6, null, msgs);
			msgs = basicSetLDP6(newLDP6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP6, newLDP6, newLDP6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP7CONTENT getLDP7() {
		return lDP7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP7(LDP7CONTENT newLDP7, NotificationChain msgs) {
		LDP7CONTENT oldLDP7 = lDP7;
		lDP7 = newLDP7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP7, oldLDP7, newLDP7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP7(LDP7CONTENT newLDP7) {
		if (newLDP7 != lDP7) {
			NotificationChain msgs = null;
			if (lDP7 != null)
				msgs = ((InternalEObject)lDP7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP7, null, msgs);
			if (newLDP7 != null)
				msgs = ((InternalEObject)newLDP7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP7, null, msgs);
			msgs = basicSetLDP7(newLDP7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP7, newLDP7, newLDP7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP8CONTENT getLDP8() {
		return lDP8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP8(LDP8CONTENT newLDP8, NotificationChain msgs) {
		LDP8CONTENT oldLDP8 = lDP8;
		lDP8 = newLDP8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP8, oldLDP8, newLDP8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP8(LDP8CONTENT newLDP8) {
		if (newLDP8 != lDP8) {
			NotificationChain msgs = null;
			if (lDP8 != null)
				msgs = ((InternalEObject)lDP8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP8, null, msgs);
			if (newLDP8 != null)
				msgs = ((InternalEObject)newLDP8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP8, null, msgs);
			msgs = basicSetLDP8(newLDP8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP8, newLDP8, newLDP8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP9CONTENT getLDP9() {
		return lDP9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP9(LDP9CONTENT newLDP9, NotificationChain msgs) {
		LDP9CONTENT oldLDP9 = lDP9;
		lDP9 = newLDP9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP9, oldLDP9, newLDP9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP9(LDP9CONTENT newLDP9) {
		if (newLDP9 != lDP9) {
			NotificationChain msgs = null;
			if (lDP9 != null)
				msgs = ((InternalEObject)lDP9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP9, null, msgs);
			if (newLDP9 != null)
				msgs = ((InternalEObject)newLDP9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP9, null, msgs);
			msgs = basicSetLDP9(newLDP9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP9, newLDP9, newLDP9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LDP10CONTENT> getLDP10() {
		if (lDP10 == null) {
			lDP10 = new EObjectContainmentEList<LDP10CONTENT>(LDP10CONTENT.class, this, V2xmlPackage.LDPCONTENT__LDP10);
		}
		return lDP10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP11CONTENT getLDP11() {
		return lDP11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP11(LDP11CONTENT newLDP11, NotificationChain msgs) {
		LDP11CONTENT oldLDP11 = lDP11;
		lDP11 = newLDP11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP11, oldLDP11, newLDP11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP11(LDP11CONTENT newLDP11) {
		if (newLDP11 != lDP11) {
			NotificationChain msgs = null;
			if (lDP11 != null)
				msgs = ((InternalEObject)lDP11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP11, null, msgs);
			if (newLDP11 != null)
				msgs = ((InternalEObject)newLDP11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP11, null, msgs);
			msgs = basicSetLDP11(newLDP11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP11, newLDP11, newLDP11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDP12CONTENT getLDP12() {
		return lDP12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLDP12(LDP12CONTENT newLDP12, NotificationChain msgs) {
		LDP12CONTENT oldLDP12 = lDP12;
		lDP12 = newLDP12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP12, oldLDP12, newLDP12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLDP12(LDP12CONTENT newLDP12) {
		if (newLDP12 != lDP12) {
			NotificationChain msgs = null;
			if (lDP12 != null)
				msgs = ((InternalEObject)lDP12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP12, null, msgs);
			if (newLDP12 != null)
				msgs = ((InternalEObject)newLDP12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LDPCONTENT__LDP12, null, msgs);
			msgs = basicSetLDP12(newLDP12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LDPCONTENT__LDP12, newLDP12, newLDP12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.LDPCONTENT__ANY);
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
			case V2xmlPackage.LDPCONTENT__LDP1:
				return basicSetLDP1(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP2:
				return basicSetLDP2(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP3:
				return ((InternalEList<?>)getLDP3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LDPCONTENT__LDP4:
				return ((InternalEList<?>)getLDP4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LDPCONTENT__LDP5:
				return ((InternalEList<?>)getLDP5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LDPCONTENT__LDP6:
				return basicSetLDP6(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP7:
				return basicSetLDP7(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP8:
				return basicSetLDP8(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP9:
				return basicSetLDP9(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP10:
				return ((InternalEList<?>)getLDP10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.LDPCONTENT__LDP11:
				return basicSetLDP11(null, msgs);
			case V2xmlPackage.LDPCONTENT__LDP12:
				return basicSetLDP12(null, msgs);
			case V2xmlPackage.LDPCONTENT__ANY:
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
			case V2xmlPackage.LDPCONTENT__LDP1:
				return getLDP1();
			case V2xmlPackage.LDPCONTENT__LDP2:
				return getLDP2();
			case V2xmlPackage.LDPCONTENT__LDP3:
				return getLDP3();
			case V2xmlPackage.LDPCONTENT__LDP4:
				return getLDP4();
			case V2xmlPackage.LDPCONTENT__LDP5:
				return getLDP5();
			case V2xmlPackage.LDPCONTENT__LDP6:
				return getLDP6();
			case V2xmlPackage.LDPCONTENT__LDP7:
				return getLDP7();
			case V2xmlPackage.LDPCONTENT__LDP8:
				return getLDP8();
			case V2xmlPackage.LDPCONTENT__LDP9:
				return getLDP9();
			case V2xmlPackage.LDPCONTENT__LDP10:
				return getLDP10();
			case V2xmlPackage.LDPCONTENT__LDP11:
				return getLDP11();
			case V2xmlPackage.LDPCONTENT__LDP12:
				return getLDP12();
			case V2xmlPackage.LDPCONTENT__ANY:
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
			case V2xmlPackage.LDPCONTENT__LDP1:
				setLDP1((LDP1CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP2:
				setLDP2((LDP2CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP3:
				getLDP3().clear();
				getLDP3().addAll((Collection<? extends LDP3CONTENT>)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP4:
				getLDP4().clear();
				getLDP4().addAll((Collection<? extends LDP4CONTENT>)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP5:
				getLDP5().clear();
				getLDP5().addAll((Collection<? extends LDP5CONTENT>)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP6:
				setLDP6((LDP6CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP7:
				setLDP7((LDP7CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP8:
				setLDP8((LDP8CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP9:
				setLDP9((LDP9CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP10:
				getLDP10().clear();
				getLDP10().addAll((Collection<? extends LDP10CONTENT>)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP11:
				setLDP11((LDP11CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__LDP12:
				setLDP12((LDP12CONTENT)newValue);
				return;
			case V2xmlPackage.LDPCONTENT__ANY:
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
			case V2xmlPackage.LDPCONTENT__LDP1:
				setLDP1((LDP1CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP2:
				setLDP2((LDP2CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP3:
				getLDP3().clear();
				return;
			case V2xmlPackage.LDPCONTENT__LDP4:
				getLDP4().clear();
				return;
			case V2xmlPackage.LDPCONTENT__LDP5:
				getLDP5().clear();
				return;
			case V2xmlPackage.LDPCONTENT__LDP6:
				setLDP6((LDP6CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP7:
				setLDP7((LDP7CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP8:
				setLDP8((LDP8CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP9:
				setLDP9((LDP9CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP10:
				getLDP10().clear();
				return;
			case V2xmlPackage.LDPCONTENT__LDP11:
				setLDP11((LDP11CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__LDP12:
				setLDP12((LDP12CONTENT)null);
				return;
			case V2xmlPackage.LDPCONTENT__ANY:
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
			case V2xmlPackage.LDPCONTENT__LDP1:
				return lDP1 != null;
			case V2xmlPackage.LDPCONTENT__LDP2:
				return lDP2 != null;
			case V2xmlPackage.LDPCONTENT__LDP3:
				return lDP3 != null && !lDP3.isEmpty();
			case V2xmlPackage.LDPCONTENT__LDP4:
				return lDP4 != null && !lDP4.isEmpty();
			case V2xmlPackage.LDPCONTENT__LDP5:
				return lDP5 != null && !lDP5.isEmpty();
			case V2xmlPackage.LDPCONTENT__LDP6:
				return lDP6 != null;
			case V2xmlPackage.LDPCONTENT__LDP7:
				return lDP7 != null;
			case V2xmlPackage.LDPCONTENT__LDP8:
				return lDP8 != null;
			case V2xmlPackage.LDPCONTENT__LDP9:
				return lDP9 != null;
			case V2xmlPackage.LDPCONTENT__LDP10:
				return lDP10 != null && !lDP10.isEmpty();
			case V2xmlPackage.LDPCONTENT__LDP11:
				return lDP11 != null;
			case V2xmlPackage.LDPCONTENT__LDP12:
				return lDP12 != null;
			case V2xmlPackage.LDPCONTENT__ANY:
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

} //LDPCONTENTImpl
