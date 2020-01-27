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

import org.hl7.v2xml.IPC1CONTENT;
import org.hl7.v2xml.IPC2CONTENT;
import org.hl7.v2xml.IPC3CONTENT;
import org.hl7.v2xml.IPC4CONTENT;
import org.hl7.v2xml.IPC5CONTENT;
import org.hl7.v2xml.IPC6CONTENT;
import org.hl7.v2xml.IPC7CONTENT;
import org.hl7.v2xml.IPC8CONTENT;
import org.hl7.v2xml.IPC9CONTENT;
import org.hl7.v2xml.IPCCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPCCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC1 <em>IPC1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC2 <em>IPC2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC3 <em>IPC3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC4 <em>IPC4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC5 <em>IPC5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC6 <em>IPC6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC7 <em>IPC7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC8 <em>IPC8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getIPC9 <em>IPC9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IPCCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPCCONTENTImpl extends EObjectImpl implements IPCCONTENT {
	/**
	 * The cached value of the '{@link #getIPC1() <em>IPC1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC1()
	 * @generated
	 * @ordered
	 */
	protected IPC1CONTENT iPC1;

	/**
	 * The cached value of the '{@link #getIPC2() <em>IPC2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC2()
	 * @generated
	 * @ordered
	 */
	protected IPC2CONTENT iPC2;

	/**
	 * The cached value of the '{@link #getIPC3() <em>IPC3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC3()
	 * @generated
	 * @ordered
	 */
	protected IPC3CONTENT iPC3;

	/**
	 * The cached value of the '{@link #getIPC4() <em>IPC4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC4()
	 * @generated
	 * @ordered
	 */
	protected IPC4CONTENT iPC4;

	/**
	 * The cached value of the '{@link #getIPC5() <em>IPC5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC5()
	 * @generated
	 * @ordered
	 */
	protected IPC5CONTENT iPC5;

	/**
	 * The cached value of the '{@link #getIPC6() <em>IPC6</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC6()
	 * @generated
	 * @ordered
	 */
	protected EList<IPC6CONTENT> iPC6;

	/**
	 * The cached value of the '{@link #getIPC7() <em>IPC7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC7()
	 * @generated
	 * @ordered
	 */
	protected IPC7CONTENT iPC7;

	/**
	 * The cached value of the '{@link #getIPC8() <em>IPC8</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC8()
	 * @generated
	 * @ordered
	 */
	protected EList<IPC8CONTENT> iPC8;

	/**
	 * The cached value of the '{@link #getIPC9() <em>IPC9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPC9()
	 * @generated
	 * @ordered
	 */
	protected IPC9CONTENT iPC9;

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
	protected IPCCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIPCCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC1CONTENT getIPC1() {
		return iPC1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC1(IPC1CONTENT newIPC1, NotificationChain msgs) {
		IPC1CONTENT oldIPC1 = iPC1;
		iPC1 = newIPC1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC1, oldIPC1, newIPC1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC1(IPC1CONTENT newIPC1) {
		if (newIPC1 != iPC1) {
			NotificationChain msgs = null;
			if (iPC1 != null)
				msgs = ((InternalEObject)iPC1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC1, null, msgs);
			if (newIPC1 != null)
				msgs = ((InternalEObject)newIPC1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC1, null, msgs);
			msgs = basicSetIPC1(newIPC1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC1, newIPC1, newIPC1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC2CONTENT getIPC2() {
		return iPC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC2(IPC2CONTENT newIPC2, NotificationChain msgs) {
		IPC2CONTENT oldIPC2 = iPC2;
		iPC2 = newIPC2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC2, oldIPC2, newIPC2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC2(IPC2CONTENT newIPC2) {
		if (newIPC2 != iPC2) {
			NotificationChain msgs = null;
			if (iPC2 != null)
				msgs = ((InternalEObject)iPC2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC2, null, msgs);
			if (newIPC2 != null)
				msgs = ((InternalEObject)newIPC2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC2, null, msgs);
			msgs = basicSetIPC2(newIPC2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC2, newIPC2, newIPC2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC3CONTENT getIPC3() {
		return iPC3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC3(IPC3CONTENT newIPC3, NotificationChain msgs) {
		IPC3CONTENT oldIPC3 = iPC3;
		iPC3 = newIPC3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC3, oldIPC3, newIPC3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC3(IPC3CONTENT newIPC3) {
		if (newIPC3 != iPC3) {
			NotificationChain msgs = null;
			if (iPC3 != null)
				msgs = ((InternalEObject)iPC3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC3, null, msgs);
			if (newIPC3 != null)
				msgs = ((InternalEObject)newIPC3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC3, null, msgs);
			msgs = basicSetIPC3(newIPC3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC3, newIPC3, newIPC3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC4CONTENT getIPC4() {
		return iPC4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC4(IPC4CONTENT newIPC4, NotificationChain msgs) {
		IPC4CONTENT oldIPC4 = iPC4;
		iPC4 = newIPC4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC4, oldIPC4, newIPC4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC4(IPC4CONTENT newIPC4) {
		if (newIPC4 != iPC4) {
			NotificationChain msgs = null;
			if (iPC4 != null)
				msgs = ((InternalEObject)iPC4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC4, null, msgs);
			if (newIPC4 != null)
				msgs = ((InternalEObject)newIPC4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC4, null, msgs);
			msgs = basicSetIPC4(newIPC4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC4, newIPC4, newIPC4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC5CONTENT getIPC5() {
		return iPC5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC5(IPC5CONTENT newIPC5, NotificationChain msgs) {
		IPC5CONTENT oldIPC5 = iPC5;
		iPC5 = newIPC5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC5, oldIPC5, newIPC5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC5(IPC5CONTENT newIPC5) {
		if (newIPC5 != iPC5) {
			NotificationChain msgs = null;
			if (iPC5 != null)
				msgs = ((InternalEObject)iPC5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC5, null, msgs);
			if (newIPC5 != null)
				msgs = ((InternalEObject)newIPC5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC5, null, msgs);
			msgs = basicSetIPC5(newIPC5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC5, newIPC5, newIPC5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPC6CONTENT> getIPC6() {
		if (iPC6 == null) {
			iPC6 = new EObjectContainmentEList<IPC6CONTENT>(IPC6CONTENT.class, this, V2xmlPackage.IPCCONTENT__IPC6);
		}
		return iPC6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC7CONTENT getIPC7() {
		return iPC7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC7(IPC7CONTENT newIPC7, NotificationChain msgs) {
		IPC7CONTENT oldIPC7 = iPC7;
		iPC7 = newIPC7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC7, oldIPC7, newIPC7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC7(IPC7CONTENT newIPC7) {
		if (newIPC7 != iPC7) {
			NotificationChain msgs = null;
			if (iPC7 != null)
				msgs = ((InternalEObject)iPC7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC7, null, msgs);
			if (newIPC7 != null)
				msgs = ((InternalEObject)newIPC7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC7, null, msgs);
			msgs = basicSetIPC7(newIPC7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC7, newIPC7, newIPC7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPC8CONTENT> getIPC8() {
		if (iPC8 == null) {
			iPC8 = new EObjectContainmentEList<IPC8CONTENT>(IPC8CONTENT.class, this, V2xmlPackage.IPCCONTENT__IPC8);
		}
		return iPC8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPC9CONTENT getIPC9() {
		return iPC9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPC9(IPC9CONTENT newIPC9, NotificationChain msgs) {
		IPC9CONTENT oldIPC9 = iPC9;
		iPC9 = newIPC9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC9, oldIPC9, newIPC9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPC9(IPC9CONTENT newIPC9) {
		if (newIPC9 != iPC9) {
			NotificationChain msgs = null;
			if (iPC9 != null)
				msgs = ((InternalEObject)iPC9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC9, null, msgs);
			if (newIPC9 != null)
				msgs = ((InternalEObject)newIPC9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IPCCONTENT__IPC9, null, msgs);
			msgs = basicSetIPC9(newIPC9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IPCCONTENT__IPC9, newIPC9, newIPC9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IPCCONTENT__ANY);
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
			case V2xmlPackage.IPCCONTENT__IPC1:
				return basicSetIPC1(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC2:
				return basicSetIPC2(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC3:
				return basicSetIPC3(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC4:
				return basicSetIPC4(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC5:
				return basicSetIPC5(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC6:
				return ((InternalEList<?>)getIPC6()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IPCCONTENT__IPC7:
				return basicSetIPC7(null, msgs);
			case V2xmlPackage.IPCCONTENT__IPC8:
				return ((InternalEList<?>)getIPC8()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IPCCONTENT__IPC9:
				return basicSetIPC9(null, msgs);
			case V2xmlPackage.IPCCONTENT__ANY:
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
			case V2xmlPackage.IPCCONTENT__IPC1:
				return getIPC1();
			case V2xmlPackage.IPCCONTENT__IPC2:
				return getIPC2();
			case V2xmlPackage.IPCCONTENT__IPC3:
				return getIPC3();
			case V2xmlPackage.IPCCONTENT__IPC4:
				return getIPC4();
			case V2xmlPackage.IPCCONTENT__IPC5:
				return getIPC5();
			case V2xmlPackage.IPCCONTENT__IPC6:
				return getIPC6();
			case V2xmlPackage.IPCCONTENT__IPC7:
				return getIPC7();
			case V2xmlPackage.IPCCONTENT__IPC8:
				return getIPC8();
			case V2xmlPackage.IPCCONTENT__IPC9:
				return getIPC9();
			case V2xmlPackage.IPCCONTENT__ANY:
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
			case V2xmlPackage.IPCCONTENT__IPC1:
				setIPC1((IPC1CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC2:
				setIPC2((IPC2CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC3:
				setIPC3((IPC3CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC4:
				setIPC4((IPC4CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC5:
				setIPC5((IPC5CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC6:
				getIPC6().clear();
				getIPC6().addAll((Collection<? extends IPC6CONTENT>)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC7:
				setIPC7((IPC7CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC8:
				getIPC8().clear();
				getIPC8().addAll((Collection<? extends IPC8CONTENT>)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__IPC9:
				setIPC9((IPC9CONTENT)newValue);
				return;
			case V2xmlPackage.IPCCONTENT__ANY:
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
			case V2xmlPackage.IPCCONTENT__IPC1:
				setIPC1((IPC1CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC2:
				setIPC2((IPC2CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC3:
				setIPC3((IPC3CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC4:
				setIPC4((IPC4CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC5:
				setIPC5((IPC5CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC6:
				getIPC6().clear();
				return;
			case V2xmlPackage.IPCCONTENT__IPC7:
				setIPC7((IPC7CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__IPC8:
				getIPC8().clear();
				return;
			case V2xmlPackage.IPCCONTENT__IPC9:
				setIPC9((IPC9CONTENT)null);
				return;
			case V2xmlPackage.IPCCONTENT__ANY:
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
			case V2xmlPackage.IPCCONTENT__IPC1:
				return iPC1 != null;
			case V2xmlPackage.IPCCONTENT__IPC2:
				return iPC2 != null;
			case V2xmlPackage.IPCCONTENT__IPC3:
				return iPC3 != null;
			case V2xmlPackage.IPCCONTENT__IPC4:
				return iPC4 != null;
			case V2xmlPackage.IPCCONTENT__IPC5:
				return iPC5 != null;
			case V2xmlPackage.IPCCONTENT__IPC6:
				return iPC6 != null && !iPC6.isEmpty();
			case V2xmlPackage.IPCCONTENT__IPC7:
				return iPC7 != null;
			case V2xmlPackage.IPCCONTENT__IPC8:
				return iPC8 != null && !iPC8.isEmpty();
			case V2xmlPackage.IPCCONTENT__IPC9:
				return iPC9 != null;
			case V2xmlPackage.IPCCONTENT__ANY:
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

} //IPCCONTENTImpl
