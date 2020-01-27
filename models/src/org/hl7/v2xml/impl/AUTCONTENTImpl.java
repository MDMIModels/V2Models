/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.AUT10CONTENT;
import org.hl7.v2xml.AUT1CONTENT;
import org.hl7.v2xml.AUT2CONTENT;
import org.hl7.v2xml.AUT3CONTENT;
import org.hl7.v2xml.AUT4CONTENT;
import org.hl7.v2xml.AUT5CONTENT;
import org.hl7.v2xml.AUT6CONTENT;
import org.hl7.v2xml.AUT7CONTENT;
import org.hl7.v2xml.AUT8CONTENT;
import org.hl7.v2xml.AUT9CONTENT;
import org.hl7.v2xml.AUTCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AUTCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT1 <em>AUT1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT2 <em>AUT2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT3 <em>AUT3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT4 <em>AUT4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT5 <em>AUT5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT6 <em>AUT6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT7 <em>AUT7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT8 <em>AUT8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT9 <em>AUT9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAUT10 <em>AUT10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AUTCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AUTCONTENTImpl extends EObjectImpl implements AUTCONTENT {
	/**
	 * The cached value of the '{@link #getAUT1() <em>AUT1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT1()
	 * @generated
	 * @ordered
	 */
	protected AUT1CONTENT aUT1;

	/**
	 * The cached value of the '{@link #getAUT2() <em>AUT2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT2()
	 * @generated
	 * @ordered
	 */
	protected AUT2CONTENT aUT2;

	/**
	 * The cached value of the '{@link #getAUT3() <em>AUT3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT3()
	 * @generated
	 * @ordered
	 */
	protected AUT3CONTENT aUT3;

	/**
	 * The cached value of the '{@link #getAUT4() <em>AUT4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT4()
	 * @generated
	 * @ordered
	 */
	protected AUT4CONTENT aUT4;

	/**
	 * The cached value of the '{@link #getAUT5() <em>AUT5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT5()
	 * @generated
	 * @ordered
	 */
	protected AUT5CONTENT aUT5;

	/**
	 * The cached value of the '{@link #getAUT6() <em>AUT6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT6()
	 * @generated
	 * @ordered
	 */
	protected AUT6CONTENT aUT6;

	/**
	 * The cached value of the '{@link #getAUT7() <em>AUT7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT7()
	 * @generated
	 * @ordered
	 */
	protected AUT7CONTENT aUT7;

	/**
	 * The cached value of the '{@link #getAUT8() <em>AUT8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT8()
	 * @generated
	 * @ordered
	 */
	protected AUT8CONTENT aUT8;

	/**
	 * The cached value of the '{@link #getAUT9() <em>AUT9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT9()
	 * @generated
	 * @ordered
	 */
	protected AUT9CONTENT aUT9;

	/**
	 * The cached value of the '{@link #getAUT10() <em>AUT10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUT10()
	 * @generated
	 * @ordered
	 */
	protected AUT10CONTENT aUT10;

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
	protected AUTCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAUTCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT1CONTENT getAUT1() {
		return aUT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT1(AUT1CONTENT newAUT1, NotificationChain msgs) {
		AUT1CONTENT oldAUT1 = aUT1;
		aUT1 = newAUT1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT1, oldAUT1, newAUT1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT1(AUT1CONTENT newAUT1) {
		if (newAUT1 != aUT1) {
			NotificationChain msgs = null;
			if (aUT1 != null)
				msgs = ((InternalEObject)aUT1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT1, null, msgs);
			if (newAUT1 != null)
				msgs = ((InternalEObject)newAUT1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT1, null, msgs);
			msgs = basicSetAUT1(newAUT1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT1, newAUT1, newAUT1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT2CONTENT getAUT2() {
		return aUT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT2(AUT2CONTENT newAUT2, NotificationChain msgs) {
		AUT2CONTENT oldAUT2 = aUT2;
		aUT2 = newAUT2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT2, oldAUT2, newAUT2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT2(AUT2CONTENT newAUT2) {
		if (newAUT2 != aUT2) {
			NotificationChain msgs = null;
			if (aUT2 != null)
				msgs = ((InternalEObject)aUT2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT2, null, msgs);
			if (newAUT2 != null)
				msgs = ((InternalEObject)newAUT2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT2, null, msgs);
			msgs = basicSetAUT2(newAUT2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT2, newAUT2, newAUT2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT3CONTENT getAUT3() {
		return aUT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT3(AUT3CONTENT newAUT3, NotificationChain msgs) {
		AUT3CONTENT oldAUT3 = aUT3;
		aUT3 = newAUT3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT3, oldAUT3, newAUT3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT3(AUT3CONTENT newAUT3) {
		if (newAUT3 != aUT3) {
			NotificationChain msgs = null;
			if (aUT3 != null)
				msgs = ((InternalEObject)aUT3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT3, null, msgs);
			if (newAUT3 != null)
				msgs = ((InternalEObject)newAUT3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT3, null, msgs);
			msgs = basicSetAUT3(newAUT3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT3, newAUT3, newAUT3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT4CONTENT getAUT4() {
		return aUT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT4(AUT4CONTENT newAUT4, NotificationChain msgs) {
		AUT4CONTENT oldAUT4 = aUT4;
		aUT4 = newAUT4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT4, oldAUT4, newAUT4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT4(AUT4CONTENT newAUT4) {
		if (newAUT4 != aUT4) {
			NotificationChain msgs = null;
			if (aUT4 != null)
				msgs = ((InternalEObject)aUT4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT4, null, msgs);
			if (newAUT4 != null)
				msgs = ((InternalEObject)newAUT4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT4, null, msgs);
			msgs = basicSetAUT4(newAUT4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT4, newAUT4, newAUT4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT5CONTENT getAUT5() {
		return aUT5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT5(AUT5CONTENT newAUT5, NotificationChain msgs) {
		AUT5CONTENT oldAUT5 = aUT5;
		aUT5 = newAUT5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT5, oldAUT5, newAUT5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT5(AUT5CONTENT newAUT5) {
		if (newAUT5 != aUT5) {
			NotificationChain msgs = null;
			if (aUT5 != null)
				msgs = ((InternalEObject)aUT5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT5, null, msgs);
			if (newAUT5 != null)
				msgs = ((InternalEObject)newAUT5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT5, null, msgs);
			msgs = basicSetAUT5(newAUT5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT5, newAUT5, newAUT5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT6CONTENT getAUT6() {
		return aUT6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT6(AUT6CONTENT newAUT6, NotificationChain msgs) {
		AUT6CONTENT oldAUT6 = aUT6;
		aUT6 = newAUT6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT6, oldAUT6, newAUT6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT6(AUT6CONTENT newAUT6) {
		if (newAUT6 != aUT6) {
			NotificationChain msgs = null;
			if (aUT6 != null)
				msgs = ((InternalEObject)aUT6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT6, null, msgs);
			if (newAUT6 != null)
				msgs = ((InternalEObject)newAUT6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT6, null, msgs);
			msgs = basicSetAUT6(newAUT6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT6, newAUT6, newAUT6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT7CONTENT getAUT7() {
		return aUT7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT7(AUT7CONTENT newAUT7, NotificationChain msgs) {
		AUT7CONTENT oldAUT7 = aUT7;
		aUT7 = newAUT7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT7, oldAUT7, newAUT7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT7(AUT7CONTENT newAUT7) {
		if (newAUT7 != aUT7) {
			NotificationChain msgs = null;
			if (aUT7 != null)
				msgs = ((InternalEObject)aUT7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT7, null, msgs);
			if (newAUT7 != null)
				msgs = ((InternalEObject)newAUT7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT7, null, msgs);
			msgs = basicSetAUT7(newAUT7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT7, newAUT7, newAUT7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT8CONTENT getAUT8() {
		return aUT8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT8(AUT8CONTENT newAUT8, NotificationChain msgs) {
		AUT8CONTENT oldAUT8 = aUT8;
		aUT8 = newAUT8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT8, oldAUT8, newAUT8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT8(AUT8CONTENT newAUT8) {
		if (newAUT8 != aUT8) {
			NotificationChain msgs = null;
			if (aUT8 != null)
				msgs = ((InternalEObject)aUT8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT8, null, msgs);
			if (newAUT8 != null)
				msgs = ((InternalEObject)newAUT8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT8, null, msgs);
			msgs = basicSetAUT8(newAUT8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT8, newAUT8, newAUT8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT9CONTENT getAUT9() {
		return aUT9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT9(AUT9CONTENT newAUT9, NotificationChain msgs) {
		AUT9CONTENT oldAUT9 = aUT9;
		aUT9 = newAUT9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT9, oldAUT9, newAUT9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT9(AUT9CONTENT newAUT9) {
		if (newAUT9 != aUT9) {
			NotificationChain msgs = null;
			if (aUT9 != null)
				msgs = ((InternalEObject)aUT9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT9, null, msgs);
			if (newAUT9 != null)
				msgs = ((InternalEObject)newAUT9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT9, null, msgs);
			msgs = basicSetAUT9(newAUT9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT9, newAUT9, newAUT9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AUT10CONTENT getAUT10() {
		return aUT10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAUT10(AUT10CONTENT newAUT10, NotificationChain msgs) {
		AUT10CONTENT oldAUT10 = aUT10;
		aUT10 = newAUT10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT10, oldAUT10, newAUT10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUT10(AUT10CONTENT newAUT10) {
		if (newAUT10 != aUT10) {
			NotificationChain msgs = null;
			if (aUT10 != null)
				msgs = ((InternalEObject)aUT10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT10, null, msgs);
			if (newAUT10 != null)
				msgs = ((InternalEObject)newAUT10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AUTCONTENT__AUT10, null, msgs);
			msgs = basicSetAUT10(newAUT10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AUTCONTENT__AUT10, newAUT10, newAUT10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AUTCONTENT__ANY);
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
			case V2xmlPackage.AUTCONTENT__AUT1:
				return basicSetAUT1(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT2:
				return basicSetAUT2(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT3:
				return basicSetAUT3(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT4:
				return basicSetAUT4(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT5:
				return basicSetAUT5(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT6:
				return basicSetAUT6(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT7:
				return basicSetAUT7(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT8:
				return basicSetAUT8(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT9:
				return basicSetAUT9(null, msgs);
			case V2xmlPackage.AUTCONTENT__AUT10:
				return basicSetAUT10(null, msgs);
			case V2xmlPackage.AUTCONTENT__ANY:
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
			case V2xmlPackage.AUTCONTENT__AUT1:
				return getAUT1();
			case V2xmlPackage.AUTCONTENT__AUT2:
				return getAUT2();
			case V2xmlPackage.AUTCONTENT__AUT3:
				return getAUT3();
			case V2xmlPackage.AUTCONTENT__AUT4:
				return getAUT4();
			case V2xmlPackage.AUTCONTENT__AUT5:
				return getAUT5();
			case V2xmlPackage.AUTCONTENT__AUT6:
				return getAUT6();
			case V2xmlPackage.AUTCONTENT__AUT7:
				return getAUT7();
			case V2xmlPackage.AUTCONTENT__AUT8:
				return getAUT8();
			case V2xmlPackage.AUTCONTENT__AUT9:
				return getAUT9();
			case V2xmlPackage.AUTCONTENT__AUT10:
				return getAUT10();
			case V2xmlPackage.AUTCONTENT__ANY:
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.AUTCONTENT__AUT1:
				setAUT1((AUT1CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT2:
				setAUT2((AUT2CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT3:
				setAUT3((AUT3CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT4:
				setAUT4((AUT4CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT5:
				setAUT5((AUT5CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT6:
				setAUT6((AUT6CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT7:
				setAUT7((AUT7CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT8:
				setAUT8((AUT8CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT9:
				setAUT9((AUT9CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__AUT10:
				setAUT10((AUT10CONTENT)newValue);
				return;
			case V2xmlPackage.AUTCONTENT__ANY:
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
			case V2xmlPackage.AUTCONTENT__AUT1:
				setAUT1((AUT1CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT2:
				setAUT2((AUT2CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT3:
				setAUT3((AUT3CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT4:
				setAUT4((AUT4CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT5:
				setAUT5((AUT5CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT6:
				setAUT6((AUT6CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT7:
				setAUT7((AUT7CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT8:
				setAUT8((AUT8CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT9:
				setAUT9((AUT9CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__AUT10:
				setAUT10((AUT10CONTENT)null);
				return;
			case V2xmlPackage.AUTCONTENT__ANY:
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
			case V2xmlPackage.AUTCONTENT__AUT1:
				return aUT1 != null;
			case V2xmlPackage.AUTCONTENT__AUT2:
				return aUT2 != null;
			case V2xmlPackage.AUTCONTENT__AUT3:
				return aUT3 != null;
			case V2xmlPackage.AUTCONTENT__AUT4:
				return aUT4 != null;
			case V2xmlPackage.AUTCONTENT__AUT5:
				return aUT5 != null;
			case V2xmlPackage.AUTCONTENT__AUT6:
				return aUT6 != null;
			case V2xmlPackage.AUTCONTENT__AUT7:
				return aUT7 != null;
			case V2xmlPackage.AUTCONTENT__AUT8:
				return aUT8 != null;
			case V2xmlPackage.AUTCONTENT__AUT9:
				return aUT9 != null;
			case V2xmlPackage.AUTCONTENT__AUT10:
				return aUT10 != null;
			case V2xmlPackage.AUTCONTENT__ANY:
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

} //AUTCONTENTImpl
