/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CE;
import org.hl7.v2xml.CE1CONTENT;
import org.hl7.v2xml.CE2CONTENT;
import org.hl7.v2xml.CE3CONTENT;
import org.hl7.v2xml.CE4CONTENT;
import org.hl7.v2xml.CE5CONTENT;
import org.hl7.v2xml.CE6CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE1 <em>CE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE2 <em>CE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE3 <em>CE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE4 <em>CE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE5 <em>CE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CEImpl#getCE6 <em>CE6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CEImpl extends EObjectImpl implements CE {
	/**
	 * The cached value of the '{@link #getCE1() <em>CE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE1()
	 * @generated
	 * @ordered
	 */
	protected CE1CONTENT cE1;

	/**
	 * The cached value of the '{@link #getCE2() <em>CE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE2()
	 * @generated
	 * @ordered
	 */
	protected CE2CONTENT cE2;

	/**
	 * The cached value of the '{@link #getCE3() <em>CE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE3()
	 * @generated
	 * @ordered
	 */
	protected CE3CONTENT cE3;

	/**
	 * The cached value of the '{@link #getCE4() <em>CE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE4()
	 * @generated
	 * @ordered
	 */
	protected CE4CONTENT cE4;

	/**
	 * The cached value of the '{@link #getCE5() <em>CE5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE5()
	 * @generated
	 * @ordered
	 */
	protected CE5CONTENT cE5;

	/**
	 * The cached value of the '{@link #getCE6() <em>CE6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCE6()
	 * @generated
	 * @ordered
	 */
	protected CE6CONTENT cE6;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCE();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE1CONTENT getCE1() {
		return cE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE1(CE1CONTENT newCE1, NotificationChain msgs) {
		CE1CONTENT oldCE1 = cE1;
		cE1 = newCE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE1, oldCE1, newCE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE1(CE1CONTENT newCE1) {
		if (newCE1 != cE1) {
			NotificationChain msgs = null;
			if (cE1 != null)
				msgs = ((InternalEObject)cE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE1, null, msgs);
			if (newCE1 != null)
				msgs = ((InternalEObject)newCE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE1, null, msgs);
			msgs = basicSetCE1(newCE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE1, newCE1, newCE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE2CONTENT getCE2() {
		return cE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE2(CE2CONTENT newCE2, NotificationChain msgs) {
		CE2CONTENT oldCE2 = cE2;
		cE2 = newCE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE2, oldCE2, newCE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE2(CE2CONTENT newCE2) {
		if (newCE2 != cE2) {
			NotificationChain msgs = null;
			if (cE2 != null)
				msgs = ((InternalEObject)cE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE2, null, msgs);
			if (newCE2 != null)
				msgs = ((InternalEObject)newCE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE2, null, msgs);
			msgs = basicSetCE2(newCE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE2, newCE2, newCE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE3CONTENT getCE3() {
		return cE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE3(CE3CONTENT newCE3, NotificationChain msgs) {
		CE3CONTENT oldCE3 = cE3;
		cE3 = newCE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE3, oldCE3, newCE3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE3(CE3CONTENT newCE3) {
		if (newCE3 != cE3) {
			NotificationChain msgs = null;
			if (cE3 != null)
				msgs = ((InternalEObject)cE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE3, null, msgs);
			if (newCE3 != null)
				msgs = ((InternalEObject)newCE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE3, null, msgs);
			msgs = basicSetCE3(newCE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE3, newCE3, newCE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE4CONTENT getCE4() {
		return cE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE4(CE4CONTENT newCE4, NotificationChain msgs) {
		CE4CONTENT oldCE4 = cE4;
		cE4 = newCE4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE4, oldCE4, newCE4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE4(CE4CONTENT newCE4) {
		if (newCE4 != cE4) {
			NotificationChain msgs = null;
			if (cE4 != null)
				msgs = ((InternalEObject)cE4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE4, null, msgs);
			if (newCE4 != null)
				msgs = ((InternalEObject)newCE4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE4, null, msgs);
			msgs = basicSetCE4(newCE4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE4, newCE4, newCE4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE5CONTENT getCE5() {
		return cE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE5(CE5CONTENT newCE5, NotificationChain msgs) {
		CE5CONTENT oldCE5 = cE5;
		cE5 = newCE5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE5, oldCE5, newCE5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE5(CE5CONTENT newCE5) {
		if (newCE5 != cE5) {
			NotificationChain msgs = null;
			if (cE5 != null)
				msgs = ((InternalEObject)cE5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE5, null, msgs);
			if (newCE5 != null)
				msgs = ((InternalEObject)newCE5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE5, null, msgs);
			msgs = basicSetCE5(newCE5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE5, newCE5, newCE5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE6CONTENT getCE6() {
		return cE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCE6(CE6CONTENT newCE6, NotificationChain msgs) {
		CE6CONTENT oldCE6 = cE6;
		cE6 = newCE6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE6, oldCE6, newCE6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCE6(CE6CONTENT newCE6) {
		if (newCE6 != cE6) {
			NotificationChain msgs = null;
			if (cE6 != null)
				msgs = ((InternalEObject)cE6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE6, null, msgs);
			if (newCE6 != null)
				msgs = ((InternalEObject)newCE6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CE__CE6, null, msgs);
			msgs = basicSetCE6(newCE6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CE__CE6, newCE6, newCE6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CE__CE1:
				return basicSetCE1(null, msgs);
			case V2xmlPackage.CE__CE2:
				return basicSetCE2(null, msgs);
			case V2xmlPackage.CE__CE3:
				return basicSetCE3(null, msgs);
			case V2xmlPackage.CE__CE4:
				return basicSetCE4(null, msgs);
			case V2xmlPackage.CE__CE5:
				return basicSetCE5(null, msgs);
			case V2xmlPackage.CE__CE6:
				return basicSetCE6(null, msgs);
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
			case V2xmlPackage.CE__CE1:
				return getCE1();
			case V2xmlPackage.CE__CE2:
				return getCE2();
			case V2xmlPackage.CE__CE3:
				return getCE3();
			case V2xmlPackage.CE__CE4:
				return getCE4();
			case V2xmlPackage.CE__CE5:
				return getCE5();
			case V2xmlPackage.CE__CE6:
				return getCE6();
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
			case V2xmlPackage.CE__CE1:
				setCE1((CE1CONTENT)newValue);
				return;
			case V2xmlPackage.CE__CE2:
				setCE2((CE2CONTENT)newValue);
				return;
			case V2xmlPackage.CE__CE3:
				setCE3((CE3CONTENT)newValue);
				return;
			case V2xmlPackage.CE__CE4:
				setCE4((CE4CONTENT)newValue);
				return;
			case V2xmlPackage.CE__CE5:
				setCE5((CE5CONTENT)newValue);
				return;
			case V2xmlPackage.CE__CE6:
				setCE6((CE6CONTENT)newValue);
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
			case V2xmlPackage.CE__CE1:
				setCE1((CE1CONTENT)null);
				return;
			case V2xmlPackage.CE__CE2:
				setCE2((CE2CONTENT)null);
				return;
			case V2xmlPackage.CE__CE3:
				setCE3((CE3CONTENT)null);
				return;
			case V2xmlPackage.CE__CE4:
				setCE4((CE4CONTENT)null);
				return;
			case V2xmlPackage.CE__CE5:
				setCE5((CE5CONTENT)null);
				return;
			case V2xmlPackage.CE__CE6:
				setCE6((CE6CONTENT)null);
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
			case V2xmlPackage.CE__CE1:
				return cE1 != null;
			case V2xmlPackage.CE__CE2:
				return cE2 != null;
			case V2xmlPackage.CE__CE3:
				return cE3 != null;
			case V2xmlPackage.CE__CE4:
				return cE4 != null;
			case V2xmlPackage.CE__CE5:
				return cE5 != null;
			case V2xmlPackage.CE__CE6:
				return cE6 != null;
		}
		return super.eIsSet(featureID);
	}

} //CEImpl
