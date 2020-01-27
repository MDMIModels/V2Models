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

import org.hl7.v2xml.TXA10CONTENT;
import org.hl7.v2xml.TXA11CONTENT;
import org.hl7.v2xml.TXA12CONTENT;
import org.hl7.v2xml.TXA13CONTENT;
import org.hl7.v2xml.TXA14CONTENT;
import org.hl7.v2xml.TXA15CONTENT;
import org.hl7.v2xml.TXA16CONTENT;
import org.hl7.v2xml.TXA17CONTENT;
import org.hl7.v2xml.TXA18CONTENT;
import org.hl7.v2xml.TXA19CONTENT;
import org.hl7.v2xml.TXA1CONTENT;
import org.hl7.v2xml.TXA20CONTENT;
import org.hl7.v2xml.TXA21CONTENT;
import org.hl7.v2xml.TXA22CONTENT;
import org.hl7.v2xml.TXA23CONTENT;
import org.hl7.v2xml.TXA2CONTENT;
import org.hl7.v2xml.TXA3CONTENT;
import org.hl7.v2xml.TXA4CONTENT;
import org.hl7.v2xml.TXA5CONTENT;
import org.hl7.v2xml.TXA6CONTENT;
import org.hl7.v2xml.TXA7CONTENT;
import org.hl7.v2xml.TXA8CONTENT;
import org.hl7.v2xml.TXA9CONTENT;
import org.hl7.v2xml.TXACONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TXACONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA1 <em>TXA1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA2 <em>TXA2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA3 <em>TXA3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA4 <em>TXA4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA5 <em>TXA5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA6 <em>TXA6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA7 <em>TXA7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA8 <em>TXA8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA9 <em>TXA9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA10 <em>TXA10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA11 <em>TXA11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA12 <em>TXA12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA13 <em>TXA13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA14 <em>TXA14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA15 <em>TXA15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA16 <em>TXA16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA17 <em>TXA17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA18 <em>TXA18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA19 <em>TXA19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA20 <em>TXA20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA21 <em>TXA21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA22 <em>TXA22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getTXA23 <em>TXA23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TXACONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TXACONTENTImpl extends EObjectImpl implements TXACONTENT {
	/**
	 * The cached value of the '{@link #getTXA1() <em>TXA1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA1()
	 * @generated
	 * @ordered
	 */
	protected TXA1CONTENT tXA1;

	/**
	 * The cached value of the '{@link #getTXA2() <em>TXA2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA2()
	 * @generated
	 * @ordered
	 */
	protected TXA2CONTENT tXA2;

	/**
	 * The cached value of the '{@link #getTXA3() <em>TXA3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA3()
	 * @generated
	 * @ordered
	 */
	protected TXA3CONTENT tXA3;

	/**
	 * The cached value of the '{@link #getTXA4() <em>TXA4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA4()
	 * @generated
	 * @ordered
	 */
	protected TXA4CONTENT tXA4;

	/**
	 * The cached value of the '{@link #getTXA5() <em>TXA5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA5()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA5CONTENT> tXA5;

	/**
	 * The cached value of the '{@link #getTXA6() <em>TXA6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA6()
	 * @generated
	 * @ordered
	 */
	protected TXA6CONTENT tXA6;

	/**
	 * The cached value of the '{@link #getTXA7() <em>TXA7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA7()
	 * @generated
	 * @ordered
	 */
	protected TXA7CONTENT tXA7;

	/**
	 * The cached value of the '{@link #getTXA8() <em>TXA8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA8()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA8CONTENT> tXA8;

	/**
	 * The cached value of the '{@link #getTXA9() <em>TXA9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA9()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA9CONTENT> tXA9;

	/**
	 * The cached value of the '{@link #getTXA10() <em>TXA10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA10()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA10CONTENT> tXA10;

	/**
	 * The cached value of the '{@link #getTXA11() <em>TXA11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA11()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA11CONTENT> tXA11;

	/**
	 * The cached value of the '{@link #getTXA12() <em>TXA12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA12()
	 * @generated
	 * @ordered
	 */
	protected TXA12CONTENT tXA12;

	/**
	 * The cached value of the '{@link #getTXA13() <em>TXA13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA13()
	 * @generated
	 * @ordered
	 */
	protected TXA13CONTENT tXA13;

	/**
	 * The cached value of the '{@link #getTXA14() <em>TXA14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA14()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA14CONTENT> tXA14;

	/**
	 * The cached value of the '{@link #getTXA15() <em>TXA15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA15()
	 * @generated
	 * @ordered
	 */
	protected TXA15CONTENT tXA15;

	/**
	 * The cached value of the '{@link #getTXA16() <em>TXA16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA16()
	 * @generated
	 * @ordered
	 */
	protected TXA16CONTENT tXA16;

	/**
	 * The cached value of the '{@link #getTXA17() <em>TXA17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA17()
	 * @generated
	 * @ordered
	 */
	protected TXA17CONTENT tXA17;

	/**
	 * The cached value of the '{@link #getTXA18() <em>TXA18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA18()
	 * @generated
	 * @ordered
	 */
	protected TXA18CONTENT tXA18;

	/**
	 * The cached value of the '{@link #getTXA19() <em>TXA19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA19()
	 * @generated
	 * @ordered
	 */
	protected TXA19CONTENT tXA19;

	/**
	 * The cached value of the '{@link #getTXA20() <em>TXA20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA20()
	 * @generated
	 * @ordered
	 */
	protected TXA20CONTENT tXA20;

	/**
	 * The cached value of the '{@link #getTXA21() <em>TXA21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA21()
	 * @generated
	 * @ordered
	 */
	protected TXA21CONTENT tXA21;

	/**
	 * The cached value of the '{@link #getTXA22() <em>TXA22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA22()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA22CONTENT> tXA22;

	/**
	 * The cached value of the '{@link #getTXA23() <em>TXA23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTXA23()
	 * @generated
	 * @ordered
	 */
	protected EList<TXA23CONTENT> tXA23;

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
	protected TXACONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTXACONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA1CONTENT getTXA1() {
		return tXA1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA1(TXA1CONTENT newTXA1, NotificationChain msgs) {
		TXA1CONTENT oldTXA1 = tXA1;
		tXA1 = newTXA1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA1, oldTXA1, newTXA1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA1(TXA1CONTENT newTXA1) {
		if (newTXA1 != tXA1) {
			NotificationChain msgs = null;
			if (tXA1 != null)
				msgs = ((InternalEObject)tXA1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA1, null, msgs);
			if (newTXA1 != null)
				msgs = ((InternalEObject)newTXA1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA1, null, msgs);
			msgs = basicSetTXA1(newTXA1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA1, newTXA1, newTXA1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA2CONTENT getTXA2() {
		return tXA2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA2(TXA2CONTENT newTXA2, NotificationChain msgs) {
		TXA2CONTENT oldTXA2 = tXA2;
		tXA2 = newTXA2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA2, oldTXA2, newTXA2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA2(TXA2CONTENT newTXA2) {
		if (newTXA2 != tXA2) {
			NotificationChain msgs = null;
			if (tXA2 != null)
				msgs = ((InternalEObject)tXA2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA2, null, msgs);
			if (newTXA2 != null)
				msgs = ((InternalEObject)newTXA2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA2, null, msgs);
			msgs = basicSetTXA2(newTXA2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA2, newTXA2, newTXA2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA3CONTENT getTXA3() {
		return tXA3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA3(TXA3CONTENT newTXA3, NotificationChain msgs) {
		TXA3CONTENT oldTXA3 = tXA3;
		tXA3 = newTXA3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA3, oldTXA3, newTXA3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA3(TXA3CONTENT newTXA3) {
		if (newTXA3 != tXA3) {
			NotificationChain msgs = null;
			if (tXA3 != null)
				msgs = ((InternalEObject)tXA3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA3, null, msgs);
			if (newTXA3 != null)
				msgs = ((InternalEObject)newTXA3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA3, null, msgs);
			msgs = basicSetTXA3(newTXA3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA3, newTXA3, newTXA3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA4CONTENT getTXA4() {
		return tXA4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA4(TXA4CONTENT newTXA4, NotificationChain msgs) {
		TXA4CONTENT oldTXA4 = tXA4;
		tXA4 = newTXA4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA4, oldTXA4, newTXA4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA4(TXA4CONTENT newTXA4) {
		if (newTXA4 != tXA4) {
			NotificationChain msgs = null;
			if (tXA4 != null)
				msgs = ((InternalEObject)tXA4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA4, null, msgs);
			if (newTXA4 != null)
				msgs = ((InternalEObject)newTXA4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA4, null, msgs);
			msgs = basicSetTXA4(newTXA4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA4, newTXA4, newTXA4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA5CONTENT> getTXA5() {
		if (tXA5 == null) {
			tXA5 = new EObjectContainmentEList<TXA5CONTENT>(TXA5CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA5);
		}
		return tXA5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA6CONTENT getTXA6() {
		return tXA6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA6(TXA6CONTENT newTXA6, NotificationChain msgs) {
		TXA6CONTENT oldTXA6 = tXA6;
		tXA6 = newTXA6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA6, oldTXA6, newTXA6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA6(TXA6CONTENT newTXA6) {
		if (newTXA6 != tXA6) {
			NotificationChain msgs = null;
			if (tXA6 != null)
				msgs = ((InternalEObject)tXA6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA6, null, msgs);
			if (newTXA6 != null)
				msgs = ((InternalEObject)newTXA6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA6, null, msgs);
			msgs = basicSetTXA6(newTXA6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA6, newTXA6, newTXA6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA7CONTENT getTXA7() {
		return tXA7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA7(TXA7CONTENT newTXA7, NotificationChain msgs) {
		TXA7CONTENT oldTXA7 = tXA7;
		tXA7 = newTXA7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA7, oldTXA7, newTXA7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA7(TXA7CONTENT newTXA7) {
		if (newTXA7 != tXA7) {
			NotificationChain msgs = null;
			if (tXA7 != null)
				msgs = ((InternalEObject)tXA7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA7, null, msgs);
			if (newTXA7 != null)
				msgs = ((InternalEObject)newTXA7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA7, null, msgs);
			msgs = basicSetTXA7(newTXA7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA7, newTXA7, newTXA7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA8CONTENT> getTXA8() {
		if (tXA8 == null) {
			tXA8 = new EObjectContainmentEList<TXA8CONTENT>(TXA8CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA8);
		}
		return tXA8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA9CONTENT> getTXA9() {
		if (tXA9 == null) {
			tXA9 = new EObjectContainmentEList<TXA9CONTENT>(TXA9CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA9);
		}
		return tXA9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA10CONTENT> getTXA10() {
		if (tXA10 == null) {
			tXA10 = new EObjectContainmentEList<TXA10CONTENT>(TXA10CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA10);
		}
		return tXA10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA11CONTENT> getTXA11() {
		if (tXA11 == null) {
			tXA11 = new EObjectContainmentEList<TXA11CONTENT>(TXA11CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA11);
		}
		return tXA11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA12CONTENT getTXA12() {
		return tXA12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA12(TXA12CONTENT newTXA12, NotificationChain msgs) {
		TXA12CONTENT oldTXA12 = tXA12;
		tXA12 = newTXA12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA12, oldTXA12, newTXA12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA12(TXA12CONTENT newTXA12) {
		if (newTXA12 != tXA12) {
			NotificationChain msgs = null;
			if (tXA12 != null)
				msgs = ((InternalEObject)tXA12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA12, null, msgs);
			if (newTXA12 != null)
				msgs = ((InternalEObject)newTXA12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA12, null, msgs);
			msgs = basicSetTXA12(newTXA12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA12, newTXA12, newTXA12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA13CONTENT getTXA13() {
		return tXA13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA13(TXA13CONTENT newTXA13, NotificationChain msgs) {
		TXA13CONTENT oldTXA13 = tXA13;
		tXA13 = newTXA13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA13, oldTXA13, newTXA13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA13(TXA13CONTENT newTXA13) {
		if (newTXA13 != tXA13) {
			NotificationChain msgs = null;
			if (tXA13 != null)
				msgs = ((InternalEObject)tXA13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA13, null, msgs);
			if (newTXA13 != null)
				msgs = ((InternalEObject)newTXA13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA13, null, msgs);
			msgs = basicSetTXA13(newTXA13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA13, newTXA13, newTXA13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA14CONTENT> getTXA14() {
		if (tXA14 == null) {
			tXA14 = new EObjectContainmentEList<TXA14CONTENT>(TXA14CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA14);
		}
		return tXA14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA15CONTENT getTXA15() {
		return tXA15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA15(TXA15CONTENT newTXA15, NotificationChain msgs) {
		TXA15CONTENT oldTXA15 = tXA15;
		tXA15 = newTXA15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA15, oldTXA15, newTXA15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA15(TXA15CONTENT newTXA15) {
		if (newTXA15 != tXA15) {
			NotificationChain msgs = null;
			if (tXA15 != null)
				msgs = ((InternalEObject)tXA15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA15, null, msgs);
			if (newTXA15 != null)
				msgs = ((InternalEObject)newTXA15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA15, null, msgs);
			msgs = basicSetTXA15(newTXA15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA15, newTXA15, newTXA15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA16CONTENT getTXA16() {
		return tXA16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA16(TXA16CONTENT newTXA16, NotificationChain msgs) {
		TXA16CONTENT oldTXA16 = tXA16;
		tXA16 = newTXA16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA16, oldTXA16, newTXA16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA16(TXA16CONTENT newTXA16) {
		if (newTXA16 != tXA16) {
			NotificationChain msgs = null;
			if (tXA16 != null)
				msgs = ((InternalEObject)tXA16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA16, null, msgs);
			if (newTXA16 != null)
				msgs = ((InternalEObject)newTXA16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA16, null, msgs);
			msgs = basicSetTXA16(newTXA16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA16, newTXA16, newTXA16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA17CONTENT getTXA17() {
		return tXA17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA17(TXA17CONTENT newTXA17, NotificationChain msgs) {
		TXA17CONTENT oldTXA17 = tXA17;
		tXA17 = newTXA17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA17, oldTXA17, newTXA17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA17(TXA17CONTENT newTXA17) {
		if (newTXA17 != tXA17) {
			NotificationChain msgs = null;
			if (tXA17 != null)
				msgs = ((InternalEObject)tXA17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA17, null, msgs);
			if (newTXA17 != null)
				msgs = ((InternalEObject)newTXA17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA17, null, msgs);
			msgs = basicSetTXA17(newTXA17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA17, newTXA17, newTXA17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA18CONTENT getTXA18() {
		return tXA18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA18(TXA18CONTENT newTXA18, NotificationChain msgs) {
		TXA18CONTENT oldTXA18 = tXA18;
		tXA18 = newTXA18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA18, oldTXA18, newTXA18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA18(TXA18CONTENT newTXA18) {
		if (newTXA18 != tXA18) {
			NotificationChain msgs = null;
			if (tXA18 != null)
				msgs = ((InternalEObject)tXA18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA18, null, msgs);
			if (newTXA18 != null)
				msgs = ((InternalEObject)newTXA18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA18, null, msgs);
			msgs = basicSetTXA18(newTXA18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA18, newTXA18, newTXA18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA19CONTENT getTXA19() {
		return tXA19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA19(TXA19CONTENT newTXA19, NotificationChain msgs) {
		TXA19CONTENT oldTXA19 = tXA19;
		tXA19 = newTXA19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA19, oldTXA19, newTXA19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA19(TXA19CONTENT newTXA19) {
		if (newTXA19 != tXA19) {
			NotificationChain msgs = null;
			if (tXA19 != null)
				msgs = ((InternalEObject)tXA19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA19, null, msgs);
			if (newTXA19 != null)
				msgs = ((InternalEObject)newTXA19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA19, null, msgs);
			msgs = basicSetTXA19(newTXA19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA19, newTXA19, newTXA19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA20CONTENT getTXA20() {
		return tXA20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA20(TXA20CONTENT newTXA20, NotificationChain msgs) {
		TXA20CONTENT oldTXA20 = tXA20;
		tXA20 = newTXA20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA20, oldTXA20, newTXA20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA20(TXA20CONTENT newTXA20) {
		if (newTXA20 != tXA20) {
			NotificationChain msgs = null;
			if (tXA20 != null)
				msgs = ((InternalEObject)tXA20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA20, null, msgs);
			if (newTXA20 != null)
				msgs = ((InternalEObject)newTXA20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA20, null, msgs);
			msgs = basicSetTXA20(newTXA20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA20, newTXA20, newTXA20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TXA21CONTENT getTXA21() {
		return tXA21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTXA21(TXA21CONTENT newTXA21, NotificationChain msgs) {
		TXA21CONTENT oldTXA21 = tXA21;
		tXA21 = newTXA21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA21, oldTXA21, newTXA21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTXA21(TXA21CONTENT newTXA21) {
		if (newTXA21 != tXA21) {
			NotificationChain msgs = null;
			if (tXA21 != null)
				msgs = ((InternalEObject)tXA21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA21, null, msgs);
			if (newTXA21 != null)
				msgs = ((InternalEObject)newTXA21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TXACONTENT__TXA21, null, msgs);
			msgs = basicSetTXA21(newTXA21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TXACONTENT__TXA21, newTXA21, newTXA21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA22CONTENT> getTXA22() {
		if (tXA22 == null) {
			tXA22 = new EObjectContainmentEList<TXA22CONTENT>(TXA22CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA22);
		}
		return tXA22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TXA23CONTENT> getTXA23() {
		if (tXA23 == null) {
			tXA23 = new EObjectContainmentEList<TXA23CONTENT>(TXA23CONTENT.class, this, V2xmlPackage.TXACONTENT__TXA23);
		}
		return tXA23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.TXACONTENT__ANY);
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
			case V2xmlPackage.TXACONTENT__TXA1:
				return basicSetTXA1(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA2:
				return basicSetTXA2(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA3:
				return basicSetTXA3(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA4:
				return basicSetTXA4(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA5:
				return ((InternalEList<?>)getTXA5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA6:
				return basicSetTXA6(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA7:
				return basicSetTXA7(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA8:
				return ((InternalEList<?>)getTXA8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA9:
				return ((InternalEList<?>)getTXA9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA10:
				return ((InternalEList<?>)getTXA10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA11:
				return ((InternalEList<?>)getTXA11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA12:
				return basicSetTXA12(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA13:
				return basicSetTXA13(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA14:
				return ((InternalEList<?>)getTXA14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA15:
				return basicSetTXA15(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA16:
				return basicSetTXA16(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA17:
				return basicSetTXA17(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA18:
				return basicSetTXA18(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA19:
				return basicSetTXA19(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA20:
				return basicSetTXA20(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA21:
				return basicSetTXA21(null, msgs);
			case V2xmlPackage.TXACONTENT__TXA22:
				return ((InternalEList<?>)getTXA22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__TXA23:
				return ((InternalEList<?>)getTXA23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TXACONTENT__ANY:
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
			case V2xmlPackage.TXACONTENT__TXA1:
				return getTXA1();
			case V2xmlPackage.TXACONTENT__TXA2:
				return getTXA2();
			case V2xmlPackage.TXACONTENT__TXA3:
				return getTXA3();
			case V2xmlPackage.TXACONTENT__TXA4:
				return getTXA4();
			case V2xmlPackage.TXACONTENT__TXA5:
				return getTXA5();
			case V2xmlPackage.TXACONTENT__TXA6:
				return getTXA6();
			case V2xmlPackage.TXACONTENT__TXA7:
				return getTXA7();
			case V2xmlPackage.TXACONTENT__TXA8:
				return getTXA8();
			case V2xmlPackage.TXACONTENT__TXA9:
				return getTXA9();
			case V2xmlPackage.TXACONTENT__TXA10:
				return getTXA10();
			case V2xmlPackage.TXACONTENT__TXA11:
				return getTXA11();
			case V2xmlPackage.TXACONTENT__TXA12:
				return getTXA12();
			case V2xmlPackage.TXACONTENT__TXA13:
				return getTXA13();
			case V2xmlPackage.TXACONTENT__TXA14:
				return getTXA14();
			case V2xmlPackage.TXACONTENT__TXA15:
				return getTXA15();
			case V2xmlPackage.TXACONTENT__TXA16:
				return getTXA16();
			case V2xmlPackage.TXACONTENT__TXA17:
				return getTXA17();
			case V2xmlPackage.TXACONTENT__TXA18:
				return getTXA18();
			case V2xmlPackage.TXACONTENT__TXA19:
				return getTXA19();
			case V2xmlPackage.TXACONTENT__TXA20:
				return getTXA20();
			case V2xmlPackage.TXACONTENT__TXA21:
				return getTXA21();
			case V2xmlPackage.TXACONTENT__TXA22:
				return getTXA22();
			case V2xmlPackage.TXACONTENT__TXA23:
				return getTXA23();
			case V2xmlPackage.TXACONTENT__ANY:
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
			case V2xmlPackage.TXACONTENT__TXA1:
				setTXA1((TXA1CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA2:
				setTXA2((TXA2CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA3:
				setTXA3((TXA3CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA4:
				setTXA4((TXA4CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA5:
				getTXA5().clear();
				getTXA5().addAll((Collection<? extends TXA5CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA6:
				setTXA6((TXA6CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA7:
				setTXA7((TXA7CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA8:
				getTXA8().clear();
				getTXA8().addAll((Collection<? extends TXA8CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA9:
				getTXA9().clear();
				getTXA9().addAll((Collection<? extends TXA9CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA10:
				getTXA10().clear();
				getTXA10().addAll((Collection<? extends TXA10CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA11:
				getTXA11().clear();
				getTXA11().addAll((Collection<? extends TXA11CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA12:
				setTXA12((TXA12CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA13:
				setTXA13((TXA13CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA14:
				getTXA14().clear();
				getTXA14().addAll((Collection<? extends TXA14CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA15:
				setTXA15((TXA15CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA16:
				setTXA16((TXA16CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA17:
				setTXA17((TXA17CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA18:
				setTXA18((TXA18CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA19:
				setTXA19((TXA19CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA20:
				setTXA20((TXA20CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA21:
				setTXA21((TXA21CONTENT)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA22:
				getTXA22().clear();
				getTXA22().addAll((Collection<? extends TXA22CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__TXA23:
				getTXA23().clear();
				getTXA23().addAll((Collection<? extends TXA23CONTENT>)newValue);
				return;
			case V2xmlPackage.TXACONTENT__ANY:
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
			case V2xmlPackage.TXACONTENT__TXA1:
				setTXA1((TXA1CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA2:
				setTXA2((TXA2CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA3:
				setTXA3((TXA3CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA4:
				setTXA4((TXA4CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA5:
				getTXA5().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA6:
				setTXA6((TXA6CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA7:
				setTXA7((TXA7CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA8:
				getTXA8().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA9:
				getTXA9().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA10:
				getTXA10().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA11:
				getTXA11().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA12:
				setTXA12((TXA12CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA13:
				setTXA13((TXA13CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA14:
				getTXA14().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA15:
				setTXA15((TXA15CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA16:
				setTXA16((TXA16CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA17:
				setTXA17((TXA17CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA18:
				setTXA18((TXA18CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA19:
				setTXA19((TXA19CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA20:
				setTXA20((TXA20CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA21:
				setTXA21((TXA21CONTENT)null);
				return;
			case V2xmlPackage.TXACONTENT__TXA22:
				getTXA22().clear();
				return;
			case V2xmlPackage.TXACONTENT__TXA23:
				getTXA23().clear();
				return;
			case V2xmlPackage.TXACONTENT__ANY:
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
			case V2xmlPackage.TXACONTENT__TXA1:
				return tXA1 != null;
			case V2xmlPackage.TXACONTENT__TXA2:
				return tXA2 != null;
			case V2xmlPackage.TXACONTENT__TXA3:
				return tXA3 != null;
			case V2xmlPackage.TXACONTENT__TXA4:
				return tXA4 != null;
			case V2xmlPackage.TXACONTENT__TXA5:
				return tXA5 != null && !tXA5.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA6:
				return tXA6 != null;
			case V2xmlPackage.TXACONTENT__TXA7:
				return tXA7 != null;
			case V2xmlPackage.TXACONTENT__TXA8:
				return tXA8 != null && !tXA8.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA9:
				return tXA9 != null && !tXA9.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA10:
				return tXA10 != null && !tXA10.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA11:
				return tXA11 != null && !tXA11.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA12:
				return tXA12 != null;
			case V2xmlPackage.TXACONTENT__TXA13:
				return tXA13 != null;
			case V2xmlPackage.TXACONTENT__TXA14:
				return tXA14 != null && !tXA14.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA15:
				return tXA15 != null;
			case V2xmlPackage.TXACONTENT__TXA16:
				return tXA16 != null;
			case V2xmlPackage.TXACONTENT__TXA17:
				return tXA17 != null;
			case V2xmlPackage.TXACONTENT__TXA18:
				return tXA18 != null;
			case V2xmlPackage.TXACONTENT__TXA19:
				return tXA19 != null;
			case V2xmlPackage.TXACONTENT__TXA20:
				return tXA20 != null;
			case V2xmlPackage.TXACONTENT__TXA21:
				return tXA21 != null;
			case V2xmlPackage.TXACONTENT__TXA22:
				return tXA22 != null && !tXA22.isEmpty();
			case V2xmlPackage.TXACONTENT__TXA23:
				return tXA23 != null && !tXA23.isEmpty();
			case V2xmlPackage.TXACONTENT__ANY:
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

} //TXACONTENTImpl
