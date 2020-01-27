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

import org.hl7.v2xml.UB110CONTENT;
import org.hl7.v2xml.UB111CONTENT;
import org.hl7.v2xml.UB112CONTENT;
import org.hl7.v2xml.UB113CONTENT;
import org.hl7.v2xml.UB114CONTENT;
import org.hl7.v2xml.UB115CONTENT;
import org.hl7.v2xml.UB116CONTENT;
import org.hl7.v2xml.UB117CONTENT;
import org.hl7.v2xml.UB118CONTENT;
import org.hl7.v2xml.UB119CONTENT;
import org.hl7.v2xml.UB11CONTENT;
import org.hl7.v2xml.UB120CONTENT;
import org.hl7.v2xml.UB121CONTENT;
import org.hl7.v2xml.UB122CONTENT;
import org.hl7.v2xml.UB123CONTENT;
import org.hl7.v2xml.UB12CONTENT;
import org.hl7.v2xml.UB13CONTENT;
import org.hl7.v2xml.UB14CONTENT;
import org.hl7.v2xml.UB15CONTENT;
import org.hl7.v2xml.UB16CONTENT;
import org.hl7.v2xml.UB17CONTENT;
import org.hl7.v2xml.UB18CONTENT;
import org.hl7.v2xml.UB19CONTENT;
import org.hl7.v2xml.UB1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UB1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB11 <em>UB11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB12 <em>UB12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB13 <em>UB13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB14 <em>UB14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB15 <em>UB15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB16 <em>UB16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB17 <em>UB17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB18 <em>UB18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB19 <em>UB19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB110 <em>UB110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB111 <em>UB111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB112 <em>UB112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB113 <em>UB113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB114 <em>UB114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB115 <em>UB115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB116 <em>UB116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB117 <em>UB117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB118 <em>UB118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB119 <em>UB119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB120 <em>UB120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB121 <em>UB121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB122 <em>UB122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getUB123 <em>UB123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UB1CONTENTImpl extends EObjectImpl implements UB1CONTENT {
	/**
	 * The cached value of the '{@link #getUB11() <em>UB11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB11()
	 * @generated
	 * @ordered
	 */
	protected UB11CONTENT uB11;

	/**
	 * The cached value of the '{@link #getUB12() <em>UB12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB12()
	 * @generated
	 * @ordered
	 */
	protected UB12CONTENT uB12;

	/**
	 * The cached value of the '{@link #getUB13() <em>UB13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB13()
	 * @generated
	 * @ordered
	 */
	protected UB13CONTENT uB13;

	/**
	 * The cached value of the '{@link #getUB14() <em>UB14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB14()
	 * @generated
	 * @ordered
	 */
	protected UB14CONTENT uB14;

	/**
	 * The cached value of the '{@link #getUB15() <em>UB15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB15()
	 * @generated
	 * @ordered
	 */
	protected UB15CONTENT uB15;

	/**
	 * The cached value of the '{@link #getUB16() <em>UB16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB16()
	 * @generated
	 * @ordered
	 */
	protected UB16CONTENT uB16;

	/**
	 * The cached value of the '{@link #getUB17() <em>UB17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB17()
	 * @generated
	 * @ordered
	 */
	protected EList<UB17CONTENT> uB17;

	/**
	 * The cached value of the '{@link #getUB18() <em>UB18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB18()
	 * @generated
	 * @ordered
	 */
	protected UB18CONTENT uB18;

	/**
	 * The cached value of the '{@link #getUB19() <em>UB19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB19()
	 * @generated
	 * @ordered
	 */
	protected UB19CONTENT uB19;

	/**
	 * The cached value of the '{@link #getUB110() <em>UB110</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB110()
	 * @generated
	 * @ordered
	 */
	protected EList<UB110CONTENT> uB110;

	/**
	 * The cached value of the '{@link #getUB111() <em>UB111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB111()
	 * @generated
	 * @ordered
	 */
	protected UB111CONTENT uB111;

	/**
	 * The cached value of the '{@link #getUB112() <em>UB112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB112()
	 * @generated
	 * @ordered
	 */
	protected UB112CONTENT uB112;

	/**
	 * The cached value of the '{@link #getUB113() <em>UB113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB113()
	 * @generated
	 * @ordered
	 */
	protected UB113CONTENT uB113;

	/**
	 * The cached value of the '{@link #getUB114() <em>UB114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB114()
	 * @generated
	 * @ordered
	 */
	protected UB114CONTENT uB114;

	/**
	 * The cached value of the '{@link #getUB115() <em>UB115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB115()
	 * @generated
	 * @ordered
	 */
	protected UB115CONTENT uB115;

	/**
	 * The cached value of the '{@link #getUB116() <em>UB116</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB116()
	 * @generated
	 * @ordered
	 */
	protected EList<UB116CONTENT> uB116;

	/**
	 * The cached value of the '{@link #getUB117() <em>UB117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB117()
	 * @generated
	 * @ordered
	 */
	protected UB117CONTENT uB117;

	/**
	 * The cached value of the '{@link #getUB118() <em>UB118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB118()
	 * @generated
	 * @ordered
	 */
	protected UB118CONTENT uB118;

	/**
	 * The cached value of the '{@link #getUB119() <em>UB119</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB119()
	 * @generated
	 * @ordered
	 */
	protected UB119CONTENT uB119;

	/**
	 * The cached value of the '{@link #getUB120() <em>UB120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB120()
	 * @generated
	 * @ordered
	 */
	protected UB120CONTENT uB120;

	/**
	 * The cached value of the '{@link #getUB121() <em>UB121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB121()
	 * @generated
	 * @ordered
	 */
	protected UB121CONTENT uB121;

	/**
	 * The cached value of the '{@link #getUB122() <em>UB122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB122()
	 * @generated
	 * @ordered
	 */
	protected UB122CONTENT uB122;

	/**
	 * The cached value of the '{@link #getUB123() <em>UB123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB123()
	 * @generated
	 * @ordered
	 */
	protected UB123CONTENT uB123;

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
	protected UB1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getUB1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB11CONTENT getUB11() {
		return uB11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB11(UB11CONTENT newUB11, NotificationChain msgs) {
		UB11CONTENT oldUB11 = uB11;
		uB11 = newUB11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB11, oldUB11, newUB11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB11(UB11CONTENT newUB11) {
		if (newUB11 != uB11) {
			NotificationChain msgs = null;
			if (uB11 != null)
				msgs = ((InternalEObject)uB11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB11, null, msgs);
			if (newUB11 != null)
				msgs = ((InternalEObject)newUB11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB11, null, msgs);
			msgs = basicSetUB11(newUB11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB11, newUB11, newUB11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB12CONTENT getUB12() {
		return uB12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB12(UB12CONTENT newUB12, NotificationChain msgs) {
		UB12CONTENT oldUB12 = uB12;
		uB12 = newUB12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB12, oldUB12, newUB12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB12(UB12CONTENT newUB12) {
		if (newUB12 != uB12) {
			NotificationChain msgs = null;
			if (uB12 != null)
				msgs = ((InternalEObject)uB12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB12, null, msgs);
			if (newUB12 != null)
				msgs = ((InternalEObject)newUB12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB12, null, msgs);
			msgs = basicSetUB12(newUB12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB12, newUB12, newUB12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB13CONTENT getUB13() {
		return uB13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB13(UB13CONTENT newUB13, NotificationChain msgs) {
		UB13CONTENT oldUB13 = uB13;
		uB13 = newUB13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB13, oldUB13, newUB13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB13(UB13CONTENT newUB13) {
		if (newUB13 != uB13) {
			NotificationChain msgs = null;
			if (uB13 != null)
				msgs = ((InternalEObject)uB13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB13, null, msgs);
			if (newUB13 != null)
				msgs = ((InternalEObject)newUB13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB13, null, msgs);
			msgs = basicSetUB13(newUB13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB13, newUB13, newUB13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB14CONTENT getUB14() {
		return uB14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB14(UB14CONTENT newUB14, NotificationChain msgs) {
		UB14CONTENT oldUB14 = uB14;
		uB14 = newUB14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB14, oldUB14, newUB14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB14(UB14CONTENT newUB14) {
		if (newUB14 != uB14) {
			NotificationChain msgs = null;
			if (uB14 != null)
				msgs = ((InternalEObject)uB14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB14, null, msgs);
			if (newUB14 != null)
				msgs = ((InternalEObject)newUB14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB14, null, msgs);
			msgs = basicSetUB14(newUB14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB14, newUB14, newUB14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB15CONTENT getUB15() {
		return uB15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB15(UB15CONTENT newUB15, NotificationChain msgs) {
		UB15CONTENT oldUB15 = uB15;
		uB15 = newUB15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB15, oldUB15, newUB15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB15(UB15CONTENT newUB15) {
		if (newUB15 != uB15) {
			NotificationChain msgs = null;
			if (uB15 != null)
				msgs = ((InternalEObject)uB15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB15, null, msgs);
			if (newUB15 != null)
				msgs = ((InternalEObject)newUB15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB15, null, msgs);
			msgs = basicSetUB15(newUB15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB15, newUB15, newUB15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB16CONTENT getUB16() {
		return uB16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB16(UB16CONTENT newUB16, NotificationChain msgs) {
		UB16CONTENT oldUB16 = uB16;
		uB16 = newUB16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB16, oldUB16, newUB16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB16(UB16CONTENT newUB16) {
		if (newUB16 != uB16) {
			NotificationChain msgs = null;
			if (uB16 != null)
				msgs = ((InternalEObject)uB16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB16, null, msgs);
			if (newUB16 != null)
				msgs = ((InternalEObject)newUB16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB16, null, msgs);
			msgs = basicSetUB16(newUB16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB16, newUB16, newUB16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB17CONTENT> getUB17() {
		if (uB17 == null) {
			uB17 = new EObjectContainmentEList<UB17CONTENT>(UB17CONTENT.class, this, V2xmlPackage.UB1CONTENT__UB17);
		}
		return uB17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB18CONTENT getUB18() {
		return uB18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB18(UB18CONTENT newUB18, NotificationChain msgs) {
		UB18CONTENT oldUB18 = uB18;
		uB18 = newUB18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB18, oldUB18, newUB18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB18(UB18CONTENT newUB18) {
		if (newUB18 != uB18) {
			NotificationChain msgs = null;
			if (uB18 != null)
				msgs = ((InternalEObject)uB18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB18, null, msgs);
			if (newUB18 != null)
				msgs = ((InternalEObject)newUB18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB18, null, msgs);
			msgs = basicSetUB18(newUB18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB18, newUB18, newUB18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB19CONTENT getUB19() {
		return uB19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB19(UB19CONTENT newUB19, NotificationChain msgs) {
		UB19CONTENT oldUB19 = uB19;
		uB19 = newUB19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB19, oldUB19, newUB19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB19(UB19CONTENT newUB19) {
		if (newUB19 != uB19) {
			NotificationChain msgs = null;
			if (uB19 != null)
				msgs = ((InternalEObject)uB19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB19, null, msgs);
			if (newUB19 != null)
				msgs = ((InternalEObject)newUB19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB19, null, msgs);
			msgs = basicSetUB19(newUB19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB19, newUB19, newUB19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB110CONTENT> getUB110() {
		if (uB110 == null) {
			uB110 = new EObjectContainmentEList<UB110CONTENT>(UB110CONTENT.class, this, V2xmlPackage.UB1CONTENT__UB110);
		}
		return uB110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB111CONTENT getUB111() {
		return uB111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB111(UB111CONTENT newUB111, NotificationChain msgs) {
		UB111CONTENT oldUB111 = uB111;
		uB111 = newUB111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB111, oldUB111, newUB111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB111(UB111CONTENT newUB111) {
		if (newUB111 != uB111) {
			NotificationChain msgs = null;
			if (uB111 != null)
				msgs = ((InternalEObject)uB111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB111, null, msgs);
			if (newUB111 != null)
				msgs = ((InternalEObject)newUB111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB111, null, msgs);
			msgs = basicSetUB111(newUB111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB111, newUB111, newUB111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB112CONTENT getUB112() {
		return uB112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB112(UB112CONTENT newUB112, NotificationChain msgs) {
		UB112CONTENT oldUB112 = uB112;
		uB112 = newUB112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB112, oldUB112, newUB112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB112(UB112CONTENT newUB112) {
		if (newUB112 != uB112) {
			NotificationChain msgs = null;
			if (uB112 != null)
				msgs = ((InternalEObject)uB112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB112, null, msgs);
			if (newUB112 != null)
				msgs = ((InternalEObject)newUB112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB112, null, msgs);
			msgs = basicSetUB112(newUB112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB112, newUB112, newUB112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB113CONTENT getUB113() {
		return uB113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB113(UB113CONTENT newUB113, NotificationChain msgs) {
		UB113CONTENT oldUB113 = uB113;
		uB113 = newUB113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB113, oldUB113, newUB113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB113(UB113CONTENT newUB113) {
		if (newUB113 != uB113) {
			NotificationChain msgs = null;
			if (uB113 != null)
				msgs = ((InternalEObject)uB113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB113, null, msgs);
			if (newUB113 != null)
				msgs = ((InternalEObject)newUB113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB113, null, msgs);
			msgs = basicSetUB113(newUB113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB113, newUB113, newUB113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB114CONTENT getUB114() {
		return uB114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB114(UB114CONTENT newUB114, NotificationChain msgs) {
		UB114CONTENT oldUB114 = uB114;
		uB114 = newUB114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB114, oldUB114, newUB114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB114(UB114CONTENT newUB114) {
		if (newUB114 != uB114) {
			NotificationChain msgs = null;
			if (uB114 != null)
				msgs = ((InternalEObject)uB114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB114, null, msgs);
			if (newUB114 != null)
				msgs = ((InternalEObject)newUB114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB114, null, msgs);
			msgs = basicSetUB114(newUB114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB114, newUB114, newUB114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB115CONTENT getUB115() {
		return uB115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB115(UB115CONTENT newUB115, NotificationChain msgs) {
		UB115CONTENT oldUB115 = uB115;
		uB115 = newUB115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB115, oldUB115, newUB115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB115(UB115CONTENT newUB115) {
		if (newUB115 != uB115) {
			NotificationChain msgs = null;
			if (uB115 != null)
				msgs = ((InternalEObject)uB115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB115, null, msgs);
			if (newUB115 != null)
				msgs = ((InternalEObject)newUB115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB115, null, msgs);
			msgs = basicSetUB115(newUB115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB115, newUB115, newUB115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB116CONTENT> getUB116() {
		if (uB116 == null) {
			uB116 = new EObjectContainmentEList<UB116CONTENT>(UB116CONTENT.class, this, V2xmlPackage.UB1CONTENT__UB116);
		}
		return uB116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB117CONTENT getUB117() {
		return uB117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB117(UB117CONTENT newUB117, NotificationChain msgs) {
		UB117CONTENT oldUB117 = uB117;
		uB117 = newUB117;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB117, oldUB117, newUB117);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB117(UB117CONTENT newUB117) {
		if (newUB117 != uB117) {
			NotificationChain msgs = null;
			if (uB117 != null)
				msgs = ((InternalEObject)uB117).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB117, null, msgs);
			if (newUB117 != null)
				msgs = ((InternalEObject)newUB117).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB117, null, msgs);
			msgs = basicSetUB117(newUB117, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB117, newUB117, newUB117));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB118CONTENT getUB118() {
		return uB118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB118(UB118CONTENT newUB118, NotificationChain msgs) {
		UB118CONTENT oldUB118 = uB118;
		uB118 = newUB118;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB118, oldUB118, newUB118);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB118(UB118CONTENT newUB118) {
		if (newUB118 != uB118) {
			NotificationChain msgs = null;
			if (uB118 != null)
				msgs = ((InternalEObject)uB118).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB118, null, msgs);
			if (newUB118 != null)
				msgs = ((InternalEObject)newUB118).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB118, null, msgs);
			msgs = basicSetUB118(newUB118, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB118, newUB118, newUB118));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB119CONTENT getUB119() {
		return uB119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB119(UB119CONTENT newUB119, NotificationChain msgs) {
		UB119CONTENT oldUB119 = uB119;
		uB119 = newUB119;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB119, oldUB119, newUB119);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB119(UB119CONTENT newUB119) {
		if (newUB119 != uB119) {
			NotificationChain msgs = null;
			if (uB119 != null)
				msgs = ((InternalEObject)uB119).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB119, null, msgs);
			if (newUB119 != null)
				msgs = ((InternalEObject)newUB119).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB119, null, msgs);
			msgs = basicSetUB119(newUB119, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB119, newUB119, newUB119));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB120CONTENT getUB120() {
		return uB120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB120(UB120CONTENT newUB120, NotificationChain msgs) {
		UB120CONTENT oldUB120 = uB120;
		uB120 = newUB120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB120, oldUB120, newUB120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB120(UB120CONTENT newUB120) {
		if (newUB120 != uB120) {
			NotificationChain msgs = null;
			if (uB120 != null)
				msgs = ((InternalEObject)uB120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB120, null, msgs);
			if (newUB120 != null)
				msgs = ((InternalEObject)newUB120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB120, null, msgs);
			msgs = basicSetUB120(newUB120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB120, newUB120, newUB120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB121CONTENT getUB121() {
		return uB121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB121(UB121CONTENT newUB121, NotificationChain msgs) {
		UB121CONTENT oldUB121 = uB121;
		uB121 = newUB121;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB121, oldUB121, newUB121);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB121(UB121CONTENT newUB121) {
		if (newUB121 != uB121) {
			NotificationChain msgs = null;
			if (uB121 != null)
				msgs = ((InternalEObject)uB121).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB121, null, msgs);
			if (newUB121 != null)
				msgs = ((InternalEObject)newUB121).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB121, null, msgs);
			msgs = basicSetUB121(newUB121, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB121, newUB121, newUB121));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB122CONTENT getUB122() {
		return uB122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB122(UB122CONTENT newUB122, NotificationChain msgs) {
		UB122CONTENT oldUB122 = uB122;
		uB122 = newUB122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB122, oldUB122, newUB122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB122(UB122CONTENT newUB122) {
		if (newUB122 != uB122) {
			NotificationChain msgs = null;
			if (uB122 != null)
				msgs = ((InternalEObject)uB122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB122, null, msgs);
			if (newUB122 != null)
				msgs = ((InternalEObject)newUB122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB122, null, msgs);
			msgs = basicSetUB122(newUB122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB122, newUB122, newUB122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB123CONTENT getUB123() {
		return uB123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB123(UB123CONTENT newUB123, NotificationChain msgs) {
		UB123CONTENT oldUB123 = uB123;
		uB123 = newUB123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB123, oldUB123, newUB123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB123(UB123CONTENT newUB123) {
		if (newUB123 != uB123) {
			NotificationChain msgs = null;
			if (uB123 != null)
				msgs = ((InternalEObject)uB123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB123, null, msgs);
			if (newUB123 != null)
				msgs = ((InternalEObject)newUB123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB1CONTENT__UB123, null, msgs);
			msgs = basicSetUB123(newUB123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB1CONTENT__UB123, newUB123, newUB123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.UB1CONTENT__ANY);
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
			case V2xmlPackage.UB1CONTENT__UB11:
				return basicSetUB11(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB12:
				return basicSetUB12(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB13:
				return basicSetUB13(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB14:
				return basicSetUB14(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB15:
				return basicSetUB15(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB16:
				return basicSetUB16(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB17:
				return ((InternalEList<?>)getUB17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB1CONTENT__UB18:
				return basicSetUB18(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB19:
				return basicSetUB19(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB110:
				return ((InternalEList<?>)getUB110()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB1CONTENT__UB111:
				return basicSetUB111(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB112:
				return basicSetUB112(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB113:
				return basicSetUB113(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB114:
				return basicSetUB114(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB115:
				return basicSetUB115(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB116:
				return ((InternalEList<?>)getUB116()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB1CONTENT__UB117:
				return basicSetUB117(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB118:
				return basicSetUB118(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB119:
				return basicSetUB119(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB120:
				return basicSetUB120(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB121:
				return basicSetUB121(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB122:
				return basicSetUB122(null, msgs);
			case V2xmlPackage.UB1CONTENT__UB123:
				return basicSetUB123(null, msgs);
			case V2xmlPackage.UB1CONTENT__ANY:
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
			case V2xmlPackage.UB1CONTENT__UB11:
				return getUB11();
			case V2xmlPackage.UB1CONTENT__UB12:
				return getUB12();
			case V2xmlPackage.UB1CONTENT__UB13:
				return getUB13();
			case V2xmlPackage.UB1CONTENT__UB14:
				return getUB14();
			case V2xmlPackage.UB1CONTENT__UB15:
				return getUB15();
			case V2xmlPackage.UB1CONTENT__UB16:
				return getUB16();
			case V2xmlPackage.UB1CONTENT__UB17:
				return getUB17();
			case V2xmlPackage.UB1CONTENT__UB18:
				return getUB18();
			case V2xmlPackage.UB1CONTENT__UB19:
				return getUB19();
			case V2xmlPackage.UB1CONTENT__UB110:
				return getUB110();
			case V2xmlPackage.UB1CONTENT__UB111:
				return getUB111();
			case V2xmlPackage.UB1CONTENT__UB112:
				return getUB112();
			case V2xmlPackage.UB1CONTENT__UB113:
				return getUB113();
			case V2xmlPackage.UB1CONTENT__UB114:
				return getUB114();
			case V2xmlPackage.UB1CONTENT__UB115:
				return getUB115();
			case V2xmlPackage.UB1CONTENT__UB116:
				return getUB116();
			case V2xmlPackage.UB1CONTENT__UB117:
				return getUB117();
			case V2xmlPackage.UB1CONTENT__UB118:
				return getUB118();
			case V2xmlPackage.UB1CONTENT__UB119:
				return getUB119();
			case V2xmlPackage.UB1CONTENT__UB120:
				return getUB120();
			case V2xmlPackage.UB1CONTENT__UB121:
				return getUB121();
			case V2xmlPackage.UB1CONTENT__UB122:
				return getUB122();
			case V2xmlPackage.UB1CONTENT__UB123:
				return getUB123();
			case V2xmlPackage.UB1CONTENT__ANY:
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
			case V2xmlPackage.UB1CONTENT__UB11:
				setUB11((UB11CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB12:
				setUB12((UB12CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB13:
				setUB13((UB13CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB14:
				setUB14((UB14CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB15:
				setUB15((UB15CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB16:
				setUB16((UB16CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB17:
				getUB17().clear();
				getUB17().addAll((Collection<? extends UB17CONTENT>)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB18:
				setUB18((UB18CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB19:
				setUB19((UB19CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB110:
				getUB110().clear();
				getUB110().addAll((Collection<? extends UB110CONTENT>)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB111:
				setUB111((UB111CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB112:
				setUB112((UB112CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB113:
				setUB113((UB113CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB114:
				setUB114((UB114CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB115:
				setUB115((UB115CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB116:
				getUB116().clear();
				getUB116().addAll((Collection<? extends UB116CONTENT>)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB117:
				setUB117((UB117CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB118:
				setUB118((UB118CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB119:
				setUB119((UB119CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB120:
				setUB120((UB120CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB121:
				setUB121((UB121CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB122:
				setUB122((UB122CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__UB123:
				setUB123((UB123CONTENT)newValue);
				return;
			case V2xmlPackage.UB1CONTENT__ANY:
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
			case V2xmlPackage.UB1CONTENT__UB11:
				setUB11((UB11CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB12:
				setUB12((UB12CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB13:
				setUB13((UB13CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB14:
				setUB14((UB14CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB15:
				setUB15((UB15CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB16:
				setUB16((UB16CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB17:
				getUB17().clear();
				return;
			case V2xmlPackage.UB1CONTENT__UB18:
				setUB18((UB18CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB19:
				setUB19((UB19CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB110:
				getUB110().clear();
				return;
			case V2xmlPackage.UB1CONTENT__UB111:
				setUB111((UB111CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB112:
				setUB112((UB112CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB113:
				setUB113((UB113CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB114:
				setUB114((UB114CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB115:
				setUB115((UB115CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB116:
				getUB116().clear();
				return;
			case V2xmlPackage.UB1CONTENT__UB117:
				setUB117((UB117CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB118:
				setUB118((UB118CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB119:
				setUB119((UB119CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB120:
				setUB120((UB120CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB121:
				setUB121((UB121CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB122:
				setUB122((UB122CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__UB123:
				setUB123((UB123CONTENT)null);
				return;
			case V2xmlPackage.UB1CONTENT__ANY:
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
			case V2xmlPackage.UB1CONTENT__UB11:
				return uB11 != null;
			case V2xmlPackage.UB1CONTENT__UB12:
				return uB12 != null;
			case V2xmlPackage.UB1CONTENT__UB13:
				return uB13 != null;
			case V2xmlPackage.UB1CONTENT__UB14:
				return uB14 != null;
			case V2xmlPackage.UB1CONTENT__UB15:
				return uB15 != null;
			case V2xmlPackage.UB1CONTENT__UB16:
				return uB16 != null;
			case V2xmlPackage.UB1CONTENT__UB17:
				return uB17 != null && !uB17.isEmpty();
			case V2xmlPackage.UB1CONTENT__UB18:
				return uB18 != null;
			case V2xmlPackage.UB1CONTENT__UB19:
				return uB19 != null;
			case V2xmlPackage.UB1CONTENT__UB110:
				return uB110 != null && !uB110.isEmpty();
			case V2xmlPackage.UB1CONTENT__UB111:
				return uB111 != null;
			case V2xmlPackage.UB1CONTENT__UB112:
				return uB112 != null;
			case V2xmlPackage.UB1CONTENT__UB113:
				return uB113 != null;
			case V2xmlPackage.UB1CONTENT__UB114:
				return uB114 != null;
			case V2xmlPackage.UB1CONTENT__UB115:
				return uB115 != null;
			case V2xmlPackage.UB1CONTENT__UB116:
				return uB116 != null && !uB116.isEmpty();
			case V2xmlPackage.UB1CONTENT__UB117:
				return uB117 != null;
			case V2xmlPackage.UB1CONTENT__UB118:
				return uB118 != null;
			case V2xmlPackage.UB1CONTENT__UB119:
				return uB119 != null;
			case V2xmlPackage.UB1CONTENT__UB120:
				return uB120 != null;
			case V2xmlPackage.UB1CONTENT__UB121:
				return uB121 != null;
			case V2xmlPackage.UB1CONTENT__UB122:
				return uB122 != null;
			case V2xmlPackage.UB1CONTENT__UB123:
				return uB123 != null;
			case V2xmlPackage.UB1CONTENT__ANY:
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

} //UB1CONTENTImpl
