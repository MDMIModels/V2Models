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

import org.hl7.v2xml.STF10CONTENT;
import org.hl7.v2xml.STF11CONTENT;
import org.hl7.v2xml.STF12CONTENT;
import org.hl7.v2xml.STF13CONTENT;
import org.hl7.v2xml.STF14CONTENT;
import org.hl7.v2xml.STF15CONTENT;
import org.hl7.v2xml.STF16CONTENT;
import org.hl7.v2xml.STF17CONTENT;
import org.hl7.v2xml.STF18CONTENT;
import org.hl7.v2xml.STF19CONTENT;
import org.hl7.v2xml.STF1CONTENT;
import org.hl7.v2xml.STF20CONTENT;
import org.hl7.v2xml.STF21CONTENT;
import org.hl7.v2xml.STF22CONTENT;
import org.hl7.v2xml.STF23CONTENT;
import org.hl7.v2xml.STF24CONTENT;
import org.hl7.v2xml.STF25CONTENT;
import org.hl7.v2xml.STF26CONTENT;
import org.hl7.v2xml.STF27CONTENT;
import org.hl7.v2xml.STF28CONTENT;
import org.hl7.v2xml.STF29CONTENT;
import org.hl7.v2xml.STF2CONTENT;
import org.hl7.v2xml.STF30CONTENT;
import org.hl7.v2xml.STF31CONTENT;
import org.hl7.v2xml.STF32CONTENT;
import org.hl7.v2xml.STF33CONTENT;
import org.hl7.v2xml.STF34CONTENT;
import org.hl7.v2xml.STF35CONTENT;
import org.hl7.v2xml.STF36CONTENT;
import org.hl7.v2xml.STF37CONTENT;
import org.hl7.v2xml.STF38CONTENT;
import org.hl7.v2xml.STF3CONTENT;
import org.hl7.v2xml.STF4CONTENT;
import org.hl7.v2xml.STF5CONTENT;
import org.hl7.v2xml.STF6CONTENT;
import org.hl7.v2xml.STF7CONTENT;
import org.hl7.v2xml.STF8CONTENT;
import org.hl7.v2xml.STF9CONTENT;
import org.hl7.v2xml.STFCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF1 <em>STF1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF2 <em>STF2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF3 <em>STF3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF4 <em>STF4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF5 <em>STF5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF6 <em>STF6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF7 <em>STF7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF8 <em>STF8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF9 <em>STF9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF10 <em>STF10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF11 <em>STF11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF12 <em>STF12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF13 <em>STF13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF14 <em>STF14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF15 <em>STF15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF16 <em>STF16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF17 <em>STF17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF18 <em>STF18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF19 <em>STF19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF20 <em>STF20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF21 <em>STF21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF22 <em>STF22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF23 <em>STF23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF24 <em>STF24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF25 <em>STF25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF26 <em>STF26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF27 <em>STF27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF28 <em>STF28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF29 <em>STF29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF30 <em>STF30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF31 <em>STF31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF32 <em>STF32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF33 <em>STF33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF34 <em>STF34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF35 <em>STF35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF36 <em>STF36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF37 <em>STF37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getSTF38 <em>STF38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.STFCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class STFCONTENTImpl extends EObjectImpl implements STFCONTENT {
	/**
	 * The cached value of the '{@link #getSTF1() <em>STF1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF1()
	 * @generated
	 * @ordered
	 */
	protected STF1CONTENT sTF1;

	/**
	 * The cached value of the '{@link #getSTF2() <em>STF2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF2()
	 * @generated
	 * @ordered
	 */
	protected EList<STF2CONTENT> sTF2;

	/**
	 * The cached value of the '{@link #getSTF3() <em>STF3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF3()
	 * @generated
	 * @ordered
	 */
	protected EList<STF3CONTENT> sTF3;

	/**
	 * The cached value of the '{@link #getSTF4() <em>STF4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF4()
	 * @generated
	 * @ordered
	 */
	protected EList<STF4CONTENT> sTF4;

	/**
	 * The cached value of the '{@link #getSTF5() <em>STF5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF5()
	 * @generated
	 * @ordered
	 */
	protected STF5CONTENT sTF5;

	/**
	 * The cached value of the '{@link #getSTF6() <em>STF6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF6()
	 * @generated
	 * @ordered
	 */
	protected STF6CONTENT sTF6;

	/**
	 * The cached value of the '{@link #getSTF7() <em>STF7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF7()
	 * @generated
	 * @ordered
	 */
	protected STF7CONTENT sTF7;

	/**
	 * The cached value of the '{@link #getSTF8() <em>STF8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF8()
	 * @generated
	 * @ordered
	 */
	protected EList<STF8CONTENT> sTF8;

	/**
	 * The cached value of the '{@link #getSTF9() <em>STF9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF9()
	 * @generated
	 * @ordered
	 */
	protected EList<STF9CONTENT> sTF9;

	/**
	 * The cached value of the '{@link #getSTF10() <em>STF10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF10()
	 * @generated
	 * @ordered
	 */
	protected EList<STF10CONTENT> sTF10;

	/**
	 * The cached value of the '{@link #getSTF11() <em>STF11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF11()
	 * @generated
	 * @ordered
	 */
	protected EList<STF11CONTENT> sTF11;

	/**
	 * The cached value of the '{@link #getSTF12() <em>STF12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF12()
	 * @generated
	 * @ordered
	 */
	protected EList<STF12CONTENT> sTF12;

	/**
	 * The cached value of the '{@link #getSTF13() <em>STF13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF13()
	 * @generated
	 * @ordered
	 */
	protected EList<STF13CONTENT> sTF13;

	/**
	 * The cached value of the '{@link #getSTF14() <em>STF14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF14()
	 * @generated
	 * @ordered
	 */
	protected EList<STF14CONTENT> sTF14;

	/**
	 * The cached value of the '{@link #getSTF15() <em>STF15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF15()
	 * @generated
	 * @ordered
	 */
	protected EList<STF15CONTENT> sTF15;

	/**
	 * The cached value of the '{@link #getSTF16() <em>STF16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF16()
	 * @generated
	 * @ordered
	 */
	protected STF16CONTENT sTF16;

	/**
	 * The cached value of the '{@link #getSTF17() <em>STF17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF17()
	 * @generated
	 * @ordered
	 */
	protected STF17CONTENT sTF17;

	/**
	 * The cached value of the '{@link #getSTF18() <em>STF18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF18()
	 * @generated
	 * @ordered
	 */
	protected STF18CONTENT sTF18;

	/**
	 * The cached value of the '{@link #getSTF19() <em>STF19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF19()
	 * @generated
	 * @ordered
	 */
	protected STF19CONTENT sTF19;

	/**
	 * The cached value of the '{@link #getSTF20() <em>STF20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF20()
	 * @generated
	 * @ordered
	 */
	protected STF20CONTENT sTF20;

	/**
	 * The cached value of the '{@link #getSTF21() <em>STF21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF21()
	 * @generated
	 * @ordered
	 */
	protected STF21CONTENT sTF21;

	/**
	 * The cached value of the '{@link #getSTF22() <em>STF22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF22()
	 * @generated
	 * @ordered
	 */
	protected STF22CONTENT sTF22;

	/**
	 * The cached value of the '{@link #getSTF23() <em>STF23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF23()
	 * @generated
	 * @ordered
	 */
	protected STF23CONTENT sTF23;

	/**
	 * The cached value of the '{@link #getSTF24() <em>STF24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF24()
	 * @generated
	 * @ordered
	 */
	protected STF24CONTENT sTF24;

	/**
	 * The cached value of the '{@link #getSTF25() <em>STF25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF25()
	 * @generated
	 * @ordered
	 */
	protected STF25CONTENT sTF25;

	/**
	 * The cached value of the '{@link #getSTF26() <em>STF26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF26()
	 * @generated
	 * @ordered
	 */
	protected STF26CONTENT sTF26;

	/**
	 * The cached value of the '{@link #getSTF27() <em>STF27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF27()
	 * @generated
	 * @ordered
	 */
	protected STF27CONTENT sTF27;

	/**
	 * The cached value of the '{@link #getSTF28() <em>STF28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF28()
	 * @generated
	 * @ordered
	 */
	protected STF28CONTENT sTF28;

	/**
	 * The cached value of the '{@link #getSTF29() <em>STF29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF29()
	 * @generated
	 * @ordered
	 */
	protected STF29CONTENT sTF29;

	/**
	 * The cached value of the '{@link #getSTF30() <em>STF30</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF30()
	 * @generated
	 * @ordered
	 */
	protected EList<STF30CONTENT> sTF30;

	/**
	 * The cached value of the '{@link #getSTF31() <em>STF31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF31()
	 * @generated
	 * @ordered
	 */
	protected STF31CONTENT sTF31;

	/**
	 * The cached value of the '{@link #getSTF32() <em>STF32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF32()
	 * @generated
	 * @ordered
	 */
	protected STF32CONTENT sTF32;

	/**
	 * The cached value of the '{@link #getSTF33() <em>STF33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF33()
	 * @generated
	 * @ordered
	 */
	protected STF33CONTENT sTF33;

	/**
	 * The cached value of the '{@link #getSTF34() <em>STF34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF34()
	 * @generated
	 * @ordered
	 */
	protected STF34CONTENT sTF34;

	/**
	 * The cached value of the '{@link #getSTF35() <em>STF35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF35()
	 * @generated
	 * @ordered
	 */
	protected STF35CONTENT sTF35;

	/**
	 * The cached value of the '{@link #getSTF36() <em>STF36</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF36()
	 * @generated
	 * @ordered
	 */
	protected EList<STF36CONTENT> sTF36;

	/**
	 * The cached value of the '{@link #getSTF37() <em>STF37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF37()
	 * @generated
	 * @ordered
	 */
	protected STF37CONTENT sTF37;

	/**
	 * The cached value of the '{@link #getSTF38() <em>STF38</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTF38()
	 * @generated
	 * @ordered
	 */
	protected STF38CONTENT sTF38;

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
	protected STFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSTFCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF1CONTENT getSTF1() {
		return sTF1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF1(STF1CONTENT newSTF1, NotificationChain msgs) {
		STF1CONTENT oldSTF1 = sTF1;
		sTF1 = newSTF1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF1, oldSTF1, newSTF1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF1(STF1CONTENT newSTF1) {
		if (newSTF1 != sTF1) {
			NotificationChain msgs = null;
			if (sTF1 != null)
				msgs = ((InternalEObject)sTF1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF1, null, msgs);
			if (newSTF1 != null)
				msgs = ((InternalEObject)newSTF1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF1, null, msgs);
			msgs = basicSetSTF1(newSTF1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF1, newSTF1, newSTF1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF2CONTENT> getSTF2() {
		if (sTF2 == null) {
			sTF2 = new EObjectContainmentEList<STF2CONTENT>(STF2CONTENT.class, this, V2xmlPackage.STFCONTENT__STF2);
		}
		return sTF2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF3CONTENT> getSTF3() {
		if (sTF3 == null) {
			sTF3 = new EObjectContainmentEList<STF3CONTENT>(STF3CONTENT.class, this, V2xmlPackage.STFCONTENT__STF3);
		}
		return sTF3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF4CONTENT> getSTF4() {
		if (sTF4 == null) {
			sTF4 = new EObjectContainmentEList<STF4CONTENT>(STF4CONTENT.class, this, V2xmlPackage.STFCONTENT__STF4);
		}
		return sTF4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF5CONTENT getSTF5() {
		return sTF5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF5(STF5CONTENT newSTF5, NotificationChain msgs) {
		STF5CONTENT oldSTF5 = sTF5;
		sTF5 = newSTF5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF5, oldSTF5, newSTF5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF5(STF5CONTENT newSTF5) {
		if (newSTF5 != sTF5) {
			NotificationChain msgs = null;
			if (sTF5 != null)
				msgs = ((InternalEObject)sTF5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF5, null, msgs);
			if (newSTF5 != null)
				msgs = ((InternalEObject)newSTF5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF5, null, msgs);
			msgs = basicSetSTF5(newSTF5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF5, newSTF5, newSTF5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF6CONTENT getSTF6() {
		return sTF6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF6(STF6CONTENT newSTF6, NotificationChain msgs) {
		STF6CONTENT oldSTF6 = sTF6;
		sTF6 = newSTF6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF6, oldSTF6, newSTF6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF6(STF6CONTENT newSTF6) {
		if (newSTF6 != sTF6) {
			NotificationChain msgs = null;
			if (sTF6 != null)
				msgs = ((InternalEObject)sTF6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF6, null, msgs);
			if (newSTF6 != null)
				msgs = ((InternalEObject)newSTF6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF6, null, msgs);
			msgs = basicSetSTF6(newSTF6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF6, newSTF6, newSTF6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF7CONTENT getSTF7() {
		return sTF7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF7(STF7CONTENT newSTF7, NotificationChain msgs) {
		STF7CONTENT oldSTF7 = sTF7;
		sTF7 = newSTF7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF7, oldSTF7, newSTF7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF7(STF7CONTENT newSTF7) {
		if (newSTF7 != sTF7) {
			NotificationChain msgs = null;
			if (sTF7 != null)
				msgs = ((InternalEObject)sTF7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF7, null, msgs);
			if (newSTF7 != null)
				msgs = ((InternalEObject)newSTF7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF7, null, msgs);
			msgs = basicSetSTF7(newSTF7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF7, newSTF7, newSTF7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF8CONTENT> getSTF8() {
		if (sTF8 == null) {
			sTF8 = new EObjectContainmentEList<STF8CONTENT>(STF8CONTENT.class, this, V2xmlPackage.STFCONTENT__STF8);
		}
		return sTF8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF9CONTENT> getSTF9() {
		if (sTF9 == null) {
			sTF9 = new EObjectContainmentEList<STF9CONTENT>(STF9CONTENT.class, this, V2xmlPackage.STFCONTENT__STF9);
		}
		return sTF9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF10CONTENT> getSTF10() {
		if (sTF10 == null) {
			sTF10 = new EObjectContainmentEList<STF10CONTENT>(STF10CONTENT.class, this, V2xmlPackage.STFCONTENT__STF10);
		}
		return sTF10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF11CONTENT> getSTF11() {
		if (sTF11 == null) {
			sTF11 = new EObjectContainmentEList<STF11CONTENT>(STF11CONTENT.class, this, V2xmlPackage.STFCONTENT__STF11);
		}
		return sTF11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF12CONTENT> getSTF12() {
		if (sTF12 == null) {
			sTF12 = new EObjectContainmentEList<STF12CONTENT>(STF12CONTENT.class, this, V2xmlPackage.STFCONTENT__STF12);
		}
		return sTF12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF13CONTENT> getSTF13() {
		if (sTF13 == null) {
			sTF13 = new EObjectContainmentEList<STF13CONTENT>(STF13CONTENT.class, this, V2xmlPackage.STFCONTENT__STF13);
		}
		return sTF13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF14CONTENT> getSTF14() {
		if (sTF14 == null) {
			sTF14 = new EObjectContainmentEList<STF14CONTENT>(STF14CONTENT.class, this, V2xmlPackage.STFCONTENT__STF14);
		}
		return sTF14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF15CONTENT> getSTF15() {
		if (sTF15 == null) {
			sTF15 = new EObjectContainmentEList<STF15CONTENT>(STF15CONTENT.class, this, V2xmlPackage.STFCONTENT__STF15);
		}
		return sTF15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF16CONTENT getSTF16() {
		return sTF16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF16(STF16CONTENT newSTF16, NotificationChain msgs) {
		STF16CONTENT oldSTF16 = sTF16;
		sTF16 = newSTF16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF16, oldSTF16, newSTF16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF16(STF16CONTENT newSTF16) {
		if (newSTF16 != sTF16) {
			NotificationChain msgs = null;
			if (sTF16 != null)
				msgs = ((InternalEObject)sTF16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF16, null, msgs);
			if (newSTF16 != null)
				msgs = ((InternalEObject)newSTF16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF16, null, msgs);
			msgs = basicSetSTF16(newSTF16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF16, newSTF16, newSTF16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF17CONTENT getSTF17() {
		return sTF17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF17(STF17CONTENT newSTF17, NotificationChain msgs) {
		STF17CONTENT oldSTF17 = sTF17;
		sTF17 = newSTF17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF17, oldSTF17, newSTF17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF17(STF17CONTENT newSTF17) {
		if (newSTF17 != sTF17) {
			NotificationChain msgs = null;
			if (sTF17 != null)
				msgs = ((InternalEObject)sTF17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF17, null, msgs);
			if (newSTF17 != null)
				msgs = ((InternalEObject)newSTF17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF17, null, msgs);
			msgs = basicSetSTF17(newSTF17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF17, newSTF17, newSTF17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF18CONTENT getSTF18() {
		return sTF18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF18(STF18CONTENT newSTF18, NotificationChain msgs) {
		STF18CONTENT oldSTF18 = sTF18;
		sTF18 = newSTF18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF18, oldSTF18, newSTF18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF18(STF18CONTENT newSTF18) {
		if (newSTF18 != sTF18) {
			NotificationChain msgs = null;
			if (sTF18 != null)
				msgs = ((InternalEObject)sTF18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF18, null, msgs);
			if (newSTF18 != null)
				msgs = ((InternalEObject)newSTF18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF18, null, msgs);
			msgs = basicSetSTF18(newSTF18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF18, newSTF18, newSTF18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF19CONTENT getSTF19() {
		return sTF19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF19(STF19CONTENT newSTF19, NotificationChain msgs) {
		STF19CONTENT oldSTF19 = sTF19;
		sTF19 = newSTF19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF19, oldSTF19, newSTF19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF19(STF19CONTENT newSTF19) {
		if (newSTF19 != sTF19) {
			NotificationChain msgs = null;
			if (sTF19 != null)
				msgs = ((InternalEObject)sTF19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF19, null, msgs);
			if (newSTF19 != null)
				msgs = ((InternalEObject)newSTF19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF19, null, msgs);
			msgs = basicSetSTF19(newSTF19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF19, newSTF19, newSTF19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF20CONTENT getSTF20() {
		return sTF20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF20(STF20CONTENT newSTF20, NotificationChain msgs) {
		STF20CONTENT oldSTF20 = sTF20;
		sTF20 = newSTF20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF20, oldSTF20, newSTF20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF20(STF20CONTENT newSTF20) {
		if (newSTF20 != sTF20) {
			NotificationChain msgs = null;
			if (sTF20 != null)
				msgs = ((InternalEObject)sTF20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF20, null, msgs);
			if (newSTF20 != null)
				msgs = ((InternalEObject)newSTF20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF20, null, msgs);
			msgs = basicSetSTF20(newSTF20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF20, newSTF20, newSTF20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF21CONTENT getSTF21() {
		return sTF21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF21(STF21CONTENT newSTF21, NotificationChain msgs) {
		STF21CONTENT oldSTF21 = sTF21;
		sTF21 = newSTF21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF21, oldSTF21, newSTF21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF21(STF21CONTENT newSTF21) {
		if (newSTF21 != sTF21) {
			NotificationChain msgs = null;
			if (sTF21 != null)
				msgs = ((InternalEObject)sTF21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF21, null, msgs);
			if (newSTF21 != null)
				msgs = ((InternalEObject)newSTF21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF21, null, msgs);
			msgs = basicSetSTF21(newSTF21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF21, newSTF21, newSTF21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF22CONTENT getSTF22() {
		return sTF22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF22(STF22CONTENT newSTF22, NotificationChain msgs) {
		STF22CONTENT oldSTF22 = sTF22;
		sTF22 = newSTF22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF22, oldSTF22, newSTF22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF22(STF22CONTENT newSTF22) {
		if (newSTF22 != sTF22) {
			NotificationChain msgs = null;
			if (sTF22 != null)
				msgs = ((InternalEObject)sTF22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF22, null, msgs);
			if (newSTF22 != null)
				msgs = ((InternalEObject)newSTF22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF22, null, msgs);
			msgs = basicSetSTF22(newSTF22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF22, newSTF22, newSTF22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF23CONTENT getSTF23() {
		return sTF23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF23(STF23CONTENT newSTF23, NotificationChain msgs) {
		STF23CONTENT oldSTF23 = sTF23;
		sTF23 = newSTF23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF23, oldSTF23, newSTF23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF23(STF23CONTENT newSTF23) {
		if (newSTF23 != sTF23) {
			NotificationChain msgs = null;
			if (sTF23 != null)
				msgs = ((InternalEObject)sTF23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF23, null, msgs);
			if (newSTF23 != null)
				msgs = ((InternalEObject)newSTF23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF23, null, msgs);
			msgs = basicSetSTF23(newSTF23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF23, newSTF23, newSTF23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF24CONTENT getSTF24() {
		return sTF24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF24(STF24CONTENT newSTF24, NotificationChain msgs) {
		STF24CONTENT oldSTF24 = sTF24;
		sTF24 = newSTF24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF24, oldSTF24, newSTF24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF24(STF24CONTENT newSTF24) {
		if (newSTF24 != sTF24) {
			NotificationChain msgs = null;
			if (sTF24 != null)
				msgs = ((InternalEObject)sTF24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF24, null, msgs);
			if (newSTF24 != null)
				msgs = ((InternalEObject)newSTF24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF24, null, msgs);
			msgs = basicSetSTF24(newSTF24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF24, newSTF24, newSTF24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF25CONTENT getSTF25() {
		return sTF25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF25(STF25CONTENT newSTF25, NotificationChain msgs) {
		STF25CONTENT oldSTF25 = sTF25;
		sTF25 = newSTF25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF25, oldSTF25, newSTF25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF25(STF25CONTENT newSTF25) {
		if (newSTF25 != sTF25) {
			NotificationChain msgs = null;
			if (sTF25 != null)
				msgs = ((InternalEObject)sTF25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF25, null, msgs);
			if (newSTF25 != null)
				msgs = ((InternalEObject)newSTF25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF25, null, msgs);
			msgs = basicSetSTF25(newSTF25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF25, newSTF25, newSTF25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF26CONTENT getSTF26() {
		return sTF26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF26(STF26CONTENT newSTF26, NotificationChain msgs) {
		STF26CONTENT oldSTF26 = sTF26;
		sTF26 = newSTF26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF26, oldSTF26, newSTF26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF26(STF26CONTENT newSTF26) {
		if (newSTF26 != sTF26) {
			NotificationChain msgs = null;
			if (sTF26 != null)
				msgs = ((InternalEObject)sTF26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF26, null, msgs);
			if (newSTF26 != null)
				msgs = ((InternalEObject)newSTF26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF26, null, msgs);
			msgs = basicSetSTF26(newSTF26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF26, newSTF26, newSTF26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF27CONTENT getSTF27() {
		return sTF27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF27(STF27CONTENT newSTF27, NotificationChain msgs) {
		STF27CONTENT oldSTF27 = sTF27;
		sTF27 = newSTF27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF27, oldSTF27, newSTF27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF27(STF27CONTENT newSTF27) {
		if (newSTF27 != sTF27) {
			NotificationChain msgs = null;
			if (sTF27 != null)
				msgs = ((InternalEObject)sTF27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF27, null, msgs);
			if (newSTF27 != null)
				msgs = ((InternalEObject)newSTF27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF27, null, msgs);
			msgs = basicSetSTF27(newSTF27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF27, newSTF27, newSTF27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF28CONTENT getSTF28() {
		return sTF28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF28(STF28CONTENT newSTF28, NotificationChain msgs) {
		STF28CONTENT oldSTF28 = sTF28;
		sTF28 = newSTF28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF28, oldSTF28, newSTF28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF28(STF28CONTENT newSTF28) {
		if (newSTF28 != sTF28) {
			NotificationChain msgs = null;
			if (sTF28 != null)
				msgs = ((InternalEObject)sTF28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF28, null, msgs);
			if (newSTF28 != null)
				msgs = ((InternalEObject)newSTF28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF28, null, msgs);
			msgs = basicSetSTF28(newSTF28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF28, newSTF28, newSTF28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF29CONTENT getSTF29() {
		return sTF29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF29(STF29CONTENT newSTF29, NotificationChain msgs) {
		STF29CONTENT oldSTF29 = sTF29;
		sTF29 = newSTF29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF29, oldSTF29, newSTF29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF29(STF29CONTENT newSTF29) {
		if (newSTF29 != sTF29) {
			NotificationChain msgs = null;
			if (sTF29 != null)
				msgs = ((InternalEObject)sTF29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF29, null, msgs);
			if (newSTF29 != null)
				msgs = ((InternalEObject)newSTF29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF29, null, msgs);
			msgs = basicSetSTF29(newSTF29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF29, newSTF29, newSTF29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF30CONTENT> getSTF30() {
		if (sTF30 == null) {
			sTF30 = new EObjectContainmentEList<STF30CONTENT>(STF30CONTENT.class, this, V2xmlPackage.STFCONTENT__STF30);
		}
		return sTF30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF31CONTENT getSTF31() {
		return sTF31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF31(STF31CONTENT newSTF31, NotificationChain msgs) {
		STF31CONTENT oldSTF31 = sTF31;
		sTF31 = newSTF31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF31, oldSTF31, newSTF31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF31(STF31CONTENT newSTF31) {
		if (newSTF31 != sTF31) {
			NotificationChain msgs = null;
			if (sTF31 != null)
				msgs = ((InternalEObject)sTF31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF31, null, msgs);
			if (newSTF31 != null)
				msgs = ((InternalEObject)newSTF31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF31, null, msgs);
			msgs = basicSetSTF31(newSTF31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF31, newSTF31, newSTF31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF32CONTENT getSTF32() {
		return sTF32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF32(STF32CONTENT newSTF32, NotificationChain msgs) {
		STF32CONTENT oldSTF32 = sTF32;
		sTF32 = newSTF32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF32, oldSTF32, newSTF32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF32(STF32CONTENT newSTF32) {
		if (newSTF32 != sTF32) {
			NotificationChain msgs = null;
			if (sTF32 != null)
				msgs = ((InternalEObject)sTF32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF32, null, msgs);
			if (newSTF32 != null)
				msgs = ((InternalEObject)newSTF32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF32, null, msgs);
			msgs = basicSetSTF32(newSTF32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF32, newSTF32, newSTF32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF33CONTENT getSTF33() {
		return sTF33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF33(STF33CONTENT newSTF33, NotificationChain msgs) {
		STF33CONTENT oldSTF33 = sTF33;
		sTF33 = newSTF33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF33, oldSTF33, newSTF33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF33(STF33CONTENT newSTF33) {
		if (newSTF33 != sTF33) {
			NotificationChain msgs = null;
			if (sTF33 != null)
				msgs = ((InternalEObject)sTF33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF33, null, msgs);
			if (newSTF33 != null)
				msgs = ((InternalEObject)newSTF33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF33, null, msgs);
			msgs = basicSetSTF33(newSTF33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF33, newSTF33, newSTF33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF34CONTENT getSTF34() {
		return sTF34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF34(STF34CONTENT newSTF34, NotificationChain msgs) {
		STF34CONTENT oldSTF34 = sTF34;
		sTF34 = newSTF34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF34, oldSTF34, newSTF34);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF34(STF34CONTENT newSTF34) {
		if (newSTF34 != sTF34) {
			NotificationChain msgs = null;
			if (sTF34 != null)
				msgs = ((InternalEObject)sTF34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF34, null, msgs);
			if (newSTF34 != null)
				msgs = ((InternalEObject)newSTF34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF34, null, msgs);
			msgs = basicSetSTF34(newSTF34, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF34, newSTF34, newSTF34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF35CONTENT getSTF35() {
		return sTF35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF35(STF35CONTENT newSTF35, NotificationChain msgs) {
		STF35CONTENT oldSTF35 = sTF35;
		sTF35 = newSTF35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF35, oldSTF35, newSTF35);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF35(STF35CONTENT newSTF35) {
		if (newSTF35 != sTF35) {
			NotificationChain msgs = null;
			if (sTF35 != null)
				msgs = ((InternalEObject)sTF35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF35, null, msgs);
			if (newSTF35 != null)
				msgs = ((InternalEObject)newSTF35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF35, null, msgs);
			msgs = basicSetSTF35(newSTF35, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF35, newSTF35, newSTF35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<STF36CONTENT> getSTF36() {
		if (sTF36 == null) {
			sTF36 = new EObjectContainmentEList<STF36CONTENT>(STF36CONTENT.class, this, V2xmlPackage.STFCONTENT__STF36);
		}
		return sTF36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF37CONTENT getSTF37() {
		return sTF37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF37(STF37CONTENT newSTF37, NotificationChain msgs) {
		STF37CONTENT oldSTF37 = sTF37;
		sTF37 = newSTF37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF37, oldSTF37, newSTF37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF37(STF37CONTENT newSTF37) {
		if (newSTF37 != sTF37) {
			NotificationChain msgs = null;
			if (sTF37 != null)
				msgs = ((InternalEObject)sTF37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF37, null, msgs);
			if (newSTF37 != null)
				msgs = ((InternalEObject)newSTF37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF37, null, msgs);
			msgs = basicSetSTF37(newSTF37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF37, newSTF37, newSTF37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STF38CONTENT getSTF38() {
		return sTF38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSTF38(STF38CONTENT newSTF38, NotificationChain msgs) {
		STF38CONTENT oldSTF38 = sTF38;
		sTF38 = newSTF38;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF38, oldSTF38, newSTF38);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSTF38(STF38CONTENT newSTF38) {
		if (newSTF38 != sTF38) {
			NotificationChain msgs = null;
			if (sTF38 != null)
				msgs = ((InternalEObject)sTF38).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF38, null, msgs);
			if (newSTF38 != null)
				msgs = ((InternalEObject)newSTF38).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.STFCONTENT__STF38, null, msgs);
			msgs = basicSetSTF38(newSTF38, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.STFCONTENT__STF38, newSTF38, newSTF38));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.STFCONTENT__ANY);
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
			case V2xmlPackage.STFCONTENT__STF1:
				return basicSetSTF1(null, msgs);
			case V2xmlPackage.STFCONTENT__STF2:
				return ((InternalEList<?>)getSTF2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF3:
				return ((InternalEList<?>)getSTF3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF4:
				return ((InternalEList<?>)getSTF4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF5:
				return basicSetSTF5(null, msgs);
			case V2xmlPackage.STFCONTENT__STF6:
				return basicSetSTF6(null, msgs);
			case V2xmlPackage.STFCONTENT__STF7:
				return basicSetSTF7(null, msgs);
			case V2xmlPackage.STFCONTENT__STF8:
				return ((InternalEList<?>)getSTF8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF9:
				return ((InternalEList<?>)getSTF9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF10:
				return ((InternalEList<?>)getSTF10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF11:
				return ((InternalEList<?>)getSTF11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF12:
				return ((InternalEList<?>)getSTF12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF13:
				return ((InternalEList<?>)getSTF13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF14:
				return ((InternalEList<?>)getSTF14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF15:
				return ((InternalEList<?>)getSTF15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF16:
				return basicSetSTF16(null, msgs);
			case V2xmlPackage.STFCONTENT__STF17:
				return basicSetSTF17(null, msgs);
			case V2xmlPackage.STFCONTENT__STF18:
				return basicSetSTF18(null, msgs);
			case V2xmlPackage.STFCONTENT__STF19:
				return basicSetSTF19(null, msgs);
			case V2xmlPackage.STFCONTENT__STF20:
				return basicSetSTF20(null, msgs);
			case V2xmlPackage.STFCONTENT__STF21:
				return basicSetSTF21(null, msgs);
			case V2xmlPackage.STFCONTENT__STF22:
				return basicSetSTF22(null, msgs);
			case V2xmlPackage.STFCONTENT__STF23:
				return basicSetSTF23(null, msgs);
			case V2xmlPackage.STFCONTENT__STF24:
				return basicSetSTF24(null, msgs);
			case V2xmlPackage.STFCONTENT__STF25:
				return basicSetSTF25(null, msgs);
			case V2xmlPackage.STFCONTENT__STF26:
				return basicSetSTF26(null, msgs);
			case V2xmlPackage.STFCONTENT__STF27:
				return basicSetSTF27(null, msgs);
			case V2xmlPackage.STFCONTENT__STF28:
				return basicSetSTF28(null, msgs);
			case V2xmlPackage.STFCONTENT__STF29:
				return basicSetSTF29(null, msgs);
			case V2xmlPackage.STFCONTENT__STF30:
				return ((InternalEList<?>)getSTF30()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF31:
				return basicSetSTF31(null, msgs);
			case V2xmlPackage.STFCONTENT__STF32:
				return basicSetSTF32(null, msgs);
			case V2xmlPackage.STFCONTENT__STF33:
				return basicSetSTF33(null, msgs);
			case V2xmlPackage.STFCONTENT__STF34:
				return basicSetSTF34(null, msgs);
			case V2xmlPackage.STFCONTENT__STF35:
				return basicSetSTF35(null, msgs);
			case V2xmlPackage.STFCONTENT__STF36:
				return ((InternalEList<?>)getSTF36()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.STFCONTENT__STF37:
				return basicSetSTF37(null, msgs);
			case V2xmlPackage.STFCONTENT__STF38:
				return basicSetSTF38(null, msgs);
			case V2xmlPackage.STFCONTENT__ANY:
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
			case V2xmlPackage.STFCONTENT__STF1:
				return getSTF1();
			case V2xmlPackage.STFCONTENT__STF2:
				return getSTF2();
			case V2xmlPackage.STFCONTENT__STF3:
				return getSTF3();
			case V2xmlPackage.STFCONTENT__STF4:
				return getSTF4();
			case V2xmlPackage.STFCONTENT__STF5:
				return getSTF5();
			case V2xmlPackage.STFCONTENT__STF6:
				return getSTF6();
			case V2xmlPackage.STFCONTENT__STF7:
				return getSTF7();
			case V2xmlPackage.STFCONTENT__STF8:
				return getSTF8();
			case V2xmlPackage.STFCONTENT__STF9:
				return getSTF9();
			case V2xmlPackage.STFCONTENT__STF10:
				return getSTF10();
			case V2xmlPackage.STFCONTENT__STF11:
				return getSTF11();
			case V2xmlPackage.STFCONTENT__STF12:
				return getSTF12();
			case V2xmlPackage.STFCONTENT__STF13:
				return getSTF13();
			case V2xmlPackage.STFCONTENT__STF14:
				return getSTF14();
			case V2xmlPackage.STFCONTENT__STF15:
				return getSTF15();
			case V2xmlPackage.STFCONTENT__STF16:
				return getSTF16();
			case V2xmlPackage.STFCONTENT__STF17:
				return getSTF17();
			case V2xmlPackage.STFCONTENT__STF18:
				return getSTF18();
			case V2xmlPackage.STFCONTENT__STF19:
				return getSTF19();
			case V2xmlPackage.STFCONTENT__STF20:
				return getSTF20();
			case V2xmlPackage.STFCONTENT__STF21:
				return getSTF21();
			case V2xmlPackage.STFCONTENT__STF22:
				return getSTF22();
			case V2xmlPackage.STFCONTENT__STF23:
				return getSTF23();
			case V2xmlPackage.STFCONTENT__STF24:
				return getSTF24();
			case V2xmlPackage.STFCONTENT__STF25:
				return getSTF25();
			case V2xmlPackage.STFCONTENT__STF26:
				return getSTF26();
			case V2xmlPackage.STFCONTENT__STF27:
				return getSTF27();
			case V2xmlPackage.STFCONTENT__STF28:
				return getSTF28();
			case V2xmlPackage.STFCONTENT__STF29:
				return getSTF29();
			case V2xmlPackage.STFCONTENT__STF30:
				return getSTF30();
			case V2xmlPackage.STFCONTENT__STF31:
				return getSTF31();
			case V2xmlPackage.STFCONTENT__STF32:
				return getSTF32();
			case V2xmlPackage.STFCONTENT__STF33:
				return getSTF33();
			case V2xmlPackage.STFCONTENT__STF34:
				return getSTF34();
			case V2xmlPackage.STFCONTENT__STF35:
				return getSTF35();
			case V2xmlPackage.STFCONTENT__STF36:
				return getSTF36();
			case V2xmlPackage.STFCONTENT__STF37:
				return getSTF37();
			case V2xmlPackage.STFCONTENT__STF38:
				return getSTF38();
			case V2xmlPackage.STFCONTENT__ANY:
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
			case V2xmlPackage.STFCONTENT__STF1:
				setSTF1((STF1CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF2:
				getSTF2().clear();
				getSTF2().addAll((Collection<? extends STF2CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF3:
				getSTF3().clear();
				getSTF3().addAll((Collection<? extends STF3CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF4:
				getSTF4().clear();
				getSTF4().addAll((Collection<? extends STF4CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF5:
				setSTF5((STF5CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF6:
				setSTF6((STF6CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF7:
				setSTF7((STF7CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF8:
				getSTF8().clear();
				getSTF8().addAll((Collection<? extends STF8CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF9:
				getSTF9().clear();
				getSTF9().addAll((Collection<? extends STF9CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF10:
				getSTF10().clear();
				getSTF10().addAll((Collection<? extends STF10CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF11:
				getSTF11().clear();
				getSTF11().addAll((Collection<? extends STF11CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF12:
				getSTF12().clear();
				getSTF12().addAll((Collection<? extends STF12CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF13:
				getSTF13().clear();
				getSTF13().addAll((Collection<? extends STF13CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF14:
				getSTF14().clear();
				getSTF14().addAll((Collection<? extends STF14CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF15:
				getSTF15().clear();
				getSTF15().addAll((Collection<? extends STF15CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF16:
				setSTF16((STF16CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF17:
				setSTF17((STF17CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF18:
				setSTF18((STF18CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF19:
				setSTF19((STF19CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF20:
				setSTF20((STF20CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF21:
				setSTF21((STF21CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF22:
				setSTF22((STF22CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF23:
				setSTF23((STF23CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF24:
				setSTF24((STF24CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF25:
				setSTF25((STF25CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF26:
				setSTF26((STF26CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF27:
				setSTF27((STF27CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF28:
				setSTF28((STF28CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF29:
				setSTF29((STF29CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF30:
				getSTF30().clear();
				getSTF30().addAll((Collection<? extends STF30CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF31:
				setSTF31((STF31CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF32:
				setSTF32((STF32CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF33:
				setSTF33((STF33CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF34:
				setSTF34((STF34CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF35:
				setSTF35((STF35CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF36:
				getSTF36().clear();
				getSTF36().addAll((Collection<? extends STF36CONTENT>)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF37:
				setSTF37((STF37CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__STF38:
				setSTF38((STF38CONTENT)newValue);
				return;
			case V2xmlPackage.STFCONTENT__ANY:
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
			case V2xmlPackage.STFCONTENT__STF1:
				setSTF1((STF1CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF2:
				getSTF2().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF3:
				getSTF3().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF4:
				getSTF4().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF5:
				setSTF5((STF5CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF6:
				setSTF6((STF6CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF7:
				setSTF7((STF7CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF8:
				getSTF8().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF9:
				getSTF9().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF10:
				getSTF10().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF11:
				getSTF11().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF12:
				getSTF12().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF13:
				getSTF13().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF14:
				getSTF14().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF15:
				getSTF15().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF16:
				setSTF16((STF16CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF17:
				setSTF17((STF17CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF18:
				setSTF18((STF18CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF19:
				setSTF19((STF19CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF20:
				setSTF20((STF20CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF21:
				setSTF21((STF21CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF22:
				setSTF22((STF22CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF23:
				setSTF23((STF23CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF24:
				setSTF24((STF24CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF25:
				setSTF25((STF25CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF26:
				setSTF26((STF26CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF27:
				setSTF27((STF27CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF28:
				setSTF28((STF28CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF29:
				setSTF29((STF29CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF30:
				getSTF30().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF31:
				setSTF31((STF31CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF32:
				setSTF32((STF32CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF33:
				setSTF33((STF33CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF34:
				setSTF34((STF34CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF35:
				setSTF35((STF35CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF36:
				getSTF36().clear();
				return;
			case V2xmlPackage.STFCONTENT__STF37:
				setSTF37((STF37CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__STF38:
				setSTF38((STF38CONTENT)null);
				return;
			case V2xmlPackage.STFCONTENT__ANY:
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
			case V2xmlPackage.STFCONTENT__STF1:
				return sTF1 != null;
			case V2xmlPackage.STFCONTENT__STF2:
				return sTF2 != null && !sTF2.isEmpty();
			case V2xmlPackage.STFCONTENT__STF3:
				return sTF3 != null && !sTF3.isEmpty();
			case V2xmlPackage.STFCONTENT__STF4:
				return sTF4 != null && !sTF4.isEmpty();
			case V2xmlPackage.STFCONTENT__STF5:
				return sTF5 != null;
			case V2xmlPackage.STFCONTENT__STF6:
				return sTF6 != null;
			case V2xmlPackage.STFCONTENT__STF7:
				return sTF7 != null;
			case V2xmlPackage.STFCONTENT__STF8:
				return sTF8 != null && !sTF8.isEmpty();
			case V2xmlPackage.STFCONTENT__STF9:
				return sTF9 != null && !sTF9.isEmpty();
			case V2xmlPackage.STFCONTENT__STF10:
				return sTF10 != null && !sTF10.isEmpty();
			case V2xmlPackage.STFCONTENT__STF11:
				return sTF11 != null && !sTF11.isEmpty();
			case V2xmlPackage.STFCONTENT__STF12:
				return sTF12 != null && !sTF12.isEmpty();
			case V2xmlPackage.STFCONTENT__STF13:
				return sTF13 != null && !sTF13.isEmpty();
			case V2xmlPackage.STFCONTENT__STF14:
				return sTF14 != null && !sTF14.isEmpty();
			case V2xmlPackage.STFCONTENT__STF15:
				return sTF15 != null && !sTF15.isEmpty();
			case V2xmlPackage.STFCONTENT__STF16:
				return sTF16 != null;
			case V2xmlPackage.STFCONTENT__STF17:
				return sTF17 != null;
			case V2xmlPackage.STFCONTENT__STF18:
				return sTF18 != null;
			case V2xmlPackage.STFCONTENT__STF19:
				return sTF19 != null;
			case V2xmlPackage.STFCONTENT__STF20:
				return sTF20 != null;
			case V2xmlPackage.STFCONTENT__STF21:
				return sTF21 != null;
			case V2xmlPackage.STFCONTENT__STF22:
				return sTF22 != null;
			case V2xmlPackage.STFCONTENT__STF23:
				return sTF23 != null;
			case V2xmlPackage.STFCONTENT__STF24:
				return sTF24 != null;
			case V2xmlPackage.STFCONTENT__STF25:
				return sTF25 != null;
			case V2xmlPackage.STFCONTENT__STF26:
				return sTF26 != null;
			case V2xmlPackage.STFCONTENT__STF27:
				return sTF27 != null;
			case V2xmlPackage.STFCONTENT__STF28:
				return sTF28 != null;
			case V2xmlPackage.STFCONTENT__STF29:
				return sTF29 != null;
			case V2xmlPackage.STFCONTENT__STF30:
				return sTF30 != null && !sTF30.isEmpty();
			case V2xmlPackage.STFCONTENT__STF31:
				return sTF31 != null;
			case V2xmlPackage.STFCONTENT__STF32:
				return sTF32 != null;
			case V2xmlPackage.STFCONTENT__STF33:
				return sTF33 != null;
			case V2xmlPackage.STFCONTENT__STF34:
				return sTF34 != null;
			case V2xmlPackage.STFCONTENT__STF35:
				return sTF35 != null;
			case V2xmlPackage.STFCONTENT__STF36:
				return sTF36 != null && !sTF36.isEmpty();
			case V2xmlPackage.STFCONTENT__STF37:
				return sTF37 != null;
			case V2xmlPackage.STFCONTENT__STF38:
				return sTF38 != null;
			case V2xmlPackage.STFCONTENT__ANY:
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

} //STFCONTENTImpl
