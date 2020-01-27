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

import org.hl7.v2xml.PSH10CONTENT;
import org.hl7.v2xml.PSH11CONTENT;
import org.hl7.v2xml.PSH12CONTENT;
import org.hl7.v2xml.PSH13CONTENT;
import org.hl7.v2xml.PSH14CONTENT;
import org.hl7.v2xml.PSH1CONTENT;
import org.hl7.v2xml.PSH2CONTENT;
import org.hl7.v2xml.PSH3CONTENT;
import org.hl7.v2xml.PSH4CONTENT;
import org.hl7.v2xml.PSH5CONTENT;
import org.hl7.v2xml.PSH6CONTENT;
import org.hl7.v2xml.PSH7CONTENT;
import org.hl7.v2xml.PSH8CONTENT;
import org.hl7.v2xml.PSH9CONTENT;
import org.hl7.v2xml.PSHCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PSHCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH1 <em>PSH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH2 <em>PSH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH3 <em>PSH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH4 <em>PSH4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH5 <em>PSH5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH6 <em>PSH6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH7 <em>PSH7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH8 <em>PSH8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH9 <em>PSH9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH10 <em>PSH10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH11 <em>PSH11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH12 <em>PSH12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH13 <em>PSH13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getPSH14 <em>PSH14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PSHCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PSHCONTENTImpl extends EObjectImpl implements PSHCONTENT {
	/**
	 * The cached value of the '{@link #getPSH1() <em>PSH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH1()
	 * @generated
	 * @ordered
	 */
	protected PSH1CONTENT pSH1;

	/**
	 * The cached value of the '{@link #getPSH2() <em>PSH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH2()
	 * @generated
	 * @ordered
	 */
	protected PSH2CONTENT pSH2;

	/**
	 * The cached value of the '{@link #getPSH3() <em>PSH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH3()
	 * @generated
	 * @ordered
	 */
	protected PSH3CONTENT pSH3;

	/**
	 * The cached value of the '{@link #getPSH4() <em>PSH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH4()
	 * @generated
	 * @ordered
	 */
	protected PSH4CONTENT pSH4;

	/**
	 * The cached value of the '{@link #getPSH5() <em>PSH5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH5()
	 * @generated
	 * @ordered
	 */
	protected PSH5CONTENT pSH5;

	/**
	 * The cached value of the '{@link #getPSH6() <em>PSH6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH6()
	 * @generated
	 * @ordered
	 */
	protected PSH6CONTENT pSH6;

	/**
	 * The cached value of the '{@link #getPSH7() <em>PSH7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH7()
	 * @generated
	 * @ordered
	 */
	protected PSH7CONTENT pSH7;

	/**
	 * The cached value of the '{@link #getPSH8() <em>PSH8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH8()
	 * @generated
	 * @ordered
	 */
	protected PSH8CONTENT pSH8;

	/**
	 * The cached value of the '{@link #getPSH9() <em>PSH9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH9()
	 * @generated
	 * @ordered
	 */
	protected PSH9CONTENT pSH9;

	/**
	 * The cached value of the '{@link #getPSH10() <em>PSH10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH10()
	 * @generated
	 * @ordered
	 */
	protected PSH10CONTENT pSH10;

	/**
	 * The cached value of the '{@link #getPSH11() <em>PSH11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH11()
	 * @generated
	 * @ordered
	 */
	protected PSH11CONTENT pSH11;

	/**
	 * The cached value of the '{@link #getPSH12() <em>PSH12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH12()
	 * @generated
	 * @ordered
	 */
	protected PSH12CONTENT pSH12;

	/**
	 * The cached value of the '{@link #getPSH13() <em>PSH13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH13()
	 * @generated
	 * @ordered
	 */
	protected EList<PSH13CONTENT> pSH13;

	/**
	 * The cached value of the '{@link #getPSH14() <em>PSH14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPSH14()
	 * @generated
	 * @ordered
	 */
	protected EList<PSH14CONTENT> pSH14;

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
	protected PSHCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPSHCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH1CONTENT getPSH1() {
		return pSH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH1(PSH1CONTENT newPSH1, NotificationChain msgs) {
		PSH1CONTENT oldPSH1 = pSH1;
		pSH1 = newPSH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH1, oldPSH1, newPSH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH1(PSH1CONTENT newPSH1) {
		if (newPSH1 != pSH1) {
			NotificationChain msgs = null;
			if (pSH1 != null)
				msgs = ((InternalEObject)pSH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH1, null, msgs);
			if (newPSH1 != null)
				msgs = ((InternalEObject)newPSH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH1, null, msgs);
			msgs = basicSetPSH1(newPSH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH1, newPSH1, newPSH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH2CONTENT getPSH2() {
		return pSH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH2(PSH2CONTENT newPSH2, NotificationChain msgs) {
		PSH2CONTENT oldPSH2 = pSH2;
		pSH2 = newPSH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH2, oldPSH2, newPSH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH2(PSH2CONTENT newPSH2) {
		if (newPSH2 != pSH2) {
			NotificationChain msgs = null;
			if (pSH2 != null)
				msgs = ((InternalEObject)pSH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH2, null, msgs);
			if (newPSH2 != null)
				msgs = ((InternalEObject)newPSH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH2, null, msgs);
			msgs = basicSetPSH2(newPSH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH2, newPSH2, newPSH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH3CONTENT getPSH3() {
		return pSH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH3(PSH3CONTENT newPSH3, NotificationChain msgs) {
		PSH3CONTENT oldPSH3 = pSH3;
		pSH3 = newPSH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH3, oldPSH3, newPSH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH3(PSH3CONTENT newPSH3) {
		if (newPSH3 != pSH3) {
			NotificationChain msgs = null;
			if (pSH3 != null)
				msgs = ((InternalEObject)pSH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH3, null, msgs);
			if (newPSH3 != null)
				msgs = ((InternalEObject)newPSH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH3, null, msgs);
			msgs = basicSetPSH3(newPSH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH3, newPSH3, newPSH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH4CONTENT getPSH4() {
		return pSH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH4(PSH4CONTENT newPSH4, NotificationChain msgs) {
		PSH4CONTENT oldPSH4 = pSH4;
		pSH4 = newPSH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH4, oldPSH4, newPSH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH4(PSH4CONTENT newPSH4) {
		if (newPSH4 != pSH4) {
			NotificationChain msgs = null;
			if (pSH4 != null)
				msgs = ((InternalEObject)pSH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH4, null, msgs);
			if (newPSH4 != null)
				msgs = ((InternalEObject)newPSH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH4, null, msgs);
			msgs = basicSetPSH4(newPSH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH4, newPSH4, newPSH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH5CONTENT getPSH5() {
		return pSH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH5(PSH5CONTENT newPSH5, NotificationChain msgs) {
		PSH5CONTENT oldPSH5 = pSH5;
		pSH5 = newPSH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH5, oldPSH5, newPSH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH5(PSH5CONTENT newPSH5) {
		if (newPSH5 != pSH5) {
			NotificationChain msgs = null;
			if (pSH5 != null)
				msgs = ((InternalEObject)pSH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH5, null, msgs);
			if (newPSH5 != null)
				msgs = ((InternalEObject)newPSH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH5, null, msgs);
			msgs = basicSetPSH5(newPSH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH5, newPSH5, newPSH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH6CONTENT getPSH6() {
		return pSH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH6(PSH6CONTENT newPSH6, NotificationChain msgs) {
		PSH6CONTENT oldPSH6 = pSH6;
		pSH6 = newPSH6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH6, oldPSH6, newPSH6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH6(PSH6CONTENT newPSH6) {
		if (newPSH6 != pSH6) {
			NotificationChain msgs = null;
			if (pSH6 != null)
				msgs = ((InternalEObject)pSH6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH6, null, msgs);
			if (newPSH6 != null)
				msgs = ((InternalEObject)newPSH6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH6, null, msgs);
			msgs = basicSetPSH6(newPSH6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH6, newPSH6, newPSH6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH7CONTENT getPSH7() {
		return pSH7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH7(PSH7CONTENT newPSH7, NotificationChain msgs) {
		PSH7CONTENT oldPSH7 = pSH7;
		pSH7 = newPSH7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH7, oldPSH7, newPSH7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH7(PSH7CONTENT newPSH7) {
		if (newPSH7 != pSH7) {
			NotificationChain msgs = null;
			if (pSH7 != null)
				msgs = ((InternalEObject)pSH7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH7, null, msgs);
			if (newPSH7 != null)
				msgs = ((InternalEObject)newPSH7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH7, null, msgs);
			msgs = basicSetPSH7(newPSH7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH7, newPSH7, newPSH7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH8CONTENT getPSH8() {
		return pSH8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH8(PSH8CONTENT newPSH8, NotificationChain msgs) {
		PSH8CONTENT oldPSH8 = pSH8;
		pSH8 = newPSH8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH8, oldPSH8, newPSH8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH8(PSH8CONTENT newPSH8) {
		if (newPSH8 != pSH8) {
			NotificationChain msgs = null;
			if (pSH8 != null)
				msgs = ((InternalEObject)pSH8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH8, null, msgs);
			if (newPSH8 != null)
				msgs = ((InternalEObject)newPSH8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH8, null, msgs);
			msgs = basicSetPSH8(newPSH8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH8, newPSH8, newPSH8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH9CONTENT getPSH9() {
		return pSH9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH9(PSH9CONTENT newPSH9, NotificationChain msgs) {
		PSH9CONTENT oldPSH9 = pSH9;
		pSH9 = newPSH9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH9, oldPSH9, newPSH9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH9(PSH9CONTENT newPSH9) {
		if (newPSH9 != pSH9) {
			NotificationChain msgs = null;
			if (pSH9 != null)
				msgs = ((InternalEObject)pSH9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH9, null, msgs);
			if (newPSH9 != null)
				msgs = ((InternalEObject)newPSH9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH9, null, msgs);
			msgs = basicSetPSH9(newPSH9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH9, newPSH9, newPSH9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH10CONTENT getPSH10() {
		return pSH10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH10(PSH10CONTENT newPSH10, NotificationChain msgs) {
		PSH10CONTENT oldPSH10 = pSH10;
		pSH10 = newPSH10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH10, oldPSH10, newPSH10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH10(PSH10CONTENT newPSH10) {
		if (newPSH10 != pSH10) {
			NotificationChain msgs = null;
			if (pSH10 != null)
				msgs = ((InternalEObject)pSH10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH10, null, msgs);
			if (newPSH10 != null)
				msgs = ((InternalEObject)newPSH10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH10, null, msgs);
			msgs = basicSetPSH10(newPSH10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH10, newPSH10, newPSH10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH11CONTENT getPSH11() {
		return pSH11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH11(PSH11CONTENT newPSH11, NotificationChain msgs) {
		PSH11CONTENT oldPSH11 = pSH11;
		pSH11 = newPSH11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH11, oldPSH11, newPSH11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH11(PSH11CONTENT newPSH11) {
		if (newPSH11 != pSH11) {
			NotificationChain msgs = null;
			if (pSH11 != null)
				msgs = ((InternalEObject)pSH11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH11, null, msgs);
			if (newPSH11 != null)
				msgs = ((InternalEObject)newPSH11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH11, null, msgs);
			msgs = basicSetPSH11(newPSH11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH11, newPSH11, newPSH11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSH12CONTENT getPSH12() {
		return pSH12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPSH12(PSH12CONTENT newPSH12, NotificationChain msgs) {
		PSH12CONTENT oldPSH12 = pSH12;
		pSH12 = newPSH12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH12, oldPSH12, newPSH12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPSH12(PSH12CONTENT newPSH12) {
		if (newPSH12 != pSH12) {
			NotificationChain msgs = null;
			if (pSH12 != null)
				msgs = ((InternalEObject)pSH12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH12, null, msgs);
			if (newPSH12 != null)
				msgs = ((InternalEObject)newPSH12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PSHCONTENT__PSH12, null, msgs);
			msgs = basicSetPSH12(newPSH12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PSHCONTENT__PSH12, newPSH12, newPSH12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSH13CONTENT> getPSH13() {
		if (pSH13 == null) {
			pSH13 = new EObjectContainmentEList<PSH13CONTENT>(PSH13CONTENT.class, this, V2xmlPackage.PSHCONTENT__PSH13);
		}
		return pSH13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PSH14CONTENT> getPSH14() {
		if (pSH14 == null) {
			pSH14 = new EObjectContainmentEList<PSH14CONTENT>(PSH14CONTENT.class, this, V2xmlPackage.PSHCONTENT__PSH14);
		}
		return pSH14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PSHCONTENT__ANY);
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
			case V2xmlPackage.PSHCONTENT__PSH1:
				return basicSetPSH1(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH2:
				return basicSetPSH2(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH3:
				return basicSetPSH3(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH4:
				return basicSetPSH4(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH5:
				return basicSetPSH5(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH6:
				return basicSetPSH6(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH7:
				return basicSetPSH7(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH8:
				return basicSetPSH8(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH9:
				return basicSetPSH9(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH10:
				return basicSetPSH10(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH11:
				return basicSetPSH11(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH12:
				return basicSetPSH12(null, msgs);
			case V2xmlPackage.PSHCONTENT__PSH13:
				return ((InternalEList<?>)getPSH13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PSHCONTENT__PSH14:
				return ((InternalEList<?>)getPSH14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PSHCONTENT__ANY:
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
			case V2xmlPackage.PSHCONTENT__PSH1:
				return getPSH1();
			case V2xmlPackage.PSHCONTENT__PSH2:
				return getPSH2();
			case V2xmlPackage.PSHCONTENT__PSH3:
				return getPSH3();
			case V2xmlPackage.PSHCONTENT__PSH4:
				return getPSH4();
			case V2xmlPackage.PSHCONTENT__PSH5:
				return getPSH5();
			case V2xmlPackage.PSHCONTENT__PSH6:
				return getPSH6();
			case V2xmlPackage.PSHCONTENT__PSH7:
				return getPSH7();
			case V2xmlPackage.PSHCONTENT__PSH8:
				return getPSH8();
			case V2xmlPackage.PSHCONTENT__PSH9:
				return getPSH9();
			case V2xmlPackage.PSHCONTENT__PSH10:
				return getPSH10();
			case V2xmlPackage.PSHCONTENT__PSH11:
				return getPSH11();
			case V2xmlPackage.PSHCONTENT__PSH12:
				return getPSH12();
			case V2xmlPackage.PSHCONTENT__PSH13:
				return getPSH13();
			case V2xmlPackage.PSHCONTENT__PSH14:
				return getPSH14();
			case V2xmlPackage.PSHCONTENT__ANY:
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
			case V2xmlPackage.PSHCONTENT__PSH1:
				setPSH1((PSH1CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH2:
				setPSH2((PSH2CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH3:
				setPSH3((PSH3CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH4:
				setPSH4((PSH4CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH5:
				setPSH5((PSH5CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH6:
				setPSH6((PSH6CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH7:
				setPSH7((PSH7CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH8:
				setPSH8((PSH8CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH9:
				setPSH9((PSH9CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH10:
				setPSH10((PSH10CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH11:
				setPSH11((PSH11CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH12:
				setPSH12((PSH12CONTENT)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH13:
				getPSH13().clear();
				getPSH13().addAll((Collection<? extends PSH13CONTENT>)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__PSH14:
				getPSH14().clear();
				getPSH14().addAll((Collection<? extends PSH14CONTENT>)newValue);
				return;
			case V2xmlPackage.PSHCONTENT__ANY:
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
			case V2xmlPackage.PSHCONTENT__PSH1:
				setPSH1((PSH1CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH2:
				setPSH2((PSH2CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH3:
				setPSH3((PSH3CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH4:
				setPSH4((PSH4CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH5:
				setPSH5((PSH5CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH6:
				setPSH6((PSH6CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH7:
				setPSH7((PSH7CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH8:
				setPSH8((PSH8CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH9:
				setPSH9((PSH9CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH10:
				setPSH10((PSH10CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH11:
				setPSH11((PSH11CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH12:
				setPSH12((PSH12CONTENT)null);
				return;
			case V2xmlPackage.PSHCONTENT__PSH13:
				getPSH13().clear();
				return;
			case V2xmlPackage.PSHCONTENT__PSH14:
				getPSH14().clear();
				return;
			case V2xmlPackage.PSHCONTENT__ANY:
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
			case V2xmlPackage.PSHCONTENT__PSH1:
				return pSH1 != null;
			case V2xmlPackage.PSHCONTENT__PSH2:
				return pSH2 != null;
			case V2xmlPackage.PSHCONTENT__PSH3:
				return pSH3 != null;
			case V2xmlPackage.PSHCONTENT__PSH4:
				return pSH4 != null;
			case V2xmlPackage.PSHCONTENT__PSH5:
				return pSH5 != null;
			case V2xmlPackage.PSHCONTENT__PSH6:
				return pSH6 != null;
			case V2xmlPackage.PSHCONTENT__PSH7:
				return pSH7 != null;
			case V2xmlPackage.PSHCONTENT__PSH8:
				return pSH8 != null;
			case V2xmlPackage.PSHCONTENT__PSH9:
				return pSH9 != null;
			case V2xmlPackage.PSHCONTENT__PSH10:
				return pSH10 != null;
			case V2xmlPackage.PSHCONTENT__PSH11:
				return pSH11 != null;
			case V2xmlPackage.PSHCONTENT__PSH12:
				return pSH12 != null;
			case V2xmlPackage.PSHCONTENT__PSH13:
				return pSH13 != null && !pSH13.isEmpty();
			case V2xmlPackage.PSHCONTENT__PSH14:
				return pSH14 != null && !pSH14.isEmpty();
			case V2xmlPackage.PSHCONTENT__ANY:
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

} //PSHCONTENTImpl
