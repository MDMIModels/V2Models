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

import org.hl7.v2xml.PR110CONTENT;
import org.hl7.v2xml.PR111CONTENT;
import org.hl7.v2xml.PR112CONTENT;
import org.hl7.v2xml.PR113CONTENT;
import org.hl7.v2xml.PR114CONTENT;
import org.hl7.v2xml.PR115CONTENT;
import org.hl7.v2xml.PR116CONTENT;
import org.hl7.v2xml.PR117CONTENT;
import org.hl7.v2xml.PR118CONTENT;
import org.hl7.v2xml.PR119CONTENT;
import org.hl7.v2xml.PR11CONTENT;
import org.hl7.v2xml.PR120CONTENT;
import org.hl7.v2xml.PR12CONTENT;
import org.hl7.v2xml.PR13CONTENT;
import org.hl7.v2xml.PR14CONTENT;
import org.hl7.v2xml.PR15CONTENT;
import org.hl7.v2xml.PR16CONTENT;
import org.hl7.v2xml.PR17CONTENT;
import org.hl7.v2xml.PR18CONTENT;
import org.hl7.v2xml.PR19CONTENT;
import org.hl7.v2xml.PR1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PR1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR11 <em>PR11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR12 <em>PR12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR13 <em>PR13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR14 <em>PR14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR15 <em>PR15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR16 <em>PR16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR17 <em>PR17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR18 <em>PR18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR19 <em>PR19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR110 <em>PR110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR111 <em>PR111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR112 <em>PR112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR113 <em>PR113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR114 <em>PR114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR115 <em>PR115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR116 <em>PR116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR117 <em>PR117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR118 <em>PR118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR119 <em>PR119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getPR120 <em>PR120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PR1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PR1CONTENTImpl extends EObjectImpl implements PR1CONTENT {
	/**
	 * The cached value of the '{@link #getPR11() <em>PR11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR11()
	 * @generated
	 * @ordered
	 */
	protected PR11CONTENT pR11;

	/**
	 * The cached value of the '{@link #getPR12() <em>PR12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR12()
	 * @generated
	 * @ordered
	 */
	protected PR12CONTENT pR12;

	/**
	 * The cached value of the '{@link #getPR13() <em>PR13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR13()
	 * @generated
	 * @ordered
	 */
	protected PR13CONTENT pR13;

	/**
	 * The cached value of the '{@link #getPR14() <em>PR14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR14()
	 * @generated
	 * @ordered
	 */
	protected PR14CONTENT pR14;

	/**
	 * The cached value of the '{@link #getPR15() <em>PR15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR15()
	 * @generated
	 * @ordered
	 */
	protected PR15CONTENT pR15;

	/**
	 * The cached value of the '{@link #getPR16() <em>PR16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR16()
	 * @generated
	 * @ordered
	 */
	protected PR16CONTENT pR16;

	/**
	 * The cached value of the '{@link #getPR17() <em>PR17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR17()
	 * @generated
	 * @ordered
	 */
	protected PR17CONTENT pR17;

	/**
	 * The cached value of the '{@link #getPR18() <em>PR18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR18()
	 * @generated
	 * @ordered
	 */
	protected EList<PR18CONTENT> pR18;

	/**
	 * The cached value of the '{@link #getPR19() <em>PR19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR19()
	 * @generated
	 * @ordered
	 */
	protected PR19CONTENT pR19;

	/**
	 * The cached value of the '{@link #getPR110() <em>PR110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR110()
	 * @generated
	 * @ordered
	 */
	protected PR110CONTENT pR110;

	/**
	 * The cached value of the '{@link #getPR111() <em>PR111</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR111()
	 * @generated
	 * @ordered
	 */
	protected EList<PR111CONTENT> pR111;

	/**
	 * The cached value of the '{@link #getPR112() <em>PR112</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR112()
	 * @generated
	 * @ordered
	 */
	protected EList<PR112CONTENT> pR112;

	/**
	 * The cached value of the '{@link #getPR113() <em>PR113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR113()
	 * @generated
	 * @ordered
	 */
	protected PR113CONTENT pR113;

	/**
	 * The cached value of the '{@link #getPR114() <em>PR114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR114()
	 * @generated
	 * @ordered
	 */
	protected PR114CONTENT pR114;

	/**
	 * The cached value of the '{@link #getPR115() <em>PR115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR115()
	 * @generated
	 * @ordered
	 */
	protected PR115CONTENT pR115;

	/**
	 * The cached value of the '{@link #getPR116() <em>PR116</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR116()
	 * @generated
	 * @ordered
	 */
	protected EList<PR116CONTENT> pR116;

	/**
	 * The cached value of the '{@link #getPR117() <em>PR117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR117()
	 * @generated
	 * @ordered
	 */
	protected PR117CONTENT pR117;

	/**
	 * The cached value of the '{@link #getPR118() <em>PR118</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR118()
	 * @generated
	 * @ordered
	 */
	protected EList<PR118CONTENT> pR118;

	/**
	 * The cached value of the '{@link #getPR119() <em>PR119</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR119()
	 * @generated
	 * @ordered
	 */
	protected PR119CONTENT pR119;

	/**
	 * The cached value of the '{@link #getPR120() <em>PR120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPR120()
	 * @generated
	 * @ordered
	 */
	protected PR120CONTENT pR120;

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
	protected PR1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPR1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR11CONTENT getPR11() {
		return pR11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR11(PR11CONTENT newPR11, NotificationChain msgs) {
		PR11CONTENT oldPR11 = pR11;
		pR11 = newPR11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR11, oldPR11, newPR11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR11(PR11CONTENT newPR11) {
		if (newPR11 != pR11) {
			NotificationChain msgs = null;
			if (pR11 != null)
				msgs = ((InternalEObject)pR11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR11, null, msgs);
			if (newPR11 != null)
				msgs = ((InternalEObject)newPR11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR11, null, msgs);
			msgs = basicSetPR11(newPR11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR11, newPR11, newPR11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR12CONTENT getPR12() {
		return pR12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR12(PR12CONTENT newPR12, NotificationChain msgs) {
		PR12CONTENT oldPR12 = pR12;
		pR12 = newPR12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR12, oldPR12, newPR12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR12(PR12CONTENT newPR12) {
		if (newPR12 != pR12) {
			NotificationChain msgs = null;
			if (pR12 != null)
				msgs = ((InternalEObject)pR12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR12, null, msgs);
			if (newPR12 != null)
				msgs = ((InternalEObject)newPR12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR12, null, msgs);
			msgs = basicSetPR12(newPR12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR12, newPR12, newPR12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR13CONTENT getPR13() {
		return pR13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR13(PR13CONTENT newPR13, NotificationChain msgs) {
		PR13CONTENT oldPR13 = pR13;
		pR13 = newPR13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR13, oldPR13, newPR13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR13(PR13CONTENT newPR13) {
		if (newPR13 != pR13) {
			NotificationChain msgs = null;
			if (pR13 != null)
				msgs = ((InternalEObject)pR13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR13, null, msgs);
			if (newPR13 != null)
				msgs = ((InternalEObject)newPR13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR13, null, msgs);
			msgs = basicSetPR13(newPR13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR13, newPR13, newPR13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR14CONTENT getPR14() {
		return pR14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR14(PR14CONTENT newPR14, NotificationChain msgs) {
		PR14CONTENT oldPR14 = pR14;
		pR14 = newPR14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR14, oldPR14, newPR14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR14(PR14CONTENT newPR14) {
		if (newPR14 != pR14) {
			NotificationChain msgs = null;
			if (pR14 != null)
				msgs = ((InternalEObject)pR14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR14, null, msgs);
			if (newPR14 != null)
				msgs = ((InternalEObject)newPR14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR14, null, msgs);
			msgs = basicSetPR14(newPR14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR14, newPR14, newPR14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR15CONTENT getPR15() {
		return pR15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR15(PR15CONTENT newPR15, NotificationChain msgs) {
		PR15CONTENT oldPR15 = pR15;
		pR15 = newPR15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR15, oldPR15, newPR15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR15(PR15CONTENT newPR15) {
		if (newPR15 != pR15) {
			NotificationChain msgs = null;
			if (pR15 != null)
				msgs = ((InternalEObject)pR15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR15, null, msgs);
			if (newPR15 != null)
				msgs = ((InternalEObject)newPR15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR15, null, msgs);
			msgs = basicSetPR15(newPR15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR15, newPR15, newPR15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR16CONTENT getPR16() {
		return pR16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR16(PR16CONTENT newPR16, NotificationChain msgs) {
		PR16CONTENT oldPR16 = pR16;
		pR16 = newPR16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR16, oldPR16, newPR16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR16(PR16CONTENT newPR16) {
		if (newPR16 != pR16) {
			NotificationChain msgs = null;
			if (pR16 != null)
				msgs = ((InternalEObject)pR16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR16, null, msgs);
			if (newPR16 != null)
				msgs = ((InternalEObject)newPR16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR16, null, msgs);
			msgs = basicSetPR16(newPR16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR16, newPR16, newPR16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR17CONTENT getPR17() {
		return pR17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR17(PR17CONTENT newPR17, NotificationChain msgs) {
		PR17CONTENT oldPR17 = pR17;
		pR17 = newPR17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR17, oldPR17, newPR17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR17(PR17CONTENT newPR17) {
		if (newPR17 != pR17) {
			NotificationChain msgs = null;
			if (pR17 != null)
				msgs = ((InternalEObject)pR17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR17, null, msgs);
			if (newPR17 != null)
				msgs = ((InternalEObject)newPR17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR17, null, msgs);
			msgs = basicSetPR17(newPR17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR17, newPR17, newPR17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR18CONTENT> getPR18() {
		if (pR18 == null) {
			pR18 = new EObjectContainmentEList<PR18CONTENT>(PR18CONTENT.class, this, V2xmlPackage.PR1CONTENT__PR18);
		}
		return pR18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR19CONTENT getPR19() {
		return pR19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR19(PR19CONTENT newPR19, NotificationChain msgs) {
		PR19CONTENT oldPR19 = pR19;
		pR19 = newPR19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR19, oldPR19, newPR19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR19(PR19CONTENT newPR19) {
		if (newPR19 != pR19) {
			NotificationChain msgs = null;
			if (pR19 != null)
				msgs = ((InternalEObject)pR19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR19, null, msgs);
			if (newPR19 != null)
				msgs = ((InternalEObject)newPR19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR19, null, msgs);
			msgs = basicSetPR19(newPR19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR19, newPR19, newPR19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR110CONTENT getPR110() {
		return pR110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR110(PR110CONTENT newPR110, NotificationChain msgs) {
		PR110CONTENT oldPR110 = pR110;
		pR110 = newPR110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR110, oldPR110, newPR110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR110(PR110CONTENT newPR110) {
		if (newPR110 != pR110) {
			NotificationChain msgs = null;
			if (pR110 != null)
				msgs = ((InternalEObject)pR110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR110, null, msgs);
			if (newPR110 != null)
				msgs = ((InternalEObject)newPR110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR110, null, msgs);
			msgs = basicSetPR110(newPR110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR110, newPR110, newPR110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR111CONTENT> getPR111() {
		if (pR111 == null) {
			pR111 = new EObjectContainmentEList<PR111CONTENT>(PR111CONTENT.class, this, V2xmlPackage.PR1CONTENT__PR111);
		}
		return pR111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR112CONTENT> getPR112() {
		if (pR112 == null) {
			pR112 = new EObjectContainmentEList<PR112CONTENT>(PR112CONTENT.class, this, V2xmlPackage.PR1CONTENT__PR112);
		}
		return pR112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR113CONTENT getPR113() {
		return pR113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR113(PR113CONTENT newPR113, NotificationChain msgs) {
		PR113CONTENT oldPR113 = pR113;
		pR113 = newPR113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR113, oldPR113, newPR113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR113(PR113CONTENT newPR113) {
		if (newPR113 != pR113) {
			NotificationChain msgs = null;
			if (pR113 != null)
				msgs = ((InternalEObject)pR113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR113, null, msgs);
			if (newPR113 != null)
				msgs = ((InternalEObject)newPR113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR113, null, msgs);
			msgs = basicSetPR113(newPR113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR113, newPR113, newPR113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR114CONTENT getPR114() {
		return pR114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR114(PR114CONTENT newPR114, NotificationChain msgs) {
		PR114CONTENT oldPR114 = pR114;
		pR114 = newPR114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR114, oldPR114, newPR114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR114(PR114CONTENT newPR114) {
		if (newPR114 != pR114) {
			NotificationChain msgs = null;
			if (pR114 != null)
				msgs = ((InternalEObject)pR114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR114, null, msgs);
			if (newPR114 != null)
				msgs = ((InternalEObject)newPR114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR114, null, msgs);
			msgs = basicSetPR114(newPR114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR114, newPR114, newPR114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR115CONTENT getPR115() {
		return pR115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR115(PR115CONTENT newPR115, NotificationChain msgs) {
		PR115CONTENT oldPR115 = pR115;
		pR115 = newPR115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR115, oldPR115, newPR115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR115(PR115CONTENT newPR115) {
		if (newPR115 != pR115) {
			NotificationChain msgs = null;
			if (pR115 != null)
				msgs = ((InternalEObject)pR115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR115, null, msgs);
			if (newPR115 != null)
				msgs = ((InternalEObject)newPR115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR115, null, msgs);
			msgs = basicSetPR115(newPR115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR115, newPR115, newPR115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR116CONTENT> getPR116() {
		if (pR116 == null) {
			pR116 = new EObjectContainmentEList<PR116CONTENT>(PR116CONTENT.class, this, V2xmlPackage.PR1CONTENT__PR116);
		}
		return pR116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR117CONTENT getPR117() {
		return pR117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR117(PR117CONTENT newPR117, NotificationChain msgs) {
		PR117CONTENT oldPR117 = pR117;
		pR117 = newPR117;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR117, oldPR117, newPR117);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR117(PR117CONTENT newPR117) {
		if (newPR117 != pR117) {
			NotificationChain msgs = null;
			if (pR117 != null)
				msgs = ((InternalEObject)pR117).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR117, null, msgs);
			if (newPR117 != null)
				msgs = ((InternalEObject)newPR117).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR117, null, msgs);
			msgs = basicSetPR117(newPR117, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR117, newPR117, newPR117));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PR118CONTENT> getPR118() {
		if (pR118 == null) {
			pR118 = new EObjectContainmentEList<PR118CONTENT>(PR118CONTENT.class, this, V2xmlPackage.PR1CONTENT__PR118);
		}
		return pR118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR119CONTENT getPR119() {
		return pR119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR119(PR119CONTENT newPR119, NotificationChain msgs) {
		PR119CONTENT oldPR119 = pR119;
		pR119 = newPR119;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR119, oldPR119, newPR119);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR119(PR119CONTENT newPR119) {
		if (newPR119 != pR119) {
			NotificationChain msgs = null;
			if (pR119 != null)
				msgs = ((InternalEObject)pR119).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR119, null, msgs);
			if (newPR119 != null)
				msgs = ((InternalEObject)newPR119).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR119, null, msgs);
			msgs = basicSetPR119(newPR119, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR119, newPR119, newPR119));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PR120CONTENT getPR120() {
		return pR120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPR120(PR120CONTENT newPR120, NotificationChain msgs) {
		PR120CONTENT oldPR120 = pR120;
		pR120 = newPR120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR120, oldPR120, newPR120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPR120(PR120CONTENT newPR120) {
		if (newPR120 != pR120) {
			NotificationChain msgs = null;
			if (pR120 != null)
				msgs = ((InternalEObject)pR120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR120, null, msgs);
			if (newPR120 != null)
				msgs = ((InternalEObject)newPR120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PR1CONTENT__PR120, null, msgs);
			msgs = basicSetPR120(newPR120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PR1CONTENT__PR120, newPR120, newPR120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PR1CONTENT__ANY);
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
			case V2xmlPackage.PR1CONTENT__PR11:
				return basicSetPR11(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR12:
				return basicSetPR12(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR13:
				return basicSetPR13(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR14:
				return basicSetPR14(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR15:
				return basicSetPR15(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR16:
				return basicSetPR16(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR17:
				return basicSetPR17(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR18:
				return ((InternalEList<?>)getPR18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PR1CONTENT__PR19:
				return basicSetPR19(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR110:
				return basicSetPR110(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR111:
				return ((InternalEList<?>)getPR111()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PR1CONTENT__PR112:
				return ((InternalEList<?>)getPR112()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PR1CONTENT__PR113:
				return basicSetPR113(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR114:
				return basicSetPR114(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR115:
				return basicSetPR115(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR116:
				return ((InternalEList<?>)getPR116()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PR1CONTENT__PR117:
				return basicSetPR117(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR118:
				return ((InternalEList<?>)getPR118()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PR1CONTENT__PR119:
				return basicSetPR119(null, msgs);
			case V2xmlPackage.PR1CONTENT__PR120:
				return basicSetPR120(null, msgs);
			case V2xmlPackage.PR1CONTENT__ANY:
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
			case V2xmlPackage.PR1CONTENT__PR11:
				return getPR11();
			case V2xmlPackage.PR1CONTENT__PR12:
				return getPR12();
			case V2xmlPackage.PR1CONTENT__PR13:
				return getPR13();
			case V2xmlPackage.PR1CONTENT__PR14:
				return getPR14();
			case V2xmlPackage.PR1CONTENT__PR15:
				return getPR15();
			case V2xmlPackage.PR1CONTENT__PR16:
				return getPR16();
			case V2xmlPackage.PR1CONTENT__PR17:
				return getPR17();
			case V2xmlPackage.PR1CONTENT__PR18:
				return getPR18();
			case V2xmlPackage.PR1CONTENT__PR19:
				return getPR19();
			case V2xmlPackage.PR1CONTENT__PR110:
				return getPR110();
			case V2xmlPackage.PR1CONTENT__PR111:
				return getPR111();
			case V2xmlPackage.PR1CONTENT__PR112:
				return getPR112();
			case V2xmlPackage.PR1CONTENT__PR113:
				return getPR113();
			case V2xmlPackage.PR1CONTENT__PR114:
				return getPR114();
			case V2xmlPackage.PR1CONTENT__PR115:
				return getPR115();
			case V2xmlPackage.PR1CONTENT__PR116:
				return getPR116();
			case V2xmlPackage.PR1CONTENT__PR117:
				return getPR117();
			case V2xmlPackage.PR1CONTENT__PR118:
				return getPR118();
			case V2xmlPackage.PR1CONTENT__PR119:
				return getPR119();
			case V2xmlPackage.PR1CONTENT__PR120:
				return getPR120();
			case V2xmlPackage.PR1CONTENT__ANY:
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
			case V2xmlPackage.PR1CONTENT__PR11:
				setPR11((PR11CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR12:
				setPR12((PR12CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR13:
				setPR13((PR13CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR14:
				setPR14((PR14CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR15:
				setPR15((PR15CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR16:
				setPR16((PR16CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR17:
				setPR17((PR17CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR18:
				getPR18().clear();
				getPR18().addAll((Collection<? extends PR18CONTENT>)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR19:
				setPR19((PR19CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR110:
				setPR110((PR110CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR111:
				getPR111().clear();
				getPR111().addAll((Collection<? extends PR111CONTENT>)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR112:
				getPR112().clear();
				getPR112().addAll((Collection<? extends PR112CONTENT>)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR113:
				setPR113((PR113CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR114:
				setPR114((PR114CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR115:
				setPR115((PR115CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR116:
				getPR116().clear();
				getPR116().addAll((Collection<? extends PR116CONTENT>)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR117:
				setPR117((PR117CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR118:
				getPR118().clear();
				getPR118().addAll((Collection<? extends PR118CONTENT>)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR119:
				setPR119((PR119CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__PR120:
				setPR120((PR120CONTENT)newValue);
				return;
			case V2xmlPackage.PR1CONTENT__ANY:
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
			case V2xmlPackage.PR1CONTENT__PR11:
				setPR11((PR11CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR12:
				setPR12((PR12CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR13:
				setPR13((PR13CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR14:
				setPR14((PR14CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR15:
				setPR15((PR15CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR16:
				setPR16((PR16CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR17:
				setPR17((PR17CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR18:
				getPR18().clear();
				return;
			case V2xmlPackage.PR1CONTENT__PR19:
				setPR19((PR19CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR110:
				setPR110((PR110CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR111:
				getPR111().clear();
				return;
			case V2xmlPackage.PR1CONTENT__PR112:
				getPR112().clear();
				return;
			case V2xmlPackage.PR1CONTENT__PR113:
				setPR113((PR113CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR114:
				setPR114((PR114CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR115:
				setPR115((PR115CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR116:
				getPR116().clear();
				return;
			case V2xmlPackage.PR1CONTENT__PR117:
				setPR117((PR117CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR118:
				getPR118().clear();
				return;
			case V2xmlPackage.PR1CONTENT__PR119:
				setPR119((PR119CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__PR120:
				setPR120((PR120CONTENT)null);
				return;
			case V2xmlPackage.PR1CONTENT__ANY:
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
			case V2xmlPackage.PR1CONTENT__PR11:
				return pR11 != null;
			case V2xmlPackage.PR1CONTENT__PR12:
				return pR12 != null;
			case V2xmlPackage.PR1CONTENT__PR13:
				return pR13 != null;
			case V2xmlPackage.PR1CONTENT__PR14:
				return pR14 != null;
			case V2xmlPackage.PR1CONTENT__PR15:
				return pR15 != null;
			case V2xmlPackage.PR1CONTENT__PR16:
				return pR16 != null;
			case V2xmlPackage.PR1CONTENT__PR17:
				return pR17 != null;
			case V2xmlPackage.PR1CONTENT__PR18:
				return pR18 != null && !pR18.isEmpty();
			case V2xmlPackage.PR1CONTENT__PR19:
				return pR19 != null;
			case V2xmlPackage.PR1CONTENT__PR110:
				return pR110 != null;
			case V2xmlPackage.PR1CONTENT__PR111:
				return pR111 != null && !pR111.isEmpty();
			case V2xmlPackage.PR1CONTENT__PR112:
				return pR112 != null && !pR112.isEmpty();
			case V2xmlPackage.PR1CONTENT__PR113:
				return pR113 != null;
			case V2xmlPackage.PR1CONTENT__PR114:
				return pR114 != null;
			case V2xmlPackage.PR1CONTENT__PR115:
				return pR115 != null;
			case V2xmlPackage.PR1CONTENT__PR116:
				return pR116 != null && !pR116.isEmpty();
			case V2xmlPackage.PR1CONTENT__PR117:
				return pR117 != null;
			case V2xmlPackage.PR1CONTENT__PR118:
				return pR118 != null && !pR118.isEmpty();
			case V2xmlPackage.PR1CONTENT__PR119:
				return pR119 != null;
			case V2xmlPackage.PR1CONTENT__PR120:
				return pR120 != null;
			case V2xmlPackage.PR1CONTENT__ANY:
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

} //PR1CONTENTImpl
