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

import org.hl7.v2xml.ABS10CONTENT;
import org.hl7.v2xml.ABS11CONTENT;
import org.hl7.v2xml.ABS12CONTENT;
import org.hl7.v2xml.ABS13CONTENT;
import org.hl7.v2xml.ABS14CONTENT;
import org.hl7.v2xml.ABS1CONTENT;
import org.hl7.v2xml.ABS2CONTENT;
import org.hl7.v2xml.ABS3CONTENT;
import org.hl7.v2xml.ABS4CONTENT;
import org.hl7.v2xml.ABS5CONTENT;
import org.hl7.v2xml.ABS6CONTENT;
import org.hl7.v2xml.ABS7CONTENT;
import org.hl7.v2xml.ABS8CONTENT;
import org.hl7.v2xml.ABS9CONTENT;
import org.hl7.v2xml.ABSCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ABSCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS1 <em>ABS1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS2 <em>ABS2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS3 <em>ABS3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS4 <em>ABS4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS5 <em>ABS5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS6 <em>ABS6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS7 <em>ABS7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS8 <em>ABS8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS9 <em>ABS9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS10 <em>ABS10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS11 <em>ABS11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS12 <em>ABS12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS13 <em>ABS13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getABS14 <em>ABS14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.ABSCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ABSCONTENTImpl extends EObjectImpl implements ABSCONTENT {
	/**
	 * The cached value of the '{@link #getABS1() <em>ABS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS1()
	 * @generated
	 * @ordered
	 */
	protected ABS1CONTENT aBS1;

	/**
	 * The cached value of the '{@link #getABS2() <em>ABS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS2()
	 * @generated
	 * @ordered
	 */
	protected ABS2CONTENT aBS2;

	/**
	 * The cached value of the '{@link #getABS3() <em>ABS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS3()
	 * @generated
	 * @ordered
	 */
	protected ABS3CONTENT aBS3;

	/**
	 * The cached value of the '{@link #getABS4() <em>ABS4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS4()
	 * @generated
	 * @ordered
	 */
	protected ABS4CONTENT aBS4;

	/**
	 * The cached value of the '{@link #getABS5() <em>ABS5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS5()
	 * @generated
	 * @ordered
	 */
	protected ABS5CONTENT aBS5;

	/**
	 * The cached value of the '{@link #getABS6() <em>ABS6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS6()
	 * @generated
	 * @ordered
	 */
	protected ABS6CONTENT aBS6;

	/**
	 * The cached value of the '{@link #getABS7() <em>ABS7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS7()
	 * @generated
	 * @ordered
	 */
	protected ABS7CONTENT aBS7;

	/**
	 * The cached value of the '{@link #getABS8() <em>ABS8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS8()
	 * @generated
	 * @ordered
	 */
	protected ABS8CONTENT aBS8;

	/**
	 * The cached value of the '{@link #getABS9() <em>ABS9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS9()
	 * @generated
	 * @ordered
	 */
	protected ABS9CONTENT aBS9;

	/**
	 * The cached value of the '{@link #getABS10() <em>ABS10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS10()
	 * @generated
	 * @ordered
	 */
	protected ABS10CONTENT aBS10;

	/**
	 * The cached value of the '{@link #getABS11() <em>ABS11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS11()
	 * @generated
	 * @ordered
	 */
	protected ABS11CONTENT aBS11;

	/**
	 * The cached value of the '{@link #getABS12() <em>ABS12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS12()
	 * @generated
	 * @ordered
	 */
	protected ABS12CONTENT aBS12;

	/**
	 * The cached value of the '{@link #getABS13() <em>ABS13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS13()
	 * @generated
	 * @ordered
	 */
	protected ABS13CONTENT aBS13;

	/**
	 * The cached value of the '{@link #getABS14() <em>ABS14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getABS14()
	 * @generated
	 * @ordered
	 */
	protected ABS14CONTENT aBS14;

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
	protected ABSCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getABSCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS1CONTENT getABS1() {
		return aBS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS1(ABS1CONTENT newABS1, NotificationChain msgs) {
		ABS1CONTENT oldABS1 = aBS1;
		aBS1 = newABS1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS1, oldABS1, newABS1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS1(ABS1CONTENT newABS1) {
		if (newABS1 != aBS1) {
			NotificationChain msgs = null;
			if (aBS1 != null)
				msgs = ((InternalEObject)aBS1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS1, null, msgs);
			if (newABS1 != null)
				msgs = ((InternalEObject)newABS1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS1, null, msgs);
			msgs = basicSetABS1(newABS1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS1, newABS1, newABS1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS2CONTENT getABS2() {
		return aBS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS2(ABS2CONTENT newABS2, NotificationChain msgs) {
		ABS2CONTENT oldABS2 = aBS2;
		aBS2 = newABS2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS2, oldABS2, newABS2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS2(ABS2CONTENT newABS2) {
		if (newABS2 != aBS2) {
			NotificationChain msgs = null;
			if (aBS2 != null)
				msgs = ((InternalEObject)aBS2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS2, null, msgs);
			if (newABS2 != null)
				msgs = ((InternalEObject)newABS2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS2, null, msgs);
			msgs = basicSetABS2(newABS2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS2, newABS2, newABS2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS3CONTENT getABS3() {
		return aBS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS3(ABS3CONTENT newABS3, NotificationChain msgs) {
		ABS3CONTENT oldABS3 = aBS3;
		aBS3 = newABS3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS3, oldABS3, newABS3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS3(ABS3CONTENT newABS3) {
		if (newABS3 != aBS3) {
			NotificationChain msgs = null;
			if (aBS3 != null)
				msgs = ((InternalEObject)aBS3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS3, null, msgs);
			if (newABS3 != null)
				msgs = ((InternalEObject)newABS3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS3, null, msgs);
			msgs = basicSetABS3(newABS3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS3, newABS3, newABS3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS4CONTENT getABS4() {
		return aBS4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS4(ABS4CONTENT newABS4, NotificationChain msgs) {
		ABS4CONTENT oldABS4 = aBS4;
		aBS4 = newABS4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS4, oldABS4, newABS4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS4(ABS4CONTENT newABS4) {
		if (newABS4 != aBS4) {
			NotificationChain msgs = null;
			if (aBS4 != null)
				msgs = ((InternalEObject)aBS4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS4, null, msgs);
			if (newABS4 != null)
				msgs = ((InternalEObject)newABS4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS4, null, msgs);
			msgs = basicSetABS4(newABS4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS4, newABS4, newABS4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS5CONTENT getABS5() {
		return aBS5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS5(ABS5CONTENT newABS5, NotificationChain msgs) {
		ABS5CONTENT oldABS5 = aBS5;
		aBS5 = newABS5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS5, oldABS5, newABS5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS5(ABS5CONTENT newABS5) {
		if (newABS5 != aBS5) {
			NotificationChain msgs = null;
			if (aBS5 != null)
				msgs = ((InternalEObject)aBS5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS5, null, msgs);
			if (newABS5 != null)
				msgs = ((InternalEObject)newABS5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS5, null, msgs);
			msgs = basicSetABS5(newABS5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS5, newABS5, newABS5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS6CONTENT getABS6() {
		return aBS6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS6(ABS6CONTENT newABS6, NotificationChain msgs) {
		ABS6CONTENT oldABS6 = aBS6;
		aBS6 = newABS6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS6, oldABS6, newABS6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS6(ABS6CONTENT newABS6) {
		if (newABS6 != aBS6) {
			NotificationChain msgs = null;
			if (aBS6 != null)
				msgs = ((InternalEObject)aBS6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS6, null, msgs);
			if (newABS6 != null)
				msgs = ((InternalEObject)newABS6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS6, null, msgs);
			msgs = basicSetABS6(newABS6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS6, newABS6, newABS6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS7CONTENT getABS7() {
		return aBS7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS7(ABS7CONTENT newABS7, NotificationChain msgs) {
		ABS7CONTENT oldABS7 = aBS7;
		aBS7 = newABS7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS7, oldABS7, newABS7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS7(ABS7CONTENT newABS7) {
		if (newABS7 != aBS7) {
			NotificationChain msgs = null;
			if (aBS7 != null)
				msgs = ((InternalEObject)aBS7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS7, null, msgs);
			if (newABS7 != null)
				msgs = ((InternalEObject)newABS7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS7, null, msgs);
			msgs = basicSetABS7(newABS7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS7, newABS7, newABS7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS8CONTENT getABS8() {
		return aBS8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS8(ABS8CONTENT newABS8, NotificationChain msgs) {
		ABS8CONTENT oldABS8 = aBS8;
		aBS8 = newABS8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS8, oldABS8, newABS8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS8(ABS8CONTENT newABS8) {
		if (newABS8 != aBS8) {
			NotificationChain msgs = null;
			if (aBS8 != null)
				msgs = ((InternalEObject)aBS8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS8, null, msgs);
			if (newABS8 != null)
				msgs = ((InternalEObject)newABS8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS8, null, msgs);
			msgs = basicSetABS8(newABS8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS8, newABS8, newABS8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS9CONTENT getABS9() {
		return aBS9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS9(ABS9CONTENT newABS9, NotificationChain msgs) {
		ABS9CONTENT oldABS9 = aBS9;
		aBS9 = newABS9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS9, oldABS9, newABS9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS9(ABS9CONTENT newABS9) {
		if (newABS9 != aBS9) {
			NotificationChain msgs = null;
			if (aBS9 != null)
				msgs = ((InternalEObject)aBS9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS9, null, msgs);
			if (newABS9 != null)
				msgs = ((InternalEObject)newABS9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS9, null, msgs);
			msgs = basicSetABS9(newABS9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS9, newABS9, newABS9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS10CONTENT getABS10() {
		return aBS10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS10(ABS10CONTENT newABS10, NotificationChain msgs) {
		ABS10CONTENT oldABS10 = aBS10;
		aBS10 = newABS10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS10, oldABS10, newABS10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS10(ABS10CONTENT newABS10) {
		if (newABS10 != aBS10) {
			NotificationChain msgs = null;
			if (aBS10 != null)
				msgs = ((InternalEObject)aBS10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS10, null, msgs);
			if (newABS10 != null)
				msgs = ((InternalEObject)newABS10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS10, null, msgs);
			msgs = basicSetABS10(newABS10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS10, newABS10, newABS10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS11CONTENT getABS11() {
		return aBS11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS11(ABS11CONTENT newABS11, NotificationChain msgs) {
		ABS11CONTENT oldABS11 = aBS11;
		aBS11 = newABS11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS11, oldABS11, newABS11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS11(ABS11CONTENT newABS11) {
		if (newABS11 != aBS11) {
			NotificationChain msgs = null;
			if (aBS11 != null)
				msgs = ((InternalEObject)aBS11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS11, null, msgs);
			if (newABS11 != null)
				msgs = ((InternalEObject)newABS11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS11, null, msgs);
			msgs = basicSetABS11(newABS11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS11, newABS11, newABS11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS12CONTENT getABS12() {
		return aBS12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS12(ABS12CONTENT newABS12, NotificationChain msgs) {
		ABS12CONTENT oldABS12 = aBS12;
		aBS12 = newABS12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS12, oldABS12, newABS12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS12(ABS12CONTENT newABS12) {
		if (newABS12 != aBS12) {
			NotificationChain msgs = null;
			if (aBS12 != null)
				msgs = ((InternalEObject)aBS12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS12, null, msgs);
			if (newABS12 != null)
				msgs = ((InternalEObject)newABS12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS12, null, msgs);
			msgs = basicSetABS12(newABS12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS12, newABS12, newABS12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS13CONTENT getABS13() {
		return aBS13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS13(ABS13CONTENT newABS13, NotificationChain msgs) {
		ABS13CONTENT oldABS13 = aBS13;
		aBS13 = newABS13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS13, oldABS13, newABS13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS13(ABS13CONTENT newABS13) {
		if (newABS13 != aBS13) {
			NotificationChain msgs = null;
			if (aBS13 != null)
				msgs = ((InternalEObject)aBS13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS13, null, msgs);
			if (newABS13 != null)
				msgs = ((InternalEObject)newABS13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS13, null, msgs);
			msgs = basicSetABS13(newABS13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS13, newABS13, newABS13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABS14CONTENT getABS14() {
		return aBS14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetABS14(ABS14CONTENT newABS14, NotificationChain msgs) {
		ABS14CONTENT oldABS14 = aBS14;
		aBS14 = newABS14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS14, oldABS14, newABS14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setABS14(ABS14CONTENT newABS14) {
		if (newABS14 != aBS14) {
			NotificationChain msgs = null;
			if (aBS14 != null)
				msgs = ((InternalEObject)aBS14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS14, null, msgs);
			if (newABS14 != null)
				msgs = ((InternalEObject)newABS14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.ABSCONTENT__ABS14, null, msgs);
			msgs = basicSetABS14(newABS14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.ABSCONTENT__ABS14, newABS14, newABS14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.ABSCONTENT__ANY);
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
			case V2xmlPackage.ABSCONTENT__ABS1:
				return basicSetABS1(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS2:
				return basicSetABS2(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS3:
				return basicSetABS3(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS4:
				return basicSetABS4(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS5:
				return basicSetABS5(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS6:
				return basicSetABS6(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS7:
				return basicSetABS7(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS8:
				return basicSetABS8(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS9:
				return basicSetABS9(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS10:
				return basicSetABS10(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS11:
				return basicSetABS11(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS12:
				return basicSetABS12(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS13:
				return basicSetABS13(null, msgs);
			case V2xmlPackage.ABSCONTENT__ABS14:
				return basicSetABS14(null, msgs);
			case V2xmlPackage.ABSCONTENT__ANY:
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
			case V2xmlPackage.ABSCONTENT__ABS1:
				return getABS1();
			case V2xmlPackage.ABSCONTENT__ABS2:
				return getABS2();
			case V2xmlPackage.ABSCONTENT__ABS3:
				return getABS3();
			case V2xmlPackage.ABSCONTENT__ABS4:
				return getABS4();
			case V2xmlPackage.ABSCONTENT__ABS5:
				return getABS5();
			case V2xmlPackage.ABSCONTENT__ABS6:
				return getABS6();
			case V2xmlPackage.ABSCONTENT__ABS7:
				return getABS7();
			case V2xmlPackage.ABSCONTENT__ABS8:
				return getABS8();
			case V2xmlPackage.ABSCONTENT__ABS9:
				return getABS9();
			case V2xmlPackage.ABSCONTENT__ABS10:
				return getABS10();
			case V2xmlPackage.ABSCONTENT__ABS11:
				return getABS11();
			case V2xmlPackage.ABSCONTENT__ABS12:
				return getABS12();
			case V2xmlPackage.ABSCONTENT__ABS13:
				return getABS13();
			case V2xmlPackage.ABSCONTENT__ABS14:
				return getABS14();
			case V2xmlPackage.ABSCONTENT__ANY:
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
			case V2xmlPackage.ABSCONTENT__ABS1:
				setABS1((ABS1CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS2:
				setABS2((ABS2CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS3:
				setABS3((ABS3CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS4:
				setABS4((ABS4CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS5:
				setABS5((ABS5CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS6:
				setABS6((ABS6CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS7:
				setABS7((ABS7CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS8:
				setABS8((ABS8CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS9:
				setABS9((ABS9CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS10:
				setABS10((ABS10CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS11:
				setABS11((ABS11CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS12:
				setABS12((ABS12CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS13:
				setABS13((ABS13CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ABS14:
				setABS14((ABS14CONTENT)newValue);
				return;
			case V2xmlPackage.ABSCONTENT__ANY:
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
			case V2xmlPackage.ABSCONTENT__ABS1:
				setABS1((ABS1CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS2:
				setABS2((ABS2CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS3:
				setABS3((ABS3CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS4:
				setABS4((ABS4CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS5:
				setABS5((ABS5CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS6:
				setABS6((ABS6CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS7:
				setABS7((ABS7CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS8:
				setABS8((ABS8CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS9:
				setABS9((ABS9CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS10:
				setABS10((ABS10CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS11:
				setABS11((ABS11CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS12:
				setABS12((ABS12CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS13:
				setABS13((ABS13CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ABS14:
				setABS14((ABS14CONTENT)null);
				return;
			case V2xmlPackage.ABSCONTENT__ANY:
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
			case V2xmlPackage.ABSCONTENT__ABS1:
				return aBS1 != null;
			case V2xmlPackage.ABSCONTENT__ABS2:
				return aBS2 != null;
			case V2xmlPackage.ABSCONTENT__ABS3:
				return aBS3 != null;
			case V2xmlPackage.ABSCONTENT__ABS4:
				return aBS4 != null;
			case V2xmlPackage.ABSCONTENT__ABS5:
				return aBS5 != null;
			case V2xmlPackage.ABSCONTENT__ABS6:
				return aBS6 != null;
			case V2xmlPackage.ABSCONTENT__ABS7:
				return aBS7 != null;
			case V2xmlPackage.ABSCONTENT__ABS8:
				return aBS8 != null;
			case V2xmlPackage.ABSCONTENT__ABS9:
				return aBS9 != null;
			case V2xmlPackage.ABSCONTENT__ABS10:
				return aBS10 != null;
			case V2xmlPackage.ABSCONTENT__ABS11:
				return aBS11 != null;
			case V2xmlPackage.ABSCONTENT__ABS12:
				return aBS12 != null;
			case V2xmlPackage.ABSCONTENT__ABS13:
				return aBS13 != null;
			case V2xmlPackage.ABSCONTENT__ABS14:
				return aBS14 != null;
			case V2xmlPackage.ABSCONTENT__ANY:
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

} //ABSCONTENTImpl
