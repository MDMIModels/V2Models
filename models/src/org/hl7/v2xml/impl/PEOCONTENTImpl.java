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

import org.hl7.v2xml.PEO10CONTENT;
import org.hl7.v2xml.PEO11CONTENT;
import org.hl7.v2xml.PEO12CONTENT;
import org.hl7.v2xml.PEO13CONTENT;
import org.hl7.v2xml.PEO14CONTENT;
import org.hl7.v2xml.PEO15CONTENT;
import org.hl7.v2xml.PEO16CONTENT;
import org.hl7.v2xml.PEO17CONTENT;
import org.hl7.v2xml.PEO18CONTENT;
import org.hl7.v2xml.PEO19CONTENT;
import org.hl7.v2xml.PEO1CONTENT;
import org.hl7.v2xml.PEO20CONTENT;
import org.hl7.v2xml.PEO21CONTENT;
import org.hl7.v2xml.PEO22CONTENT;
import org.hl7.v2xml.PEO23CONTENT;
import org.hl7.v2xml.PEO24CONTENT;
import org.hl7.v2xml.PEO25CONTENT;
import org.hl7.v2xml.PEO2CONTENT;
import org.hl7.v2xml.PEO3CONTENT;
import org.hl7.v2xml.PEO4CONTENT;
import org.hl7.v2xml.PEO5CONTENT;
import org.hl7.v2xml.PEO6CONTENT;
import org.hl7.v2xml.PEO7CONTENT;
import org.hl7.v2xml.PEO8CONTENT;
import org.hl7.v2xml.PEO9CONTENT;
import org.hl7.v2xml.PEOCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PEOCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO1 <em>PEO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO2 <em>PEO2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO3 <em>PEO3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO4 <em>PEO4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO5 <em>PEO5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO6 <em>PEO6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO7 <em>PEO7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO8 <em>PEO8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO9 <em>PEO9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO10 <em>PEO10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO11 <em>PEO11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO12 <em>PEO12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO13 <em>PEO13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO14 <em>PEO14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO15 <em>PEO15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO16 <em>PEO16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO17 <em>PEO17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO18 <em>PEO18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO19 <em>PEO19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO20 <em>PEO20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO21 <em>PEO21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO22 <em>PEO22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO23 <em>PEO23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO24 <em>PEO24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getPEO25 <em>PEO25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PEOCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PEOCONTENTImpl extends EObjectImpl implements PEOCONTENT {
	/**
	 * The cached value of the '{@link #getPEO1() <em>PEO1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO1()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO1CONTENT> pEO1;

	/**
	 * The cached value of the '{@link #getPEO2() <em>PEO2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO2()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO2CONTENT> pEO2;

	/**
	 * The cached value of the '{@link #getPEO3() <em>PEO3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO3()
	 * @generated
	 * @ordered
	 */
	protected PEO3CONTENT pEO3;

	/**
	 * The cached value of the '{@link #getPEO4() <em>PEO4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO4()
	 * @generated
	 * @ordered
	 */
	protected PEO4CONTENT pEO4;

	/**
	 * The cached value of the '{@link #getPEO5() <em>PEO5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO5()
	 * @generated
	 * @ordered
	 */
	protected PEO5CONTENT pEO5;

	/**
	 * The cached value of the '{@link #getPEO6() <em>PEO6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO6()
	 * @generated
	 * @ordered
	 */
	protected PEO6CONTENT pEO6;

	/**
	 * The cached value of the '{@link #getPEO7() <em>PEO7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO7()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO7CONTENT> pEO7;

	/**
	 * The cached value of the '{@link #getPEO8() <em>PEO8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO8()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO8CONTENT> pEO8;

	/**
	 * The cached value of the '{@link #getPEO9() <em>PEO9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO9()
	 * @generated
	 * @ordered
	 */
	protected PEO9CONTENT pEO9;

	/**
	 * The cached value of the '{@link #getPEO10() <em>PEO10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO10()
	 * @generated
	 * @ordered
	 */
	protected PEO10CONTENT pEO10;

	/**
	 * The cached value of the '{@link #getPEO11() <em>PEO11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO11()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO11CONTENT> pEO11;

	/**
	 * The cached value of the '{@link #getPEO12() <em>PEO12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO12()
	 * @generated
	 * @ordered
	 */
	protected PEO12CONTENT pEO12;

	/**
	 * The cached value of the '{@link #getPEO13() <em>PEO13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO13()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO13CONTENT> pEO13;

	/**
	 * The cached value of the '{@link #getPEO14() <em>PEO14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO14()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO14CONTENT> pEO14;

	/**
	 * The cached value of the '{@link #getPEO15() <em>PEO15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO15()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO15CONTENT> pEO15;

	/**
	 * The cached value of the '{@link #getPEO16() <em>PEO16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO16()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO16CONTENT> pEO16;

	/**
	 * The cached value of the '{@link #getPEO17() <em>PEO17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO17()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO17CONTENT> pEO17;

	/**
	 * The cached value of the '{@link #getPEO18() <em>PEO18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO18()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO18CONTENT> pEO18;

	/**
	 * The cached value of the '{@link #getPEO19() <em>PEO19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO19()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO19CONTENT> pEO19;

	/**
	 * The cached value of the '{@link #getPEO20() <em>PEO20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO20()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO20CONTENT> pEO20;

	/**
	 * The cached value of the '{@link #getPEO21() <em>PEO21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO21()
	 * @generated
	 * @ordered
	 */
	protected EList<PEO21CONTENT> pEO21;

	/**
	 * The cached value of the '{@link #getPEO22() <em>PEO22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO22()
	 * @generated
	 * @ordered
	 */
	protected PEO22CONTENT pEO22;

	/**
	 * The cached value of the '{@link #getPEO23() <em>PEO23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO23()
	 * @generated
	 * @ordered
	 */
	protected PEO23CONTENT pEO23;

	/**
	 * The cached value of the '{@link #getPEO24() <em>PEO24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO24()
	 * @generated
	 * @ordered
	 */
	protected PEO24CONTENT pEO24;

	/**
	 * The cached value of the '{@link #getPEO25() <em>PEO25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPEO25()
	 * @generated
	 * @ordered
	 */
	protected PEO25CONTENT pEO25;

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
	protected PEOCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPEOCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO1CONTENT> getPEO1() {
		if (pEO1 == null) {
			pEO1 = new EObjectContainmentEList<PEO1CONTENT>(PEO1CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO1);
		}
		return pEO1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO2CONTENT> getPEO2() {
		if (pEO2 == null) {
			pEO2 = new EObjectContainmentEList<PEO2CONTENT>(PEO2CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO2);
		}
		return pEO2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO3CONTENT getPEO3() {
		return pEO3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO3(PEO3CONTENT newPEO3, NotificationChain msgs) {
		PEO3CONTENT oldPEO3 = pEO3;
		pEO3 = newPEO3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO3, oldPEO3, newPEO3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO3(PEO3CONTENT newPEO3) {
		if (newPEO3 != pEO3) {
			NotificationChain msgs = null;
			if (pEO3 != null)
				msgs = ((InternalEObject)pEO3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO3, null, msgs);
			if (newPEO3 != null)
				msgs = ((InternalEObject)newPEO3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO3, null, msgs);
			msgs = basicSetPEO3(newPEO3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO3, newPEO3, newPEO3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO4CONTENT getPEO4() {
		return pEO4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO4(PEO4CONTENT newPEO4, NotificationChain msgs) {
		PEO4CONTENT oldPEO4 = pEO4;
		pEO4 = newPEO4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO4, oldPEO4, newPEO4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO4(PEO4CONTENT newPEO4) {
		if (newPEO4 != pEO4) {
			NotificationChain msgs = null;
			if (pEO4 != null)
				msgs = ((InternalEObject)pEO4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO4, null, msgs);
			if (newPEO4 != null)
				msgs = ((InternalEObject)newPEO4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO4, null, msgs);
			msgs = basicSetPEO4(newPEO4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO4, newPEO4, newPEO4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO5CONTENT getPEO5() {
		return pEO5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO5(PEO5CONTENT newPEO5, NotificationChain msgs) {
		PEO5CONTENT oldPEO5 = pEO5;
		pEO5 = newPEO5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO5, oldPEO5, newPEO5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO5(PEO5CONTENT newPEO5) {
		if (newPEO5 != pEO5) {
			NotificationChain msgs = null;
			if (pEO5 != null)
				msgs = ((InternalEObject)pEO5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO5, null, msgs);
			if (newPEO5 != null)
				msgs = ((InternalEObject)newPEO5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO5, null, msgs);
			msgs = basicSetPEO5(newPEO5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO5, newPEO5, newPEO5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO6CONTENT getPEO6() {
		return pEO6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO6(PEO6CONTENT newPEO6, NotificationChain msgs) {
		PEO6CONTENT oldPEO6 = pEO6;
		pEO6 = newPEO6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO6, oldPEO6, newPEO6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO6(PEO6CONTENT newPEO6) {
		if (newPEO6 != pEO6) {
			NotificationChain msgs = null;
			if (pEO6 != null)
				msgs = ((InternalEObject)pEO6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO6, null, msgs);
			if (newPEO6 != null)
				msgs = ((InternalEObject)newPEO6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO6, null, msgs);
			msgs = basicSetPEO6(newPEO6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO6, newPEO6, newPEO6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO7CONTENT> getPEO7() {
		if (pEO7 == null) {
			pEO7 = new EObjectContainmentEList<PEO7CONTENT>(PEO7CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO7);
		}
		return pEO7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO8CONTENT> getPEO8() {
		if (pEO8 == null) {
			pEO8 = new EObjectContainmentEList<PEO8CONTENT>(PEO8CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO8);
		}
		return pEO8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO9CONTENT getPEO9() {
		return pEO9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO9(PEO9CONTENT newPEO9, NotificationChain msgs) {
		PEO9CONTENT oldPEO9 = pEO9;
		pEO9 = newPEO9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO9, oldPEO9, newPEO9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO9(PEO9CONTENT newPEO9) {
		if (newPEO9 != pEO9) {
			NotificationChain msgs = null;
			if (pEO9 != null)
				msgs = ((InternalEObject)pEO9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO9, null, msgs);
			if (newPEO9 != null)
				msgs = ((InternalEObject)newPEO9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO9, null, msgs);
			msgs = basicSetPEO9(newPEO9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO9, newPEO9, newPEO9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO10CONTENT getPEO10() {
		return pEO10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO10(PEO10CONTENT newPEO10, NotificationChain msgs) {
		PEO10CONTENT oldPEO10 = pEO10;
		pEO10 = newPEO10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO10, oldPEO10, newPEO10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO10(PEO10CONTENT newPEO10) {
		if (newPEO10 != pEO10) {
			NotificationChain msgs = null;
			if (pEO10 != null)
				msgs = ((InternalEObject)pEO10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO10, null, msgs);
			if (newPEO10 != null)
				msgs = ((InternalEObject)newPEO10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO10, null, msgs);
			msgs = basicSetPEO10(newPEO10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO10, newPEO10, newPEO10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO11CONTENT> getPEO11() {
		if (pEO11 == null) {
			pEO11 = new EObjectContainmentEList<PEO11CONTENT>(PEO11CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO11);
		}
		return pEO11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO12CONTENT getPEO12() {
		return pEO12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO12(PEO12CONTENT newPEO12, NotificationChain msgs) {
		PEO12CONTENT oldPEO12 = pEO12;
		pEO12 = newPEO12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO12, oldPEO12, newPEO12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO12(PEO12CONTENT newPEO12) {
		if (newPEO12 != pEO12) {
			NotificationChain msgs = null;
			if (pEO12 != null)
				msgs = ((InternalEObject)pEO12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO12, null, msgs);
			if (newPEO12 != null)
				msgs = ((InternalEObject)newPEO12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO12, null, msgs);
			msgs = basicSetPEO12(newPEO12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO12, newPEO12, newPEO12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO13CONTENT> getPEO13() {
		if (pEO13 == null) {
			pEO13 = new EObjectContainmentEList<PEO13CONTENT>(PEO13CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO13);
		}
		return pEO13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO14CONTENT> getPEO14() {
		if (pEO14 == null) {
			pEO14 = new EObjectContainmentEList<PEO14CONTENT>(PEO14CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO14);
		}
		return pEO14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO15CONTENT> getPEO15() {
		if (pEO15 == null) {
			pEO15 = new EObjectContainmentEList<PEO15CONTENT>(PEO15CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO15);
		}
		return pEO15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO16CONTENT> getPEO16() {
		if (pEO16 == null) {
			pEO16 = new EObjectContainmentEList<PEO16CONTENT>(PEO16CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO16);
		}
		return pEO16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO17CONTENT> getPEO17() {
		if (pEO17 == null) {
			pEO17 = new EObjectContainmentEList<PEO17CONTENT>(PEO17CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO17);
		}
		return pEO17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO18CONTENT> getPEO18() {
		if (pEO18 == null) {
			pEO18 = new EObjectContainmentEList<PEO18CONTENT>(PEO18CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO18);
		}
		return pEO18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO19CONTENT> getPEO19() {
		if (pEO19 == null) {
			pEO19 = new EObjectContainmentEList<PEO19CONTENT>(PEO19CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO19);
		}
		return pEO19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO20CONTENT> getPEO20() {
		if (pEO20 == null) {
			pEO20 = new EObjectContainmentEList<PEO20CONTENT>(PEO20CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO20);
		}
		return pEO20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PEO21CONTENT> getPEO21() {
		if (pEO21 == null) {
			pEO21 = new EObjectContainmentEList<PEO21CONTENT>(PEO21CONTENT.class, this, V2xmlPackage.PEOCONTENT__PEO21);
		}
		return pEO21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO22CONTENT getPEO22() {
		return pEO22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO22(PEO22CONTENT newPEO22, NotificationChain msgs) {
		PEO22CONTENT oldPEO22 = pEO22;
		pEO22 = newPEO22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO22, oldPEO22, newPEO22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO22(PEO22CONTENT newPEO22) {
		if (newPEO22 != pEO22) {
			NotificationChain msgs = null;
			if (pEO22 != null)
				msgs = ((InternalEObject)pEO22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO22, null, msgs);
			if (newPEO22 != null)
				msgs = ((InternalEObject)newPEO22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO22, null, msgs);
			msgs = basicSetPEO22(newPEO22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO22, newPEO22, newPEO22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO23CONTENT getPEO23() {
		return pEO23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO23(PEO23CONTENT newPEO23, NotificationChain msgs) {
		PEO23CONTENT oldPEO23 = pEO23;
		pEO23 = newPEO23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO23, oldPEO23, newPEO23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO23(PEO23CONTENT newPEO23) {
		if (newPEO23 != pEO23) {
			NotificationChain msgs = null;
			if (pEO23 != null)
				msgs = ((InternalEObject)pEO23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO23, null, msgs);
			if (newPEO23 != null)
				msgs = ((InternalEObject)newPEO23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO23, null, msgs);
			msgs = basicSetPEO23(newPEO23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO23, newPEO23, newPEO23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO24CONTENT getPEO24() {
		return pEO24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO24(PEO24CONTENT newPEO24, NotificationChain msgs) {
		PEO24CONTENT oldPEO24 = pEO24;
		pEO24 = newPEO24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO24, oldPEO24, newPEO24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO24(PEO24CONTENT newPEO24) {
		if (newPEO24 != pEO24) {
			NotificationChain msgs = null;
			if (pEO24 != null)
				msgs = ((InternalEObject)pEO24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO24, null, msgs);
			if (newPEO24 != null)
				msgs = ((InternalEObject)newPEO24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO24, null, msgs);
			msgs = basicSetPEO24(newPEO24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO24, newPEO24, newPEO24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PEO25CONTENT getPEO25() {
		return pEO25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPEO25(PEO25CONTENT newPEO25, NotificationChain msgs) {
		PEO25CONTENT oldPEO25 = pEO25;
		pEO25 = newPEO25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO25, oldPEO25, newPEO25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPEO25(PEO25CONTENT newPEO25) {
		if (newPEO25 != pEO25) {
			NotificationChain msgs = null;
			if (pEO25 != null)
				msgs = ((InternalEObject)pEO25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO25, null, msgs);
			if (newPEO25 != null)
				msgs = ((InternalEObject)newPEO25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PEOCONTENT__PEO25, null, msgs);
			msgs = basicSetPEO25(newPEO25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PEOCONTENT__PEO25, newPEO25, newPEO25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PEOCONTENT__ANY);
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
			case V2xmlPackage.PEOCONTENT__PEO1:
				return ((InternalEList<?>)getPEO1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO2:
				return ((InternalEList<?>)getPEO2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO3:
				return basicSetPEO3(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO4:
				return basicSetPEO4(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO5:
				return basicSetPEO5(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO6:
				return basicSetPEO6(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO7:
				return ((InternalEList<?>)getPEO7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO8:
				return ((InternalEList<?>)getPEO8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO9:
				return basicSetPEO9(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO10:
				return basicSetPEO10(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO11:
				return ((InternalEList<?>)getPEO11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO12:
				return basicSetPEO12(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO13:
				return ((InternalEList<?>)getPEO13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO14:
				return ((InternalEList<?>)getPEO14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO15:
				return ((InternalEList<?>)getPEO15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO16:
				return ((InternalEList<?>)getPEO16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO17:
				return ((InternalEList<?>)getPEO17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO18:
				return ((InternalEList<?>)getPEO18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO19:
				return ((InternalEList<?>)getPEO19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO20:
				return ((InternalEList<?>)getPEO20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO21:
				return ((InternalEList<?>)getPEO21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PEOCONTENT__PEO22:
				return basicSetPEO22(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO23:
				return basicSetPEO23(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO24:
				return basicSetPEO24(null, msgs);
			case V2xmlPackage.PEOCONTENT__PEO25:
				return basicSetPEO25(null, msgs);
			case V2xmlPackage.PEOCONTENT__ANY:
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
			case V2xmlPackage.PEOCONTENT__PEO1:
				return getPEO1();
			case V2xmlPackage.PEOCONTENT__PEO2:
				return getPEO2();
			case V2xmlPackage.PEOCONTENT__PEO3:
				return getPEO3();
			case V2xmlPackage.PEOCONTENT__PEO4:
				return getPEO4();
			case V2xmlPackage.PEOCONTENT__PEO5:
				return getPEO5();
			case V2xmlPackage.PEOCONTENT__PEO6:
				return getPEO6();
			case V2xmlPackage.PEOCONTENT__PEO7:
				return getPEO7();
			case V2xmlPackage.PEOCONTENT__PEO8:
				return getPEO8();
			case V2xmlPackage.PEOCONTENT__PEO9:
				return getPEO9();
			case V2xmlPackage.PEOCONTENT__PEO10:
				return getPEO10();
			case V2xmlPackage.PEOCONTENT__PEO11:
				return getPEO11();
			case V2xmlPackage.PEOCONTENT__PEO12:
				return getPEO12();
			case V2xmlPackage.PEOCONTENT__PEO13:
				return getPEO13();
			case V2xmlPackage.PEOCONTENT__PEO14:
				return getPEO14();
			case V2xmlPackage.PEOCONTENT__PEO15:
				return getPEO15();
			case V2xmlPackage.PEOCONTENT__PEO16:
				return getPEO16();
			case V2xmlPackage.PEOCONTENT__PEO17:
				return getPEO17();
			case V2xmlPackage.PEOCONTENT__PEO18:
				return getPEO18();
			case V2xmlPackage.PEOCONTENT__PEO19:
				return getPEO19();
			case V2xmlPackage.PEOCONTENT__PEO20:
				return getPEO20();
			case V2xmlPackage.PEOCONTENT__PEO21:
				return getPEO21();
			case V2xmlPackage.PEOCONTENT__PEO22:
				return getPEO22();
			case V2xmlPackage.PEOCONTENT__PEO23:
				return getPEO23();
			case V2xmlPackage.PEOCONTENT__PEO24:
				return getPEO24();
			case V2xmlPackage.PEOCONTENT__PEO25:
				return getPEO25();
			case V2xmlPackage.PEOCONTENT__ANY:
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
			case V2xmlPackage.PEOCONTENT__PEO1:
				getPEO1().clear();
				getPEO1().addAll((Collection<? extends PEO1CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO2:
				getPEO2().clear();
				getPEO2().addAll((Collection<? extends PEO2CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO3:
				setPEO3((PEO3CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO4:
				setPEO4((PEO4CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO5:
				setPEO5((PEO5CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO6:
				setPEO6((PEO6CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO7:
				getPEO7().clear();
				getPEO7().addAll((Collection<? extends PEO7CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO8:
				getPEO8().clear();
				getPEO8().addAll((Collection<? extends PEO8CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO9:
				setPEO9((PEO9CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO10:
				setPEO10((PEO10CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO11:
				getPEO11().clear();
				getPEO11().addAll((Collection<? extends PEO11CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO12:
				setPEO12((PEO12CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO13:
				getPEO13().clear();
				getPEO13().addAll((Collection<? extends PEO13CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO14:
				getPEO14().clear();
				getPEO14().addAll((Collection<? extends PEO14CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO15:
				getPEO15().clear();
				getPEO15().addAll((Collection<? extends PEO15CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO16:
				getPEO16().clear();
				getPEO16().addAll((Collection<? extends PEO16CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO17:
				getPEO17().clear();
				getPEO17().addAll((Collection<? extends PEO17CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO18:
				getPEO18().clear();
				getPEO18().addAll((Collection<? extends PEO18CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO19:
				getPEO19().clear();
				getPEO19().addAll((Collection<? extends PEO19CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO20:
				getPEO20().clear();
				getPEO20().addAll((Collection<? extends PEO20CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO21:
				getPEO21().clear();
				getPEO21().addAll((Collection<? extends PEO21CONTENT>)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO22:
				setPEO22((PEO22CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO23:
				setPEO23((PEO23CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO24:
				setPEO24((PEO24CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__PEO25:
				setPEO25((PEO25CONTENT)newValue);
				return;
			case V2xmlPackage.PEOCONTENT__ANY:
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
			case V2xmlPackage.PEOCONTENT__PEO1:
				getPEO1().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO2:
				getPEO2().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO3:
				setPEO3((PEO3CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO4:
				setPEO4((PEO4CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO5:
				setPEO5((PEO5CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO6:
				setPEO6((PEO6CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO7:
				getPEO7().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO8:
				getPEO8().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO9:
				setPEO9((PEO9CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO10:
				setPEO10((PEO10CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO11:
				getPEO11().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO12:
				setPEO12((PEO12CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO13:
				getPEO13().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO14:
				getPEO14().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO15:
				getPEO15().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO16:
				getPEO16().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO17:
				getPEO17().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO18:
				getPEO18().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO19:
				getPEO19().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO20:
				getPEO20().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO21:
				getPEO21().clear();
				return;
			case V2xmlPackage.PEOCONTENT__PEO22:
				setPEO22((PEO22CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO23:
				setPEO23((PEO23CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO24:
				setPEO24((PEO24CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__PEO25:
				setPEO25((PEO25CONTENT)null);
				return;
			case V2xmlPackage.PEOCONTENT__ANY:
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
			case V2xmlPackage.PEOCONTENT__PEO1:
				return pEO1 != null && !pEO1.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO2:
				return pEO2 != null && !pEO2.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO3:
				return pEO3 != null;
			case V2xmlPackage.PEOCONTENT__PEO4:
				return pEO4 != null;
			case V2xmlPackage.PEOCONTENT__PEO5:
				return pEO5 != null;
			case V2xmlPackage.PEOCONTENT__PEO6:
				return pEO6 != null;
			case V2xmlPackage.PEOCONTENT__PEO7:
				return pEO7 != null && !pEO7.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO8:
				return pEO8 != null && !pEO8.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO9:
				return pEO9 != null;
			case V2xmlPackage.PEOCONTENT__PEO10:
				return pEO10 != null;
			case V2xmlPackage.PEOCONTENT__PEO11:
				return pEO11 != null && !pEO11.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO12:
				return pEO12 != null;
			case V2xmlPackage.PEOCONTENT__PEO13:
				return pEO13 != null && !pEO13.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO14:
				return pEO14 != null && !pEO14.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO15:
				return pEO15 != null && !pEO15.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO16:
				return pEO16 != null && !pEO16.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO17:
				return pEO17 != null && !pEO17.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO18:
				return pEO18 != null && !pEO18.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO19:
				return pEO19 != null && !pEO19.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO20:
				return pEO20 != null && !pEO20.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO21:
				return pEO21 != null && !pEO21.isEmpty();
			case V2xmlPackage.PEOCONTENT__PEO22:
				return pEO22 != null;
			case V2xmlPackage.PEOCONTENT__PEO23:
				return pEO23 != null;
			case V2xmlPackage.PEOCONTENT__PEO24:
				return pEO24 != null;
			case V2xmlPackage.PEOCONTENT__PEO25:
				return pEO25 != null;
			case V2xmlPackage.PEOCONTENT__ANY:
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

} //PEOCONTENTImpl
