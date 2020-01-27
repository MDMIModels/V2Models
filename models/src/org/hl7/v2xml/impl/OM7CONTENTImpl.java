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

import org.hl7.v2xml.OM710CONTENT;
import org.hl7.v2xml.OM711CONTENT;
import org.hl7.v2xml.OM712CONTENT;
import org.hl7.v2xml.OM713CONTENT;
import org.hl7.v2xml.OM714CONTENT;
import org.hl7.v2xml.OM715CONTENT;
import org.hl7.v2xml.OM716CONTENT;
import org.hl7.v2xml.OM717CONTENT;
import org.hl7.v2xml.OM718CONTENT;
import org.hl7.v2xml.OM719CONTENT;
import org.hl7.v2xml.OM71CONTENT;
import org.hl7.v2xml.OM720CONTENT;
import org.hl7.v2xml.OM721CONTENT;
import org.hl7.v2xml.OM722CONTENT;
import org.hl7.v2xml.OM723CONTENT;
import org.hl7.v2xml.OM724CONTENT;
import org.hl7.v2xml.OM72CONTENT;
import org.hl7.v2xml.OM73CONTENT;
import org.hl7.v2xml.OM74CONTENT;
import org.hl7.v2xml.OM75CONTENT;
import org.hl7.v2xml.OM76CONTENT;
import org.hl7.v2xml.OM77CONTENT;
import org.hl7.v2xml.OM78CONTENT;
import org.hl7.v2xml.OM79CONTENT;
import org.hl7.v2xml.OM7CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM7CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM71 <em>OM71</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM72 <em>OM72</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM73 <em>OM73</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM74 <em>OM74</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM75 <em>OM75</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM76 <em>OM76</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM77 <em>OM77</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM78 <em>OM78</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM79 <em>OM79</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM710 <em>OM710</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM711 <em>OM711</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM712 <em>OM712</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM713 <em>OM713</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM714 <em>OM714</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM715 <em>OM715</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM716 <em>OM716</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM717 <em>OM717</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM718 <em>OM718</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM719 <em>OM719</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM720 <em>OM720</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM721 <em>OM721</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM722 <em>OM722</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM723 <em>OM723</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getOM724 <em>OM724</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM7CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM7CONTENTImpl extends EObjectImpl implements OM7CONTENT {
	/**
	 * The cached value of the '{@link #getOM71() <em>OM71</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM71()
	 * @generated
	 * @ordered
	 */
	protected OM71CONTENT oM71;

	/**
	 * The cached value of the '{@link #getOM72() <em>OM72</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM72()
	 * @generated
	 * @ordered
	 */
	protected OM72CONTENT oM72;

	/**
	 * The cached value of the '{@link #getOM73() <em>OM73</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM73()
	 * @generated
	 * @ordered
	 */
	protected EList<OM73CONTENT> oM73;

	/**
	 * The cached value of the '{@link #getOM74() <em>OM74</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM74()
	 * @generated
	 * @ordered
	 */
	protected OM74CONTENT oM74;

	/**
	 * The cached value of the '{@link #getOM75() <em>OM75</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM75()
	 * @generated
	 * @ordered
	 */
	protected EList<OM75CONTENT> oM75;

	/**
	 * The cached value of the '{@link #getOM76() <em>OM76</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM76()
	 * @generated
	 * @ordered
	 */
	protected OM76CONTENT oM76;

	/**
	 * The cached value of the '{@link #getOM77() <em>OM77</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM77()
	 * @generated
	 * @ordered
	 */
	protected OM77CONTENT oM77;

	/**
	 * The cached value of the '{@link #getOM78() <em>OM78</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM78()
	 * @generated
	 * @ordered
	 */
	protected OM78CONTENT oM78;

	/**
	 * The cached value of the '{@link #getOM79() <em>OM79</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM79()
	 * @generated
	 * @ordered
	 */
	protected OM79CONTENT oM79;

	/**
	 * The cached value of the '{@link #getOM710() <em>OM710</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM710()
	 * @generated
	 * @ordered
	 */
	protected OM710CONTENT oM710;

	/**
	 * The cached value of the '{@link #getOM711() <em>OM711</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM711()
	 * @generated
	 * @ordered
	 */
	protected OM711CONTENT oM711;

	/**
	 * The cached value of the '{@link #getOM712() <em>OM712</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM712()
	 * @generated
	 * @ordered
	 */
	protected OM712CONTENT oM712;

	/**
	 * The cached value of the '{@link #getOM713() <em>OM713</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM713()
	 * @generated
	 * @ordered
	 */
	protected OM713CONTENT oM713;

	/**
	 * The cached value of the '{@link #getOM714() <em>OM714</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM714()
	 * @generated
	 * @ordered
	 */
	protected OM714CONTENT oM714;

	/**
	 * The cached value of the '{@link #getOM715() <em>OM715</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM715()
	 * @generated
	 * @ordered
	 */
	protected OM715CONTENT oM715;

	/**
	 * The cached value of the '{@link #getOM716() <em>OM716</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM716()
	 * @generated
	 * @ordered
	 */
	protected OM716CONTENT oM716;

	/**
	 * The cached value of the '{@link #getOM717() <em>OM717</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM717()
	 * @generated
	 * @ordered
	 */
	protected OM717CONTENT oM717;

	/**
	 * The cached value of the '{@link #getOM718() <em>OM718</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM718()
	 * @generated
	 * @ordered
	 */
	protected OM718CONTENT oM718;

	/**
	 * The cached value of the '{@link #getOM719() <em>OM719</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM719()
	 * @generated
	 * @ordered
	 */
	protected OM719CONTENT oM719;

	/**
	 * The cached value of the '{@link #getOM720() <em>OM720</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM720()
	 * @generated
	 * @ordered
	 */
	protected OM720CONTENT oM720;

	/**
	 * The cached value of the '{@link #getOM721() <em>OM721</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM721()
	 * @generated
	 * @ordered
	 */
	protected EList<OM721CONTENT> oM721;

	/**
	 * The cached value of the '{@link #getOM722() <em>OM722</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM722()
	 * @generated
	 * @ordered
	 */
	protected OM722CONTENT oM722;

	/**
	 * The cached value of the '{@link #getOM723() <em>OM723</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM723()
	 * @generated
	 * @ordered
	 */
	protected OM723CONTENT oM723;

	/**
	 * The cached value of the '{@link #getOM724() <em>OM724</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM724()
	 * @generated
	 * @ordered
	 */
	protected EList<OM724CONTENT> oM724;

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
	protected OM7CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM7CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM71CONTENT getOM71() {
		return oM71;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM71(OM71CONTENT newOM71, NotificationChain msgs) {
		OM71CONTENT oldOM71 = oM71;
		oM71 = newOM71;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM71, oldOM71, newOM71);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM71(OM71CONTENT newOM71) {
		if (newOM71 != oM71) {
			NotificationChain msgs = null;
			if (oM71 != null)
				msgs = ((InternalEObject)oM71).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM71, null, msgs);
			if (newOM71 != null)
				msgs = ((InternalEObject)newOM71).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM71, null, msgs);
			msgs = basicSetOM71(newOM71, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM71, newOM71, newOM71));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM72CONTENT getOM72() {
		return oM72;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM72(OM72CONTENT newOM72, NotificationChain msgs) {
		OM72CONTENT oldOM72 = oM72;
		oM72 = newOM72;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM72, oldOM72, newOM72);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM72(OM72CONTENT newOM72) {
		if (newOM72 != oM72) {
			NotificationChain msgs = null;
			if (oM72 != null)
				msgs = ((InternalEObject)oM72).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM72, null, msgs);
			if (newOM72 != null)
				msgs = ((InternalEObject)newOM72).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM72, null, msgs);
			msgs = basicSetOM72(newOM72, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM72, newOM72, newOM72));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM73CONTENT> getOM73() {
		if (oM73 == null) {
			oM73 = new EObjectContainmentEList<OM73CONTENT>(OM73CONTENT.class, this, V2xmlPackage.OM7CONTENT__OM73);
		}
		return oM73;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM74CONTENT getOM74() {
		return oM74;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM74(OM74CONTENT newOM74, NotificationChain msgs) {
		OM74CONTENT oldOM74 = oM74;
		oM74 = newOM74;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM74, oldOM74, newOM74);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM74(OM74CONTENT newOM74) {
		if (newOM74 != oM74) {
			NotificationChain msgs = null;
			if (oM74 != null)
				msgs = ((InternalEObject)oM74).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM74, null, msgs);
			if (newOM74 != null)
				msgs = ((InternalEObject)newOM74).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM74, null, msgs);
			msgs = basicSetOM74(newOM74, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM74, newOM74, newOM74));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM75CONTENT> getOM75() {
		if (oM75 == null) {
			oM75 = new EObjectContainmentEList<OM75CONTENT>(OM75CONTENT.class, this, V2xmlPackage.OM7CONTENT__OM75);
		}
		return oM75;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM76CONTENT getOM76() {
		return oM76;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM76(OM76CONTENT newOM76, NotificationChain msgs) {
		OM76CONTENT oldOM76 = oM76;
		oM76 = newOM76;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM76, oldOM76, newOM76);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM76(OM76CONTENT newOM76) {
		if (newOM76 != oM76) {
			NotificationChain msgs = null;
			if (oM76 != null)
				msgs = ((InternalEObject)oM76).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM76, null, msgs);
			if (newOM76 != null)
				msgs = ((InternalEObject)newOM76).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM76, null, msgs);
			msgs = basicSetOM76(newOM76, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM76, newOM76, newOM76));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM77CONTENT getOM77() {
		return oM77;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM77(OM77CONTENT newOM77, NotificationChain msgs) {
		OM77CONTENT oldOM77 = oM77;
		oM77 = newOM77;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM77, oldOM77, newOM77);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM77(OM77CONTENT newOM77) {
		if (newOM77 != oM77) {
			NotificationChain msgs = null;
			if (oM77 != null)
				msgs = ((InternalEObject)oM77).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM77, null, msgs);
			if (newOM77 != null)
				msgs = ((InternalEObject)newOM77).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM77, null, msgs);
			msgs = basicSetOM77(newOM77, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM77, newOM77, newOM77));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM78CONTENT getOM78() {
		return oM78;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM78(OM78CONTENT newOM78, NotificationChain msgs) {
		OM78CONTENT oldOM78 = oM78;
		oM78 = newOM78;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM78, oldOM78, newOM78);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM78(OM78CONTENT newOM78) {
		if (newOM78 != oM78) {
			NotificationChain msgs = null;
			if (oM78 != null)
				msgs = ((InternalEObject)oM78).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM78, null, msgs);
			if (newOM78 != null)
				msgs = ((InternalEObject)newOM78).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM78, null, msgs);
			msgs = basicSetOM78(newOM78, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM78, newOM78, newOM78));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM79CONTENT getOM79() {
		return oM79;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM79(OM79CONTENT newOM79, NotificationChain msgs) {
		OM79CONTENT oldOM79 = oM79;
		oM79 = newOM79;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM79, oldOM79, newOM79);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM79(OM79CONTENT newOM79) {
		if (newOM79 != oM79) {
			NotificationChain msgs = null;
			if (oM79 != null)
				msgs = ((InternalEObject)oM79).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM79, null, msgs);
			if (newOM79 != null)
				msgs = ((InternalEObject)newOM79).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM79, null, msgs);
			msgs = basicSetOM79(newOM79, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM79, newOM79, newOM79));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM710CONTENT getOM710() {
		return oM710;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM710(OM710CONTENT newOM710, NotificationChain msgs) {
		OM710CONTENT oldOM710 = oM710;
		oM710 = newOM710;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM710, oldOM710, newOM710);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM710(OM710CONTENT newOM710) {
		if (newOM710 != oM710) {
			NotificationChain msgs = null;
			if (oM710 != null)
				msgs = ((InternalEObject)oM710).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM710, null, msgs);
			if (newOM710 != null)
				msgs = ((InternalEObject)newOM710).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM710, null, msgs);
			msgs = basicSetOM710(newOM710, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM710, newOM710, newOM710));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM711CONTENT getOM711() {
		return oM711;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM711(OM711CONTENT newOM711, NotificationChain msgs) {
		OM711CONTENT oldOM711 = oM711;
		oM711 = newOM711;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM711, oldOM711, newOM711);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM711(OM711CONTENT newOM711) {
		if (newOM711 != oM711) {
			NotificationChain msgs = null;
			if (oM711 != null)
				msgs = ((InternalEObject)oM711).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM711, null, msgs);
			if (newOM711 != null)
				msgs = ((InternalEObject)newOM711).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM711, null, msgs);
			msgs = basicSetOM711(newOM711, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM711, newOM711, newOM711));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM712CONTENT getOM712() {
		return oM712;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM712(OM712CONTENT newOM712, NotificationChain msgs) {
		OM712CONTENT oldOM712 = oM712;
		oM712 = newOM712;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM712, oldOM712, newOM712);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM712(OM712CONTENT newOM712) {
		if (newOM712 != oM712) {
			NotificationChain msgs = null;
			if (oM712 != null)
				msgs = ((InternalEObject)oM712).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM712, null, msgs);
			if (newOM712 != null)
				msgs = ((InternalEObject)newOM712).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM712, null, msgs);
			msgs = basicSetOM712(newOM712, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM712, newOM712, newOM712));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM713CONTENT getOM713() {
		return oM713;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM713(OM713CONTENT newOM713, NotificationChain msgs) {
		OM713CONTENT oldOM713 = oM713;
		oM713 = newOM713;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM713, oldOM713, newOM713);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM713(OM713CONTENT newOM713) {
		if (newOM713 != oM713) {
			NotificationChain msgs = null;
			if (oM713 != null)
				msgs = ((InternalEObject)oM713).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM713, null, msgs);
			if (newOM713 != null)
				msgs = ((InternalEObject)newOM713).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM713, null, msgs);
			msgs = basicSetOM713(newOM713, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM713, newOM713, newOM713));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM714CONTENT getOM714() {
		return oM714;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM714(OM714CONTENT newOM714, NotificationChain msgs) {
		OM714CONTENT oldOM714 = oM714;
		oM714 = newOM714;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM714, oldOM714, newOM714);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM714(OM714CONTENT newOM714) {
		if (newOM714 != oM714) {
			NotificationChain msgs = null;
			if (oM714 != null)
				msgs = ((InternalEObject)oM714).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM714, null, msgs);
			if (newOM714 != null)
				msgs = ((InternalEObject)newOM714).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM714, null, msgs);
			msgs = basicSetOM714(newOM714, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM714, newOM714, newOM714));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM715CONTENT getOM715() {
		return oM715;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM715(OM715CONTENT newOM715, NotificationChain msgs) {
		OM715CONTENT oldOM715 = oM715;
		oM715 = newOM715;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM715, oldOM715, newOM715);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM715(OM715CONTENT newOM715) {
		if (newOM715 != oM715) {
			NotificationChain msgs = null;
			if (oM715 != null)
				msgs = ((InternalEObject)oM715).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM715, null, msgs);
			if (newOM715 != null)
				msgs = ((InternalEObject)newOM715).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM715, null, msgs);
			msgs = basicSetOM715(newOM715, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM715, newOM715, newOM715));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM716CONTENT getOM716() {
		return oM716;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM716(OM716CONTENT newOM716, NotificationChain msgs) {
		OM716CONTENT oldOM716 = oM716;
		oM716 = newOM716;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM716, oldOM716, newOM716);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM716(OM716CONTENT newOM716) {
		if (newOM716 != oM716) {
			NotificationChain msgs = null;
			if (oM716 != null)
				msgs = ((InternalEObject)oM716).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM716, null, msgs);
			if (newOM716 != null)
				msgs = ((InternalEObject)newOM716).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM716, null, msgs);
			msgs = basicSetOM716(newOM716, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM716, newOM716, newOM716));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM717CONTENT getOM717() {
		return oM717;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM717(OM717CONTENT newOM717, NotificationChain msgs) {
		OM717CONTENT oldOM717 = oM717;
		oM717 = newOM717;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM717, oldOM717, newOM717);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM717(OM717CONTENT newOM717) {
		if (newOM717 != oM717) {
			NotificationChain msgs = null;
			if (oM717 != null)
				msgs = ((InternalEObject)oM717).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM717, null, msgs);
			if (newOM717 != null)
				msgs = ((InternalEObject)newOM717).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM717, null, msgs);
			msgs = basicSetOM717(newOM717, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM717, newOM717, newOM717));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM718CONTENT getOM718() {
		return oM718;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM718(OM718CONTENT newOM718, NotificationChain msgs) {
		OM718CONTENT oldOM718 = oM718;
		oM718 = newOM718;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM718, oldOM718, newOM718);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM718(OM718CONTENT newOM718) {
		if (newOM718 != oM718) {
			NotificationChain msgs = null;
			if (oM718 != null)
				msgs = ((InternalEObject)oM718).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM718, null, msgs);
			if (newOM718 != null)
				msgs = ((InternalEObject)newOM718).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM718, null, msgs);
			msgs = basicSetOM718(newOM718, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM718, newOM718, newOM718));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM719CONTENT getOM719() {
		return oM719;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM719(OM719CONTENT newOM719, NotificationChain msgs) {
		OM719CONTENT oldOM719 = oM719;
		oM719 = newOM719;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM719, oldOM719, newOM719);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM719(OM719CONTENT newOM719) {
		if (newOM719 != oM719) {
			NotificationChain msgs = null;
			if (oM719 != null)
				msgs = ((InternalEObject)oM719).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM719, null, msgs);
			if (newOM719 != null)
				msgs = ((InternalEObject)newOM719).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM719, null, msgs);
			msgs = basicSetOM719(newOM719, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM719, newOM719, newOM719));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM720CONTENT getOM720() {
		return oM720;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM720(OM720CONTENT newOM720, NotificationChain msgs) {
		OM720CONTENT oldOM720 = oM720;
		oM720 = newOM720;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM720, oldOM720, newOM720);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM720(OM720CONTENT newOM720) {
		if (newOM720 != oM720) {
			NotificationChain msgs = null;
			if (oM720 != null)
				msgs = ((InternalEObject)oM720).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM720, null, msgs);
			if (newOM720 != null)
				msgs = ((InternalEObject)newOM720).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM720, null, msgs);
			msgs = basicSetOM720(newOM720, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM720, newOM720, newOM720));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM721CONTENT> getOM721() {
		if (oM721 == null) {
			oM721 = new EObjectContainmentEList<OM721CONTENT>(OM721CONTENT.class, this, V2xmlPackage.OM7CONTENT__OM721);
		}
		return oM721;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM722CONTENT getOM722() {
		return oM722;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM722(OM722CONTENT newOM722, NotificationChain msgs) {
		OM722CONTENT oldOM722 = oM722;
		oM722 = newOM722;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM722, oldOM722, newOM722);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM722(OM722CONTENT newOM722) {
		if (newOM722 != oM722) {
			NotificationChain msgs = null;
			if (oM722 != null)
				msgs = ((InternalEObject)oM722).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM722, null, msgs);
			if (newOM722 != null)
				msgs = ((InternalEObject)newOM722).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM722, null, msgs);
			msgs = basicSetOM722(newOM722, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM722, newOM722, newOM722));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM723CONTENT getOM723() {
		return oM723;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM723(OM723CONTENT newOM723, NotificationChain msgs) {
		OM723CONTENT oldOM723 = oM723;
		oM723 = newOM723;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM723, oldOM723, newOM723);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM723(OM723CONTENT newOM723) {
		if (newOM723 != oM723) {
			NotificationChain msgs = null;
			if (oM723 != null)
				msgs = ((InternalEObject)oM723).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM723, null, msgs);
			if (newOM723 != null)
				msgs = ((InternalEObject)newOM723).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM7CONTENT__OM723, null, msgs);
			msgs = basicSetOM723(newOM723, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM7CONTENT__OM723, newOM723, newOM723));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM724CONTENT> getOM724() {
		if (oM724 == null) {
			oM724 = new EObjectContainmentEList<OM724CONTENT>(OM724CONTENT.class, this, V2xmlPackage.OM7CONTENT__OM724);
		}
		return oM724;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM7CONTENT__ANY);
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
			case V2xmlPackage.OM7CONTENT__OM71:
				return basicSetOM71(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM72:
				return basicSetOM72(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM73:
				return ((InternalEList<?>)getOM73()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM7CONTENT__OM74:
				return basicSetOM74(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM75:
				return ((InternalEList<?>)getOM75()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM7CONTENT__OM76:
				return basicSetOM76(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM77:
				return basicSetOM77(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM78:
				return basicSetOM78(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM79:
				return basicSetOM79(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM710:
				return basicSetOM710(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM711:
				return basicSetOM711(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM712:
				return basicSetOM712(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM713:
				return basicSetOM713(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM714:
				return basicSetOM714(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM715:
				return basicSetOM715(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM716:
				return basicSetOM716(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM717:
				return basicSetOM717(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM718:
				return basicSetOM718(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM719:
				return basicSetOM719(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM720:
				return basicSetOM720(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM721:
				return ((InternalEList<?>)getOM721()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM7CONTENT__OM722:
				return basicSetOM722(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM723:
				return basicSetOM723(null, msgs);
			case V2xmlPackage.OM7CONTENT__OM724:
				return ((InternalEList<?>)getOM724()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM7CONTENT__ANY:
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
			case V2xmlPackage.OM7CONTENT__OM71:
				return getOM71();
			case V2xmlPackage.OM7CONTENT__OM72:
				return getOM72();
			case V2xmlPackage.OM7CONTENT__OM73:
				return getOM73();
			case V2xmlPackage.OM7CONTENT__OM74:
				return getOM74();
			case V2xmlPackage.OM7CONTENT__OM75:
				return getOM75();
			case V2xmlPackage.OM7CONTENT__OM76:
				return getOM76();
			case V2xmlPackage.OM7CONTENT__OM77:
				return getOM77();
			case V2xmlPackage.OM7CONTENT__OM78:
				return getOM78();
			case V2xmlPackage.OM7CONTENT__OM79:
				return getOM79();
			case V2xmlPackage.OM7CONTENT__OM710:
				return getOM710();
			case V2xmlPackage.OM7CONTENT__OM711:
				return getOM711();
			case V2xmlPackage.OM7CONTENT__OM712:
				return getOM712();
			case V2xmlPackage.OM7CONTENT__OM713:
				return getOM713();
			case V2xmlPackage.OM7CONTENT__OM714:
				return getOM714();
			case V2xmlPackage.OM7CONTENT__OM715:
				return getOM715();
			case V2xmlPackage.OM7CONTENT__OM716:
				return getOM716();
			case V2xmlPackage.OM7CONTENT__OM717:
				return getOM717();
			case V2xmlPackage.OM7CONTENT__OM718:
				return getOM718();
			case V2xmlPackage.OM7CONTENT__OM719:
				return getOM719();
			case V2xmlPackage.OM7CONTENT__OM720:
				return getOM720();
			case V2xmlPackage.OM7CONTENT__OM721:
				return getOM721();
			case V2xmlPackage.OM7CONTENT__OM722:
				return getOM722();
			case V2xmlPackage.OM7CONTENT__OM723:
				return getOM723();
			case V2xmlPackage.OM7CONTENT__OM724:
				return getOM724();
			case V2xmlPackage.OM7CONTENT__ANY:
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
			case V2xmlPackage.OM7CONTENT__OM71:
				setOM71((OM71CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM72:
				setOM72((OM72CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM73:
				getOM73().clear();
				getOM73().addAll((Collection<? extends OM73CONTENT>)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM74:
				setOM74((OM74CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM75:
				getOM75().clear();
				getOM75().addAll((Collection<? extends OM75CONTENT>)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM76:
				setOM76((OM76CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM77:
				setOM77((OM77CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM78:
				setOM78((OM78CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM79:
				setOM79((OM79CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM710:
				setOM710((OM710CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM711:
				setOM711((OM711CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM712:
				setOM712((OM712CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM713:
				setOM713((OM713CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM714:
				setOM714((OM714CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM715:
				setOM715((OM715CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM716:
				setOM716((OM716CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM717:
				setOM717((OM717CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM718:
				setOM718((OM718CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM719:
				setOM719((OM719CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM720:
				setOM720((OM720CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM721:
				getOM721().clear();
				getOM721().addAll((Collection<? extends OM721CONTENT>)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM722:
				setOM722((OM722CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM723:
				setOM723((OM723CONTENT)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__OM724:
				getOM724().clear();
				getOM724().addAll((Collection<? extends OM724CONTENT>)newValue);
				return;
			case V2xmlPackage.OM7CONTENT__ANY:
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
			case V2xmlPackage.OM7CONTENT__OM71:
				setOM71((OM71CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM72:
				setOM72((OM72CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM73:
				getOM73().clear();
				return;
			case V2xmlPackage.OM7CONTENT__OM74:
				setOM74((OM74CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM75:
				getOM75().clear();
				return;
			case V2xmlPackage.OM7CONTENT__OM76:
				setOM76((OM76CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM77:
				setOM77((OM77CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM78:
				setOM78((OM78CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM79:
				setOM79((OM79CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM710:
				setOM710((OM710CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM711:
				setOM711((OM711CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM712:
				setOM712((OM712CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM713:
				setOM713((OM713CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM714:
				setOM714((OM714CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM715:
				setOM715((OM715CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM716:
				setOM716((OM716CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM717:
				setOM717((OM717CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM718:
				setOM718((OM718CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM719:
				setOM719((OM719CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM720:
				setOM720((OM720CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM721:
				getOM721().clear();
				return;
			case V2xmlPackage.OM7CONTENT__OM722:
				setOM722((OM722CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM723:
				setOM723((OM723CONTENT)null);
				return;
			case V2xmlPackage.OM7CONTENT__OM724:
				getOM724().clear();
				return;
			case V2xmlPackage.OM7CONTENT__ANY:
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
			case V2xmlPackage.OM7CONTENT__OM71:
				return oM71 != null;
			case V2xmlPackage.OM7CONTENT__OM72:
				return oM72 != null;
			case V2xmlPackage.OM7CONTENT__OM73:
				return oM73 != null && !oM73.isEmpty();
			case V2xmlPackage.OM7CONTENT__OM74:
				return oM74 != null;
			case V2xmlPackage.OM7CONTENT__OM75:
				return oM75 != null && !oM75.isEmpty();
			case V2xmlPackage.OM7CONTENT__OM76:
				return oM76 != null;
			case V2xmlPackage.OM7CONTENT__OM77:
				return oM77 != null;
			case V2xmlPackage.OM7CONTENT__OM78:
				return oM78 != null;
			case V2xmlPackage.OM7CONTENT__OM79:
				return oM79 != null;
			case V2xmlPackage.OM7CONTENT__OM710:
				return oM710 != null;
			case V2xmlPackage.OM7CONTENT__OM711:
				return oM711 != null;
			case V2xmlPackage.OM7CONTENT__OM712:
				return oM712 != null;
			case V2xmlPackage.OM7CONTENT__OM713:
				return oM713 != null;
			case V2xmlPackage.OM7CONTENT__OM714:
				return oM714 != null;
			case V2xmlPackage.OM7CONTENT__OM715:
				return oM715 != null;
			case V2xmlPackage.OM7CONTENT__OM716:
				return oM716 != null;
			case V2xmlPackage.OM7CONTENT__OM717:
				return oM717 != null;
			case V2xmlPackage.OM7CONTENT__OM718:
				return oM718 != null;
			case V2xmlPackage.OM7CONTENT__OM719:
				return oM719 != null;
			case V2xmlPackage.OM7CONTENT__OM720:
				return oM720 != null;
			case V2xmlPackage.OM7CONTENT__OM721:
				return oM721 != null && !oM721.isEmpty();
			case V2xmlPackage.OM7CONTENT__OM722:
				return oM722 != null;
			case V2xmlPackage.OM7CONTENT__OM723:
				return oM723 != null;
			case V2xmlPackage.OM7CONTENT__OM724:
				return oM724 != null && !oM724.isEmpty();
			case V2xmlPackage.OM7CONTENT__ANY:
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

} //OM7CONTENTImpl
