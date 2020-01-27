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

import org.hl7.v2xml.CON10CONTENT;
import org.hl7.v2xml.CON11CONTENT;
import org.hl7.v2xml.CON12CONTENT;
import org.hl7.v2xml.CON13CONTENT;
import org.hl7.v2xml.CON14CONTENT;
import org.hl7.v2xml.CON15CONTENT;
import org.hl7.v2xml.CON16CONTENT;
import org.hl7.v2xml.CON17CONTENT;
import org.hl7.v2xml.CON18CONTENT;
import org.hl7.v2xml.CON19CONTENT;
import org.hl7.v2xml.CON1CONTENT;
import org.hl7.v2xml.CON20CONTENT;
import org.hl7.v2xml.CON21CONTENT;
import org.hl7.v2xml.CON22CONTENT;
import org.hl7.v2xml.CON23CONTENT;
import org.hl7.v2xml.CON24CONTENT;
import org.hl7.v2xml.CON25CONTENT;
import org.hl7.v2xml.CON2CONTENT;
import org.hl7.v2xml.CON3CONTENT;
import org.hl7.v2xml.CON4CONTENT;
import org.hl7.v2xml.CON5CONTENT;
import org.hl7.v2xml.CON6CONTENT;
import org.hl7.v2xml.CON7CONTENT;
import org.hl7.v2xml.CON8CONTENT;
import org.hl7.v2xml.CON9CONTENT;
import org.hl7.v2xml.CONCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CONCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON1 <em>CON1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON2 <em>CON2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON3 <em>CON3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON4 <em>CON4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON5 <em>CON5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON6 <em>CON6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON7 <em>CON7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON8 <em>CON8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON9 <em>CON9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON10 <em>CON10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON11 <em>CON11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON12 <em>CON12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON13 <em>CON13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON14 <em>CON14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON15 <em>CON15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON16 <em>CON16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON17 <em>CON17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON18 <em>CON18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON19 <em>CON19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON20 <em>CON20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON21 <em>CON21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON22 <em>CON22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON23 <em>CON23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON24 <em>CON24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getCON25 <em>CON25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CONCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CONCONTENTImpl extends EObjectImpl implements CONCONTENT {
	/**
	 * The cached value of the '{@link #getCON1() <em>CON1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON1()
	 * @generated
	 * @ordered
	 */
	protected CON1CONTENT cON1;

	/**
	 * The cached value of the '{@link #getCON2() <em>CON2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON2()
	 * @generated
	 * @ordered
	 */
	protected CON2CONTENT cON2;

	/**
	 * The cached value of the '{@link #getCON3() <em>CON3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON3()
	 * @generated
	 * @ordered
	 */
	protected CON3CONTENT cON3;

	/**
	 * The cached value of the '{@link #getCON4() <em>CON4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON4()
	 * @generated
	 * @ordered
	 */
	protected CON4CONTENT cON4;

	/**
	 * The cached value of the '{@link #getCON5() <em>CON5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON5()
	 * @generated
	 * @ordered
	 */
	protected EList<CON5CONTENT> cON5;

	/**
	 * The cached value of the '{@link #getCON6() <em>CON6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON6()
	 * @generated
	 * @ordered
	 */
	protected EList<CON6CONTENT> cON6;

	/**
	 * The cached value of the '{@link #getCON7() <em>CON7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON7()
	 * @generated
	 * @ordered
	 */
	protected EList<CON7CONTENT> cON7;

	/**
	 * The cached value of the '{@link #getCON8() <em>CON8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON8()
	 * @generated
	 * @ordered
	 */
	protected EList<CON8CONTENT> cON8;

	/**
	 * The cached value of the '{@link #getCON9() <em>CON9</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON9()
	 * @generated
	 * @ordered
	 */
	protected EList<CON9CONTENT> cON9;

	/**
	 * The cached value of the '{@link #getCON10() <em>CON10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON10()
	 * @generated
	 * @ordered
	 */
	protected CON10CONTENT cON10;

	/**
	 * The cached value of the '{@link #getCON11() <em>CON11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON11()
	 * @generated
	 * @ordered
	 */
	protected CON11CONTENT cON11;

	/**
	 * The cached value of the '{@link #getCON12() <em>CON12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON12()
	 * @generated
	 * @ordered
	 */
	protected CON12CONTENT cON12;

	/**
	 * The cached value of the '{@link #getCON13() <em>CON13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON13()
	 * @generated
	 * @ordered
	 */
	protected CON13CONTENT cON13;

	/**
	 * The cached value of the '{@link #getCON14() <em>CON14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON14()
	 * @generated
	 * @ordered
	 */
	protected CON14CONTENT cON14;

	/**
	 * The cached value of the '{@link #getCON15() <em>CON15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON15()
	 * @generated
	 * @ordered
	 */
	protected CON15CONTENT cON15;

	/**
	 * The cached value of the '{@link #getCON16() <em>CON16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON16()
	 * @generated
	 * @ordered
	 */
	protected CON16CONTENT cON16;

	/**
	 * The cached value of the '{@link #getCON17() <em>CON17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON17()
	 * @generated
	 * @ordered
	 */
	protected CON17CONTENT cON17;

	/**
	 * The cached value of the '{@link #getCON18() <em>CON18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON18()
	 * @generated
	 * @ordered
	 */
	protected CON18CONTENT cON18;

	/**
	 * The cached value of the '{@link #getCON19() <em>CON19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON19()
	 * @generated
	 * @ordered
	 */
	protected CON19CONTENT cON19;

	/**
	 * The cached value of the '{@link #getCON20() <em>CON20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON20()
	 * @generated
	 * @ordered
	 */
	protected CON20CONTENT cON20;

	/**
	 * The cached value of the '{@link #getCON21() <em>CON21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON21()
	 * @generated
	 * @ordered
	 */
	protected CON21CONTENT cON21;

	/**
	 * The cached value of the '{@link #getCON22() <em>CON22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON22()
	 * @generated
	 * @ordered
	 */
	protected CON22CONTENT cON22;

	/**
	 * The cached value of the '{@link #getCON23() <em>CON23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON23()
	 * @generated
	 * @ordered
	 */
	protected CON23CONTENT cON23;

	/**
	 * The cached value of the '{@link #getCON24() <em>CON24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON24()
	 * @generated
	 * @ordered
	 */
	protected EList<CON24CONTENT> cON24;

	/**
	 * The cached value of the '{@link #getCON25() <em>CON25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCON25()
	 * @generated
	 * @ordered
	 */
	protected EList<CON25CONTENT> cON25;

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
	protected CONCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCONCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON1CONTENT getCON1() {
		return cON1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON1(CON1CONTENT newCON1, NotificationChain msgs) {
		CON1CONTENT oldCON1 = cON1;
		cON1 = newCON1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON1, oldCON1, newCON1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON1(CON1CONTENT newCON1) {
		if (newCON1 != cON1) {
			NotificationChain msgs = null;
			if (cON1 != null)
				msgs = ((InternalEObject)cON1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON1, null, msgs);
			if (newCON1 != null)
				msgs = ((InternalEObject)newCON1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON1, null, msgs);
			msgs = basicSetCON1(newCON1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON1, newCON1, newCON1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON2CONTENT getCON2() {
		return cON2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON2(CON2CONTENT newCON2, NotificationChain msgs) {
		CON2CONTENT oldCON2 = cON2;
		cON2 = newCON2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON2, oldCON2, newCON2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON2(CON2CONTENT newCON2) {
		if (newCON2 != cON2) {
			NotificationChain msgs = null;
			if (cON2 != null)
				msgs = ((InternalEObject)cON2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON2, null, msgs);
			if (newCON2 != null)
				msgs = ((InternalEObject)newCON2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON2, null, msgs);
			msgs = basicSetCON2(newCON2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON2, newCON2, newCON2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON3CONTENT getCON3() {
		return cON3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON3(CON3CONTENT newCON3, NotificationChain msgs) {
		CON3CONTENT oldCON3 = cON3;
		cON3 = newCON3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON3, oldCON3, newCON3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON3(CON3CONTENT newCON3) {
		if (newCON3 != cON3) {
			NotificationChain msgs = null;
			if (cON3 != null)
				msgs = ((InternalEObject)cON3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON3, null, msgs);
			if (newCON3 != null)
				msgs = ((InternalEObject)newCON3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON3, null, msgs);
			msgs = basicSetCON3(newCON3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON3, newCON3, newCON3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON4CONTENT getCON4() {
		return cON4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON4(CON4CONTENT newCON4, NotificationChain msgs) {
		CON4CONTENT oldCON4 = cON4;
		cON4 = newCON4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON4, oldCON4, newCON4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON4(CON4CONTENT newCON4) {
		if (newCON4 != cON4) {
			NotificationChain msgs = null;
			if (cON4 != null)
				msgs = ((InternalEObject)cON4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON4, null, msgs);
			if (newCON4 != null)
				msgs = ((InternalEObject)newCON4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON4, null, msgs);
			msgs = basicSetCON4(newCON4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON4, newCON4, newCON4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON5CONTENT> getCON5() {
		if (cON5 == null) {
			cON5 = new EObjectContainmentEList<CON5CONTENT>(CON5CONTENT.class, this, V2xmlPackage.CONCONTENT__CON5);
		}
		return cON5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON6CONTENT> getCON6() {
		if (cON6 == null) {
			cON6 = new EObjectContainmentEList<CON6CONTENT>(CON6CONTENT.class, this, V2xmlPackage.CONCONTENT__CON6);
		}
		return cON6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON7CONTENT> getCON7() {
		if (cON7 == null) {
			cON7 = new EObjectContainmentEList<CON7CONTENT>(CON7CONTENT.class, this, V2xmlPackage.CONCONTENT__CON7);
		}
		return cON7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON8CONTENT> getCON8() {
		if (cON8 == null) {
			cON8 = new EObjectContainmentEList<CON8CONTENT>(CON8CONTENT.class, this, V2xmlPackage.CONCONTENT__CON8);
		}
		return cON8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON9CONTENT> getCON9() {
		if (cON9 == null) {
			cON9 = new EObjectContainmentEList<CON9CONTENT>(CON9CONTENT.class, this, V2xmlPackage.CONCONTENT__CON9);
		}
		return cON9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON10CONTENT getCON10() {
		return cON10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON10(CON10CONTENT newCON10, NotificationChain msgs) {
		CON10CONTENT oldCON10 = cON10;
		cON10 = newCON10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON10, oldCON10, newCON10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON10(CON10CONTENT newCON10) {
		if (newCON10 != cON10) {
			NotificationChain msgs = null;
			if (cON10 != null)
				msgs = ((InternalEObject)cON10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON10, null, msgs);
			if (newCON10 != null)
				msgs = ((InternalEObject)newCON10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON10, null, msgs);
			msgs = basicSetCON10(newCON10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON10, newCON10, newCON10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON11CONTENT getCON11() {
		return cON11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON11(CON11CONTENT newCON11, NotificationChain msgs) {
		CON11CONTENT oldCON11 = cON11;
		cON11 = newCON11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON11, oldCON11, newCON11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON11(CON11CONTENT newCON11) {
		if (newCON11 != cON11) {
			NotificationChain msgs = null;
			if (cON11 != null)
				msgs = ((InternalEObject)cON11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON11, null, msgs);
			if (newCON11 != null)
				msgs = ((InternalEObject)newCON11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON11, null, msgs);
			msgs = basicSetCON11(newCON11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON11, newCON11, newCON11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON12CONTENT getCON12() {
		return cON12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON12(CON12CONTENT newCON12, NotificationChain msgs) {
		CON12CONTENT oldCON12 = cON12;
		cON12 = newCON12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON12, oldCON12, newCON12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON12(CON12CONTENT newCON12) {
		if (newCON12 != cON12) {
			NotificationChain msgs = null;
			if (cON12 != null)
				msgs = ((InternalEObject)cON12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON12, null, msgs);
			if (newCON12 != null)
				msgs = ((InternalEObject)newCON12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON12, null, msgs);
			msgs = basicSetCON12(newCON12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON12, newCON12, newCON12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON13CONTENT getCON13() {
		return cON13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON13(CON13CONTENT newCON13, NotificationChain msgs) {
		CON13CONTENT oldCON13 = cON13;
		cON13 = newCON13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON13, oldCON13, newCON13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON13(CON13CONTENT newCON13) {
		if (newCON13 != cON13) {
			NotificationChain msgs = null;
			if (cON13 != null)
				msgs = ((InternalEObject)cON13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON13, null, msgs);
			if (newCON13 != null)
				msgs = ((InternalEObject)newCON13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON13, null, msgs);
			msgs = basicSetCON13(newCON13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON13, newCON13, newCON13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON14CONTENT getCON14() {
		return cON14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON14(CON14CONTENT newCON14, NotificationChain msgs) {
		CON14CONTENT oldCON14 = cON14;
		cON14 = newCON14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON14, oldCON14, newCON14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON14(CON14CONTENT newCON14) {
		if (newCON14 != cON14) {
			NotificationChain msgs = null;
			if (cON14 != null)
				msgs = ((InternalEObject)cON14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON14, null, msgs);
			if (newCON14 != null)
				msgs = ((InternalEObject)newCON14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON14, null, msgs);
			msgs = basicSetCON14(newCON14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON14, newCON14, newCON14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON15CONTENT getCON15() {
		return cON15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON15(CON15CONTENT newCON15, NotificationChain msgs) {
		CON15CONTENT oldCON15 = cON15;
		cON15 = newCON15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON15, oldCON15, newCON15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON15(CON15CONTENT newCON15) {
		if (newCON15 != cON15) {
			NotificationChain msgs = null;
			if (cON15 != null)
				msgs = ((InternalEObject)cON15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON15, null, msgs);
			if (newCON15 != null)
				msgs = ((InternalEObject)newCON15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON15, null, msgs);
			msgs = basicSetCON15(newCON15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON15, newCON15, newCON15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON16CONTENT getCON16() {
		return cON16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON16(CON16CONTENT newCON16, NotificationChain msgs) {
		CON16CONTENT oldCON16 = cON16;
		cON16 = newCON16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON16, oldCON16, newCON16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON16(CON16CONTENT newCON16) {
		if (newCON16 != cON16) {
			NotificationChain msgs = null;
			if (cON16 != null)
				msgs = ((InternalEObject)cON16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON16, null, msgs);
			if (newCON16 != null)
				msgs = ((InternalEObject)newCON16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON16, null, msgs);
			msgs = basicSetCON16(newCON16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON16, newCON16, newCON16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON17CONTENT getCON17() {
		return cON17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON17(CON17CONTENT newCON17, NotificationChain msgs) {
		CON17CONTENT oldCON17 = cON17;
		cON17 = newCON17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON17, oldCON17, newCON17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON17(CON17CONTENT newCON17) {
		if (newCON17 != cON17) {
			NotificationChain msgs = null;
			if (cON17 != null)
				msgs = ((InternalEObject)cON17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON17, null, msgs);
			if (newCON17 != null)
				msgs = ((InternalEObject)newCON17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON17, null, msgs);
			msgs = basicSetCON17(newCON17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON17, newCON17, newCON17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON18CONTENT getCON18() {
		return cON18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON18(CON18CONTENT newCON18, NotificationChain msgs) {
		CON18CONTENT oldCON18 = cON18;
		cON18 = newCON18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON18, oldCON18, newCON18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON18(CON18CONTENT newCON18) {
		if (newCON18 != cON18) {
			NotificationChain msgs = null;
			if (cON18 != null)
				msgs = ((InternalEObject)cON18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON18, null, msgs);
			if (newCON18 != null)
				msgs = ((InternalEObject)newCON18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON18, null, msgs);
			msgs = basicSetCON18(newCON18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON18, newCON18, newCON18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON19CONTENT getCON19() {
		return cON19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON19(CON19CONTENT newCON19, NotificationChain msgs) {
		CON19CONTENT oldCON19 = cON19;
		cON19 = newCON19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON19, oldCON19, newCON19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON19(CON19CONTENT newCON19) {
		if (newCON19 != cON19) {
			NotificationChain msgs = null;
			if (cON19 != null)
				msgs = ((InternalEObject)cON19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON19, null, msgs);
			if (newCON19 != null)
				msgs = ((InternalEObject)newCON19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON19, null, msgs);
			msgs = basicSetCON19(newCON19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON19, newCON19, newCON19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON20CONTENT getCON20() {
		return cON20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON20(CON20CONTENT newCON20, NotificationChain msgs) {
		CON20CONTENT oldCON20 = cON20;
		cON20 = newCON20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON20, oldCON20, newCON20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON20(CON20CONTENT newCON20) {
		if (newCON20 != cON20) {
			NotificationChain msgs = null;
			if (cON20 != null)
				msgs = ((InternalEObject)cON20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON20, null, msgs);
			if (newCON20 != null)
				msgs = ((InternalEObject)newCON20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON20, null, msgs);
			msgs = basicSetCON20(newCON20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON20, newCON20, newCON20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON21CONTENT getCON21() {
		return cON21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON21(CON21CONTENT newCON21, NotificationChain msgs) {
		CON21CONTENT oldCON21 = cON21;
		cON21 = newCON21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON21, oldCON21, newCON21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON21(CON21CONTENT newCON21) {
		if (newCON21 != cON21) {
			NotificationChain msgs = null;
			if (cON21 != null)
				msgs = ((InternalEObject)cON21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON21, null, msgs);
			if (newCON21 != null)
				msgs = ((InternalEObject)newCON21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON21, null, msgs);
			msgs = basicSetCON21(newCON21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON21, newCON21, newCON21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON22CONTENT getCON22() {
		return cON22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON22(CON22CONTENT newCON22, NotificationChain msgs) {
		CON22CONTENT oldCON22 = cON22;
		cON22 = newCON22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON22, oldCON22, newCON22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON22(CON22CONTENT newCON22) {
		if (newCON22 != cON22) {
			NotificationChain msgs = null;
			if (cON22 != null)
				msgs = ((InternalEObject)cON22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON22, null, msgs);
			if (newCON22 != null)
				msgs = ((InternalEObject)newCON22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON22, null, msgs);
			msgs = basicSetCON22(newCON22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON22, newCON22, newCON22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CON23CONTENT getCON23() {
		return cON23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCON23(CON23CONTENT newCON23, NotificationChain msgs) {
		CON23CONTENT oldCON23 = cON23;
		cON23 = newCON23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON23, oldCON23, newCON23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCON23(CON23CONTENT newCON23) {
		if (newCON23 != cON23) {
			NotificationChain msgs = null;
			if (cON23 != null)
				msgs = ((InternalEObject)cON23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON23, null, msgs);
			if (newCON23 != null)
				msgs = ((InternalEObject)newCON23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CONCONTENT__CON23, null, msgs);
			msgs = basicSetCON23(newCON23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CONCONTENT__CON23, newCON23, newCON23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON24CONTENT> getCON24() {
		if (cON24 == null) {
			cON24 = new EObjectContainmentEList<CON24CONTENT>(CON24CONTENT.class, this, V2xmlPackage.CONCONTENT__CON24);
		}
		return cON24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CON25CONTENT> getCON25() {
		if (cON25 == null) {
			cON25 = new EObjectContainmentEList<CON25CONTENT>(CON25CONTENT.class, this, V2xmlPackage.CONCONTENT__CON25);
		}
		return cON25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CONCONTENT__ANY);
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
			case V2xmlPackage.CONCONTENT__CON1:
				return basicSetCON1(null, msgs);
			case V2xmlPackage.CONCONTENT__CON2:
				return basicSetCON2(null, msgs);
			case V2xmlPackage.CONCONTENT__CON3:
				return basicSetCON3(null, msgs);
			case V2xmlPackage.CONCONTENT__CON4:
				return basicSetCON4(null, msgs);
			case V2xmlPackage.CONCONTENT__CON5:
				return ((InternalEList<?>)getCON5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON6:
				return ((InternalEList<?>)getCON6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON7:
				return ((InternalEList<?>)getCON7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON8:
				return ((InternalEList<?>)getCON8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON9:
				return ((InternalEList<?>)getCON9()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON10:
				return basicSetCON10(null, msgs);
			case V2xmlPackage.CONCONTENT__CON11:
				return basicSetCON11(null, msgs);
			case V2xmlPackage.CONCONTENT__CON12:
				return basicSetCON12(null, msgs);
			case V2xmlPackage.CONCONTENT__CON13:
				return basicSetCON13(null, msgs);
			case V2xmlPackage.CONCONTENT__CON14:
				return basicSetCON14(null, msgs);
			case V2xmlPackage.CONCONTENT__CON15:
				return basicSetCON15(null, msgs);
			case V2xmlPackage.CONCONTENT__CON16:
				return basicSetCON16(null, msgs);
			case V2xmlPackage.CONCONTENT__CON17:
				return basicSetCON17(null, msgs);
			case V2xmlPackage.CONCONTENT__CON18:
				return basicSetCON18(null, msgs);
			case V2xmlPackage.CONCONTENT__CON19:
				return basicSetCON19(null, msgs);
			case V2xmlPackage.CONCONTENT__CON20:
				return basicSetCON20(null, msgs);
			case V2xmlPackage.CONCONTENT__CON21:
				return basicSetCON21(null, msgs);
			case V2xmlPackage.CONCONTENT__CON22:
				return basicSetCON22(null, msgs);
			case V2xmlPackage.CONCONTENT__CON23:
				return basicSetCON23(null, msgs);
			case V2xmlPackage.CONCONTENT__CON24:
				return ((InternalEList<?>)getCON24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__CON25:
				return ((InternalEList<?>)getCON25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CONCONTENT__ANY:
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
			case V2xmlPackage.CONCONTENT__CON1:
				return getCON1();
			case V2xmlPackage.CONCONTENT__CON2:
				return getCON2();
			case V2xmlPackage.CONCONTENT__CON3:
				return getCON3();
			case V2xmlPackage.CONCONTENT__CON4:
				return getCON4();
			case V2xmlPackage.CONCONTENT__CON5:
				return getCON5();
			case V2xmlPackage.CONCONTENT__CON6:
				return getCON6();
			case V2xmlPackage.CONCONTENT__CON7:
				return getCON7();
			case V2xmlPackage.CONCONTENT__CON8:
				return getCON8();
			case V2xmlPackage.CONCONTENT__CON9:
				return getCON9();
			case V2xmlPackage.CONCONTENT__CON10:
				return getCON10();
			case V2xmlPackage.CONCONTENT__CON11:
				return getCON11();
			case V2xmlPackage.CONCONTENT__CON12:
				return getCON12();
			case V2xmlPackage.CONCONTENT__CON13:
				return getCON13();
			case V2xmlPackage.CONCONTENT__CON14:
				return getCON14();
			case V2xmlPackage.CONCONTENT__CON15:
				return getCON15();
			case V2xmlPackage.CONCONTENT__CON16:
				return getCON16();
			case V2xmlPackage.CONCONTENT__CON17:
				return getCON17();
			case V2xmlPackage.CONCONTENT__CON18:
				return getCON18();
			case V2xmlPackage.CONCONTENT__CON19:
				return getCON19();
			case V2xmlPackage.CONCONTENT__CON20:
				return getCON20();
			case V2xmlPackage.CONCONTENT__CON21:
				return getCON21();
			case V2xmlPackage.CONCONTENT__CON22:
				return getCON22();
			case V2xmlPackage.CONCONTENT__CON23:
				return getCON23();
			case V2xmlPackage.CONCONTENT__CON24:
				return getCON24();
			case V2xmlPackage.CONCONTENT__CON25:
				return getCON25();
			case V2xmlPackage.CONCONTENT__ANY:
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
			case V2xmlPackage.CONCONTENT__CON1:
				setCON1((CON1CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON2:
				setCON2((CON2CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON3:
				setCON3((CON3CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON4:
				setCON4((CON4CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON5:
				getCON5().clear();
				getCON5().addAll((Collection<? extends CON5CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON6:
				getCON6().clear();
				getCON6().addAll((Collection<? extends CON6CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON7:
				getCON7().clear();
				getCON7().addAll((Collection<? extends CON7CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON8:
				getCON8().clear();
				getCON8().addAll((Collection<? extends CON8CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON9:
				getCON9().clear();
				getCON9().addAll((Collection<? extends CON9CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON10:
				setCON10((CON10CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON11:
				setCON11((CON11CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON12:
				setCON12((CON12CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON13:
				setCON13((CON13CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON14:
				setCON14((CON14CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON15:
				setCON15((CON15CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON16:
				setCON16((CON16CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON17:
				setCON17((CON17CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON18:
				setCON18((CON18CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON19:
				setCON19((CON19CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON20:
				setCON20((CON20CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON21:
				setCON21((CON21CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON22:
				setCON22((CON22CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON23:
				setCON23((CON23CONTENT)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON24:
				getCON24().clear();
				getCON24().addAll((Collection<? extends CON24CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__CON25:
				getCON25().clear();
				getCON25().addAll((Collection<? extends CON25CONTENT>)newValue);
				return;
			case V2xmlPackage.CONCONTENT__ANY:
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
			case V2xmlPackage.CONCONTENT__CON1:
				setCON1((CON1CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON2:
				setCON2((CON2CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON3:
				setCON3((CON3CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON4:
				setCON4((CON4CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON5:
				getCON5().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON6:
				getCON6().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON7:
				getCON7().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON8:
				getCON8().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON9:
				getCON9().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON10:
				setCON10((CON10CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON11:
				setCON11((CON11CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON12:
				setCON12((CON12CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON13:
				setCON13((CON13CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON14:
				setCON14((CON14CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON15:
				setCON15((CON15CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON16:
				setCON16((CON16CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON17:
				setCON17((CON17CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON18:
				setCON18((CON18CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON19:
				setCON19((CON19CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON20:
				setCON20((CON20CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON21:
				setCON21((CON21CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON22:
				setCON22((CON22CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON23:
				setCON23((CON23CONTENT)null);
				return;
			case V2xmlPackage.CONCONTENT__CON24:
				getCON24().clear();
				return;
			case V2xmlPackage.CONCONTENT__CON25:
				getCON25().clear();
				return;
			case V2xmlPackage.CONCONTENT__ANY:
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
			case V2xmlPackage.CONCONTENT__CON1:
				return cON1 != null;
			case V2xmlPackage.CONCONTENT__CON2:
				return cON2 != null;
			case V2xmlPackage.CONCONTENT__CON3:
				return cON3 != null;
			case V2xmlPackage.CONCONTENT__CON4:
				return cON4 != null;
			case V2xmlPackage.CONCONTENT__CON5:
				return cON5 != null && !cON5.isEmpty();
			case V2xmlPackage.CONCONTENT__CON6:
				return cON6 != null && !cON6.isEmpty();
			case V2xmlPackage.CONCONTENT__CON7:
				return cON7 != null && !cON7.isEmpty();
			case V2xmlPackage.CONCONTENT__CON8:
				return cON8 != null && !cON8.isEmpty();
			case V2xmlPackage.CONCONTENT__CON9:
				return cON9 != null && !cON9.isEmpty();
			case V2xmlPackage.CONCONTENT__CON10:
				return cON10 != null;
			case V2xmlPackage.CONCONTENT__CON11:
				return cON11 != null;
			case V2xmlPackage.CONCONTENT__CON12:
				return cON12 != null;
			case V2xmlPackage.CONCONTENT__CON13:
				return cON13 != null;
			case V2xmlPackage.CONCONTENT__CON14:
				return cON14 != null;
			case V2xmlPackage.CONCONTENT__CON15:
				return cON15 != null;
			case V2xmlPackage.CONCONTENT__CON16:
				return cON16 != null;
			case V2xmlPackage.CONCONTENT__CON17:
				return cON17 != null;
			case V2xmlPackage.CONCONTENT__CON18:
				return cON18 != null;
			case V2xmlPackage.CONCONTENT__CON19:
				return cON19 != null;
			case V2xmlPackage.CONCONTENT__CON20:
				return cON20 != null;
			case V2xmlPackage.CONCONTENT__CON21:
				return cON21 != null;
			case V2xmlPackage.CONCONTENT__CON22:
				return cON22 != null;
			case V2xmlPackage.CONCONTENT__CON23:
				return cON23 != null;
			case V2xmlPackage.CONCONTENT__CON24:
				return cON24 != null && !cON24.isEmpty();
			case V2xmlPackage.CONCONTENT__CON25:
				return cON25 != null && !cON25.isEmpty();
			case V2xmlPackage.CONCONTENT__ANY:
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

} //CONCONTENTImpl
