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

import org.hl7.v2xml.IN310CONTENT;
import org.hl7.v2xml.IN311CONTENT;
import org.hl7.v2xml.IN312CONTENT;
import org.hl7.v2xml.IN313CONTENT;
import org.hl7.v2xml.IN314CONTENT;
import org.hl7.v2xml.IN315CONTENT;
import org.hl7.v2xml.IN316CONTENT;
import org.hl7.v2xml.IN317CONTENT;
import org.hl7.v2xml.IN318CONTENT;
import org.hl7.v2xml.IN319CONTENT;
import org.hl7.v2xml.IN31CONTENT;
import org.hl7.v2xml.IN320CONTENT;
import org.hl7.v2xml.IN321CONTENT;
import org.hl7.v2xml.IN322CONTENT;
import org.hl7.v2xml.IN323CONTENT;
import org.hl7.v2xml.IN324CONTENT;
import org.hl7.v2xml.IN325CONTENT;
import org.hl7.v2xml.IN32CONTENT;
import org.hl7.v2xml.IN33CONTENT;
import org.hl7.v2xml.IN34CONTENT;
import org.hl7.v2xml.IN35CONTENT;
import org.hl7.v2xml.IN36CONTENT;
import org.hl7.v2xml.IN37CONTENT;
import org.hl7.v2xml.IN38CONTENT;
import org.hl7.v2xml.IN39CONTENT;
import org.hl7.v2xml.IN3CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IN3CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN31 <em>IN31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN32 <em>IN32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN33 <em>IN33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN34 <em>IN34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN35 <em>IN35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN36 <em>IN36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN37 <em>IN37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN38 <em>IN38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN39 <em>IN39</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN310 <em>IN310</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN311 <em>IN311</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN312 <em>IN312</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN313 <em>IN313</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN314 <em>IN314</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN315 <em>IN315</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN316 <em>IN316</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN317 <em>IN317</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN318 <em>IN318</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN319 <em>IN319</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN320 <em>IN320</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN321 <em>IN321</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN322 <em>IN322</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN323 <em>IN323</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN324 <em>IN324</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getIN325 <em>IN325</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN3CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IN3CONTENTImpl extends EObjectImpl implements IN3CONTENT {
	/**
	 * The cached value of the '{@link #getIN31() <em>IN31</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN31()
	 * @generated
	 * @ordered
	 */
	protected IN31CONTENT iN31;

	/**
	 * The cached value of the '{@link #getIN32() <em>IN32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN32()
	 * @generated
	 * @ordered
	 */
	protected IN32CONTENT iN32;

	/**
	 * The cached value of the '{@link #getIN33() <em>IN33</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN33()
	 * @generated
	 * @ordered
	 */
	protected EList<IN33CONTENT> iN33;

	/**
	 * The cached value of the '{@link #getIN34() <em>IN34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN34()
	 * @generated
	 * @ordered
	 */
	protected IN34CONTENT iN34;

	/**
	 * The cached value of the '{@link #getIN35() <em>IN35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN35()
	 * @generated
	 * @ordered
	 */
	protected IN35CONTENT iN35;

	/**
	 * The cached value of the '{@link #getIN36() <em>IN36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN36()
	 * @generated
	 * @ordered
	 */
	protected IN36CONTENT iN36;

	/**
	 * The cached value of the '{@link #getIN37() <em>IN37</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN37()
	 * @generated
	 * @ordered
	 */
	protected IN37CONTENT iN37;

	/**
	 * The cached value of the '{@link #getIN38() <em>IN38</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN38()
	 * @generated
	 * @ordered
	 */
	protected EList<IN38CONTENT> iN38;

	/**
	 * The cached value of the '{@link #getIN39() <em>IN39</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN39()
	 * @generated
	 * @ordered
	 */
	protected IN39CONTENT iN39;

	/**
	 * The cached value of the '{@link #getIN310() <em>IN310</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN310()
	 * @generated
	 * @ordered
	 */
	protected IN310CONTENT iN310;

	/**
	 * The cached value of the '{@link #getIN311() <em>IN311</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN311()
	 * @generated
	 * @ordered
	 */
	protected IN311CONTENT iN311;

	/**
	 * The cached value of the '{@link #getIN312() <em>IN312</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN312()
	 * @generated
	 * @ordered
	 */
	protected IN312CONTENT iN312;

	/**
	 * The cached value of the '{@link #getIN313() <em>IN313</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN313()
	 * @generated
	 * @ordered
	 */
	protected IN313CONTENT iN313;

	/**
	 * The cached value of the '{@link #getIN314() <em>IN314</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN314()
	 * @generated
	 * @ordered
	 */
	protected EList<IN314CONTENT> iN314;

	/**
	 * The cached value of the '{@link #getIN315() <em>IN315</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN315()
	 * @generated
	 * @ordered
	 */
	protected IN315CONTENT iN315;

	/**
	 * The cached value of the '{@link #getIN316() <em>IN316</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN316()
	 * @generated
	 * @ordered
	 */
	protected EList<IN316CONTENT> iN316;

	/**
	 * The cached value of the '{@link #getIN317() <em>IN317</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN317()
	 * @generated
	 * @ordered
	 */
	protected IN317CONTENT iN317;

	/**
	 * The cached value of the '{@link #getIN318() <em>IN318</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN318()
	 * @generated
	 * @ordered
	 */
	protected IN318CONTENT iN318;

	/**
	 * The cached value of the '{@link #getIN319() <em>IN319</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN319()
	 * @generated
	 * @ordered
	 */
	protected EList<IN319CONTENT> iN319;

	/**
	 * The cached value of the '{@link #getIN320() <em>IN320</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN320()
	 * @generated
	 * @ordered
	 */
	protected EList<IN320CONTENT> iN320;

	/**
	 * The cached value of the '{@link #getIN321() <em>IN321</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN321()
	 * @generated
	 * @ordered
	 */
	protected IN321CONTENT iN321;

	/**
	 * The cached value of the '{@link #getIN322() <em>IN322</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN322()
	 * @generated
	 * @ordered
	 */
	protected IN322CONTENT iN322;

	/**
	 * The cached value of the '{@link #getIN323() <em>IN323</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN323()
	 * @generated
	 * @ordered
	 */
	protected IN323CONTENT iN323;

	/**
	 * The cached value of the '{@link #getIN324() <em>IN324</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN324()
	 * @generated
	 * @ordered
	 */
	protected EList<IN324CONTENT> iN324;

	/**
	 * The cached value of the '{@link #getIN325() <em>IN325</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN325()
	 * @generated
	 * @ordered
	 */
	protected EList<IN325CONTENT> iN325;

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
	protected IN3CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIN3CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN31CONTENT getIN31() {
		return iN31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN31(IN31CONTENT newIN31, NotificationChain msgs) {
		IN31CONTENT oldIN31 = iN31;
		iN31 = newIN31;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN31, oldIN31, newIN31);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN31(IN31CONTENT newIN31) {
		if (newIN31 != iN31) {
			NotificationChain msgs = null;
			if (iN31 != null)
				msgs = ((InternalEObject)iN31).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN31, null, msgs);
			if (newIN31 != null)
				msgs = ((InternalEObject)newIN31).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN31, null, msgs);
			msgs = basicSetIN31(newIN31, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN31, newIN31, newIN31));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN32CONTENT getIN32() {
		return iN32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN32(IN32CONTENT newIN32, NotificationChain msgs) {
		IN32CONTENT oldIN32 = iN32;
		iN32 = newIN32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN32, oldIN32, newIN32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN32(IN32CONTENT newIN32) {
		if (newIN32 != iN32) {
			NotificationChain msgs = null;
			if (iN32 != null)
				msgs = ((InternalEObject)iN32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN32, null, msgs);
			if (newIN32 != null)
				msgs = ((InternalEObject)newIN32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN32, null, msgs);
			msgs = basicSetIN32(newIN32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN32, newIN32, newIN32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN33CONTENT> getIN33() {
		if (iN33 == null) {
			iN33 = new EObjectContainmentEList<IN33CONTENT>(IN33CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN33);
		}
		return iN33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN34CONTENT getIN34() {
		return iN34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN34(IN34CONTENT newIN34, NotificationChain msgs) {
		IN34CONTENT oldIN34 = iN34;
		iN34 = newIN34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN34, oldIN34, newIN34);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN34(IN34CONTENT newIN34) {
		if (newIN34 != iN34) {
			NotificationChain msgs = null;
			if (iN34 != null)
				msgs = ((InternalEObject)iN34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN34, null, msgs);
			if (newIN34 != null)
				msgs = ((InternalEObject)newIN34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN34, null, msgs);
			msgs = basicSetIN34(newIN34, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN34, newIN34, newIN34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN35CONTENT getIN35() {
		return iN35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN35(IN35CONTENT newIN35, NotificationChain msgs) {
		IN35CONTENT oldIN35 = iN35;
		iN35 = newIN35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN35, oldIN35, newIN35);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN35(IN35CONTENT newIN35) {
		if (newIN35 != iN35) {
			NotificationChain msgs = null;
			if (iN35 != null)
				msgs = ((InternalEObject)iN35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN35, null, msgs);
			if (newIN35 != null)
				msgs = ((InternalEObject)newIN35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN35, null, msgs);
			msgs = basicSetIN35(newIN35, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN35, newIN35, newIN35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN36CONTENT getIN36() {
		return iN36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN36(IN36CONTENT newIN36, NotificationChain msgs) {
		IN36CONTENT oldIN36 = iN36;
		iN36 = newIN36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN36, oldIN36, newIN36);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN36(IN36CONTENT newIN36) {
		if (newIN36 != iN36) {
			NotificationChain msgs = null;
			if (iN36 != null)
				msgs = ((InternalEObject)iN36).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN36, null, msgs);
			if (newIN36 != null)
				msgs = ((InternalEObject)newIN36).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN36, null, msgs);
			msgs = basicSetIN36(newIN36, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN36, newIN36, newIN36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN37CONTENT getIN37() {
		return iN37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN37(IN37CONTENT newIN37, NotificationChain msgs) {
		IN37CONTENT oldIN37 = iN37;
		iN37 = newIN37;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN37, oldIN37, newIN37);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN37(IN37CONTENT newIN37) {
		if (newIN37 != iN37) {
			NotificationChain msgs = null;
			if (iN37 != null)
				msgs = ((InternalEObject)iN37).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN37, null, msgs);
			if (newIN37 != null)
				msgs = ((InternalEObject)newIN37).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN37, null, msgs);
			msgs = basicSetIN37(newIN37, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN37, newIN37, newIN37));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN38CONTENT> getIN38() {
		if (iN38 == null) {
			iN38 = new EObjectContainmentEList<IN38CONTENT>(IN38CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN38);
		}
		return iN38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN39CONTENT getIN39() {
		return iN39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN39(IN39CONTENT newIN39, NotificationChain msgs) {
		IN39CONTENT oldIN39 = iN39;
		iN39 = newIN39;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN39, oldIN39, newIN39);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN39(IN39CONTENT newIN39) {
		if (newIN39 != iN39) {
			NotificationChain msgs = null;
			if (iN39 != null)
				msgs = ((InternalEObject)iN39).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN39, null, msgs);
			if (newIN39 != null)
				msgs = ((InternalEObject)newIN39).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN39, null, msgs);
			msgs = basicSetIN39(newIN39, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN39, newIN39, newIN39));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN310CONTENT getIN310() {
		return iN310;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN310(IN310CONTENT newIN310, NotificationChain msgs) {
		IN310CONTENT oldIN310 = iN310;
		iN310 = newIN310;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN310, oldIN310, newIN310);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN310(IN310CONTENT newIN310) {
		if (newIN310 != iN310) {
			NotificationChain msgs = null;
			if (iN310 != null)
				msgs = ((InternalEObject)iN310).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN310, null, msgs);
			if (newIN310 != null)
				msgs = ((InternalEObject)newIN310).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN310, null, msgs);
			msgs = basicSetIN310(newIN310, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN310, newIN310, newIN310));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN311CONTENT getIN311() {
		return iN311;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN311(IN311CONTENT newIN311, NotificationChain msgs) {
		IN311CONTENT oldIN311 = iN311;
		iN311 = newIN311;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN311, oldIN311, newIN311);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN311(IN311CONTENT newIN311) {
		if (newIN311 != iN311) {
			NotificationChain msgs = null;
			if (iN311 != null)
				msgs = ((InternalEObject)iN311).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN311, null, msgs);
			if (newIN311 != null)
				msgs = ((InternalEObject)newIN311).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN311, null, msgs);
			msgs = basicSetIN311(newIN311, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN311, newIN311, newIN311));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN312CONTENT getIN312() {
		return iN312;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN312(IN312CONTENT newIN312, NotificationChain msgs) {
		IN312CONTENT oldIN312 = iN312;
		iN312 = newIN312;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN312, oldIN312, newIN312);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN312(IN312CONTENT newIN312) {
		if (newIN312 != iN312) {
			NotificationChain msgs = null;
			if (iN312 != null)
				msgs = ((InternalEObject)iN312).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN312, null, msgs);
			if (newIN312 != null)
				msgs = ((InternalEObject)newIN312).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN312, null, msgs);
			msgs = basicSetIN312(newIN312, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN312, newIN312, newIN312));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN313CONTENT getIN313() {
		return iN313;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN313(IN313CONTENT newIN313, NotificationChain msgs) {
		IN313CONTENT oldIN313 = iN313;
		iN313 = newIN313;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN313, oldIN313, newIN313);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN313(IN313CONTENT newIN313) {
		if (newIN313 != iN313) {
			NotificationChain msgs = null;
			if (iN313 != null)
				msgs = ((InternalEObject)iN313).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN313, null, msgs);
			if (newIN313 != null)
				msgs = ((InternalEObject)newIN313).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN313, null, msgs);
			msgs = basicSetIN313(newIN313, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN313, newIN313, newIN313));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN314CONTENT> getIN314() {
		if (iN314 == null) {
			iN314 = new EObjectContainmentEList<IN314CONTENT>(IN314CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN314);
		}
		return iN314;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN315CONTENT getIN315() {
		return iN315;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN315(IN315CONTENT newIN315, NotificationChain msgs) {
		IN315CONTENT oldIN315 = iN315;
		iN315 = newIN315;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN315, oldIN315, newIN315);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN315(IN315CONTENT newIN315) {
		if (newIN315 != iN315) {
			NotificationChain msgs = null;
			if (iN315 != null)
				msgs = ((InternalEObject)iN315).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN315, null, msgs);
			if (newIN315 != null)
				msgs = ((InternalEObject)newIN315).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN315, null, msgs);
			msgs = basicSetIN315(newIN315, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN315, newIN315, newIN315));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN316CONTENT> getIN316() {
		if (iN316 == null) {
			iN316 = new EObjectContainmentEList<IN316CONTENT>(IN316CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN316);
		}
		return iN316;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN317CONTENT getIN317() {
		return iN317;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN317(IN317CONTENT newIN317, NotificationChain msgs) {
		IN317CONTENT oldIN317 = iN317;
		iN317 = newIN317;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN317, oldIN317, newIN317);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN317(IN317CONTENT newIN317) {
		if (newIN317 != iN317) {
			NotificationChain msgs = null;
			if (iN317 != null)
				msgs = ((InternalEObject)iN317).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN317, null, msgs);
			if (newIN317 != null)
				msgs = ((InternalEObject)newIN317).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN317, null, msgs);
			msgs = basicSetIN317(newIN317, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN317, newIN317, newIN317));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN318CONTENT getIN318() {
		return iN318;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN318(IN318CONTENT newIN318, NotificationChain msgs) {
		IN318CONTENT oldIN318 = iN318;
		iN318 = newIN318;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN318, oldIN318, newIN318);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN318(IN318CONTENT newIN318) {
		if (newIN318 != iN318) {
			NotificationChain msgs = null;
			if (iN318 != null)
				msgs = ((InternalEObject)iN318).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN318, null, msgs);
			if (newIN318 != null)
				msgs = ((InternalEObject)newIN318).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN318, null, msgs);
			msgs = basicSetIN318(newIN318, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN318, newIN318, newIN318));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN319CONTENT> getIN319() {
		if (iN319 == null) {
			iN319 = new EObjectContainmentEList<IN319CONTENT>(IN319CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN319);
		}
		return iN319;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN320CONTENT> getIN320() {
		if (iN320 == null) {
			iN320 = new EObjectContainmentEList<IN320CONTENT>(IN320CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN320);
		}
		return iN320;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN321CONTENT getIN321() {
		return iN321;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN321(IN321CONTENT newIN321, NotificationChain msgs) {
		IN321CONTENT oldIN321 = iN321;
		iN321 = newIN321;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN321, oldIN321, newIN321);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN321(IN321CONTENT newIN321) {
		if (newIN321 != iN321) {
			NotificationChain msgs = null;
			if (iN321 != null)
				msgs = ((InternalEObject)iN321).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN321, null, msgs);
			if (newIN321 != null)
				msgs = ((InternalEObject)newIN321).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN321, null, msgs);
			msgs = basicSetIN321(newIN321, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN321, newIN321, newIN321));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN322CONTENT getIN322() {
		return iN322;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN322(IN322CONTENT newIN322, NotificationChain msgs) {
		IN322CONTENT oldIN322 = iN322;
		iN322 = newIN322;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN322, oldIN322, newIN322);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN322(IN322CONTENT newIN322) {
		if (newIN322 != iN322) {
			NotificationChain msgs = null;
			if (iN322 != null)
				msgs = ((InternalEObject)iN322).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN322, null, msgs);
			if (newIN322 != null)
				msgs = ((InternalEObject)newIN322).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN322, null, msgs);
			msgs = basicSetIN322(newIN322, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN322, newIN322, newIN322));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN323CONTENT getIN323() {
		return iN323;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN323(IN323CONTENT newIN323, NotificationChain msgs) {
		IN323CONTENT oldIN323 = iN323;
		iN323 = newIN323;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN323, oldIN323, newIN323);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN323(IN323CONTENT newIN323) {
		if (newIN323 != iN323) {
			NotificationChain msgs = null;
			if (iN323 != null)
				msgs = ((InternalEObject)iN323).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN323, null, msgs);
			if (newIN323 != null)
				msgs = ((InternalEObject)newIN323).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN3CONTENT__IN323, null, msgs);
			msgs = basicSetIN323(newIN323, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN3CONTENT__IN323, newIN323, newIN323));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN324CONTENT> getIN324() {
		if (iN324 == null) {
			iN324 = new EObjectContainmentEList<IN324CONTENT>(IN324CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN324);
		}
		return iN324;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN325CONTENT> getIN325() {
		if (iN325 == null) {
			iN325 = new EObjectContainmentEList<IN325CONTENT>(IN325CONTENT.class, this, V2xmlPackage.IN3CONTENT__IN325);
		}
		return iN325;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IN3CONTENT__ANY);
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
			case V2xmlPackage.IN3CONTENT__IN31:
				return basicSetIN31(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN32:
				return basicSetIN32(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN33:
				return ((InternalEList<?>)getIN33()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN34:
				return basicSetIN34(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN35:
				return basicSetIN35(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN36:
				return basicSetIN36(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN37:
				return basicSetIN37(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN38:
				return ((InternalEList<?>)getIN38()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN39:
				return basicSetIN39(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN310:
				return basicSetIN310(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN311:
				return basicSetIN311(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN312:
				return basicSetIN312(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN313:
				return basicSetIN313(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN314:
				return ((InternalEList<?>)getIN314()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN315:
				return basicSetIN315(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN316:
				return ((InternalEList<?>)getIN316()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN317:
				return basicSetIN317(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN318:
				return basicSetIN318(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN319:
				return ((InternalEList<?>)getIN319()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN320:
				return ((InternalEList<?>)getIN320()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN321:
				return basicSetIN321(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN322:
				return basicSetIN322(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN323:
				return basicSetIN323(null, msgs);
			case V2xmlPackage.IN3CONTENT__IN324:
				return ((InternalEList<?>)getIN324()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__IN325:
				return ((InternalEList<?>)getIN325()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN3CONTENT__ANY:
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
			case V2xmlPackage.IN3CONTENT__IN31:
				return getIN31();
			case V2xmlPackage.IN3CONTENT__IN32:
				return getIN32();
			case V2xmlPackage.IN3CONTENT__IN33:
				return getIN33();
			case V2xmlPackage.IN3CONTENT__IN34:
				return getIN34();
			case V2xmlPackage.IN3CONTENT__IN35:
				return getIN35();
			case V2xmlPackage.IN3CONTENT__IN36:
				return getIN36();
			case V2xmlPackage.IN3CONTENT__IN37:
				return getIN37();
			case V2xmlPackage.IN3CONTENT__IN38:
				return getIN38();
			case V2xmlPackage.IN3CONTENT__IN39:
				return getIN39();
			case V2xmlPackage.IN3CONTENT__IN310:
				return getIN310();
			case V2xmlPackage.IN3CONTENT__IN311:
				return getIN311();
			case V2xmlPackage.IN3CONTENT__IN312:
				return getIN312();
			case V2xmlPackage.IN3CONTENT__IN313:
				return getIN313();
			case V2xmlPackage.IN3CONTENT__IN314:
				return getIN314();
			case V2xmlPackage.IN3CONTENT__IN315:
				return getIN315();
			case V2xmlPackage.IN3CONTENT__IN316:
				return getIN316();
			case V2xmlPackage.IN3CONTENT__IN317:
				return getIN317();
			case V2xmlPackage.IN3CONTENT__IN318:
				return getIN318();
			case V2xmlPackage.IN3CONTENT__IN319:
				return getIN319();
			case V2xmlPackage.IN3CONTENT__IN320:
				return getIN320();
			case V2xmlPackage.IN3CONTENT__IN321:
				return getIN321();
			case V2xmlPackage.IN3CONTENT__IN322:
				return getIN322();
			case V2xmlPackage.IN3CONTENT__IN323:
				return getIN323();
			case V2xmlPackage.IN3CONTENT__IN324:
				return getIN324();
			case V2xmlPackage.IN3CONTENT__IN325:
				return getIN325();
			case V2xmlPackage.IN3CONTENT__ANY:
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
			case V2xmlPackage.IN3CONTENT__IN31:
				setIN31((IN31CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN32:
				setIN32((IN32CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN33:
				getIN33().clear();
				getIN33().addAll((Collection<? extends IN33CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN34:
				setIN34((IN34CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN35:
				setIN35((IN35CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN36:
				setIN36((IN36CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN37:
				setIN37((IN37CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN38:
				getIN38().clear();
				getIN38().addAll((Collection<? extends IN38CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN39:
				setIN39((IN39CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN310:
				setIN310((IN310CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN311:
				setIN311((IN311CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN312:
				setIN312((IN312CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN313:
				setIN313((IN313CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN314:
				getIN314().clear();
				getIN314().addAll((Collection<? extends IN314CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN315:
				setIN315((IN315CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN316:
				getIN316().clear();
				getIN316().addAll((Collection<? extends IN316CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN317:
				setIN317((IN317CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN318:
				setIN318((IN318CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN319:
				getIN319().clear();
				getIN319().addAll((Collection<? extends IN319CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN320:
				getIN320().clear();
				getIN320().addAll((Collection<? extends IN320CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN321:
				setIN321((IN321CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN322:
				setIN322((IN322CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN323:
				setIN323((IN323CONTENT)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN324:
				getIN324().clear();
				getIN324().addAll((Collection<? extends IN324CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__IN325:
				getIN325().clear();
				getIN325().addAll((Collection<? extends IN325CONTENT>)newValue);
				return;
			case V2xmlPackage.IN3CONTENT__ANY:
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
			case V2xmlPackage.IN3CONTENT__IN31:
				setIN31((IN31CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN32:
				setIN32((IN32CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN33:
				getIN33().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN34:
				setIN34((IN34CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN35:
				setIN35((IN35CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN36:
				setIN36((IN36CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN37:
				setIN37((IN37CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN38:
				getIN38().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN39:
				setIN39((IN39CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN310:
				setIN310((IN310CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN311:
				setIN311((IN311CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN312:
				setIN312((IN312CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN313:
				setIN313((IN313CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN314:
				getIN314().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN315:
				setIN315((IN315CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN316:
				getIN316().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN317:
				setIN317((IN317CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN318:
				setIN318((IN318CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN319:
				getIN319().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN320:
				getIN320().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN321:
				setIN321((IN321CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN322:
				setIN322((IN322CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN323:
				setIN323((IN323CONTENT)null);
				return;
			case V2xmlPackage.IN3CONTENT__IN324:
				getIN324().clear();
				return;
			case V2xmlPackage.IN3CONTENT__IN325:
				getIN325().clear();
				return;
			case V2xmlPackage.IN3CONTENT__ANY:
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
			case V2xmlPackage.IN3CONTENT__IN31:
				return iN31 != null;
			case V2xmlPackage.IN3CONTENT__IN32:
				return iN32 != null;
			case V2xmlPackage.IN3CONTENT__IN33:
				return iN33 != null && !iN33.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN34:
				return iN34 != null;
			case V2xmlPackage.IN3CONTENT__IN35:
				return iN35 != null;
			case V2xmlPackage.IN3CONTENT__IN36:
				return iN36 != null;
			case V2xmlPackage.IN3CONTENT__IN37:
				return iN37 != null;
			case V2xmlPackage.IN3CONTENT__IN38:
				return iN38 != null && !iN38.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN39:
				return iN39 != null;
			case V2xmlPackage.IN3CONTENT__IN310:
				return iN310 != null;
			case V2xmlPackage.IN3CONTENT__IN311:
				return iN311 != null;
			case V2xmlPackage.IN3CONTENT__IN312:
				return iN312 != null;
			case V2xmlPackage.IN3CONTENT__IN313:
				return iN313 != null;
			case V2xmlPackage.IN3CONTENT__IN314:
				return iN314 != null && !iN314.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN315:
				return iN315 != null;
			case V2xmlPackage.IN3CONTENT__IN316:
				return iN316 != null && !iN316.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN317:
				return iN317 != null;
			case V2xmlPackage.IN3CONTENT__IN318:
				return iN318 != null;
			case V2xmlPackage.IN3CONTENT__IN319:
				return iN319 != null && !iN319.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN320:
				return iN320 != null && !iN320.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN321:
				return iN321 != null;
			case V2xmlPackage.IN3CONTENT__IN322:
				return iN322 != null;
			case V2xmlPackage.IN3CONTENT__IN323:
				return iN323 != null;
			case V2xmlPackage.IN3CONTENT__IN324:
				return iN324 != null && !iN324.isEmpty();
			case V2xmlPackage.IN3CONTENT__IN325:
				return iN325 != null && !iN325.isEmpty();
			case V2xmlPackage.IN3CONTENT__ANY:
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

} //IN3CONTENTImpl
