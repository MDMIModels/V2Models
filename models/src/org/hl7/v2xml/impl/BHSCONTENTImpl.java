/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.BHS10CONTENT;
import org.hl7.v2xml.BHS11CONTENT;
import org.hl7.v2xml.BHS12CONTENT;
import org.hl7.v2xml.BHS1CONTENT;
import org.hl7.v2xml.BHS2CONTENT;
import org.hl7.v2xml.BHS3CONTENT;
import org.hl7.v2xml.BHS4CONTENT;
import org.hl7.v2xml.BHS5CONTENT;
import org.hl7.v2xml.BHS6CONTENT;
import org.hl7.v2xml.BHS7CONTENT;
import org.hl7.v2xml.BHS8CONTENT;
import org.hl7.v2xml.BHS9CONTENT;
import org.hl7.v2xml.BHSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BHSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS1 <em>BHS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS2 <em>BHS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS3 <em>BHS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS4 <em>BHS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS5 <em>BHS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS6 <em>BHS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS7 <em>BHS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS8 <em>BHS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS9 <em>BHS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS10 <em>BHS10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS11 <em>BHS11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getBHS12 <em>BHS12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.BHSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BHSCONTENTImpl extends EObjectImpl implements BHSCONTENT {
	/**
	 * The cached value of the '{@link #getBHS1() <em>BHS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS1()
	 * @generated
	 * @ordered
	 */
	protected BHS1CONTENT bHS1;

	/**
	 * The cached value of the '{@link #getBHS2() <em>BHS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS2()
	 * @generated
	 * @ordered
	 */
	protected BHS2CONTENT bHS2;

	/**
	 * The cached value of the '{@link #getBHS3() <em>BHS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS3()
	 * @generated
	 * @ordered
	 */
	protected BHS3CONTENT bHS3;

	/**
	 * The cached value of the '{@link #getBHS4() <em>BHS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS4()
	 * @generated
	 * @ordered
	 */
	protected BHS4CONTENT bHS4;

	/**
	 * The cached value of the '{@link #getBHS5() <em>BHS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS5()
	 * @generated
	 * @ordered
	 */
	protected BHS5CONTENT bHS5;

	/**
	 * The cached value of the '{@link #getBHS6() <em>BHS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS6()
	 * @generated
	 * @ordered
	 */
	protected BHS6CONTENT bHS6;

	/**
	 * The cached value of the '{@link #getBHS7() <em>BHS7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS7()
	 * @generated
	 * @ordered
	 */
	protected BHS7CONTENT bHS7;

	/**
	 * The cached value of the '{@link #getBHS8() <em>BHS8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS8()
	 * @generated
	 * @ordered
	 */
	protected BHS8CONTENT bHS8;

	/**
	 * The cached value of the '{@link #getBHS9() <em>BHS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS9()
	 * @generated
	 * @ordered
	 */
	protected BHS9CONTENT bHS9;

	/**
	 * The cached value of the '{@link #getBHS10() <em>BHS10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS10()
	 * @generated
	 * @ordered
	 */
	protected BHS10CONTENT bHS10;

	/**
	 * The cached value of the '{@link #getBHS11() <em>BHS11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS11()
	 * @generated
	 * @ordered
	 */
	protected BHS11CONTENT bHS11;

	/**
	 * The cached value of the '{@link #getBHS12() <em>BHS12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBHS12()
	 * @generated
	 * @ordered
	 */
	protected BHS12CONTENT bHS12;

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
	protected BHSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getBHSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS1CONTENT getBHS1() {
		return bHS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS1(BHS1CONTENT newBHS1, NotificationChain msgs) {
		BHS1CONTENT oldBHS1 = bHS1;
		bHS1 = newBHS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS1, oldBHS1, newBHS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS1(BHS1CONTENT newBHS1) {
		if (newBHS1 != bHS1) {
			NotificationChain msgs = null;
			if (bHS1 != null)
				msgs = ((InternalEObject)bHS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS1, null, msgs);
			if (newBHS1 != null)
				msgs = ((InternalEObject)newBHS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS1, null, msgs);
			msgs = basicSetBHS1(newBHS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS1, newBHS1, newBHS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS2CONTENT getBHS2() {
		return bHS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS2(BHS2CONTENT newBHS2, NotificationChain msgs) {
		BHS2CONTENT oldBHS2 = bHS2;
		bHS2 = newBHS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS2, oldBHS2, newBHS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS2(BHS2CONTENT newBHS2) {
		if (newBHS2 != bHS2) {
			NotificationChain msgs = null;
			if (bHS2 != null)
				msgs = ((InternalEObject)bHS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS2, null, msgs);
			if (newBHS2 != null)
				msgs = ((InternalEObject)newBHS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS2, null, msgs);
			msgs = basicSetBHS2(newBHS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS2, newBHS2, newBHS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS3CONTENT getBHS3() {
		return bHS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS3(BHS3CONTENT newBHS3, NotificationChain msgs) {
		BHS3CONTENT oldBHS3 = bHS3;
		bHS3 = newBHS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS3, oldBHS3, newBHS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS3(BHS3CONTENT newBHS3) {
		if (newBHS3 != bHS3) {
			NotificationChain msgs = null;
			if (bHS3 != null)
				msgs = ((InternalEObject)bHS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS3, null, msgs);
			if (newBHS3 != null)
				msgs = ((InternalEObject)newBHS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS3, null, msgs);
			msgs = basicSetBHS3(newBHS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS3, newBHS3, newBHS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS4CONTENT getBHS4() {
		return bHS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS4(BHS4CONTENT newBHS4, NotificationChain msgs) {
		BHS4CONTENT oldBHS4 = bHS4;
		bHS4 = newBHS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS4, oldBHS4, newBHS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS4(BHS4CONTENT newBHS4) {
		if (newBHS4 != bHS4) {
			NotificationChain msgs = null;
			if (bHS4 != null)
				msgs = ((InternalEObject)bHS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS4, null, msgs);
			if (newBHS4 != null)
				msgs = ((InternalEObject)newBHS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS4, null, msgs);
			msgs = basicSetBHS4(newBHS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS4, newBHS4, newBHS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS5CONTENT getBHS5() {
		return bHS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS5(BHS5CONTENT newBHS5, NotificationChain msgs) {
		BHS5CONTENT oldBHS5 = bHS5;
		bHS5 = newBHS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS5, oldBHS5, newBHS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS5(BHS5CONTENT newBHS5) {
		if (newBHS5 != bHS5) {
			NotificationChain msgs = null;
			if (bHS5 != null)
				msgs = ((InternalEObject)bHS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS5, null, msgs);
			if (newBHS5 != null)
				msgs = ((InternalEObject)newBHS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS5, null, msgs);
			msgs = basicSetBHS5(newBHS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS5, newBHS5, newBHS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS6CONTENT getBHS6() {
		return bHS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS6(BHS6CONTENT newBHS6, NotificationChain msgs) {
		BHS6CONTENT oldBHS6 = bHS6;
		bHS6 = newBHS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS6, oldBHS6, newBHS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS6(BHS6CONTENT newBHS6) {
		if (newBHS6 != bHS6) {
			NotificationChain msgs = null;
			if (bHS6 != null)
				msgs = ((InternalEObject)bHS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS6, null, msgs);
			if (newBHS6 != null)
				msgs = ((InternalEObject)newBHS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS6, null, msgs);
			msgs = basicSetBHS6(newBHS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS6, newBHS6, newBHS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS7CONTENT getBHS7() {
		return bHS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS7(BHS7CONTENT newBHS7, NotificationChain msgs) {
		BHS7CONTENT oldBHS7 = bHS7;
		bHS7 = newBHS7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS7, oldBHS7, newBHS7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS7(BHS7CONTENT newBHS7) {
		if (newBHS7 != bHS7) {
			NotificationChain msgs = null;
			if (bHS7 != null)
				msgs = ((InternalEObject)bHS7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS7, null, msgs);
			if (newBHS7 != null)
				msgs = ((InternalEObject)newBHS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS7, null, msgs);
			msgs = basicSetBHS7(newBHS7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS7, newBHS7, newBHS7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS8CONTENT getBHS8() {
		return bHS8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS8(BHS8CONTENT newBHS8, NotificationChain msgs) {
		BHS8CONTENT oldBHS8 = bHS8;
		bHS8 = newBHS8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS8, oldBHS8, newBHS8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS8(BHS8CONTENT newBHS8) {
		if (newBHS8 != bHS8) {
			NotificationChain msgs = null;
			if (bHS8 != null)
				msgs = ((InternalEObject)bHS8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS8, null, msgs);
			if (newBHS8 != null)
				msgs = ((InternalEObject)newBHS8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS8, null, msgs);
			msgs = basicSetBHS8(newBHS8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS8, newBHS8, newBHS8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS9CONTENT getBHS9() {
		return bHS9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS9(BHS9CONTENT newBHS9, NotificationChain msgs) {
		BHS9CONTENT oldBHS9 = bHS9;
		bHS9 = newBHS9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS9, oldBHS9, newBHS9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS9(BHS9CONTENT newBHS9) {
		if (newBHS9 != bHS9) {
			NotificationChain msgs = null;
			if (bHS9 != null)
				msgs = ((InternalEObject)bHS9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS9, null, msgs);
			if (newBHS9 != null)
				msgs = ((InternalEObject)newBHS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS9, null, msgs);
			msgs = basicSetBHS9(newBHS9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS9, newBHS9, newBHS9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS10CONTENT getBHS10() {
		return bHS10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS10(BHS10CONTENT newBHS10, NotificationChain msgs) {
		BHS10CONTENT oldBHS10 = bHS10;
		bHS10 = newBHS10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS10, oldBHS10, newBHS10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS10(BHS10CONTENT newBHS10) {
		if (newBHS10 != bHS10) {
			NotificationChain msgs = null;
			if (bHS10 != null)
				msgs = ((InternalEObject)bHS10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS10, null, msgs);
			if (newBHS10 != null)
				msgs = ((InternalEObject)newBHS10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS10, null, msgs);
			msgs = basicSetBHS10(newBHS10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS10, newBHS10, newBHS10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS11CONTENT getBHS11() {
		return bHS11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS11(BHS11CONTENT newBHS11, NotificationChain msgs) {
		BHS11CONTENT oldBHS11 = bHS11;
		bHS11 = newBHS11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS11, oldBHS11, newBHS11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS11(BHS11CONTENT newBHS11) {
		if (newBHS11 != bHS11) {
			NotificationChain msgs = null;
			if (bHS11 != null)
				msgs = ((InternalEObject)bHS11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS11, null, msgs);
			if (newBHS11 != null)
				msgs = ((InternalEObject)newBHS11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS11, null, msgs);
			msgs = basicSetBHS11(newBHS11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS11, newBHS11, newBHS11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BHS12CONTENT getBHS12() {
		return bHS12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBHS12(BHS12CONTENT newBHS12, NotificationChain msgs) {
		BHS12CONTENT oldBHS12 = bHS12;
		bHS12 = newBHS12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS12, oldBHS12, newBHS12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBHS12(BHS12CONTENT newBHS12) {
		if (newBHS12 != bHS12) {
			NotificationChain msgs = null;
			if (bHS12 != null)
				msgs = ((InternalEObject)bHS12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS12, null, msgs);
			if (newBHS12 != null)
				msgs = ((InternalEObject)newBHS12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.BHSCONTENT__BHS12, null, msgs);
			msgs = basicSetBHS12(newBHS12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.BHSCONTENT__BHS12, newBHS12, newBHS12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.BHSCONTENT__ANY);
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
			case V2xmlPackage.BHSCONTENT__BHS1:
				return basicSetBHS1(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS2:
				return basicSetBHS2(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS3:
				return basicSetBHS3(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS4:
				return basicSetBHS4(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS5:
				return basicSetBHS5(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS6:
				return basicSetBHS6(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS7:
				return basicSetBHS7(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS8:
				return basicSetBHS8(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS9:
				return basicSetBHS9(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS10:
				return basicSetBHS10(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS11:
				return basicSetBHS11(null, msgs);
			case V2xmlPackage.BHSCONTENT__BHS12:
				return basicSetBHS12(null, msgs);
			case V2xmlPackage.BHSCONTENT__ANY:
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
			case V2xmlPackage.BHSCONTENT__BHS1:
				return getBHS1();
			case V2xmlPackage.BHSCONTENT__BHS2:
				return getBHS2();
			case V2xmlPackage.BHSCONTENT__BHS3:
				return getBHS3();
			case V2xmlPackage.BHSCONTENT__BHS4:
				return getBHS4();
			case V2xmlPackage.BHSCONTENT__BHS5:
				return getBHS5();
			case V2xmlPackage.BHSCONTENT__BHS6:
				return getBHS6();
			case V2xmlPackage.BHSCONTENT__BHS7:
				return getBHS7();
			case V2xmlPackage.BHSCONTENT__BHS8:
				return getBHS8();
			case V2xmlPackage.BHSCONTENT__BHS9:
				return getBHS9();
			case V2xmlPackage.BHSCONTENT__BHS10:
				return getBHS10();
			case V2xmlPackage.BHSCONTENT__BHS11:
				return getBHS11();
			case V2xmlPackage.BHSCONTENT__BHS12:
				return getBHS12();
			case V2xmlPackage.BHSCONTENT__ANY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.BHSCONTENT__BHS1:
				setBHS1((BHS1CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS2:
				setBHS2((BHS2CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS3:
				setBHS3((BHS3CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS4:
				setBHS4((BHS4CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS5:
				setBHS5((BHS5CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS6:
				setBHS6((BHS6CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS7:
				setBHS7((BHS7CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS8:
				setBHS8((BHS8CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS9:
				setBHS9((BHS9CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS10:
				setBHS10((BHS10CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS11:
				setBHS11((BHS11CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__BHS12:
				setBHS12((BHS12CONTENT)newValue);
				return;
			case V2xmlPackage.BHSCONTENT__ANY:
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
			case V2xmlPackage.BHSCONTENT__BHS1:
				setBHS1((BHS1CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS2:
				setBHS2((BHS2CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS3:
				setBHS3((BHS3CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS4:
				setBHS4((BHS4CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS5:
				setBHS5((BHS5CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS6:
				setBHS6((BHS6CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS7:
				setBHS7((BHS7CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS8:
				setBHS8((BHS8CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS9:
				setBHS9((BHS9CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS10:
				setBHS10((BHS10CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS11:
				setBHS11((BHS11CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__BHS12:
				setBHS12((BHS12CONTENT)null);
				return;
			case V2xmlPackage.BHSCONTENT__ANY:
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
			case V2xmlPackage.BHSCONTENT__BHS1:
				return bHS1 != null;
			case V2xmlPackage.BHSCONTENT__BHS2:
				return bHS2 != null;
			case V2xmlPackage.BHSCONTENT__BHS3:
				return bHS3 != null;
			case V2xmlPackage.BHSCONTENT__BHS4:
				return bHS4 != null;
			case V2xmlPackage.BHSCONTENT__BHS5:
				return bHS5 != null;
			case V2xmlPackage.BHSCONTENT__BHS6:
				return bHS6 != null;
			case V2xmlPackage.BHSCONTENT__BHS7:
				return bHS7 != null;
			case V2xmlPackage.BHSCONTENT__BHS8:
				return bHS8 != null;
			case V2xmlPackage.BHSCONTENT__BHS9:
				return bHS9 != null;
			case V2xmlPackage.BHSCONTENT__BHS10:
				return bHS10 != null;
			case V2xmlPackage.BHSCONTENT__BHS11:
				return bHS11 != null;
			case V2xmlPackage.BHSCONTENT__BHS12:
				return bHS12 != null;
			case V2xmlPackage.BHSCONTENT__ANY:
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

} //BHSCONTENTImpl
