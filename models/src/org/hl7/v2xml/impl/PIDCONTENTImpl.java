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

import org.hl7.v2xml.PID10CONTENT;
import org.hl7.v2xml.PID11CONTENT;
import org.hl7.v2xml.PID12CONTENT;
import org.hl7.v2xml.PID13CONTENT;
import org.hl7.v2xml.PID14CONTENT;
import org.hl7.v2xml.PID15CONTENT;
import org.hl7.v2xml.PID16CONTENT;
import org.hl7.v2xml.PID17CONTENT;
import org.hl7.v2xml.PID18CONTENT;
import org.hl7.v2xml.PID19CONTENT;
import org.hl7.v2xml.PID1CONTENT;
import org.hl7.v2xml.PID20CONTENT;
import org.hl7.v2xml.PID21CONTENT;
import org.hl7.v2xml.PID22CONTENT;
import org.hl7.v2xml.PID23CONTENT;
import org.hl7.v2xml.PID24CONTENT;
import org.hl7.v2xml.PID25CONTENT;
import org.hl7.v2xml.PID26CONTENT;
import org.hl7.v2xml.PID27CONTENT;
import org.hl7.v2xml.PID28CONTENT;
import org.hl7.v2xml.PID29CONTENT;
import org.hl7.v2xml.PID2CONTENT;
import org.hl7.v2xml.PID30CONTENT;
import org.hl7.v2xml.PID31CONTENT;
import org.hl7.v2xml.PID32CONTENT;
import org.hl7.v2xml.PID33CONTENT;
import org.hl7.v2xml.PID34CONTENT;
import org.hl7.v2xml.PID35CONTENT;
import org.hl7.v2xml.PID36CONTENT;
import org.hl7.v2xml.PID37CONTENT;
import org.hl7.v2xml.PID38CONTENT;
import org.hl7.v2xml.PID39CONTENT;
import org.hl7.v2xml.PID3CONTENT;
import org.hl7.v2xml.PID4CONTENT;
import org.hl7.v2xml.PID5CONTENT;
import org.hl7.v2xml.PID6CONTENT;
import org.hl7.v2xml.PID7CONTENT;
import org.hl7.v2xml.PID8CONTENT;
import org.hl7.v2xml.PID9CONTENT;
import org.hl7.v2xml.PIDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PIDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID1 <em>PID1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID2 <em>PID2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID3 <em>PID3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID4 <em>PID4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID5 <em>PID5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID6 <em>PID6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID7 <em>PID7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID8 <em>PID8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID9 <em>PID9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID10 <em>PID10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID11 <em>PID11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID12 <em>PID12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID13 <em>PID13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID14 <em>PID14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID15 <em>PID15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID16 <em>PID16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID17 <em>PID17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID18 <em>PID18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID19 <em>PID19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID20 <em>PID20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID21 <em>PID21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID22 <em>PID22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID23 <em>PID23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID24 <em>PID24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID25 <em>PID25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID26 <em>PID26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID27 <em>PID27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID28 <em>PID28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID29 <em>PID29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID30 <em>PID30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID31 <em>PID31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID32 <em>PID32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID33 <em>PID33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID34 <em>PID34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID35 <em>PID35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID36 <em>PID36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID37 <em>PID37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID38 <em>PID38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getPID39 <em>PID39</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PIDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PIDCONTENTImpl extends EObjectImpl implements PIDCONTENT {
	/**
	 * The cached value of the '{@link #getPID1() <em>PID1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID1()
	 * @generated
	 * @ordered
	 */
	protected PID1CONTENT pID1;

	/**
	 * The cached value of the '{@link #getPID2() <em>PID2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID2()
	 * @generated
	 * @ordered
	 */
	protected PID2CONTENT pID2;

	/**
	 * The cached value of the '{@link #getPID3() <em>PID3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID3()
	 * @generated
	 * @ordered
	 */
	protected EList<PID3CONTENT> pID3;

	/**
	 * The cached value of the '{@link #getPID4() <em>PID4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID4()
	 * @generated
	 * @ordered
	 */
	protected EList<PID4CONTENT> pID4;

	/**
	 * The cached value of the '{@link #getPID5() <em>PID5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID5()
	 * @generated
	 * @ordered
	 */
	protected EList<PID5CONTENT> pID5;

	/**
	 * The cached value of the '{@link #getPID6() <em>PID6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID6()
	 * @generated
	 * @ordered
	 */
	protected EList<PID6CONTENT> pID6;

	/**
	 * The cached value of the '{@link #getPID7() <em>PID7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID7()
	 * @generated
	 * @ordered
	 */
	protected PID7CONTENT pID7;

	/**
	 * The cached value of the '{@link #getPID8() <em>PID8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID8()
	 * @generated
	 * @ordered
	 */
	protected PID8CONTENT pID8;

	/**
	 * The cached value of the '{@link #getPID9() <em>PID9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID9()
	 * @generated
	 * @ordered
	 */
	protected EList<PID9CONTENT> pID9;

	/**
	 * The cached value of the '{@link #getPID10() <em>PID10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID10()
	 * @generated
	 * @ordered
	 */
	protected EList<PID10CONTENT> pID10;

	/**
	 * The cached value of the '{@link #getPID11() <em>PID11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID11()
	 * @generated
	 * @ordered
	 */
	protected EList<PID11CONTENT> pID11;

	/**
	 * The cached value of the '{@link #getPID12() <em>PID12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID12()
	 * @generated
	 * @ordered
	 */
	protected PID12CONTENT pID12;

	/**
	 * The cached value of the '{@link #getPID13() <em>PID13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID13()
	 * @generated
	 * @ordered
	 */
	protected EList<PID13CONTENT> pID13;

	/**
	 * The cached value of the '{@link #getPID14() <em>PID14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID14()
	 * @generated
	 * @ordered
	 */
	protected EList<PID14CONTENT> pID14;

	/**
	 * The cached value of the '{@link #getPID15() <em>PID15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID15()
	 * @generated
	 * @ordered
	 */
	protected PID15CONTENT pID15;

	/**
	 * The cached value of the '{@link #getPID16() <em>PID16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID16()
	 * @generated
	 * @ordered
	 */
	protected PID16CONTENT pID16;

	/**
	 * The cached value of the '{@link #getPID17() <em>PID17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID17()
	 * @generated
	 * @ordered
	 */
	protected PID17CONTENT pID17;

	/**
	 * The cached value of the '{@link #getPID18() <em>PID18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID18()
	 * @generated
	 * @ordered
	 */
	protected PID18CONTENT pID18;

	/**
	 * The cached value of the '{@link #getPID19() <em>PID19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID19()
	 * @generated
	 * @ordered
	 */
	protected PID19CONTENT pID19;

	/**
	 * The cached value of the '{@link #getPID20() <em>PID20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID20()
	 * @generated
	 * @ordered
	 */
	protected PID20CONTENT pID20;

	/**
	 * The cached value of the '{@link #getPID21() <em>PID21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID21()
	 * @generated
	 * @ordered
	 */
	protected EList<PID21CONTENT> pID21;

	/**
	 * The cached value of the '{@link #getPID22() <em>PID22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID22()
	 * @generated
	 * @ordered
	 */
	protected EList<PID22CONTENT> pID22;

	/**
	 * The cached value of the '{@link #getPID23() <em>PID23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID23()
	 * @generated
	 * @ordered
	 */
	protected PID23CONTENT pID23;

	/**
	 * The cached value of the '{@link #getPID24() <em>PID24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID24()
	 * @generated
	 * @ordered
	 */
	protected PID24CONTENT pID24;

	/**
	 * The cached value of the '{@link #getPID25() <em>PID25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID25()
	 * @generated
	 * @ordered
	 */
	protected PID25CONTENT pID25;

	/**
	 * The cached value of the '{@link #getPID26() <em>PID26</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID26()
	 * @generated
	 * @ordered
	 */
	protected EList<PID26CONTENT> pID26;

	/**
	 * The cached value of the '{@link #getPID27() <em>PID27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID27()
	 * @generated
	 * @ordered
	 */
	protected PID27CONTENT pID27;

	/**
	 * The cached value of the '{@link #getPID28() <em>PID28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID28()
	 * @generated
	 * @ordered
	 */
	protected PID28CONTENT pID28;

	/**
	 * The cached value of the '{@link #getPID29() <em>PID29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID29()
	 * @generated
	 * @ordered
	 */
	protected PID29CONTENT pID29;

	/**
	 * The cached value of the '{@link #getPID30() <em>PID30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID30()
	 * @generated
	 * @ordered
	 */
	protected PID30CONTENT pID30;

	/**
	 * The cached value of the '{@link #getPID31() <em>PID31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID31()
	 * @generated
	 * @ordered
	 */
	protected PID31CONTENT pID31;

	/**
	 * The cached value of the '{@link #getPID32() <em>PID32</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID32()
	 * @generated
	 * @ordered
	 */
	protected EList<PID32CONTENT> pID32;

	/**
	 * The cached value of the '{@link #getPID33() <em>PID33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID33()
	 * @generated
	 * @ordered
	 */
	protected PID33CONTENT pID33;

	/**
	 * The cached value of the '{@link #getPID34() <em>PID34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID34()
	 * @generated
	 * @ordered
	 */
	protected PID34CONTENT pID34;

	/**
	 * The cached value of the '{@link #getPID35() <em>PID35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID35()
	 * @generated
	 * @ordered
	 */
	protected PID35CONTENT pID35;

	/**
	 * The cached value of the '{@link #getPID36() <em>PID36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID36()
	 * @generated
	 * @ordered
	 */
	protected PID36CONTENT pID36;

	/**
	 * The cached value of the '{@link #getPID37() <em>PID37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID37()
	 * @generated
	 * @ordered
	 */
	protected PID37CONTENT pID37;

	/**
	 * The cached value of the '{@link #getPID38() <em>PID38</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID38()
	 * @generated
	 * @ordered
	 */
	protected EList<PID38CONTENT> pID38;

	/**
	 * The cached value of the '{@link #getPID39() <em>PID39</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPID39()
	 * @generated
	 * @ordered
	 */
	protected EList<PID39CONTENT> pID39;

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
	protected PIDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPIDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID1CONTENT getPID1() {
		return pID1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID1(PID1CONTENT newPID1, NotificationChain msgs) {
		PID1CONTENT oldPID1 = pID1;
		pID1 = newPID1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID1, oldPID1, newPID1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID1(PID1CONTENT newPID1) {
		if (newPID1 != pID1) {
			NotificationChain msgs = null;
			if (pID1 != null)
				msgs = ((InternalEObject)pID1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID1, null, msgs);
			if (newPID1 != null)
				msgs = ((InternalEObject)newPID1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID1, null, msgs);
			msgs = basicSetPID1(newPID1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID1, newPID1, newPID1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID2CONTENT getPID2() {
		return pID2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID2(PID2CONTENT newPID2, NotificationChain msgs) {
		PID2CONTENT oldPID2 = pID2;
		pID2 = newPID2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID2, oldPID2, newPID2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID2(PID2CONTENT newPID2) {
		if (newPID2 != pID2) {
			NotificationChain msgs = null;
			if (pID2 != null)
				msgs = ((InternalEObject)pID2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID2, null, msgs);
			if (newPID2 != null)
				msgs = ((InternalEObject)newPID2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID2, null, msgs);
			msgs = basicSetPID2(newPID2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID2, newPID2, newPID2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID3CONTENT> getPID3() {
		if (pID3 == null) {
			pID3 = new EObjectContainmentEList<PID3CONTENT>(PID3CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID3);
		}
		return pID3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID4CONTENT> getPID4() {
		if (pID4 == null) {
			pID4 = new EObjectContainmentEList<PID4CONTENT>(PID4CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID4);
		}
		return pID4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID5CONTENT> getPID5() {
		if (pID5 == null) {
			pID5 = new EObjectContainmentEList<PID5CONTENT>(PID5CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID5);
		}
		return pID5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID6CONTENT> getPID6() {
		if (pID6 == null) {
			pID6 = new EObjectContainmentEList<PID6CONTENT>(PID6CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID6);
		}
		return pID6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID7CONTENT getPID7() {
		return pID7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID7(PID7CONTENT newPID7, NotificationChain msgs) {
		PID7CONTENT oldPID7 = pID7;
		pID7 = newPID7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID7, oldPID7, newPID7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID7(PID7CONTENT newPID7) {
		if (newPID7 != pID7) {
			NotificationChain msgs = null;
			if (pID7 != null)
				msgs = ((InternalEObject)pID7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID7, null, msgs);
			if (newPID7 != null)
				msgs = ((InternalEObject)newPID7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID7, null, msgs);
			msgs = basicSetPID7(newPID7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID7, newPID7, newPID7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID8CONTENT getPID8() {
		return pID8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID8(PID8CONTENT newPID8, NotificationChain msgs) {
		PID8CONTENT oldPID8 = pID8;
		pID8 = newPID8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID8, oldPID8, newPID8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID8(PID8CONTENT newPID8) {
		if (newPID8 != pID8) {
			NotificationChain msgs = null;
			if (pID8 != null)
				msgs = ((InternalEObject)pID8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID8, null, msgs);
			if (newPID8 != null)
				msgs = ((InternalEObject)newPID8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID8, null, msgs);
			msgs = basicSetPID8(newPID8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID8, newPID8, newPID8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID9CONTENT> getPID9() {
		if (pID9 == null) {
			pID9 = new EObjectContainmentEList<PID9CONTENT>(PID9CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID9);
		}
		return pID9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID10CONTENT> getPID10() {
		if (pID10 == null) {
			pID10 = new EObjectContainmentEList<PID10CONTENT>(PID10CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID10);
		}
		return pID10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID11CONTENT> getPID11() {
		if (pID11 == null) {
			pID11 = new EObjectContainmentEList<PID11CONTENT>(PID11CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID11);
		}
		return pID11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID12CONTENT getPID12() {
		return pID12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID12(PID12CONTENT newPID12, NotificationChain msgs) {
		PID12CONTENT oldPID12 = pID12;
		pID12 = newPID12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID12, oldPID12, newPID12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID12(PID12CONTENT newPID12) {
		if (newPID12 != pID12) {
			NotificationChain msgs = null;
			if (pID12 != null)
				msgs = ((InternalEObject)pID12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID12, null, msgs);
			if (newPID12 != null)
				msgs = ((InternalEObject)newPID12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID12, null, msgs);
			msgs = basicSetPID12(newPID12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID12, newPID12, newPID12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID13CONTENT> getPID13() {
		if (pID13 == null) {
			pID13 = new EObjectContainmentEList<PID13CONTENT>(PID13CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID13);
		}
		return pID13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID14CONTENT> getPID14() {
		if (pID14 == null) {
			pID14 = new EObjectContainmentEList<PID14CONTENT>(PID14CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID14);
		}
		return pID14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID15CONTENT getPID15() {
		return pID15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID15(PID15CONTENT newPID15, NotificationChain msgs) {
		PID15CONTENT oldPID15 = pID15;
		pID15 = newPID15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID15, oldPID15, newPID15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID15(PID15CONTENT newPID15) {
		if (newPID15 != pID15) {
			NotificationChain msgs = null;
			if (pID15 != null)
				msgs = ((InternalEObject)pID15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID15, null, msgs);
			if (newPID15 != null)
				msgs = ((InternalEObject)newPID15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID15, null, msgs);
			msgs = basicSetPID15(newPID15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID15, newPID15, newPID15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID16CONTENT getPID16() {
		return pID16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID16(PID16CONTENT newPID16, NotificationChain msgs) {
		PID16CONTENT oldPID16 = pID16;
		pID16 = newPID16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID16, oldPID16, newPID16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID16(PID16CONTENT newPID16) {
		if (newPID16 != pID16) {
			NotificationChain msgs = null;
			if (pID16 != null)
				msgs = ((InternalEObject)pID16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID16, null, msgs);
			if (newPID16 != null)
				msgs = ((InternalEObject)newPID16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID16, null, msgs);
			msgs = basicSetPID16(newPID16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID16, newPID16, newPID16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID17CONTENT getPID17() {
		return pID17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID17(PID17CONTENT newPID17, NotificationChain msgs) {
		PID17CONTENT oldPID17 = pID17;
		pID17 = newPID17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID17, oldPID17, newPID17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID17(PID17CONTENT newPID17) {
		if (newPID17 != pID17) {
			NotificationChain msgs = null;
			if (pID17 != null)
				msgs = ((InternalEObject)pID17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID17, null, msgs);
			if (newPID17 != null)
				msgs = ((InternalEObject)newPID17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID17, null, msgs);
			msgs = basicSetPID17(newPID17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID17, newPID17, newPID17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID18CONTENT getPID18() {
		return pID18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID18(PID18CONTENT newPID18, NotificationChain msgs) {
		PID18CONTENT oldPID18 = pID18;
		pID18 = newPID18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID18, oldPID18, newPID18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID18(PID18CONTENT newPID18) {
		if (newPID18 != pID18) {
			NotificationChain msgs = null;
			if (pID18 != null)
				msgs = ((InternalEObject)pID18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID18, null, msgs);
			if (newPID18 != null)
				msgs = ((InternalEObject)newPID18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID18, null, msgs);
			msgs = basicSetPID18(newPID18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID18, newPID18, newPID18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID19CONTENT getPID19() {
		return pID19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID19(PID19CONTENT newPID19, NotificationChain msgs) {
		PID19CONTENT oldPID19 = pID19;
		pID19 = newPID19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID19, oldPID19, newPID19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID19(PID19CONTENT newPID19) {
		if (newPID19 != pID19) {
			NotificationChain msgs = null;
			if (pID19 != null)
				msgs = ((InternalEObject)pID19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID19, null, msgs);
			if (newPID19 != null)
				msgs = ((InternalEObject)newPID19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID19, null, msgs);
			msgs = basicSetPID19(newPID19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID19, newPID19, newPID19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID20CONTENT getPID20() {
		return pID20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID20(PID20CONTENT newPID20, NotificationChain msgs) {
		PID20CONTENT oldPID20 = pID20;
		pID20 = newPID20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID20, oldPID20, newPID20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID20(PID20CONTENT newPID20) {
		if (newPID20 != pID20) {
			NotificationChain msgs = null;
			if (pID20 != null)
				msgs = ((InternalEObject)pID20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID20, null, msgs);
			if (newPID20 != null)
				msgs = ((InternalEObject)newPID20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID20, null, msgs);
			msgs = basicSetPID20(newPID20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID20, newPID20, newPID20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID21CONTENT> getPID21() {
		if (pID21 == null) {
			pID21 = new EObjectContainmentEList<PID21CONTENT>(PID21CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID21);
		}
		return pID21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID22CONTENT> getPID22() {
		if (pID22 == null) {
			pID22 = new EObjectContainmentEList<PID22CONTENT>(PID22CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID22);
		}
		return pID22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID23CONTENT getPID23() {
		return pID23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID23(PID23CONTENT newPID23, NotificationChain msgs) {
		PID23CONTENT oldPID23 = pID23;
		pID23 = newPID23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID23, oldPID23, newPID23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID23(PID23CONTENT newPID23) {
		if (newPID23 != pID23) {
			NotificationChain msgs = null;
			if (pID23 != null)
				msgs = ((InternalEObject)pID23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID23, null, msgs);
			if (newPID23 != null)
				msgs = ((InternalEObject)newPID23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID23, null, msgs);
			msgs = basicSetPID23(newPID23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID23, newPID23, newPID23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID24CONTENT getPID24() {
		return pID24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID24(PID24CONTENT newPID24, NotificationChain msgs) {
		PID24CONTENT oldPID24 = pID24;
		pID24 = newPID24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID24, oldPID24, newPID24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID24(PID24CONTENT newPID24) {
		if (newPID24 != pID24) {
			NotificationChain msgs = null;
			if (pID24 != null)
				msgs = ((InternalEObject)pID24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID24, null, msgs);
			if (newPID24 != null)
				msgs = ((InternalEObject)newPID24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID24, null, msgs);
			msgs = basicSetPID24(newPID24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID24, newPID24, newPID24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID25CONTENT getPID25() {
		return pID25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID25(PID25CONTENT newPID25, NotificationChain msgs) {
		PID25CONTENT oldPID25 = pID25;
		pID25 = newPID25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID25, oldPID25, newPID25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID25(PID25CONTENT newPID25) {
		if (newPID25 != pID25) {
			NotificationChain msgs = null;
			if (pID25 != null)
				msgs = ((InternalEObject)pID25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID25, null, msgs);
			if (newPID25 != null)
				msgs = ((InternalEObject)newPID25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID25, null, msgs);
			msgs = basicSetPID25(newPID25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID25, newPID25, newPID25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID26CONTENT> getPID26() {
		if (pID26 == null) {
			pID26 = new EObjectContainmentEList<PID26CONTENT>(PID26CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID26);
		}
		return pID26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID27CONTENT getPID27() {
		return pID27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID27(PID27CONTENT newPID27, NotificationChain msgs) {
		PID27CONTENT oldPID27 = pID27;
		pID27 = newPID27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID27, oldPID27, newPID27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID27(PID27CONTENT newPID27) {
		if (newPID27 != pID27) {
			NotificationChain msgs = null;
			if (pID27 != null)
				msgs = ((InternalEObject)pID27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID27, null, msgs);
			if (newPID27 != null)
				msgs = ((InternalEObject)newPID27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID27, null, msgs);
			msgs = basicSetPID27(newPID27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID27, newPID27, newPID27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID28CONTENT getPID28() {
		return pID28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID28(PID28CONTENT newPID28, NotificationChain msgs) {
		PID28CONTENT oldPID28 = pID28;
		pID28 = newPID28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID28, oldPID28, newPID28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID28(PID28CONTENT newPID28) {
		if (newPID28 != pID28) {
			NotificationChain msgs = null;
			if (pID28 != null)
				msgs = ((InternalEObject)pID28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID28, null, msgs);
			if (newPID28 != null)
				msgs = ((InternalEObject)newPID28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID28, null, msgs);
			msgs = basicSetPID28(newPID28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID28, newPID28, newPID28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID29CONTENT getPID29() {
		return pID29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID29(PID29CONTENT newPID29, NotificationChain msgs) {
		PID29CONTENT oldPID29 = pID29;
		pID29 = newPID29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID29, oldPID29, newPID29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID29(PID29CONTENT newPID29) {
		if (newPID29 != pID29) {
			NotificationChain msgs = null;
			if (pID29 != null)
				msgs = ((InternalEObject)pID29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID29, null, msgs);
			if (newPID29 != null)
				msgs = ((InternalEObject)newPID29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID29, null, msgs);
			msgs = basicSetPID29(newPID29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID29, newPID29, newPID29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID30CONTENT getPID30() {
		return pID30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID30(PID30CONTENT newPID30, NotificationChain msgs) {
		PID30CONTENT oldPID30 = pID30;
		pID30 = newPID30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID30, oldPID30, newPID30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID30(PID30CONTENT newPID30) {
		if (newPID30 != pID30) {
			NotificationChain msgs = null;
			if (pID30 != null)
				msgs = ((InternalEObject)pID30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID30, null, msgs);
			if (newPID30 != null)
				msgs = ((InternalEObject)newPID30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID30, null, msgs);
			msgs = basicSetPID30(newPID30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID30, newPID30, newPID30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID31CONTENT getPID31() {
		return pID31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID31(PID31CONTENT newPID31, NotificationChain msgs) {
		PID31CONTENT oldPID31 = pID31;
		pID31 = newPID31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID31, oldPID31, newPID31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID31(PID31CONTENT newPID31) {
		if (newPID31 != pID31) {
			NotificationChain msgs = null;
			if (pID31 != null)
				msgs = ((InternalEObject)pID31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID31, null, msgs);
			if (newPID31 != null)
				msgs = ((InternalEObject)newPID31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID31, null, msgs);
			msgs = basicSetPID31(newPID31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID31, newPID31, newPID31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID32CONTENT> getPID32() {
		if (pID32 == null) {
			pID32 = new EObjectContainmentEList<PID32CONTENT>(PID32CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID32);
		}
		return pID32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID33CONTENT getPID33() {
		return pID33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID33(PID33CONTENT newPID33, NotificationChain msgs) {
		PID33CONTENT oldPID33 = pID33;
		pID33 = newPID33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID33, oldPID33, newPID33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID33(PID33CONTENT newPID33) {
		if (newPID33 != pID33) {
			NotificationChain msgs = null;
			if (pID33 != null)
				msgs = ((InternalEObject)pID33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID33, null, msgs);
			if (newPID33 != null)
				msgs = ((InternalEObject)newPID33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID33, null, msgs);
			msgs = basicSetPID33(newPID33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID33, newPID33, newPID33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID34CONTENT getPID34() {
		return pID34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID34(PID34CONTENT newPID34, NotificationChain msgs) {
		PID34CONTENT oldPID34 = pID34;
		pID34 = newPID34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID34, oldPID34, newPID34);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID34(PID34CONTENT newPID34) {
		if (newPID34 != pID34) {
			NotificationChain msgs = null;
			if (pID34 != null)
				msgs = ((InternalEObject)pID34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID34, null, msgs);
			if (newPID34 != null)
				msgs = ((InternalEObject)newPID34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID34, null, msgs);
			msgs = basicSetPID34(newPID34, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID34, newPID34, newPID34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID35CONTENT getPID35() {
		return pID35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID35(PID35CONTENT newPID35, NotificationChain msgs) {
		PID35CONTENT oldPID35 = pID35;
		pID35 = newPID35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID35, oldPID35, newPID35);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID35(PID35CONTENT newPID35) {
		if (newPID35 != pID35) {
			NotificationChain msgs = null;
			if (pID35 != null)
				msgs = ((InternalEObject)pID35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID35, null, msgs);
			if (newPID35 != null)
				msgs = ((InternalEObject)newPID35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID35, null, msgs);
			msgs = basicSetPID35(newPID35, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID35, newPID35, newPID35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID36CONTENT getPID36() {
		return pID36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID36(PID36CONTENT newPID36, NotificationChain msgs) {
		PID36CONTENT oldPID36 = pID36;
		pID36 = newPID36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID36, oldPID36, newPID36);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID36(PID36CONTENT newPID36) {
		if (newPID36 != pID36) {
			NotificationChain msgs = null;
			if (pID36 != null)
				msgs = ((InternalEObject)pID36).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID36, null, msgs);
			if (newPID36 != null)
				msgs = ((InternalEObject)newPID36).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID36, null, msgs);
			msgs = basicSetPID36(newPID36, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID36, newPID36, newPID36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PID37CONTENT getPID37() {
		return pID37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPID37(PID37CONTENT newPID37, NotificationChain msgs) {
		PID37CONTENT oldPID37 = pID37;
		pID37 = newPID37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID37, oldPID37, newPID37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPID37(PID37CONTENT newPID37) {
		if (newPID37 != pID37) {
			NotificationChain msgs = null;
			if (pID37 != null)
				msgs = ((InternalEObject)pID37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID37, null, msgs);
			if (newPID37 != null)
				msgs = ((InternalEObject)newPID37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PIDCONTENT__PID37, null, msgs);
			msgs = basicSetPID37(newPID37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PIDCONTENT__PID37, newPID37, newPID37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID38CONTENT> getPID38() {
		if (pID38 == null) {
			pID38 = new EObjectContainmentEList<PID38CONTENT>(PID38CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID38);
		}
		return pID38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PID39CONTENT> getPID39() {
		if (pID39 == null) {
			pID39 = new EObjectContainmentEList<PID39CONTENT>(PID39CONTENT.class, this, V2xmlPackage.PIDCONTENT__PID39);
		}
		return pID39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PIDCONTENT__ANY);
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
			case V2xmlPackage.PIDCONTENT__PID1:
				return basicSetPID1(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID2:
				return basicSetPID2(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID3:
				return ((InternalEList<?>)getPID3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID4:
				return ((InternalEList<?>)getPID4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID5:
				return ((InternalEList<?>)getPID5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID6:
				return ((InternalEList<?>)getPID6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID7:
				return basicSetPID7(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID8:
				return basicSetPID8(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID9:
				return ((InternalEList<?>)getPID9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID10:
				return ((InternalEList<?>)getPID10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID11:
				return ((InternalEList<?>)getPID11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID12:
				return basicSetPID12(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID13:
				return ((InternalEList<?>)getPID13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID14:
				return ((InternalEList<?>)getPID14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID15:
				return basicSetPID15(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID16:
				return basicSetPID16(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID17:
				return basicSetPID17(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID18:
				return basicSetPID18(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID19:
				return basicSetPID19(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID20:
				return basicSetPID20(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID21:
				return ((InternalEList<?>)getPID21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID22:
				return ((InternalEList<?>)getPID22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID23:
				return basicSetPID23(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID24:
				return basicSetPID24(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID25:
				return basicSetPID25(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID26:
				return ((InternalEList<?>)getPID26()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID27:
				return basicSetPID27(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID28:
				return basicSetPID28(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID29:
				return basicSetPID29(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID30:
				return basicSetPID30(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID31:
				return basicSetPID31(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID32:
				return ((InternalEList<?>)getPID32()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID33:
				return basicSetPID33(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID34:
				return basicSetPID34(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID35:
				return basicSetPID35(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID36:
				return basicSetPID36(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID37:
				return basicSetPID37(null, msgs);
			case V2xmlPackage.PIDCONTENT__PID38:
				return ((InternalEList<?>)getPID38()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__PID39:
				return ((InternalEList<?>)getPID39()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PIDCONTENT__ANY:
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
			case V2xmlPackage.PIDCONTENT__PID1:
				return getPID1();
			case V2xmlPackage.PIDCONTENT__PID2:
				return getPID2();
			case V2xmlPackage.PIDCONTENT__PID3:
				return getPID3();
			case V2xmlPackage.PIDCONTENT__PID4:
				return getPID4();
			case V2xmlPackage.PIDCONTENT__PID5:
				return getPID5();
			case V2xmlPackage.PIDCONTENT__PID6:
				return getPID6();
			case V2xmlPackage.PIDCONTENT__PID7:
				return getPID7();
			case V2xmlPackage.PIDCONTENT__PID8:
				return getPID8();
			case V2xmlPackage.PIDCONTENT__PID9:
				return getPID9();
			case V2xmlPackage.PIDCONTENT__PID10:
				return getPID10();
			case V2xmlPackage.PIDCONTENT__PID11:
				return getPID11();
			case V2xmlPackage.PIDCONTENT__PID12:
				return getPID12();
			case V2xmlPackage.PIDCONTENT__PID13:
				return getPID13();
			case V2xmlPackage.PIDCONTENT__PID14:
				return getPID14();
			case V2xmlPackage.PIDCONTENT__PID15:
				return getPID15();
			case V2xmlPackage.PIDCONTENT__PID16:
				return getPID16();
			case V2xmlPackage.PIDCONTENT__PID17:
				return getPID17();
			case V2xmlPackage.PIDCONTENT__PID18:
				return getPID18();
			case V2xmlPackage.PIDCONTENT__PID19:
				return getPID19();
			case V2xmlPackage.PIDCONTENT__PID20:
				return getPID20();
			case V2xmlPackage.PIDCONTENT__PID21:
				return getPID21();
			case V2xmlPackage.PIDCONTENT__PID22:
				return getPID22();
			case V2xmlPackage.PIDCONTENT__PID23:
				return getPID23();
			case V2xmlPackage.PIDCONTENT__PID24:
				return getPID24();
			case V2xmlPackage.PIDCONTENT__PID25:
				return getPID25();
			case V2xmlPackage.PIDCONTENT__PID26:
				return getPID26();
			case V2xmlPackage.PIDCONTENT__PID27:
				return getPID27();
			case V2xmlPackage.PIDCONTENT__PID28:
				return getPID28();
			case V2xmlPackage.PIDCONTENT__PID29:
				return getPID29();
			case V2xmlPackage.PIDCONTENT__PID30:
				return getPID30();
			case V2xmlPackage.PIDCONTENT__PID31:
				return getPID31();
			case V2xmlPackage.PIDCONTENT__PID32:
				return getPID32();
			case V2xmlPackage.PIDCONTENT__PID33:
				return getPID33();
			case V2xmlPackage.PIDCONTENT__PID34:
				return getPID34();
			case V2xmlPackage.PIDCONTENT__PID35:
				return getPID35();
			case V2xmlPackage.PIDCONTENT__PID36:
				return getPID36();
			case V2xmlPackage.PIDCONTENT__PID37:
				return getPID37();
			case V2xmlPackage.PIDCONTENT__PID38:
				return getPID38();
			case V2xmlPackage.PIDCONTENT__PID39:
				return getPID39();
			case V2xmlPackage.PIDCONTENT__ANY:
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
			case V2xmlPackage.PIDCONTENT__PID1:
				setPID1((PID1CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID2:
				setPID2((PID2CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID3:
				getPID3().clear();
				getPID3().addAll((Collection<? extends PID3CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID4:
				getPID4().clear();
				getPID4().addAll((Collection<? extends PID4CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID5:
				getPID5().clear();
				getPID5().addAll((Collection<? extends PID5CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID6:
				getPID6().clear();
				getPID6().addAll((Collection<? extends PID6CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID7:
				setPID7((PID7CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID8:
				setPID8((PID8CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID9:
				getPID9().clear();
				getPID9().addAll((Collection<? extends PID9CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID10:
				getPID10().clear();
				getPID10().addAll((Collection<? extends PID10CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID11:
				getPID11().clear();
				getPID11().addAll((Collection<? extends PID11CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID12:
				setPID12((PID12CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID13:
				getPID13().clear();
				getPID13().addAll((Collection<? extends PID13CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID14:
				getPID14().clear();
				getPID14().addAll((Collection<? extends PID14CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID15:
				setPID15((PID15CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID16:
				setPID16((PID16CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID17:
				setPID17((PID17CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID18:
				setPID18((PID18CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID19:
				setPID19((PID19CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID20:
				setPID20((PID20CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID21:
				getPID21().clear();
				getPID21().addAll((Collection<? extends PID21CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID22:
				getPID22().clear();
				getPID22().addAll((Collection<? extends PID22CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID23:
				setPID23((PID23CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID24:
				setPID24((PID24CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID25:
				setPID25((PID25CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID26:
				getPID26().clear();
				getPID26().addAll((Collection<? extends PID26CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID27:
				setPID27((PID27CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID28:
				setPID28((PID28CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID29:
				setPID29((PID29CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID30:
				setPID30((PID30CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID31:
				setPID31((PID31CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID32:
				getPID32().clear();
				getPID32().addAll((Collection<? extends PID32CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID33:
				setPID33((PID33CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID34:
				setPID34((PID34CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID35:
				setPID35((PID35CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID36:
				setPID36((PID36CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID37:
				setPID37((PID37CONTENT)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID38:
				getPID38().clear();
				getPID38().addAll((Collection<? extends PID38CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__PID39:
				getPID39().clear();
				getPID39().addAll((Collection<? extends PID39CONTENT>)newValue);
				return;
			case V2xmlPackage.PIDCONTENT__ANY:
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
			case V2xmlPackage.PIDCONTENT__PID1:
				setPID1((PID1CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID2:
				setPID2((PID2CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID3:
				getPID3().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID4:
				getPID4().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID5:
				getPID5().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID6:
				getPID6().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID7:
				setPID7((PID7CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID8:
				setPID8((PID8CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID9:
				getPID9().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID10:
				getPID10().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID11:
				getPID11().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID12:
				setPID12((PID12CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID13:
				getPID13().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID14:
				getPID14().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID15:
				setPID15((PID15CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID16:
				setPID16((PID16CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID17:
				setPID17((PID17CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID18:
				setPID18((PID18CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID19:
				setPID19((PID19CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID20:
				setPID20((PID20CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID21:
				getPID21().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID22:
				getPID22().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID23:
				setPID23((PID23CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID24:
				setPID24((PID24CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID25:
				setPID25((PID25CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID26:
				getPID26().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID27:
				setPID27((PID27CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID28:
				setPID28((PID28CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID29:
				setPID29((PID29CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID30:
				setPID30((PID30CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID31:
				setPID31((PID31CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID32:
				getPID32().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID33:
				setPID33((PID33CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID34:
				setPID34((PID34CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID35:
				setPID35((PID35CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID36:
				setPID36((PID36CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID37:
				setPID37((PID37CONTENT)null);
				return;
			case V2xmlPackage.PIDCONTENT__PID38:
				getPID38().clear();
				return;
			case V2xmlPackage.PIDCONTENT__PID39:
				getPID39().clear();
				return;
			case V2xmlPackage.PIDCONTENT__ANY:
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
			case V2xmlPackage.PIDCONTENT__PID1:
				return pID1 != null;
			case V2xmlPackage.PIDCONTENT__PID2:
				return pID2 != null;
			case V2xmlPackage.PIDCONTENT__PID3:
				return pID3 != null && !pID3.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID4:
				return pID4 != null && !pID4.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID5:
				return pID5 != null && !pID5.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID6:
				return pID6 != null && !pID6.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID7:
				return pID7 != null;
			case V2xmlPackage.PIDCONTENT__PID8:
				return pID8 != null;
			case V2xmlPackage.PIDCONTENT__PID9:
				return pID9 != null && !pID9.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID10:
				return pID10 != null && !pID10.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID11:
				return pID11 != null && !pID11.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID12:
				return pID12 != null;
			case V2xmlPackage.PIDCONTENT__PID13:
				return pID13 != null && !pID13.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID14:
				return pID14 != null && !pID14.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID15:
				return pID15 != null;
			case V2xmlPackage.PIDCONTENT__PID16:
				return pID16 != null;
			case V2xmlPackage.PIDCONTENT__PID17:
				return pID17 != null;
			case V2xmlPackage.PIDCONTENT__PID18:
				return pID18 != null;
			case V2xmlPackage.PIDCONTENT__PID19:
				return pID19 != null;
			case V2xmlPackage.PIDCONTENT__PID20:
				return pID20 != null;
			case V2xmlPackage.PIDCONTENT__PID21:
				return pID21 != null && !pID21.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID22:
				return pID22 != null && !pID22.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID23:
				return pID23 != null;
			case V2xmlPackage.PIDCONTENT__PID24:
				return pID24 != null;
			case V2xmlPackage.PIDCONTENT__PID25:
				return pID25 != null;
			case V2xmlPackage.PIDCONTENT__PID26:
				return pID26 != null && !pID26.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID27:
				return pID27 != null;
			case V2xmlPackage.PIDCONTENT__PID28:
				return pID28 != null;
			case V2xmlPackage.PIDCONTENT__PID29:
				return pID29 != null;
			case V2xmlPackage.PIDCONTENT__PID30:
				return pID30 != null;
			case V2xmlPackage.PIDCONTENT__PID31:
				return pID31 != null;
			case V2xmlPackage.PIDCONTENT__PID32:
				return pID32 != null && !pID32.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID33:
				return pID33 != null;
			case V2xmlPackage.PIDCONTENT__PID34:
				return pID34 != null;
			case V2xmlPackage.PIDCONTENT__PID35:
				return pID35 != null;
			case V2xmlPackage.PIDCONTENT__PID36:
				return pID36 != null;
			case V2xmlPackage.PIDCONTENT__PID37:
				return pID37 != null;
			case V2xmlPackage.PIDCONTENT__PID38:
				return pID38 != null && !pID38.isEmpty();
			case V2xmlPackage.PIDCONTENT__PID39:
				return pID39 != null && !pID39.isEmpty();
			case V2xmlPackage.PIDCONTENT__ANY:
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

} //PIDCONTENTImpl
