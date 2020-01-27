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

import org.hl7.v2xml.ORC10CONTENT;
import org.hl7.v2xml.ORC11CONTENT;
import org.hl7.v2xml.ORC12CONTENT;
import org.hl7.v2xml.ORC13CONTENT;
import org.hl7.v2xml.ORC14CONTENT;
import org.hl7.v2xml.ORC15CONTENT;
import org.hl7.v2xml.ORC16CONTENT;
import org.hl7.v2xml.ORC17CONTENT;
import org.hl7.v2xml.ORC18CONTENT;
import org.hl7.v2xml.ORC19CONTENT;
import org.hl7.v2xml.ORC1CONTENT;
import org.hl7.v2xml.ORC20CONTENT;
import org.hl7.v2xml.ORC21CONTENT;
import org.hl7.v2xml.ORC22CONTENT;
import org.hl7.v2xml.ORC23CONTENT;
import org.hl7.v2xml.ORC24CONTENT;
import org.hl7.v2xml.ORC25CONTENT;
import org.hl7.v2xml.ORC26CONTENT;
import org.hl7.v2xml.ORC27CONTENT;
import org.hl7.v2xml.ORC28CONTENT;
import org.hl7.v2xml.ORC29CONTENT;
import org.hl7.v2xml.ORC2CONTENT;
import org.hl7.v2xml.ORC30CONTENT;
import org.hl7.v2xml.ORC3CONTENT;
import org.hl7.v2xml.ORC4CONTENT;
import org.hl7.v2xml.ORC5CONTENT;
import org.hl7.v2xml.ORC6CONTENT;
import org.hl7.v2xml.ORC7CONTENT;
import org.hl7.v2xml.ORC8CONTENT;
import org.hl7.v2xml.ORC9CONTENT;
import org.hl7.v2xml.ORCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC1 <em>ORC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC2 <em>ORC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC3 <em>ORC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC4 <em>ORC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC5 <em>ORC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC6 <em>ORC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC7 <em>ORC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC8 <em>ORC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC9 <em>ORC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC10 <em>ORC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC11 <em>ORC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC12 <em>ORC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC13 <em>ORC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC14 <em>ORC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC15 <em>ORC15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC16 <em>ORC16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC17 <em>ORC17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC18 <em>ORC18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC19 <em>ORC19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC20 <em>ORC20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC21 <em>ORC21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC22 <em>ORC22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC23 <em>ORC23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC24 <em>ORC24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC25 <em>ORC25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC26 <em>ORC26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC27 <em>ORC27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC28 <em>ORC28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC29 <em>ORC29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getORC30 <em>ORC30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORCCONTENTImpl extends EObjectImpl implements ORCCONTENT {
	/**
	 * The cached value of the '{@link #getORC1() <em>ORC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC1()
	 * @generated
	 * @ordered
	 */
	protected ORC1CONTENT oRC1;

	/**
	 * The cached value of the '{@link #getORC2() <em>ORC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC2()
	 * @generated
	 * @ordered
	 */
	protected ORC2CONTENT oRC2;

	/**
	 * The cached value of the '{@link #getORC3() <em>ORC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC3()
	 * @generated
	 * @ordered
	 */
	protected ORC3CONTENT oRC3;

	/**
	 * The cached value of the '{@link #getORC4() <em>ORC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC4()
	 * @generated
	 * @ordered
	 */
	protected ORC4CONTENT oRC4;

	/**
	 * The cached value of the '{@link #getORC5() <em>ORC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC5()
	 * @generated
	 * @ordered
	 */
	protected ORC5CONTENT oRC5;

	/**
	 * The cached value of the '{@link #getORC6() <em>ORC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC6()
	 * @generated
	 * @ordered
	 */
	protected ORC6CONTENT oRC6;

	/**
	 * The cached value of the '{@link #getORC7() <em>ORC7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC7()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC7CONTENT> oRC7;

	/**
	 * The cached value of the '{@link #getORC8() <em>ORC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC8()
	 * @generated
	 * @ordered
	 */
	protected ORC8CONTENT oRC8;

	/**
	 * The cached value of the '{@link #getORC9() <em>ORC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC9()
	 * @generated
	 * @ordered
	 */
	protected ORC9CONTENT oRC9;

	/**
	 * The cached value of the '{@link #getORC10() <em>ORC10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC10()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC10CONTENT> oRC10;

	/**
	 * The cached value of the '{@link #getORC11() <em>ORC11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC11()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC11CONTENT> oRC11;

	/**
	 * The cached value of the '{@link #getORC12() <em>ORC12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC12()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC12CONTENT> oRC12;

	/**
	 * The cached value of the '{@link #getORC13() <em>ORC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC13()
	 * @generated
	 * @ordered
	 */
	protected ORC13CONTENT oRC13;

	/**
	 * The cached value of the '{@link #getORC14() <em>ORC14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC14()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC14CONTENT> oRC14;

	/**
	 * The cached value of the '{@link #getORC15() <em>ORC15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC15()
	 * @generated
	 * @ordered
	 */
	protected ORC15CONTENT oRC15;

	/**
	 * The cached value of the '{@link #getORC16() <em>ORC16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC16()
	 * @generated
	 * @ordered
	 */
	protected ORC16CONTENT oRC16;

	/**
	 * The cached value of the '{@link #getORC17() <em>ORC17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC17()
	 * @generated
	 * @ordered
	 */
	protected ORC17CONTENT oRC17;

	/**
	 * The cached value of the '{@link #getORC18() <em>ORC18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC18()
	 * @generated
	 * @ordered
	 */
	protected ORC18CONTENT oRC18;

	/**
	 * The cached value of the '{@link #getORC19() <em>ORC19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC19()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC19CONTENT> oRC19;

	/**
	 * The cached value of the '{@link #getORC20() <em>ORC20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC20()
	 * @generated
	 * @ordered
	 */
	protected ORC20CONTENT oRC20;

	/**
	 * The cached value of the '{@link #getORC21() <em>ORC21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC21()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC21CONTENT> oRC21;

	/**
	 * The cached value of the '{@link #getORC22() <em>ORC22</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC22()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC22CONTENT> oRC22;

	/**
	 * The cached value of the '{@link #getORC23() <em>ORC23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC23()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC23CONTENT> oRC23;

	/**
	 * The cached value of the '{@link #getORC24() <em>ORC24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC24()
	 * @generated
	 * @ordered
	 */
	protected EList<ORC24CONTENT> oRC24;

	/**
	 * The cached value of the '{@link #getORC25() <em>ORC25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC25()
	 * @generated
	 * @ordered
	 */
	protected ORC25CONTENT oRC25;

	/**
	 * The cached value of the '{@link #getORC26() <em>ORC26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC26()
	 * @generated
	 * @ordered
	 */
	protected ORC26CONTENT oRC26;

	/**
	 * The cached value of the '{@link #getORC27() <em>ORC27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC27()
	 * @generated
	 * @ordered
	 */
	protected ORC27CONTENT oRC27;

	/**
	 * The cached value of the '{@link #getORC28() <em>ORC28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC28()
	 * @generated
	 * @ordered
	 */
	protected ORC28CONTENT oRC28;

	/**
	 * The cached value of the '{@link #getORC29() <em>ORC29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC29()
	 * @generated
	 * @ordered
	 */
	protected ORC29CONTENT oRC29;

	/**
	 * The cached value of the '{@link #getORC30() <em>ORC30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORC30()
	 * @generated
	 * @ordered
	 */
	protected ORC30CONTENT oRC30;

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
	protected ORCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getORCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC1CONTENT getORC1() {
		return oRC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC1(ORC1CONTENT newORC1, NotificationChain msgs) {
		ORC1CONTENT oldORC1 = oRC1;
		oRC1 = newORC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC1, oldORC1, newORC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC1(ORC1CONTENT newORC1) {
		if (newORC1 != oRC1) {
			NotificationChain msgs = null;
			if (oRC1 != null)
				msgs = ((InternalEObject)oRC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC1, null, msgs);
			if (newORC1 != null)
				msgs = ((InternalEObject)newORC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC1, null, msgs);
			msgs = basicSetORC1(newORC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC1, newORC1, newORC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC2CONTENT getORC2() {
		return oRC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC2(ORC2CONTENT newORC2, NotificationChain msgs) {
		ORC2CONTENT oldORC2 = oRC2;
		oRC2 = newORC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC2, oldORC2, newORC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC2(ORC2CONTENT newORC2) {
		if (newORC2 != oRC2) {
			NotificationChain msgs = null;
			if (oRC2 != null)
				msgs = ((InternalEObject)oRC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC2, null, msgs);
			if (newORC2 != null)
				msgs = ((InternalEObject)newORC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC2, null, msgs);
			msgs = basicSetORC2(newORC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC2, newORC2, newORC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC3CONTENT getORC3() {
		return oRC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC3(ORC3CONTENT newORC3, NotificationChain msgs) {
		ORC3CONTENT oldORC3 = oRC3;
		oRC3 = newORC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC3, oldORC3, newORC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC3(ORC3CONTENT newORC3) {
		if (newORC3 != oRC3) {
			NotificationChain msgs = null;
			if (oRC3 != null)
				msgs = ((InternalEObject)oRC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC3, null, msgs);
			if (newORC3 != null)
				msgs = ((InternalEObject)newORC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC3, null, msgs);
			msgs = basicSetORC3(newORC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC3, newORC3, newORC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC4CONTENT getORC4() {
		return oRC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC4(ORC4CONTENT newORC4, NotificationChain msgs) {
		ORC4CONTENT oldORC4 = oRC4;
		oRC4 = newORC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC4, oldORC4, newORC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC4(ORC4CONTENT newORC4) {
		if (newORC4 != oRC4) {
			NotificationChain msgs = null;
			if (oRC4 != null)
				msgs = ((InternalEObject)oRC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC4, null, msgs);
			if (newORC4 != null)
				msgs = ((InternalEObject)newORC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC4, null, msgs);
			msgs = basicSetORC4(newORC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC4, newORC4, newORC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC5CONTENT getORC5() {
		return oRC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC5(ORC5CONTENT newORC5, NotificationChain msgs) {
		ORC5CONTENT oldORC5 = oRC5;
		oRC5 = newORC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC5, oldORC5, newORC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC5(ORC5CONTENT newORC5) {
		if (newORC5 != oRC5) {
			NotificationChain msgs = null;
			if (oRC5 != null)
				msgs = ((InternalEObject)oRC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC5, null, msgs);
			if (newORC5 != null)
				msgs = ((InternalEObject)newORC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC5, null, msgs);
			msgs = basicSetORC5(newORC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC5, newORC5, newORC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC6CONTENT getORC6() {
		return oRC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC6(ORC6CONTENT newORC6, NotificationChain msgs) {
		ORC6CONTENT oldORC6 = oRC6;
		oRC6 = newORC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC6, oldORC6, newORC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC6(ORC6CONTENT newORC6) {
		if (newORC6 != oRC6) {
			NotificationChain msgs = null;
			if (oRC6 != null)
				msgs = ((InternalEObject)oRC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC6, null, msgs);
			if (newORC6 != null)
				msgs = ((InternalEObject)newORC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC6, null, msgs);
			msgs = basicSetORC6(newORC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC6, newORC6, newORC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC7CONTENT> getORC7() {
		if (oRC7 == null) {
			oRC7 = new EObjectContainmentEList<ORC7CONTENT>(ORC7CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC7);
		}
		return oRC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC8CONTENT getORC8() {
		return oRC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC8(ORC8CONTENT newORC8, NotificationChain msgs) {
		ORC8CONTENT oldORC8 = oRC8;
		oRC8 = newORC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC8, oldORC8, newORC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC8(ORC8CONTENT newORC8) {
		if (newORC8 != oRC8) {
			NotificationChain msgs = null;
			if (oRC8 != null)
				msgs = ((InternalEObject)oRC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC8, null, msgs);
			if (newORC8 != null)
				msgs = ((InternalEObject)newORC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC8, null, msgs);
			msgs = basicSetORC8(newORC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC8, newORC8, newORC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC9CONTENT getORC9() {
		return oRC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC9(ORC9CONTENT newORC9, NotificationChain msgs) {
		ORC9CONTENT oldORC9 = oRC9;
		oRC9 = newORC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC9, oldORC9, newORC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC9(ORC9CONTENT newORC9) {
		if (newORC9 != oRC9) {
			NotificationChain msgs = null;
			if (oRC9 != null)
				msgs = ((InternalEObject)oRC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC9, null, msgs);
			if (newORC9 != null)
				msgs = ((InternalEObject)newORC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC9, null, msgs);
			msgs = basicSetORC9(newORC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC9, newORC9, newORC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC10CONTENT> getORC10() {
		if (oRC10 == null) {
			oRC10 = new EObjectContainmentEList<ORC10CONTENT>(ORC10CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC10);
		}
		return oRC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC11CONTENT> getORC11() {
		if (oRC11 == null) {
			oRC11 = new EObjectContainmentEList<ORC11CONTENT>(ORC11CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC11);
		}
		return oRC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC12CONTENT> getORC12() {
		if (oRC12 == null) {
			oRC12 = new EObjectContainmentEList<ORC12CONTENT>(ORC12CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC12);
		}
		return oRC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC13CONTENT getORC13() {
		return oRC13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC13(ORC13CONTENT newORC13, NotificationChain msgs) {
		ORC13CONTENT oldORC13 = oRC13;
		oRC13 = newORC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC13, oldORC13, newORC13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC13(ORC13CONTENT newORC13) {
		if (newORC13 != oRC13) {
			NotificationChain msgs = null;
			if (oRC13 != null)
				msgs = ((InternalEObject)oRC13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC13, null, msgs);
			if (newORC13 != null)
				msgs = ((InternalEObject)newORC13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC13, null, msgs);
			msgs = basicSetORC13(newORC13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC13, newORC13, newORC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC14CONTENT> getORC14() {
		if (oRC14 == null) {
			oRC14 = new EObjectContainmentEList<ORC14CONTENT>(ORC14CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC14);
		}
		return oRC14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC15CONTENT getORC15() {
		return oRC15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC15(ORC15CONTENT newORC15, NotificationChain msgs) {
		ORC15CONTENT oldORC15 = oRC15;
		oRC15 = newORC15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC15, oldORC15, newORC15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC15(ORC15CONTENT newORC15) {
		if (newORC15 != oRC15) {
			NotificationChain msgs = null;
			if (oRC15 != null)
				msgs = ((InternalEObject)oRC15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC15, null, msgs);
			if (newORC15 != null)
				msgs = ((InternalEObject)newORC15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC15, null, msgs);
			msgs = basicSetORC15(newORC15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC15, newORC15, newORC15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC16CONTENT getORC16() {
		return oRC16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC16(ORC16CONTENT newORC16, NotificationChain msgs) {
		ORC16CONTENT oldORC16 = oRC16;
		oRC16 = newORC16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC16, oldORC16, newORC16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC16(ORC16CONTENT newORC16) {
		if (newORC16 != oRC16) {
			NotificationChain msgs = null;
			if (oRC16 != null)
				msgs = ((InternalEObject)oRC16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC16, null, msgs);
			if (newORC16 != null)
				msgs = ((InternalEObject)newORC16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC16, null, msgs);
			msgs = basicSetORC16(newORC16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC16, newORC16, newORC16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC17CONTENT getORC17() {
		return oRC17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC17(ORC17CONTENT newORC17, NotificationChain msgs) {
		ORC17CONTENT oldORC17 = oRC17;
		oRC17 = newORC17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC17, oldORC17, newORC17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC17(ORC17CONTENT newORC17) {
		if (newORC17 != oRC17) {
			NotificationChain msgs = null;
			if (oRC17 != null)
				msgs = ((InternalEObject)oRC17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC17, null, msgs);
			if (newORC17 != null)
				msgs = ((InternalEObject)newORC17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC17, null, msgs);
			msgs = basicSetORC17(newORC17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC17, newORC17, newORC17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC18CONTENT getORC18() {
		return oRC18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC18(ORC18CONTENT newORC18, NotificationChain msgs) {
		ORC18CONTENT oldORC18 = oRC18;
		oRC18 = newORC18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC18, oldORC18, newORC18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC18(ORC18CONTENT newORC18) {
		if (newORC18 != oRC18) {
			NotificationChain msgs = null;
			if (oRC18 != null)
				msgs = ((InternalEObject)oRC18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC18, null, msgs);
			if (newORC18 != null)
				msgs = ((InternalEObject)newORC18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC18, null, msgs);
			msgs = basicSetORC18(newORC18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC18, newORC18, newORC18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC19CONTENT> getORC19() {
		if (oRC19 == null) {
			oRC19 = new EObjectContainmentEList<ORC19CONTENT>(ORC19CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC19);
		}
		return oRC19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC20CONTENT getORC20() {
		return oRC20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC20(ORC20CONTENT newORC20, NotificationChain msgs) {
		ORC20CONTENT oldORC20 = oRC20;
		oRC20 = newORC20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC20, oldORC20, newORC20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC20(ORC20CONTENT newORC20) {
		if (newORC20 != oRC20) {
			NotificationChain msgs = null;
			if (oRC20 != null)
				msgs = ((InternalEObject)oRC20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC20, null, msgs);
			if (newORC20 != null)
				msgs = ((InternalEObject)newORC20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC20, null, msgs);
			msgs = basicSetORC20(newORC20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC20, newORC20, newORC20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC21CONTENT> getORC21() {
		if (oRC21 == null) {
			oRC21 = new EObjectContainmentEList<ORC21CONTENT>(ORC21CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC21);
		}
		return oRC21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC22CONTENT> getORC22() {
		if (oRC22 == null) {
			oRC22 = new EObjectContainmentEList<ORC22CONTENT>(ORC22CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC22);
		}
		return oRC22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC23CONTENT> getORC23() {
		if (oRC23 == null) {
			oRC23 = new EObjectContainmentEList<ORC23CONTENT>(ORC23CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC23);
		}
		return oRC23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ORC24CONTENT> getORC24() {
		if (oRC24 == null) {
			oRC24 = new EObjectContainmentEList<ORC24CONTENT>(ORC24CONTENT.class, this, V2xmlPackage.ORCCONTENT__ORC24);
		}
		return oRC24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC25CONTENT getORC25() {
		return oRC25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC25(ORC25CONTENT newORC25, NotificationChain msgs) {
		ORC25CONTENT oldORC25 = oRC25;
		oRC25 = newORC25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC25, oldORC25, newORC25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC25(ORC25CONTENT newORC25) {
		if (newORC25 != oRC25) {
			NotificationChain msgs = null;
			if (oRC25 != null)
				msgs = ((InternalEObject)oRC25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC25, null, msgs);
			if (newORC25 != null)
				msgs = ((InternalEObject)newORC25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC25, null, msgs);
			msgs = basicSetORC25(newORC25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC25, newORC25, newORC25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC26CONTENT getORC26() {
		return oRC26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC26(ORC26CONTENT newORC26, NotificationChain msgs) {
		ORC26CONTENT oldORC26 = oRC26;
		oRC26 = newORC26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC26, oldORC26, newORC26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC26(ORC26CONTENT newORC26) {
		if (newORC26 != oRC26) {
			NotificationChain msgs = null;
			if (oRC26 != null)
				msgs = ((InternalEObject)oRC26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC26, null, msgs);
			if (newORC26 != null)
				msgs = ((InternalEObject)newORC26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC26, null, msgs);
			msgs = basicSetORC26(newORC26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC26, newORC26, newORC26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC27CONTENT getORC27() {
		return oRC27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC27(ORC27CONTENT newORC27, NotificationChain msgs) {
		ORC27CONTENT oldORC27 = oRC27;
		oRC27 = newORC27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC27, oldORC27, newORC27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC27(ORC27CONTENT newORC27) {
		if (newORC27 != oRC27) {
			NotificationChain msgs = null;
			if (oRC27 != null)
				msgs = ((InternalEObject)oRC27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC27, null, msgs);
			if (newORC27 != null)
				msgs = ((InternalEObject)newORC27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC27, null, msgs);
			msgs = basicSetORC27(newORC27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC27, newORC27, newORC27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC28CONTENT getORC28() {
		return oRC28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC28(ORC28CONTENT newORC28, NotificationChain msgs) {
		ORC28CONTENT oldORC28 = oRC28;
		oRC28 = newORC28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC28, oldORC28, newORC28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC28(ORC28CONTENT newORC28) {
		if (newORC28 != oRC28) {
			NotificationChain msgs = null;
			if (oRC28 != null)
				msgs = ((InternalEObject)oRC28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC28, null, msgs);
			if (newORC28 != null)
				msgs = ((InternalEObject)newORC28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC28, null, msgs);
			msgs = basicSetORC28(newORC28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC28, newORC28, newORC28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC29CONTENT getORC29() {
		return oRC29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC29(ORC29CONTENT newORC29, NotificationChain msgs) {
		ORC29CONTENT oldORC29 = oRC29;
		oRC29 = newORC29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC29, oldORC29, newORC29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC29(ORC29CONTENT newORC29) {
		if (newORC29 != oRC29) {
			NotificationChain msgs = null;
			if (oRC29 != null)
				msgs = ((InternalEObject)oRC29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC29, null, msgs);
			if (newORC29 != null)
				msgs = ((InternalEObject)newORC29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC29, null, msgs);
			msgs = basicSetORC29(newORC29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC29, newORC29, newORC29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORC30CONTENT getORC30() {
		return oRC30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORC30(ORC30CONTENT newORC30, NotificationChain msgs) {
		ORC30CONTENT oldORC30 = oRC30;
		oRC30 = newORC30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC30, oldORC30, newORC30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORC30(ORC30CONTENT newORC30) {
		if (newORC30 != oRC30) {
			NotificationChain msgs = null;
			if (oRC30 != null)
				msgs = ((InternalEObject)oRC30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC30, null, msgs);
			if (newORC30 != null)
				msgs = ((InternalEObject)newORC30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORCCONTENT__ORC30, null, msgs);
			msgs = basicSetORC30(newORC30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORCCONTENT__ORC30, newORC30, newORC30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ORCCONTENT__ANY);
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
			case V2xmlPackage.ORCCONTENT__ORC1:
				return basicSetORC1(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC2:
				return basicSetORC2(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC3:
				return basicSetORC3(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC4:
				return basicSetORC4(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC5:
				return basicSetORC5(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC6:
				return basicSetORC6(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC7:
				return ((InternalEList<?>)getORC7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC8:
				return basicSetORC8(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC9:
				return basicSetORC9(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC10:
				return ((InternalEList<?>)getORC10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC11:
				return ((InternalEList<?>)getORC11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC12:
				return ((InternalEList<?>)getORC12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC13:
				return basicSetORC13(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC14:
				return ((InternalEList<?>)getORC14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC15:
				return basicSetORC15(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC16:
				return basicSetORC16(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC17:
				return basicSetORC17(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC18:
				return basicSetORC18(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC19:
				return ((InternalEList<?>)getORC19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC20:
				return basicSetORC20(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC21:
				return ((InternalEList<?>)getORC21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC22:
				return ((InternalEList<?>)getORC22()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC23:
				return ((InternalEList<?>)getORC23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC24:
				return ((InternalEList<?>)getORC24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ORCCONTENT__ORC25:
				return basicSetORC25(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC26:
				return basicSetORC26(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC27:
				return basicSetORC27(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC28:
				return basicSetORC28(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC29:
				return basicSetORC29(null, msgs);
			case V2xmlPackage.ORCCONTENT__ORC30:
				return basicSetORC30(null, msgs);
			case V2xmlPackage.ORCCONTENT__ANY:
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
			case V2xmlPackage.ORCCONTENT__ORC1:
				return getORC1();
			case V2xmlPackage.ORCCONTENT__ORC2:
				return getORC2();
			case V2xmlPackage.ORCCONTENT__ORC3:
				return getORC3();
			case V2xmlPackage.ORCCONTENT__ORC4:
				return getORC4();
			case V2xmlPackage.ORCCONTENT__ORC5:
				return getORC5();
			case V2xmlPackage.ORCCONTENT__ORC6:
				return getORC6();
			case V2xmlPackage.ORCCONTENT__ORC7:
				return getORC7();
			case V2xmlPackage.ORCCONTENT__ORC8:
				return getORC8();
			case V2xmlPackage.ORCCONTENT__ORC9:
				return getORC9();
			case V2xmlPackage.ORCCONTENT__ORC10:
				return getORC10();
			case V2xmlPackage.ORCCONTENT__ORC11:
				return getORC11();
			case V2xmlPackage.ORCCONTENT__ORC12:
				return getORC12();
			case V2xmlPackage.ORCCONTENT__ORC13:
				return getORC13();
			case V2xmlPackage.ORCCONTENT__ORC14:
				return getORC14();
			case V2xmlPackage.ORCCONTENT__ORC15:
				return getORC15();
			case V2xmlPackage.ORCCONTENT__ORC16:
				return getORC16();
			case V2xmlPackage.ORCCONTENT__ORC17:
				return getORC17();
			case V2xmlPackage.ORCCONTENT__ORC18:
				return getORC18();
			case V2xmlPackage.ORCCONTENT__ORC19:
				return getORC19();
			case V2xmlPackage.ORCCONTENT__ORC20:
				return getORC20();
			case V2xmlPackage.ORCCONTENT__ORC21:
				return getORC21();
			case V2xmlPackage.ORCCONTENT__ORC22:
				return getORC22();
			case V2xmlPackage.ORCCONTENT__ORC23:
				return getORC23();
			case V2xmlPackage.ORCCONTENT__ORC24:
				return getORC24();
			case V2xmlPackage.ORCCONTENT__ORC25:
				return getORC25();
			case V2xmlPackage.ORCCONTENT__ORC26:
				return getORC26();
			case V2xmlPackage.ORCCONTENT__ORC27:
				return getORC27();
			case V2xmlPackage.ORCCONTENT__ORC28:
				return getORC28();
			case V2xmlPackage.ORCCONTENT__ORC29:
				return getORC29();
			case V2xmlPackage.ORCCONTENT__ORC30:
				return getORC30();
			case V2xmlPackage.ORCCONTENT__ANY:
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
			case V2xmlPackage.ORCCONTENT__ORC1:
				setORC1((ORC1CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC2:
				setORC2((ORC2CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC3:
				setORC3((ORC3CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC4:
				setORC4((ORC4CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC5:
				setORC5((ORC5CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC6:
				setORC6((ORC6CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC7:
				getORC7().clear();
				getORC7().addAll((Collection<? extends ORC7CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC8:
				setORC8((ORC8CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC9:
				setORC9((ORC9CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC10:
				getORC10().clear();
				getORC10().addAll((Collection<? extends ORC10CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC11:
				getORC11().clear();
				getORC11().addAll((Collection<? extends ORC11CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC12:
				getORC12().clear();
				getORC12().addAll((Collection<? extends ORC12CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC13:
				setORC13((ORC13CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC14:
				getORC14().clear();
				getORC14().addAll((Collection<? extends ORC14CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC15:
				setORC15((ORC15CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC16:
				setORC16((ORC16CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC17:
				setORC17((ORC17CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC18:
				setORC18((ORC18CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC19:
				getORC19().clear();
				getORC19().addAll((Collection<? extends ORC19CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC20:
				setORC20((ORC20CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC21:
				getORC21().clear();
				getORC21().addAll((Collection<? extends ORC21CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC22:
				getORC22().clear();
				getORC22().addAll((Collection<? extends ORC22CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC23:
				getORC23().clear();
				getORC23().addAll((Collection<? extends ORC23CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC24:
				getORC24().clear();
				getORC24().addAll((Collection<? extends ORC24CONTENT>)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC25:
				setORC25((ORC25CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC26:
				setORC26((ORC26CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC27:
				setORC27((ORC27CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC28:
				setORC28((ORC28CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC29:
				setORC29((ORC29CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ORC30:
				setORC30((ORC30CONTENT)newValue);
				return;
			case V2xmlPackage.ORCCONTENT__ANY:
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
			case V2xmlPackage.ORCCONTENT__ORC1:
				setORC1((ORC1CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC2:
				setORC2((ORC2CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC3:
				setORC3((ORC3CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC4:
				setORC4((ORC4CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC5:
				setORC5((ORC5CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC6:
				setORC6((ORC6CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC7:
				getORC7().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC8:
				setORC8((ORC8CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC9:
				setORC9((ORC9CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC10:
				getORC10().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC11:
				getORC11().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC12:
				getORC12().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC13:
				setORC13((ORC13CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC14:
				getORC14().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC15:
				setORC15((ORC15CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC16:
				setORC16((ORC16CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC17:
				setORC17((ORC17CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC18:
				setORC18((ORC18CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC19:
				getORC19().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC20:
				setORC20((ORC20CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC21:
				getORC21().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC22:
				getORC22().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC23:
				getORC23().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC24:
				getORC24().clear();
				return;
			case V2xmlPackage.ORCCONTENT__ORC25:
				setORC25((ORC25CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC26:
				setORC26((ORC26CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC27:
				setORC27((ORC27CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC28:
				setORC28((ORC28CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC29:
				setORC29((ORC29CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ORC30:
				setORC30((ORC30CONTENT)null);
				return;
			case V2xmlPackage.ORCCONTENT__ANY:
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
			case V2xmlPackage.ORCCONTENT__ORC1:
				return oRC1 != null;
			case V2xmlPackage.ORCCONTENT__ORC2:
				return oRC2 != null;
			case V2xmlPackage.ORCCONTENT__ORC3:
				return oRC3 != null;
			case V2xmlPackage.ORCCONTENT__ORC4:
				return oRC4 != null;
			case V2xmlPackage.ORCCONTENT__ORC5:
				return oRC5 != null;
			case V2xmlPackage.ORCCONTENT__ORC6:
				return oRC6 != null;
			case V2xmlPackage.ORCCONTENT__ORC7:
				return oRC7 != null && !oRC7.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC8:
				return oRC8 != null;
			case V2xmlPackage.ORCCONTENT__ORC9:
				return oRC9 != null;
			case V2xmlPackage.ORCCONTENT__ORC10:
				return oRC10 != null && !oRC10.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC11:
				return oRC11 != null && !oRC11.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC12:
				return oRC12 != null && !oRC12.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC13:
				return oRC13 != null;
			case V2xmlPackage.ORCCONTENT__ORC14:
				return oRC14 != null && !oRC14.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC15:
				return oRC15 != null;
			case V2xmlPackage.ORCCONTENT__ORC16:
				return oRC16 != null;
			case V2xmlPackage.ORCCONTENT__ORC17:
				return oRC17 != null;
			case V2xmlPackage.ORCCONTENT__ORC18:
				return oRC18 != null;
			case V2xmlPackage.ORCCONTENT__ORC19:
				return oRC19 != null && !oRC19.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC20:
				return oRC20 != null;
			case V2xmlPackage.ORCCONTENT__ORC21:
				return oRC21 != null && !oRC21.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC22:
				return oRC22 != null && !oRC22.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC23:
				return oRC23 != null && !oRC23.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC24:
				return oRC24 != null && !oRC24.isEmpty();
			case V2xmlPackage.ORCCONTENT__ORC25:
				return oRC25 != null;
			case V2xmlPackage.ORCCONTENT__ORC26:
				return oRC26 != null;
			case V2xmlPackage.ORCCONTENT__ORC27:
				return oRC27 != null;
			case V2xmlPackage.ORCCONTENT__ORC28:
				return oRC28 != null;
			case V2xmlPackage.ORCCONTENT__ORC29:
				return oRC29 != null;
			case V2xmlPackage.ORCCONTENT__ORC30:
				return oRC30 != null;
			case V2xmlPackage.ORCCONTENT__ANY:
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

} //ORCCONTENTImpl
