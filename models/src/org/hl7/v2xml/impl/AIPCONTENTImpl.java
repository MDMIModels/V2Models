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

import org.hl7.v2xml.AIP10CONTENT;
import org.hl7.v2xml.AIP11CONTENT;
import org.hl7.v2xml.AIP12CONTENT;
import org.hl7.v2xml.AIP1CONTENT;
import org.hl7.v2xml.AIP2CONTENT;
import org.hl7.v2xml.AIP3CONTENT;
import org.hl7.v2xml.AIP4CONTENT;
import org.hl7.v2xml.AIP5CONTENT;
import org.hl7.v2xml.AIP6CONTENT;
import org.hl7.v2xml.AIP7CONTENT;
import org.hl7.v2xml.AIP8CONTENT;
import org.hl7.v2xml.AIP9CONTENT;
import org.hl7.v2xml.AIPCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AIPCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP1 <em>AIP1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP2 <em>AIP2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP3 <em>AIP3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP4 <em>AIP4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP5 <em>AIP5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP6 <em>AIP6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP7 <em>AIP7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP8 <em>AIP8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP9 <em>AIP9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP10 <em>AIP10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP11 <em>AIP11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAIP12 <em>AIP12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.AIPCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AIPCONTENTImpl extends EObjectImpl implements AIPCONTENT {
	/**
	 * The cached value of the '{@link #getAIP1() <em>AIP1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP1()
	 * @generated
	 * @ordered
	 */
	protected AIP1CONTENT aIP1;

	/**
	 * The cached value of the '{@link #getAIP2() <em>AIP2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP2()
	 * @generated
	 * @ordered
	 */
	protected AIP2CONTENT aIP2;

	/**
	 * The cached value of the '{@link #getAIP3() <em>AIP3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP3()
	 * @generated
	 * @ordered
	 */
	protected EList<AIP3CONTENT> aIP3;

	/**
	 * The cached value of the '{@link #getAIP4() <em>AIP4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP4()
	 * @generated
	 * @ordered
	 */
	protected AIP4CONTENT aIP4;

	/**
	 * The cached value of the '{@link #getAIP5() <em>AIP5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP5()
	 * @generated
	 * @ordered
	 */
	protected AIP5CONTENT aIP5;

	/**
	 * The cached value of the '{@link #getAIP6() <em>AIP6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP6()
	 * @generated
	 * @ordered
	 */
	protected AIP6CONTENT aIP6;

	/**
	 * The cached value of the '{@link #getAIP7() <em>AIP7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP7()
	 * @generated
	 * @ordered
	 */
	protected AIP7CONTENT aIP7;

	/**
	 * The cached value of the '{@link #getAIP8() <em>AIP8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP8()
	 * @generated
	 * @ordered
	 */
	protected AIP8CONTENT aIP8;

	/**
	 * The cached value of the '{@link #getAIP9() <em>AIP9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP9()
	 * @generated
	 * @ordered
	 */
	protected AIP9CONTENT aIP9;

	/**
	 * The cached value of the '{@link #getAIP10() <em>AIP10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP10()
	 * @generated
	 * @ordered
	 */
	protected AIP10CONTENT aIP10;

	/**
	 * The cached value of the '{@link #getAIP11() <em>AIP11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP11()
	 * @generated
	 * @ordered
	 */
	protected AIP11CONTENT aIP11;

	/**
	 * The cached value of the '{@link #getAIP12() <em>AIP12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAIP12()
	 * @generated
	 * @ordered
	 */
	protected AIP12CONTENT aIP12;

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
	protected AIPCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getAIPCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP1CONTENT getAIP1() {
		return aIP1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP1(AIP1CONTENT newAIP1, NotificationChain msgs) {
		AIP1CONTENT oldAIP1 = aIP1;
		aIP1 = newAIP1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP1, oldAIP1, newAIP1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP1(AIP1CONTENT newAIP1) {
		if (newAIP1 != aIP1) {
			NotificationChain msgs = null;
			if (aIP1 != null)
				msgs = ((InternalEObject)aIP1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP1, null, msgs);
			if (newAIP1 != null)
				msgs = ((InternalEObject)newAIP1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP1, null, msgs);
			msgs = basicSetAIP1(newAIP1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP1, newAIP1, newAIP1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP2CONTENT getAIP2() {
		return aIP2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP2(AIP2CONTENT newAIP2, NotificationChain msgs) {
		AIP2CONTENT oldAIP2 = aIP2;
		aIP2 = newAIP2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP2, oldAIP2, newAIP2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP2(AIP2CONTENT newAIP2) {
		if (newAIP2 != aIP2) {
			NotificationChain msgs = null;
			if (aIP2 != null)
				msgs = ((InternalEObject)aIP2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP2, null, msgs);
			if (newAIP2 != null)
				msgs = ((InternalEObject)newAIP2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP2, null, msgs);
			msgs = basicSetAIP2(newAIP2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP2, newAIP2, newAIP2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AIP3CONTENT> getAIP3() {
		if (aIP3 == null) {
			aIP3 = new EObjectContainmentEList<AIP3CONTENT>(AIP3CONTENT.class, this, V2xmlPackage.AIPCONTENT__AIP3);
		}
		return aIP3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP4CONTENT getAIP4() {
		return aIP4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP4(AIP4CONTENT newAIP4, NotificationChain msgs) {
		AIP4CONTENT oldAIP4 = aIP4;
		aIP4 = newAIP4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP4, oldAIP4, newAIP4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP4(AIP4CONTENT newAIP4) {
		if (newAIP4 != aIP4) {
			NotificationChain msgs = null;
			if (aIP4 != null)
				msgs = ((InternalEObject)aIP4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP4, null, msgs);
			if (newAIP4 != null)
				msgs = ((InternalEObject)newAIP4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP4, null, msgs);
			msgs = basicSetAIP4(newAIP4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP4, newAIP4, newAIP4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP5CONTENT getAIP5() {
		return aIP5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP5(AIP5CONTENT newAIP5, NotificationChain msgs) {
		AIP5CONTENT oldAIP5 = aIP5;
		aIP5 = newAIP5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP5, oldAIP5, newAIP5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP5(AIP5CONTENT newAIP5) {
		if (newAIP5 != aIP5) {
			NotificationChain msgs = null;
			if (aIP5 != null)
				msgs = ((InternalEObject)aIP5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP5, null, msgs);
			if (newAIP5 != null)
				msgs = ((InternalEObject)newAIP5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP5, null, msgs);
			msgs = basicSetAIP5(newAIP5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP5, newAIP5, newAIP5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP6CONTENT getAIP6() {
		return aIP6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP6(AIP6CONTENT newAIP6, NotificationChain msgs) {
		AIP6CONTENT oldAIP6 = aIP6;
		aIP6 = newAIP6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP6, oldAIP6, newAIP6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP6(AIP6CONTENT newAIP6) {
		if (newAIP6 != aIP6) {
			NotificationChain msgs = null;
			if (aIP6 != null)
				msgs = ((InternalEObject)aIP6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP6, null, msgs);
			if (newAIP6 != null)
				msgs = ((InternalEObject)newAIP6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP6, null, msgs);
			msgs = basicSetAIP6(newAIP6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP6, newAIP6, newAIP6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP7CONTENT getAIP7() {
		return aIP7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP7(AIP7CONTENT newAIP7, NotificationChain msgs) {
		AIP7CONTENT oldAIP7 = aIP7;
		aIP7 = newAIP7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP7, oldAIP7, newAIP7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP7(AIP7CONTENT newAIP7) {
		if (newAIP7 != aIP7) {
			NotificationChain msgs = null;
			if (aIP7 != null)
				msgs = ((InternalEObject)aIP7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP7, null, msgs);
			if (newAIP7 != null)
				msgs = ((InternalEObject)newAIP7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP7, null, msgs);
			msgs = basicSetAIP7(newAIP7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP7, newAIP7, newAIP7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP8CONTENT getAIP8() {
		return aIP8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP8(AIP8CONTENT newAIP8, NotificationChain msgs) {
		AIP8CONTENT oldAIP8 = aIP8;
		aIP8 = newAIP8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP8, oldAIP8, newAIP8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP8(AIP8CONTENT newAIP8) {
		if (newAIP8 != aIP8) {
			NotificationChain msgs = null;
			if (aIP8 != null)
				msgs = ((InternalEObject)aIP8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP8, null, msgs);
			if (newAIP8 != null)
				msgs = ((InternalEObject)newAIP8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP8, null, msgs);
			msgs = basicSetAIP8(newAIP8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP8, newAIP8, newAIP8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP9CONTENT getAIP9() {
		return aIP9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP9(AIP9CONTENT newAIP9, NotificationChain msgs) {
		AIP9CONTENT oldAIP9 = aIP9;
		aIP9 = newAIP9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP9, oldAIP9, newAIP9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP9(AIP9CONTENT newAIP9) {
		if (newAIP9 != aIP9) {
			NotificationChain msgs = null;
			if (aIP9 != null)
				msgs = ((InternalEObject)aIP9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP9, null, msgs);
			if (newAIP9 != null)
				msgs = ((InternalEObject)newAIP9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP9, null, msgs);
			msgs = basicSetAIP9(newAIP9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP9, newAIP9, newAIP9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP10CONTENT getAIP10() {
		return aIP10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP10(AIP10CONTENT newAIP10, NotificationChain msgs) {
		AIP10CONTENT oldAIP10 = aIP10;
		aIP10 = newAIP10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP10, oldAIP10, newAIP10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP10(AIP10CONTENT newAIP10) {
		if (newAIP10 != aIP10) {
			NotificationChain msgs = null;
			if (aIP10 != null)
				msgs = ((InternalEObject)aIP10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP10, null, msgs);
			if (newAIP10 != null)
				msgs = ((InternalEObject)newAIP10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP10, null, msgs);
			msgs = basicSetAIP10(newAIP10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP10, newAIP10, newAIP10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP11CONTENT getAIP11() {
		return aIP11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP11(AIP11CONTENT newAIP11, NotificationChain msgs) {
		AIP11CONTENT oldAIP11 = aIP11;
		aIP11 = newAIP11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP11, oldAIP11, newAIP11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP11(AIP11CONTENT newAIP11) {
		if (newAIP11 != aIP11) {
			NotificationChain msgs = null;
			if (aIP11 != null)
				msgs = ((InternalEObject)aIP11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP11, null, msgs);
			if (newAIP11 != null)
				msgs = ((InternalEObject)newAIP11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP11, null, msgs);
			msgs = basicSetAIP11(newAIP11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP11, newAIP11, newAIP11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AIP12CONTENT getAIP12() {
		return aIP12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAIP12(AIP12CONTENT newAIP12, NotificationChain msgs) {
		AIP12CONTENT oldAIP12 = aIP12;
		aIP12 = newAIP12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP12, oldAIP12, newAIP12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAIP12(AIP12CONTENT newAIP12) {
		if (newAIP12 != aIP12) {
			NotificationChain msgs = null;
			if (aIP12 != null)
				msgs = ((InternalEObject)aIP12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP12, null, msgs);
			if (newAIP12 != null)
				msgs = ((InternalEObject)newAIP12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.AIPCONTENT__AIP12, null, msgs);
			msgs = basicSetAIP12(newAIP12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.AIPCONTENT__AIP12, newAIP12, newAIP12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.AIPCONTENT__ANY);
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
			case V2xmlPackage.AIPCONTENT__AIP1:
				return basicSetAIP1(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP2:
				return basicSetAIP2(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP3:
				return ((InternalEList<?>)getAIP3()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.AIPCONTENT__AIP4:
				return basicSetAIP4(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP5:
				return basicSetAIP5(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP6:
				return basicSetAIP6(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP7:
				return basicSetAIP7(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP8:
				return basicSetAIP8(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP9:
				return basicSetAIP9(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP10:
				return basicSetAIP10(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP11:
				return basicSetAIP11(null, msgs);
			case V2xmlPackage.AIPCONTENT__AIP12:
				return basicSetAIP12(null, msgs);
			case V2xmlPackage.AIPCONTENT__ANY:
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
			case V2xmlPackage.AIPCONTENT__AIP1:
				return getAIP1();
			case V2xmlPackage.AIPCONTENT__AIP2:
				return getAIP2();
			case V2xmlPackage.AIPCONTENT__AIP3:
				return getAIP3();
			case V2xmlPackage.AIPCONTENT__AIP4:
				return getAIP4();
			case V2xmlPackage.AIPCONTENT__AIP5:
				return getAIP5();
			case V2xmlPackage.AIPCONTENT__AIP6:
				return getAIP6();
			case V2xmlPackage.AIPCONTENT__AIP7:
				return getAIP7();
			case V2xmlPackage.AIPCONTENT__AIP8:
				return getAIP8();
			case V2xmlPackage.AIPCONTENT__AIP9:
				return getAIP9();
			case V2xmlPackage.AIPCONTENT__AIP10:
				return getAIP10();
			case V2xmlPackage.AIPCONTENT__AIP11:
				return getAIP11();
			case V2xmlPackage.AIPCONTENT__AIP12:
				return getAIP12();
			case V2xmlPackage.AIPCONTENT__ANY:
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
			case V2xmlPackage.AIPCONTENT__AIP1:
				setAIP1((AIP1CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP2:
				setAIP2((AIP2CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP3:
				getAIP3().clear();
				getAIP3().addAll((Collection<? extends AIP3CONTENT>)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP4:
				setAIP4((AIP4CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP5:
				setAIP5((AIP5CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP6:
				setAIP6((AIP6CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP7:
				setAIP7((AIP7CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP8:
				setAIP8((AIP8CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP9:
				setAIP9((AIP9CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP10:
				setAIP10((AIP10CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP11:
				setAIP11((AIP11CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__AIP12:
				setAIP12((AIP12CONTENT)newValue);
				return;
			case V2xmlPackage.AIPCONTENT__ANY:
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
			case V2xmlPackage.AIPCONTENT__AIP1:
				setAIP1((AIP1CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP2:
				setAIP2((AIP2CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP3:
				getAIP3().clear();
				return;
			case V2xmlPackage.AIPCONTENT__AIP4:
				setAIP4((AIP4CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP5:
				setAIP5((AIP5CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP6:
				setAIP6((AIP6CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP7:
				setAIP7((AIP7CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP8:
				setAIP8((AIP8CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP9:
				setAIP9((AIP9CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP10:
				setAIP10((AIP10CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP11:
				setAIP11((AIP11CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__AIP12:
				setAIP12((AIP12CONTENT)null);
				return;
			case V2xmlPackage.AIPCONTENT__ANY:
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
			case V2xmlPackage.AIPCONTENT__AIP1:
				return aIP1 != null;
			case V2xmlPackage.AIPCONTENT__AIP2:
				return aIP2 != null;
			case V2xmlPackage.AIPCONTENT__AIP3:
				return aIP3 != null && !aIP3.isEmpty();
			case V2xmlPackage.AIPCONTENT__AIP4:
				return aIP4 != null;
			case V2xmlPackage.AIPCONTENT__AIP5:
				return aIP5 != null;
			case V2xmlPackage.AIPCONTENT__AIP6:
				return aIP6 != null;
			case V2xmlPackage.AIPCONTENT__AIP7:
				return aIP7 != null;
			case V2xmlPackage.AIPCONTENT__AIP8:
				return aIP8 != null;
			case V2xmlPackage.AIPCONTENT__AIP9:
				return aIP9 != null;
			case V2xmlPackage.AIPCONTENT__AIP10:
				return aIP10 != null;
			case V2xmlPackage.AIPCONTENT__AIP11:
				return aIP11 != null;
			case V2xmlPackage.AIPCONTENT__AIP12:
				return aIP12 != null;
			case V2xmlPackage.AIPCONTENT__ANY:
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

} //AIPCONTENTImpl
