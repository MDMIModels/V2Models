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

import org.hl7.v2xml.RQD10CONTENT;
import org.hl7.v2xml.RQD1CONTENT;
import org.hl7.v2xml.RQD2CONTENT;
import org.hl7.v2xml.RQD3CONTENT;
import org.hl7.v2xml.RQD4CONTENT;
import org.hl7.v2xml.RQD5CONTENT;
import org.hl7.v2xml.RQD6CONTENT;
import org.hl7.v2xml.RQD7CONTENT;
import org.hl7.v2xml.RQD8CONTENT;
import org.hl7.v2xml.RQD9CONTENT;
import org.hl7.v2xml.RQDCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RQDCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD1 <em>RQD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD2 <em>RQD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD3 <em>RQD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD4 <em>RQD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD5 <em>RQD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD6 <em>RQD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD7 <em>RQD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD8 <em>RQD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD9 <em>RQD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getRQD10 <em>RQD10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RQDCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RQDCONTENTImpl extends EObjectImpl implements RQDCONTENT {
	/**
	 * The cached value of the '{@link #getRQD1() <em>RQD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD1()
	 * @generated
	 * @ordered
	 */
	protected RQD1CONTENT rQD1;

	/**
	 * The cached value of the '{@link #getRQD2() <em>RQD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD2()
	 * @generated
	 * @ordered
	 */
	protected RQD2CONTENT rQD2;

	/**
	 * The cached value of the '{@link #getRQD3() <em>RQD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD3()
	 * @generated
	 * @ordered
	 */
	protected RQD3CONTENT rQD3;

	/**
	 * The cached value of the '{@link #getRQD4() <em>RQD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD4()
	 * @generated
	 * @ordered
	 */
	protected RQD4CONTENT rQD4;

	/**
	 * The cached value of the '{@link #getRQD5() <em>RQD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD5()
	 * @generated
	 * @ordered
	 */
	protected RQD5CONTENT rQD5;

	/**
	 * The cached value of the '{@link #getRQD6() <em>RQD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD6()
	 * @generated
	 * @ordered
	 */
	protected RQD6CONTENT rQD6;

	/**
	 * The cached value of the '{@link #getRQD7() <em>RQD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD7()
	 * @generated
	 * @ordered
	 */
	protected RQD7CONTENT rQD7;

	/**
	 * The cached value of the '{@link #getRQD8() <em>RQD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD8()
	 * @generated
	 * @ordered
	 */
	protected RQD8CONTENT rQD8;

	/**
	 * The cached value of the '{@link #getRQD9() <em>RQD9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD9()
	 * @generated
	 * @ordered
	 */
	protected RQD9CONTENT rQD9;

	/**
	 * The cached value of the '{@link #getRQD10() <em>RQD10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRQD10()
	 * @generated
	 * @ordered
	 */
	protected RQD10CONTENT rQD10;

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
	protected RQDCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRQDCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD1CONTENT getRQD1() {
		return rQD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD1(RQD1CONTENT newRQD1, NotificationChain msgs) {
		RQD1CONTENT oldRQD1 = rQD1;
		rQD1 = newRQD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD1, oldRQD1, newRQD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD1(RQD1CONTENT newRQD1) {
		if (newRQD1 != rQD1) {
			NotificationChain msgs = null;
			if (rQD1 != null)
				msgs = ((InternalEObject)rQD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD1, null, msgs);
			if (newRQD1 != null)
				msgs = ((InternalEObject)newRQD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD1, null, msgs);
			msgs = basicSetRQD1(newRQD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD1, newRQD1, newRQD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD2CONTENT getRQD2() {
		return rQD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD2(RQD2CONTENT newRQD2, NotificationChain msgs) {
		RQD2CONTENT oldRQD2 = rQD2;
		rQD2 = newRQD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD2, oldRQD2, newRQD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD2(RQD2CONTENT newRQD2) {
		if (newRQD2 != rQD2) {
			NotificationChain msgs = null;
			if (rQD2 != null)
				msgs = ((InternalEObject)rQD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD2, null, msgs);
			if (newRQD2 != null)
				msgs = ((InternalEObject)newRQD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD2, null, msgs);
			msgs = basicSetRQD2(newRQD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD2, newRQD2, newRQD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD3CONTENT getRQD3() {
		return rQD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD3(RQD3CONTENT newRQD3, NotificationChain msgs) {
		RQD3CONTENT oldRQD3 = rQD3;
		rQD3 = newRQD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD3, oldRQD3, newRQD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD3(RQD3CONTENT newRQD3) {
		if (newRQD3 != rQD3) {
			NotificationChain msgs = null;
			if (rQD3 != null)
				msgs = ((InternalEObject)rQD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD3, null, msgs);
			if (newRQD3 != null)
				msgs = ((InternalEObject)newRQD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD3, null, msgs);
			msgs = basicSetRQD3(newRQD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD3, newRQD3, newRQD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD4CONTENT getRQD4() {
		return rQD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD4(RQD4CONTENT newRQD4, NotificationChain msgs) {
		RQD4CONTENT oldRQD4 = rQD4;
		rQD4 = newRQD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD4, oldRQD4, newRQD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD4(RQD4CONTENT newRQD4) {
		if (newRQD4 != rQD4) {
			NotificationChain msgs = null;
			if (rQD4 != null)
				msgs = ((InternalEObject)rQD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD4, null, msgs);
			if (newRQD4 != null)
				msgs = ((InternalEObject)newRQD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD4, null, msgs);
			msgs = basicSetRQD4(newRQD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD4, newRQD4, newRQD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD5CONTENT getRQD5() {
		return rQD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD5(RQD5CONTENT newRQD5, NotificationChain msgs) {
		RQD5CONTENT oldRQD5 = rQD5;
		rQD5 = newRQD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD5, oldRQD5, newRQD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD5(RQD5CONTENT newRQD5) {
		if (newRQD5 != rQD5) {
			NotificationChain msgs = null;
			if (rQD5 != null)
				msgs = ((InternalEObject)rQD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD5, null, msgs);
			if (newRQD5 != null)
				msgs = ((InternalEObject)newRQD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD5, null, msgs);
			msgs = basicSetRQD5(newRQD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD5, newRQD5, newRQD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD6CONTENT getRQD6() {
		return rQD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD6(RQD6CONTENT newRQD6, NotificationChain msgs) {
		RQD6CONTENT oldRQD6 = rQD6;
		rQD6 = newRQD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD6, oldRQD6, newRQD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD6(RQD6CONTENT newRQD6) {
		if (newRQD6 != rQD6) {
			NotificationChain msgs = null;
			if (rQD6 != null)
				msgs = ((InternalEObject)rQD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD6, null, msgs);
			if (newRQD6 != null)
				msgs = ((InternalEObject)newRQD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD6, null, msgs);
			msgs = basicSetRQD6(newRQD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD6, newRQD6, newRQD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD7CONTENT getRQD7() {
		return rQD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD7(RQD7CONTENT newRQD7, NotificationChain msgs) {
		RQD7CONTENT oldRQD7 = rQD7;
		rQD7 = newRQD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD7, oldRQD7, newRQD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD7(RQD7CONTENT newRQD7) {
		if (newRQD7 != rQD7) {
			NotificationChain msgs = null;
			if (rQD7 != null)
				msgs = ((InternalEObject)rQD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD7, null, msgs);
			if (newRQD7 != null)
				msgs = ((InternalEObject)newRQD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD7, null, msgs);
			msgs = basicSetRQD7(newRQD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD7, newRQD7, newRQD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD8CONTENT getRQD8() {
		return rQD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD8(RQD8CONTENT newRQD8, NotificationChain msgs) {
		RQD8CONTENT oldRQD8 = rQD8;
		rQD8 = newRQD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD8, oldRQD8, newRQD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD8(RQD8CONTENT newRQD8) {
		if (newRQD8 != rQD8) {
			NotificationChain msgs = null;
			if (rQD8 != null)
				msgs = ((InternalEObject)rQD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD8, null, msgs);
			if (newRQD8 != null)
				msgs = ((InternalEObject)newRQD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD8, null, msgs);
			msgs = basicSetRQD8(newRQD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD8, newRQD8, newRQD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD9CONTENT getRQD9() {
		return rQD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD9(RQD9CONTENT newRQD9, NotificationChain msgs) {
		RQD9CONTENT oldRQD9 = rQD9;
		rQD9 = newRQD9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD9, oldRQD9, newRQD9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD9(RQD9CONTENT newRQD9) {
		if (newRQD9 != rQD9) {
			NotificationChain msgs = null;
			if (rQD9 != null)
				msgs = ((InternalEObject)rQD9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD9, null, msgs);
			if (newRQD9 != null)
				msgs = ((InternalEObject)newRQD9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD9, null, msgs);
			msgs = basicSetRQD9(newRQD9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD9, newRQD9, newRQD9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RQD10CONTENT getRQD10() {
		return rQD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRQD10(RQD10CONTENT newRQD10, NotificationChain msgs) {
		RQD10CONTENT oldRQD10 = rQD10;
		rQD10 = newRQD10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD10, oldRQD10, newRQD10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRQD10(RQD10CONTENT newRQD10) {
		if (newRQD10 != rQD10) {
			NotificationChain msgs = null;
			if (rQD10 != null)
				msgs = ((InternalEObject)rQD10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD10, null, msgs);
			if (newRQD10 != null)
				msgs = ((InternalEObject)newRQD10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RQDCONTENT__RQD10, null, msgs);
			msgs = basicSetRQD10(newRQD10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RQDCONTENT__RQD10, newRQD10, newRQD10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RQDCONTENT__ANY);
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
			case V2xmlPackage.RQDCONTENT__RQD1:
				return basicSetRQD1(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD2:
				return basicSetRQD2(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD3:
				return basicSetRQD3(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD4:
				return basicSetRQD4(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD5:
				return basicSetRQD5(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD6:
				return basicSetRQD6(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD7:
				return basicSetRQD7(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD8:
				return basicSetRQD8(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD9:
				return basicSetRQD9(null, msgs);
			case V2xmlPackage.RQDCONTENT__RQD10:
				return basicSetRQD10(null, msgs);
			case V2xmlPackage.RQDCONTENT__ANY:
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
			case V2xmlPackage.RQDCONTENT__RQD1:
				return getRQD1();
			case V2xmlPackage.RQDCONTENT__RQD2:
				return getRQD2();
			case V2xmlPackage.RQDCONTENT__RQD3:
				return getRQD3();
			case V2xmlPackage.RQDCONTENT__RQD4:
				return getRQD4();
			case V2xmlPackage.RQDCONTENT__RQD5:
				return getRQD5();
			case V2xmlPackage.RQDCONTENT__RQD6:
				return getRQD6();
			case V2xmlPackage.RQDCONTENT__RQD7:
				return getRQD7();
			case V2xmlPackage.RQDCONTENT__RQD8:
				return getRQD8();
			case V2xmlPackage.RQDCONTENT__RQD9:
				return getRQD9();
			case V2xmlPackage.RQDCONTENT__RQD10:
				return getRQD10();
			case V2xmlPackage.RQDCONTENT__ANY:
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
			case V2xmlPackage.RQDCONTENT__RQD1:
				setRQD1((RQD1CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD2:
				setRQD2((RQD2CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD3:
				setRQD3((RQD3CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD4:
				setRQD4((RQD4CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD5:
				setRQD5((RQD5CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD6:
				setRQD6((RQD6CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD7:
				setRQD7((RQD7CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD8:
				setRQD8((RQD8CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD9:
				setRQD9((RQD9CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__RQD10:
				setRQD10((RQD10CONTENT)newValue);
				return;
			case V2xmlPackage.RQDCONTENT__ANY:
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
			case V2xmlPackage.RQDCONTENT__RQD1:
				setRQD1((RQD1CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD2:
				setRQD2((RQD2CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD3:
				setRQD3((RQD3CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD4:
				setRQD4((RQD4CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD5:
				setRQD5((RQD5CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD6:
				setRQD6((RQD6CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD7:
				setRQD7((RQD7CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD8:
				setRQD8((RQD8CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD9:
				setRQD9((RQD9CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__RQD10:
				setRQD10((RQD10CONTENT)null);
				return;
			case V2xmlPackage.RQDCONTENT__ANY:
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
			case V2xmlPackage.RQDCONTENT__RQD1:
				return rQD1 != null;
			case V2xmlPackage.RQDCONTENT__RQD2:
				return rQD2 != null;
			case V2xmlPackage.RQDCONTENT__RQD3:
				return rQD3 != null;
			case V2xmlPackage.RQDCONTENT__RQD4:
				return rQD4 != null;
			case V2xmlPackage.RQDCONTENT__RQD5:
				return rQD5 != null;
			case V2xmlPackage.RQDCONTENT__RQD6:
				return rQD6 != null;
			case V2xmlPackage.RQDCONTENT__RQD7:
				return rQD7 != null;
			case V2xmlPackage.RQDCONTENT__RQD8:
				return rQD8 != null;
			case V2xmlPackage.RQDCONTENT__RQD9:
				return rQD9 != null;
			case V2xmlPackage.RQDCONTENT__RQD10:
				return rQD10 != null;
			case V2xmlPackage.RQDCONTENT__ANY:
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

} //RQDCONTENTImpl
