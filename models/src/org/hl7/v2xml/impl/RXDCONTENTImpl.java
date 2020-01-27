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

import org.hl7.v2xml.RXD10CONTENT;
import org.hl7.v2xml.RXD11CONTENT;
import org.hl7.v2xml.RXD12CONTENT;
import org.hl7.v2xml.RXD13CONTENT;
import org.hl7.v2xml.RXD14CONTENT;
import org.hl7.v2xml.RXD15CONTENT;
import org.hl7.v2xml.RXD16CONTENT;
import org.hl7.v2xml.RXD17CONTENT;
import org.hl7.v2xml.RXD18CONTENT;
import org.hl7.v2xml.RXD19CONTENT;
import org.hl7.v2xml.RXD1CONTENT;
import org.hl7.v2xml.RXD20CONTENT;
import org.hl7.v2xml.RXD21CONTENT;
import org.hl7.v2xml.RXD22CONTENT;
import org.hl7.v2xml.RXD23CONTENT;
import org.hl7.v2xml.RXD24CONTENT;
import org.hl7.v2xml.RXD25CONTENT;
import org.hl7.v2xml.RXD26CONTENT;
import org.hl7.v2xml.RXD27CONTENT;
import org.hl7.v2xml.RXD28CONTENT;
import org.hl7.v2xml.RXD29CONTENT;
import org.hl7.v2xml.RXD2CONTENT;
import org.hl7.v2xml.RXD30CONTENT;
import org.hl7.v2xml.RXD31CONTENT;
import org.hl7.v2xml.RXD32CONTENT;
import org.hl7.v2xml.RXD33CONTENT;
import org.hl7.v2xml.RXD3CONTENT;
import org.hl7.v2xml.RXD4CONTENT;
import org.hl7.v2xml.RXD5CONTENT;
import org.hl7.v2xml.RXD6CONTENT;
import org.hl7.v2xml.RXD7CONTENT;
import org.hl7.v2xml.RXD8CONTENT;
import org.hl7.v2xml.RXD9CONTENT;
import org.hl7.v2xml.RXDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD1 <em>RXD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD2 <em>RXD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD3 <em>RXD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD4 <em>RXD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD5 <em>RXD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD6 <em>RXD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD7 <em>RXD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD8 <em>RXD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD9 <em>RXD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD10 <em>RXD10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD11 <em>RXD11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD12 <em>RXD12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD13 <em>RXD13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD14 <em>RXD14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD15 <em>RXD15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD16 <em>RXD16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD17 <em>RXD17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD18 <em>RXD18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD19 <em>RXD19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD20 <em>RXD20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD21 <em>RXD21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD22 <em>RXD22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD23 <em>RXD23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD24 <em>RXD24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD25 <em>RXD25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD26 <em>RXD26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD27 <em>RXD27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD28 <em>RXD28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD29 <em>RXD29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD30 <em>RXD30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD31 <em>RXD31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD32 <em>RXD32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getRXD33 <em>RXD33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXDCONTENTImpl extends EObjectImpl implements RXDCONTENT {
	/**
	 * The cached value of the '{@link #getRXD1() <em>RXD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD1()
	 * @generated
	 * @ordered
	 */
	protected RXD1CONTENT rXD1;

	/**
	 * The cached value of the '{@link #getRXD2() <em>RXD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD2()
	 * @generated
	 * @ordered
	 */
	protected RXD2CONTENT rXD2;

	/**
	 * The cached value of the '{@link #getRXD3() <em>RXD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD3()
	 * @generated
	 * @ordered
	 */
	protected RXD3CONTENT rXD3;

	/**
	 * The cached value of the '{@link #getRXD4() <em>RXD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD4()
	 * @generated
	 * @ordered
	 */
	protected RXD4CONTENT rXD4;

	/**
	 * The cached value of the '{@link #getRXD5() <em>RXD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD5()
	 * @generated
	 * @ordered
	 */
	protected RXD5CONTENT rXD5;

	/**
	 * The cached value of the '{@link #getRXD6() <em>RXD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD6()
	 * @generated
	 * @ordered
	 */
	protected RXD6CONTENT rXD6;

	/**
	 * The cached value of the '{@link #getRXD7() <em>RXD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD7()
	 * @generated
	 * @ordered
	 */
	protected RXD7CONTENT rXD7;

	/**
	 * The cached value of the '{@link #getRXD8() <em>RXD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD8()
	 * @generated
	 * @ordered
	 */
	protected RXD8CONTENT rXD8;

	/**
	 * The cached value of the '{@link #getRXD9() <em>RXD9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD9()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD9CONTENT> rXD9;

	/**
	 * The cached value of the '{@link #getRXD10() <em>RXD10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD10()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD10CONTENT> rXD10;

	/**
	 * The cached value of the '{@link #getRXD11() <em>RXD11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD11()
	 * @generated
	 * @ordered
	 */
	protected RXD11CONTENT rXD11;

	/**
	 * The cached value of the '{@link #getRXD12() <em>RXD12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD12()
	 * @generated
	 * @ordered
	 */
	protected RXD12CONTENT rXD12;

	/**
	 * The cached value of the '{@link #getRXD13() <em>RXD13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD13()
	 * @generated
	 * @ordered
	 */
	protected RXD13CONTENT rXD13;

	/**
	 * The cached value of the '{@link #getRXD14() <em>RXD14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD14()
	 * @generated
	 * @ordered
	 */
	protected RXD14CONTENT rXD14;

	/**
	 * The cached value of the '{@link #getRXD15() <em>RXD15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD15()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD15CONTENT> rXD15;

	/**
	 * The cached value of the '{@link #getRXD16() <em>RXD16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD16()
	 * @generated
	 * @ordered
	 */
	protected RXD16CONTENT rXD16;

	/**
	 * The cached value of the '{@link #getRXD17() <em>RXD17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD17()
	 * @generated
	 * @ordered
	 */
	protected RXD17CONTENT rXD17;

	/**
	 * The cached value of the '{@link #getRXD18() <em>RXD18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD18()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD18CONTENT> rXD18;

	/**
	 * The cached value of the '{@link #getRXD19() <em>RXD19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD19()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD19CONTENT> rXD19;

	/**
	 * The cached value of the '{@link #getRXD20() <em>RXD20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD20()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD20CONTENT> rXD20;

	/**
	 * The cached value of the '{@link #getRXD21() <em>RXD21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD21()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD21CONTENT> rXD21;

	/**
	 * The cached value of the '{@link #getRXD22() <em>RXD22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD22()
	 * @generated
	 * @ordered
	 */
	protected RXD22CONTENT rXD22;

	/**
	 * The cached value of the '{@link #getRXD23() <em>RXD23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD23()
	 * @generated
	 * @ordered
	 */
	protected RXD23CONTENT rXD23;

	/**
	 * The cached value of the '{@link #getRXD24() <em>RXD24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD24()
	 * @generated
	 * @ordered
	 */
	protected RXD24CONTENT rXD24;

	/**
	 * The cached value of the '{@link #getRXD25() <em>RXD25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD25()
	 * @generated
	 * @ordered
	 */
	protected EList<RXD25CONTENT> rXD25;

	/**
	 * The cached value of the '{@link #getRXD26() <em>RXD26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD26()
	 * @generated
	 * @ordered
	 */
	protected RXD26CONTENT rXD26;

	/**
	 * The cached value of the '{@link #getRXD27() <em>RXD27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD27()
	 * @generated
	 * @ordered
	 */
	protected RXD27CONTENT rXD27;

	/**
	 * The cached value of the '{@link #getRXD28() <em>RXD28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD28()
	 * @generated
	 * @ordered
	 */
	protected RXD28CONTENT rXD28;

	/**
	 * The cached value of the '{@link #getRXD29() <em>RXD29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD29()
	 * @generated
	 * @ordered
	 */
	protected RXD29CONTENT rXD29;

	/**
	 * The cached value of the '{@link #getRXD30() <em>RXD30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD30()
	 * @generated
	 * @ordered
	 */
	protected RXD30CONTENT rXD30;

	/**
	 * The cached value of the '{@link #getRXD31() <em>RXD31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD31()
	 * @generated
	 * @ordered
	 */
	protected RXD31CONTENT rXD31;

	/**
	 * The cached value of the '{@link #getRXD32() <em>RXD32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD32()
	 * @generated
	 * @ordered
	 */
	protected RXD32CONTENT rXD32;

	/**
	 * The cached value of the '{@link #getRXD33() <em>RXD33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXD33()
	 * @generated
	 * @ordered
	 */
	protected RXD33CONTENT rXD33;

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
	protected RXDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD1CONTENT getRXD1() {
		return rXD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD1(RXD1CONTENT newRXD1, NotificationChain msgs) {
		RXD1CONTENT oldRXD1 = rXD1;
		rXD1 = newRXD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD1, oldRXD1, newRXD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD1(RXD1CONTENT newRXD1) {
		if (newRXD1 != rXD1) {
			NotificationChain msgs = null;
			if (rXD1 != null)
				msgs = ((InternalEObject)rXD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD1, null, msgs);
			if (newRXD1 != null)
				msgs = ((InternalEObject)newRXD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD1, null, msgs);
			msgs = basicSetRXD1(newRXD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD1, newRXD1, newRXD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD2CONTENT getRXD2() {
		return rXD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD2(RXD2CONTENT newRXD2, NotificationChain msgs) {
		RXD2CONTENT oldRXD2 = rXD2;
		rXD2 = newRXD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD2, oldRXD2, newRXD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD2(RXD2CONTENT newRXD2) {
		if (newRXD2 != rXD2) {
			NotificationChain msgs = null;
			if (rXD2 != null)
				msgs = ((InternalEObject)rXD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD2, null, msgs);
			if (newRXD2 != null)
				msgs = ((InternalEObject)newRXD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD2, null, msgs);
			msgs = basicSetRXD2(newRXD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD2, newRXD2, newRXD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD3CONTENT getRXD3() {
		return rXD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD3(RXD3CONTENT newRXD3, NotificationChain msgs) {
		RXD3CONTENT oldRXD3 = rXD3;
		rXD3 = newRXD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD3, oldRXD3, newRXD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD3(RXD3CONTENT newRXD3) {
		if (newRXD3 != rXD3) {
			NotificationChain msgs = null;
			if (rXD3 != null)
				msgs = ((InternalEObject)rXD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD3, null, msgs);
			if (newRXD3 != null)
				msgs = ((InternalEObject)newRXD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD3, null, msgs);
			msgs = basicSetRXD3(newRXD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD3, newRXD3, newRXD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD4CONTENT getRXD4() {
		return rXD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD4(RXD4CONTENT newRXD4, NotificationChain msgs) {
		RXD4CONTENT oldRXD4 = rXD4;
		rXD4 = newRXD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD4, oldRXD4, newRXD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD4(RXD4CONTENT newRXD4) {
		if (newRXD4 != rXD4) {
			NotificationChain msgs = null;
			if (rXD4 != null)
				msgs = ((InternalEObject)rXD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD4, null, msgs);
			if (newRXD4 != null)
				msgs = ((InternalEObject)newRXD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD4, null, msgs);
			msgs = basicSetRXD4(newRXD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD4, newRXD4, newRXD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD5CONTENT getRXD5() {
		return rXD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD5(RXD5CONTENT newRXD5, NotificationChain msgs) {
		RXD5CONTENT oldRXD5 = rXD5;
		rXD5 = newRXD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD5, oldRXD5, newRXD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD5(RXD5CONTENT newRXD5) {
		if (newRXD5 != rXD5) {
			NotificationChain msgs = null;
			if (rXD5 != null)
				msgs = ((InternalEObject)rXD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD5, null, msgs);
			if (newRXD5 != null)
				msgs = ((InternalEObject)newRXD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD5, null, msgs);
			msgs = basicSetRXD5(newRXD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD5, newRXD5, newRXD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD6CONTENT getRXD6() {
		return rXD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD6(RXD6CONTENT newRXD6, NotificationChain msgs) {
		RXD6CONTENT oldRXD6 = rXD6;
		rXD6 = newRXD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD6, oldRXD6, newRXD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD6(RXD6CONTENT newRXD6) {
		if (newRXD6 != rXD6) {
			NotificationChain msgs = null;
			if (rXD6 != null)
				msgs = ((InternalEObject)rXD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD6, null, msgs);
			if (newRXD6 != null)
				msgs = ((InternalEObject)newRXD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD6, null, msgs);
			msgs = basicSetRXD6(newRXD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD6, newRXD6, newRXD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD7CONTENT getRXD7() {
		return rXD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD7(RXD7CONTENT newRXD7, NotificationChain msgs) {
		RXD7CONTENT oldRXD7 = rXD7;
		rXD7 = newRXD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD7, oldRXD7, newRXD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD7(RXD7CONTENT newRXD7) {
		if (newRXD7 != rXD7) {
			NotificationChain msgs = null;
			if (rXD7 != null)
				msgs = ((InternalEObject)rXD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD7, null, msgs);
			if (newRXD7 != null)
				msgs = ((InternalEObject)newRXD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD7, null, msgs);
			msgs = basicSetRXD7(newRXD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD7, newRXD7, newRXD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD8CONTENT getRXD8() {
		return rXD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD8(RXD8CONTENT newRXD8, NotificationChain msgs) {
		RXD8CONTENT oldRXD8 = rXD8;
		rXD8 = newRXD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD8, oldRXD8, newRXD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD8(RXD8CONTENT newRXD8) {
		if (newRXD8 != rXD8) {
			NotificationChain msgs = null;
			if (rXD8 != null)
				msgs = ((InternalEObject)rXD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD8, null, msgs);
			if (newRXD8 != null)
				msgs = ((InternalEObject)newRXD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD8, null, msgs);
			msgs = basicSetRXD8(newRXD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD8, newRXD8, newRXD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD9CONTENT> getRXD9() {
		if (rXD9 == null) {
			rXD9 = new EObjectContainmentEList<RXD9CONTENT>(RXD9CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD9);
		}
		return rXD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD10CONTENT> getRXD10() {
		if (rXD10 == null) {
			rXD10 = new EObjectContainmentEList<RXD10CONTENT>(RXD10CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD10);
		}
		return rXD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD11CONTENT getRXD11() {
		return rXD11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD11(RXD11CONTENT newRXD11, NotificationChain msgs) {
		RXD11CONTENT oldRXD11 = rXD11;
		rXD11 = newRXD11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD11, oldRXD11, newRXD11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD11(RXD11CONTENT newRXD11) {
		if (newRXD11 != rXD11) {
			NotificationChain msgs = null;
			if (rXD11 != null)
				msgs = ((InternalEObject)rXD11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD11, null, msgs);
			if (newRXD11 != null)
				msgs = ((InternalEObject)newRXD11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD11, null, msgs);
			msgs = basicSetRXD11(newRXD11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD11, newRXD11, newRXD11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD12CONTENT getRXD12() {
		return rXD12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD12(RXD12CONTENT newRXD12, NotificationChain msgs) {
		RXD12CONTENT oldRXD12 = rXD12;
		rXD12 = newRXD12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD12, oldRXD12, newRXD12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD12(RXD12CONTENT newRXD12) {
		if (newRXD12 != rXD12) {
			NotificationChain msgs = null;
			if (rXD12 != null)
				msgs = ((InternalEObject)rXD12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD12, null, msgs);
			if (newRXD12 != null)
				msgs = ((InternalEObject)newRXD12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD12, null, msgs);
			msgs = basicSetRXD12(newRXD12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD12, newRXD12, newRXD12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD13CONTENT getRXD13() {
		return rXD13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD13(RXD13CONTENT newRXD13, NotificationChain msgs) {
		RXD13CONTENT oldRXD13 = rXD13;
		rXD13 = newRXD13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD13, oldRXD13, newRXD13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD13(RXD13CONTENT newRXD13) {
		if (newRXD13 != rXD13) {
			NotificationChain msgs = null;
			if (rXD13 != null)
				msgs = ((InternalEObject)rXD13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD13, null, msgs);
			if (newRXD13 != null)
				msgs = ((InternalEObject)newRXD13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD13, null, msgs);
			msgs = basicSetRXD13(newRXD13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD13, newRXD13, newRXD13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD14CONTENT getRXD14() {
		return rXD14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD14(RXD14CONTENT newRXD14, NotificationChain msgs) {
		RXD14CONTENT oldRXD14 = rXD14;
		rXD14 = newRXD14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD14, oldRXD14, newRXD14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD14(RXD14CONTENT newRXD14) {
		if (newRXD14 != rXD14) {
			NotificationChain msgs = null;
			if (rXD14 != null)
				msgs = ((InternalEObject)rXD14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD14, null, msgs);
			if (newRXD14 != null)
				msgs = ((InternalEObject)newRXD14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD14, null, msgs);
			msgs = basicSetRXD14(newRXD14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD14, newRXD14, newRXD14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD15CONTENT> getRXD15() {
		if (rXD15 == null) {
			rXD15 = new EObjectContainmentEList<RXD15CONTENT>(RXD15CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD15);
		}
		return rXD15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD16CONTENT getRXD16() {
		return rXD16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD16(RXD16CONTENT newRXD16, NotificationChain msgs) {
		RXD16CONTENT oldRXD16 = rXD16;
		rXD16 = newRXD16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD16, oldRXD16, newRXD16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD16(RXD16CONTENT newRXD16) {
		if (newRXD16 != rXD16) {
			NotificationChain msgs = null;
			if (rXD16 != null)
				msgs = ((InternalEObject)rXD16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD16, null, msgs);
			if (newRXD16 != null)
				msgs = ((InternalEObject)newRXD16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD16, null, msgs);
			msgs = basicSetRXD16(newRXD16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD16, newRXD16, newRXD16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD17CONTENT getRXD17() {
		return rXD17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD17(RXD17CONTENT newRXD17, NotificationChain msgs) {
		RXD17CONTENT oldRXD17 = rXD17;
		rXD17 = newRXD17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD17, oldRXD17, newRXD17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD17(RXD17CONTENT newRXD17) {
		if (newRXD17 != rXD17) {
			NotificationChain msgs = null;
			if (rXD17 != null)
				msgs = ((InternalEObject)rXD17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD17, null, msgs);
			if (newRXD17 != null)
				msgs = ((InternalEObject)newRXD17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD17, null, msgs);
			msgs = basicSetRXD17(newRXD17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD17, newRXD17, newRXD17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD18CONTENT> getRXD18() {
		if (rXD18 == null) {
			rXD18 = new EObjectContainmentEList<RXD18CONTENT>(RXD18CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD18);
		}
		return rXD18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD19CONTENT> getRXD19() {
		if (rXD19 == null) {
			rXD19 = new EObjectContainmentEList<RXD19CONTENT>(RXD19CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD19);
		}
		return rXD19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD20CONTENT> getRXD20() {
		if (rXD20 == null) {
			rXD20 = new EObjectContainmentEList<RXD20CONTENT>(RXD20CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD20);
		}
		return rXD20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD21CONTENT> getRXD21() {
		if (rXD21 == null) {
			rXD21 = new EObjectContainmentEList<RXD21CONTENT>(RXD21CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD21);
		}
		return rXD21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD22CONTENT getRXD22() {
		return rXD22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD22(RXD22CONTENT newRXD22, NotificationChain msgs) {
		RXD22CONTENT oldRXD22 = rXD22;
		rXD22 = newRXD22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD22, oldRXD22, newRXD22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD22(RXD22CONTENT newRXD22) {
		if (newRXD22 != rXD22) {
			NotificationChain msgs = null;
			if (rXD22 != null)
				msgs = ((InternalEObject)rXD22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD22, null, msgs);
			if (newRXD22 != null)
				msgs = ((InternalEObject)newRXD22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD22, null, msgs);
			msgs = basicSetRXD22(newRXD22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD22, newRXD22, newRXD22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD23CONTENT getRXD23() {
		return rXD23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD23(RXD23CONTENT newRXD23, NotificationChain msgs) {
		RXD23CONTENT oldRXD23 = rXD23;
		rXD23 = newRXD23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD23, oldRXD23, newRXD23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD23(RXD23CONTENT newRXD23) {
		if (newRXD23 != rXD23) {
			NotificationChain msgs = null;
			if (rXD23 != null)
				msgs = ((InternalEObject)rXD23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD23, null, msgs);
			if (newRXD23 != null)
				msgs = ((InternalEObject)newRXD23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD23, null, msgs);
			msgs = basicSetRXD23(newRXD23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD23, newRXD23, newRXD23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD24CONTENT getRXD24() {
		return rXD24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD24(RXD24CONTENT newRXD24, NotificationChain msgs) {
		RXD24CONTENT oldRXD24 = rXD24;
		rXD24 = newRXD24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD24, oldRXD24, newRXD24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD24(RXD24CONTENT newRXD24) {
		if (newRXD24 != rXD24) {
			NotificationChain msgs = null;
			if (rXD24 != null)
				msgs = ((InternalEObject)rXD24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD24, null, msgs);
			if (newRXD24 != null)
				msgs = ((InternalEObject)newRXD24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD24, null, msgs);
			msgs = basicSetRXD24(newRXD24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD24, newRXD24, newRXD24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXD25CONTENT> getRXD25() {
		if (rXD25 == null) {
			rXD25 = new EObjectContainmentEList<RXD25CONTENT>(RXD25CONTENT.class, this, V2xmlPackage.RXDCONTENT__RXD25);
		}
		return rXD25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD26CONTENT getRXD26() {
		return rXD26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD26(RXD26CONTENT newRXD26, NotificationChain msgs) {
		RXD26CONTENT oldRXD26 = rXD26;
		rXD26 = newRXD26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD26, oldRXD26, newRXD26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD26(RXD26CONTENT newRXD26) {
		if (newRXD26 != rXD26) {
			NotificationChain msgs = null;
			if (rXD26 != null)
				msgs = ((InternalEObject)rXD26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD26, null, msgs);
			if (newRXD26 != null)
				msgs = ((InternalEObject)newRXD26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD26, null, msgs);
			msgs = basicSetRXD26(newRXD26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD26, newRXD26, newRXD26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD27CONTENT getRXD27() {
		return rXD27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD27(RXD27CONTENT newRXD27, NotificationChain msgs) {
		RXD27CONTENT oldRXD27 = rXD27;
		rXD27 = newRXD27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD27, oldRXD27, newRXD27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD27(RXD27CONTENT newRXD27) {
		if (newRXD27 != rXD27) {
			NotificationChain msgs = null;
			if (rXD27 != null)
				msgs = ((InternalEObject)rXD27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD27, null, msgs);
			if (newRXD27 != null)
				msgs = ((InternalEObject)newRXD27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD27, null, msgs);
			msgs = basicSetRXD27(newRXD27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD27, newRXD27, newRXD27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD28CONTENT getRXD28() {
		return rXD28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD28(RXD28CONTENT newRXD28, NotificationChain msgs) {
		RXD28CONTENT oldRXD28 = rXD28;
		rXD28 = newRXD28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD28, oldRXD28, newRXD28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD28(RXD28CONTENT newRXD28) {
		if (newRXD28 != rXD28) {
			NotificationChain msgs = null;
			if (rXD28 != null)
				msgs = ((InternalEObject)rXD28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD28, null, msgs);
			if (newRXD28 != null)
				msgs = ((InternalEObject)newRXD28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD28, null, msgs);
			msgs = basicSetRXD28(newRXD28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD28, newRXD28, newRXD28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD29CONTENT getRXD29() {
		return rXD29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD29(RXD29CONTENT newRXD29, NotificationChain msgs) {
		RXD29CONTENT oldRXD29 = rXD29;
		rXD29 = newRXD29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD29, oldRXD29, newRXD29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD29(RXD29CONTENT newRXD29) {
		if (newRXD29 != rXD29) {
			NotificationChain msgs = null;
			if (rXD29 != null)
				msgs = ((InternalEObject)rXD29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD29, null, msgs);
			if (newRXD29 != null)
				msgs = ((InternalEObject)newRXD29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD29, null, msgs);
			msgs = basicSetRXD29(newRXD29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD29, newRXD29, newRXD29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD30CONTENT getRXD30() {
		return rXD30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD30(RXD30CONTENT newRXD30, NotificationChain msgs) {
		RXD30CONTENT oldRXD30 = rXD30;
		rXD30 = newRXD30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD30, oldRXD30, newRXD30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD30(RXD30CONTENT newRXD30) {
		if (newRXD30 != rXD30) {
			NotificationChain msgs = null;
			if (rXD30 != null)
				msgs = ((InternalEObject)rXD30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD30, null, msgs);
			if (newRXD30 != null)
				msgs = ((InternalEObject)newRXD30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD30, null, msgs);
			msgs = basicSetRXD30(newRXD30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD30, newRXD30, newRXD30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD31CONTENT getRXD31() {
		return rXD31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD31(RXD31CONTENT newRXD31, NotificationChain msgs) {
		RXD31CONTENT oldRXD31 = rXD31;
		rXD31 = newRXD31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD31, oldRXD31, newRXD31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD31(RXD31CONTENT newRXD31) {
		if (newRXD31 != rXD31) {
			NotificationChain msgs = null;
			if (rXD31 != null)
				msgs = ((InternalEObject)rXD31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD31, null, msgs);
			if (newRXD31 != null)
				msgs = ((InternalEObject)newRXD31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD31, null, msgs);
			msgs = basicSetRXD31(newRXD31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD31, newRXD31, newRXD31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD32CONTENT getRXD32() {
		return rXD32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD32(RXD32CONTENT newRXD32, NotificationChain msgs) {
		RXD32CONTENT oldRXD32 = rXD32;
		rXD32 = newRXD32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD32, oldRXD32, newRXD32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD32(RXD32CONTENT newRXD32) {
		if (newRXD32 != rXD32) {
			NotificationChain msgs = null;
			if (rXD32 != null)
				msgs = ((InternalEObject)rXD32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD32, null, msgs);
			if (newRXD32 != null)
				msgs = ((InternalEObject)newRXD32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD32, null, msgs);
			msgs = basicSetRXD32(newRXD32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD32, newRXD32, newRXD32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXD33CONTENT getRXD33() {
		return rXD33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXD33(RXD33CONTENT newRXD33, NotificationChain msgs) {
		RXD33CONTENT oldRXD33 = rXD33;
		rXD33 = newRXD33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD33, oldRXD33, newRXD33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXD33(RXD33CONTENT newRXD33) {
		if (newRXD33 != rXD33) {
			NotificationChain msgs = null;
			if (rXD33 != null)
				msgs = ((InternalEObject)rXD33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD33, null, msgs);
			if (newRXD33 != null)
				msgs = ((InternalEObject)newRXD33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXDCONTENT__RXD33, null, msgs);
			msgs = basicSetRXD33(newRXD33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXDCONTENT__RXD33, newRXD33, newRXD33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXDCONTENT__ANY);
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
			case V2xmlPackage.RXDCONTENT__RXD1:
				return basicSetRXD1(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD2:
				return basicSetRXD2(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD3:
				return basicSetRXD3(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD4:
				return basicSetRXD4(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD5:
				return basicSetRXD5(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD6:
				return basicSetRXD6(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD7:
				return basicSetRXD7(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD8:
				return basicSetRXD8(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD9:
				return ((InternalEList<?>)getRXD9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD10:
				return ((InternalEList<?>)getRXD10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD11:
				return basicSetRXD11(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD12:
				return basicSetRXD12(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD13:
				return basicSetRXD13(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD14:
				return basicSetRXD14(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD15:
				return ((InternalEList<?>)getRXD15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD16:
				return basicSetRXD16(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD17:
				return basicSetRXD17(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD18:
				return ((InternalEList<?>)getRXD18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD19:
				return ((InternalEList<?>)getRXD19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD20:
				return ((InternalEList<?>)getRXD20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD21:
				return ((InternalEList<?>)getRXD21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD22:
				return basicSetRXD22(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD23:
				return basicSetRXD23(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD24:
				return basicSetRXD24(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD25:
				return ((InternalEList<?>)getRXD25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXDCONTENT__RXD26:
				return basicSetRXD26(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD27:
				return basicSetRXD27(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD28:
				return basicSetRXD28(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD29:
				return basicSetRXD29(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD30:
				return basicSetRXD30(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD31:
				return basicSetRXD31(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD32:
				return basicSetRXD32(null, msgs);
			case V2xmlPackage.RXDCONTENT__RXD33:
				return basicSetRXD33(null, msgs);
			case V2xmlPackage.RXDCONTENT__ANY:
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
			case V2xmlPackage.RXDCONTENT__RXD1:
				return getRXD1();
			case V2xmlPackage.RXDCONTENT__RXD2:
				return getRXD2();
			case V2xmlPackage.RXDCONTENT__RXD3:
				return getRXD3();
			case V2xmlPackage.RXDCONTENT__RXD4:
				return getRXD4();
			case V2xmlPackage.RXDCONTENT__RXD5:
				return getRXD5();
			case V2xmlPackage.RXDCONTENT__RXD6:
				return getRXD6();
			case V2xmlPackage.RXDCONTENT__RXD7:
				return getRXD7();
			case V2xmlPackage.RXDCONTENT__RXD8:
				return getRXD8();
			case V2xmlPackage.RXDCONTENT__RXD9:
				return getRXD9();
			case V2xmlPackage.RXDCONTENT__RXD10:
				return getRXD10();
			case V2xmlPackage.RXDCONTENT__RXD11:
				return getRXD11();
			case V2xmlPackage.RXDCONTENT__RXD12:
				return getRXD12();
			case V2xmlPackage.RXDCONTENT__RXD13:
				return getRXD13();
			case V2xmlPackage.RXDCONTENT__RXD14:
				return getRXD14();
			case V2xmlPackage.RXDCONTENT__RXD15:
				return getRXD15();
			case V2xmlPackage.RXDCONTENT__RXD16:
				return getRXD16();
			case V2xmlPackage.RXDCONTENT__RXD17:
				return getRXD17();
			case V2xmlPackage.RXDCONTENT__RXD18:
				return getRXD18();
			case V2xmlPackage.RXDCONTENT__RXD19:
				return getRXD19();
			case V2xmlPackage.RXDCONTENT__RXD20:
				return getRXD20();
			case V2xmlPackage.RXDCONTENT__RXD21:
				return getRXD21();
			case V2xmlPackage.RXDCONTENT__RXD22:
				return getRXD22();
			case V2xmlPackage.RXDCONTENT__RXD23:
				return getRXD23();
			case V2xmlPackage.RXDCONTENT__RXD24:
				return getRXD24();
			case V2xmlPackage.RXDCONTENT__RXD25:
				return getRXD25();
			case V2xmlPackage.RXDCONTENT__RXD26:
				return getRXD26();
			case V2xmlPackage.RXDCONTENT__RXD27:
				return getRXD27();
			case V2xmlPackage.RXDCONTENT__RXD28:
				return getRXD28();
			case V2xmlPackage.RXDCONTENT__RXD29:
				return getRXD29();
			case V2xmlPackage.RXDCONTENT__RXD30:
				return getRXD30();
			case V2xmlPackage.RXDCONTENT__RXD31:
				return getRXD31();
			case V2xmlPackage.RXDCONTENT__RXD32:
				return getRXD32();
			case V2xmlPackage.RXDCONTENT__RXD33:
				return getRXD33();
			case V2xmlPackage.RXDCONTENT__ANY:
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
			case V2xmlPackage.RXDCONTENT__RXD1:
				setRXD1((RXD1CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD2:
				setRXD2((RXD2CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD3:
				setRXD3((RXD3CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD4:
				setRXD4((RXD4CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD5:
				setRXD5((RXD5CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD6:
				setRXD6((RXD6CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD7:
				setRXD7((RXD7CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD8:
				setRXD8((RXD8CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD9:
				getRXD9().clear();
				getRXD9().addAll((Collection<? extends RXD9CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD10:
				getRXD10().clear();
				getRXD10().addAll((Collection<? extends RXD10CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD11:
				setRXD11((RXD11CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD12:
				setRXD12((RXD12CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD13:
				setRXD13((RXD13CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD14:
				setRXD14((RXD14CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD15:
				getRXD15().clear();
				getRXD15().addAll((Collection<? extends RXD15CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD16:
				setRXD16((RXD16CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD17:
				setRXD17((RXD17CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD18:
				getRXD18().clear();
				getRXD18().addAll((Collection<? extends RXD18CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD19:
				getRXD19().clear();
				getRXD19().addAll((Collection<? extends RXD19CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD20:
				getRXD20().clear();
				getRXD20().addAll((Collection<? extends RXD20CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD21:
				getRXD21().clear();
				getRXD21().addAll((Collection<? extends RXD21CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD22:
				setRXD22((RXD22CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD23:
				setRXD23((RXD23CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD24:
				setRXD24((RXD24CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD25:
				getRXD25().clear();
				getRXD25().addAll((Collection<? extends RXD25CONTENT>)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD26:
				setRXD26((RXD26CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD27:
				setRXD27((RXD27CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD28:
				setRXD28((RXD28CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD29:
				setRXD29((RXD29CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD30:
				setRXD30((RXD30CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD31:
				setRXD31((RXD31CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD32:
				setRXD32((RXD32CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__RXD33:
				setRXD33((RXD33CONTENT)newValue);
				return;
			case V2xmlPackage.RXDCONTENT__ANY:
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
			case V2xmlPackage.RXDCONTENT__RXD1:
				setRXD1((RXD1CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD2:
				setRXD2((RXD2CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD3:
				setRXD3((RXD3CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD4:
				setRXD4((RXD4CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD5:
				setRXD5((RXD5CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD6:
				setRXD6((RXD6CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD7:
				setRXD7((RXD7CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD8:
				setRXD8((RXD8CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD9:
				getRXD9().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD10:
				getRXD10().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD11:
				setRXD11((RXD11CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD12:
				setRXD12((RXD12CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD13:
				setRXD13((RXD13CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD14:
				setRXD14((RXD14CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD15:
				getRXD15().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD16:
				setRXD16((RXD16CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD17:
				setRXD17((RXD17CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD18:
				getRXD18().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD19:
				getRXD19().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD20:
				getRXD20().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD21:
				getRXD21().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD22:
				setRXD22((RXD22CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD23:
				setRXD23((RXD23CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD24:
				setRXD24((RXD24CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD25:
				getRXD25().clear();
				return;
			case V2xmlPackage.RXDCONTENT__RXD26:
				setRXD26((RXD26CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD27:
				setRXD27((RXD27CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD28:
				setRXD28((RXD28CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD29:
				setRXD29((RXD29CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD30:
				setRXD30((RXD30CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD31:
				setRXD31((RXD31CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD32:
				setRXD32((RXD32CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__RXD33:
				setRXD33((RXD33CONTENT)null);
				return;
			case V2xmlPackage.RXDCONTENT__ANY:
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
			case V2xmlPackage.RXDCONTENT__RXD1:
				return rXD1 != null;
			case V2xmlPackage.RXDCONTENT__RXD2:
				return rXD2 != null;
			case V2xmlPackage.RXDCONTENT__RXD3:
				return rXD3 != null;
			case V2xmlPackage.RXDCONTENT__RXD4:
				return rXD4 != null;
			case V2xmlPackage.RXDCONTENT__RXD5:
				return rXD5 != null;
			case V2xmlPackage.RXDCONTENT__RXD6:
				return rXD6 != null;
			case V2xmlPackage.RXDCONTENT__RXD7:
				return rXD7 != null;
			case V2xmlPackage.RXDCONTENT__RXD8:
				return rXD8 != null;
			case V2xmlPackage.RXDCONTENT__RXD9:
				return rXD9 != null && !rXD9.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD10:
				return rXD10 != null && !rXD10.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD11:
				return rXD11 != null;
			case V2xmlPackage.RXDCONTENT__RXD12:
				return rXD12 != null;
			case V2xmlPackage.RXDCONTENT__RXD13:
				return rXD13 != null;
			case V2xmlPackage.RXDCONTENT__RXD14:
				return rXD14 != null;
			case V2xmlPackage.RXDCONTENT__RXD15:
				return rXD15 != null && !rXD15.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD16:
				return rXD16 != null;
			case V2xmlPackage.RXDCONTENT__RXD17:
				return rXD17 != null;
			case V2xmlPackage.RXDCONTENT__RXD18:
				return rXD18 != null && !rXD18.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD19:
				return rXD19 != null && !rXD19.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD20:
				return rXD20 != null && !rXD20.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD21:
				return rXD21 != null && !rXD21.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD22:
				return rXD22 != null;
			case V2xmlPackage.RXDCONTENT__RXD23:
				return rXD23 != null;
			case V2xmlPackage.RXDCONTENT__RXD24:
				return rXD24 != null;
			case V2xmlPackage.RXDCONTENT__RXD25:
				return rXD25 != null && !rXD25.isEmpty();
			case V2xmlPackage.RXDCONTENT__RXD26:
				return rXD26 != null;
			case V2xmlPackage.RXDCONTENT__RXD27:
				return rXD27 != null;
			case V2xmlPackage.RXDCONTENT__RXD28:
				return rXD28 != null;
			case V2xmlPackage.RXDCONTENT__RXD29:
				return rXD29 != null;
			case V2xmlPackage.RXDCONTENT__RXD30:
				return rXD30 != null;
			case V2xmlPackage.RXDCONTENT__RXD31:
				return rXD31 != null;
			case V2xmlPackage.RXDCONTENT__RXD32:
				return rXD32 != null;
			case V2xmlPackage.RXDCONTENT__RXD33:
				return rXD33 != null;
			case V2xmlPackage.RXDCONTENT__ANY:
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

} //RXDCONTENTImpl
