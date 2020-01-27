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

import org.hl7.v2xml.IAM10CONTENT;
import org.hl7.v2xml.IAM11CONTENT;
import org.hl7.v2xml.IAM12CONTENT;
import org.hl7.v2xml.IAM13CONTENT;
import org.hl7.v2xml.IAM14CONTENT;
import org.hl7.v2xml.IAM15CONTENT;
import org.hl7.v2xml.IAM16CONTENT;
import org.hl7.v2xml.IAM17CONTENT;
import org.hl7.v2xml.IAM18CONTENT;
import org.hl7.v2xml.IAM19CONTENT;
import org.hl7.v2xml.IAM1CONTENT;
import org.hl7.v2xml.IAM20CONTENT;
import org.hl7.v2xml.IAM2CONTENT;
import org.hl7.v2xml.IAM3CONTENT;
import org.hl7.v2xml.IAM4CONTENT;
import org.hl7.v2xml.IAM5CONTENT;
import org.hl7.v2xml.IAM6CONTENT;
import org.hl7.v2xml.IAM7CONTENT;
import org.hl7.v2xml.IAM8CONTENT;
import org.hl7.v2xml.IAM9CONTENT;
import org.hl7.v2xml.IAMCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IAMCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM1 <em>IAM1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM2 <em>IAM2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM3 <em>IAM3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM4 <em>IAM4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM5 <em>IAM5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM6 <em>IAM6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM7 <em>IAM7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM8 <em>IAM8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM9 <em>IAM9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM10 <em>IAM10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM11 <em>IAM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM12 <em>IAM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM13 <em>IAM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM14 <em>IAM14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM15 <em>IAM15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM16 <em>IAM16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM17 <em>IAM17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM18 <em>IAM18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM19 <em>IAM19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getIAM20 <em>IAM20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IAMCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IAMCONTENTImpl extends EObjectImpl implements IAMCONTENT {
	/**
	 * The cached value of the '{@link #getIAM1() <em>IAM1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM1()
	 * @generated
	 * @ordered
	 */
	protected IAM1CONTENT iAM1;

	/**
	 * The cached value of the '{@link #getIAM2() <em>IAM2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM2()
	 * @generated
	 * @ordered
	 */
	protected IAM2CONTENT iAM2;

	/**
	 * The cached value of the '{@link #getIAM3() <em>IAM3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM3()
	 * @generated
	 * @ordered
	 */
	protected IAM3CONTENT iAM3;

	/**
	 * The cached value of the '{@link #getIAM4() <em>IAM4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM4()
	 * @generated
	 * @ordered
	 */
	protected IAM4CONTENT iAM4;

	/**
	 * The cached value of the '{@link #getIAM5() <em>IAM5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM5()
	 * @generated
	 * @ordered
	 */
	protected EList<IAM5CONTENT> iAM5;

	/**
	 * The cached value of the '{@link #getIAM6() <em>IAM6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM6()
	 * @generated
	 * @ordered
	 */
	protected IAM6CONTENT iAM6;

	/**
	 * The cached value of the '{@link #getIAM7() <em>IAM7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM7()
	 * @generated
	 * @ordered
	 */
	protected IAM7CONTENT iAM7;

	/**
	 * The cached value of the '{@link #getIAM8() <em>IAM8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM8()
	 * @generated
	 * @ordered
	 */
	protected IAM8CONTENT iAM8;

	/**
	 * The cached value of the '{@link #getIAM9() <em>IAM9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM9()
	 * @generated
	 * @ordered
	 */
	protected IAM9CONTENT iAM9;

	/**
	 * The cached value of the '{@link #getIAM10() <em>IAM10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM10()
	 * @generated
	 * @ordered
	 */
	protected IAM10CONTENT iAM10;

	/**
	 * The cached value of the '{@link #getIAM11() <em>IAM11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM11()
	 * @generated
	 * @ordered
	 */
	protected IAM11CONTENT iAM11;

	/**
	 * The cached value of the '{@link #getIAM12() <em>IAM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM12()
	 * @generated
	 * @ordered
	 */
	protected IAM12CONTENT iAM12;

	/**
	 * The cached value of the '{@link #getIAM13() <em>IAM13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM13()
	 * @generated
	 * @ordered
	 */
	protected IAM13CONTENT iAM13;

	/**
	 * The cached value of the '{@link #getIAM14() <em>IAM14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM14()
	 * @generated
	 * @ordered
	 */
	protected IAM14CONTENT iAM14;

	/**
	 * The cached value of the '{@link #getIAM15() <em>IAM15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM15()
	 * @generated
	 * @ordered
	 */
	protected IAM15CONTENT iAM15;

	/**
	 * The cached value of the '{@link #getIAM16() <em>IAM16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM16()
	 * @generated
	 * @ordered
	 */
	protected IAM16CONTENT iAM16;

	/**
	 * The cached value of the '{@link #getIAM17() <em>IAM17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM17()
	 * @generated
	 * @ordered
	 */
	protected IAM17CONTENT iAM17;

	/**
	 * The cached value of the '{@link #getIAM18() <em>IAM18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM18()
	 * @generated
	 * @ordered
	 */
	protected IAM18CONTENT iAM18;

	/**
	 * The cached value of the '{@link #getIAM19() <em>IAM19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM19()
	 * @generated
	 * @ordered
	 */
	protected IAM19CONTENT iAM19;

	/**
	 * The cached value of the '{@link #getIAM20() <em>IAM20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAM20()
	 * @generated
	 * @ordered
	 */
	protected IAM20CONTENT iAM20;

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
	protected IAMCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIAMCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM1CONTENT getIAM1() {
		return iAM1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM1(IAM1CONTENT newIAM1, NotificationChain msgs) {
		IAM1CONTENT oldIAM1 = iAM1;
		iAM1 = newIAM1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM1, oldIAM1, newIAM1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM1(IAM1CONTENT newIAM1) {
		if (newIAM1 != iAM1) {
			NotificationChain msgs = null;
			if (iAM1 != null)
				msgs = ((InternalEObject)iAM1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM1, null, msgs);
			if (newIAM1 != null)
				msgs = ((InternalEObject)newIAM1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM1, null, msgs);
			msgs = basicSetIAM1(newIAM1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM1, newIAM1, newIAM1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM2CONTENT getIAM2() {
		return iAM2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM2(IAM2CONTENT newIAM2, NotificationChain msgs) {
		IAM2CONTENT oldIAM2 = iAM2;
		iAM2 = newIAM2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM2, oldIAM2, newIAM2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM2(IAM2CONTENT newIAM2) {
		if (newIAM2 != iAM2) {
			NotificationChain msgs = null;
			if (iAM2 != null)
				msgs = ((InternalEObject)iAM2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM2, null, msgs);
			if (newIAM2 != null)
				msgs = ((InternalEObject)newIAM2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM2, null, msgs);
			msgs = basicSetIAM2(newIAM2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM2, newIAM2, newIAM2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM3CONTENT getIAM3() {
		return iAM3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM3(IAM3CONTENT newIAM3, NotificationChain msgs) {
		IAM3CONTENT oldIAM3 = iAM3;
		iAM3 = newIAM3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM3, oldIAM3, newIAM3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM3(IAM3CONTENT newIAM3) {
		if (newIAM3 != iAM3) {
			NotificationChain msgs = null;
			if (iAM3 != null)
				msgs = ((InternalEObject)iAM3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM3, null, msgs);
			if (newIAM3 != null)
				msgs = ((InternalEObject)newIAM3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM3, null, msgs);
			msgs = basicSetIAM3(newIAM3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM3, newIAM3, newIAM3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM4CONTENT getIAM4() {
		return iAM4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM4(IAM4CONTENT newIAM4, NotificationChain msgs) {
		IAM4CONTENT oldIAM4 = iAM4;
		iAM4 = newIAM4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM4, oldIAM4, newIAM4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM4(IAM4CONTENT newIAM4) {
		if (newIAM4 != iAM4) {
			NotificationChain msgs = null;
			if (iAM4 != null)
				msgs = ((InternalEObject)iAM4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM4, null, msgs);
			if (newIAM4 != null)
				msgs = ((InternalEObject)newIAM4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM4, null, msgs);
			msgs = basicSetIAM4(newIAM4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM4, newIAM4, newIAM4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAM5CONTENT> getIAM5() {
		if (iAM5 == null) {
			iAM5 = new EObjectContainmentEList<IAM5CONTENT>(IAM5CONTENT.class, this, V2xmlPackage.IAMCONTENT__IAM5);
		}
		return iAM5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM6CONTENT getIAM6() {
		return iAM6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM6(IAM6CONTENT newIAM6, NotificationChain msgs) {
		IAM6CONTENT oldIAM6 = iAM6;
		iAM6 = newIAM6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM6, oldIAM6, newIAM6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM6(IAM6CONTENT newIAM6) {
		if (newIAM6 != iAM6) {
			NotificationChain msgs = null;
			if (iAM6 != null)
				msgs = ((InternalEObject)iAM6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM6, null, msgs);
			if (newIAM6 != null)
				msgs = ((InternalEObject)newIAM6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM6, null, msgs);
			msgs = basicSetIAM6(newIAM6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM6, newIAM6, newIAM6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM7CONTENT getIAM7() {
		return iAM7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM7(IAM7CONTENT newIAM7, NotificationChain msgs) {
		IAM7CONTENT oldIAM7 = iAM7;
		iAM7 = newIAM7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM7, oldIAM7, newIAM7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM7(IAM7CONTENT newIAM7) {
		if (newIAM7 != iAM7) {
			NotificationChain msgs = null;
			if (iAM7 != null)
				msgs = ((InternalEObject)iAM7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM7, null, msgs);
			if (newIAM7 != null)
				msgs = ((InternalEObject)newIAM7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM7, null, msgs);
			msgs = basicSetIAM7(newIAM7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM7, newIAM7, newIAM7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM8CONTENT getIAM8() {
		return iAM8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM8(IAM8CONTENT newIAM8, NotificationChain msgs) {
		IAM8CONTENT oldIAM8 = iAM8;
		iAM8 = newIAM8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM8, oldIAM8, newIAM8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM8(IAM8CONTENT newIAM8) {
		if (newIAM8 != iAM8) {
			NotificationChain msgs = null;
			if (iAM8 != null)
				msgs = ((InternalEObject)iAM8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM8, null, msgs);
			if (newIAM8 != null)
				msgs = ((InternalEObject)newIAM8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM8, null, msgs);
			msgs = basicSetIAM8(newIAM8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM8, newIAM8, newIAM8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM9CONTENT getIAM9() {
		return iAM9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM9(IAM9CONTENT newIAM9, NotificationChain msgs) {
		IAM9CONTENT oldIAM9 = iAM9;
		iAM9 = newIAM9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM9, oldIAM9, newIAM9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM9(IAM9CONTENT newIAM9) {
		if (newIAM9 != iAM9) {
			NotificationChain msgs = null;
			if (iAM9 != null)
				msgs = ((InternalEObject)iAM9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM9, null, msgs);
			if (newIAM9 != null)
				msgs = ((InternalEObject)newIAM9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM9, null, msgs);
			msgs = basicSetIAM9(newIAM9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM9, newIAM9, newIAM9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM10CONTENT getIAM10() {
		return iAM10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM10(IAM10CONTENT newIAM10, NotificationChain msgs) {
		IAM10CONTENT oldIAM10 = iAM10;
		iAM10 = newIAM10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM10, oldIAM10, newIAM10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM10(IAM10CONTENT newIAM10) {
		if (newIAM10 != iAM10) {
			NotificationChain msgs = null;
			if (iAM10 != null)
				msgs = ((InternalEObject)iAM10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM10, null, msgs);
			if (newIAM10 != null)
				msgs = ((InternalEObject)newIAM10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM10, null, msgs);
			msgs = basicSetIAM10(newIAM10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM10, newIAM10, newIAM10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM11CONTENT getIAM11() {
		return iAM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM11(IAM11CONTENT newIAM11, NotificationChain msgs) {
		IAM11CONTENT oldIAM11 = iAM11;
		iAM11 = newIAM11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM11, oldIAM11, newIAM11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM11(IAM11CONTENT newIAM11) {
		if (newIAM11 != iAM11) {
			NotificationChain msgs = null;
			if (iAM11 != null)
				msgs = ((InternalEObject)iAM11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM11, null, msgs);
			if (newIAM11 != null)
				msgs = ((InternalEObject)newIAM11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM11, null, msgs);
			msgs = basicSetIAM11(newIAM11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM11, newIAM11, newIAM11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM12CONTENT getIAM12() {
		return iAM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM12(IAM12CONTENT newIAM12, NotificationChain msgs) {
		IAM12CONTENT oldIAM12 = iAM12;
		iAM12 = newIAM12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM12, oldIAM12, newIAM12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM12(IAM12CONTENT newIAM12) {
		if (newIAM12 != iAM12) {
			NotificationChain msgs = null;
			if (iAM12 != null)
				msgs = ((InternalEObject)iAM12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM12, null, msgs);
			if (newIAM12 != null)
				msgs = ((InternalEObject)newIAM12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM12, null, msgs);
			msgs = basicSetIAM12(newIAM12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM12, newIAM12, newIAM12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM13CONTENT getIAM13() {
		return iAM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM13(IAM13CONTENT newIAM13, NotificationChain msgs) {
		IAM13CONTENT oldIAM13 = iAM13;
		iAM13 = newIAM13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM13, oldIAM13, newIAM13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM13(IAM13CONTENT newIAM13) {
		if (newIAM13 != iAM13) {
			NotificationChain msgs = null;
			if (iAM13 != null)
				msgs = ((InternalEObject)iAM13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM13, null, msgs);
			if (newIAM13 != null)
				msgs = ((InternalEObject)newIAM13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM13, null, msgs);
			msgs = basicSetIAM13(newIAM13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM13, newIAM13, newIAM13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM14CONTENT getIAM14() {
		return iAM14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM14(IAM14CONTENT newIAM14, NotificationChain msgs) {
		IAM14CONTENT oldIAM14 = iAM14;
		iAM14 = newIAM14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM14, oldIAM14, newIAM14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM14(IAM14CONTENT newIAM14) {
		if (newIAM14 != iAM14) {
			NotificationChain msgs = null;
			if (iAM14 != null)
				msgs = ((InternalEObject)iAM14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM14, null, msgs);
			if (newIAM14 != null)
				msgs = ((InternalEObject)newIAM14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM14, null, msgs);
			msgs = basicSetIAM14(newIAM14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM14, newIAM14, newIAM14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM15CONTENT getIAM15() {
		return iAM15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM15(IAM15CONTENT newIAM15, NotificationChain msgs) {
		IAM15CONTENT oldIAM15 = iAM15;
		iAM15 = newIAM15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM15, oldIAM15, newIAM15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM15(IAM15CONTENT newIAM15) {
		if (newIAM15 != iAM15) {
			NotificationChain msgs = null;
			if (iAM15 != null)
				msgs = ((InternalEObject)iAM15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM15, null, msgs);
			if (newIAM15 != null)
				msgs = ((InternalEObject)newIAM15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM15, null, msgs);
			msgs = basicSetIAM15(newIAM15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM15, newIAM15, newIAM15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM16CONTENT getIAM16() {
		return iAM16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM16(IAM16CONTENT newIAM16, NotificationChain msgs) {
		IAM16CONTENT oldIAM16 = iAM16;
		iAM16 = newIAM16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM16, oldIAM16, newIAM16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM16(IAM16CONTENT newIAM16) {
		if (newIAM16 != iAM16) {
			NotificationChain msgs = null;
			if (iAM16 != null)
				msgs = ((InternalEObject)iAM16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM16, null, msgs);
			if (newIAM16 != null)
				msgs = ((InternalEObject)newIAM16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM16, null, msgs);
			msgs = basicSetIAM16(newIAM16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM16, newIAM16, newIAM16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM17CONTENT getIAM17() {
		return iAM17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM17(IAM17CONTENT newIAM17, NotificationChain msgs) {
		IAM17CONTENT oldIAM17 = iAM17;
		iAM17 = newIAM17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM17, oldIAM17, newIAM17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM17(IAM17CONTENT newIAM17) {
		if (newIAM17 != iAM17) {
			NotificationChain msgs = null;
			if (iAM17 != null)
				msgs = ((InternalEObject)iAM17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM17, null, msgs);
			if (newIAM17 != null)
				msgs = ((InternalEObject)newIAM17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM17, null, msgs);
			msgs = basicSetIAM17(newIAM17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM17, newIAM17, newIAM17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM18CONTENT getIAM18() {
		return iAM18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM18(IAM18CONTENT newIAM18, NotificationChain msgs) {
		IAM18CONTENT oldIAM18 = iAM18;
		iAM18 = newIAM18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM18, oldIAM18, newIAM18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM18(IAM18CONTENT newIAM18) {
		if (newIAM18 != iAM18) {
			NotificationChain msgs = null;
			if (iAM18 != null)
				msgs = ((InternalEObject)iAM18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM18, null, msgs);
			if (newIAM18 != null)
				msgs = ((InternalEObject)newIAM18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM18, null, msgs);
			msgs = basicSetIAM18(newIAM18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM18, newIAM18, newIAM18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM19CONTENT getIAM19() {
		return iAM19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM19(IAM19CONTENT newIAM19, NotificationChain msgs) {
		IAM19CONTENT oldIAM19 = iAM19;
		iAM19 = newIAM19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM19, oldIAM19, newIAM19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM19(IAM19CONTENT newIAM19) {
		if (newIAM19 != iAM19) {
			NotificationChain msgs = null;
			if (iAM19 != null)
				msgs = ((InternalEObject)iAM19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM19, null, msgs);
			if (newIAM19 != null)
				msgs = ((InternalEObject)newIAM19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM19, null, msgs);
			msgs = basicSetIAM19(newIAM19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM19, newIAM19, newIAM19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAM20CONTENT getIAM20() {
		return iAM20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIAM20(IAM20CONTENT newIAM20, NotificationChain msgs) {
		IAM20CONTENT oldIAM20 = iAM20;
		iAM20 = newIAM20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM20, oldIAM20, newIAM20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAM20(IAM20CONTENT newIAM20) {
		if (newIAM20 != iAM20) {
			NotificationChain msgs = null;
			if (iAM20 != null)
				msgs = ((InternalEObject)iAM20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM20, null, msgs);
			if (newIAM20 != null)
				msgs = ((InternalEObject)newIAM20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IAMCONTENT__IAM20, null, msgs);
			msgs = basicSetIAM20(newIAM20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IAMCONTENT__IAM20, newIAM20, newIAM20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IAMCONTENT__ANY);
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
			case V2xmlPackage.IAMCONTENT__IAM1:
				return basicSetIAM1(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM2:
				return basicSetIAM2(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM3:
				return basicSetIAM3(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM4:
				return basicSetIAM4(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM5:
				return ((InternalEList<?>)getIAM5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IAMCONTENT__IAM6:
				return basicSetIAM6(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM7:
				return basicSetIAM7(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM8:
				return basicSetIAM8(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM9:
				return basicSetIAM9(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM10:
				return basicSetIAM10(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM11:
				return basicSetIAM11(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM12:
				return basicSetIAM12(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM13:
				return basicSetIAM13(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM14:
				return basicSetIAM14(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM15:
				return basicSetIAM15(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM16:
				return basicSetIAM16(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM17:
				return basicSetIAM17(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM18:
				return basicSetIAM18(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM19:
				return basicSetIAM19(null, msgs);
			case V2xmlPackage.IAMCONTENT__IAM20:
				return basicSetIAM20(null, msgs);
			case V2xmlPackage.IAMCONTENT__ANY:
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
			case V2xmlPackage.IAMCONTENT__IAM1:
				return getIAM1();
			case V2xmlPackage.IAMCONTENT__IAM2:
				return getIAM2();
			case V2xmlPackage.IAMCONTENT__IAM3:
				return getIAM3();
			case V2xmlPackage.IAMCONTENT__IAM4:
				return getIAM4();
			case V2xmlPackage.IAMCONTENT__IAM5:
				return getIAM5();
			case V2xmlPackage.IAMCONTENT__IAM6:
				return getIAM6();
			case V2xmlPackage.IAMCONTENT__IAM7:
				return getIAM7();
			case V2xmlPackage.IAMCONTENT__IAM8:
				return getIAM8();
			case V2xmlPackage.IAMCONTENT__IAM9:
				return getIAM9();
			case V2xmlPackage.IAMCONTENT__IAM10:
				return getIAM10();
			case V2xmlPackage.IAMCONTENT__IAM11:
				return getIAM11();
			case V2xmlPackage.IAMCONTENT__IAM12:
				return getIAM12();
			case V2xmlPackage.IAMCONTENT__IAM13:
				return getIAM13();
			case V2xmlPackage.IAMCONTENT__IAM14:
				return getIAM14();
			case V2xmlPackage.IAMCONTENT__IAM15:
				return getIAM15();
			case V2xmlPackage.IAMCONTENT__IAM16:
				return getIAM16();
			case V2xmlPackage.IAMCONTENT__IAM17:
				return getIAM17();
			case V2xmlPackage.IAMCONTENT__IAM18:
				return getIAM18();
			case V2xmlPackage.IAMCONTENT__IAM19:
				return getIAM19();
			case V2xmlPackage.IAMCONTENT__IAM20:
				return getIAM20();
			case V2xmlPackage.IAMCONTENT__ANY:
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
			case V2xmlPackage.IAMCONTENT__IAM1:
				setIAM1((IAM1CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM2:
				setIAM2((IAM2CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM3:
				setIAM3((IAM3CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM4:
				setIAM4((IAM4CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM5:
				getIAM5().clear();
				getIAM5().addAll((Collection<? extends IAM5CONTENT>)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM6:
				setIAM6((IAM6CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM7:
				setIAM7((IAM7CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM8:
				setIAM8((IAM8CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM9:
				setIAM9((IAM9CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM10:
				setIAM10((IAM10CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM11:
				setIAM11((IAM11CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM12:
				setIAM12((IAM12CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM13:
				setIAM13((IAM13CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM14:
				setIAM14((IAM14CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM15:
				setIAM15((IAM15CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM16:
				setIAM16((IAM16CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM17:
				setIAM17((IAM17CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM18:
				setIAM18((IAM18CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM19:
				setIAM19((IAM19CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__IAM20:
				setIAM20((IAM20CONTENT)newValue);
				return;
			case V2xmlPackage.IAMCONTENT__ANY:
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
			case V2xmlPackage.IAMCONTENT__IAM1:
				setIAM1((IAM1CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM2:
				setIAM2((IAM2CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM3:
				setIAM3((IAM3CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM4:
				setIAM4((IAM4CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM5:
				getIAM5().clear();
				return;
			case V2xmlPackage.IAMCONTENT__IAM6:
				setIAM6((IAM6CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM7:
				setIAM7((IAM7CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM8:
				setIAM8((IAM8CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM9:
				setIAM9((IAM9CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM10:
				setIAM10((IAM10CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM11:
				setIAM11((IAM11CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM12:
				setIAM12((IAM12CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM13:
				setIAM13((IAM13CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM14:
				setIAM14((IAM14CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM15:
				setIAM15((IAM15CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM16:
				setIAM16((IAM16CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM17:
				setIAM17((IAM17CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM18:
				setIAM18((IAM18CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM19:
				setIAM19((IAM19CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__IAM20:
				setIAM20((IAM20CONTENT)null);
				return;
			case V2xmlPackage.IAMCONTENT__ANY:
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
			case V2xmlPackage.IAMCONTENT__IAM1:
				return iAM1 != null;
			case V2xmlPackage.IAMCONTENT__IAM2:
				return iAM2 != null;
			case V2xmlPackage.IAMCONTENT__IAM3:
				return iAM3 != null;
			case V2xmlPackage.IAMCONTENT__IAM4:
				return iAM4 != null;
			case V2xmlPackage.IAMCONTENT__IAM5:
				return iAM5 != null && !iAM5.isEmpty();
			case V2xmlPackage.IAMCONTENT__IAM6:
				return iAM6 != null;
			case V2xmlPackage.IAMCONTENT__IAM7:
				return iAM7 != null;
			case V2xmlPackage.IAMCONTENT__IAM8:
				return iAM8 != null;
			case V2xmlPackage.IAMCONTENT__IAM9:
				return iAM9 != null;
			case V2xmlPackage.IAMCONTENT__IAM10:
				return iAM10 != null;
			case V2xmlPackage.IAMCONTENT__IAM11:
				return iAM11 != null;
			case V2xmlPackage.IAMCONTENT__IAM12:
				return iAM12 != null;
			case V2xmlPackage.IAMCONTENT__IAM13:
				return iAM13 != null;
			case V2xmlPackage.IAMCONTENT__IAM14:
				return iAM14 != null;
			case V2xmlPackage.IAMCONTENT__IAM15:
				return iAM15 != null;
			case V2xmlPackage.IAMCONTENT__IAM16:
				return iAM16 != null;
			case V2xmlPackage.IAMCONTENT__IAM17:
				return iAM17 != null;
			case V2xmlPackage.IAMCONTENT__IAM18:
				return iAM18 != null;
			case V2xmlPackage.IAMCONTENT__IAM19:
				return iAM19 != null;
			case V2xmlPackage.IAMCONTENT__IAM20:
				return iAM20 != null;
			case V2xmlPackage.IAMCONTENT__ANY:
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

} //IAMCONTENTImpl
