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

import org.hl7.v2xml.OM410CONTENT;
import org.hl7.v2xml.OM411CONTENT;
import org.hl7.v2xml.OM412CONTENT;
import org.hl7.v2xml.OM413CONTENT;
import org.hl7.v2xml.OM414CONTENT;
import org.hl7.v2xml.OM41CONTENT;
import org.hl7.v2xml.OM42CONTENT;
import org.hl7.v2xml.OM43CONTENT;
import org.hl7.v2xml.OM44CONTENT;
import org.hl7.v2xml.OM45CONTENT;
import org.hl7.v2xml.OM46CONTENT;
import org.hl7.v2xml.OM47CONTENT;
import org.hl7.v2xml.OM48CONTENT;
import org.hl7.v2xml.OM49CONTENT;
import org.hl7.v2xml.OM4CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM4CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM41 <em>OM41</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM42 <em>OM42</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM43 <em>OM43</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM44 <em>OM44</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM45 <em>OM45</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM46 <em>OM46</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM47 <em>OM47</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM48 <em>OM48</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM49 <em>OM49</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM410 <em>OM410</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM411 <em>OM411</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM412 <em>OM412</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM413 <em>OM413</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getOM414 <em>OM414</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM4CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM4CONTENTImpl extends EObjectImpl implements OM4CONTENT {
	/**
	 * The cached value of the '{@link #getOM41() <em>OM41</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM41()
	 * @generated
	 * @ordered
	 */
	protected OM41CONTENT oM41;

	/**
	 * The cached value of the '{@link #getOM42() <em>OM42</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM42()
	 * @generated
	 * @ordered
	 */
	protected OM42CONTENT oM42;

	/**
	 * The cached value of the '{@link #getOM43() <em>OM43</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM43()
	 * @generated
	 * @ordered
	 */
	protected OM43CONTENT oM43;

	/**
	 * The cached value of the '{@link #getOM44() <em>OM44</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM44()
	 * @generated
	 * @ordered
	 */
	protected OM44CONTENT oM44;

	/**
	 * The cached value of the '{@link #getOM45() <em>OM45</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM45()
	 * @generated
	 * @ordered
	 */
	protected OM45CONTENT oM45;

	/**
	 * The cached value of the '{@link #getOM46() <em>OM46</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM46()
	 * @generated
	 * @ordered
	 */
	protected OM46CONTENT oM46;

	/**
	 * The cached value of the '{@link #getOM47() <em>OM47</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM47()
	 * @generated
	 * @ordered
	 */
	protected OM47CONTENT oM47;

	/**
	 * The cached value of the '{@link #getOM48() <em>OM48</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM48()
	 * @generated
	 * @ordered
	 */
	protected OM48CONTENT oM48;

	/**
	 * The cached value of the '{@link #getOM49() <em>OM49</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM49()
	 * @generated
	 * @ordered
	 */
	protected OM49CONTENT oM49;

	/**
	 * The cached value of the '{@link #getOM410() <em>OM410</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM410()
	 * @generated
	 * @ordered
	 */
	protected OM410CONTENT oM410;

	/**
	 * The cached value of the '{@link #getOM411() <em>OM411</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM411()
	 * @generated
	 * @ordered
	 */
	protected OM411CONTENT oM411;

	/**
	 * The cached value of the '{@link #getOM412() <em>OM412</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM412()
	 * @generated
	 * @ordered
	 */
	protected OM412CONTENT oM412;

	/**
	 * The cached value of the '{@link #getOM413() <em>OM413</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM413()
	 * @generated
	 * @ordered
	 */
	protected EList<OM413CONTENT> oM413;

	/**
	 * The cached value of the '{@link #getOM414() <em>OM414</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM414()
	 * @generated
	 * @ordered
	 */
	protected OM414CONTENT oM414;

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
	protected OM4CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM4CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM41CONTENT getOM41() {
		return oM41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM41(OM41CONTENT newOM41, NotificationChain msgs) {
		OM41CONTENT oldOM41 = oM41;
		oM41 = newOM41;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM41, oldOM41, newOM41);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM41(OM41CONTENT newOM41) {
		if (newOM41 != oM41) {
			NotificationChain msgs = null;
			if (oM41 != null)
				msgs = ((InternalEObject)oM41).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM41, null, msgs);
			if (newOM41 != null)
				msgs = ((InternalEObject)newOM41).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM41, null, msgs);
			msgs = basicSetOM41(newOM41, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM41, newOM41, newOM41));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM42CONTENT getOM42() {
		return oM42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM42(OM42CONTENT newOM42, NotificationChain msgs) {
		OM42CONTENT oldOM42 = oM42;
		oM42 = newOM42;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM42, oldOM42, newOM42);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM42(OM42CONTENT newOM42) {
		if (newOM42 != oM42) {
			NotificationChain msgs = null;
			if (oM42 != null)
				msgs = ((InternalEObject)oM42).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM42, null, msgs);
			if (newOM42 != null)
				msgs = ((InternalEObject)newOM42).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM42, null, msgs);
			msgs = basicSetOM42(newOM42, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM42, newOM42, newOM42));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM43CONTENT getOM43() {
		return oM43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM43(OM43CONTENT newOM43, NotificationChain msgs) {
		OM43CONTENT oldOM43 = oM43;
		oM43 = newOM43;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM43, oldOM43, newOM43);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM43(OM43CONTENT newOM43) {
		if (newOM43 != oM43) {
			NotificationChain msgs = null;
			if (oM43 != null)
				msgs = ((InternalEObject)oM43).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM43, null, msgs);
			if (newOM43 != null)
				msgs = ((InternalEObject)newOM43).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM43, null, msgs);
			msgs = basicSetOM43(newOM43, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM43, newOM43, newOM43));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM44CONTENT getOM44() {
		return oM44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM44(OM44CONTENT newOM44, NotificationChain msgs) {
		OM44CONTENT oldOM44 = oM44;
		oM44 = newOM44;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM44, oldOM44, newOM44);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM44(OM44CONTENT newOM44) {
		if (newOM44 != oM44) {
			NotificationChain msgs = null;
			if (oM44 != null)
				msgs = ((InternalEObject)oM44).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM44, null, msgs);
			if (newOM44 != null)
				msgs = ((InternalEObject)newOM44).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM44, null, msgs);
			msgs = basicSetOM44(newOM44, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM44, newOM44, newOM44));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM45CONTENT getOM45() {
		return oM45;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM45(OM45CONTENT newOM45, NotificationChain msgs) {
		OM45CONTENT oldOM45 = oM45;
		oM45 = newOM45;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM45, oldOM45, newOM45);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM45(OM45CONTENT newOM45) {
		if (newOM45 != oM45) {
			NotificationChain msgs = null;
			if (oM45 != null)
				msgs = ((InternalEObject)oM45).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM45, null, msgs);
			if (newOM45 != null)
				msgs = ((InternalEObject)newOM45).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM45, null, msgs);
			msgs = basicSetOM45(newOM45, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM45, newOM45, newOM45));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM46CONTENT getOM46() {
		return oM46;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM46(OM46CONTENT newOM46, NotificationChain msgs) {
		OM46CONTENT oldOM46 = oM46;
		oM46 = newOM46;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM46, oldOM46, newOM46);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM46(OM46CONTENT newOM46) {
		if (newOM46 != oM46) {
			NotificationChain msgs = null;
			if (oM46 != null)
				msgs = ((InternalEObject)oM46).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM46, null, msgs);
			if (newOM46 != null)
				msgs = ((InternalEObject)newOM46).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM46, null, msgs);
			msgs = basicSetOM46(newOM46, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM46, newOM46, newOM46));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM47CONTENT getOM47() {
		return oM47;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM47(OM47CONTENT newOM47, NotificationChain msgs) {
		OM47CONTENT oldOM47 = oM47;
		oM47 = newOM47;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM47, oldOM47, newOM47);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM47(OM47CONTENT newOM47) {
		if (newOM47 != oM47) {
			NotificationChain msgs = null;
			if (oM47 != null)
				msgs = ((InternalEObject)oM47).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM47, null, msgs);
			if (newOM47 != null)
				msgs = ((InternalEObject)newOM47).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM47, null, msgs);
			msgs = basicSetOM47(newOM47, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM47, newOM47, newOM47));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM48CONTENT getOM48() {
		return oM48;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM48(OM48CONTENT newOM48, NotificationChain msgs) {
		OM48CONTENT oldOM48 = oM48;
		oM48 = newOM48;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM48, oldOM48, newOM48);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM48(OM48CONTENT newOM48) {
		if (newOM48 != oM48) {
			NotificationChain msgs = null;
			if (oM48 != null)
				msgs = ((InternalEObject)oM48).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM48, null, msgs);
			if (newOM48 != null)
				msgs = ((InternalEObject)newOM48).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM48, null, msgs);
			msgs = basicSetOM48(newOM48, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM48, newOM48, newOM48));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM49CONTENT getOM49() {
		return oM49;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM49(OM49CONTENT newOM49, NotificationChain msgs) {
		OM49CONTENT oldOM49 = oM49;
		oM49 = newOM49;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM49, oldOM49, newOM49);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM49(OM49CONTENT newOM49) {
		if (newOM49 != oM49) {
			NotificationChain msgs = null;
			if (oM49 != null)
				msgs = ((InternalEObject)oM49).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM49, null, msgs);
			if (newOM49 != null)
				msgs = ((InternalEObject)newOM49).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM49, null, msgs);
			msgs = basicSetOM49(newOM49, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM49, newOM49, newOM49));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM410CONTENT getOM410() {
		return oM410;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM410(OM410CONTENT newOM410, NotificationChain msgs) {
		OM410CONTENT oldOM410 = oM410;
		oM410 = newOM410;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM410, oldOM410, newOM410);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM410(OM410CONTENT newOM410) {
		if (newOM410 != oM410) {
			NotificationChain msgs = null;
			if (oM410 != null)
				msgs = ((InternalEObject)oM410).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM410, null, msgs);
			if (newOM410 != null)
				msgs = ((InternalEObject)newOM410).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM410, null, msgs);
			msgs = basicSetOM410(newOM410, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM410, newOM410, newOM410));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM411CONTENT getOM411() {
		return oM411;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM411(OM411CONTENT newOM411, NotificationChain msgs) {
		OM411CONTENT oldOM411 = oM411;
		oM411 = newOM411;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM411, oldOM411, newOM411);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM411(OM411CONTENT newOM411) {
		if (newOM411 != oM411) {
			NotificationChain msgs = null;
			if (oM411 != null)
				msgs = ((InternalEObject)oM411).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM411, null, msgs);
			if (newOM411 != null)
				msgs = ((InternalEObject)newOM411).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM411, null, msgs);
			msgs = basicSetOM411(newOM411, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM411, newOM411, newOM411));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM412CONTENT getOM412() {
		return oM412;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM412(OM412CONTENT newOM412, NotificationChain msgs) {
		OM412CONTENT oldOM412 = oM412;
		oM412 = newOM412;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM412, oldOM412, newOM412);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM412(OM412CONTENT newOM412) {
		if (newOM412 != oM412) {
			NotificationChain msgs = null;
			if (oM412 != null)
				msgs = ((InternalEObject)oM412).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM412, null, msgs);
			if (newOM412 != null)
				msgs = ((InternalEObject)newOM412).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM412, null, msgs);
			msgs = basicSetOM412(newOM412, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM412, newOM412, newOM412));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM413CONTENT> getOM413() {
		if (oM413 == null) {
			oM413 = new EObjectContainmentEList<OM413CONTENT>(OM413CONTENT.class, this, V2xmlPackage.OM4CONTENT__OM413);
		}
		return oM413;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM414CONTENT getOM414() {
		return oM414;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM414(OM414CONTENT newOM414, NotificationChain msgs) {
		OM414CONTENT oldOM414 = oM414;
		oM414 = newOM414;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM414, oldOM414, newOM414);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM414(OM414CONTENT newOM414) {
		if (newOM414 != oM414) {
			NotificationChain msgs = null;
			if (oM414 != null)
				msgs = ((InternalEObject)oM414).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM414, null, msgs);
			if (newOM414 != null)
				msgs = ((InternalEObject)newOM414).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM4CONTENT__OM414, null, msgs);
			msgs = basicSetOM414(newOM414, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM4CONTENT__OM414, newOM414, newOM414));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM4CONTENT__ANY);
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
			case V2xmlPackage.OM4CONTENT__OM41:
				return basicSetOM41(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM42:
				return basicSetOM42(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM43:
				return basicSetOM43(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM44:
				return basicSetOM44(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM45:
				return basicSetOM45(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM46:
				return basicSetOM46(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM47:
				return basicSetOM47(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM48:
				return basicSetOM48(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM49:
				return basicSetOM49(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM410:
				return basicSetOM410(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM411:
				return basicSetOM411(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM412:
				return basicSetOM412(null, msgs);
			case V2xmlPackage.OM4CONTENT__OM413:
				return ((InternalEList<?>)getOM413()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM4CONTENT__OM414:
				return basicSetOM414(null, msgs);
			case V2xmlPackage.OM4CONTENT__ANY:
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
			case V2xmlPackage.OM4CONTENT__OM41:
				return getOM41();
			case V2xmlPackage.OM4CONTENT__OM42:
				return getOM42();
			case V2xmlPackage.OM4CONTENT__OM43:
				return getOM43();
			case V2xmlPackage.OM4CONTENT__OM44:
				return getOM44();
			case V2xmlPackage.OM4CONTENT__OM45:
				return getOM45();
			case V2xmlPackage.OM4CONTENT__OM46:
				return getOM46();
			case V2xmlPackage.OM4CONTENT__OM47:
				return getOM47();
			case V2xmlPackage.OM4CONTENT__OM48:
				return getOM48();
			case V2xmlPackage.OM4CONTENT__OM49:
				return getOM49();
			case V2xmlPackage.OM4CONTENT__OM410:
				return getOM410();
			case V2xmlPackage.OM4CONTENT__OM411:
				return getOM411();
			case V2xmlPackage.OM4CONTENT__OM412:
				return getOM412();
			case V2xmlPackage.OM4CONTENT__OM413:
				return getOM413();
			case V2xmlPackage.OM4CONTENT__OM414:
				return getOM414();
			case V2xmlPackage.OM4CONTENT__ANY:
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
			case V2xmlPackage.OM4CONTENT__OM41:
				setOM41((OM41CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM42:
				setOM42((OM42CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM43:
				setOM43((OM43CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM44:
				setOM44((OM44CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM45:
				setOM45((OM45CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM46:
				setOM46((OM46CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM47:
				setOM47((OM47CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM48:
				setOM48((OM48CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM49:
				setOM49((OM49CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM410:
				setOM410((OM410CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM411:
				setOM411((OM411CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM412:
				setOM412((OM412CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM413:
				getOM413().clear();
				getOM413().addAll((Collection<? extends OM413CONTENT>)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__OM414:
				setOM414((OM414CONTENT)newValue);
				return;
			case V2xmlPackage.OM4CONTENT__ANY:
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
			case V2xmlPackage.OM4CONTENT__OM41:
				setOM41((OM41CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM42:
				setOM42((OM42CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM43:
				setOM43((OM43CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM44:
				setOM44((OM44CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM45:
				setOM45((OM45CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM46:
				setOM46((OM46CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM47:
				setOM47((OM47CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM48:
				setOM48((OM48CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM49:
				setOM49((OM49CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM410:
				setOM410((OM410CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM411:
				setOM411((OM411CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM412:
				setOM412((OM412CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__OM413:
				getOM413().clear();
				return;
			case V2xmlPackage.OM4CONTENT__OM414:
				setOM414((OM414CONTENT)null);
				return;
			case V2xmlPackage.OM4CONTENT__ANY:
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
			case V2xmlPackage.OM4CONTENT__OM41:
				return oM41 != null;
			case V2xmlPackage.OM4CONTENT__OM42:
				return oM42 != null;
			case V2xmlPackage.OM4CONTENT__OM43:
				return oM43 != null;
			case V2xmlPackage.OM4CONTENT__OM44:
				return oM44 != null;
			case V2xmlPackage.OM4CONTENT__OM45:
				return oM45 != null;
			case V2xmlPackage.OM4CONTENT__OM46:
				return oM46 != null;
			case V2xmlPackage.OM4CONTENT__OM47:
				return oM47 != null;
			case V2xmlPackage.OM4CONTENT__OM48:
				return oM48 != null;
			case V2xmlPackage.OM4CONTENT__OM49:
				return oM49 != null;
			case V2xmlPackage.OM4CONTENT__OM410:
				return oM410 != null;
			case V2xmlPackage.OM4CONTENT__OM411:
				return oM411 != null;
			case V2xmlPackage.OM4CONTENT__OM412:
				return oM412 != null;
			case V2xmlPackage.OM4CONTENT__OM413:
				return oM413 != null && !oM413.isEmpty();
			case V2xmlPackage.OM4CONTENT__OM414:
				return oM414 != null;
			case V2xmlPackage.OM4CONTENT__ANY:
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

} //OM4CONTENTImpl
