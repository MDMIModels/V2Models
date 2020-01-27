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

import org.hl7.v2xml.PDC10CONTENT;
import org.hl7.v2xml.PDC11CONTENT;
import org.hl7.v2xml.PDC12CONTENT;
import org.hl7.v2xml.PDC13CONTENT;
import org.hl7.v2xml.PDC14CONTENT;
import org.hl7.v2xml.PDC15CONTENT;
import org.hl7.v2xml.PDC1CONTENT;
import org.hl7.v2xml.PDC2CONTENT;
import org.hl7.v2xml.PDC3CONTENT;
import org.hl7.v2xml.PDC4CONTENT;
import org.hl7.v2xml.PDC5CONTENT;
import org.hl7.v2xml.PDC6CONTENT;
import org.hl7.v2xml.PDC7CONTENT;
import org.hl7.v2xml.PDC8CONTENT;
import org.hl7.v2xml.PDC9CONTENT;
import org.hl7.v2xml.PDCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PDCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC1 <em>PDC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC2 <em>PDC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC3 <em>PDC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC4 <em>PDC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC5 <em>PDC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC6 <em>PDC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC7 <em>PDC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC8 <em>PDC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC9 <em>PDC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC10 <em>PDC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC11 <em>PDC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC12 <em>PDC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC13 <em>PDC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC14 <em>PDC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getPDC15 <em>PDC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PDCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PDCCONTENTImpl extends EObjectImpl implements PDCCONTENT {
	/**
	 * The cached value of the '{@link #getPDC1() <em>PDC1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC1()
	 * @generated
	 * @ordered
	 */
	protected EList<PDC1CONTENT> pDC1;

	/**
	 * The cached value of the '{@link #getPDC2() <em>PDC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC2()
	 * @generated
	 * @ordered
	 */
	protected PDC2CONTENT pDC2;

	/**
	 * The cached value of the '{@link #getPDC3() <em>PDC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC3()
	 * @generated
	 * @ordered
	 */
	protected PDC3CONTENT pDC3;

	/**
	 * The cached value of the '{@link #getPDC4() <em>PDC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC4()
	 * @generated
	 * @ordered
	 */
	protected PDC4CONTENT pDC4;

	/**
	 * The cached value of the '{@link #getPDC5() <em>PDC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC5()
	 * @generated
	 * @ordered
	 */
	protected PDC5CONTENT pDC5;

	/**
	 * The cached value of the '{@link #getPDC6() <em>PDC6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC6()
	 * @generated
	 * @ordered
	 */
	protected EList<PDC6CONTENT> pDC6;

	/**
	 * The cached value of the '{@link #getPDC7() <em>PDC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC7()
	 * @generated
	 * @ordered
	 */
	protected PDC7CONTENT pDC7;

	/**
	 * The cached value of the '{@link #getPDC8() <em>PDC8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC8()
	 * @generated
	 * @ordered
	 */
	protected EList<PDC8CONTENT> pDC8;

	/**
	 * The cached value of the '{@link #getPDC9() <em>PDC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC9()
	 * @generated
	 * @ordered
	 */
	protected PDC9CONTENT pDC9;

	/**
	 * The cached value of the '{@link #getPDC10() <em>PDC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC10()
	 * @generated
	 * @ordered
	 */
	protected PDC10CONTENT pDC10;

	/**
	 * The cached value of the '{@link #getPDC11() <em>PDC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC11()
	 * @generated
	 * @ordered
	 */
	protected PDC11CONTENT pDC11;

	/**
	 * The cached value of the '{@link #getPDC12() <em>PDC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC12()
	 * @generated
	 * @ordered
	 */
	protected PDC12CONTENT pDC12;

	/**
	 * The cached value of the '{@link #getPDC13() <em>PDC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC13()
	 * @generated
	 * @ordered
	 */
	protected PDC13CONTENT pDC13;

	/**
	 * The cached value of the '{@link #getPDC14() <em>PDC14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC14()
	 * @generated
	 * @ordered
	 */
	protected PDC14CONTENT pDC14;

	/**
	 * The cached value of the '{@link #getPDC15() <em>PDC15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDC15()
	 * @generated
	 * @ordered
	 */
	protected PDC15CONTENT pDC15;

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
	protected PDCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPDCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDC1CONTENT> getPDC1() {
		if (pDC1 == null) {
			pDC1 = new EObjectContainmentEList<PDC1CONTENT>(PDC1CONTENT.class, this, V2xmlPackage.PDCCONTENT__PDC1);
		}
		return pDC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC2CONTENT getPDC2() {
		return pDC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC2(PDC2CONTENT newPDC2, NotificationChain msgs) {
		PDC2CONTENT oldPDC2 = pDC2;
		pDC2 = newPDC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC2, oldPDC2, newPDC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC2(PDC2CONTENT newPDC2) {
		if (newPDC2 != pDC2) {
			NotificationChain msgs = null;
			if (pDC2 != null)
				msgs = ((InternalEObject)pDC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC2, null, msgs);
			if (newPDC2 != null)
				msgs = ((InternalEObject)newPDC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC2, null, msgs);
			msgs = basicSetPDC2(newPDC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC2, newPDC2, newPDC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC3CONTENT getPDC3() {
		return pDC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC3(PDC3CONTENT newPDC3, NotificationChain msgs) {
		PDC3CONTENT oldPDC3 = pDC3;
		pDC3 = newPDC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC3, oldPDC3, newPDC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC3(PDC3CONTENT newPDC3) {
		if (newPDC3 != pDC3) {
			NotificationChain msgs = null;
			if (pDC3 != null)
				msgs = ((InternalEObject)pDC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC3, null, msgs);
			if (newPDC3 != null)
				msgs = ((InternalEObject)newPDC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC3, null, msgs);
			msgs = basicSetPDC3(newPDC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC3, newPDC3, newPDC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC4CONTENT getPDC4() {
		return pDC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC4(PDC4CONTENT newPDC4, NotificationChain msgs) {
		PDC4CONTENT oldPDC4 = pDC4;
		pDC4 = newPDC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC4, oldPDC4, newPDC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC4(PDC4CONTENT newPDC4) {
		if (newPDC4 != pDC4) {
			NotificationChain msgs = null;
			if (pDC4 != null)
				msgs = ((InternalEObject)pDC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC4, null, msgs);
			if (newPDC4 != null)
				msgs = ((InternalEObject)newPDC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC4, null, msgs);
			msgs = basicSetPDC4(newPDC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC4, newPDC4, newPDC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC5CONTENT getPDC5() {
		return pDC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC5(PDC5CONTENT newPDC5, NotificationChain msgs) {
		PDC5CONTENT oldPDC5 = pDC5;
		pDC5 = newPDC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC5, oldPDC5, newPDC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC5(PDC5CONTENT newPDC5) {
		if (newPDC5 != pDC5) {
			NotificationChain msgs = null;
			if (pDC5 != null)
				msgs = ((InternalEObject)pDC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC5, null, msgs);
			if (newPDC5 != null)
				msgs = ((InternalEObject)newPDC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC5, null, msgs);
			msgs = basicSetPDC5(newPDC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC5, newPDC5, newPDC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDC6CONTENT> getPDC6() {
		if (pDC6 == null) {
			pDC6 = new EObjectContainmentEList<PDC6CONTENT>(PDC6CONTENT.class, this, V2xmlPackage.PDCCONTENT__PDC6);
		}
		return pDC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC7CONTENT getPDC7() {
		return pDC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC7(PDC7CONTENT newPDC7, NotificationChain msgs) {
		PDC7CONTENT oldPDC7 = pDC7;
		pDC7 = newPDC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC7, oldPDC7, newPDC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC7(PDC7CONTENT newPDC7) {
		if (newPDC7 != pDC7) {
			NotificationChain msgs = null;
			if (pDC7 != null)
				msgs = ((InternalEObject)pDC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC7, null, msgs);
			if (newPDC7 != null)
				msgs = ((InternalEObject)newPDC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC7, null, msgs);
			msgs = basicSetPDC7(newPDC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC7, newPDC7, newPDC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PDC8CONTENT> getPDC8() {
		if (pDC8 == null) {
			pDC8 = new EObjectContainmentEList<PDC8CONTENT>(PDC8CONTENT.class, this, V2xmlPackage.PDCCONTENT__PDC8);
		}
		return pDC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC9CONTENT getPDC9() {
		return pDC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC9(PDC9CONTENT newPDC9, NotificationChain msgs) {
		PDC9CONTENT oldPDC9 = pDC9;
		pDC9 = newPDC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC9, oldPDC9, newPDC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC9(PDC9CONTENT newPDC9) {
		if (newPDC9 != pDC9) {
			NotificationChain msgs = null;
			if (pDC9 != null)
				msgs = ((InternalEObject)pDC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC9, null, msgs);
			if (newPDC9 != null)
				msgs = ((InternalEObject)newPDC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC9, null, msgs);
			msgs = basicSetPDC9(newPDC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC9, newPDC9, newPDC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC10CONTENT getPDC10() {
		return pDC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC10(PDC10CONTENT newPDC10, NotificationChain msgs) {
		PDC10CONTENT oldPDC10 = pDC10;
		pDC10 = newPDC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC10, oldPDC10, newPDC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC10(PDC10CONTENT newPDC10) {
		if (newPDC10 != pDC10) {
			NotificationChain msgs = null;
			if (pDC10 != null)
				msgs = ((InternalEObject)pDC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC10, null, msgs);
			if (newPDC10 != null)
				msgs = ((InternalEObject)newPDC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC10, null, msgs);
			msgs = basicSetPDC10(newPDC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC10, newPDC10, newPDC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC11CONTENT getPDC11() {
		return pDC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC11(PDC11CONTENT newPDC11, NotificationChain msgs) {
		PDC11CONTENT oldPDC11 = pDC11;
		pDC11 = newPDC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC11, oldPDC11, newPDC11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC11(PDC11CONTENT newPDC11) {
		if (newPDC11 != pDC11) {
			NotificationChain msgs = null;
			if (pDC11 != null)
				msgs = ((InternalEObject)pDC11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC11, null, msgs);
			if (newPDC11 != null)
				msgs = ((InternalEObject)newPDC11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC11, null, msgs);
			msgs = basicSetPDC11(newPDC11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC11, newPDC11, newPDC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC12CONTENT getPDC12() {
		return pDC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC12(PDC12CONTENT newPDC12, NotificationChain msgs) {
		PDC12CONTENT oldPDC12 = pDC12;
		pDC12 = newPDC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC12, oldPDC12, newPDC12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC12(PDC12CONTENT newPDC12) {
		if (newPDC12 != pDC12) {
			NotificationChain msgs = null;
			if (pDC12 != null)
				msgs = ((InternalEObject)pDC12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC12, null, msgs);
			if (newPDC12 != null)
				msgs = ((InternalEObject)newPDC12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC12, null, msgs);
			msgs = basicSetPDC12(newPDC12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC12, newPDC12, newPDC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC13CONTENT getPDC13() {
		return pDC13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC13(PDC13CONTENT newPDC13, NotificationChain msgs) {
		PDC13CONTENT oldPDC13 = pDC13;
		pDC13 = newPDC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC13, oldPDC13, newPDC13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC13(PDC13CONTENT newPDC13) {
		if (newPDC13 != pDC13) {
			NotificationChain msgs = null;
			if (pDC13 != null)
				msgs = ((InternalEObject)pDC13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC13, null, msgs);
			if (newPDC13 != null)
				msgs = ((InternalEObject)newPDC13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC13, null, msgs);
			msgs = basicSetPDC13(newPDC13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC13, newPDC13, newPDC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC14CONTENT getPDC14() {
		return pDC14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC14(PDC14CONTENT newPDC14, NotificationChain msgs) {
		PDC14CONTENT oldPDC14 = pDC14;
		pDC14 = newPDC14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC14, oldPDC14, newPDC14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC14(PDC14CONTENT newPDC14) {
		if (newPDC14 != pDC14) {
			NotificationChain msgs = null;
			if (pDC14 != null)
				msgs = ((InternalEObject)pDC14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC14, null, msgs);
			if (newPDC14 != null)
				msgs = ((InternalEObject)newPDC14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC14, null, msgs);
			msgs = basicSetPDC14(newPDC14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC14, newPDC14, newPDC14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PDC15CONTENT getPDC15() {
		return pDC15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPDC15(PDC15CONTENT newPDC15, NotificationChain msgs) {
		PDC15CONTENT oldPDC15 = pDC15;
		pDC15 = newPDC15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC15, oldPDC15, newPDC15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDC15(PDC15CONTENT newPDC15) {
		if (newPDC15 != pDC15) {
			NotificationChain msgs = null;
			if (pDC15 != null)
				msgs = ((InternalEObject)pDC15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC15, null, msgs);
			if (newPDC15 != null)
				msgs = ((InternalEObject)newPDC15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PDCCONTENT__PDC15, null, msgs);
			msgs = basicSetPDC15(newPDC15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PDCCONTENT__PDC15, newPDC15, newPDC15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PDCCONTENT__ANY);
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
			case V2xmlPackage.PDCCONTENT__PDC1:
				return ((InternalEList<?>)getPDC1()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PDCCONTENT__PDC2:
				return basicSetPDC2(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC3:
				return basicSetPDC3(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC4:
				return basicSetPDC4(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC5:
				return basicSetPDC5(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC6:
				return ((InternalEList<?>)getPDC6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PDCCONTENT__PDC7:
				return basicSetPDC7(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC8:
				return ((InternalEList<?>)getPDC8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PDCCONTENT__PDC9:
				return basicSetPDC9(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC10:
				return basicSetPDC10(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC11:
				return basicSetPDC11(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC12:
				return basicSetPDC12(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC13:
				return basicSetPDC13(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC14:
				return basicSetPDC14(null, msgs);
			case V2xmlPackage.PDCCONTENT__PDC15:
				return basicSetPDC15(null, msgs);
			case V2xmlPackage.PDCCONTENT__ANY:
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
			case V2xmlPackage.PDCCONTENT__PDC1:
				return getPDC1();
			case V2xmlPackage.PDCCONTENT__PDC2:
				return getPDC2();
			case V2xmlPackage.PDCCONTENT__PDC3:
				return getPDC3();
			case V2xmlPackage.PDCCONTENT__PDC4:
				return getPDC4();
			case V2xmlPackage.PDCCONTENT__PDC5:
				return getPDC5();
			case V2xmlPackage.PDCCONTENT__PDC6:
				return getPDC6();
			case V2xmlPackage.PDCCONTENT__PDC7:
				return getPDC7();
			case V2xmlPackage.PDCCONTENT__PDC8:
				return getPDC8();
			case V2xmlPackage.PDCCONTENT__PDC9:
				return getPDC9();
			case V2xmlPackage.PDCCONTENT__PDC10:
				return getPDC10();
			case V2xmlPackage.PDCCONTENT__PDC11:
				return getPDC11();
			case V2xmlPackage.PDCCONTENT__PDC12:
				return getPDC12();
			case V2xmlPackage.PDCCONTENT__PDC13:
				return getPDC13();
			case V2xmlPackage.PDCCONTENT__PDC14:
				return getPDC14();
			case V2xmlPackage.PDCCONTENT__PDC15:
				return getPDC15();
			case V2xmlPackage.PDCCONTENT__ANY:
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
			case V2xmlPackage.PDCCONTENT__PDC1:
				getPDC1().clear();
				getPDC1().addAll((Collection<? extends PDC1CONTENT>)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC2:
				setPDC2((PDC2CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC3:
				setPDC3((PDC3CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC4:
				setPDC4((PDC4CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC5:
				setPDC5((PDC5CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC6:
				getPDC6().clear();
				getPDC6().addAll((Collection<? extends PDC6CONTENT>)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC7:
				setPDC7((PDC7CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC8:
				getPDC8().clear();
				getPDC8().addAll((Collection<? extends PDC8CONTENT>)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC9:
				setPDC9((PDC9CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC10:
				setPDC10((PDC10CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC11:
				setPDC11((PDC11CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC12:
				setPDC12((PDC12CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC13:
				setPDC13((PDC13CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC14:
				setPDC14((PDC14CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__PDC15:
				setPDC15((PDC15CONTENT)newValue);
				return;
			case V2xmlPackage.PDCCONTENT__ANY:
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
			case V2xmlPackage.PDCCONTENT__PDC1:
				getPDC1().clear();
				return;
			case V2xmlPackage.PDCCONTENT__PDC2:
				setPDC2((PDC2CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC3:
				setPDC3((PDC3CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC4:
				setPDC4((PDC4CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC5:
				setPDC5((PDC5CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC6:
				getPDC6().clear();
				return;
			case V2xmlPackage.PDCCONTENT__PDC7:
				setPDC7((PDC7CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC8:
				getPDC8().clear();
				return;
			case V2xmlPackage.PDCCONTENT__PDC9:
				setPDC9((PDC9CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC10:
				setPDC10((PDC10CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC11:
				setPDC11((PDC11CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC12:
				setPDC12((PDC12CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC13:
				setPDC13((PDC13CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC14:
				setPDC14((PDC14CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__PDC15:
				setPDC15((PDC15CONTENT)null);
				return;
			case V2xmlPackage.PDCCONTENT__ANY:
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
			case V2xmlPackage.PDCCONTENT__PDC1:
				return pDC1 != null && !pDC1.isEmpty();
			case V2xmlPackage.PDCCONTENT__PDC2:
				return pDC2 != null;
			case V2xmlPackage.PDCCONTENT__PDC3:
				return pDC3 != null;
			case V2xmlPackage.PDCCONTENT__PDC4:
				return pDC4 != null;
			case V2xmlPackage.PDCCONTENT__PDC5:
				return pDC5 != null;
			case V2xmlPackage.PDCCONTENT__PDC6:
				return pDC6 != null && !pDC6.isEmpty();
			case V2xmlPackage.PDCCONTENT__PDC7:
				return pDC7 != null;
			case V2xmlPackage.PDCCONTENT__PDC8:
				return pDC8 != null && !pDC8.isEmpty();
			case V2xmlPackage.PDCCONTENT__PDC9:
				return pDC9 != null;
			case V2xmlPackage.PDCCONTENT__PDC10:
				return pDC10 != null;
			case V2xmlPackage.PDCCONTENT__PDC11:
				return pDC11 != null;
			case V2xmlPackage.PDCCONTENT__PDC12:
				return pDC12 != null;
			case V2xmlPackage.PDCCONTENT__PDC13:
				return pDC13 != null;
			case V2xmlPackage.PDCCONTENT__PDC14:
				return pDC14 != null;
			case V2xmlPackage.PDCCONTENT__PDC15:
				return pDC15 != null;
			case V2xmlPackage.PDCCONTENT__ANY:
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

} //PDCCONTENTImpl
