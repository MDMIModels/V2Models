/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.NDL;
import org.hl7.v2xml.NDL10CONTENT;
import org.hl7.v2xml.NDL11CONTENT;
import org.hl7.v2xml.NDL1CONTENT;
import org.hl7.v2xml.NDL2CONTENT;
import org.hl7.v2xml.NDL3CONTENT;
import org.hl7.v2xml.NDL4CONTENT;
import org.hl7.v2xml.NDL5CONTENT;
import org.hl7.v2xml.NDL6CONTENT;
import org.hl7.v2xml.NDL7CONTENT;
import org.hl7.v2xml.NDL8CONTENT;
import org.hl7.v2xml.NDL9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NDL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL1 <em>NDL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL2 <em>NDL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL3 <em>NDL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL4 <em>NDL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL5 <em>NDL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL6 <em>NDL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL7 <em>NDL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL8 <em>NDL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL9 <em>NDL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL10 <em>NDL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NDLImpl#getNDL11 <em>NDL11</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NDLImpl extends EObjectImpl implements NDL {
	/**
	 * The cached value of the '{@link #getNDL1() <em>NDL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL1()
	 * @generated
	 * @ordered
	 */
	protected NDL1CONTENT nDL1;

	/**
	 * The cached value of the '{@link #getNDL2() <em>NDL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL2()
	 * @generated
	 * @ordered
	 */
	protected NDL2CONTENT nDL2;

	/**
	 * The cached value of the '{@link #getNDL3() <em>NDL3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL3()
	 * @generated
	 * @ordered
	 */
	protected NDL3CONTENT nDL3;

	/**
	 * The cached value of the '{@link #getNDL4() <em>NDL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL4()
	 * @generated
	 * @ordered
	 */
	protected NDL4CONTENT nDL4;

	/**
	 * The cached value of the '{@link #getNDL5() <em>NDL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL5()
	 * @generated
	 * @ordered
	 */
	protected NDL5CONTENT nDL5;

	/**
	 * The cached value of the '{@link #getNDL6() <em>NDL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL6()
	 * @generated
	 * @ordered
	 */
	protected NDL6CONTENT nDL6;

	/**
	 * The cached value of the '{@link #getNDL7() <em>NDL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL7()
	 * @generated
	 * @ordered
	 */
	protected NDL7CONTENT nDL7;

	/**
	 * The cached value of the '{@link #getNDL8() <em>NDL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL8()
	 * @generated
	 * @ordered
	 */
	protected NDL8CONTENT nDL8;

	/**
	 * The cached value of the '{@link #getNDL9() <em>NDL9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL9()
	 * @generated
	 * @ordered
	 */
	protected NDL9CONTENT nDL9;

	/**
	 * The cached value of the '{@link #getNDL10() <em>NDL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL10()
	 * @generated
	 * @ordered
	 */
	protected NDL10CONTENT nDL10;

	/**
	 * The cached value of the '{@link #getNDL11() <em>NDL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNDL11()
	 * @generated
	 * @ordered
	 */
	protected NDL11CONTENT nDL11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NDLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNDL();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL1CONTENT getNDL1() {
		return nDL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL1(NDL1CONTENT newNDL1, NotificationChain msgs) {
		NDL1CONTENT oldNDL1 = nDL1;
		nDL1 = newNDL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL1, oldNDL1, newNDL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL1(NDL1CONTENT newNDL1) {
		if (newNDL1 != nDL1) {
			NotificationChain msgs = null;
			if (nDL1 != null)
				msgs = ((InternalEObject)nDL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL1, null, msgs);
			if (newNDL1 != null)
				msgs = ((InternalEObject)newNDL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL1, null, msgs);
			msgs = basicSetNDL1(newNDL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL1, newNDL1, newNDL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL2CONTENT getNDL2() {
		return nDL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL2(NDL2CONTENT newNDL2, NotificationChain msgs) {
		NDL2CONTENT oldNDL2 = nDL2;
		nDL2 = newNDL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL2, oldNDL2, newNDL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL2(NDL2CONTENT newNDL2) {
		if (newNDL2 != nDL2) {
			NotificationChain msgs = null;
			if (nDL2 != null)
				msgs = ((InternalEObject)nDL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL2, null, msgs);
			if (newNDL2 != null)
				msgs = ((InternalEObject)newNDL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL2, null, msgs);
			msgs = basicSetNDL2(newNDL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL2, newNDL2, newNDL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL3CONTENT getNDL3() {
		return nDL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL3(NDL3CONTENT newNDL3, NotificationChain msgs) {
		NDL3CONTENT oldNDL3 = nDL3;
		nDL3 = newNDL3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL3, oldNDL3, newNDL3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL3(NDL3CONTENT newNDL3) {
		if (newNDL3 != nDL3) {
			NotificationChain msgs = null;
			if (nDL3 != null)
				msgs = ((InternalEObject)nDL3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL3, null, msgs);
			if (newNDL3 != null)
				msgs = ((InternalEObject)newNDL3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL3, null, msgs);
			msgs = basicSetNDL3(newNDL3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL3, newNDL3, newNDL3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL4CONTENT getNDL4() {
		return nDL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL4(NDL4CONTENT newNDL4, NotificationChain msgs) {
		NDL4CONTENT oldNDL4 = nDL4;
		nDL4 = newNDL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL4, oldNDL4, newNDL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL4(NDL4CONTENT newNDL4) {
		if (newNDL4 != nDL4) {
			NotificationChain msgs = null;
			if (nDL4 != null)
				msgs = ((InternalEObject)nDL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL4, null, msgs);
			if (newNDL4 != null)
				msgs = ((InternalEObject)newNDL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL4, null, msgs);
			msgs = basicSetNDL4(newNDL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL4, newNDL4, newNDL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL5CONTENT getNDL5() {
		return nDL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL5(NDL5CONTENT newNDL5, NotificationChain msgs) {
		NDL5CONTENT oldNDL5 = nDL5;
		nDL5 = newNDL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL5, oldNDL5, newNDL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL5(NDL5CONTENT newNDL5) {
		if (newNDL5 != nDL5) {
			NotificationChain msgs = null;
			if (nDL5 != null)
				msgs = ((InternalEObject)nDL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL5, null, msgs);
			if (newNDL5 != null)
				msgs = ((InternalEObject)newNDL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL5, null, msgs);
			msgs = basicSetNDL5(newNDL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL5, newNDL5, newNDL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL6CONTENT getNDL6() {
		return nDL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL6(NDL6CONTENT newNDL6, NotificationChain msgs) {
		NDL6CONTENT oldNDL6 = nDL6;
		nDL6 = newNDL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL6, oldNDL6, newNDL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL6(NDL6CONTENT newNDL6) {
		if (newNDL6 != nDL6) {
			NotificationChain msgs = null;
			if (nDL6 != null)
				msgs = ((InternalEObject)nDL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL6, null, msgs);
			if (newNDL6 != null)
				msgs = ((InternalEObject)newNDL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL6, null, msgs);
			msgs = basicSetNDL6(newNDL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL6, newNDL6, newNDL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL7CONTENT getNDL7() {
		return nDL7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL7(NDL7CONTENT newNDL7, NotificationChain msgs) {
		NDL7CONTENT oldNDL7 = nDL7;
		nDL7 = newNDL7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL7, oldNDL7, newNDL7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL7(NDL7CONTENT newNDL7) {
		if (newNDL7 != nDL7) {
			NotificationChain msgs = null;
			if (nDL7 != null)
				msgs = ((InternalEObject)nDL7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL7, null, msgs);
			if (newNDL7 != null)
				msgs = ((InternalEObject)newNDL7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL7, null, msgs);
			msgs = basicSetNDL7(newNDL7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL7, newNDL7, newNDL7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL8CONTENT getNDL8() {
		return nDL8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL8(NDL8CONTENT newNDL8, NotificationChain msgs) {
		NDL8CONTENT oldNDL8 = nDL8;
		nDL8 = newNDL8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL8, oldNDL8, newNDL8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL8(NDL8CONTENT newNDL8) {
		if (newNDL8 != nDL8) {
			NotificationChain msgs = null;
			if (nDL8 != null)
				msgs = ((InternalEObject)nDL8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL8, null, msgs);
			if (newNDL8 != null)
				msgs = ((InternalEObject)newNDL8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL8, null, msgs);
			msgs = basicSetNDL8(newNDL8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL8, newNDL8, newNDL8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL9CONTENT getNDL9() {
		return nDL9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL9(NDL9CONTENT newNDL9, NotificationChain msgs) {
		NDL9CONTENT oldNDL9 = nDL9;
		nDL9 = newNDL9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL9, oldNDL9, newNDL9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL9(NDL9CONTENT newNDL9) {
		if (newNDL9 != nDL9) {
			NotificationChain msgs = null;
			if (nDL9 != null)
				msgs = ((InternalEObject)nDL9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL9, null, msgs);
			if (newNDL9 != null)
				msgs = ((InternalEObject)newNDL9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL9, null, msgs);
			msgs = basicSetNDL9(newNDL9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL9, newNDL9, newNDL9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL10CONTENT getNDL10() {
		return nDL10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL10(NDL10CONTENT newNDL10, NotificationChain msgs) {
		NDL10CONTENT oldNDL10 = nDL10;
		nDL10 = newNDL10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL10, oldNDL10, newNDL10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL10(NDL10CONTENT newNDL10) {
		if (newNDL10 != nDL10) {
			NotificationChain msgs = null;
			if (nDL10 != null)
				msgs = ((InternalEObject)nDL10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL10, null, msgs);
			if (newNDL10 != null)
				msgs = ((InternalEObject)newNDL10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL10, null, msgs);
			msgs = basicSetNDL10(newNDL10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL10, newNDL10, newNDL10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NDL11CONTENT getNDL11() {
		return nDL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNDL11(NDL11CONTENT newNDL11, NotificationChain msgs) {
		NDL11CONTENT oldNDL11 = nDL11;
		nDL11 = newNDL11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL11, oldNDL11, newNDL11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNDL11(NDL11CONTENT newNDL11) {
		if (newNDL11 != nDL11) {
			NotificationChain msgs = null;
			if (nDL11 != null)
				msgs = ((InternalEObject)nDL11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL11, null, msgs);
			if (newNDL11 != null)
				msgs = ((InternalEObject)newNDL11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NDL__NDL11, null, msgs);
			msgs = basicSetNDL11(newNDL11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NDL__NDL11, newNDL11, newNDL11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.NDL__NDL1:
				return basicSetNDL1(null, msgs);
			case V2xmlPackage.NDL__NDL2:
				return basicSetNDL2(null, msgs);
			case V2xmlPackage.NDL__NDL3:
				return basicSetNDL3(null, msgs);
			case V2xmlPackage.NDL__NDL4:
				return basicSetNDL4(null, msgs);
			case V2xmlPackage.NDL__NDL5:
				return basicSetNDL5(null, msgs);
			case V2xmlPackage.NDL__NDL6:
				return basicSetNDL6(null, msgs);
			case V2xmlPackage.NDL__NDL7:
				return basicSetNDL7(null, msgs);
			case V2xmlPackage.NDL__NDL8:
				return basicSetNDL8(null, msgs);
			case V2xmlPackage.NDL__NDL9:
				return basicSetNDL9(null, msgs);
			case V2xmlPackage.NDL__NDL10:
				return basicSetNDL10(null, msgs);
			case V2xmlPackage.NDL__NDL11:
				return basicSetNDL11(null, msgs);
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
			case V2xmlPackage.NDL__NDL1:
				return getNDL1();
			case V2xmlPackage.NDL__NDL2:
				return getNDL2();
			case V2xmlPackage.NDL__NDL3:
				return getNDL3();
			case V2xmlPackage.NDL__NDL4:
				return getNDL4();
			case V2xmlPackage.NDL__NDL5:
				return getNDL5();
			case V2xmlPackage.NDL__NDL6:
				return getNDL6();
			case V2xmlPackage.NDL__NDL7:
				return getNDL7();
			case V2xmlPackage.NDL__NDL8:
				return getNDL8();
			case V2xmlPackage.NDL__NDL9:
				return getNDL9();
			case V2xmlPackage.NDL__NDL10:
				return getNDL10();
			case V2xmlPackage.NDL__NDL11:
				return getNDL11();
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
			case V2xmlPackage.NDL__NDL1:
				setNDL1((NDL1CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL2:
				setNDL2((NDL2CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL3:
				setNDL3((NDL3CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL4:
				setNDL4((NDL4CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL5:
				setNDL5((NDL5CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL6:
				setNDL6((NDL6CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL7:
				setNDL7((NDL7CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL8:
				setNDL8((NDL8CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL9:
				setNDL9((NDL9CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL10:
				setNDL10((NDL10CONTENT)newValue);
				return;
			case V2xmlPackage.NDL__NDL11:
				setNDL11((NDL11CONTENT)newValue);
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
			case V2xmlPackage.NDL__NDL1:
				setNDL1((NDL1CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL2:
				setNDL2((NDL2CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL3:
				setNDL3((NDL3CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL4:
				setNDL4((NDL4CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL5:
				setNDL5((NDL5CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL6:
				setNDL6((NDL6CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL7:
				setNDL7((NDL7CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL8:
				setNDL8((NDL8CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL9:
				setNDL9((NDL9CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL10:
				setNDL10((NDL10CONTENT)null);
				return;
			case V2xmlPackage.NDL__NDL11:
				setNDL11((NDL11CONTENT)null);
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
			case V2xmlPackage.NDL__NDL1:
				return nDL1 != null;
			case V2xmlPackage.NDL__NDL2:
				return nDL2 != null;
			case V2xmlPackage.NDL__NDL3:
				return nDL3 != null;
			case V2xmlPackage.NDL__NDL4:
				return nDL4 != null;
			case V2xmlPackage.NDL__NDL5:
				return nDL5 != null;
			case V2xmlPackage.NDL__NDL6:
				return nDL6 != null;
			case V2xmlPackage.NDL__NDL7:
				return nDL7 != null;
			case V2xmlPackage.NDL__NDL8:
				return nDL8 != null;
			case V2xmlPackage.NDL__NDL9:
				return nDL9 != null;
			case V2xmlPackage.NDL__NDL10:
				return nDL10 != null;
			case V2xmlPackage.NDL__NDL11:
				return nDL11 != null;
		}
		return super.eIsSet(featureID);
	}

} //NDLImpl
