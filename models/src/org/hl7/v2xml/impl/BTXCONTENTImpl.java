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

import org.hl7.v2xml.BTX10CONTENT;
import org.hl7.v2xml.BTX11CONTENT;
import org.hl7.v2xml.BTX12CONTENT;
import org.hl7.v2xml.BTX13CONTENT;
import org.hl7.v2xml.BTX14CONTENT;
import org.hl7.v2xml.BTX15CONTENT;
import org.hl7.v2xml.BTX16CONTENT;
import org.hl7.v2xml.BTX17CONTENT;
import org.hl7.v2xml.BTX18CONTENT;
import org.hl7.v2xml.BTX19CONTENT;
import org.hl7.v2xml.BTX1CONTENT;
import org.hl7.v2xml.BTX2CONTENT;
import org.hl7.v2xml.BTX3CONTENT;
import org.hl7.v2xml.BTX4CONTENT;
import org.hl7.v2xml.BTX5CONTENT;
import org.hl7.v2xml.BTX6CONTENT;
import org.hl7.v2xml.BTX7CONTENT;
import org.hl7.v2xml.BTX8CONTENT;
import org.hl7.v2xml.BTX9CONTENT;
import org.hl7.v2xml.BTXCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BTXCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX1 <em>BTX1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX2 <em>BTX2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX3 <em>BTX3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX4 <em>BTX4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX5 <em>BTX5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX6 <em>BTX6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX7 <em>BTX7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX8 <em>BTX8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX9 <em>BTX9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX10 <em>BTX10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX11 <em>BTX11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX12 <em>BTX12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX13 <em>BTX13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX14 <em>BTX14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX15 <em>BTX15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX16 <em>BTX16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX17 <em>BTX17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX18 <em>BTX18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getBTX19 <em>BTX19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BTXCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BTXCONTENTImpl extends EObjectImpl implements BTXCONTENT {
	/**
	 * The cached value of the '{@link #getBTX1() <em>BTX1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX1()
	 * @generated
	 * @ordered
	 */
	protected BTX1CONTENT bTX1;

	/**
	 * The cached value of the '{@link #getBTX2() <em>BTX2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX2()
	 * @generated
	 * @ordered
	 */
	protected BTX2CONTENT bTX2;

	/**
	 * The cached value of the '{@link #getBTX3() <em>BTX3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX3()
	 * @generated
	 * @ordered
	 */
	protected BTX3CONTENT bTX3;

	/**
	 * The cached value of the '{@link #getBTX4() <em>BTX4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX4()
	 * @generated
	 * @ordered
	 */
	protected BTX4CONTENT bTX4;

	/**
	 * The cached value of the '{@link #getBTX5() <em>BTX5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX5()
	 * @generated
	 * @ordered
	 */
	protected BTX5CONTENT bTX5;

	/**
	 * The cached value of the '{@link #getBTX6() <em>BTX6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX6()
	 * @generated
	 * @ordered
	 */
	protected BTX6CONTENT bTX6;

	/**
	 * The cached value of the '{@link #getBTX7() <em>BTX7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX7()
	 * @generated
	 * @ordered
	 */
	protected BTX7CONTENT bTX7;

	/**
	 * The cached value of the '{@link #getBTX8() <em>BTX8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX8()
	 * @generated
	 * @ordered
	 */
	protected BTX8CONTENT bTX8;

	/**
	 * The cached value of the '{@link #getBTX9() <em>BTX9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX9()
	 * @generated
	 * @ordered
	 */
	protected BTX9CONTENT bTX9;

	/**
	 * The cached value of the '{@link #getBTX10() <em>BTX10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX10()
	 * @generated
	 * @ordered
	 */
	protected BTX10CONTENT bTX10;

	/**
	 * The cached value of the '{@link #getBTX11() <em>BTX11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX11()
	 * @generated
	 * @ordered
	 */
	protected BTX11CONTENT bTX11;

	/**
	 * The cached value of the '{@link #getBTX12() <em>BTX12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX12()
	 * @generated
	 * @ordered
	 */
	protected BTX12CONTENT bTX12;

	/**
	 * The cached value of the '{@link #getBTX13() <em>BTX13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX13()
	 * @generated
	 * @ordered
	 */
	protected BTX13CONTENT bTX13;

	/**
	 * The cached value of the '{@link #getBTX14() <em>BTX14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX14()
	 * @generated
	 * @ordered
	 */
	protected BTX14CONTENT bTX14;

	/**
	 * The cached value of the '{@link #getBTX15() <em>BTX15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX15()
	 * @generated
	 * @ordered
	 */
	protected BTX15CONTENT bTX15;

	/**
	 * The cached value of the '{@link #getBTX16() <em>BTX16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX16()
	 * @generated
	 * @ordered
	 */
	protected BTX16CONTENT bTX16;

	/**
	 * The cached value of the '{@link #getBTX17() <em>BTX17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX17()
	 * @generated
	 * @ordered
	 */
	protected BTX17CONTENT bTX17;

	/**
	 * The cached value of the '{@link #getBTX18() <em>BTX18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX18()
	 * @generated
	 * @ordered
	 */
	protected EList<BTX18CONTENT> bTX18;

	/**
	 * The cached value of the '{@link #getBTX19() <em>BTX19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBTX19()
	 * @generated
	 * @ordered
	 */
	protected BTX19CONTENT bTX19;

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
	protected BTXCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBTXCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX1CONTENT getBTX1() {
		return bTX1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX1(BTX1CONTENT newBTX1, NotificationChain msgs) {
		BTX1CONTENT oldBTX1 = bTX1;
		bTX1 = newBTX1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX1, oldBTX1, newBTX1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX1(BTX1CONTENT newBTX1) {
		if (newBTX1 != bTX1) {
			NotificationChain msgs = null;
			if (bTX1 != null)
				msgs = ((InternalEObject)bTX1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX1, null, msgs);
			if (newBTX1 != null)
				msgs = ((InternalEObject)newBTX1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX1, null, msgs);
			msgs = basicSetBTX1(newBTX1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX1, newBTX1, newBTX1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX2CONTENT getBTX2() {
		return bTX2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX2(BTX2CONTENT newBTX2, NotificationChain msgs) {
		BTX2CONTENT oldBTX2 = bTX2;
		bTX2 = newBTX2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX2, oldBTX2, newBTX2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX2(BTX2CONTENT newBTX2) {
		if (newBTX2 != bTX2) {
			NotificationChain msgs = null;
			if (bTX2 != null)
				msgs = ((InternalEObject)bTX2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX2, null, msgs);
			if (newBTX2 != null)
				msgs = ((InternalEObject)newBTX2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX2, null, msgs);
			msgs = basicSetBTX2(newBTX2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX2, newBTX2, newBTX2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX3CONTENT getBTX3() {
		return bTX3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX3(BTX3CONTENT newBTX3, NotificationChain msgs) {
		BTX3CONTENT oldBTX3 = bTX3;
		bTX3 = newBTX3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX3, oldBTX3, newBTX3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX3(BTX3CONTENT newBTX3) {
		if (newBTX3 != bTX3) {
			NotificationChain msgs = null;
			if (bTX3 != null)
				msgs = ((InternalEObject)bTX3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX3, null, msgs);
			if (newBTX3 != null)
				msgs = ((InternalEObject)newBTX3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX3, null, msgs);
			msgs = basicSetBTX3(newBTX3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX3, newBTX3, newBTX3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX4CONTENT getBTX4() {
		return bTX4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX4(BTX4CONTENT newBTX4, NotificationChain msgs) {
		BTX4CONTENT oldBTX4 = bTX4;
		bTX4 = newBTX4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX4, oldBTX4, newBTX4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX4(BTX4CONTENT newBTX4) {
		if (newBTX4 != bTX4) {
			NotificationChain msgs = null;
			if (bTX4 != null)
				msgs = ((InternalEObject)bTX4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX4, null, msgs);
			if (newBTX4 != null)
				msgs = ((InternalEObject)newBTX4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX4, null, msgs);
			msgs = basicSetBTX4(newBTX4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX4, newBTX4, newBTX4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX5CONTENT getBTX5() {
		return bTX5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX5(BTX5CONTENT newBTX5, NotificationChain msgs) {
		BTX5CONTENT oldBTX5 = bTX5;
		bTX5 = newBTX5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX5, oldBTX5, newBTX5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX5(BTX5CONTENT newBTX5) {
		if (newBTX5 != bTX5) {
			NotificationChain msgs = null;
			if (bTX5 != null)
				msgs = ((InternalEObject)bTX5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX5, null, msgs);
			if (newBTX5 != null)
				msgs = ((InternalEObject)newBTX5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX5, null, msgs);
			msgs = basicSetBTX5(newBTX5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX5, newBTX5, newBTX5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX6CONTENT getBTX6() {
		return bTX6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX6(BTX6CONTENT newBTX6, NotificationChain msgs) {
		BTX6CONTENT oldBTX6 = bTX6;
		bTX6 = newBTX6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX6, oldBTX6, newBTX6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX6(BTX6CONTENT newBTX6) {
		if (newBTX6 != bTX6) {
			NotificationChain msgs = null;
			if (bTX6 != null)
				msgs = ((InternalEObject)bTX6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX6, null, msgs);
			if (newBTX6 != null)
				msgs = ((InternalEObject)newBTX6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX6, null, msgs);
			msgs = basicSetBTX6(newBTX6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX6, newBTX6, newBTX6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX7CONTENT getBTX7() {
		return bTX7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX7(BTX7CONTENT newBTX7, NotificationChain msgs) {
		BTX7CONTENT oldBTX7 = bTX7;
		bTX7 = newBTX7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX7, oldBTX7, newBTX7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX7(BTX7CONTENT newBTX7) {
		if (newBTX7 != bTX7) {
			NotificationChain msgs = null;
			if (bTX7 != null)
				msgs = ((InternalEObject)bTX7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX7, null, msgs);
			if (newBTX7 != null)
				msgs = ((InternalEObject)newBTX7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX7, null, msgs);
			msgs = basicSetBTX7(newBTX7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX7, newBTX7, newBTX7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX8CONTENT getBTX8() {
		return bTX8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX8(BTX8CONTENT newBTX8, NotificationChain msgs) {
		BTX8CONTENT oldBTX8 = bTX8;
		bTX8 = newBTX8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX8, oldBTX8, newBTX8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX8(BTX8CONTENT newBTX8) {
		if (newBTX8 != bTX8) {
			NotificationChain msgs = null;
			if (bTX8 != null)
				msgs = ((InternalEObject)bTX8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX8, null, msgs);
			if (newBTX8 != null)
				msgs = ((InternalEObject)newBTX8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX8, null, msgs);
			msgs = basicSetBTX8(newBTX8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX8, newBTX8, newBTX8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX9CONTENT getBTX9() {
		return bTX9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX9(BTX9CONTENT newBTX9, NotificationChain msgs) {
		BTX9CONTENT oldBTX9 = bTX9;
		bTX9 = newBTX9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX9, oldBTX9, newBTX9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX9(BTX9CONTENT newBTX9) {
		if (newBTX9 != bTX9) {
			NotificationChain msgs = null;
			if (bTX9 != null)
				msgs = ((InternalEObject)bTX9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX9, null, msgs);
			if (newBTX9 != null)
				msgs = ((InternalEObject)newBTX9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX9, null, msgs);
			msgs = basicSetBTX9(newBTX9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX9, newBTX9, newBTX9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX10CONTENT getBTX10() {
		return bTX10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX10(BTX10CONTENT newBTX10, NotificationChain msgs) {
		BTX10CONTENT oldBTX10 = bTX10;
		bTX10 = newBTX10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX10, oldBTX10, newBTX10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX10(BTX10CONTENT newBTX10) {
		if (newBTX10 != bTX10) {
			NotificationChain msgs = null;
			if (bTX10 != null)
				msgs = ((InternalEObject)bTX10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX10, null, msgs);
			if (newBTX10 != null)
				msgs = ((InternalEObject)newBTX10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX10, null, msgs);
			msgs = basicSetBTX10(newBTX10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX10, newBTX10, newBTX10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX11CONTENT getBTX11() {
		return bTX11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX11(BTX11CONTENT newBTX11, NotificationChain msgs) {
		BTX11CONTENT oldBTX11 = bTX11;
		bTX11 = newBTX11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX11, oldBTX11, newBTX11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX11(BTX11CONTENT newBTX11) {
		if (newBTX11 != bTX11) {
			NotificationChain msgs = null;
			if (bTX11 != null)
				msgs = ((InternalEObject)bTX11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX11, null, msgs);
			if (newBTX11 != null)
				msgs = ((InternalEObject)newBTX11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX11, null, msgs);
			msgs = basicSetBTX11(newBTX11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX11, newBTX11, newBTX11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX12CONTENT getBTX12() {
		return bTX12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX12(BTX12CONTENT newBTX12, NotificationChain msgs) {
		BTX12CONTENT oldBTX12 = bTX12;
		bTX12 = newBTX12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX12, oldBTX12, newBTX12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX12(BTX12CONTENT newBTX12) {
		if (newBTX12 != bTX12) {
			NotificationChain msgs = null;
			if (bTX12 != null)
				msgs = ((InternalEObject)bTX12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX12, null, msgs);
			if (newBTX12 != null)
				msgs = ((InternalEObject)newBTX12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX12, null, msgs);
			msgs = basicSetBTX12(newBTX12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX12, newBTX12, newBTX12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX13CONTENT getBTX13() {
		return bTX13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX13(BTX13CONTENT newBTX13, NotificationChain msgs) {
		BTX13CONTENT oldBTX13 = bTX13;
		bTX13 = newBTX13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX13, oldBTX13, newBTX13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX13(BTX13CONTENT newBTX13) {
		if (newBTX13 != bTX13) {
			NotificationChain msgs = null;
			if (bTX13 != null)
				msgs = ((InternalEObject)bTX13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX13, null, msgs);
			if (newBTX13 != null)
				msgs = ((InternalEObject)newBTX13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX13, null, msgs);
			msgs = basicSetBTX13(newBTX13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX13, newBTX13, newBTX13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX14CONTENT getBTX14() {
		return bTX14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX14(BTX14CONTENT newBTX14, NotificationChain msgs) {
		BTX14CONTENT oldBTX14 = bTX14;
		bTX14 = newBTX14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX14, oldBTX14, newBTX14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX14(BTX14CONTENT newBTX14) {
		if (newBTX14 != bTX14) {
			NotificationChain msgs = null;
			if (bTX14 != null)
				msgs = ((InternalEObject)bTX14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX14, null, msgs);
			if (newBTX14 != null)
				msgs = ((InternalEObject)newBTX14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX14, null, msgs);
			msgs = basicSetBTX14(newBTX14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX14, newBTX14, newBTX14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX15CONTENT getBTX15() {
		return bTX15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX15(BTX15CONTENT newBTX15, NotificationChain msgs) {
		BTX15CONTENT oldBTX15 = bTX15;
		bTX15 = newBTX15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX15, oldBTX15, newBTX15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX15(BTX15CONTENT newBTX15) {
		if (newBTX15 != bTX15) {
			NotificationChain msgs = null;
			if (bTX15 != null)
				msgs = ((InternalEObject)bTX15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX15, null, msgs);
			if (newBTX15 != null)
				msgs = ((InternalEObject)newBTX15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX15, null, msgs);
			msgs = basicSetBTX15(newBTX15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX15, newBTX15, newBTX15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX16CONTENT getBTX16() {
		return bTX16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX16(BTX16CONTENT newBTX16, NotificationChain msgs) {
		BTX16CONTENT oldBTX16 = bTX16;
		bTX16 = newBTX16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX16, oldBTX16, newBTX16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX16(BTX16CONTENT newBTX16) {
		if (newBTX16 != bTX16) {
			NotificationChain msgs = null;
			if (bTX16 != null)
				msgs = ((InternalEObject)bTX16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX16, null, msgs);
			if (newBTX16 != null)
				msgs = ((InternalEObject)newBTX16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX16, null, msgs);
			msgs = basicSetBTX16(newBTX16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX16, newBTX16, newBTX16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX17CONTENT getBTX17() {
		return bTX17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX17(BTX17CONTENT newBTX17, NotificationChain msgs) {
		BTX17CONTENT oldBTX17 = bTX17;
		bTX17 = newBTX17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX17, oldBTX17, newBTX17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX17(BTX17CONTENT newBTX17) {
		if (newBTX17 != bTX17) {
			NotificationChain msgs = null;
			if (bTX17 != null)
				msgs = ((InternalEObject)bTX17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX17, null, msgs);
			if (newBTX17 != null)
				msgs = ((InternalEObject)newBTX17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX17, null, msgs);
			msgs = basicSetBTX17(newBTX17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX17, newBTX17, newBTX17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BTX18CONTENT> getBTX18() {
		if (bTX18 == null) {
			bTX18 = new EObjectContainmentEList<BTX18CONTENT>(BTX18CONTENT.class, this, V2xmlPackage.BTXCONTENT__BTX18);
		}
		return bTX18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BTX19CONTENT getBTX19() {
		return bTX19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBTX19(BTX19CONTENT newBTX19, NotificationChain msgs) {
		BTX19CONTENT oldBTX19 = bTX19;
		bTX19 = newBTX19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX19, oldBTX19, newBTX19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBTX19(BTX19CONTENT newBTX19) {
		if (newBTX19 != bTX19) {
			NotificationChain msgs = null;
			if (bTX19 != null)
				msgs = ((InternalEObject)bTX19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX19, null, msgs);
			if (newBTX19 != null)
				msgs = ((InternalEObject)newBTX19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BTXCONTENT__BTX19, null, msgs);
			msgs = basicSetBTX19(newBTX19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BTXCONTENT__BTX19, newBTX19, newBTX19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BTXCONTENT__ANY);
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
			case V2xmlPackage.BTXCONTENT__BTX1:
				return basicSetBTX1(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX2:
				return basicSetBTX2(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX3:
				return basicSetBTX3(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX4:
				return basicSetBTX4(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX5:
				return basicSetBTX5(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX6:
				return basicSetBTX6(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX7:
				return basicSetBTX7(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX8:
				return basicSetBTX8(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX9:
				return basicSetBTX9(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX10:
				return basicSetBTX10(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX11:
				return basicSetBTX11(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX12:
				return basicSetBTX12(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX13:
				return basicSetBTX13(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX14:
				return basicSetBTX14(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX15:
				return basicSetBTX15(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX16:
				return basicSetBTX16(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX17:
				return basicSetBTX17(null, msgs);
			case V2xmlPackage.BTXCONTENT__BTX18:
				return ((InternalEList<?>)getBTX18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BTXCONTENT__BTX19:
				return basicSetBTX19(null, msgs);
			case V2xmlPackage.BTXCONTENT__ANY:
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
			case V2xmlPackage.BTXCONTENT__BTX1:
				return getBTX1();
			case V2xmlPackage.BTXCONTENT__BTX2:
				return getBTX2();
			case V2xmlPackage.BTXCONTENT__BTX3:
				return getBTX3();
			case V2xmlPackage.BTXCONTENT__BTX4:
				return getBTX4();
			case V2xmlPackage.BTXCONTENT__BTX5:
				return getBTX5();
			case V2xmlPackage.BTXCONTENT__BTX6:
				return getBTX6();
			case V2xmlPackage.BTXCONTENT__BTX7:
				return getBTX7();
			case V2xmlPackage.BTXCONTENT__BTX8:
				return getBTX8();
			case V2xmlPackage.BTXCONTENT__BTX9:
				return getBTX9();
			case V2xmlPackage.BTXCONTENT__BTX10:
				return getBTX10();
			case V2xmlPackage.BTXCONTENT__BTX11:
				return getBTX11();
			case V2xmlPackage.BTXCONTENT__BTX12:
				return getBTX12();
			case V2xmlPackage.BTXCONTENT__BTX13:
				return getBTX13();
			case V2xmlPackage.BTXCONTENT__BTX14:
				return getBTX14();
			case V2xmlPackage.BTXCONTENT__BTX15:
				return getBTX15();
			case V2xmlPackage.BTXCONTENT__BTX16:
				return getBTX16();
			case V2xmlPackage.BTXCONTENT__BTX17:
				return getBTX17();
			case V2xmlPackage.BTXCONTENT__BTX18:
				return getBTX18();
			case V2xmlPackage.BTXCONTENT__BTX19:
				return getBTX19();
			case V2xmlPackage.BTXCONTENT__ANY:
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
			case V2xmlPackage.BTXCONTENT__BTX1:
				setBTX1((BTX1CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX2:
				setBTX2((BTX2CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX3:
				setBTX3((BTX3CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX4:
				setBTX4((BTX4CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX5:
				setBTX5((BTX5CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX6:
				setBTX6((BTX6CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX7:
				setBTX7((BTX7CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX8:
				setBTX8((BTX8CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX9:
				setBTX9((BTX9CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX10:
				setBTX10((BTX10CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX11:
				setBTX11((BTX11CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX12:
				setBTX12((BTX12CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX13:
				setBTX13((BTX13CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX14:
				setBTX14((BTX14CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX15:
				setBTX15((BTX15CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX16:
				setBTX16((BTX16CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX17:
				setBTX17((BTX17CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX18:
				getBTX18().clear();
				getBTX18().addAll((Collection<? extends BTX18CONTENT>)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__BTX19:
				setBTX19((BTX19CONTENT)newValue);
				return;
			case V2xmlPackage.BTXCONTENT__ANY:
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
			case V2xmlPackage.BTXCONTENT__BTX1:
				setBTX1((BTX1CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX2:
				setBTX2((BTX2CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX3:
				setBTX3((BTX3CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX4:
				setBTX4((BTX4CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX5:
				setBTX5((BTX5CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX6:
				setBTX6((BTX6CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX7:
				setBTX7((BTX7CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX8:
				setBTX8((BTX8CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX9:
				setBTX9((BTX9CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX10:
				setBTX10((BTX10CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX11:
				setBTX11((BTX11CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX12:
				setBTX12((BTX12CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX13:
				setBTX13((BTX13CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX14:
				setBTX14((BTX14CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX15:
				setBTX15((BTX15CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX16:
				setBTX16((BTX16CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX17:
				setBTX17((BTX17CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__BTX18:
				getBTX18().clear();
				return;
			case V2xmlPackage.BTXCONTENT__BTX19:
				setBTX19((BTX19CONTENT)null);
				return;
			case V2xmlPackage.BTXCONTENT__ANY:
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
			case V2xmlPackage.BTXCONTENT__BTX1:
				return bTX1 != null;
			case V2xmlPackage.BTXCONTENT__BTX2:
				return bTX2 != null;
			case V2xmlPackage.BTXCONTENT__BTX3:
				return bTX3 != null;
			case V2xmlPackage.BTXCONTENT__BTX4:
				return bTX4 != null;
			case V2xmlPackage.BTXCONTENT__BTX5:
				return bTX5 != null;
			case V2xmlPackage.BTXCONTENT__BTX6:
				return bTX6 != null;
			case V2xmlPackage.BTXCONTENT__BTX7:
				return bTX7 != null;
			case V2xmlPackage.BTXCONTENT__BTX8:
				return bTX8 != null;
			case V2xmlPackage.BTXCONTENT__BTX9:
				return bTX9 != null;
			case V2xmlPackage.BTXCONTENT__BTX10:
				return bTX10 != null;
			case V2xmlPackage.BTXCONTENT__BTX11:
				return bTX11 != null;
			case V2xmlPackage.BTXCONTENT__BTX12:
				return bTX12 != null;
			case V2xmlPackage.BTXCONTENT__BTX13:
				return bTX13 != null;
			case V2xmlPackage.BTXCONTENT__BTX14:
				return bTX14 != null;
			case V2xmlPackage.BTXCONTENT__BTX15:
				return bTX15 != null;
			case V2xmlPackage.BTXCONTENT__BTX16:
				return bTX16 != null;
			case V2xmlPackage.BTXCONTENT__BTX17:
				return bTX17 != null;
			case V2xmlPackage.BTXCONTENT__BTX18:
				return bTX18 != null && !bTX18.isEmpty();
			case V2xmlPackage.BTXCONTENT__BTX19:
				return bTX19 != null;
			case V2xmlPackage.BTXCONTENT__ANY:
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

} //BTXCONTENTImpl
