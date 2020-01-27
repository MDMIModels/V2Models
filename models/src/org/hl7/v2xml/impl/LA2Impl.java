/**
 */
package org.hl7.v2xml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.hl7.v2xml.LA2;
import org.hl7.v2xml.LA210CONTENT;
import org.hl7.v2xml.LA211CONTENT;
import org.hl7.v2xml.LA212CONTENT;
import org.hl7.v2xml.LA213CONTENT;
import org.hl7.v2xml.LA214CONTENT;
import org.hl7.v2xml.LA215CONTENT;
import org.hl7.v2xml.LA216CONTENT;
import org.hl7.v2xml.LA21CONTENT;
import org.hl7.v2xml.LA22CONTENT;
import org.hl7.v2xml.LA23CONTENT;
import org.hl7.v2xml.LA24CONTENT;
import org.hl7.v2xml.LA25CONTENT;
import org.hl7.v2xml.LA26CONTENT;
import org.hl7.v2xml.LA27CONTENT;
import org.hl7.v2xml.LA28CONTENT;
import org.hl7.v2xml.LA29CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LA2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA21 <em>LA21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA22 <em>LA22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA23 <em>LA23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA24 <em>LA24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA25 <em>LA25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA26 <em>LA26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA27 <em>LA27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA28 <em>LA28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA29 <em>LA29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA210 <em>LA210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA211 <em>LA211</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA212 <em>LA212</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA213 <em>LA213</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA214 <em>LA214</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA215 <em>LA215</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.LA2Impl#getLA216 <em>LA216</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LA2Impl extends EObjectImpl implements LA2 {
	/**
	 * The cached value of the '{@link #getLA21() <em>LA21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA21()
	 * @generated
	 * @ordered
	 */
	protected LA21CONTENT lA21;

	/**
	 * The cached value of the '{@link #getLA22() <em>LA22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA22()
	 * @generated
	 * @ordered
	 */
	protected LA22CONTENT lA22;

	/**
	 * The cached value of the '{@link #getLA23() <em>LA23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA23()
	 * @generated
	 * @ordered
	 */
	protected LA23CONTENT lA23;

	/**
	 * The cached value of the '{@link #getLA24() <em>LA24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA24()
	 * @generated
	 * @ordered
	 */
	protected LA24CONTENT lA24;

	/**
	 * The cached value of the '{@link #getLA25() <em>LA25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA25()
	 * @generated
	 * @ordered
	 */
	protected LA25CONTENT lA25;

	/**
	 * The cached value of the '{@link #getLA26() <em>LA26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA26()
	 * @generated
	 * @ordered
	 */
	protected LA26CONTENT lA26;

	/**
	 * The cached value of the '{@link #getLA27() <em>LA27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA27()
	 * @generated
	 * @ordered
	 */
	protected LA27CONTENT lA27;

	/**
	 * The cached value of the '{@link #getLA28() <em>LA28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA28()
	 * @generated
	 * @ordered
	 */
	protected LA28CONTENT lA28;

	/**
	 * The cached value of the '{@link #getLA29() <em>LA29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA29()
	 * @generated
	 * @ordered
	 */
	protected LA29CONTENT lA29;

	/**
	 * The cached value of the '{@link #getLA210() <em>LA210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA210()
	 * @generated
	 * @ordered
	 */
	protected LA210CONTENT lA210;

	/**
	 * The cached value of the '{@link #getLA211() <em>LA211</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA211()
	 * @generated
	 * @ordered
	 */
	protected LA211CONTENT lA211;

	/**
	 * The cached value of the '{@link #getLA212() <em>LA212</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA212()
	 * @generated
	 * @ordered
	 */
	protected LA212CONTENT lA212;

	/**
	 * The cached value of the '{@link #getLA213() <em>LA213</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA213()
	 * @generated
	 * @ordered
	 */
	protected LA213CONTENT lA213;

	/**
	 * The cached value of the '{@link #getLA214() <em>LA214</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA214()
	 * @generated
	 * @ordered
	 */
	protected LA214CONTENT lA214;

	/**
	 * The cached value of the '{@link #getLA215() <em>LA215</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA215()
	 * @generated
	 * @ordered
	 */
	protected LA215CONTENT lA215;

	/**
	 * The cached value of the '{@link #getLA216() <em>LA216</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLA216()
	 * @generated
	 * @ordered
	 */
	protected LA216CONTENT lA216;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LA2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getLA2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA21CONTENT getLA21() {
		return lA21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA21(LA21CONTENT newLA21, NotificationChain msgs) {
		LA21CONTENT oldLA21 = lA21;
		lA21 = newLA21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA21, oldLA21, newLA21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA21(LA21CONTENT newLA21) {
		if (newLA21 != lA21) {
			NotificationChain msgs = null;
			if (lA21 != null)
				msgs = ((InternalEObject)lA21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA21, null, msgs);
			if (newLA21 != null)
				msgs = ((InternalEObject)newLA21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA21, null, msgs);
			msgs = basicSetLA21(newLA21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA21, newLA21, newLA21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA22CONTENT getLA22() {
		return lA22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA22(LA22CONTENT newLA22, NotificationChain msgs) {
		LA22CONTENT oldLA22 = lA22;
		lA22 = newLA22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA22, oldLA22, newLA22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA22(LA22CONTENT newLA22) {
		if (newLA22 != lA22) {
			NotificationChain msgs = null;
			if (lA22 != null)
				msgs = ((InternalEObject)lA22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA22, null, msgs);
			if (newLA22 != null)
				msgs = ((InternalEObject)newLA22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA22, null, msgs);
			msgs = basicSetLA22(newLA22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA22, newLA22, newLA22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA23CONTENT getLA23() {
		return lA23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA23(LA23CONTENT newLA23, NotificationChain msgs) {
		LA23CONTENT oldLA23 = lA23;
		lA23 = newLA23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA23, oldLA23, newLA23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA23(LA23CONTENT newLA23) {
		if (newLA23 != lA23) {
			NotificationChain msgs = null;
			if (lA23 != null)
				msgs = ((InternalEObject)lA23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA23, null, msgs);
			if (newLA23 != null)
				msgs = ((InternalEObject)newLA23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA23, null, msgs);
			msgs = basicSetLA23(newLA23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA23, newLA23, newLA23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA24CONTENT getLA24() {
		return lA24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA24(LA24CONTENT newLA24, NotificationChain msgs) {
		LA24CONTENT oldLA24 = lA24;
		lA24 = newLA24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA24, oldLA24, newLA24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA24(LA24CONTENT newLA24) {
		if (newLA24 != lA24) {
			NotificationChain msgs = null;
			if (lA24 != null)
				msgs = ((InternalEObject)lA24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA24, null, msgs);
			if (newLA24 != null)
				msgs = ((InternalEObject)newLA24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA24, null, msgs);
			msgs = basicSetLA24(newLA24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA24, newLA24, newLA24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA25CONTENT getLA25() {
		return lA25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA25(LA25CONTENT newLA25, NotificationChain msgs) {
		LA25CONTENT oldLA25 = lA25;
		lA25 = newLA25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA25, oldLA25, newLA25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA25(LA25CONTENT newLA25) {
		if (newLA25 != lA25) {
			NotificationChain msgs = null;
			if (lA25 != null)
				msgs = ((InternalEObject)lA25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA25, null, msgs);
			if (newLA25 != null)
				msgs = ((InternalEObject)newLA25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA25, null, msgs);
			msgs = basicSetLA25(newLA25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA25, newLA25, newLA25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA26CONTENT getLA26() {
		return lA26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA26(LA26CONTENT newLA26, NotificationChain msgs) {
		LA26CONTENT oldLA26 = lA26;
		lA26 = newLA26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA26, oldLA26, newLA26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA26(LA26CONTENT newLA26) {
		if (newLA26 != lA26) {
			NotificationChain msgs = null;
			if (lA26 != null)
				msgs = ((InternalEObject)lA26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA26, null, msgs);
			if (newLA26 != null)
				msgs = ((InternalEObject)newLA26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA26, null, msgs);
			msgs = basicSetLA26(newLA26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA26, newLA26, newLA26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA27CONTENT getLA27() {
		return lA27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA27(LA27CONTENT newLA27, NotificationChain msgs) {
		LA27CONTENT oldLA27 = lA27;
		lA27 = newLA27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA27, oldLA27, newLA27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA27(LA27CONTENT newLA27) {
		if (newLA27 != lA27) {
			NotificationChain msgs = null;
			if (lA27 != null)
				msgs = ((InternalEObject)lA27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA27, null, msgs);
			if (newLA27 != null)
				msgs = ((InternalEObject)newLA27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA27, null, msgs);
			msgs = basicSetLA27(newLA27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA27, newLA27, newLA27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA28CONTENT getLA28() {
		return lA28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA28(LA28CONTENT newLA28, NotificationChain msgs) {
		LA28CONTENT oldLA28 = lA28;
		lA28 = newLA28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA28, oldLA28, newLA28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA28(LA28CONTENT newLA28) {
		if (newLA28 != lA28) {
			NotificationChain msgs = null;
			if (lA28 != null)
				msgs = ((InternalEObject)lA28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA28, null, msgs);
			if (newLA28 != null)
				msgs = ((InternalEObject)newLA28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA28, null, msgs);
			msgs = basicSetLA28(newLA28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA28, newLA28, newLA28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA29CONTENT getLA29() {
		return lA29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA29(LA29CONTENT newLA29, NotificationChain msgs) {
		LA29CONTENT oldLA29 = lA29;
		lA29 = newLA29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA29, oldLA29, newLA29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA29(LA29CONTENT newLA29) {
		if (newLA29 != lA29) {
			NotificationChain msgs = null;
			if (lA29 != null)
				msgs = ((InternalEObject)lA29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA29, null, msgs);
			if (newLA29 != null)
				msgs = ((InternalEObject)newLA29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA29, null, msgs);
			msgs = basicSetLA29(newLA29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA29, newLA29, newLA29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA210CONTENT getLA210() {
		return lA210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA210(LA210CONTENT newLA210, NotificationChain msgs) {
		LA210CONTENT oldLA210 = lA210;
		lA210 = newLA210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA210, oldLA210, newLA210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA210(LA210CONTENT newLA210) {
		if (newLA210 != lA210) {
			NotificationChain msgs = null;
			if (lA210 != null)
				msgs = ((InternalEObject)lA210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA210, null, msgs);
			if (newLA210 != null)
				msgs = ((InternalEObject)newLA210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA210, null, msgs);
			msgs = basicSetLA210(newLA210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA210, newLA210, newLA210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA211CONTENT getLA211() {
		return lA211;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA211(LA211CONTENT newLA211, NotificationChain msgs) {
		LA211CONTENT oldLA211 = lA211;
		lA211 = newLA211;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA211, oldLA211, newLA211);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA211(LA211CONTENT newLA211) {
		if (newLA211 != lA211) {
			NotificationChain msgs = null;
			if (lA211 != null)
				msgs = ((InternalEObject)lA211).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA211, null, msgs);
			if (newLA211 != null)
				msgs = ((InternalEObject)newLA211).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA211, null, msgs);
			msgs = basicSetLA211(newLA211, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA211, newLA211, newLA211));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA212CONTENT getLA212() {
		return lA212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA212(LA212CONTENT newLA212, NotificationChain msgs) {
		LA212CONTENT oldLA212 = lA212;
		lA212 = newLA212;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA212, oldLA212, newLA212);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA212(LA212CONTENT newLA212) {
		if (newLA212 != lA212) {
			NotificationChain msgs = null;
			if (lA212 != null)
				msgs = ((InternalEObject)lA212).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA212, null, msgs);
			if (newLA212 != null)
				msgs = ((InternalEObject)newLA212).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA212, null, msgs);
			msgs = basicSetLA212(newLA212, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA212, newLA212, newLA212));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA213CONTENT getLA213() {
		return lA213;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA213(LA213CONTENT newLA213, NotificationChain msgs) {
		LA213CONTENT oldLA213 = lA213;
		lA213 = newLA213;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA213, oldLA213, newLA213);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA213(LA213CONTENT newLA213) {
		if (newLA213 != lA213) {
			NotificationChain msgs = null;
			if (lA213 != null)
				msgs = ((InternalEObject)lA213).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA213, null, msgs);
			if (newLA213 != null)
				msgs = ((InternalEObject)newLA213).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA213, null, msgs);
			msgs = basicSetLA213(newLA213, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA213, newLA213, newLA213));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA214CONTENT getLA214() {
		return lA214;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA214(LA214CONTENT newLA214, NotificationChain msgs) {
		LA214CONTENT oldLA214 = lA214;
		lA214 = newLA214;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA214, oldLA214, newLA214);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA214(LA214CONTENT newLA214) {
		if (newLA214 != lA214) {
			NotificationChain msgs = null;
			if (lA214 != null)
				msgs = ((InternalEObject)lA214).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA214, null, msgs);
			if (newLA214 != null)
				msgs = ((InternalEObject)newLA214).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA214, null, msgs);
			msgs = basicSetLA214(newLA214, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA214, newLA214, newLA214));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA215CONTENT getLA215() {
		return lA215;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA215(LA215CONTENT newLA215, NotificationChain msgs) {
		LA215CONTENT oldLA215 = lA215;
		lA215 = newLA215;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA215, oldLA215, newLA215);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA215(LA215CONTENT newLA215) {
		if (newLA215 != lA215) {
			NotificationChain msgs = null;
			if (lA215 != null)
				msgs = ((InternalEObject)lA215).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA215, null, msgs);
			if (newLA215 != null)
				msgs = ((InternalEObject)newLA215).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA215, null, msgs);
			msgs = basicSetLA215(newLA215, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA215, newLA215, newLA215));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LA216CONTENT getLA216() {
		return lA216;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLA216(LA216CONTENT newLA216, NotificationChain msgs) {
		LA216CONTENT oldLA216 = lA216;
		lA216 = newLA216;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA216, oldLA216, newLA216);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLA216(LA216CONTENT newLA216) {
		if (newLA216 != lA216) {
			NotificationChain msgs = null;
			if (lA216 != null)
				msgs = ((InternalEObject)lA216).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA216, null, msgs);
			if (newLA216 != null)
				msgs = ((InternalEObject)newLA216).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.LA2__LA216, null, msgs);
			msgs = basicSetLA216(newLA216, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.LA2__LA216, newLA216, newLA216));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case V2xmlPackage.LA2__LA21:
				return basicSetLA21(null, msgs);
			case V2xmlPackage.LA2__LA22:
				return basicSetLA22(null, msgs);
			case V2xmlPackage.LA2__LA23:
				return basicSetLA23(null, msgs);
			case V2xmlPackage.LA2__LA24:
				return basicSetLA24(null, msgs);
			case V2xmlPackage.LA2__LA25:
				return basicSetLA25(null, msgs);
			case V2xmlPackage.LA2__LA26:
				return basicSetLA26(null, msgs);
			case V2xmlPackage.LA2__LA27:
				return basicSetLA27(null, msgs);
			case V2xmlPackage.LA2__LA28:
				return basicSetLA28(null, msgs);
			case V2xmlPackage.LA2__LA29:
				return basicSetLA29(null, msgs);
			case V2xmlPackage.LA2__LA210:
				return basicSetLA210(null, msgs);
			case V2xmlPackage.LA2__LA211:
				return basicSetLA211(null, msgs);
			case V2xmlPackage.LA2__LA212:
				return basicSetLA212(null, msgs);
			case V2xmlPackage.LA2__LA213:
				return basicSetLA213(null, msgs);
			case V2xmlPackage.LA2__LA214:
				return basicSetLA214(null, msgs);
			case V2xmlPackage.LA2__LA215:
				return basicSetLA215(null, msgs);
			case V2xmlPackage.LA2__LA216:
				return basicSetLA216(null, msgs);
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
			case V2xmlPackage.LA2__LA21:
				return getLA21();
			case V2xmlPackage.LA2__LA22:
				return getLA22();
			case V2xmlPackage.LA2__LA23:
				return getLA23();
			case V2xmlPackage.LA2__LA24:
				return getLA24();
			case V2xmlPackage.LA2__LA25:
				return getLA25();
			case V2xmlPackage.LA2__LA26:
				return getLA26();
			case V2xmlPackage.LA2__LA27:
				return getLA27();
			case V2xmlPackage.LA2__LA28:
				return getLA28();
			case V2xmlPackage.LA2__LA29:
				return getLA29();
			case V2xmlPackage.LA2__LA210:
				return getLA210();
			case V2xmlPackage.LA2__LA211:
				return getLA211();
			case V2xmlPackage.LA2__LA212:
				return getLA212();
			case V2xmlPackage.LA2__LA213:
				return getLA213();
			case V2xmlPackage.LA2__LA214:
				return getLA214();
			case V2xmlPackage.LA2__LA215:
				return getLA215();
			case V2xmlPackage.LA2__LA216:
				return getLA216();
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
			case V2xmlPackage.LA2__LA21:
				setLA21((LA21CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA22:
				setLA22((LA22CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA23:
				setLA23((LA23CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA24:
				setLA24((LA24CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA25:
				setLA25((LA25CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA26:
				setLA26((LA26CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA27:
				setLA27((LA27CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA28:
				setLA28((LA28CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA29:
				setLA29((LA29CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA210:
				setLA210((LA210CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA211:
				setLA211((LA211CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA212:
				setLA212((LA212CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA213:
				setLA213((LA213CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA214:
				setLA214((LA214CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA215:
				setLA215((LA215CONTENT)newValue);
				return;
			case V2xmlPackage.LA2__LA216:
				setLA216((LA216CONTENT)newValue);
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
			case V2xmlPackage.LA2__LA21:
				setLA21((LA21CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA22:
				setLA22((LA22CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA23:
				setLA23((LA23CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA24:
				setLA24((LA24CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA25:
				setLA25((LA25CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA26:
				setLA26((LA26CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA27:
				setLA27((LA27CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA28:
				setLA28((LA28CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA29:
				setLA29((LA29CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA210:
				setLA210((LA210CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA211:
				setLA211((LA211CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA212:
				setLA212((LA212CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA213:
				setLA213((LA213CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA214:
				setLA214((LA214CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA215:
				setLA215((LA215CONTENT)null);
				return;
			case V2xmlPackage.LA2__LA216:
				setLA216((LA216CONTENT)null);
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
			case V2xmlPackage.LA2__LA21:
				return lA21 != null;
			case V2xmlPackage.LA2__LA22:
				return lA22 != null;
			case V2xmlPackage.LA2__LA23:
				return lA23 != null;
			case V2xmlPackage.LA2__LA24:
				return lA24 != null;
			case V2xmlPackage.LA2__LA25:
				return lA25 != null;
			case V2xmlPackage.LA2__LA26:
				return lA26 != null;
			case V2xmlPackage.LA2__LA27:
				return lA27 != null;
			case V2xmlPackage.LA2__LA28:
				return lA28 != null;
			case V2xmlPackage.LA2__LA29:
				return lA29 != null;
			case V2xmlPackage.LA2__LA210:
				return lA210 != null;
			case V2xmlPackage.LA2__LA211:
				return lA211 != null;
			case V2xmlPackage.LA2__LA212:
				return lA212 != null;
			case V2xmlPackage.LA2__LA213:
				return lA213 != null;
			case V2xmlPackage.LA2__LA214:
				return lA214 != null;
			case V2xmlPackage.LA2__LA215:
				return lA215 != null;
			case V2xmlPackage.LA2__LA216:
				return lA216 != null;
		}
		return super.eIsSet(featureID);
	}

} //LA2Impl
