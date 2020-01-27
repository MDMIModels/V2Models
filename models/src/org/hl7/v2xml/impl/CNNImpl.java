/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.CNN;
import org.hl7.v2xml.CNN10CONTENT;
import org.hl7.v2xml.CNN11CONTENT;
import org.hl7.v2xml.CNN1CONTENT;
import org.hl7.v2xml.CNN2CONTENT;
import org.hl7.v2xml.CNN3CONTENT;
import org.hl7.v2xml.CNN4CONTENT;
import org.hl7.v2xml.CNN5CONTENT;
import org.hl7.v2xml.CNN6CONTENT;
import org.hl7.v2xml.CNN7CONTENT;
import org.hl7.v2xml.CNN8CONTENT;
import org.hl7.v2xml.CNN9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CNN</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN1 <em>CNN1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN2 <em>CNN2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN3 <em>CNN3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN4 <em>CNN4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN5 <em>CNN5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN6 <em>CNN6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN7 <em>CNN7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN8 <em>CNN8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN9 <em>CNN9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN10 <em>CNN10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.CNNImpl#getCNN11 <em>CNN11</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CNNImpl extends EObjectImpl implements CNN {
	/**
	 * The cached value of the '{@link #getCNN1() <em>CNN1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN1()
	 * @generated
	 * @ordered
	 */
	protected CNN1CONTENT cNN1;

	/**
	 * The cached value of the '{@link #getCNN2() <em>CNN2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN2()
	 * @generated
	 * @ordered
	 */
	protected CNN2CONTENT cNN2;

	/**
	 * The cached value of the '{@link #getCNN3() <em>CNN3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN3()
	 * @generated
	 * @ordered
	 */
	protected CNN3CONTENT cNN3;

	/**
	 * The cached value of the '{@link #getCNN4() <em>CNN4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN4()
	 * @generated
	 * @ordered
	 */
	protected CNN4CONTENT cNN4;

	/**
	 * The cached value of the '{@link #getCNN5() <em>CNN5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN5()
	 * @generated
	 * @ordered
	 */
	protected CNN5CONTENT cNN5;

	/**
	 * The cached value of the '{@link #getCNN6() <em>CNN6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN6()
	 * @generated
	 * @ordered
	 */
	protected CNN6CONTENT cNN6;

	/**
	 * The cached value of the '{@link #getCNN7() <em>CNN7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN7()
	 * @generated
	 * @ordered
	 */
	protected CNN7CONTENT cNN7;

	/**
	 * The cached value of the '{@link #getCNN8() <em>CNN8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN8()
	 * @generated
	 * @ordered
	 */
	protected CNN8CONTENT cNN8;

	/**
	 * The cached value of the '{@link #getCNN9() <em>CNN9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN9()
	 * @generated
	 * @ordered
	 */
	protected CNN9CONTENT cNN9;

	/**
	 * The cached value of the '{@link #getCNN10() <em>CNN10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN10()
	 * @generated
	 * @ordered
	 */
	protected CNN10CONTENT cNN10;

	/**
	 * The cached value of the '{@link #getCNN11() <em>CNN11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCNN11()
	 * @generated
	 * @ordered
	 */
	protected CNN11CONTENT cNN11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CNNImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getCNN();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN1CONTENT getCNN1() {
		return cNN1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN1(CNN1CONTENT newCNN1, NotificationChain msgs) {
		CNN1CONTENT oldCNN1 = cNN1;
		cNN1 = newCNN1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN1, oldCNN1, newCNN1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN1(CNN1CONTENT newCNN1) {
		if (newCNN1 != cNN1) {
			NotificationChain msgs = null;
			if (cNN1 != null)
				msgs = ((InternalEObject)cNN1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN1, null, msgs);
			if (newCNN1 != null)
				msgs = ((InternalEObject)newCNN1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN1, null, msgs);
			msgs = basicSetCNN1(newCNN1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN1, newCNN1, newCNN1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN2CONTENT getCNN2() {
		return cNN2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN2(CNN2CONTENT newCNN2, NotificationChain msgs) {
		CNN2CONTENT oldCNN2 = cNN2;
		cNN2 = newCNN2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN2, oldCNN2, newCNN2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN2(CNN2CONTENT newCNN2) {
		if (newCNN2 != cNN2) {
			NotificationChain msgs = null;
			if (cNN2 != null)
				msgs = ((InternalEObject)cNN2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN2, null, msgs);
			if (newCNN2 != null)
				msgs = ((InternalEObject)newCNN2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN2, null, msgs);
			msgs = basicSetCNN2(newCNN2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN2, newCNN2, newCNN2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN3CONTENT getCNN3() {
		return cNN3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN3(CNN3CONTENT newCNN3, NotificationChain msgs) {
		CNN3CONTENT oldCNN3 = cNN3;
		cNN3 = newCNN3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN3, oldCNN3, newCNN3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN3(CNN3CONTENT newCNN3) {
		if (newCNN3 != cNN3) {
			NotificationChain msgs = null;
			if (cNN3 != null)
				msgs = ((InternalEObject)cNN3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN3, null, msgs);
			if (newCNN3 != null)
				msgs = ((InternalEObject)newCNN3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN3, null, msgs);
			msgs = basicSetCNN3(newCNN3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN3, newCNN3, newCNN3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN4CONTENT getCNN4() {
		return cNN4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN4(CNN4CONTENT newCNN4, NotificationChain msgs) {
		CNN4CONTENT oldCNN4 = cNN4;
		cNN4 = newCNN4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN4, oldCNN4, newCNN4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN4(CNN4CONTENT newCNN4) {
		if (newCNN4 != cNN4) {
			NotificationChain msgs = null;
			if (cNN4 != null)
				msgs = ((InternalEObject)cNN4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN4, null, msgs);
			if (newCNN4 != null)
				msgs = ((InternalEObject)newCNN4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN4, null, msgs);
			msgs = basicSetCNN4(newCNN4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN4, newCNN4, newCNN4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN5CONTENT getCNN5() {
		return cNN5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN5(CNN5CONTENT newCNN5, NotificationChain msgs) {
		CNN5CONTENT oldCNN5 = cNN5;
		cNN5 = newCNN5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN5, oldCNN5, newCNN5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN5(CNN5CONTENT newCNN5) {
		if (newCNN5 != cNN5) {
			NotificationChain msgs = null;
			if (cNN5 != null)
				msgs = ((InternalEObject)cNN5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN5, null, msgs);
			if (newCNN5 != null)
				msgs = ((InternalEObject)newCNN5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN5, null, msgs);
			msgs = basicSetCNN5(newCNN5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN5, newCNN5, newCNN5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN6CONTENT getCNN6() {
		return cNN6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN6(CNN6CONTENT newCNN6, NotificationChain msgs) {
		CNN6CONTENT oldCNN6 = cNN6;
		cNN6 = newCNN6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN6, oldCNN6, newCNN6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN6(CNN6CONTENT newCNN6) {
		if (newCNN6 != cNN6) {
			NotificationChain msgs = null;
			if (cNN6 != null)
				msgs = ((InternalEObject)cNN6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN6, null, msgs);
			if (newCNN6 != null)
				msgs = ((InternalEObject)newCNN6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN6, null, msgs);
			msgs = basicSetCNN6(newCNN6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN6, newCNN6, newCNN6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN7CONTENT getCNN7() {
		return cNN7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN7(CNN7CONTENT newCNN7, NotificationChain msgs) {
		CNN7CONTENT oldCNN7 = cNN7;
		cNN7 = newCNN7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN7, oldCNN7, newCNN7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN7(CNN7CONTENT newCNN7) {
		if (newCNN7 != cNN7) {
			NotificationChain msgs = null;
			if (cNN7 != null)
				msgs = ((InternalEObject)cNN7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN7, null, msgs);
			if (newCNN7 != null)
				msgs = ((InternalEObject)newCNN7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN7, null, msgs);
			msgs = basicSetCNN7(newCNN7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN7, newCNN7, newCNN7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN8CONTENT getCNN8() {
		return cNN8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN8(CNN8CONTENT newCNN8, NotificationChain msgs) {
		CNN8CONTENT oldCNN8 = cNN8;
		cNN8 = newCNN8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN8, oldCNN8, newCNN8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN8(CNN8CONTENT newCNN8) {
		if (newCNN8 != cNN8) {
			NotificationChain msgs = null;
			if (cNN8 != null)
				msgs = ((InternalEObject)cNN8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN8, null, msgs);
			if (newCNN8 != null)
				msgs = ((InternalEObject)newCNN8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN8, null, msgs);
			msgs = basicSetCNN8(newCNN8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN8, newCNN8, newCNN8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN9CONTENT getCNN9() {
		return cNN9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN9(CNN9CONTENT newCNN9, NotificationChain msgs) {
		CNN9CONTENT oldCNN9 = cNN9;
		cNN9 = newCNN9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN9, oldCNN9, newCNN9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN9(CNN9CONTENT newCNN9) {
		if (newCNN9 != cNN9) {
			NotificationChain msgs = null;
			if (cNN9 != null)
				msgs = ((InternalEObject)cNN9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN9, null, msgs);
			if (newCNN9 != null)
				msgs = ((InternalEObject)newCNN9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN9, null, msgs);
			msgs = basicSetCNN9(newCNN9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN9, newCNN9, newCNN9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN10CONTENT getCNN10() {
		return cNN10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN10(CNN10CONTENT newCNN10, NotificationChain msgs) {
		CNN10CONTENT oldCNN10 = cNN10;
		cNN10 = newCNN10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN10, oldCNN10, newCNN10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN10(CNN10CONTENT newCNN10) {
		if (newCNN10 != cNN10) {
			NotificationChain msgs = null;
			if (cNN10 != null)
				msgs = ((InternalEObject)cNN10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN10, null, msgs);
			if (newCNN10 != null)
				msgs = ((InternalEObject)newCNN10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN10, null, msgs);
			msgs = basicSetCNN10(newCNN10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN10, newCNN10, newCNN10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CNN11CONTENT getCNN11() {
		return cNN11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCNN11(CNN11CONTENT newCNN11, NotificationChain msgs) {
		CNN11CONTENT oldCNN11 = cNN11;
		cNN11 = newCNN11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN11, oldCNN11, newCNN11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCNN11(CNN11CONTENT newCNN11) {
		if (newCNN11 != cNN11) {
			NotificationChain msgs = null;
			if (cNN11 != null)
				msgs = ((InternalEObject)cNN11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN11, null, msgs);
			if (newCNN11 != null)
				msgs = ((InternalEObject)newCNN11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.CNN__CNN11, null, msgs);
			msgs = basicSetCNN11(newCNN11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.CNN__CNN11, newCNN11, newCNN11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.CNN__CNN1:
				return basicSetCNN1(null, msgs);
			case V2xmlPackage.CNN__CNN2:
				return basicSetCNN2(null, msgs);
			case V2xmlPackage.CNN__CNN3:
				return basicSetCNN3(null, msgs);
			case V2xmlPackage.CNN__CNN4:
				return basicSetCNN4(null, msgs);
			case V2xmlPackage.CNN__CNN5:
				return basicSetCNN5(null, msgs);
			case V2xmlPackage.CNN__CNN6:
				return basicSetCNN6(null, msgs);
			case V2xmlPackage.CNN__CNN7:
				return basicSetCNN7(null, msgs);
			case V2xmlPackage.CNN__CNN8:
				return basicSetCNN8(null, msgs);
			case V2xmlPackage.CNN__CNN9:
				return basicSetCNN9(null, msgs);
			case V2xmlPackage.CNN__CNN10:
				return basicSetCNN10(null, msgs);
			case V2xmlPackage.CNN__CNN11:
				return basicSetCNN11(null, msgs);
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
			case V2xmlPackage.CNN__CNN1:
				return getCNN1();
			case V2xmlPackage.CNN__CNN2:
				return getCNN2();
			case V2xmlPackage.CNN__CNN3:
				return getCNN3();
			case V2xmlPackage.CNN__CNN4:
				return getCNN4();
			case V2xmlPackage.CNN__CNN5:
				return getCNN5();
			case V2xmlPackage.CNN__CNN6:
				return getCNN6();
			case V2xmlPackage.CNN__CNN7:
				return getCNN7();
			case V2xmlPackage.CNN__CNN8:
				return getCNN8();
			case V2xmlPackage.CNN__CNN9:
				return getCNN9();
			case V2xmlPackage.CNN__CNN10:
				return getCNN10();
			case V2xmlPackage.CNN__CNN11:
				return getCNN11();
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
			case V2xmlPackage.CNN__CNN1:
				setCNN1((CNN1CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN2:
				setCNN2((CNN2CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN3:
				setCNN3((CNN3CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN4:
				setCNN4((CNN4CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN5:
				setCNN5((CNN5CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN6:
				setCNN6((CNN6CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN7:
				setCNN7((CNN7CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN8:
				setCNN8((CNN8CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN9:
				setCNN9((CNN9CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN10:
				setCNN10((CNN10CONTENT)newValue);
				return;
			case V2xmlPackage.CNN__CNN11:
				setCNN11((CNN11CONTENT)newValue);
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
			case V2xmlPackage.CNN__CNN1:
				setCNN1((CNN1CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN2:
				setCNN2((CNN2CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN3:
				setCNN3((CNN3CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN4:
				setCNN4((CNN4CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN5:
				setCNN5((CNN5CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN6:
				setCNN6((CNN6CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN7:
				setCNN7((CNN7CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN8:
				setCNN8((CNN8CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN9:
				setCNN9((CNN9CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN10:
				setCNN10((CNN10CONTENT)null);
				return;
			case V2xmlPackage.CNN__CNN11:
				setCNN11((CNN11CONTENT)null);
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
			case V2xmlPackage.CNN__CNN1:
				return cNN1 != null;
			case V2xmlPackage.CNN__CNN2:
				return cNN2 != null;
			case V2xmlPackage.CNN__CNN3:
				return cNN3 != null;
			case V2xmlPackage.CNN__CNN4:
				return cNN4 != null;
			case V2xmlPackage.CNN__CNN5:
				return cNN5 != null;
			case V2xmlPackage.CNN__CNN6:
				return cNN6 != null;
			case V2xmlPackage.CNN__CNN7:
				return cNN7 != null;
			case V2xmlPackage.CNN__CNN8:
				return cNN8 != null;
			case V2xmlPackage.CNN__CNN9:
				return cNN9 != null;
			case V2xmlPackage.CNN__CNN10:
				return cNN10 != null;
			case V2xmlPackage.CNN__CNN11:
				return cNN11 != null;
		}
		return super.eIsSet(featureID);
	}

} //CNNImpl
