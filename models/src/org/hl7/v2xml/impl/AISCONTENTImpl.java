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

import org.hl7.v2xml.AIS10CONTENT;
import org.hl7.v2xml.AIS11CONTENT;
import org.hl7.v2xml.AIS12CONTENT;
import org.hl7.v2xml.AIS1CONTENT;
import org.hl7.v2xml.AIS2CONTENT;
import org.hl7.v2xml.AIS3CONTENT;
import org.hl7.v2xml.AIS4CONTENT;
import org.hl7.v2xml.AIS5CONTENT;
import org.hl7.v2xml.AIS6CONTENT;
import org.hl7.v2xml.AIS7CONTENT;
import org.hl7.v2xml.AIS8CONTENT;
import org.hl7.v2xml.AIS9CONTENT;
import org.hl7.v2xml.AISCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AISCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS1 <em>AIS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS2 <em>AIS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS3 <em>AIS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS4 <em>AIS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS5 <em>AIS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS6 <em>AIS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS7 <em>AIS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS8 <em>AIS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS9 <em>AIS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS10 <em>AIS10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS11 <em>AIS11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAIS12 <em>AIS12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AISCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AISCONTENTImpl extends EObjectImpl implements AISCONTENT {
	/**
	 * The cached value of the '{@link #getAIS1() <em>AIS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS1()
	 * @generated
	 * @ordered
	 */
	protected AIS1CONTENT aIS1;

	/**
	 * The cached value of the '{@link #getAIS2() <em>AIS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS2()
	 * @generated
	 * @ordered
	 */
	protected AIS2CONTENT aIS2;

	/**
	 * The cached value of the '{@link #getAIS3() <em>AIS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS3()
	 * @generated
	 * @ordered
	 */
	protected AIS3CONTENT aIS3;

	/**
	 * The cached value of the '{@link #getAIS4() <em>AIS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS4()
	 * @generated
	 * @ordered
	 */
	protected AIS4CONTENT aIS4;

	/**
	 * The cached value of the '{@link #getAIS5() <em>AIS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS5()
	 * @generated
	 * @ordered
	 */
	protected AIS5CONTENT aIS5;

	/**
	 * The cached value of the '{@link #getAIS6() <em>AIS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS6()
	 * @generated
	 * @ordered
	 */
	protected AIS6CONTENT aIS6;

	/**
	 * The cached value of the '{@link #getAIS7() <em>AIS7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS7()
	 * @generated
	 * @ordered
	 */
	protected AIS7CONTENT aIS7;

	/**
	 * The cached value of the '{@link #getAIS8() <em>AIS8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS8()
	 * @generated
	 * @ordered
	 */
	protected AIS8CONTENT aIS8;

	/**
	 * The cached value of the '{@link #getAIS9() <em>AIS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS9()
	 * @generated
	 * @ordered
	 */
	protected AIS9CONTENT aIS9;

	/**
	 * The cached value of the '{@link #getAIS10() <em>AIS10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS10()
	 * @generated
	 * @ordered
	 */
	protected AIS10CONTENT aIS10;

	/**
	 * The cached value of the '{@link #getAIS11() <em>AIS11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS11()
	 * @generated
	 * @ordered
	 */
	protected EList<AIS11CONTENT> aIS11;

	/**
	 * The cached value of the '{@link #getAIS12() <em>AIS12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIS12()
	 * @generated
	 * @ordered
	 */
	protected EList<AIS12CONTENT> aIS12;

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
	protected AISCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAISCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS1CONTENT getAIS1() {
		return aIS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS1(AIS1CONTENT newAIS1, NotificationChain msgs) {
		AIS1CONTENT oldAIS1 = aIS1;
		aIS1 = newAIS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS1, oldAIS1, newAIS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS1(AIS1CONTENT newAIS1) {
		if (newAIS1 != aIS1) {
			NotificationChain msgs = null;
			if (aIS1 != null)
				msgs = ((InternalEObject)aIS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS1, null, msgs);
			if (newAIS1 != null)
				msgs = ((InternalEObject)newAIS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS1, null, msgs);
			msgs = basicSetAIS1(newAIS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS1, newAIS1, newAIS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS2CONTENT getAIS2() {
		return aIS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS2(AIS2CONTENT newAIS2, NotificationChain msgs) {
		AIS2CONTENT oldAIS2 = aIS2;
		aIS2 = newAIS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS2, oldAIS2, newAIS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS2(AIS2CONTENT newAIS2) {
		if (newAIS2 != aIS2) {
			NotificationChain msgs = null;
			if (aIS2 != null)
				msgs = ((InternalEObject)aIS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS2, null, msgs);
			if (newAIS2 != null)
				msgs = ((InternalEObject)newAIS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS2, null, msgs);
			msgs = basicSetAIS2(newAIS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS2, newAIS2, newAIS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS3CONTENT getAIS3() {
		return aIS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS3(AIS3CONTENT newAIS3, NotificationChain msgs) {
		AIS3CONTENT oldAIS3 = aIS3;
		aIS3 = newAIS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS3, oldAIS3, newAIS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS3(AIS3CONTENT newAIS3) {
		if (newAIS3 != aIS3) {
			NotificationChain msgs = null;
			if (aIS3 != null)
				msgs = ((InternalEObject)aIS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS3, null, msgs);
			if (newAIS3 != null)
				msgs = ((InternalEObject)newAIS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS3, null, msgs);
			msgs = basicSetAIS3(newAIS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS3, newAIS3, newAIS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS4CONTENT getAIS4() {
		return aIS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS4(AIS4CONTENT newAIS4, NotificationChain msgs) {
		AIS4CONTENT oldAIS4 = aIS4;
		aIS4 = newAIS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS4, oldAIS4, newAIS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS4(AIS4CONTENT newAIS4) {
		if (newAIS4 != aIS4) {
			NotificationChain msgs = null;
			if (aIS4 != null)
				msgs = ((InternalEObject)aIS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS4, null, msgs);
			if (newAIS4 != null)
				msgs = ((InternalEObject)newAIS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS4, null, msgs);
			msgs = basicSetAIS4(newAIS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS4, newAIS4, newAIS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS5CONTENT getAIS5() {
		return aIS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS5(AIS5CONTENT newAIS5, NotificationChain msgs) {
		AIS5CONTENT oldAIS5 = aIS5;
		aIS5 = newAIS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS5, oldAIS5, newAIS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS5(AIS5CONTENT newAIS5) {
		if (newAIS5 != aIS5) {
			NotificationChain msgs = null;
			if (aIS5 != null)
				msgs = ((InternalEObject)aIS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS5, null, msgs);
			if (newAIS5 != null)
				msgs = ((InternalEObject)newAIS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS5, null, msgs);
			msgs = basicSetAIS5(newAIS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS5, newAIS5, newAIS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS6CONTENT getAIS6() {
		return aIS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS6(AIS6CONTENT newAIS6, NotificationChain msgs) {
		AIS6CONTENT oldAIS6 = aIS6;
		aIS6 = newAIS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS6, oldAIS6, newAIS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS6(AIS6CONTENT newAIS6) {
		if (newAIS6 != aIS6) {
			NotificationChain msgs = null;
			if (aIS6 != null)
				msgs = ((InternalEObject)aIS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS6, null, msgs);
			if (newAIS6 != null)
				msgs = ((InternalEObject)newAIS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS6, null, msgs);
			msgs = basicSetAIS6(newAIS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS6, newAIS6, newAIS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS7CONTENT getAIS7() {
		return aIS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS7(AIS7CONTENT newAIS7, NotificationChain msgs) {
		AIS7CONTENT oldAIS7 = aIS7;
		aIS7 = newAIS7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS7, oldAIS7, newAIS7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS7(AIS7CONTENT newAIS7) {
		if (newAIS7 != aIS7) {
			NotificationChain msgs = null;
			if (aIS7 != null)
				msgs = ((InternalEObject)aIS7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS7, null, msgs);
			if (newAIS7 != null)
				msgs = ((InternalEObject)newAIS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS7, null, msgs);
			msgs = basicSetAIS7(newAIS7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS7, newAIS7, newAIS7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS8CONTENT getAIS8() {
		return aIS8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS8(AIS8CONTENT newAIS8, NotificationChain msgs) {
		AIS8CONTENT oldAIS8 = aIS8;
		aIS8 = newAIS8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS8, oldAIS8, newAIS8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS8(AIS8CONTENT newAIS8) {
		if (newAIS8 != aIS8) {
			NotificationChain msgs = null;
			if (aIS8 != null)
				msgs = ((InternalEObject)aIS8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS8, null, msgs);
			if (newAIS8 != null)
				msgs = ((InternalEObject)newAIS8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS8, null, msgs);
			msgs = basicSetAIS8(newAIS8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS8, newAIS8, newAIS8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS9CONTENT getAIS9() {
		return aIS9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS9(AIS9CONTENT newAIS9, NotificationChain msgs) {
		AIS9CONTENT oldAIS9 = aIS9;
		aIS9 = newAIS9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS9, oldAIS9, newAIS9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS9(AIS9CONTENT newAIS9) {
		if (newAIS9 != aIS9) {
			NotificationChain msgs = null;
			if (aIS9 != null)
				msgs = ((InternalEObject)aIS9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS9, null, msgs);
			if (newAIS9 != null)
				msgs = ((InternalEObject)newAIS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS9, null, msgs);
			msgs = basicSetAIS9(newAIS9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS9, newAIS9, newAIS9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIS10CONTENT getAIS10() {
		return aIS10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIS10(AIS10CONTENT newAIS10, NotificationChain msgs) {
		AIS10CONTENT oldAIS10 = aIS10;
		aIS10 = newAIS10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS10, oldAIS10, newAIS10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIS10(AIS10CONTENT newAIS10) {
		if (newAIS10 != aIS10) {
			NotificationChain msgs = null;
			if (aIS10 != null)
				msgs = ((InternalEObject)aIS10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS10, null, msgs);
			if (newAIS10 != null)
				msgs = ((InternalEObject)newAIS10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AISCONTENT__AIS10, null, msgs);
			msgs = basicSetAIS10(newAIS10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AISCONTENT__AIS10, newAIS10, newAIS10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIS11CONTENT> getAIS11() {
		if (aIS11 == null) {
			aIS11 = new EObjectContainmentEList<AIS11CONTENT>(AIS11CONTENT.class, this, V2xmlPackage.AISCONTENT__AIS11);
		}
		return aIS11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIS12CONTENT> getAIS12() {
		if (aIS12 == null) {
			aIS12 = new EObjectContainmentEList<AIS12CONTENT>(AIS12CONTENT.class, this, V2xmlPackage.AISCONTENT__AIS12);
		}
		return aIS12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AISCONTENT__ANY);
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
			case V2xmlPackage.AISCONTENT__AIS1:
				return basicSetAIS1(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS2:
				return basicSetAIS2(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS3:
				return basicSetAIS3(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS4:
				return basicSetAIS4(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS5:
				return basicSetAIS5(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS6:
				return basicSetAIS6(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS7:
				return basicSetAIS7(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS8:
				return basicSetAIS8(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS9:
				return basicSetAIS9(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS10:
				return basicSetAIS10(null, msgs);
			case V2xmlPackage.AISCONTENT__AIS11:
				return ((InternalEList<?>)getAIS11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AISCONTENT__AIS12:
				return ((InternalEList<?>)getAIS12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AISCONTENT__ANY:
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
			case V2xmlPackage.AISCONTENT__AIS1:
				return getAIS1();
			case V2xmlPackage.AISCONTENT__AIS2:
				return getAIS2();
			case V2xmlPackage.AISCONTENT__AIS3:
				return getAIS3();
			case V2xmlPackage.AISCONTENT__AIS4:
				return getAIS4();
			case V2xmlPackage.AISCONTENT__AIS5:
				return getAIS5();
			case V2xmlPackage.AISCONTENT__AIS6:
				return getAIS6();
			case V2xmlPackage.AISCONTENT__AIS7:
				return getAIS7();
			case V2xmlPackage.AISCONTENT__AIS8:
				return getAIS8();
			case V2xmlPackage.AISCONTENT__AIS9:
				return getAIS9();
			case V2xmlPackage.AISCONTENT__AIS10:
				return getAIS10();
			case V2xmlPackage.AISCONTENT__AIS11:
				return getAIS11();
			case V2xmlPackage.AISCONTENT__AIS12:
				return getAIS12();
			case V2xmlPackage.AISCONTENT__ANY:
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
			case V2xmlPackage.AISCONTENT__AIS1:
				setAIS1((AIS1CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS2:
				setAIS2((AIS2CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS3:
				setAIS3((AIS3CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS4:
				setAIS4((AIS4CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS5:
				setAIS5((AIS5CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS6:
				setAIS6((AIS6CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS7:
				setAIS7((AIS7CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS8:
				setAIS8((AIS8CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS9:
				setAIS9((AIS9CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS10:
				setAIS10((AIS10CONTENT)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS11:
				getAIS11().clear();
				getAIS11().addAll((Collection<? extends AIS11CONTENT>)newValue);
				return;
			case V2xmlPackage.AISCONTENT__AIS12:
				getAIS12().clear();
				getAIS12().addAll((Collection<? extends AIS12CONTENT>)newValue);
				return;
			case V2xmlPackage.AISCONTENT__ANY:
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
			case V2xmlPackage.AISCONTENT__AIS1:
				setAIS1((AIS1CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS2:
				setAIS2((AIS2CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS3:
				setAIS3((AIS3CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS4:
				setAIS4((AIS4CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS5:
				setAIS5((AIS5CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS6:
				setAIS6((AIS6CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS7:
				setAIS7((AIS7CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS8:
				setAIS8((AIS8CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS9:
				setAIS9((AIS9CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS10:
				setAIS10((AIS10CONTENT)null);
				return;
			case V2xmlPackage.AISCONTENT__AIS11:
				getAIS11().clear();
				return;
			case V2xmlPackage.AISCONTENT__AIS12:
				getAIS12().clear();
				return;
			case V2xmlPackage.AISCONTENT__ANY:
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
			case V2xmlPackage.AISCONTENT__AIS1:
				return aIS1 != null;
			case V2xmlPackage.AISCONTENT__AIS2:
				return aIS2 != null;
			case V2xmlPackage.AISCONTENT__AIS3:
				return aIS3 != null;
			case V2xmlPackage.AISCONTENT__AIS4:
				return aIS4 != null;
			case V2xmlPackage.AISCONTENT__AIS5:
				return aIS5 != null;
			case V2xmlPackage.AISCONTENT__AIS6:
				return aIS6 != null;
			case V2xmlPackage.AISCONTENT__AIS7:
				return aIS7 != null;
			case V2xmlPackage.AISCONTENT__AIS8:
				return aIS8 != null;
			case V2xmlPackage.AISCONTENT__AIS9:
				return aIS9 != null;
			case V2xmlPackage.AISCONTENT__AIS10:
				return aIS10 != null;
			case V2xmlPackage.AISCONTENT__AIS11:
				return aIS11 != null && !aIS11.isEmpty();
			case V2xmlPackage.AISCONTENT__AIS12:
				return aIS12 != null && !aIS12.isEmpty();
			case V2xmlPackage.AISCONTENT__ANY:
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

} //AISCONTENTImpl
