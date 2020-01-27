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

import org.hl7.v2xml.ACC10CONTENT;
import org.hl7.v2xml.ACC11CONTENT;
import org.hl7.v2xml.ACC1CONTENT;
import org.hl7.v2xml.ACC2CONTENT;
import org.hl7.v2xml.ACC3CONTENT;
import org.hl7.v2xml.ACC4CONTENT;
import org.hl7.v2xml.ACC5CONTENT;
import org.hl7.v2xml.ACC6CONTENT;
import org.hl7.v2xml.ACC7CONTENT;
import org.hl7.v2xml.ACC8CONTENT;
import org.hl7.v2xml.ACC9CONTENT;
import org.hl7.v2xml.ACCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC1 <em>ACC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC2 <em>ACC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC3 <em>ACC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC4 <em>ACC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC5 <em>ACC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC6 <em>ACC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC7 <em>ACC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC8 <em>ACC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC9 <em>ACC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC10 <em>ACC10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getACC11 <em>ACC11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ACCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACCCONTENTImpl extends EObjectImpl implements ACCCONTENT {
	/**
	 * The cached value of the '{@link #getACC1() <em>ACC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC1()
	 * @generated
	 * @ordered
	 */
	protected ACC1CONTENT aCC1;

	/**
	 * The cached value of the '{@link #getACC2() <em>ACC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC2()
	 * @generated
	 * @ordered
	 */
	protected ACC2CONTENT aCC2;

	/**
	 * The cached value of the '{@link #getACC3() <em>ACC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC3()
	 * @generated
	 * @ordered
	 */
	protected ACC3CONTENT aCC3;

	/**
	 * The cached value of the '{@link #getACC4() <em>ACC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC4()
	 * @generated
	 * @ordered
	 */
	protected ACC4CONTENT aCC4;

	/**
	 * The cached value of the '{@link #getACC5() <em>ACC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC5()
	 * @generated
	 * @ordered
	 */
	protected ACC5CONTENT aCC5;

	/**
	 * The cached value of the '{@link #getACC6() <em>ACC6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC6()
	 * @generated
	 * @ordered
	 */
	protected ACC6CONTENT aCC6;

	/**
	 * The cached value of the '{@link #getACC7() <em>ACC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC7()
	 * @generated
	 * @ordered
	 */
	protected ACC7CONTENT aCC7;

	/**
	 * The cached value of the '{@link #getACC8() <em>ACC8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC8()
	 * @generated
	 * @ordered
	 */
	protected ACC8CONTENT aCC8;

	/**
	 * The cached value of the '{@link #getACC9() <em>ACC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC9()
	 * @generated
	 * @ordered
	 */
	protected ACC9CONTENT aCC9;

	/**
	 * The cached value of the '{@link #getACC10() <em>ACC10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC10()
	 * @generated
	 * @ordered
	 */
	protected ACC10CONTENT aCC10;

	/**
	 * The cached value of the '{@link #getACC11() <em>ACC11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACC11()
	 * @generated
	 * @ordered
	 */
	protected ACC11CONTENT aCC11;

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
	protected ACCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getACCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC1CONTENT getACC1() {
		return aCC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC1(ACC1CONTENT newACC1, NotificationChain msgs) {
		ACC1CONTENT oldACC1 = aCC1;
		aCC1 = newACC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC1, oldACC1, newACC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC1(ACC1CONTENT newACC1) {
		if (newACC1 != aCC1) {
			NotificationChain msgs = null;
			if (aCC1 != null)
				msgs = ((InternalEObject)aCC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC1, null, msgs);
			if (newACC1 != null)
				msgs = ((InternalEObject)newACC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC1, null, msgs);
			msgs = basicSetACC1(newACC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC1, newACC1, newACC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC2CONTENT getACC2() {
		return aCC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC2(ACC2CONTENT newACC2, NotificationChain msgs) {
		ACC2CONTENT oldACC2 = aCC2;
		aCC2 = newACC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC2, oldACC2, newACC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC2(ACC2CONTENT newACC2) {
		if (newACC2 != aCC2) {
			NotificationChain msgs = null;
			if (aCC2 != null)
				msgs = ((InternalEObject)aCC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC2, null, msgs);
			if (newACC2 != null)
				msgs = ((InternalEObject)newACC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC2, null, msgs);
			msgs = basicSetACC2(newACC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC2, newACC2, newACC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC3CONTENT getACC3() {
		return aCC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC3(ACC3CONTENT newACC3, NotificationChain msgs) {
		ACC3CONTENT oldACC3 = aCC3;
		aCC3 = newACC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC3, oldACC3, newACC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC3(ACC3CONTENT newACC3) {
		if (newACC3 != aCC3) {
			NotificationChain msgs = null;
			if (aCC3 != null)
				msgs = ((InternalEObject)aCC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC3, null, msgs);
			if (newACC3 != null)
				msgs = ((InternalEObject)newACC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC3, null, msgs);
			msgs = basicSetACC3(newACC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC3, newACC3, newACC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC4CONTENT getACC4() {
		return aCC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC4(ACC4CONTENT newACC4, NotificationChain msgs) {
		ACC4CONTENT oldACC4 = aCC4;
		aCC4 = newACC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC4, oldACC4, newACC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC4(ACC4CONTENT newACC4) {
		if (newACC4 != aCC4) {
			NotificationChain msgs = null;
			if (aCC4 != null)
				msgs = ((InternalEObject)aCC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC4, null, msgs);
			if (newACC4 != null)
				msgs = ((InternalEObject)newACC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC4, null, msgs);
			msgs = basicSetACC4(newACC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC4, newACC4, newACC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC5CONTENT getACC5() {
		return aCC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC5(ACC5CONTENT newACC5, NotificationChain msgs) {
		ACC5CONTENT oldACC5 = aCC5;
		aCC5 = newACC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC5, oldACC5, newACC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC5(ACC5CONTENT newACC5) {
		if (newACC5 != aCC5) {
			NotificationChain msgs = null;
			if (aCC5 != null)
				msgs = ((InternalEObject)aCC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC5, null, msgs);
			if (newACC5 != null)
				msgs = ((InternalEObject)newACC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC5, null, msgs);
			msgs = basicSetACC5(newACC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC5, newACC5, newACC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC6CONTENT getACC6() {
		return aCC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC6(ACC6CONTENT newACC6, NotificationChain msgs) {
		ACC6CONTENT oldACC6 = aCC6;
		aCC6 = newACC6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC6, oldACC6, newACC6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC6(ACC6CONTENT newACC6) {
		if (newACC6 != aCC6) {
			NotificationChain msgs = null;
			if (aCC6 != null)
				msgs = ((InternalEObject)aCC6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC6, null, msgs);
			if (newACC6 != null)
				msgs = ((InternalEObject)newACC6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC6, null, msgs);
			msgs = basicSetACC6(newACC6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC6, newACC6, newACC6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC7CONTENT getACC7() {
		return aCC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC7(ACC7CONTENT newACC7, NotificationChain msgs) {
		ACC7CONTENT oldACC7 = aCC7;
		aCC7 = newACC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC7, oldACC7, newACC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC7(ACC7CONTENT newACC7) {
		if (newACC7 != aCC7) {
			NotificationChain msgs = null;
			if (aCC7 != null)
				msgs = ((InternalEObject)aCC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC7, null, msgs);
			if (newACC7 != null)
				msgs = ((InternalEObject)newACC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC7, null, msgs);
			msgs = basicSetACC7(newACC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC7, newACC7, newACC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC8CONTENT getACC8() {
		return aCC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC8(ACC8CONTENT newACC8, NotificationChain msgs) {
		ACC8CONTENT oldACC8 = aCC8;
		aCC8 = newACC8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC8, oldACC8, newACC8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC8(ACC8CONTENT newACC8) {
		if (newACC8 != aCC8) {
			NotificationChain msgs = null;
			if (aCC8 != null)
				msgs = ((InternalEObject)aCC8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC8, null, msgs);
			if (newACC8 != null)
				msgs = ((InternalEObject)newACC8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC8, null, msgs);
			msgs = basicSetACC8(newACC8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC8, newACC8, newACC8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC9CONTENT getACC9() {
		return aCC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC9(ACC9CONTENT newACC9, NotificationChain msgs) {
		ACC9CONTENT oldACC9 = aCC9;
		aCC9 = newACC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC9, oldACC9, newACC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC9(ACC9CONTENT newACC9) {
		if (newACC9 != aCC9) {
			NotificationChain msgs = null;
			if (aCC9 != null)
				msgs = ((InternalEObject)aCC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC9, null, msgs);
			if (newACC9 != null)
				msgs = ((InternalEObject)newACC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC9, null, msgs);
			msgs = basicSetACC9(newACC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC9, newACC9, newACC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC10CONTENT getACC10() {
		return aCC10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC10(ACC10CONTENT newACC10, NotificationChain msgs) {
		ACC10CONTENT oldACC10 = aCC10;
		aCC10 = newACC10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC10, oldACC10, newACC10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC10(ACC10CONTENT newACC10) {
		if (newACC10 != aCC10) {
			NotificationChain msgs = null;
			if (aCC10 != null)
				msgs = ((InternalEObject)aCC10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC10, null, msgs);
			if (newACC10 != null)
				msgs = ((InternalEObject)newACC10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC10, null, msgs);
			msgs = basicSetACC10(newACC10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC10, newACC10, newACC10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACC11CONTENT getACC11() {
		return aCC11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACC11(ACC11CONTENT newACC11, NotificationChain msgs) {
		ACC11CONTENT oldACC11 = aCC11;
		aCC11 = newACC11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC11, oldACC11, newACC11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACC11(ACC11CONTENT newACC11) {
		if (newACC11 != aCC11) {
			NotificationChain msgs = null;
			if (aCC11 != null)
				msgs = ((InternalEObject)aCC11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC11, null, msgs);
			if (newACC11 != null)
				msgs = ((InternalEObject)newACC11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ACCCONTENT__ACC11, null, msgs);
			msgs = basicSetACC11(newACC11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ACCCONTENT__ACC11, newACC11, newACC11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ACCCONTENT__ANY);
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
			case V2xmlPackage.ACCCONTENT__ACC1:
				return basicSetACC1(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC2:
				return basicSetACC2(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC3:
				return basicSetACC3(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC4:
				return basicSetACC4(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC5:
				return basicSetACC5(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC6:
				return basicSetACC6(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC7:
				return basicSetACC7(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC8:
				return basicSetACC8(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC9:
				return basicSetACC9(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC10:
				return basicSetACC10(null, msgs);
			case V2xmlPackage.ACCCONTENT__ACC11:
				return basicSetACC11(null, msgs);
			case V2xmlPackage.ACCCONTENT__ANY:
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
			case V2xmlPackage.ACCCONTENT__ACC1:
				return getACC1();
			case V2xmlPackage.ACCCONTENT__ACC2:
				return getACC2();
			case V2xmlPackage.ACCCONTENT__ACC3:
				return getACC3();
			case V2xmlPackage.ACCCONTENT__ACC4:
				return getACC4();
			case V2xmlPackage.ACCCONTENT__ACC5:
				return getACC5();
			case V2xmlPackage.ACCCONTENT__ACC6:
				return getACC6();
			case V2xmlPackage.ACCCONTENT__ACC7:
				return getACC7();
			case V2xmlPackage.ACCCONTENT__ACC8:
				return getACC8();
			case V2xmlPackage.ACCCONTENT__ACC9:
				return getACC9();
			case V2xmlPackage.ACCCONTENT__ACC10:
				return getACC10();
			case V2xmlPackage.ACCCONTENT__ACC11:
				return getACC11();
			case V2xmlPackage.ACCCONTENT__ANY:
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
			case V2xmlPackage.ACCCONTENT__ACC1:
				setACC1((ACC1CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC2:
				setACC2((ACC2CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC3:
				setACC3((ACC3CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC4:
				setACC4((ACC4CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC5:
				setACC5((ACC5CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC6:
				setACC6((ACC6CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC7:
				setACC7((ACC7CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC8:
				setACC8((ACC8CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC9:
				setACC9((ACC9CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC10:
				setACC10((ACC10CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ACC11:
				setACC11((ACC11CONTENT)newValue);
				return;
			case V2xmlPackage.ACCCONTENT__ANY:
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
			case V2xmlPackage.ACCCONTENT__ACC1:
				setACC1((ACC1CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC2:
				setACC2((ACC2CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC3:
				setACC3((ACC3CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC4:
				setACC4((ACC4CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC5:
				setACC5((ACC5CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC6:
				setACC6((ACC6CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC7:
				setACC7((ACC7CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC8:
				setACC8((ACC8CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC9:
				setACC9((ACC9CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC10:
				setACC10((ACC10CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ACC11:
				setACC11((ACC11CONTENT)null);
				return;
			case V2xmlPackage.ACCCONTENT__ANY:
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
			case V2xmlPackage.ACCCONTENT__ACC1:
				return aCC1 != null;
			case V2xmlPackage.ACCCONTENT__ACC2:
				return aCC2 != null;
			case V2xmlPackage.ACCCONTENT__ACC3:
				return aCC3 != null;
			case V2xmlPackage.ACCCONTENT__ACC4:
				return aCC4 != null;
			case V2xmlPackage.ACCCONTENT__ACC5:
				return aCC5 != null;
			case V2xmlPackage.ACCCONTENT__ACC6:
				return aCC6 != null;
			case V2xmlPackage.ACCCONTENT__ACC7:
				return aCC7 != null;
			case V2xmlPackage.ACCCONTENT__ACC8:
				return aCC8 != null;
			case V2xmlPackage.ACCCONTENT__ACC9:
				return aCC9 != null;
			case V2xmlPackage.ACCCONTENT__ACC10:
				return aCC10 != null;
			case V2xmlPackage.ACCCONTENT__ACC11:
				return aCC11 != null;
			case V2xmlPackage.ACCCONTENT__ANY:
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

} //ACCCONTENTImpl
