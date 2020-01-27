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

import org.hl7.v2xml.INV10CONTENT;
import org.hl7.v2xml.INV11CONTENT;
import org.hl7.v2xml.INV12CONTENT;
import org.hl7.v2xml.INV13CONTENT;
import org.hl7.v2xml.INV14CONTENT;
import org.hl7.v2xml.INV15CONTENT;
import org.hl7.v2xml.INV16CONTENT;
import org.hl7.v2xml.INV17CONTENT;
import org.hl7.v2xml.INV18CONTENT;
import org.hl7.v2xml.INV19CONTENT;
import org.hl7.v2xml.INV1CONTENT;
import org.hl7.v2xml.INV20CONTENT;
import org.hl7.v2xml.INV2CONTENT;
import org.hl7.v2xml.INV3CONTENT;
import org.hl7.v2xml.INV4CONTENT;
import org.hl7.v2xml.INV5CONTENT;
import org.hl7.v2xml.INV6CONTENT;
import org.hl7.v2xml.INV7CONTENT;
import org.hl7.v2xml.INV8CONTENT;
import org.hl7.v2xml.INV9CONTENT;
import org.hl7.v2xml.INVCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>INVCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV1 <em>INV1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV2 <em>INV2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV3 <em>INV3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV4 <em>INV4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV5 <em>INV5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV6 <em>INV6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV7 <em>INV7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV8 <em>INV8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV9 <em>INV9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV10 <em>INV10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV11 <em>INV11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV12 <em>INV12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV13 <em>INV13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV14 <em>INV14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV15 <em>INV15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV16 <em>INV16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV17 <em>INV17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV18 <em>INV18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV19 <em>INV19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getINV20 <em>INV20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.INVCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class INVCONTENTImpl extends EObjectImpl implements INVCONTENT {
	/**
	 * The cached value of the '{@link #getINV1() <em>INV1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV1()
	 * @generated
	 * @ordered
	 */
	protected INV1CONTENT iNV1;

	/**
	 * The cached value of the '{@link #getINV2() <em>INV2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV2()
	 * @generated
	 * @ordered
	 */
	protected EList<INV2CONTENT> iNV2;

	/**
	 * The cached value of the '{@link #getINV3() <em>INV3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV3()
	 * @generated
	 * @ordered
	 */
	protected INV3CONTENT iNV3;

	/**
	 * The cached value of the '{@link #getINV4() <em>INV4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV4()
	 * @generated
	 * @ordered
	 */
	protected INV4CONTENT iNV4;

	/**
	 * The cached value of the '{@link #getINV5() <em>INV5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV5()
	 * @generated
	 * @ordered
	 */
	protected INV5CONTENT iNV5;

	/**
	 * The cached value of the '{@link #getINV6() <em>INV6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV6()
	 * @generated
	 * @ordered
	 */
	protected INV6CONTENT iNV6;

	/**
	 * The cached value of the '{@link #getINV7() <em>INV7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV7()
	 * @generated
	 * @ordered
	 */
	protected INV7CONTENT iNV7;

	/**
	 * The cached value of the '{@link #getINV8() <em>INV8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV8()
	 * @generated
	 * @ordered
	 */
	protected INV8CONTENT iNV8;

	/**
	 * The cached value of the '{@link #getINV9() <em>INV9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV9()
	 * @generated
	 * @ordered
	 */
	protected INV9CONTENT iNV9;

	/**
	 * The cached value of the '{@link #getINV10() <em>INV10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV10()
	 * @generated
	 * @ordered
	 */
	protected INV10CONTENT iNV10;

	/**
	 * The cached value of the '{@link #getINV11() <em>INV11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV11()
	 * @generated
	 * @ordered
	 */
	protected INV11CONTENT iNV11;

	/**
	 * The cached value of the '{@link #getINV12() <em>INV12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV12()
	 * @generated
	 * @ordered
	 */
	protected INV12CONTENT iNV12;

	/**
	 * The cached value of the '{@link #getINV13() <em>INV13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV13()
	 * @generated
	 * @ordered
	 */
	protected INV13CONTENT iNV13;

	/**
	 * The cached value of the '{@link #getINV14() <em>INV14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV14()
	 * @generated
	 * @ordered
	 */
	protected INV14CONTENT iNV14;

	/**
	 * The cached value of the '{@link #getINV15() <em>INV15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV15()
	 * @generated
	 * @ordered
	 */
	protected EList<INV15CONTENT> iNV15;

	/**
	 * The cached value of the '{@link #getINV16() <em>INV16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV16()
	 * @generated
	 * @ordered
	 */
	protected INV16CONTENT iNV16;

	/**
	 * The cached value of the '{@link #getINV17() <em>INV17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV17()
	 * @generated
	 * @ordered
	 */
	protected INV17CONTENT iNV17;

	/**
	 * The cached value of the '{@link #getINV18() <em>INV18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV18()
	 * @generated
	 * @ordered
	 */
	protected INV18CONTENT iNV18;

	/**
	 * The cached value of the '{@link #getINV19() <em>INV19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV19()
	 * @generated
	 * @ordered
	 */
	protected INV19CONTENT iNV19;

	/**
	 * The cached value of the '{@link #getINV20() <em>INV20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getINV20()
	 * @generated
	 * @ordered
	 */
	protected INV20CONTENT iNV20;

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
	protected INVCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getINVCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV1CONTENT getINV1() {
		return iNV1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV1(INV1CONTENT newINV1, NotificationChain msgs) {
		INV1CONTENT oldINV1 = iNV1;
		iNV1 = newINV1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV1, oldINV1, newINV1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV1(INV1CONTENT newINV1) {
		if (newINV1 != iNV1) {
			NotificationChain msgs = null;
			if (iNV1 != null)
				msgs = ((InternalEObject)iNV1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV1, null, msgs);
			if (newINV1 != null)
				msgs = ((InternalEObject)newINV1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV1, null, msgs);
			msgs = basicSetINV1(newINV1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV1, newINV1, newINV1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INV2CONTENT> getINV2() {
		if (iNV2 == null) {
			iNV2 = new EObjectContainmentEList<INV2CONTENT>(INV2CONTENT.class, this, V2xmlPackage.INVCONTENT__INV2);
		}
		return iNV2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV3CONTENT getINV3() {
		return iNV3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV3(INV3CONTENT newINV3, NotificationChain msgs) {
		INV3CONTENT oldINV3 = iNV3;
		iNV3 = newINV3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV3, oldINV3, newINV3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV3(INV3CONTENT newINV3) {
		if (newINV3 != iNV3) {
			NotificationChain msgs = null;
			if (iNV3 != null)
				msgs = ((InternalEObject)iNV3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV3, null, msgs);
			if (newINV3 != null)
				msgs = ((InternalEObject)newINV3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV3, null, msgs);
			msgs = basicSetINV3(newINV3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV3, newINV3, newINV3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV4CONTENT getINV4() {
		return iNV4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV4(INV4CONTENT newINV4, NotificationChain msgs) {
		INV4CONTENT oldINV4 = iNV4;
		iNV4 = newINV4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV4, oldINV4, newINV4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV4(INV4CONTENT newINV4) {
		if (newINV4 != iNV4) {
			NotificationChain msgs = null;
			if (iNV4 != null)
				msgs = ((InternalEObject)iNV4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV4, null, msgs);
			if (newINV4 != null)
				msgs = ((InternalEObject)newINV4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV4, null, msgs);
			msgs = basicSetINV4(newINV4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV4, newINV4, newINV4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV5CONTENT getINV5() {
		return iNV5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV5(INV5CONTENT newINV5, NotificationChain msgs) {
		INV5CONTENT oldINV5 = iNV5;
		iNV5 = newINV5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV5, oldINV5, newINV5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV5(INV5CONTENT newINV5) {
		if (newINV5 != iNV5) {
			NotificationChain msgs = null;
			if (iNV5 != null)
				msgs = ((InternalEObject)iNV5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV5, null, msgs);
			if (newINV5 != null)
				msgs = ((InternalEObject)newINV5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV5, null, msgs);
			msgs = basicSetINV5(newINV5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV5, newINV5, newINV5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV6CONTENT getINV6() {
		return iNV6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV6(INV6CONTENT newINV6, NotificationChain msgs) {
		INV6CONTENT oldINV6 = iNV6;
		iNV6 = newINV6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV6, oldINV6, newINV6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV6(INV6CONTENT newINV6) {
		if (newINV6 != iNV6) {
			NotificationChain msgs = null;
			if (iNV6 != null)
				msgs = ((InternalEObject)iNV6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV6, null, msgs);
			if (newINV6 != null)
				msgs = ((InternalEObject)newINV6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV6, null, msgs);
			msgs = basicSetINV6(newINV6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV6, newINV6, newINV6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV7CONTENT getINV7() {
		return iNV7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV7(INV7CONTENT newINV7, NotificationChain msgs) {
		INV7CONTENT oldINV7 = iNV7;
		iNV7 = newINV7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV7, oldINV7, newINV7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV7(INV7CONTENT newINV7) {
		if (newINV7 != iNV7) {
			NotificationChain msgs = null;
			if (iNV7 != null)
				msgs = ((InternalEObject)iNV7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV7, null, msgs);
			if (newINV7 != null)
				msgs = ((InternalEObject)newINV7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV7, null, msgs);
			msgs = basicSetINV7(newINV7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV7, newINV7, newINV7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV8CONTENT getINV8() {
		return iNV8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV8(INV8CONTENT newINV8, NotificationChain msgs) {
		INV8CONTENT oldINV8 = iNV8;
		iNV8 = newINV8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV8, oldINV8, newINV8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV8(INV8CONTENT newINV8) {
		if (newINV8 != iNV8) {
			NotificationChain msgs = null;
			if (iNV8 != null)
				msgs = ((InternalEObject)iNV8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV8, null, msgs);
			if (newINV8 != null)
				msgs = ((InternalEObject)newINV8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV8, null, msgs);
			msgs = basicSetINV8(newINV8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV8, newINV8, newINV8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV9CONTENT getINV9() {
		return iNV9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV9(INV9CONTENT newINV9, NotificationChain msgs) {
		INV9CONTENT oldINV9 = iNV9;
		iNV9 = newINV9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV9, oldINV9, newINV9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV9(INV9CONTENT newINV9) {
		if (newINV9 != iNV9) {
			NotificationChain msgs = null;
			if (iNV9 != null)
				msgs = ((InternalEObject)iNV9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV9, null, msgs);
			if (newINV9 != null)
				msgs = ((InternalEObject)newINV9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV9, null, msgs);
			msgs = basicSetINV9(newINV9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV9, newINV9, newINV9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV10CONTENT getINV10() {
		return iNV10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV10(INV10CONTENT newINV10, NotificationChain msgs) {
		INV10CONTENT oldINV10 = iNV10;
		iNV10 = newINV10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV10, oldINV10, newINV10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV10(INV10CONTENT newINV10) {
		if (newINV10 != iNV10) {
			NotificationChain msgs = null;
			if (iNV10 != null)
				msgs = ((InternalEObject)iNV10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV10, null, msgs);
			if (newINV10 != null)
				msgs = ((InternalEObject)newINV10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV10, null, msgs);
			msgs = basicSetINV10(newINV10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV10, newINV10, newINV10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV11CONTENT getINV11() {
		return iNV11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV11(INV11CONTENT newINV11, NotificationChain msgs) {
		INV11CONTENT oldINV11 = iNV11;
		iNV11 = newINV11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV11, oldINV11, newINV11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV11(INV11CONTENT newINV11) {
		if (newINV11 != iNV11) {
			NotificationChain msgs = null;
			if (iNV11 != null)
				msgs = ((InternalEObject)iNV11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV11, null, msgs);
			if (newINV11 != null)
				msgs = ((InternalEObject)newINV11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV11, null, msgs);
			msgs = basicSetINV11(newINV11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV11, newINV11, newINV11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV12CONTENT getINV12() {
		return iNV12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV12(INV12CONTENT newINV12, NotificationChain msgs) {
		INV12CONTENT oldINV12 = iNV12;
		iNV12 = newINV12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV12, oldINV12, newINV12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV12(INV12CONTENT newINV12) {
		if (newINV12 != iNV12) {
			NotificationChain msgs = null;
			if (iNV12 != null)
				msgs = ((InternalEObject)iNV12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV12, null, msgs);
			if (newINV12 != null)
				msgs = ((InternalEObject)newINV12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV12, null, msgs);
			msgs = basicSetINV12(newINV12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV12, newINV12, newINV12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV13CONTENT getINV13() {
		return iNV13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV13(INV13CONTENT newINV13, NotificationChain msgs) {
		INV13CONTENT oldINV13 = iNV13;
		iNV13 = newINV13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV13, oldINV13, newINV13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV13(INV13CONTENT newINV13) {
		if (newINV13 != iNV13) {
			NotificationChain msgs = null;
			if (iNV13 != null)
				msgs = ((InternalEObject)iNV13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV13, null, msgs);
			if (newINV13 != null)
				msgs = ((InternalEObject)newINV13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV13, null, msgs);
			msgs = basicSetINV13(newINV13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV13, newINV13, newINV13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV14CONTENT getINV14() {
		return iNV14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV14(INV14CONTENT newINV14, NotificationChain msgs) {
		INV14CONTENT oldINV14 = iNV14;
		iNV14 = newINV14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV14, oldINV14, newINV14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV14(INV14CONTENT newINV14) {
		if (newINV14 != iNV14) {
			NotificationChain msgs = null;
			if (iNV14 != null)
				msgs = ((InternalEObject)iNV14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV14, null, msgs);
			if (newINV14 != null)
				msgs = ((InternalEObject)newINV14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV14, null, msgs);
			msgs = basicSetINV14(newINV14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV14, newINV14, newINV14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<INV15CONTENT> getINV15() {
		if (iNV15 == null) {
			iNV15 = new EObjectContainmentEList<INV15CONTENT>(INV15CONTENT.class, this, V2xmlPackage.INVCONTENT__INV15);
		}
		return iNV15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV16CONTENT getINV16() {
		return iNV16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV16(INV16CONTENT newINV16, NotificationChain msgs) {
		INV16CONTENT oldINV16 = iNV16;
		iNV16 = newINV16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV16, oldINV16, newINV16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV16(INV16CONTENT newINV16) {
		if (newINV16 != iNV16) {
			NotificationChain msgs = null;
			if (iNV16 != null)
				msgs = ((InternalEObject)iNV16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV16, null, msgs);
			if (newINV16 != null)
				msgs = ((InternalEObject)newINV16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV16, null, msgs);
			msgs = basicSetINV16(newINV16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV16, newINV16, newINV16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV17CONTENT getINV17() {
		return iNV17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV17(INV17CONTENT newINV17, NotificationChain msgs) {
		INV17CONTENT oldINV17 = iNV17;
		iNV17 = newINV17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV17, oldINV17, newINV17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV17(INV17CONTENT newINV17) {
		if (newINV17 != iNV17) {
			NotificationChain msgs = null;
			if (iNV17 != null)
				msgs = ((InternalEObject)iNV17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV17, null, msgs);
			if (newINV17 != null)
				msgs = ((InternalEObject)newINV17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV17, null, msgs);
			msgs = basicSetINV17(newINV17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV17, newINV17, newINV17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV18CONTENT getINV18() {
		return iNV18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV18(INV18CONTENT newINV18, NotificationChain msgs) {
		INV18CONTENT oldINV18 = iNV18;
		iNV18 = newINV18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV18, oldINV18, newINV18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV18(INV18CONTENT newINV18) {
		if (newINV18 != iNV18) {
			NotificationChain msgs = null;
			if (iNV18 != null)
				msgs = ((InternalEObject)iNV18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV18, null, msgs);
			if (newINV18 != null)
				msgs = ((InternalEObject)newINV18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV18, null, msgs);
			msgs = basicSetINV18(newINV18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV18, newINV18, newINV18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV19CONTENT getINV19() {
		return iNV19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV19(INV19CONTENT newINV19, NotificationChain msgs) {
		INV19CONTENT oldINV19 = iNV19;
		iNV19 = newINV19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV19, oldINV19, newINV19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV19(INV19CONTENT newINV19) {
		if (newINV19 != iNV19) {
			NotificationChain msgs = null;
			if (iNV19 != null)
				msgs = ((InternalEObject)iNV19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV19, null, msgs);
			if (newINV19 != null)
				msgs = ((InternalEObject)newINV19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV19, null, msgs);
			msgs = basicSetINV19(newINV19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV19, newINV19, newINV19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INV20CONTENT getINV20() {
		return iNV20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetINV20(INV20CONTENT newINV20, NotificationChain msgs) {
		INV20CONTENT oldINV20 = iNV20;
		iNV20 = newINV20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV20, oldINV20, newINV20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setINV20(INV20CONTENT newINV20) {
		if (newINV20 != iNV20) {
			NotificationChain msgs = null;
			if (iNV20 != null)
				msgs = ((InternalEObject)iNV20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV20, null, msgs);
			if (newINV20 != null)
				msgs = ((InternalEObject)newINV20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.INVCONTENT__INV20, null, msgs);
			msgs = basicSetINV20(newINV20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.INVCONTENT__INV20, newINV20, newINV20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.INVCONTENT__ANY);
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
			case V2xmlPackage.INVCONTENT__INV1:
				return basicSetINV1(null, msgs);
			case V2xmlPackage.INVCONTENT__INV2:
				return ((InternalEList<?>)getINV2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.INVCONTENT__INV3:
				return basicSetINV3(null, msgs);
			case V2xmlPackage.INVCONTENT__INV4:
				return basicSetINV4(null, msgs);
			case V2xmlPackage.INVCONTENT__INV5:
				return basicSetINV5(null, msgs);
			case V2xmlPackage.INVCONTENT__INV6:
				return basicSetINV6(null, msgs);
			case V2xmlPackage.INVCONTENT__INV7:
				return basicSetINV7(null, msgs);
			case V2xmlPackage.INVCONTENT__INV8:
				return basicSetINV8(null, msgs);
			case V2xmlPackage.INVCONTENT__INV9:
				return basicSetINV9(null, msgs);
			case V2xmlPackage.INVCONTENT__INV10:
				return basicSetINV10(null, msgs);
			case V2xmlPackage.INVCONTENT__INV11:
				return basicSetINV11(null, msgs);
			case V2xmlPackage.INVCONTENT__INV12:
				return basicSetINV12(null, msgs);
			case V2xmlPackage.INVCONTENT__INV13:
				return basicSetINV13(null, msgs);
			case V2xmlPackage.INVCONTENT__INV14:
				return basicSetINV14(null, msgs);
			case V2xmlPackage.INVCONTENT__INV15:
				return ((InternalEList<?>)getINV15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.INVCONTENT__INV16:
				return basicSetINV16(null, msgs);
			case V2xmlPackage.INVCONTENT__INV17:
				return basicSetINV17(null, msgs);
			case V2xmlPackage.INVCONTENT__INV18:
				return basicSetINV18(null, msgs);
			case V2xmlPackage.INVCONTENT__INV19:
				return basicSetINV19(null, msgs);
			case V2xmlPackage.INVCONTENT__INV20:
				return basicSetINV20(null, msgs);
			case V2xmlPackage.INVCONTENT__ANY:
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
			case V2xmlPackage.INVCONTENT__INV1:
				return getINV1();
			case V2xmlPackage.INVCONTENT__INV2:
				return getINV2();
			case V2xmlPackage.INVCONTENT__INV3:
				return getINV3();
			case V2xmlPackage.INVCONTENT__INV4:
				return getINV4();
			case V2xmlPackage.INVCONTENT__INV5:
				return getINV5();
			case V2xmlPackage.INVCONTENT__INV6:
				return getINV6();
			case V2xmlPackage.INVCONTENT__INV7:
				return getINV7();
			case V2xmlPackage.INVCONTENT__INV8:
				return getINV8();
			case V2xmlPackage.INVCONTENT__INV9:
				return getINV9();
			case V2xmlPackage.INVCONTENT__INV10:
				return getINV10();
			case V2xmlPackage.INVCONTENT__INV11:
				return getINV11();
			case V2xmlPackage.INVCONTENT__INV12:
				return getINV12();
			case V2xmlPackage.INVCONTENT__INV13:
				return getINV13();
			case V2xmlPackage.INVCONTENT__INV14:
				return getINV14();
			case V2xmlPackage.INVCONTENT__INV15:
				return getINV15();
			case V2xmlPackage.INVCONTENT__INV16:
				return getINV16();
			case V2xmlPackage.INVCONTENT__INV17:
				return getINV17();
			case V2xmlPackage.INVCONTENT__INV18:
				return getINV18();
			case V2xmlPackage.INVCONTENT__INV19:
				return getINV19();
			case V2xmlPackage.INVCONTENT__INV20:
				return getINV20();
			case V2xmlPackage.INVCONTENT__ANY:
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
			case V2xmlPackage.INVCONTENT__INV1:
				setINV1((INV1CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV2:
				getINV2().clear();
				getINV2().addAll((Collection<? extends INV2CONTENT>)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV3:
				setINV3((INV3CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV4:
				setINV4((INV4CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV5:
				setINV5((INV5CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV6:
				setINV6((INV6CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV7:
				setINV7((INV7CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV8:
				setINV8((INV8CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV9:
				setINV9((INV9CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV10:
				setINV10((INV10CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV11:
				setINV11((INV11CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV12:
				setINV12((INV12CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV13:
				setINV13((INV13CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV14:
				setINV14((INV14CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV15:
				getINV15().clear();
				getINV15().addAll((Collection<? extends INV15CONTENT>)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV16:
				setINV16((INV16CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV17:
				setINV17((INV17CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV18:
				setINV18((INV18CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV19:
				setINV19((INV19CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__INV20:
				setINV20((INV20CONTENT)newValue);
				return;
			case V2xmlPackage.INVCONTENT__ANY:
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
			case V2xmlPackage.INVCONTENT__INV1:
				setINV1((INV1CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV2:
				getINV2().clear();
				return;
			case V2xmlPackage.INVCONTENT__INV3:
				setINV3((INV3CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV4:
				setINV4((INV4CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV5:
				setINV5((INV5CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV6:
				setINV6((INV6CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV7:
				setINV7((INV7CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV8:
				setINV8((INV8CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV9:
				setINV9((INV9CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV10:
				setINV10((INV10CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV11:
				setINV11((INV11CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV12:
				setINV12((INV12CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV13:
				setINV13((INV13CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV14:
				setINV14((INV14CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV15:
				getINV15().clear();
				return;
			case V2xmlPackage.INVCONTENT__INV16:
				setINV16((INV16CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV17:
				setINV17((INV17CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV18:
				setINV18((INV18CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV19:
				setINV19((INV19CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__INV20:
				setINV20((INV20CONTENT)null);
				return;
			case V2xmlPackage.INVCONTENT__ANY:
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
			case V2xmlPackage.INVCONTENT__INV1:
				return iNV1 != null;
			case V2xmlPackage.INVCONTENT__INV2:
				return iNV2 != null && !iNV2.isEmpty();
			case V2xmlPackage.INVCONTENT__INV3:
				return iNV3 != null;
			case V2xmlPackage.INVCONTENT__INV4:
				return iNV4 != null;
			case V2xmlPackage.INVCONTENT__INV5:
				return iNV5 != null;
			case V2xmlPackage.INVCONTENT__INV6:
				return iNV6 != null;
			case V2xmlPackage.INVCONTENT__INV7:
				return iNV7 != null;
			case V2xmlPackage.INVCONTENT__INV8:
				return iNV8 != null;
			case V2xmlPackage.INVCONTENT__INV9:
				return iNV9 != null;
			case V2xmlPackage.INVCONTENT__INV10:
				return iNV10 != null;
			case V2xmlPackage.INVCONTENT__INV11:
				return iNV11 != null;
			case V2xmlPackage.INVCONTENT__INV12:
				return iNV12 != null;
			case V2xmlPackage.INVCONTENT__INV13:
				return iNV13 != null;
			case V2xmlPackage.INVCONTENT__INV14:
				return iNV14 != null;
			case V2xmlPackage.INVCONTENT__INV15:
				return iNV15 != null && !iNV15.isEmpty();
			case V2xmlPackage.INVCONTENT__INV16:
				return iNV16 != null;
			case V2xmlPackage.INVCONTENT__INV17:
				return iNV17 != null;
			case V2xmlPackage.INVCONTENT__INV18:
				return iNV18 != null;
			case V2xmlPackage.INVCONTENT__INV19:
				return iNV19 != null;
			case V2xmlPackage.INVCONTENT__INV20:
				return iNV20 != null;
			case V2xmlPackage.INVCONTENT__ANY:
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

} //INVCONTENTImpl
