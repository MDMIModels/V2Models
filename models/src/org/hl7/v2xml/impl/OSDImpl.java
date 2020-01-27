/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.OSD;
import org.hl7.v2xml.OSD10CONTENT;
import org.hl7.v2xml.OSD11CONTENT;
import org.hl7.v2xml.OSD1CONTENT;
import org.hl7.v2xml.OSD2CONTENT;
import org.hl7.v2xml.OSD3CONTENT;
import org.hl7.v2xml.OSD4CONTENT;
import org.hl7.v2xml.OSD5CONTENT;
import org.hl7.v2xml.OSD6CONTENT;
import org.hl7.v2xml.OSD7CONTENT;
import org.hl7.v2xml.OSD8CONTENT;
import org.hl7.v2xml.OSD9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD1 <em>OSD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD2 <em>OSD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD3 <em>OSD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD4 <em>OSD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD5 <em>OSD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD6 <em>OSD6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD7 <em>OSD7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD8 <em>OSD8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD9 <em>OSD9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD10 <em>OSD10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OSDImpl#getOSD11 <em>OSD11</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSDImpl extends EObjectImpl implements OSD {
	/**
	 * The cached value of the '{@link #getOSD1() <em>OSD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD1()
	 * @generated
	 * @ordered
	 */
	protected OSD1CONTENT oSD1;

	/**
	 * The cached value of the '{@link #getOSD2() <em>OSD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD2()
	 * @generated
	 * @ordered
	 */
	protected OSD2CONTENT oSD2;

	/**
	 * The cached value of the '{@link #getOSD3() <em>OSD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD3()
	 * @generated
	 * @ordered
	 */
	protected OSD3CONTENT oSD3;

	/**
	 * The cached value of the '{@link #getOSD4() <em>OSD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD4()
	 * @generated
	 * @ordered
	 */
	protected OSD4CONTENT oSD4;

	/**
	 * The cached value of the '{@link #getOSD5() <em>OSD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD5()
	 * @generated
	 * @ordered
	 */
	protected OSD5CONTENT oSD5;

	/**
	 * The cached value of the '{@link #getOSD6() <em>OSD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD6()
	 * @generated
	 * @ordered
	 */
	protected OSD6CONTENT oSD6;

	/**
	 * The cached value of the '{@link #getOSD7() <em>OSD7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD7()
	 * @generated
	 * @ordered
	 */
	protected OSD7CONTENT oSD7;

	/**
	 * The cached value of the '{@link #getOSD8() <em>OSD8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD8()
	 * @generated
	 * @ordered
	 */
	protected OSD8CONTENT oSD8;

	/**
	 * The cached value of the '{@link #getOSD9() <em>OSD9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD9()
	 * @generated
	 * @ordered
	 */
	protected OSD9CONTENT oSD9;

	/**
	 * The cached value of the '{@link #getOSD10() <em>OSD10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD10()
	 * @generated
	 * @ordered
	 */
	protected OSD10CONTENT oSD10;

	/**
	 * The cached value of the '{@link #getOSD11() <em>OSD11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOSD11()
	 * @generated
	 * @ordered
	 */
	protected OSD11CONTENT oSD11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOSD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD1CONTENT getOSD1() {
		return oSD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD1(OSD1CONTENT newOSD1, NotificationChain msgs) {
		OSD1CONTENT oldOSD1 = oSD1;
		oSD1 = newOSD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD1, oldOSD1, newOSD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD1(OSD1CONTENT newOSD1) {
		if (newOSD1 != oSD1) {
			NotificationChain msgs = null;
			if (oSD1 != null)
				msgs = ((InternalEObject)oSD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD1, null, msgs);
			if (newOSD1 != null)
				msgs = ((InternalEObject)newOSD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD1, null, msgs);
			msgs = basicSetOSD1(newOSD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD1, newOSD1, newOSD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD2CONTENT getOSD2() {
		return oSD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD2(OSD2CONTENT newOSD2, NotificationChain msgs) {
		OSD2CONTENT oldOSD2 = oSD2;
		oSD2 = newOSD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD2, oldOSD2, newOSD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD2(OSD2CONTENT newOSD2) {
		if (newOSD2 != oSD2) {
			NotificationChain msgs = null;
			if (oSD2 != null)
				msgs = ((InternalEObject)oSD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD2, null, msgs);
			if (newOSD2 != null)
				msgs = ((InternalEObject)newOSD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD2, null, msgs);
			msgs = basicSetOSD2(newOSD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD2, newOSD2, newOSD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD3CONTENT getOSD3() {
		return oSD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD3(OSD3CONTENT newOSD3, NotificationChain msgs) {
		OSD3CONTENT oldOSD3 = oSD3;
		oSD3 = newOSD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD3, oldOSD3, newOSD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD3(OSD3CONTENT newOSD3) {
		if (newOSD3 != oSD3) {
			NotificationChain msgs = null;
			if (oSD3 != null)
				msgs = ((InternalEObject)oSD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD3, null, msgs);
			if (newOSD3 != null)
				msgs = ((InternalEObject)newOSD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD3, null, msgs);
			msgs = basicSetOSD3(newOSD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD3, newOSD3, newOSD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD4CONTENT getOSD4() {
		return oSD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD4(OSD4CONTENT newOSD4, NotificationChain msgs) {
		OSD4CONTENT oldOSD4 = oSD4;
		oSD4 = newOSD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD4, oldOSD4, newOSD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD4(OSD4CONTENT newOSD4) {
		if (newOSD4 != oSD4) {
			NotificationChain msgs = null;
			if (oSD4 != null)
				msgs = ((InternalEObject)oSD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD4, null, msgs);
			if (newOSD4 != null)
				msgs = ((InternalEObject)newOSD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD4, null, msgs);
			msgs = basicSetOSD4(newOSD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD4, newOSD4, newOSD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD5CONTENT getOSD5() {
		return oSD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD5(OSD5CONTENT newOSD5, NotificationChain msgs) {
		OSD5CONTENT oldOSD5 = oSD5;
		oSD5 = newOSD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD5, oldOSD5, newOSD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD5(OSD5CONTENT newOSD5) {
		if (newOSD5 != oSD5) {
			NotificationChain msgs = null;
			if (oSD5 != null)
				msgs = ((InternalEObject)oSD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD5, null, msgs);
			if (newOSD5 != null)
				msgs = ((InternalEObject)newOSD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD5, null, msgs);
			msgs = basicSetOSD5(newOSD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD5, newOSD5, newOSD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD6CONTENT getOSD6() {
		return oSD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD6(OSD6CONTENT newOSD6, NotificationChain msgs) {
		OSD6CONTENT oldOSD6 = oSD6;
		oSD6 = newOSD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD6, oldOSD6, newOSD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD6(OSD6CONTENT newOSD6) {
		if (newOSD6 != oSD6) {
			NotificationChain msgs = null;
			if (oSD6 != null)
				msgs = ((InternalEObject)oSD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD6, null, msgs);
			if (newOSD6 != null)
				msgs = ((InternalEObject)newOSD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD6, null, msgs);
			msgs = basicSetOSD6(newOSD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD6, newOSD6, newOSD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD7CONTENT getOSD7() {
		return oSD7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD7(OSD7CONTENT newOSD7, NotificationChain msgs) {
		OSD7CONTENT oldOSD7 = oSD7;
		oSD7 = newOSD7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD7, oldOSD7, newOSD7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD7(OSD7CONTENT newOSD7) {
		if (newOSD7 != oSD7) {
			NotificationChain msgs = null;
			if (oSD7 != null)
				msgs = ((InternalEObject)oSD7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD7, null, msgs);
			if (newOSD7 != null)
				msgs = ((InternalEObject)newOSD7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD7, null, msgs);
			msgs = basicSetOSD7(newOSD7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD7, newOSD7, newOSD7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD8CONTENT getOSD8() {
		return oSD8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD8(OSD8CONTENT newOSD8, NotificationChain msgs) {
		OSD8CONTENT oldOSD8 = oSD8;
		oSD8 = newOSD8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD8, oldOSD8, newOSD8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD8(OSD8CONTENT newOSD8) {
		if (newOSD8 != oSD8) {
			NotificationChain msgs = null;
			if (oSD8 != null)
				msgs = ((InternalEObject)oSD8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD8, null, msgs);
			if (newOSD8 != null)
				msgs = ((InternalEObject)newOSD8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD8, null, msgs);
			msgs = basicSetOSD8(newOSD8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD8, newOSD8, newOSD8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD9CONTENT getOSD9() {
		return oSD9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD9(OSD9CONTENT newOSD9, NotificationChain msgs) {
		OSD9CONTENT oldOSD9 = oSD9;
		oSD9 = newOSD9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD9, oldOSD9, newOSD9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD9(OSD9CONTENT newOSD9) {
		if (newOSD9 != oSD9) {
			NotificationChain msgs = null;
			if (oSD9 != null)
				msgs = ((InternalEObject)oSD9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD9, null, msgs);
			if (newOSD9 != null)
				msgs = ((InternalEObject)newOSD9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD9, null, msgs);
			msgs = basicSetOSD9(newOSD9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD9, newOSD9, newOSD9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD10CONTENT getOSD10() {
		return oSD10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD10(OSD10CONTENT newOSD10, NotificationChain msgs) {
		OSD10CONTENT oldOSD10 = oSD10;
		oSD10 = newOSD10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD10, oldOSD10, newOSD10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD10(OSD10CONTENT newOSD10) {
		if (newOSD10 != oSD10) {
			NotificationChain msgs = null;
			if (oSD10 != null)
				msgs = ((InternalEObject)oSD10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD10, null, msgs);
			if (newOSD10 != null)
				msgs = ((InternalEObject)newOSD10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD10, null, msgs);
			msgs = basicSetOSD10(newOSD10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD10, newOSD10, newOSD10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD11CONTENT getOSD11() {
		return oSD11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOSD11(OSD11CONTENT newOSD11, NotificationChain msgs) {
		OSD11CONTENT oldOSD11 = oSD11;
		oSD11 = newOSD11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD11, oldOSD11, newOSD11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOSD11(OSD11CONTENT newOSD11) {
		if (newOSD11 != oSD11) {
			NotificationChain msgs = null;
			if (oSD11 != null)
				msgs = ((InternalEObject)oSD11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD11, null, msgs);
			if (newOSD11 != null)
				msgs = ((InternalEObject)newOSD11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OSD__OSD11, null, msgs);
			msgs = basicSetOSD11(newOSD11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OSD__OSD11, newOSD11, newOSD11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.OSD__OSD1:
				return basicSetOSD1(null, msgs);
			case V2xmlPackage.OSD__OSD2:
				return basicSetOSD2(null, msgs);
			case V2xmlPackage.OSD__OSD3:
				return basicSetOSD3(null, msgs);
			case V2xmlPackage.OSD__OSD4:
				return basicSetOSD4(null, msgs);
			case V2xmlPackage.OSD__OSD5:
				return basicSetOSD5(null, msgs);
			case V2xmlPackage.OSD__OSD6:
				return basicSetOSD6(null, msgs);
			case V2xmlPackage.OSD__OSD7:
				return basicSetOSD7(null, msgs);
			case V2xmlPackage.OSD__OSD8:
				return basicSetOSD8(null, msgs);
			case V2xmlPackage.OSD__OSD9:
				return basicSetOSD9(null, msgs);
			case V2xmlPackage.OSD__OSD10:
				return basicSetOSD10(null, msgs);
			case V2xmlPackage.OSD__OSD11:
				return basicSetOSD11(null, msgs);
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
			case V2xmlPackage.OSD__OSD1:
				return getOSD1();
			case V2xmlPackage.OSD__OSD2:
				return getOSD2();
			case V2xmlPackage.OSD__OSD3:
				return getOSD3();
			case V2xmlPackage.OSD__OSD4:
				return getOSD4();
			case V2xmlPackage.OSD__OSD5:
				return getOSD5();
			case V2xmlPackage.OSD__OSD6:
				return getOSD6();
			case V2xmlPackage.OSD__OSD7:
				return getOSD7();
			case V2xmlPackage.OSD__OSD8:
				return getOSD8();
			case V2xmlPackage.OSD__OSD9:
				return getOSD9();
			case V2xmlPackage.OSD__OSD10:
				return getOSD10();
			case V2xmlPackage.OSD__OSD11:
				return getOSD11();
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
			case V2xmlPackage.OSD__OSD1:
				setOSD1((OSD1CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD2:
				setOSD2((OSD2CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD3:
				setOSD3((OSD3CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD4:
				setOSD4((OSD4CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD5:
				setOSD5((OSD5CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD6:
				setOSD6((OSD6CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD7:
				setOSD7((OSD7CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD8:
				setOSD8((OSD8CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD9:
				setOSD9((OSD9CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD10:
				setOSD10((OSD10CONTENT)newValue);
				return;
			case V2xmlPackage.OSD__OSD11:
				setOSD11((OSD11CONTENT)newValue);
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
			case V2xmlPackage.OSD__OSD1:
				setOSD1((OSD1CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD2:
				setOSD2((OSD2CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD3:
				setOSD3((OSD3CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD4:
				setOSD4((OSD4CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD5:
				setOSD5((OSD5CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD6:
				setOSD6((OSD6CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD7:
				setOSD7((OSD7CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD8:
				setOSD8((OSD8CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD9:
				setOSD9((OSD9CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD10:
				setOSD10((OSD10CONTENT)null);
				return;
			case V2xmlPackage.OSD__OSD11:
				setOSD11((OSD11CONTENT)null);
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
			case V2xmlPackage.OSD__OSD1:
				return oSD1 != null;
			case V2xmlPackage.OSD__OSD2:
				return oSD2 != null;
			case V2xmlPackage.OSD__OSD3:
				return oSD3 != null;
			case V2xmlPackage.OSD__OSD4:
				return oSD4 != null;
			case V2xmlPackage.OSD__OSD5:
				return oSD5 != null;
			case V2xmlPackage.OSD__OSD6:
				return oSD6 != null;
			case V2xmlPackage.OSD__OSD7:
				return oSD7 != null;
			case V2xmlPackage.OSD__OSD8:
				return oSD8 != null;
			case V2xmlPackage.OSD__OSD9:
				return oSD9 != null;
			case V2xmlPackage.OSD__OSD10:
				return oSD10 != null;
			case V2xmlPackage.OSD__OSD11:
				return oSD11 != null;
		}
		return super.eIsSet(featureID);
	}

} //OSDImpl
