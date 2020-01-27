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

import org.hl7.v2xml.RXA10CONTENT;
import org.hl7.v2xml.RXA11CONTENT;
import org.hl7.v2xml.RXA12CONTENT;
import org.hl7.v2xml.RXA13CONTENT;
import org.hl7.v2xml.RXA14CONTENT;
import org.hl7.v2xml.RXA15CONTENT;
import org.hl7.v2xml.RXA16CONTENT;
import org.hl7.v2xml.RXA17CONTENT;
import org.hl7.v2xml.RXA18CONTENT;
import org.hl7.v2xml.RXA19CONTENT;
import org.hl7.v2xml.RXA1CONTENT;
import org.hl7.v2xml.RXA20CONTENT;
import org.hl7.v2xml.RXA21CONTENT;
import org.hl7.v2xml.RXA22CONTENT;
import org.hl7.v2xml.RXA23CONTENT;
import org.hl7.v2xml.RXA24CONTENT;
import org.hl7.v2xml.RXA25CONTENT;
import org.hl7.v2xml.RXA26CONTENT;
import org.hl7.v2xml.RXA2CONTENT;
import org.hl7.v2xml.RXA3CONTENT;
import org.hl7.v2xml.RXA4CONTENT;
import org.hl7.v2xml.RXA5CONTENT;
import org.hl7.v2xml.RXA6CONTENT;
import org.hl7.v2xml.RXA7CONTENT;
import org.hl7.v2xml.RXA8CONTENT;
import org.hl7.v2xml.RXA9CONTENT;
import org.hl7.v2xml.RXACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA1 <em>RXA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA2 <em>RXA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA3 <em>RXA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA4 <em>RXA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA5 <em>RXA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA6 <em>RXA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA7 <em>RXA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA8 <em>RXA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA9 <em>RXA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA10 <em>RXA10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA11 <em>RXA11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA12 <em>RXA12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA13 <em>RXA13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA14 <em>RXA14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA15 <em>RXA15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA16 <em>RXA16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA17 <em>RXA17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA18 <em>RXA18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA19 <em>RXA19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA20 <em>RXA20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA21 <em>RXA21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA22 <em>RXA22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA23 <em>RXA23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA24 <em>RXA24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA25 <em>RXA25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getRXA26 <em>RXA26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXACONTENTImpl extends EObjectImpl implements RXACONTENT {
	/**
	 * The cached value of the '{@link #getRXA1() <em>RXA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA1()
	 * @generated
	 * @ordered
	 */
	protected RXA1CONTENT rXA1;

	/**
	 * The cached value of the '{@link #getRXA2() <em>RXA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA2()
	 * @generated
	 * @ordered
	 */
	protected RXA2CONTENT rXA2;

	/**
	 * The cached value of the '{@link #getRXA3() <em>RXA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA3()
	 * @generated
	 * @ordered
	 */
	protected RXA3CONTENT rXA3;

	/**
	 * The cached value of the '{@link #getRXA4() <em>RXA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA4()
	 * @generated
	 * @ordered
	 */
	protected RXA4CONTENT rXA4;

	/**
	 * The cached value of the '{@link #getRXA5() <em>RXA5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA5()
	 * @generated
	 * @ordered
	 */
	protected RXA5CONTENT rXA5;

	/**
	 * The cached value of the '{@link #getRXA6() <em>RXA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA6()
	 * @generated
	 * @ordered
	 */
	protected RXA6CONTENT rXA6;

	/**
	 * The cached value of the '{@link #getRXA7() <em>RXA7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA7()
	 * @generated
	 * @ordered
	 */
	protected RXA7CONTENT rXA7;

	/**
	 * The cached value of the '{@link #getRXA8() <em>RXA8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA8()
	 * @generated
	 * @ordered
	 */
	protected RXA8CONTENT rXA8;

	/**
	 * The cached value of the '{@link #getRXA9() <em>RXA9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA9()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA9CONTENT> rXA9;

	/**
	 * The cached value of the '{@link #getRXA10() <em>RXA10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA10()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA10CONTENT> rXA10;

	/**
	 * The cached value of the '{@link #getRXA11() <em>RXA11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA11()
	 * @generated
	 * @ordered
	 */
	protected RXA11CONTENT rXA11;

	/**
	 * The cached value of the '{@link #getRXA12() <em>RXA12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA12()
	 * @generated
	 * @ordered
	 */
	protected RXA12CONTENT rXA12;

	/**
	 * The cached value of the '{@link #getRXA13() <em>RXA13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA13()
	 * @generated
	 * @ordered
	 */
	protected RXA13CONTENT rXA13;

	/**
	 * The cached value of the '{@link #getRXA14() <em>RXA14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA14()
	 * @generated
	 * @ordered
	 */
	protected RXA14CONTENT rXA14;

	/**
	 * The cached value of the '{@link #getRXA15() <em>RXA15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA15()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA15CONTENT> rXA15;

	/**
	 * The cached value of the '{@link #getRXA16() <em>RXA16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA16()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA16CONTENT> rXA16;

	/**
	 * The cached value of the '{@link #getRXA17() <em>RXA17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA17()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA17CONTENT> rXA17;

	/**
	 * The cached value of the '{@link #getRXA18() <em>RXA18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA18()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA18CONTENT> rXA18;

	/**
	 * The cached value of the '{@link #getRXA19() <em>RXA19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA19()
	 * @generated
	 * @ordered
	 */
	protected EList<RXA19CONTENT> rXA19;

	/**
	 * The cached value of the '{@link #getRXA20() <em>RXA20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA20()
	 * @generated
	 * @ordered
	 */
	protected RXA20CONTENT rXA20;

	/**
	 * The cached value of the '{@link #getRXA21() <em>RXA21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA21()
	 * @generated
	 * @ordered
	 */
	protected RXA21CONTENT rXA21;

	/**
	 * The cached value of the '{@link #getRXA22() <em>RXA22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA22()
	 * @generated
	 * @ordered
	 */
	protected RXA22CONTENT rXA22;

	/**
	 * The cached value of the '{@link #getRXA23() <em>RXA23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA23()
	 * @generated
	 * @ordered
	 */
	protected RXA23CONTENT rXA23;

	/**
	 * The cached value of the '{@link #getRXA24() <em>RXA24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA24()
	 * @generated
	 * @ordered
	 */
	protected RXA24CONTENT rXA24;

	/**
	 * The cached value of the '{@link #getRXA25() <em>RXA25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA25()
	 * @generated
	 * @ordered
	 */
	protected RXA25CONTENT rXA25;

	/**
	 * The cached value of the '{@link #getRXA26() <em>RXA26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXA26()
	 * @generated
	 * @ordered
	 */
	protected RXA26CONTENT rXA26;

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
	protected RXACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA1CONTENT getRXA1() {
		return rXA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA1(RXA1CONTENT newRXA1, NotificationChain msgs) {
		RXA1CONTENT oldRXA1 = rXA1;
		rXA1 = newRXA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA1, oldRXA1, newRXA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA1(RXA1CONTENT newRXA1) {
		if (newRXA1 != rXA1) {
			NotificationChain msgs = null;
			if (rXA1 != null)
				msgs = ((InternalEObject)rXA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA1, null, msgs);
			if (newRXA1 != null)
				msgs = ((InternalEObject)newRXA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA1, null, msgs);
			msgs = basicSetRXA1(newRXA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA1, newRXA1, newRXA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA2CONTENT getRXA2() {
		return rXA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA2(RXA2CONTENT newRXA2, NotificationChain msgs) {
		RXA2CONTENT oldRXA2 = rXA2;
		rXA2 = newRXA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA2, oldRXA2, newRXA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA2(RXA2CONTENT newRXA2) {
		if (newRXA2 != rXA2) {
			NotificationChain msgs = null;
			if (rXA2 != null)
				msgs = ((InternalEObject)rXA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA2, null, msgs);
			if (newRXA2 != null)
				msgs = ((InternalEObject)newRXA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA2, null, msgs);
			msgs = basicSetRXA2(newRXA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA2, newRXA2, newRXA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA3CONTENT getRXA3() {
		return rXA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA3(RXA3CONTENT newRXA3, NotificationChain msgs) {
		RXA3CONTENT oldRXA3 = rXA3;
		rXA3 = newRXA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA3, oldRXA3, newRXA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA3(RXA3CONTENT newRXA3) {
		if (newRXA3 != rXA3) {
			NotificationChain msgs = null;
			if (rXA3 != null)
				msgs = ((InternalEObject)rXA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA3, null, msgs);
			if (newRXA3 != null)
				msgs = ((InternalEObject)newRXA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA3, null, msgs);
			msgs = basicSetRXA3(newRXA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA3, newRXA3, newRXA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA4CONTENT getRXA4() {
		return rXA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA4(RXA4CONTENT newRXA4, NotificationChain msgs) {
		RXA4CONTENT oldRXA4 = rXA4;
		rXA4 = newRXA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA4, oldRXA4, newRXA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA4(RXA4CONTENT newRXA4) {
		if (newRXA4 != rXA4) {
			NotificationChain msgs = null;
			if (rXA4 != null)
				msgs = ((InternalEObject)rXA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA4, null, msgs);
			if (newRXA4 != null)
				msgs = ((InternalEObject)newRXA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA4, null, msgs);
			msgs = basicSetRXA4(newRXA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA4, newRXA4, newRXA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA5CONTENT getRXA5() {
		return rXA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA5(RXA5CONTENT newRXA5, NotificationChain msgs) {
		RXA5CONTENT oldRXA5 = rXA5;
		rXA5 = newRXA5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA5, oldRXA5, newRXA5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA5(RXA5CONTENT newRXA5) {
		if (newRXA5 != rXA5) {
			NotificationChain msgs = null;
			if (rXA5 != null)
				msgs = ((InternalEObject)rXA5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA5, null, msgs);
			if (newRXA5 != null)
				msgs = ((InternalEObject)newRXA5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA5, null, msgs);
			msgs = basicSetRXA5(newRXA5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA5, newRXA5, newRXA5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA6CONTENT getRXA6() {
		return rXA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA6(RXA6CONTENT newRXA6, NotificationChain msgs) {
		RXA6CONTENT oldRXA6 = rXA6;
		rXA6 = newRXA6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA6, oldRXA6, newRXA6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA6(RXA6CONTENT newRXA6) {
		if (newRXA6 != rXA6) {
			NotificationChain msgs = null;
			if (rXA6 != null)
				msgs = ((InternalEObject)rXA6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA6, null, msgs);
			if (newRXA6 != null)
				msgs = ((InternalEObject)newRXA6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA6, null, msgs);
			msgs = basicSetRXA6(newRXA6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA6, newRXA6, newRXA6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA7CONTENT getRXA7() {
		return rXA7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA7(RXA7CONTENT newRXA7, NotificationChain msgs) {
		RXA7CONTENT oldRXA7 = rXA7;
		rXA7 = newRXA7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA7, oldRXA7, newRXA7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA7(RXA7CONTENT newRXA7) {
		if (newRXA7 != rXA7) {
			NotificationChain msgs = null;
			if (rXA7 != null)
				msgs = ((InternalEObject)rXA7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA7, null, msgs);
			if (newRXA7 != null)
				msgs = ((InternalEObject)newRXA7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA7, null, msgs);
			msgs = basicSetRXA7(newRXA7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA7, newRXA7, newRXA7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA8CONTENT getRXA8() {
		return rXA8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA8(RXA8CONTENT newRXA8, NotificationChain msgs) {
		RXA8CONTENT oldRXA8 = rXA8;
		rXA8 = newRXA8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA8, oldRXA8, newRXA8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA8(RXA8CONTENT newRXA8) {
		if (newRXA8 != rXA8) {
			NotificationChain msgs = null;
			if (rXA8 != null)
				msgs = ((InternalEObject)rXA8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA8, null, msgs);
			if (newRXA8 != null)
				msgs = ((InternalEObject)newRXA8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA8, null, msgs);
			msgs = basicSetRXA8(newRXA8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA8, newRXA8, newRXA8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA9CONTENT> getRXA9() {
		if (rXA9 == null) {
			rXA9 = new EObjectContainmentEList<RXA9CONTENT>(RXA9CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA9);
		}
		return rXA9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA10CONTENT> getRXA10() {
		if (rXA10 == null) {
			rXA10 = new EObjectContainmentEList<RXA10CONTENT>(RXA10CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA10);
		}
		return rXA10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA11CONTENT getRXA11() {
		return rXA11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA11(RXA11CONTENT newRXA11, NotificationChain msgs) {
		RXA11CONTENT oldRXA11 = rXA11;
		rXA11 = newRXA11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA11, oldRXA11, newRXA11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA11(RXA11CONTENT newRXA11) {
		if (newRXA11 != rXA11) {
			NotificationChain msgs = null;
			if (rXA11 != null)
				msgs = ((InternalEObject)rXA11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA11, null, msgs);
			if (newRXA11 != null)
				msgs = ((InternalEObject)newRXA11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA11, null, msgs);
			msgs = basicSetRXA11(newRXA11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA11, newRXA11, newRXA11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA12CONTENT getRXA12() {
		return rXA12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA12(RXA12CONTENT newRXA12, NotificationChain msgs) {
		RXA12CONTENT oldRXA12 = rXA12;
		rXA12 = newRXA12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA12, oldRXA12, newRXA12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA12(RXA12CONTENT newRXA12) {
		if (newRXA12 != rXA12) {
			NotificationChain msgs = null;
			if (rXA12 != null)
				msgs = ((InternalEObject)rXA12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA12, null, msgs);
			if (newRXA12 != null)
				msgs = ((InternalEObject)newRXA12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA12, null, msgs);
			msgs = basicSetRXA12(newRXA12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA12, newRXA12, newRXA12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA13CONTENT getRXA13() {
		return rXA13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA13(RXA13CONTENT newRXA13, NotificationChain msgs) {
		RXA13CONTENT oldRXA13 = rXA13;
		rXA13 = newRXA13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA13, oldRXA13, newRXA13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA13(RXA13CONTENT newRXA13) {
		if (newRXA13 != rXA13) {
			NotificationChain msgs = null;
			if (rXA13 != null)
				msgs = ((InternalEObject)rXA13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA13, null, msgs);
			if (newRXA13 != null)
				msgs = ((InternalEObject)newRXA13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA13, null, msgs);
			msgs = basicSetRXA13(newRXA13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA13, newRXA13, newRXA13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA14CONTENT getRXA14() {
		return rXA14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA14(RXA14CONTENT newRXA14, NotificationChain msgs) {
		RXA14CONTENT oldRXA14 = rXA14;
		rXA14 = newRXA14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA14, oldRXA14, newRXA14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA14(RXA14CONTENT newRXA14) {
		if (newRXA14 != rXA14) {
			NotificationChain msgs = null;
			if (rXA14 != null)
				msgs = ((InternalEObject)rXA14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA14, null, msgs);
			if (newRXA14 != null)
				msgs = ((InternalEObject)newRXA14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA14, null, msgs);
			msgs = basicSetRXA14(newRXA14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA14, newRXA14, newRXA14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA15CONTENT> getRXA15() {
		if (rXA15 == null) {
			rXA15 = new EObjectContainmentEList<RXA15CONTENT>(RXA15CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA15);
		}
		return rXA15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA16CONTENT> getRXA16() {
		if (rXA16 == null) {
			rXA16 = new EObjectContainmentEList<RXA16CONTENT>(RXA16CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA16);
		}
		return rXA16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA17CONTENT> getRXA17() {
		if (rXA17 == null) {
			rXA17 = new EObjectContainmentEList<RXA17CONTENT>(RXA17CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA17);
		}
		return rXA17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA18CONTENT> getRXA18() {
		if (rXA18 == null) {
			rXA18 = new EObjectContainmentEList<RXA18CONTENT>(RXA18CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA18);
		}
		return rXA18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXA19CONTENT> getRXA19() {
		if (rXA19 == null) {
			rXA19 = new EObjectContainmentEList<RXA19CONTENT>(RXA19CONTENT.class, this, V2xmlPackage.RXACONTENT__RXA19);
		}
		return rXA19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA20CONTENT getRXA20() {
		return rXA20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA20(RXA20CONTENT newRXA20, NotificationChain msgs) {
		RXA20CONTENT oldRXA20 = rXA20;
		rXA20 = newRXA20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA20, oldRXA20, newRXA20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA20(RXA20CONTENT newRXA20) {
		if (newRXA20 != rXA20) {
			NotificationChain msgs = null;
			if (rXA20 != null)
				msgs = ((InternalEObject)rXA20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA20, null, msgs);
			if (newRXA20 != null)
				msgs = ((InternalEObject)newRXA20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA20, null, msgs);
			msgs = basicSetRXA20(newRXA20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA20, newRXA20, newRXA20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA21CONTENT getRXA21() {
		return rXA21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA21(RXA21CONTENT newRXA21, NotificationChain msgs) {
		RXA21CONTENT oldRXA21 = rXA21;
		rXA21 = newRXA21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA21, oldRXA21, newRXA21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA21(RXA21CONTENT newRXA21) {
		if (newRXA21 != rXA21) {
			NotificationChain msgs = null;
			if (rXA21 != null)
				msgs = ((InternalEObject)rXA21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA21, null, msgs);
			if (newRXA21 != null)
				msgs = ((InternalEObject)newRXA21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA21, null, msgs);
			msgs = basicSetRXA21(newRXA21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA21, newRXA21, newRXA21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA22CONTENT getRXA22() {
		return rXA22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA22(RXA22CONTENT newRXA22, NotificationChain msgs) {
		RXA22CONTENT oldRXA22 = rXA22;
		rXA22 = newRXA22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA22, oldRXA22, newRXA22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA22(RXA22CONTENT newRXA22) {
		if (newRXA22 != rXA22) {
			NotificationChain msgs = null;
			if (rXA22 != null)
				msgs = ((InternalEObject)rXA22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA22, null, msgs);
			if (newRXA22 != null)
				msgs = ((InternalEObject)newRXA22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA22, null, msgs);
			msgs = basicSetRXA22(newRXA22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA22, newRXA22, newRXA22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA23CONTENT getRXA23() {
		return rXA23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA23(RXA23CONTENT newRXA23, NotificationChain msgs) {
		RXA23CONTENT oldRXA23 = rXA23;
		rXA23 = newRXA23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA23, oldRXA23, newRXA23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA23(RXA23CONTENT newRXA23) {
		if (newRXA23 != rXA23) {
			NotificationChain msgs = null;
			if (rXA23 != null)
				msgs = ((InternalEObject)rXA23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA23, null, msgs);
			if (newRXA23 != null)
				msgs = ((InternalEObject)newRXA23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA23, null, msgs);
			msgs = basicSetRXA23(newRXA23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA23, newRXA23, newRXA23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA24CONTENT getRXA24() {
		return rXA24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA24(RXA24CONTENT newRXA24, NotificationChain msgs) {
		RXA24CONTENT oldRXA24 = rXA24;
		rXA24 = newRXA24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA24, oldRXA24, newRXA24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA24(RXA24CONTENT newRXA24) {
		if (newRXA24 != rXA24) {
			NotificationChain msgs = null;
			if (rXA24 != null)
				msgs = ((InternalEObject)rXA24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA24, null, msgs);
			if (newRXA24 != null)
				msgs = ((InternalEObject)newRXA24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA24, null, msgs);
			msgs = basicSetRXA24(newRXA24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA24, newRXA24, newRXA24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA25CONTENT getRXA25() {
		return rXA25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA25(RXA25CONTENT newRXA25, NotificationChain msgs) {
		RXA25CONTENT oldRXA25 = rXA25;
		rXA25 = newRXA25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA25, oldRXA25, newRXA25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA25(RXA25CONTENT newRXA25) {
		if (newRXA25 != rXA25) {
			NotificationChain msgs = null;
			if (rXA25 != null)
				msgs = ((InternalEObject)rXA25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA25, null, msgs);
			if (newRXA25 != null)
				msgs = ((InternalEObject)newRXA25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA25, null, msgs);
			msgs = basicSetRXA25(newRXA25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA25, newRXA25, newRXA25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXA26CONTENT getRXA26() {
		return rXA26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXA26(RXA26CONTENT newRXA26, NotificationChain msgs) {
		RXA26CONTENT oldRXA26 = rXA26;
		rXA26 = newRXA26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA26, oldRXA26, newRXA26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXA26(RXA26CONTENT newRXA26) {
		if (newRXA26 != rXA26) {
			NotificationChain msgs = null;
			if (rXA26 != null)
				msgs = ((InternalEObject)rXA26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA26, null, msgs);
			if (newRXA26 != null)
				msgs = ((InternalEObject)newRXA26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXACONTENT__RXA26, null, msgs);
			msgs = basicSetRXA26(newRXA26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXACONTENT__RXA26, newRXA26, newRXA26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXACONTENT__ANY);
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
			case V2xmlPackage.RXACONTENT__RXA1:
				return basicSetRXA1(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA2:
				return basicSetRXA2(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA3:
				return basicSetRXA3(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA4:
				return basicSetRXA4(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA5:
				return basicSetRXA5(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA6:
				return basicSetRXA6(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA7:
				return basicSetRXA7(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA8:
				return basicSetRXA8(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA9:
				return ((InternalEList<?>)getRXA9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA10:
				return ((InternalEList<?>)getRXA10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA11:
				return basicSetRXA11(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA12:
				return basicSetRXA12(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA13:
				return basicSetRXA13(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA14:
				return basicSetRXA14(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA15:
				return ((InternalEList<?>)getRXA15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA16:
				return ((InternalEList<?>)getRXA16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA17:
				return ((InternalEList<?>)getRXA17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA18:
				return ((InternalEList<?>)getRXA18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA19:
				return ((InternalEList<?>)getRXA19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXACONTENT__RXA20:
				return basicSetRXA20(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA21:
				return basicSetRXA21(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA22:
				return basicSetRXA22(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA23:
				return basicSetRXA23(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA24:
				return basicSetRXA24(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA25:
				return basicSetRXA25(null, msgs);
			case V2xmlPackage.RXACONTENT__RXA26:
				return basicSetRXA26(null, msgs);
			case V2xmlPackage.RXACONTENT__ANY:
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
			case V2xmlPackage.RXACONTENT__RXA1:
				return getRXA1();
			case V2xmlPackage.RXACONTENT__RXA2:
				return getRXA2();
			case V2xmlPackage.RXACONTENT__RXA3:
				return getRXA3();
			case V2xmlPackage.RXACONTENT__RXA4:
				return getRXA4();
			case V2xmlPackage.RXACONTENT__RXA5:
				return getRXA5();
			case V2xmlPackage.RXACONTENT__RXA6:
				return getRXA6();
			case V2xmlPackage.RXACONTENT__RXA7:
				return getRXA7();
			case V2xmlPackage.RXACONTENT__RXA8:
				return getRXA8();
			case V2xmlPackage.RXACONTENT__RXA9:
				return getRXA9();
			case V2xmlPackage.RXACONTENT__RXA10:
				return getRXA10();
			case V2xmlPackage.RXACONTENT__RXA11:
				return getRXA11();
			case V2xmlPackage.RXACONTENT__RXA12:
				return getRXA12();
			case V2xmlPackage.RXACONTENT__RXA13:
				return getRXA13();
			case V2xmlPackage.RXACONTENT__RXA14:
				return getRXA14();
			case V2xmlPackage.RXACONTENT__RXA15:
				return getRXA15();
			case V2xmlPackage.RXACONTENT__RXA16:
				return getRXA16();
			case V2xmlPackage.RXACONTENT__RXA17:
				return getRXA17();
			case V2xmlPackage.RXACONTENT__RXA18:
				return getRXA18();
			case V2xmlPackage.RXACONTENT__RXA19:
				return getRXA19();
			case V2xmlPackage.RXACONTENT__RXA20:
				return getRXA20();
			case V2xmlPackage.RXACONTENT__RXA21:
				return getRXA21();
			case V2xmlPackage.RXACONTENT__RXA22:
				return getRXA22();
			case V2xmlPackage.RXACONTENT__RXA23:
				return getRXA23();
			case V2xmlPackage.RXACONTENT__RXA24:
				return getRXA24();
			case V2xmlPackage.RXACONTENT__RXA25:
				return getRXA25();
			case V2xmlPackage.RXACONTENT__RXA26:
				return getRXA26();
			case V2xmlPackage.RXACONTENT__ANY:
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
			case V2xmlPackage.RXACONTENT__RXA1:
				setRXA1((RXA1CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA2:
				setRXA2((RXA2CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA3:
				setRXA3((RXA3CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA4:
				setRXA4((RXA4CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA5:
				setRXA5((RXA5CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA6:
				setRXA6((RXA6CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA7:
				setRXA7((RXA7CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA8:
				setRXA8((RXA8CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA9:
				getRXA9().clear();
				getRXA9().addAll((Collection<? extends RXA9CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA10:
				getRXA10().clear();
				getRXA10().addAll((Collection<? extends RXA10CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA11:
				setRXA11((RXA11CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA12:
				setRXA12((RXA12CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA13:
				setRXA13((RXA13CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA14:
				setRXA14((RXA14CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA15:
				getRXA15().clear();
				getRXA15().addAll((Collection<? extends RXA15CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA16:
				getRXA16().clear();
				getRXA16().addAll((Collection<? extends RXA16CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA17:
				getRXA17().clear();
				getRXA17().addAll((Collection<? extends RXA17CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA18:
				getRXA18().clear();
				getRXA18().addAll((Collection<? extends RXA18CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA19:
				getRXA19().clear();
				getRXA19().addAll((Collection<? extends RXA19CONTENT>)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA20:
				setRXA20((RXA20CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA21:
				setRXA21((RXA21CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA22:
				setRXA22((RXA22CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA23:
				setRXA23((RXA23CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA24:
				setRXA24((RXA24CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA25:
				setRXA25((RXA25CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__RXA26:
				setRXA26((RXA26CONTENT)newValue);
				return;
			case V2xmlPackage.RXACONTENT__ANY:
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
			case V2xmlPackage.RXACONTENT__RXA1:
				setRXA1((RXA1CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA2:
				setRXA2((RXA2CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA3:
				setRXA3((RXA3CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA4:
				setRXA4((RXA4CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA5:
				setRXA5((RXA5CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA6:
				setRXA6((RXA6CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA7:
				setRXA7((RXA7CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA8:
				setRXA8((RXA8CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA9:
				getRXA9().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA10:
				getRXA10().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA11:
				setRXA11((RXA11CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA12:
				setRXA12((RXA12CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA13:
				setRXA13((RXA13CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA14:
				setRXA14((RXA14CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA15:
				getRXA15().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA16:
				getRXA16().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA17:
				getRXA17().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA18:
				getRXA18().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA19:
				getRXA19().clear();
				return;
			case V2xmlPackage.RXACONTENT__RXA20:
				setRXA20((RXA20CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA21:
				setRXA21((RXA21CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA22:
				setRXA22((RXA22CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA23:
				setRXA23((RXA23CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA24:
				setRXA24((RXA24CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA25:
				setRXA25((RXA25CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__RXA26:
				setRXA26((RXA26CONTENT)null);
				return;
			case V2xmlPackage.RXACONTENT__ANY:
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
			case V2xmlPackage.RXACONTENT__RXA1:
				return rXA1 != null;
			case V2xmlPackage.RXACONTENT__RXA2:
				return rXA2 != null;
			case V2xmlPackage.RXACONTENT__RXA3:
				return rXA3 != null;
			case V2xmlPackage.RXACONTENT__RXA4:
				return rXA4 != null;
			case V2xmlPackage.RXACONTENT__RXA5:
				return rXA5 != null;
			case V2xmlPackage.RXACONTENT__RXA6:
				return rXA6 != null;
			case V2xmlPackage.RXACONTENT__RXA7:
				return rXA7 != null;
			case V2xmlPackage.RXACONTENT__RXA8:
				return rXA8 != null;
			case V2xmlPackage.RXACONTENT__RXA9:
				return rXA9 != null && !rXA9.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA10:
				return rXA10 != null && !rXA10.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA11:
				return rXA11 != null;
			case V2xmlPackage.RXACONTENT__RXA12:
				return rXA12 != null;
			case V2xmlPackage.RXACONTENT__RXA13:
				return rXA13 != null;
			case V2xmlPackage.RXACONTENT__RXA14:
				return rXA14 != null;
			case V2xmlPackage.RXACONTENT__RXA15:
				return rXA15 != null && !rXA15.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA16:
				return rXA16 != null && !rXA16.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA17:
				return rXA17 != null && !rXA17.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA18:
				return rXA18 != null && !rXA18.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA19:
				return rXA19 != null && !rXA19.isEmpty();
			case V2xmlPackage.RXACONTENT__RXA20:
				return rXA20 != null;
			case V2xmlPackage.RXACONTENT__RXA21:
				return rXA21 != null;
			case V2xmlPackage.RXACONTENT__RXA22:
				return rXA22 != null;
			case V2xmlPackage.RXACONTENT__RXA23:
				return rXA23 != null;
			case V2xmlPackage.RXACONTENT__RXA24:
				return rXA24 != null;
			case V2xmlPackage.RXACONTENT__RXA25:
				return rXA25 != null;
			case V2xmlPackage.RXACONTENT__RXA26:
				return rXA26 != null;
			case V2xmlPackage.RXACONTENT__ANY:
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

} //RXACONTENTImpl
