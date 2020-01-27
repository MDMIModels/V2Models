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

import org.hl7.v2xml.PRC10CONTENT;
import org.hl7.v2xml.PRC11CONTENT;
import org.hl7.v2xml.PRC12CONTENT;
import org.hl7.v2xml.PRC13CONTENT;
import org.hl7.v2xml.PRC14CONTENT;
import org.hl7.v2xml.PRC15CONTENT;
import org.hl7.v2xml.PRC16CONTENT;
import org.hl7.v2xml.PRC17CONTENT;
import org.hl7.v2xml.PRC18CONTENT;
import org.hl7.v2xml.PRC1CONTENT;
import org.hl7.v2xml.PRC2CONTENT;
import org.hl7.v2xml.PRC3CONTENT;
import org.hl7.v2xml.PRC4CONTENT;
import org.hl7.v2xml.PRC5CONTENT;
import org.hl7.v2xml.PRC6CONTENT;
import org.hl7.v2xml.PRC7CONTENT;
import org.hl7.v2xml.PRC8CONTENT;
import org.hl7.v2xml.PRC9CONTENT;
import org.hl7.v2xml.PRCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC1 <em>PRC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC2 <em>PRC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC3 <em>PRC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC4 <em>PRC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC5 <em>PRC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC6 <em>PRC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC7 <em>PRC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC8 <em>PRC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC9 <em>PRC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC10 <em>PRC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC11 <em>PRC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC12 <em>PRC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC13 <em>PRC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC14 <em>PRC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC15 <em>PRC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC16 <em>PRC16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC17 <em>PRC17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getPRC18 <em>PRC18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRCCONTENTImpl extends EObjectImpl implements PRCCONTENT {
	/**
	 * The cached value of the '{@link #getPRC1() <em>PRC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC1()
	 * @generated
	 * @ordered
	 */
	protected PRC1CONTENT pRC1;

	/**
	 * The cached value of the '{@link #getPRC2() <em>PRC2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC2()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC2CONTENT> pRC2;

	/**
	 * The cached value of the '{@link #getPRC3() <em>PRC3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC3()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC3CONTENT> pRC3;

	/**
	 * The cached value of the '{@link #getPRC4() <em>PRC4</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC4()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC4CONTENT> pRC4;

	/**
	 * The cached value of the '{@link #getPRC5() <em>PRC5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC5()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC5CONTENT> pRC5;

	/**
	 * The cached value of the '{@link #getPRC6() <em>PRC6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC6()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC6CONTENT> pRC6;

	/**
	 * The cached value of the '{@link #getPRC7() <em>PRC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC7()
	 * @generated
	 * @ordered
	 */
	protected PRC7CONTENT pRC7;

	/**
	 * The cached value of the '{@link #getPRC8() <em>PRC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC8()
	 * @generated
	 * @ordered
	 */
	protected PRC8CONTENT pRC8;

	/**
	 * The cached value of the '{@link #getPRC9() <em>PRC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC9()
	 * @generated
	 * @ordered
	 */
	protected PRC9CONTENT pRC9;

	/**
	 * The cached value of the '{@link #getPRC10() <em>PRC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC10()
	 * @generated
	 * @ordered
	 */
	protected PRC10CONTENT pRC10;

	/**
	 * The cached value of the '{@link #getPRC11() <em>PRC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC11()
	 * @generated
	 * @ordered
	 */
	protected PRC11CONTENT pRC11;

	/**
	 * The cached value of the '{@link #getPRC12() <em>PRC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC12()
	 * @generated
	 * @ordered
	 */
	protected PRC12CONTENT pRC12;

	/**
	 * The cached value of the '{@link #getPRC13() <em>PRC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC13()
	 * @generated
	 * @ordered
	 */
	protected PRC13CONTENT pRC13;

	/**
	 * The cached value of the '{@link #getPRC14() <em>PRC14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC14()
	 * @generated
	 * @ordered
	 */
	protected EList<PRC14CONTENT> pRC14;

	/**
	 * The cached value of the '{@link #getPRC15() <em>PRC15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC15()
	 * @generated
	 * @ordered
	 */
	protected PRC15CONTENT pRC15;

	/**
	 * The cached value of the '{@link #getPRC16() <em>PRC16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC16()
	 * @generated
	 * @ordered
	 */
	protected PRC16CONTENT pRC16;

	/**
	 * The cached value of the '{@link #getPRC17() <em>PRC17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC17()
	 * @generated
	 * @ordered
	 */
	protected PRC17CONTENT pRC17;

	/**
	 * The cached value of the '{@link #getPRC18() <em>PRC18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRC18()
	 * @generated
	 * @ordered
	 */
	protected PRC18CONTENT pRC18;

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
	protected PRCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPRCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC1CONTENT getPRC1() {
		return pRC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC1(PRC1CONTENT newPRC1, NotificationChain msgs) {
		PRC1CONTENT oldPRC1 = pRC1;
		pRC1 = newPRC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC1, oldPRC1, newPRC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC1(PRC1CONTENT newPRC1) {
		if (newPRC1 != pRC1) {
			NotificationChain msgs = null;
			if (pRC1 != null)
				msgs = ((InternalEObject)pRC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC1, null, msgs);
			if (newPRC1 != null)
				msgs = ((InternalEObject)newPRC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC1, null, msgs);
			msgs = basicSetPRC1(newPRC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC1, newPRC1, newPRC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC2CONTENT> getPRC2() {
		if (pRC2 == null) {
			pRC2 = new EObjectContainmentEList<PRC2CONTENT>(PRC2CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC2);
		}
		return pRC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC3CONTENT> getPRC3() {
		if (pRC3 == null) {
			pRC3 = new EObjectContainmentEList<PRC3CONTENT>(PRC3CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC3);
		}
		return pRC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC4CONTENT> getPRC4() {
		if (pRC4 == null) {
			pRC4 = new EObjectContainmentEList<PRC4CONTENT>(PRC4CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC4);
		}
		return pRC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC5CONTENT> getPRC5() {
		if (pRC5 == null) {
			pRC5 = new EObjectContainmentEList<PRC5CONTENT>(PRC5CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC5);
		}
		return pRC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC6CONTENT> getPRC6() {
		if (pRC6 == null) {
			pRC6 = new EObjectContainmentEList<PRC6CONTENT>(PRC6CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC6);
		}
		return pRC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC7CONTENT getPRC7() {
		return pRC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC7(PRC7CONTENT newPRC7, NotificationChain msgs) {
		PRC7CONTENT oldPRC7 = pRC7;
		pRC7 = newPRC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC7, oldPRC7, newPRC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC7(PRC7CONTENT newPRC7) {
		if (newPRC7 != pRC7) {
			NotificationChain msgs = null;
			if (pRC7 != null)
				msgs = ((InternalEObject)pRC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC7, null, msgs);
			if (newPRC7 != null)
				msgs = ((InternalEObject)newPRC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC7, null, msgs);
			msgs = basicSetPRC7(newPRC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC7, newPRC7, newPRC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC8CONTENT getPRC8() {
		return pRC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC8(PRC8CONTENT newPRC8, NotificationChain msgs) {
		PRC8CONTENT oldPRC8 = pRC8;
		pRC8 = newPRC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC8, oldPRC8, newPRC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC8(PRC8CONTENT newPRC8) {
		if (newPRC8 != pRC8) {
			NotificationChain msgs = null;
			if (pRC8 != null)
				msgs = ((InternalEObject)pRC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC8, null, msgs);
			if (newPRC8 != null)
				msgs = ((InternalEObject)newPRC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC8, null, msgs);
			msgs = basicSetPRC8(newPRC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC8, newPRC8, newPRC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC9CONTENT getPRC9() {
		return pRC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC9(PRC9CONTENT newPRC9, NotificationChain msgs) {
		PRC9CONTENT oldPRC9 = pRC9;
		pRC9 = newPRC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC9, oldPRC9, newPRC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC9(PRC9CONTENT newPRC9) {
		if (newPRC9 != pRC9) {
			NotificationChain msgs = null;
			if (pRC9 != null)
				msgs = ((InternalEObject)pRC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC9, null, msgs);
			if (newPRC9 != null)
				msgs = ((InternalEObject)newPRC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC9, null, msgs);
			msgs = basicSetPRC9(newPRC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC9, newPRC9, newPRC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC10CONTENT getPRC10() {
		return pRC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC10(PRC10CONTENT newPRC10, NotificationChain msgs) {
		PRC10CONTENT oldPRC10 = pRC10;
		pRC10 = newPRC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC10, oldPRC10, newPRC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC10(PRC10CONTENT newPRC10) {
		if (newPRC10 != pRC10) {
			NotificationChain msgs = null;
			if (pRC10 != null)
				msgs = ((InternalEObject)pRC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC10, null, msgs);
			if (newPRC10 != null)
				msgs = ((InternalEObject)newPRC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC10, null, msgs);
			msgs = basicSetPRC10(newPRC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC10, newPRC10, newPRC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC11CONTENT getPRC11() {
		return pRC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC11(PRC11CONTENT newPRC11, NotificationChain msgs) {
		PRC11CONTENT oldPRC11 = pRC11;
		pRC11 = newPRC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC11, oldPRC11, newPRC11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC11(PRC11CONTENT newPRC11) {
		if (newPRC11 != pRC11) {
			NotificationChain msgs = null;
			if (pRC11 != null)
				msgs = ((InternalEObject)pRC11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC11, null, msgs);
			if (newPRC11 != null)
				msgs = ((InternalEObject)newPRC11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC11, null, msgs);
			msgs = basicSetPRC11(newPRC11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC11, newPRC11, newPRC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC12CONTENT getPRC12() {
		return pRC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC12(PRC12CONTENT newPRC12, NotificationChain msgs) {
		PRC12CONTENT oldPRC12 = pRC12;
		pRC12 = newPRC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC12, oldPRC12, newPRC12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC12(PRC12CONTENT newPRC12) {
		if (newPRC12 != pRC12) {
			NotificationChain msgs = null;
			if (pRC12 != null)
				msgs = ((InternalEObject)pRC12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC12, null, msgs);
			if (newPRC12 != null)
				msgs = ((InternalEObject)newPRC12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC12, null, msgs);
			msgs = basicSetPRC12(newPRC12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC12, newPRC12, newPRC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC13CONTENT getPRC13() {
		return pRC13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC13(PRC13CONTENT newPRC13, NotificationChain msgs) {
		PRC13CONTENT oldPRC13 = pRC13;
		pRC13 = newPRC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC13, oldPRC13, newPRC13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC13(PRC13CONTENT newPRC13) {
		if (newPRC13 != pRC13) {
			NotificationChain msgs = null;
			if (pRC13 != null)
				msgs = ((InternalEObject)pRC13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC13, null, msgs);
			if (newPRC13 != null)
				msgs = ((InternalEObject)newPRC13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC13, null, msgs);
			msgs = basicSetPRC13(newPRC13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC13, newPRC13, newPRC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRC14CONTENT> getPRC14() {
		if (pRC14 == null) {
			pRC14 = new EObjectContainmentEList<PRC14CONTENT>(PRC14CONTENT.class, this, V2xmlPackage.PRCCONTENT__PRC14);
		}
		return pRC14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC15CONTENT getPRC15() {
		return pRC15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC15(PRC15CONTENT newPRC15, NotificationChain msgs) {
		PRC15CONTENT oldPRC15 = pRC15;
		pRC15 = newPRC15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC15, oldPRC15, newPRC15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC15(PRC15CONTENT newPRC15) {
		if (newPRC15 != pRC15) {
			NotificationChain msgs = null;
			if (pRC15 != null)
				msgs = ((InternalEObject)pRC15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC15, null, msgs);
			if (newPRC15 != null)
				msgs = ((InternalEObject)newPRC15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC15, null, msgs);
			msgs = basicSetPRC15(newPRC15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC15, newPRC15, newPRC15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC16CONTENT getPRC16() {
		return pRC16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC16(PRC16CONTENT newPRC16, NotificationChain msgs) {
		PRC16CONTENT oldPRC16 = pRC16;
		pRC16 = newPRC16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC16, oldPRC16, newPRC16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC16(PRC16CONTENT newPRC16) {
		if (newPRC16 != pRC16) {
			NotificationChain msgs = null;
			if (pRC16 != null)
				msgs = ((InternalEObject)pRC16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC16, null, msgs);
			if (newPRC16 != null)
				msgs = ((InternalEObject)newPRC16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC16, null, msgs);
			msgs = basicSetPRC16(newPRC16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC16, newPRC16, newPRC16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC17CONTENT getPRC17() {
		return pRC17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC17(PRC17CONTENT newPRC17, NotificationChain msgs) {
		PRC17CONTENT oldPRC17 = pRC17;
		pRC17 = newPRC17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC17, oldPRC17, newPRC17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC17(PRC17CONTENT newPRC17) {
		if (newPRC17 != pRC17) {
			NotificationChain msgs = null;
			if (pRC17 != null)
				msgs = ((InternalEObject)pRC17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC17, null, msgs);
			if (newPRC17 != null)
				msgs = ((InternalEObject)newPRC17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC17, null, msgs);
			msgs = basicSetPRC17(newPRC17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC17, newPRC17, newPRC17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRC18CONTENT getPRC18() {
		return pRC18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRC18(PRC18CONTENT newPRC18, NotificationChain msgs) {
		PRC18CONTENT oldPRC18 = pRC18;
		pRC18 = newPRC18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC18, oldPRC18, newPRC18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRC18(PRC18CONTENT newPRC18) {
		if (newPRC18 != pRC18) {
			NotificationChain msgs = null;
			if (pRC18 != null)
				msgs = ((InternalEObject)pRC18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC18, null, msgs);
			if (newPRC18 != null)
				msgs = ((InternalEObject)newPRC18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRCCONTENT__PRC18, null, msgs);
			msgs = basicSetPRC18(newPRC18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRCCONTENT__PRC18, newPRC18, newPRC18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PRCCONTENT__ANY);
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
			case V2xmlPackage.PRCCONTENT__PRC1:
				return basicSetPRC1(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC2:
				return ((InternalEList<?>)getPRC2()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC3:
				return ((InternalEList<?>)getPRC3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC4:
				return ((InternalEList<?>)getPRC4()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC5:
				return ((InternalEList<?>)getPRC5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC6:
				return ((InternalEList<?>)getPRC6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC7:
				return basicSetPRC7(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC8:
				return basicSetPRC8(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC9:
				return basicSetPRC9(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC10:
				return basicSetPRC10(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC11:
				return basicSetPRC11(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC12:
				return basicSetPRC12(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC13:
				return basicSetPRC13(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC14:
				return ((InternalEList<?>)getPRC14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRCCONTENT__PRC15:
				return basicSetPRC15(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC16:
				return basicSetPRC16(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC17:
				return basicSetPRC17(null, msgs);
			case V2xmlPackage.PRCCONTENT__PRC18:
				return basicSetPRC18(null, msgs);
			case V2xmlPackage.PRCCONTENT__ANY:
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
			case V2xmlPackage.PRCCONTENT__PRC1:
				return getPRC1();
			case V2xmlPackage.PRCCONTENT__PRC2:
				return getPRC2();
			case V2xmlPackage.PRCCONTENT__PRC3:
				return getPRC3();
			case V2xmlPackage.PRCCONTENT__PRC4:
				return getPRC4();
			case V2xmlPackage.PRCCONTENT__PRC5:
				return getPRC5();
			case V2xmlPackage.PRCCONTENT__PRC6:
				return getPRC6();
			case V2xmlPackage.PRCCONTENT__PRC7:
				return getPRC7();
			case V2xmlPackage.PRCCONTENT__PRC8:
				return getPRC8();
			case V2xmlPackage.PRCCONTENT__PRC9:
				return getPRC9();
			case V2xmlPackage.PRCCONTENT__PRC10:
				return getPRC10();
			case V2xmlPackage.PRCCONTENT__PRC11:
				return getPRC11();
			case V2xmlPackage.PRCCONTENT__PRC12:
				return getPRC12();
			case V2xmlPackage.PRCCONTENT__PRC13:
				return getPRC13();
			case V2xmlPackage.PRCCONTENT__PRC14:
				return getPRC14();
			case V2xmlPackage.PRCCONTENT__PRC15:
				return getPRC15();
			case V2xmlPackage.PRCCONTENT__PRC16:
				return getPRC16();
			case V2xmlPackage.PRCCONTENT__PRC17:
				return getPRC17();
			case V2xmlPackage.PRCCONTENT__PRC18:
				return getPRC18();
			case V2xmlPackage.PRCCONTENT__ANY:
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
			case V2xmlPackage.PRCCONTENT__PRC1:
				setPRC1((PRC1CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC2:
				getPRC2().clear();
				getPRC2().addAll((Collection<? extends PRC2CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC3:
				getPRC3().clear();
				getPRC3().addAll((Collection<? extends PRC3CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC4:
				getPRC4().clear();
				getPRC4().addAll((Collection<? extends PRC4CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC5:
				getPRC5().clear();
				getPRC5().addAll((Collection<? extends PRC5CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC6:
				getPRC6().clear();
				getPRC6().addAll((Collection<? extends PRC6CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC7:
				setPRC7((PRC7CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC8:
				setPRC8((PRC8CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC9:
				setPRC9((PRC9CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC10:
				setPRC10((PRC10CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC11:
				setPRC11((PRC11CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC12:
				setPRC12((PRC12CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC13:
				setPRC13((PRC13CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC14:
				getPRC14().clear();
				getPRC14().addAll((Collection<? extends PRC14CONTENT>)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC15:
				setPRC15((PRC15CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC16:
				setPRC16((PRC16CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC17:
				setPRC17((PRC17CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__PRC18:
				setPRC18((PRC18CONTENT)newValue);
				return;
			case V2xmlPackage.PRCCONTENT__ANY:
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
			case V2xmlPackage.PRCCONTENT__PRC1:
				setPRC1((PRC1CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC2:
				getPRC2().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC3:
				getPRC3().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC4:
				getPRC4().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC5:
				getPRC5().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC6:
				getPRC6().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC7:
				setPRC7((PRC7CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC8:
				setPRC8((PRC8CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC9:
				setPRC9((PRC9CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC10:
				setPRC10((PRC10CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC11:
				setPRC11((PRC11CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC12:
				setPRC12((PRC12CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC13:
				setPRC13((PRC13CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC14:
				getPRC14().clear();
				return;
			case V2xmlPackage.PRCCONTENT__PRC15:
				setPRC15((PRC15CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC16:
				setPRC16((PRC16CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC17:
				setPRC17((PRC17CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__PRC18:
				setPRC18((PRC18CONTENT)null);
				return;
			case V2xmlPackage.PRCCONTENT__ANY:
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
			case V2xmlPackage.PRCCONTENT__PRC1:
				return pRC1 != null;
			case V2xmlPackage.PRCCONTENT__PRC2:
				return pRC2 != null && !pRC2.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC3:
				return pRC3 != null && !pRC3.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC4:
				return pRC4 != null && !pRC4.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC5:
				return pRC5 != null && !pRC5.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC6:
				return pRC6 != null && !pRC6.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC7:
				return pRC7 != null;
			case V2xmlPackage.PRCCONTENT__PRC8:
				return pRC8 != null;
			case V2xmlPackage.PRCCONTENT__PRC9:
				return pRC9 != null;
			case V2xmlPackage.PRCCONTENT__PRC10:
				return pRC10 != null;
			case V2xmlPackage.PRCCONTENT__PRC11:
				return pRC11 != null;
			case V2xmlPackage.PRCCONTENT__PRC12:
				return pRC12 != null;
			case V2xmlPackage.PRCCONTENT__PRC13:
				return pRC13 != null;
			case V2xmlPackage.PRCCONTENT__PRC14:
				return pRC14 != null && !pRC14.isEmpty();
			case V2xmlPackage.PRCCONTENT__PRC15:
				return pRC15 != null;
			case V2xmlPackage.PRCCONTENT__PRC16:
				return pRC16 != null;
			case V2xmlPackage.PRCCONTENT__PRC17:
				return pRC17 != null;
			case V2xmlPackage.PRCCONTENT__PRC18:
				return pRC18 != null;
			case V2xmlPackage.PRCCONTENT__ANY:
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

} //PRCCONTENTImpl
