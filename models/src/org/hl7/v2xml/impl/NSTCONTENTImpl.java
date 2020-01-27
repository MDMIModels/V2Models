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

import org.hl7.v2xml.NST10CONTENT;
import org.hl7.v2xml.NST11CONTENT;
import org.hl7.v2xml.NST12CONTENT;
import org.hl7.v2xml.NST13CONTENT;
import org.hl7.v2xml.NST14CONTENT;
import org.hl7.v2xml.NST15CONTENT;
import org.hl7.v2xml.NST1CONTENT;
import org.hl7.v2xml.NST2CONTENT;
import org.hl7.v2xml.NST3CONTENT;
import org.hl7.v2xml.NST4CONTENT;
import org.hl7.v2xml.NST5CONTENT;
import org.hl7.v2xml.NST6CONTENT;
import org.hl7.v2xml.NST7CONTENT;
import org.hl7.v2xml.NST8CONTENT;
import org.hl7.v2xml.NST9CONTENT;
import org.hl7.v2xml.NSTCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NSTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST1 <em>NST1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST2 <em>NST2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST3 <em>NST3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST4 <em>NST4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST5 <em>NST5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST6 <em>NST6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST7 <em>NST7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST8 <em>NST8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST9 <em>NST9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST10 <em>NST10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST11 <em>NST11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST12 <em>NST12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST13 <em>NST13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST14 <em>NST14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getNST15 <em>NST15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NSTCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NSTCONTENTImpl extends EObjectImpl implements NSTCONTENT {
	/**
	 * The cached value of the '{@link #getNST1() <em>NST1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST1()
	 * @generated
	 * @ordered
	 */
	protected NST1CONTENT nST1;

	/**
	 * The cached value of the '{@link #getNST2() <em>NST2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST2()
	 * @generated
	 * @ordered
	 */
	protected NST2CONTENT nST2;

	/**
	 * The cached value of the '{@link #getNST3() <em>NST3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST3()
	 * @generated
	 * @ordered
	 */
	protected NST3CONTENT nST3;

	/**
	 * The cached value of the '{@link #getNST4() <em>NST4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST4()
	 * @generated
	 * @ordered
	 */
	protected NST4CONTENT nST4;

	/**
	 * The cached value of the '{@link #getNST5() <em>NST5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST5()
	 * @generated
	 * @ordered
	 */
	protected NST5CONTENT nST5;

	/**
	 * The cached value of the '{@link #getNST6() <em>NST6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST6()
	 * @generated
	 * @ordered
	 */
	protected NST6CONTENT nST6;

	/**
	 * The cached value of the '{@link #getNST7() <em>NST7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST7()
	 * @generated
	 * @ordered
	 */
	protected NST7CONTENT nST7;

	/**
	 * The cached value of the '{@link #getNST8() <em>NST8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST8()
	 * @generated
	 * @ordered
	 */
	protected NST8CONTENT nST8;

	/**
	 * The cached value of the '{@link #getNST9() <em>NST9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST9()
	 * @generated
	 * @ordered
	 */
	protected NST9CONTENT nST9;

	/**
	 * The cached value of the '{@link #getNST10() <em>NST10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST10()
	 * @generated
	 * @ordered
	 */
	protected NST10CONTENT nST10;

	/**
	 * The cached value of the '{@link #getNST11() <em>NST11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST11()
	 * @generated
	 * @ordered
	 */
	protected NST11CONTENT nST11;

	/**
	 * The cached value of the '{@link #getNST12() <em>NST12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST12()
	 * @generated
	 * @ordered
	 */
	protected NST12CONTENT nST12;

	/**
	 * The cached value of the '{@link #getNST13() <em>NST13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST13()
	 * @generated
	 * @ordered
	 */
	protected NST13CONTENT nST13;

	/**
	 * The cached value of the '{@link #getNST14() <em>NST14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST14()
	 * @generated
	 * @ordered
	 */
	protected NST14CONTENT nST14;

	/**
	 * The cached value of the '{@link #getNST15() <em>NST15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNST15()
	 * @generated
	 * @ordered
	 */
	protected NST15CONTENT nST15;

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
	protected NSTCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNSTCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST1CONTENT getNST1() {
		return nST1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST1(NST1CONTENT newNST1, NotificationChain msgs) {
		NST1CONTENT oldNST1 = nST1;
		nST1 = newNST1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST1, oldNST1, newNST1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST1(NST1CONTENT newNST1) {
		if (newNST1 != nST1) {
			NotificationChain msgs = null;
			if (nST1 != null)
				msgs = ((InternalEObject)nST1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST1, null, msgs);
			if (newNST1 != null)
				msgs = ((InternalEObject)newNST1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST1, null, msgs);
			msgs = basicSetNST1(newNST1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST1, newNST1, newNST1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST2CONTENT getNST2() {
		return nST2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST2(NST2CONTENT newNST2, NotificationChain msgs) {
		NST2CONTENT oldNST2 = nST2;
		nST2 = newNST2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST2, oldNST2, newNST2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST2(NST2CONTENT newNST2) {
		if (newNST2 != nST2) {
			NotificationChain msgs = null;
			if (nST2 != null)
				msgs = ((InternalEObject)nST2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST2, null, msgs);
			if (newNST2 != null)
				msgs = ((InternalEObject)newNST2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST2, null, msgs);
			msgs = basicSetNST2(newNST2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST2, newNST2, newNST2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST3CONTENT getNST3() {
		return nST3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST3(NST3CONTENT newNST3, NotificationChain msgs) {
		NST3CONTENT oldNST3 = nST3;
		nST3 = newNST3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST3, oldNST3, newNST3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST3(NST3CONTENT newNST3) {
		if (newNST3 != nST3) {
			NotificationChain msgs = null;
			if (nST3 != null)
				msgs = ((InternalEObject)nST3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST3, null, msgs);
			if (newNST3 != null)
				msgs = ((InternalEObject)newNST3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST3, null, msgs);
			msgs = basicSetNST3(newNST3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST3, newNST3, newNST3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST4CONTENT getNST4() {
		return nST4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST4(NST4CONTENT newNST4, NotificationChain msgs) {
		NST4CONTENT oldNST4 = nST4;
		nST4 = newNST4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST4, oldNST4, newNST4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST4(NST4CONTENT newNST4) {
		if (newNST4 != nST4) {
			NotificationChain msgs = null;
			if (nST4 != null)
				msgs = ((InternalEObject)nST4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST4, null, msgs);
			if (newNST4 != null)
				msgs = ((InternalEObject)newNST4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST4, null, msgs);
			msgs = basicSetNST4(newNST4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST4, newNST4, newNST4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST5CONTENT getNST5() {
		return nST5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST5(NST5CONTENT newNST5, NotificationChain msgs) {
		NST5CONTENT oldNST5 = nST5;
		nST5 = newNST5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST5, oldNST5, newNST5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST5(NST5CONTENT newNST5) {
		if (newNST5 != nST5) {
			NotificationChain msgs = null;
			if (nST5 != null)
				msgs = ((InternalEObject)nST5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST5, null, msgs);
			if (newNST5 != null)
				msgs = ((InternalEObject)newNST5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST5, null, msgs);
			msgs = basicSetNST5(newNST5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST5, newNST5, newNST5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST6CONTENT getNST6() {
		return nST6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST6(NST6CONTENT newNST6, NotificationChain msgs) {
		NST6CONTENT oldNST6 = nST6;
		nST6 = newNST6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST6, oldNST6, newNST6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST6(NST6CONTENT newNST6) {
		if (newNST6 != nST6) {
			NotificationChain msgs = null;
			if (nST6 != null)
				msgs = ((InternalEObject)nST6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST6, null, msgs);
			if (newNST6 != null)
				msgs = ((InternalEObject)newNST6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST6, null, msgs);
			msgs = basicSetNST6(newNST6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST6, newNST6, newNST6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST7CONTENT getNST7() {
		return nST7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST7(NST7CONTENT newNST7, NotificationChain msgs) {
		NST7CONTENT oldNST7 = nST7;
		nST7 = newNST7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST7, oldNST7, newNST7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST7(NST7CONTENT newNST7) {
		if (newNST7 != nST7) {
			NotificationChain msgs = null;
			if (nST7 != null)
				msgs = ((InternalEObject)nST7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST7, null, msgs);
			if (newNST7 != null)
				msgs = ((InternalEObject)newNST7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST7, null, msgs);
			msgs = basicSetNST7(newNST7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST7, newNST7, newNST7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST8CONTENT getNST8() {
		return nST8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST8(NST8CONTENT newNST8, NotificationChain msgs) {
		NST8CONTENT oldNST8 = nST8;
		nST8 = newNST8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST8, oldNST8, newNST8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST8(NST8CONTENT newNST8) {
		if (newNST8 != nST8) {
			NotificationChain msgs = null;
			if (nST8 != null)
				msgs = ((InternalEObject)nST8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST8, null, msgs);
			if (newNST8 != null)
				msgs = ((InternalEObject)newNST8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST8, null, msgs);
			msgs = basicSetNST8(newNST8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST8, newNST8, newNST8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST9CONTENT getNST9() {
		return nST9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST9(NST9CONTENT newNST9, NotificationChain msgs) {
		NST9CONTENT oldNST9 = nST9;
		nST9 = newNST9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST9, oldNST9, newNST9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST9(NST9CONTENT newNST9) {
		if (newNST9 != nST9) {
			NotificationChain msgs = null;
			if (nST9 != null)
				msgs = ((InternalEObject)nST9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST9, null, msgs);
			if (newNST9 != null)
				msgs = ((InternalEObject)newNST9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST9, null, msgs);
			msgs = basicSetNST9(newNST9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST9, newNST9, newNST9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST10CONTENT getNST10() {
		return nST10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST10(NST10CONTENT newNST10, NotificationChain msgs) {
		NST10CONTENT oldNST10 = nST10;
		nST10 = newNST10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST10, oldNST10, newNST10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST10(NST10CONTENT newNST10) {
		if (newNST10 != nST10) {
			NotificationChain msgs = null;
			if (nST10 != null)
				msgs = ((InternalEObject)nST10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST10, null, msgs);
			if (newNST10 != null)
				msgs = ((InternalEObject)newNST10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST10, null, msgs);
			msgs = basicSetNST10(newNST10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST10, newNST10, newNST10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST11CONTENT getNST11() {
		return nST11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST11(NST11CONTENT newNST11, NotificationChain msgs) {
		NST11CONTENT oldNST11 = nST11;
		nST11 = newNST11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST11, oldNST11, newNST11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST11(NST11CONTENT newNST11) {
		if (newNST11 != nST11) {
			NotificationChain msgs = null;
			if (nST11 != null)
				msgs = ((InternalEObject)nST11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST11, null, msgs);
			if (newNST11 != null)
				msgs = ((InternalEObject)newNST11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST11, null, msgs);
			msgs = basicSetNST11(newNST11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST11, newNST11, newNST11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST12CONTENT getNST12() {
		return nST12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST12(NST12CONTENT newNST12, NotificationChain msgs) {
		NST12CONTENT oldNST12 = nST12;
		nST12 = newNST12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST12, oldNST12, newNST12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST12(NST12CONTENT newNST12) {
		if (newNST12 != nST12) {
			NotificationChain msgs = null;
			if (nST12 != null)
				msgs = ((InternalEObject)nST12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST12, null, msgs);
			if (newNST12 != null)
				msgs = ((InternalEObject)newNST12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST12, null, msgs);
			msgs = basicSetNST12(newNST12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST12, newNST12, newNST12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST13CONTENT getNST13() {
		return nST13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST13(NST13CONTENT newNST13, NotificationChain msgs) {
		NST13CONTENT oldNST13 = nST13;
		nST13 = newNST13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST13, oldNST13, newNST13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST13(NST13CONTENT newNST13) {
		if (newNST13 != nST13) {
			NotificationChain msgs = null;
			if (nST13 != null)
				msgs = ((InternalEObject)nST13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST13, null, msgs);
			if (newNST13 != null)
				msgs = ((InternalEObject)newNST13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST13, null, msgs);
			msgs = basicSetNST13(newNST13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST13, newNST13, newNST13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST14CONTENT getNST14() {
		return nST14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST14(NST14CONTENT newNST14, NotificationChain msgs) {
		NST14CONTENT oldNST14 = nST14;
		nST14 = newNST14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST14, oldNST14, newNST14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST14(NST14CONTENT newNST14) {
		if (newNST14 != nST14) {
			NotificationChain msgs = null;
			if (nST14 != null)
				msgs = ((InternalEObject)nST14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST14, null, msgs);
			if (newNST14 != null)
				msgs = ((InternalEObject)newNST14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST14, null, msgs);
			msgs = basicSetNST14(newNST14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST14, newNST14, newNST14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NST15CONTENT getNST15() {
		return nST15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNST15(NST15CONTENT newNST15, NotificationChain msgs) {
		NST15CONTENT oldNST15 = nST15;
		nST15 = newNST15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST15, oldNST15, newNST15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNST15(NST15CONTENT newNST15) {
		if (newNST15 != nST15) {
			NotificationChain msgs = null;
			if (nST15 != null)
				msgs = ((InternalEObject)nST15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST15, null, msgs);
			if (newNST15 != null)
				msgs = ((InternalEObject)newNST15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NSTCONTENT__NST15, null, msgs);
			msgs = basicSetNST15(newNST15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NSTCONTENT__NST15, newNST15, newNST15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NSTCONTENT__ANY);
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
			case V2xmlPackage.NSTCONTENT__NST1:
				return basicSetNST1(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST2:
				return basicSetNST2(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST3:
				return basicSetNST3(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST4:
				return basicSetNST4(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST5:
				return basicSetNST5(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST6:
				return basicSetNST6(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST7:
				return basicSetNST7(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST8:
				return basicSetNST8(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST9:
				return basicSetNST9(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST10:
				return basicSetNST10(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST11:
				return basicSetNST11(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST12:
				return basicSetNST12(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST13:
				return basicSetNST13(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST14:
				return basicSetNST14(null, msgs);
			case V2xmlPackage.NSTCONTENT__NST15:
				return basicSetNST15(null, msgs);
			case V2xmlPackage.NSTCONTENT__ANY:
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
			case V2xmlPackage.NSTCONTENT__NST1:
				return getNST1();
			case V2xmlPackage.NSTCONTENT__NST2:
				return getNST2();
			case V2xmlPackage.NSTCONTENT__NST3:
				return getNST3();
			case V2xmlPackage.NSTCONTENT__NST4:
				return getNST4();
			case V2xmlPackage.NSTCONTENT__NST5:
				return getNST5();
			case V2xmlPackage.NSTCONTENT__NST6:
				return getNST6();
			case V2xmlPackage.NSTCONTENT__NST7:
				return getNST7();
			case V2xmlPackage.NSTCONTENT__NST8:
				return getNST8();
			case V2xmlPackage.NSTCONTENT__NST9:
				return getNST9();
			case V2xmlPackage.NSTCONTENT__NST10:
				return getNST10();
			case V2xmlPackage.NSTCONTENT__NST11:
				return getNST11();
			case V2xmlPackage.NSTCONTENT__NST12:
				return getNST12();
			case V2xmlPackage.NSTCONTENT__NST13:
				return getNST13();
			case V2xmlPackage.NSTCONTENT__NST14:
				return getNST14();
			case V2xmlPackage.NSTCONTENT__NST15:
				return getNST15();
			case V2xmlPackage.NSTCONTENT__ANY:
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
			case V2xmlPackage.NSTCONTENT__NST1:
				setNST1((NST1CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST2:
				setNST2((NST2CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST3:
				setNST3((NST3CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST4:
				setNST4((NST4CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST5:
				setNST5((NST5CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST6:
				setNST6((NST6CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST7:
				setNST7((NST7CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST8:
				setNST8((NST8CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST9:
				setNST9((NST9CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST10:
				setNST10((NST10CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST11:
				setNST11((NST11CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST12:
				setNST12((NST12CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST13:
				setNST13((NST13CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST14:
				setNST14((NST14CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__NST15:
				setNST15((NST15CONTENT)newValue);
				return;
			case V2xmlPackage.NSTCONTENT__ANY:
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
			case V2xmlPackage.NSTCONTENT__NST1:
				setNST1((NST1CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST2:
				setNST2((NST2CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST3:
				setNST3((NST3CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST4:
				setNST4((NST4CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST5:
				setNST5((NST5CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST6:
				setNST6((NST6CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST7:
				setNST7((NST7CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST8:
				setNST8((NST8CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST9:
				setNST9((NST9CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST10:
				setNST10((NST10CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST11:
				setNST11((NST11CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST12:
				setNST12((NST12CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST13:
				setNST13((NST13CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST14:
				setNST14((NST14CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__NST15:
				setNST15((NST15CONTENT)null);
				return;
			case V2xmlPackage.NSTCONTENT__ANY:
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
			case V2xmlPackage.NSTCONTENT__NST1:
				return nST1 != null;
			case V2xmlPackage.NSTCONTENT__NST2:
				return nST2 != null;
			case V2xmlPackage.NSTCONTENT__NST3:
				return nST3 != null;
			case V2xmlPackage.NSTCONTENT__NST4:
				return nST4 != null;
			case V2xmlPackage.NSTCONTENT__NST5:
				return nST5 != null;
			case V2xmlPackage.NSTCONTENT__NST6:
				return nST6 != null;
			case V2xmlPackage.NSTCONTENT__NST7:
				return nST7 != null;
			case V2xmlPackage.NSTCONTENT__NST8:
				return nST8 != null;
			case V2xmlPackage.NSTCONTENT__NST9:
				return nST9 != null;
			case V2xmlPackage.NSTCONTENT__NST10:
				return nST10 != null;
			case V2xmlPackage.NSTCONTENT__NST11:
				return nST11 != null;
			case V2xmlPackage.NSTCONTENT__NST12:
				return nST12 != null;
			case V2xmlPackage.NSTCONTENT__NST13:
				return nST13 != null;
			case V2xmlPackage.NSTCONTENT__NST14:
				return nST14 != null;
			case V2xmlPackage.NSTCONTENT__NST15:
				return nST15 != null;
			case V2xmlPackage.NSTCONTENT__ANY:
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

} //NSTCONTENTImpl
