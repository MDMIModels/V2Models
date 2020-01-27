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

import org.hl7.v2xml.OBX10CONTENT;
import org.hl7.v2xml.OBX11CONTENT;
import org.hl7.v2xml.OBX12CONTENT;
import org.hl7.v2xml.OBX13CONTENT;
import org.hl7.v2xml.OBX14CONTENT;
import org.hl7.v2xml.OBX15CONTENT;
import org.hl7.v2xml.OBX16CONTENT;
import org.hl7.v2xml.OBX17CONTENT;
import org.hl7.v2xml.OBX18CONTENT;
import org.hl7.v2xml.OBX19CONTENT;
import org.hl7.v2xml.OBX1CONTENT;
import org.hl7.v2xml.OBX2CONTENT;
import org.hl7.v2xml.OBX3CONTENT;
import org.hl7.v2xml.OBX4CONTENT;
import org.hl7.v2xml.OBX5CONTENT;
import org.hl7.v2xml.OBX6CONTENT;
import org.hl7.v2xml.OBX7CONTENT;
import org.hl7.v2xml.OBX8CONTENT;
import org.hl7.v2xml.OBX9CONTENT;
import org.hl7.v2xml.OBXCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OBXCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX1 <em>OBX1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX2 <em>OBX2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX3 <em>OBX3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX4 <em>OBX4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX5 <em>OBX5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX6 <em>OBX6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX7 <em>OBX7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX8 <em>OBX8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX9 <em>OBX9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX10 <em>OBX10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX11 <em>OBX11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX12 <em>OBX12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX13 <em>OBX13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX14 <em>OBX14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX15 <em>OBX15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX16 <em>OBX16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX17 <em>OBX17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX18 <em>OBX18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getOBX19 <em>OBX19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OBXCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OBXCONTENTImpl extends EObjectImpl implements OBXCONTENT {
	/**
	 * The cached value of the '{@link #getOBX1() <em>OBX1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX1()
	 * @generated
	 * @ordered
	 */
	protected OBX1CONTENT oBX1;

	/**
	 * The cached value of the '{@link #getOBX2() <em>OBX2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX2()
	 * @generated
	 * @ordered
	 */
	protected OBX2CONTENT oBX2;

	/**
	 * The cached value of the '{@link #getOBX3() <em>OBX3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX3()
	 * @generated
	 * @ordered
	 */
	protected OBX3CONTENT oBX3;

	/**
	 * The cached value of the '{@link #getOBX4() <em>OBX4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX4()
	 * @generated
	 * @ordered
	 */
	protected OBX4CONTENT oBX4;

	/**
	 * The cached value of the '{@link #getOBX5() <em>OBX5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX5()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX5CONTENT> oBX5;

	/**
	 * The cached value of the '{@link #getOBX6() <em>OBX6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX6()
	 * @generated
	 * @ordered
	 */
	protected OBX6CONTENT oBX6;

	/**
	 * The cached value of the '{@link #getOBX7() <em>OBX7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX7()
	 * @generated
	 * @ordered
	 */
	protected OBX7CONTENT oBX7;

	/**
	 * The cached value of the '{@link #getOBX8() <em>OBX8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX8()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX8CONTENT> oBX8;

	/**
	 * The cached value of the '{@link #getOBX9() <em>OBX9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX9()
	 * @generated
	 * @ordered
	 */
	protected OBX9CONTENT oBX9;

	/**
	 * The cached value of the '{@link #getOBX10() <em>OBX10</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX10()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX10CONTENT> oBX10;

	/**
	 * The cached value of the '{@link #getOBX11() <em>OBX11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX11()
	 * @generated
	 * @ordered
	 */
	protected OBX11CONTENT oBX11;

	/**
	 * The cached value of the '{@link #getOBX12() <em>OBX12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX12()
	 * @generated
	 * @ordered
	 */
	protected OBX12CONTENT oBX12;

	/**
	 * The cached value of the '{@link #getOBX13() <em>OBX13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX13()
	 * @generated
	 * @ordered
	 */
	protected OBX13CONTENT oBX13;

	/**
	 * The cached value of the '{@link #getOBX14() <em>OBX14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX14()
	 * @generated
	 * @ordered
	 */
	protected OBX14CONTENT oBX14;

	/**
	 * The cached value of the '{@link #getOBX15() <em>OBX15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX15()
	 * @generated
	 * @ordered
	 */
	protected OBX15CONTENT oBX15;

	/**
	 * The cached value of the '{@link #getOBX16() <em>OBX16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX16()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX16CONTENT> oBX16;

	/**
	 * The cached value of the '{@link #getOBX17() <em>OBX17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX17()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX17CONTENT> oBX17;

	/**
	 * The cached value of the '{@link #getOBX18() <em>OBX18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX18()
	 * @generated
	 * @ordered
	 */
	protected EList<OBX18CONTENT> oBX18;

	/**
	 * The cached value of the '{@link #getOBX19() <em>OBX19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBX19()
	 * @generated
	 * @ordered
	 */
	protected OBX19CONTENT oBX19;

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
	protected OBXCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOBXCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX1CONTENT getOBX1() {
		return oBX1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX1(OBX1CONTENT newOBX1, NotificationChain msgs) {
		OBX1CONTENT oldOBX1 = oBX1;
		oBX1 = newOBX1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX1, oldOBX1, newOBX1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX1(OBX1CONTENT newOBX1) {
		if (newOBX1 != oBX1) {
			NotificationChain msgs = null;
			if (oBX1 != null)
				msgs = ((InternalEObject)oBX1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX1, null, msgs);
			if (newOBX1 != null)
				msgs = ((InternalEObject)newOBX1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX1, null, msgs);
			msgs = basicSetOBX1(newOBX1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX1, newOBX1, newOBX1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX2CONTENT getOBX2() {
		return oBX2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX2(OBX2CONTENT newOBX2, NotificationChain msgs) {
		OBX2CONTENT oldOBX2 = oBX2;
		oBX2 = newOBX2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX2, oldOBX2, newOBX2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX2(OBX2CONTENT newOBX2) {
		if (newOBX2 != oBX2) {
			NotificationChain msgs = null;
			if (oBX2 != null)
				msgs = ((InternalEObject)oBX2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX2, null, msgs);
			if (newOBX2 != null)
				msgs = ((InternalEObject)newOBX2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX2, null, msgs);
			msgs = basicSetOBX2(newOBX2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX2, newOBX2, newOBX2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX3CONTENT getOBX3() {
		return oBX3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX3(OBX3CONTENT newOBX3, NotificationChain msgs) {
		OBX3CONTENT oldOBX3 = oBX3;
		oBX3 = newOBX3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX3, oldOBX3, newOBX3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX3(OBX3CONTENT newOBX3) {
		if (newOBX3 != oBX3) {
			NotificationChain msgs = null;
			if (oBX3 != null)
				msgs = ((InternalEObject)oBX3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX3, null, msgs);
			if (newOBX3 != null)
				msgs = ((InternalEObject)newOBX3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX3, null, msgs);
			msgs = basicSetOBX3(newOBX3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX3, newOBX3, newOBX3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX4CONTENT getOBX4() {
		return oBX4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX4(OBX4CONTENT newOBX4, NotificationChain msgs) {
		OBX4CONTENT oldOBX4 = oBX4;
		oBX4 = newOBX4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX4, oldOBX4, newOBX4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX4(OBX4CONTENT newOBX4) {
		if (newOBX4 != oBX4) {
			NotificationChain msgs = null;
			if (oBX4 != null)
				msgs = ((InternalEObject)oBX4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX4, null, msgs);
			if (newOBX4 != null)
				msgs = ((InternalEObject)newOBX4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX4, null, msgs);
			msgs = basicSetOBX4(newOBX4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX4, newOBX4, newOBX4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX5CONTENT> getOBX5() {
		if (oBX5 == null) {
			oBX5 = new EObjectContainmentEList<OBX5CONTENT>(OBX5CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX5);
		}
		return oBX5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX6CONTENT getOBX6() {
		return oBX6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX6(OBX6CONTENT newOBX6, NotificationChain msgs) {
		OBX6CONTENT oldOBX6 = oBX6;
		oBX6 = newOBX6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX6, oldOBX6, newOBX6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX6(OBX6CONTENT newOBX6) {
		if (newOBX6 != oBX6) {
			NotificationChain msgs = null;
			if (oBX6 != null)
				msgs = ((InternalEObject)oBX6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX6, null, msgs);
			if (newOBX6 != null)
				msgs = ((InternalEObject)newOBX6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX6, null, msgs);
			msgs = basicSetOBX6(newOBX6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX6, newOBX6, newOBX6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX7CONTENT getOBX7() {
		return oBX7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX7(OBX7CONTENT newOBX7, NotificationChain msgs) {
		OBX7CONTENT oldOBX7 = oBX7;
		oBX7 = newOBX7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX7, oldOBX7, newOBX7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX7(OBX7CONTENT newOBX7) {
		if (newOBX7 != oBX7) {
			NotificationChain msgs = null;
			if (oBX7 != null)
				msgs = ((InternalEObject)oBX7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX7, null, msgs);
			if (newOBX7 != null)
				msgs = ((InternalEObject)newOBX7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX7, null, msgs);
			msgs = basicSetOBX7(newOBX7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX7, newOBX7, newOBX7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX8CONTENT> getOBX8() {
		if (oBX8 == null) {
			oBX8 = new EObjectContainmentEList<OBX8CONTENT>(OBX8CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX8);
		}
		return oBX8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX9CONTENT getOBX9() {
		return oBX9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX9(OBX9CONTENT newOBX9, NotificationChain msgs) {
		OBX9CONTENT oldOBX9 = oBX9;
		oBX9 = newOBX9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX9, oldOBX9, newOBX9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX9(OBX9CONTENT newOBX9) {
		if (newOBX9 != oBX9) {
			NotificationChain msgs = null;
			if (oBX9 != null)
				msgs = ((InternalEObject)oBX9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX9, null, msgs);
			if (newOBX9 != null)
				msgs = ((InternalEObject)newOBX9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX9, null, msgs);
			msgs = basicSetOBX9(newOBX9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX9, newOBX9, newOBX9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX10CONTENT> getOBX10() {
		if (oBX10 == null) {
			oBX10 = new EObjectContainmentEList<OBX10CONTENT>(OBX10CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX10);
		}
		return oBX10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX11CONTENT getOBX11() {
		return oBX11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX11(OBX11CONTENT newOBX11, NotificationChain msgs) {
		OBX11CONTENT oldOBX11 = oBX11;
		oBX11 = newOBX11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX11, oldOBX11, newOBX11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX11(OBX11CONTENT newOBX11) {
		if (newOBX11 != oBX11) {
			NotificationChain msgs = null;
			if (oBX11 != null)
				msgs = ((InternalEObject)oBX11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX11, null, msgs);
			if (newOBX11 != null)
				msgs = ((InternalEObject)newOBX11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX11, null, msgs);
			msgs = basicSetOBX11(newOBX11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX11, newOBX11, newOBX11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX12CONTENT getOBX12() {
		return oBX12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX12(OBX12CONTENT newOBX12, NotificationChain msgs) {
		OBX12CONTENT oldOBX12 = oBX12;
		oBX12 = newOBX12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX12, oldOBX12, newOBX12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX12(OBX12CONTENT newOBX12) {
		if (newOBX12 != oBX12) {
			NotificationChain msgs = null;
			if (oBX12 != null)
				msgs = ((InternalEObject)oBX12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX12, null, msgs);
			if (newOBX12 != null)
				msgs = ((InternalEObject)newOBX12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX12, null, msgs);
			msgs = basicSetOBX12(newOBX12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX12, newOBX12, newOBX12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX13CONTENT getOBX13() {
		return oBX13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX13(OBX13CONTENT newOBX13, NotificationChain msgs) {
		OBX13CONTENT oldOBX13 = oBX13;
		oBX13 = newOBX13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX13, oldOBX13, newOBX13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX13(OBX13CONTENT newOBX13) {
		if (newOBX13 != oBX13) {
			NotificationChain msgs = null;
			if (oBX13 != null)
				msgs = ((InternalEObject)oBX13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX13, null, msgs);
			if (newOBX13 != null)
				msgs = ((InternalEObject)newOBX13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX13, null, msgs);
			msgs = basicSetOBX13(newOBX13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX13, newOBX13, newOBX13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX14CONTENT getOBX14() {
		return oBX14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX14(OBX14CONTENT newOBX14, NotificationChain msgs) {
		OBX14CONTENT oldOBX14 = oBX14;
		oBX14 = newOBX14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX14, oldOBX14, newOBX14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX14(OBX14CONTENT newOBX14) {
		if (newOBX14 != oBX14) {
			NotificationChain msgs = null;
			if (oBX14 != null)
				msgs = ((InternalEObject)oBX14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX14, null, msgs);
			if (newOBX14 != null)
				msgs = ((InternalEObject)newOBX14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX14, null, msgs);
			msgs = basicSetOBX14(newOBX14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX14, newOBX14, newOBX14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX15CONTENT getOBX15() {
		return oBX15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX15(OBX15CONTENT newOBX15, NotificationChain msgs) {
		OBX15CONTENT oldOBX15 = oBX15;
		oBX15 = newOBX15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX15, oldOBX15, newOBX15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX15(OBX15CONTENT newOBX15) {
		if (newOBX15 != oBX15) {
			NotificationChain msgs = null;
			if (oBX15 != null)
				msgs = ((InternalEObject)oBX15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX15, null, msgs);
			if (newOBX15 != null)
				msgs = ((InternalEObject)newOBX15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX15, null, msgs);
			msgs = basicSetOBX15(newOBX15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX15, newOBX15, newOBX15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX16CONTENT> getOBX16() {
		if (oBX16 == null) {
			oBX16 = new EObjectContainmentEList<OBX16CONTENT>(OBX16CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX16);
		}
		return oBX16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX17CONTENT> getOBX17() {
		if (oBX17 == null) {
			oBX17 = new EObjectContainmentEList<OBX17CONTENT>(OBX17CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX17);
		}
		return oBX17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OBX18CONTENT> getOBX18() {
		if (oBX18 == null) {
			oBX18 = new EObjectContainmentEList<OBX18CONTENT>(OBX18CONTENT.class, this, V2xmlPackage.OBXCONTENT__OBX18);
		}
		return oBX18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBX19CONTENT getOBX19() {
		return oBX19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBX19(OBX19CONTENT newOBX19, NotificationChain msgs) {
		OBX19CONTENT oldOBX19 = oBX19;
		oBX19 = newOBX19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX19, oldOBX19, newOBX19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBX19(OBX19CONTENT newOBX19) {
		if (newOBX19 != oBX19) {
			NotificationChain msgs = null;
			if (oBX19 != null)
				msgs = ((InternalEObject)oBX19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX19, null, msgs);
			if (newOBX19 != null)
				msgs = ((InternalEObject)newOBX19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OBXCONTENT__OBX19, null, msgs);
			msgs = basicSetOBX19(newOBX19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OBXCONTENT__OBX19, newOBX19, newOBX19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OBXCONTENT__ANY);
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
			case V2xmlPackage.OBXCONTENT__OBX1:
				return basicSetOBX1(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX2:
				return basicSetOBX2(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX3:
				return basicSetOBX3(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX4:
				return basicSetOBX4(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX5:
				return ((InternalEList<?>)getOBX5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX6:
				return basicSetOBX6(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX7:
				return basicSetOBX7(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX8:
				return ((InternalEList<?>)getOBX8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX9:
				return basicSetOBX9(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX10:
				return ((InternalEList<?>)getOBX10()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX11:
				return basicSetOBX11(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX12:
				return basicSetOBX12(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX13:
				return basicSetOBX13(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX14:
				return basicSetOBX14(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX15:
				return basicSetOBX15(null, msgs);
			case V2xmlPackage.OBXCONTENT__OBX16:
				return ((InternalEList<?>)getOBX16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX17:
				return ((InternalEList<?>)getOBX17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX18:
				return ((InternalEList<?>)getOBX18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OBXCONTENT__OBX19:
				return basicSetOBX19(null, msgs);
			case V2xmlPackage.OBXCONTENT__ANY:
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
			case V2xmlPackage.OBXCONTENT__OBX1:
				return getOBX1();
			case V2xmlPackage.OBXCONTENT__OBX2:
				return getOBX2();
			case V2xmlPackage.OBXCONTENT__OBX3:
				return getOBX3();
			case V2xmlPackage.OBXCONTENT__OBX4:
				return getOBX4();
			case V2xmlPackage.OBXCONTENT__OBX5:
				return getOBX5();
			case V2xmlPackage.OBXCONTENT__OBX6:
				return getOBX6();
			case V2xmlPackage.OBXCONTENT__OBX7:
				return getOBX7();
			case V2xmlPackage.OBXCONTENT__OBX8:
				return getOBX8();
			case V2xmlPackage.OBXCONTENT__OBX9:
				return getOBX9();
			case V2xmlPackage.OBXCONTENT__OBX10:
				return getOBX10();
			case V2xmlPackage.OBXCONTENT__OBX11:
				return getOBX11();
			case V2xmlPackage.OBXCONTENT__OBX12:
				return getOBX12();
			case V2xmlPackage.OBXCONTENT__OBX13:
				return getOBX13();
			case V2xmlPackage.OBXCONTENT__OBX14:
				return getOBX14();
			case V2xmlPackage.OBXCONTENT__OBX15:
				return getOBX15();
			case V2xmlPackage.OBXCONTENT__OBX16:
				return getOBX16();
			case V2xmlPackage.OBXCONTENT__OBX17:
				return getOBX17();
			case V2xmlPackage.OBXCONTENT__OBX18:
				return getOBX18();
			case V2xmlPackage.OBXCONTENT__OBX19:
				return getOBX19();
			case V2xmlPackage.OBXCONTENT__ANY:
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
			case V2xmlPackage.OBXCONTENT__OBX1:
				setOBX1((OBX1CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX2:
				setOBX2((OBX2CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX3:
				setOBX3((OBX3CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX4:
				setOBX4((OBX4CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX5:
				getOBX5().clear();
				getOBX5().addAll((Collection<? extends OBX5CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX6:
				setOBX6((OBX6CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX7:
				setOBX7((OBX7CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX8:
				getOBX8().clear();
				getOBX8().addAll((Collection<? extends OBX8CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX9:
				setOBX9((OBX9CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX10:
				getOBX10().clear();
				getOBX10().addAll((Collection<? extends OBX10CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX11:
				setOBX11((OBX11CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX12:
				setOBX12((OBX12CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX13:
				setOBX13((OBX13CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX14:
				setOBX14((OBX14CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX15:
				setOBX15((OBX15CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX16:
				getOBX16().clear();
				getOBX16().addAll((Collection<? extends OBX16CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX17:
				getOBX17().clear();
				getOBX17().addAll((Collection<? extends OBX17CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX18:
				getOBX18().clear();
				getOBX18().addAll((Collection<? extends OBX18CONTENT>)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__OBX19:
				setOBX19((OBX19CONTENT)newValue);
				return;
			case V2xmlPackage.OBXCONTENT__ANY:
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
			case V2xmlPackage.OBXCONTENT__OBX1:
				setOBX1((OBX1CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX2:
				setOBX2((OBX2CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX3:
				setOBX3((OBX3CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX4:
				setOBX4((OBX4CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX5:
				getOBX5().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX6:
				setOBX6((OBX6CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX7:
				setOBX7((OBX7CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX8:
				getOBX8().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX9:
				setOBX9((OBX9CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX10:
				getOBX10().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX11:
				setOBX11((OBX11CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX12:
				setOBX12((OBX12CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX13:
				setOBX13((OBX13CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX14:
				setOBX14((OBX14CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX15:
				setOBX15((OBX15CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__OBX16:
				getOBX16().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX17:
				getOBX17().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX18:
				getOBX18().clear();
				return;
			case V2xmlPackage.OBXCONTENT__OBX19:
				setOBX19((OBX19CONTENT)null);
				return;
			case V2xmlPackage.OBXCONTENT__ANY:
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
			case V2xmlPackage.OBXCONTENT__OBX1:
				return oBX1 != null;
			case V2xmlPackage.OBXCONTENT__OBX2:
				return oBX2 != null;
			case V2xmlPackage.OBXCONTENT__OBX3:
				return oBX3 != null;
			case V2xmlPackage.OBXCONTENT__OBX4:
				return oBX4 != null;
			case V2xmlPackage.OBXCONTENT__OBX5:
				return oBX5 != null && !oBX5.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX6:
				return oBX6 != null;
			case V2xmlPackage.OBXCONTENT__OBX7:
				return oBX7 != null;
			case V2xmlPackage.OBXCONTENT__OBX8:
				return oBX8 != null && !oBX8.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX9:
				return oBX9 != null;
			case V2xmlPackage.OBXCONTENT__OBX10:
				return oBX10 != null && !oBX10.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX11:
				return oBX11 != null;
			case V2xmlPackage.OBXCONTENT__OBX12:
				return oBX12 != null;
			case V2xmlPackage.OBXCONTENT__OBX13:
				return oBX13 != null;
			case V2xmlPackage.OBXCONTENT__OBX14:
				return oBX14 != null;
			case V2xmlPackage.OBXCONTENT__OBX15:
				return oBX15 != null;
			case V2xmlPackage.OBXCONTENT__OBX16:
				return oBX16 != null && !oBX16.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX17:
				return oBX17 != null && !oBX17.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX18:
				return oBX18 != null && !oBX18.isEmpty();
			case V2xmlPackage.OBXCONTENT__OBX19:
				return oBX19 != null;
			case V2xmlPackage.OBXCONTENT__ANY:
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

} //OBXCONTENTImpl
