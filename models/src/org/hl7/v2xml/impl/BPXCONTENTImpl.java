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

import org.hl7.v2xml.BPX10CONTENT;
import org.hl7.v2xml.BPX11CONTENT;
import org.hl7.v2xml.BPX12CONTENT;
import org.hl7.v2xml.BPX13CONTENT;
import org.hl7.v2xml.BPX14CONTENT;
import org.hl7.v2xml.BPX15CONTENT;
import org.hl7.v2xml.BPX16CONTENT;
import org.hl7.v2xml.BPX17CONTENT;
import org.hl7.v2xml.BPX18CONTENT;
import org.hl7.v2xml.BPX19CONTENT;
import org.hl7.v2xml.BPX1CONTENT;
import org.hl7.v2xml.BPX20CONTENT;
import org.hl7.v2xml.BPX21CONTENT;
import org.hl7.v2xml.BPX2CONTENT;
import org.hl7.v2xml.BPX3CONTENT;
import org.hl7.v2xml.BPX4CONTENT;
import org.hl7.v2xml.BPX5CONTENT;
import org.hl7.v2xml.BPX6CONTENT;
import org.hl7.v2xml.BPX7CONTENT;
import org.hl7.v2xml.BPX8CONTENT;
import org.hl7.v2xml.BPX9CONTENT;
import org.hl7.v2xml.BPXCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPXCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX1 <em>BPX1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX2 <em>BPX2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX3 <em>BPX3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX4 <em>BPX4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX5 <em>BPX5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX6 <em>BPX6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX7 <em>BPX7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX8 <em>BPX8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX9 <em>BPX9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX10 <em>BPX10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX11 <em>BPX11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX12 <em>BPX12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX13 <em>BPX13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX14 <em>BPX14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX15 <em>BPX15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX16 <em>BPX16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX17 <em>BPX17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX18 <em>BPX18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX19 <em>BPX19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX20 <em>BPX20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getBPX21 <em>BPX21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPXCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPXCONTENTImpl extends EObjectImpl implements BPXCONTENT {
	/**
	 * The cached value of the '{@link #getBPX1() <em>BPX1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX1()
	 * @generated
	 * @ordered
	 */
	protected BPX1CONTENT bPX1;

	/**
	 * The cached value of the '{@link #getBPX2() <em>BPX2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX2()
	 * @generated
	 * @ordered
	 */
	protected BPX2CONTENT bPX2;

	/**
	 * The cached value of the '{@link #getBPX3() <em>BPX3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX3()
	 * @generated
	 * @ordered
	 */
	protected BPX3CONTENT bPX3;

	/**
	 * The cached value of the '{@link #getBPX4() <em>BPX4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX4()
	 * @generated
	 * @ordered
	 */
	protected BPX4CONTENT bPX4;

	/**
	 * The cached value of the '{@link #getBPX5() <em>BPX5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX5()
	 * @generated
	 * @ordered
	 */
	protected BPX5CONTENT bPX5;

	/**
	 * The cached value of the '{@link #getBPX6() <em>BPX6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX6()
	 * @generated
	 * @ordered
	 */
	protected BPX6CONTENT bPX6;

	/**
	 * The cached value of the '{@link #getBPX7() <em>BPX7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX7()
	 * @generated
	 * @ordered
	 */
	protected BPX7CONTENT bPX7;

	/**
	 * The cached value of the '{@link #getBPX8() <em>BPX8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX8()
	 * @generated
	 * @ordered
	 */
	protected BPX8CONTENT bPX8;

	/**
	 * The cached value of the '{@link #getBPX9() <em>BPX9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX9()
	 * @generated
	 * @ordered
	 */
	protected BPX9CONTENT bPX9;

	/**
	 * The cached value of the '{@link #getBPX10() <em>BPX10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX10()
	 * @generated
	 * @ordered
	 */
	protected BPX10CONTENT bPX10;

	/**
	 * The cached value of the '{@link #getBPX11() <em>BPX11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX11()
	 * @generated
	 * @ordered
	 */
	protected BPX11CONTENT bPX11;

	/**
	 * The cached value of the '{@link #getBPX12() <em>BPX12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX12()
	 * @generated
	 * @ordered
	 */
	protected EList<BPX12CONTENT> bPX12;

	/**
	 * The cached value of the '{@link #getBPX13() <em>BPX13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX13()
	 * @generated
	 * @ordered
	 */
	protected BPX13CONTENT bPX13;

	/**
	 * The cached value of the '{@link #getBPX14() <em>BPX14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX14()
	 * @generated
	 * @ordered
	 */
	protected BPX14CONTENT bPX14;

	/**
	 * The cached value of the '{@link #getBPX15() <em>BPX15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX15()
	 * @generated
	 * @ordered
	 */
	protected BPX15CONTENT bPX15;

	/**
	 * The cached value of the '{@link #getBPX16() <em>BPX16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX16()
	 * @generated
	 * @ordered
	 */
	protected BPX16CONTENT bPX16;

	/**
	 * The cached value of the '{@link #getBPX17() <em>BPX17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX17()
	 * @generated
	 * @ordered
	 */
	protected BPX17CONTENT bPX17;

	/**
	 * The cached value of the '{@link #getBPX18() <em>BPX18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX18()
	 * @generated
	 * @ordered
	 */
	protected BPX18CONTENT bPX18;

	/**
	 * The cached value of the '{@link #getBPX19() <em>BPX19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX19()
	 * @generated
	 * @ordered
	 */
	protected BPX19CONTENT bPX19;

	/**
	 * The cached value of the '{@link #getBPX20() <em>BPX20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX20()
	 * @generated
	 * @ordered
	 */
	protected BPX20CONTENT bPX20;

	/**
	 * The cached value of the '{@link #getBPX21() <em>BPX21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPX21()
	 * @generated
	 * @ordered
	 */
	protected BPX21CONTENT bPX21;

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
	protected BPXCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBPXCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX1CONTENT getBPX1() {
		return bPX1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX1(BPX1CONTENT newBPX1, NotificationChain msgs) {
		BPX1CONTENT oldBPX1 = bPX1;
		bPX1 = newBPX1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX1, oldBPX1, newBPX1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX1(BPX1CONTENT newBPX1) {
		if (newBPX1 != bPX1) {
			NotificationChain msgs = null;
			if (bPX1 != null)
				msgs = ((InternalEObject)bPX1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX1, null, msgs);
			if (newBPX1 != null)
				msgs = ((InternalEObject)newBPX1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX1, null, msgs);
			msgs = basicSetBPX1(newBPX1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX1, newBPX1, newBPX1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX2CONTENT getBPX2() {
		return bPX2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX2(BPX2CONTENT newBPX2, NotificationChain msgs) {
		BPX2CONTENT oldBPX2 = bPX2;
		bPX2 = newBPX2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX2, oldBPX2, newBPX2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX2(BPX2CONTENT newBPX2) {
		if (newBPX2 != bPX2) {
			NotificationChain msgs = null;
			if (bPX2 != null)
				msgs = ((InternalEObject)bPX2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX2, null, msgs);
			if (newBPX2 != null)
				msgs = ((InternalEObject)newBPX2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX2, null, msgs);
			msgs = basicSetBPX2(newBPX2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX2, newBPX2, newBPX2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX3CONTENT getBPX3() {
		return bPX3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX3(BPX3CONTENT newBPX3, NotificationChain msgs) {
		BPX3CONTENT oldBPX3 = bPX3;
		bPX3 = newBPX3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX3, oldBPX3, newBPX3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX3(BPX3CONTENT newBPX3) {
		if (newBPX3 != bPX3) {
			NotificationChain msgs = null;
			if (bPX3 != null)
				msgs = ((InternalEObject)bPX3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX3, null, msgs);
			if (newBPX3 != null)
				msgs = ((InternalEObject)newBPX3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX3, null, msgs);
			msgs = basicSetBPX3(newBPX3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX3, newBPX3, newBPX3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX4CONTENT getBPX4() {
		return bPX4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX4(BPX4CONTENT newBPX4, NotificationChain msgs) {
		BPX4CONTENT oldBPX4 = bPX4;
		bPX4 = newBPX4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX4, oldBPX4, newBPX4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX4(BPX4CONTENT newBPX4) {
		if (newBPX4 != bPX4) {
			NotificationChain msgs = null;
			if (bPX4 != null)
				msgs = ((InternalEObject)bPX4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX4, null, msgs);
			if (newBPX4 != null)
				msgs = ((InternalEObject)newBPX4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX4, null, msgs);
			msgs = basicSetBPX4(newBPX4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX4, newBPX4, newBPX4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX5CONTENT getBPX5() {
		return bPX5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX5(BPX5CONTENT newBPX5, NotificationChain msgs) {
		BPX5CONTENT oldBPX5 = bPX5;
		bPX5 = newBPX5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX5, oldBPX5, newBPX5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX5(BPX5CONTENT newBPX5) {
		if (newBPX5 != bPX5) {
			NotificationChain msgs = null;
			if (bPX5 != null)
				msgs = ((InternalEObject)bPX5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX5, null, msgs);
			if (newBPX5 != null)
				msgs = ((InternalEObject)newBPX5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX5, null, msgs);
			msgs = basicSetBPX5(newBPX5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX5, newBPX5, newBPX5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX6CONTENT getBPX6() {
		return bPX6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX6(BPX6CONTENT newBPX6, NotificationChain msgs) {
		BPX6CONTENT oldBPX6 = bPX6;
		bPX6 = newBPX6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX6, oldBPX6, newBPX6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX6(BPX6CONTENT newBPX6) {
		if (newBPX6 != bPX6) {
			NotificationChain msgs = null;
			if (bPX6 != null)
				msgs = ((InternalEObject)bPX6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX6, null, msgs);
			if (newBPX6 != null)
				msgs = ((InternalEObject)newBPX6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX6, null, msgs);
			msgs = basicSetBPX6(newBPX6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX6, newBPX6, newBPX6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX7CONTENT getBPX7() {
		return bPX7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX7(BPX7CONTENT newBPX7, NotificationChain msgs) {
		BPX7CONTENT oldBPX7 = bPX7;
		bPX7 = newBPX7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX7, oldBPX7, newBPX7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX7(BPX7CONTENT newBPX7) {
		if (newBPX7 != bPX7) {
			NotificationChain msgs = null;
			if (bPX7 != null)
				msgs = ((InternalEObject)bPX7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX7, null, msgs);
			if (newBPX7 != null)
				msgs = ((InternalEObject)newBPX7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX7, null, msgs);
			msgs = basicSetBPX7(newBPX7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX7, newBPX7, newBPX7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX8CONTENT getBPX8() {
		return bPX8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX8(BPX8CONTENT newBPX8, NotificationChain msgs) {
		BPX8CONTENT oldBPX8 = bPX8;
		bPX8 = newBPX8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX8, oldBPX8, newBPX8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX8(BPX8CONTENT newBPX8) {
		if (newBPX8 != bPX8) {
			NotificationChain msgs = null;
			if (bPX8 != null)
				msgs = ((InternalEObject)bPX8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX8, null, msgs);
			if (newBPX8 != null)
				msgs = ((InternalEObject)newBPX8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX8, null, msgs);
			msgs = basicSetBPX8(newBPX8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX8, newBPX8, newBPX8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX9CONTENT getBPX9() {
		return bPX9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX9(BPX9CONTENT newBPX9, NotificationChain msgs) {
		BPX9CONTENT oldBPX9 = bPX9;
		bPX9 = newBPX9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX9, oldBPX9, newBPX9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX9(BPX9CONTENT newBPX9) {
		if (newBPX9 != bPX9) {
			NotificationChain msgs = null;
			if (bPX9 != null)
				msgs = ((InternalEObject)bPX9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX9, null, msgs);
			if (newBPX9 != null)
				msgs = ((InternalEObject)newBPX9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX9, null, msgs);
			msgs = basicSetBPX9(newBPX9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX9, newBPX9, newBPX9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX10CONTENT getBPX10() {
		return bPX10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX10(BPX10CONTENT newBPX10, NotificationChain msgs) {
		BPX10CONTENT oldBPX10 = bPX10;
		bPX10 = newBPX10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX10, oldBPX10, newBPX10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX10(BPX10CONTENT newBPX10) {
		if (newBPX10 != bPX10) {
			NotificationChain msgs = null;
			if (bPX10 != null)
				msgs = ((InternalEObject)bPX10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX10, null, msgs);
			if (newBPX10 != null)
				msgs = ((InternalEObject)newBPX10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX10, null, msgs);
			msgs = basicSetBPX10(newBPX10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX10, newBPX10, newBPX10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX11CONTENT getBPX11() {
		return bPX11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX11(BPX11CONTENT newBPX11, NotificationChain msgs) {
		BPX11CONTENT oldBPX11 = bPX11;
		bPX11 = newBPX11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX11, oldBPX11, newBPX11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX11(BPX11CONTENT newBPX11) {
		if (newBPX11 != bPX11) {
			NotificationChain msgs = null;
			if (bPX11 != null)
				msgs = ((InternalEObject)bPX11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX11, null, msgs);
			if (newBPX11 != null)
				msgs = ((InternalEObject)newBPX11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX11, null, msgs);
			msgs = basicSetBPX11(newBPX11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX11, newBPX11, newBPX11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPX12CONTENT> getBPX12() {
		if (bPX12 == null) {
			bPX12 = new EObjectContainmentEList<BPX12CONTENT>(BPX12CONTENT.class, this, V2xmlPackage.BPXCONTENT__BPX12);
		}
		return bPX12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX13CONTENT getBPX13() {
		return bPX13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX13(BPX13CONTENT newBPX13, NotificationChain msgs) {
		BPX13CONTENT oldBPX13 = bPX13;
		bPX13 = newBPX13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX13, oldBPX13, newBPX13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX13(BPX13CONTENT newBPX13) {
		if (newBPX13 != bPX13) {
			NotificationChain msgs = null;
			if (bPX13 != null)
				msgs = ((InternalEObject)bPX13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX13, null, msgs);
			if (newBPX13 != null)
				msgs = ((InternalEObject)newBPX13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX13, null, msgs);
			msgs = basicSetBPX13(newBPX13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX13, newBPX13, newBPX13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX14CONTENT getBPX14() {
		return bPX14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX14(BPX14CONTENT newBPX14, NotificationChain msgs) {
		BPX14CONTENT oldBPX14 = bPX14;
		bPX14 = newBPX14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX14, oldBPX14, newBPX14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX14(BPX14CONTENT newBPX14) {
		if (newBPX14 != bPX14) {
			NotificationChain msgs = null;
			if (bPX14 != null)
				msgs = ((InternalEObject)bPX14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX14, null, msgs);
			if (newBPX14 != null)
				msgs = ((InternalEObject)newBPX14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX14, null, msgs);
			msgs = basicSetBPX14(newBPX14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX14, newBPX14, newBPX14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX15CONTENT getBPX15() {
		return bPX15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX15(BPX15CONTENT newBPX15, NotificationChain msgs) {
		BPX15CONTENT oldBPX15 = bPX15;
		bPX15 = newBPX15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX15, oldBPX15, newBPX15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX15(BPX15CONTENT newBPX15) {
		if (newBPX15 != bPX15) {
			NotificationChain msgs = null;
			if (bPX15 != null)
				msgs = ((InternalEObject)bPX15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX15, null, msgs);
			if (newBPX15 != null)
				msgs = ((InternalEObject)newBPX15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX15, null, msgs);
			msgs = basicSetBPX15(newBPX15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX15, newBPX15, newBPX15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX16CONTENT getBPX16() {
		return bPX16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX16(BPX16CONTENT newBPX16, NotificationChain msgs) {
		BPX16CONTENT oldBPX16 = bPX16;
		bPX16 = newBPX16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX16, oldBPX16, newBPX16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX16(BPX16CONTENT newBPX16) {
		if (newBPX16 != bPX16) {
			NotificationChain msgs = null;
			if (bPX16 != null)
				msgs = ((InternalEObject)bPX16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX16, null, msgs);
			if (newBPX16 != null)
				msgs = ((InternalEObject)newBPX16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX16, null, msgs);
			msgs = basicSetBPX16(newBPX16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX16, newBPX16, newBPX16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX17CONTENT getBPX17() {
		return bPX17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX17(BPX17CONTENT newBPX17, NotificationChain msgs) {
		BPX17CONTENT oldBPX17 = bPX17;
		bPX17 = newBPX17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX17, oldBPX17, newBPX17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX17(BPX17CONTENT newBPX17) {
		if (newBPX17 != bPX17) {
			NotificationChain msgs = null;
			if (bPX17 != null)
				msgs = ((InternalEObject)bPX17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX17, null, msgs);
			if (newBPX17 != null)
				msgs = ((InternalEObject)newBPX17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX17, null, msgs);
			msgs = basicSetBPX17(newBPX17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX17, newBPX17, newBPX17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX18CONTENT getBPX18() {
		return bPX18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX18(BPX18CONTENT newBPX18, NotificationChain msgs) {
		BPX18CONTENT oldBPX18 = bPX18;
		bPX18 = newBPX18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX18, oldBPX18, newBPX18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX18(BPX18CONTENT newBPX18) {
		if (newBPX18 != bPX18) {
			NotificationChain msgs = null;
			if (bPX18 != null)
				msgs = ((InternalEObject)bPX18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX18, null, msgs);
			if (newBPX18 != null)
				msgs = ((InternalEObject)newBPX18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX18, null, msgs);
			msgs = basicSetBPX18(newBPX18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX18, newBPX18, newBPX18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX19CONTENT getBPX19() {
		return bPX19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX19(BPX19CONTENT newBPX19, NotificationChain msgs) {
		BPX19CONTENT oldBPX19 = bPX19;
		bPX19 = newBPX19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX19, oldBPX19, newBPX19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX19(BPX19CONTENT newBPX19) {
		if (newBPX19 != bPX19) {
			NotificationChain msgs = null;
			if (bPX19 != null)
				msgs = ((InternalEObject)bPX19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX19, null, msgs);
			if (newBPX19 != null)
				msgs = ((InternalEObject)newBPX19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX19, null, msgs);
			msgs = basicSetBPX19(newBPX19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX19, newBPX19, newBPX19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX20CONTENT getBPX20() {
		return bPX20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX20(BPX20CONTENT newBPX20, NotificationChain msgs) {
		BPX20CONTENT oldBPX20 = bPX20;
		bPX20 = newBPX20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX20, oldBPX20, newBPX20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX20(BPX20CONTENT newBPX20) {
		if (newBPX20 != bPX20) {
			NotificationChain msgs = null;
			if (bPX20 != null)
				msgs = ((InternalEObject)bPX20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX20, null, msgs);
			if (newBPX20 != null)
				msgs = ((InternalEObject)newBPX20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX20, null, msgs);
			msgs = basicSetBPX20(newBPX20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX20, newBPX20, newBPX20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPX21CONTENT getBPX21() {
		return bPX21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPX21(BPX21CONTENT newBPX21, NotificationChain msgs) {
		BPX21CONTENT oldBPX21 = bPX21;
		bPX21 = newBPX21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX21, oldBPX21, newBPX21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPX21(BPX21CONTENT newBPX21) {
		if (newBPX21 != bPX21) {
			NotificationChain msgs = null;
			if (bPX21 != null)
				msgs = ((InternalEObject)bPX21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX21, null, msgs);
			if (newBPX21 != null)
				msgs = ((InternalEObject)newBPX21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPXCONTENT__BPX21, null, msgs);
			msgs = basicSetBPX21(newBPX21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPXCONTENT__BPX21, newBPX21, newBPX21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BPXCONTENT__ANY);
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
			case V2xmlPackage.BPXCONTENT__BPX1:
				return basicSetBPX1(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX2:
				return basicSetBPX2(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX3:
				return basicSetBPX3(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX4:
				return basicSetBPX4(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX5:
				return basicSetBPX5(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX6:
				return basicSetBPX6(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX7:
				return basicSetBPX7(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX8:
				return basicSetBPX8(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX9:
				return basicSetBPX9(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX10:
				return basicSetBPX10(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX11:
				return basicSetBPX11(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX12:
				return ((InternalEList<?>)getBPX12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BPXCONTENT__BPX13:
				return basicSetBPX13(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX14:
				return basicSetBPX14(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX15:
				return basicSetBPX15(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX16:
				return basicSetBPX16(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX17:
				return basicSetBPX17(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX18:
				return basicSetBPX18(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX19:
				return basicSetBPX19(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX20:
				return basicSetBPX20(null, msgs);
			case V2xmlPackage.BPXCONTENT__BPX21:
				return basicSetBPX21(null, msgs);
			case V2xmlPackage.BPXCONTENT__ANY:
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
			case V2xmlPackage.BPXCONTENT__BPX1:
				return getBPX1();
			case V2xmlPackage.BPXCONTENT__BPX2:
				return getBPX2();
			case V2xmlPackage.BPXCONTENT__BPX3:
				return getBPX3();
			case V2xmlPackage.BPXCONTENT__BPX4:
				return getBPX4();
			case V2xmlPackage.BPXCONTENT__BPX5:
				return getBPX5();
			case V2xmlPackage.BPXCONTENT__BPX6:
				return getBPX6();
			case V2xmlPackage.BPXCONTENT__BPX7:
				return getBPX7();
			case V2xmlPackage.BPXCONTENT__BPX8:
				return getBPX8();
			case V2xmlPackage.BPXCONTENT__BPX9:
				return getBPX9();
			case V2xmlPackage.BPXCONTENT__BPX10:
				return getBPX10();
			case V2xmlPackage.BPXCONTENT__BPX11:
				return getBPX11();
			case V2xmlPackage.BPXCONTENT__BPX12:
				return getBPX12();
			case V2xmlPackage.BPXCONTENT__BPX13:
				return getBPX13();
			case V2xmlPackage.BPXCONTENT__BPX14:
				return getBPX14();
			case V2xmlPackage.BPXCONTENT__BPX15:
				return getBPX15();
			case V2xmlPackage.BPXCONTENT__BPX16:
				return getBPX16();
			case V2xmlPackage.BPXCONTENT__BPX17:
				return getBPX17();
			case V2xmlPackage.BPXCONTENT__BPX18:
				return getBPX18();
			case V2xmlPackage.BPXCONTENT__BPX19:
				return getBPX19();
			case V2xmlPackage.BPXCONTENT__BPX20:
				return getBPX20();
			case V2xmlPackage.BPXCONTENT__BPX21:
				return getBPX21();
			case V2xmlPackage.BPXCONTENT__ANY:
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
			case V2xmlPackage.BPXCONTENT__BPX1:
				setBPX1((BPX1CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX2:
				setBPX2((BPX2CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX3:
				setBPX3((BPX3CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX4:
				setBPX4((BPX4CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX5:
				setBPX5((BPX5CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX6:
				setBPX6((BPX6CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX7:
				setBPX7((BPX7CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX8:
				setBPX8((BPX8CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX9:
				setBPX9((BPX9CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX10:
				setBPX10((BPX10CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX11:
				setBPX11((BPX11CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX12:
				getBPX12().clear();
				getBPX12().addAll((Collection<? extends BPX12CONTENT>)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX13:
				setBPX13((BPX13CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX14:
				setBPX14((BPX14CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX15:
				setBPX15((BPX15CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX16:
				setBPX16((BPX16CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX17:
				setBPX17((BPX17CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX18:
				setBPX18((BPX18CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX19:
				setBPX19((BPX19CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX20:
				setBPX20((BPX20CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__BPX21:
				setBPX21((BPX21CONTENT)newValue);
				return;
			case V2xmlPackage.BPXCONTENT__ANY:
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
			case V2xmlPackage.BPXCONTENT__BPX1:
				setBPX1((BPX1CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX2:
				setBPX2((BPX2CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX3:
				setBPX3((BPX3CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX4:
				setBPX4((BPX4CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX5:
				setBPX5((BPX5CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX6:
				setBPX6((BPX6CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX7:
				setBPX7((BPX7CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX8:
				setBPX8((BPX8CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX9:
				setBPX9((BPX9CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX10:
				setBPX10((BPX10CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX11:
				setBPX11((BPX11CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX12:
				getBPX12().clear();
				return;
			case V2xmlPackage.BPXCONTENT__BPX13:
				setBPX13((BPX13CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX14:
				setBPX14((BPX14CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX15:
				setBPX15((BPX15CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX16:
				setBPX16((BPX16CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX17:
				setBPX17((BPX17CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX18:
				setBPX18((BPX18CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX19:
				setBPX19((BPX19CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX20:
				setBPX20((BPX20CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__BPX21:
				setBPX21((BPX21CONTENT)null);
				return;
			case V2xmlPackage.BPXCONTENT__ANY:
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
			case V2xmlPackage.BPXCONTENT__BPX1:
				return bPX1 != null;
			case V2xmlPackage.BPXCONTENT__BPX2:
				return bPX2 != null;
			case V2xmlPackage.BPXCONTENT__BPX3:
				return bPX3 != null;
			case V2xmlPackage.BPXCONTENT__BPX4:
				return bPX4 != null;
			case V2xmlPackage.BPXCONTENT__BPX5:
				return bPX5 != null;
			case V2xmlPackage.BPXCONTENT__BPX6:
				return bPX6 != null;
			case V2xmlPackage.BPXCONTENT__BPX7:
				return bPX7 != null;
			case V2xmlPackage.BPXCONTENT__BPX8:
				return bPX8 != null;
			case V2xmlPackage.BPXCONTENT__BPX9:
				return bPX9 != null;
			case V2xmlPackage.BPXCONTENT__BPX10:
				return bPX10 != null;
			case V2xmlPackage.BPXCONTENT__BPX11:
				return bPX11 != null;
			case V2xmlPackage.BPXCONTENT__BPX12:
				return bPX12 != null && !bPX12.isEmpty();
			case V2xmlPackage.BPXCONTENT__BPX13:
				return bPX13 != null;
			case V2xmlPackage.BPXCONTENT__BPX14:
				return bPX14 != null;
			case V2xmlPackage.BPXCONTENT__BPX15:
				return bPX15 != null;
			case V2xmlPackage.BPXCONTENT__BPX16:
				return bPX16 != null;
			case V2xmlPackage.BPXCONTENT__BPX17:
				return bPX17 != null;
			case V2xmlPackage.BPXCONTENT__BPX18:
				return bPX18 != null;
			case V2xmlPackage.BPXCONTENT__BPX19:
				return bPX19 != null;
			case V2xmlPackage.BPXCONTENT__BPX20:
				return bPX20 != null;
			case V2xmlPackage.BPXCONTENT__BPX21:
				return bPX21 != null;
			case V2xmlPackage.BPXCONTENT__ANY:
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

} //BPXCONTENTImpl
