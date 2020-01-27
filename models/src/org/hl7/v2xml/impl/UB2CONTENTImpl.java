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

import org.hl7.v2xml.UB210CONTENT;
import org.hl7.v2xml.UB211CONTENT;
import org.hl7.v2xml.UB212CONTENT;
import org.hl7.v2xml.UB213CONTENT;
import org.hl7.v2xml.UB214CONTENT;
import org.hl7.v2xml.UB215CONTENT;
import org.hl7.v2xml.UB216CONTENT;
import org.hl7.v2xml.UB217CONTENT;
import org.hl7.v2xml.UB21CONTENT;
import org.hl7.v2xml.UB22CONTENT;
import org.hl7.v2xml.UB23CONTENT;
import org.hl7.v2xml.UB24CONTENT;
import org.hl7.v2xml.UB25CONTENT;
import org.hl7.v2xml.UB26CONTENT;
import org.hl7.v2xml.UB27CONTENT;
import org.hl7.v2xml.UB28CONTENT;
import org.hl7.v2xml.UB29CONTENT;
import org.hl7.v2xml.UB2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UB2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB21 <em>UB21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB22 <em>UB22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB23 <em>UB23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB24 <em>UB24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB25 <em>UB25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB26 <em>UB26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB27 <em>UB27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB28 <em>UB28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB29 <em>UB29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB210 <em>UB210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB211 <em>UB211</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB212 <em>UB212</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB213 <em>UB213</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB214 <em>UB214</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB215 <em>UB215</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB216 <em>UB216</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getUB217 <em>UB217</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.UB2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UB2CONTENTImpl extends EObjectImpl implements UB2CONTENT {
	/**
	 * The cached value of the '{@link #getUB21() <em>UB21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB21()
	 * @generated
	 * @ordered
	 */
	protected UB21CONTENT uB21;

	/**
	 * The cached value of the '{@link #getUB22() <em>UB22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB22()
	 * @generated
	 * @ordered
	 */
	protected UB22CONTENT uB22;

	/**
	 * The cached value of the '{@link #getUB23() <em>UB23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB23()
	 * @generated
	 * @ordered
	 */
	protected EList<UB23CONTENT> uB23;

	/**
	 * The cached value of the '{@link #getUB24() <em>UB24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB24()
	 * @generated
	 * @ordered
	 */
	protected UB24CONTENT uB24;

	/**
	 * The cached value of the '{@link #getUB25() <em>UB25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB25()
	 * @generated
	 * @ordered
	 */
	protected UB25CONTENT uB25;

	/**
	 * The cached value of the '{@link #getUB26() <em>UB26</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB26()
	 * @generated
	 * @ordered
	 */
	protected EList<UB26CONTENT> uB26;

	/**
	 * The cached value of the '{@link #getUB27() <em>UB27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB27()
	 * @generated
	 * @ordered
	 */
	protected EList<UB27CONTENT> uB27;

	/**
	 * The cached value of the '{@link #getUB28() <em>UB28</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB28()
	 * @generated
	 * @ordered
	 */
	protected EList<UB28CONTENT> uB28;

	/**
	 * The cached value of the '{@link #getUB29() <em>UB29</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB29()
	 * @generated
	 * @ordered
	 */
	protected EList<UB29CONTENT> uB29;

	/**
	 * The cached value of the '{@link #getUB210() <em>UB210</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB210()
	 * @generated
	 * @ordered
	 */
	protected EList<UB210CONTENT> uB210;

	/**
	 * The cached value of the '{@link #getUB211() <em>UB211</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB211()
	 * @generated
	 * @ordered
	 */
	protected UB211CONTENT uB211;

	/**
	 * The cached value of the '{@link #getUB212() <em>UB212</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB212()
	 * @generated
	 * @ordered
	 */
	protected EList<UB212CONTENT> uB212;

	/**
	 * The cached value of the '{@link #getUB213() <em>UB213</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB213()
	 * @generated
	 * @ordered
	 */
	protected EList<UB213CONTENT> uB213;

	/**
	 * The cached value of the '{@link #getUB214() <em>UB214</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB214()
	 * @generated
	 * @ordered
	 */
	protected EList<UB214CONTENT> uB214;

	/**
	 * The cached value of the '{@link #getUB215() <em>UB215</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB215()
	 * @generated
	 * @ordered
	 */
	protected UB215CONTENT uB215;

	/**
	 * The cached value of the '{@link #getUB216() <em>UB216</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB216()
	 * @generated
	 * @ordered
	 */
	protected EList<UB216CONTENT> uB216;

	/**
	 * The cached value of the '{@link #getUB217() <em>UB217</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUB217()
	 * @generated
	 * @ordered
	 */
	protected UB217CONTENT uB217;

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
	protected UB2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getUB2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB21CONTENT getUB21() {
		return uB21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB21(UB21CONTENT newUB21, NotificationChain msgs) {
		UB21CONTENT oldUB21 = uB21;
		uB21 = newUB21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB21, oldUB21, newUB21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB21(UB21CONTENT newUB21) {
		if (newUB21 != uB21) {
			NotificationChain msgs = null;
			if (uB21 != null)
				msgs = ((InternalEObject)uB21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB21, null, msgs);
			if (newUB21 != null)
				msgs = ((InternalEObject)newUB21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB21, null, msgs);
			msgs = basicSetUB21(newUB21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB21, newUB21, newUB21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB22CONTENT getUB22() {
		return uB22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB22(UB22CONTENT newUB22, NotificationChain msgs) {
		UB22CONTENT oldUB22 = uB22;
		uB22 = newUB22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB22, oldUB22, newUB22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB22(UB22CONTENT newUB22) {
		if (newUB22 != uB22) {
			NotificationChain msgs = null;
			if (uB22 != null)
				msgs = ((InternalEObject)uB22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB22, null, msgs);
			if (newUB22 != null)
				msgs = ((InternalEObject)newUB22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB22, null, msgs);
			msgs = basicSetUB22(newUB22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB22, newUB22, newUB22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB23CONTENT> getUB23() {
		if (uB23 == null) {
			uB23 = new EObjectContainmentEList<UB23CONTENT>(UB23CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB23);
		}
		return uB23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB24CONTENT getUB24() {
		return uB24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB24(UB24CONTENT newUB24, NotificationChain msgs) {
		UB24CONTENT oldUB24 = uB24;
		uB24 = newUB24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB24, oldUB24, newUB24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB24(UB24CONTENT newUB24) {
		if (newUB24 != uB24) {
			NotificationChain msgs = null;
			if (uB24 != null)
				msgs = ((InternalEObject)uB24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB24, null, msgs);
			if (newUB24 != null)
				msgs = ((InternalEObject)newUB24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB24, null, msgs);
			msgs = basicSetUB24(newUB24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB24, newUB24, newUB24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB25CONTENT getUB25() {
		return uB25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB25(UB25CONTENT newUB25, NotificationChain msgs) {
		UB25CONTENT oldUB25 = uB25;
		uB25 = newUB25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB25, oldUB25, newUB25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB25(UB25CONTENT newUB25) {
		if (newUB25 != uB25) {
			NotificationChain msgs = null;
			if (uB25 != null)
				msgs = ((InternalEObject)uB25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB25, null, msgs);
			if (newUB25 != null)
				msgs = ((InternalEObject)newUB25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB25, null, msgs);
			msgs = basicSetUB25(newUB25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB25, newUB25, newUB25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB26CONTENT> getUB26() {
		if (uB26 == null) {
			uB26 = new EObjectContainmentEList<UB26CONTENT>(UB26CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB26);
		}
		return uB26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB27CONTENT> getUB27() {
		if (uB27 == null) {
			uB27 = new EObjectContainmentEList<UB27CONTENT>(UB27CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB27);
		}
		return uB27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB28CONTENT> getUB28() {
		if (uB28 == null) {
			uB28 = new EObjectContainmentEList<UB28CONTENT>(UB28CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB28);
		}
		return uB28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB29CONTENT> getUB29() {
		if (uB29 == null) {
			uB29 = new EObjectContainmentEList<UB29CONTENT>(UB29CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB29);
		}
		return uB29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB210CONTENT> getUB210() {
		if (uB210 == null) {
			uB210 = new EObjectContainmentEList<UB210CONTENT>(UB210CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB210);
		}
		return uB210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB211CONTENT getUB211() {
		return uB211;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB211(UB211CONTENT newUB211, NotificationChain msgs) {
		UB211CONTENT oldUB211 = uB211;
		uB211 = newUB211;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB211, oldUB211, newUB211);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB211(UB211CONTENT newUB211) {
		if (newUB211 != uB211) {
			NotificationChain msgs = null;
			if (uB211 != null)
				msgs = ((InternalEObject)uB211).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB211, null, msgs);
			if (newUB211 != null)
				msgs = ((InternalEObject)newUB211).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB211, null, msgs);
			msgs = basicSetUB211(newUB211, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB211, newUB211, newUB211));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB212CONTENT> getUB212() {
		if (uB212 == null) {
			uB212 = new EObjectContainmentEList<UB212CONTENT>(UB212CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB212);
		}
		return uB212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB213CONTENT> getUB213() {
		if (uB213 == null) {
			uB213 = new EObjectContainmentEList<UB213CONTENT>(UB213CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB213);
		}
		return uB213;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB214CONTENT> getUB214() {
		if (uB214 == null) {
			uB214 = new EObjectContainmentEList<UB214CONTENT>(UB214CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB214);
		}
		return uB214;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB215CONTENT getUB215() {
		return uB215;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB215(UB215CONTENT newUB215, NotificationChain msgs) {
		UB215CONTENT oldUB215 = uB215;
		uB215 = newUB215;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB215, oldUB215, newUB215);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB215(UB215CONTENT newUB215) {
		if (newUB215 != uB215) {
			NotificationChain msgs = null;
			if (uB215 != null)
				msgs = ((InternalEObject)uB215).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB215, null, msgs);
			if (newUB215 != null)
				msgs = ((InternalEObject)newUB215).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB215, null, msgs);
			msgs = basicSetUB215(newUB215, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB215, newUB215, newUB215));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UB216CONTENT> getUB216() {
		if (uB216 == null) {
			uB216 = new EObjectContainmentEList<UB216CONTENT>(UB216CONTENT.class, this, V2xmlPackage.UB2CONTENT__UB216);
		}
		return uB216;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UB217CONTENT getUB217() {
		return uB217;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUB217(UB217CONTENT newUB217, NotificationChain msgs) {
		UB217CONTENT oldUB217 = uB217;
		uB217 = newUB217;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB217, oldUB217, newUB217);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUB217(UB217CONTENT newUB217) {
		if (newUB217 != uB217) {
			NotificationChain msgs = null;
			if (uB217 != null)
				msgs = ((InternalEObject)uB217).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB217, null, msgs);
			if (newUB217 != null)
				msgs = ((InternalEObject)newUB217).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.UB2CONTENT__UB217, null, msgs);
			msgs = basicSetUB217(newUB217, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.UB2CONTENT__UB217, newUB217, newUB217));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.UB2CONTENT__ANY);
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
			case V2xmlPackage.UB2CONTENT__UB21:
				return basicSetUB21(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB22:
				return basicSetUB22(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB23:
				return ((InternalEList<?>)getUB23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB24:
				return basicSetUB24(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB25:
				return basicSetUB25(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB26:
				return ((InternalEList<?>)getUB26()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB27:
				return ((InternalEList<?>)getUB27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB28:
				return ((InternalEList<?>)getUB28()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB29:
				return ((InternalEList<?>)getUB29()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB210:
				return ((InternalEList<?>)getUB210()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB211:
				return basicSetUB211(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB212:
				return ((InternalEList<?>)getUB212()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB213:
				return ((InternalEList<?>)getUB213()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB214:
				return ((InternalEList<?>)getUB214()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB215:
				return basicSetUB215(null, msgs);
			case V2xmlPackage.UB2CONTENT__UB216:
				return ((InternalEList<?>)getUB216()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.UB2CONTENT__UB217:
				return basicSetUB217(null, msgs);
			case V2xmlPackage.UB2CONTENT__ANY:
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
			case V2xmlPackage.UB2CONTENT__UB21:
				return getUB21();
			case V2xmlPackage.UB2CONTENT__UB22:
				return getUB22();
			case V2xmlPackage.UB2CONTENT__UB23:
				return getUB23();
			case V2xmlPackage.UB2CONTENT__UB24:
				return getUB24();
			case V2xmlPackage.UB2CONTENT__UB25:
				return getUB25();
			case V2xmlPackage.UB2CONTENT__UB26:
				return getUB26();
			case V2xmlPackage.UB2CONTENT__UB27:
				return getUB27();
			case V2xmlPackage.UB2CONTENT__UB28:
				return getUB28();
			case V2xmlPackage.UB2CONTENT__UB29:
				return getUB29();
			case V2xmlPackage.UB2CONTENT__UB210:
				return getUB210();
			case V2xmlPackage.UB2CONTENT__UB211:
				return getUB211();
			case V2xmlPackage.UB2CONTENT__UB212:
				return getUB212();
			case V2xmlPackage.UB2CONTENT__UB213:
				return getUB213();
			case V2xmlPackage.UB2CONTENT__UB214:
				return getUB214();
			case V2xmlPackage.UB2CONTENT__UB215:
				return getUB215();
			case V2xmlPackage.UB2CONTENT__UB216:
				return getUB216();
			case V2xmlPackage.UB2CONTENT__UB217:
				return getUB217();
			case V2xmlPackage.UB2CONTENT__ANY:
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
			case V2xmlPackage.UB2CONTENT__UB21:
				setUB21((UB21CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB22:
				setUB22((UB22CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB23:
				getUB23().clear();
				getUB23().addAll((Collection<? extends UB23CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB24:
				setUB24((UB24CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB25:
				setUB25((UB25CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB26:
				getUB26().clear();
				getUB26().addAll((Collection<? extends UB26CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB27:
				getUB27().clear();
				getUB27().addAll((Collection<? extends UB27CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB28:
				getUB28().clear();
				getUB28().addAll((Collection<? extends UB28CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB29:
				getUB29().clear();
				getUB29().addAll((Collection<? extends UB29CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB210:
				getUB210().clear();
				getUB210().addAll((Collection<? extends UB210CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB211:
				setUB211((UB211CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB212:
				getUB212().clear();
				getUB212().addAll((Collection<? extends UB212CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB213:
				getUB213().clear();
				getUB213().addAll((Collection<? extends UB213CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB214:
				getUB214().clear();
				getUB214().addAll((Collection<? extends UB214CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB215:
				setUB215((UB215CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB216:
				getUB216().clear();
				getUB216().addAll((Collection<? extends UB216CONTENT>)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__UB217:
				setUB217((UB217CONTENT)newValue);
				return;
			case V2xmlPackage.UB2CONTENT__ANY:
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
			case V2xmlPackage.UB2CONTENT__UB21:
				setUB21((UB21CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB22:
				setUB22((UB22CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB23:
				getUB23().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB24:
				setUB24((UB24CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB25:
				setUB25((UB25CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB26:
				getUB26().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB27:
				getUB27().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB28:
				getUB28().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB29:
				getUB29().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB210:
				getUB210().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB211:
				setUB211((UB211CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB212:
				getUB212().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB213:
				getUB213().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB214:
				getUB214().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB215:
				setUB215((UB215CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__UB216:
				getUB216().clear();
				return;
			case V2xmlPackage.UB2CONTENT__UB217:
				setUB217((UB217CONTENT)null);
				return;
			case V2xmlPackage.UB2CONTENT__ANY:
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
			case V2xmlPackage.UB2CONTENT__UB21:
				return uB21 != null;
			case V2xmlPackage.UB2CONTENT__UB22:
				return uB22 != null;
			case V2xmlPackage.UB2CONTENT__UB23:
				return uB23 != null && !uB23.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB24:
				return uB24 != null;
			case V2xmlPackage.UB2CONTENT__UB25:
				return uB25 != null;
			case V2xmlPackage.UB2CONTENT__UB26:
				return uB26 != null && !uB26.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB27:
				return uB27 != null && !uB27.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB28:
				return uB28 != null && !uB28.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB29:
				return uB29 != null && !uB29.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB210:
				return uB210 != null && !uB210.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB211:
				return uB211 != null;
			case V2xmlPackage.UB2CONTENT__UB212:
				return uB212 != null && !uB212.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB213:
				return uB213 != null && !uB213.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB214:
				return uB214 != null && !uB214.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB215:
				return uB215 != null;
			case V2xmlPackage.UB2CONTENT__UB216:
				return uB216 != null && !uB216.isEmpty();
			case V2xmlPackage.UB2CONTENT__UB217:
				return uB217 != null;
			case V2xmlPackage.UB2CONTENT__ANY:
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

} //UB2CONTENTImpl
