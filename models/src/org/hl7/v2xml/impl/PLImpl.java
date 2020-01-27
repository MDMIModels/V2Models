/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.PL;
import org.hl7.v2xml.PL10CONTENT;
import org.hl7.v2xml.PL11CONTENT;
import org.hl7.v2xml.PL1CONTENT;
import org.hl7.v2xml.PL2CONTENT;
import org.hl7.v2xml.PL3CONTENT;
import org.hl7.v2xml.PL4CONTENT;
import org.hl7.v2xml.PL5CONTENT;
import org.hl7.v2xml.PL6CONTENT;
import org.hl7.v2xml.PL7CONTENT;
import org.hl7.v2xml.PL8CONTENT;
import org.hl7.v2xml.PL9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL1 <em>PL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL2 <em>PL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL3 <em>PL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL4 <em>PL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL5 <em>PL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL6 <em>PL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL7 <em>PL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL8 <em>PL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL9 <em>PL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL10 <em>PL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PLImpl#getPL11 <em>PL11</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PLImpl extends EObjectImpl implements PL {
	/**
	 * The cached value of the '{@link #getPL1() <em>PL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL1()
	 * @generated
	 * @ordered
	 */
	protected PL1CONTENT pL1;

	/**
	 * The cached value of the '{@link #getPL2() <em>PL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL2()
	 * @generated
	 * @ordered
	 */
	protected PL2CONTENT pL2;

	/**
	 * The cached value of the '{@link #getPL3() <em>PL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL3()
	 * @generated
	 * @ordered
	 */
	protected PL3CONTENT pL3;

	/**
	 * The cached value of the '{@link #getPL4() <em>PL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL4()
	 * @generated
	 * @ordered
	 */
	protected PL4CONTENT pL4;

	/**
	 * The cached value of the '{@link #getPL5() <em>PL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL5()
	 * @generated
	 * @ordered
	 */
	protected PL5CONTENT pL5;

	/**
	 * The cached value of the '{@link #getPL6() <em>PL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL6()
	 * @generated
	 * @ordered
	 */
	protected PL6CONTENT pL6;

	/**
	 * The cached value of the '{@link #getPL7() <em>PL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL7()
	 * @generated
	 * @ordered
	 */
	protected PL7CONTENT pL7;

	/**
	 * The cached value of the '{@link #getPL8() <em>PL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL8()
	 * @generated
	 * @ordered
	 */
	protected PL8CONTENT pL8;

	/**
	 * The cached value of the '{@link #getPL9() <em>PL9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL9()
	 * @generated
	 * @ordered
	 */
	protected PL9CONTENT pL9;

	/**
	 * The cached value of the '{@link #getPL10() <em>PL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL10()
	 * @generated
	 * @ordered
	 */
	protected PL10CONTENT pL10;

	/**
	 * The cached value of the '{@link #getPL11() <em>PL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPL11()
	 * @generated
	 * @ordered
	 */
	protected PL11CONTENT pL11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL1CONTENT getPL1() {
		return pL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL1(PL1CONTENT newPL1, NotificationChain msgs) {
		PL1CONTENT oldPL1 = pL1;
		pL1 = newPL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL1, oldPL1, newPL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL1(PL1CONTENT newPL1) {
		if (newPL1 != pL1) {
			NotificationChain msgs = null;
			if (pL1 != null)
				msgs = ((InternalEObject)pL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL1, null, msgs);
			if (newPL1 != null)
				msgs = ((InternalEObject)newPL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL1, null, msgs);
			msgs = basicSetPL1(newPL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL1, newPL1, newPL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL2CONTENT getPL2() {
		return pL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL2(PL2CONTENT newPL2, NotificationChain msgs) {
		PL2CONTENT oldPL2 = pL2;
		pL2 = newPL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL2, oldPL2, newPL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL2(PL2CONTENT newPL2) {
		if (newPL2 != pL2) {
			NotificationChain msgs = null;
			if (pL2 != null)
				msgs = ((InternalEObject)pL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL2, null, msgs);
			if (newPL2 != null)
				msgs = ((InternalEObject)newPL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL2, null, msgs);
			msgs = basicSetPL2(newPL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL2, newPL2, newPL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL3CONTENT getPL3() {
		return pL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL3(PL3CONTENT newPL3, NotificationChain msgs) {
		PL3CONTENT oldPL3 = pL3;
		pL3 = newPL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL3, oldPL3, newPL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL3(PL3CONTENT newPL3) {
		if (newPL3 != pL3) {
			NotificationChain msgs = null;
			if (pL3 != null)
				msgs = ((InternalEObject)pL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL3, null, msgs);
			if (newPL3 != null)
				msgs = ((InternalEObject)newPL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL3, null, msgs);
			msgs = basicSetPL3(newPL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL3, newPL3, newPL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL4CONTENT getPL4() {
		return pL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL4(PL4CONTENT newPL4, NotificationChain msgs) {
		PL4CONTENT oldPL4 = pL4;
		pL4 = newPL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL4, oldPL4, newPL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL4(PL4CONTENT newPL4) {
		if (newPL4 != pL4) {
			NotificationChain msgs = null;
			if (pL4 != null)
				msgs = ((InternalEObject)pL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL4, null, msgs);
			if (newPL4 != null)
				msgs = ((InternalEObject)newPL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL4, null, msgs);
			msgs = basicSetPL4(newPL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL4, newPL4, newPL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL5CONTENT getPL5() {
		return pL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL5(PL5CONTENT newPL5, NotificationChain msgs) {
		PL5CONTENT oldPL5 = pL5;
		pL5 = newPL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL5, oldPL5, newPL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL5(PL5CONTENT newPL5) {
		if (newPL5 != pL5) {
			NotificationChain msgs = null;
			if (pL5 != null)
				msgs = ((InternalEObject)pL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL5, null, msgs);
			if (newPL5 != null)
				msgs = ((InternalEObject)newPL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL5, null, msgs);
			msgs = basicSetPL5(newPL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL5, newPL5, newPL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL6CONTENT getPL6() {
		return pL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL6(PL6CONTENT newPL6, NotificationChain msgs) {
		PL6CONTENT oldPL6 = pL6;
		pL6 = newPL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL6, oldPL6, newPL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL6(PL6CONTENT newPL6) {
		if (newPL6 != pL6) {
			NotificationChain msgs = null;
			if (pL6 != null)
				msgs = ((InternalEObject)pL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL6, null, msgs);
			if (newPL6 != null)
				msgs = ((InternalEObject)newPL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL6, null, msgs);
			msgs = basicSetPL6(newPL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL6, newPL6, newPL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL7CONTENT getPL7() {
		return pL7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL7(PL7CONTENT newPL7, NotificationChain msgs) {
		PL7CONTENT oldPL7 = pL7;
		pL7 = newPL7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL7, oldPL7, newPL7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL7(PL7CONTENT newPL7) {
		if (newPL7 != pL7) {
			NotificationChain msgs = null;
			if (pL7 != null)
				msgs = ((InternalEObject)pL7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL7, null, msgs);
			if (newPL7 != null)
				msgs = ((InternalEObject)newPL7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL7, null, msgs);
			msgs = basicSetPL7(newPL7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL7, newPL7, newPL7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL8CONTENT getPL8() {
		return pL8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL8(PL8CONTENT newPL8, NotificationChain msgs) {
		PL8CONTENT oldPL8 = pL8;
		pL8 = newPL8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL8, oldPL8, newPL8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL8(PL8CONTENT newPL8) {
		if (newPL8 != pL8) {
			NotificationChain msgs = null;
			if (pL8 != null)
				msgs = ((InternalEObject)pL8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL8, null, msgs);
			if (newPL8 != null)
				msgs = ((InternalEObject)newPL8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL8, null, msgs);
			msgs = basicSetPL8(newPL8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL8, newPL8, newPL8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL9CONTENT getPL9() {
		return pL9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL9(PL9CONTENT newPL9, NotificationChain msgs) {
		PL9CONTENT oldPL9 = pL9;
		pL9 = newPL9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL9, oldPL9, newPL9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL9(PL9CONTENT newPL9) {
		if (newPL9 != pL9) {
			NotificationChain msgs = null;
			if (pL9 != null)
				msgs = ((InternalEObject)pL9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL9, null, msgs);
			if (newPL9 != null)
				msgs = ((InternalEObject)newPL9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL9, null, msgs);
			msgs = basicSetPL9(newPL9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL9, newPL9, newPL9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL10CONTENT getPL10() {
		return pL10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL10(PL10CONTENT newPL10, NotificationChain msgs) {
		PL10CONTENT oldPL10 = pL10;
		pL10 = newPL10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL10, oldPL10, newPL10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL10(PL10CONTENT newPL10) {
		if (newPL10 != pL10) {
			NotificationChain msgs = null;
			if (pL10 != null)
				msgs = ((InternalEObject)pL10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL10, null, msgs);
			if (newPL10 != null)
				msgs = ((InternalEObject)newPL10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL10, null, msgs);
			msgs = basicSetPL10(newPL10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL10, newPL10, newPL10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PL11CONTENT getPL11() {
		return pL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPL11(PL11CONTENT newPL11, NotificationChain msgs) {
		PL11CONTENT oldPL11 = pL11;
		pL11 = newPL11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL11, oldPL11, newPL11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPL11(PL11CONTENT newPL11) {
		if (newPL11 != pL11) {
			NotificationChain msgs = null;
			if (pL11 != null)
				msgs = ((InternalEObject)pL11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL11, null, msgs);
			if (newPL11 != null)
				msgs = ((InternalEObject)newPL11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PL__PL11, null, msgs);
			msgs = basicSetPL11(newPL11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PL__PL11, newPL11, newPL11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.PL__PL1:
				return basicSetPL1(null, msgs);
			case V2xmlPackage.PL__PL2:
				return basicSetPL2(null, msgs);
			case V2xmlPackage.PL__PL3:
				return basicSetPL3(null, msgs);
			case V2xmlPackage.PL__PL4:
				return basicSetPL4(null, msgs);
			case V2xmlPackage.PL__PL5:
				return basicSetPL5(null, msgs);
			case V2xmlPackage.PL__PL6:
				return basicSetPL6(null, msgs);
			case V2xmlPackage.PL__PL7:
				return basicSetPL7(null, msgs);
			case V2xmlPackage.PL__PL8:
				return basicSetPL8(null, msgs);
			case V2xmlPackage.PL__PL9:
				return basicSetPL9(null, msgs);
			case V2xmlPackage.PL__PL10:
				return basicSetPL10(null, msgs);
			case V2xmlPackage.PL__PL11:
				return basicSetPL11(null, msgs);
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
			case V2xmlPackage.PL__PL1:
				return getPL1();
			case V2xmlPackage.PL__PL2:
				return getPL2();
			case V2xmlPackage.PL__PL3:
				return getPL3();
			case V2xmlPackage.PL__PL4:
				return getPL4();
			case V2xmlPackage.PL__PL5:
				return getPL5();
			case V2xmlPackage.PL__PL6:
				return getPL6();
			case V2xmlPackage.PL__PL7:
				return getPL7();
			case V2xmlPackage.PL__PL8:
				return getPL8();
			case V2xmlPackage.PL__PL9:
				return getPL9();
			case V2xmlPackage.PL__PL10:
				return getPL10();
			case V2xmlPackage.PL__PL11:
				return getPL11();
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
			case V2xmlPackage.PL__PL1:
				setPL1((PL1CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL2:
				setPL2((PL2CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL3:
				setPL3((PL3CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL4:
				setPL4((PL4CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL5:
				setPL5((PL5CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL6:
				setPL6((PL6CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL7:
				setPL7((PL7CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL8:
				setPL8((PL8CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL9:
				setPL9((PL9CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL10:
				setPL10((PL10CONTENT)newValue);
				return;
			case V2xmlPackage.PL__PL11:
				setPL11((PL11CONTENT)newValue);
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
			case V2xmlPackage.PL__PL1:
				setPL1((PL1CONTENT)null);
				return;
			case V2xmlPackage.PL__PL2:
				setPL2((PL2CONTENT)null);
				return;
			case V2xmlPackage.PL__PL3:
				setPL3((PL3CONTENT)null);
				return;
			case V2xmlPackage.PL__PL4:
				setPL4((PL4CONTENT)null);
				return;
			case V2xmlPackage.PL__PL5:
				setPL5((PL5CONTENT)null);
				return;
			case V2xmlPackage.PL__PL6:
				setPL6((PL6CONTENT)null);
				return;
			case V2xmlPackage.PL__PL7:
				setPL7((PL7CONTENT)null);
				return;
			case V2xmlPackage.PL__PL8:
				setPL8((PL8CONTENT)null);
				return;
			case V2xmlPackage.PL__PL9:
				setPL9((PL9CONTENT)null);
				return;
			case V2xmlPackage.PL__PL10:
				setPL10((PL10CONTENT)null);
				return;
			case V2xmlPackage.PL__PL11:
				setPL11((PL11CONTENT)null);
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
			case V2xmlPackage.PL__PL1:
				return pL1 != null;
			case V2xmlPackage.PL__PL2:
				return pL2 != null;
			case V2xmlPackage.PL__PL3:
				return pL3 != null;
			case V2xmlPackage.PL__PL4:
				return pL4 != null;
			case V2xmlPackage.PL__PL5:
				return pL5 != null;
			case V2xmlPackage.PL__PL6:
				return pL6 != null;
			case V2xmlPackage.PL__PL7:
				return pL7 != null;
			case V2xmlPackage.PL__PL8:
				return pL8 != null;
			case V2xmlPackage.PL__PL9:
				return pL9 != null;
			case V2xmlPackage.PL__PL10:
				return pL10 != null;
			case V2xmlPackage.PL__PL11:
				return pL11 != null;
		}
		return super.eIsSet(featureID);
	}

} //PLImpl
