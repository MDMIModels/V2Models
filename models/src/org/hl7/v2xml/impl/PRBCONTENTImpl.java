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

import org.hl7.v2xml.PRB10CONTENT;
import org.hl7.v2xml.PRB11CONTENT;
import org.hl7.v2xml.PRB12CONTENT;
import org.hl7.v2xml.PRB13CONTENT;
import org.hl7.v2xml.PRB14CONTENT;
import org.hl7.v2xml.PRB15CONTENT;
import org.hl7.v2xml.PRB16CONTENT;
import org.hl7.v2xml.PRB17CONTENT;
import org.hl7.v2xml.PRB18CONTENT;
import org.hl7.v2xml.PRB19CONTENT;
import org.hl7.v2xml.PRB1CONTENT;
import org.hl7.v2xml.PRB20CONTENT;
import org.hl7.v2xml.PRB21CONTENT;
import org.hl7.v2xml.PRB22CONTENT;
import org.hl7.v2xml.PRB23CONTENT;
import org.hl7.v2xml.PRB24CONTENT;
import org.hl7.v2xml.PRB25CONTENT;
import org.hl7.v2xml.PRB2CONTENT;
import org.hl7.v2xml.PRB3CONTENT;
import org.hl7.v2xml.PRB4CONTENT;
import org.hl7.v2xml.PRB5CONTENT;
import org.hl7.v2xml.PRB6CONTENT;
import org.hl7.v2xml.PRB7CONTENT;
import org.hl7.v2xml.PRB8CONTENT;
import org.hl7.v2xml.PRB9CONTENT;
import org.hl7.v2xml.PRBCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PRBCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB1 <em>PRB1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB2 <em>PRB2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB3 <em>PRB3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB4 <em>PRB4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB5 <em>PRB5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB6 <em>PRB6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB7 <em>PRB7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB8 <em>PRB8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB9 <em>PRB9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB10 <em>PRB10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB11 <em>PRB11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB12 <em>PRB12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB13 <em>PRB13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB14 <em>PRB14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB15 <em>PRB15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB16 <em>PRB16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB17 <em>PRB17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB18 <em>PRB18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB19 <em>PRB19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB20 <em>PRB20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB21 <em>PRB21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB22 <em>PRB22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB23 <em>PRB23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB24 <em>PRB24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getPRB25 <em>PRB25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PRBCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRBCONTENTImpl extends EObjectImpl implements PRBCONTENT {
	/**
	 * The cached value of the '{@link #getPRB1() <em>PRB1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB1()
	 * @generated
	 * @ordered
	 */
	protected PRB1CONTENT pRB1;

	/**
	 * The cached value of the '{@link #getPRB2() <em>PRB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB2()
	 * @generated
	 * @ordered
	 */
	protected PRB2CONTENT pRB2;

	/**
	 * The cached value of the '{@link #getPRB3() <em>PRB3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB3()
	 * @generated
	 * @ordered
	 */
	protected PRB3CONTENT pRB3;

	/**
	 * The cached value of the '{@link #getPRB4() <em>PRB4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB4()
	 * @generated
	 * @ordered
	 */
	protected PRB4CONTENT pRB4;

	/**
	 * The cached value of the '{@link #getPRB5() <em>PRB5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB5()
	 * @generated
	 * @ordered
	 */
	protected PRB5CONTENT pRB5;

	/**
	 * The cached value of the '{@link #getPRB6() <em>PRB6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB6()
	 * @generated
	 * @ordered
	 */
	protected PRB6CONTENT pRB6;

	/**
	 * The cached value of the '{@link #getPRB7() <em>PRB7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB7()
	 * @generated
	 * @ordered
	 */
	protected PRB7CONTENT pRB7;

	/**
	 * The cached value of the '{@link #getPRB8() <em>PRB8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB8()
	 * @generated
	 * @ordered
	 */
	protected PRB8CONTENT pRB8;

	/**
	 * The cached value of the '{@link #getPRB9() <em>PRB9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB9()
	 * @generated
	 * @ordered
	 */
	protected PRB9CONTENT pRB9;

	/**
	 * The cached value of the '{@link #getPRB10() <em>PRB10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB10()
	 * @generated
	 * @ordered
	 */
	protected PRB10CONTENT pRB10;

	/**
	 * The cached value of the '{@link #getPRB11() <em>PRB11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB11()
	 * @generated
	 * @ordered
	 */
	protected EList<PRB11CONTENT> pRB11;

	/**
	 * The cached value of the '{@link #getPRB12() <em>PRB12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB12()
	 * @generated
	 * @ordered
	 */
	protected PRB12CONTENT pRB12;

	/**
	 * The cached value of the '{@link #getPRB13() <em>PRB13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB13()
	 * @generated
	 * @ordered
	 */
	protected PRB13CONTENT pRB13;

	/**
	 * The cached value of the '{@link #getPRB14() <em>PRB14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB14()
	 * @generated
	 * @ordered
	 */
	protected PRB14CONTENT pRB14;

	/**
	 * The cached value of the '{@link #getPRB15() <em>PRB15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB15()
	 * @generated
	 * @ordered
	 */
	protected PRB15CONTENT pRB15;

	/**
	 * The cached value of the '{@link #getPRB16() <em>PRB16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB16()
	 * @generated
	 * @ordered
	 */
	protected PRB16CONTENT pRB16;

	/**
	 * The cached value of the '{@link #getPRB17() <em>PRB17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB17()
	 * @generated
	 * @ordered
	 */
	protected PRB17CONTENT pRB17;

	/**
	 * The cached value of the '{@link #getPRB18() <em>PRB18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB18()
	 * @generated
	 * @ordered
	 */
	protected PRB18CONTENT pRB18;

	/**
	 * The cached value of the '{@link #getPRB19() <em>PRB19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB19()
	 * @generated
	 * @ordered
	 */
	protected PRB19CONTENT pRB19;

	/**
	 * The cached value of the '{@link #getPRB20() <em>PRB20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB20()
	 * @generated
	 * @ordered
	 */
	protected PRB20CONTENT pRB20;

	/**
	 * The cached value of the '{@link #getPRB21() <em>PRB21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB21()
	 * @generated
	 * @ordered
	 */
	protected PRB21CONTENT pRB21;

	/**
	 * The cached value of the '{@link #getPRB22() <em>PRB22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB22()
	 * @generated
	 * @ordered
	 */
	protected PRB22CONTENT pRB22;

	/**
	 * The cached value of the '{@link #getPRB23() <em>PRB23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB23()
	 * @generated
	 * @ordered
	 */
	protected PRB23CONTENT pRB23;

	/**
	 * The cached value of the '{@link #getPRB24() <em>PRB24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB24()
	 * @generated
	 * @ordered
	 */
	protected PRB24CONTENT pRB24;

	/**
	 * The cached value of the '{@link #getPRB25() <em>PRB25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRB25()
	 * @generated
	 * @ordered
	 */
	protected PRB25CONTENT pRB25;

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
	protected PRBCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPRBCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB1CONTENT getPRB1() {
		return pRB1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB1(PRB1CONTENT newPRB1, NotificationChain msgs) {
		PRB1CONTENT oldPRB1 = pRB1;
		pRB1 = newPRB1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB1, oldPRB1, newPRB1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB1(PRB1CONTENT newPRB1) {
		if (newPRB1 != pRB1) {
			NotificationChain msgs = null;
			if (pRB1 != null)
				msgs = ((InternalEObject)pRB1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB1, null, msgs);
			if (newPRB1 != null)
				msgs = ((InternalEObject)newPRB1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB1, null, msgs);
			msgs = basicSetPRB1(newPRB1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB1, newPRB1, newPRB1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB2CONTENT getPRB2() {
		return pRB2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB2(PRB2CONTENT newPRB2, NotificationChain msgs) {
		PRB2CONTENT oldPRB2 = pRB2;
		pRB2 = newPRB2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB2, oldPRB2, newPRB2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB2(PRB2CONTENT newPRB2) {
		if (newPRB2 != pRB2) {
			NotificationChain msgs = null;
			if (pRB2 != null)
				msgs = ((InternalEObject)pRB2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB2, null, msgs);
			if (newPRB2 != null)
				msgs = ((InternalEObject)newPRB2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB2, null, msgs);
			msgs = basicSetPRB2(newPRB2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB2, newPRB2, newPRB2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB3CONTENT getPRB3() {
		return pRB3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB3(PRB3CONTENT newPRB3, NotificationChain msgs) {
		PRB3CONTENT oldPRB3 = pRB3;
		pRB3 = newPRB3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB3, oldPRB3, newPRB3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB3(PRB3CONTENT newPRB3) {
		if (newPRB3 != pRB3) {
			NotificationChain msgs = null;
			if (pRB3 != null)
				msgs = ((InternalEObject)pRB3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB3, null, msgs);
			if (newPRB3 != null)
				msgs = ((InternalEObject)newPRB3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB3, null, msgs);
			msgs = basicSetPRB3(newPRB3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB3, newPRB3, newPRB3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB4CONTENT getPRB4() {
		return pRB4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB4(PRB4CONTENT newPRB4, NotificationChain msgs) {
		PRB4CONTENT oldPRB4 = pRB4;
		pRB4 = newPRB4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB4, oldPRB4, newPRB4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB4(PRB4CONTENT newPRB4) {
		if (newPRB4 != pRB4) {
			NotificationChain msgs = null;
			if (pRB4 != null)
				msgs = ((InternalEObject)pRB4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB4, null, msgs);
			if (newPRB4 != null)
				msgs = ((InternalEObject)newPRB4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB4, null, msgs);
			msgs = basicSetPRB4(newPRB4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB4, newPRB4, newPRB4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB5CONTENT getPRB5() {
		return pRB5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB5(PRB5CONTENT newPRB5, NotificationChain msgs) {
		PRB5CONTENT oldPRB5 = pRB5;
		pRB5 = newPRB5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB5, oldPRB5, newPRB5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB5(PRB5CONTENT newPRB5) {
		if (newPRB5 != pRB5) {
			NotificationChain msgs = null;
			if (pRB5 != null)
				msgs = ((InternalEObject)pRB5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB5, null, msgs);
			if (newPRB5 != null)
				msgs = ((InternalEObject)newPRB5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB5, null, msgs);
			msgs = basicSetPRB5(newPRB5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB5, newPRB5, newPRB5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB6CONTENT getPRB6() {
		return pRB6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB6(PRB6CONTENT newPRB6, NotificationChain msgs) {
		PRB6CONTENT oldPRB6 = pRB6;
		pRB6 = newPRB6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB6, oldPRB6, newPRB6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB6(PRB6CONTENT newPRB6) {
		if (newPRB6 != pRB6) {
			NotificationChain msgs = null;
			if (pRB6 != null)
				msgs = ((InternalEObject)pRB6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB6, null, msgs);
			if (newPRB6 != null)
				msgs = ((InternalEObject)newPRB6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB6, null, msgs);
			msgs = basicSetPRB6(newPRB6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB6, newPRB6, newPRB6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB7CONTENT getPRB7() {
		return pRB7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB7(PRB7CONTENT newPRB7, NotificationChain msgs) {
		PRB7CONTENT oldPRB7 = pRB7;
		pRB7 = newPRB7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB7, oldPRB7, newPRB7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB7(PRB7CONTENT newPRB7) {
		if (newPRB7 != pRB7) {
			NotificationChain msgs = null;
			if (pRB7 != null)
				msgs = ((InternalEObject)pRB7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB7, null, msgs);
			if (newPRB7 != null)
				msgs = ((InternalEObject)newPRB7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB7, null, msgs);
			msgs = basicSetPRB7(newPRB7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB7, newPRB7, newPRB7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB8CONTENT getPRB8() {
		return pRB8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB8(PRB8CONTENT newPRB8, NotificationChain msgs) {
		PRB8CONTENT oldPRB8 = pRB8;
		pRB8 = newPRB8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB8, oldPRB8, newPRB8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB8(PRB8CONTENT newPRB8) {
		if (newPRB8 != pRB8) {
			NotificationChain msgs = null;
			if (pRB8 != null)
				msgs = ((InternalEObject)pRB8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB8, null, msgs);
			if (newPRB8 != null)
				msgs = ((InternalEObject)newPRB8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB8, null, msgs);
			msgs = basicSetPRB8(newPRB8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB8, newPRB8, newPRB8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB9CONTENT getPRB9() {
		return pRB9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB9(PRB9CONTENT newPRB9, NotificationChain msgs) {
		PRB9CONTENT oldPRB9 = pRB9;
		pRB9 = newPRB9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB9, oldPRB9, newPRB9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB9(PRB9CONTENT newPRB9) {
		if (newPRB9 != pRB9) {
			NotificationChain msgs = null;
			if (pRB9 != null)
				msgs = ((InternalEObject)pRB9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB9, null, msgs);
			if (newPRB9 != null)
				msgs = ((InternalEObject)newPRB9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB9, null, msgs);
			msgs = basicSetPRB9(newPRB9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB9, newPRB9, newPRB9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB10CONTENT getPRB10() {
		return pRB10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB10(PRB10CONTENT newPRB10, NotificationChain msgs) {
		PRB10CONTENT oldPRB10 = pRB10;
		pRB10 = newPRB10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB10, oldPRB10, newPRB10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB10(PRB10CONTENT newPRB10) {
		if (newPRB10 != pRB10) {
			NotificationChain msgs = null;
			if (pRB10 != null)
				msgs = ((InternalEObject)pRB10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB10, null, msgs);
			if (newPRB10 != null)
				msgs = ((InternalEObject)newPRB10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB10, null, msgs);
			msgs = basicSetPRB10(newPRB10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB10, newPRB10, newPRB10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PRB11CONTENT> getPRB11() {
		if (pRB11 == null) {
			pRB11 = new EObjectContainmentEList<PRB11CONTENT>(PRB11CONTENT.class, this, V2xmlPackage.PRBCONTENT__PRB11);
		}
		return pRB11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB12CONTENT getPRB12() {
		return pRB12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB12(PRB12CONTENT newPRB12, NotificationChain msgs) {
		PRB12CONTENT oldPRB12 = pRB12;
		pRB12 = newPRB12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB12, oldPRB12, newPRB12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB12(PRB12CONTENT newPRB12) {
		if (newPRB12 != pRB12) {
			NotificationChain msgs = null;
			if (pRB12 != null)
				msgs = ((InternalEObject)pRB12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB12, null, msgs);
			if (newPRB12 != null)
				msgs = ((InternalEObject)newPRB12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB12, null, msgs);
			msgs = basicSetPRB12(newPRB12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB12, newPRB12, newPRB12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB13CONTENT getPRB13() {
		return pRB13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB13(PRB13CONTENT newPRB13, NotificationChain msgs) {
		PRB13CONTENT oldPRB13 = pRB13;
		pRB13 = newPRB13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB13, oldPRB13, newPRB13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB13(PRB13CONTENT newPRB13) {
		if (newPRB13 != pRB13) {
			NotificationChain msgs = null;
			if (pRB13 != null)
				msgs = ((InternalEObject)pRB13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB13, null, msgs);
			if (newPRB13 != null)
				msgs = ((InternalEObject)newPRB13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB13, null, msgs);
			msgs = basicSetPRB13(newPRB13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB13, newPRB13, newPRB13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB14CONTENT getPRB14() {
		return pRB14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB14(PRB14CONTENT newPRB14, NotificationChain msgs) {
		PRB14CONTENT oldPRB14 = pRB14;
		pRB14 = newPRB14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB14, oldPRB14, newPRB14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB14(PRB14CONTENT newPRB14) {
		if (newPRB14 != pRB14) {
			NotificationChain msgs = null;
			if (pRB14 != null)
				msgs = ((InternalEObject)pRB14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB14, null, msgs);
			if (newPRB14 != null)
				msgs = ((InternalEObject)newPRB14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB14, null, msgs);
			msgs = basicSetPRB14(newPRB14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB14, newPRB14, newPRB14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB15CONTENT getPRB15() {
		return pRB15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB15(PRB15CONTENT newPRB15, NotificationChain msgs) {
		PRB15CONTENT oldPRB15 = pRB15;
		pRB15 = newPRB15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB15, oldPRB15, newPRB15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB15(PRB15CONTENT newPRB15) {
		if (newPRB15 != pRB15) {
			NotificationChain msgs = null;
			if (pRB15 != null)
				msgs = ((InternalEObject)pRB15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB15, null, msgs);
			if (newPRB15 != null)
				msgs = ((InternalEObject)newPRB15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB15, null, msgs);
			msgs = basicSetPRB15(newPRB15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB15, newPRB15, newPRB15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB16CONTENT getPRB16() {
		return pRB16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB16(PRB16CONTENT newPRB16, NotificationChain msgs) {
		PRB16CONTENT oldPRB16 = pRB16;
		pRB16 = newPRB16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB16, oldPRB16, newPRB16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB16(PRB16CONTENT newPRB16) {
		if (newPRB16 != pRB16) {
			NotificationChain msgs = null;
			if (pRB16 != null)
				msgs = ((InternalEObject)pRB16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB16, null, msgs);
			if (newPRB16 != null)
				msgs = ((InternalEObject)newPRB16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB16, null, msgs);
			msgs = basicSetPRB16(newPRB16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB16, newPRB16, newPRB16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB17CONTENT getPRB17() {
		return pRB17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB17(PRB17CONTENT newPRB17, NotificationChain msgs) {
		PRB17CONTENT oldPRB17 = pRB17;
		pRB17 = newPRB17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB17, oldPRB17, newPRB17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB17(PRB17CONTENT newPRB17) {
		if (newPRB17 != pRB17) {
			NotificationChain msgs = null;
			if (pRB17 != null)
				msgs = ((InternalEObject)pRB17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB17, null, msgs);
			if (newPRB17 != null)
				msgs = ((InternalEObject)newPRB17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB17, null, msgs);
			msgs = basicSetPRB17(newPRB17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB17, newPRB17, newPRB17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB18CONTENT getPRB18() {
		return pRB18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB18(PRB18CONTENT newPRB18, NotificationChain msgs) {
		PRB18CONTENT oldPRB18 = pRB18;
		pRB18 = newPRB18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB18, oldPRB18, newPRB18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB18(PRB18CONTENT newPRB18) {
		if (newPRB18 != pRB18) {
			NotificationChain msgs = null;
			if (pRB18 != null)
				msgs = ((InternalEObject)pRB18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB18, null, msgs);
			if (newPRB18 != null)
				msgs = ((InternalEObject)newPRB18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB18, null, msgs);
			msgs = basicSetPRB18(newPRB18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB18, newPRB18, newPRB18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB19CONTENT getPRB19() {
		return pRB19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB19(PRB19CONTENT newPRB19, NotificationChain msgs) {
		PRB19CONTENT oldPRB19 = pRB19;
		pRB19 = newPRB19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB19, oldPRB19, newPRB19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB19(PRB19CONTENT newPRB19) {
		if (newPRB19 != pRB19) {
			NotificationChain msgs = null;
			if (pRB19 != null)
				msgs = ((InternalEObject)pRB19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB19, null, msgs);
			if (newPRB19 != null)
				msgs = ((InternalEObject)newPRB19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB19, null, msgs);
			msgs = basicSetPRB19(newPRB19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB19, newPRB19, newPRB19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB20CONTENT getPRB20() {
		return pRB20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB20(PRB20CONTENT newPRB20, NotificationChain msgs) {
		PRB20CONTENT oldPRB20 = pRB20;
		pRB20 = newPRB20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB20, oldPRB20, newPRB20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB20(PRB20CONTENT newPRB20) {
		if (newPRB20 != pRB20) {
			NotificationChain msgs = null;
			if (pRB20 != null)
				msgs = ((InternalEObject)pRB20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB20, null, msgs);
			if (newPRB20 != null)
				msgs = ((InternalEObject)newPRB20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB20, null, msgs);
			msgs = basicSetPRB20(newPRB20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB20, newPRB20, newPRB20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB21CONTENT getPRB21() {
		return pRB21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB21(PRB21CONTENT newPRB21, NotificationChain msgs) {
		PRB21CONTENT oldPRB21 = pRB21;
		pRB21 = newPRB21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB21, oldPRB21, newPRB21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB21(PRB21CONTENT newPRB21) {
		if (newPRB21 != pRB21) {
			NotificationChain msgs = null;
			if (pRB21 != null)
				msgs = ((InternalEObject)pRB21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB21, null, msgs);
			if (newPRB21 != null)
				msgs = ((InternalEObject)newPRB21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB21, null, msgs);
			msgs = basicSetPRB21(newPRB21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB21, newPRB21, newPRB21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB22CONTENT getPRB22() {
		return pRB22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB22(PRB22CONTENT newPRB22, NotificationChain msgs) {
		PRB22CONTENT oldPRB22 = pRB22;
		pRB22 = newPRB22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB22, oldPRB22, newPRB22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB22(PRB22CONTENT newPRB22) {
		if (newPRB22 != pRB22) {
			NotificationChain msgs = null;
			if (pRB22 != null)
				msgs = ((InternalEObject)pRB22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB22, null, msgs);
			if (newPRB22 != null)
				msgs = ((InternalEObject)newPRB22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB22, null, msgs);
			msgs = basicSetPRB22(newPRB22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB22, newPRB22, newPRB22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB23CONTENT getPRB23() {
		return pRB23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB23(PRB23CONTENT newPRB23, NotificationChain msgs) {
		PRB23CONTENT oldPRB23 = pRB23;
		pRB23 = newPRB23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB23, oldPRB23, newPRB23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB23(PRB23CONTENT newPRB23) {
		if (newPRB23 != pRB23) {
			NotificationChain msgs = null;
			if (pRB23 != null)
				msgs = ((InternalEObject)pRB23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB23, null, msgs);
			if (newPRB23 != null)
				msgs = ((InternalEObject)newPRB23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB23, null, msgs);
			msgs = basicSetPRB23(newPRB23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB23, newPRB23, newPRB23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB24CONTENT getPRB24() {
		return pRB24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB24(PRB24CONTENT newPRB24, NotificationChain msgs) {
		PRB24CONTENT oldPRB24 = pRB24;
		pRB24 = newPRB24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB24, oldPRB24, newPRB24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB24(PRB24CONTENT newPRB24) {
		if (newPRB24 != pRB24) {
			NotificationChain msgs = null;
			if (pRB24 != null)
				msgs = ((InternalEObject)pRB24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB24, null, msgs);
			if (newPRB24 != null)
				msgs = ((InternalEObject)newPRB24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB24, null, msgs);
			msgs = basicSetPRB24(newPRB24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB24, newPRB24, newPRB24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PRB25CONTENT getPRB25() {
		return pRB25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPRB25(PRB25CONTENT newPRB25, NotificationChain msgs) {
		PRB25CONTENT oldPRB25 = pRB25;
		pRB25 = newPRB25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB25, oldPRB25, newPRB25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPRB25(PRB25CONTENT newPRB25) {
		if (newPRB25 != pRB25) {
			NotificationChain msgs = null;
			if (pRB25 != null)
				msgs = ((InternalEObject)pRB25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB25, null, msgs);
			if (newPRB25 != null)
				msgs = ((InternalEObject)newPRB25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PRBCONTENT__PRB25, null, msgs);
			msgs = basicSetPRB25(newPRB25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PRBCONTENT__PRB25, newPRB25, newPRB25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PRBCONTENT__ANY);
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
			case V2xmlPackage.PRBCONTENT__PRB1:
				return basicSetPRB1(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB2:
				return basicSetPRB2(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB3:
				return basicSetPRB3(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB4:
				return basicSetPRB4(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB5:
				return basicSetPRB5(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB6:
				return basicSetPRB6(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB7:
				return basicSetPRB7(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB8:
				return basicSetPRB8(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB9:
				return basicSetPRB9(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB10:
				return basicSetPRB10(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB11:
				return ((InternalEList<?>)getPRB11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PRBCONTENT__PRB12:
				return basicSetPRB12(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB13:
				return basicSetPRB13(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB14:
				return basicSetPRB14(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB15:
				return basicSetPRB15(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB16:
				return basicSetPRB16(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB17:
				return basicSetPRB17(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB18:
				return basicSetPRB18(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB19:
				return basicSetPRB19(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB20:
				return basicSetPRB20(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB21:
				return basicSetPRB21(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB22:
				return basicSetPRB22(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB23:
				return basicSetPRB23(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB24:
				return basicSetPRB24(null, msgs);
			case V2xmlPackage.PRBCONTENT__PRB25:
				return basicSetPRB25(null, msgs);
			case V2xmlPackage.PRBCONTENT__ANY:
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
			case V2xmlPackage.PRBCONTENT__PRB1:
				return getPRB1();
			case V2xmlPackage.PRBCONTENT__PRB2:
				return getPRB2();
			case V2xmlPackage.PRBCONTENT__PRB3:
				return getPRB3();
			case V2xmlPackage.PRBCONTENT__PRB4:
				return getPRB4();
			case V2xmlPackage.PRBCONTENT__PRB5:
				return getPRB5();
			case V2xmlPackage.PRBCONTENT__PRB6:
				return getPRB6();
			case V2xmlPackage.PRBCONTENT__PRB7:
				return getPRB7();
			case V2xmlPackage.PRBCONTENT__PRB8:
				return getPRB8();
			case V2xmlPackage.PRBCONTENT__PRB9:
				return getPRB9();
			case V2xmlPackage.PRBCONTENT__PRB10:
				return getPRB10();
			case V2xmlPackage.PRBCONTENT__PRB11:
				return getPRB11();
			case V2xmlPackage.PRBCONTENT__PRB12:
				return getPRB12();
			case V2xmlPackage.PRBCONTENT__PRB13:
				return getPRB13();
			case V2xmlPackage.PRBCONTENT__PRB14:
				return getPRB14();
			case V2xmlPackage.PRBCONTENT__PRB15:
				return getPRB15();
			case V2xmlPackage.PRBCONTENT__PRB16:
				return getPRB16();
			case V2xmlPackage.PRBCONTENT__PRB17:
				return getPRB17();
			case V2xmlPackage.PRBCONTENT__PRB18:
				return getPRB18();
			case V2xmlPackage.PRBCONTENT__PRB19:
				return getPRB19();
			case V2xmlPackage.PRBCONTENT__PRB20:
				return getPRB20();
			case V2xmlPackage.PRBCONTENT__PRB21:
				return getPRB21();
			case V2xmlPackage.PRBCONTENT__PRB22:
				return getPRB22();
			case V2xmlPackage.PRBCONTENT__PRB23:
				return getPRB23();
			case V2xmlPackage.PRBCONTENT__PRB24:
				return getPRB24();
			case V2xmlPackage.PRBCONTENT__PRB25:
				return getPRB25();
			case V2xmlPackage.PRBCONTENT__ANY:
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
			case V2xmlPackage.PRBCONTENT__PRB1:
				setPRB1((PRB1CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB2:
				setPRB2((PRB2CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB3:
				setPRB3((PRB3CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB4:
				setPRB4((PRB4CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB5:
				setPRB5((PRB5CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB6:
				setPRB6((PRB6CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB7:
				setPRB7((PRB7CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB8:
				setPRB8((PRB8CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB9:
				setPRB9((PRB9CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB10:
				setPRB10((PRB10CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB11:
				getPRB11().clear();
				getPRB11().addAll((Collection<? extends PRB11CONTENT>)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB12:
				setPRB12((PRB12CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB13:
				setPRB13((PRB13CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB14:
				setPRB14((PRB14CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB15:
				setPRB15((PRB15CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB16:
				setPRB16((PRB16CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB17:
				setPRB17((PRB17CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB18:
				setPRB18((PRB18CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB19:
				setPRB19((PRB19CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB20:
				setPRB20((PRB20CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB21:
				setPRB21((PRB21CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB22:
				setPRB22((PRB22CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB23:
				setPRB23((PRB23CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB24:
				setPRB24((PRB24CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__PRB25:
				setPRB25((PRB25CONTENT)newValue);
				return;
			case V2xmlPackage.PRBCONTENT__ANY:
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
			case V2xmlPackage.PRBCONTENT__PRB1:
				setPRB1((PRB1CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB2:
				setPRB2((PRB2CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB3:
				setPRB3((PRB3CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB4:
				setPRB4((PRB4CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB5:
				setPRB5((PRB5CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB6:
				setPRB6((PRB6CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB7:
				setPRB7((PRB7CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB8:
				setPRB8((PRB8CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB9:
				setPRB9((PRB9CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB10:
				setPRB10((PRB10CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB11:
				getPRB11().clear();
				return;
			case V2xmlPackage.PRBCONTENT__PRB12:
				setPRB12((PRB12CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB13:
				setPRB13((PRB13CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB14:
				setPRB14((PRB14CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB15:
				setPRB15((PRB15CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB16:
				setPRB16((PRB16CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB17:
				setPRB17((PRB17CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB18:
				setPRB18((PRB18CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB19:
				setPRB19((PRB19CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB20:
				setPRB20((PRB20CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB21:
				setPRB21((PRB21CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB22:
				setPRB22((PRB22CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB23:
				setPRB23((PRB23CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB24:
				setPRB24((PRB24CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__PRB25:
				setPRB25((PRB25CONTENT)null);
				return;
			case V2xmlPackage.PRBCONTENT__ANY:
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
			case V2xmlPackage.PRBCONTENT__PRB1:
				return pRB1 != null;
			case V2xmlPackage.PRBCONTENT__PRB2:
				return pRB2 != null;
			case V2xmlPackage.PRBCONTENT__PRB3:
				return pRB3 != null;
			case V2xmlPackage.PRBCONTENT__PRB4:
				return pRB4 != null;
			case V2xmlPackage.PRBCONTENT__PRB5:
				return pRB5 != null;
			case V2xmlPackage.PRBCONTENT__PRB6:
				return pRB6 != null;
			case V2xmlPackage.PRBCONTENT__PRB7:
				return pRB7 != null;
			case V2xmlPackage.PRBCONTENT__PRB8:
				return pRB8 != null;
			case V2xmlPackage.PRBCONTENT__PRB9:
				return pRB9 != null;
			case V2xmlPackage.PRBCONTENT__PRB10:
				return pRB10 != null;
			case V2xmlPackage.PRBCONTENT__PRB11:
				return pRB11 != null && !pRB11.isEmpty();
			case V2xmlPackage.PRBCONTENT__PRB12:
				return pRB12 != null;
			case V2xmlPackage.PRBCONTENT__PRB13:
				return pRB13 != null;
			case V2xmlPackage.PRBCONTENT__PRB14:
				return pRB14 != null;
			case V2xmlPackage.PRBCONTENT__PRB15:
				return pRB15 != null;
			case V2xmlPackage.PRBCONTENT__PRB16:
				return pRB16 != null;
			case V2xmlPackage.PRBCONTENT__PRB17:
				return pRB17 != null;
			case V2xmlPackage.PRBCONTENT__PRB18:
				return pRB18 != null;
			case V2xmlPackage.PRBCONTENT__PRB19:
				return pRB19 != null;
			case V2xmlPackage.PRBCONTENT__PRB20:
				return pRB20 != null;
			case V2xmlPackage.PRBCONTENT__PRB21:
				return pRB21 != null;
			case V2xmlPackage.PRBCONTENT__PRB22:
				return pRB22 != null;
			case V2xmlPackage.PRBCONTENT__PRB23:
				return pRB23 != null;
			case V2xmlPackage.PRBCONTENT__PRB24:
				return pRB24 != null;
			case V2xmlPackage.PRBCONTENT__PRB25:
				return pRB25 != null;
			case V2xmlPackage.PRBCONTENT__ANY:
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

} //PRBCONTENTImpl
