/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.LA1;
import org.hl7.v2xml.LA11CONTENT;
import org.hl7.v2xml.LA12CONTENT;
import org.hl7.v2xml.LA13CONTENT;
import org.hl7.v2xml.LA14CONTENT;
import org.hl7.v2xml.LA15CONTENT;
import org.hl7.v2xml.LA16CONTENT;
import org.hl7.v2xml.LA17CONTENT;
import org.hl7.v2xml.LA18CONTENT;
import org.hl7.v2xml.LA19CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LA1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA11 <em>LA11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA12 <em>LA12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA13 <em>LA13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA14 <em>LA14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA15 <em>LA15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA16 <em>LA16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA17 <em>LA17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA18 <em>LA18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA1Impl#getLA19 <em>LA19</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LA1Impl extends EObjectImpl implements LA1 {
	/**
	 * The cached value of the '{@link #getLA11() <em>LA11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA11()
	 * @generated
	 * @ordered
	 */
	protected LA11CONTENT lA11;

	/**
	 * The cached value of the '{@link #getLA12() <em>LA12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA12()
	 * @generated
	 * @ordered
	 */
	protected LA12CONTENT lA12;

	/**
	 * The cached value of the '{@link #getLA13() <em>LA13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA13()
	 * @generated
	 * @ordered
	 */
	protected LA13CONTENT lA13;

	/**
	 * The cached value of the '{@link #getLA14() <em>LA14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA14()
	 * @generated
	 * @ordered
	 */
	protected LA14CONTENT lA14;

	/**
	 * The cached value of the '{@link #getLA15() <em>LA15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA15()
	 * @generated
	 * @ordered
	 */
	protected LA15CONTENT lA15;

	/**
	 * The cached value of the '{@link #getLA16() <em>LA16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA16()
	 * @generated
	 * @ordered
	 */
	protected LA16CONTENT lA16;

	/**
	 * The cached value of the '{@link #getLA17() <em>LA17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA17()
	 * @generated
	 * @ordered
	 */
	protected LA17CONTENT lA17;

	/**
	 * The cached value of the '{@link #getLA18() <em>LA18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA18()
	 * @generated
	 * @ordered
	 */
	protected LA18CONTENT lA18;

	/**
	 * The cached value of the '{@link #getLA19() <em>LA19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA19()
	 * @generated
	 * @ordered
	 */
	protected LA19CONTENT lA19;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LA1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLA1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA11CONTENT getLA11() {
		return lA11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA11(LA11CONTENT newLA11, NotificationChain msgs) {
		LA11CONTENT oldLA11 = lA11;
		lA11 = newLA11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA11, oldLA11, newLA11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA11(LA11CONTENT newLA11) {
		if (newLA11 != lA11) {
			NotificationChain msgs = null;
			if (lA11 != null)
				msgs = ((InternalEObject)lA11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA11, null, msgs);
			if (newLA11 != null)
				msgs = ((InternalEObject)newLA11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA11, null, msgs);
			msgs = basicSetLA11(newLA11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA11, newLA11, newLA11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA12CONTENT getLA12() {
		return lA12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA12(LA12CONTENT newLA12, NotificationChain msgs) {
		LA12CONTENT oldLA12 = lA12;
		lA12 = newLA12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA12, oldLA12, newLA12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA12(LA12CONTENT newLA12) {
		if (newLA12 != lA12) {
			NotificationChain msgs = null;
			if (lA12 != null)
				msgs = ((InternalEObject)lA12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA12, null, msgs);
			if (newLA12 != null)
				msgs = ((InternalEObject)newLA12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA12, null, msgs);
			msgs = basicSetLA12(newLA12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA12, newLA12, newLA12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA13CONTENT getLA13() {
		return lA13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA13(LA13CONTENT newLA13, NotificationChain msgs) {
		LA13CONTENT oldLA13 = lA13;
		lA13 = newLA13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA13, oldLA13, newLA13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA13(LA13CONTENT newLA13) {
		if (newLA13 != lA13) {
			NotificationChain msgs = null;
			if (lA13 != null)
				msgs = ((InternalEObject)lA13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA13, null, msgs);
			if (newLA13 != null)
				msgs = ((InternalEObject)newLA13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA13, null, msgs);
			msgs = basicSetLA13(newLA13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA13, newLA13, newLA13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA14CONTENT getLA14() {
		return lA14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA14(LA14CONTENT newLA14, NotificationChain msgs) {
		LA14CONTENT oldLA14 = lA14;
		lA14 = newLA14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA14, oldLA14, newLA14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA14(LA14CONTENT newLA14) {
		if (newLA14 != lA14) {
			NotificationChain msgs = null;
			if (lA14 != null)
				msgs = ((InternalEObject)lA14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA14, null, msgs);
			if (newLA14 != null)
				msgs = ((InternalEObject)newLA14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA14, null, msgs);
			msgs = basicSetLA14(newLA14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA14, newLA14, newLA14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA15CONTENT getLA15() {
		return lA15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA15(LA15CONTENT newLA15, NotificationChain msgs) {
		LA15CONTENT oldLA15 = lA15;
		lA15 = newLA15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA15, oldLA15, newLA15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA15(LA15CONTENT newLA15) {
		if (newLA15 != lA15) {
			NotificationChain msgs = null;
			if (lA15 != null)
				msgs = ((InternalEObject)lA15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA15, null, msgs);
			if (newLA15 != null)
				msgs = ((InternalEObject)newLA15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA15, null, msgs);
			msgs = basicSetLA15(newLA15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA15, newLA15, newLA15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA16CONTENT getLA16() {
		return lA16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA16(LA16CONTENT newLA16, NotificationChain msgs) {
		LA16CONTENT oldLA16 = lA16;
		lA16 = newLA16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA16, oldLA16, newLA16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA16(LA16CONTENT newLA16) {
		if (newLA16 != lA16) {
			NotificationChain msgs = null;
			if (lA16 != null)
				msgs = ((InternalEObject)lA16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA16, null, msgs);
			if (newLA16 != null)
				msgs = ((InternalEObject)newLA16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA16, null, msgs);
			msgs = basicSetLA16(newLA16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA16, newLA16, newLA16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA17CONTENT getLA17() {
		return lA17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA17(LA17CONTENT newLA17, NotificationChain msgs) {
		LA17CONTENT oldLA17 = lA17;
		lA17 = newLA17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA17, oldLA17, newLA17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA17(LA17CONTENT newLA17) {
		if (newLA17 != lA17) {
			NotificationChain msgs = null;
			if (lA17 != null)
				msgs = ((InternalEObject)lA17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA17, null, msgs);
			if (newLA17 != null)
				msgs = ((InternalEObject)newLA17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA17, null, msgs);
			msgs = basicSetLA17(newLA17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA17, newLA17, newLA17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA18CONTENT getLA18() {
		return lA18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA18(LA18CONTENT newLA18, NotificationChain msgs) {
		LA18CONTENT oldLA18 = lA18;
		lA18 = newLA18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA18, oldLA18, newLA18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA18(LA18CONTENT newLA18) {
		if (newLA18 != lA18) {
			NotificationChain msgs = null;
			if (lA18 != null)
				msgs = ((InternalEObject)lA18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA18, null, msgs);
			if (newLA18 != null)
				msgs = ((InternalEObject)newLA18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA18, null, msgs);
			msgs = basicSetLA18(newLA18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA18, newLA18, newLA18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA19CONTENT getLA19() {
		return lA19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA19(LA19CONTENT newLA19, NotificationChain msgs) {
		LA19CONTENT oldLA19 = lA19;
		lA19 = newLA19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA19, oldLA19, newLA19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA19(LA19CONTENT newLA19) {
		if (newLA19 != lA19) {
			NotificationChain msgs = null;
			if (lA19 != null)
				msgs = ((InternalEObject)lA19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA19, null, msgs);
			if (newLA19 != null)
				msgs = ((InternalEObject)newLA19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA1__LA19, null, msgs);
			msgs = basicSetLA19(newLA19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA1__LA19, newLA19, newLA19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.LA1__LA11:
				return basicSetLA11(null, msgs);
			case V2xmlPackage.LA1__LA12:
				return basicSetLA12(null, msgs);
			case V2xmlPackage.LA1__LA13:
				return basicSetLA13(null, msgs);
			case V2xmlPackage.LA1__LA14:
				return basicSetLA14(null, msgs);
			case V2xmlPackage.LA1__LA15:
				return basicSetLA15(null, msgs);
			case V2xmlPackage.LA1__LA16:
				return basicSetLA16(null, msgs);
			case V2xmlPackage.LA1__LA17:
				return basicSetLA17(null, msgs);
			case V2xmlPackage.LA1__LA18:
				return basicSetLA18(null, msgs);
			case V2xmlPackage.LA1__LA19:
				return basicSetLA19(null, msgs);
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
			case V2xmlPackage.LA1__LA11:
				return getLA11();
			case V2xmlPackage.LA1__LA12:
				return getLA12();
			case V2xmlPackage.LA1__LA13:
				return getLA13();
			case V2xmlPackage.LA1__LA14:
				return getLA14();
			case V2xmlPackage.LA1__LA15:
				return getLA15();
			case V2xmlPackage.LA1__LA16:
				return getLA16();
			case V2xmlPackage.LA1__LA17:
				return getLA17();
			case V2xmlPackage.LA1__LA18:
				return getLA18();
			case V2xmlPackage.LA1__LA19:
				return getLA19();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.LA1__LA11:
				setLA11((LA11CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA12:
				setLA12((LA12CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA13:
				setLA13((LA13CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA14:
				setLA14((LA14CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA15:
				setLA15((LA15CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA16:
				setLA16((LA16CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA17:
				setLA17((LA17CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA18:
				setLA18((LA18CONTENT)newValue);
				return;
			case V2xmlPackage.LA1__LA19:
				setLA19((LA19CONTENT)newValue);
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
			case V2xmlPackage.LA1__LA11:
				setLA11((LA11CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA12:
				setLA12((LA12CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA13:
				setLA13((LA13CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA14:
				setLA14((LA14CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA15:
				setLA15((LA15CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA16:
				setLA16((LA16CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA17:
				setLA17((LA17CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA18:
				setLA18((LA18CONTENT)null);
				return;
			case V2xmlPackage.LA1__LA19:
				setLA19((LA19CONTENT)null);
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
			case V2xmlPackage.LA1__LA11:
				return lA11 != null;
			case V2xmlPackage.LA1__LA12:
				return lA12 != null;
			case V2xmlPackage.LA1__LA13:
				return lA13 != null;
			case V2xmlPackage.LA1__LA14:
				return lA14 != null;
			case V2xmlPackage.LA1__LA15:
				return lA15 != null;
			case V2xmlPackage.LA1__LA16:
				return lA16 != null;
			case V2xmlPackage.LA1__LA17:
				return lA17 != null;
			case V2xmlPackage.LA1__LA18:
				return lA18 != null;
			case V2xmlPackage.LA1__LA19:
				return lA19 != null;
		}
		return super.eIsSet(featureID);
	}

} //LA1Impl
