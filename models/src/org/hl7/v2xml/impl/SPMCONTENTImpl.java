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

import org.hl7.v2xml.SPM10CONTENT;
import org.hl7.v2xml.SPM11CONTENT;
import org.hl7.v2xml.SPM12CONTENT;
import org.hl7.v2xml.SPM13CONTENT;
import org.hl7.v2xml.SPM14CONTENT;
import org.hl7.v2xml.SPM15CONTENT;
import org.hl7.v2xml.SPM16CONTENT;
import org.hl7.v2xml.SPM17CONTENT;
import org.hl7.v2xml.SPM18CONTENT;
import org.hl7.v2xml.SPM19CONTENT;
import org.hl7.v2xml.SPM1CONTENT;
import org.hl7.v2xml.SPM20CONTENT;
import org.hl7.v2xml.SPM21CONTENT;
import org.hl7.v2xml.SPM22CONTENT;
import org.hl7.v2xml.SPM23CONTENT;
import org.hl7.v2xml.SPM24CONTENT;
import org.hl7.v2xml.SPM25CONTENT;
import org.hl7.v2xml.SPM26CONTENT;
import org.hl7.v2xml.SPM27CONTENT;
import org.hl7.v2xml.SPM28CONTENT;
import org.hl7.v2xml.SPM29CONTENT;
import org.hl7.v2xml.SPM2CONTENT;
import org.hl7.v2xml.SPM3CONTENT;
import org.hl7.v2xml.SPM4CONTENT;
import org.hl7.v2xml.SPM5CONTENT;
import org.hl7.v2xml.SPM6CONTENT;
import org.hl7.v2xml.SPM7CONTENT;
import org.hl7.v2xml.SPM8CONTENT;
import org.hl7.v2xml.SPM9CONTENT;
import org.hl7.v2xml.SPMCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPMCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM1 <em>SPM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM2 <em>SPM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM3 <em>SPM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM4 <em>SPM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM5 <em>SPM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM6 <em>SPM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM7 <em>SPM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM8 <em>SPM8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM9 <em>SPM9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM10 <em>SPM10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM11 <em>SPM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM12 <em>SPM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM13 <em>SPM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM14 <em>SPM14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM15 <em>SPM15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM16 <em>SPM16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM17 <em>SPM17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM18 <em>SPM18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM19 <em>SPM19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM20 <em>SPM20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM21 <em>SPM21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM22 <em>SPM22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM23 <em>SPM23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM24 <em>SPM24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM25 <em>SPM25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM26 <em>SPM26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM27 <em>SPM27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM28 <em>SPM28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getSPM29 <em>SPM29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SPMCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SPMCONTENTImpl extends EObjectImpl implements SPMCONTENT {
	/**
	 * The cached value of the '{@link #getSPM1() <em>SPM1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM1()
	 * @generated
	 * @ordered
	 */
	protected SPM1CONTENT sPM1;

	/**
	 * The cached value of the '{@link #getSPM2() <em>SPM2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM2()
	 * @generated
	 * @ordered
	 */
	protected SPM2CONTENT sPM2;

	/**
	 * The cached value of the '{@link #getSPM3() <em>SPM3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM3()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM3CONTENT> sPM3;

	/**
	 * The cached value of the '{@link #getSPM4() <em>SPM4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM4()
	 * @generated
	 * @ordered
	 */
	protected SPM4CONTENT sPM4;

	/**
	 * The cached value of the '{@link #getSPM5() <em>SPM5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM5()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM5CONTENT> sPM5;

	/**
	 * The cached value of the '{@link #getSPM6() <em>SPM6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM6()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM6CONTENT> sPM6;

	/**
	 * The cached value of the '{@link #getSPM7() <em>SPM7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM7()
	 * @generated
	 * @ordered
	 */
	protected SPM7CONTENT sPM7;

	/**
	 * The cached value of the '{@link #getSPM8() <em>SPM8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM8()
	 * @generated
	 * @ordered
	 */
	protected SPM8CONTENT sPM8;

	/**
	 * The cached value of the '{@link #getSPM9() <em>SPM9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM9()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM9CONTENT> sPM9;

	/**
	 * The cached value of the '{@link #getSPM10() <em>SPM10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM10()
	 * @generated
	 * @ordered
	 */
	protected SPM10CONTENT sPM10;

	/**
	 * The cached value of the '{@link #getSPM11() <em>SPM11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM11()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM11CONTENT> sPM11;

	/**
	 * The cached value of the '{@link #getSPM12() <em>SPM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM12()
	 * @generated
	 * @ordered
	 */
	protected SPM12CONTENT sPM12;

	/**
	 * The cached value of the '{@link #getSPM13() <em>SPM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM13()
	 * @generated
	 * @ordered
	 */
	protected SPM13CONTENT sPM13;

	/**
	 * The cached value of the '{@link #getSPM14() <em>SPM14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM14()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM14CONTENT> sPM14;

	/**
	 * The cached value of the '{@link #getSPM15() <em>SPM15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM15()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM15CONTENT> sPM15;

	/**
	 * The cached value of the '{@link #getSPM16() <em>SPM16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM16()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM16CONTENT> sPM16;

	/**
	 * The cached value of the '{@link #getSPM17() <em>SPM17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM17()
	 * @generated
	 * @ordered
	 */
	protected SPM17CONTENT sPM17;

	/**
	 * The cached value of the '{@link #getSPM18() <em>SPM18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM18()
	 * @generated
	 * @ordered
	 */
	protected SPM18CONTENT sPM18;

	/**
	 * The cached value of the '{@link #getSPM19() <em>SPM19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM19()
	 * @generated
	 * @ordered
	 */
	protected SPM19CONTENT sPM19;

	/**
	 * The cached value of the '{@link #getSPM20() <em>SPM20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM20()
	 * @generated
	 * @ordered
	 */
	protected SPM20CONTENT sPM20;

	/**
	 * The cached value of the '{@link #getSPM21() <em>SPM21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM21()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM21CONTENT> sPM21;

	/**
	 * The cached value of the '{@link #getSPM22() <em>SPM22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM22()
	 * @generated
	 * @ordered
	 */
	protected SPM22CONTENT sPM22;

	/**
	 * The cached value of the '{@link #getSPM23() <em>SPM23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM23()
	 * @generated
	 * @ordered
	 */
	protected SPM23CONTENT sPM23;

	/**
	 * The cached value of the '{@link #getSPM24() <em>SPM24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM24()
	 * @generated
	 * @ordered
	 */
	protected EList<SPM24CONTENT> sPM24;

	/**
	 * The cached value of the '{@link #getSPM25() <em>SPM25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM25()
	 * @generated
	 * @ordered
	 */
	protected SPM25CONTENT sPM25;

	/**
	 * The cached value of the '{@link #getSPM26() <em>SPM26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM26()
	 * @generated
	 * @ordered
	 */
	protected SPM26CONTENT sPM26;

	/**
	 * The cached value of the '{@link #getSPM27() <em>SPM27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM27()
	 * @generated
	 * @ordered
	 */
	protected SPM27CONTENT sPM27;

	/**
	 * The cached value of the '{@link #getSPM28() <em>SPM28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM28()
	 * @generated
	 * @ordered
	 */
	protected SPM28CONTENT sPM28;

	/**
	 * The cached value of the '{@link #getSPM29() <em>SPM29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPM29()
	 * @generated
	 * @ordered
	 */
	protected SPM29CONTENT sPM29;

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
	protected SPMCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSPMCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM1CONTENT getSPM1() {
		return sPM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM1(SPM1CONTENT newSPM1, NotificationChain msgs) {
		SPM1CONTENT oldSPM1 = sPM1;
		sPM1 = newSPM1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM1, oldSPM1, newSPM1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM1(SPM1CONTENT newSPM1) {
		if (newSPM1 != sPM1) {
			NotificationChain msgs = null;
			if (sPM1 != null)
				msgs = ((InternalEObject)sPM1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM1, null, msgs);
			if (newSPM1 != null)
				msgs = ((InternalEObject)newSPM1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM1, null, msgs);
			msgs = basicSetSPM1(newSPM1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM1, newSPM1, newSPM1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM2CONTENT getSPM2() {
		return sPM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM2(SPM2CONTENT newSPM2, NotificationChain msgs) {
		SPM2CONTENT oldSPM2 = sPM2;
		sPM2 = newSPM2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM2, oldSPM2, newSPM2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM2(SPM2CONTENT newSPM2) {
		if (newSPM2 != sPM2) {
			NotificationChain msgs = null;
			if (sPM2 != null)
				msgs = ((InternalEObject)sPM2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM2, null, msgs);
			if (newSPM2 != null)
				msgs = ((InternalEObject)newSPM2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM2, null, msgs);
			msgs = basicSetSPM2(newSPM2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM2, newSPM2, newSPM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM3CONTENT> getSPM3() {
		if (sPM3 == null) {
			sPM3 = new EObjectContainmentEList<SPM3CONTENT>(SPM3CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM3);
		}
		return sPM3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM4CONTENT getSPM4() {
		return sPM4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM4(SPM4CONTENT newSPM4, NotificationChain msgs) {
		SPM4CONTENT oldSPM4 = sPM4;
		sPM4 = newSPM4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM4, oldSPM4, newSPM4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM4(SPM4CONTENT newSPM4) {
		if (newSPM4 != sPM4) {
			NotificationChain msgs = null;
			if (sPM4 != null)
				msgs = ((InternalEObject)sPM4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM4, null, msgs);
			if (newSPM4 != null)
				msgs = ((InternalEObject)newSPM4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM4, null, msgs);
			msgs = basicSetSPM4(newSPM4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM4, newSPM4, newSPM4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM5CONTENT> getSPM5() {
		if (sPM5 == null) {
			sPM5 = new EObjectContainmentEList<SPM5CONTENT>(SPM5CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM5);
		}
		return sPM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM6CONTENT> getSPM6() {
		if (sPM6 == null) {
			sPM6 = new EObjectContainmentEList<SPM6CONTENT>(SPM6CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM6);
		}
		return sPM6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM7CONTENT getSPM7() {
		return sPM7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM7(SPM7CONTENT newSPM7, NotificationChain msgs) {
		SPM7CONTENT oldSPM7 = sPM7;
		sPM7 = newSPM7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM7, oldSPM7, newSPM7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM7(SPM7CONTENT newSPM7) {
		if (newSPM7 != sPM7) {
			NotificationChain msgs = null;
			if (sPM7 != null)
				msgs = ((InternalEObject)sPM7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM7, null, msgs);
			if (newSPM7 != null)
				msgs = ((InternalEObject)newSPM7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM7, null, msgs);
			msgs = basicSetSPM7(newSPM7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM7, newSPM7, newSPM7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM8CONTENT getSPM8() {
		return sPM8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM8(SPM8CONTENT newSPM8, NotificationChain msgs) {
		SPM8CONTENT oldSPM8 = sPM8;
		sPM8 = newSPM8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM8, oldSPM8, newSPM8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM8(SPM8CONTENT newSPM8) {
		if (newSPM8 != sPM8) {
			NotificationChain msgs = null;
			if (sPM8 != null)
				msgs = ((InternalEObject)sPM8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM8, null, msgs);
			if (newSPM8 != null)
				msgs = ((InternalEObject)newSPM8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM8, null, msgs);
			msgs = basicSetSPM8(newSPM8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM8, newSPM8, newSPM8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM9CONTENT> getSPM9() {
		if (sPM9 == null) {
			sPM9 = new EObjectContainmentEList<SPM9CONTENT>(SPM9CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM9);
		}
		return sPM9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM10CONTENT getSPM10() {
		return sPM10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM10(SPM10CONTENT newSPM10, NotificationChain msgs) {
		SPM10CONTENT oldSPM10 = sPM10;
		sPM10 = newSPM10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM10, oldSPM10, newSPM10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM10(SPM10CONTENT newSPM10) {
		if (newSPM10 != sPM10) {
			NotificationChain msgs = null;
			if (sPM10 != null)
				msgs = ((InternalEObject)sPM10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM10, null, msgs);
			if (newSPM10 != null)
				msgs = ((InternalEObject)newSPM10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM10, null, msgs);
			msgs = basicSetSPM10(newSPM10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM10, newSPM10, newSPM10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM11CONTENT> getSPM11() {
		if (sPM11 == null) {
			sPM11 = new EObjectContainmentEList<SPM11CONTENT>(SPM11CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM11);
		}
		return sPM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM12CONTENT getSPM12() {
		return sPM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM12(SPM12CONTENT newSPM12, NotificationChain msgs) {
		SPM12CONTENT oldSPM12 = sPM12;
		sPM12 = newSPM12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM12, oldSPM12, newSPM12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM12(SPM12CONTENT newSPM12) {
		if (newSPM12 != sPM12) {
			NotificationChain msgs = null;
			if (sPM12 != null)
				msgs = ((InternalEObject)sPM12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM12, null, msgs);
			if (newSPM12 != null)
				msgs = ((InternalEObject)newSPM12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM12, null, msgs);
			msgs = basicSetSPM12(newSPM12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM12, newSPM12, newSPM12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM13CONTENT getSPM13() {
		return sPM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM13(SPM13CONTENT newSPM13, NotificationChain msgs) {
		SPM13CONTENT oldSPM13 = sPM13;
		sPM13 = newSPM13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM13, oldSPM13, newSPM13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM13(SPM13CONTENT newSPM13) {
		if (newSPM13 != sPM13) {
			NotificationChain msgs = null;
			if (sPM13 != null)
				msgs = ((InternalEObject)sPM13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM13, null, msgs);
			if (newSPM13 != null)
				msgs = ((InternalEObject)newSPM13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM13, null, msgs);
			msgs = basicSetSPM13(newSPM13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM13, newSPM13, newSPM13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM14CONTENT> getSPM14() {
		if (sPM14 == null) {
			sPM14 = new EObjectContainmentEList<SPM14CONTENT>(SPM14CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM14);
		}
		return sPM14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM15CONTENT> getSPM15() {
		if (sPM15 == null) {
			sPM15 = new EObjectContainmentEList<SPM15CONTENT>(SPM15CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM15);
		}
		return sPM15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM16CONTENT> getSPM16() {
		if (sPM16 == null) {
			sPM16 = new EObjectContainmentEList<SPM16CONTENT>(SPM16CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM16);
		}
		return sPM16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM17CONTENT getSPM17() {
		return sPM17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM17(SPM17CONTENT newSPM17, NotificationChain msgs) {
		SPM17CONTENT oldSPM17 = sPM17;
		sPM17 = newSPM17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM17, oldSPM17, newSPM17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM17(SPM17CONTENT newSPM17) {
		if (newSPM17 != sPM17) {
			NotificationChain msgs = null;
			if (sPM17 != null)
				msgs = ((InternalEObject)sPM17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM17, null, msgs);
			if (newSPM17 != null)
				msgs = ((InternalEObject)newSPM17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM17, null, msgs);
			msgs = basicSetSPM17(newSPM17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM17, newSPM17, newSPM17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM18CONTENT getSPM18() {
		return sPM18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM18(SPM18CONTENT newSPM18, NotificationChain msgs) {
		SPM18CONTENT oldSPM18 = sPM18;
		sPM18 = newSPM18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM18, oldSPM18, newSPM18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM18(SPM18CONTENT newSPM18) {
		if (newSPM18 != sPM18) {
			NotificationChain msgs = null;
			if (sPM18 != null)
				msgs = ((InternalEObject)sPM18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM18, null, msgs);
			if (newSPM18 != null)
				msgs = ((InternalEObject)newSPM18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM18, null, msgs);
			msgs = basicSetSPM18(newSPM18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM18, newSPM18, newSPM18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM19CONTENT getSPM19() {
		return sPM19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM19(SPM19CONTENT newSPM19, NotificationChain msgs) {
		SPM19CONTENT oldSPM19 = sPM19;
		sPM19 = newSPM19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM19, oldSPM19, newSPM19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM19(SPM19CONTENT newSPM19) {
		if (newSPM19 != sPM19) {
			NotificationChain msgs = null;
			if (sPM19 != null)
				msgs = ((InternalEObject)sPM19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM19, null, msgs);
			if (newSPM19 != null)
				msgs = ((InternalEObject)newSPM19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM19, null, msgs);
			msgs = basicSetSPM19(newSPM19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM19, newSPM19, newSPM19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM20CONTENT getSPM20() {
		return sPM20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM20(SPM20CONTENT newSPM20, NotificationChain msgs) {
		SPM20CONTENT oldSPM20 = sPM20;
		sPM20 = newSPM20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM20, oldSPM20, newSPM20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM20(SPM20CONTENT newSPM20) {
		if (newSPM20 != sPM20) {
			NotificationChain msgs = null;
			if (sPM20 != null)
				msgs = ((InternalEObject)sPM20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM20, null, msgs);
			if (newSPM20 != null)
				msgs = ((InternalEObject)newSPM20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM20, null, msgs);
			msgs = basicSetSPM20(newSPM20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM20, newSPM20, newSPM20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM21CONTENT> getSPM21() {
		if (sPM21 == null) {
			sPM21 = new EObjectContainmentEList<SPM21CONTENT>(SPM21CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM21);
		}
		return sPM21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM22CONTENT getSPM22() {
		return sPM22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM22(SPM22CONTENT newSPM22, NotificationChain msgs) {
		SPM22CONTENT oldSPM22 = sPM22;
		sPM22 = newSPM22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM22, oldSPM22, newSPM22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM22(SPM22CONTENT newSPM22) {
		if (newSPM22 != sPM22) {
			NotificationChain msgs = null;
			if (sPM22 != null)
				msgs = ((InternalEObject)sPM22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM22, null, msgs);
			if (newSPM22 != null)
				msgs = ((InternalEObject)newSPM22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM22, null, msgs);
			msgs = basicSetSPM22(newSPM22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM22, newSPM22, newSPM22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM23CONTENT getSPM23() {
		return sPM23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM23(SPM23CONTENT newSPM23, NotificationChain msgs) {
		SPM23CONTENT oldSPM23 = sPM23;
		sPM23 = newSPM23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM23, oldSPM23, newSPM23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM23(SPM23CONTENT newSPM23) {
		if (newSPM23 != sPM23) {
			NotificationChain msgs = null;
			if (sPM23 != null)
				msgs = ((InternalEObject)sPM23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM23, null, msgs);
			if (newSPM23 != null)
				msgs = ((InternalEObject)newSPM23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM23, null, msgs);
			msgs = basicSetSPM23(newSPM23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM23, newSPM23, newSPM23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SPM24CONTENT> getSPM24() {
		if (sPM24 == null) {
			sPM24 = new EObjectContainmentEList<SPM24CONTENT>(SPM24CONTENT.class, this, V2xmlPackage.SPMCONTENT__SPM24);
		}
		return sPM24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM25CONTENT getSPM25() {
		return sPM25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM25(SPM25CONTENT newSPM25, NotificationChain msgs) {
		SPM25CONTENT oldSPM25 = sPM25;
		sPM25 = newSPM25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM25, oldSPM25, newSPM25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM25(SPM25CONTENT newSPM25) {
		if (newSPM25 != sPM25) {
			NotificationChain msgs = null;
			if (sPM25 != null)
				msgs = ((InternalEObject)sPM25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM25, null, msgs);
			if (newSPM25 != null)
				msgs = ((InternalEObject)newSPM25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM25, null, msgs);
			msgs = basicSetSPM25(newSPM25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM25, newSPM25, newSPM25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM26CONTENT getSPM26() {
		return sPM26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM26(SPM26CONTENT newSPM26, NotificationChain msgs) {
		SPM26CONTENT oldSPM26 = sPM26;
		sPM26 = newSPM26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM26, oldSPM26, newSPM26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM26(SPM26CONTENT newSPM26) {
		if (newSPM26 != sPM26) {
			NotificationChain msgs = null;
			if (sPM26 != null)
				msgs = ((InternalEObject)sPM26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM26, null, msgs);
			if (newSPM26 != null)
				msgs = ((InternalEObject)newSPM26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM26, null, msgs);
			msgs = basicSetSPM26(newSPM26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM26, newSPM26, newSPM26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM27CONTENT getSPM27() {
		return sPM27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM27(SPM27CONTENT newSPM27, NotificationChain msgs) {
		SPM27CONTENT oldSPM27 = sPM27;
		sPM27 = newSPM27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM27, oldSPM27, newSPM27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM27(SPM27CONTENT newSPM27) {
		if (newSPM27 != sPM27) {
			NotificationChain msgs = null;
			if (sPM27 != null)
				msgs = ((InternalEObject)sPM27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM27, null, msgs);
			if (newSPM27 != null)
				msgs = ((InternalEObject)newSPM27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM27, null, msgs);
			msgs = basicSetSPM27(newSPM27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM27, newSPM27, newSPM27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM28CONTENT getSPM28() {
		return sPM28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM28(SPM28CONTENT newSPM28, NotificationChain msgs) {
		SPM28CONTENT oldSPM28 = sPM28;
		sPM28 = newSPM28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM28, oldSPM28, newSPM28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM28(SPM28CONTENT newSPM28) {
		if (newSPM28 != sPM28) {
			NotificationChain msgs = null;
			if (sPM28 != null)
				msgs = ((InternalEObject)sPM28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM28, null, msgs);
			if (newSPM28 != null)
				msgs = ((InternalEObject)newSPM28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM28, null, msgs);
			msgs = basicSetSPM28(newSPM28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM28, newSPM28, newSPM28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPM29CONTENT getSPM29() {
		return sPM29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPM29(SPM29CONTENT newSPM29, NotificationChain msgs) {
		SPM29CONTENT oldSPM29 = sPM29;
		sPM29 = newSPM29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM29, oldSPM29, newSPM29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPM29(SPM29CONTENT newSPM29) {
		if (newSPM29 != sPM29) {
			NotificationChain msgs = null;
			if (sPM29 != null)
				msgs = ((InternalEObject)sPM29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM29, null, msgs);
			if (newSPM29 != null)
				msgs = ((InternalEObject)newSPM29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SPMCONTENT__SPM29, null, msgs);
			msgs = basicSetSPM29(newSPM29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SPMCONTENT__SPM29, newSPM29, newSPM29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SPMCONTENT__ANY);
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
			case V2xmlPackage.SPMCONTENT__SPM1:
				return basicSetSPM1(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM2:
				return basicSetSPM2(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM3:
				return ((InternalEList<?>)getSPM3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM4:
				return basicSetSPM4(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM5:
				return ((InternalEList<?>)getSPM5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM6:
				return ((InternalEList<?>)getSPM6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM7:
				return basicSetSPM7(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM8:
				return basicSetSPM8(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM9:
				return ((InternalEList<?>)getSPM9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM10:
				return basicSetSPM10(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM11:
				return ((InternalEList<?>)getSPM11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM12:
				return basicSetSPM12(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM13:
				return basicSetSPM13(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM14:
				return ((InternalEList<?>)getSPM14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM15:
				return ((InternalEList<?>)getSPM15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM16:
				return ((InternalEList<?>)getSPM16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM17:
				return basicSetSPM17(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM18:
				return basicSetSPM18(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM19:
				return basicSetSPM19(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM20:
				return basicSetSPM20(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM21:
				return ((InternalEList<?>)getSPM21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM22:
				return basicSetSPM22(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM23:
				return basicSetSPM23(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM24:
				return ((InternalEList<?>)getSPM24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SPMCONTENT__SPM25:
				return basicSetSPM25(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM26:
				return basicSetSPM26(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM27:
				return basicSetSPM27(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM28:
				return basicSetSPM28(null, msgs);
			case V2xmlPackage.SPMCONTENT__SPM29:
				return basicSetSPM29(null, msgs);
			case V2xmlPackage.SPMCONTENT__ANY:
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
			case V2xmlPackage.SPMCONTENT__SPM1:
				return getSPM1();
			case V2xmlPackage.SPMCONTENT__SPM2:
				return getSPM2();
			case V2xmlPackage.SPMCONTENT__SPM3:
				return getSPM3();
			case V2xmlPackage.SPMCONTENT__SPM4:
				return getSPM4();
			case V2xmlPackage.SPMCONTENT__SPM5:
				return getSPM5();
			case V2xmlPackage.SPMCONTENT__SPM6:
				return getSPM6();
			case V2xmlPackage.SPMCONTENT__SPM7:
				return getSPM7();
			case V2xmlPackage.SPMCONTENT__SPM8:
				return getSPM8();
			case V2xmlPackage.SPMCONTENT__SPM9:
				return getSPM9();
			case V2xmlPackage.SPMCONTENT__SPM10:
				return getSPM10();
			case V2xmlPackage.SPMCONTENT__SPM11:
				return getSPM11();
			case V2xmlPackage.SPMCONTENT__SPM12:
				return getSPM12();
			case V2xmlPackage.SPMCONTENT__SPM13:
				return getSPM13();
			case V2xmlPackage.SPMCONTENT__SPM14:
				return getSPM14();
			case V2xmlPackage.SPMCONTENT__SPM15:
				return getSPM15();
			case V2xmlPackage.SPMCONTENT__SPM16:
				return getSPM16();
			case V2xmlPackage.SPMCONTENT__SPM17:
				return getSPM17();
			case V2xmlPackage.SPMCONTENT__SPM18:
				return getSPM18();
			case V2xmlPackage.SPMCONTENT__SPM19:
				return getSPM19();
			case V2xmlPackage.SPMCONTENT__SPM20:
				return getSPM20();
			case V2xmlPackage.SPMCONTENT__SPM21:
				return getSPM21();
			case V2xmlPackage.SPMCONTENT__SPM22:
				return getSPM22();
			case V2xmlPackage.SPMCONTENT__SPM23:
				return getSPM23();
			case V2xmlPackage.SPMCONTENT__SPM24:
				return getSPM24();
			case V2xmlPackage.SPMCONTENT__SPM25:
				return getSPM25();
			case V2xmlPackage.SPMCONTENT__SPM26:
				return getSPM26();
			case V2xmlPackage.SPMCONTENT__SPM27:
				return getSPM27();
			case V2xmlPackage.SPMCONTENT__SPM28:
				return getSPM28();
			case V2xmlPackage.SPMCONTENT__SPM29:
				return getSPM29();
			case V2xmlPackage.SPMCONTENT__ANY:
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
			case V2xmlPackage.SPMCONTENT__SPM1:
				setSPM1((SPM1CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM2:
				setSPM2((SPM2CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM3:
				getSPM3().clear();
				getSPM3().addAll((Collection<? extends SPM3CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM4:
				setSPM4((SPM4CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM5:
				getSPM5().clear();
				getSPM5().addAll((Collection<? extends SPM5CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM6:
				getSPM6().clear();
				getSPM6().addAll((Collection<? extends SPM6CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM7:
				setSPM7((SPM7CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM8:
				setSPM8((SPM8CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM9:
				getSPM9().clear();
				getSPM9().addAll((Collection<? extends SPM9CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM10:
				setSPM10((SPM10CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM11:
				getSPM11().clear();
				getSPM11().addAll((Collection<? extends SPM11CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM12:
				setSPM12((SPM12CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM13:
				setSPM13((SPM13CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM14:
				getSPM14().clear();
				getSPM14().addAll((Collection<? extends SPM14CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM15:
				getSPM15().clear();
				getSPM15().addAll((Collection<? extends SPM15CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM16:
				getSPM16().clear();
				getSPM16().addAll((Collection<? extends SPM16CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM17:
				setSPM17((SPM17CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM18:
				setSPM18((SPM18CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM19:
				setSPM19((SPM19CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM20:
				setSPM20((SPM20CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM21:
				getSPM21().clear();
				getSPM21().addAll((Collection<? extends SPM21CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM22:
				setSPM22((SPM22CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM23:
				setSPM23((SPM23CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM24:
				getSPM24().clear();
				getSPM24().addAll((Collection<? extends SPM24CONTENT>)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM25:
				setSPM25((SPM25CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM26:
				setSPM26((SPM26CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM27:
				setSPM27((SPM27CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM28:
				setSPM28((SPM28CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__SPM29:
				setSPM29((SPM29CONTENT)newValue);
				return;
			case V2xmlPackage.SPMCONTENT__ANY:
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
			case V2xmlPackage.SPMCONTENT__SPM1:
				setSPM1((SPM1CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM2:
				setSPM2((SPM2CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM3:
				getSPM3().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM4:
				setSPM4((SPM4CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM5:
				getSPM5().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM6:
				getSPM6().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM7:
				setSPM7((SPM7CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM8:
				setSPM8((SPM8CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM9:
				getSPM9().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM10:
				setSPM10((SPM10CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM11:
				getSPM11().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM12:
				setSPM12((SPM12CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM13:
				setSPM13((SPM13CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM14:
				getSPM14().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM15:
				getSPM15().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM16:
				getSPM16().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM17:
				setSPM17((SPM17CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM18:
				setSPM18((SPM18CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM19:
				setSPM19((SPM19CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM20:
				setSPM20((SPM20CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM21:
				getSPM21().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM22:
				setSPM22((SPM22CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM23:
				setSPM23((SPM23CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM24:
				getSPM24().clear();
				return;
			case V2xmlPackage.SPMCONTENT__SPM25:
				setSPM25((SPM25CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM26:
				setSPM26((SPM26CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM27:
				setSPM27((SPM27CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM28:
				setSPM28((SPM28CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__SPM29:
				setSPM29((SPM29CONTENT)null);
				return;
			case V2xmlPackage.SPMCONTENT__ANY:
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
			case V2xmlPackage.SPMCONTENT__SPM1:
				return sPM1 != null;
			case V2xmlPackage.SPMCONTENT__SPM2:
				return sPM2 != null;
			case V2xmlPackage.SPMCONTENT__SPM3:
				return sPM3 != null && !sPM3.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM4:
				return sPM4 != null;
			case V2xmlPackage.SPMCONTENT__SPM5:
				return sPM5 != null && !sPM5.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM6:
				return sPM6 != null && !sPM6.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM7:
				return sPM7 != null;
			case V2xmlPackage.SPMCONTENT__SPM8:
				return sPM8 != null;
			case V2xmlPackage.SPMCONTENT__SPM9:
				return sPM9 != null && !sPM9.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM10:
				return sPM10 != null;
			case V2xmlPackage.SPMCONTENT__SPM11:
				return sPM11 != null && !sPM11.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM12:
				return sPM12 != null;
			case V2xmlPackage.SPMCONTENT__SPM13:
				return sPM13 != null;
			case V2xmlPackage.SPMCONTENT__SPM14:
				return sPM14 != null && !sPM14.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM15:
				return sPM15 != null && !sPM15.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM16:
				return sPM16 != null && !sPM16.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM17:
				return sPM17 != null;
			case V2xmlPackage.SPMCONTENT__SPM18:
				return sPM18 != null;
			case V2xmlPackage.SPMCONTENT__SPM19:
				return sPM19 != null;
			case V2xmlPackage.SPMCONTENT__SPM20:
				return sPM20 != null;
			case V2xmlPackage.SPMCONTENT__SPM21:
				return sPM21 != null && !sPM21.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM22:
				return sPM22 != null;
			case V2xmlPackage.SPMCONTENT__SPM23:
				return sPM23 != null;
			case V2xmlPackage.SPMCONTENT__SPM24:
				return sPM24 != null && !sPM24.isEmpty();
			case V2xmlPackage.SPMCONTENT__SPM25:
				return sPM25 != null;
			case V2xmlPackage.SPMCONTENT__SPM26:
				return sPM26 != null;
			case V2xmlPackage.SPMCONTENT__SPM27:
				return sPM27 != null;
			case V2xmlPackage.SPMCONTENT__SPM28:
				return sPM28 != null;
			case V2xmlPackage.SPMCONTENT__SPM29:
				return sPM29 != null;
			case V2xmlPackage.SPMCONTENT__ANY:
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

} //SPMCONTENTImpl
