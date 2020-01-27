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

import org.hl7.v2xml.RXO10CONTENT;
import org.hl7.v2xml.RXO11CONTENT;
import org.hl7.v2xml.RXO12CONTENT;
import org.hl7.v2xml.RXO13CONTENT;
import org.hl7.v2xml.RXO14CONTENT;
import org.hl7.v2xml.RXO15CONTENT;
import org.hl7.v2xml.RXO16CONTENT;
import org.hl7.v2xml.RXO17CONTENT;
import org.hl7.v2xml.RXO18CONTENT;
import org.hl7.v2xml.RXO19CONTENT;
import org.hl7.v2xml.RXO1CONTENT;
import org.hl7.v2xml.RXO20CONTENT;
import org.hl7.v2xml.RXO21CONTENT;
import org.hl7.v2xml.RXO22CONTENT;
import org.hl7.v2xml.RXO23CONTENT;
import org.hl7.v2xml.RXO24CONTENT;
import org.hl7.v2xml.RXO25CONTENT;
import org.hl7.v2xml.RXO26CONTENT;
import org.hl7.v2xml.RXO27CONTENT;
import org.hl7.v2xml.RXO28CONTENT;
import org.hl7.v2xml.RXO2CONTENT;
import org.hl7.v2xml.RXO3CONTENT;
import org.hl7.v2xml.RXO4CONTENT;
import org.hl7.v2xml.RXO5CONTENT;
import org.hl7.v2xml.RXO6CONTENT;
import org.hl7.v2xml.RXO7CONTENT;
import org.hl7.v2xml.RXO8CONTENT;
import org.hl7.v2xml.RXO9CONTENT;
import org.hl7.v2xml.RXOCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXOCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO1 <em>RXO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO2 <em>RXO2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO3 <em>RXO3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO4 <em>RXO4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO5 <em>RXO5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO6 <em>RXO6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO7 <em>RXO7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO8 <em>RXO8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO9 <em>RXO9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO10 <em>RXO10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO11 <em>RXO11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO12 <em>RXO12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO13 <em>RXO13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO14 <em>RXO14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO15 <em>RXO15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO16 <em>RXO16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO17 <em>RXO17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO18 <em>RXO18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO19 <em>RXO19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO20 <em>RXO20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO21 <em>RXO21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO22 <em>RXO22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO23 <em>RXO23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO24 <em>RXO24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO25 <em>RXO25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO26 <em>RXO26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO27 <em>RXO27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getRXO28 <em>RXO28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXOCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXOCONTENTImpl extends EObjectImpl implements RXOCONTENT {
	/**
	 * The cached value of the '{@link #getRXO1() <em>RXO1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO1()
	 * @generated
	 * @ordered
	 */
	protected RXO1CONTENT rXO1;

	/**
	 * The cached value of the '{@link #getRXO2() <em>RXO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO2()
	 * @generated
	 * @ordered
	 */
	protected RXO2CONTENT rXO2;

	/**
	 * The cached value of the '{@link #getRXO3() <em>RXO3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO3()
	 * @generated
	 * @ordered
	 */
	protected RXO3CONTENT rXO3;

	/**
	 * The cached value of the '{@link #getRXO4() <em>RXO4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO4()
	 * @generated
	 * @ordered
	 */
	protected RXO4CONTENT rXO4;

	/**
	 * The cached value of the '{@link #getRXO5() <em>RXO5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO5()
	 * @generated
	 * @ordered
	 */
	protected RXO5CONTENT rXO5;

	/**
	 * The cached value of the '{@link #getRXO6() <em>RXO6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO6()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO6CONTENT> rXO6;

	/**
	 * The cached value of the '{@link #getRXO7() <em>RXO7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO7()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO7CONTENT> rXO7;

	/**
	 * The cached value of the '{@link #getRXO8() <em>RXO8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO8()
	 * @generated
	 * @ordered
	 */
	protected RXO8CONTENT rXO8;

	/**
	 * The cached value of the '{@link #getRXO9() <em>RXO9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO9()
	 * @generated
	 * @ordered
	 */
	protected RXO9CONTENT rXO9;

	/**
	 * The cached value of the '{@link #getRXO10() <em>RXO10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO10()
	 * @generated
	 * @ordered
	 */
	protected RXO10CONTENT rXO10;

	/**
	 * The cached value of the '{@link #getRXO11() <em>RXO11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO11()
	 * @generated
	 * @ordered
	 */
	protected RXO11CONTENT rXO11;

	/**
	 * The cached value of the '{@link #getRXO12() <em>RXO12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO12()
	 * @generated
	 * @ordered
	 */
	protected RXO12CONTENT rXO12;

	/**
	 * The cached value of the '{@link #getRXO13() <em>RXO13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO13()
	 * @generated
	 * @ordered
	 */
	protected RXO13CONTENT rXO13;

	/**
	 * The cached value of the '{@link #getRXO14() <em>RXO14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO14()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO14CONTENT> rXO14;

	/**
	 * The cached value of the '{@link #getRXO15() <em>RXO15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO15()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO15CONTENT> rXO15;

	/**
	 * The cached value of the '{@link #getRXO16() <em>RXO16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO16()
	 * @generated
	 * @ordered
	 */
	protected RXO16CONTENT rXO16;

	/**
	 * The cached value of the '{@link #getRXO17() <em>RXO17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO17()
	 * @generated
	 * @ordered
	 */
	protected RXO17CONTENT rXO17;

	/**
	 * The cached value of the '{@link #getRXO18() <em>RXO18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO18()
	 * @generated
	 * @ordered
	 */
	protected RXO18CONTENT rXO18;

	/**
	 * The cached value of the '{@link #getRXO19() <em>RXO19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO19()
	 * @generated
	 * @ordered
	 */
	protected RXO19CONTENT rXO19;

	/**
	 * The cached value of the '{@link #getRXO20() <em>RXO20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO20()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO20CONTENT> rXO20;

	/**
	 * The cached value of the '{@link #getRXO21() <em>RXO21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO21()
	 * @generated
	 * @ordered
	 */
	protected RXO21CONTENT rXO21;

	/**
	 * The cached value of the '{@link #getRXO22() <em>RXO22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO22()
	 * @generated
	 * @ordered
	 */
	protected RXO22CONTENT rXO22;

	/**
	 * The cached value of the '{@link #getRXO23() <em>RXO23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO23()
	 * @generated
	 * @ordered
	 */
	protected RXO23CONTENT rXO23;

	/**
	 * The cached value of the '{@link #getRXO24() <em>RXO24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO24()
	 * @generated
	 * @ordered
	 */
	protected EList<RXO24CONTENT> rXO24;

	/**
	 * The cached value of the '{@link #getRXO25() <em>RXO25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO25()
	 * @generated
	 * @ordered
	 */
	protected RXO25CONTENT rXO25;

	/**
	 * The cached value of the '{@link #getRXO26() <em>RXO26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO26()
	 * @generated
	 * @ordered
	 */
	protected RXO26CONTENT rXO26;

	/**
	 * The cached value of the '{@link #getRXO27() <em>RXO27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO27()
	 * @generated
	 * @ordered
	 */
	protected RXO27CONTENT rXO27;

	/**
	 * The cached value of the '{@link #getRXO28() <em>RXO28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXO28()
	 * @generated
	 * @ordered
	 */
	protected RXO28CONTENT rXO28;

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
	protected RXOCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXOCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO1CONTENT getRXO1() {
		return rXO1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO1(RXO1CONTENT newRXO1, NotificationChain msgs) {
		RXO1CONTENT oldRXO1 = rXO1;
		rXO1 = newRXO1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO1, oldRXO1, newRXO1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO1(RXO1CONTENT newRXO1) {
		if (newRXO1 != rXO1) {
			NotificationChain msgs = null;
			if (rXO1 != null)
				msgs = ((InternalEObject)rXO1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO1, null, msgs);
			if (newRXO1 != null)
				msgs = ((InternalEObject)newRXO1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO1, null, msgs);
			msgs = basicSetRXO1(newRXO1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO1, newRXO1, newRXO1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO2CONTENT getRXO2() {
		return rXO2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO2(RXO2CONTENT newRXO2, NotificationChain msgs) {
		RXO2CONTENT oldRXO2 = rXO2;
		rXO2 = newRXO2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO2, oldRXO2, newRXO2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO2(RXO2CONTENT newRXO2) {
		if (newRXO2 != rXO2) {
			NotificationChain msgs = null;
			if (rXO2 != null)
				msgs = ((InternalEObject)rXO2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO2, null, msgs);
			if (newRXO2 != null)
				msgs = ((InternalEObject)newRXO2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO2, null, msgs);
			msgs = basicSetRXO2(newRXO2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO2, newRXO2, newRXO2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO3CONTENT getRXO3() {
		return rXO3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO3(RXO3CONTENT newRXO3, NotificationChain msgs) {
		RXO3CONTENT oldRXO3 = rXO3;
		rXO3 = newRXO3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO3, oldRXO3, newRXO3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO3(RXO3CONTENT newRXO3) {
		if (newRXO3 != rXO3) {
			NotificationChain msgs = null;
			if (rXO3 != null)
				msgs = ((InternalEObject)rXO3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO3, null, msgs);
			if (newRXO3 != null)
				msgs = ((InternalEObject)newRXO3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO3, null, msgs);
			msgs = basicSetRXO3(newRXO3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO3, newRXO3, newRXO3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO4CONTENT getRXO4() {
		return rXO4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO4(RXO4CONTENT newRXO4, NotificationChain msgs) {
		RXO4CONTENT oldRXO4 = rXO4;
		rXO4 = newRXO4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO4, oldRXO4, newRXO4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO4(RXO4CONTENT newRXO4) {
		if (newRXO4 != rXO4) {
			NotificationChain msgs = null;
			if (rXO4 != null)
				msgs = ((InternalEObject)rXO4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO4, null, msgs);
			if (newRXO4 != null)
				msgs = ((InternalEObject)newRXO4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO4, null, msgs);
			msgs = basicSetRXO4(newRXO4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO4, newRXO4, newRXO4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO5CONTENT getRXO5() {
		return rXO5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO5(RXO5CONTENT newRXO5, NotificationChain msgs) {
		RXO5CONTENT oldRXO5 = rXO5;
		rXO5 = newRXO5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO5, oldRXO5, newRXO5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO5(RXO5CONTENT newRXO5) {
		if (newRXO5 != rXO5) {
			NotificationChain msgs = null;
			if (rXO5 != null)
				msgs = ((InternalEObject)rXO5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO5, null, msgs);
			if (newRXO5 != null)
				msgs = ((InternalEObject)newRXO5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO5, null, msgs);
			msgs = basicSetRXO5(newRXO5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO5, newRXO5, newRXO5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO6CONTENT> getRXO6() {
		if (rXO6 == null) {
			rXO6 = new EObjectContainmentEList<RXO6CONTENT>(RXO6CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO6);
		}
		return rXO6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO7CONTENT> getRXO7() {
		if (rXO7 == null) {
			rXO7 = new EObjectContainmentEList<RXO7CONTENT>(RXO7CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO7);
		}
		return rXO7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO8CONTENT getRXO8() {
		return rXO8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO8(RXO8CONTENT newRXO8, NotificationChain msgs) {
		RXO8CONTENT oldRXO8 = rXO8;
		rXO8 = newRXO8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO8, oldRXO8, newRXO8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO8(RXO8CONTENT newRXO8) {
		if (newRXO8 != rXO8) {
			NotificationChain msgs = null;
			if (rXO8 != null)
				msgs = ((InternalEObject)rXO8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO8, null, msgs);
			if (newRXO8 != null)
				msgs = ((InternalEObject)newRXO8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO8, null, msgs);
			msgs = basicSetRXO8(newRXO8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO8, newRXO8, newRXO8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO9CONTENT getRXO9() {
		return rXO9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO9(RXO9CONTENT newRXO9, NotificationChain msgs) {
		RXO9CONTENT oldRXO9 = rXO9;
		rXO9 = newRXO9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO9, oldRXO9, newRXO9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO9(RXO9CONTENT newRXO9) {
		if (newRXO9 != rXO9) {
			NotificationChain msgs = null;
			if (rXO9 != null)
				msgs = ((InternalEObject)rXO9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO9, null, msgs);
			if (newRXO9 != null)
				msgs = ((InternalEObject)newRXO9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO9, null, msgs);
			msgs = basicSetRXO9(newRXO9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO9, newRXO9, newRXO9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO10CONTENT getRXO10() {
		return rXO10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO10(RXO10CONTENT newRXO10, NotificationChain msgs) {
		RXO10CONTENT oldRXO10 = rXO10;
		rXO10 = newRXO10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO10, oldRXO10, newRXO10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO10(RXO10CONTENT newRXO10) {
		if (newRXO10 != rXO10) {
			NotificationChain msgs = null;
			if (rXO10 != null)
				msgs = ((InternalEObject)rXO10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO10, null, msgs);
			if (newRXO10 != null)
				msgs = ((InternalEObject)newRXO10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO10, null, msgs);
			msgs = basicSetRXO10(newRXO10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO10, newRXO10, newRXO10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO11CONTENT getRXO11() {
		return rXO11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO11(RXO11CONTENT newRXO11, NotificationChain msgs) {
		RXO11CONTENT oldRXO11 = rXO11;
		rXO11 = newRXO11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO11, oldRXO11, newRXO11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO11(RXO11CONTENT newRXO11) {
		if (newRXO11 != rXO11) {
			NotificationChain msgs = null;
			if (rXO11 != null)
				msgs = ((InternalEObject)rXO11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO11, null, msgs);
			if (newRXO11 != null)
				msgs = ((InternalEObject)newRXO11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO11, null, msgs);
			msgs = basicSetRXO11(newRXO11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO11, newRXO11, newRXO11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO12CONTENT getRXO12() {
		return rXO12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO12(RXO12CONTENT newRXO12, NotificationChain msgs) {
		RXO12CONTENT oldRXO12 = rXO12;
		rXO12 = newRXO12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO12, oldRXO12, newRXO12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO12(RXO12CONTENT newRXO12) {
		if (newRXO12 != rXO12) {
			NotificationChain msgs = null;
			if (rXO12 != null)
				msgs = ((InternalEObject)rXO12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO12, null, msgs);
			if (newRXO12 != null)
				msgs = ((InternalEObject)newRXO12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO12, null, msgs);
			msgs = basicSetRXO12(newRXO12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO12, newRXO12, newRXO12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO13CONTENT getRXO13() {
		return rXO13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO13(RXO13CONTENT newRXO13, NotificationChain msgs) {
		RXO13CONTENT oldRXO13 = rXO13;
		rXO13 = newRXO13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO13, oldRXO13, newRXO13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO13(RXO13CONTENT newRXO13) {
		if (newRXO13 != rXO13) {
			NotificationChain msgs = null;
			if (rXO13 != null)
				msgs = ((InternalEObject)rXO13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO13, null, msgs);
			if (newRXO13 != null)
				msgs = ((InternalEObject)newRXO13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO13, null, msgs);
			msgs = basicSetRXO13(newRXO13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO13, newRXO13, newRXO13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO14CONTENT> getRXO14() {
		if (rXO14 == null) {
			rXO14 = new EObjectContainmentEList<RXO14CONTENT>(RXO14CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO14);
		}
		return rXO14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO15CONTENT> getRXO15() {
		if (rXO15 == null) {
			rXO15 = new EObjectContainmentEList<RXO15CONTENT>(RXO15CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO15);
		}
		return rXO15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO16CONTENT getRXO16() {
		return rXO16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO16(RXO16CONTENT newRXO16, NotificationChain msgs) {
		RXO16CONTENT oldRXO16 = rXO16;
		rXO16 = newRXO16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO16, oldRXO16, newRXO16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO16(RXO16CONTENT newRXO16) {
		if (newRXO16 != rXO16) {
			NotificationChain msgs = null;
			if (rXO16 != null)
				msgs = ((InternalEObject)rXO16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO16, null, msgs);
			if (newRXO16 != null)
				msgs = ((InternalEObject)newRXO16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO16, null, msgs);
			msgs = basicSetRXO16(newRXO16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO16, newRXO16, newRXO16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO17CONTENT getRXO17() {
		return rXO17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO17(RXO17CONTENT newRXO17, NotificationChain msgs) {
		RXO17CONTENT oldRXO17 = rXO17;
		rXO17 = newRXO17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO17, oldRXO17, newRXO17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO17(RXO17CONTENT newRXO17) {
		if (newRXO17 != rXO17) {
			NotificationChain msgs = null;
			if (rXO17 != null)
				msgs = ((InternalEObject)rXO17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO17, null, msgs);
			if (newRXO17 != null)
				msgs = ((InternalEObject)newRXO17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO17, null, msgs);
			msgs = basicSetRXO17(newRXO17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO17, newRXO17, newRXO17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO18CONTENT getRXO18() {
		return rXO18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO18(RXO18CONTENT newRXO18, NotificationChain msgs) {
		RXO18CONTENT oldRXO18 = rXO18;
		rXO18 = newRXO18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO18, oldRXO18, newRXO18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO18(RXO18CONTENT newRXO18) {
		if (newRXO18 != rXO18) {
			NotificationChain msgs = null;
			if (rXO18 != null)
				msgs = ((InternalEObject)rXO18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO18, null, msgs);
			if (newRXO18 != null)
				msgs = ((InternalEObject)newRXO18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO18, null, msgs);
			msgs = basicSetRXO18(newRXO18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO18, newRXO18, newRXO18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO19CONTENT getRXO19() {
		return rXO19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO19(RXO19CONTENT newRXO19, NotificationChain msgs) {
		RXO19CONTENT oldRXO19 = rXO19;
		rXO19 = newRXO19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO19, oldRXO19, newRXO19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO19(RXO19CONTENT newRXO19) {
		if (newRXO19 != rXO19) {
			NotificationChain msgs = null;
			if (rXO19 != null)
				msgs = ((InternalEObject)rXO19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO19, null, msgs);
			if (newRXO19 != null)
				msgs = ((InternalEObject)newRXO19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO19, null, msgs);
			msgs = basicSetRXO19(newRXO19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO19, newRXO19, newRXO19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO20CONTENT> getRXO20() {
		if (rXO20 == null) {
			rXO20 = new EObjectContainmentEList<RXO20CONTENT>(RXO20CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO20);
		}
		return rXO20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO21CONTENT getRXO21() {
		return rXO21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO21(RXO21CONTENT newRXO21, NotificationChain msgs) {
		RXO21CONTENT oldRXO21 = rXO21;
		rXO21 = newRXO21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO21, oldRXO21, newRXO21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO21(RXO21CONTENT newRXO21) {
		if (newRXO21 != rXO21) {
			NotificationChain msgs = null;
			if (rXO21 != null)
				msgs = ((InternalEObject)rXO21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO21, null, msgs);
			if (newRXO21 != null)
				msgs = ((InternalEObject)newRXO21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO21, null, msgs);
			msgs = basicSetRXO21(newRXO21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO21, newRXO21, newRXO21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO22CONTENT getRXO22() {
		return rXO22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO22(RXO22CONTENT newRXO22, NotificationChain msgs) {
		RXO22CONTENT oldRXO22 = rXO22;
		rXO22 = newRXO22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO22, oldRXO22, newRXO22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO22(RXO22CONTENT newRXO22) {
		if (newRXO22 != rXO22) {
			NotificationChain msgs = null;
			if (rXO22 != null)
				msgs = ((InternalEObject)rXO22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO22, null, msgs);
			if (newRXO22 != null)
				msgs = ((InternalEObject)newRXO22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO22, null, msgs);
			msgs = basicSetRXO22(newRXO22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO22, newRXO22, newRXO22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO23CONTENT getRXO23() {
		return rXO23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO23(RXO23CONTENT newRXO23, NotificationChain msgs) {
		RXO23CONTENT oldRXO23 = rXO23;
		rXO23 = newRXO23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO23, oldRXO23, newRXO23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO23(RXO23CONTENT newRXO23) {
		if (newRXO23 != rXO23) {
			NotificationChain msgs = null;
			if (rXO23 != null)
				msgs = ((InternalEObject)rXO23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO23, null, msgs);
			if (newRXO23 != null)
				msgs = ((InternalEObject)newRXO23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO23, null, msgs);
			msgs = basicSetRXO23(newRXO23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO23, newRXO23, newRXO23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXO24CONTENT> getRXO24() {
		if (rXO24 == null) {
			rXO24 = new EObjectContainmentEList<RXO24CONTENT>(RXO24CONTENT.class, this, V2xmlPackage.RXOCONTENT__RXO24);
		}
		return rXO24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO25CONTENT getRXO25() {
		return rXO25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO25(RXO25CONTENT newRXO25, NotificationChain msgs) {
		RXO25CONTENT oldRXO25 = rXO25;
		rXO25 = newRXO25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO25, oldRXO25, newRXO25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO25(RXO25CONTENT newRXO25) {
		if (newRXO25 != rXO25) {
			NotificationChain msgs = null;
			if (rXO25 != null)
				msgs = ((InternalEObject)rXO25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO25, null, msgs);
			if (newRXO25 != null)
				msgs = ((InternalEObject)newRXO25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO25, null, msgs);
			msgs = basicSetRXO25(newRXO25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO25, newRXO25, newRXO25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO26CONTENT getRXO26() {
		return rXO26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO26(RXO26CONTENT newRXO26, NotificationChain msgs) {
		RXO26CONTENT oldRXO26 = rXO26;
		rXO26 = newRXO26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO26, oldRXO26, newRXO26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO26(RXO26CONTENT newRXO26) {
		if (newRXO26 != rXO26) {
			NotificationChain msgs = null;
			if (rXO26 != null)
				msgs = ((InternalEObject)rXO26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO26, null, msgs);
			if (newRXO26 != null)
				msgs = ((InternalEObject)newRXO26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO26, null, msgs);
			msgs = basicSetRXO26(newRXO26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO26, newRXO26, newRXO26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO27CONTENT getRXO27() {
		return rXO27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO27(RXO27CONTENT newRXO27, NotificationChain msgs) {
		RXO27CONTENT oldRXO27 = rXO27;
		rXO27 = newRXO27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO27, oldRXO27, newRXO27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO27(RXO27CONTENT newRXO27) {
		if (newRXO27 != rXO27) {
			NotificationChain msgs = null;
			if (rXO27 != null)
				msgs = ((InternalEObject)rXO27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO27, null, msgs);
			if (newRXO27 != null)
				msgs = ((InternalEObject)newRXO27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO27, null, msgs);
			msgs = basicSetRXO27(newRXO27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO27, newRXO27, newRXO27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXO28CONTENT getRXO28() {
		return rXO28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXO28(RXO28CONTENT newRXO28, NotificationChain msgs) {
		RXO28CONTENT oldRXO28 = rXO28;
		rXO28 = newRXO28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO28, oldRXO28, newRXO28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXO28(RXO28CONTENT newRXO28) {
		if (newRXO28 != rXO28) {
			NotificationChain msgs = null;
			if (rXO28 != null)
				msgs = ((InternalEObject)rXO28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO28, null, msgs);
			if (newRXO28 != null)
				msgs = ((InternalEObject)newRXO28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXOCONTENT__RXO28, null, msgs);
			msgs = basicSetRXO28(newRXO28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXOCONTENT__RXO28, newRXO28, newRXO28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXOCONTENT__ANY);
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
			case V2xmlPackage.RXOCONTENT__RXO1:
				return basicSetRXO1(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO2:
				return basicSetRXO2(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO3:
				return basicSetRXO3(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO4:
				return basicSetRXO4(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO5:
				return basicSetRXO5(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO6:
				return ((InternalEList<?>)getRXO6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO7:
				return ((InternalEList<?>)getRXO7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO8:
				return basicSetRXO8(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO9:
				return basicSetRXO9(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO10:
				return basicSetRXO10(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO11:
				return basicSetRXO11(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO12:
				return basicSetRXO12(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO13:
				return basicSetRXO13(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO14:
				return ((InternalEList<?>)getRXO14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO15:
				return ((InternalEList<?>)getRXO15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO16:
				return basicSetRXO16(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO17:
				return basicSetRXO17(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO18:
				return basicSetRXO18(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO19:
				return basicSetRXO19(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO20:
				return ((InternalEList<?>)getRXO20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO21:
				return basicSetRXO21(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO22:
				return basicSetRXO22(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO23:
				return basicSetRXO23(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO24:
				return ((InternalEList<?>)getRXO24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXOCONTENT__RXO25:
				return basicSetRXO25(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO26:
				return basicSetRXO26(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO27:
				return basicSetRXO27(null, msgs);
			case V2xmlPackage.RXOCONTENT__RXO28:
				return basicSetRXO28(null, msgs);
			case V2xmlPackage.RXOCONTENT__ANY:
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
			case V2xmlPackage.RXOCONTENT__RXO1:
				return getRXO1();
			case V2xmlPackage.RXOCONTENT__RXO2:
				return getRXO2();
			case V2xmlPackage.RXOCONTENT__RXO3:
				return getRXO3();
			case V2xmlPackage.RXOCONTENT__RXO4:
				return getRXO4();
			case V2xmlPackage.RXOCONTENT__RXO5:
				return getRXO5();
			case V2xmlPackage.RXOCONTENT__RXO6:
				return getRXO6();
			case V2xmlPackage.RXOCONTENT__RXO7:
				return getRXO7();
			case V2xmlPackage.RXOCONTENT__RXO8:
				return getRXO8();
			case V2xmlPackage.RXOCONTENT__RXO9:
				return getRXO9();
			case V2xmlPackage.RXOCONTENT__RXO10:
				return getRXO10();
			case V2xmlPackage.RXOCONTENT__RXO11:
				return getRXO11();
			case V2xmlPackage.RXOCONTENT__RXO12:
				return getRXO12();
			case V2xmlPackage.RXOCONTENT__RXO13:
				return getRXO13();
			case V2xmlPackage.RXOCONTENT__RXO14:
				return getRXO14();
			case V2xmlPackage.RXOCONTENT__RXO15:
				return getRXO15();
			case V2xmlPackage.RXOCONTENT__RXO16:
				return getRXO16();
			case V2xmlPackage.RXOCONTENT__RXO17:
				return getRXO17();
			case V2xmlPackage.RXOCONTENT__RXO18:
				return getRXO18();
			case V2xmlPackage.RXOCONTENT__RXO19:
				return getRXO19();
			case V2xmlPackage.RXOCONTENT__RXO20:
				return getRXO20();
			case V2xmlPackage.RXOCONTENT__RXO21:
				return getRXO21();
			case V2xmlPackage.RXOCONTENT__RXO22:
				return getRXO22();
			case V2xmlPackage.RXOCONTENT__RXO23:
				return getRXO23();
			case V2xmlPackage.RXOCONTENT__RXO24:
				return getRXO24();
			case V2xmlPackage.RXOCONTENT__RXO25:
				return getRXO25();
			case V2xmlPackage.RXOCONTENT__RXO26:
				return getRXO26();
			case V2xmlPackage.RXOCONTENT__RXO27:
				return getRXO27();
			case V2xmlPackage.RXOCONTENT__RXO28:
				return getRXO28();
			case V2xmlPackage.RXOCONTENT__ANY:
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
			case V2xmlPackage.RXOCONTENT__RXO1:
				setRXO1((RXO1CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO2:
				setRXO2((RXO2CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO3:
				setRXO3((RXO3CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO4:
				setRXO4((RXO4CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO5:
				setRXO5((RXO5CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO6:
				getRXO6().clear();
				getRXO6().addAll((Collection<? extends RXO6CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO7:
				getRXO7().clear();
				getRXO7().addAll((Collection<? extends RXO7CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO8:
				setRXO8((RXO8CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO9:
				setRXO9((RXO9CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO10:
				setRXO10((RXO10CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO11:
				setRXO11((RXO11CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO12:
				setRXO12((RXO12CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO13:
				setRXO13((RXO13CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO14:
				getRXO14().clear();
				getRXO14().addAll((Collection<? extends RXO14CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO15:
				getRXO15().clear();
				getRXO15().addAll((Collection<? extends RXO15CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO16:
				setRXO16((RXO16CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO17:
				setRXO17((RXO17CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO18:
				setRXO18((RXO18CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO19:
				setRXO19((RXO19CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO20:
				getRXO20().clear();
				getRXO20().addAll((Collection<? extends RXO20CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO21:
				setRXO21((RXO21CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO22:
				setRXO22((RXO22CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO23:
				setRXO23((RXO23CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO24:
				getRXO24().clear();
				getRXO24().addAll((Collection<? extends RXO24CONTENT>)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO25:
				setRXO25((RXO25CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO26:
				setRXO26((RXO26CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO27:
				setRXO27((RXO27CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__RXO28:
				setRXO28((RXO28CONTENT)newValue);
				return;
			case V2xmlPackage.RXOCONTENT__ANY:
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
			case V2xmlPackage.RXOCONTENT__RXO1:
				setRXO1((RXO1CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO2:
				setRXO2((RXO2CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO3:
				setRXO3((RXO3CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO4:
				setRXO4((RXO4CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO5:
				setRXO5((RXO5CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO6:
				getRXO6().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO7:
				getRXO7().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO8:
				setRXO8((RXO8CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO9:
				setRXO9((RXO9CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO10:
				setRXO10((RXO10CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO11:
				setRXO11((RXO11CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO12:
				setRXO12((RXO12CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO13:
				setRXO13((RXO13CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO14:
				getRXO14().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO15:
				getRXO15().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO16:
				setRXO16((RXO16CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO17:
				setRXO17((RXO17CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO18:
				setRXO18((RXO18CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO19:
				setRXO19((RXO19CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO20:
				getRXO20().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO21:
				setRXO21((RXO21CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO22:
				setRXO22((RXO22CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO23:
				setRXO23((RXO23CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO24:
				getRXO24().clear();
				return;
			case V2xmlPackage.RXOCONTENT__RXO25:
				setRXO25((RXO25CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO26:
				setRXO26((RXO26CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO27:
				setRXO27((RXO27CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__RXO28:
				setRXO28((RXO28CONTENT)null);
				return;
			case V2xmlPackage.RXOCONTENT__ANY:
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
			case V2xmlPackage.RXOCONTENT__RXO1:
				return rXO1 != null;
			case V2xmlPackage.RXOCONTENT__RXO2:
				return rXO2 != null;
			case V2xmlPackage.RXOCONTENT__RXO3:
				return rXO3 != null;
			case V2xmlPackage.RXOCONTENT__RXO4:
				return rXO4 != null;
			case V2xmlPackage.RXOCONTENT__RXO5:
				return rXO5 != null;
			case V2xmlPackage.RXOCONTENT__RXO6:
				return rXO6 != null && !rXO6.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO7:
				return rXO7 != null && !rXO7.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO8:
				return rXO8 != null;
			case V2xmlPackage.RXOCONTENT__RXO9:
				return rXO9 != null;
			case V2xmlPackage.RXOCONTENT__RXO10:
				return rXO10 != null;
			case V2xmlPackage.RXOCONTENT__RXO11:
				return rXO11 != null;
			case V2xmlPackage.RXOCONTENT__RXO12:
				return rXO12 != null;
			case V2xmlPackage.RXOCONTENT__RXO13:
				return rXO13 != null;
			case V2xmlPackage.RXOCONTENT__RXO14:
				return rXO14 != null && !rXO14.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO15:
				return rXO15 != null && !rXO15.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO16:
				return rXO16 != null;
			case V2xmlPackage.RXOCONTENT__RXO17:
				return rXO17 != null;
			case V2xmlPackage.RXOCONTENT__RXO18:
				return rXO18 != null;
			case V2xmlPackage.RXOCONTENT__RXO19:
				return rXO19 != null;
			case V2xmlPackage.RXOCONTENT__RXO20:
				return rXO20 != null && !rXO20.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO21:
				return rXO21 != null;
			case V2xmlPackage.RXOCONTENT__RXO22:
				return rXO22 != null;
			case V2xmlPackage.RXOCONTENT__RXO23:
				return rXO23 != null;
			case V2xmlPackage.RXOCONTENT__RXO24:
				return rXO24 != null && !rXO24.isEmpty();
			case V2xmlPackage.RXOCONTENT__RXO25:
				return rXO25 != null;
			case V2xmlPackage.RXOCONTENT__RXO26:
				return rXO26 != null;
			case V2xmlPackage.RXOCONTENT__RXO27:
				return rXO27 != null;
			case V2xmlPackage.RXOCONTENT__RXO28:
				return rXO28 != null;
			case V2xmlPackage.RXOCONTENT__ANY:
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

} //RXOCONTENTImpl
