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

import org.hl7.v2xml.GP210CONTENT;
import org.hl7.v2xml.GP211CONTENT;
import org.hl7.v2xml.GP212CONTENT;
import org.hl7.v2xml.GP213CONTENT;
import org.hl7.v2xml.GP214CONTENT;
import org.hl7.v2xml.GP21CONTENT;
import org.hl7.v2xml.GP22CONTENT;
import org.hl7.v2xml.GP23CONTENT;
import org.hl7.v2xml.GP24CONTENT;
import org.hl7.v2xml.GP25CONTENT;
import org.hl7.v2xml.GP26CONTENT;
import org.hl7.v2xml.GP27CONTENT;
import org.hl7.v2xml.GP28CONTENT;
import org.hl7.v2xml.GP29CONTENT;
import org.hl7.v2xml.GP2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GP2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP21 <em>GP21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP22 <em>GP22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP23 <em>GP23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP24 <em>GP24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP25 <em>GP25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP26 <em>GP26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP27 <em>GP27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP28 <em>GP28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP29 <em>GP29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP210 <em>GP210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP211 <em>GP211</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP212 <em>GP212</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP213 <em>GP213</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getGP214 <em>GP214</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GP2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GP2CONTENTImpl extends EObjectImpl implements GP2CONTENT {
	/**
	 * The cached value of the '{@link #getGP21() <em>GP21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP21()
	 * @generated
	 * @ordered
	 */
	protected GP21CONTENT gP21;

	/**
	 * The cached value of the '{@link #getGP22() <em>GP22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP22()
	 * @generated
	 * @ordered
	 */
	protected GP22CONTENT gP22;

	/**
	 * The cached value of the '{@link #getGP23() <em>GP23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP23()
	 * @generated
	 * @ordered
	 */
	protected GP23CONTENT gP23;

	/**
	 * The cached value of the '{@link #getGP24() <em>GP24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP24()
	 * @generated
	 * @ordered
	 */
	protected GP24CONTENT gP24;

	/**
	 * The cached value of the '{@link #getGP25() <em>GP25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP25()
	 * @generated
	 * @ordered
	 */
	protected GP25CONTENT gP25;

	/**
	 * The cached value of the '{@link #getGP26() <em>GP26</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP26()
	 * @generated
	 * @ordered
	 */
	protected EList<GP26CONTENT> gP26;

	/**
	 * The cached value of the '{@link #getGP27() <em>GP27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP27()
	 * @generated
	 * @ordered
	 */
	protected GP27CONTENT gP27;

	/**
	 * The cached value of the '{@link #getGP28() <em>GP28</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP28()
	 * @generated
	 * @ordered
	 */
	protected EList<GP28CONTENT> gP28;

	/**
	 * The cached value of the '{@link #getGP29() <em>GP29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP29()
	 * @generated
	 * @ordered
	 */
	protected GP29CONTENT gP29;

	/**
	 * The cached value of the '{@link #getGP210() <em>GP210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP210()
	 * @generated
	 * @ordered
	 */
	protected GP210CONTENT gP210;

	/**
	 * The cached value of the '{@link #getGP211() <em>GP211</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP211()
	 * @generated
	 * @ordered
	 */
	protected GP211CONTENT gP211;

	/**
	 * The cached value of the '{@link #getGP212() <em>GP212</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP212()
	 * @generated
	 * @ordered
	 */
	protected GP212CONTENT gP212;

	/**
	 * The cached value of the '{@link #getGP213() <em>GP213</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP213()
	 * @generated
	 * @ordered
	 */
	protected GP213CONTENT gP213;

	/**
	 * The cached value of the '{@link #getGP214() <em>GP214</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGP214()
	 * @generated
	 * @ordered
	 */
	protected GP214CONTENT gP214;

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
	protected GP2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getGP2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP21CONTENT getGP21() {
		return gP21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP21(GP21CONTENT newGP21, NotificationChain msgs) {
		GP21CONTENT oldGP21 = gP21;
		gP21 = newGP21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP21, oldGP21, newGP21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP21(GP21CONTENT newGP21) {
		if (newGP21 != gP21) {
			NotificationChain msgs = null;
			if (gP21 != null)
				msgs = ((InternalEObject)gP21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP21, null, msgs);
			if (newGP21 != null)
				msgs = ((InternalEObject)newGP21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP21, null, msgs);
			msgs = basicSetGP21(newGP21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP21, newGP21, newGP21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP22CONTENT getGP22() {
		return gP22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP22(GP22CONTENT newGP22, NotificationChain msgs) {
		GP22CONTENT oldGP22 = gP22;
		gP22 = newGP22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP22, oldGP22, newGP22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP22(GP22CONTENT newGP22) {
		if (newGP22 != gP22) {
			NotificationChain msgs = null;
			if (gP22 != null)
				msgs = ((InternalEObject)gP22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP22, null, msgs);
			if (newGP22 != null)
				msgs = ((InternalEObject)newGP22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP22, null, msgs);
			msgs = basicSetGP22(newGP22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP22, newGP22, newGP22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP23CONTENT getGP23() {
		return gP23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP23(GP23CONTENT newGP23, NotificationChain msgs) {
		GP23CONTENT oldGP23 = gP23;
		gP23 = newGP23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP23, oldGP23, newGP23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP23(GP23CONTENT newGP23) {
		if (newGP23 != gP23) {
			NotificationChain msgs = null;
			if (gP23 != null)
				msgs = ((InternalEObject)gP23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP23, null, msgs);
			if (newGP23 != null)
				msgs = ((InternalEObject)newGP23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP23, null, msgs);
			msgs = basicSetGP23(newGP23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP23, newGP23, newGP23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP24CONTENT getGP24() {
		return gP24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP24(GP24CONTENT newGP24, NotificationChain msgs) {
		GP24CONTENT oldGP24 = gP24;
		gP24 = newGP24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP24, oldGP24, newGP24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP24(GP24CONTENT newGP24) {
		if (newGP24 != gP24) {
			NotificationChain msgs = null;
			if (gP24 != null)
				msgs = ((InternalEObject)gP24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP24, null, msgs);
			if (newGP24 != null)
				msgs = ((InternalEObject)newGP24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP24, null, msgs);
			msgs = basicSetGP24(newGP24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP24, newGP24, newGP24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP25CONTENT getGP25() {
		return gP25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP25(GP25CONTENT newGP25, NotificationChain msgs) {
		GP25CONTENT oldGP25 = gP25;
		gP25 = newGP25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP25, oldGP25, newGP25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP25(GP25CONTENT newGP25) {
		if (newGP25 != gP25) {
			NotificationChain msgs = null;
			if (gP25 != null)
				msgs = ((InternalEObject)gP25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP25, null, msgs);
			if (newGP25 != null)
				msgs = ((InternalEObject)newGP25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP25, null, msgs);
			msgs = basicSetGP25(newGP25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP25, newGP25, newGP25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP26CONTENT> getGP26() {
		if (gP26 == null) {
			gP26 = new EObjectContainmentEList<GP26CONTENT>(GP26CONTENT.class, this, V2xmlPackage.GP2CONTENT__GP26);
		}
		return gP26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP27CONTENT getGP27() {
		return gP27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP27(GP27CONTENT newGP27, NotificationChain msgs) {
		GP27CONTENT oldGP27 = gP27;
		gP27 = newGP27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP27, oldGP27, newGP27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP27(GP27CONTENT newGP27) {
		if (newGP27 != gP27) {
			NotificationChain msgs = null;
			if (gP27 != null)
				msgs = ((InternalEObject)gP27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP27, null, msgs);
			if (newGP27 != null)
				msgs = ((InternalEObject)newGP27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP27, null, msgs);
			msgs = basicSetGP27(newGP27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP27, newGP27, newGP27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GP28CONTENT> getGP28() {
		if (gP28 == null) {
			gP28 = new EObjectContainmentEList<GP28CONTENT>(GP28CONTENT.class, this, V2xmlPackage.GP2CONTENT__GP28);
		}
		return gP28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP29CONTENT getGP29() {
		return gP29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP29(GP29CONTENT newGP29, NotificationChain msgs) {
		GP29CONTENT oldGP29 = gP29;
		gP29 = newGP29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP29, oldGP29, newGP29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP29(GP29CONTENT newGP29) {
		if (newGP29 != gP29) {
			NotificationChain msgs = null;
			if (gP29 != null)
				msgs = ((InternalEObject)gP29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP29, null, msgs);
			if (newGP29 != null)
				msgs = ((InternalEObject)newGP29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP29, null, msgs);
			msgs = basicSetGP29(newGP29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP29, newGP29, newGP29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP210CONTENT getGP210() {
		return gP210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP210(GP210CONTENT newGP210, NotificationChain msgs) {
		GP210CONTENT oldGP210 = gP210;
		gP210 = newGP210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP210, oldGP210, newGP210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP210(GP210CONTENT newGP210) {
		if (newGP210 != gP210) {
			NotificationChain msgs = null;
			if (gP210 != null)
				msgs = ((InternalEObject)gP210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP210, null, msgs);
			if (newGP210 != null)
				msgs = ((InternalEObject)newGP210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP210, null, msgs);
			msgs = basicSetGP210(newGP210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP210, newGP210, newGP210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP211CONTENT getGP211() {
		return gP211;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP211(GP211CONTENT newGP211, NotificationChain msgs) {
		GP211CONTENT oldGP211 = gP211;
		gP211 = newGP211;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP211, oldGP211, newGP211);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP211(GP211CONTENT newGP211) {
		if (newGP211 != gP211) {
			NotificationChain msgs = null;
			if (gP211 != null)
				msgs = ((InternalEObject)gP211).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP211, null, msgs);
			if (newGP211 != null)
				msgs = ((InternalEObject)newGP211).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP211, null, msgs);
			msgs = basicSetGP211(newGP211, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP211, newGP211, newGP211));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP212CONTENT getGP212() {
		return gP212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP212(GP212CONTENT newGP212, NotificationChain msgs) {
		GP212CONTENT oldGP212 = gP212;
		gP212 = newGP212;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP212, oldGP212, newGP212);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP212(GP212CONTENT newGP212) {
		if (newGP212 != gP212) {
			NotificationChain msgs = null;
			if (gP212 != null)
				msgs = ((InternalEObject)gP212).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP212, null, msgs);
			if (newGP212 != null)
				msgs = ((InternalEObject)newGP212).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP212, null, msgs);
			msgs = basicSetGP212(newGP212, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP212, newGP212, newGP212));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP213CONTENT getGP213() {
		return gP213;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP213(GP213CONTENT newGP213, NotificationChain msgs) {
		GP213CONTENT oldGP213 = gP213;
		gP213 = newGP213;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP213, oldGP213, newGP213);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP213(GP213CONTENT newGP213) {
		if (newGP213 != gP213) {
			NotificationChain msgs = null;
			if (gP213 != null)
				msgs = ((InternalEObject)gP213).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP213, null, msgs);
			if (newGP213 != null)
				msgs = ((InternalEObject)newGP213).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP213, null, msgs);
			msgs = basicSetGP213(newGP213, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP213, newGP213, newGP213));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GP214CONTENT getGP214() {
		return gP214;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGP214(GP214CONTENT newGP214, NotificationChain msgs) {
		GP214CONTENT oldGP214 = gP214;
		gP214 = newGP214;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP214, oldGP214, newGP214);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGP214(GP214CONTENT newGP214) {
		if (newGP214 != gP214) {
			NotificationChain msgs = null;
			if (gP214 != null)
				msgs = ((InternalEObject)gP214).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP214, null, msgs);
			if (newGP214 != null)
				msgs = ((InternalEObject)newGP214).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GP2CONTENT__GP214, null, msgs);
			msgs = basicSetGP214(newGP214, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GP2CONTENT__GP214, newGP214, newGP214));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.GP2CONTENT__ANY);
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
			case V2xmlPackage.GP2CONTENT__GP21:
				return basicSetGP21(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP22:
				return basicSetGP22(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP23:
				return basicSetGP23(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP24:
				return basicSetGP24(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP25:
				return basicSetGP25(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP26:
				return ((InternalEList<?>)getGP26()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GP2CONTENT__GP27:
				return basicSetGP27(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP28:
				return ((InternalEList<?>)getGP28()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GP2CONTENT__GP29:
				return basicSetGP29(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP210:
				return basicSetGP210(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP211:
				return basicSetGP211(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP212:
				return basicSetGP212(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP213:
				return basicSetGP213(null, msgs);
			case V2xmlPackage.GP2CONTENT__GP214:
				return basicSetGP214(null, msgs);
			case V2xmlPackage.GP2CONTENT__ANY:
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
			case V2xmlPackage.GP2CONTENT__GP21:
				return getGP21();
			case V2xmlPackage.GP2CONTENT__GP22:
				return getGP22();
			case V2xmlPackage.GP2CONTENT__GP23:
				return getGP23();
			case V2xmlPackage.GP2CONTENT__GP24:
				return getGP24();
			case V2xmlPackage.GP2CONTENT__GP25:
				return getGP25();
			case V2xmlPackage.GP2CONTENT__GP26:
				return getGP26();
			case V2xmlPackage.GP2CONTENT__GP27:
				return getGP27();
			case V2xmlPackage.GP2CONTENT__GP28:
				return getGP28();
			case V2xmlPackage.GP2CONTENT__GP29:
				return getGP29();
			case V2xmlPackage.GP2CONTENT__GP210:
				return getGP210();
			case V2xmlPackage.GP2CONTENT__GP211:
				return getGP211();
			case V2xmlPackage.GP2CONTENT__GP212:
				return getGP212();
			case V2xmlPackage.GP2CONTENT__GP213:
				return getGP213();
			case V2xmlPackage.GP2CONTENT__GP214:
				return getGP214();
			case V2xmlPackage.GP2CONTENT__ANY:
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
			case V2xmlPackage.GP2CONTENT__GP21:
				setGP21((GP21CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP22:
				setGP22((GP22CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP23:
				setGP23((GP23CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP24:
				setGP24((GP24CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP25:
				setGP25((GP25CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP26:
				getGP26().clear();
				getGP26().addAll((Collection<? extends GP26CONTENT>)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP27:
				setGP27((GP27CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP28:
				getGP28().clear();
				getGP28().addAll((Collection<? extends GP28CONTENT>)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP29:
				setGP29((GP29CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP210:
				setGP210((GP210CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP211:
				setGP211((GP211CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP212:
				setGP212((GP212CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP213:
				setGP213((GP213CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__GP214:
				setGP214((GP214CONTENT)newValue);
				return;
			case V2xmlPackage.GP2CONTENT__ANY:
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
			case V2xmlPackage.GP2CONTENT__GP21:
				setGP21((GP21CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP22:
				setGP22((GP22CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP23:
				setGP23((GP23CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP24:
				setGP24((GP24CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP25:
				setGP25((GP25CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP26:
				getGP26().clear();
				return;
			case V2xmlPackage.GP2CONTENT__GP27:
				setGP27((GP27CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP28:
				getGP28().clear();
				return;
			case V2xmlPackage.GP2CONTENT__GP29:
				setGP29((GP29CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP210:
				setGP210((GP210CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP211:
				setGP211((GP211CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP212:
				setGP212((GP212CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP213:
				setGP213((GP213CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__GP214:
				setGP214((GP214CONTENT)null);
				return;
			case V2xmlPackage.GP2CONTENT__ANY:
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
			case V2xmlPackage.GP2CONTENT__GP21:
				return gP21 != null;
			case V2xmlPackage.GP2CONTENT__GP22:
				return gP22 != null;
			case V2xmlPackage.GP2CONTENT__GP23:
				return gP23 != null;
			case V2xmlPackage.GP2CONTENT__GP24:
				return gP24 != null;
			case V2xmlPackage.GP2CONTENT__GP25:
				return gP25 != null;
			case V2xmlPackage.GP2CONTENT__GP26:
				return gP26 != null && !gP26.isEmpty();
			case V2xmlPackage.GP2CONTENT__GP27:
				return gP27 != null;
			case V2xmlPackage.GP2CONTENT__GP28:
				return gP28 != null && !gP28.isEmpty();
			case V2xmlPackage.GP2CONTENT__GP29:
				return gP29 != null;
			case V2xmlPackage.GP2CONTENT__GP210:
				return gP210 != null;
			case V2xmlPackage.GP2CONTENT__GP211:
				return gP211 != null;
			case V2xmlPackage.GP2CONTENT__GP212:
				return gP212 != null;
			case V2xmlPackage.GP2CONTENT__GP213:
				return gP213 != null;
			case V2xmlPackage.GP2CONTENT__GP214:
				return gP214 != null;
			case V2xmlPackage.GP2CONTENT__ANY:
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

} //GP2CONTENTImpl
