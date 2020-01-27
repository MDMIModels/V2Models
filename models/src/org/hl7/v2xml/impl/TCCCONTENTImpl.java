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

import org.hl7.v2xml.TCC10CONTENT;
import org.hl7.v2xml.TCC11CONTENT;
import org.hl7.v2xml.TCC12CONTENT;
import org.hl7.v2xml.TCC13CONTENT;
import org.hl7.v2xml.TCC14CONTENT;
import org.hl7.v2xml.TCC1CONTENT;
import org.hl7.v2xml.TCC2CONTENT;
import org.hl7.v2xml.TCC3CONTENT;
import org.hl7.v2xml.TCC4CONTENT;
import org.hl7.v2xml.TCC5CONTENT;
import org.hl7.v2xml.TCC6CONTENT;
import org.hl7.v2xml.TCC7CONTENT;
import org.hl7.v2xml.TCC8CONTENT;
import org.hl7.v2xml.TCC9CONTENT;
import org.hl7.v2xml.TCCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC1 <em>TCC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC2 <em>TCC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC3 <em>TCC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC4 <em>TCC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC5 <em>TCC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC6 <em>TCC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC7 <em>TCC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC8 <em>TCC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC9 <em>TCC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC10 <em>TCC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC11 <em>TCC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC12 <em>TCC12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC13 <em>TCC13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getTCC14 <em>TCC14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TCCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCCCONTENTImpl extends EObjectImpl implements TCCCONTENT {
	/**
	 * The cached value of the '{@link #getTCC1() <em>TCC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC1()
	 * @generated
	 * @ordered
	 */
	protected TCC1CONTENT tCC1;

	/**
	 * The cached value of the '{@link #getTCC2() <em>TCC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC2()
	 * @generated
	 * @ordered
	 */
	protected TCC2CONTENT tCC2;

	/**
	 * The cached value of the '{@link #getTCC3() <em>TCC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC3()
	 * @generated
	 * @ordered
	 */
	protected TCC3CONTENT tCC3;

	/**
	 * The cached value of the '{@link #getTCC4() <em>TCC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC4()
	 * @generated
	 * @ordered
	 */
	protected TCC4CONTENT tCC4;

	/**
	 * The cached value of the '{@link #getTCC5() <em>TCC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC5()
	 * @generated
	 * @ordered
	 */
	protected TCC5CONTENT tCC5;

	/**
	 * The cached value of the '{@link #getTCC6() <em>TCC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC6()
	 * @generated
	 * @ordered
	 */
	protected TCC6CONTENT tCC6;

	/**
	 * The cached value of the '{@link #getTCC7() <em>TCC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC7()
	 * @generated
	 * @ordered
	 */
	protected TCC7CONTENT tCC7;

	/**
	 * The cached value of the '{@link #getTCC8() <em>TCC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC8()
	 * @generated
	 * @ordered
	 */
	protected TCC8CONTENT tCC8;

	/**
	 * The cached value of the '{@link #getTCC9() <em>TCC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC9()
	 * @generated
	 * @ordered
	 */
	protected TCC9CONTENT tCC9;

	/**
	 * The cached value of the '{@link #getTCC10() <em>TCC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC10()
	 * @generated
	 * @ordered
	 */
	protected TCC10CONTENT tCC10;

	/**
	 * The cached value of the '{@link #getTCC11() <em>TCC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC11()
	 * @generated
	 * @ordered
	 */
	protected TCC11CONTENT tCC11;

	/**
	 * The cached value of the '{@link #getTCC12() <em>TCC12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC12()
	 * @generated
	 * @ordered
	 */
	protected TCC12CONTENT tCC12;

	/**
	 * The cached value of the '{@link #getTCC13() <em>TCC13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC13()
	 * @generated
	 * @ordered
	 */
	protected TCC13CONTENT tCC13;

	/**
	 * The cached value of the '{@link #getTCC14() <em>TCC14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTCC14()
	 * @generated
	 * @ordered
	 */
	protected TCC14CONTENT tCC14;

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
	protected TCCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTCCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC1CONTENT getTCC1() {
		return tCC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC1(TCC1CONTENT newTCC1, NotificationChain msgs) {
		TCC1CONTENT oldTCC1 = tCC1;
		tCC1 = newTCC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC1, oldTCC1, newTCC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC1(TCC1CONTENT newTCC1) {
		if (newTCC1 != tCC1) {
			NotificationChain msgs = null;
			if (tCC1 != null)
				msgs = ((InternalEObject)tCC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC1, null, msgs);
			if (newTCC1 != null)
				msgs = ((InternalEObject)newTCC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC1, null, msgs);
			msgs = basicSetTCC1(newTCC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC1, newTCC1, newTCC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC2CONTENT getTCC2() {
		return tCC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC2(TCC2CONTENT newTCC2, NotificationChain msgs) {
		TCC2CONTENT oldTCC2 = tCC2;
		tCC2 = newTCC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC2, oldTCC2, newTCC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC2(TCC2CONTENT newTCC2) {
		if (newTCC2 != tCC2) {
			NotificationChain msgs = null;
			if (tCC2 != null)
				msgs = ((InternalEObject)tCC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC2, null, msgs);
			if (newTCC2 != null)
				msgs = ((InternalEObject)newTCC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC2, null, msgs);
			msgs = basicSetTCC2(newTCC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC2, newTCC2, newTCC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC3CONTENT getTCC3() {
		return tCC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC3(TCC3CONTENT newTCC3, NotificationChain msgs) {
		TCC3CONTENT oldTCC3 = tCC3;
		tCC3 = newTCC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC3, oldTCC3, newTCC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC3(TCC3CONTENT newTCC3) {
		if (newTCC3 != tCC3) {
			NotificationChain msgs = null;
			if (tCC3 != null)
				msgs = ((InternalEObject)tCC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC3, null, msgs);
			if (newTCC3 != null)
				msgs = ((InternalEObject)newTCC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC3, null, msgs);
			msgs = basicSetTCC3(newTCC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC3, newTCC3, newTCC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC4CONTENT getTCC4() {
		return tCC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC4(TCC4CONTENT newTCC4, NotificationChain msgs) {
		TCC4CONTENT oldTCC4 = tCC4;
		tCC4 = newTCC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC4, oldTCC4, newTCC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC4(TCC4CONTENT newTCC4) {
		if (newTCC4 != tCC4) {
			NotificationChain msgs = null;
			if (tCC4 != null)
				msgs = ((InternalEObject)tCC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC4, null, msgs);
			if (newTCC4 != null)
				msgs = ((InternalEObject)newTCC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC4, null, msgs);
			msgs = basicSetTCC4(newTCC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC4, newTCC4, newTCC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC5CONTENT getTCC5() {
		return tCC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC5(TCC5CONTENT newTCC5, NotificationChain msgs) {
		TCC5CONTENT oldTCC5 = tCC5;
		tCC5 = newTCC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC5, oldTCC5, newTCC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC5(TCC5CONTENT newTCC5) {
		if (newTCC5 != tCC5) {
			NotificationChain msgs = null;
			if (tCC5 != null)
				msgs = ((InternalEObject)tCC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC5, null, msgs);
			if (newTCC5 != null)
				msgs = ((InternalEObject)newTCC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC5, null, msgs);
			msgs = basicSetTCC5(newTCC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC5, newTCC5, newTCC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC6CONTENT getTCC6() {
		return tCC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC6(TCC6CONTENT newTCC6, NotificationChain msgs) {
		TCC6CONTENT oldTCC6 = tCC6;
		tCC6 = newTCC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC6, oldTCC6, newTCC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC6(TCC6CONTENT newTCC6) {
		if (newTCC6 != tCC6) {
			NotificationChain msgs = null;
			if (tCC6 != null)
				msgs = ((InternalEObject)tCC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC6, null, msgs);
			if (newTCC6 != null)
				msgs = ((InternalEObject)newTCC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC6, null, msgs);
			msgs = basicSetTCC6(newTCC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC6, newTCC6, newTCC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC7CONTENT getTCC7() {
		return tCC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC7(TCC7CONTENT newTCC7, NotificationChain msgs) {
		TCC7CONTENT oldTCC7 = tCC7;
		tCC7 = newTCC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC7, oldTCC7, newTCC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC7(TCC7CONTENT newTCC7) {
		if (newTCC7 != tCC7) {
			NotificationChain msgs = null;
			if (tCC7 != null)
				msgs = ((InternalEObject)tCC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC7, null, msgs);
			if (newTCC7 != null)
				msgs = ((InternalEObject)newTCC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC7, null, msgs);
			msgs = basicSetTCC7(newTCC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC7, newTCC7, newTCC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC8CONTENT getTCC8() {
		return tCC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC8(TCC8CONTENT newTCC8, NotificationChain msgs) {
		TCC8CONTENT oldTCC8 = tCC8;
		tCC8 = newTCC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC8, oldTCC8, newTCC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC8(TCC8CONTENT newTCC8) {
		if (newTCC8 != tCC8) {
			NotificationChain msgs = null;
			if (tCC8 != null)
				msgs = ((InternalEObject)tCC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC8, null, msgs);
			if (newTCC8 != null)
				msgs = ((InternalEObject)newTCC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC8, null, msgs);
			msgs = basicSetTCC8(newTCC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC8, newTCC8, newTCC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC9CONTENT getTCC9() {
		return tCC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC9(TCC9CONTENT newTCC9, NotificationChain msgs) {
		TCC9CONTENT oldTCC9 = tCC9;
		tCC9 = newTCC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC9, oldTCC9, newTCC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC9(TCC9CONTENT newTCC9) {
		if (newTCC9 != tCC9) {
			NotificationChain msgs = null;
			if (tCC9 != null)
				msgs = ((InternalEObject)tCC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC9, null, msgs);
			if (newTCC9 != null)
				msgs = ((InternalEObject)newTCC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC9, null, msgs);
			msgs = basicSetTCC9(newTCC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC9, newTCC9, newTCC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC10CONTENT getTCC10() {
		return tCC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC10(TCC10CONTENT newTCC10, NotificationChain msgs) {
		TCC10CONTENT oldTCC10 = tCC10;
		tCC10 = newTCC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC10, oldTCC10, newTCC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC10(TCC10CONTENT newTCC10) {
		if (newTCC10 != tCC10) {
			NotificationChain msgs = null;
			if (tCC10 != null)
				msgs = ((InternalEObject)tCC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC10, null, msgs);
			if (newTCC10 != null)
				msgs = ((InternalEObject)newTCC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC10, null, msgs);
			msgs = basicSetTCC10(newTCC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC10, newTCC10, newTCC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC11CONTENT getTCC11() {
		return tCC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC11(TCC11CONTENT newTCC11, NotificationChain msgs) {
		TCC11CONTENT oldTCC11 = tCC11;
		tCC11 = newTCC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC11, oldTCC11, newTCC11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC11(TCC11CONTENT newTCC11) {
		if (newTCC11 != tCC11) {
			NotificationChain msgs = null;
			if (tCC11 != null)
				msgs = ((InternalEObject)tCC11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC11, null, msgs);
			if (newTCC11 != null)
				msgs = ((InternalEObject)newTCC11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC11, null, msgs);
			msgs = basicSetTCC11(newTCC11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC11, newTCC11, newTCC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC12CONTENT getTCC12() {
		return tCC12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC12(TCC12CONTENT newTCC12, NotificationChain msgs) {
		TCC12CONTENT oldTCC12 = tCC12;
		tCC12 = newTCC12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC12, oldTCC12, newTCC12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC12(TCC12CONTENT newTCC12) {
		if (newTCC12 != tCC12) {
			NotificationChain msgs = null;
			if (tCC12 != null)
				msgs = ((InternalEObject)tCC12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC12, null, msgs);
			if (newTCC12 != null)
				msgs = ((InternalEObject)newTCC12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC12, null, msgs);
			msgs = basicSetTCC12(newTCC12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC12, newTCC12, newTCC12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC13CONTENT getTCC13() {
		return tCC13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC13(TCC13CONTENT newTCC13, NotificationChain msgs) {
		TCC13CONTENT oldTCC13 = tCC13;
		tCC13 = newTCC13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC13, oldTCC13, newTCC13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC13(TCC13CONTENT newTCC13) {
		if (newTCC13 != tCC13) {
			NotificationChain msgs = null;
			if (tCC13 != null)
				msgs = ((InternalEObject)tCC13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC13, null, msgs);
			if (newTCC13 != null)
				msgs = ((InternalEObject)newTCC13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC13, null, msgs);
			msgs = basicSetTCC13(newTCC13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC13, newTCC13, newTCC13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TCC14CONTENT getTCC14() {
		return tCC14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTCC14(TCC14CONTENT newTCC14, NotificationChain msgs) {
		TCC14CONTENT oldTCC14 = tCC14;
		tCC14 = newTCC14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC14, oldTCC14, newTCC14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTCC14(TCC14CONTENT newTCC14) {
		if (newTCC14 != tCC14) {
			NotificationChain msgs = null;
			if (tCC14 != null)
				msgs = ((InternalEObject)tCC14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC14, null, msgs);
			if (newTCC14 != null)
				msgs = ((InternalEObject)newTCC14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TCCCONTENT__TCC14, null, msgs);
			msgs = basicSetTCC14(newTCC14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TCCCONTENT__TCC14, newTCC14, newTCC14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.TCCCONTENT__ANY);
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
			case V2xmlPackage.TCCCONTENT__TCC1:
				return basicSetTCC1(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC2:
				return basicSetTCC2(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC3:
				return basicSetTCC3(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC4:
				return basicSetTCC4(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC5:
				return basicSetTCC5(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC6:
				return basicSetTCC6(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC7:
				return basicSetTCC7(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC8:
				return basicSetTCC8(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC9:
				return basicSetTCC9(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC10:
				return basicSetTCC10(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC11:
				return basicSetTCC11(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC12:
				return basicSetTCC12(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC13:
				return basicSetTCC13(null, msgs);
			case V2xmlPackage.TCCCONTENT__TCC14:
				return basicSetTCC14(null, msgs);
			case V2xmlPackage.TCCCONTENT__ANY:
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
			case V2xmlPackage.TCCCONTENT__TCC1:
				return getTCC1();
			case V2xmlPackage.TCCCONTENT__TCC2:
				return getTCC2();
			case V2xmlPackage.TCCCONTENT__TCC3:
				return getTCC3();
			case V2xmlPackage.TCCCONTENT__TCC4:
				return getTCC4();
			case V2xmlPackage.TCCCONTENT__TCC5:
				return getTCC5();
			case V2xmlPackage.TCCCONTENT__TCC6:
				return getTCC6();
			case V2xmlPackage.TCCCONTENT__TCC7:
				return getTCC7();
			case V2xmlPackage.TCCCONTENT__TCC8:
				return getTCC8();
			case V2xmlPackage.TCCCONTENT__TCC9:
				return getTCC9();
			case V2xmlPackage.TCCCONTENT__TCC10:
				return getTCC10();
			case V2xmlPackage.TCCCONTENT__TCC11:
				return getTCC11();
			case V2xmlPackage.TCCCONTENT__TCC12:
				return getTCC12();
			case V2xmlPackage.TCCCONTENT__TCC13:
				return getTCC13();
			case V2xmlPackage.TCCCONTENT__TCC14:
				return getTCC14();
			case V2xmlPackage.TCCCONTENT__ANY:
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
			case V2xmlPackage.TCCCONTENT__TCC1:
				setTCC1((TCC1CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC2:
				setTCC2((TCC2CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC3:
				setTCC3((TCC3CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC4:
				setTCC4((TCC4CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC5:
				setTCC5((TCC5CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC6:
				setTCC6((TCC6CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC7:
				setTCC7((TCC7CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC8:
				setTCC8((TCC8CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC9:
				setTCC9((TCC9CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC10:
				setTCC10((TCC10CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC11:
				setTCC11((TCC11CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC12:
				setTCC12((TCC12CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC13:
				setTCC13((TCC13CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__TCC14:
				setTCC14((TCC14CONTENT)newValue);
				return;
			case V2xmlPackage.TCCCONTENT__ANY:
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
			case V2xmlPackage.TCCCONTENT__TCC1:
				setTCC1((TCC1CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC2:
				setTCC2((TCC2CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC3:
				setTCC3((TCC3CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC4:
				setTCC4((TCC4CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC5:
				setTCC5((TCC5CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC6:
				setTCC6((TCC6CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC7:
				setTCC7((TCC7CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC8:
				setTCC8((TCC8CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC9:
				setTCC9((TCC9CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC10:
				setTCC10((TCC10CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC11:
				setTCC11((TCC11CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC12:
				setTCC12((TCC12CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC13:
				setTCC13((TCC13CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__TCC14:
				setTCC14((TCC14CONTENT)null);
				return;
			case V2xmlPackage.TCCCONTENT__ANY:
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
			case V2xmlPackage.TCCCONTENT__TCC1:
				return tCC1 != null;
			case V2xmlPackage.TCCCONTENT__TCC2:
				return tCC2 != null;
			case V2xmlPackage.TCCCONTENT__TCC3:
				return tCC3 != null;
			case V2xmlPackage.TCCCONTENT__TCC4:
				return tCC4 != null;
			case V2xmlPackage.TCCCONTENT__TCC5:
				return tCC5 != null;
			case V2xmlPackage.TCCCONTENT__TCC6:
				return tCC6 != null;
			case V2xmlPackage.TCCCONTENT__TCC7:
				return tCC7 != null;
			case V2xmlPackage.TCCCONTENT__TCC8:
				return tCC8 != null;
			case V2xmlPackage.TCCCONTENT__TCC9:
				return tCC9 != null;
			case V2xmlPackage.TCCCONTENT__TCC10:
				return tCC10 != null;
			case V2xmlPackage.TCCCONTENT__TCC11:
				return tCC11 != null;
			case V2xmlPackage.TCCCONTENT__TCC12:
				return tCC12 != null;
			case V2xmlPackage.TCCCONTENT__TCC13:
				return tCC13 != null;
			case V2xmlPackage.TCCCONTENT__TCC14:
				return tCC14 != null;
			case V2xmlPackage.TCCCONTENT__ANY:
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

} //TCCCONTENTImpl
