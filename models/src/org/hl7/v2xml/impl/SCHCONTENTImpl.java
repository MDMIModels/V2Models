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

import org.hl7.v2xml.SCH10CONTENT;
import org.hl7.v2xml.SCH11CONTENT;
import org.hl7.v2xml.SCH12CONTENT;
import org.hl7.v2xml.SCH13CONTENT;
import org.hl7.v2xml.SCH14CONTENT;
import org.hl7.v2xml.SCH15CONTENT;
import org.hl7.v2xml.SCH16CONTENT;
import org.hl7.v2xml.SCH17CONTENT;
import org.hl7.v2xml.SCH18CONTENT;
import org.hl7.v2xml.SCH19CONTENT;
import org.hl7.v2xml.SCH1CONTENT;
import org.hl7.v2xml.SCH20CONTENT;
import org.hl7.v2xml.SCH21CONTENT;
import org.hl7.v2xml.SCH22CONTENT;
import org.hl7.v2xml.SCH23CONTENT;
import org.hl7.v2xml.SCH24CONTENT;
import org.hl7.v2xml.SCH25CONTENT;
import org.hl7.v2xml.SCH26CONTENT;
import org.hl7.v2xml.SCH27CONTENT;
import org.hl7.v2xml.SCH2CONTENT;
import org.hl7.v2xml.SCH3CONTENT;
import org.hl7.v2xml.SCH4CONTENT;
import org.hl7.v2xml.SCH5CONTENT;
import org.hl7.v2xml.SCH6CONTENT;
import org.hl7.v2xml.SCH7CONTENT;
import org.hl7.v2xml.SCH8CONTENT;
import org.hl7.v2xml.SCH9CONTENT;
import org.hl7.v2xml.SCHCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SCHCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH1 <em>SCH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH2 <em>SCH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH3 <em>SCH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH4 <em>SCH4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH5 <em>SCH5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH6 <em>SCH6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH7 <em>SCH7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH8 <em>SCH8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH9 <em>SCH9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH10 <em>SCH10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH11 <em>SCH11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH12 <em>SCH12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH13 <em>SCH13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH14 <em>SCH14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH15 <em>SCH15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH16 <em>SCH16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH17 <em>SCH17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH18 <em>SCH18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH19 <em>SCH19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH20 <em>SCH20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH21 <em>SCH21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH22 <em>SCH22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH23 <em>SCH23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH24 <em>SCH24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH25 <em>SCH25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH26 <em>SCH26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getSCH27 <em>SCH27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.SCHCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SCHCONTENTImpl extends EObjectImpl implements SCHCONTENT {
	/**
	 * The cached value of the '{@link #getSCH1() <em>SCH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH1()
	 * @generated
	 * @ordered
	 */
	protected SCH1CONTENT sCH1;

	/**
	 * The cached value of the '{@link #getSCH2() <em>SCH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH2()
	 * @generated
	 * @ordered
	 */
	protected SCH2CONTENT sCH2;

	/**
	 * The cached value of the '{@link #getSCH3() <em>SCH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH3()
	 * @generated
	 * @ordered
	 */
	protected SCH3CONTENT sCH3;

	/**
	 * The cached value of the '{@link #getSCH4() <em>SCH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH4()
	 * @generated
	 * @ordered
	 */
	protected SCH4CONTENT sCH4;

	/**
	 * The cached value of the '{@link #getSCH5() <em>SCH5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH5()
	 * @generated
	 * @ordered
	 */
	protected SCH5CONTENT sCH5;

	/**
	 * The cached value of the '{@link #getSCH6() <em>SCH6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH6()
	 * @generated
	 * @ordered
	 */
	protected SCH6CONTENT sCH6;

	/**
	 * The cached value of the '{@link #getSCH7() <em>SCH7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH7()
	 * @generated
	 * @ordered
	 */
	protected SCH7CONTENT sCH7;

	/**
	 * The cached value of the '{@link #getSCH8() <em>SCH8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH8()
	 * @generated
	 * @ordered
	 */
	protected SCH8CONTENT sCH8;

	/**
	 * The cached value of the '{@link #getSCH9() <em>SCH9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH9()
	 * @generated
	 * @ordered
	 */
	protected SCH9CONTENT sCH9;

	/**
	 * The cached value of the '{@link #getSCH10() <em>SCH10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH10()
	 * @generated
	 * @ordered
	 */
	protected SCH10CONTENT sCH10;

	/**
	 * The cached value of the '{@link #getSCH11() <em>SCH11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH11()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH11CONTENT> sCH11;

	/**
	 * The cached value of the '{@link #getSCH12() <em>SCH12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH12()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH12CONTENT> sCH12;

	/**
	 * The cached value of the '{@link #getSCH13() <em>SCH13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH13()
	 * @generated
	 * @ordered
	 */
	protected SCH13CONTENT sCH13;

	/**
	 * The cached value of the '{@link #getSCH14() <em>SCH14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH14()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH14CONTENT> sCH14;

	/**
	 * The cached value of the '{@link #getSCH15() <em>SCH15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH15()
	 * @generated
	 * @ordered
	 */
	protected SCH15CONTENT sCH15;

	/**
	 * The cached value of the '{@link #getSCH16() <em>SCH16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH16()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH16CONTENT> sCH16;

	/**
	 * The cached value of the '{@link #getSCH17() <em>SCH17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH17()
	 * @generated
	 * @ordered
	 */
	protected SCH17CONTENT sCH17;

	/**
	 * The cached value of the '{@link #getSCH18() <em>SCH18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH18()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH18CONTENT> sCH18;

	/**
	 * The cached value of the '{@link #getSCH19() <em>SCH19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH19()
	 * @generated
	 * @ordered
	 */
	protected SCH19CONTENT sCH19;

	/**
	 * The cached value of the '{@link #getSCH20() <em>SCH20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH20()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH20CONTENT> sCH20;

	/**
	 * The cached value of the '{@link #getSCH21() <em>SCH21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH21()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH21CONTENT> sCH21;

	/**
	 * The cached value of the '{@link #getSCH22() <em>SCH22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH22()
	 * @generated
	 * @ordered
	 */
	protected SCH22CONTENT sCH22;

	/**
	 * The cached value of the '{@link #getSCH23() <em>SCH23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH23()
	 * @generated
	 * @ordered
	 */
	protected SCH23CONTENT sCH23;

	/**
	 * The cached value of the '{@link #getSCH24() <em>SCH24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH24()
	 * @generated
	 * @ordered
	 */
	protected SCH24CONTENT sCH24;

	/**
	 * The cached value of the '{@link #getSCH25() <em>SCH25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH25()
	 * @generated
	 * @ordered
	 */
	protected SCH25CONTENT sCH25;

	/**
	 * The cached value of the '{@link #getSCH26() <em>SCH26</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH26()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH26CONTENT> sCH26;

	/**
	 * The cached value of the '{@link #getSCH27() <em>SCH27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSCH27()
	 * @generated
	 * @ordered
	 */
	protected EList<SCH27CONTENT> sCH27;

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
	protected SCHCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getSCHCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH1CONTENT getSCH1() {
		return sCH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH1(SCH1CONTENT newSCH1, NotificationChain msgs) {
		SCH1CONTENT oldSCH1 = sCH1;
		sCH1 = newSCH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH1, oldSCH1, newSCH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH1(SCH1CONTENT newSCH1) {
		if (newSCH1 != sCH1) {
			NotificationChain msgs = null;
			if (sCH1 != null)
				msgs = ((InternalEObject)sCH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH1, null, msgs);
			if (newSCH1 != null)
				msgs = ((InternalEObject)newSCH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH1, null, msgs);
			msgs = basicSetSCH1(newSCH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH1, newSCH1, newSCH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH2CONTENT getSCH2() {
		return sCH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH2(SCH2CONTENT newSCH2, NotificationChain msgs) {
		SCH2CONTENT oldSCH2 = sCH2;
		sCH2 = newSCH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH2, oldSCH2, newSCH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH2(SCH2CONTENT newSCH2) {
		if (newSCH2 != sCH2) {
			NotificationChain msgs = null;
			if (sCH2 != null)
				msgs = ((InternalEObject)sCH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH2, null, msgs);
			if (newSCH2 != null)
				msgs = ((InternalEObject)newSCH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH2, null, msgs);
			msgs = basicSetSCH2(newSCH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH2, newSCH2, newSCH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH3CONTENT getSCH3() {
		return sCH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH3(SCH3CONTENT newSCH3, NotificationChain msgs) {
		SCH3CONTENT oldSCH3 = sCH3;
		sCH3 = newSCH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH3, oldSCH3, newSCH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH3(SCH3CONTENT newSCH3) {
		if (newSCH3 != sCH3) {
			NotificationChain msgs = null;
			if (sCH3 != null)
				msgs = ((InternalEObject)sCH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH3, null, msgs);
			if (newSCH3 != null)
				msgs = ((InternalEObject)newSCH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH3, null, msgs);
			msgs = basicSetSCH3(newSCH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH3, newSCH3, newSCH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH4CONTENT getSCH4() {
		return sCH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH4(SCH4CONTENT newSCH4, NotificationChain msgs) {
		SCH4CONTENT oldSCH4 = sCH4;
		sCH4 = newSCH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH4, oldSCH4, newSCH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH4(SCH4CONTENT newSCH4) {
		if (newSCH4 != sCH4) {
			NotificationChain msgs = null;
			if (sCH4 != null)
				msgs = ((InternalEObject)sCH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH4, null, msgs);
			if (newSCH4 != null)
				msgs = ((InternalEObject)newSCH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH4, null, msgs);
			msgs = basicSetSCH4(newSCH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH4, newSCH4, newSCH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH5CONTENT getSCH5() {
		return sCH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH5(SCH5CONTENT newSCH5, NotificationChain msgs) {
		SCH5CONTENT oldSCH5 = sCH5;
		sCH5 = newSCH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH5, oldSCH5, newSCH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH5(SCH5CONTENT newSCH5) {
		if (newSCH5 != sCH5) {
			NotificationChain msgs = null;
			if (sCH5 != null)
				msgs = ((InternalEObject)sCH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH5, null, msgs);
			if (newSCH5 != null)
				msgs = ((InternalEObject)newSCH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH5, null, msgs);
			msgs = basicSetSCH5(newSCH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH5, newSCH5, newSCH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH6CONTENT getSCH6() {
		return sCH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH6(SCH6CONTENT newSCH6, NotificationChain msgs) {
		SCH6CONTENT oldSCH6 = sCH6;
		sCH6 = newSCH6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH6, oldSCH6, newSCH6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH6(SCH6CONTENT newSCH6) {
		if (newSCH6 != sCH6) {
			NotificationChain msgs = null;
			if (sCH6 != null)
				msgs = ((InternalEObject)sCH6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH6, null, msgs);
			if (newSCH6 != null)
				msgs = ((InternalEObject)newSCH6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH6, null, msgs);
			msgs = basicSetSCH6(newSCH6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH6, newSCH6, newSCH6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH7CONTENT getSCH7() {
		return sCH7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH7(SCH7CONTENT newSCH7, NotificationChain msgs) {
		SCH7CONTENT oldSCH7 = sCH7;
		sCH7 = newSCH7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH7, oldSCH7, newSCH7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH7(SCH7CONTENT newSCH7) {
		if (newSCH7 != sCH7) {
			NotificationChain msgs = null;
			if (sCH7 != null)
				msgs = ((InternalEObject)sCH7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH7, null, msgs);
			if (newSCH7 != null)
				msgs = ((InternalEObject)newSCH7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH7, null, msgs);
			msgs = basicSetSCH7(newSCH7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH7, newSCH7, newSCH7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH8CONTENT getSCH8() {
		return sCH8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH8(SCH8CONTENT newSCH8, NotificationChain msgs) {
		SCH8CONTENT oldSCH8 = sCH8;
		sCH8 = newSCH8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH8, oldSCH8, newSCH8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH8(SCH8CONTENT newSCH8) {
		if (newSCH8 != sCH8) {
			NotificationChain msgs = null;
			if (sCH8 != null)
				msgs = ((InternalEObject)sCH8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH8, null, msgs);
			if (newSCH8 != null)
				msgs = ((InternalEObject)newSCH8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH8, null, msgs);
			msgs = basicSetSCH8(newSCH8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH8, newSCH8, newSCH8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH9CONTENT getSCH9() {
		return sCH9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH9(SCH9CONTENT newSCH9, NotificationChain msgs) {
		SCH9CONTENT oldSCH9 = sCH9;
		sCH9 = newSCH9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH9, oldSCH9, newSCH9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH9(SCH9CONTENT newSCH9) {
		if (newSCH9 != sCH9) {
			NotificationChain msgs = null;
			if (sCH9 != null)
				msgs = ((InternalEObject)sCH9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH9, null, msgs);
			if (newSCH9 != null)
				msgs = ((InternalEObject)newSCH9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH9, null, msgs);
			msgs = basicSetSCH9(newSCH9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH9, newSCH9, newSCH9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH10CONTENT getSCH10() {
		return sCH10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH10(SCH10CONTENT newSCH10, NotificationChain msgs) {
		SCH10CONTENT oldSCH10 = sCH10;
		sCH10 = newSCH10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH10, oldSCH10, newSCH10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH10(SCH10CONTENT newSCH10) {
		if (newSCH10 != sCH10) {
			NotificationChain msgs = null;
			if (sCH10 != null)
				msgs = ((InternalEObject)sCH10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH10, null, msgs);
			if (newSCH10 != null)
				msgs = ((InternalEObject)newSCH10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH10, null, msgs);
			msgs = basicSetSCH10(newSCH10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH10, newSCH10, newSCH10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH11CONTENT> getSCH11() {
		if (sCH11 == null) {
			sCH11 = new EObjectContainmentEList<SCH11CONTENT>(SCH11CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH11);
		}
		return sCH11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH12CONTENT> getSCH12() {
		if (sCH12 == null) {
			sCH12 = new EObjectContainmentEList<SCH12CONTENT>(SCH12CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH12);
		}
		return sCH12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH13CONTENT getSCH13() {
		return sCH13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH13(SCH13CONTENT newSCH13, NotificationChain msgs) {
		SCH13CONTENT oldSCH13 = sCH13;
		sCH13 = newSCH13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH13, oldSCH13, newSCH13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH13(SCH13CONTENT newSCH13) {
		if (newSCH13 != sCH13) {
			NotificationChain msgs = null;
			if (sCH13 != null)
				msgs = ((InternalEObject)sCH13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH13, null, msgs);
			if (newSCH13 != null)
				msgs = ((InternalEObject)newSCH13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH13, null, msgs);
			msgs = basicSetSCH13(newSCH13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH13, newSCH13, newSCH13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH14CONTENT> getSCH14() {
		if (sCH14 == null) {
			sCH14 = new EObjectContainmentEList<SCH14CONTENT>(SCH14CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH14);
		}
		return sCH14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH15CONTENT getSCH15() {
		return sCH15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH15(SCH15CONTENT newSCH15, NotificationChain msgs) {
		SCH15CONTENT oldSCH15 = sCH15;
		sCH15 = newSCH15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH15, oldSCH15, newSCH15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH15(SCH15CONTENT newSCH15) {
		if (newSCH15 != sCH15) {
			NotificationChain msgs = null;
			if (sCH15 != null)
				msgs = ((InternalEObject)sCH15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH15, null, msgs);
			if (newSCH15 != null)
				msgs = ((InternalEObject)newSCH15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH15, null, msgs);
			msgs = basicSetSCH15(newSCH15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH15, newSCH15, newSCH15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH16CONTENT> getSCH16() {
		if (sCH16 == null) {
			sCH16 = new EObjectContainmentEList<SCH16CONTENT>(SCH16CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH16);
		}
		return sCH16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH17CONTENT getSCH17() {
		return sCH17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH17(SCH17CONTENT newSCH17, NotificationChain msgs) {
		SCH17CONTENT oldSCH17 = sCH17;
		sCH17 = newSCH17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH17, oldSCH17, newSCH17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH17(SCH17CONTENT newSCH17) {
		if (newSCH17 != sCH17) {
			NotificationChain msgs = null;
			if (sCH17 != null)
				msgs = ((InternalEObject)sCH17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH17, null, msgs);
			if (newSCH17 != null)
				msgs = ((InternalEObject)newSCH17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH17, null, msgs);
			msgs = basicSetSCH17(newSCH17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH17, newSCH17, newSCH17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH18CONTENT> getSCH18() {
		if (sCH18 == null) {
			sCH18 = new EObjectContainmentEList<SCH18CONTENT>(SCH18CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH18);
		}
		return sCH18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH19CONTENT getSCH19() {
		return sCH19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH19(SCH19CONTENT newSCH19, NotificationChain msgs) {
		SCH19CONTENT oldSCH19 = sCH19;
		sCH19 = newSCH19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH19, oldSCH19, newSCH19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH19(SCH19CONTENT newSCH19) {
		if (newSCH19 != sCH19) {
			NotificationChain msgs = null;
			if (sCH19 != null)
				msgs = ((InternalEObject)sCH19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH19, null, msgs);
			if (newSCH19 != null)
				msgs = ((InternalEObject)newSCH19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH19, null, msgs);
			msgs = basicSetSCH19(newSCH19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH19, newSCH19, newSCH19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH20CONTENT> getSCH20() {
		if (sCH20 == null) {
			sCH20 = new EObjectContainmentEList<SCH20CONTENT>(SCH20CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH20);
		}
		return sCH20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH21CONTENT> getSCH21() {
		if (sCH21 == null) {
			sCH21 = new EObjectContainmentEList<SCH21CONTENT>(SCH21CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH21);
		}
		return sCH21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH22CONTENT getSCH22() {
		return sCH22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH22(SCH22CONTENT newSCH22, NotificationChain msgs) {
		SCH22CONTENT oldSCH22 = sCH22;
		sCH22 = newSCH22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH22, oldSCH22, newSCH22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH22(SCH22CONTENT newSCH22) {
		if (newSCH22 != sCH22) {
			NotificationChain msgs = null;
			if (sCH22 != null)
				msgs = ((InternalEObject)sCH22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH22, null, msgs);
			if (newSCH22 != null)
				msgs = ((InternalEObject)newSCH22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH22, null, msgs);
			msgs = basicSetSCH22(newSCH22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH22, newSCH22, newSCH22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH23CONTENT getSCH23() {
		return sCH23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH23(SCH23CONTENT newSCH23, NotificationChain msgs) {
		SCH23CONTENT oldSCH23 = sCH23;
		sCH23 = newSCH23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH23, oldSCH23, newSCH23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH23(SCH23CONTENT newSCH23) {
		if (newSCH23 != sCH23) {
			NotificationChain msgs = null;
			if (sCH23 != null)
				msgs = ((InternalEObject)sCH23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH23, null, msgs);
			if (newSCH23 != null)
				msgs = ((InternalEObject)newSCH23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH23, null, msgs);
			msgs = basicSetSCH23(newSCH23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH23, newSCH23, newSCH23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH24CONTENT getSCH24() {
		return sCH24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH24(SCH24CONTENT newSCH24, NotificationChain msgs) {
		SCH24CONTENT oldSCH24 = sCH24;
		sCH24 = newSCH24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH24, oldSCH24, newSCH24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH24(SCH24CONTENT newSCH24) {
		if (newSCH24 != sCH24) {
			NotificationChain msgs = null;
			if (sCH24 != null)
				msgs = ((InternalEObject)sCH24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH24, null, msgs);
			if (newSCH24 != null)
				msgs = ((InternalEObject)newSCH24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH24, null, msgs);
			msgs = basicSetSCH24(newSCH24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH24, newSCH24, newSCH24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SCH25CONTENT getSCH25() {
		return sCH25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSCH25(SCH25CONTENT newSCH25, NotificationChain msgs) {
		SCH25CONTENT oldSCH25 = sCH25;
		sCH25 = newSCH25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH25, oldSCH25, newSCH25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSCH25(SCH25CONTENT newSCH25) {
		if (newSCH25 != sCH25) {
			NotificationChain msgs = null;
			if (sCH25 != null)
				msgs = ((InternalEObject)sCH25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH25, null, msgs);
			if (newSCH25 != null)
				msgs = ((InternalEObject)newSCH25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.SCHCONTENT__SCH25, null, msgs);
			msgs = basicSetSCH25(newSCH25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.SCHCONTENT__SCH25, newSCH25, newSCH25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH26CONTENT> getSCH26() {
		if (sCH26 == null) {
			sCH26 = new EObjectContainmentEList<SCH26CONTENT>(SCH26CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH26);
		}
		return sCH26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SCH27CONTENT> getSCH27() {
		if (sCH27 == null) {
			sCH27 = new EObjectContainmentEList<SCH27CONTENT>(SCH27CONTENT.class, this, V2xmlPackage.SCHCONTENT__SCH27);
		}
		return sCH27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.SCHCONTENT__ANY);
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
			case V2xmlPackage.SCHCONTENT__SCH1:
				return basicSetSCH1(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH2:
				return basicSetSCH2(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH3:
				return basicSetSCH3(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH4:
				return basicSetSCH4(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH5:
				return basicSetSCH5(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH6:
				return basicSetSCH6(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH7:
				return basicSetSCH7(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH8:
				return basicSetSCH8(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH9:
				return basicSetSCH9(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH10:
				return basicSetSCH10(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH11:
				return ((InternalEList<?>)getSCH11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH12:
				return ((InternalEList<?>)getSCH12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH13:
				return basicSetSCH13(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH14:
				return ((InternalEList<?>)getSCH14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH15:
				return basicSetSCH15(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH16:
				return ((InternalEList<?>)getSCH16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH17:
				return basicSetSCH17(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH18:
				return ((InternalEList<?>)getSCH18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH19:
				return basicSetSCH19(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH20:
				return ((InternalEList<?>)getSCH20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH21:
				return ((InternalEList<?>)getSCH21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH22:
				return basicSetSCH22(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH23:
				return basicSetSCH23(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH24:
				return basicSetSCH24(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH25:
				return basicSetSCH25(null, msgs);
			case V2xmlPackage.SCHCONTENT__SCH26:
				return ((InternalEList<?>)getSCH26()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__SCH27:
				return ((InternalEList<?>)getSCH27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.SCHCONTENT__ANY:
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
			case V2xmlPackage.SCHCONTENT__SCH1:
				return getSCH1();
			case V2xmlPackage.SCHCONTENT__SCH2:
				return getSCH2();
			case V2xmlPackage.SCHCONTENT__SCH3:
				return getSCH3();
			case V2xmlPackage.SCHCONTENT__SCH4:
				return getSCH4();
			case V2xmlPackage.SCHCONTENT__SCH5:
				return getSCH5();
			case V2xmlPackage.SCHCONTENT__SCH6:
				return getSCH6();
			case V2xmlPackage.SCHCONTENT__SCH7:
				return getSCH7();
			case V2xmlPackage.SCHCONTENT__SCH8:
				return getSCH8();
			case V2xmlPackage.SCHCONTENT__SCH9:
				return getSCH9();
			case V2xmlPackage.SCHCONTENT__SCH10:
				return getSCH10();
			case V2xmlPackage.SCHCONTENT__SCH11:
				return getSCH11();
			case V2xmlPackage.SCHCONTENT__SCH12:
				return getSCH12();
			case V2xmlPackage.SCHCONTENT__SCH13:
				return getSCH13();
			case V2xmlPackage.SCHCONTENT__SCH14:
				return getSCH14();
			case V2xmlPackage.SCHCONTENT__SCH15:
				return getSCH15();
			case V2xmlPackage.SCHCONTENT__SCH16:
				return getSCH16();
			case V2xmlPackage.SCHCONTENT__SCH17:
				return getSCH17();
			case V2xmlPackage.SCHCONTENT__SCH18:
				return getSCH18();
			case V2xmlPackage.SCHCONTENT__SCH19:
				return getSCH19();
			case V2xmlPackage.SCHCONTENT__SCH20:
				return getSCH20();
			case V2xmlPackage.SCHCONTENT__SCH21:
				return getSCH21();
			case V2xmlPackage.SCHCONTENT__SCH22:
				return getSCH22();
			case V2xmlPackage.SCHCONTENT__SCH23:
				return getSCH23();
			case V2xmlPackage.SCHCONTENT__SCH24:
				return getSCH24();
			case V2xmlPackage.SCHCONTENT__SCH25:
				return getSCH25();
			case V2xmlPackage.SCHCONTENT__SCH26:
				return getSCH26();
			case V2xmlPackage.SCHCONTENT__SCH27:
				return getSCH27();
			case V2xmlPackage.SCHCONTENT__ANY:
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
			case V2xmlPackage.SCHCONTENT__SCH1:
				setSCH1((SCH1CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH2:
				setSCH2((SCH2CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH3:
				setSCH3((SCH3CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH4:
				setSCH4((SCH4CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH5:
				setSCH5((SCH5CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH6:
				setSCH6((SCH6CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH7:
				setSCH7((SCH7CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH8:
				setSCH8((SCH8CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH9:
				setSCH9((SCH9CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH10:
				setSCH10((SCH10CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH11:
				getSCH11().clear();
				getSCH11().addAll((Collection<? extends SCH11CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH12:
				getSCH12().clear();
				getSCH12().addAll((Collection<? extends SCH12CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH13:
				setSCH13((SCH13CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH14:
				getSCH14().clear();
				getSCH14().addAll((Collection<? extends SCH14CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH15:
				setSCH15((SCH15CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH16:
				getSCH16().clear();
				getSCH16().addAll((Collection<? extends SCH16CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH17:
				setSCH17((SCH17CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH18:
				getSCH18().clear();
				getSCH18().addAll((Collection<? extends SCH18CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH19:
				setSCH19((SCH19CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH20:
				getSCH20().clear();
				getSCH20().addAll((Collection<? extends SCH20CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH21:
				getSCH21().clear();
				getSCH21().addAll((Collection<? extends SCH21CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH22:
				setSCH22((SCH22CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH23:
				setSCH23((SCH23CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH24:
				setSCH24((SCH24CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH25:
				setSCH25((SCH25CONTENT)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH26:
				getSCH26().clear();
				getSCH26().addAll((Collection<? extends SCH26CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__SCH27:
				getSCH27().clear();
				getSCH27().addAll((Collection<? extends SCH27CONTENT>)newValue);
				return;
			case V2xmlPackage.SCHCONTENT__ANY:
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
			case V2xmlPackage.SCHCONTENT__SCH1:
				setSCH1((SCH1CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH2:
				setSCH2((SCH2CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH3:
				setSCH3((SCH3CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH4:
				setSCH4((SCH4CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH5:
				setSCH5((SCH5CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH6:
				setSCH6((SCH6CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH7:
				setSCH7((SCH7CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH8:
				setSCH8((SCH8CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH9:
				setSCH9((SCH9CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH10:
				setSCH10((SCH10CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH11:
				getSCH11().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH12:
				getSCH12().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH13:
				setSCH13((SCH13CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH14:
				getSCH14().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH15:
				setSCH15((SCH15CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH16:
				getSCH16().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH17:
				setSCH17((SCH17CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH18:
				getSCH18().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH19:
				setSCH19((SCH19CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH20:
				getSCH20().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH21:
				getSCH21().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH22:
				setSCH22((SCH22CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH23:
				setSCH23((SCH23CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH24:
				setSCH24((SCH24CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH25:
				setSCH25((SCH25CONTENT)null);
				return;
			case V2xmlPackage.SCHCONTENT__SCH26:
				getSCH26().clear();
				return;
			case V2xmlPackage.SCHCONTENT__SCH27:
				getSCH27().clear();
				return;
			case V2xmlPackage.SCHCONTENT__ANY:
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
			case V2xmlPackage.SCHCONTENT__SCH1:
				return sCH1 != null;
			case V2xmlPackage.SCHCONTENT__SCH2:
				return sCH2 != null;
			case V2xmlPackage.SCHCONTENT__SCH3:
				return sCH3 != null;
			case V2xmlPackage.SCHCONTENT__SCH4:
				return sCH4 != null;
			case V2xmlPackage.SCHCONTENT__SCH5:
				return sCH5 != null;
			case V2xmlPackage.SCHCONTENT__SCH6:
				return sCH6 != null;
			case V2xmlPackage.SCHCONTENT__SCH7:
				return sCH7 != null;
			case V2xmlPackage.SCHCONTENT__SCH8:
				return sCH8 != null;
			case V2xmlPackage.SCHCONTENT__SCH9:
				return sCH9 != null;
			case V2xmlPackage.SCHCONTENT__SCH10:
				return sCH10 != null;
			case V2xmlPackage.SCHCONTENT__SCH11:
				return sCH11 != null && !sCH11.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH12:
				return sCH12 != null && !sCH12.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH13:
				return sCH13 != null;
			case V2xmlPackage.SCHCONTENT__SCH14:
				return sCH14 != null && !sCH14.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH15:
				return sCH15 != null;
			case V2xmlPackage.SCHCONTENT__SCH16:
				return sCH16 != null && !sCH16.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH17:
				return sCH17 != null;
			case V2xmlPackage.SCHCONTENT__SCH18:
				return sCH18 != null && !sCH18.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH19:
				return sCH19 != null;
			case V2xmlPackage.SCHCONTENT__SCH20:
				return sCH20 != null && !sCH20.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH21:
				return sCH21 != null && !sCH21.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH22:
				return sCH22 != null;
			case V2xmlPackage.SCHCONTENT__SCH23:
				return sCH23 != null;
			case V2xmlPackage.SCHCONTENT__SCH24:
				return sCH24 != null;
			case V2xmlPackage.SCHCONTENT__SCH25:
				return sCH25 != null;
			case V2xmlPackage.SCHCONTENT__SCH26:
				return sCH26 != null && !sCH26.isEmpty();
			case V2xmlPackage.SCHCONTENT__SCH27:
				return sCH27 != null && !sCH27.isEmpty();
			case V2xmlPackage.SCHCONTENT__ANY:
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

} //SCHCONTENTImpl
