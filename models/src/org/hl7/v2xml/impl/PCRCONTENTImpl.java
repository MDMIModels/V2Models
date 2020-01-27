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

import org.hl7.v2xml.PCR10CONTENT;
import org.hl7.v2xml.PCR11CONTENT;
import org.hl7.v2xml.PCR12CONTENT;
import org.hl7.v2xml.PCR13CONTENT;
import org.hl7.v2xml.PCR14CONTENT;
import org.hl7.v2xml.PCR15CONTENT;
import org.hl7.v2xml.PCR16CONTENT;
import org.hl7.v2xml.PCR17CONTENT;
import org.hl7.v2xml.PCR18CONTENT;
import org.hl7.v2xml.PCR19CONTENT;
import org.hl7.v2xml.PCR1CONTENT;
import org.hl7.v2xml.PCR20CONTENT;
import org.hl7.v2xml.PCR21CONTENT;
import org.hl7.v2xml.PCR22CONTENT;
import org.hl7.v2xml.PCR23CONTENT;
import org.hl7.v2xml.PCR2CONTENT;
import org.hl7.v2xml.PCR3CONTENT;
import org.hl7.v2xml.PCR4CONTENT;
import org.hl7.v2xml.PCR5CONTENT;
import org.hl7.v2xml.PCR6CONTENT;
import org.hl7.v2xml.PCR7CONTENT;
import org.hl7.v2xml.PCR8CONTENT;
import org.hl7.v2xml.PCR9CONTENT;
import org.hl7.v2xml.PCRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PCRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR1 <em>PCR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR2 <em>PCR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR3 <em>PCR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR4 <em>PCR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR5 <em>PCR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR6 <em>PCR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR7 <em>PCR7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR8 <em>PCR8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR9 <em>PCR9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR10 <em>PCR10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR11 <em>PCR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR12 <em>PCR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR13 <em>PCR13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR14 <em>PCR14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR15 <em>PCR15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR16 <em>PCR16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR17 <em>PCR17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR18 <em>PCR18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR19 <em>PCR19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR20 <em>PCR20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR21 <em>PCR21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR22 <em>PCR22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getPCR23 <em>PCR23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PCRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PCRCONTENTImpl extends EObjectImpl implements PCRCONTENT {
	/**
	 * The cached value of the '{@link #getPCR1() <em>PCR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR1()
	 * @generated
	 * @ordered
	 */
	protected PCR1CONTENT pCR1;

	/**
	 * The cached value of the '{@link #getPCR2() <em>PCR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR2()
	 * @generated
	 * @ordered
	 */
	protected PCR2CONTENT pCR2;

	/**
	 * The cached value of the '{@link #getPCR3() <em>PCR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR3()
	 * @generated
	 * @ordered
	 */
	protected PCR3CONTENT pCR3;

	/**
	 * The cached value of the '{@link #getPCR4() <em>PCR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR4()
	 * @generated
	 * @ordered
	 */
	protected PCR4CONTENT pCR4;

	/**
	 * The cached value of the '{@link #getPCR5() <em>PCR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR5()
	 * @generated
	 * @ordered
	 */
	protected PCR5CONTENT pCR5;

	/**
	 * The cached value of the '{@link #getPCR6() <em>PCR6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR6()
	 * @generated
	 * @ordered
	 */
	protected PCR6CONTENT pCR6;

	/**
	 * The cached value of the '{@link #getPCR7() <em>PCR7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR7()
	 * @generated
	 * @ordered
	 */
	protected PCR7CONTENT pCR7;

	/**
	 * The cached value of the '{@link #getPCR8() <em>PCR8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR8()
	 * @generated
	 * @ordered
	 */
	protected PCR8CONTENT pCR8;

	/**
	 * The cached value of the '{@link #getPCR9() <em>PCR9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR9()
	 * @generated
	 * @ordered
	 */
	protected PCR9CONTENT pCR9;

	/**
	 * The cached value of the '{@link #getPCR10() <em>PCR10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR10()
	 * @generated
	 * @ordered
	 */
	protected PCR10CONTENT pCR10;

	/**
	 * The cached value of the '{@link #getPCR11() <em>PCR11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR11()
	 * @generated
	 * @ordered
	 */
	protected PCR11CONTENT pCR11;

	/**
	 * The cached value of the '{@link #getPCR12() <em>PCR12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR12()
	 * @generated
	 * @ordered
	 */
	protected EList<PCR12CONTENT> pCR12;

	/**
	 * The cached value of the '{@link #getPCR13() <em>PCR13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR13()
	 * @generated
	 * @ordered
	 */
	protected PCR13CONTENT pCR13;

	/**
	 * The cached value of the '{@link #getPCR14() <em>PCR14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR14()
	 * @generated
	 * @ordered
	 */
	protected PCR14CONTENT pCR14;

	/**
	 * The cached value of the '{@link #getPCR15() <em>PCR15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR15()
	 * @generated
	 * @ordered
	 */
	protected PCR15CONTENT pCR15;

	/**
	 * The cached value of the '{@link #getPCR16() <em>PCR16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR16()
	 * @generated
	 * @ordered
	 */
	protected PCR16CONTENT pCR16;

	/**
	 * The cached value of the '{@link #getPCR17() <em>PCR17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR17()
	 * @generated
	 * @ordered
	 */
	protected PCR17CONTENT pCR17;

	/**
	 * The cached value of the '{@link #getPCR18() <em>PCR18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR18()
	 * @generated
	 * @ordered
	 */
	protected PCR18CONTENT pCR18;

	/**
	 * The cached value of the '{@link #getPCR19() <em>PCR19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR19()
	 * @generated
	 * @ordered
	 */
	protected PCR19CONTENT pCR19;

	/**
	 * The cached value of the '{@link #getPCR20() <em>PCR20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR20()
	 * @generated
	 * @ordered
	 */
	protected PCR20CONTENT pCR20;

	/**
	 * The cached value of the '{@link #getPCR21() <em>PCR21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR21()
	 * @generated
	 * @ordered
	 */
	protected EList<PCR21CONTENT> pCR21;

	/**
	 * The cached value of the '{@link #getPCR22() <em>PCR22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR22()
	 * @generated
	 * @ordered
	 */
	protected EList<PCR22CONTENT> pCR22;

	/**
	 * The cached value of the '{@link #getPCR23() <em>PCR23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPCR23()
	 * @generated
	 * @ordered
	 */
	protected EList<PCR23CONTENT> pCR23;

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
	protected PCRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPCRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR1CONTENT getPCR1() {
		return pCR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR1(PCR1CONTENT newPCR1, NotificationChain msgs) {
		PCR1CONTENT oldPCR1 = pCR1;
		pCR1 = newPCR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR1, oldPCR1, newPCR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR1(PCR1CONTENT newPCR1) {
		if (newPCR1 != pCR1) {
			NotificationChain msgs = null;
			if (pCR1 != null)
				msgs = ((InternalEObject)pCR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR1, null, msgs);
			if (newPCR1 != null)
				msgs = ((InternalEObject)newPCR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR1, null, msgs);
			msgs = basicSetPCR1(newPCR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR1, newPCR1, newPCR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR2CONTENT getPCR2() {
		return pCR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR2(PCR2CONTENT newPCR2, NotificationChain msgs) {
		PCR2CONTENT oldPCR2 = pCR2;
		pCR2 = newPCR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR2, oldPCR2, newPCR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR2(PCR2CONTENT newPCR2) {
		if (newPCR2 != pCR2) {
			NotificationChain msgs = null;
			if (pCR2 != null)
				msgs = ((InternalEObject)pCR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR2, null, msgs);
			if (newPCR2 != null)
				msgs = ((InternalEObject)newPCR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR2, null, msgs);
			msgs = basicSetPCR2(newPCR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR2, newPCR2, newPCR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR3CONTENT getPCR3() {
		return pCR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR3(PCR3CONTENT newPCR3, NotificationChain msgs) {
		PCR3CONTENT oldPCR3 = pCR3;
		pCR3 = newPCR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR3, oldPCR3, newPCR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR3(PCR3CONTENT newPCR3) {
		if (newPCR3 != pCR3) {
			NotificationChain msgs = null;
			if (pCR3 != null)
				msgs = ((InternalEObject)pCR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR3, null, msgs);
			if (newPCR3 != null)
				msgs = ((InternalEObject)newPCR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR3, null, msgs);
			msgs = basicSetPCR3(newPCR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR3, newPCR3, newPCR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR4CONTENT getPCR4() {
		return pCR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR4(PCR4CONTENT newPCR4, NotificationChain msgs) {
		PCR4CONTENT oldPCR4 = pCR4;
		pCR4 = newPCR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR4, oldPCR4, newPCR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR4(PCR4CONTENT newPCR4) {
		if (newPCR4 != pCR4) {
			NotificationChain msgs = null;
			if (pCR4 != null)
				msgs = ((InternalEObject)pCR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR4, null, msgs);
			if (newPCR4 != null)
				msgs = ((InternalEObject)newPCR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR4, null, msgs);
			msgs = basicSetPCR4(newPCR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR4, newPCR4, newPCR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR5CONTENT getPCR5() {
		return pCR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR5(PCR5CONTENT newPCR5, NotificationChain msgs) {
		PCR5CONTENT oldPCR5 = pCR5;
		pCR5 = newPCR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR5, oldPCR5, newPCR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR5(PCR5CONTENT newPCR5) {
		if (newPCR5 != pCR5) {
			NotificationChain msgs = null;
			if (pCR5 != null)
				msgs = ((InternalEObject)pCR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR5, null, msgs);
			if (newPCR5 != null)
				msgs = ((InternalEObject)newPCR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR5, null, msgs);
			msgs = basicSetPCR5(newPCR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR5, newPCR5, newPCR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR6CONTENT getPCR6() {
		return pCR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR6(PCR6CONTENT newPCR6, NotificationChain msgs) {
		PCR6CONTENT oldPCR6 = pCR6;
		pCR6 = newPCR6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR6, oldPCR6, newPCR6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR6(PCR6CONTENT newPCR6) {
		if (newPCR6 != pCR6) {
			NotificationChain msgs = null;
			if (pCR6 != null)
				msgs = ((InternalEObject)pCR6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR6, null, msgs);
			if (newPCR6 != null)
				msgs = ((InternalEObject)newPCR6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR6, null, msgs);
			msgs = basicSetPCR6(newPCR6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR6, newPCR6, newPCR6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR7CONTENT getPCR7() {
		return pCR7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR7(PCR7CONTENT newPCR7, NotificationChain msgs) {
		PCR7CONTENT oldPCR7 = pCR7;
		pCR7 = newPCR7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR7, oldPCR7, newPCR7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR7(PCR7CONTENT newPCR7) {
		if (newPCR7 != pCR7) {
			NotificationChain msgs = null;
			if (pCR7 != null)
				msgs = ((InternalEObject)pCR7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR7, null, msgs);
			if (newPCR7 != null)
				msgs = ((InternalEObject)newPCR7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR7, null, msgs);
			msgs = basicSetPCR7(newPCR7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR7, newPCR7, newPCR7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR8CONTENT getPCR8() {
		return pCR8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR8(PCR8CONTENT newPCR8, NotificationChain msgs) {
		PCR8CONTENT oldPCR8 = pCR8;
		pCR8 = newPCR8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR8, oldPCR8, newPCR8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR8(PCR8CONTENT newPCR8) {
		if (newPCR8 != pCR8) {
			NotificationChain msgs = null;
			if (pCR8 != null)
				msgs = ((InternalEObject)pCR8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR8, null, msgs);
			if (newPCR8 != null)
				msgs = ((InternalEObject)newPCR8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR8, null, msgs);
			msgs = basicSetPCR8(newPCR8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR8, newPCR8, newPCR8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR9CONTENT getPCR9() {
		return pCR9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR9(PCR9CONTENT newPCR9, NotificationChain msgs) {
		PCR9CONTENT oldPCR9 = pCR9;
		pCR9 = newPCR9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR9, oldPCR9, newPCR9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR9(PCR9CONTENT newPCR9) {
		if (newPCR9 != pCR9) {
			NotificationChain msgs = null;
			if (pCR9 != null)
				msgs = ((InternalEObject)pCR9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR9, null, msgs);
			if (newPCR9 != null)
				msgs = ((InternalEObject)newPCR9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR9, null, msgs);
			msgs = basicSetPCR9(newPCR9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR9, newPCR9, newPCR9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR10CONTENT getPCR10() {
		return pCR10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR10(PCR10CONTENT newPCR10, NotificationChain msgs) {
		PCR10CONTENT oldPCR10 = pCR10;
		pCR10 = newPCR10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR10, oldPCR10, newPCR10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR10(PCR10CONTENT newPCR10) {
		if (newPCR10 != pCR10) {
			NotificationChain msgs = null;
			if (pCR10 != null)
				msgs = ((InternalEObject)pCR10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR10, null, msgs);
			if (newPCR10 != null)
				msgs = ((InternalEObject)newPCR10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR10, null, msgs);
			msgs = basicSetPCR10(newPCR10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR10, newPCR10, newPCR10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR11CONTENT getPCR11() {
		return pCR11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR11(PCR11CONTENT newPCR11, NotificationChain msgs) {
		PCR11CONTENT oldPCR11 = pCR11;
		pCR11 = newPCR11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR11, oldPCR11, newPCR11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR11(PCR11CONTENT newPCR11) {
		if (newPCR11 != pCR11) {
			NotificationChain msgs = null;
			if (pCR11 != null)
				msgs = ((InternalEObject)pCR11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR11, null, msgs);
			if (newPCR11 != null)
				msgs = ((InternalEObject)newPCR11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR11, null, msgs);
			msgs = basicSetPCR11(newPCR11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR11, newPCR11, newPCR11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCR12CONTENT> getPCR12() {
		if (pCR12 == null) {
			pCR12 = new EObjectContainmentEList<PCR12CONTENT>(PCR12CONTENT.class, this, V2xmlPackage.PCRCONTENT__PCR12);
		}
		return pCR12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR13CONTENT getPCR13() {
		return pCR13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR13(PCR13CONTENT newPCR13, NotificationChain msgs) {
		PCR13CONTENT oldPCR13 = pCR13;
		pCR13 = newPCR13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR13, oldPCR13, newPCR13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR13(PCR13CONTENT newPCR13) {
		if (newPCR13 != pCR13) {
			NotificationChain msgs = null;
			if (pCR13 != null)
				msgs = ((InternalEObject)pCR13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR13, null, msgs);
			if (newPCR13 != null)
				msgs = ((InternalEObject)newPCR13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR13, null, msgs);
			msgs = basicSetPCR13(newPCR13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR13, newPCR13, newPCR13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR14CONTENT getPCR14() {
		return pCR14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR14(PCR14CONTENT newPCR14, NotificationChain msgs) {
		PCR14CONTENT oldPCR14 = pCR14;
		pCR14 = newPCR14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR14, oldPCR14, newPCR14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR14(PCR14CONTENT newPCR14) {
		if (newPCR14 != pCR14) {
			NotificationChain msgs = null;
			if (pCR14 != null)
				msgs = ((InternalEObject)pCR14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR14, null, msgs);
			if (newPCR14 != null)
				msgs = ((InternalEObject)newPCR14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR14, null, msgs);
			msgs = basicSetPCR14(newPCR14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR14, newPCR14, newPCR14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR15CONTENT getPCR15() {
		return pCR15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR15(PCR15CONTENT newPCR15, NotificationChain msgs) {
		PCR15CONTENT oldPCR15 = pCR15;
		pCR15 = newPCR15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR15, oldPCR15, newPCR15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR15(PCR15CONTENT newPCR15) {
		if (newPCR15 != pCR15) {
			NotificationChain msgs = null;
			if (pCR15 != null)
				msgs = ((InternalEObject)pCR15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR15, null, msgs);
			if (newPCR15 != null)
				msgs = ((InternalEObject)newPCR15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR15, null, msgs);
			msgs = basicSetPCR15(newPCR15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR15, newPCR15, newPCR15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR16CONTENT getPCR16() {
		return pCR16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR16(PCR16CONTENT newPCR16, NotificationChain msgs) {
		PCR16CONTENT oldPCR16 = pCR16;
		pCR16 = newPCR16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR16, oldPCR16, newPCR16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR16(PCR16CONTENT newPCR16) {
		if (newPCR16 != pCR16) {
			NotificationChain msgs = null;
			if (pCR16 != null)
				msgs = ((InternalEObject)pCR16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR16, null, msgs);
			if (newPCR16 != null)
				msgs = ((InternalEObject)newPCR16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR16, null, msgs);
			msgs = basicSetPCR16(newPCR16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR16, newPCR16, newPCR16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR17CONTENT getPCR17() {
		return pCR17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR17(PCR17CONTENT newPCR17, NotificationChain msgs) {
		PCR17CONTENT oldPCR17 = pCR17;
		pCR17 = newPCR17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR17, oldPCR17, newPCR17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR17(PCR17CONTENT newPCR17) {
		if (newPCR17 != pCR17) {
			NotificationChain msgs = null;
			if (pCR17 != null)
				msgs = ((InternalEObject)pCR17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR17, null, msgs);
			if (newPCR17 != null)
				msgs = ((InternalEObject)newPCR17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR17, null, msgs);
			msgs = basicSetPCR17(newPCR17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR17, newPCR17, newPCR17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR18CONTENT getPCR18() {
		return pCR18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR18(PCR18CONTENT newPCR18, NotificationChain msgs) {
		PCR18CONTENT oldPCR18 = pCR18;
		pCR18 = newPCR18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR18, oldPCR18, newPCR18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR18(PCR18CONTENT newPCR18) {
		if (newPCR18 != pCR18) {
			NotificationChain msgs = null;
			if (pCR18 != null)
				msgs = ((InternalEObject)pCR18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR18, null, msgs);
			if (newPCR18 != null)
				msgs = ((InternalEObject)newPCR18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR18, null, msgs);
			msgs = basicSetPCR18(newPCR18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR18, newPCR18, newPCR18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR19CONTENT getPCR19() {
		return pCR19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR19(PCR19CONTENT newPCR19, NotificationChain msgs) {
		PCR19CONTENT oldPCR19 = pCR19;
		pCR19 = newPCR19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR19, oldPCR19, newPCR19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR19(PCR19CONTENT newPCR19) {
		if (newPCR19 != pCR19) {
			NotificationChain msgs = null;
			if (pCR19 != null)
				msgs = ((InternalEObject)pCR19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR19, null, msgs);
			if (newPCR19 != null)
				msgs = ((InternalEObject)newPCR19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR19, null, msgs);
			msgs = basicSetPCR19(newPCR19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR19, newPCR19, newPCR19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PCR20CONTENT getPCR20() {
		return pCR20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPCR20(PCR20CONTENT newPCR20, NotificationChain msgs) {
		PCR20CONTENT oldPCR20 = pCR20;
		pCR20 = newPCR20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR20, oldPCR20, newPCR20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPCR20(PCR20CONTENT newPCR20) {
		if (newPCR20 != pCR20) {
			NotificationChain msgs = null;
			if (pCR20 != null)
				msgs = ((InternalEObject)pCR20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR20, null, msgs);
			if (newPCR20 != null)
				msgs = ((InternalEObject)newPCR20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PCRCONTENT__PCR20, null, msgs);
			msgs = basicSetPCR20(newPCR20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PCRCONTENT__PCR20, newPCR20, newPCR20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCR21CONTENT> getPCR21() {
		if (pCR21 == null) {
			pCR21 = new EObjectContainmentEList<PCR21CONTENT>(PCR21CONTENT.class, this, V2xmlPackage.PCRCONTENT__PCR21);
		}
		return pCR21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCR22CONTENT> getPCR22() {
		if (pCR22 == null) {
			pCR22 = new EObjectContainmentEList<PCR22CONTENT>(PCR22CONTENT.class, this, V2xmlPackage.PCRCONTENT__PCR22);
		}
		return pCR22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PCR23CONTENT> getPCR23() {
		if (pCR23 == null) {
			pCR23 = new EObjectContainmentEList<PCR23CONTENT>(PCR23CONTENT.class, this, V2xmlPackage.PCRCONTENT__PCR23);
		}
		return pCR23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PCRCONTENT__ANY);
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
			case V2xmlPackage.PCRCONTENT__PCR1:
				return basicSetPCR1(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR2:
				return basicSetPCR2(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR3:
				return basicSetPCR3(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR4:
				return basicSetPCR4(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR5:
				return basicSetPCR5(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR6:
				return basicSetPCR6(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR7:
				return basicSetPCR7(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR8:
				return basicSetPCR8(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR9:
				return basicSetPCR9(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR10:
				return basicSetPCR10(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR11:
				return basicSetPCR11(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR12:
				return ((InternalEList<?>)getPCR12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PCRCONTENT__PCR13:
				return basicSetPCR13(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR14:
				return basicSetPCR14(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR15:
				return basicSetPCR15(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR16:
				return basicSetPCR16(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR17:
				return basicSetPCR17(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR18:
				return basicSetPCR18(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR19:
				return basicSetPCR19(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR20:
				return basicSetPCR20(null, msgs);
			case V2xmlPackage.PCRCONTENT__PCR21:
				return ((InternalEList<?>)getPCR21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PCRCONTENT__PCR22:
				return ((InternalEList<?>)getPCR22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PCRCONTENT__PCR23:
				return ((InternalEList<?>)getPCR23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PCRCONTENT__ANY:
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
			case V2xmlPackage.PCRCONTENT__PCR1:
				return getPCR1();
			case V2xmlPackage.PCRCONTENT__PCR2:
				return getPCR2();
			case V2xmlPackage.PCRCONTENT__PCR3:
				return getPCR3();
			case V2xmlPackage.PCRCONTENT__PCR4:
				return getPCR4();
			case V2xmlPackage.PCRCONTENT__PCR5:
				return getPCR5();
			case V2xmlPackage.PCRCONTENT__PCR6:
				return getPCR6();
			case V2xmlPackage.PCRCONTENT__PCR7:
				return getPCR7();
			case V2xmlPackage.PCRCONTENT__PCR8:
				return getPCR8();
			case V2xmlPackage.PCRCONTENT__PCR9:
				return getPCR9();
			case V2xmlPackage.PCRCONTENT__PCR10:
				return getPCR10();
			case V2xmlPackage.PCRCONTENT__PCR11:
				return getPCR11();
			case V2xmlPackage.PCRCONTENT__PCR12:
				return getPCR12();
			case V2xmlPackage.PCRCONTENT__PCR13:
				return getPCR13();
			case V2xmlPackage.PCRCONTENT__PCR14:
				return getPCR14();
			case V2xmlPackage.PCRCONTENT__PCR15:
				return getPCR15();
			case V2xmlPackage.PCRCONTENT__PCR16:
				return getPCR16();
			case V2xmlPackage.PCRCONTENT__PCR17:
				return getPCR17();
			case V2xmlPackage.PCRCONTENT__PCR18:
				return getPCR18();
			case V2xmlPackage.PCRCONTENT__PCR19:
				return getPCR19();
			case V2xmlPackage.PCRCONTENT__PCR20:
				return getPCR20();
			case V2xmlPackage.PCRCONTENT__PCR21:
				return getPCR21();
			case V2xmlPackage.PCRCONTENT__PCR22:
				return getPCR22();
			case V2xmlPackage.PCRCONTENT__PCR23:
				return getPCR23();
			case V2xmlPackage.PCRCONTENT__ANY:
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
			case V2xmlPackage.PCRCONTENT__PCR1:
				setPCR1((PCR1CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR2:
				setPCR2((PCR2CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR3:
				setPCR3((PCR3CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR4:
				setPCR4((PCR4CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR5:
				setPCR5((PCR5CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR6:
				setPCR6((PCR6CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR7:
				setPCR7((PCR7CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR8:
				setPCR8((PCR8CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR9:
				setPCR9((PCR9CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR10:
				setPCR10((PCR10CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR11:
				setPCR11((PCR11CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR12:
				getPCR12().clear();
				getPCR12().addAll((Collection<? extends PCR12CONTENT>)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR13:
				setPCR13((PCR13CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR14:
				setPCR14((PCR14CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR15:
				setPCR15((PCR15CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR16:
				setPCR16((PCR16CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR17:
				setPCR17((PCR17CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR18:
				setPCR18((PCR18CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR19:
				setPCR19((PCR19CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR20:
				setPCR20((PCR20CONTENT)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR21:
				getPCR21().clear();
				getPCR21().addAll((Collection<? extends PCR21CONTENT>)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR22:
				getPCR22().clear();
				getPCR22().addAll((Collection<? extends PCR22CONTENT>)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__PCR23:
				getPCR23().clear();
				getPCR23().addAll((Collection<? extends PCR23CONTENT>)newValue);
				return;
			case V2xmlPackage.PCRCONTENT__ANY:
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
			case V2xmlPackage.PCRCONTENT__PCR1:
				setPCR1((PCR1CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR2:
				setPCR2((PCR2CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR3:
				setPCR3((PCR3CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR4:
				setPCR4((PCR4CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR5:
				setPCR5((PCR5CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR6:
				setPCR6((PCR6CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR7:
				setPCR7((PCR7CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR8:
				setPCR8((PCR8CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR9:
				setPCR9((PCR9CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR10:
				setPCR10((PCR10CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR11:
				setPCR11((PCR11CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR12:
				getPCR12().clear();
				return;
			case V2xmlPackage.PCRCONTENT__PCR13:
				setPCR13((PCR13CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR14:
				setPCR14((PCR14CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR15:
				setPCR15((PCR15CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR16:
				setPCR16((PCR16CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR17:
				setPCR17((PCR17CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR18:
				setPCR18((PCR18CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR19:
				setPCR19((PCR19CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR20:
				setPCR20((PCR20CONTENT)null);
				return;
			case V2xmlPackage.PCRCONTENT__PCR21:
				getPCR21().clear();
				return;
			case V2xmlPackage.PCRCONTENT__PCR22:
				getPCR22().clear();
				return;
			case V2xmlPackage.PCRCONTENT__PCR23:
				getPCR23().clear();
				return;
			case V2xmlPackage.PCRCONTENT__ANY:
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
			case V2xmlPackage.PCRCONTENT__PCR1:
				return pCR1 != null;
			case V2xmlPackage.PCRCONTENT__PCR2:
				return pCR2 != null;
			case V2xmlPackage.PCRCONTENT__PCR3:
				return pCR3 != null;
			case V2xmlPackage.PCRCONTENT__PCR4:
				return pCR4 != null;
			case V2xmlPackage.PCRCONTENT__PCR5:
				return pCR5 != null;
			case V2xmlPackage.PCRCONTENT__PCR6:
				return pCR6 != null;
			case V2xmlPackage.PCRCONTENT__PCR7:
				return pCR7 != null;
			case V2xmlPackage.PCRCONTENT__PCR8:
				return pCR8 != null;
			case V2xmlPackage.PCRCONTENT__PCR9:
				return pCR9 != null;
			case V2xmlPackage.PCRCONTENT__PCR10:
				return pCR10 != null;
			case V2xmlPackage.PCRCONTENT__PCR11:
				return pCR11 != null;
			case V2xmlPackage.PCRCONTENT__PCR12:
				return pCR12 != null && !pCR12.isEmpty();
			case V2xmlPackage.PCRCONTENT__PCR13:
				return pCR13 != null;
			case V2xmlPackage.PCRCONTENT__PCR14:
				return pCR14 != null;
			case V2xmlPackage.PCRCONTENT__PCR15:
				return pCR15 != null;
			case V2xmlPackage.PCRCONTENT__PCR16:
				return pCR16 != null;
			case V2xmlPackage.PCRCONTENT__PCR17:
				return pCR17 != null;
			case V2xmlPackage.PCRCONTENT__PCR18:
				return pCR18 != null;
			case V2xmlPackage.PCRCONTENT__PCR19:
				return pCR19 != null;
			case V2xmlPackage.PCRCONTENT__PCR20:
				return pCR20 != null;
			case V2xmlPackage.PCRCONTENT__PCR21:
				return pCR21 != null && !pCR21.isEmpty();
			case V2xmlPackage.PCRCONTENT__PCR22:
				return pCR22 != null && !pCR22.isEmpty();
			case V2xmlPackage.PCRCONTENT__PCR23:
				return pCR23 != null && !pCR23.isEmpty();
			case V2xmlPackage.PCRCONTENT__ANY:
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

} //PCRCONTENTImpl
