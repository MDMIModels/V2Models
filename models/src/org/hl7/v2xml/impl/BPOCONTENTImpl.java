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

import org.hl7.v2xml.BPO10CONTENT;
import org.hl7.v2xml.BPO11CONTENT;
import org.hl7.v2xml.BPO12CONTENT;
import org.hl7.v2xml.BPO13CONTENT;
import org.hl7.v2xml.BPO14CONTENT;
import org.hl7.v2xml.BPO1CONTENT;
import org.hl7.v2xml.BPO2CONTENT;
import org.hl7.v2xml.BPO3CONTENT;
import org.hl7.v2xml.BPO4CONTENT;
import org.hl7.v2xml.BPO5CONTENT;
import org.hl7.v2xml.BPO6CONTENT;
import org.hl7.v2xml.BPO7CONTENT;
import org.hl7.v2xml.BPO8CONTENT;
import org.hl7.v2xml.BPO9CONTENT;
import org.hl7.v2xml.BPOCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPOCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO1 <em>BPO1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO2 <em>BPO2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO3 <em>BPO3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO4 <em>BPO4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO5 <em>BPO5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO6 <em>BPO6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO7 <em>BPO7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO8 <em>BPO8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO9 <em>BPO9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO10 <em>BPO10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO11 <em>BPO11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO12 <em>BPO12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO13 <em>BPO13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getBPO14 <em>BPO14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BPOCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BPOCONTENTImpl extends EObjectImpl implements BPOCONTENT {
	/**
	 * The cached value of the '{@link #getBPO1() <em>BPO1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO1()
	 * @generated
	 * @ordered
	 */
	protected BPO1CONTENT bPO1;

	/**
	 * The cached value of the '{@link #getBPO2() <em>BPO2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO2()
	 * @generated
	 * @ordered
	 */
	protected BPO2CONTENT bPO2;

	/**
	 * The cached value of the '{@link #getBPO3() <em>BPO3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO3()
	 * @generated
	 * @ordered
	 */
	protected EList<BPO3CONTENT> bPO3;

	/**
	 * The cached value of the '{@link #getBPO4() <em>BPO4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO4()
	 * @generated
	 * @ordered
	 */
	protected BPO4CONTENT bPO4;

	/**
	 * The cached value of the '{@link #getBPO5() <em>BPO5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO5()
	 * @generated
	 * @ordered
	 */
	protected BPO5CONTENT bPO5;

	/**
	 * The cached value of the '{@link #getBPO6() <em>BPO6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO6()
	 * @generated
	 * @ordered
	 */
	protected BPO6CONTENT bPO6;

	/**
	 * The cached value of the '{@link #getBPO7() <em>BPO7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO7()
	 * @generated
	 * @ordered
	 */
	protected BPO7CONTENT bPO7;

	/**
	 * The cached value of the '{@link #getBPO8() <em>BPO8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO8()
	 * @generated
	 * @ordered
	 */
	protected BPO8CONTENT bPO8;

	/**
	 * The cached value of the '{@link #getBPO9() <em>BPO9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO9()
	 * @generated
	 * @ordered
	 */
	protected BPO9CONTENT bPO9;

	/**
	 * The cached value of the '{@link #getBPO10() <em>BPO10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO10()
	 * @generated
	 * @ordered
	 */
	protected BPO10CONTENT bPO10;

	/**
	 * The cached value of the '{@link #getBPO11() <em>BPO11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO11()
	 * @generated
	 * @ordered
	 */
	protected BPO11CONTENT bPO11;

	/**
	 * The cached value of the '{@link #getBPO12() <em>BPO12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO12()
	 * @generated
	 * @ordered
	 */
	protected BPO12CONTENT bPO12;

	/**
	 * The cached value of the '{@link #getBPO13() <em>BPO13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO13()
	 * @generated
	 * @ordered
	 */
	protected EList<BPO13CONTENT> bPO13;

	/**
	 * The cached value of the '{@link #getBPO14() <em>BPO14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPO14()
	 * @generated
	 * @ordered
	 */
	protected BPO14CONTENT bPO14;

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
	protected BPOCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBPOCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO1CONTENT getBPO1() {
		return bPO1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO1(BPO1CONTENT newBPO1, NotificationChain msgs) {
		BPO1CONTENT oldBPO1 = bPO1;
		bPO1 = newBPO1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO1, oldBPO1, newBPO1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO1(BPO1CONTENT newBPO1) {
		if (newBPO1 != bPO1) {
			NotificationChain msgs = null;
			if (bPO1 != null)
				msgs = ((InternalEObject)bPO1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO1, null, msgs);
			if (newBPO1 != null)
				msgs = ((InternalEObject)newBPO1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO1, null, msgs);
			msgs = basicSetBPO1(newBPO1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO1, newBPO1, newBPO1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO2CONTENT getBPO2() {
		return bPO2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO2(BPO2CONTENT newBPO2, NotificationChain msgs) {
		BPO2CONTENT oldBPO2 = bPO2;
		bPO2 = newBPO2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO2, oldBPO2, newBPO2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO2(BPO2CONTENT newBPO2) {
		if (newBPO2 != bPO2) {
			NotificationChain msgs = null;
			if (bPO2 != null)
				msgs = ((InternalEObject)bPO2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO2, null, msgs);
			if (newBPO2 != null)
				msgs = ((InternalEObject)newBPO2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO2, null, msgs);
			msgs = basicSetBPO2(newBPO2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO2, newBPO2, newBPO2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPO3CONTENT> getBPO3() {
		if (bPO3 == null) {
			bPO3 = new EObjectContainmentEList<BPO3CONTENT>(BPO3CONTENT.class, this, V2xmlPackage.BPOCONTENT__BPO3);
		}
		return bPO3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO4CONTENT getBPO4() {
		return bPO4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO4(BPO4CONTENT newBPO4, NotificationChain msgs) {
		BPO4CONTENT oldBPO4 = bPO4;
		bPO4 = newBPO4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO4, oldBPO4, newBPO4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO4(BPO4CONTENT newBPO4) {
		if (newBPO4 != bPO4) {
			NotificationChain msgs = null;
			if (bPO4 != null)
				msgs = ((InternalEObject)bPO4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO4, null, msgs);
			if (newBPO4 != null)
				msgs = ((InternalEObject)newBPO4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO4, null, msgs);
			msgs = basicSetBPO4(newBPO4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO4, newBPO4, newBPO4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO5CONTENT getBPO5() {
		return bPO5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO5(BPO5CONTENT newBPO5, NotificationChain msgs) {
		BPO5CONTENT oldBPO5 = bPO5;
		bPO5 = newBPO5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO5, oldBPO5, newBPO5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO5(BPO5CONTENT newBPO5) {
		if (newBPO5 != bPO5) {
			NotificationChain msgs = null;
			if (bPO5 != null)
				msgs = ((InternalEObject)bPO5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO5, null, msgs);
			if (newBPO5 != null)
				msgs = ((InternalEObject)newBPO5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO5, null, msgs);
			msgs = basicSetBPO5(newBPO5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO5, newBPO5, newBPO5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO6CONTENT getBPO6() {
		return bPO6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO6(BPO6CONTENT newBPO6, NotificationChain msgs) {
		BPO6CONTENT oldBPO6 = bPO6;
		bPO6 = newBPO6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO6, oldBPO6, newBPO6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO6(BPO6CONTENT newBPO6) {
		if (newBPO6 != bPO6) {
			NotificationChain msgs = null;
			if (bPO6 != null)
				msgs = ((InternalEObject)bPO6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO6, null, msgs);
			if (newBPO6 != null)
				msgs = ((InternalEObject)newBPO6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO6, null, msgs);
			msgs = basicSetBPO6(newBPO6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO6, newBPO6, newBPO6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO7CONTENT getBPO7() {
		return bPO7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO7(BPO7CONTENT newBPO7, NotificationChain msgs) {
		BPO7CONTENT oldBPO7 = bPO7;
		bPO7 = newBPO7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO7, oldBPO7, newBPO7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO7(BPO7CONTENT newBPO7) {
		if (newBPO7 != bPO7) {
			NotificationChain msgs = null;
			if (bPO7 != null)
				msgs = ((InternalEObject)bPO7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO7, null, msgs);
			if (newBPO7 != null)
				msgs = ((InternalEObject)newBPO7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO7, null, msgs);
			msgs = basicSetBPO7(newBPO7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO7, newBPO7, newBPO7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO8CONTENT getBPO8() {
		return bPO8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO8(BPO8CONTENT newBPO8, NotificationChain msgs) {
		BPO8CONTENT oldBPO8 = bPO8;
		bPO8 = newBPO8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO8, oldBPO8, newBPO8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO8(BPO8CONTENT newBPO8) {
		if (newBPO8 != bPO8) {
			NotificationChain msgs = null;
			if (bPO8 != null)
				msgs = ((InternalEObject)bPO8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO8, null, msgs);
			if (newBPO8 != null)
				msgs = ((InternalEObject)newBPO8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO8, null, msgs);
			msgs = basicSetBPO8(newBPO8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO8, newBPO8, newBPO8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO9CONTENT getBPO9() {
		return bPO9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO9(BPO9CONTENT newBPO9, NotificationChain msgs) {
		BPO9CONTENT oldBPO9 = bPO9;
		bPO9 = newBPO9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO9, oldBPO9, newBPO9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO9(BPO9CONTENT newBPO9) {
		if (newBPO9 != bPO9) {
			NotificationChain msgs = null;
			if (bPO9 != null)
				msgs = ((InternalEObject)bPO9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO9, null, msgs);
			if (newBPO9 != null)
				msgs = ((InternalEObject)newBPO9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO9, null, msgs);
			msgs = basicSetBPO9(newBPO9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO9, newBPO9, newBPO9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO10CONTENT getBPO10() {
		return bPO10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO10(BPO10CONTENT newBPO10, NotificationChain msgs) {
		BPO10CONTENT oldBPO10 = bPO10;
		bPO10 = newBPO10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO10, oldBPO10, newBPO10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO10(BPO10CONTENT newBPO10) {
		if (newBPO10 != bPO10) {
			NotificationChain msgs = null;
			if (bPO10 != null)
				msgs = ((InternalEObject)bPO10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO10, null, msgs);
			if (newBPO10 != null)
				msgs = ((InternalEObject)newBPO10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO10, null, msgs);
			msgs = basicSetBPO10(newBPO10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO10, newBPO10, newBPO10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO11CONTENT getBPO11() {
		return bPO11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO11(BPO11CONTENT newBPO11, NotificationChain msgs) {
		BPO11CONTENT oldBPO11 = bPO11;
		bPO11 = newBPO11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO11, oldBPO11, newBPO11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO11(BPO11CONTENT newBPO11) {
		if (newBPO11 != bPO11) {
			NotificationChain msgs = null;
			if (bPO11 != null)
				msgs = ((InternalEObject)bPO11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO11, null, msgs);
			if (newBPO11 != null)
				msgs = ((InternalEObject)newBPO11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO11, null, msgs);
			msgs = basicSetBPO11(newBPO11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO11, newBPO11, newBPO11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO12CONTENT getBPO12() {
		return bPO12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO12(BPO12CONTENT newBPO12, NotificationChain msgs) {
		BPO12CONTENT oldBPO12 = bPO12;
		bPO12 = newBPO12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO12, oldBPO12, newBPO12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO12(BPO12CONTENT newBPO12) {
		if (newBPO12 != bPO12) {
			NotificationChain msgs = null;
			if (bPO12 != null)
				msgs = ((InternalEObject)bPO12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO12, null, msgs);
			if (newBPO12 != null)
				msgs = ((InternalEObject)newBPO12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO12, null, msgs);
			msgs = basicSetBPO12(newBPO12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO12, newBPO12, newBPO12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPO13CONTENT> getBPO13() {
		if (bPO13 == null) {
			bPO13 = new EObjectContainmentEList<BPO13CONTENT>(BPO13CONTENT.class, this, V2xmlPackage.BPOCONTENT__BPO13);
		}
		return bPO13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPO14CONTENT getBPO14() {
		return bPO14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBPO14(BPO14CONTENT newBPO14, NotificationChain msgs) {
		BPO14CONTENT oldBPO14 = bPO14;
		bPO14 = newBPO14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO14, oldBPO14, newBPO14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPO14(BPO14CONTENT newBPO14) {
		if (newBPO14 != bPO14) {
			NotificationChain msgs = null;
			if (bPO14 != null)
				msgs = ((InternalEObject)bPO14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO14, null, msgs);
			if (newBPO14 != null)
				msgs = ((InternalEObject)newBPO14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BPOCONTENT__BPO14, null, msgs);
			msgs = basicSetBPO14(newBPO14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BPOCONTENT__BPO14, newBPO14, newBPO14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BPOCONTENT__ANY);
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
			case V2xmlPackage.BPOCONTENT__BPO1:
				return basicSetBPO1(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO2:
				return basicSetBPO2(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO3:
				return ((InternalEList<?>)getBPO3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BPOCONTENT__BPO4:
				return basicSetBPO4(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO5:
				return basicSetBPO5(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO6:
				return basicSetBPO6(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO7:
				return basicSetBPO7(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO8:
				return basicSetBPO8(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO9:
				return basicSetBPO9(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO10:
				return basicSetBPO10(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO11:
				return basicSetBPO11(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO12:
				return basicSetBPO12(null, msgs);
			case V2xmlPackage.BPOCONTENT__BPO13:
				return ((InternalEList<?>)getBPO13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.BPOCONTENT__BPO14:
				return basicSetBPO14(null, msgs);
			case V2xmlPackage.BPOCONTENT__ANY:
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
			case V2xmlPackage.BPOCONTENT__BPO1:
				return getBPO1();
			case V2xmlPackage.BPOCONTENT__BPO2:
				return getBPO2();
			case V2xmlPackage.BPOCONTENT__BPO3:
				return getBPO3();
			case V2xmlPackage.BPOCONTENT__BPO4:
				return getBPO4();
			case V2xmlPackage.BPOCONTENT__BPO5:
				return getBPO5();
			case V2xmlPackage.BPOCONTENT__BPO6:
				return getBPO6();
			case V2xmlPackage.BPOCONTENT__BPO7:
				return getBPO7();
			case V2xmlPackage.BPOCONTENT__BPO8:
				return getBPO8();
			case V2xmlPackage.BPOCONTENT__BPO9:
				return getBPO9();
			case V2xmlPackage.BPOCONTENT__BPO10:
				return getBPO10();
			case V2xmlPackage.BPOCONTENT__BPO11:
				return getBPO11();
			case V2xmlPackage.BPOCONTENT__BPO12:
				return getBPO12();
			case V2xmlPackage.BPOCONTENT__BPO13:
				return getBPO13();
			case V2xmlPackage.BPOCONTENT__BPO14:
				return getBPO14();
			case V2xmlPackage.BPOCONTENT__ANY:
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
			case V2xmlPackage.BPOCONTENT__BPO1:
				setBPO1((BPO1CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO2:
				setBPO2((BPO2CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO3:
				getBPO3().clear();
				getBPO3().addAll((Collection<? extends BPO3CONTENT>)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO4:
				setBPO4((BPO4CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO5:
				setBPO5((BPO5CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO6:
				setBPO6((BPO6CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO7:
				setBPO7((BPO7CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO8:
				setBPO8((BPO8CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO9:
				setBPO9((BPO9CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO10:
				setBPO10((BPO10CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO11:
				setBPO11((BPO11CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO12:
				setBPO12((BPO12CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO13:
				getBPO13().clear();
				getBPO13().addAll((Collection<? extends BPO13CONTENT>)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__BPO14:
				setBPO14((BPO14CONTENT)newValue);
				return;
			case V2xmlPackage.BPOCONTENT__ANY:
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
			case V2xmlPackage.BPOCONTENT__BPO1:
				setBPO1((BPO1CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO2:
				setBPO2((BPO2CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO3:
				getBPO3().clear();
				return;
			case V2xmlPackage.BPOCONTENT__BPO4:
				setBPO4((BPO4CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO5:
				setBPO5((BPO5CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO6:
				setBPO6((BPO6CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO7:
				setBPO7((BPO7CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO8:
				setBPO8((BPO8CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO9:
				setBPO9((BPO9CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO10:
				setBPO10((BPO10CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO11:
				setBPO11((BPO11CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO12:
				setBPO12((BPO12CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__BPO13:
				getBPO13().clear();
				return;
			case V2xmlPackage.BPOCONTENT__BPO14:
				setBPO14((BPO14CONTENT)null);
				return;
			case V2xmlPackage.BPOCONTENT__ANY:
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
			case V2xmlPackage.BPOCONTENT__BPO1:
				return bPO1 != null;
			case V2xmlPackage.BPOCONTENT__BPO2:
				return bPO2 != null;
			case V2xmlPackage.BPOCONTENT__BPO3:
				return bPO3 != null && !bPO3.isEmpty();
			case V2xmlPackage.BPOCONTENT__BPO4:
				return bPO4 != null;
			case V2xmlPackage.BPOCONTENT__BPO5:
				return bPO5 != null;
			case V2xmlPackage.BPOCONTENT__BPO6:
				return bPO6 != null;
			case V2xmlPackage.BPOCONTENT__BPO7:
				return bPO7 != null;
			case V2xmlPackage.BPOCONTENT__BPO8:
				return bPO8 != null;
			case V2xmlPackage.BPOCONTENT__BPO9:
				return bPO9 != null;
			case V2xmlPackage.BPOCONTENT__BPO10:
				return bPO10 != null;
			case V2xmlPackage.BPOCONTENT__BPO11:
				return bPO11 != null;
			case V2xmlPackage.BPOCONTENT__BPO12:
				return bPO12 != null;
			case V2xmlPackage.BPOCONTENT__BPO13:
				return bPO13 != null && !bPO13.isEmpty();
			case V2xmlPackage.BPOCONTENT__BPO14:
				return bPO14 != null;
			case V2xmlPackage.BPOCONTENT__ANY:
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

} //BPOCONTENTImpl
