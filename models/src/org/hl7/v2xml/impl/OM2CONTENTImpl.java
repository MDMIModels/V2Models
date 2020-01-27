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

import org.hl7.v2xml.OM210CONTENT;
import org.hl7.v2xml.OM21CONTENT;
import org.hl7.v2xml.OM22CONTENT;
import org.hl7.v2xml.OM23CONTENT;
import org.hl7.v2xml.OM24CONTENT;
import org.hl7.v2xml.OM25CONTENT;
import org.hl7.v2xml.OM26CONTENT;
import org.hl7.v2xml.OM27CONTENT;
import org.hl7.v2xml.OM28CONTENT;
import org.hl7.v2xml.OM29CONTENT;
import org.hl7.v2xml.OM2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM21 <em>OM21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM22 <em>OM22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM23 <em>OM23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM24 <em>OM24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM25 <em>OM25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM26 <em>OM26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM27 <em>OM27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM28 <em>OM28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM29 <em>OM29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getOM210 <em>OM210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM2CONTENTImpl extends EObjectImpl implements OM2CONTENT {
	/**
	 * The cached value of the '{@link #getOM21() <em>OM21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM21()
	 * @generated
	 * @ordered
	 */
	protected OM21CONTENT oM21;

	/**
	 * The cached value of the '{@link #getOM22() <em>OM22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM22()
	 * @generated
	 * @ordered
	 */
	protected OM22CONTENT oM22;

	/**
	 * The cached value of the '{@link #getOM23() <em>OM23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM23()
	 * @generated
	 * @ordered
	 */
	protected EList<OM23CONTENT> oM23;

	/**
	 * The cached value of the '{@link #getOM24() <em>OM24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM24()
	 * @generated
	 * @ordered
	 */
	protected OM24CONTENT oM24;

	/**
	 * The cached value of the '{@link #getOM25() <em>OM25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM25()
	 * @generated
	 * @ordered
	 */
	protected OM25CONTENT oM25;

	/**
	 * The cached value of the '{@link #getOM26() <em>OM26</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM26()
	 * @generated
	 * @ordered
	 */
	protected EList<OM26CONTENT> oM26;

	/**
	 * The cached value of the '{@link #getOM27() <em>OM27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM27()
	 * @generated
	 * @ordered
	 */
	protected EList<OM27CONTENT> oM27;

	/**
	 * The cached value of the '{@link #getOM28() <em>OM28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM28()
	 * @generated
	 * @ordered
	 */
	protected OM28CONTENT oM28;

	/**
	 * The cached value of the '{@link #getOM29() <em>OM29</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM29()
	 * @generated
	 * @ordered
	 */
	protected EList<OM29CONTENT> oM29;

	/**
	 * The cached value of the '{@link #getOM210() <em>OM210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM210()
	 * @generated
	 * @ordered
	 */
	protected OM210CONTENT oM210;

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
	protected OM2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM21CONTENT getOM21() {
		return oM21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM21(OM21CONTENT newOM21, NotificationChain msgs) {
		OM21CONTENT oldOM21 = oM21;
		oM21 = newOM21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM21, oldOM21, newOM21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM21(OM21CONTENT newOM21) {
		if (newOM21 != oM21) {
			NotificationChain msgs = null;
			if (oM21 != null)
				msgs = ((InternalEObject)oM21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM21, null, msgs);
			if (newOM21 != null)
				msgs = ((InternalEObject)newOM21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM21, null, msgs);
			msgs = basicSetOM21(newOM21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM21, newOM21, newOM21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM22CONTENT getOM22() {
		return oM22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM22(OM22CONTENT newOM22, NotificationChain msgs) {
		OM22CONTENT oldOM22 = oM22;
		oM22 = newOM22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM22, oldOM22, newOM22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM22(OM22CONTENT newOM22) {
		if (newOM22 != oM22) {
			NotificationChain msgs = null;
			if (oM22 != null)
				msgs = ((InternalEObject)oM22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM22, null, msgs);
			if (newOM22 != null)
				msgs = ((InternalEObject)newOM22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM22, null, msgs);
			msgs = basicSetOM22(newOM22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM22, newOM22, newOM22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM23CONTENT> getOM23() {
		if (oM23 == null) {
			oM23 = new EObjectContainmentEList<OM23CONTENT>(OM23CONTENT.class, this, V2xmlPackage.OM2CONTENT__OM23);
		}
		return oM23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM24CONTENT getOM24() {
		return oM24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM24(OM24CONTENT newOM24, NotificationChain msgs) {
		OM24CONTENT oldOM24 = oM24;
		oM24 = newOM24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM24, oldOM24, newOM24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM24(OM24CONTENT newOM24) {
		if (newOM24 != oM24) {
			NotificationChain msgs = null;
			if (oM24 != null)
				msgs = ((InternalEObject)oM24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM24, null, msgs);
			if (newOM24 != null)
				msgs = ((InternalEObject)newOM24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM24, null, msgs);
			msgs = basicSetOM24(newOM24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM24, newOM24, newOM24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM25CONTENT getOM25() {
		return oM25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM25(OM25CONTENT newOM25, NotificationChain msgs) {
		OM25CONTENT oldOM25 = oM25;
		oM25 = newOM25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM25, oldOM25, newOM25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM25(OM25CONTENT newOM25) {
		if (newOM25 != oM25) {
			NotificationChain msgs = null;
			if (oM25 != null)
				msgs = ((InternalEObject)oM25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM25, null, msgs);
			if (newOM25 != null)
				msgs = ((InternalEObject)newOM25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM25, null, msgs);
			msgs = basicSetOM25(newOM25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM25, newOM25, newOM25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM26CONTENT> getOM26() {
		if (oM26 == null) {
			oM26 = new EObjectContainmentEList<OM26CONTENT>(OM26CONTENT.class, this, V2xmlPackage.OM2CONTENT__OM26);
		}
		return oM26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM27CONTENT> getOM27() {
		if (oM27 == null) {
			oM27 = new EObjectContainmentEList<OM27CONTENT>(OM27CONTENT.class, this, V2xmlPackage.OM2CONTENT__OM27);
		}
		return oM27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM28CONTENT getOM28() {
		return oM28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM28(OM28CONTENT newOM28, NotificationChain msgs) {
		OM28CONTENT oldOM28 = oM28;
		oM28 = newOM28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM28, oldOM28, newOM28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM28(OM28CONTENT newOM28) {
		if (newOM28 != oM28) {
			NotificationChain msgs = null;
			if (oM28 != null)
				msgs = ((InternalEObject)oM28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM28, null, msgs);
			if (newOM28 != null)
				msgs = ((InternalEObject)newOM28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM28, null, msgs);
			msgs = basicSetOM28(newOM28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM28, newOM28, newOM28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM29CONTENT> getOM29() {
		if (oM29 == null) {
			oM29 = new EObjectContainmentEList<OM29CONTENT>(OM29CONTENT.class, this, V2xmlPackage.OM2CONTENT__OM29);
		}
		return oM29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM210CONTENT getOM210() {
		return oM210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM210(OM210CONTENT newOM210, NotificationChain msgs) {
		OM210CONTENT oldOM210 = oM210;
		oM210 = newOM210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM210, oldOM210, newOM210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM210(OM210CONTENT newOM210) {
		if (newOM210 != oM210) {
			NotificationChain msgs = null;
			if (oM210 != null)
				msgs = ((InternalEObject)oM210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM210, null, msgs);
			if (newOM210 != null)
				msgs = ((InternalEObject)newOM210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM2CONTENT__OM210, null, msgs);
			msgs = basicSetOM210(newOM210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM2CONTENT__OM210, newOM210, newOM210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM2CONTENT__ANY);
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
			case V2xmlPackage.OM2CONTENT__OM21:
				return basicSetOM21(null, msgs);
			case V2xmlPackage.OM2CONTENT__OM22:
				return basicSetOM22(null, msgs);
			case V2xmlPackage.OM2CONTENT__OM23:
				return ((InternalEList<?>)getOM23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM2CONTENT__OM24:
				return basicSetOM24(null, msgs);
			case V2xmlPackage.OM2CONTENT__OM25:
				return basicSetOM25(null, msgs);
			case V2xmlPackage.OM2CONTENT__OM26:
				return ((InternalEList<?>)getOM26()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM2CONTENT__OM27:
				return ((InternalEList<?>)getOM27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM2CONTENT__OM28:
				return basicSetOM28(null, msgs);
			case V2xmlPackage.OM2CONTENT__OM29:
				return ((InternalEList<?>)getOM29()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM2CONTENT__OM210:
				return basicSetOM210(null, msgs);
			case V2xmlPackage.OM2CONTENT__ANY:
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
			case V2xmlPackage.OM2CONTENT__OM21:
				return getOM21();
			case V2xmlPackage.OM2CONTENT__OM22:
				return getOM22();
			case V2xmlPackage.OM2CONTENT__OM23:
				return getOM23();
			case V2xmlPackage.OM2CONTENT__OM24:
				return getOM24();
			case V2xmlPackage.OM2CONTENT__OM25:
				return getOM25();
			case V2xmlPackage.OM2CONTENT__OM26:
				return getOM26();
			case V2xmlPackage.OM2CONTENT__OM27:
				return getOM27();
			case V2xmlPackage.OM2CONTENT__OM28:
				return getOM28();
			case V2xmlPackage.OM2CONTENT__OM29:
				return getOM29();
			case V2xmlPackage.OM2CONTENT__OM210:
				return getOM210();
			case V2xmlPackage.OM2CONTENT__ANY:
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
			case V2xmlPackage.OM2CONTENT__OM21:
				setOM21((OM21CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM22:
				setOM22((OM22CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM23:
				getOM23().clear();
				getOM23().addAll((Collection<? extends OM23CONTENT>)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM24:
				setOM24((OM24CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM25:
				setOM25((OM25CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM26:
				getOM26().clear();
				getOM26().addAll((Collection<? extends OM26CONTENT>)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM27:
				getOM27().clear();
				getOM27().addAll((Collection<? extends OM27CONTENT>)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM28:
				setOM28((OM28CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM29:
				getOM29().clear();
				getOM29().addAll((Collection<? extends OM29CONTENT>)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__OM210:
				setOM210((OM210CONTENT)newValue);
				return;
			case V2xmlPackage.OM2CONTENT__ANY:
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
			case V2xmlPackage.OM2CONTENT__OM21:
				setOM21((OM21CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__OM22:
				setOM22((OM22CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__OM23:
				getOM23().clear();
				return;
			case V2xmlPackage.OM2CONTENT__OM24:
				setOM24((OM24CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__OM25:
				setOM25((OM25CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__OM26:
				getOM26().clear();
				return;
			case V2xmlPackage.OM2CONTENT__OM27:
				getOM27().clear();
				return;
			case V2xmlPackage.OM2CONTENT__OM28:
				setOM28((OM28CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__OM29:
				getOM29().clear();
				return;
			case V2xmlPackage.OM2CONTENT__OM210:
				setOM210((OM210CONTENT)null);
				return;
			case V2xmlPackage.OM2CONTENT__ANY:
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
			case V2xmlPackage.OM2CONTENT__OM21:
				return oM21 != null;
			case V2xmlPackage.OM2CONTENT__OM22:
				return oM22 != null;
			case V2xmlPackage.OM2CONTENT__OM23:
				return oM23 != null && !oM23.isEmpty();
			case V2xmlPackage.OM2CONTENT__OM24:
				return oM24 != null;
			case V2xmlPackage.OM2CONTENT__OM25:
				return oM25 != null;
			case V2xmlPackage.OM2CONTENT__OM26:
				return oM26 != null && !oM26.isEmpty();
			case V2xmlPackage.OM2CONTENT__OM27:
				return oM27 != null && !oM27.isEmpty();
			case V2xmlPackage.OM2CONTENT__OM28:
				return oM28 != null;
			case V2xmlPackage.OM2CONTENT__OM29:
				return oM29 != null && !oM29.isEmpty();
			case V2xmlPackage.OM2CONTENT__OM210:
				return oM210 != null;
			case V2xmlPackage.OM2CONTENT__ANY:
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

} //OM2CONTENTImpl
