/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.TQ;
import org.hl7.v2xml.TQ10CONTENT;
import org.hl7.v2xml.TQ11CONTENT1;
import org.hl7.v2xml.TQ12CONTENT1;
import org.hl7.v2xml.TQ1CONTENT1;
import org.hl7.v2xml.TQ2CONTENT1;
import org.hl7.v2xml.TQ3CONTENT;
import org.hl7.v2xml.TQ4CONTENT;
import org.hl7.v2xml.TQ5CONTENT;
import org.hl7.v2xml.TQ6CONTENT;
import org.hl7.v2xml.TQ7CONTENT;
import org.hl7.v2xml.TQ8CONTENT;
import org.hl7.v2xml.TQ9CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ1 <em>TQ1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ2 <em>TQ2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ3 <em>TQ3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ4 <em>TQ4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ5 <em>TQ5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ6 <em>TQ6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ7 <em>TQ7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ8 <em>TQ8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ9 <em>TQ9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ10 <em>TQ10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ11 <em>TQ11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQImpl#getTQ12 <em>TQ12</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TQImpl extends EObjectImpl implements TQ {
	/**
	 * The cached value of the '{@link #getTQ1() <em>TQ1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ1()
	 * @generated
	 * @ordered
	 */
	protected TQ1CONTENT1 tQ1;

	/**
	 * The cached value of the '{@link #getTQ2() <em>TQ2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ2()
	 * @generated
	 * @ordered
	 */
	protected TQ2CONTENT1 tQ2;

	/**
	 * The cached value of the '{@link #getTQ3() <em>TQ3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ3()
	 * @generated
	 * @ordered
	 */
	protected TQ3CONTENT tQ3;

	/**
	 * The cached value of the '{@link #getTQ4() <em>TQ4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ4()
	 * @generated
	 * @ordered
	 */
	protected TQ4CONTENT tQ4;

	/**
	 * The cached value of the '{@link #getTQ5() <em>TQ5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ5()
	 * @generated
	 * @ordered
	 */
	protected TQ5CONTENT tQ5;

	/**
	 * The cached value of the '{@link #getTQ6() <em>TQ6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ6()
	 * @generated
	 * @ordered
	 */
	protected TQ6CONTENT tQ6;

	/**
	 * The cached value of the '{@link #getTQ7() <em>TQ7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ7()
	 * @generated
	 * @ordered
	 */
	protected TQ7CONTENT tQ7;

	/**
	 * The cached value of the '{@link #getTQ8() <em>TQ8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ8()
	 * @generated
	 * @ordered
	 */
	protected TQ8CONTENT tQ8;

	/**
	 * The cached value of the '{@link #getTQ9() <em>TQ9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ9()
	 * @generated
	 * @ordered
	 */
	protected TQ9CONTENT tQ9;

	/**
	 * The cached value of the '{@link #getTQ10() <em>TQ10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ10()
	 * @generated
	 * @ordered
	 */
	protected TQ10CONTENT tQ10;

	/**
	 * The cached value of the '{@link #getTQ11() <em>TQ11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ11()
	 * @generated
	 * @ordered
	 */
	protected TQ11CONTENT1 tQ11;

	/**
	 * The cached value of the '{@link #getTQ12() <em>TQ12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ12()
	 * @generated
	 * @ordered
	 */
	protected TQ12CONTENT1 tQ12;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTQ();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ1CONTENT1 getTQ1() {
		return tQ1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ1(TQ1CONTENT1 newTQ1, NotificationChain msgs) {
		TQ1CONTENT1 oldTQ1 = tQ1;
		tQ1 = newTQ1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ1, oldTQ1, newTQ1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ1(TQ1CONTENT1 newTQ1) {
		if (newTQ1 != tQ1) {
			NotificationChain msgs = null;
			if (tQ1 != null)
				msgs = ((InternalEObject)tQ1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ1, null, msgs);
			if (newTQ1 != null)
				msgs = ((InternalEObject)newTQ1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ1, null, msgs);
			msgs = basicSetTQ1(newTQ1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ1, newTQ1, newTQ1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ2CONTENT1 getTQ2() {
		return tQ2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ2(TQ2CONTENT1 newTQ2, NotificationChain msgs) {
		TQ2CONTENT1 oldTQ2 = tQ2;
		tQ2 = newTQ2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ2, oldTQ2, newTQ2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ2(TQ2CONTENT1 newTQ2) {
		if (newTQ2 != tQ2) {
			NotificationChain msgs = null;
			if (tQ2 != null)
				msgs = ((InternalEObject)tQ2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ2, null, msgs);
			if (newTQ2 != null)
				msgs = ((InternalEObject)newTQ2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ2, null, msgs);
			msgs = basicSetTQ2(newTQ2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ2, newTQ2, newTQ2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ3CONTENT getTQ3() {
		return tQ3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ3(TQ3CONTENT newTQ3, NotificationChain msgs) {
		TQ3CONTENT oldTQ3 = tQ3;
		tQ3 = newTQ3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ3, oldTQ3, newTQ3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ3(TQ3CONTENT newTQ3) {
		if (newTQ3 != tQ3) {
			NotificationChain msgs = null;
			if (tQ3 != null)
				msgs = ((InternalEObject)tQ3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ3, null, msgs);
			if (newTQ3 != null)
				msgs = ((InternalEObject)newTQ3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ3, null, msgs);
			msgs = basicSetTQ3(newTQ3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ3, newTQ3, newTQ3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ4CONTENT getTQ4() {
		return tQ4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ4(TQ4CONTENT newTQ4, NotificationChain msgs) {
		TQ4CONTENT oldTQ4 = tQ4;
		tQ4 = newTQ4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ4, oldTQ4, newTQ4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ4(TQ4CONTENT newTQ4) {
		if (newTQ4 != tQ4) {
			NotificationChain msgs = null;
			if (tQ4 != null)
				msgs = ((InternalEObject)tQ4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ4, null, msgs);
			if (newTQ4 != null)
				msgs = ((InternalEObject)newTQ4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ4, null, msgs);
			msgs = basicSetTQ4(newTQ4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ4, newTQ4, newTQ4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ5CONTENT getTQ5() {
		return tQ5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ5(TQ5CONTENT newTQ5, NotificationChain msgs) {
		TQ5CONTENT oldTQ5 = tQ5;
		tQ5 = newTQ5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ5, oldTQ5, newTQ5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ5(TQ5CONTENT newTQ5) {
		if (newTQ5 != tQ5) {
			NotificationChain msgs = null;
			if (tQ5 != null)
				msgs = ((InternalEObject)tQ5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ5, null, msgs);
			if (newTQ5 != null)
				msgs = ((InternalEObject)newTQ5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ5, null, msgs);
			msgs = basicSetTQ5(newTQ5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ5, newTQ5, newTQ5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ6CONTENT getTQ6() {
		return tQ6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ6(TQ6CONTENT newTQ6, NotificationChain msgs) {
		TQ6CONTENT oldTQ6 = tQ6;
		tQ6 = newTQ6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ6, oldTQ6, newTQ6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ6(TQ6CONTENT newTQ6) {
		if (newTQ6 != tQ6) {
			NotificationChain msgs = null;
			if (tQ6 != null)
				msgs = ((InternalEObject)tQ6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ6, null, msgs);
			if (newTQ6 != null)
				msgs = ((InternalEObject)newTQ6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ6, null, msgs);
			msgs = basicSetTQ6(newTQ6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ6, newTQ6, newTQ6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ7CONTENT getTQ7() {
		return tQ7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ7(TQ7CONTENT newTQ7, NotificationChain msgs) {
		TQ7CONTENT oldTQ7 = tQ7;
		tQ7 = newTQ7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ7, oldTQ7, newTQ7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ7(TQ7CONTENT newTQ7) {
		if (newTQ7 != tQ7) {
			NotificationChain msgs = null;
			if (tQ7 != null)
				msgs = ((InternalEObject)tQ7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ7, null, msgs);
			if (newTQ7 != null)
				msgs = ((InternalEObject)newTQ7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ7, null, msgs);
			msgs = basicSetTQ7(newTQ7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ7, newTQ7, newTQ7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ8CONTENT getTQ8() {
		return tQ8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ8(TQ8CONTENT newTQ8, NotificationChain msgs) {
		TQ8CONTENT oldTQ8 = tQ8;
		tQ8 = newTQ8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ8, oldTQ8, newTQ8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ8(TQ8CONTENT newTQ8) {
		if (newTQ8 != tQ8) {
			NotificationChain msgs = null;
			if (tQ8 != null)
				msgs = ((InternalEObject)tQ8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ8, null, msgs);
			if (newTQ8 != null)
				msgs = ((InternalEObject)newTQ8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ8, null, msgs);
			msgs = basicSetTQ8(newTQ8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ8, newTQ8, newTQ8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ9CONTENT getTQ9() {
		return tQ9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ9(TQ9CONTENT newTQ9, NotificationChain msgs) {
		TQ9CONTENT oldTQ9 = tQ9;
		tQ9 = newTQ9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ9, oldTQ9, newTQ9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ9(TQ9CONTENT newTQ9) {
		if (newTQ9 != tQ9) {
			NotificationChain msgs = null;
			if (tQ9 != null)
				msgs = ((InternalEObject)tQ9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ9, null, msgs);
			if (newTQ9 != null)
				msgs = ((InternalEObject)newTQ9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ9, null, msgs);
			msgs = basicSetTQ9(newTQ9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ9, newTQ9, newTQ9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ10CONTENT getTQ10() {
		return tQ10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ10(TQ10CONTENT newTQ10, NotificationChain msgs) {
		TQ10CONTENT oldTQ10 = tQ10;
		tQ10 = newTQ10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ10, oldTQ10, newTQ10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ10(TQ10CONTENT newTQ10) {
		if (newTQ10 != tQ10) {
			NotificationChain msgs = null;
			if (tQ10 != null)
				msgs = ((InternalEObject)tQ10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ10, null, msgs);
			if (newTQ10 != null)
				msgs = ((InternalEObject)newTQ10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ10, null, msgs);
			msgs = basicSetTQ10(newTQ10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ10, newTQ10, newTQ10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ11CONTENT1 getTQ11() {
		return tQ11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ11(TQ11CONTENT1 newTQ11, NotificationChain msgs) {
		TQ11CONTENT1 oldTQ11 = tQ11;
		tQ11 = newTQ11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ11, oldTQ11, newTQ11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ11(TQ11CONTENT1 newTQ11) {
		if (newTQ11 != tQ11) {
			NotificationChain msgs = null;
			if (tQ11 != null)
				msgs = ((InternalEObject)tQ11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ11, null, msgs);
			if (newTQ11 != null)
				msgs = ((InternalEObject)newTQ11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ11, null, msgs);
			msgs = basicSetTQ11(newTQ11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ11, newTQ11, newTQ11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ12CONTENT1 getTQ12() {
		return tQ12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ12(TQ12CONTENT1 newTQ12, NotificationChain msgs) {
		TQ12CONTENT1 oldTQ12 = tQ12;
		tQ12 = newTQ12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ12, oldTQ12, newTQ12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ12(TQ12CONTENT1 newTQ12) {
		if (newTQ12 != tQ12) {
			NotificationChain msgs = null;
			if (tQ12 != null)
				msgs = ((InternalEObject)tQ12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ12, null, msgs);
			if (newTQ12 != null)
				msgs = ((InternalEObject)newTQ12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ__TQ12, null, msgs);
			msgs = basicSetTQ12(newTQ12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ__TQ12, newTQ12, newTQ12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.TQ__TQ1:
				return basicSetTQ1(null, msgs);
			case V2xmlPackage.TQ__TQ2:
				return basicSetTQ2(null, msgs);
			case V2xmlPackage.TQ__TQ3:
				return basicSetTQ3(null, msgs);
			case V2xmlPackage.TQ__TQ4:
				return basicSetTQ4(null, msgs);
			case V2xmlPackage.TQ__TQ5:
				return basicSetTQ5(null, msgs);
			case V2xmlPackage.TQ__TQ6:
				return basicSetTQ6(null, msgs);
			case V2xmlPackage.TQ__TQ7:
				return basicSetTQ7(null, msgs);
			case V2xmlPackage.TQ__TQ8:
				return basicSetTQ8(null, msgs);
			case V2xmlPackage.TQ__TQ9:
				return basicSetTQ9(null, msgs);
			case V2xmlPackage.TQ__TQ10:
				return basicSetTQ10(null, msgs);
			case V2xmlPackage.TQ__TQ11:
				return basicSetTQ11(null, msgs);
			case V2xmlPackage.TQ__TQ12:
				return basicSetTQ12(null, msgs);
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
			case V2xmlPackage.TQ__TQ1:
				return getTQ1();
			case V2xmlPackage.TQ__TQ2:
				return getTQ2();
			case V2xmlPackage.TQ__TQ3:
				return getTQ3();
			case V2xmlPackage.TQ__TQ4:
				return getTQ4();
			case V2xmlPackage.TQ__TQ5:
				return getTQ5();
			case V2xmlPackage.TQ__TQ6:
				return getTQ6();
			case V2xmlPackage.TQ__TQ7:
				return getTQ7();
			case V2xmlPackage.TQ__TQ8:
				return getTQ8();
			case V2xmlPackage.TQ__TQ9:
				return getTQ9();
			case V2xmlPackage.TQ__TQ10:
				return getTQ10();
			case V2xmlPackage.TQ__TQ11:
				return getTQ11();
			case V2xmlPackage.TQ__TQ12:
				return getTQ12();
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
			case V2xmlPackage.TQ__TQ1:
				setTQ1((TQ1CONTENT1)newValue);
				return;
			case V2xmlPackage.TQ__TQ2:
				setTQ2((TQ2CONTENT1)newValue);
				return;
			case V2xmlPackage.TQ__TQ3:
				setTQ3((TQ3CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ4:
				setTQ4((TQ4CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ5:
				setTQ5((TQ5CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ6:
				setTQ6((TQ6CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ7:
				setTQ7((TQ7CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ8:
				setTQ8((TQ8CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ9:
				setTQ9((TQ9CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ10:
				setTQ10((TQ10CONTENT)newValue);
				return;
			case V2xmlPackage.TQ__TQ11:
				setTQ11((TQ11CONTENT1)newValue);
				return;
			case V2xmlPackage.TQ__TQ12:
				setTQ12((TQ12CONTENT1)newValue);
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
			case V2xmlPackage.TQ__TQ1:
				setTQ1((TQ1CONTENT1)null);
				return;
			case V2xmlPackage.TQ__TQ2:
				setTQ2((TQ2CONTENT1)null);
				return;
			case V2xmlPackage.TQ__TQ3:
				setTQ3((TQ3CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ4:
				setTQ4((TQ4CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ5:
				setTQ5((TQ5CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ6:
				setTQ6((TQ6CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ7:
				setTQ7((TQ7CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ8:
				setTQ8((TQ8CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ9:
				setTQ9((TQ9CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ10:
				setTQ10((TQ10CONTENT)null);
				return;
			case V2xmlPackage.TQ__TQ11:
				setTQ11((TQ11CONTENT1)null);
				return;
			case V2xmlPackage.TQ__TQ12:
				setTQ12((TQ12CONTENT1)null);
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
			case V2xmlPackage.TQ__TQ1:
				return tQ1 != null;
			case V2xmlPackage.TQ__TQ2:
				return tQ2 != null;
			case V2xmlPackage.TQ__TQ3:
				return tQ3 != null;
			case V2xmlPackage.TQ__TQ4:
				return tQ4 != null;
			case V2xmlPackage.TQ__TQ5:
				return tQ5 != null;
			case V2xmlPackage.TQ__TQ6:
				return tQ6 != null;
			case V2xmlPackage.TQ__TQ7:
				return tQ7 != null;
			case V2xmlPackage.TQ__TQ8:
				return tQ8 != null;
			case V2xmlPackage.TQ__TQ9:
				return tQ9 != null;
			case V2xmlPackage.TQ__TQ10:
				return tQ10 != null;
			case V2xmlPackage.TQ__TQ11:
				return tQ11 != null;
			case V2xmlPackage.TQ__TQ12:
				return tQ12 != null;
		}
		return super.eIsSet(featureID);
	}

} //TQImpl
