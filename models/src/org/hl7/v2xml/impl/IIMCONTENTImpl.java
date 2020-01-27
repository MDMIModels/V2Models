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

import org.hl7.v2xml.IIM10CONTENT;
import org.hl7.v2xml.IIM11CONTENT;
import org.hl7.v2xml.IIM12CONTENT;
import org.hl7.v2xml.IIM13CONTENT;
import org.hl7.v2xml.IIM14CONTENT;
import org.hl7.v2xml.IIM15CONTENT;
import org.hl7.v2xml.IIM1CONTENT;
import org.hl7.v2xml.IIM2CONTENT;
import org.hl7.v2xml.IIM3CONTENT;
import org.hl7.v2xml.IIM4CONTENT;
import org.hl7.v2xml.IIM5CONTENT;
import org.hl7.v2xml.IIM6CONTENT;
import org.hl7.v2xml.IIM7CONTENT;
import org.hl7.v2xml.IIM8CONTENT;
import org.hl7.v2xml.IIM9CONTENT;
import org.hl7.v2xml.IIMCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IIMCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM1 <em>IIM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM2 <em>IIM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM3 <em>IIM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM4 <em>IIM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM5 <em>IIM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM6 <em>IIM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM7 <em>IIM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM8 <em>IIM8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM9 <em>IIM9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM10 <em>IIM10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM11 <em>IIM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM12 <em>IIM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM13 <em>IIM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM14 <em>IIM14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getIIM15 <em>IIM15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IIMCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IIMCONTENTImpl extends EObjectImpl implements IIMCONTENT {
	/**
	 * The cached value of the '{@link #getIIM1() <em>IIM1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM1()
	 * @generated
	 * @ordered
	 */
	protected IIM1CONTENT iIM1;

	/**
	 * The cached value of the '{@link #getIIM2() <em>IIM2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM2()
	 * @generated
	 * @ordered
	 */
	protected IIM2CONTENT iIM2;

	/**
	 * The cached value of the '{@link #getIIM3() <em>IIM3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM3()
	 * @generated
	 * @ordered
	 */
	protected IIM3CONTENT iIM3;

	/**
	 * The cached value of the '{@link #getIIM4() <em>IIM4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM4()
	 * @generated
	 * @ordered
	 */
	protected IIM4CONTENT iIM4;

	/**
	 * The cached value of the '{@link #getIIM5() <em>IIM5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM5()
	 * @generated
	 * @ordered
	 */
	protected IIM5CONTENT iIM5;

	/**
	 * The cached value of the '{@link #getIIM6() <em>IIM6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM6()
	 * @generated
	 * @ordered
	 */
	protected IIM6CONTENT iIM6;

	/**
	 * The cached value of the '{@link #getIIM7() <em>IIM7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM7()
	 * @generated
	 * @ordered
	 */
	protected IIM7CONTENT iIM7;

	/**
	 * The cached value of the '{@link #getIIM8() <em>IIM8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM8()
	 * @generated
	 * @ordered
	 */
	protected IIM8CONTENT iIM8;

	/**
	 * The cached value of the '{@link #getIIM9() <em>IIM9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM9()
	 * @generated
	 * @ordered
	 */
	protected IIM9CONTENT iIM9;

	/**
	 * The cached value of the '{@link #getIIM10() <em>IIM10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM10()
	 * @generated
	 * @ordered
	 */
	protected IIM10CONTENT iIM10;

	/**
	 * The cached value of the '{@link #getIIM11() <em>IIM11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM11()
	 * @generated
	 * @ordered
	 */
	protected IIM11CONTENT iIM11;

	/**
	 * The cached value of the '{@link #getIIM12() <em>IIM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM12()
	 * @generated
	 * @ordered
	 */
	protected IIM12CONTENT iIM12;

	/**
	 * The cached value of the '{@link #getIIM13() <em>IIM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM13()
	 * @generated
	 * @ordered
	 */
	protected IIM13CONTENT iIM13;

	/**
	 * The cached value of the '{@link #getIIM14() <em>IIM14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM14()
	 * @generated
	 * @ordered
	 */
	protected IIM14CONTENT iIM14;

	/**
	 * The cached value of the '{@link #getIIM15() <em>IIM15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIIM15()
	 * @generated
	 * @ordered
	 */
	protected EList<IIM15CONTENT> iIM15;

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
	protected IIMCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIIMCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM1CONTENT getIIM1() {
		return iIM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM1(IIM1CONTENT newIIM1, NotificationChain msgs) {
		IIM1CONTENT oldIIM1 = iIM1;
		iIM1 = newIIM1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM1, oldIIM1, newIIM1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM1(IIM1CONTENT newIIM1) {
		if (newIIM1 != iIM1) {
			NotificationChain msgs = null;
			if (iIM1 != null)
				msgs = ((InternalEObject)iIM1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM1, null, msgs);
			if (newIIM1 != null)
				msgs = ((InternalEObject)newIIM1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM1, null, msgs);
			msgs = basicSetIIM1(newIIM1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM1, newIIM1, newIIM1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM2CONTENT getIIM2() {
		return iIM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM2(IIM2CONTENT newIIM2, NotificationChain msgs) {
		IIM2CONTENT oldIIM2 = iIM2;
		iIM2 = newIIM2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM2, oldIIM2, newIIM2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM2(IIM2CONTENT newIIM2) {
		if (newIIM2 != iIM2) {
			NotificationChain msgs = null;
			if (iIM2 != null)
				msgs = ((InternalEObject)iIM2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM2, null, msgs);
			if (newIIM2 != null)
				msgs = ((InternalEObject)newIIM2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM2, null, msgs);
			msgs = basicSetIIM2(newIIM2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM2, newIIM2, newIIM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM3CONTENT getIIM3() {
		return iIM3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM3(IIM3CONTENT newIIM3, NotificationChain msgs) {
		IIM3CONTENT oldIIM3 = iIM3;
		iIM3 = newIIM3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM3, oldIIM3, newIIM3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM3(IIM3CONTENT newIIM3) {
		if (newIIM3 != iIM3) {
			NotificationChain msgs = null;
			if (iIM3 != null)
				msgs = ((InternalEObject)iIM3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM3, null, msgs);
			if (newIIM3 != null)
				msgs = ((InternalEObject)newIIM3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM3, null, msgs);
			msgs = basicSetIIM3(newIIM3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM3, newIIM3, newIIM3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM4CONTENT getIIM4() {
		return iIM4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM4(IIM4CONTENT newIIM4, NotificationChain msgs) {
		IIM4CONTENT oldIIM4 = iIM4;
		iIM4 = newIIM4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM4, oldIIM4, newIIM4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM4(IIM4CONTENT newIIM4) {
		if (newIIM4 != iIM4) {
			NotificationChain msgs = null;
			if (iIM4 != null)
				msgs = ((InternalEObject)iIM4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM4, null, msgs);
			if (newIIM4 != null)
				msgs = ((InternalEObject)newIIM4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM4, null, msgs);
			msgs = basicSetIIM4(newIIM4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM4, newIIM4, newIIM4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM5CONTENT getIIM5() {
		return iIM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM5(IIM5CONTENT newIIM5, NotificationChain msgs) {
		IIM5CONTENT oldIIM5 = iIM5;
		iIM5 = newIIM5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM5, oldIIM5, newIIM5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM5(IIM5CONTENT newIIM5) {
		if (newIIM5 != iIM5) {
			NotificationChain msgs = null;
			if (iIM5 != null)
				msgs = ((InternalEObject)iIM5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM5, null, msgs);
			if (newIIM5 != null)
				msgs = ((InternalEObject)newIIM5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM5, null, msgs);
			msgs = basicSetIIM5(newIIM5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM5, newIIM5, newIIM5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM6CONTENT getIIM6() {
		return iIM6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM6(IIM6CONTENT newIIM6, NotificationChain msgs) {
		IIM6CONTENT oldIIM6 = iIM6;
		iIM6 = newIIM6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM6, oldIIM6, newIIM6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM6(IIM6CONTENT newIIM6) {
		if (newIIM6 != iIM6) {
			NotificationChain msgs = null;
			if (iIM6 != null)
				msgs = ((InternalEObject)iIM6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM6, null, msgs);
			if (newIIM6 != null)
				msgs = ((InternalEObject)newIIM6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM6, null, msgs);
			msgs = basicSetIIM6(newIIM6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM6, newIIM6, newIIM6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM7CONTENT getIIM7() {
		return iIM7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM7(IIM7CONTENT newIIM7, NotificationChain msgs) {
		IIM7CONTENT oldIIM7 = iIM7;
		iIM7 = newIIM7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM7, oldIIM7, newIIM7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM7(IIM7CONTENT newIIM7) {
		if (newIIM7 != iIM7) {
			NotificationChain msgs = null;
			if (iIM7 != null)
				msgs = ((InternalEObject)iIM7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM7, null, msgs);
			if (newIIM7 != null)
				msgs = ((InternalEObject)newIIM7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM7, null, msgs);
			msgs = basicSetIIM7(newIIM7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM7, newIIM7, newIIM7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM8CONTENT getIIM8() {
		return iIM8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM8(IIM8CONTENT newIIM8, NotificationChain msgs) {
		IIM8CONTENT oldIIM8 = iIM8;
		iIM8 = newIIM8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM8, oldIIM8, newIIM8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM8(IIM8CONTENT newIIM8) {
		if (newIIM8 != iIM8) {
			NotificationChain msgs = null;
			if (iIM8 != null)
				msgs = ((InternalEObject)iIM8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM8, null, msgs);
			if (newIIM8 != null)
				msgs = ((InternalEObject)newIIM8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM8, null, msgs);
			msgs = basicSetIIM8(newIIM8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM8, newIIM8, newIIM8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM9CONTENT getIIM9() {
		return iIM9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM9(IIM9CONTENT newIIM9, NotificationChain msgs) {
		IIM9CONTENT oldIIM9 = iIM9;
		iIM9 = newIIM9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM9, oldIIM9, newIIM9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM9(IIM9CONTENT newIIM9) {
		if (newIIM9 != iIM9) {
			NotificationChain msgs = null;
			if (iIM9 != null)
				msgs = ((InternalEObject)iIM9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM9, null, msgs);
			if (newIIM9 != null)
				msgs = ((InternalEObject)newIIM9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM9, null, msgs);
			msgs = basicSetIIM9(newIIM9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM9, newIIM9, newIIM9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM10CONTENT getIIM10() {
		return iIM10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM10(IIM10CONTENT newIIM10, NotificationChain msgs) {
		IIM10CONTENT oldIIM10 = iIM10;
		iIM10 = newIIM10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM10, oldIIM10, newIIM10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM10(IIM10CONTENT newIIM10) {
		if (newIIM10 != iIM10) {
			NotificationChain msgs = null;
			if (iIM10 != null)
				msgs = ((InternalEObject)iIM10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM10, null, msgs);
			if (newIIM10 != null)
				msgs = ((InternalEObject)newIIM10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM10, null, msgs);
			msgs = basicSetIIM10(newIIM10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM10, newIIM10, newIIM10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM11CONTENT getIIM11() {
		return iIM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM11(IIM11CONTENT newIIM11, NotificationChain msgs) {
		IIM11CONTENT oldIIM11 = iIM11;
		iIM11 = newIIM11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM11, oldIIM11, newIIM11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM11(IIM11CONTENT newIIM11) {
		if (newIIM11 != iIM11) {
			NotificationChain msgs = null;
			if (iIM11 != null)
				msgs = ((InternalEObject)iIM11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM11, null, msgs);
			if (newIIM11 != null)
				msgs = ((InternalEObject)newIIM11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM11, null, msgs);
			msgs = basicSetIIM11(newIIM11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM11, newIIM11, newIIM11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM12CONTENT getIIM12() {
		return iIM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM12(IIM12CONTENT newIIM12, NotificationChain msgs) {
		IIM12CONTENT oldIIM12 = iIM12;
		iIM12 = newIIM12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM12, oldIIM12, newIIM12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM12(IIM12CONTENT newIIM12) {
		if (newIIM12 != iIM12) {
			NotificationChain msgs = null;
			if (iIM12 != null)
				msgs = ((InternalEObject)iIM12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM12, null, msgs);
			if (newIIM12 != null)
				msgs = ((InternalEObject)newIIM12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM12, null, msgs);
			msgs = basicSetIIM12(newIIM12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM12, newIIM12, newIIM12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM13CONTENT getIIM13() {
		return iIM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM13(IIM13CONTENT newIIM13, NotificationChain msgs) {
		IIM13CONTENT oldIIM13 = iIM13;
		iIM13 = newIIM13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM13, oldIIM13, newIIM13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM13(IIM13CONTENT newIIM13) {
		if (newIIM13 != iIM13) {
			NotificationChain msgs = null;
			if (iIM13 != null)
				msgs = ((InternalEObject)iIM13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM13, null, msgs);
			if (newIIM13 != null)
				msgs = ((InternalEObject)newIIM13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM13, null, msgs);
			msgs = basicSetIIM13(newIIM13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM13, newIIM13, newIIM13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIM14CONTENT getIIM14() {
		return iIM14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIIM14(IIM14CONTENT newIIM14, NotificationChain msgs) {
		IIM14CONTENT oldIIM14 = iIM14;
		iIM14 = newIIM14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM14, oldIIM14, newIIM14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIIM14(IIM14CONTENT newIIM14) {
		if (newIIM14 != iIM14) {
			NotificationChain msgs = null;
			if (iIM14 != null)
				msgs = ((InternalEObject)iIM14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM14, null, msgs);
			if (newIIM14 != null)
				msgs = ((InternalEObject)newIIM14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IIMCONTENT__IIM14, null, msgs);
			msgs = basicSetIIM14(newIIM14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IIMCONTENT__IIM14, newIIM14, newIIM14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IIM15CONTENT> getIIM15() {
		if (iIM15 == null) {
			iIM15 = new EObjectContainmentEList<IIM15CONTENT>(IIM15CONTENT.class, this, V2xmlPackage.IIMCONTENT__IIM15);
		}
		return iIM15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IIMCONTENT__ANY);
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
			case V2xmlPackage.IIMCONTENT__IIM1:
				return basicSetIIM1(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM2:
				return basicSetIIM2(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM3:
				return basicSetIIM3(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM4:
				return basicSetIIM4(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM5:
				return basicSetIIM5(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM6:
				return basicSetIIM6(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM7:
				return basicSetIIM7(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM8:
				return basicSetIIM8(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM9:
				return basicSetIIM9(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM10:
				return basicSetIIM10(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM11:
				return basicSetIIM11(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM12:
				return basicSetIIM12(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM13:
				return basicSetIIM13(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM14:
				return basicSetIIM14(null, msgs);
			case V2xmlPackage.IIMCONTENT__IIM15:
				return ((InternalEList<?>)getIIM15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IIMCONTENT__ANY:
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
			case V2xmlPackage.IIMCONTENT__IIM1:
				return getIIM1();
			case V2xmlPackage.IIMCONTENT__IIM2:
				return getIIM2();
			case V2xmlPackage.IIMCONTENT__IIM3:
				return getIIM3();
			case V2xmlPackage.IIMCONTENT__IIM4:
				return getIIM4();
			case V2xmlPackage.IIMCONTENT__IIM5:
				return getIIM5();
			case V2xmlPackage.IIMCONTENT__IIM6:
				return getIIM6();
			case V2xmlPackage.IIMCONTENT__IIM7:
				return getIIM7();
			case V2xmlPackage.IIMCONTENT__IIM8:
				return getIIM8();
			case V2xmlPackage.IIMCONTENT__IIM9:
				return getIIM9();
			case V2xmlPackage.IIMCONTENT__IIM10:
				return getIIM10();
			case V2xmlPackage.IIMCONTENT__IIM11:
				return getIIM11();
			case V2xmlPackage.IIMCONTENT__IIM12:
				return getIIM12();
			case V2xmlPackage.IIMCONTENT__IIM13:
				return getIIM13();
			case V2xmlPackage.IIMCONTENT__IIM14:
				return getIIM14();
			case V2xmlPackage.IIMCONTENT__IIM15:
				return getIIM15();
			case V2xmlPackage.IIMCONTENT__ANY:
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
			case V2xmlPackage.IIMCONTENT__IIM1:
				setIIM1((IIM1CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM2:
				setIIM2((IIM2CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM3:
				setIIM3((IIM3CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM4:
				setIIM4((IIM4CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM5:
				setIIM5((IIM5CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM6:
				setIIM6((IIM6CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM7:
				setIIM7((IIM7CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM8:
				setIIM8((IIM8CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM9:
				setIIM9((IIM9CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM10:
				setIIM10((IIM10CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM11:
				setIIM11((IIM11CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM12:
				setIIM12((IIM12CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM13:
				setIIM13((IIM13CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM14:
				setIIM14((IIM14CONTENT)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__IIM15:
				getIIM15().clear();
				getIIM15().addAll((Collection<? extends IIM15CONTENT>)newValue);
				return;
			case V2xmlPackage.IIMCONTENT__ANY:
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
			case V2xmlPackage.IIMCONTENT__IIM1:
				setIIM1((IIM1CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM2:
				setIIM2((IIM2CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM3:
				setIIM3((IIM3CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM4:
				setIIM4((IIM4CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM5:
				setIIM5((IIM5CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM6:
				setIIM6((IIM6CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM7:
				setIIM7((IIM7CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM8:
				setIIM8((IIM8CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM9:
				setIIM9((IIM9CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM10:
				setIIM10((IIM10CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM11:
				setIIM11((IIM11CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM12:
				setIIM12((IIM12CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM13:
				setIIM13((IIM13CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM14:
				setIIM14((IIM14CONTENT)null);
				return;
			case V2xmlPackage.IIMCONTENT__IIM15:
				getIIM15().clear();
				return;
			case V2xmlPackage.IIMCONTENT__ANY:
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
			case V2xmlPackage.IIMCONTENT__IIM1:
				return iIM1 != null;
			case V2xmlPackage.IIMCONTENT__IIM2:
				return iIM2 != null;
			case V2xmlPackage.IIMCONTENT__IIM3:
				return iIM3 != null;
			case V2xmlPackage.IIMCONTENT__IIM4:
				return iIM4 != null;
			case V2xmlPackage.IIMCONTENT__IIM5:
				return iIM5 != null;
			case V2xmlPackage.IIMCONTENT__IIM6:
				return iIM6 != null;
			case V2xmlPackage.IIMCONTENT__IIM7:
				return iIM7 != null;
			case V2xmlPackage.IIMCONTENT__IIM8:
				return iIM8 != null;
			case V2xmlPackage.IIMCONTENT__IIM9:
				return iIM9 != null;
			case V2xmlPackage.IIMCONTENT__IIM10:
				return iIM10 != null;
			case V2xmlPackage.IIMCONTENT__IIM11:
				return iIM11 != null;
			case V2xmlPackage.IIMCONTENT__IIM12:
				return iIM12 != null;
			case V2xmlPackage.IIMCONTENT__IIM13:
				return iIM13 != null;
			case V2xmlPackage.IIMCONTENT__IIM14:
				return iIM14 != null;
			case V2xmlPackage.IIMCONTENT__IIM15:
				return iIM15 != null && !iIM15.isEmpty();
			case V2xmlPackage.IIMCONTENT__ANY:
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

} //IIMCONTENTImpl
