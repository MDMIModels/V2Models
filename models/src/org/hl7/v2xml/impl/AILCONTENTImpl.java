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

import org.hl7.v2xml.AIL10CONTENT;
import org.hl7.v2xml.AIL11CONTENT;
import org.hl7.v2xml.AIL12CONTENT;
import org.hl7.v2xml.AIL1CONTENT;
import org.hl7.v2xml.AIL2CONTENT;
import org.hl7.v2xml.AIL3CONTENT;
import org.hl7.v2xml.AIL4CONTENT;
import org.hl7.v2xml.AIL5CONTENT;
import org.hl7.v2xml.AIL6CONTENT;
import org.hl7.v2xml.AIL7CONTENT;
import org.hl7.v2xml.AIL8CONTENT;
import org.hl7.v2xml.AIL9CONTENT;
import org.hl7.v2xml.AILCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AILCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL1 <em>AIL1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL2 <em>AIL2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL3 <em>AIL3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL4 <em>AIL4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL5 <em>AIL5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL6 <em>AIL6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL7 <em>AIL7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL8 <em>AIL8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL9 <em>AIL9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL10 <em>AIL10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL11 <em>AIL11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAIL12 <em>AIL12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AILCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AILCONTENTImpl extends EObjectImpl implements AILCONTENT {
	/**
	 * The cached value of the '{@link #getAIL1() <em>AIL1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL1()
	 * @generated
	 * @ordered
	 */
	protected AIL1CONTENT aIL1;

	/**
	 * The cached value of the '{@link #getAIL2() <em>AIL2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL2()
	 * @generated
	 * @ordered
	 */
	protected AIL2CONTENT aIL2;

	/**
	 * The cached value of the '{@link #getAIL3() <em>AIL3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL3()
	 * @generated
	 * @ordered
	 */
	protected EList<AIL3CONTENT> aIL3;

	/**
	 * The cached value of the '{@link #getAIL4() <em>AIL4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL4()
	 * @generated
	 * @ordered
	 */
	protected AIL4CONTENT aIL4;

	/**
	 * The cached value of the '{@link #getAIL5() <em>AIL5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL5()
	 * @generated
	 * @ordered
	 */
	protected AIL5CONTENT aIL5;

	/**
	 * The cached value of the '{@link #getAIL6() <em>AIL6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL6()
	 * @generated
	 * @ordered
	 */
	protected AIL6CONTENT aIL6;

	/**
	 * The cached value of the '{@link #getAIL7() <em>AIL7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL7()
	 * @generated
	 * @ordered
	 */
	protected AIL7CONTENT aIL7;

	/**
	 * The cached value of the '{@link #getAIL8() <em>AIL8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL8()
	 * @generated
	 * @ordered
	 */
	protected AIL8CONTENT aIL8;

	/**
	 * The cached value of the '{@link #getAIL9() <em>AIL9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL9()
	 * @generated
	 * @ordered
	 */
	protected AIL9CONTENT aIL9;

	/**
	 * The cached value of the '{@link #getAIL10() <em>AIL10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL10()
	 * @generated
	 * @ordered
	 */
	protected AIL10CONTENT aIL10;

	/**
	 * The cached value of the '{@link #getAIL11() <em>AIL11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL11()
	 * @generated
	 * @ordered
	 */
	protected AIL11CONTENT aIL11;

	/**
	 * The cached value of the '{@link #getAIL12() <em>AIL12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIL12()
	 * @generated
	 * @ordered
	 */
	protected AIL12CONTENT aIL12;

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
	protected AILCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAILCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL1CONTENT getAIL1() {
		return aIL1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL1(AIL1CONTENT newAIL1, NotificationChain msgs) {
		AIL1CONTENT oldAIL1 = aIL1;
		aIL1 = newAIL1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL1, oldAIL1, newAIL1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL1(AIL1CONTENT newAIL1) {
		if (newAIL1 != aIL1) {
			NotificationChain msgs = null;
			if (aIL1 != null)
				msgs = ((InternalEObject)aIL1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL1, null, msgs);
			if (newAIL1 != null)
				msgs = ((InternalEObject)newAIL1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL1, null, msgs);
			msgs = basicSetAIL1(newAIL1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL1, newAIL1, newAIL1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL2CONTENT getAIL2() {
		return aIL2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL2(AIL2CONTENT newAIL2, NotificationChain msgs) {
		AIL2CONTENT oldAIL2 = aIL2;
		aIL2 = newAIL2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL2, oldAIL2, newAIL2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL2(AIL2CONTENT newAIL2) {
		if (newAIL2 != aIL2) {
			NotificationChain msgs = null;
			if (aIL2 != null)
				msgs = ((InternalEObject)aIL2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL2, null, msgs);
			if (newAIL2 != null)
				msgs = ((InternalEObject)newAIL2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL2, null, msgs);
			msgs = basicSetAIL2(newAIL2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL2, newAIL2, newAIL2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIL3CONTENT> getAIL3() {
		if (aIL3 == null) {
			aIL3 = new EObjectContainmentEList<AIL3CONTENT>(AIL3CONTENT.class, this, V2xmlPackage.AILCONTENT__AIL3);
		}
		return aIL3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL4CONTENT getAIL4() {
		return aIL4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL4(AIL4CONTENT newAIL4, NotificationChain msgs) {
		AIL4CONTENT oldAIL4 = aIL4;
		aIL4 = newAIL4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL4, oldAIL4, newAIL4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL4(AIL4CONTENT newAIL4) {
		if (newAIL4 != aIL4) {
			NotificationChain msgs = null;
			if (aIL4 != null)
				msgs = ((InternalEObject)aIL4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL4, null, msgs);
			if (newAIL4 != null)
				msgs = ((InternalEObject)newAIL4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL4, null, msgs);
			msgs = basicSetAIL4(newAIL4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL4, newAIL4, newAIL4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL5CONTENT getAIL5() {
		return aIL5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL5(AIL5CONTENT newAIL5, NotificationChain msgs) {
		AIL5CONTENT oldAIL5 = aIL5;
		aIL5 = newAIL5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL5, oldAIL5, newAIL5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL5(AIL5CONTENT newAIL5) {
		if (newAIL5 != aIL5) {
			NotificationChain msgs = null;
			if (aIL5 != null)
				msgs = ((InternalEObject)aIL5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL5, null, msgs);
			if (newAIL5 != null)
				msgs = ((InternalEObject)newAIL5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL5, null, msgs);
			msgs = basicSetAIL5(newAIL5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL5, newAIL5, newAIL5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL6CONTENT getAIL6() {
		return aIL6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL6(AIL6CONTENT newAIL6, NotificationChain msgs) {
		AIL6CONTENT oldAIL6 = aIL6;
		aIL6 = newAIL6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL6, oldAIL6, newAIL6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL6(AIL6CONTENT newAIL6) {
		if (newAIL6 != aIL6) {
			NotificationChain msgs = null;
			if (aIL6 != null)
				msgs = ((InternalEObject)aIL6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL6, null, msgs);
			if (newAIL6 != null)
				msgs = ((InternalEObject)newAIL6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL6, null, msgs);
			msgs = basicSetAIL6(newAIL6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL6, newAIL6, newAIL6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL7CONTENT getAIL7() {
		return aIL7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL7(AIL7CONTENT newAIL7, NotificationChain msgs) {
		AIL7CONTENT oldAIL7 = aIL7;
		aIL7 = newAIL7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL7, oldAIL7, newAIL7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL7(AIL7CONTENT newAIL7) {
		if (newAIL7 != aIL7) {
			NotificationChain msgs = null;
			if (aIL7 != null)
				msgs = ((InternalEObject)aIL7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL7, null, msgs);
			if (newAIL7 != null)
				msgs = ((InternalEObject)newAIL7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL7, null, msgs);
			msgs = basicSetAIL7(newAIL7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL7, newAIL7, newAIL7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL8CONTENT getAIL8() {
		return aIL8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL8(AIL8CONTENT newAIL8, NotificationChain msgs) {
		AIL8CONTENT oldAIL8 = aIL8;
		aIL8 = newAIL8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL8, oldAIL8, newAIL8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL8(AIL8CONTENT newAIL8) {
		if (newAIL8 != aIL8) {
			NotificationChain msgs = null;
			if (aIL8 != null)
				msgs = ((InternalEObject)aIL8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL8, null, msgs);
			if (newAIL8 != null)
				msgs = ((InternalEObject)newAIL8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL8, null, msgs);
			msgs = basicSetAIL8(newAIL8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL8, newAIL8, newAIL8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL9CONTENT getAIL9() {
		return aIL9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL9(AIL9CONTENT newAIL9, NotificationChain msgs) {
		AIL9CONTENT oldAIL9 = aIL9;
		aIL9 = newAIL9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL9, oldAIL9, newAIL9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL9(AIL9CONTENT newAIL9) {
		if (newAIL9 != aIL9) {
			NotificationChain msgs = null;
			if (aIL9 != null)
				msgs = ((InternalEObject)aIL9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL9, null, msgs);
			if (newAIL9 != null)
				msgs = ((InternalEObject)newAIL9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL9, null, msgs);
			msgs = basicSetAIL9(newAIL9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL9, newAIL9, newAIL9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL10CONTENT getAIL10() {
		return aIL10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL10(AIL10CONTENT newAIL10, NotificationChain msgs) {
		AIL10CONTENT oldAIL10 = aIL10;
		aIL10 = newAIL10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL10, oldAIL10, newAIL10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL10(AIL10CONTENT newAIL10) {
		if (newAIL10 != aIL10) {
			NotificationChain msgs = null;
			if (aIL10 != null)
				msgs = ((InternalEObject)aIL10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL10, null, msgs);
			if (newAIL10 != null)
				msgs = ((InternalEObject)newAIL10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL10, null, msgs);
			msgs = basicSetAIL10(newAIL10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL10, newAIL10, newAIL10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL11CONTENT getAIL11() {
		return aIL11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL11(AIL11CONTENT newAIL11, NotificationChain msgs) {
		AIL11CONTENT oldAIL11 = aIL11;
		aIL11 = newAIL11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL11, oldAIL11, newAIL11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL11(AIL11CONTENT newAIL11) {
		if (newAIL11 != aIL11) {
			NotificationChain msgs = null;
			if (aIL11 != null)
				msgs = ((InternalEObject)aIL11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL11, null, msgs);
			if (newAIL11 != null)
				msgs = ((InternalEObject)newAIL11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL11, null, msgs);
			msgs = basicSetAIL11(newAIL11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL11, newAIL11, newAIL11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIL12CONTENT getAIL12() {
		return aIL12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIL12(AIL12CONTENT newAIL12, NotificationChain msgs) {
		AIL12CONTENT oldAIL12 = aIL12;
		aIL12 = newAIL12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL12, oldAIL12, newAIL12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIL12(AIL12CONTENT newAIL12) {
		if (newAIL12 != aIL12) {
			NotificationChain msgs = null;
			if (aIL12 != null)
				msgs = ((InternalEObject)aIL12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL12, null, msgs);
			if (newAIL12 != null)
				msgs = ((InternalEObject)newAIL12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AILCONTENT__AIL12, null, msgs);
			msgs = basicSetAIL12(newAIL12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AILCONTENT__AIL12, newAIL12, newAIL12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AILCONTENT__ANY);
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
			case V2xmlPackage.AILCONTENT__AIL1:
				return basicSetAIL1(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL2:
				return basicSetAIL2(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL3:
				return ((InternalEList<?>)getAIL3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AILCONTENT__AIL4:
				return basicSetAIL4(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL5:
				return basicSetAIL5(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL6:
				return basicSetAIL6(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL7:
				return basicSetAIL7(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL8:
				return basicSetAIL8(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL9:
				return basicSetAIL9(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL10:
				return basicSetAIL10(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL11:
				return basicSetAIL11(null, msgs);
			case V2xmlPackage.AILCONTENT__AIL12:
				return basicSetAIL12(null, msgs);
			case V2xmlPackage.AILCONTENT__ANY:
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
			case V2xmlPackage.AILCONTENT__AIL1:
				return getAIL1();
			case V2xmlPackage.AILCONTENT__AIL2:
				return getAIL2();
			case V2xmlPackage.AILCONTENT__AIL3:
				return getAIL3();
			case V2xmlPackage.AILCONTENT__AIL4:
				return getAIL4();
			case V2xmlPackage.AILCONTENT__AIL5:
				return getAIL5();
			case V2xmlPackage.AILCONTENT__AIL6:
				return getAIL6();
			case V2xmlPackage.AILCONTENT__AIL7:
				return getAIL7();
			case V2xmlPackage.AILCONTENT__AIL8:
				return getAIL8();
			case V2xmlPackage.AILCONTENT__AIL9:
				return getAIL9();
			case V2xmlPackage.AILCONTENT__AIL10:
				return getAIL10();
			case V2xmlPackage.AILCONTENT__AIL11:
				return getAIL11();
			case V2xmlPackage.AILCONTENT__AIL12:
				return getAIL12();
			case V2xmlPackage.AILCONTENT__ANY:
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
			case V2xmlPackage.AILCONTENT__AIL1:
				setAIL1((AIL1CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL2:
				setAIL2((AIL2CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL3:
				getAIL3().clear();
				getAIL3().addAll((Collection<? extends AIL3CONTENT>)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL4:
				setAIL4((AIL4CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL5:
				setAIL5((AIL5CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL6:
				setAIL6((AIL6CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL7:
				setAIL7((AIL7CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL8:
				setAIL8((AIL8CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL9:
				setAIL9((AIL9CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL10:
				setAIL10((AIL10CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL11:
				setAIL11((AIL11CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__AIL12:
				setAIL12((AIL12CONTENT)newValue);
				return;
			case V2xmlPackage.AILCONTENT__ANY:
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
			case V2xmlPackage.AILCONTENT__AIL1:
				setAIL1((AIL1CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL2:
				setAIL2((AIL2CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL3:
				getAIL3().clear();
				return;
			case V2xmlPackage.AILCONTENT__AIL4:
				setAIL4((AIL4CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL5:
				setAIL5((AIL5CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL6:
				setAIL6((AIL6CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL7:
				setAIL7((AIL7CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL8:
				setAIL8((AIL8CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL9:
				setAIL9((AIL9CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL10:
				setAIL10((AIL10CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL11:
				setAIL11((AIL11CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__AIL12:
				setAIL12((AIL12CONTENT)null);
				return;
			case V2xmlPackage.AILCONTENT__ANY:
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
			case V2xmlPackage.AILCONTENT__AIL1:
				return aIL1 != null;
			case V2xmlPackage.AILCONTENT__AIL2:
				return aIL2 != null;
			case V2xmlPackage.AILCONTENT__AIL3:
				return aIL3 != null && !aIL3.isEmpty();
			case V2xmlPackage.AILCONTENT__AIL4:
				return aIL4 != null;
			case V2xmlPackage.AILCONTENT__AIL5:
				return aIL5 != null;
			case V2xmlPackage.AILCONTENT__AIL6:
				return aIL6 != null;
			case V2xmlPackage.AILCONTENT__AIL7:
				return aIL7 != null;
			case V2xmlPackage.AILCONTENT__AIL8:
				return aIL8 != null;
			case V2xmlPackage.AILCONTENT__AIL9:
				return aIL9 != null;
			case V2xmlPackage.AILCONTENT__AIL10:
				return aIL10 != null;
			case V2xmlPackage.AILCONTENT__AIL11:
				return aIL11 != null;
			case V2xmlPackage.AILCONTENT__AIL12:
				return aIL12 != null;
			case V2xmlPackage.AILCONTENT__ANY:
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

} //AILCONTENTImpl
