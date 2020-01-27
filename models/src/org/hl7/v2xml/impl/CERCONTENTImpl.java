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

import org.hl7.v2xml.CER10CONTENT;
import org.hl7.v2xml.CER11CONTENT;
import org.hl7.v2xml.CER12CONTENT;
import org.hl7.v2xml.CER13CONTENT;
import org.hl7.v2xml.CER14CONTENT;
import org.hl7.v2xml.CER15CONTENT;
import org.hl7.v2xml.CER16CONTENT;
import org.hl7.v2xml.CER17CONTENT;
import org.hl7.v2xml.CER18CONTENT;
import org.hl7.v2xml.CER19CONTENT;
import org.hl7.v2xml.CER1CONTENT;
import org.hl7.v2xml.CER20CONTENT;
import org.hl7.v2xml.CER21CONTENT;
import org.hl7.v2xml.CER22CONTENT;
import org.hl7.v2xml.CER23CONTENT;
import org.hl7.v2xml.CER24CONTENT;
import org.hl7.v2xml.CER25CONTENT;
import org.hl7.v2xml.CER26CONTENT;
import org.hl7.v2xml.CER27CONTENT;
import org.hl7.v2xml.CER28CONTENT;
import org.hl7.v2xml.CER29CONTENT;
import org.hl7.v2xml.CER2CONTENT;
import org.hl7.v2xml.CER30CONTENT;
import org.hl7.v2xml.CER31CONTENT;
import org.hl7.v2xml.CER3CONTENT;
import org.hl7.v2xml.CER4CONTENT;
import org.hl7.v2xml.CER5CONTENT;
import org.hl7.v2xml.CER6CONTENT;
import org.hl7.v2xml.CER7CONTENT;
import org.hl7.v2xml.CER8CONTENT;
import org.hl7.v2xml.CER9CONTENT;
import org.hl7.v2xml.CERCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CERCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER1 <em>CER1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER2 <em>CER2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER3 <em>CER3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER4 <em>CER4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER5 <em>CER5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER6 <em>CER6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER7 <em>CER7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER8 <em>CER8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER9 <em>CER9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER10 <em>CER10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER11 <em>CER11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER12 <em>CER12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER13 <em>CER13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER14 <em>CER14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER15 <em>CER15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER16 <em>CER16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER17 <em>CER17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER18 <em>CER18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER19 <em>CER19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER20 <em>CER20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER21 <em>CER21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER22 <em>CER22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER23 <em>CER23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER24 <em>CER24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER25 <em>CER25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER26 <em>CER26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER27 <em>CER27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER28 <em>CER28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER29 <em>CER29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER30 <em>CER30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getCER31 <em>CER31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CERCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CERCONTENTImpl extends EObjectImpl implements CERCONTENT {
	/**
	 * The cached value of the '{@link #getCER1() <em>CER1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER1()
	 * @generated
	 * @ordered
	 */
	protected CER1CONTENT cER1;

	/**
	 * The cached value of the '{@link #getCER2() <em>CER2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER2()
	 * @generated
	 * @ordered
	 */
	protected CER2CONTENT cER2;

	/**
	 * The cached value of the '{@link #getCER3() <em>CER3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER3()
	 * @generated
	 * @ordered
	 */
	protected CER3CONTENT cER3;

	/**
	 * The cached value of the '{@link #getCER4() <em>CER4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER4()
	 * @generated
	 * @ordered
	 */
	protected CER4CONTENT cER4;

	/**
	 * The cached value of the '{@link #getCER5() <em>CER5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER5()
	 * @generated
	 * @ordered
	 */
	protected CER5CONTENT cER5;

	/**
	 * The cached value of the '{@link #getCER6() <em>CER6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER6()
	 * @generated
	 * @ordered
	 */
	protected CER6CONTENT cER6;

	/**
	 * The cached value of the '{@link #getCER7() <em>CER7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER7()
	 * @generated
	 * @ordered
	 */
	protected CER7CONTENT cER7;

	/**
	 * The cached value of the '{@link #getCER8() <em>CER8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER8()
	 * @generated
	 * @ordered
	 */
	protected CER8CONTENT cER8;

	/**
	 * The cached value of the '{@link #getCER9() <em>CER9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER9()
	 * @generated
	 * @ordered
	 */
	protected CER9CONTENT cER9;

	/**
	 * The cached value of the '{@link #getCER10() <em>CER10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER10()
	 * @generated
	 * @ordered
	 */
	protected CER10CONTENT cER10;

	/**
	 * The cached value of the '{@link #getCER11() <em>CER11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER11()
	 * @generated
	 * @ordered
	 */
	protected CER11CONTENT cER11;

	/**
	 * The cached value of the '{@link #getCER12() <em>CER12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER12()
	 * @generated
	 * @ordered
	 */
	protected CER12CONTENT cER12;

	/**
	 * The cached value of the '{@link #getCER13() <em>CER13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER13()
	 * @generated
	 * @ordered
	 */
	protected CER13CONTENT cER13;

	/**
	 * The cached value of the '{@link #getCER14() <em>CER14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER14()
	 * @generated
	 * @ordered
	 */
	protected EList<CER14CONTENT> cER14;

	/**
	 * The cached value of the '{@link #getCER15() <em>CER15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER15()
	 * @generated
	 * @ordered
	 */
	protected CER15CONTENT cER15;

	/**
	 * The cached value of the '{@link #getCER16() <em>CER16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER16()
	 * @generated
	 * @ordered
	 */
	protected CER16CONTENT cER16;

	/**
	 * The cached value of the '{@link #getCER17() <em>CER17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER17()
	 * @generated
	 * @ordered
	 */
	protected CER17CONTENT cER17;

	/**
	 * The cached value of the '{@link #getCER18() <em>CER18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER18()
	 * @generated
	 * @ordered
	 */
	protected EList<CER18CONTENT> cER18;

	/**
	 * The cached value of the '{@link #getCER19() <em>CER19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER19()
	 * @generated
	 * @ordered
	 */
	protected CER19CONTENT cER19;

	/**
	 * The cached value of the '{@link #getCER20() <em>CER20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER20()
	 * @generated
	 * @ordered
	 */
	protected CER20CONTENT cER20;

	/**
	 * The cached value of the '{@link #getCER21() <em>CER21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER21()
	 * @generated
	 * @ordered
	 */
	protected CER21CONTENT cER21;

	/**
	 * The cached value of the '{@link #getCER22() <em>CER22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER22()
	 * @generated
	 * @ordered
	 */
	protected EList<CER22CONTENT> cER22;

	/**
	 * The cached value of the '{@link #getCER23() <em>CER23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER23()
	 * @generated
	 * @ordered
	 */
	protected CER23CONTENT cER23;

	/**
	 * The cached value of the '{@link #getCER24() <em>CER24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER24()
	 * @generated
	 * @ordered
	 */
	protected CER24CONTENT cER24;

	/**
	 * The cached value of the '{@link #getCER25() <em>CER25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER25()
	 * @generated
	 * @ordered
	 */
	protected CER25CONTENT cER25;

	/**
	 * The cached value of the '{@link #getCER26() <em>CER26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER26()
	 * @generated
	 * @ordered
	 */
	protected CER26CONTENT cER26;

	/**
	 * The cached value of the '{@link #getCER27() <em>CER27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER27()
	 * @generated
	 * @ordered
	 */
	protected CER27CONTENT cER27;

	/**
	 * The cached value of the '{@link #getCER28() <em>CER28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER28()
	 * @generated
	 * @ordered
	 */
	protected CER28CONTENT cER28;

	/**
	 * The cached value of the '{@link #getCER29() <em>CER29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER29()
	 * @generated
	 * @ordered
	 */
	protected CER29CONTENT cER29;

	/**
	 * The cached value of the '{@link #getCER30() <em>CER30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER30()
	 * @generated
	 * @ordered
	 */
	protected CER30CONTENT cER30;

	/**
	 * The cached value of the '{@link #getCER31() <em>CER31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCER31()
	 * @generated
	 * @ordered
	 */
	protected CER31CONTENT cER31;

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
	protected CERCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCERCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER1CONTENT getCER1() {
		return cER1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER1(CER1CONTENT newCER1, NotificationChain msgs) {
		CER1CONTENT oldCER1 = cER1;
		cER1 = newCER1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER1, oldCER1, newCER1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER1(CER1CONTENT newCER1) {
		if (newCER1 != cER1) {
			NotificationChain msgs = null;
			if (cER1 != null)
				msgs = ((InternalEObject)cER1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER1, null, msgs);
			if (newCER1 != null)
				msgs = ((InternalEObject)newCER1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER1, null, msgs);
			msgs = basicSetCER1(newCER1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER1, newCER1, newCER1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER2CONTENT getCER2() {
		return cER2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER2(CER2CONTENT newCER2, NotificationChain msgs) {
		CER2CONTENT oldCER2 = cER2;
		cER2 = newCER2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER2, oldCER2, newCER2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER2(CER2CONTENT newCER2) {
		if (newCER2 != cER2) {
			NotificationChain msgs = null;
			if (cER2 != null)
				msgs = ((InternalEObject)cER2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER2, null, msgs);
			if (newCER2 != null)
				msgs = ((InternalEObject)newCER2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER2, null, msgs);
			msgs = basicSetCER2(newCER2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER2, newCER2, newCER2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER3CONTENT getCER3() {
		return cER3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER3(CER3CONTENT newCER3, NotificationChain msgs) {
		CER3CONTENT oldCER3 = cER3;
		cER3 = newCER3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER3, oldCER3, newCER3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER3(CER3CONTENT newCER3) {
		if (newCER3 != cER3) {
			NotificationChain msgs = null;
			if (cER3 != null)
				msgs = ((InternalEObject)cER3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER3, null, msgs);
			if (newCER3 != null)
				msgs = ((InternalEObject)newCER3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER3, null, msgs);
			msgs = basicSetCER3(newCER3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER3, newCER3, newCER3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER4CONTENT getCER4() {
		return cER4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER4(CER4CONTENT newCER4, NotificationChain msgs) {
		CER4CONTENT oldCER4 = cER4;
		cER4 = newCER4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER4, oldCER4, newCER4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER4(CER4CONTENT newCER4) {
		if (newCER4 != cER4) {
			NotificationChain msgs = null;
			if (cER4 != null)
				msgs = ((InternalEObject)cER4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER4, null, msgs);
			if (newCER4 != null)
				msgs = ((InternalEObject)newCER4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER4, null, msgs);
			msgs = basicSetCER4(newCER4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER4, newCER4, newCER4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER5CONTENT getCER5() {
		return cER5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER5(CER5CONTENT newCER5, NotificationChain msgs) {
		CER5CONTENT oldCER5 = cER5;
		cER5 = newCER5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER5, oldCER5, newCER5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER5(CER5CONTENT newCER5) {
		if (newCER5 != cER5) {
			NotificationChain msgs = null;
			if (cER5 != null)
				msgs = ((InternalEObject)cER5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER5, null, msgs);
			if (newCER5 != null)
				msgs = ((InternalEObject)newCER5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER5, null, msgs);
			msgs = basicSetCER5(newCER5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER5, newCER5, newCER5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER6CONTENT getCER6() {
		return cER6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER6(CER6CONTENT newCER6, NotificationChain msgs) {
		CER6CONTENT oldCER6 = cER6;
		cER6 = newCER6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER6, oldCER6, newCER6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER6(CER6CONTENT newCER6) {
		if (newCER6 != cER6) {
			NotificationChain msgs = null;
			if (cER6 != null)
				msgs = ((InternalEObject)cER6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER6, null, msgs);
			if (newCER6 != null)
				msgs = ((InternalEObject)newCER6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER6, null, msgs);
			msgs = basicSetCER6(newCER6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER6, newCER6, newCER6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER7CONTENT getCER7() {
		return cER7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER7(CER7CONTENT newCER7, NotificationChain msgs) {
		CER7CONTENT oldCER7 = cER7;
		cER7 = newCER7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER7, oldCER7, newCER7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER7(CER7CONTENT newCER7) {
		if (newCER7 != cER7) {
			NotificationChain msgs = null;
			if (cER7 != null)
				msgs = ((InternalEObject)cER7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER7, null, msgs);
			if (newCER7 != null)
				msgs = ((InternalEObject)newCER7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER7, null, msgs);
			msgs = basicSetCER7(newCER7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER7, newCER7, newCER7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER8CONTENT getCER8() {
		return cER8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER8(CER8CONTENT newCER8, NotificationChain msgs) {
		CER8CONTENT oldCER8 = cER8;
		cER8 = newCER8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER8, oldCER8, newCER8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER8(CER8CONTENT newCER8) {
		if (newCER8 != cER8) {
			NotificationChain msgs = null;
			if (cER8 != null)
				msgs = ((InternalEObject)cER8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER8, null, msgs);
			if (newCER8 != null)
				msgs = ((InternalEObject)newCER8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER8, null, msgs);
			msgs = basicSetCER8(newCER8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER8, newCER8, newCER8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER9CONTENT getCER9() {
		return cER9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER9(CER9CONTENT newCER9, NotificationChain msgs) {
		CER9CONTENT oldCER9 = cER9;
		cER9 = newCER9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER9, oldCER9, newCER9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER9(CER9CONTENT newCER9) {
		if (newCER9 != cER9) {
			NotificationChain msgs = null;
			if (cER9 != null)
				msgs = ((InternalEObject)cER9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER9, null, msgs);
			if (newCER9 != null)
				msgs = ((InternalEObject)newCER9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER9, null, msgs);
			msgs = basicSetCER9(newCER9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER9, newCER9, newCER9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER10CONTENT getCER10() {
		return cER10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER10(CER10CONTENT newCER10, NotificationChain msgs) {
		CER10CONTENT oldCER10 = cER10;
		cER10 = newCER10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER10, oldCER10, newCER10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER10(CER10CONTENT newCER10) {
		if (newCER10 != cER10) {
			NotificationChain msgs = null;
			if (cER10 != null)
				msgs = ((InternalEObject)cER10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER10, null, msgs);
			if (newCER10 != null)
				msgs = ((InternalEObject)newCER10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER10, null, msgs);
			msgs = basicSetCER10(newCER10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER10, newCER10, newCER10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER11CONTENT getCER11() {
		return cER11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER11(CER11CONTENT newCER11, NotificationChain msgs) {
		CER11CONTENT oldCER11 = cER11;
		cER11 = newCER11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER11, oldCER11, newCER11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER11(CER11CONTENT newCER11) {
		if (newCER11 != cER11) {
			NotificationChain msgs = null;
			if (cER11 != null)
				msgs = ((InternalEObject)cER11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER11, null, msgs);
			if (newCER11 != null)
				msgs = ((InternalEObject)newCER11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER11, null, msgs);
			msgs = basicSetCER11(newCER11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER11, newCER11, newCER11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER12CONTENT getCER12() {
		return cER12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER12(CER12CONTENT newCER12, NotificationChain msgs) {
		CER12CONTENT oldCER12 = cER12;
		cER12 = newCER12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER12, oldCER12, newCER12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER12(CER12CONTENT newCER12) {
		if (newCER12 != cER12) {
			NotificationChain msgs = null;
			if (cER12 != null)
				msgs = ((InternalEObject)cER12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER12, null, msgs);
			if (newCER12 != null)
				msgs = ((InternalEObject)newCER12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER12, null, msgs);
			msgs = basicSetCER12(newCER12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER12, newCER12, newCER12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER13CONTENT getCER13() {
		return cER13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER13(CER13CONTENT newCER13, NotificationChain msgs) {
		CER13CONTENT oldCER13 = cER13;
		cER13 = newCER13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER13, oldCER13, newCER13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER13(CER13CONTENT newCER13) {
		if (newCER13 != cER13) {
			NotificationChain msgs = null;
			if (cER13 != null)
				msgs = ((InternalEObject)cER13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER13, null, msgs);
			if (newCER13 != null)
				msgs = ((InternalEObject)newCER13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER13, null, msgs);
			msgs = basicSetCER13(newCER13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER13, newCER13, newCER13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CER14CONTENT> getCER14() {
		if (cER14 == null) {
			cER14 = new EObjectContainmentEList<CER14CONTENT>(CER14CONTENT.class, this, V2xmlPackage.CERCONTENT__CER14);
		}
		return cER14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER15CONTENT getCER15() {
		return cER15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER15(CER15CONTENT newCER15, NotificationChain msgs) {
		CER15CONTENT oldCER15 = cER15;
		cER15 = newCER15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER15, oldCER15, newCER15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER15(CER15CONTENT newCER15) {
		if (newCER15 != cER15) {
			NotificationChain msgs = null;
			if (cER15 != null)
				msgs = ((InternalEObject)cER15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER15, null, msgs);
			if (newCER15 != null)
				msgs = ((InternalEObject)newCER15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER15, null, msgs);
			msgs = basicSetCER15(newCER15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER15, newCER15, newCER15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER16CONTENT getCER16() {
		return cER16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER16(CER16CONTENT newCER16, NotificationChain msgs) {
		CER16CONTENT oldCER16 = cER16;
		cER16 = newCER16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER16, oldCER16, newCER16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER16(CER16CONTENT newCER16) {
		if (newCER16 != cER16) {
			NotificationChain msgs = null;
			if (cER16 != null)
				msgs = ((InternalEObject)cER16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER16, null, msgs);
			if (newCER16 != null)
				msgs = ((InternalEObject)newCER16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER16, null, msgs);
			msgs = basicSetCER16(newCER16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER16, newCER16, newCER16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER17CONTENT getCER17() {
		return cER17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER17(CER17CONTENT newCER17, NotificationChain msgs) {
		CER17CONTENT oldCER17 = cER17;
		cER17 = newCER17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER17, oldCER17, newCER17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER17(CER17CONTENT newCER17) {
		if (newCER17 != cER17) {
			NotificationChain msgs = null;
			if (cER17 != null)
				msgs = ((InternalEObject)cER17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER17, null, msgs);
			if (newCER17 != null)
				msgs = ((InternalEObject)newCER17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER17, null, msgs);
			msgs = basicSetCER17(newCER17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER17, newCER17, newCER17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CER18CONTENT> getCER18() {
		if (cER18 == null) {
			cER18 = new EObjectContainmentEList<CER18CONTENT>(CER18CONTENT.class, this, V2xmlPackage.CERCONTENT__CER18);
		}
		return cER18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER19CONTENT getCER19() {
		return cER19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER19(CER19CONTENT newCER19, NotificationChain msgs) {
		CER19CONTENT oldCER19 = cER19;
		cER19 = newCER19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER19, oldCER19, newCER19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER19(CER19CONTENT newCER19) {
		if (newCER19 != cER19) {
			NotificationChain msgs = null;
			if (cER19 != null)
				msgs = ((InternalEObject)cER19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER19, null, msgs);
			if (newCER19 != null)
				msgs = ((InternalEObject)newCER19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER19, null, msgs);
			msgs = basicSetCER19(newCER19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER19, newCER19, newCER19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER20CONTENT getCER20() {
		return cER20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER20(CER20CONTENT newCER20, NotificationChain msgs) {
		CER20CONTENT oldCER20 = cER20;
		cER20 = newCER20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER20, oldCER20, newCER20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER20(CER20CONTENT newCER20) {
		if (newCER20 != cER20) {
			NotificationChain msgs = null;
			if (cER20 != null)
				msgs = ((InternalEObject)cER20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER20, null, msgs);
			if (newCER20 != null)
				msgs = ((InternalEObject)newCER20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER20, null, msgs);
			msgs = basicSetCER20(newCER20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER20, newCER20, newCER20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER21CONTENT getCER21() {
		return cER21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER21(CER21CONTENT newCER21, NotificationChain msgs) {
		CER21CONTENT oldCER21 = cER21;
		cER21 = newCER21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER21, oldCER21, newCER21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER21(CER21CONTENT newCER21) {
		if (newCER21 != cER21) {
			NotificationChain msgs = null;
			if (cER21 != null)
				msgs = ((InternalEObject)cER21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER21, null, msgs);
			if (newCER21 != null)
				msgs = ((InternalEObject)newCER21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER21, null, msgs);
			msgs = basicSetCER21(newCER21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER21, newCER21, newCER21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CER22CONTENT> getCER22() {
		if (cER22 == null) {
			cER22 = new EObjectContainmentEList<CER22CONTENT>(CER22CONTENT.class, this, V2xmlPackage.CERCONTENT__CER22);
		}
		return cER22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER23CONTENT getCER23() {
		return cER23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER23(CER23CONTENT newCER23, NotificationChain msgs) {
		CER23CONTENT oldCER23 = cER23;
		cER23 = newCER23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER23, oldCER23, newCER23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER23(CER23CONTENT newCER23) {
		if (newCER23 != cER23) {
			NotificationChain msgs = null;
			if (cER23 != null)
				msgs = ((InternalEObject)cER23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER23, null, msgs);
			if (newCER23 != null)
				msgs = ((InternalEObject)newCER23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER23, null, msgs);
			msgs = basicSetCER23(newCER23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER23, newCER23, newCER23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER24CONTENT getCER24() {
		return cER24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER24(CER24CONTENT newCER24, NotificationChain msgs) {
		CER24CONTENT oldCER24 = cER24;
		cER24 = newCER24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER24, oldCER24, newCER24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER24(CER24CONTENT newCER24) {
		if (newCER24 != cER24) {
			NotificationChain msgs = null;
			if (cER24 != null)
				msgs = ((InternalEObject)cER24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER24, null, msgs);
			if (newCER24 != null)
				msgs = ((InternalEObject)newCER24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER24, null, msgs);
			msgs = basicSetCER24(newCER24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER24, newCER24, newCER24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER25CONTENT getCER25() {
		return cER25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER25(CER25CONTENT newCER25, NotificationChain msgs) {
		CER25CONTENT oldCER25 = cER25;
		cER25 = newCER25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER25, oldCER25, newCER25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER25(CER25CONTENT newCER25) {
		if (newCER25 != cER25) {
			NotificationChain msgs = null;
			if (cER25 != null)
				msgs = ((InternalEObject)cER25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER25, null, msgs);
			if (newCER25 != null)
				msgs = ((InternalEObject)newCER25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER25, null, msgs);
			msgs = basicSetCER25(newCER25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER25, newCER25, newCER25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER26CONTENT getCER26() {
		return cER26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER26(CER26CONTENT newCER26, NotificationChain msgs) {
		CER26CONTENT oldCER26 = cER26;
		cER26 = newCER26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER26, oldCER26, newCER26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER26(CER26CONTENT newCER26) {
		if (newCER26 != cER26) {
			NotificationChain msgs = null;
			if (cER26 != null)
				msgs = ((InternalEObject)cER26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER26, null, msgs);
			if (newCER26 != null)
				msgs = ((InternalEObject)newCER26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER26, null, msgs);
			msgs = basicSetCER26(newCER26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER26, newCER26, newCER26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER27CONTENT getCER27() {
		return cER27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER27(CER27CONTENT newCER27, NotificationChain msgs) {
		CER27CONTENT oldCER27 = cER27;
		cER27 = newCER27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER27, oldCER27, newCER27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER27(CER27CONTENT newCER27) {
		if (newCER27 != cER27) {
			NotificationChain msgs = null;
			if (cER27 != null)
				msgs = ((InternalEObject)cER27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER27, null, msgs);
			if (newCER27 != null)
				msgs = ((InternalEObject)newCER27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER27, null, msgs);
			msgs = basicSetCER27(newCER27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER27, newCER27, newCER27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER28CONTENT getCER28() {
		return cER28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER28(CER28CONTENT newCER28, NotificationChain msgs) {
		CER28CONTENT oldCER28 = cER28;
		cER28 = newCER28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER28, oldCER28, newCER28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER28(CER28CONTENT newCER28) {
		if (newCER28 != cER28) {
			NotificationChain msgs = null;
			if (cER28 != null)
				msgs = ((InternalEObject)cER28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER28, null, msgs);
			if (newCER28 != null)
				msgs = ((InternalEObject)newCER28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER28, null, msgs);
			msgs = basicSetCER28(newCER28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER28, newCER28, newCER28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER29CONTENT getCER29() {
		return cER29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER29(CER29CONTENT newCER29, NotificationChain msgs) {
		CER29CONTENT oldCER29 = cER29;
		cER29 = newCER29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER29, oldCER29, newCER29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER29(CER29CONTENT newCER29) {
		if (newCER29 != cER29) {
			NotificationChain msgs = null;
			if (cER29 != null)
				msgs = ((InternalEObject)cER29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER29, null, msgs);
			if (newCER29 != null)
				msgs = ((InternalEObject)newCER29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER29, null, msgs);
			msgs = basicSetCER29(newCER29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER29, newCER29, newCER29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER30CONTENT getCER30() {
		return cER30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER30(CER30CONTENT newCER30, NotificationChain msgs) {
		CER30CONTENT oldCER30 = cER30;
		cER30 = newCER30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER30, oldCER30, newCER30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER30(CER30CONTENT newCER30) {
		if (newCER30 != cER30) {
			NotificationChain msgs = null;
			if (cER30 != null)
				msgs = ((InternalEObject)cER30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER30, null, msgs);
			if (newCER30 != null)
				msgs = ((InternalEObject)newCER30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER30, null, msgs);
			msgs = basicSetCER30(newCER30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER30, newCER30, newCER30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CER31CONTENT getCER31() {
		return cER31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCER31(CER31CONTENT newCER31, NotificationChain msgs) {
		CER31CONTENT oldCER31 = cER31;
		cER31 = newCER31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER31, oldCER31, newCER31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCER31(CER31CONTENT newCER31) {
		if (newCER31 != cER31) {
			NotificationChain msgs = null;
			if (cER31 != null)
				msgs = ((InternalEObject)cER31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER31, null, msgs);
			if (newCER31 != null)
				msgs = ((InternalEObject)newCER31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CERCONTENT__CER31, null, msgs);
			msgs = basicSetCER31(newCER31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CERCONTENT__CER31, newCER31, newCER31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CERCONTENT__ANY);
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
			case V2xmlPackage.CERCONTENT__CER1:
				return basicSetCER1(null, msgs);
			case V2xmlPackage.CERCONTENT__CER2:
				return basicSetCER2(null, msgs);
			case V2xmlPackage.CERCONTENT__CER3:
				return basicSetCER3(null, msgs);
			case V2xmlPackage.CERCONTENT__CER4:
				return basicSetCER4(null, msgs);
			case V2xmlPackage.CERCONTENT__CER5:
				return basicSetCER5(null, msgs);
			case V2xmlPackage.CERCONTENT__CER6:
				return basicSetCER6(null, msgs);
			case V2xmlPackage.CERCONTENT__CER7:
				return basicSetCER7(null, msgs);
			case V2xmlPackage.CERCONTENT__CER8:
				return basicSetCER8(null, msgs);
			case V2xmlPackage.CERCONTENT__CER9:
				return basicSetCER9(null, msgs);
			case V2xmlPackage.CERCONTENT__CER10:
				return basicSetCER10(null, msgs);
			case V2xmlPackage.CERCONTENT__CER11:
				return basicSetCER11(null, msgs);
			case V2xmlPackage.CERCONTENT__CER12:
				return basicSetCER12(null, msgs);
			case V2xmlPackage.CERCONTENT__CER13:
				return basicSetCER13(null, msgs);
			case V2xmlPackage.CERCONTENT__CER14:
				return ((InternalEList<?>)getCER14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CERCONTENT__CER15:
				return basicSetCER15(null, msgs);
			case V2xmlPackage.CERCONTENT__CER16:
				return basicSetCER16(null, msgs);
			case V2xmlPackage.CERCONTENT__CER17:
				return basicSetCER17(null, msgs);
			case V2xmlPackage.CERCONTENT__CER18:
				return ((InternalEList<?>)getCER18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CERCONTENT__CER19:
				return basicSetCER19(null, msgs);
			case V2xmlPackage.CERCONTENT__CER20:
				return basicSetCER20(null, msgs);
			case V2xmlPackage.CERCONTENT__CER21:
				return basicSetCER21(null, msgs);
			case V2xmlPackage.CERCONTENT__CER22:
				return ((InternalEList<?>)getCER22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CERCONTENT__CER23:
				return basicSetCER23(null, msgs);
			case V2xmlPackage.CERCONTENT__CER24:
				return basicSetCER24(null, msgs);
			case V2xmlPackage.CERCONTENT__CER25:
				return basicSetCER25(null, msgs);
			case V2xmlPackage.CERCONTENT__CER26:
				return basicSetCER26(null, msgs);
			case V2xmlPackage.CERCONTENT__CER27:
				return basicSetCER27(null, msgs);
			case V2xmlPackage.CERCONTENT__CER28:
				return basicSetCER28(null, msgs);
			case V2xmlPackage.CERCONTENT__CER29:
				return basicSetCER29(null, msgs);
			case V2xmlPackage.CERCONTENT__CER30:
				return basicSetCER30(null, msgs);
			case V2xmlPackage.CERCONTENT__CER31:
				return basicSetCER31(null, msgs);
			case V2xmlPackage.CERCONTENT__ANY:
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
			case V2xmlPackage.CERCONTENT__CER1:
				return getCER1();
			case V2xmlPackage.CERCONTENT__CER2:
				return getCER2();
			case V2xmlPackage.CERCONTENT__CER3:
				return getCER3();
			case V2xmlPackage.CERCONTENT__CER4:
				return getCER4();
			case V2xmlPackage.CERCONTENT__CER5:
				return getCER5();
			case V2xmlPackage.CERCONTENT__CER6:
				return getCER6();
			case V2xmlPackage.CERCONTENT__CER7:
				return getCER7();
			case V2xmlPackage.CERCONTENT__CER8:
				return getCER8();
			case V2xmlPackage.CERCONTENT__CER9:
				return getCER9();
			case V2xmlPackage.CERCONTENT__CER10:
				return getCER10();
			case V2xmlPackage.CERCONTENT__CER11:
				return getCER11();
			case V2xmlPackage.CERCONTENT__CER12:
				return getCER12();
			case V2xmlPackage.CERCONTENT__CER13:
				return getCER13();
			case V2xmlPackage.CERCONTENT__CER14:
				return getCER14();
			case V2xmlPackage.CERCONTENT__CER15:
				return getCER15();
			case V2xmlPackage.CERCONTENT__CER16:
				return getCER16();
			case V2xmlPackage.CERCONTENT__CER17:
				return getCER17();
			case V2xmlPackage.CERCONTENT__CER18:
				return getCER18();
			case V2xmlPackage.CERCONTENT__CER19:
				return getCER19();
			case V2xmlPackage.CERCONTENT__CER20:
				return getCER20();
			case V2xmlPackage.CERCONTENT__CER21:
				return getCER21();
			case V2xmlPackage.CERCONTENT__CER22:
				return getCER22();
			case V2xmlPackage.CERCONTENT__CER23:
				return getCER23();
			case V2xmlPackage.CERCONTENT__CER24:
				return getCER24();
			case V2xmlPackage.CERCONTENT__CER25:
				return getCER25();
			case V2xmlPackage.CERCONTENT__CER26:
				return getCER26();
			case V2xmlPackage.CERCONTENT__CER27:
				return getCER27();
			case V2xmlPackage.CERCONTENT__CER28:
				return getCER28();
			case V2xmlPackage.CERCONTENT__CER29:
				return getCER29();
			case V2xmlPackage.CERCONTENT__CER30:
				return getCER30();
			case V2xmlPackage.CERCONTENT__CER31:
				return getCER31();
			case V2xmlPackage.CERCONTENT__ANY:
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
			case V2xmlPackage.CERCONTENT__CER1:
				setCER1((CER1CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER2:
				setCER2((CER2CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER3:
				setCER3((CER3CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER4:
				setCER4((CER4CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER5:
				setCER5((CER5CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER6:
				setCER6((CER6CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER7:
				setCER7((CER7CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER8:
				setCER8((CER8CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER9:
				setCER9((CER9CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER10:
				setCER10((CER10CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER11:
				setCER11((CER11CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER12:
				setCER12((CER12CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER13:
				setCER13((CER13CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER14:
				getCER14().clear();
				getCER14().addAll((Collection<? extends CER14CONTENT>)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER15:
				setCER15((CER15CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER16:
				setCER16((CER16CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER17:
				setCER17((CER17CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER18:
				getCER18().clear();
				getCER18().addAll((Collection<? extends CER18CONTENT>)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER19:
				setCER19((CER19CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER20:
				setCER20((CER20CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER21:
				setCER21((CER21CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER22:
				getCER22().clear();
				getCER22().addAll((Collection<? extends CER22CONTENT>)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER23:
				setCER23((CER23CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER24:
				setCER24((CER24CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER25:
				setCER25((CER25CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER26:
				setCER26((CER26CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER27:
				setCER27((CER27CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER28:
				setCER28((CER28CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER29:
				setCER29((CER29CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER30:
				setCER30((CER30CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__CER31:
				setCER31((CER31CONTENT)newValue);
				return;
			case V2xmlPackage.CERCONTENT__ANY:
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
			case V2xmlPackage.CERCONTENT__CER1:
				setCER1((CER1CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER2:
				setCER2((CER2CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER3:
				setCER3((CER3CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER4:
				setCER4((CER4CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER5:
				setCER5((CER5CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER6:
				setCER6((CER6CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER7:
				setCER7((CER7CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER8:
				setCER8((CER8CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER9:
				setCER9((CER9CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER10:
				setCER10((CER10CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER11:
				setCER11((CER11CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER12:
				setCER12((CER12CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER13:
				setCER13((CER13CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER14:
				getCER14().clear();
				return;
			case V2xmlPackage.CERCONTENT__CER15:
				setCER15((CER15CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER16:
				setCER16((CER16CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER17:
				setCER17((CER17CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER18:
				getCER18().clear();
				return;
			case V2xmlPackage.CERCONTENT__CER19:
				setCER19((CER19CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER20:
				setCER20((CER20CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER21:
				setCER21((CER21CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER22:
				getCER22().clear();
				return;
			case V2xmlPackage.CERCONTENT__CER23:
				setCER23((CER23CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER24:
				setCER24((CER24CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER25:
				setCER25((CER25CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER26:
				setCER26((CER26CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER27:
				setCER27((CER27CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER28:
				setCER28((CER28CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER29:
				setCER29((CER29CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER30:
				setCER30((CER30CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__CER31:
				setCER31((CER31CONTENT)null);
				return;
			case V2xmlPackage.CERCONTENT__ANY:
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
			case V2xmlPackage.CERCONTENT__CER1:
				return cER1 != null;
			case V2xmlPackage.CERCONTENT__CER2:
				return cER2 != null;
			case V2xmlPackage.CERCONTENT__CER3:
				return cER3 != null;
			case V2xmlPackage.CERCONTENT__CER4:
				return cER4 != null;
			case V2xmlPackage.CERCONTENT__CER5:
				return cER5 != null;
			case V2xmlPackage.CERCONTENT__CER6:
				return cER6 != null;
			case V2xmlPackage.CERCONTENT__CER7:
				return cER7 != null;
			case V2xmlPackage.CERCONTENT__CER8:
				return cER8 != null;
			case V2xmlPackage.CERCONTENT__CER9:
				return cER9 != null;
			case V2xmlPackage.CERCONTENT__CER10:
				return cER10 != null;
			case V2xmlPackage.CERCONTENT__CER11:
				return cER11 != null;
			case V2xmlPackage.CERCONTENT__CER12:
				return cER12 != null;
			case V2xmlPackage.CERCONTENT__CER13:
				return cER13 != null;
			case V2xmlPackage.CERCONTENT__CER14:
				return cER14 != null && !cER14.isEmpty();
			case V2xmlPackage.CERCONTENT__CER15:
				return cER15 != null;
			case V2xmlPackage.CERCONTENT__CER16:
				return cER16 != null;
			case V2xmlPackage.CERCONTENT__CER17:
				return cER17 != null;
			case V2xmlPackage.CERCONTENT__CER18:
				return cER18 != null && !cER18.isEmpty();
			case V2xmlPackage.CERCONTENT__CER19:
				return cER19 != null;
			case V2xmlPackage.CERCONTENT__CER20:
				return cER20 != null;
			case V2xmlPackage.CERCONTENT__CER21:
				return cER21 != null;
			case V2xmlPackage.CERCONTENT__CER22:
				return cER22 != null && !cER22.isEmpty();
			case V2xmlPackage.CERCONTENT__CER23:
				return cER23 != null;
			case V2xmlPackage.CERCONTENT__CER24:
				return cER24 != null;
			case V2xmlPackage.CERCONTENT__CER25:
				return cER25 != null;
			case V2xmlPackage.CERCONTENT__CER26:
				return cER26 != null;
			case V2xmlPackage.CERCONTENT__CER27:
				return cER27 != null;
			case V2xmlPackage.CERCONTENT__CER28:
				return cER28 != null;
			case V2xmlPackage.CERCONTENT__CER29:
				return cER29 != null;
			case V2xmlPackage.CERCONTENT__CER30:
				return cER30 != null;
			case V2xmlPackage.CERCONTENT__CER31:
				return cER31 != null;
			case V2xmlPackage.CERCONTENT__ANY:
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

} //CERCONTENTImpl
