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

import org.hl7.v2xml.TQ210CONTENT;
import org.hl7.v2xml.TQ21CONTENT;
import org.hl7.v2xml.TQ22CONTENT;
import org.hl7.v2xml.TQ23CONTENT;
import org.hl7.v2xml.TQ24CONTENT;
import org.hl7.v2xml.TQ25CONTENT;
import org.hl7.v2xml.TQ26CONTENT;
import org.hl7.v2xml.TQ27CONTENT;
import org.hl7.v2xml.TQ28CONTENT;
import org.hl7.v2xml.TQ29CONTENT;
import org.hl7.v2xml.TQ2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TQ2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ21 <em>TQ21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ22 <em>TQ22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ23 <em>TQ23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ24 <em>TQ24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ25 <em>TQ25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ26 <em>TQ26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ27 <em>TQ27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ28 <em>TQ28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ29 <em>TQ29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getTQ210 <em>TQ210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.TQ2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TQ2CONTENTImpl extends EObjectImpl implements TQ2CONTENT {
	/**
	 * The cached value of the '{@link #getTQ21() <em>TQ21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ21()
	 * @generated
	 * @ordered
	 */
	protected TQ21CONTENT tQ21;

	/**
	 * The cached value of the '{@link #getTQ22() <em>TQ22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ22()
	 * @generated
	 * @ordered
	 */
	protected TQ22CONTENT tQ22;

	/**
	 * The cached value of the '{@link #getTQ23() <em>TQ23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ23()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ23CONTENT> tQ23;

	/**
	 * The cached value of the '{@link #getTQ24() <em>TQ24</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ24()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ24CONTENT> tQ24;

	/**
	 * The cached value of the '{@link #getTQ25() <em>TQ25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ25()
	 * @generated
	 * @ordered
	 */
	protected EList<TQ25CONTENT> tQ25;

	/**
	 * The cached value of the '{@link #getTQ26() <em>TQ26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ26()
	 * @generated
	 * @ordered
	 */
	protected TQ26CONTENT tQ26;

	/**
	 * The cached value of the '{@link #getTQ27() <em>TQ27</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ27()
	 * @generated
	 * @ordered
	 */
	protected TQ27CONTENT tQ27;

	/**
	 * The cached value of the '{@link #getTQ28() <em>TQ28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ28()
	 * @generated
	 * @ordered
	 */
	protected TQ28CONTENT tQ28;

	/**
	 * The cached value of the '{@link #getTQ29() <em>TQ29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ29()
	 * @generated
	 * @ordered
	 */
	protected TQ29CONTENT tQ29;

	/**
	 * The cached value of the '{@link #getTQ210() <em>TQ210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTQ210()
	 * @generated
	 * @ordered
	 */
	protected TQ210CONTENT tQ210;

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
	protected TQ2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getTQ2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ21CONTENT getTQ21() {
		return tQ21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ21(TQ21CONTENT newTQ21, NotificationChain msgs) {
		TQ21CONTENT oldTQ21 = tQ21;
		tQ21 = newTQ21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ21, oldTQ21, newTQ21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ21(TQ21CONTENT newTQ21) {
		if (newTQ21 != tQ21) {
			NotificationChain msgs = null;
			if (tQ21 != null)
				msgs = ((InternalEObject)tQ21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ21, null, msgs);
			if (newTQ21 != null)
				msgs = ((InternalEObject)newTQ21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ21, null, msgs);
			msgs = basicSetTQ21(newTQ21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ21, newTQ21, newTQ21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ22CONTENT getTQ22() {
		return tQ22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ22(TQ22CONTENT newTQ22, NotificationChain msgs) {
		TQ22CONTENT oldTQ22 = tQ22;
		tQ22 = newTQ22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ22, oldTQ22, newTQ22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ22(TQ22CONTENT newTQ22) {
		if (newTQ22 != tQ22) {
			NotificationChain msgs = null;
			if (tQ22 != null)
				msgs = ((InternalEObject)tQ22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ22, null, msgs);
			if (newTQ22 != null)
				msgs = ((InternalEObject)newTQ22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ22, null, msgs);
			msgs = basicSetTQ22(newTQ22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ22, newTQ22, newTQ22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ23CONTENT> getTQ23() {
		if (tQ23 == null) {
			tQ23 = new EObjectContainmentEList<TQ23CONTENT>(TQ23CONTENT.class, this, V2xmlPackage.TQ2CONTENT__TQ23);
		}
		return tQ23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ24CONTENT> getTQ24() {
		if (tQ24 == null) {
			tQ24 = new EObjectContainmentEList<TQ24CONTENT>(TQ24CONTENT.class, this, V2xmlPackage.TQ2CONTENT__TQ24);
		}
		return tQ24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TQ25CONTENT> getTQ25() {
		if (tQ25 == null) {
			tQ25 = new EObjectContainmentEList<TQ25CONTENT>(TQ25CONTENT.class, this, V2xmlPackage.TQ2CONTENT__TQ25);
		}
		return tQ25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ26CONTENT getTQ26() {
		return tQ26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ26(TQ26CONTENT newTQ26, NotificationChain msgs) {
		TQ26CONTENT oldTQ26 = tQ26;
		tQ26 = newTQ26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ26, oldTQ26, newTQ26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ26(TQ26CONTENT newTQ26) {
		if (newTQ26 != tQ26) {
			NotificationChain msgs = null;
			if (tQ26 != null)
				msgs = ((InternalEObject)tQ26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ26, null, msgs);
			if (newTQ26 != null)
				msgs = ((InternalEObject)newTQ26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ26, null, msgs);
			msgs = basicSetTQ26(newTQ26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ26, newTQ26, newTQ26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ27CONTENT getTQ27() {
		return tQ27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ27(TQ27CONTENT newTQ27, NotificationChain msgs) {
		TQ27CONTENT oldTQ27 = tQ27;
		tQ27 = newTQ27;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ27, oldTQ27, newTQ27);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ27(TQ27CONTENT newTQ27) {
		if (newTQ27 != tQ27) {
			NotificationChain msgs = null;
			if (tQ27 != null)
				msgs = ((InternalEObject)tQ27).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ27, null, msgs);
			if (newTQ27 != null)
				msgs = ((InternalEObject)newTQ27).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ27, null, msgs);
			msgs = basicSetTQ27(newTQ27, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ27, newTQ27, newTQ27));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ28CONTENT getTQ28() {
		return tQ28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ28(TQ28CONTENT newTQ28, NotificationChain msgs) {
		TQ28CONTENT oldTQ28 = tQ28;
		tQ28 = newTQ28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ28, oldTQ28, newTQ28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ28(TQ28CONTENT newTQ28) {
		if (newTQ28 != tQ28) {
			NotificationChain msgs = null;
			if (tQ28 != null)
				msgs = ((InternalEObject)tQ28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ28, null, msgs);
			if (newTQ28 != null)
				msgs = ((InternalEObject)newTQ28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ28, null, msgs);
			msgs = basicSetTQ28(newTQ28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ28, newTQ28, newTQ28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ29CONTENT getTQ29() {
		return tQ29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ29(TQ29CONTENT newTQ29, NotificationChain msgs) {
		TQ29CONTENT oldTQ29 = tQ29;
		tQ29 = newTQ29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ29, oldTQ29, newTQ29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ29(TQ29CONTENT newTQ29) {
		if (newTQ29 != tQ29) {
			NotificationChain msgs = null;
			if (tQ29 != null)
				msgs = ((InternalEObject)tQ29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ29, null, msgs);
			if (newTQ29 != null)
				msgs = ((InternalEObject)newTQ29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ29, null, msgs);
			msgs = basicSetTQ29(newTQ29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ29, newTQ29, newTQ29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TQ210CONTENT getTQ210() {
		return tQ210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTQ210(TQ210CONTENT newTQ210, NotificationChain msgs) {
		TQ210CONTENT oldTQ210 = tQ210;
		tQ210 = newTQ210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ210, oldTQ210, newTQ210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTQ210(TQ210CONTENT newTQ210) {
		if (newTQ210 != tQ210) {
			NotificationChain msgs = null;
			if (tQ210 != null)
				msgs = ((InternalEObject)tQ210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ210, null, msgs);
			if (newTQ210 != null)
				msgs = ((InternalEObject)newTQ210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.TQ2CONTENT__TQ210, null, msgs);
			msgs = basicSetTQ210(newTQ210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.TQ2CONTENT__TQ210, newTQ210, newTQ210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.TQ2CONTENT__ANY);
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
			case V2xmlPackage.TQ2CONTENT__TQ21:
				return basicSetTQ21(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ22:
				return basicSetTQ22(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ23:
				return ((InternalEList<?>)getTQ23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ24:
				return ((InternalEList<?>)getTQ24()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ25:
				return ((InternalEList<?>)getTQ25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ26:
				return basicSetTQ26(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ27:
				return basicSetTQ27(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ28:
				return basicSetTQ28(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ29:
				return basicSetTQ29(null, msgs);
			case V2xmlPackage.TQ2CONTENT__TQ210:
				return basicSetTQ210(null, msgs);
			case V2xmlPackage.TQ2CONTENT__ANY:
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
			case V2xmlPackage.TQ2CONTENT__TQ21:
				return getTQ21();
			case V2xmlPackage.TQ2CONTENT__TQ22:
				return getTQ22();
			case V2xmlPackage.TQ2CONTENT__TQ23:
				return getTQ23();
			case V2xmlPackage.TQ2CONTENT__TQ24:
				return getTQ24();
			case V2xmlPackage.TQ2CONTENT__TQ25:
				return getTQ25();
			case V2xmlPackage.TQ2CONTENT__TQ26:
				return getTQ26();
			case V2xmlPackage.TQ2CONTENT__TQ27:
				return getTQ27();
			case V2xmlPackage.TQ2CONTENT__TQ28:
				return getTQ28();
			case V2xmlPackage.TQ2CONTENT__TQ29:
				return getTQ29();
			case V2xmlPackage.TQ2CONTENT__TQ210:
				return getTQ210();
			case V2xmlPackage.TQ2CONTENT__ANY:
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
			case V2xmlPackage.TQ2CONTENT__TQ21:
				setTQ21((TQ21CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ22:
				setTQ22((TQ22CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ23:
				getTQ23().clear();
				getTQ23().addAll((Collection<? extends TQ23CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ24:
				getTQ24().clear();
				getTQ24().addAll((Collection<? extends TQ24CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ25:
				getTQ25().clear();
				getTQ25().addAll((Collection<? extends TQ25CONTENT>)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ26:
				setTQ26((TQ26CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ27:
				setTQ27((TQ27CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ28:
				setTQ28((TQ28CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ29:
				setTQ29((TQ29CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ210:
				setTQ210((TQ210CONTENT)newValue);
				return;
			case V2xmlPackage.TQ2CONTENT__ANY:
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
			case V2xmlPackage.TQ2CONTENT__TQ21:
				setTQ21((TQ21CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ22:
				setTQ22((TQ22CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ23:
				getTQ23().clear();
				return;
			case V2xmlPackage.TQ2CONTENT__TQ24:
				getTQ24().clear();
				return;
			case V2xmlPackage.TQ2CONTENT__TQ25:
				getTQ25().clear();
				return;
			case V2xmlPackage.TQ2CONTENT__TQ26:
				setTQ26((TQ26CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ27:
				setTQ27((TQ27CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ28:
				setTQ28((TQ28CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ29:
				setTQ29((TQ29CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__TQ210:
				setTQ210((TQ210CONTENT)null);
				return;
			case V2xmlPackage.TQ2CONTENT__ANY:
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
			case V2xmlPackage.TQ2CONTENT__TQ21:
				return tQ21 != null;
			case V2xmlPackage.TQ2CONTENT__TQ22:
				return tQ22 != null;
			case V2xmlPackage.TQ2CONTENT__TQ23:
				return tQ23 != null && !tQ23.isEmpty();
			case V2xmlPackage.TQ2CONTENT__TQ24:
				return tQ24 != null && !tQ24.isEmpty();
			case V2xmlPackage.TQ2CONTENT__TQ25:
				return tQ25 != null && !tQ25.isEmpty();
			case V2xmlPackage.TQ2CONTENT__TQ26:
				return tQ26 != null;
			case V2xmlPackage.TQ2CONTENT__TQ27:
				return tQ27 != null;
			case V2xmlPackage.TQ2CONTENT__TQ28:
				return tQ28 != null;
			case V2xmlPackage.TQ2CONTENT__TQ29:
				return tQ29 != null;
			case V2xmlPackage.TQ2CONTENT__TQ210:
				return tQ210 != null;
			case V2xmlPackage.TQ2CONTENT__ANY:
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

} //TQ2CONTENTImpl
