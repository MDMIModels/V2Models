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

import org.hl7.v2xml.TQ110CONTENT;
import org.hl7.v2xml.TQ111CONTENT;
import org.hl7.v2xml.TQ112CONTENT;
import org.hl7.v2xml.TQ113CONTENT;
import org.hl7.v2xml.TQ114CONTENT;
import org.hl7.v2xml.TQ11CONTENT;
import org.hl7.v2xml.TQ12CONTENT;
import org.hl7.v2xml.TQ13CONTENT;
import org.hl7.v2xml.TQ14CONTENT;
import org.hl7.v2xml.TQ15CONTENT;
import org.hl7.v2xml.TQ16CONTENT;
import org.hl7.v2xml.TQ17CONTENT;
import org.hl7.v2xml.TQ18CONTENT;
import org.hl7.v2xml.TQ19CONTENT;
import org.hl7.v2xml.TQ1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TQ1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ11 <em>TQ11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ12 <em>TQ12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ13 <em>TQ13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ14 <em>TQ14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ15 <em>TQ15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ16 <em>TQ16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ17 <em>TQ17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ18 <em>TQ18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ19 <em>TQ19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ110 <em>TQ110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ111 <em>TQ111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ112 <em>TQ112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ113 <em>TQ113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getTQ114 <em>TQ114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TQ1CONTENTImpl extends EObjectImpl implements TQ1CONTENT {
	/**
	 * The cached value of the '{@link #getTQ11() <em>TQ11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ11()
	 * @generated
	 * @ordered
	 */
	protected TQ11CONTENT tQ11;

	/**
	 * The cached value of the '{@link #getTQ12() <em>TQ12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ12()
	 * @generated
	 * @ordered
	 */
	protected TQ12CONTENT tQ12;

	/**
	 * The cached value of the '{@link #getTQ13() <em>TQ13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ13()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ13CONTENT> tQ13;

	/**
	 * The cached value of the '{@link #getTQ14() <em>TQ14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ14()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ14CONTENT> tQ14;

	/**
	 * The cached value of the '{@link #getTQ15() <em>TQ15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ15()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ15CONTENT> tQ15;

	/**
	 * The cached value of the '{@link #getTQ16() <em>TQ16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ16()
	 * @generated
	 * @ordered
	 */
	protected TQ16CONTENT tQ16;

	/**
	 * The cached value of the '{@link #getTQ17() <em>TQ17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ17()
	 * @generated
	 * @ordered
	 */
	protected TQ17CONTENT tQ17;

	/**
	 * The cached value of the '{@link #getTQ18() <em>TQ18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ18()
	 * @generated
	 * @ordered
	 */
	protected TQ18CONTENT tQ18;

	/**
	 * The cached value of the '{@link #getTQ19() <em>TQ19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ19()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ19CONTENT> tQ19;

	/**
	 * The cached value of the '{@link #getTQ110() <em>TQ110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ110()
	 * @generated
	 * @ordered
	 */
	protected TQ110CONTENT tQ110;

	/**
	 * The cached value of the '{@link #getTQ111() <em>TQ111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ111()
	 * @generated
	 * @ordered
	 */
	protected TQ111CONTENT tQ111;

	/**
	 * The cached value of the '{@link #getTQ112() <em>TQ112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ112()
	 * @generated
	 * @ordered
	 */
	protected TQ112CONTENT tQ112;

	/**
	 * The cached value of the '{@link #getTQ113() <em>TQ113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ113()
	 * @generated
	 * @ordered
	 */
	protected TQ113CONTENT tQ113;

	/**
	 * The cached value of the '{@link #getTQ114() <em>TQ114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ114()
	 * @generated
	 * @ordered
	 */
	protected TQ114CONTENT tQ114;

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
	protected TQ1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTQ1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ11CONTENT getTQ11() {
		return tQ11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ11(TQ11CONTENT newTQ11, NotificationChain msgs) {
		TQ11CONTENT oldTQ11 = tQ11;
		tQ11 = newTQ11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ11, oldTQ11, newTQ11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ11(TQ11CONTENT newTQ11) {
		if (newTQ11 != tQ11) {
			NotificationChain msgs = null;
			if (tQ11 != null)
				msgs = ((InternalEObject)tQ11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ11, null, msgs);
			if (newTQ11 != null)
				msgs = ((InternalEObject)newTQ11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ11, null, msgs);
			msgs = basicSetTQ11(newTQ11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ11, newTQ11, newTQ11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ12CONTENT getTQ12() {
		return tQ12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ12(TQ12CONTENT newTQ12, NotificationChain msgs) {
		TQ12CONTENT oldTQ12 = tQ12;
		tQ12 = newTQ12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ12, oldTQ12, newTQ12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ12(TQ12CONTENT newTQ12) {
		if (newTQ12 != tQ12) {
			NotificationChain msgs = null;
			if (tQ12 != null)
				msgs = ((InternalEObject)tQ12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ12, null, msgs);
			if (newTQ12 != null)
				msgs = ((InternalEObject)newTQ12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ12, null, msgs);
			msgs = basicSetTQ12(newTQ12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ12, newTQ12, newTQ12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ13CONTENT> getTQ13() {
		if (tQ13 == null) {
			tQ13 = new EObjectContainmentEList<TQ13CONTENT>(TQ13CONTENT.class, this, V2xmlPackage.TQ1CONTENT__TQ13);
		}
		return tQ13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ14CONTENT> getTQ14() {
		if (tQ14 == null) {
			tQ14 = new EObjectContainmentEList<TQ14CONTENT>(TQ14CONTENT.class, this, V2xmlPackage.TQ1CONTENT__TQ14);
		}
		return tQ14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ15CONTENT> getTQ15() {
		if (tQ15 == null) {
			tQ15 = new EObjectContainmentEList<TQ15CONTENT>(TQ15CONTENT.class, this, V2xmlPackage.TQ1CONTENT__TQ15);
		}
		return tQ15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ16CONTENT getTQ16() {
		return tQ16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ16(TQ16CONTENT newTQ16, NotificationChain msgs) {
		TQ16CONTENT oldTQ16 = tQ16;
		tQ16 = newTQ16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ16, oldTQ16, newTQ16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ16(TQ16CONTENT newTQ16) {
		if (newTQ16 != tQ16) {
			NotificationChain msgs = null;
			if (tQ16 != null)
				msgs = ((InternalEObject)tQ16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ16, null, msgs);
			if (newTQ16 != null)
				msgs = ((InternalEObject)newTQ16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ16, null, msgs);
			msgs = basicSetTQ16(newTQ16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ16, newTQ16, newTQ16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ17CONTENT getTQ17() {
		return tQ17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ17(TQ17CONTENT newTQ17, NotificationChain msgs) {
		TQ17CONTENT oldTQ17 = tQ17;
		tQ17 = newTQ17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ17, oldTQ17, newTQ17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ17(TQ17CONTENT newTQ17) {
		if (newTQ17 != tQ17) {
			NotificationChain msgs = null;
			if (tQ17 != null)
				msgs = ((InternalEObject)tQ17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ17, null, msgs);
			if (newTQ17 != null)
				msgs = ((InternalEObject)newTQ17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ17, null, msgs);
			msgs = basicSetTQ17(newTQ17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ17, newTQ17, newTQ17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ18CONTENT getTQ18() {
		return tQ18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ18(TQ18CONTENT newTQ18, NotificationChain msgs) {
		TQ18CONTENT oldTQ18 = tQ18;
		tQ18 = newTQ18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ18, oldTQ18, newTQ18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ18(TQ18CONTENT newTQ18) {
		if (newTQ18 != tQ18) {
			NotificationChain msgs = null;
			if (tQ18 != null)
				msgs = ((InternalEObject)tQ18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ18, null, msgs);
			if (newTQ18 != null)
				msgs = ((InternalEObject)newTQ18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ18, null, msgs);
			msgs = basicSetTQ18(newTQ18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ18, newTQ18, newTQ18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ19CONTENT> getTQ19() {
		if (tQ19 == null) {
			tQ19 = new EObjectContainmentEList<TQ19CONTENT>(TQ19CONTENT.class, this, V2xmlPackage.TQ1CONTENT__TQ19);
		}
		return tQ19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ110CONTENT getTQ110() {
		return tQ110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ110(TQ110CONTENT newTQ110, NotificationChain msgs) {
		TQ110CONTENT oldTQ110 = tQ110;
		tQ110 = newTQ110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ110, oldTQ110, newTQ110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ110(TQ110CONTENT newTQ110) {
		if (newTQ110 != tQ110) {
			NotificationChain msgs = null;
			if (tQ110 != null)
				msgs = ((InternalEObject)tQ110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ110, null, msgs);
			if (newTQ110 != null)
				msgs = ((InternalEObject)newTQ110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ110, null, msgs);
			msgs = basicSetTQ110(newTQ110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ110, newTQ110, newTQ110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ111CONTENT getTQ111() {
		return tQ111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ111(TQ111CONTENT newTQ111, NotificationChain msgs) {
		TQ111CONTENT oldTQ111 = tQ111;
		tQ111 = newTQ111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ111, oldTQ111, newTQ111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ111(TQ111CONTENT newTQ111) {
		if (newTQ111 != tQ111) {
			NotificationChain msgs = null;
			if (tQ111 != null)
				msgs = ((InternalEObject)tQ111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ111, null, msgs);
			if (newTQ111 != null)
				msgs = ((InternalEObject)newTQ111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ111, null, msgs);
			msgs = basicSetTQ111(newTQ111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ111, newTQ111, newTQ111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ112CONTENT getTQ112() {
		return tQ112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ112(TQ112CONTENT newTQ112, NotificationChain msgs) {
		TQ112CONTENT oldTQ112 = tQ112;
		tQ112 = newTQ112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ112, oldTQ112, newTQ112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ112(TQ112CONTENT newTQ112) {
		if (newTQ112 != tQ112) {
			NotificationChain msgs = null;
			if (tQ112 != null)
				msgs = ((InternalEObject)tQ112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ112, null, msgs);
			if (newTQ112 != null)
				msgs = ((InternalEObject)newTQ112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ112, null, msgs);
			msgs = basicSetTQ112(newTQ112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ112, newTQ112, newTQ112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ113CONTENT getTQ113() {
		return tQ113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ113(TQ113CONTENT newTQ113, NotificationChain msgs) {
		TQ113CONTENT oldTQ113 = tQ113;
		tQ113 = newTQ113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ113, oldTQ113, newTQ113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ113(TQ113CONTENT newTQ113) {
		if (newTQ113 != tQ113) {
			NotificationChain msgs = null;
			if (tQ113 != null)
				msgs = ((InternalEObject)tQ113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ113, null, msgs);
			if (newTQ113 != null)
				msgs = ((InternalEObject)newTQ113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ113, null, msgs);
			msgs = basicSetTQ113(newTQ113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ113, newTQ113, newTQ113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ114CONTENT getTQ114() {
		return tQ114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ114(TQ114CONTENT newTQ114, NotificationChain msgs) {
		TQ114CONTENT oldTQ114 = tQ114;
		tQ114 = newTQ114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ114, oldTQ114, newTQ114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ114(TQ114CONTENT newTQ114) {
		if (newTQ114 != tQ114) {
			NotificationChain msgs = null;
			if (tQ114 != null)
				msgs = ((InternalEObject)tQ114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ114, null, msgs);
			if (newTQ114 != null)
				msgs = ((InternalEObject)newTQ114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ1CONTENT__TQ114, null, msgs);
			msgs = basicSetTQ114(newTQ114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ1CONTENT__TQ114, newTQ114, newTQ114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.TQ1CONTENT__ANY);
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
			case V2xmlPackage.TQ1CONTENT__TQ11:
				return basicSetTQ11(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ12:
				return basicSetTQ12(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ13:
				return ((InternalEList<?>)getTQ13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ14:
				return ((InternalEList<?>)getTQ14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ15:
				return ((InternalEList<?>)getTQ15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ16:
				return basicSetTQ16(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ17:
				return basicSetTQ17(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ18:
				return basicSetTQ18(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ19:
				return ((InternalEList<?>)getTQ19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ110:
				return basicSetTQ110(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ111:
				return basicSetTQ111(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ112:
				return basicSetTQ112(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ113:
				return basicSetTQ113(null, msgs);
			case V2xmlPackage.TQ1CONTENT__TQ114:
				return basicSetTQ114(null, msgs);
			case V2xmlPackage.TQ1CONTENT__ANY:
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
			case V2xmlPackage.TQ1CONTENT__TQ11:
				return getTQ11();
			case V2xmlPackage.TQ1CONTENT__TQ12:
				return getTQ12();
			case V2xmlPackage.TQ1CONTENT__TQ13:
				return getTQ13();
			case V2xmlPackage.TQ1CONTENT__TQ14:
				return getTQ14();
			case V2xmlPackage.TQ1CONTENT__TQ15:
				return getTQ15();
			case V2xmlPackage.TQ1CONTENT__TQ16:
				return getTQ16();
			case V2xmlPackage.TQ1CONTENT__TQ17:
				return getTQ17();
			case V2xmlPackage.TQ1CONTENT__TQ18:
				return getTQ18();
			case V2xmlPackage.TQ1CONTENT__TQ19:
				return getTQ19();
			case V2xmlPackage.TQ1CONTENT__TQ110:
				return getTQ110();
			case V2xmlPackage.TQ1CONTENT__TQ111:
				return getTQ111();
			case V2xmlPackage.TQ1CONTENT__TQ112:
				return getTQ112();
			case V2xmlPackage.TQ1CONTENT__TQ113:
				return getTQ113();
			case V2xmlPackage.TQ1CONTENT__TQ114:
				return getTQ114();
			case V2xmlPackage.TQ1CONTENT__ANY:
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
			case V2xmlPackage.TQ1CONTENT__TQ11:
				setTQ11((TQ11CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ12:
				setTQ12((TQ12CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ13:
				getTQ13().clear();
				getTQ13().addAll((Collection<? extends TQ13CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ14:
				getTQ14().clear();
				getTQ14().addAll((Collection<? extends TQ14CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ15:
				getTQ15().clear();
				getTQ15().addAll((Collection<? extends TQ15CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ16:
				setTQ16((TQ16CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ17:
				setTQ17((TQ17CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ18:
				setTQ18((TQ18CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ19:
				getTQ19().clear();
				getTQ19().addAll((Collection<? extends TQ19CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ110:
				setTQ110((TQ110CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ111:
				setTQ111((TQ111CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ112:
				setTQ112((TQ112CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ113:
				setTQ113((TQ113CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ114:
				setTQ114((TQ114CONTENT)newValue);
				return;
			case V2xmlPackage.TQ1CONTENT__ANY:
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
			case V2xmlPackage.TQ1CONTENT__TQ11:
				setTQ11((TQ11CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ12:
				setTQ12((TQ12CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ13:
				getTQ13().clear();
				return;
			case V2xmlPackage.TQ1CONTENT__TQ14:
				getTQ14().clear();
				return;
			case V2xmlPackage.TQ1CONTENT__TQ15:
				getTQ15().clear();
				return;
			case V2xmlPackage.TQ1CONTENT__TQ16:
				setTQ16((TQ16CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ17:
				setTQ17((TQ17CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ18:
				setTQ18((TQ18CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ19:
				getTQ19().clear();
				return;
			case V2xmlPackage.TQ1CONTENT__TQ110:
				setTQ110((TQ110CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ111:
				setTQ111((TQ111CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ112:
				setTQ112((TQ112CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ113:
				setTQ113((TQ113CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__TQ114:
				setTQ114((TQ114CONTENT)null);
				return;
			case V2xmlPackage.TQ1CONTENT__ANY:
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
			case V2xmlPackage.TQ1CONTENT__TQ11:
				return tQ11 != null;
			case V2xmlPackage.TQ1CONTENT__TQ12:
				return tQ12 != null;
			case V2xmlPackage.TQ1CONTENT__TQ13:
				return tQ13 != null && !tQ13.isEmpty();
			case V2xmlPackage.TQ1CONTENT__TQ14:
				return tQ14 != null && !tQ14.isEmpty();
			case V2xmlPackage.TQ1CONTENT__TQ15:
				return tQ15 != null && !tQ15.isEmpty();
			case V2xmlPackage.TQ1CONTENT__TQ16:
				return tQ16 != null;
			case V2xmlPackage.TQ1CONTENT__TQ17:
				return tQ17 != null;
			case V2xmlPackage.TQ1CONTENT__TQ18:
				return tQ18 != null;
			case V2xmlPackage.TQ1CONTENT__TQ19:
				return tQ19 != null && !tQ19.isEmpty();
			case V2xmlPackage.TQ1CONTENT__TQ110:
				return tQ110 != null;
			case V2xmlPackage.TQ1CONTENT__TQ111:
				return tQ111 != null;
			case V2xmlPackage.TQ1CONTENT__TQ112:
				return tQ112 != null;
			case V2xmlPackage.TQ1CONTENT__TQ113:
				return tQ113 != null;
			case V2xmlPackage.TQ1CONTENT__TQ114:
				return tQ114 != null;
			case V2xmlPackage.TQ1CONTENT__ANY:
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

} //TQ1CONTENTImpl
