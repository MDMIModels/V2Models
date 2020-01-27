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

import org.hl7.v2xml.ORG10CONTENT;
import org.hl7.v2xml.ORG11CONTENT;
import org.hl7.v2xml.ORG12CONTENT;
import org.hl7.v2xml.ORG1CONTENT;
import org.hl7.v2xml.ORG2CONTENT;
import org.hl7.v2xml.ORG3CONTENT;
import org.hl7.v2xml.ORG4CONTENT;
import org.hl7.v2xml.ORG5CONTENT;
import org.hl7.v2xml.ORG6CONTENT;
import org.hl7.v2xml.ORG7CONTENT;
import org.hl7.v2xml.ORG8CONTENT;
import org.hl7.v2xml.ORG9CONTENT;
import org.hl7.v2xml.ORGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ORGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG1 <em>ORG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG2 <em>ORG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG3 <em>ORG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG4 <em>ORG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG5 <em>ORG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG6 <em>ORG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG7 <em>ORG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG8 <em>ORG8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG9 <em>ORG9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG10 <em>ORG10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG11 <em>ORG11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getORG12 <em>ORG12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ORGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ORGCONTENTImpl extends EObjectImpl implements ORGCONTENT {
	/**
	 * The cached value of the '{@link #getORG1() <em>ORG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG1()
	 * @generated
	 * @ordered
	 */
	protected ORG1CONTENT oRG1;

	/**
	 * The cached value of the '{@link #getORG2() <em>ORG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG2()
	 * @generated
	 * @ordered
	 */
	protected ORG2CONTENT oRG2;

	/**
	 * The cached value of the '{@link #getORG3() <em>ORG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG3()
	 * @generated
	 * @ordered
	 */
	protected ORG3CONTENT oRG3;

	/**
	 * The cached value of the '{@link #getORG4() <em>ORG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG4()
	 * @generated
	 * @ordered
	 */
	protected ORG4CONTENT oRG4;

	/**
	 * The cached value of the '{@link #getORG5() <em>ORG5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG5()
	 * @generated
	 * @ordered
	 */
	protected ORG5CONTENT oRG5;

	/**
	 * The cached value of the '{@link #getORG6() <em>ORG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG6()
	 * @generated
	 * @ordered
	 */
	protected ORG6CONTENT oRG6;

	/**
	 * The cached value of the '{@link #getORG7() <em>ORG7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG7()
	 * @generated
	 * @ordered
	 */
	protected ORG7CONTENT oRG7;

	/**
	 * The cached value of the '{@link #getORG8() <em>ORG8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG8()
	 * @generated
	 * @ordered
	 */
	protected ORG8CONTENT oRG8;

	/**
	 * The cached value of the '{@link #getORG9() <em>ORG9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG9()
	 * @generated
	 * @ordered
	 */
	protected ORG9CONTENT oRG9;

	/**
	 * The cached value of the '{@link #getORG10() <em>ORG10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG10()
	 * @generated
	 * @ordered
	 */
	protected ORG10CONTENT oRG10;

	/**
	 * The cached value of the '{@link #getORG11() <em>ORG11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG11()
	 * @generated
	 * @ordered
	 */
	protected ORG11CONTENT oRG11;

	/**
	 * The cached value of the '{@link #getORG12() <em>ORG12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getORG12()
	 * @generated
	 * @ordered
	 */
	protected ORG12CONTENT oRG12;

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
	protected ORGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getORGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG1CONTENT getORG1() {
		return oRG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG1(ORG1CONTENT newORG1, NotificationChain msgs) {
		ORG1CONTENT oldORG1 = oRG1;
		oRG1 = newORG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG1, oldORG1, newORG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG1(ORG1CONTENT newORG1) {
		if (newORG1 != oRG1) {
			NotificationChain msgs = null;
			if (oRG1 != null)
				msgs = ((InternalEObject)oRG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG1, null, msgs);
			if (newORG1 != null)
				msgs = ((InternalEObject)newORG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG1, null, msgs);
			msgs = basicSetORG1(newORG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG1, newORG1, newORG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG2CONTENT getORG2() {
		return oRG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG2(ORG2CONTENT newORG2, NotificationChain msgs) {
		ORG2CONTENT oldORG2 = oRG2;
		oRG2 = newORG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG2, oldORG2, newORG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG2(ORG2CONTENT newORG2) {
		if (newORG2 != oRG2) {
			NotificationChain msgs = null;
			if (oRG2 != null)
				msgs = ((InternalEObject)oRG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG2, null, msgs);
			if (newORG2 != null)
				msgs = ((InternalEObject)newORG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG2, null, msgs);
			msgs = basicSetORG2(newORG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG2, newORG2, newORG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG3CONTENT getORG3() {
		return oRG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG3(ORG3CONTENT newORG3, NotificationChain msgs) {
		ORG3CONTENT oldORG3 = oRG3;
		oRG3 = newORG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG3, oldORG3, newORG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG3(ORG3CONTENT newORG3) {
		if (newORG3 != oRG3) {
			NotificationChain msgs = null;
			if (oRG3 != null)
				msgs = ((InternalEObject)oRG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG3, null, msgs);
			if (newORG3 != null)
				msgs = ((InternalEObject)newORG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG3, null, msgs);
			msgs = basicSetORG3(newORG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG3, newORG3, newORG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG4CONTENT getORG4() {
		return oRG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG4(ORG4CONTENT newORG4, NotificationChain msgs) {
		ORG4CONTENT oldORG4 = oRG4;
		oRG4 = newORG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG4, oldORG4, newORG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG4(ORG4CONTENT newORG4) {
		if (newORG4 != oRG4) {
			NotificationChain msgs = null;
			if (oRG4 != null)
				msgs = ((InternalEObject)oRG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG4, null, msgs);
			if (newORG4 != null)
				msgs = ((InternalEObject)newORG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG4, null, msgs);
			msgs = basicSetORG4(newORG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG4, newORG4, newORG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG5CONTENT getORG5() {
		return oRG5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG5(ORG5CONTENT newORG5, NotificationChain msgs) {
		ORG5CONTENT oldORG5 = oRG5;
		oRG5 = newORG5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG5, oldORG5, newORG5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG5(ORG5CONTENT newORG5) {
		if (newORG5 != oRG5) {
			NotificationChain msgs = null;
			if (oRG5 != null)
				msgs = ((InternalEObject)oRG5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG5, null, msgs);
			if (newORG5 != null)
				msgs = ((InternalEObject)newORG5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG5, null, msgs);
			msgs = basicSetORG5(newORG5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG5, newORG5, newORG5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG6CONTENT getORG6() {
		return oRG6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG6(ORG6CONTENT newORG6, NotificationChain msgs) {
		ORG6CONTENT oldORG6 = oRG6;
		oRG6 = newORG6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG6, oldORG6, newORG6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG6(ORG6CONTENT newORG6) {
		if (newORG6 != oRG6) {
			NotificationChain msgs = null;
			if (oRG6 != null)
				msgs = ((InternalEObject)oRG6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG6, null, msgs);
			if (newORG6 != null)
				msgs = ((InternalEObject)newORG6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG6, null, msgs);
			msgs = basicSetORG6(newORG6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG6, newORG6, newORG6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG7CONTENT getORG7() {
		return oRG7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG7(ORG7CONTENT newORG7, NotificationChain msgs) {
		ORG7CONTENT oldORG7 = oRG7;
		oRG7 = newORG7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG7, oldORG7, newORG7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG7(ORG7CONTENT newORG7) {
		if (newORG7 != oRG7) {
			NotificationChain msgs = null;
			if (oRG7 != null)
				msgs = ((InternalEObject)oRG7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG7, null, msgs);
			if (newORG7 != null)
				msgs = ((InternalEObject)newORG7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG7, null, msgs);
			msgs = basicSetORG7(newORG7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG7, newORG7, newORG7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG8CONTENT getORG8() {
		return oRG8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG8(ORG8CONTENT newORG8, NotificationChain msgs) {
		ORG8CONTENT oldORG8 = oRG8;
		oRG8 = newORG8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG8, oldORG8, newORG8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG8(ORG8CONTENT newORG8) {
		if (newORG8 != oRG8) {
			NotificationChain msgs = null;
			if (oRG8 != null)
				msgs = ((InternalEObject)oRG8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG8, null, msgs);
			if (newORG8 != null)
				msgs = ((InternalEObject)newORG8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG8, null, msgs);
			msgs = basicSetORG8(newORG8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG8, newORG8, newORG8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG9CONTENT getORG9() {
		return oRG9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG9(ORG9CONTENT newORG9, NotificationChain msgs) {
		ORG9CONTENT oldORG9 = oRG9;
		oRG9 = newORG9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG9, oldORG9, newORG9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG9(ORG9CONTENT newORG9) {
		if (newORG9 != oRG9) {
			NotificationChain msgs = null;
			if (oRG9 != null)
				msgs = ((InternalEObject)oRG9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG9, null, msgs);
			if (newORG9 != null)
				msgs = ((InternalEObject)newORG9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG9, null, msgs);
			msgs = basicSetORG9(newORG9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG9, newORG9, newORG9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG10CONTENT getORG10() {
		return oRG10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG10(ORG10CONTENT newORG10, NotificationChain msgs) {
		ORG10CONTENT oldORG10 = oRG10;
		oRG10 = newORG10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG10, oldORG10, newORG10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG10(ORG10CONTENT newORG10) {
		if (newORG10 != oRG10) {
			NotificationChain msgs = null;
			if (oRG10 != null)
				msgs = ((InternalEObject)oRG10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG10, null, msgs);
			if (newORG10 != null)
				msgs = ((InternalEObject)newORG10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG10, null, msgs);
			msgs = basicSetORG10(newORG10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG10, newORG10, newORG10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG11CONTENT getORG11() {
		return oRG11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG11(ORG11CONTENT newORG11, NotificationChain msgs) {
		ORG11CONTENT oldORG11 = oRG11;
		oRG11 = newORG11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG11, oldORG11, newORG11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG11(ORG11CONTENT newORG11) {
		if (newORG11 != oRG11) {
			NotificationChain msgs = null;
			if (oRG11 != null)
				msgs = ((InternalEObject)oRG11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG11, null, msgs);
			if (newORG11 != null)
				msgs = ((InternalEObject)newORG11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG11, null, msgs);
			msgs = basicSetORG11(newORG11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG11, newORG11, newORG11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ORG12CONTENT getORG12() {
		return oRG12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetORG12(ORG12CONTENT newORG12, NotificationChain msgs) {
		ORG12CONTENT oldORG12 = oRG12;
		oRG12 = newORG12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG12, oldORG12, newORG12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setORG12(ORG12CONTENT newORG12) {
		if (newORG12 != oRG12) {
			NotificationChain msgs = null;
			if (oRG12 != null)
				msgs = ((InternalEObject)oRG12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG12, null, msgs);
			if (newORG12 != null)
				msgs = ((InternalEObject)newORG12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ORGCONTENT__ORG12, null, msgs);
			msgs = basicSetORG12(newORG12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ORGCONTENT__ORG12, newORG12, newORG12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ORGCONTENT__ANY);
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
			case V2xmlPackage.ORGCONTENT__ORG1:
				return basicSetORG1(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG2:
				return basicSetORG2(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG3:
				return basicSetORG3(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG4:
				return basicSetORG4(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG5:
				return basicSetORG5(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG6:
				return basicSetORG6(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG7:
				return basicSetORG7(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG8:
				return basicSetORG8(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG9:
				return basicSetORG9(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG10:
				return basicSetORG10(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG11:
				return basicSetORG11(null, msgs);
			case V2xmlPackage.ORGCONTENT__ORG12:
				return basicSetORG12(null, msgs);
			case V2xmlPackage.ORGCONTENT__ANY:
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
			case V2xmlPackage.ORGCONTENT__ORG1:
				return getORG1();
			case V2xmlPackage.ORGCONTENT__ORG2:
				return getORG2();
			case V2xmlPackage.ORGCONTENT__ORG3:
				return getORG3();
			case V2xmlPackage.ORGCONTENT__ORG4:
				return getORG4();
			case V2xmlPackage.ORGCONTENT__ORG5:
				return getORG5();
			case V2xmlPackage.ORGCONTENT__ORG6:
				return getORG6();
			case V2xmlPackage.ORGCONTENT__ORG7:
				return getORG7();
			case V2xmlPackage.ORGCONTENT__ORG8:
				return getORG8();
			case V2xmlPackage.ORGCONTENT__ORG9:
				return getORG9();
			case V2xmlPackage.ORGCONTENT__ORG10:
				return getORG10();
			case V2xmlPackage.ORGCONTENT__ORG11:
				return getORG11();
			case V2xmlPackage.ORGCONTENT__ORG12:
				return getORG12();
			case V2xmlPackage.ORGCONTENT__ANY:
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
			case V2xmlPackage.ORGCONTENT__ORG1:
				setORG1((ORG1CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG2:
				setORG2((ORG2CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG3:
				setORG3((ORG3CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG4:
				setORG4((ORG4CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG5:
				setORG5((ORG5CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG6:
				setORG6((ORG6CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG7:
				setORG7((ORG7CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG8:
				setORG8((ORG8CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG9:
				setORG9((ORG9CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG10:
				setORG10((ORG10CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG11:
				setORG11((ORG11CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ORG12:
				setORG12((ORG12CONTENT)newValue);
				return;
			case V2xmlPackage.ORGCONTENT__ANY:
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
			case V2xmlPackage.ORGCONTENT__ORG1:
				setORG1((ORG1CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG2:
				setORG2((ORG2CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG3:
				setORG3((ORG3CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG4:
				setORG4((ORG4CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG5:
				setORG5((ORG5CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG6:
				setORG6((ORG6CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG7:
				setORG7((ORG7CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG8:
				setORG8((ORG8CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG9:
				setORG9((ORG9CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG10:
				setORG10((ORG10CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG11:
				setORG11((ORG11CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ORG12:
				setORG12((ORG12CONTENT)null);
				return;
			case V2xmlPackage.ORGCONTENT__ANY:
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
			case V2xmlPackage.ORGCONTENT__ORG1:
				return oRG1 != null;
			case V2xmlPackage.ORGCONTENT__ORG2:
				return oRG2 != null;
			case V2xmlPackage.ORGCONTENT__ORG3:
				return oRG3 != null;
			case V2xmlPackage.ORGCONTENT__ORG4:
				return oRG4 != null;
			case V2xmlPackage.ORGCONTENT__ORG5:
				return oRG5 != null;
			case V2xmlPackage.ORGCONTENT__ORG6:
				return oRG6 != null;
			case V2xmlPackage.ORGCONTENT__ORG7:
				return oRG7 != null;
			case V2xmlPackage.ORGCONTENT__ORG8:
				return oRG8 != null;
			case V2xmlPackage.ORGCONTENT__ORG9:
				return oRG9 != null;
			case V2xmlPackage.ORGCONTENT__ORG10:
				return oRG10 != null;
			case V2xmlPackage.ORGCONTENT__ORG11:
				return oRG11 != null;
			case V2xmlPackage.ORGCONTENT__ORG12:
				return oRG12 != null;
			case V2xmlPackage.ORGCONTENT__ANY:
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

} //ORGCONTENTImpl
