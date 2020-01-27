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

import org.hl7.v2xml.CSR10CONTENT;
import org.hl7.v2xml.CSR11CONTENT;
import org.hl7.v2xml.CSR12CONTENT;
import org.hl7.v2xml.CSR13CONTENT;
import org.hl7.v2xml.CSR14CONTENT;
import org.hl7.v2xml.CSR15CONTENT;
import org.hl7.v2xml.CSR16CONTENT;
import org.hl7.v2xml.CSR1CONTENT;
import org.hl7.v2xml.CSR2CONTENT;
import org.hl7.v2xml.CSR3CONTENT;
import org.hl7.v2xml.CSR4CONTENT;
import org.hl7.v2xml.CSR5CONTENT;
import org.hl7.v2xml.CSR6CONTENT;
import org.hl7.v2xml.CSR7CONTENT;
import org.hl7.v2xml.CSR8CONTENT;
import org.hl7.v2xml.CSR9CONTENT;
import org.hl7.v2xml.CSRCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSRCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR1 <em>CSR1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR2 <em>CSR2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR3 <em>CSR3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR4 <em>CSR4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR5 <em>CSR5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR6 <em>CSR6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR7 <em>CSR7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR8 <em>CSR8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR9 <em>CSR9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR10 <em>CSR10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR11 <em>CSR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR12 <em>CSR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR13 <em>CSR13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR14 <em>CSR14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR15 <em>CSR15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getCSR16 <em>CSR16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CSRCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSRCONTENTImpl extends EObjectImpl implements CSRCONTENT {
	/**
	 * The cached value of the '{@link #getCSR1() <em>CSR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR1()
	 * @generated
	 * @ordered
	 */
	protected CSR1CONTENT cSR1;

	/**
	 * The cached value of the '{@link #getCSR2() <em>CSR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR2()
	 * @generated
	 * @ordered
	 */
	protected CSR2CONTENT cSR2;

	/**
	 * The cached value of the '{@link #getCSR3() <em>CSR3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR3()
	 * @generated
	 * @ordered
	 */
	protected CSR3CONTENT cSR3;

	/**
	 * The cached value of the '{@link #getCSR4() <em>CSR4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR4()
	 * @generated
	 * @ordered
	 */
	protected CSR4CONTENT cSR4;

	/**
	 * The cached value of the '{@link #getCSR5() <em>CSR5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR5()
	 * @generated
	 * @ordered
	 */
	protected CSR5CONTENT cSR5;

	/**
	 * The cached value of the '{@link #getCSR6() <em>CSR6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR6()
	 * @generated
	 * @ordered
	 */
	protected CSR6CONTENT cSR6;

	/**
	 * The cached value of the '{@link #getCSR7() <em>CSR7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR7()
	 * @generated
	 * @ordered
	 */
	protected EList<CSR7CONTENT> cSR7;

	/**
	 * The cached value of the '{@link #getCSR8() <em>CSR8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR8()
	 * @generated
	 * @ordered
	 */
	protected EList<CSR8CONTENT> cSR8;

	/**
	 * The cached value of the '{@link #getCSR9() <em>CSR9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR9()
	 * @generated
	 * @ordered
	 */
	protected CSR9CONTENT cSR9;

	/**
	 * The cached value of the '{@link #getCSR10() <em>CSR10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR10()
	 * @generated
	 * @ordered
	 */
	protected CSR10CONTENT cSR10;

	/**
	 * The cached value of the '{@link #getCSR11() <em>CSR11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR11()
	 * @generated
	 * @ordered
	 */
	protected EList<CSR11CONTENT> cSR11;

	/**
	 * The cached value of the '{@link #getCSR12() <em>CSR12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR12()
	 * @generated
	 * @ordered
	 */
	protected EList<CSR12CONTENT> cSR12;

	/**
	 * The cached value of the '{@link #getCSR13() <em>CSR13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR13()
	 * @generated
	 * @ordered
	 */
	protected EList<CSR13CONTENT> cSR13;

	/**
	 * The cached value of the '{@link #getCSR14() <em>CSR14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR14()
	 * @generated
	 * @ordered
	 */
	protected CSR14CONTENT cSR14;

	/**
	 * The cached value of the '{@link #getCSR15() <em>CSR15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR15()
	 * @generated
	 * @ordered
	 */
	protected CSR15CONTENT cSR15;

	/**
	 * The cached value of the '{@link #getCSR16() <em>CSR16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSR16()
	 * @generated
	 * @ordered
	 */
	protected CSR16CONTENT cSR16;

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
	protected CSRCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCSRCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR1CONTENT getCSR1() {
		return cSR1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR1(CSR1CONTENT newCSR1, NotificationChain msgs) {
		CSR1CONTENT oldCSR1 = cSR1;
		cSR1 = newCSR1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR1, oldCSR1, newCSR1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR1(CSR1CONTENT newCSR1) {
		if (newCSR1 != cSR1) {
			NotificationChain msgs = null;
			if (cSR1 != null)
				msgs = ((InternalEObject)cSR1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR1, null, msgs);
			if (newCSR1 != null)
				msgs = ((InternalEObject)newCSR1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR1, null, msgs);
			msgs = basicSetCSR1(newCSR1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR1, newCSR1, newCSR1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR2CONTENT getCSR2() {
		return cSR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR2(CSR2CONTENT newCSR2, NotificationChain msgs) {
		CSR2CONTENT oldCSR2 = cSR2;
		cSR2 = newCSR2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR2, oldCSR2, newCSR2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR2(CSR2CONTENT newCSR2) {
		if (newCSR2 != cSR2) {
			NotificationChain msgs = null;
			if (cSR2 != null)
				msgs = ((InternalEObject)cSR2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR2, null, msgs);
			if (newCSR2 != null)
				msgs = ((InternalEObject)newCSR2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR2, null, msgs);
			msgs = basicSetCSR2(newCSR2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR2, newCSR2, newCSR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR3CONTENT getCSR3() {
		return cSR3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR3(CSR3CONTENT newCSR3, NotificationChain msgs) {
		CSR3CONTENT oldCSR3 = cSR3;
		cSR3 = newCSR3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR3, oldCSR3, newCSR3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR3(CSR3CONTENT newCSR3) {
		if (newCSR3 != cSR3) {
			NotificationChain msgs = null;
			if (cSR3 != null)
				msgs = ((InternalEObject)cSR3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR3, null, msgs);
			if (newCSR3 != null)
				msgs = ((InternalEObject)newCSR3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR3, null, msgs);
			msgs = basicSetCSR3(newCSR3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR3, newCSR3, newCSR3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR4CONTENT getCSR4() {
		return cSR4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR4(CSR4CONTENT newCSR4, NotificationChain msgs) {
		CSR4CONTENT oldCSR4 = cSR4;
		cSR4 = newCSR4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR4, oldCSR4, newCSR4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR4(CSR4CONTENT newCSR4) {
		if (newCSR4 != cSR4) {
			NotificationChain msgs = null;
			if (cSR4 != null)
				msgs = ((InternalEObject)cSR4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR4, null, msgs);
			if (newCSR4 != null)
				msgs = ((InternalEObject)newCSR4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR4, null, msgs);
			msgs = basicSetCSR4(newCSR4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR4, newCSR4, newCSR4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR5CONTENT getCSR5() {
		return cSR5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR5(CSR5CONTENT newCSR5, NotificationChain msgs) {
		CSR5CONTENT oldCSR5 = cSR5;
		cSR5 = newCSR5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR5, oldCSR5, newCSR5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR5(CSR5CONTENT newCSR5) {
		if (newCSR5 != cSR5) {
			NotificationChain msgs = null;
			if (cSR5 != null)
				msgs = ((InternalEObject)cSR5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR5, null, msgs);
			if (newCSR5 != null)
				msgs = ((InternalEObject)newCSR5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR5, null, msgs);
			msgs = basicSetCSR5(newCSR5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR5, newCSR5, newCSR5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR6CONTENT getCSR6() {
		return cSR6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR6(CSR6CONTENT newCSR6, NotificationChain msgs) {
		CSR6CONTENT oldCSR6 = cSR6;
		cSR6 = newCSR6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR6, oldCSR6, newCSR6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR6(CSR6CONTENT newCSR6) {
		if (newCSR6 != cSR6) {
			NotificationChain msgs = null;
			if (cSR6 != null)
				msgs = ((InternalEObject)cSR6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR6, null, msgs);
			if (newCSR6 != null)
				msgs = ((InternalEObject)newCSR6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR6, null, msgs);
			msgs = basicSetCSR6(newCSR6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR6, newCSR6, newCSR6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSR7CONTENT> getCSR7() {
		if (cSR7 == null) {
			cSR7 = new EObjectContainmentEList<CSR7CONTENT>(CSR7CONTENT.class, this, V2xmlPackage.CSRCONTENT__CSR7);
		}
		return cSR7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSR8CONTENT> getCSR8() {
		if (cSR8 == null) {
			cSR8 = new EObjectContainmentEList<CSR8CONTENT>(CSR8CONTENT.class, this, V2xmlPackage.CSRCONTENT__CSR8);
		}
		return cSR8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR9CONTENT getCSR9() {
		return cSR9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR9(CSR9CONTENT newCSR9, NotificationChain msgs) {
		CSR9CONTENT oldCSR9 = cSR9;
		cSR9 = newCSR9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR9, oldCSR9, newCSR9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR9(CSR9CONTENT newCSR9) {
		if (newCSR9 != cSR9) {
			NotificationChain msgs = null;
			if (cSR9 != null)
				msgs = ((InternalEObject)cSR9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR9, null, msgs);
			if (newCSR9 != null)
				msgs = ((InternalEObject)newCSR9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR9, null, msgs);
			msgs = basicSetCSR9(newCSR9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR9, newCSR9, newCSR9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR10CONTENT getCSR10() {
		return cSR10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR10(CSR10CONTENT newCSR10, NotificationChain msgs) {
		CSR10CONTENT oldCSR10 = cSR10;
		cSR10 = newCSR10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR10, oldCSR10, newCSR10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR10(CSR10CONTENT newCSR10) {
		if (newCSR10 != cSR10) {
			NotificationChain msgs = null;
			if (cSR10 != null)
				msgs = ((InternalEObject)cSR10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR10, null, msgs);
			if (newCSR10 != null)
				msgs = ((InternalEObject)newCSR10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR10, null, msgs);
			msgs = basicSetCSR10(newCSR10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR10, newCSR10, newCSR10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSR11CONTENT> getCSR11() {
		if (cSR11 == null) {
			cSR11 = new EObjectContainmentEList<CSR11CONTENT>(CSR11CONTENT.class, this, V2xmlPackage.CSRCONTENT__CSR11);
		}
		return cSR11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSR12CONTENT> getCSR12() {
		if (cSR12 == null) {
			cSR12 = new EObjectContainmentEList<CSR12CONTENT>(CSR12CONTENT.class, this, V2xmlPackage.CSRCONTENT__CSR12);
		}
		return cSR12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CSR13CONTENT> getCSR13() {
		if (cSR13 == null) {
			cSR13 = new EObjectContainmentEList<CSR13CONTENT>(CSR13CONTENT.class, this, V2xmlPackage.CSRCONTENT__CSR13);
		}
		return cSR13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR14CONTENT getCSR14() {
		return cSR14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR14(CSR14CONTENT newCSR14, NotificationChain msgs) {
		CSR14CONTENT oldCSR14 = cSR14;
		cSR14 = newCSR14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR14, oldCSR14, newCSR14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR14(CSR14CONTENT newCSR14) {
		if (newCSR14 != cSR14) {
			NotificationChain msgs = null;
			if (cSR14 != null)
				msgs = ((InternalEObject)cSR14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR14, null, msgs);
			if (newCSR14 != null)
				msgs = ((InternalEObject)newCSR14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR14, null, msgs);
			msgs = basicSetCSR14(newCSR14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR14, newCSR14, newCSR14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR15CONTENT getCSR15() {
		return cSR15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR15(CSR15CONTENT newCSR15, NotificationChain msgs) {
		CSR15CONTENT oldCSR15 = cSR15;
		cSR15 = newCSR15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR15, oldCSR15, newCSR15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR15(CSR15CONTENT newCSR15) {
		if (newCSR15 != cSR15) {
			NotificationChain msgs = null;
			if (cSR15 != null)
				msgs = ((InternalEObject)cSR15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR15, null, msgs);
			if (newCSR15 != null)
				msgs = ((InternalEObject)newCSR15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR15, null, msgs);
			msgs = basicSetCSR15(newCSR15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR15, newCSR15, newCSR15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CSR16CONTENT getCSR16() {
		return cSR16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCSR16(CSR16CONTENT newCSR16, NotificationChain msgs) {
		CSR16CONTENT oldCSR16 = cSR16;
		cSR16 = newCSR16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR16, oldCSR16, newCSR16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSR16(CSR16CONTENT newCSR16) {
		if (newCSR16 != cSR16) {
			NotificationChain msgs = null;
			if (cSR16 != null)
				msgs = ((InternalEObject)cSR16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR16, null, msgs);
			if (newCSR16 != null)
				msgs = ((InternalEObject)newCSR16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CSRCONTENT__CSR16, null, msgs);
			msgs = basicSetCSR16(newCSR16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CSRCONTENT__CSR16, newCSR16, newCSR16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CSRCONTENT__ANY);
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
			case V2xmlPackage.CSRCONTENT__CSR1:
				return basicSetCSR1(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR2:
				return basicSetCSR2(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR3:
				return basicSetCSR3(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR4:
				return basicSetCSR4(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR5:
				return basicSetCSR5(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR6:
				return basicSetCSR6(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR7:
				return ((InternalEList<?>)getCSR7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSRCONTENT__CSR8:
				return ((InternalEList<?>)getCSR8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSRCONTENT__CSR9:
				return basicSetCSR9(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR10:
				return basicSetCSR10(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR11:
				return ((InternalEList<?>)getCSR11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSRCONTENT__CSR12:
				return ((InternalEList<?>)getCSR12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSRCONTENT__CSR13:
				return ((InternalEList<?>)getCSR13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CSRCONTENT__CSR14:
				return basicSetCSR14(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR15:
				return basicSetCSR15(null, msgs);
			case V2xmlPackage.CSRCONTENT__CSR16:
				return basicSetCSR16(null, msgs);
			case V2xmlPackage.CSRCONTENT__ANY:
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
			case V2xmlPackage.CSRCONTENT__CSR1:
				return getCSR1();
			case V2xmlPackage.CSRCONTENT__CSR2:
				return getCSR2();
			case V2xmlPackage.CSRCONTENT__CSR3:
				return getCSR3();
			case V2xmlPackage.CSRCONTENT__CSR4:
				return getCSR4();
			case V2xmlPackage.CSRCONTENT__CSR5:
				return getCSR5();
			case V2xmlPackage.CSRCONTENT__CSR6:
				return getCSR6();
			case V2xmlPackage.CSRCONTENT__CSR7:
				return getCSR7();
			case V2xmlPackage.CSRCONTENT__CSR8:
				return getCSR8();
			case V2xmlPackage.CSRCONTENT__CSR9:
				return getCSR9();
			case V2xmlPackage.CSRCONTENT__CSR10:
				return getCSR10();
			case V2xmlPackage.CSRCONTENT__CSR11:
				return getCSR11();
			case V2xmlPackage.CSRCONTENT__CSR12:
				return getCSR12();
			case V2xmlPackage.CSRCONTENT__CSR13:
				return getCSR13();
			case V2xmlPackage.CSRCONTENT__CSR14:
				return getCSR14();
			case V2xmlPackage.CSRCONTENT__CSR15:
				return getCSR15();
			case V2xmlPackage.CSRCONTENT__CSR16:
				return getCSR16();
			case V2xmlPackage.CSRCONTENT__ANY:
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
			case V2xmlPackage.CSRCONTENT__CSR1:
				setCSR1((CSR1CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR2:
				setCSR2((CSR2CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR3:
				setCSR3((CSR3CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR4:
				setCSR4((CSR4CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR5:
				setCSR5((CSR5CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR6:
				setCSR6((CSR6CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR7:
				getCSR7().clear();
				getCSR7().addAll((Collection<? extends CSR7CONTENT>)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR8:
				getCSR8().clear();
				getCSR8().addAll((Collection<? extends CSR8CONTENT>)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR9:
				setCSR9((CSR9CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR10:
				setCSR10((CSR10CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR11:
				getCSR11().clear();
				getCSR11().addAll((Collection<? extends CSR11CONTENT>)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR12:
				getCSR12().clear();
				getCSR12().addAll((Collection<? extends CSR12CONTENT>)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR13:
				getCSR13().clear();
				getCSR13().addAll((Collection<? extends CSR13CONTENT>)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR14:
				setCSR14((CSR14CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR15:
				setCSR15((CSR15CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__CSR16:
				setCSR16((CSR16CONTENT)newValue);
				return;
			case V2xmlPackage.CSRCONTENT__ANY:
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
			case V2xmlPackage.CSRCONTENT__CSR1:
				setCSR1((CSR1CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR2:
				setCSR2((CSR2CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR3:
				setCSR3((CSR3CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR4:
				setCSR4((CSR4CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR5:
				setCSR5((CSR5CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR6:
				setCSR6((CSR6CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR7:
				getCSR7().clear();
				return;
			case V2xmlPackage.CSRCONTENT__CSR8:
				getCSR8().clear();
				return;
			case V2xmlPackage.CSRCONTENT__CSR9:
				setCSR9((CSR9CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR10:
				setCSR10((CSR10CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR11:
				getCSR11().clear();
				return;
			case V2xmlPackage.CSRCONTENT__CSR12:
				getCSR12().clear();
				return;
			case V2xmlPackage.CSRCONTENT__CSR13:
				getCSR13().clear();
				return;
			case V2xmlPackage.CSRCONTENT__CSR14:
				setCSR14((CSR14CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR15:
				setCSR15((CSR15CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__CSR16:
				setCSR16((CSR16CONTENT)null);
				return;
			case V2xmlPackage.CSRCONTENT__ANY:
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
			case V2xmlPackage.CSRCONTENT__CSR1:
				return cSR1 != null;
			case V2xmlPackage.CSRCONTENT__CSR2:
				return cSR2 != null;
			case V2xmlPackage.CSRCONTENT__CSR3:
				return cSR3 != null;
			case V2xmlPackage.CSRCONTENT__CSR4:
				return cSR4 != null;
			case V2xmlPackage.CSRCONTENT__CSR5:
				return cSR5 != null;
			case V2xmlPackage.CSRCONTENT__CSR6:
				return cSR6 != null;
			case V2xmlPackage.CSRCONTENT__CSR7:
				return cSR7 != null && !cSR7.isEmpty();
			case V2xmlPackage.CSRCONTENT__CSR8:
				return cSR8 != null && !cSR8.isEmpty();
			case V2xmlPackage.CSRCONTENT__CSR9:
				return cSR9 != null;
			case V2xmlPackage.CSRCONTENT__CSR10:
				return cSR10 != null;
			case V2xmlPackage.CSRCONTENT__CSR11:
				return cSR11 != null && !cSR11.isEmpty();
			case V2xmlPackage.CSRCONTENT__CSR12:
				return cSR12 != null && !cSR12.isEmpty();
			case V2xmlPackage.CSRCONTENT__CSR13:
				return cSR13 != null && !cSR13.isEmpty();
			case V2xmlPackage.CSRCONTENT__CSR14:
				return cSR14 != null;
			case V2xmlPackage.CSRCONTENT__CSR15:
				return cSR15 != null;
			case V2xmlPackage.CSRCONTENT__CSR16:
				return cSR16 != null;
			case V2xmlPackage.CSRCONTENT__ANY:
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

} //CSRCONTENTImpl
