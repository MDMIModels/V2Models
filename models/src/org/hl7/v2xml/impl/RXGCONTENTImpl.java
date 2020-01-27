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

import org.hl7.v2xml.RXG10CONTENT;
import org.hl7.v2xml.RXG11CONTENT;
import org.hl7.v2xml.RXG12CONTENT;
import org.hl7.v2xml.RXG13CONTENT;
import org.hl7.v2xml.RXG14CONTENT;
import org.hl7.v2xml.RXG15CONTENT;
import org.hl7.v2xml.RXG16CONTENT;
import org.hl7.v2xml.RXG17CONTENT;
import org.hl7.v2xml.RXG18CONTENT;
import org.hl7.v2xml.RXG19CONTENT;
import org.hl7.v2xml.RXG1CONTENT;
import org.hl7.v2xml.RXG20CONTENT;
import org.hl7.v2xml.RXG21CONTENT;
import org.hl7.v2xml.RXG22CONTENT;
import org.hl7.v2xml.RXG23CONTENT;
import org.hl7.v2xml.RXG24CONTENT;
import org.hl7.v2xml.RXG25CONTENT;
import org.hl7.v2xml.RXG26CONTENT;
import org.hl7.v2xml.RXG2CONTENT;
import org.hl7.v2xml.RXG3CONTENT;
import org.hl7.v2xml.RXG4CONTENT;
import org.hl7.v2xml.RXG5CONTENT;
import org.hl7.v2xml.RXG6CONTENT;
import org.hl7.v2xml.RXG7CONTENT;
import org.hl7.v2xml.RXG8CONTENT;
import org.hl7.v2xml.RXG9CONTENT;
import org.hl7.v2xml.RXGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG1 <em>RXG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG2 <em>RXG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG3 <em>RXG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG4 <em>RXG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG5 <em>RXG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG6 <em>RXG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG7 <em>RXG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG8 <em>RXG8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG9 <em>RXG9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG10 <em>RXG10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG11 <em>RXG11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG12 <em>RXG12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG13 <em>RXG13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG14 <em>RXG14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG15 <em>RXG15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG16 <em>RXG16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG17 <em>RXG17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG18 <em>RXG18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG19 <em>RXG19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG20 <em>RXG20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG21 <em>RXG21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG22 <em>RXG22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG23 <em>RXG23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG24 <em>RXG24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG25 <em>RXG25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getRXG26 <em>RXG26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXGCONTENTImpl extends EObjectImpl implements RXGCONTENT {
	/**
	 * The cached value of the '{@link #getRXG1() <em>RXG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG1()
	 * @generated
	 * @ordered
	 */
	protected RXG1CONTENT rXG1;

	/**
	 * The cached value of the '{@link #getRXG2() <em>RXG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG2()
	 * @generated
	 * @ordered
	 */
	protected RXG2CONTENT rXG2;

	/**
	 * The cached value of the '{@link #getRXG3() <em>RXG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG3()
	 * @generated
	 * @ordered
	 */
	protected RXG3CONTENT rXG3;

	/**
	 * The cached value of the '{@link #getRXG4() <em>RXG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG4()
	 * @generated
	 * @ordered
	 */
	protected RXG4CONTENT rXG4;

	/**
	 * The cached value of the '{@link #getRXG5() <em>RXG5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG5()
	 * @generated
	 * @ordered
	 */
	protected RXG5CONTENT rXG5;

	/**
	 * The cached value of the '{@link #getRXG6() <em>RXG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG6()
	 * @generated
	 * @ordered
	 */
	protected RXG6CONTENT rXG6;

	/**
	 * The cached value of the '{@link #getRXG7() <em>RXG7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG7()
	 * @generated
	 * @ordered
	 */
	protected RXG7CONTENT rXG7;

	/**
	 * The cached value of the '{@link #getRXG8() <em>RXG8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG8()
	 * @generated
	 * @ordered
	 */
	protected RXG8CONTENT rXG8;

	/**
	 * The cached value of the '{@link #getRXG9() <em>RXG9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG9()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG9CONTENT> rXG9;

	/**
	 * The cached value of the '{@link #getRXG10() <em>RXG10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG10()
	 * @generated
	 * @ordered
	 */
	protected RXG10CONTENT rXG10;

	/**
	 * The cached value of the '{@link #getRXG11() <em>RXG11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG11()
	 * @generated
	 * @ordered
	 */
	protected RXG11CONTENT rXG11;

	/**
	 * The cached value of the '{@link #getRXG12() <em>RXG12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG12()
	 * @generated
	 * @ordered
	 */
	protected RXG12CONTENT rXG12;

	/**
	 * The cached value of the '{@link #getRXG13() <em>RXG13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG13()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG13CONTENT> rXG13;

	/**
	 * The cached value of the '{@link #getRXG14() <em>RXG14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG14()
	 * @generated
	 * @ordered
	 */
	protected RXG14CONTENT rXG14;

	/**
	 * The cached value of the '{@link #getRXG15() <em>RXG15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG15()
	 * @generated
	 * @ordered
	 */
	protected RXG15CONTENT rXG15;

	/**
	 * The cached value of the '{@link #getRXG16() <em>RXG16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG16()
	 * @generated
	 * @ordered
	 */
	protected RXG16CONTENT rXG16;

	/**
	 * The cached value of the '{@link #getRXG17() <em>RXG17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG17()
	 * @generated
	 * @ordered
	 */
	protected RXG17CONTENT rXG17;

	/**
	 * The cached value of the '{@link #getRXG18() <em>RXG18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG18()
	 * @generated
	 * @ordered
	 */
	protected RXG18CONTENT rXG18;

	/**
	 * The cached value of the '{@link #getRXG19() <em>RXG19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG19()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG19CONTENT> rXG19;

	/**
	 * The cached value of the '{@link #getRXG20() <em>RXG20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG20()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG20CONTENT> rXG20;

	/**
	 * The cached value of the '{@link #getRXG21() <em>RXG21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG21()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG21CONTENT> rXG21;

	/**
	 * The cached value of the '{@link #getRXG22() <em>RXG22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG22()
	 * @generated
	 * @ordered
	 */
	protected EList<RXG22CONTENT> rXG22;

	/**
	 * The cached value of the '{@link #getRXG23() <em>RXG23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG23()
	 * @generated
	 * @ordered
	 */
	protected RXG23CONTENT rXG23;

	/**
	 * The cached value of the '{@link #getRXG24() <em>RXG24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG24()
	 * @generated
	 * @ordered
	 */
	protected RXG24CONTENT rXG24;

	/**
	 * The cached value of the '{@link #getRXG25() <em>RXG25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG25()
	 * @generated
	 * @ordered
	 */
	protected RXG25CONTENT rXG25;

	/**
	 * The cached value of the '{@link #getRXG26() <em>RXG26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXG26()
	 * @generated
	 * @ordered
	 */
	protected RXG26CONTENT rXG26;

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
	protected RXGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG1CONTENT getRXG1() {
		return rXG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG1(RXG1CONTENT newRXG1, NotificationChain msgs) {
		RXG1CONTENT oldRXG1 = rXG1;
		rXG1 = newRXG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG1, oldRXG1, newRXG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG1(RXG1CONTENT newRXG1) {
		if (newRXG1 != rXG1) {
			NotificationChain msgs = null;
			if (rXG1 != null)
				msgs = ((InternalEObject)rXG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG1, null, msgs);
			if (newRXG1 != null)
				msgs = ((InternalEObject)newRXG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG1, null, msgs);
			msgs = basicSetRXG1(newRXG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG1, newRXG1, newRXG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG2CONTENT getRXG2() {
		return rXG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG2(RXG2CONTENT newRXG2, NotificationChain msgs) {
		RXG2CONTENT oldRXG2 = rXG2;
		rXG2 = newRXG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG2, oldRXG2, newRXG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG2(RXG2CONTENT newRXG2) {
		if (newRXG2 != rXG2) {
			NotificationChain msgs = null;
			if (rXG2 != null)
				msgs = ((InternalEObject)rXG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG2, null, msgs);
			if (newRXG2 != null)
				msgs = ((InternalEObject)newRXG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG2, null, msgs);
			msgs = basicSetRXG2(newRXG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG2, newRXG2, newRXG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG3CONTENT getRXG3() {
		return rXG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG3(RXG3CONTENT newRXG3, NotificationChain msgs) {
		RXG3CONTENT oldRXG3 = rXG3;
		rXG3 = newRXG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG3, oldRXG3, newRXG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG3(RXG3CONTENT newRXG3) {
		if (newRXG3 != rXG3) {
			NotificationChain msgs = null;
			if (rXG3 != null)
				msgs = ((InternalEObject)rXG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG3, null, msgs);
			if (newRXG3 != null)
				msgs = ((InternalEObject)newRXG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG3, null, msgs);
			msgs = basicSetRXG3(newRXG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG3, newRXG3, newRXG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG4CONTENT getRXG4() {
		return rXG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG4(RXG4CONTENT newRXG4, NotificationChain msgs) {
		RXG4CONTENT oldRXG4 = rXG4;
		rXG4 = newRXG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG4, oldRXG4, newRXG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG4(RXG4CONTENT newRXG4) {
		if (newRXG4 != rXG4) {
			NotificationChain msgs = null;
			if (rXG4 != null)
				msgs = ((InternalEObject)rXG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG4, null, msgs);
			if (newRXG4 != null)
				msgs = ((InternalEObject)newRXG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG4, null, msgs);
			msgs = basicSetRXG4(newRXG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG4, newRXG4, newRXG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG5CONTENT getRXG5() {
		return rXG5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG5(RXG5CONTENT newRXG5, NotificationChain msgs) {
		RXG5CONTENT oldRXG5 = rXG5;
		rXG5 = newRXG5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG5, oldRXG5, newRXG5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG5(RXG5CONTENT newRXG5) {
		if (newRXG5 != rXG5) {
			NotificationChain msgs = null;
			if (rXG5 != null)
				msgs = ((InternalEObject)rXG5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG5, null, msgs);
			if (newRXG5 != null)
				msgs = ((InternalEObject)newRXG5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG5, null, msgs);
			msgs = basicSetRXG5(newRXG5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG5, newRXG5, newRXG5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG6CONTENT getRXG6() {
		return rXG6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG6(RXG6CONTENT newRXG6, NotificationChain msgs) {
		RXG6CONTENT oldRXG6 = rXG6;
		rXG6 = newRXG6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG6, oldRXG6, newRXG6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG6(RXG6CONTENT newRXG6) {
		if (newRXG6 != rXG6) {
			NotificationChain msgs = null;
			if (rXG6 != null)
				msgs = ((InternalEObject)rXG6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG6, null, msgs);
			if (newRXG6 != null)
				msgs = ((InternalEObject)newRXG6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG6, null, msgs);
			msgs = basicSetRXG6(newRXG6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG6, newRXG6, newRXG6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG7CONTENT getRXG7() {
		return rXG7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG7(RXG7CONTENT newRXG7, NotificationChain msgs) {
		RXG7CONTENT oldRXG7 = rXG7;
		rXG7 = newRXG7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG7, oldRXG7, newRXG7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG7(RXG7CONTENT newRXG7) {
		if (newRXG7 != rXG7) {
			NotificationChain msgs = null;
			if (rXG7 != null)
				msgs = ((InternalEObject)rXG7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG7, null, msgs);
			if (newRXG7 != null)
				msgs = ((InternalEObject)newRXG7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG7, null, msgs);
			msgs = basicSetRXG7(newRXG7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG7, newRXG7, newRXG7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG8CONTENT getRXG8() {
		return rXG8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG8(RXG8CONTENT newRXG8, NotificationChain msgs) {
		RXG8CONTENT oldRXG8 = rXG8;
		rXG8 = newRXG8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG8, oldRXG8, newRXG8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG8(RXG8CONTENT newRXG8) {
		if (newRXG8 != rXG8) {
			NotificationChain msgs = null;
			if (rXG8 != null)
				msgs = ((InternalEObject)rXG8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG8, null, msgs);
			if (newRXG8 != null)
				msgs = ((InternalEObject)newRXG8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG8, null, msgs);
			msgs = basicSetRXG8(newRXG8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG8, newRXG8, newRXG8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG9CONTENT> getRXG9() {
		if (rXG9 == null) {
			rXG9 = new EObjectContainmentEList<RXG9CONTENT>(RXG9CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG9);
		}
		return rXG9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG10CONTENT getRXG10() {
		return rXG10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG10(RXG10CONTENT newRXG10, NotificationChain msgs) {
		RXG10CONTENT oldRXG10 = rXG10;
		rXG10 = newRXG10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG10, oldRXG10, newRXG10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG10(RXG10CONTENT newRXG10) {
		if (newRXG10 != rXG10) {
			NotificationChain msgs = null;
			if (rXG10 != null)
				msgs = ((InternalEObject)rXG10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG10, null, msgs);
			if (newRXG10 != null)
				msgs = ((InternalEObject)newRXG10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG10, null, msgs);
			msgs = basicSetRXG10(newRXG10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG10, newRXG10, newRXG10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG11CONTENT getRXG11() {
		return rXG11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG11(RXG11CONTENT newRXG11, NotificationChain msgs) {
		RXG11CONTENT oldRXG11 = rXG11;
		rXG11 = newRXG11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG11, oldRXG11, newRXG11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG11(RXG11CONTENT newRXG11) {
		if (newRXG11 != rXG11) {
			NotificationChain msgs = null;
			if (rXG11 != null)
				msgs = ((InternalEObject)rXG11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG11, null, msgs);
			if (newRXG11 != null)
				msgs = ((InternalEObject)newRXG11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG11, null, msgs);
			msgs = basicSetRXG11(newRXG11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG11, newRXG11, newRXG11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG12CONTENT getRXG12() {
		return rXG12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG12(RXG12CONTENT newRXG12, NotificationChain msgs) {
		RXG12CONTENT oldRXG12 = rXG12;
		rXG12 = newRXG12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG12, oldRXG12, newRXG12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG12(RXG12CONTENT newRXG12) {
		if (newRXG12 != rXG12) {
			NotificationChain msgs = null;
			if (rXG12 != null)
				msgs = ((InternalEObject)rXG12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG12, null, msgs);
			if (newRXG12 != null)
				msgs = ((InternalEObject)newRXG12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG12, null, msgs);
			msgs = basicSetRXG12(newRXG12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG12, newRXG12, newRXG12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG13CONTENT> getRXG13() {
		if (rXG13 == null) {
			rXG13 = new EObjectContainmentEList<RXG13CONTENT>(RXG13CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG13);
		}
		return rXG13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG14CONTENT getRXG14() {
		return rXG14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG14(RXG14CONTENT newRXG14, NotificationChain msgs) {
		RXG14CONTENT oldRXG14 = rXG14;
		rXG14 = newRXG14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG14, oldRXG14, newRXG14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG14(RXG14CONTENT newRXG14) {
		if (newRXG14 != rXG14) {
			NotificationChain msgs = null;
			if (rXG14 != null)
				msgs = ((InternalEObject)rXG14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG14, null, msgs);
			if (newRXG14 != null)
				msgs = ((InternalEObject)newRXG14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG14, null, msgs);
			msgs = basicSetRXG14(newRXG14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG14, newRXG14, newRXG14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG15CONTENT getRXG15() {
		return rXG15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG15(RXG15CONTENT newRXG15, NotificationChain msgs) {
		RXG15CONTENT oldRXG15 = rXG15;
		rXG15 = newRXG15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG15, oldRXG15, newRXG15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG15(RXG15CONTENT newRXG15) {
		if (newRXG15 != rXG15) {
			NotificationChain msgs = null;
			if (rXG15 != null)
				msgs = ((InternalEObject)rXG15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG15, null, msgs);
			if (newRXG15 != null)
				msgs = ((InternalEObject)newRXG15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG15, null, msgs);
			msgs = basicSetRXG15(newRXG15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG15, newRXG15, newRXG15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG16CONTENT getRXG16() {
		return rXG16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG16(RXG16CONTENT newRXG16, NotificationChain msgs) {
		RXG16CONTENT oldRXG16 = rXG16;
		rXG16 = newRXG16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG16, oldRXG16, newRXG16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG16(RXG16CONTENT newRXG16) {
		if (newRXG16 != rXG16) {
			NotificationChain msgs = null;
			if (rXG16 != null)
				msgs = ((InternalEObject)rXG16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG16, null, msgs);
			if (newRXG16 != null)
				msgs = ((InternalEObject)newRXG16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG16, null, msgs);
			msgs = basicSetRXG16(newRXG16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG16, newRXG16, newRXG16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG17CONTENT getRXG17() {
		return rXG17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG17(RXG17CONTENT newRXG17, NotificationChain msgs) {
		RXG17CONTENT oldRXG17 = rXG17;
		rXG17 = newRXG17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG17, oldRXG17, newRXG17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG17(RXG17CONTENT newRXG17) {
		if (newRXG17 != rXG17) {
			NotificationChain msgs = null;
			if (rXG17 != null)
				msgs = ((InternalEObject)rXG17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG17, null, msgs);
			if (newRXG17 != null)
				msgs = ((InternalEObject)newRXG17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG17, null, msgs);
			msgs = basicSetRXG17(newRXG17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG17, newRXG17, newRXG17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG18CONTENT getRXG18() {
		return rXG18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG18(RXG18CONTENT newRXG18, NotificationChain msgs) {
		RXG18CONTENT oldRXG18 = rXG18;
		rXG18 = newRXG18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG18, oldRXG18, newRXG18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG18(RXG18CONTENT newRXG18) {
		if (newRXG18 != rXG18) {
			NotificationChain msgs = null;
			if (rXG18 != null)
				msgs = ((InternalEObject)rXG18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG18, null, msgs);
			if (newRXG18 != null)
				msgs = ((InternalEObject)newRXG18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG18, null, msgs);
			msgs = basicSetRXG18(newRXG18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG18, newRXG18, newRXG18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG19CONTENT> getRXG19() {
		if (rXG19 == null) {
			rXG19 = new EObjectContainmentEList<RXG19CONTENT>(RXG19CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG19);
		}
		return rXG19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG20CONTENT> getRXG20() {
		if (rXG20 == null) {
			rXG20 = new EObjectContainmentEList<RXG20CONTENT>(RXG20CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG20);
		}
		return rXG20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG21CONTENT> getRXG21() {
		if (rXG21 == null) {
			rXG21 = new EObjectContainmentEList<RXG21CONTENT>(RXG21CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG21);
		}
		return rXG21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXG22CONTENT> getRXG22() {
		if (rXG22 == null) {
			rXG22 = new EObjectContainmentEList<RXG22CONTENT>(RXG22CONTENT.class, this, V2xmlPackage.RXGCONTENT__RXG22);
		}
		return rXG22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG23CONTENT getRXG23() {
		return rXG23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG23(RXG23CONTENT newRXG23, NotificationChain msgs) {
		RXG23CONTENT oldRXG23 = rXG23;
		rXG23 = newRXG23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG23, oldRXG23, newRXG23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG23(RXG23CONTENT newRXG23) {
		if (newRXG23 != rXG23) {
			NotificationChain msgs = null;
			if (rXG23 != null)
				msgs = ((InternalEObject)rXG23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG23, null, msgs);
			if (newRXG23 != null)
				msgs = ((InternalEObject)newRXG23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG23, null, msgs);
			msgs = basicSetRXG23(newRXG23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG23, newRXG23, newRXG23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG24CONTENT getRXG24() {
		return rXG24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG24(RXG24CONTENT newRXG24, NotificationChain msgs) {
		RXG24CONTENT oldRXG24 = rXG24;
		rXG24 = newRXG24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG24, oldRXG24, newRXG24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG24(RXG24CONTENT newRXG24) {
		if (newRXG24 != rXG24) {
			NotificationChain msgs = null;
			if (rXG24 != null)
				msgs = ((InternalEObject)rXG24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG24, null, msgs);
			if (newRXG24 != null)
				msgs = ((InternalEObject)newRXG24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG24, null, msgs);
			msgs = basicSetRXG24(newRXG24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG24, newRXG24, newRXG24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG25CONTENT getRXG25() {
		return rXG25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG25(RXG25CONTENT newRXG25, NotificationChain msgs) {
		RXG25CONTENT oldRXG25 = rXG25;
		rXG25 = newRXG25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG25, oldRXG25, newRXG25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG25(RXG25CONTENT newRXG25) {
		if (newRXG25 != rXG25) {
			NotificationChain msgs = null;
			if (rXG25 != null)
				msgs = ((InternalEObject)rXG25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG25, null, msgs);
			if (newRXG25 != null)
				msgs = ((InternalEObject)newRXG25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG25, null, msgs);
			msgs = basicSetRXG25(newRXG25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG25, newRXG25, newRXG25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXG26CONTENT getRXG26() {
		return rXG26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXG26(RXG26CONTENT newRXG26, NotificationChain msgs) {
		RXG26CONTENT oldRXG26 = rXG26;
		rXG26 = newRXG26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG26, oldRXG26, newRXG26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXG26(RXG26CONTENT newRXG26) {
		if (newRXG26 != rXG26) {
			NotificationChain msgs = null;
			if (rXG26 != null)
				msgs = ((InternalEObject)rXG26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG26, null, msgs);
			if (newRXG26 != null)
				msgs = ((InternalEObject)newRXG26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXGCONTENT__RXG26, null, msgs);
			msgs = basicSetRXG26(newRXG26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXGCONTENT__RXG26, newRXG26, newRXG26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXGCONTENT__ANY);
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
			case V2xmlPackage.RXGCONTENT__RXG1:
				return basicSetRXG1(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG2:
				return basicSetRXG2(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG3:
				return basicSetRXG3(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG4:
				return basicSetRXG4(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG5:
				return basicSetRXG5(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG6:
				return basicSetRXG6(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG7:
				return basicSetRXG7(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG8:
				return basicSetRXG8(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG9:
				return ((InternalEList<?>)getRXG9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG10:
				return basicSetRXG10(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG11:
				return basicSetRXG11(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG12:
				return basicSetRXG12(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG13:
				return ((InternalEList<?>)getRXG13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG14:
				return basicSetRXG14(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG15:
				return basicSetRXG15(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG16:
				return basicSetRXG16(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG17:
				return basicSetRXG17(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG18:
				return basicSetRXG18(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG19:
				return ((InternalEList<?>)getRXG19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG20:
				return ((InternalEList<?>)getRXG20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG21:
				return ((InternalEList<?>)getRXG21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG22:
				return ((InternalEList<?>)getRXG22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXGCONTENT__RXG23:
				return basicSetRXG23(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG24:
				return basicSetRXG24(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG25:
				return basicSetRXG25(null, msgs);
			case V2xmlPackage.RXGCONTENT__RXG26:
				return basicSetRXG26(null, msgs);
			case V2xmlPackage.RXGCONTENT__ANY:
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
			case V2xmlPackage.RXGCONTENT__RXG1:
				return getRXG1();
			case V2xmlPackage.RXGCONTENT__RXG2:
				return getRXG2();
			case V2xmlPackage.RXGCONTENT__RXG3:
				return getRXG3();
			case V2xmlPackage.RXGCONTENT__RXG4:
				return getRXG4();
			case V2xmlPackage.RXGCONTENT__RXG5:
				return getRXG5();
			case V2xmlPackage.RXGCONTENT__RXG6:
				return getRXG6();
			case V2xmlPackage.RXGCONTENT__RXG7:
				return getRXG7();
			case V2xmlPackage.RXGCONTENT__RXG8:
				return getRXG8();
			case V2xmlPackage.RXGCONTENT__RXG9:
				return getRXG9();
			case V2xmlPackage.RXGCONTENT__RXG10:
				return getRXG10();
			case V2xmlPackage.RXGCONTENT__RXG11:
				return getRXG11();
			case V2xmlPackage.RXGCONTENT__RXG12:
				return getRXG12();
			case V2xmlPackage.RXGCONTENT__RXG13:
				return getRXG13();
			case V2xmlPackage.RXGCONTENT__RXG14:
				return getRXG14();
			case V2xmlPackage.RXGCONTENT__RXG15:
				return getRXG15();
			case V2xmlPackage.RXGCONTENT__RXG16:
				return getRXG16();
			case V2xmlPackage.RXGCONTENT__RXG17:
				return getRXG17();
			case V2xmlPackage.RXGCONTENT__RXG18:
				return getRXG18();
			case V2xmlPackage.RXGCONTENT__RXG19:
				return getRXG19();
			case V2xmlPackage.RXGCONTENT__RXG20:
				return getRXG20();
			case V2xmlPackage.RXGCONTENT__RXG21:
				return getRXG21();
			case V2xmlPackage.RXGCONTENT__RXG22:
				return getRXG22();
			case V2xmlPackage.RXGCONTENT__RXG23:
				return getRXG23();
			case V2xmlPackage.RXGCONTENT__RXG24:
				return getRXG24();
			case V2xmlPackage.RXGCONTENT__RXG25:
				return getRXG25();
			case V2xmlPackage.RXGCONTENT__RXG26:
				return getRXG26();
			case V2xmlPackage.RXGCONTENT__ANY:
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
			case V2xmlPackage.RXGCONTENT__RXG1:
				setRXG1((RXG1CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG2:
				setRXG2((RXG2CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG3:
				setRXG3((RXG3CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG4:
				setRXG4((RXG4CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG5:
				setRXG5((RXG5CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG6:
				setRXG6((RXG6CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG7:
				setRXG7((RXG7CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG8:
				setRXG8((RXG8CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG9:
				getRXG9().clear();
				getRXG9().addAll((Collection<? extends RXG9CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG10:
				setRXG10((RXG10CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG11:
				setRXG11((RXG11CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG12:
				setRXG12((RXG12CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG13:
				getRXG13().clear();
				getRXG13().addAll((Collection<? extends RXG13CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG14:
				setRXG14((RXG14CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG15:
				setRXG15((RXG15CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG16:
				setRXG16((RXG16CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG17:
				setRXG17((RXG17CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG18:
				setRXG18((RXG18CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG19:
				getRXG19().clear();
				getRXG19().addAll((Collection<? extends RXG19CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG20:
				getRXG20().clear();
				getRXG20().addAll((Collection<? extends RXG20CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG21:
				getRXG21().clear();
				getRXG21().addAll((Collection<? extends RXG21CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG22:
				getRXG22().clear();
				getRXG22().addAll((Collection<? extends RXG22CONTENT>)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG23:
				setRXG23((RXG23CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG24:
				setRXG24((RXG24CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG25:
				setRXG25((RXG25CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__RXG26:
				setRXG26((RXG26CONTENT)newValue);
				return;
			case V2xmlPackage.RXGCONTENT__ANY:
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
			case V2xmlPackage.RXGCONTENT__RXG1:
				setRXG1((RXG1CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG2:
				setRXG2((RXG2CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG3:
				setRXG3((RXG3CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG4:
				setRXG4((RXG4CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG5:
				setRXG5((RXG5CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG6:
				setRXG6((RXG6CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG7:
				setRXG7((RXG7CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG8:
				setRXG8((RXG8CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG9:
				getRXG9().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG10:
				setRXG10((RXG10CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG11:
				setRXG11((RXG11CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG12:
				setRXG12((RXG12CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG13:
				getRXG13().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG14:
				setRXG14((RXG14CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG15:
				setRXG15((RXG15CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG16:
				setRXG16((RXG16CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG17:
				setRXG17((RXG17CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG18:
				setRXG18((RXG18CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG19:
				getRXG19().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG20:
				getRXG20().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG21:
				getRXG21().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG22:
				getRXG22().clear();
				return;
			case V2xmlPackage.RXGCONTENT__RXG23:
				setRXG23((RXG23CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG24:
				setRXG24((RXG24CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG25:
				setRXG25((RXG25CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__RXG26:
				setRXG26((RXG26CONTENT)null);
				return;
			case V2xmlPackage.RXGCONTENT__ANY:
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
			case V2xmlPackage.RXGCONTENT__RXG1:
				return rXG1 != null;
			case V2xmlPackage.RXGCONTENT__RXG2:
				return rXG2 != null;
			case V2xmlPackage.RXGCONTENT__RXG3:
				return rXG3 != null;
			case V2xmlPackage.RXGCONTENT__RXG4:
				return rXG4 != null;
			case V2xmlPackage.RXGCONTENT__RXG5:
				return rXG5 != null;
			case V2xmlPackage.RXGCONTENT__RXG6:
				return rXG6 != null;
			case V2xmlPackage.RXGCONTENT__RXG7:
				return rXG7 != null;
			case V2xmlPackage.RXGCONTENT__RXG8:
				return rXG8 != null;
			case V2xmlPackage.RXGCONTENT__RXG9:
				return rXG9 != null && !rXG9.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG10:
				return rXG10 != null;
			case V2xmlPackage.RXGCONTENT__RXG11:
				return rXG11 != null;
			case V2xmlPackage.RXGCONTENT__RXG12:
				return rXG12 != null;
			case V2xmlPackage.RXGCONTENT__RXG13:
				return rXG13 != null && !rXG13.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG14:
				return rXG14 != null;
			case V2xmlPackage.RXGCONTENT__RXG15:
				return rXG15 != null;
			case V2xmlPackage.RXGCONTENT__RXG16:
				return rXG16 != null;
			case V2xmlPackage.RXGCONTENT__RXG17:
				return rXG17 != null;
			case V2xmlPackage.RXGCONTENT__RXG18:
				return rXG18 != null;
			case V2xmlPackage.RXGCONTENT__RXG19:
				return rXG19 != null && !rXG19.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG20:
				return rXG20 != null && !rXG20.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG21:
				return rXG21 != null && !rXG21.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG22:
				return rXG22 != null && !rXG22.isEmpty();
			case V2xmlPackage.RXGCONTENT__RXG23:
				return rXG23 != null;
			case V2xmlPackage.RXGCONTENT__RXG24:
				return rXG24 != null;
			case V2xmlPackage.RXGCONTENT__RXG25:
				return rXG25 != null;
			case V2xmlPackage.RXGCONTENT__RXG26:
				return rXG26 != null;
			case V2xmlPackage.RXGCONTENT__ANY:
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

} //RXGCONTENTImpl
