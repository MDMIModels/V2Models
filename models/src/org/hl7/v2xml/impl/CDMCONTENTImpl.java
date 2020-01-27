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

import org.hl7.v2xml.CDM10CONTENT;
import org.hl7.v2xml.CDM11CONTENT;
import org.hl7.v2xml.CDM12CONTENT;
import org.hl7.v2xml.CDM13CONTENT;
import org.hl7.v2xml.CDM1CONTENT;
import org.hl7.v2xml.CDM2CONTENT;
import org.hl7.v2xml.CDM3CONTENT;
import org.hl7.v2xml.CDM4CONTENT;
import org.hl7.v2xml.CDM5CONTENT;
import org.hl7.v2xml.CDM6CONTENT;
import org.hl7.v2xml.CDM7CONTENT;
import org.hl7.v2xml.CDM8CONTENT;
import org.hl7.v2xml.CDM9CONTENT;
import org.hl7.v2xml.CDMCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CDMCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM1 <em>CDM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM2 <em>CDM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM3 <em>CDM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM4 <em>CDM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM5 <em>CDM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM6 <em>CDM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM7 <em>CDM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM8 <em>CDM8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM9 <em>CDM9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM10 <em>CDM10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM11 <em>CDM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM12 <em>CDM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getCDM13 <em>CDM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDMCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDMCONTENTImpl extends EObjectImpl implements CDMCONTENT {
	/**
	 * The cached value of the '{@link #getCDM1() <em>CDM1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM1()
	 * @generated
	 * @ordered
	 */
	protected CDM1CONTENT cDM1;

	/**
	 * The cached value of the '{@link #getCDM2() <em>CDM2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM2()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM2CONTENT> cDM2;

	/**
	 * The cached value of the '{@link #getCDM3() <em>CDM3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM3()
	 * @generated
	 * @ordered
	 */
	protected CDM3CONTENT cDM3;

	/**
	 * The cached value of the '{@link #getCDM4() <em>CDM4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM4()
	 * @generated
	 * @ordered
	 */
	protected CDM4CONTENT cDM4;

	/**
	 * The cached value of the '{@link #getCDM5() <em>CDM5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM5()
	 * @generated
	 * @ordered
	 */
	protected CDM5CONTENT cDM5;

	/**
	 * The cached value of the '{@link #getCDM6() <em>CDM6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM6()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM6CONTENT> cDM6;

	/**
	 * The cached value of the '{@link #getCDM7() <em>CDM7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM7()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM7CONTENT> cDM7;

	/**
	 * The cached value of the '{@link #getCDM8() <em>CDM8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM8()
	 * @generated
	 * @ordered
	 */
	protected CDM8CONTENT cDM8;

	/**
	 * The cached value of the '{@link #getCDM9() <em>CDM9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM9()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM9CONTENT> cDM9;

	/**
	 * The cached value of the '{@link #getCDM10() <em>CDM10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM10()
	 * @generated
	 * @ordered
	 */
	protected CDM10CONTENT cDM10;

	/**
	 * The cached value of the '{@link #getCDM11() <em>CDM11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM11()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM11CONTENT> cDM11;

	/**
	 * The cached value of the '{@link #getCDM12() <em>CDM12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM12()
	 * @generated
	 * @ordered
	 */
	protected EList<CDM12CONTENT> cDM12;

	/**
	 * The cached value of the '{@link #getCDM13() <em>CDM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDM13()
	 * @generated
	 * @ordered
	 */
	protected CDM13CONTENT cDM13;

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
	protected CDMCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCDMCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM1CONTENT getCDM1() {
		return cDM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM1(CDM1CONTENT newCDM1, NotificationChain msgs) {
		CDM1CONTENT oldCDM1 = cDM1;
		cDM1 = newCDM1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM1, oldCDM1, newCDM1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM1(CDM1CONTENT newCDM1) {
		if (newCDM1 != cDM1) {
			NotificationChain msgs = null;
			if (cDM1 != null)
				msgs = ((InternalEObject)cDM1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM1, null, msgs);
			if (newCDM1 != null)
				msgs = ((InternalEObject)newCDM1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM1, null, msgs);
			msgs = basicSetCDM1(newCDM1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM1, newCDM1, newCDM1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM2CONTENT> getCDM2() {
		if (cDM2 == null) {
			cDM2 = new EObjectContainmentEList<CDM2CONTENT>(CDM2CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM2);
		}
		return cDM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM3CONTENT getCDM3() {
		return cDM3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM3(CDM3CONTENT newCDM3, NotificationChain msgs) {
		CDM3CONTENT oldCDM3 = cDM3;
		cDM3 = newCDM3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM3, oldCDM3, newCDM3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM3(CDM3CONTENT newCDM3) {
		if (newCDM3 != cDM3) {
			NotificationChain msgs = null;
			if (cDM3 != null)
				msgs = ((InternalEObject)cDM3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM3, null, msgs);
			if (newCDM3 != null)
				msgs = ((InternalEObject)newCDM3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM3, null, msgs);
			msgs = basicSetCDM3(newCDM3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM3, newCDM3, newCDM3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM4CONTENT getCDM4() {
		return cDM4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM4(CDM4CONTENT newCDM4, NotificationChain msgs) {
		CDM4CONTENT oldCDM4 = cDM4;
		cDM4 = newCDM4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM4, oldCDM4, newCDM4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM4(CDM4CONTENT newCDM4) {
		if (newCDM4 != cDM4) {
			NotificationChain msgs = null;
			if (cDM4 != null)
				msgs = ((InternalEObject)cDM4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM4, null, msgs);
			if (newCDM4 != null)
				msgs = ((InternalEObject)newCDM4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM4, null, msgs);
			msgs = basicSetCDM4(newCDM4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM4, newCDM4, newCDM4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM5CONTENT getCDM5() {
		return cDM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM5(CDM5CONTENT newCDM5, NotificationChain msgs) {
		CDM5CONTENT oldCDM5 = cDM5;
		cDM5 = newCDM5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM5, oldCDM5, newCDM5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM5(CDM5CONTENT newCDM5) {
		if (newCDM5 != cDM5) {
			NotificationChain msgs = null;
			if (cDM5 != null)
				msgs = ((InternalEObject)cDM5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM5, null, msgs);
			if (newCDM5 != null)
				msgs = ((InternalEObject)newCDM5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM5, null, msgs);
			msgs = basicSetCDM5(newCDM5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM5, newCDM5, newCDM5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM6CONTENT> getCDM6() {
		if (cDM6 == null) {
			cDM6 = new EObjectContainmentEList<CDM6CONTENT>(CDM6CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM6);
		}
		return cDM6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM7CONTENT> getCDM7() {
		if (cDM7 == null) {
			cDM7 = new EObjectContainmentEList<CDM7CONTENT>(CDM7CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM7);
		}
		return cDM7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM8CONTENT getCDM8() {
		return cDM8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM8(CDM8CONTENT newCDM8, NotificationChain msgs) {
		CDM8CONTENT oldCDM8 = cDM8;
		cDM8 = newCDM8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM8, oldCDM8, newCDM8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM8(CDM8CONTENT newCDM8) {
		if (newCDM8 != cDM8) {
			NotificationChain msgs = null;
			if (cDM8 != null)
				msgs = ((InternalEObject)cDM8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM8, null, msgs);
			if (newCDM8 != null)
				msgs = ((InternalEObject)newCDM8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM8, null, msgs);
			msgs = basicSetCDM8(newCDM8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM8, newCDM8, newCDM8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM9CONTENT> getCDM9() {
		if (cDM9 == null) {
			cDM9 = new EObjectContainmentEList<CDM9CONTENT>(CDM9CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM9);
		}
		return cDM9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM10CONTENT getCDM10() {
		return cDM10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM10(CDM10CONTENT newCDM10, NotificationChain msgs) {
		CDM10CONTENT oldCDM10 = cDM10;
		cDM10 = newCDM10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM10, oldCDM10, newCDM10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM10(CDM10CONTENT newCDM10) {
		if (newCDM10 != cDM10) {
			NotificationChain msgs = null;
			if (cDM10 != null)
				msgs = ((InternalEObject)cDM10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM10, null, msgs);
			if (newCDM10 != null)
				msgs = ((InternalEObject)newCDM10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM10, null, msgs);
			msgs = basicSetCDM10(newCDM10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM10, newCDM10, newCDM10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM11CONTENT> getCDM11() {
		if (cDM11 == null) {
			cDM11 = new EObjectContainmentEList<CDM11CONTENT>(CDM11CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM11);
		}
		return cDM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CDM12CONTENT> getCDM12() {
		if (cDM12 == null) {
			cDM12 = new EObjectContainmentEList<CDM12CONTENT>(CDM12CONTENT.class, this, V2xmlPackage.CDMCONTENT__CDM12);
		}
		return cDM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDM13CONTENT getCDM13() {
		return cDM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCDM13(CDM13CONTENT newCDM13, NotificationChain msgs) {
		CDM13CONTENT oldCDM13 = cDM13;
		cDM13 = newCDM13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM13, oldCDM13, newCDM13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDM13(CDM13CONTENT newCDM13) {
		if (newCDM13 != cDM13) {
			NotificationChain msgs = null;
			if (cDM13 != null)
				msgs = ((InternalEObject)cDM13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM13, null, msgs);
			if (newCDM13 != null)
				msgs = ((InternalEObject)newCDM13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CDMCONTENT__CDM13, null, msgs);
			msgs = basicSetCDM13(newCDM13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CDMCONTENT__CDM13, newCDM13, newCDM13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CDMCONTENT__ANY);
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
			case V2xmlPackage.CDMCONTENT__CDM1:
				return basicSetCDM1(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM2:
				return ((InternalEList<?>)getCDM2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM3:
				return basicSetCDM3(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM4:
				return basicSetCDM4(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM5:
				return basicSetCDM5(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM6:
				return ((InternalEList<?>)getCDM6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM7:
				return ((InternalEList<?>)getCDM7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM8:
				return basicSetCDM8(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM9:
				return ((InternalEList<?>)getCDM9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM10:
				return basicSetCDM10(null, msgs);
			case V2xmlPackage.CDMCONTENT__CDM11:
				return ((InternalEList<?>)getCDM11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM12:
				return ((InternalEList<?>)getCDM12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CDMCONTENT__CDM13:
				return basicSetCDM13(null, msgs);
			case V2xmlPackage.CDMCONTENT__ANY:
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
			case V2xmlPackage.CDMCONTENT__CDM1:
				return getCDM1();
			case V2xmlPackage.CDMCONTENT__CDM2:
				return getCDM2();
			case V2xmlPackage.CDMCONTENT__CDM3:
				return getCDM3();
			case V2xmlPackage.CDMCONTENT__CDM4:
				return getCDM4();
			case V2xmlPackage.CDMCONTENT__CDM5:
				return getCDM5();
			case V2xmlPackage.CDMCONTENT__CDM6:
				return getCDM6();
			case V2xmlPackage.CDMCONTENT__CDM7:
				return getCDM7();
			case V2xmlPackage.CDMCONTENT__CDM8:
				return getCDM8();
			case V2xmlPackage.CDMCONTENT__CDM9:
				return getCDM9();
			case V2xmlPackage.CDMCONTENT__CDM10:
				return getCDM10();
			case V2xmlPackage.CDMCONTENT__CDM11:
				return getCDM11();
			case V2xmlPackage.CDMCONTENT__CDM12:
				return getCDM12();
			case V2xmlPackage.CDMCONTENT__CDM13:
				return getCDM13();
			case V2xmlPackage.CDMCONTENT__ANY:
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
			case V2xmlPackage.CDMCONTENT__CDM1:
				setCDM1((CDM1CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM2:
				getCDM2().clear();
				getCDM2().addAll((Collection<? extends CDM2CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM3:
				setCDM3((CDM3CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM4:
				setCDM4((CDM4CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM5:
				setCDM5((CDM5CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM6:
				getCDM6().clear();
				getCDM6().addAll((Collection<? extends CDM6CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM7:
				getCDM7().clear();
				getCDM7().addAll((Collection<? extends CDM7CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM8:
				setCDM8((CDM8CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM9:
				getCDM9().clear();
				getCDM9().addAll((Collection<? extends CDM9CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM10:
				setCDM10((CDM10CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM11:
				getCDM11().clear();
				getCDM11().addAll((Collection<? extends CDM11CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM12:
				getCDM12().clear();
				getCDM12().addAll((Collection<? extends CDM12CONTENT>)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__CDM13:
				setCDM13((CDM13CONTENT)newValue);
				return;
			case V2xmlPackage.CDMCONTENT__ANY:
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
			case V2xmlPackage.CDMCONTENT__CDM1:
				setCDM1((CDM1CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM2:
				getCDM2().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM3:
				setCDM3((CDM3CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM4:
				setCDM4((CDM4CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM5:
				setCDM5((CDM5CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM6:
				getCDM6().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM7:
				getCDM7().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM8:
				setCDM8((CDM8CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM9:
				getCDM9().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM10:
				setCDM10((CDM10CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__CDM11:
				getCDM11().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM12:
				getCDM12().clear();
				return;
			case V2xmlPackage.CDMCONTENT__CDM13:
				setCDM13((CDM13CONTENT)null);
				return;
			case V2xmlPackage.CDMCONTENT__ANY:
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
			case V2xmlPackage.CDMCONTENT__CDM1:
				return cDM1 != null;
			case V2xmlPackage.CDMCONTENT__CDM2:
				return cDM2 != null && !cDM2.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM3:
				return cDM3 != null;
			case V2xmlPackage.CDMCONTENT__CDM4:
				return cDM4 != null;
			case V2xmlPackage.CDMCONTENT__CDM5:
				return cDM5 != null;
			case V2xmlPackage.CDMCONTENT__CDM6:
				return cDM6 != null && !cDM6.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM7:
				return cDM7 != null && !cDM7.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM8:
				return cDM8 != null;
			case V2xmlPackage.CDMCONTENT__CDM9:
				return cDM9 != null && !cDM9.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM10:
				return cDM10 != null;
			case V2xmlPackage.CDMCONTENT__CDM11:
				return cDM11 != null && !cDM11.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM12:
				return cDM12 != null && !cDM12.isEmpty();
			case V2xmlPackage.CDMCONTENT__CDM13:
				return cDM13 != null;
			case V2xmlPackage.CDMCONTENT__ANY:
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

} //CDMCONTENTImpl
