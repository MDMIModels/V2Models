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

import org.hl7.v2xml.ARQ10CONTENT;
import org.hl7.v2xml.ARQ11CONTENT;
import org.hl7.v2xml.ARQ12CONTENT;
import org.hl7.v2xml.ARQ13CONTENT;
import org.hl7.v2xml.ARQ14CONTENT;
import org.hl7.v2xml.ARQ15CONTENT;
import org.hl7.v2xml.ARQ16CONTENT;
import org.hl7.v2xml.ARQ17CONTENT;
import org.hl7.v2xml.ARQ18CONTENT;
import org.hl7.v2xml.ARQ19CONTENT;
import org.hl7.v2xml.ARQ1CONTENT;
import org.hl7.v2xml.ARQ20CONTENT;
import org.hl7.v2xml.ARQ21CONTENT;
import org.hl7.v2xml.ARQ22CONTENT;
import org.hl7.v2xml.ARQ23CONTENT;
import org.hl7.v2xml.ARQ24CONTENT;
import org.hl7.v2xml.ARQ25CONTENT;
import org.hl7.v2xml.ARQ2CONTENT;
import org.hl7.v2xml.ARQ3CONTENT;
import org.hl7.v2xml.ARQ4CONTENT;
import org.hl7.v2xml.ARQ5CONTENT;
import org.hl7.v2xml.ARQ6CONTENT;
import org.hl7.v2xml.ARQ7CONTENT;
import org.hl7.v2xml.ARQ8CONTENT;
import org.hl7.v2xml.ARQ9CONTENT;
import org.hl7.v2xml.ARQCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ARQCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ1 <em>ARQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ2 <em>ARQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ3 <em>ARQ3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ4 <em>ARQ4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ5 <em>ARQ5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ6 <em>ARQ6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ7 <em>ARQ7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ8 <em>ARQ8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ9 <em>ARQ9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ10 <em>ARQ10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ11 <em>ARQ11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ12 <em>ARQ12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ13 <em>ARQ13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ14 <em>ARQ14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ15 <em>ARQ15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ16 <em>ARQ16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ17 <em>ARQ17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ18 <em>ARQ18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ19 <em>ARQ19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ20 <em>ARQ20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ21 <em>ARQ21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ22 <em>ARQ22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ23 <em>ARQ23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ24 <em>ARQ24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getARQ25 <em>ARQ25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ARQCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ARQCONTENTImpl extends EObjectImpl implements ARQCONTENT {
	/**
	 * The cached value of the '{@link #getARQ1() <em>ARQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ1()
	 * @generated
	 * @ordered
	 */
	protected ARQ1CONTENT aRQ1;

	/**
	 * The cached value of the '{@link #getARQ2() <em>ARQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ2()
	 * @generated
	 * @ordered
	 */
	protected ARQ2CONTENT aRQ2;

	/**
	 * The cached value of the '{@link #getARQ3() <em>ARQ3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ3()
	 * @generated
	 * @ordered
	 */
	protected ARQ3CONTENT aRQ3;

	/**
	 * The cached value of the '{@link #getARQ4() <em>ARQ4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ4()
	 * @generated
	 * @ordered
	 */
	protected ARQ4CONTENT aRQ4;

	/**
	 * The cached value of the '{@link #getARQ5() <em>ARQ5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ5()
	 * @generated
	 * @ordered
	 */
	protected ARQ5CONTENT aRQ5;

	/**
	 * The cached value of the '{@link #getARQ6() <em>ARQ6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ6()
	 * @generated
	 * @ordered
	 */
	protected ARQ6CONTENT aRQ6;

	/**
	 * The cached value of the '{@link #getARQ7() <em>ARQ7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ7()
	 * @generated
	 * @ordered
	 */
	protected ARQ7CONTENT aRQ7;

	/**
	 * The cached value of the '{@link #getARQ8() <em>ARQ8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ8()
	 * @generated
	 * @ordered
	 */
	protected ARQ8CONTENT aRQ8;

	/**
	 * The cached value of the '{@link #getARQ9() <em>ARQ9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ9()
	 * @generated
	 * @ordered
	 */
	protected ARQ9CONTENT aRQ9;

	/**
	 * The cached value of the '{@link #getARQ10() <em>ARQ10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ10()
	 * @generated
	 * @ordered
	 */
	protected ARQ10CONTENT aRQ10;

	/**
	 * The cached value of the '{@link #getARQ11() <em>ARQ11</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ11()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ11CONTENT> aRQ11;

	/**
	 * The cached value of the '{@link #getARQ12() <em>ARQ12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ12()
	 * @generated
	 * @ordered
	 */
	protected ARQ12CONTENT aRQ12;

	/**
	 * The cached value of the '{@link #getARQ13() <em>ARQ13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ13()
	 * @generated
	 * @ordered
	 */
	protected ARQ13CONTENT aRQ13;

	/**
	 * The cached value of the '{@link #getARQ14() <em>ARQ14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ14()
	 * @generated
	 * @ordered
	 */
	protected ARQ14CONTENT aRQ14;

	/**
	 * The cached value of the '{@link #getARQ15() <em>ARQ15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ15()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ15CONTENT> aRQ15;

	/**
	 * The cached value of the '{@link #getARQ16() <em>ARQ16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ16()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ16CONTENT> aRQ16;

	/**
	 * The cached value of the '{@link #getARQ17() <em>ARQ17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ17()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ17CONTENT> aRQ17;

	/**
	 * The cached value of the '{@link #getARQ18() <em>ARQ18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ18()
	 * @generated
	 * @ordered
	 */
	protected ARQ18CONTENT aRQ18;

	/**
	 * The cached value of the '{@link #getARQ19() <em>ARQ19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ19()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ19CONTENT> aRQ19;

	/**
	 * The cached value of the '{@link #getARQ20() <em>ARQ20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ20()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ20CONTENT> aRQ20;

	/**
	 * The cached value of the '{@link #getARQ21() <em>ARQ21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ21()
	 * @generated
	 * @ordered
	 */
	protected ARQ21CONTENT aRQ21;

	/**
	 * The cached value of the '{@link #getARQ22() <em>ARQ22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ22()
	 * @generated
	 * @ordered
	 */
	protected ARQ22CONTENT aRQ22;

	/**
	 * The cached value of the '{@link #getARQ23() <em>ARQ23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ23()
	 * @generated
	 * @ordered
	 */
	protected ARQ23CONTENT aRQ23;

	/**
	 * The cached value of the '{@link #getARQ24() <em>ARQ24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ24()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ24CONTENT> aRQ24;

	/**
	 * The cached value of the '{@link #getARQ25() <em>ARQ25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getARQ25()
	 * @generated
	 * @ordered
	 */
	protected EList<ARQ25CONTENT> aRQ25;

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
	protected ARQCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getARQCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ1CONTENT getARQ1() {
		return aRQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ1(ARQ1CONTENT newARQ1, NotificationChain msgs) {
		ARQ1CONTENT oldARQ1 = aRQ1;
		aRQ1 = newARQ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ1, oldARQ1, newARQ1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ1(ARQ1CONTENT newARQ1) {
		if (newARQ1 != aRQ1) {
			NotificationChain msgs = null;
			if (aRQ1 != null)
				msgs = ((InternalEObject)aRQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ1, null, msgs);
			if (newARQ1 != null)
				msgs = ((InternalEObject)newARQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ1, null, msgs);
			msgs = basicSetARQ1(newARQ1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ1, newARQ1, newARQ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ2CONTENT getARQ2() {
		return aRQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ2(ARQ2CONTENT newARQ2, NotificationChain msgs) {
		ARQ2CONTENT oldARQ2 = aRQ2;
		aRQ2 = newARQ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ2, oldARQ2, newARQ2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ2(ARQ2CONTENT newARQ2) {
		if (newARQ2 != aRQ2) {
			NotificationChain msgs = null;
			if (aRQ2 != null)
				msgs = ((InternalEObject)aRQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ2, null, msgs);
			if (newARQ2 != null)
				msgs = ((InternalEObject)newARQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ2, null, msgs);
			msgs = basicSetARQ2(newARQ2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ2, newARQ2, newARQ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ3CONTENT getARQ3() {
		return aRQ3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ3(ARQ3CONTENT newARQ3, NotificationChain msgs) {
		ARQ3CONTENT oldARQ3 = aRQ3;
		aRQ3 = newARQ3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ3, oldARQ3, newARQ3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ3(ARQ3CONTENT newARQ3) {
		if (newARQ3 != aRQ3) {
			NotificationChain msgs = null;
			if (aRQ3 != null)
				msgs = ((InternalEObject)aRQ3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ3, null, msgs);
			if (newARQ3 != null)
				msgs = ((InternalEObject)newARQ3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ3, null, msgs);
			msgs = basicSetARQ3(newARQ3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ3, newARQ3, newARQ3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ4CONTENT getARQ4() {
		return aRQ4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ4(ARQ4CONTENT newARQ4, NotificationChain msgs) {
		ARQ4CONTENT oldARQ4 = aRQ4;
		aRQ4 = newARQ4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ4, oldARQ4, newARQ4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ4(ARQ4CONTENT newARQ4) {
		if (newARQ4 != aRQ4) {
			NotificationChain msgs = null;
			if (aRQ4 != null)
				msgs = ((InternalEObject)aRQ4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ4, null, msgs);
			if (newARQ4 != null)
				msgs = ((InternalEObject)newARQ4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ4, null, msgs);
			msgs = basicSetARQ4(newARQ4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ4, newARQ4, newARQ4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ5CONTENT getARQ5() {
		return aRQ5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ5(ARQ5CONTENT newARQ5, NotificationChain msgs) {
		ARQ5CONTENT oldARQ5 = aRQ5;
		aRQ5 = newARQ5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ5, oldARQ5, newARQ5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ5(ARQ5CONTENT newARQ5) {
		if (newARQ5 != aRQ5) {
			NotificationChain msgs = null;
			if (aRQ5 != null)
				msgs = ((InternalEObject)aRQ5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ5, null, msgs);
			if (newARQ5 != null)
				msgs = ((InternalEObject)newARQ5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ5, null, msgs);
			msgs = basicSetARQ5(newARQ5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ5, newARQ5, newARQ5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ6CONTENT getARQ6() {
		return aRQ6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ6(ARQ6CONTENT newARQ6, NotificationChain msgs) {
		ARQ6CONTENT oldARQ6 = aRQ6;
		aRQ6 = newARQ6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ6, oldARQ6, newARQ6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ6(ARQ6CONTENT newARQ6) {
		if (newARQ6 != aRQ6) {
			NotificationChain msgs = null;
			if (aRQ6 != null)
				msgs = ((InternalEObject)aRQ6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ6, null, msgs);
			if (newARQ6 != null)
				msgs = ((InternalEObject)newARQ6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ6, null, msgs);
			msgs = basicSetARQ6(newARQ6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ6, newARQ6, newARQ6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ7CONTENT getARQ7() {
		return aRQ7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ7(ARQ7CONTENT newARQ7, NotificationChain msgs) {
		ARQ7CONTENT oldARQ7 = aRQ7;
		aRQ7 = newARQ7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ7, oldARQ7, newARQ7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ7(ARQ7CONTENT newARQ7) {
		if (newARQ7 != aRQ7) {
			NotificationChain msgs = null;
			if (aRQ7 != null)
				msgs = ((InternalEObject)aRQ7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ7, null, msgs);
			if (newARQ7 != null)
				msgs = ((InternalEObject)newARQ7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ7, null, msgs);
			msgs = basicSetARQ7(newARQ7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ7, newARQ7, newARQ7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ8CONTENT getARQ8() {
		return aRQ8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ8(ARQ8CONTENT newARQ8, NotificationChain msgs) {
		ARQ8CONTENT oldARQ8 = aRQ8;
		aRQ8 = newARQ8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ8, oldARQ8, newARQ8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ8(ARQ8CONTENT newARQ8) {
		if (newARQ8 != aRQ8) {
			NotificationChain msgs = null;
			if (aRQ8 != null)
				msgs = ((InternalEObject)aRQ8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ8, null, msgs);
			if (newARQ8 != null)
				msgs = ((InternalEObject)newARQ8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ8, null, msgs);
			msgs = basicSetARQ8(newARQ8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ8, newARQ8, newARQ8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ9CONTENT getARQ9() {
		return aRQ9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ9(ARQ9CONTENT newARQ9, NotificationChain msgs) {
		ARQ9CONTENT oldARQ9 = aRQ9;
		aRQ9 = newARQ9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ9, oldARQ9, newARQ9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ9(ARQ9CONTENT newARQ9) {
		if (newARQ9 != aRQ9) {
			NotificationChain msgs = null;
			if (aRQ9 != null)
				msgs = ((InternalEObject)aRQ9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ9, null, msgs);
			if (newARQ9 != null)
				msgs = ((InternalEObject)newARQ9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ9, null, msgs);
			msgs = basicSetARQ9(newARQ9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ9, newARQ9, newARQ9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ10CONTENT getARQ10() {
		return aRQ10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ10(ARQ10CONTENT newARQ10, NotificationChain msgs) {
		ARQ10CONTENT oldARQ10 = aRQ10;
		aRQ10 = newARQ10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ10, oldARQ10, newARQ10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ10(ARQ10CONTENT newARQ10) {
		if (newARQ10 != aRQ10) {
			NotificationChain msgs = null;
			if (aRQ10 != null)
				msgs = ((InternalEObject)aRQ10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ10, null, msgs);
			if (newARQ10 != null)
				msgs = ((InternalEObject)newARQ10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ10, null, msgs);
			msgs = basicSetARQ10(newARQ10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ10, newARQ10, newARQ10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ11CONTENT> getARQ11() {
		if (aRQ11 == null) {
			aRQ11 = new EObjectContainmentEList<ARQ11CONTENT>(ARQ11CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ11);
		}
		return aRQ11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ12CONTENT getARQ12() {
		return aRQ12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ12(ARQ12CONTENT newARQ12, NotificationChain msgs) {
		ARQ12CONTENT oldARQ12 = aRQ12;
		aRQ12 = newARQ12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ12, oldARQ12, newARQ12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ12(ARQ12CONTENT newARQ12) {
		if (newARQ12 != aRQ12) {
			NotificationChain msgs = null;
			if (aRQ12 != null)
				msgs = ((InternalEObject)aRQ12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ12, null, msgs);
			if (newARQ12 != null)
				msgs = ((InternalEObject)newARQ12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ12, null, msgs);
			msgs = basicSetARQ12(newARQ12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ12, newARQ12, newARQ12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ13CONTENT getARQ13() {
		return aRQ13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ13(ARQ13CONTENT newARQ13, NotificationChain msgs) {
		ARQ13CONTENT oldARQ13 = aRQ13;
		aRQ13 = newARQ13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ13, oldARQ13, newARQ13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ13(ARQ13CONTENT newARQ13) {
		if (newARQ13 != aRQ13) {
			NotificationChain msgs = null;
			if (aRQ13 != null)
				msgs = ((InternalEObject)aRQ13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ13, null, msgs);
			if (newARQ13 != null)
				msgs = ((InternalEObject)newARQ13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ13, null, msgs);
			msgs = basicSetARQ13(newARQ13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ13, newARQ13, newARQ13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ14CONTENT getARQ14() {
		return aRQ14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ14(ARQ14CONTENT newARQ14, NotificationChain msgs) {
		ARQ14CONTENT oldARQ14 = aRQ14;
		aRQ14 = newARQ14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ14, oldARQ14, newARQ14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ14(ARQ14CONTENT newARQ14) {
		if (newARQ14 != aRQ14) {
			NotificationChain msgs = null;
			if (aRQ14 != null)
				msgs = ((InternalEObject)aRQ14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ14, null, msgs);
			if (newARQ14 != null)
				msgs = ((InternalEObject)newARQ14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ14, null, msgs);
			msgs = basicSetARQ14(newARQ14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ14, newARQ14, newARQ14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ15CONTENT> getARQ15() {
		if (aRQ15 == null) {
			aRQ15 = new EObjectContainmentEList<ARQ15CONTENT>(ARQ15CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ15);
		}
		return aRQ15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ16CONTENT> getARQ16() {
		if (aRQ16 == null) {
			aRQ16 = new EObjectContainmentEList<ARQ16CONTENT>(ARQ16CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ16);
		}
		return aRQ16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ17CONTENT> getARQ17() {
		if (aRQ17 == null) {
			aRQ17 = new EObjectContainmentEList<ARQ17CONTENT>(ARQ17CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ17);
		}
		return aRQ17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ18CONTENT getARQ18() {
		return aRQ18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ18(ARQ18CONTENT newARQ18, NotificationChain msgs) {
		ARQ18CONTENT oldARQ18 = aRQ18;
		aRQ18 = newARQ18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ18, oldARQ18, newARQ18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ18(ARQ18CONTENT newARQ18) {
		if (newARQ18 != aRQ18) {
			NotificationChain msgs = null;
			if (aRQ18 != null)
				msgs = ((InternalEObject)aRQ18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ18, null, msgs);
			if (newARQ18 != null)
				msgs = ((InternalEObject)newARQ18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ18, null, msgs);
			msgs = basicSetARQ18(newARQ18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ18, newARQ18, newARQ18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ19CONTENT> getARQ19() {
		if (aRQ19 == null) {
			aRQ19 = new EObjectContainmentEList<ARQ19CONTENT>(ARQ19CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ19);
		}
		return aRQ19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ20CONTENT> getARQ20() {
		if (aRQ20 == null) {
			aRQ20 = new EObjectContainmentEList<ARQ20CONTENT>(ARQ20CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ20);
		}
		return aRQ20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ21CONTENT getARQ21() {
		return aRQ21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ21(ARQ21CONTENT newARQ21, NotificationChain msgs) {
		ARQ21CONTENT oldARQ21 = aRQ21;
		aRQ21 = newARQ21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ21, oldARQ21, newARQ21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ21(ARQ21CONTENT newARQ21) {
		if (newARQ21 != aRQ21) {
			NotificationChain msgs = null;
			if (aRQ21 != null)
				msgs = ((InternalEObject)aRQ21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ21, null, msgs);
			if (newARQ21 != null)
				msgs = ((InternalEObject)newARQ21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ21, null, msgs);
			msgs = basicSetARQ21(newARQ21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ21, newARQ21, newARQ21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ22CONTENT getARQ22() {
		return aRQ22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ22(ARQ22CONTENT newARQ22, NotificationChain msgs) {
		ARQ22CONTENT oldARQ22 = aRQ22;
		aRQ22 = newARQ22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ22, oldARQ22, newARQ22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ22(ARQ22CONTENT newARQ22) {
		if (newARQ22 != aRQ22) {
			NotificationChain msgs = null;
			if (aRQ22 != null)
				msgs = ((InternalEObject)aRQ22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ22, null, msgs);
			if (newARQ22 != null)
				msgs = ((InternalEObject)newARQ22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ22, null, msgs);
			msgs = basicSetARQ22(newARQ22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ22, newARQ22, newARQ22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARQ23CONTENT getARQ23() {
		return aRQ23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetARQ23(ARQ23CONTENT newARQ23, NotificationChain msgs) {
		ARQ23CONTENT oldARQ23 = aRQ23;
		aRQ23 = newARQ23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ23, oldARQ23, newARQ23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setARQ23(ARQ23CONTENT newARQ23) {
		if (newARQ23 != aRQ23) {
			NotificationChain msgs = null;
			if (aRQ23 != null)
				msgs = ((InternalEObject)aRQ23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ23, null, msgs);
			if (newARQ23 != null)
				msgs = ((InternalEObject)newARQ23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ARQCONTENT__ARQ23, null, msgs);
			msgs = basicSetARQ23(newARQ23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ARQCONTENT__ARQ23, newARQ23, newARQ23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ24CONTENT> getARQ24() {
		if (aRQ24 == null) {
			aRQ24 = new EObjectContainmentEList<ARQ24CONTENT>(ARQ24CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ24);
		}
		return aRQ24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ARQ25CONTENT> getARQ25() {
		if (aRQ25 == null) {
			aRQ25 = new EObjectContainmentEList<ARQ25CONTENT>(ARQ25CONTENT.class, this, V2xmlPackage.ARQCONTENT__ARQ25);
		}
		return aRQ25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ARQCONTENT__ANY);
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
			case V2xmlPackage.ARQCONTENT__ARQ1:
				return basicSetARQ1(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ2:
				return basicSetARQ2(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ3:
				return basicSetARQ3(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ4:
				return basicSetARQ4(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ5:
				return basicSetARQ5(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ6:
				return basicSetARQ6(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ7:
				return basicSetARQ7(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ8:
				return basicSetARQ8(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ9:
				return basicSetARQ9(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ10:
				return basicSetARQ10(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ11:
				return ((InternalEList<?>)getARQ11()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ12:
				return basicSetARQ12(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ13:
				return basicSetARQ13(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ14:
				return basicSetARQ14(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ15:
				return ((InternalEList<?>)getARQ15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ16:
				return ((InternalEList<?>)getARQ16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ17:
				return ((InternalEList<?>)getARQ17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ18:
				return basicSetARQ18(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ19:
				return ((InternalEList<?>)getARQ19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ20:
				return ((InternalEList<?>)getARQ20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ21:
				return basicSetARQ21(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ22:
				return basicSetARQ22(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ23:
				return basicSetARQ23(null, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ24:
				return ((InternalEList<?>)getARQ24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ARQ25:
				return ((InternalEList<?>)getARQ25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.ARQCONTENT__ANY:
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
			case V2xmlPackage.ARQCONTENT__ARQ1:
				return getARQ1();
			case V2xmlPackage.ARQCONTENT__ARQ2:
				return getARQ2();
			case V2xmlPackage.ARQCONTENT__ARQ3:
				return getARQ3();
			case V2xmlPackage.ARQCONTENT__ARQ4:
				return getARQ4();
			case V2xmlPackage.ARQCONTENT__ARQ5:
				return getARQ5();
			case V2xmlPackage.ARQCONTENT__ARQ6:
				return getARQ6();
			case V2xmlPackage.ARQCONTENT__ARQ7:
				return getARQ7();
			case V2xmlPackage.ARQCONTENT__ARQ8:
				return getARQ8();
			case V2xmlPackage.ARQCONTENT__ARQ9:
				return getARQ9();
			case V2xmlPackage.ARQCONTENT__ARQ10:
				return getARQ10();
			case V2xmlPackage.ARQCONTENT__ARQ11:
				return getARQ11();
			case V2xmlPackage.ARQCONTENT__ARQ12:
				return getARQ12();
			case V2xmlPackage.ARQCONTENT__ARQ13:
				return getARQ13();
			case V2xmlPackage.ARQCONTENT__ARQ14:
				return getARQ14();
			case V2xmlPackage.ARQCONTENT__ARQ15:
				return getARQ15();
			case V2xmlPackage.ARQCONTENT__ARQ16:
				return getARQ16();
			case V2xmlPackage.ARQCONTENT__ARQ17:
				return getARQ17();
			case V2xmlPackage.ARQCONTENT__ARQ18:
				return getARQ18();
			case V2xmlPackage.ARQCONTENT__ARQ19:
				return getARQ19();
			case V2xmlPackage.ARQCONTENT__ARQ20:
				return getARQ20();
			case V2xmlPackage.ARQCONTENT__ARQ21:
				return getARQ21();
			case V2xmlPackage.ARQCONTENT__ARQ22:
				return getARQ22();
			case V2xmlPackage.ARQCONTENT__ARQ23:
				return getARQ23();
			case V2xmlPackage.ARQCONTENT__ARQ24:
				return getARQ24();
			case V2xmlPackage.ARQCONTENT__ARQ25:
				return getARQ25();
			case V2xmlPackage.ARQCONTENT__ANY:
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
			case V2xmlPackage.ARQCONTENT__ARQ1:
				setARQ1((ARQ1CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ2:
				setARQ2((ARQ2CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ3:
				setARQ3((ARQ3CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ4:
				setARQ4((ARQ4CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ5:
				setARQ5((ARQ5CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ6:
				setARQ6((ARQ6CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ7:
				setARQ7((ARQ7CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ8:
				setARQ8((ARQ8CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ9:
				setARQ9((ARQ9CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ10:
				setARQ10((ARQ10CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ11:
				getARQ11().clear();
				getARQ11().addAll((Collection<? extends ARQ11CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ12:
				setARQ12((ARQ12CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ13:
				setARQ13((ARQ13CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ14:
				setARQ14((ARQ14CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ15:
				getARQ15().clear();
				getARQ15().addAll((Collection<? extends ARQ15CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ16:
				getARQ16().clear();
				getARQ16().addAll((Collection<? extends ARQ16CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ17:
				getARQ17().clear();
				getARQ17().addAll((Collection<? extends ARQ17CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ18:
				setARQ18((ARQ18CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ19:
				getARQ19().clear();
				getARQ19().addAll((Collection<? extends ARQ19CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ20:
				getARQ20().clear();
				getARQ20().addAll((Collection<? extends ARQ20CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ21:
				setARQ21((ARQ21CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ22:
				setARQ22((ARQ22CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ23:
				setARQ23((ARQ23CONTENT)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ24:
				getARQ24().clear();
				getARQ24().addAll((Collection<? extends ARQ24CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ25:
				getARQ25().clear();
				getARQ25().addAll((Collection<? extends ARQ25CONTENT>)newValue);
				return;
			case V2xmlPackage.ARQCONTENT__ANY:
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
			case V2xmlPackage.ARQCONTENT__ARQ1:
				setARQ1((ARQ1CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ2:
				setARQ2((ARQ2CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ3:
				setARQ3((ARQ3CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ4:
				setARQ4((ARQ4CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ5:
				setARQ5((ARQ5CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ6:
				setARQ6((ARQ6CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ7:
				setARQ7((ARQ7CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ8:
				setARQ8((ARQ8CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ9:
				setARQ9((ARQ9CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ10:
				setARQ10((ARQ10CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ11:
				getARQ11().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ12:
				setARQ12((ARQ12CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ13:
				setARQ13((ARQ13CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ14:
				setARQ14((ARQ14CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ15:
				getARQ15().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ16:
				getARQ16().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ17:
				getARQ17().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ18:
				setARQ18((ARQ18CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ19:
				getARQ19().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ20:
				getARQ20().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ21:
				setARQ21((ARQ21CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ22:
				setARQ22((ARQ22CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ23:
				setARQ23((ARQ23CONTENT)null);
				return;
			case V2xmlPackage.ARQCONTENT__ARQ24:
				getARQ24().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ARQ25:
				getARQ25().clear();
				return;
			case V2xmlPackage.ARQCONTENT__ANY:
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
			case V2xmlPackage.ARQCONTENT__ARQ1:
				return aRQ1 != null;
			case V2xmlPackage.ARQCONTENT__ARQ2:
				return aRQ2 != null;
			case V2xmlPackage.ARQCONTENT__ARQ3:
				return aRQ3 != null;
			case V2xmlPackage.ARQCONTENT__ARQ4:
				return aRQ4 != null;
			case V2xmlPackage.ARQCONTENT__ARQ5:
				return aRQ5 != null;
			case V2xmlPackage.ARQCONTENT__ARQ6:
				return aRQ6 != null;
			case V2xmlPackage.ARQCONTENT__ARQ7:
				return aRQ7 != null;
			case V2xmlPackage.ARQCONTENT__ARQ8:
				return aRQ8 != null;
			case V2xmlPackage.ARQCONTENT__ARQ9:
				return aRQ9 != null;
			case V2xmlPackage.ARQCONTENT__ARQ10:
				return aRQ10 != null;
			case V2xmlPackage.ARQCONTENT__ARQ11:
				return aRQ11 != null && !aRQ11.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ12:
				return aRQ12 != null;
			case V2xmlPackage.ARQCONTENT__ARQ13:
				return aRQ13 != null;
			case V2xmlPackage.ARQCONTENT__ARQ14:
				return aRQ14 != null;
			case V2xmlPackage.ARQCONTENT__ARQ15:
				return aRQ15 != null && !aRQ15.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ16:
				return aRQ16 != null && !aRQ16.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ17:
				return aRQ17 != null && !aRQ17.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ18:
				return aRQ18 != null;
			case V2xmlPackage.ARQCONTENT__ARQ19:
				return aRQ19 != null && !aRQ19.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ20:
				return aRQ20 != null && !aRQ20.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ21:
				return aRQ21 != null;
			case V2xmlPackage.ARQCONTENT__ARQ22:
				return aRQ22 != null;
			case V2xmlPackage.ARQCONTENT__ARQ23:
				return aRQ23 != null;
			case V2xmlPackage.ARQCONTENT__ARQ24:
				return aRQ24 != null && !aRQ24.isEmpty();
			case V2xmlPackage.ARQCONTENT__ARQ25:
				return aRQ25 != null && !aRQ25.isEmpty();
			case V2xmlPackage.ARQCONTENT__ANY:
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

} //ARQCONTENTImpl
