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

import org.hl7.v2xml.FHS10CONTENT;
import org.hl7.v2xml.FHS11CONTENT;
import org.hl7.v2xml.FHS12CONTENT;
import org.hl7.v2xml.FHS1CONTENT;
import org.hl7.v2xml.FHS2CONTENT;
import org.hl7.v2xml.FHS3CONTENT;
import org.hl7.v2xml.FHS4CONTENT;
import org.hl7.v2xml.FHS5CONTENT;
import org.hl7.v2xml.FHS6CONTENT;
import org.hl7.v2xml.FHS7CONTENT;
import org.hl7.v2xml.FHS8CONTENT;
import org.hl7.v2xml.FHS9CONTENT;
import org.hl7.v2xml.FHSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FHSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS1 <em>FHS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS2 <em>FHS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS3 <em>FHS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS4 <em>FHS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS5 <em>FHS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS6 <em>FHS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS7 <em>FHS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS8 <em>FHS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS9 <em>FHS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS10 <em>FHS10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS11 <em>FHS11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getFHS12 <em>FHS12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FHSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FHSCONTENTImpl extends EObjectImpl implements FHSCONTENT {
	/**
	 * The cached value of the '{@link #getFHS1() <em>FHS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS1()
	 * @generated
	 * @ordered
	 */
	protected FHS1CONTENT fHS1;

	/**
	 * The cached value of the '{@link #getFHS2() <em>FHS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS2()
	 * @generated
	 * @ordered
	 */
	protected FHS2CONTENT fHS2;

	/**
	 * The cached value of the '{@link #getFHS3() <em>FHS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS3()
	 * @generated
	 * @ordered
	 */
	protected FHS3CONTENT fHS3;

	/**
	 * The cached value of the '{@link #getFHS4() <em>FHS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS4()
	 * @generated
	 * @ordered
	 */
	protected FHS4CONTENT fHS4;

	/**
	 * The cached value of the '{@link #getFHS5() <em>FHS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS5()
	 * @generated
	 * @ordered
	 */
	protected FHS5CONTENT fHS5;

	/**
	 * The cached value of the '{@link #getFHS6() <em>FHS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS6()
	 * @generated
	 * @ordered
	 */
	protected FHS6CONTENT fHS6;

	/**
	 * The cached value of the '{@link #getFHS7() <em>FHS7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS7()
	 * @generated
	 * @ordered
	 */
	protected FHS7CONTENT fHS7;

	/**
	 * The cached value of the '{@link #getFHS8() <em>FHS8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS8()
	 * @generated
	 * @ordered
	 */
	protected FHS8CONTENT fHS8;

	/**
	 * The cached value of the '{@link #getFHS9() <em>FHS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS9()
	 * @generated
	 * @ordered
	 */
	protected FHS9CONTENT fHS9;

	/**
	 * The cached value of the '{@link #getFHS10() <em>FHS10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS10()
	 * @generated
	 * @ordered
	 */
	protected FHS10CONTENT fHS10;

	/**
	 * The cached value of the '{@link #getFHS11() <em>FHS11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS11()
	 * @generated
	 * @ordered
	 */
	protected FHS11CONTENT fHS11;

	/**
	 * The cached value of the '{@link #getFHS12() <em>FHS12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFHS12()
	 * @generated
	 * @ordered
	 */
	protected FHS12CONTENT fHS12;

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
	protected FHSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFHSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS1CONTENT getFHS1() {
		return fHS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS1(FHS1CONTENT newFHS1, NotificationChain msgs) {
		FHS1CONTENT oldFHS1 = fHS1;
		fHS1 = newFHS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS1, oldFHS1, newFHS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS1(FHS1CONTENT newFHS1) {
		if (newFHS1 != fHS1) {
			NotificationChain msgs = null;
			if (fHS1 != null)
				msgs = ((InternalEObject)fHS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS1, null, msgs);
			if (newFHS1 != null)
				msgs = ((InternalEObject)newFHS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS1, null, msgs);
			msgs = basicSetFHS1(newFHS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS1, newFHS1, newFHS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS2CONTENT getFHS2() {
		return fHS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS2(FHS2CONTENT newFHS2, NotificationChain msgs) {
		FHS2CONTENT oldFHS2 = fHS2;
		fHS2 = newFHS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS2, oldFHS2, newFHS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS2(FHS2CONTENT newFHS2) {
		if (newFHS2 != fHS2) {
			NotificationChain msgs = null;
			if (fHS2 != null)
				msgs = ((InternalEObject)fHS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS2, null, msgs);
			if (newFHS2 != null)
				msgs = ((InternalEObject)newFHS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS2, null, msgs);
			msgs = basicSetFHS2(newFHS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS2, newFHS2, newFHS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS3CONTENT getFHS3() {
		return fHS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS3(FHS3CONTENT newFHS3, NotificationChain msgs) {
		FHS3CONTENT oldFHS3 = fHS3;
		fHS3 = newFHS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS3, oldFHS3, newFHS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS3(FHS3CONTENT newFHS3) {
		if (newFHS3 != fHS3) {
			NotificationChain msgs = null;
			if (fHS3 != null)
				msgs = ((InternalEObject)fHS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS3, null, msgs);
			if (newFHS3 != null)
				msgs = ((InternalEObject)newFHS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS3, null, msgs);
			msgs = basicSetFHS3(newFHS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS3, newFHS3, newFHS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS4CONTENT getFHS4() {
		return fHS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS4(FHS4CONTENT newFHS4, NotificationChain msgs) {
		FHS4CONTENT oldFHS4 = fHS4;
		fHS4 = newFHS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS4, oldFHS4, newFHS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS4(FHS4CONTENT newFHS4) {
		if (newFHS4 != fHS4) {
			NotificationChain msgs = null;
			if (fHS4 != null)
				msgs = ((InternalEObject)fHS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS4, null, msgs);
			if (newFHS4 != null)
				msgs = ((InternalEObject)newFHS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS4, null, msgs);
			msgs = basicSetFHS4(newFHS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS4, newFHS4, newFHS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS5CONTENT getFHS5() {
		return fHS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS5(FHS5CONTENT newFHS5, NotificationChain msgs) {
		FHS5CONTENT oldFHS5 = fHS5;
		fHS5 = newFHS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS5, oldFHS5, newFHS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS5(FHS5CONTENT newFHS5) {
		if (newFHS5 != fHS5) {
			NotificationChain msgs = null;
			if (fHS5 != null)
				msgs = ((InternalEObject)fHS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS5, null, msgs);
			if (newFHS5 != null)
				msgs = ((InternalEObject)newFHS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS5, null, msgs);
			msgs = basicSetFHS5(newFHS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS5, newFHS5, newFHS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS6CONTENT getFHS6() {
		return fHS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS6(FHS6CONTENT newFHS6, NotificationChain msgs) {
		FHS6CONTENT oldFHS6 = fHS6;
		fHS6 = newFHS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS6, oldFHS6, newFHS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS6(FHS6CONTENT newFHS6) {
		if (newFHS6 != fHS6) {
			NotificationChain msgs = null;
			if (fHS6 != null)
				msgs = ((InternalEObject)fHS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS6, null, msgs);
			if (newFHS6 != null)
				msgs = ((InternalEObject)newFHS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS6, null, msgs);
			msgs = basicSetFHS6(newFHS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS6, newFHS6, newFHS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS7CONTENT getFHS7() {
		return fHS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS7(FHS7CONTENT newFHS7, NotificationChain msgs) {
		FHS7CONTENT oldFHS7 = fHS7;
		fHS7 = newFHS7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS7, oldFHS7, newFHS7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS7(FHS7CONTENT newFHS7) {
		if (newFHS7 != fHS7) {
			NotificationChain msgs = null;
			if (fHS7 != null)
				msgs = ((InternalEObject)fHS7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS7, null, msgs);
			if (newFHS7 != null)
				msgs = ((InternalEObject)newFHS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS7, null, msgs);
			msgs = basicSetFHS7(newFHS7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS7, newFHS7, newFHS7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS8CONTENT getFHS8() {
		return fHS8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS8(FHS8CONTENT newFHS8, NotificationChain msgs) {
		FHS8CONTENT oldFHS8 = fHS8;
		fHS8 = newFHS8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS8, oldFHS8, newFHS8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS8(FHS8CONTENT newFHS8) {
		if (newFHS8 != fHS8) {
			NotificationChain msgs = null;
			if (fHS8 != null)
				msgs = ((InternalEObject)fHS8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS8, null, msgs);
			if (newFHS8 != null)
				msgs = ((InternalEObject)newFHS8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS8, null, msgs);
			msgs = basicSetFHS8(newFHS8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS8, newFHS8, newFHS8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS9CONTENT getFHS9() {
		return fHS9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS9(FHS9CONTENT newFHS9, NotificationChain msgs) {
		FHS9CONTENT oldFHS9 = fHS9;
		fHS9 = newFHS9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS9, oldFHS9, newFHS9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS9(FHS9CONTENT newFHS9) {
		if (newFHS9 != fHS9) {
			NotificationChain msgs = null;
			if (fHS9 != null)
				msgs = ((InternalEObject)fHS9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS9, null, msgs);
			if (newFHS9 != null)
				msgs = ((InternalEObject)newFHS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS9, null, msgs);
			msgs = basicSetFHS9(newFHS9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS9, newFHS9, newFHS9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS10CONTENT getFHS10() {
		return fHS10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS10(FHS10CONTENT newFHS10, NotificationChain msgs) {
		FHS10CONTENT oldFHS10 = fHS10;
		fHS10 = newFHS10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS10, oldFHS10, newFHS10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS10(FHS10CONTENT newFHS10) {
		if (newFHS10 != fHS10) {
			NotificationChain msgs = null;
			if (fHS10 != null)
				msgs = ((InternalEObject)fHS10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS10, null, msgs);
			if (newFHS10 != null)
				msgs = ((InternalEObject)newFHS10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS10, null, msgs);
			msgs = basicSetFHS10(newFHS10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS10, newFHS10, newFHS10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS11CONTENT getFHS11() {
		return fHS11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS11(FHS11CONTENT newFHS11, NotificationChain msgs) {
		FHS11CONTENT oldFHS11 = fHS11;
		fHS11 = newFHS11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS11, oldFHS11, newFHS11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS11(FHS11CONTENT newFHS11) {
		if (newFHS11 != fHS11) {
			NotificationChain msgs = null;
			if (fHS11 != null)
				msgs = ((InternalEObject)fHS11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS11, null, msgs);
			if (newFHS11 != null)
				msgs = ((InternalEObject)newFHS11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS11, null, msgs);
			msgs = basicSetFHS11(newFHS11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS11, newFHS11, newFHS11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FHS12CONTENT getFHS12() {
		return fHS12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFHS12(FHS12CONTENT newFHS12, NotificationChain msgs) {
		FHS12CONTENT oldFHS12 = fHS12;
		fHS12 = newFHS12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS12, oldFHS12, newFHS12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFHS12(FHS12CONTENT newFHS12) {
		if (newFHS12 != fHS12) {
			NotificationChain msgs = null;
			if (fHS12 != null)
				msgs = ((InternalEObject)fHS12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS12, null, msgs);
			if (newFHS12 != null)
				msgs = ((InternalEObject)newFHS12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FHSCONTENT__FHS12, null, msgs);
			msgs = basicSetFHS12(newFHS12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FHSCONTENT__FHS12, newFHS12, newFHS12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.FHSCONTENT__ANY);
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
			case V2xmlPackage.FHSCONTENT__FHS1:
				return basicSetFHS1(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS2:
				return basicSetFHS2(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS3:
				return basicSetFHS3(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS4:
				return basicSetFHS4(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS5:
				return basicSetFHS5(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS6:
				return basicSetFHS6(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS7:
				return basicSetFHS7(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS8:
				return basicSetFHS8(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS9:
				return basicSetFHS9(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS10:
				return basicSetFHS10(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS11:
				return basicSetFHS11(null, msgs);
			case V2xmlPackage.FHSCONTENT__FHS12:
				return basicSetFHS12(null, msgs);
			case V2xmlPackage.FHSCONTENT__ANY:
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
			case V2xmlPackage.FHSCONTENT__FHS1:
				return getFHS1();
			case V2xmlPackage.FHSCONTENT__FHS2:
				return getFHS2();
			case V2xmlPackage.FHSCONTENT__FHS3:
				return getFHS3();
			case V2xmlPackage.FHSCONTENT__FHS4:
				return getFHS4();
			case V2xmlPackage.FHSCONTENT__FHS5:
				return getFHS5();
			case V2xmlPackage.FHSCONTENT__FHS6:
				return getFHS6();
			case V2xmlPackage.FHSCONTENT__FHS7:
				return getFHS7();
			case V2xmlPackage.FHSCONTENT__FHS8:
				return getFHS8();
			case V2xmlPackage.FHSCONTENT__FHS9:
				return getFHS9();
			case V2xmlPackage.FHSCONTENT__FHS10:
				return getFHS10();
			case V2xmlPackage.FHSCONTENT__FHS11:
				return getFHS11();
			case V2xmlPackage.FHSCONTENT__FHS12:
				return getFHS12();
			case V2xmlPackage.FHSCONTENT__ANY:
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
			case V2xmlPackage.FHSCONTENT__FHS1:
				setFHS1((FHS1CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS2:
				setFHS2((FHS2CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS3:
				setFHS3((FHS3CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS4:
				setFHS4((FHS4CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS5:
				setFHS5((FHS5CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS6:
				setFHS6((FHS6CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS7:
				setFHS7((FHS7CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS8:
				setFHS8((FHS8CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS9:
				setFHS9((FHS9CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS10:
				setFHS10((FHS10CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS11:
				setFHS11((FHS11CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__FHS12:
				setFHS12((FHS12CONTENT)newValue);
				return;
			case V2xmlPackage.FHSCONTENT__ANY:
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
			case V2xmlPackage.FHSCONTENT__FHS1:
				setFHS1((FHS1CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS2:
				setFHS2((FHS2CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS3:
				setFHS3((FHS3CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS4:
				setFHS4((FHS4CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS5:
				setFHS5((FHS5CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS6:
				setFHS6((FHS6CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS7:
				setFHS7((FHS7CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS8:
				setFHS8((FHS8CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS9:
				setFHS9((FHS9CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS10:
				setFHS10((FHS10CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS11:
				setFHS11((FHS11CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__FHS12:
				setFHS12((FHS12CONTENT)null);
				return;
			case V2xmlPackage.FHSCONTENT__ANY:
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
			case V2xmlPackage.FHSCONTENT__FHS1:
				return fHS1 != null;
			case V2xmlPackage.FHSCONTENT__FHS2:
				return fHS2 != null;
			case V2xmlPackage.FHSCONTENT__FHS3:
				return fHS3 != null;
			case V2xmlPackage.FHSCONTENT__FHS4:
				return fHS4 != null;
			case V2xmlPackage.FHSCONTENT__FHS5:
				return fHS5 != null;
			case V2xmlPackage.FHSCONTENT__FHS6:
				return fHS6 != null;
			case V2xmlPackage.FHSCONTENT__FHS7:
				return fHS7 != null;
			case V2xmlPackage.FHSCONTENT__FHS8:
				return fHS8 != null;
			case V2xmlPackage.FHSCONTENT__FHS9:
				return fHS9 != null;
			case V2xmlPackage.FHSCONTENT__FHS10:
				return fHS10 != null;
			case V2xmlPackage.FHSCONTENT__FHS11:
				return fHS11 != null;
			case V2xmlPackage.FHSCONTENT__FHS12:
				return fHS12 != null;
			case V2xmlPackage.FHSCONTENT__ANY:
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

} //FHSCONTENTImpl
