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

import org.hl7.v2xml.ROL10CONTENT;
import org.hl7.v2xml.ROL11CONTENT;
import org.hl7.v2xml.ROL12CONTENT;
import org.hl7.v2xml.ROL1CONTENT;
import org.hl7.v2xml.ROL2CONTENT;
import org.hl7.v2xml.ROL3CONTENT;
import org.hl7.v2xml.ROL4CONTENT;
import org.hl7.v2xml.ROL5CONTENT;
import org.hl7.v2xml.ROL6CONTENT;
import org.hl7.v2xml.ROL7CONTENT;
import org.hl7.v2xml.ROL8CONTENT;
import org.hl7.v2xml.ROL9CONTENT;
import org.hl7.v2xml.ROLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROLCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL1 <em>ROL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL2 <em>ROL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL3 <em>ROL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL4 <em>ROL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL5 <em>ROL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL6 <em>ROL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL7 <em>ROL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL8 <em>ROL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL9 <em>ROL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL10 <em>ROL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL11 <em>ROL11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getROL12 <em>ROL12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ROLCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROLCONTENTImpl extends EObjectImpl implements ROLCONTENT {
	/**
	 * The cached value of the '{@link #getROL1() <em>ROL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL1()
	 * @generated
	 * @ordered
	 */
	protected ROL1CONTENT rOL1;

	/**
	 * The cached value of the '{@link #getROL2() <em>ROL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL2()
	 * @generated
	 * @ordered
	 */
	protected ROL2CONTENT rOL2;

	/**
	 * The cached value of the '{@link #getROL3() <em>ROL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL3()
	 * @generated
	 * @ordered
	 */
	protected ROL3CONTENT rOL3;

	/**
	 * The cached value of the '{@link #getROL4() <em>ROL4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL4()
	 * @generated
	 * @ordered
	 */
	protected EList<ROL4CONTENT> rOL4;

	/**
	 * The cached value of the '{@link #getROL5() <em>ROL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL5()
	 * @generated
	 * @ordered
	 */
	protected ROL5CONTENT rOL5;

	/**
	 * The cached value of the '{@link #getROL6() <em>ROL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL6()
	 * @generated
	 * @ordered
	 */
	protected ROL6CONTENT rOL6;

	/**
	 * The cached value of the '{@link #getROL7() <em>ROL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL7()
	 * @generated
	 * @ordered
	 */
	protected ROL7CONTENT rOL7;

	/**
	 * The cached value of the '{@link #getROL8() <em>ROL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL8()
	 * @generated
	 * @ordered
	 */
	protected ROL8CONTENT rOL8;

	/**
	 * The cached value of the '{@link #getROL9() <em>ROL9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL9()
	 * @generated
	 * @ordered
	 */
	protected EList<ROL9CONTENT> rOL9;

	/**
	 * The cached value of the '{@link #getROL10() <em>ROL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL10()
	 * @generated
	 * @ordered
	 */
	protected ROL10CONTENT rOL10;

	/**
	 * The cached value of the '{@link #getROL11() <em>ROL11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL11()
	 * @generated
	 * @ordered
	 */
	protected EList<ROL11CONTENT> rOL11;

	/**
	 * The cached value of the '{@link #getROL12() <em>ROL12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getROL12()
	 * @generated
	 * @ordered
	 */
	protected EList<ROL12CONTENT> rOL12;

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
	protected ROLCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getROLCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL1CONTENT getROL1() {
		return rOL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL1(ROL1CONTENT newROL1, NotificationChain msgs) {
		ROL1CONTENT oldROL1 = rOL1;
		rOL1 = newROL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL1, oldROL1, newROL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL1(ROL1CONTENT newROL1) {
		if (newROL1 != rOL1) {
			NotificationChain msgs = null;
			if (rOL1 != null)
				msgs = ((InternalEObject)rOL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL1, null, msgs);
			if (newROL1 != null)
				msgs = ((InternalEObject)newROL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL1, null, msgs);
			msgs = basicSetROL1(newROL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL1, newROL1, newROL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL2CONTENT getROL2() {
		return rOL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL2(ROL2CONTENT newROL2, NotificationChain msgs) {
		ROL2CONTENT oldROL2 = rOL2;
		rOL2 = newROL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL2, oldROL2, newROL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL2(ROL2CONTENT newROL2) {
		if (newROL2 != rOL2) {
			NotificationChain msgs = null;
			if (rOL2 != null)
				msgs = ((InternalEObject)rOL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL2, null, msgs);
			if (newROL2 != null)
				msgs = ((InternalEObject)newROL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL2, null, msgs);
			msgs = basicSetROL2(newROL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL2, newROL2, newROL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL3CONTENT getROL3() {
		return rOL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL3(ROL3CONTENT newROL3, NotificationChain msgs) {
		ROL3CONTENT oldROL3 = rOL3;
		rOL3 = newROL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL3, oldROL3, newROL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL3(ROL3CONTENT newROL3) {
		if (newROL3 != rOL3) {
			NotificationChain msgs = null;
			if (rOL3 != null)
				msgs = ((InternalEObject)rOL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL3, null, msgs);
			if (newROL3 != null)
				msgs = ((InternalEObject)newROL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL3, null, msgs);
			msgs = basicSetROL3(newROL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL3, newROL3, newROL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROL4CONTENT> getROL4() {
		if (rOL4 == null) {
			rOL4 = new EObjectContainmentEList<ROL4CONTENT>(ROL4CONTENT.class, this, V2xmlPackage.ROLCONTENT__ROL4);
		}
		return rOL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL5CONTENT getROL5() {
		return rOL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL5(ROL5CONTENT newROL5, NotificationChain msgs) {
		ROL5CONTENT oldROL5 = rOL5;
		rOL5 = newROL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL5, oldROL5, newROL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL5(ROL5CONTENT newROL5) {
		if (newROL5 != rOL5) {
			NotificationChain msgs = null;
			if (rOL5 != null)
				msgs = ((InternalEObject)rOL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL5, null, msgs);
			if (newROL5 != null)
				msgs = ((InternalEObject)newROL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL5, null, msgs);
			msgs = basicSetROL5(newROL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL5, newROL5, newROL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL6CONTENT getROL6() {
		return rOL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL6(ROL6CONTENT newROL6, NotificationChain msgs) {
		ROL6CONTENT oldROL6 = rOL6;
		rOL6 = newROL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL6, oldROL6, newROL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL6(ROL6CONTENT newROL6) {
		if (newROL6 != rOL6) {
			NotificationChain msgs = null;
			if (rOL6 != null)
				msgs = ((InternalEObject)rOL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL6, null, msgs);
			if (newROL6 != null)
				msgs = ((InternalEObject)newROL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL6, null, msgs);
			msgs = basicSetROL6(newROL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL6, newROL6, newROL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL7CONTENT getROL7() {
		return rOL7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL7(ROL7CONTENT newROL7, NotificationChain msgs) {
		ROL7CONTENT oldROL7 = rOL7;
		rOL7 = newROL7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL7, oldROL7, newROL7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL7(ROL7CONTENT newROL7) {
		if (newROL7 != rOL7) {
			NotificationChain msgs = null;
			if (rOL7 != null)
				msgs = ((InternalEObject)rOL7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL7, null, msgs);
			if (newROL7 != null)
				msgs = ((InternalEObject)newROL7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL7, null, msgs);
			msgs = basicSetROL7(newROL7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL7, newROL7, newROL7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL8CONTENT getROL8() {
		return rOL8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL8(ROL8CONTENT newROL8, NotificationChain msgs) {
		ROL8CONTENT oldROL8 = rOL8;
		rOL8 = newROL8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL8, oldROL8, newROL8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL8(ROL8CONTENT newROL8) {
		if (newROL8 != rOL8) {
			NotificationChain msgs = null;
			if (rOL8 != null)
				msgs = ((InternalEObject)rOL8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL8, null, msgs);
			if (newROL8 != null)
				msgs = ((InternalEObject)newROL8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL8, null, msgs);
			msgs = basicSetROL8(newROL8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL8, newROL8, newROL8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROL9CONTENT> getROL9() {
		if (rOL9 == null) {
			rOL9 = new EObjectContainmentEList<ROL9CONTENT>(ROL9CONTENT.class, this, V2xmlPackage.ROLCONTENT__ROL9);
		}
		return rOL9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROL10CONTENT getROL10() {
		return rOL10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetROL10(ROL10CONTENT newROL10, NotificationChain msgs) {
		ROL10CONTENT oldROL10 = rOL10;
		rOL10 = newROL10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL10, oldROL10, newROL10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setROL10(ROL10CONTENT newROL10) {
		if (newROL10 != rOL10) {
			NotificationChain msgs = null;
			if (rOL10 != null)
				msgs = ((InternalEObject)rOL10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL10, null, msgs);
			if (newROL10 != null)
				msgs = ((InternalEObject)newROL10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ROLCONTENT__ROL10, null, msgs);
			msgs = basicSetROL10(newROL10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ROLCONTENT__ROL10, newROL10, newROL10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROL11CONTENT> getROL11() {
		if (rOL11 == null) {
			rOL11 = new EObjectContainmentEList<ROL11CONTENT>(ROL11CONTENT.class, this, V2xmlPackage.ROLCONTENT__ROL11);
		}
		return rOL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ROL12CONTENT> getROL12() {
		if (rOL12 == null) {
			rOL12 = new EObjectContainmentEList<ROL12CONTENT>(ROL12CONTENT.class, this, V2xmlPackage.ROLCONTENT__ROL12);
		}
		return rOL12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ROLCONTENT__ANY);
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
			case V2xmlPackage.ROLCONTENT__ROL1:
				return basicSetROL1(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL2:
				return basicSetROL2(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL3:
				return basicSetROL3(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL4:
				return ((InternalEList<?>)getROL4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ROLCONTENT__ROL5:
				return basicSetROL5(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL6:
				return basicSetROL6(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL7:
				return basicSetROL7(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL8:
				return basicSetROL8(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL9:
				return ((InternalEList<?>)getROL9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ROLCONTENT__ROL10:
				return basicSetROL10(null, msgs);
			case V2xmlPackage.ROLCONTENT__ROL11:
				return ((InternalEList<?>)getROL11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ROLCONTENT__ROL12:
				return ((InternalEList<?>)getROL12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ROLCONTENT__ANY:
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
			case V2xmlPackage.ROLCONTENT__ROL1:
				return getROL1();
			case V2xmlPackage.ROLCONTENT__ROL2:
				return getROL2();
			case V2xmlPackage.ROLCONTENT__ROL3:
				return getROL3();
			case V2xmlPackage.ROLCONTENT__ROL4:
				return getROL4();
			case V2xmlPackage.ROLCONTENT__ROL5:
				return getROL5();
			case V2xmlPackage.ROLCONTENT__ROL6:
				return getROL6();
			case V2xmlPackage.ROLCONTENT__ROL7:
				return getROL7();
			case V2xmlPackage.ROLCONTENT__ROL8:
				return getROL8();
			case V2xmlPackage.ROLCONTENT__ROL9:
				return getROL9();
			case V2xmlPackage.ROLCONTENT__ROL10:
				return getROL10();
			case V2xmlPackage.ROLCONTENT__ROL11:
				return getROL11();
			case V2xmlPackage.ROLCONTENT__ROL12:
				return getROL12();
			case V2xmlPackage.ROLCONTENT__ANY:
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
			case V2xmlPackage.ROLCONTENT__ROL1:
				setROL1((ROL1CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL2:
				setROL2((ROL2CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL3:
				setROL3((ROL3CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL4:
				getROL4().clear();
				getROL4().addAll((Collection<? extends ROL4CONTENT>)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL5:
				setROL5((ROL5CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL6:
				setROL6((ROL6CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL7:
				setROL7((ROL7CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL8:
				setROL8((ROL8CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL9:
				getROL9().clear();
				getROL9().addAll((Collection<? extends ROL9CONTENT>)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL10:
				setROL10((ROL10CONTENT)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL11:
				getROL11().clear();
				getROL11().addAll((Collection<? extends ROL11CONTENT>)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ROL12:
				getROL12().clear();
				getROL12().addAll((Collection<? extends ROL12CONTENT>)newValue);
				return;
			case V2xmlPackage.ROLCONTENT__ANY:
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
			case V2xmlPackage.ROLCONTENT__ROL1:
				setROL1((ROL1CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL2:
				setROL2((ROL2CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL3:
				setROL3((ROL3CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL4:
				getROL4().clear();
				return;
			case V2xmlPackage.ROLCONTENT__ROL5:
				setROL5((ROL5CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL6:
				setROL6((ROL6CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL7:
				setROL7((ROL7CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL8:
				setROL8((ROL8CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL9:
				getROL9().clear();
				return;
			case V2xmlPackage.ROLCONTENT__ROL10:
				setROL10((ROL10CONTENT)null);
				return;
			case V2xmlPackage.ROLCONTENT__ROL11:
				getROL11().clear();
				return;
			case V2xmlPackage.ROLCONTENT__ROL12:
				getROL12().clear();
				return;
			case V2xmlPackage.ROLCONTENT__ANY:
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
			case V2xmlPackage.ROLCONTENT__ROL1:
				return rOL1 != null;
			case V2xmlPackage.ROLCONTENT__ROL2:
				return rOL2 != null;
			case V2xmlPackage.ROLCONTENT__ROL3:
				return rOL3 != null;
			case V2xmlPackage.ROLCONTENT__ROL4:
				return rOL4 != null && !rOL4.isEmpty();
			case V2xmlPackage.ROLCONTENT__ROL5:
				return rOL5 != null;
			case V2xmlPackage.ROLCONTENT__ROL6:
				return rOL6 != null;
			case V2xmlPackage.ROLCONTENT__ROL7:
				return rOL7 != null;
			case V2xmlPackage.ROLCONTENT__ROL8:
				return rOL8 != null;
			case V2xmlPackage.ROLCONTENT__ROL9:
				return rOL9 != null && !rOL9.isEmpty();
			case V2xmlPackage.ROLCONTENT__ROL10:
				return rOL10 != null;
			case V2xmlPackage.ROLCONTENT__ROL11:
				return rOL11 != null && !rOL11.isEmpty();
			case V2xmlPackage.ROLCONTENT__ROL12:
				return rOL12 != null && !rOL12.isEmpty();
			case V2xmlPackage.ROLCONTENT__ANY:
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

} //ROLCONTENTImpl
