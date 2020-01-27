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

import org.hl7.v2xml.MSH10CONTENT;
import org.hl7.v2xml.MSH11CONTENT;
import org.hl7.v2xml.MSH12CONTENT;
import org.hl7.v2xml.MSH13CONTENT;
import org.hl7.v2xml.MSH14CONTENT;
import org.hl7.v2xml.MSH15CONTENT;
import org.hl7.v2xml.MSH16CONTENT;
import org.hl7.v2xml.MSH17CONTENT;
import org.hl7.v2xml.MSH18CONTENT;
import org.hl7.v2xml.MSH19CONTENT;
import org.hl7.v2xml.MSH1CONTENT;
import org.hl7.v2xml.MSH20CONTENT;
import org.hl7.v2xml.MSH21CONTENT;
import org.hl7.v2xml.MSH2CONTENT;
import org.hl7.v2xml.MSH3CONTENT;
import org.hl7.v2xml.MSH4CONTENT;
import org.hl7.v2xml.MSH5CONTENT;
import org.hl7.v2xml.MSH6CONTENT;
import org.hl7.v2xml.MSH7CONTENT;
import org.hl7.v2xml.MSH8CONTENT;
import org.hl7.v2xml.MSH9CONTENT;
import org.hl7.v2xml.MSHCONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MSHCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH1 <em>MSH1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH2 <em>MSH2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH3 <em>MSH3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH4 <em>MSH4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH5 <em>MSH5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH6 <em>MSH6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH7 <em>MSH7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH8 <em>MSH8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH9 <em>MSH9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH10 <em>MSH10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH11 <em>MSH11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH12 <em>MSH12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH13 <em>MSH13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH14 <em>MSH14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH15 <em>MSH15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH16 <em>MSH16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH17 <em>MSH17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH18 <em>MSH18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH19 <em>MSH19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH20 <em>MSH20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getMSH21 <em>MSH21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.MSHCONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MSHCONTENTImpl extends EObjectImpl implements MSHCONTENT {
	/**
	 * The cached value of the '{@link #getMSH1() <em>MSH1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH1()
	 * @generated
	 * @ordered
	 */
	protected MSH1CONTENT mSH1;

	/**
	 * The cached value of the '{@link #getMSH2() <em>MSH2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH2()
	 * @generated
	 * @ordered
	 */
	protected MSH2CONTENT mSH2;

	/**
	 * The cached value of the '{@link #getMSH3() <em>MSH3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH3()
	 * @generated
	 * @ordered
	 */
	protected MSH3CONTENT mSH3;

	/**
	 * The cached value of the '{@link #getMSH4() <em>MSH4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH4()
	 * @generated
	 * @ordered
	 */
	protected MSH4CONTENT mSH4;

	/**
	 * The cached value of the '{@link #getMSH5() <em>MSH5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH5()
	 * @generated
	 * @ordered
	 */
	protected MSH5CONTENT mSH5;

	/**
	 * The cached value of the '{@link #getMSH6() <em>MSH6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH6()
	 * @generated
	 * @ordered
	 */
	protected MSH6CONTENT mSH6;

	/**
	 * The cached value of the '{@link #getMSH7() <em>MSH7</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH7()
	 * @generated
	 * @ordered
	 */
	protected MSH7CONTENT mSH7;

	/**
	 * The cached value of the '{@link #getMSH8() <em>MSH8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH8()
	 * @generated
	 * @ordered
	 */
	protected MSH8CONTENT mSH8;

	/**
	 * The cached value of the '{@link #getMSH9() <em>MSH9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH9()
	 * @generated
	 * @ordered
	 */
	protected MSH9CONTENT mSH9;

	/**
	 * The cached value of the '{@link #getMSH10() <em>MSH10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH10()
	 * @generated
	 * @ordered
	 */
	protected MSH10CONTENT mSH10;

	/**
	 * The cached value of the '{@link #getMSH11() <em>MSH11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH11()
	 * @generated
	 * @ordered
	 */
	protected MSH11CONTENT mSH11;

	/**
	 * The cached value of the '{@link #getMSH12() <em>MSH12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH12()
	 * @generated
	 * @ordered
	 */
	protected MSH12CONTENT mSH12;

	/**
	 * The cached value of the '{@link #getMSH13() <em>MSH13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH13()
	 * @generated
	 * @ordered
	 */
	protected MSH13CONTENT mSH13;

	/**
	 * The cached value of the '{@link #getMSH14() <em>MSH14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH14()
	 * @generated
	 * @ordered
	 */
	protected MSH14CONTENT mSH14;

	/**
	 * The cached value of the '{@link #getMSH15() <em>MSH15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH15()
	 * @generated
	 * @ordered
	 */
	protected MSH15CONTENT mSH15;

	/**
	 * The cached value of the '{@link #getMSH16() <em>MSH16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH16()
	 * @generated
	 * @ordered
	 */
	protected MSH16CONTENT mSH16;

	/**
	 * The cached value of the '{@link #getMSH17() <em>MSH17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH17()
	 * @generated
	 * @ordered
	 */
	protected MSH17CONTENT mSH17;

	/**
	 * The cached value of the '{@link #getMSH18() <em>MSH18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH18()
	 * @generated
	 * @ordered
	 */
	protected EList<MSH18CONTENT> mSH18;

	/**
	 * The cached value of the '{@link #getMSH19() <em>MSH19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH19()
	 * @generated
	 * @ordered
	 */
	protected MSH19CONTENT mSH19;

	/**
	 * The cached value of the '{@link #getMSH20() <em>MSH20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH20()
	 * @generated
	 * @ordered
	 */
	protected MSH20CONTENT mSH20;

	/**
	 * The cached value of the '{@link #getMSH21() <em>MSH21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMSH21()
	 * @generated
	 * @ordered
	 */
	protected EList<MSH21CONTENT> mSH21;

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
	protected MSHCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getMSHCONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH1CONTENT getMSH1() {
		return mSH1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH1(MSH1CONTENT newMSH1, NotificationChain msgs) {
		MSH1CONTENT oldMSH1 = mSH1;
		mSH1 = newMSH1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH1, oldMSH1, newMSH1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH1(MSH1CONTENT newMSH1) {
		if (newMSH1 != mSH1) {
			NotificationChain msgs = null;
			if (mSH1 != null)
				msgs = ((InternalEObject)mSH1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH1, null, msgs);
			if (newMSH1 != null)
				msgs = ((InternalEObject)newMSH1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH1, null, msgs);
			msgs = basicSetMSH1(newMSH1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH1, newMSH1, newMSH1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH2CONTENT getMSH2() {
		return mSH2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH2(MSH2CONTENT newMSH2, NotificationChain msgs) {
		MSH2CONTENT oldMSH2 = mSH2;
		mSH2 = newMSH2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH2, oldMSH2, newMSH2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH2(MSH2CONTENT newMSH2) {
		if (newMSH2 != mSH2) {
			NotificationChain msgs = null;
			if (mSH2 != null)
				msgs = ((InternalEObject)mSH2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH2, null, msgs);
			if (newMSH2 != null)
				msgs = ((InternalEObject)newMSH2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH2, null, msgs);
			msgs = basicSetMSH2(newMSH2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH2, newMSH2, newMSH2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH3CONTENT getMSH3() {
		return mSH3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH3(MSH3CONTENT newMSH3, NotificationChain msgs) {
		MSH3CONTENT oldMSH3 = mSH3;
		mSH3 = newMSH3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH3, oldMSH3, newMSH3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH3(MSH3CONTENT newMSH3) {
		if (newMSH3 != mSH3) {
			NotificationChain msgs = null;
			if (mSH3 != null)
				msgs = ((InternalEObject)mSH3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH3, null, msgs);
			if (newMSH3 != null)
				msgs = ((InternalEObject)newMSH3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH3, null, msgs);
			msgs = basicSetMSH3(newMSH3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH3, newMSH3, newMSH3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH4CONTENT getMSH4() {
		return mSH4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH4(MSH4CONTENT newMSH4, NotificationChain msgs) {
		MSH4CONTENT oldMSH4 = mSH4;
		mSH4 = newMSH4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH4, oldMSH4, newMSH4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH4(MSH4CONTENT newMSH4) {
		if (newMSH4 != mSH4) {
			NotificationChain msgs = null;
			if (mSH4 != null)
				msgs = ((InternalEObject)mSH4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH4, null, msgs);
			if (newMSH4 != null)
				msgs = ((InternalEObject)newMSH4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH4, null, msgs);
			msgs = basicSetMSH4(newMSH4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH4, newMSH4, newMSH4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH5CONTENT getMSH5() {
		return mSH5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH5(MSH5CONTENT newMSH5, NotificationChain msgs) {
		MSH5CONTENT oldMSH5 = mSH5;
		mSH5 = newMSH5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH5, oldMSH5, newMSH5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH5(MSH5CONTENT newMSH5) {
		if (newMSH5 != mSH5) {
			NotificationChain msgs = null;
			if (mSH5 != null)
				msgs = ((InternalEObject)mSH5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH5, null, msgs);
			if (newMSH5 != null)
				msgs = ((InternalEObject)newMSH5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH5, null, msgs);
			msgs = basicSetMSH5(newMSH5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH5, newMSH5, newMSH5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH6CONTENT getMSH6() {
		return mSH6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH6(MSH6CONTENT newMSH6, NotificationChain msgs) {
		MSH6CONTENT oldMSH6 = mSH6;
		mSH6 = newMSH6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH6, oldMSH6, newMSH6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH6(MSH6CONTENT newMSH6) {
		if (newMSH6 != mSH6) {
			NotificationChain msgs = null;
			if (mSH6 != null)
				msgs = ((InternalEObject)mSH6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH6, null, msgs);
			if (newMSH6 != null)
				msgs = ((InternalEObject)newMSH6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH6, null, msgs);
			msgs = basicSetMSH6(newMSH6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH6, newMSH6, newMSH6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH7CONTENT getMSH7() {
		return mSH7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH7(MSH7CONTENT newMSH7, NotificationChain msgs) {
		MSH7CONTENT oldMSH7 = mSH7;
		mSH7 = newMSH7;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH7, oldMSH7, newMSH7);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH7(MSH7CONTENT newMSH7) {
		if (newMSH7 != mSH7) {
			NotificationChain msgs = null;
			if (mSH7 != null)
				msgs = ((InternalEObject)mSH7).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH7, null, msgs);
			if (newMSH7 != null)
				msgs = ((InternalEObject)newMSH7).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH7, null, msgs);
			msgs = basicSetMSH7(newMSH7, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH7, newMSH7, newMSH7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH8CONTENT getMSH8() {
		return mSH8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH8(MSH8CONTENT newMSH8, NotificationChain msgs) {
		MSH8CONTENT oldMSH8 = mSH8;
		mSH8 = newMSH8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH8, oldMSH8, newMSH8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH8(MSH8CONTENT newMSH8) {
		if (newMSH8 != mSH8) {
			NotificationChain msgs = null;
			if (mSH8 != null)
				msgs = ((InternalEObject)mSH8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH8, null, msgs);
			if (newMSH8 != null)
				msgs = ((InternalEObject)newMSH8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH8, null, msgs);
			msgs = basicSetMSH8(newMSH8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH8, newMSH8, newMSH8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH9CONTENT getMSH9() {
		return mSH9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH9(MSH9CONTENT newMSH9, NotificationChain msgs) {
		MSH9CONTENT oldMSH9 = mSH9;
		mSH9 = newMSH9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH9, oldMSH9, newMSH9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH9(MSH9CONTENT newMSH9) {
		if (newMSH9 != mSH9) {
			NotificationChain msgs = null;
			if (mSH9 != null)
				msgs = ((InternalEObject)mSH9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH9, null, msgs);
			if (newMSH9 != null)
				msgs = ((InternalEObject)newMSH9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH9, null, msgs);
			msgs = basicSetMSH9(newMSH9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH9, newMSH9, newMSH9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH10CONTENT getMSH10() {
		return mSH10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH10(MSH10CONTENT newMSH10, NotificationChain msgs) {
		MSH10CONTENT oldMSH10 = mSH10;
		mSH10 = newMSH10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH10, oldMSH10, newMSH10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH10(MSH10CONTENT newMSH10) {
		if (newMSH10 != mSH10) {
			NotificationChain msgs = null;
			if (mSH10 != null)
				msgs = ((InternalEObject)mSH10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH10, null, msgs);
			if (newMSH10 != null)
				msgs = ((InternalEObject)newMSH10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH10, null, msgs);
			msgs = basicSetMSH10(newMSH10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH10, newMSH10, newMSH10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH11CONTENT getMSH11() {
		return mSH11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH11(MSH11CONTENT newMSH11, NotificationChain msgs) {
		MSH11CONTENT oldMSH11 = mSH11;
		mSH11 = newMSH11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH11, oldMSH11, newMSH11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH11(MSH11CONTENT newMSH11) {
		if (newMSH11 != mSH11) {
			NotificationChain msgs = null;
			if (mSH11 != null)
				msgs = ((InternalEObject)mSH11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH11, null, msgs);
			if (newMSH11 != null)
				msgs = ((InternalEObject)newMSH11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH11, null, msgs);
			msgs = basicSetMSH11(newMSH11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH11, newMSH11, newMSH11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH12CONTENT getMSH12() {
		return mSH12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH12(MSH12CONTENT newMSH12, NotificationChain msgs) {
		MSH12CONTENT oldMSH12 = mSH12;
		mSH12 = newMSH12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH12, oldMSH12, newMSH12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH12(MSH12CONTENT newMSH12) {
		if (newMSH12 != mSH12) {
			NotificationChain msgs = null;
			if (mSH12 != null)
				msgs = ((InternalEObject)mSH12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH12, null, msgs);
			if (newMSH12 != null)
				msgs = ((InternalEObject)newMSH12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH12, null, msgs);
			msgs = basicSetMSH12(newMSH12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH12, newMSH12, newMSH12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH13CONTENT getMSH13() {
		return mSH13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH13(MSH13CONTENT newMSH13, NotificationChain msgs) {
		MSH13CONTENT oldMSH13 = mSH13;
		mSH13 = newMSH13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH13, oldMSH13, newMSH13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH13(MSH13CONTENT newMSH13) {
		if (newMSH13 != mSH13) {
			NotificationChain msgs = null;
			if (mSH13 != null)
				msgs = ((InternalEObject)mSH13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH13, null, msgs);
			if (newMSH13 != null)
				msgs = ((InternalEObject)newMSH13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH13, null, msgs);
			msgs = basicSetMSH13(newMSH13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH13, newMSH13, newMSH13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH14CONTENT getMSH14() {
		return mSH14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH14(MSH14CONTENT newMSH14, NotificationChain msgs) {
		MSH14CONTENT oldMSH14 = mSH14;
		mSH14 = newMSH14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH14, oldMSH14, newMSH14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH14(MSH14CONTENT newMSH14) {
		if (newMSH14 != mSH14) {
			NotificationChain msgs = null;
			if (mSH14 != null)
				msgs = ((InternalEObject)mSH14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH14, null, msgs);
			if (newMSH14 != null)
				msgs = ((InternalEObject)newMSH14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH14, null, msgs);
			msgs = basicSetMSH14(newMSH14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH14, newMSH14, newMSH14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH15CONTENT getMSH15() {
		return mSH15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH15(MSH15CONTENT newMSH15, NotificationChain msgs) {
		MSH15CONTENT oldMSH15 = mSH15;
		mSH15 = newMSH15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH15, oldMSH15, newMSH15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH15(MSH15CONTENT newMSH15) {
		if (newMSH15 != mSH15) {
			NotificationChain msgs = null;
			if (mSH15 != null)
				msgs = ((InternalEObject)mSH15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH15, null, msgs);
			if (newMSH15 != null)
				msgs = ((InternalEObject)newMSH15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH15, null, msgs);
			msgs = basicSetMSH15(newMSH15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH15, newMSH15, newMSH15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH16CONTENT getMSH16() {
		return mSH16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH16(MSH16CONTENT newMSH16, NotificationChain msgs) {
		MSH16CONTENT oldMSH16 = mSH16;
		mSH16 = newMSH16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH16, oldMSH16, newMSH16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH16(MSH16CONTENT newMSH16) {
		if (newMSH16 != mSH16) {
			NotificationChain msgs = null;
			if (mSH16 != null)
				msgs = ((InternalEObject)mSH16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH16, null, msgs);
			if (newMSH16 != null)
				msgs = ((InternalEObject)newMSH16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH16, null, msgs);
			msgs = basicSetMSH16(newMSH16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH16, newMSH16, newMSH16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH17CONTENT getMSH17() {
		return mSH17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH17(MSH17CONTENT newMSH17, NotificationChain msgs) {
		MSH17CONTENT oldMSH17 = mSH17;
		mSH17 = newMSH17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH17, oldMSH17, newMSH17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH17(MSH17CONTENT newMSH17) {
		if (newMSH17 != mSH17) {
			NotificationChain msgs = null;
			if (mSH17 != null)
				msgs = ((InternalEObject)mSH17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH17, null, msgs);
			if (newMSH17 != null)
				msgs = ((InternalEObject)newMSH17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH17, null, msgs);
			msgs = basicSetMSH17(newMSH17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH17, newMSH17, newMSH17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSH18CONTENT> getMSH18() {
		if (mSH18 == null) {
			mSH18 = new EObjectContainmentEList<MSH18CONTENT>(MSH18CONTENT.class, this, V2xmlPackage.MSHCONTENT__MSH18);
		}
		return mSH18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH19CONTENT getMSH19() {
		return mSH19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH19(MSH19CONTENT newMSH19, NotificationChain msgs) {
		MSH19CONTENT oldMSH19 = mSH19;
		mSH19 = newMSH19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH19, oldMSH19, newMSH19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH19(MSH19CONTENT newMSH19) {
		if (newMSH19 != mSH19) {
			NotificationChain msgs = null;
			if (mSH19 != null)
				msgs = ((InternalEObject)mSH19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH19, null, msgs);
			if (newMSH19 != null)
				msgs = ((InternalEObject)newMSH19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH19, null, msgs);
			msgs = basicSetMSH19(newMSH19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH19, newMSH19, newMSH19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSH20CONTENT getMSH20() {
		return mSH20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMSH20(MSH20CONTENT newMSH20, NotificationChain msgs) {
		MSH20CONTENT oldMSH20 = mSH20;
		mSH20 = newMSH20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH20, oldMSH20, newMSH20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMSH20(MSH20CONTENT newMSH20) {
		if (newMSH20 != mSH20) {
			NotificationChain msgs = null;
			if (mSH20 != null)
				msgs = ((InternalEObject)mSH20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH20, null, msgs);
			if (newMSH20 != null)
				msgs = ((InternalEObject)newMSH20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.MSHCONTENT__MSH20, null, msgs);
			msgs = basicSetMSH20(newMSH20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.MSHCONTENT__MSH20, newMSH20, newMSH20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MSH21CONTENT> getMSH21() {
		if (mSH21 == null) {
			mSH21 = new EObjectContainmentEList<MSH21CONTENT>(MSH21CONTENT.class, this, V2xmlPackage.MSHCONTENT__MSH21);
		}
		return mSH21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.MSHCONTENT__ANY);
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
			case V2xmlPackage.MSHCONTENT__MSH1:
				return basicSetMSH1(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH2:
				return basicSetMSH2(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH3:
				return basicSetMSH3(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH4:
				return basicSetMSH4(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH5:
				return basicSetMSH5(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH6:
				return basicSetMSH6(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH7:
				return basicSetMSH7(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH8:
				return basicSetMSH8(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH9:
				return basicSetMSH9(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH10:
				return basicSetMSH10(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH11:
				return basicSetMSH11(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH12:
				return basicSetMSH12(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH13:
				return basicSetMSH13(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH14:
				return basicSetMSH14(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH15:
				return basicSetMSH15(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH16:
				return basicSetMSH16(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH17:
				return basicSetMSH17(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH18:
				return ((InternalEList<?>)getMSH18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MSHCONTENT__MSH19:
				return basicSetMSH19(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH20:
				return basicSetMSH20(null, msgs);
			case V2xmlPackage.MSHCONTENT__MSH21:
				return ((InternalEList<?>)getMSH21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.MSHCONTENT__ANY:
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
			case V2xmlPackage.MSHCONTENT__MSH1:
				return getMSH1();
			case V2xmlPackage.MSHCONTENT__MSH2:
				return getMSH2();
			case V2xmlPackage.MSHCONTENT__MSH3:
				return getMSH3();
			case V2xmlPackage.MSHCONTENT__MSH4:
				return getMSH4();
			case V2xmlPackage.MSHCONTENT__MSH5:
				return getMSH5();
			case V2xmlPackage.MSHCONTENT__MSH6:
				return getMSH6();
			case V2xmlPackage.MSHCONTENT__MSH7:
				return getMSH7();
			case V2xmlPackage.MSHCONTENT__MSH8:
				return getMSH8();
			case V2xmlPackage.MSHCONTENT__MSH9:
				return getMSH9();
			case V2xmlPackage.MSHCONTENT__MSH10:
				return getMSH10();
			case V2xmlPackage.MSHCONTENT__MSH11:
				return getMSH11();
			case V2xmlPackage.MSHCONTENT__MSH12:
				return getMSH12();
			case V2xmlPackage.MSHCONTENT__MSH13:
				return getMSH13();
			case V2xmlPackage.MSHCONTENT__MSH14:
				return getMSH14();
			case V2xmlPackage.MSHCONTENT__MSH15:
				return getMSH15();
			case V2xmlPackage.MSHCONTENT__MSH16:
				return getMSH16();
			case V2xmlPackage.MSHCONTENT__MSH17:
				return getMSH17();
			case V2xmlPackage.MSHCONTENT__MSH18:
				return getMSH18();
			case V2xmlPackage.MSHCONTENT__MSH19:
				return getMSH19();
			case V2xmlPackage.MSHCONTENT__MSH20:
				return getMSH20();
			case V2xmlPackage.MSHCONTENT__MSH21:
				return getMSH21();
			case V2xmlPackage.MSHCONTENT__ANY:
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
			case V2xmlPackage.MSHCONTENT__MSH1:
				setMSH1((MSH1CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH2:
				setMSH2((MSH2CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH3:
				setMSH3((MSH3CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH4:
				setMSH4((MSH4CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH5:
				setMSH5((MSH5CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH6:
				setMSH6((MSH6CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH7:
				setMSH7((MSH7CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH8:
				setMSH8((MSH8CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH9:
				setMSH9((MSH9CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH10:
				setMSH10((MSH10CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH11:
				setMSH11((MSH11CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH12:
				setMSH12((MSH12CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH13:
				setMSH13((MSH13CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH14:
				setMSH14((MSH14CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH15:
				setMSH15((MSH15CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH16:
				setMSH16((MSH16CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH17:
				setMSH17((MSH17CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH18:
				getMSH18().clear();
				getMSH18().addAll((Collection<? extends MSH18CONTENT>)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH19:
				setMSH19((MSH19CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH20:
				setMSH20((MSH20CONTENT)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__MSH21:
				getMSH21().clear();
				getMSH21().addAll((Collection<? extends MSH21CONTENT>)newValue);
				return;
			case V2xmlPackage.MSHCONTENT__ANY:
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
			case V2xmlPackage.MSHCONTENT__MSH1:
				setMSH1((MSH1CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH2:
				setMSH2((MSH2CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH3:
				setMSH3((MSH3CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH4:
				setMSH4((MSH4CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH5:
				setMSH5((MSH5CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH6:
				setMSH6((MSH6CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH7:
				setMSH7((MSH7CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH8:
				setMSH8((MSH8CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH9:
				setMSH9((MSH9CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH10:
				setMSH10((MSH10CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH11:
				setMSH11((MSH11CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH12:
				setMSH12((MSH12CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH13:
				setMSH13((MSH13CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH14:
				setMSH14((MSH14CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH15:
				setMSH15((MSH15CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH16:
				setMSH16((MSH16CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH17:
				setMSH17((MSH17CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH18:
				getMSH18().clear();
				return;
			case V2xmlPackage.MSHCONTENT__MSH19:
				setMSH19((MSH19CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH20:
				setMSH20((MSH20CONTENT)null);
				return;
			case V2xmlPackage.MSHCONTENT__MSH21:
				getMSH21().clear();
				return;
			case V2xmlPackage.MSHCONTENT__ANY:
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
			case V2xmlPackage.MSHCONTENT__MSH1:
				return mSH1 != null;
			case V2xmlPackage.MSHCONTENT__MSH2:
				return mSH2 != null;
			case V2xmlPackage.MSHCONTENT__MSH3:
				return mSH3 != null;
			case V2xmlPackage.MSHCONTENT__MSH4:
				return mSH4 != null;
			case V2xmlPackage.MSHCONTENT__MSH5:
				return mSH5 != null;
			case V2xmlPackage.MSHCONTENT__MSH6:
				return mSH6 != null;
			case V2xmlPackage.MSHCONTENT__MSH7:
				return mSH7 != null;
			case V2xmlPackage.MSHCONTENT__MSH8:
				return mSH8 != null;
			case V2xmlPackage.MSHCONTENT__MSH9:
				return mSH9 != null;
			case V2xmlPackage.MSHCONTENT__MSH10:
				return mSH10 != null;
			case V2xmlPackage.MSHCONTENT__MSH11:
				return mSH11 != null;
			case V2xmlPackage.MSHCONTENT__MSH12:
				return mSH12 != null;
			case V2xmlPackage.MSHCONTENT__MSH13:
				return mSH13 != null;
			case V2xmlPackage.MSHCONTENT__MSH14:
				return mSH14 != null;
			case V2xmlPackage.MSHCONTENT__MSH15:
				return mSH15 != null;
			case V2xmlPackage.MSHCONTENT__MSH16:
				return mSH16 != null;
			case V2xmlPackage.MSHCONTENT__MSH17:
				return mSH17 != null;
			case V2xmlPackage.MSHCONTENT__MSH18:
				return mSH18 != null && !mSH18.isEmpty();
			case V2xmlPackage.MSHCONTENT__MSH19:
				return mSH19 != null;
			case V2xmlPackage.MSHCONTENT__MSH20:
				return mSH20 != null;
			case V2xmlPackage.MSHCONTENT__MSH21:
				return mSH21 != null && !mSH21.isEmpty();
			case V2xmlPackage.MSHCONTENT__ANY:
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

} //MSHCONTENTImpl
