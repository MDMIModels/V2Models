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

import org.hl7.v2xml.DRG10CONTENT;
import org.hl7.v2xml.DRG11CONTENT;
import org.hl7.v2xml.DRG1CONTENT;
import org.hl7.v2xml.DRG2CONTENT;
import org.hl7.v2xml.DRG3CONTENT;
import org.hl7.v2xml.DRG4CONTENT;
import org.hl7.v2xml.DRG5CONTENT;
import org.hl7.v2xml.DRG6CONTENT;
import org.hl7.v2xml.DRG7CONTENT;
import org.hl7.v2xml.DRG8CONTENT;
import org.hl7.v2xml.DRG9CONTENT;
import org.hl7.v2xml.DRGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DRGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG1 <em>DRG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG2 <em>DRG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG3 <em>DRG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG4 <em>DRG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG5 <em>DRG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG6 <em>DRG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG7 <em>DRG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG8 <em>DRG8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG9 <em>DRG9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG10 <em>DRG10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getDRG11 <em>DRG11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.DRGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DRGCONTENTImpl extends EObjectImpl implements DRGCONTENT {
	/**
	 * The cached value of the '{@link #getDRG1() <em>DRG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG1()
	 * @generated
	 * @ordered
	 */
	protected DRG1CONTENT dRG1;

	/**
	 * The cached value of the '{@link #getDRG2() <em>DRG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG2()
	 * @generated
	 * @ordered
	 */
	protected DRG2CONTENT dRG2;

	/**
	 * The cached value of the '{@link #getDRG3() <em>DRG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG3()
	 * @generated
	 * @ordered
	 */
	protected DRG3CONTENT dRG3;

	/**
	 * The cached value of the '{@link #getDRG4() <em>DRG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG4()
	 * @generated
	 * @ordered
	 */
	protected DRG4CONTENT dRG4;

	/**
	 * The cached value of the '{@link #getDRG5() <em>DRG5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG5()
	 * @generated
	 * @ordered
	 */
	protected DRG5CONTENT dRG5;

	/**
	 * The cached value of the '{@link #getDRG6() <em>DRG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG6()
	 * @generated
	 * @ordered
	 */
	protected DRG6CONTENT dRG6;

	/**
	 * The cached value of the '{@link #getDRG7() <em>DRG7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG7()
	 * @generated
	 * @ordered
	 */
	protected DRG7CONTENT dRG7;

	/**
	 * The cached value of the '{@link #getDRG8() <em>DRG8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG8()
	 * @generated
	 * @ordered
	 */
	protected DRG8CONTENT dRG8;

	/**
	 * The cached value of the '{@link #getDRG9() <em>DRG9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG9()
	 * @generated
	 * @ordered
	 */
	protected DRG9CONTENT dRG9;

	/**
	 * The cached value of the '{@link #getDRG10() <em>DRG10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG10()
	 * @generated
	 * @ordered
	 */
	protected DRG10CONTENT dRG10;

	/**
	 * The cached value of the '{@link #getDRG11() <em>DRG11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDRG11()
	 * @generated
	 * @ordered
	 */
	protected DRG11CONTENT dRG11;

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
	protected DRGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getDRGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG1CONTENT getDRG1() {
		return dRG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG1(DRG1CONTENT newDRG1, NotificationChain msgs) {
		DRG1CONTENT oldDRG1 = dRG1;
		dRG1 = newDRG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG1, oldDRG1, newDRG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG1(DRG1CONTENT newDRG1) {
		if (newDRG1 != dRG1) {
			NotificationChain msgs = null;
			if (dRG1 != null)
				msgs = ((InternalEObject)dRG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG1, null, msgs);
			if (newDRG1 != null)
				msgs = ((InternalEObject)newDRG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG1, null, msgs);
			msgs = basicSetDRG1(newDRG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG1, newDRG1, newDRG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG2CONTENT getDRG2() {
		return dRG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG2(DRG2CONTENT newDRG2, NotificationChain msgs) {
		DRG2CONTENT oldDRG2 = dRG2;
		dRG2 = newDRG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG2, oldDRG2, newDRG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG2(DRG2CONTENT newDRG2) {
		if (newDRG2 != dRG2) {
			NotificationChain msgs = null;
			if (dRG2 != null)
				msgs = ((InternalEObject)dRG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG2, null, msgs);
			if (newDRG2 != null)
				msgs = ((InternalEObject)newDRG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG2, null, msgs);
			msgs = basicSetDRG2(newDRG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG2, newDRG2, newDRG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG3CONTENT getDRG3() {
		return dRG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG3(DRG3CONTENT newDRG3, NotificationChain msgs) {
		DRG3CONTENT oldDRG3 = dRG3;
		dRG3 = newDRG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG3, oldDRG3, newDRG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG3(DRG3CONTENT newDRG3) {
		if (newDRG3 != dRG3) {
			NotificationChain msgs = null;
			if (dRG3 != null)
				msgs = ((InternalEObject)dRG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG3, null, msgs);
			if (newDRG3 != null)
				msgs = ((InternalEObject)newDRG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG3, null, msgs);
			msgs = basicSetDRG3(newDRG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG3, newDRG3, newDRG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG4CONTENT getDRG4() {
		return dRG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG4(DRG4CONTENT newDRG4, NotificationChain msgs) {
		DRG4CONTENT oldDRG4 = dRG4;
		dRG4 = newDRG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG4, oldDRG4, newDRG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG4(DRG4CONTENT newDRG4) {
		if (newDRG4 != dRG4) {
			NotificationChain msgs = null;
			if (dRG4 != null)
				msgs = ((InternalEObject)dRG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG4, null, msgs);
			if (newDRG4 != null)
				msgs = ((InternalEObject)newDRG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG4, null, msgs);
			msgs = basicSetDRG4(newDRG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG4, newDRG4, newDRG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG5CONTENT getDRG5() {
		return dRG5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG5(DRG5CONTENT newDRG5, NotificationChain msgs) {
		DRG5CONTENT oldDRG5 = dRG5;
		dRG5 = newDRG5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG5, oldDRG5, newDRG5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG5(DRG5CONTENT newDRG5) {
		if (newDRG5 != dRG5) {
			NotificationChain msgs = null;
			if (dRG5 != null)
				msgs = ((InternalEObject)dRG5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG5, null, msgs);
			if (newDRG5 != null)
				msgs = ((InternalEObject)newDRG5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG5, null, msgs);
			msgs = basicSetDRG5(newDRG5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG5, newDRG5, newDRG5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG6CONTENT getDRG6() {
		return dRG6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG6(DRG6CONTENT newDRG6, NotificationChain msgs) {
		DRG6CONTENT oldDRG6 = dRG6;
		dRG6 = newDRG6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG6, oldDRG6, newDRG6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG6(DRG6CONTENT newDRG6) {
		if (newDRG6 != dRG6) {
			NotificationChain msgs = null;
			if (dRG6 != null)
				msgs = ((InternalEObject)dRG6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG6, null, msgs);
			if (newDRG6 != null)
				msgs = ((InternalEObject)newDRG6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG6, null, msgs);
			msgs = basicSetDRG6(newDRG6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG6, newDRG6, newDRG6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG7CONTENT getDRG7() {
		return dRG7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG7(DRG7CONTENT newDRG7, NotificationChain msgs) {
		DRG7CONTENT oldDRG7 = dRG7;
		dRG7 = newDRG7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG7, oldDRG7, newDRG7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG7(DRG7CONTENT newDRG7) {
		if (newDRG7 != dRG7) {
			NotificationChain msgs = null;
			if (dRG7 != null)
				msgs = ((InternalEObject)dRG7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG7, null, msgs);
			if (newDRG7 != null)
				msgs = ((InternalEObject)newDRG7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG7, null, msgs);
			msgs = basicSetDRG7(newDRG7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG7, newDRG7, newDRG7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG8CONTENT getDRG8() {
		return dRG8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG8(DRG8CONTENT newDRG8, NotificationChain msgs) {
		DRG8CONTENT oldDRG8 = dRG8;
		dRG8 = newDRG8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG8, oldDRG8, newDRG8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG8(DRG8CONTENT newDRG8) {
		if (newDRG8 != dRG8) {
			NotificationChain msgs = null;
			if (dRG8 != null)
				msgs = ((InternalEObject)dRG8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG8, null, msgs);
			if (newDRG8 != null)
				msgs = ((InternalEObject)newDRG8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG8, null, msgs);
			msgs = basicSetDRG8(newDRG8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG8, newDRG8, newDRG8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG9CONTENT getDRG9() {
		return dRG9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG9(DRG9CONTENT newDRG9, NotificationChain msgs) {
		DRG9CONTENT oldDRG9 = dRG9;
		dRG9 = newDRG9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG9, oldDRG9, newDRG9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG9(DRG9CONTENT newDRG9) {
		if (newDRG9 != dRG9) {
			NotificationChain msgs = null;
			if (dRG9 != null)
				msgs = ((InternalEObject)dRG9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG9, null, msgs);
			if (newDRG9 != null)
				msgs = ((InternalEObject)newDRG9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG9, null, msgs);
			msgs = basicSetDRG9(newDRG9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG9, newDRG9, newDRG9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG10CONTENT getDRG10() {
		return dRG10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG10(DRG10CONTENT newDRG10, NotificationChain msgs) {
		DRG10CONTENT oldDRG10 = dRG10;
		dRG10 = newDRG10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG10, oldDRG10, newDRG10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG10(DRG10CONTENT newDRG10) {
		if (newDRG10 != dRG10) {
			NotificationChain msgs = null;
			if (dRG10 != null)
				msgs = ((InternalEObject)dRG10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG10, null, msgs);
			if (newDRG10 != null)
				msgs = ((InternalEObject)newDRG10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG10, null, msgs);
			msgs = basicSetDRG10(newDRG10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG10, newDRG10, newDRG10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DRG11CONTENT getDRG11() {
		return dRG11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDRG11(DRG11CONTENT newDRG11, NotificationChain msgs) {
		DRG11CONTENT oldDRG11 = dRG11;
		dRG11 = newDRG11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG11, oldDRG11, newDRG11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDRG11(DRG11CONTENT newDRG11) {
		if (newDRG11 != dRG11) {
			NotificationChain msgs = null;
			if (dRG11 != null)
				msgs = ((InternalEObject)dRG11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG11, null, msgs);
			if (newDRG11 != null)
				msgs = ((InternalEObject)newDRG11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.DRGCONTENT__DRG11, null, msgs);
			msgs = basicSetDRG11(newDRG11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.DRGCONTENT__DRG11, newDRG11, newDRG11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.DRGCONTENT__ANY);
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
			case V2xmlPackage.DRGCONTENT__DRG1:
				return basicSetDRG1(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG2:
				return basicSetDRG2(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG3:
				return basicSetDRG3(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG4:
				return basicSetDRG4(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG5:
				return basicSetDRG5(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG6:
				return basicSetDRG6(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG7:
				return basicSetDRG7(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG8:
				return basicSetDRG8(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG9:
				return basicSetDRG9(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG10:
				return basicSetDRG10(null, msgs);
			case V2xmlPackage.DRGCONTENT__DRG11:
				return basicSetDRG11(null, msgs);
			case V2xmlPackage.DRGCONTENT__ANY:
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
			case V2xmlPackage.DRGCONTENT__DRG1:
				return getDRG1();
			case V2xmlPackage.DRGCONTENT__DRG2:
				return getDRG2();
			case V2xmlPackage.DRGCONTENT__DRG3:
				return getDRG3();
			case V2xmlPackage.DRGCONTENT__DRG4:
				return getDRG4();
			case V2xmlPackage.DRGCONTENT__DRG5:
				return getDRG5();
			case V2xmlPackage.DRGCONTENT__DRG6:
				return getDRG6();
			case V2xmlPackage.DRGCONTENT__DRG7:
				return getDRG7();
			case V2xmlPackage.DRGCONTENT__DRG8:
				return getDRG8();
			case V2xmlPackage.DRGCONTENT__DRG9:
				return getDRG9();
			case V2xmlPackage.DRGCONTENT__DRG10:
				return getDRG10();
			case V2xmlPackage.DRGCONTENT__DRG11:
				return getDRG11();
			case V2xmlPackage.DRGCONTENT__ANY:
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
			case V2xmlPackage.DRGCONTENT__DRG1:
				setDRG1((DRG1CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG2:
				setDRG2((DRG2CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG3:
				setDRG3((DRG3CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG4:
				setDRG4((DRG4CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG5:
				setDRG5((DRG5CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG6:
				setDRG6((DRG6CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG7:
				setDRG7((DRG7CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG8:
				setDRG8((DRG8CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG9:
				setDRG9((DRG9CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG10:
				setDRG10((DRG10CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__DRG11:
				setDRG11((DRG11CONTENT)newValue);
				return;
			case V2xmlPackage.DRGCONTENT__ANY:
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
			case V2xmlPackage.DRGCONTENT__DRG1:
				setDRG1((DRG1CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG2:
				setDRG2((DRG2CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG3:
				setDRG3((DRG3CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG4:
				setDRG4((DRG4CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG5:
				setDRG5((DRG5CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG6:
				setDRG6((DRG6CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG7:
				setDRG7((DRG7CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG8:
				setDRG8((DRG8CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG9:
				setDRG9((DRG9CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG10:
				setDRG10((DRG10CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__DRG11:
				setDRG11((DRG11CONTENT)null);
				return;
			case V2xmlPackage.DRGCONTENT__ANY:
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
			case V2xmlPackage.DRGCONTENT__DRG1:
				return dRG1 != null;
			case V2xmlPackage.DRGCONTENT__DRG2:
				return dRG2 != null;
			case V2xmlPackage.DRGCONTENT__DRG3:
				return dRG3 != null;
			case V2xmlPackage.DRGCONTENT__DRG4:
				return dRG4 != null;
			case V2xmlPackage.DRGCONTENT__DRG5:
				return dRG5 != null;
			case V2xmlPackage.DRGCONTENT__DRG6:
				return dRG6 != null;
			case V2xmlPackage.DRGCONTENT__DRG7:
				return dRG7 != null;
			case V2xmlPackage.DRGCONTENT__DRG8:
				return dRG8 != null;
			case V2xmlPackage.DRGCONTENT__DRG9:
				return dRG9 != null;
			case V2xmlPackage.DRGCONTENT__DRG10:
				return dRG10 != null;
			case V2xmlPackage.DRGCONTENT__DRG11:
				return dRG11 != null;
			case V2xmlPackage.DRGCONTENT__ANY:
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

} //DRGCONTENTImpl
