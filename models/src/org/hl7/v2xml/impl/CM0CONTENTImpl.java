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

import org.hl7.v2xml.CM010CONTENT;
import org.hl7.v2xml.CM011CONTENT;
import org.hl7.v2xml.CM01CONTENT;
import org.hl7.v2xml.CM02CONTENT;
import org.hl7.v2xml.CM03CONTENT;
import org.hl7.v2xml.CM04CONTENT;
import org.hl7.v2xml.CM05CONTENT;
import org.hl7.v2xml.CM06CONTENT;
import org.hl7.v2xml.CM07CONTENT;
import org.hl7.v2xml.CM08CONTENT;
import org.hl7.v2xml.CM09CONTENT;
import org.hl7.v2xml.CM0CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CM0CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM01 <em>CM01</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM02 <em>CM02</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM03 <em>CM03</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM04 <em>CM04</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM05 <em>CM05</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM06 <em>CM06</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM07 <em>CM07</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM08 <em>CM08</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM09 <em>CM09</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM010 <em>CM010</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getCM011 <em>CM011</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CM0CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CM0CONTENTImpl extends EObjectImpl implements CM0CONTENT {
	/**
	 * The cached value of the '{@link #getCM01() <em>CM01</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM01()
	 * @generated
	 * @ordered
	 */
	protected CM01CONTENT cM01;

	/**
	 * The cached value of the '{@link #getCM02() <em>CM02</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM02()
	 * @generated
	 * @ordered
	 */
	protected CM02CONTENT cM02;

	/**
	 * The cached value of the '{@link #getCM03() <em>CM03</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM03()
	 * @generated
	 * @ordered
	 */
	protected EList<CM03CONTENT> cM03;

	/**
	 * The cached value of the '{@link #getCM04() <em>CM04</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM04()
	 * @generated
	 * @ordered
	 */
	protected CM04CONTENT cM04;

	/**
	 * The cached value of the '{@link #getCM05() <em>CM05</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM05()
	 * @generated
	 * @ordered
	 */
	protected EList<CM05CONTENT> cM05;

	/**
	 * The cached value of the '{@link #getCM06() <em>CM06</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM06()
	 * @generated
	 * @ordered
	 */
	protected CM06CONTENT cM06;

	/**
	 * The cached value of the '{@link #getCM07() <em>CM07</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM07()
	 * @generated
	 * @ordered
	 */
	protected CM07CONTENT cM07;

	/**
	 * The cached value of the '{@link #getCM08() <em>CM08</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM08()
	 * @generated
	 * @ordered
	 */
	protected CM08CONTENT cM08;

	/**
	 * The cached value of the '{@link #getCM09() <em>CM09</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM09()
	 * @generated
	 * @ordered
	 */
	protected EList<CM09CONTENT> cM09;

	/**
	 * The cached value of the '{@link #getCM010() <em>CM010</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM010()
	 * @generated
	 * @ordered
	 */
	protected CM010CONTENT cM010;

	/**
	 * The cached value of the '{@link #getCM011() <em>CM011</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCM011()
	 * @generated
	 * @ordered
	 */
	protected EList<CM011CONTENT> cM011;

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
	protected CM0CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCM0CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM01CONTENT getCM01() {
		return cM01;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM01(CM01CONTENT newCM01, NotificationChain msgs) {
		CM01CONTENT oldCM01 = cM01;
		cM01 = newCM01;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM01, oldCM01, newCM01);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM01(CM01CONTENT newCM01) {
		if (newCM01 != cM01) {
			NotificationChain msgs = null;
			if (cM01 != null)
				msgs = ((InternalEObject)cM01).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM01, null, msgs);
			if (newCM01 != null)
				msgs = ((InternalEObject)newCM01).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM01, null, msgs);
			msgs = basicSetCM01(newCM01, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM01, newCM01, newCM01));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM02CONTENT getCM02() {
		return cM02;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM02(CM02CONTENT newCM02, NotificationChain msgs) {
		CM02CONTENT oldCM02 = cM02;
		cM02 = newCM02;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM02, oldCM02, newCM02);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM02(CM02CONTENT newCM02) {
		if (newCM02 != cM02) {
			NotificationChain msgs = null;
			if (cM02 != null)
				msgs = ((InternalEObject)cM02).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM02, null, msgs);
			if (newCM02 != null)
				msgs = ((InternalEObject)newCM02).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM02, null, msgs);
			msgs = basicSetCM02(newCM02, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM02, newCM02, newCM02));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM03CONTENT> getCM03() {
		if (cM03 == null) {
			cM03 = new EObjectContainmentEList<CM03CONTENT>(CM03CONTENT.class, this, V2xmlPackage.CM0CONTENT__CM03);
		}
		return cM03;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM04CONTENT getCM04() {
		return cM04;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM04(CM04CONTENT newCM04, NotificationChain msgs) {
		CM04CONTENT oldCM04 = cM04;
		cM04 = newCM04;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM04, oldCM04, newCM04);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM04(CM04CONTENT newCM04) {
		if (newCM04 != cM04) {
			NotificationChain msgs = null;
			if (cM04 != null)
				msgs = ((InternalEObject)cM04).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM04, null, msgs);
			if (newCM04 != null)
				msgs = ((InternalEObject)newCM04).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM04, null, msgs);
			msgs = basicSetCM04(newCM04, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM04, newCM04, newCM04));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM05CONTENT> getCM05() {
		if (cM05 == null) {
			cM05 = new EObjectContainmentEList<CM05CONTENT>(CM05CONTENT.class, this, V2xmlPackage.CM0CONTENT__CM05);
		}
		return cM05;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM06CONTENT getCM06() {
		return cM06;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM06(CM06CONTENT newCM06, NotificationChain msgs) {
		CM06CONTENT oldCM06 = cM06;
		cM06 = newCM06;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM06, oldCM06, newCM06);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM06(CM06CONTENT newCM06) {
		if (newCM06 != cM06) {
			NotificationChain msgs = null;
			if (cM06 != null)
				msgs = ((InternalEObject)cM06).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM06, null, msgs);
			if (newCM06 != null)
				msgs = ((InternalEObject)newCM06).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM06, null, msgs);
			msgs = basicSetCM06(newCM06, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM06, newCM06, newCM06));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM07CONTENT getCM07() {
		return cM07;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM07(CM07CONTENT newCM07, NotificationChain msgs) {
		CM07CONTENT oldCM07 = cM07;
		cM07 = newCM07;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM07, oldCM07, newCM07);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM07(CM07CONTENT newCM07) {
		if (newCM07 != cM07) {
			NotificationChain msgs = null;
			if (cM07 != null)
				msgs = ((InternalEObject)cM07).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM07, null, msgs);
			if (newCM07 != null)
				msgs = ((InternalEObject)newCM07).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM07, null, msgs);
			msgs = basicSetCM07(newCM07, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM07, newCM07, newCM07));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM08CONTENT getCM08() {
		return cM08;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM08(CM08CONTENT newCM08, NotificationChain msgs) {
		CM08CONTENT oldCM08 = cM08;
		cM08 = newCM08;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM08, oldCM08, newCM08);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM08(CM08CONTENT newCM08) {
		if (newCM08 != cM08) {
			NotificationChain msgs = null;
			if (cM08 != null)
				msgs = ((InternalEObject)cM08).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM08, null, msgs);
			if (newCM08 != null)
				msgs = ((InternalEObject)newCM08).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM08, null, msgs);
			msgs = basicSetCM08(newCM08, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM08, newCM08, newCM08));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM09CONTENT> getCM09() {
		if (cM09 == null) {
			cM09 = new EObjectContainmentEList<CM09CONTENT>(CM09CONTENT.class, this, V2xmlPackage.CM0CONTENT__CM09);
		}
		return cM09;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CM010CONTENT getCM010() {
		return cM010;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCM010(CM010CONTENT newCM010, NotificationChain msgs) {
		CM010CONTENT oldCM010 = cM010;
		cM010 = newCM010;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM010, oldCM010, newCM010);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCM010(CM010CONTENT newCM010) {
		if (newCM010 != cM010) {
			NotificationChain msgs = null;
			if (cM010 != null)
				msgs = ((InternalEObject)cM010).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM010, null, msgs);
			if (newCM010 != null)
				msgs = ((InternalEObject)newCM010).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CM0CONTENT__CM010, null, msgs);
			msgs = basicSetCM010(newCM010, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CM0CONTENT__CM010, newCM010, newCM010));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CM011CONTENT> getCM011() {
		if (cM011 == null) {
			cM011 = new EObjectContainmentEList<CM011CONTENT>(CM011CONTENT.class, this, V2xmlPackage.CM0CONTENT__CM011);
		}
		return cM011;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.CM0CONTENT__ANY);
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
			case V2xmlPackage.CM0CONTENT__CM01:
				return basicSetCM01(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM02:
				return basicSetCM02(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM03:
				return ((InternalEList<?>)getCM03()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CM0CONTENT__CM04:
				return basicSetCM04(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM05:
				return ((InternalEList<?>)getCM05()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CM0CONTENT__CM06:
				return basicSetCM06(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM07:
				return basicSetCM07(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM08:
				return basicSetCM08(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM09:
				return ((InternalEList<?>)getCM09()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CM0CONTENT__CM010:
				return basicSetCM010(null, msgs);
			case V2xmlPackage.CM0CONTENT__CM011:
				return ((InternalEList<?>)getCM011()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.CM0CONTENT__ANY:
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
			case V2xmlPackage.CM0CONTENT__CM01:
				return getCM01();
			case V2xmlPackage.CM0CONTENT__CM02:
				return getCM02();
			case V2xmlPackage.CM0CONTENT__CM03:
				return getCM03();
			case V2xmlPackage.CM0CONTENT__CM04:
				return getCM04();
			case V2xmlPackage.CM0CONTENT__CM05:
				return getCM05();
			case V2xmlPackage.CM0CONTENT__CM06:
				return getCM06();
			case V2xmlPackage.CM0CONTENT__CM07:
				return getCM07();
			case V2xmlPackage.CM0CONTENT__CM08:
				return getCM08();
			case V2xmlPackage.CM0CONTENT__CM09:
				return getCM09();
			case V2xmlPackage.CM0CONTENT__CM010:
				return getCM010();
			case V2xmlPackage.CM0CONTENT__CM011:
				return getCM011();
			case V2xmlPackage.CM0CONTENT__ANY:
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
			case V2xmlPackage.CM0CONTENT__CM01:
				setCM01((CM01CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM02:
				setCM02((CM02CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM03:
				getCM03().clear();
				getCM03().addAll((Collection<? extends CM03CONTENT>)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM04:
				setCM04((CM04CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM05:
				getCM05().clear();
				getCM05().addAll((Collection<? extends CM05CONTENT>)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM06:
				setCM06((CM06CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM07:
				setCM07((CM07CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM08:
				setCM08((CM08CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM09:
				getCM09().clear();
				getCM09().addAll((Collection<? extends CM09CONTENT>)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM010:
				setCM010((CM010CONTENT)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__CM011:
				getCM011().clear();
				getCM011().addAll((Collection<? extends CM011CONTENT>)newValue);
				return;
			case V2xmlPackage.CM0CONTENT__ANY:
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
			case V2xmlPackage.CM0CONTENT__CM01:
				setCM01((CM01CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM02:
				setCM02((CM02CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM03:
				getCM03().clear();
				return;
			case V2xmlPackage.CM0CONTENT__CM04:
				setCM04((CM04CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM05:
				getCM05().clear();
				return;
			case V2xmlPackage.CM0CONTENT__CM06:
				setCM06((CM06CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM07:
				setCM07((CM07CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM08:
				setCM08((CM08CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM09:
				getCM09().clear();
				return;
			case V2xmlPackage.CM0CONTENT__CM010:
				setCM010((CM010CONTENT)null);
				return;
			case V2xmlPackage.CM0CONTENT__CM011:
				getCM011().clear();
				return;
			case V2xmlPackage.CM0CONTENT__ANY:
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
			case V2xmlPackage.CM0CONTENT__CM01:
				return cM01 != null;
			case V2xmlPackage.CM0CONTENT__CM02:
				return cM02 != null;
			case V2xmlPackage.CM0CONTENT__CM03:
				return cM03 != null && !cM03.isEmpty();
			case V2xmlPackage.CM0CONTENT__CM04:
				return cM04 != null;
			case V2xmlPackage.CM0CONTENT__CM05:
				return cM05 != null && !cM05.isEmpty();
			case V2xmlPackage.CM0CONTENT__CM06:
				return cM06 != null;
			case V2xmlPackage.CM0CONTENT__CM07:
				return cM07 != null;
			case V2xmlPackage.CM0CONTENT__CM08:
				return cM08 != null;
			case V2xmlPackage.CM0CONTENT__CM09:
				return cM09 != null && !cM09.isEmpty();
			case V2xmlPackage.CM0CONTENT__CM010:
				return cM010 != null;
			case V2xmlPackage.CM0CONTENT__CM011:
				return cM011 != null && !cM011.isEmpty();
			case V2xmlPackage.CM0CONTENT__ANY:
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

} //CM0CONTENTImpl
