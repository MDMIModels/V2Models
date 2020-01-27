/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CD;
import org.hl7.v2xml.CD1CONTENT;
import org.hl7.v2xml.CD2CONTENT;
import org.hl7.v2xml.CD3CONTENT;
import org.hl7.v2xml.CD4CONTENT;
import org.hl7.v2xml.CD5CONTENT;
import org.hl7.v2xml.CD6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD1 <em>CD1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD2 <em>CD2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD3 <em>CD3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD4 <em>CD4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD5 <em>CD5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CDImpl#getCD6 <em>CD6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDImpl extends EObjectImpl implements CD {
	/**
	 * The cached value of the '{@link #getCD1() <em>CD1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD1()
	 * @generated
	 * @ordered
	 */
	protected CD1CONTENT cD1;

	/**
	 * The cached value of the '{@link #getCD2() <em>CD2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD2()
	 * @generated
	 * @ordered
	 */
	protected CD2CONTENT cD2;

	/**
	 * The cached value of the '{@link #getCD3() <em>CD3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD3()
	 * @generated
	 * @ordered
	 */
	protected CD3CONTENT cD3;

	/**
	 * The cached value of the '{@link #getCD4() <em>CD4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD4()
	 * @generated
	 * @ordered
	 */
	protected CD4CONTENT cD4;

	/**
	 * The cached value of the '{@link #getCD5() <em>CD5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD5()
	 * @generated
	 * @ordered
	 */
	protected CD5CONTENT cD5;

	/**
	 * The cached value of the '{@link #getCD6() <em>CD6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCD6()
	 * @generated
	 * @ordered
	 */
	protected CD6CONTENT cD6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD1CONTENT getCD1() {
		return cD1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD1(CD1CONTENT newCD1, NotificationChain msgs) {
		CD1CONTENT oldCD1 = cD1;
		cD1 = newCD1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD1, oldCD1, newCD1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD1(CD1CONTENT newCD1) {
		if (newCD1 != cD1) {
			NotificationChain msgs = null;
			if (cD1 != null)
				msgs = ((InternalEObject)cD1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD1, null, msgs);
			if (newCD1 != null)
				msgs = ((InternalEObject)newCD1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD1, null, msgs);
			msgs = basicSetCD1(newCD1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD1, newCD1, newCD1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD2CONTENT getCD2() {
		return cD2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD2(CD2CONTENT newCD2, NotificationChain msgs) {
		CD2CONTENT oldCD2 = cD2;
		cD2 = newCD2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD2, oldCD2, newCD2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD2(CD2CONTENT newCD2) {
		if (newCD2 != cD2) {
			NotificationChain msgs = null;
			if (cD2 != null)
				msgs = ((InternalEObject)cD2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD2, null, msgs);
			if (newCD2 != null)
				msgs = ((InternalEObject)newCD2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD2, null, msgs);
			msgs = basicSetCD2(newCD2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD2, newCD2, newCD2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD3CONTENT getCD3() {
		return cD3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD3(CD3CONTENT newCD3, NotificationChain msgs) {
		CD3CONTENT oldCD3 = cD3;
		cD3 = newCD3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD3, oldCD3, newCD3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD3(CD3CONTENT newCD3) {
		if (newCD3 != cD3) {
			NotificationChain msgs = null;
			if (cD3 != null)
				msgs = ((InternalEObject)cD3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD3, null, msgs);
			if (newCD3 != null)
				msgs = ((InternalEObject)newCD3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD3, null, msgs);
			msgs = basicSetCD3(newCD3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD3, newCD3, newCD3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD4CONTENT getCD4() {
		return cD4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD4(CD4CONTENT newCD4, NotificationChain msgs) {
		CD4CONTENT oldCD4 = cD4;
		cD4 = newCD4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD4, oldCD4, newCD4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD4(CD4CONTENT newCD4) {
		if (newCD4 != cD4) {
			NotificationChain msgs = null;
			if (cD4 != null)
				msgs = ((InternalEObject)cD4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD4, null, msgs);
			if (newCD4 != null)
				msgs = ((InternalEObject)newCD4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD4, null, msgs);
			msgs = basicSetCD4(newCD4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD4, newCD4, newCD4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD5CONTENT getCD5() {
		return cD5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD5(CD5CONTENT newCD5, NotificationChain msgs) {
		CD5CONTENT oldCD5 = cD5;
		cD5 = newCD5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD5, oldCD5, newCD5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD5(CD5CONTENT newCD5) {
		if (newCD5 != cD5) {
			NotificationChain msgs = null;
			if (cD5 != null)
				msgs = ((InternalEObject)cD5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD5, null, msgs);
			if (newCD5 != null)
				msgs = ((InternalEObject)newCD5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD5, null, msgs);
			msgs = basicSetCD5(newCD5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD5, newCD5, newCD5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD6CONTENT getCD6() {
		return cD6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCD6(CD6CONTENT newCD6, NotificationChain msgs) {
		CD6CONTENT oldCD6 = cD6;
		cD6 = newCD6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD6, oldCD6, newCD6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCD6(CD6CONTENT newCD6) {
		if (newCD6 != cD6) {
			NotificationChain msgs = null;
			if (cD6 != null)
				msgs = ((InternalEObject)cD6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD6, null, msgs);
			if (newCD6 != null)
				msgs = ((InternalEObject)newCD6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CD__CD6, null, msgs);
			msgs = basicSetCD6(newCD6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CD__CD6, newCD6, newCD6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CD__CD1:
				return basicSetCD1(null, msgs);
			case V2xmlPackage.CD__CD2:
				return basicSetCD2(null, msgs);
			case V2xmlPackage.CD__CD3:
				return basicSetCD3(null, msgs);
			case V2xmlPackage.CD__CD4:
				return basicSetCD4(null, msgs);
			case V2xmlPackage.CD__CD5:
				return basicSetCD5(null, msgs);
			case V2xmlPackage.CD__CD6:
				return basicSetCD6(null, msgs);
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
			case V2xmlPackage.CD__CD1:
				return getCD1();
			case V2xmlPackage.CD__CD2:
				return getCD2();
			case V2xmlPackage.CD__CD3:
				return getCD3();
			case V2xmlPackage.CD__CD4:
				return getCD4();
			case V2xmlPackage.CD__CD5:
				return getCD5();
			case V2xmlPackage.CD__CD6:
				return getCD6();
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
			case V2xmlPackage.CD__CD1:
				setCD1((CD1CONTENT)newValue);
				return;
			case V2xmlPackage.CD__CD2:
				setCD2((CD2CONTENT)newValue);
				return;
			case V2xmlPackage.CD__CD3:
				setCD3((CD3CONTENT)newValue);
				return;
			case V2xmlPackage.CD__CD4:
				setCD4((CD4CONTENT)newValue);
				return;
			case V2xmlPackage.CD__CD5:
				setCD5((CD5CONTENT)newValue);
				return;
			case V2xmlPackage.CD__CD6:
				setCD6((CD6CONTENT)newValue);
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
			case V2xmlPackage.CD__CD1:
				setCD1((CD1CONTENT)null);
				return;
			case V2xmlPackage.CD__CD2:
				setCD2((CD2CONTENT)null);
				return;
			case V2xmlPackage.CD__CD3:
				setCD3((CD3CONTENT)null);
				return;
			case V2xmlPackage.CD__CD4:
				setCD4((CD4CONTENT)null);
				return;
			case V2xmlPackage.CD__CD5:
				setCD5((CD5CONTENT)null);
				return;
			case V2xmlPackage.CD__CD6:
				setCD6((CD6CONTENT)null);
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
			case V2xmlPackage.CD__CD1:
				return cD1 != null;
			case V2xmlPackage.CD__CD2:
				return cD2 != null;
			case V2xmlPackage.CD__CD3:
				return cD3 != null;
			case V2xmlPackage.CD__CD4:
				return cD4 != null;
			case V2xmlPackage.CD__CD5:
				return cD5 != null;
			case V2xmlPackage.CD__CD6:
				return cD6 != null;
		}
		return super.eIsSet(featureID);
	}

} //CDImpl
