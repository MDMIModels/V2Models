/**
 */
package org.hl7.v2xml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.hl7.v2xml.AIG10CONTENT;
import org.hl7.v2xml.AIG11CONTENT;
import org.hl7.v2xml.AIG12CONTENT;
import org.hl7.v2xml.AIG13CONTENT;
import org.hl7.v2xml.AIG14CONTENT;
import org.hl7.v2xml.AIG1CONTENT;
import org.hl7.v2xml.AIG2CONTENT;
import org.hl7.v2xml.AIG3CONTENT;
import org.hl7.v2xml.AIG4CONTENT;
import org.hl7.v2xml.AIG5CONTENT;
import org.hl7.v2xml.AIG6CONTENT;
import org.hl7.v2xml.AIG7CONTENT;
import org.hl7.v2xml.AIG8CONTENT;
import org.hl7.v2xml.AIG9CONTENT;
import org.hl7.v2xml.AIGCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AIGCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG1 <em>AIG1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG2 <em>AIG2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG3 <em>AIG3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG4 <em>AIG4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG5 <em>AIG5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG6 <em>AIG6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG7 <em>AIG7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG8 <em>AIG8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG9 <em>AIG9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG10 <em>AIG10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG11 <em>AIG11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG12 <em>AIG12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG13 <em>AIG13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAIG14 <em>AIG14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIGCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIGCONTENTImpl extends EObjectImpl implements AIGCONTENT {
	/**
	 * The cached value of the '{@link #getAIG1() <em>AIG1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG1()
	 * @generated
	 * @ordered
	 */
	protected AIG1CONTENT aIG1;

	/**
	 * The cached value of the '{@link #getAIG2() <em>AIG2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG2()
	 * @generated
	 * @ordered
	 */
	protected AIG2CONTENT aIG2;

	/**
	 * The cached value of the '{@link #getAIG3() <em>AIG3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG3()
	 * @generated
	 * @ordered
	 */
	protected AIG3CONTENT aIG3;

	/**
	 * The cached value of the '{@link #getAIG4() <em>AIG4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG4()
	 * @generated
	 * @ordered
	 */
	protected AIG4CONTENT aIG4;

	/**
	 * The cached value of the '{@link #getAIG5() <em>AIG5</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG5()
	 * @generated
	 * @ordered
	 */
	protected EList<AIG5CONTENT> aIG5;

	/**
	 * The cached value of the '{@link #getAIG6() <em>AIG6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG6()
	 * @generated
	 * @ordered
	 */
	protected AIG6CONTENT aIG6;

	/**
	 * The cached value of the '{@link #getAIG7() <em>AIG7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG7()
	 * @generated
	 * @ordered
	 */
	protected AIG7CONTENT aIG7;

	/**
	 * The cached value of the '{@link #getAIG8() <em>AIG8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG8()
	 * @generated
	 * @ordered
	 */
	protected AIG8CONTENT aIG8;

	/**
	 * The cached value of the '{@link #getAIG9() <em>AIG9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG9()
	 * @generated
	 * @ordered
	 */
	protected AIG9CONTENT aIG9;

	/**
	 * The cached value of the '{@link #getAIG10() <em>AIG10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG10()
	 * @generated
	 * @ordered
	 */
	protected AIG10CONTENT aIG10;

	/**
	 * The cached value of the '{@link #getAIG11() <em>AIG11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG11()
	 * @generated
	 * @ordered
	 */
	protected AIG11CONTENT aIG11;

	/**
	 * The cached value of the '{@link #getAIG12() <em>AIG12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG12()
	 * @generated
	 * @ordered
	 */
	protected AIG12CONTENT aIG12;

	/**
	 * The cached value of the '{@link #getAIG13() <em>AIG13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG13()
	 * @generated
	 * @ordered
	 */
	protected AIG13CONTENT aIG13;

	/**
	 * The cached value of the '{@link #getAIG14() <em>AIG14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIG14()
	 * @generated
	 * @ordered
	 */
	protected AIG14CONTENT aIG14;

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
	protected AIGCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAIGCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG1CONTENT getAIG1() {
		return aIG1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG1(AIG1CONTENT newAIG1, NotificationChain msgs) {
		AIG1CONTENT oldAIG1 = aIG1;
		aIG1 = newAIG1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG1, oldAIG1, newAIG1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG1(AIG1CONTENT newAIG1) {
		if (newAIG1 != aIG1) {
			NotificationChain msgs = null;
			if (aIG1 != null)
				msgs = ((InternalEObject)aIG1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG1, null, msgs);
			if (newAIG1 != null)
				msgs = ((InternalEObject)newAIG1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG1, null, msgs);
			msgs = basicSetAIG1(newAIG1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG1, newAIG1, newAIG1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG2CONTENT getAIG2() {
		return aIG2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG2(AIG2CONTENT newAIG2, NotificationChain msgs) {
		AIG2CONTENT oldAIG2 = aIG2;
		aIG2 = newAIG2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG2, oldAIG2, newAIG2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG2(AIG2CONTENT newAIG2) {
		if (newAIG2 != aIG2) {
			NotificationChain msgs = null;
			if (aIG2 != null)
				msgs = ((InternalEObject)aIG2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG2, null, msgs);
			if (newAIG2 != null)
				msgs = ((InternalEObject)newAIG2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG2, null, msgs);
			msgs = basicSetAIG2(newAIG2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG2, newAIG2, newAIG2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG3CONTENT getAIG3() {
		return aIG3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG3(AIG3CONTENT newAIG3, NotificationChain msgs) {
		AIG3CONTENT oldAIG3 = aIG3;
		aIG3 = newAIG3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG3, oldAIG3, newAIG3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG3(AIG3CONTENT newAIG3) {
		if (newAIG3 != aIG3) {
			NotificationChain msgs = null;
			if (aIG3 != null)
				msgs = ((InternalEObject)aIG3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG3, null, msgs);
			if (newAIG3 != null)
				msgs = ((InternalEObject)newAIG3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG3, null, msgs);
			msgs = basicSetAIG3(newAIG3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG3, newAIG3, newAIG3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG4CONTENT getAIG4() {
		return aIG4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG4(AIG4CONTENT newAIG4, NotificationChain msgs) {
		AIG4CONTENT oldAIG4 = aIG4;
		aIG4 = newAIG4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG4, oldAIG4, newAIG4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG4(AIG4CONTENT newAIG4) {
		if (newAIG4 != aIG4) {
			NotificationChain msgs = null;
			if (aIG4 != null)
				msgs = ((InternalEObject)aIG4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG4, null, msgs);
			if (newAIG4 != null)
				msgs = ((InternalEObject)newAIG4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG4, null, msgs);
			msgs = basicSetAIG4(newAIG4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG4, newAIG4, newAIG4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIG5CONTENT> getAIG5() {
		if (aIG5 == null) {
			aIG5 = new EObjectContainmentEList<AIG5CONTENT>(AIG5CONTENT.class, this, V2xmlPackage.AIGCONTENT__AIG5);
		}
		return aIG5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG6CONTENT getAIG6() {
		return aIG6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG6(AIG6CONTENT newAIG6, NotificationChain msgs) {
		AIG6CONTENT oldAIG6 = aIG6;
		aIG6 = newAIG6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG6, oldAIG6, newAIG6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG6(AIG6CONTENT newAIG6) {
		if (newAIG6 != aIG6) {
			NotificationChain msgs = null;
			if (aIG6 != null)
				msgs = ((InternalEObject)aIG6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG6, null, msgs);
			if (newAIG6 != null)
				msgs = ((InternalEObject)newAIG6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG6, null, msgs);
			msgs = basicSetAIG6(newAIG6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG6, newAIG6, newAIG6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG7CONTENT getAIG7() {
		return aIG7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG7(AIG7CONTENT newAIG7, NotificationChain msgs) {
		AIG7CONTENT oldAIG7 = aIG7;
		aIG7 = newAIG7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG7, oldAIG7, newAIG7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG7(AIG7CONTENT newAIG7) {
		if (newAIG7 != aIG7) {
			NotificationChain msgs = null;
			if (aIG7 != null)
				msgs = ((InternalEObject)aIG7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG7, null, msgs);
			if (newAIG7 != null)
				msgs = ((InternalEObject)newAIG7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG7, null, msgs);
			msgs = basicSetAIG7(newAIG7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG7, newAIG7, newAIG7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG8CONTENT getAIG8() {
		return aIG8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG8(AIG8CONTENT newAIG8, NotificationChain msgs) {
		AIG8CONTENT oldAIG8 = aIG8;
		aIG8 = newAIG8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG8, oldAIG8, newAIG8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG8(AIG8CONTENT newAIG8) {
		if (newAIG8 != aIG8) {
			NotificationChain msgs = null;
			if (aIG8 != null)
				msgs = ((InternalEObject)aIG8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG8, null, msgs);
			if (newAIG8 != null)
				msgs = ((InternalEObject)newAIG8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG8, null, msgs);
			msgs = basicSetAIG8(newAIG8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG8, newAIG8, newAIG8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG9CONTENT getAIG9() {
		return aIG9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG9(AIG9CONTENT newAIG9, NotificationChain msgs) {
		AIG9CONTENT oldAIG9 = aIG9;
		aIG9 = newAIG9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG9, oldAIG9, newAIG9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG9(AIG9CONTENT newAIG9) {
		if (newAIG9 != aIG9) {
			NotificationChain msgs = null;
			if (aIG9 != null)
				msgs = ((InternalEObject)aIG9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG9, null, msgs);
			if (newAIG9 != null)
				msgs = ((InternalEObject)newAIG9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG9, null, msgs);
			msgs = basicSetAIG9(newAIG9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG9, newAIG9, newAIG9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG10CONTENT getAIG10() {
		return aIG10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG10(AIG10CONTENT newAIG10, NotificationChain msgs) {
		AIG10CONTENT oldAIG10 = aIG10;
		aIG10 = newAIG10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG10, oldAIG10, newAIG10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG10(AIG10CONTENT newAIG10) {
		if (newAIG10 != aIG10) {
			NotificationChain msgs = null;
			if (aIG10 != null)
				msgs = ((InternalEObject)aIG10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG10, null, msgs);
			if (newAIG10 != null)
				msgs = ((InternalEObject)newAIG10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG10, null, msgs);
			msgs = basicSetAIG10(newAIG10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG10, newAIG10, newAIG10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG11CONTENT getAIG11() {
		return aIG11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG11(AIG11CONTENT newAIG11, NotificationChain msgs) {
		AIG11CONTENT oldAIG11 = aIG11;
		aIG11 = newAIG11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG11, oldAIG11, newAIG11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG11(AIG11CONTENT newAIG11) {
		if (newAIG11 != aIG11) {
			NotificationChain msgs = null;
			if (aIG11 != null)
				msgs = ((InternalEObject)aIG11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG11, null, msgs);
			if (newAIG11 != null)
				msgs = ((InternalEObject)newAIG11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG11, null, msgs);
			msgs = basicSetAIG11(newAIG11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG11, newAIG11, newAIG11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG12CONTENT getAIG12() {
		return aIG12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG12(AIG12CONTENT newAIG12, NotificationChain msgs) {
		AIG12CONTENT oldAIG12 = aIG12;
		aIG12 = newAIG12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG12, oldAIG12, newAIG12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG12(AIG12CONTENT newAIG12) {
		if (newAIG12 != aIG12) {
			NotificationChain msgs = null;
			if (aIG12 != null)
				msgs = ((InternalEObject)aIG12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG12, null, msgs);
			if (newAIG12 != null)
				msgs = ((InternalEObject)newAIG12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG12, null, msgs);
			msgs = basicSetAIG12(newAIG12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG12, newAIG12, newAIG12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG13CONTENT getAIG13() {
		return aIG13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG13(AIG13CONTENT newAIG13, NotificationChain msgs) {
		AIG13CONTENT oldAIG13 = aIG13;
		aIG13 = newAIG13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG13, oldAIG13, newAIG13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG13(AIG13CONTENT newAIG13) {
		if (newAIG13 != aIG13) {
			NotificationChain msgs = null;
			if (aIG13 != null)
				msgs = ((InternalEObject)aIG13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG13, null, msgs);
			if (newAIG13 != null)
				msgs = ((InternalEObject)newAIG13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG13, null, msgs);
			msgs = basicSetAIG13(newAIG13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG13, newAIG13, newAIG13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIG14CONTENT getAIG14() {
		return aIG14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIG14(AIG14CONTENT newAIG14, NotificationChain msgs) {
		AIG14CONTENT oldAIG14 = aIG14;
		aIG14 = newAIG14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG14, oldAIG14, newAIG14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIG14(AIG14CONTENT newAIG14) {
		if (newAIG14 != aIG14) {
			NotificationChain msgs = null;
			if (aIG14 != null)
				msgs = ((InternalEObject)aIG14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG14, null, msgs);
			if (newAIG14 != null)
				msgs = ((InternalEObject)newAIG14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIGCONTENT__AIG14, null, msgs);
			msgs = basicSetAIG14(newAIG14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIGCONTENT__AIG14, newAIG14, newAIG14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AIGCONTENT__ANY);
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
			case V2xmlPackage.AIGCONTENT__AIG1:
				return basicSetAIG1(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG2:
				return basicSetAIG2(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG3:
				return basicSetAIG3(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG4:
				return basicSetAIG4(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG5:
				return ((InternalEList<?>)getAIG5()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AIGCONTENT__AIG6:
				return basicSetAIG6(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG7:
				return basicSetAIG7(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG8:
				return basicSetAIG8(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG9:
				return basicSetAIG9(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG10:
				return basicSetAIG10(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG11:
				return basicSetAIG11(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG12:
				return basicSetAIG12(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG13:
				return basicSetAIG13(null, msgs);
			case V2xmlPackage.AIGCONTENT__AIG14:
				return basicSetAIG14(null, msgs);
			case V2xmlPackage.AIGCONTENT__ANY:
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
			case V2xmlPackage.AIGCONTENT__AIG1:
				return getAIG1();
			case V2xmlPackage.AIGCONTENT__AIG2:
				return getAIG2();
			case V2xmlPackage.AIGCONTENT__AIG3:
				return getAIG3();
			case V2xmlPackage.AIGCONTENT__AIG4:
				return getAIG4();
			case V2xmlPackage.AIGCONTENT__AIG5:
				return getAIG5();
			case V2xmlPackage.AIGCONTENT__AIG6:
				return getAIG6();
			case V2xmlPackage.AIGCONTENT__AIG7:
				return getAIG7();
			case V2xmlPackage.AIGCONTENT__AIG8:
				return getAIG8();
			case V2xmlPackage.AIGCONTENT__AIG9:
				return getAIG9();
			case V2xmlPackage.AIGCONTENT__AIG10:
				return getAIG10();
			case V2xmlPackage.AIGCONTENT__AIG11:
				return getAIG11();
			case V2xmlPackage.AIGCONTENT__AIG12:
				return getAIG12();
			case V2xmlPackage.AIGCONTENT__AIG13:
				return getAIG13();
			case V2xmlPackage.AIGCONTENT__AIG14:
				return getAIG14();
			case V2xmlPackage.AIGCONTENT__ANY:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case V2xmlPackage.AIGCONTENT__AIG1:
				setAIG1((AIG1CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG2:
				setAIG2((AIG2CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG3:
				setAIG3((AIG3CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG4:
				setAIG4((AIG4CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG5:
				getAIG5().clear();
				getAIG5().addAll((Collection<? extends AIG5CONTENT>)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG6:
				setAIG6((AIG6CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG7:
				setAIG7((AIG7CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG8:
				setAIG8((AIG8CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG9:
				setAIG9((AIG9CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG10:
				setAIG10((AIG10CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG11:
				setAIG11((AIG11CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG12:
				setAIG12((AIG12CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG13:
				setAIG13((AIG13CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__AIG14:
				setAIG14((AIG14CONTENT)newValue);
				return;
			case V2xmlPackage.AIGCONTENT__ANY:
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
			case V2xmlPackage.AIGCONTENT__AIG1:
				setAIG1((AIG1CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG2:
				setAIG2((AIG2CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG3:
				setAIG3((AIG3CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG4:
				setAIG4((AIG4CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG5:
				getAIG5().clear();
				return;
			case V2xmlPackage.AIGCONTENT__AIG6:
				setAIG6((AIG6CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG7:
				setAIG7((AIG7CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG8:
				setAIG8((AIG8CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG9:
				setAIG9((AIG9CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG10:
				setAIG10((AIG10CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG11:
				setAIG11((AIG11CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG12:
				setAIG12((AIG12CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG13:
				setAIG13((AIG13CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__AIG14:
				setAIG14((AIG14CONTENT)null);
				return;
			case V2xmlPackage.AIGCONTENT__ANY:
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
			case V2xmlPackage.AIGCONTENT__AIG1:
				return aIG1 != null;
			case V2xmlPackage.AIGCONTENT__AIG2:
				return aIG2 != null;
			case V2xmlPackage.AIGCONTENT__AIG3:
				return aIG3 != null;
			case V2xmlPackage.AIGCONTENT__AIG4:
				return aIG4 != null;
			case V2xmlPackage.AIGCONTENT__AIG5:
				return aIG5 != null && !aIG5.isEmpty();
			case V2xmlPackage.AIGCONTENT__AIG6:
				return aIG6 != null;
			case V2xmlPackage.AIGCONTENT__AIG7:
				return aIG7 != null;
			case V2xmlPackage.AIGCONTENT__AIG8:
				return aIG8 != null;
			case V2xmlPackage.AIGCONTENT__AIG9:
				return aIG9 != null;
			case V2xmlPackage.AIGCONTENT__AIG10:
				return aIG10 != null;
			case V2xmlPackage.AIGCONTENT__AIG11:
				return aIG11 != null;
			case V2xmlPackage.AIGCONTENT__AIG12:
				return aIG12 != null;
			case V2xmlPackage.AIGCONTENT__AIG13:
				return aIG13 != null;
			case V2xmlPackage.AIGCONTENT__AIG14:
				return aIG14 != null;
			case V2xmlPackage.AIGCONTENT__ANY:
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

} //AIGCONTENTImpl
