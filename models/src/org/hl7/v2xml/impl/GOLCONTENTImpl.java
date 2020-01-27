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

import org.hl7.v2xml.GOL10CONTENT;
import org.hl7.v2xml.GOL11CONTENT;
import org.hl7.v2xml.GOL12CONTENT;
import org.hl7.v2xml.GOL13CONTENT;
import org.hl7.v2xml.GOL14CONTENT;
import org.hl7.v2xml.GOL15CONTENT;
import org.hl7.v2xml.GOL16CONTENT;
import org.hl7.v2xml.GOL17CONTENT;
import org.hl7.v2xml.GOL18CONTENT;
import org.hl7.v2xml.GOL19CONTENT;
import org.hl7.v2xml.GOL1CONTENT;
import org.hl7.v2xml.GOL20CONTENT;
import org.hl7.v2xml.GOL21CONTENT;
import org.hl7.v2xml.GOL2CONTENT;
import org.hl7.v2xml.GOL3CONTENT;
import org.hl7.v2xml.GOL4CONTENT;
import org.hl7.v2xml.GOL5CONTENT;
import org.hl7.v2xml.GOL6CONTENT;
import org.hl7.v2xml.GOL7CONTENT;
import org.hl7.v2xml.GOL8CONTENT;
import org.hl7.v2xml.GOL9CONTENT;
import org.hl7.v2xml.GOLCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GOLCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL1 <em>GOL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL2 <em>GOL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL3 <em>GOL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL4 <em>GOL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL5 <em>GOL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL6 <em>GOL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL7 <em>GOL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL8 <em>GOL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL9 <em>GOL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL10 <em>GOL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL11 <em>GOL11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL12 <em>GOL12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL13 <em>GOL13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL14 <em>GOL14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL15 <em>GOL15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL16 <em>GOL16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL17 <em>GOL17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL18 <em>GOL18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL19 <em>GOL19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL20 <em>GOL20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getGOL21 <em>GOL21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GOLCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GOLCONTENTImpl extends EObjectImpl implements GOLCONTENT {
	/**
	 * The cached value of the '{@link #getGOL1() <em>GOL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL1()
	 * @generated
	 * @ordered
	 */
	protected GOL1CONTENT gOL1;

	/**
	 * The cached value of the '{@link #getGOL2() <em>GOL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL2()
	 * @generated
	 * @ordered
	 */
	protected GOL2CONTENT gOL2;

	/**
	 * The cached value of the '{@link #getGOL3() <em>GOL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL3()
	 * @generated
	 * @ordered
	 */
	protected GOL3CONTENT gOL3;

	/**
	 * The cached value of the '{@link #getGOL4() <em>GOL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL4()
	 * @generated
	 * @ordered
	 */
	protected GOL4CONTENT gOL4;

	/**
	 * The cached value of the '{@link #getGOL5() <em>GOL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL5()
	 * @generated
	 * @ordered
	 */
	protected GOL5CONTENT gOL5;

	/**
	 * The cached value of the '{@link #getGOL6() <em>GOL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL6()
	 * @generated
	 * @ordered
	 */
	protected GOL6CONTENT gOL6;

	/**
	 * The cached value of the '{@link #getGOL7() <em>GOL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL7()
	 * @generated
	 * @ordered
	 */
	protected GOL7CONTENT gOL7;

	/**
	 * The cached value of the '{@link #getGOL8() <em>GOL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL8()
	 * @generated
	 * @ordered
	 */
	protected GOL8CONTENT gOL8;

	/**
	 * The cached value of the '{@link #getGOL9() <em>GOL9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL9()
	 * @generated
	 * @ordered
	 */
	protected GOL9CONTENT gOL9;

	/**
	 * The cached value of the '{@link #getGOL10() <em>GOL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL10()
	 * @generated
	 * @ordered
	 */
	protected GOL10CONTENT gOL10;

	/**
	 * The cached value of the '{@link #getGOL11() <em>GOL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL11()
	 * @generated
	 * @ordered
	 */
	protected GOL11CONTENT gOL11;

	/**
	 * The cached value of the '{@link #getGOL12() <em>GOL12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL12()
	 * @generated
	 * @ordered
	 */
	protected GOL12CONTENT gOL12;

	/**
	 * The cached value of the '{@link #getGOL13() <em>GOL13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL13()
	 * @generated
	 * @ordered
	 */
	protected GOL13CONTENT gOL13;

	/**
	 * The cached value of the '{@link #getGOL14() <em>GOL14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL14()
	 * @generated
	 * @ordered
	 */
	protected GOL14CONTENT gOL14;

	/**
	 * The cached value of the '{@link #getGOL15() <em>GOL15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL15()
	 * @generated
	 * @ordered
	 */
	protected GOL15CONTENT gOL15;

	/**
	 * The cached value of the '{@link #getGOL16() <em>GOL16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL16()
	 * @generated
	 * @ordered
	 */
	protected GOL16CONTENT gOL16;

	/**
	 * The cached value of the '{@link #getGOL17() <em>GOL17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL17()
	 * @generated
	 * @ordered
	 */
	protected EList<GOL17CONTENT> gOL17;

	/**
	 * The cached value of the '{@link #getGOL18() <em>GOL18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL18()
	 * @generated
	 * @ordered
	 */
	protected GOL18CONTENT gOL18;

	/**
	 * The cached value of the '{@link #getGOL19() <em>GOL19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL19()
	 * @generated
	 * @ordered
	 */
	protected GOL19CONTENT gOL19;

	/**
	 * The cached value of the '{@link #getGOL20() <em>GOL20</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL20()
	 * @generated
	 * @ordered
	 */
	protected EList<GOL20CONTENT> gOL20;

	/**
	 * The cached value of the '{@link #getGOL21() <em>GOL21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOL21()
	 * @generated
	 * @ordered
	 */
	protected EList<GOL21CONTENT> gOL21;

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
	protected GOLCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getGOLCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL1CONTENT getGOL1() {
		return gOL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL1(GOL1CONTENT newGOL1, NotificationChain msgs) {
		GOL1CONTENT oldGOL1 = gOL1;
		gOL1 = newGOL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL1, oldGOL1, newGOL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL1(GOL1CONTENT newGOL1) {
		if (newGOL1 != gOL1) {
			NotificationChain msgs = null;
			if (gOL1 != null)
				msgs = ((InternalEObject)gOL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL1, null, msgs);
			if (newGOL1 != null)
				msgs = ((InternalEObject)newGOL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL1, null, msgs);
			msgs = basicSetGOL1(newGOL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL1, newGOL1, newGOL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL2CONTENT getGOL2() {
		return gOL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL2(GOL2CONTENT newGOL2, NotificationChain msgs) {
		GOL2CONTENT oldGOL2 = gOL2;
		gOL2 = newGOL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL2, oldGOL2, newGOL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL2(GOL2CONTENT newGOL2) {
		if (newGOL2 != gOL2) {
			NotificationChain msgs = null;
			if (gOL2 != null)
				msgs = ((InternalEObject)gOL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL2, null, msgs);
			if (newGOL2 != null)
				msgs = ((InternalEObject)newGOL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL2, null, msgs);
			msgs = basicSetGOL2(newGOL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL2, newGOL2, newGOL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL3CONTENT getGOL3() {
		return gOL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL3(GOL3CONTENT newGOL3, NotificationChain msgs) {
		GOL3CONTENT oldGOL3 = gOL3;
		gOL3 = newGOL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL3, oldGOL3, newGOL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL3(GOL3CONTENT newGOL3) {
		if (newGOL3 != gOL3) {
			NotificationChain msgs = null;
			if (gOL3 != null)
				msgs = ((InternalEObject)gOL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL3, null, msgs);
			if (newGOL3 != null)
				msgs = ((InternalEObject)newGOL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL3, null, msgs);
			msgs = basicSetGOL3(newGOL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL3, newGOL3, newGOL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL4CONTENT getGOL4() {
		return gOL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL4(GOL4CONTENT newGOL4, NotificationChain msgs) {
		GOL4CONTENT oldGOL4 = gOL4;
		gOL4 = newGOL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL4, oldGOL4, newGOL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL4(GOL4CONTENT newGOL4) {
		if (newGOL4 != gOL4) {
			NotificationChain msgs = null;
			if (gOL4 != null)
				msgs = ((InternalEObject)gOL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL4, null, msgs);
			if (newGOL4 != null)
				msgs = ((InternalEObject)newGOL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL4, null, msgs);
			msgs = basicSetGOL4(newGOL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL4, newGOL4, newGOL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL5CONTENT getGOL5() {
		return gOL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL5(GOL5CONTENT newGOL5, NotificationChain msgs) {
		GOL5CONTENT oldGOL5 = gOL5;
		gOL5 = newGOL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL5, oldGOL5, newGOL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL5(GOL5CONTENT newGOL5) {
		if (newGOL5 != gOL5) {
			NotificationChain msgs = null;
			if (gOL5 != null)
				msgs = ((InternalEObject)gOL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL5, null, msgs);
			if (newGOL5 != null)
				msgs = ((InternalEObject)newGOL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL5, null, msgs);
			msgs = basicSetGOL5(newGOL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL5, newGOL5, newGOL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL6CONTENT getGOL6() {
		return gOL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL6(GOL6CONTENT newGOL6, NotificationChain msgs) {
		GOL6CONTENT oldGOL6 = gOL6;
		gOL6 = newGOL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL6, oldGOL6, newGOL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL6(GOL6CONTENT newGOL6) {
		if (newGOL6 != gOL6) {
			NotificationChain msgs = null;
			if (gOL6 != null)
				msgs = ((InternalEObject)gOL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL6, null, msgs);
			if (newGOL6 != null)
				msgs = ((InternalEObject)newGOL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL6, null, msgs);
			msgs = basicSetGOL6(newGOL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL6, newGOL6, newGOL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL7CONTENT getGOL7() {
		return gOL7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL7(GOL7CONTENT newGOL7, NotificationChain msgs) {
		GOL7CONTENT oldGOL7 = gOL7;
		gOL7 = newGOL7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL7, oldGOL7, newGOL7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL7(GOL7CONTENT newGOL7) {
		if (newGOL7 != gOL7) {
			NotificationChain msgs = null;
			if (gOL7 != null)
				msgs = ((InternalEObject)gOL7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL7, null, msgs);
			if (newGOL7 != null)
				msgs = ((InternalEObject)newGOL7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL7, null, msgs);
			msgs = basicSetGOL7(newGOL7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL7, newGOL7, newGOL7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL8CONTENT getGOL8() {
		return gOL8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL8(GOL8CONTENT newGOL8, NotificationChain msgs) {
		GOL8CONTENT oldGOL8 = gOL8;
		gOL8 = newGOL8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL8, oldGOL8, newGOL8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL8(GOL8CONTENT newGOL8) {
		if (newGOL8 != gOL8) {
			NotificationChain msgs = null;
			if (gOL8 != null)
				msgs = ((InternalEObject)gOL8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL8, null, msgs);
			if (newGOL8 != null)
				msgs = ((InternalEObject)newGOL8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL8, null, msgs);
			msgs = basicSetGOL8(newGOL8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL8, newGOL8, newGOL8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL9CONTENT getGOL9() {
		return gOL9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL9(GOL9CONTENT newGOL9, NotificationChain msgs) {
		GOL9CONTENT oldGOL9 = gOL9;
		gOL9 = newGOL9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL9, oldGOL9, newGOL9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL9(GOL9CONTENT newGOL9) {
		if (newGOL9 != gOL9) {
			NotificationChain msgs = null;
			if (gOL9 != null)
				msgs = ((InternalEObject)gOL9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL9, null, msgs);
			if (newGOL9 != null)
				msgs = ((InternalEObject)newGOL9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL9, null, msgs);
			msgs = basicSetGOL9(newGOL9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL9, newGOL9, newGOL9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL10CONTENT getGOL10() {
		return gOL10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL10(GOL10CONTENT newGOL10, NotificationChain msgs) {
		GOL10CONTENT oldGOL10 = gOL10;
		gOL10 = newGOL10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL10, oldGOL10, newGOL10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL10(GOL10CONTENT newGOL10) {
		if (newGOL10 != gOL10) {
			NotificationChain msgs = null;
			if (gOL10 != null)
				msgs = ((InternalEObject)gOL10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL10, null, msgs);
			if (newGOL10 != null)
				msgs = ((InternalEObject)newGOL10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL10, null, msgs);
			msgs = basicSetGOL10(newGOL10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL10, newGOL10, newGOL10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL11CONTENT getGOL11() {
		return gOL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL11(GOL11CONTENT newGOL11, NotificationChain msgs) {
		GOL11CONTENT oldGOL11 = gOL11;
		gOL11 = newGOL11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL11, oldGOL11, newGOL11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL11(GOL11CONTENT newGOL11) {
		if (newGOL11 != gOL11) {
			NotificationChain msgs = null;
			if (gOL11 != null)
				msgs = ((InternalEObject)gOL11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL11, null, msgs);
			if (newGOL11 != null)
				msgs = ((InternalEObject)newGOL11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL11, null, msgs);
			msgs = basicSetGOL11(newGOL11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL11, newGOL11, newGOL11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL12CONTENT getGOL12() {
		return gOL12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL12(GOL12CONTENT newGOL12, NotificationChain msgs) {
		GOL12CONTENT oldGOL12 = gOL12;
		gOL12 = newGOL12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL12, oldGOL12, newGOL12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL12(GOL12CONTENT newGOL12) {
		if (newGOL12 != gOL12) {
			NotificationChain msgs = null;
			if (gOL12 != null)
				msgs = ((InternalEObject)gOL12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL12, null, msgs);
			if (newGOL12 != null)
				msgs = ((InternalEObject)newGOL12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL12, null, msgs);
			msgs = basicSetGOL12(newGOL12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL12, newGOL12, newGOL12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL13CONTENT getGOL13() {
		return gOL13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL13(GOL13CONTENT newGOL13, NotificationChain msgs) {
		GOL13CONTENT oldGOL13 = gOL13;
		gOL13 = newGOL13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL13, oldGOL13, newGOL13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL13(GOL13CONTENT newGOL13) {
		if (newGOL13 != gOL13) {
			NotificationChain msgs = null;
			if (gOL13 != null)
				msgs = ((InternalEObject)gOL13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL13, null, msgs);
			if (newGOL13 != null)
				msgs = ((InternalEObject)newGOL13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL13, null, msgs);
			msgs = basicSetGOL13(newGOL13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL13, newGOL13, newGOL13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL14CONTENT getGOL14() {
		return gOL14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL14(GOL14CONTENT newGOL14, NotificationChain msgs) {
		GOL14CONTENT oldGOL14 = gOL14;
		gOL14 = newGOL14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL14, oldGOL14, newGOL14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL14(GOL14CONTENT newGOL14) {
		if (newGOL14 != gOL14) {
			NotificationChain msgs = null;
			if (gOL14 != null)
				msgs = ((InternalEObject)gOL14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL14, null, msgs);
			if (newGOL14 != null)
				msgs = ((InternalEObject)newGOL14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL14, null, msgs);
			msgs = basicSetGOL14(newGOL14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL14, newGOL14, newGOL14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL15CONTENT getGOL15() {
		return gOL15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL15(GOL15CONTENT newGOL15, NotificationChain msgs) {
		GOL15CONTENT oldGOL15 = gOL15;
		gOL15 = newGOL15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL15, oldGOL15, newGOL15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL15(GOL15CONTENT newGOL15) {
		if (newGOL15 != gOL15) {
			NotificationChain msgs = null;
			if (gOL15 != null)
				msgs = ((InternalEObject)gOL15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL15, null, msgs);
			if (newGOL15 != null)
				msgs = ((InternalEObject)newGOL15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL15, null, msgs);
			msgs = basicSetGOL15(newGOL15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL15, newGOL15, newGOL15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL16CONTENT getGOL16() {
		return gOL16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL16(GOL16CONTENT newGOL16, NotificationChain msgs) {
		GOL16CONTENT oldGOL16 = gOL16;
		gOL16 = newGOL16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL16, oldGOL16, newGOL16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL16(GOL16CONTENT newGOL16) {
		if (newGOL16 != gOL16) {
			NotificationChain msgs = null;
			if (gOL16 != null)
				msgs = ((InternalEObject)gOL16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL16, null, msgs);
			if (newGOL16 != null)
				msgs = ((InternalEObject)newGOL16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL16, null, msgs);
			msgs = basicSetGOL16(newGOL16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL16, newGOL16, newGOL16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOL17CONTENT> getGOL17() {
		if (gOL17 == null) {
			gOL17 = new EObjectContainmentEList<GOL17CONTENT>(GOL17CONTENT.class, this, V2xmlPackage.GOLCONTENT__GOL17);
		}
		return gOL17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL18CONTENT getGOL18() {
		return gOL18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL18(GOL18CONTENT newGOL18, NotificationChain msgs) {
		GOL18CONTENT oldGOL18 = gOL18;
		gOL18 = newGOL18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL18, oldGOL18, newGOL18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL18(GOL18CONTENT newGOL18) {
		if (newGOL18 != gOL18) {
			NotificationChain msgs = null;
			if (gOL18 != null)
				msgs = ((InternalEObject)gOL18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL18, null, msgs);
			if (newGOL18 != null)
				msgs = ((InternalEObject)newGOL18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL18, null, msgs);
			msgs = basicSetGOL18(newGOL18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL18, newGOL18, newGOL18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GOL19CONTENT getGOL19() {
		return gOL19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGOL19(GOL19CONTENT newGOL19, NotificationChain msgs) {
		GOL19CONTENT oldGOL19 = gOL19;
		gOL19 = newGOL19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL19, oldGOL19, newGOL19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOL19(GOL19CONTENT newGOL19) {
		if (newGOL19 != gOL19) {
			NotificationChain msgs = null;
			if (gOL19 != null)
				msgs = ((InternalEObject)gOL19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL19, null, msgs);
			if (newGOL19 != null)
				msgs = ((InternalEObject)newGOL19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GOLCONTENT__GOL19, null, msgs);
			msgs = basicSetGOL19(newGOL19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GOLCONTENT__GOL19, newGOL19, newGOL19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOL20CONTENT> getGOL20() {
		if (gOL20 == null) {
			gOL20 = new EObjectContainmentEList<GOL20CONTENT>(GOL20CONTENT.class, this, V2xmlPackage.GOLCONTENT__GOL20);
		}
		return gOL20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GOL21CONTENT> getGOL21() {
		if (gOL21 == null) {
			gOL21 = new EObjectContainmentEList<GOL21CONTENT>(GOL21CONTENT.class, this, V2xmlPackage.GOLCONTENT__GOL21);
		}
		return gOL21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.GOLCONTENT__ANY);
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
			case V2xmlPackage.GOLCONTENT__GOL1:
				return basicSetGOL1(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL2:
				return basicSetGOL2(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL3:
				return basicSetGOL3(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL4:
				return basicSetGOL4(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL5:
				return basicSetGOL5(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL6:
				return basicSetGOL6(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL7:
				return basicSetGOL7(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL8:
				return basicSetGOL8(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL9:
				return basicSetGOL9(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL10:
				return basicSetGOL10(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL11:
				return basicSetGOL11(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL12:
				return basicSetGOL12(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL13:
				return basicSetGOL13(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL14:
				return basicSetGOL14(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL15:
				return basicSetGOL15(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL16:
				return basicSetGOL16(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL17:
				return ((InternalEList<?>)getGOL17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GOLCONTENT__GOL18:
				return basicSetGOL18(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL19:
				return basicSetGOL19(null, msgs);
			case V2xmlPackage.GOLCONTENT__GOL20:
				return ((InternalEList<?>)getGOL20()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GOLCONTENT__GOL21:
				return ((InternalEList<?>)getGOL21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GOLCONTENT__ANY:
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
			case V2xmlPackage.GOLCONTENT__GOL1:
				return getGOL1();
			case V2xmlPackage.GOLCONTENT__GOL2:
				return getGOL2();
			case V2xmlPackage.GOLCONTENT__GOL3:
				return getGOL3();
			case V2xmlPackage.GOLCONTENT__GOL4:
				return getGOL4();
			case V2xmlPackage.GOLCONTENT__GOL5:
				return getGOL5();
			case V2xmlPackage.GOLCONTENT__GOL6:
				return getGOL6();
			case V2xmlPackage.GOLCONTENT__GOL7:
				return getGOL7();
			case V2xmlPackage.GOLCONTENT__GOL8:
				return getGOL8();
			case V2xmlPackage.GOLCONTENT__GOL9:
				return getGOL9();
			case V2xmlPackage.GOLCONTENT__GOL10:
				return getGOL10();
			case V2xmlPackage.GOLCONTENT__GOL11:
				return getGOL11();
			case V2xmlPackage.GOLCONTENT__GOL12:
				return getGOL12();
			case V2xmlPackage.GOLCONTENT__GOL13:
				return getGOL13();
			case V2xmlPackage.GOLCONTENT__GOL14:
				return getGOL14();
			case V2xmlPackage.GOLCONTENT__GOL15:
				return getGOL15();
			case V2xmlPackage.GOLCONTENT__GOL16:
				return getGOL16();
			case V2xmlPackage.GOLCONTENT__GOL17:
				return getGOL17();
			case V2xmlPackage.GOLCONTENT__GOL18:
				return getGOL18();
			case V2xmlPackage.GOLCONTENT__GOL19:
				return getGOL19();
			case V2xmlPackage.GOLCONTENT__GOL20:
				return getGOL20();
			case V2xmlPackage.GOLCONTENT__GOL21:
				return getGOL21();
			case V2xmlPackage.GOLCONTENT__ANY:
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
			case V2xmlPackage.GOLCONTENT__GOL1:
				setGOL1((GOL1CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL2:
				setGOL2((GOL2CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL3:
				setGOL3((GOL3CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL4:
				setGOL4((GOL4CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL5:
				setGOL5((GOL5CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL6:
				setGOL6((GOL6CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL7:
				setGOL7((GOL7CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL8:
				setGOL8((GOL8CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL9:
				setGOL9((GOL9CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL10:
				setGOL10((GOL10CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL11:
				setGOL11((GOL11CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL12:
				setGOL12((GOL12CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL13:
				setGOL13((GOL13CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL14:
				setGOL14((GOL14CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL15:
				setGOL15((GOL15CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL16:
				setGOL16((GOL16CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL17:
				getGOL17().clear();
				getGOL17().addAll((Collection<? extends GOL17CONTENT>)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL18:
				setGOL18((GOL18CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL19:
				setGOL19((GOL19CONTENT)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL20:
				getGOL20().clear();
				getGOL20().addAll((Collection<? extends GOL20CONTENT>)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__GOL21:
				getGOL21().clear();
				getGOL21().addAll((Collection<? extends GOL21CONTENT>)newValue);
				return;
			case V2xmlPackage.GOLCONTENT__ANY:
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
			case V2xmlPackage.GOLCONTENT__GOL1:
				setGOL1((GOL1CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL2:
				setGOL2((GOL2CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL3:
				setGOL3((GOL3CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL4:
				setGOL4((GOL4CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL5:
				setGOL5((GOL5CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL6:
				setGOL6((GOL6CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL7:
				setGOL7((GOL7CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL8:
				setGOL8((GOL8CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL9:
				setGOL9((GOL9CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL10:
				setGOL10((GOL10CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL11:
				setGOL11((GOL11CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL12:
				setGOL12((GOL12CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL13:
				setGOL13((GOL13CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL14:
				setGOL14((GOL14CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL15:
				setGOL15((GOL15CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL16:
				setGOL16((GOL16CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL17:
				getGOL17().clear();
				return;
			case V2xmlPackage.GOLCONTENT__GOL18:
				setGOL18((GOL18CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL19:
				setGOL19((GOL19CONTENT)null);
				return;
			case V2xmlPackage.GOLCONTENT__GOL20:
				getGOL20().clear();
				return;
			case V2xmlPackage.GOLCONTENT__GOL21:
				getGOL21().clear();
				return;
			case V2xmlPackage.GOLCONTENT__ANY:
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
			case V2xmlPackage.GOLCONTENT__GOL1:
				return gOL1 != null;
			case V2xmlPackage.GOLCONTENT__GOL2:
				return gOL2 != null;
			case V2xmlPackage.GOLCONTENT__GOL3:
				return gOL3 != null;
			case V2xmlPackage.GOLCONTENT__GOL4:
				return gOL4 != null;
			case V2xmlPackage.GOLCONTENT__GOL5:
				return gOL5 != null;
			case V2xmlPackage.GOLCONTENT__GOL6:
				return gOL6 != null;
			case V2xmlPackage.GOLCONTENT__GOL7:
				return gOL7 != null;
			case V2xmlPackage.GOLCONTENT__GOL8:
				return gOL8 != null;
			case V2xmlPackage.GOLCONTENT__GOL9:
				return gOL9 != null;
			case V2xmlPackage.GOLCONTENT__GOL10:
				return gOL10 != null;
			case V2xmlPackage.GOLCONTENT__GOL11:
				return gOL11 != null;
			case V2xmlPackage.GOLCONTENT__GOL12:
				return gOL12 != null;
			case V2xmlPackage.GOLCONTENT__GOL13:
				return gOL13 != null;
			case V2xmlPackage.GOLCONTENT__GOL14:
				return gOL14 != null;
			case V2xmlPackage.GOLCONTENT__GOL15:
				return gOL15 != null;
			case V2xmlPackage.GOLCONTENT__GOL16:
				return gOL16 != null;
			case V2xmlPackage.GOLCONTENT__GOL17:
				return gOL17 != null && !gOL17.isEmpty();
			case V2xmlPackage.GOLCONTENT__GOL18:
				return gOL18 != null;
			case V2xmlPackage.GOLCONTENT__GOL19:
				return gOL19 != null;
			case V2xmlPackage.GOLCONTENT__GOL20:
				return gOL20 != null && !gOL20.isEmpty();
			case V2xmlPackage.GOLCONTENT__GOL21:
				return gOL21 != null && !gOL21.isEmpty();
			case V2xmlPackage.GOLCONTENT__ANY:
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

} //GOLCONTENTImpl
