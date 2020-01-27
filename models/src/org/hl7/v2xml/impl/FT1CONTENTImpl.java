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

import org.hl7.v2xml.FT110CONTENT;
import org.hl7.v2xml.FT111CONTENT;
import org.hl7.v2xml.FT112CONTENT;
import org.hl7.v2xml.FT113CONTENT;
import org.hl7.v2xml.FT114CONTENT;
import org.hl7.v2xml.FT115CONTENT;
import org.hl7.v2xml.FT116CONTENT;
import org.hl7.v2xml.FT117CONTENT;
import org.hl7.v2xml.FT118CONTENT;
import org.hl7.v2xml.FT119CONTENT;
import org.hl7.v2xml.FT11CONTENT;
import org.hl7.v2xml.FT120CONTENT;
import org.hl7.v2xml.FT121CONTENT;
import org.hl7.v2xml.FT122CONTENT;
import org.hl7.v2xml.FT123CONTENT;
import org.hl7.v2xml.FT124CONTENT;
import org.hl7.v2xml.FT125CONTENT;
import org.hl7.v2xml.FT126CONTENT;
import org.hl7.v2xml.FT127CONTENT;
import org.hl7.v2xml.FT128CONTENT;
import org.hl7.v2xml.FT129CONTENT;
import org.hl7.v2xml.FT12CONTENT;
import org.hl7.v2xml.FT130CONTENT;
import org.hl7.v2xml.FT131CONTENT;
import org.hl7.v2xml.FT13CONTENT;
import org.hl7.v2xml.FT14CONTENT;
import org.hl7.v2xml.FT15CONTENT;
import org.hl7.v2xml.FT16CONTENT;
import org.hl7.v2xml.FT17CONTENT;
import org.hl7.v2xml.FT18CONTENT;
import org.hl7.v2xml.FT19CONTENT;
import org.hl7.v2xml.FT1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FT1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT11 <em>FT11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT12 <em>FT12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT13 <em>FT13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT14 <em>FT14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT15 <em>FT15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT16 <em>FT16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT17 <em>FT17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT18 <em>FT18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT19 <em>FT19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT110 <em>FT110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT111 <em>FT111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT112 <em>FT112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT113 <em>FT113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT114 <em>FT114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT115 <em>FT115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT116 <em>FT116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT117 <em>FT117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT118 <em>FT118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT119 <em>FT119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT120 <em>FT120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT121 <em>FT121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT122 <em>FT122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT123 <em>FT123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT124 <em>FT124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT125 <em>FT125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT126 <em>FT126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT127 <em>FT127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT128 <em>FT128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT129 <em>FT129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT130 <em>FT130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getFT131 <em>FT131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.FT1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FT1CONTENTImpl extends EObjectImpl implements FT1CONTENT {
	/**
	 * The cached value of the '{@link #getFT11() <em>FT11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT11()
	 * @generated
	 * @ordered
	 */
	protected FT11CONTENT fT11;

	/**
	 * The cached value of the '{@link #getFT12() <em>FT12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT12()
	 * @generated
	 * @ordered
	 */
	protected FT12CONTENT fT12;

	/**
	 * The cached value of the '{@link #getFT13() <em>FT13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT13()
	 * @generated
	 * @ordered
	 */
	protected FT13CONTENT fT13;

	/**
	 * The cached value of the '{@link #getFT14() <em>FT14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT14()
	 * @generated
	 * @ordered
	 */
	protected FT14CONTENT fT14;

	/**
	 * The cached value of the '{@link #getFT15() <em>FT15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT15()
	 * @generated
	 * @ordered
	 */
	protected FT15CONTENT fT15;

	/**
	 * The cached value of the '{@link #getFT16() <em>FT16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT16()
	 * @generated
	 * @ordered
	 */
	protected FT16CONTENT fT16;

	/**
	 * The cached value of the '{@link #getFT17() <em>FT17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT17()
	 * @generated
	 * @ordered
	 */
	protected FT17CONTENT fT17;

	/**
	 * The cached value of the '{@link #getFT18() <em>FT18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT18()
	 * @generated
	 * @ordered
	 */
	protected FT18CONTENT fT18;

	/**
	 * The cached value of the '{@link #getFT19() <em>FT19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT19()
	 * @generated
	 * @ordered
	 */
	protected FT19CONTENT fT19;

	/**
	 * The cached value of the '{@link #getFT110() <em>FT110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT110()
	 * @generated
	 * @ordered
	 */
	protected FT110CONTENT fT110;

	/**
	 * The cached value of the '{@link #getFT111() <em>FT111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT111()
	 * @generated
	 * @ordered
	 */
	protected FT111CONTENT fT111;

	/**
	 * The cached value of the '{@link #getFT112() <em>FT112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT112()
	 * @generated
	 * @ordered
	 */
	protected FT112CONTENT fT112;

	/**
	 * The cached value of the '{@link #getFT113() <em>FT113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT113()
	 * @generated
	 * @ordered
	 */
	protected FT113CONTENT fT113;

	/**
	 * The cached value of the '{@link #getFT114() <em>FT114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT114()
	 * @generated
	 * @ordered
	 */
	protected FT114CONTENT fT114;

	/**
	 * The cached value of the '{@link #getFT115() <em>FT115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT115()
	 * @generated
	 * @ordered
	 */
	protected FT115CONTENT fT115;

	/**
	 * The cached value of the '{@link #getFT116() <em>FT116</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT116()
	 * @generated
	 * @ordered
	 */
	protected FT116CONTENT fT116;

	/**
	 * The cached value of the '{@link #getFT117() <em>FT117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT117()
	 * @generated
	 * @ordered
	 */
	protected FT117CONTENT fT117;

	/**
	 * The cached value of the '{@link #getFT118() <em>FT118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT118()
	 * @generated
	 * @ordered
	 */
	protected FT118CONTENT fT118;

	/**
	 * The cached value of the '{@link #getFT119() <em>FT119</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT119()
	 * @generated
	 * @ordered
	 */
	protected EList<FT119CONTENT> fT119;

	/**
	 * The cached value of the '{@link #getFT120() <em>FT120</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT120()
	 * @generated
	 * @ordered
	 */
	protected EList<FT120CONTENT> fT120;

	/**
	 * The cached value of the '{@link #getFT121() <em>FT121</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT121()
	 * @generated
	 * @ordered
	 */
	protected EList<FT121CONTENT> fT121;

	/**
	 * The cached value of the '{@link #getFT122() <em>FT122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT122()
	 * @generated
	 * @ordered
	 */
	protected FT122CONTENT fT122;

	/**
	 * The cached value of the '{@link #getFT123() <em>FT123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT123()
	 * @generated
	 * @ordered
	 */
	protected FT123CONTENT fT123;

	/**
	 * The cached value of the '{@link #getFT124() <em>FT124</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT124()
	 * @generated
	 * @ordered
	 */
	protected EList<FT124CONTENT> fT124;

	/**
	 * The cached value of the '{@link #getFT125() <em>FT125</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT125()
	 * @generated
	 * @ordered
	 */
	protected FT125CONTENT fT125;

	/**
	 * The cached value of the '{@link #getFT126() <em>FT126</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT126()
	 * @generated
	 * @ordered
	 */
	protected EList<FT126CONTENT> fT126;

	/**
	 * The cached value of the '{@link #getFT127() <em>FT127</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT127()
	 * @generated
	 * @ordered
	 */
	protected FT127CONTENT fT127;

	/**
	 * The cached value of the '{@link #getFT128() <em>FT128</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT128()
	 * @generated
	 * @ordered
	 */
	protected FT128CONTENT fT128;

	/**
	 * The cached value of the '{@link #getFT129() <em>FT129</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT129()
	 * @generated
	 * @ordered
	 */
	protected FT129CONTENT fT129;

	/**
	 * The cached value of the '{@link #getFT130() <em>FT130</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT130()
	 * @generated
	 * @ordered
	 */
	protected FT130CONTENT fT130;

	/**
	 * The cached value of the '{@link #getFT131() <em>FT131</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFT131()
	 * @generated
	 * @ordered
	 */
	protected EList<FT131CONTENT> fT131;

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
	protected FT1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getFT1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT11CONTENT getFT11() {
		return fT11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT11(FT11CONTENT newFT11, NotificationChain msgs) {
		FT11CONTENT oldFT11 = fT11;
		fT11 = newFT11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT11, oldFT11, newFT11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT11(FT11CONTENT newFT11) {
		if (newFT11 != fT11) {
			NotificationChain msgs = null;
			if (fT11 != null)
				msgs = ((InternalEObject)fT11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT11, null, msgs);
			if (newFT11 != null)
				msgs = ((InternalEObject)newFT11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT11, null, msgs);
			msgs = basicSetFT11(newFT11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT11, newFT11, newFT11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT12CONTENT getFT12() {
		return fT12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT12(FT12CONTENT newFT12, NotificationChain msgs) {
		FT12CONTENT oldFT12 = fT12;
		fT12 = newFT12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT12, oldFT12, newFT12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT12(FT12CONTENT newFT12) {
		if (newFT12 != fT12) {
			NotificationChain msgs = null;
			if (fT12 != null)
				msgs = ((InternalEObject)fT12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT12, null, msgs);
			if (newFT12 != null)
				msgs = ((InternalEObject)newFT12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT12, null, msgs);
			msgs = basicSetFT12(newFT12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT12, newFT12, newFT12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT13CONTENT getFT13() {
		return fT13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT13(FT13CONTENT newFT13, NotificationChain msgs) {
		FT13CONTENT oldFT13 = fT13;
		fT13 = newFT13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT13, oldFT13, newFT13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT13(FT13CONTENT newFT13) {
		if (newFT13 != fT13) {
			NotificationChain msgs = null;
			if (fT13 != null)
				msgs = ((InternalEObject)fT13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT13, null, msgs);
			if (newFT13 != null)
				msgs = ((InternalEObject)newFT13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT13, null, msgs);
			msgs = basicSetFT13(newFT13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT13, newFT13, newFT13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT14CONTENT getFT14() {
		return fT14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT14(FT14CONTENT newFT14, NotificationChain msgs) {
		FT14CONTENT oldFT14 = fT14;
		fT14 = newFT14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT14, oldFT14, newFT14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT14(FT14CONTENT newFT14) {
		if (newFT14 != fT14) {
			NotificationChain msgs = null;
			if (fT14 != null)
				msgs = ((InternalEObject)fT14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT14, null, msgs);
			if (newFT14 != null)
				msgs = ((InternalEObject)newFT14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT14, null, msgs);
			msgs = basicSetFT14(newFT14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT14, newFT14, newFT14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT15CONTENT getFT15() {
		return fT15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT15(FT15CONTENT newFT15, NotificationChain msgs) {
		FT15CONTENT oldFT15 = fT15;
		fT15 = newFT15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT15, oldFT15, newFT15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT15(FT15CONTENT newFT15) {
		if (newFT15 != fT15) {
			NotificationChain msgs = null;
			if (fT15 != null)
				msgs = ((InternalEObject)fT15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT15, null, msgs);
			if (newFT15 != null)
				msgs = ((InternalEObject)newFT15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT15, null, msgs);
			msgs = basicSetFT15(newFT15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT15, newFT15, newFT15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT16CONTENT getFT16() {
		return fT16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT16(FT16CONTENT newFT16, NotificationChain msgs) {
		FT16CONTENT oldFT16 = fT16;
		fT16 = newFT16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT16, oldFT16, newFT16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT16(FT16CONTENT newFT16) {
		if (newFT16 != fT16) {
			NotificationChain msgs = null;
			if (fT16 != null)
				msgs = ((InternalEObject)fT16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT16, null, msgs);
			if (newFT16 != null)
				msgs = ((InternalEObject)newFT16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT16, null, msgs);
			msgs = basicSetFT16(newFT16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT16, newFT16, newFT16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT17CONTENT getFT17() {
		return fT17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT17(FT17CONTENT newFT17, NotificationChain msgs) {
		FT17CONTENT oldFT17 = fT17;
		fT17 = newFT17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT17, oldFT17, newFT17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT17(FT17CONTENT newFT17) {
		if (newFT17 != fT17) {
			NotificationChain msgs = null;
			if (fT17 != null)
				msgs = ((InternalEObject)fT17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT17, null, msgs);
			if (newFT17 != null)
				msgs = ((InternalEObject)newFT17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT17, null, msgs);
			msgs = basicSetFT17(newFT17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT17, newFT17, newFT17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT18CONTENT getFT18() {
		return fT18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT18(FT18CONTENT newFT18, NotificationChain msgs) {
		FT18CONTENT oldFT18 = fT18;
		fT18 = newFT18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT18, oldFT18, newFT18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT18(FT18CONTENT newFT18) {
		if (newFT18 != fT18) {
			NotificationChain msgs = null;
			if (fT18 != null)
				msgs = ((InternalEObject)fT18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT18, null, msgs);
			if (newFT18 != null)
				msgs = ((InternalEObject)newFT18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT18, null, msgs);
			msgs = basicSetFT18(newFT18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT18, newFT18, newFT18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT19CONTENT getFT19() {
		return fT19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT19(FT19CONTENT newFT19, NotificationChain msgs) {
		FT19CONTENT oldFT19 = fT19;
		fT19 = newFT19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT19, oldFT19, newFT19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT19(FT19CONTENT newFT19) {
		if (newFT19 != fT19) {
			NotificationChain msgs = null;
			if (fT19 != null)
				msgs = ((InternalEObject)fT19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT19, null, msgs);
			if (newFT19 != null)
				msgs = ((InternalEObject)newFT19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT19, null, msgs);
			msgs = basicSetFT19(newFT19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT19, newFT19, newFT19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT110CONTENT getFT110() {
		return fT110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT110(FT110CONTENT newFT110, NotificationChain msgs) {
		FT110CONTENT oldFT110 = fT110;
		fT110 = newFT110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT110, oldFT110, newFT110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT110(FT110CONTENT newFT110) {
		if (newFT110 != fT110) {
			NotificationChain msgs = null;
			if (fT110 != null)
				msgs = ((InternalEObject)fT110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT110, null, msgs);
			if (newFT110 != null)
				msgs = ((InternalEObject)newFT110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT110, null, msgs);
			msgs = basicSetFT110(newFT110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT110, newFT110, newFT110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT111CONTENT getFT111() {
		return fT111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT111(FT111CONTENT newFT111, NotificationChain msgs) {
		FT111CONTENT oldFT111 = fT111;
		fT111 = newFT111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT111, oldFT111, newFT111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT111(FT111CONTENT newFT111) {
		if (newFT111 != fT111) {
			NotificationChain msgs = null;
			if (fT111 != null)
				msgs = ((InternalEObject)fT111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT111, null, msgs);
			if (newFT111 != null)
				msgs = ((InternalEObject)newFT111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT111, null, msgs);
			msgs = basicSetFT111(newFT111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT111, newFT111, newFT111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT112CONTENT getFT112() {
		return fT112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT112(FT112CONTENT newFT112, NotificationChain msgs) {
		FT112CONTENT oldFT112 = fT112;
		fT112 = newFT112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT112, oldFT112, newFT112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT112(FT112CONTENT newFT112) {
		if (newFT112 != fT112) {
			NotificationChain msgs = null;
			if (fT112 != null)
				msgs = ((InternalEObject)fT112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT112, null, msgs);
			if (newFT112 != null)
				msgs = ((InternalEObject)newFT112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT112, null, msgs);
			msgs = basicSetFT112(newFT112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT112, newFT112, newFT112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT113CONTENT getFT113() {
		return fT113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT113(FT113CONTENT newFT113, NotificationChain msgs) {
		FT113CONTENT oldFT113 = fT113;
		fT113 = newFT113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT113, oldFT113, newFT113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT113(FT113CONTENT newFT113) {
		if (newFT113 != fT113) {
			NotificationChain msgs = null;
			if (fT113 != null)
				msgs = ((InternalEObject)fT113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT113, null, msgs);
			if (newFT113 != null)
				msgs = ((InternalEObject)newFT113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT113, null, msgs);
			msgs = basicSetFT113(newFT113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT113, newFT113, newFT113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT114CONTENT getFT114() {
		return fT114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT114(FT114CONTENT newFT114, NotificationChain msgs) {
		FT114CONTENT oldFT114 = fT114;
		fT114 = newFT114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT114, oldFT114, newFT114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT114(FT114CONTENT newFT114) {
		if (newFT114 != fT114) {
			NotificationChain msgs = null;
			if (fT114 != null)
				msgs = ((InternalEObject)fT114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT114, null, msgs);
			if (newFT114 != null)
				msgs = ((InternalEObject)newFT114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT114, null, msgs);
			msgs = basicSetFT114(newFT114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT114, newFT114, newFT114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT115CONTENT getFT115() {
		return fT115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT115(FT115CONTENT newFT115, NotificationChain msgs) {
		FT115CONTENT oldFT115 = fT115;
		fT115 = newFT115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT115, oldFT115, newFT115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT115(FT115CONTENT newFT115) {
		if (newFT115 != fT115) {
			NotificationChain msgs = null;
			if (fT115 != null)
				msgs = ((InternalEObject)fT115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT115, null, msgs);
			if (newFT115 != null)
				msgs = ((InternalEObject)newFT115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT115, null, msgs);
			msgs = basicSetFT115(newFT115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT115, newFT115, newFT115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT116CONTENT getFT116() {
		return fT116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT116(FT116CONTENT newFT116, NotificationChain msgs) {
		FT116CONTENT oldFT116 = fT116;
		fT116 = newFT116;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT116, oldFT116, newFT116);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT116(FT116CONTENT newFT116) {
		if (newFT116 != fT116) {
			NotificationChain msgs = null;
			if (fT116 != null)
				msgs = ((InternalEObject)fT116).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT116, null, msgs);
			if (newFT116 != null)
				msgs = ((InternalEObject)newFT116).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT116, null, msgs);
			msgs = basicSetFT116(newFT116, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT116, newFT116, newFT116));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT117CONTENT getFT117() {
		return fT117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT117(FT117CONTENT newFT117, NotificationChain msgs) {
		FT117CONTENT oldFT117 = fT117;
		fT117 = newFT117;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT117, oldFT117, newFT117);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT117(FT117CONTENT newFT117) {
		if (newFT117 != fT117) {
			NotificationChain msgs = null;
			if (fT117 != null)
				msgs = ((InternalEObject)fT117).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT117, null, msgs);
			if (newFT117 != null)
				msgs = ((InternalEObject)newFT117).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT117, null, msgs);
			msgs = basicSetFT117(newFT117, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT117, newFT117, newFT117));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT118CONTENT getFT118() {
		return fT118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT118(FT118CONTENT newFT118, NotificationChain msgs) {
		FT118CONTENT oldFT118 = fT118;
		fT118 = newFT118;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT118, oldFT118, newFT118);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT118(FT118CONTENT newFT118) {
		if (newFT118 != fT118) {
			NotificationChain msgs = null;
			if (fT118 != null)
				msgs = ((InternalEObject)fT118).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT118, null, msgs);
			if (newFT118 != null)
				msgs = ((InternalEObject)newFT118).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT118, null, msgs);
			msgs = basicSetFT118(newFT118, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT118, newFT118, newFT118));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT119CONTENT> getFT119() {
		if (fT119 == null) {
			fT119 = new EObjectContainmentEList<FT119CONTENT>(FT119CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT119);
		}
		return fT119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT120CONTENT> getFT120() {
		if (fT120 == null) {
			fT120 = new EObjectContainmentEList<FT120CONTENT>(FT120CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT120);
		}
		return fT120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT121CONTENT> getFT121() {
		if (fT121 == null) {
			fT121 = new EObjectContainmentEList<FT121CONTENT>(FT121CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT121);
		}
		return fT121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT122CONTENT getFT122() {
		return fT122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT122(FT122CONTENT newFT122, NotificationChain msgs) {
		FT122CONTENT oldFT122 = fT122;
		fT122 = newFT122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT122, oldFT122, newFT122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT122(FT122CONTENT newFT122) {
		if (newFT122 != fT122) {
			NotificationChain msgs = null;
			if (fT122 != null)
				msgs = ((InternalEObject)fT122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT122, null, msgs);
			if (newFT122 != null)
				msgs = ((InternalEObject)newFT122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT122, null, msgs);
			msgs = basicSetFT122(newFT122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT122, newFT122, newFT122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT123CONTENT getFT123() {
		return fT123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT123(FT123CONTENT newFT123, NotificationChain msgs) {
		FT123CONTENT oldFT123 = fT123;
		fT123 = newFT123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT123, oldFT123, newFT123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT123(FT123CONTENT newFT123) {
		if (newFT123 != fT123) {
			NotificationChain msgs = null;
			if (fT123 != null)
				msgs = ((InternalEObject)fT123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT123, null, msgs);
			if (newFT123 != null)
				msgs = ((InternalEObject)newFT123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT123, null, msgs);
			msgs = basicSetFT123(newFT123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT123, newFT123, newFT123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT124CONTENT> getFT124() {
		if (fT124 == null) {
			fT124 = new EObjectContainmentEList<FT124CONTENT>(FT124CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT124);
		}
		return fT124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT125CONTENT getFT125() {
		return fT125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT125(FT125CONTENT newFT125, NotificationChain msgs) {
		FT125CONTENT oldFT125 = fT125;
		fT125 = newFT125;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT125, oldFT125, newFT125);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT125(FT125CONTENT newFT125) {
		if (newFT125 != fT125) {
			NotificationChain msgs = null;
			if (fT125 != null)
				msgs = ((InternalEObject)fT125).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT125, null, msgs);
			if (newFT125 != null)
				msgs = ((InternalEObject)newFT125).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT125, null, msgs);
			msgs = basicSetFT125(newFT125, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT125, newFT125, newFT125));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT126CONTENT> getFT126() {
		if (fT126 == null) {
			fT126 = new EObjectContainmentEList<FT126CONTENT>(FT126CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT126);
		}
		return fT126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT127CONTENT getFT127() {
		return fT127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT127(FT127CONTENT newFT127, NotificationChain msgs) {
		FT127CONTENT oldFT127 = fT127;
		fT127 = newFT127;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT127, oldFT127, newFT127);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT127(FT127CONTENT newFT127) {
		if (newFT127 != fT127) {
			NotificationChain msgs = null;
			if (fT127 != null)
				msgs = ((InternalEObject)fT127).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT127, null, msgs);
			if (newFT127 != null)
				msgs = ((InternalEObject)newFT127).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT127, null, msgs);
			msgs = basicSetFT127(newFT127, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT127, newFT127, newFT127));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT128CONTENT getFT128() {
		return fT128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT128(FT128CONTENT newFT128, NotificationChain msgs) {
		FT128CONTENT oldFT128 = fT128;
		fT128 = newFT128;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT128, oldFT128, newFT128);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT128(FT128CONTENT newFT128) {
		if (newFT128 != fT128) {
			NotificationChain msgs = null;
			if (fT128 != null)
				msgs = ((InternalEObject)fT128).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT128, null, msgs);
			if (newFT128 != null)
				msgs = ((InternalEObject)newFT128).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT128, null, msgs);
			msgs = basicSetFT128(newFT128, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT128, newFT128, newFT128));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT129CONTENT getFT129() {
		return fT129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT129(FT129CONTENT newFT129, NotificationChain msgs) {
		FT129CONTENT oldFT129 = fT129;
		fT129 = newFT129;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT129, oldFT129, newFT129);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT129(FT129CONTENT newFT129) {
		if (newFT129 != fT129) {
			NotificationChain msgs = null;
			if (fT129 != null)
				msgs = ((InternalEObject)fT129).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT129, null, msgs);
			if (newFT129 != null)
				msgs = ((InternalEObject)newFT129).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT129, null, msgs);
			msgs = basicSetFT129(newFT129, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT129, newFT129, newFT129));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FT130CONTENT getFT130() {
		return fT130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFT130(FT130CONTENT newFT130, NotificationChain msgs) {
		FT130CONTENT oldFT130 = fT130;
		fT130 = newFT130;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT130, oldFT130, newFT130);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFT130(FT130CONTENT newFT130) {
		if (newFT130 != fT130) {
			NotificationChain msgs = null;
			if (fT130 != null)
				msgs = ((InternalEObject)fT130).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT130, null, msgs);
			if (newFT130 != null)
				msgs = ((InternalEObject)newFT130).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.FT1CONTENT__FT130, null, msgs);
			msgs = basicSetFT130(newFT130, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.FT1CONTENT__FT130, newFT130, newFT130));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FT131CONTENT> getFT131() {
		if (fT131 == null) {
			fT131 = new EObjectContainmentEList<FT131CONTENT>(FT131CONTENT.class, this, V2xmlPackage.FT1CONTENT__FT131);
		}
		return fT131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.FT1CONTENT__ANY);
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
			case V2xmlPackage.FT1CONTENT__FT11:
				return basicSetFT11(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT12:
				return basicSetFT12(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT13:
				return basicSetFT13(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT14:
				return basicSetFT14(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT15:
				return basicSetFT15(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT16:
				return basicSetFT16(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT17:
				return basicSetFT17(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT18:
				return basicSetFT18(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT19:
				return basicSetFT19(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT110:
				return basicSetFT110(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT111:
				return basicSetFT111(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT112:
				return basicSetFT112(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT113:
				return basicSetFT113(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT114:
				return basicSetFT114(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT115:
				return basicSetFT115(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT116:
				return basicSetFT116(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT117:
				return basicSetFT117(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT118:
				return basicSetFT118(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT119:
				return ((InternalEList<?>)getFT119()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__FT120:
				return ((InternalEList<?>)getFT120()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__FT121:
				return ((InternalEList<?>)getFT121()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__FT122:
				return basicSetFT122(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT123:
				return basicSetFT123(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT124:
				return ((InternalEList<?>)getFT124()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__FT125:
				return basicSetFT125(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT126:
				return ((InternalEList<?>)getFT126()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__FT127:
				return basicSetFT127(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT128:
				return basicSetFT128(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT129:
				return basicSetFT129(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT130:
				return basicSetFT130(null, msgs);
			case V2xmlPackage.FT1CONTENT__FT131:
				return ((InternalEList<?>)getFT131()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.FT1CONTENT__ANY:
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
			case V2xmlPackage.FT1CONTENT__FT11:
				return getFT11();
			case V2xmlPackage.FT1CONTENT__FT12:
				return getFT12();
			case V2xmlPackage.FT1CONTENT__FT13:
				return getFT13();
			case V2xmlPackage.FT1CONTENT__FT14:
				return getFT14();
			case V2xmlPackage.FT1CONTENT__FT15:
				return getFT15();
			case V2xmlPackage.FT1CONTENT__FT16:
				return getFT16();
			case V2xmlPackage.FT1CONTENT__FT17:
				return getFT17();
			case V2xmlPackage.FT1CONTENT__FT18:
				return getFT18();
			case V2xmlPackage.FT1CONTENT__FT19:
				return getFT19();
			case V2xmlPackage.FT1CONTENT__FT110:
				return getFT110();
			case V2xmlPackage.FT1CONTENT__FT111:
				return getFT111();
			case V2xmlPackage.FT1CONTENT__FT112:
				return getFT112();
			case V2xmlPackage.FT1CONTENT__FT113:
				return getFT113();
			case V2xmlPackage.FT1CONTENT__FT114:
				return getFT114();
			case V2xmlPackage.FT1CONTENT__FT115:
				return getFT115();
			case V2xmlPackage.FT1CONTENT__FT116:
				return getFT116();
			case V2xmlPackage.FT1CONTENT__FT117:
				return getFT117();
			case V2xmlPackage.FT1CONTENT__FT118:
				return getFT118();
			case V2xmlPackage.FT1CONTENT__FT119:
				return getFT119();
			case V2xmlPackage.FT1CONTENT__FT120:
				return getFT120();
			case V2xmlPackage.FT1CONTENT__FT121:
				return getFT121();
			case V2xmlPackage.FT1CONTENT__FT122:
				return getFT122();
			case V2xmlPackage.FT1CONTENT__FT123:
				return getFT123();
			case V2xmlPackage.FT1CONTENT__FT124:
				return getFT124();
			case V2xmlPackage.FT1CONTENT__FT125:
				return getFT125();
			case V2xmlPackage.FT1CONTENT__FT126:
				return getFT126();
			case V2xmlPackage.FT1CONTENT__FT127:
				return getFT127();
			case V2xmlPackage.FT1CONTENT__FT128:
				return getFT128();
			case V2xmlPackage.FT1CONTENT__FT129:
				return getFT129();
			case V2xmlPackage.FT1CONTENT__FT130:
				return getFT130();
			case V2xmlPackage.FT1CONTENT__FT131:
				return getFT131();
			case V2xmlPackage.FT1CONTENT__ANY:
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
			case V2xmlPackage.FT1CONTENT__FT11:
				setFT11((FT11CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT12:
				setFT12((FT12CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT13:
				setFT13((FT13CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT14:
				setFT14((FT14CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT15:
				setFT15((FT15CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT16:
				setFT16((FT16CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT17:
				setFT17((FT17CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT18:
				setFT18((FT18CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT19:
				setFT19((FT19CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT110:
				setFT110((FT110CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT111:
				setFT111((FT111CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT112:
				setFT112((FT112CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT113:
				setFT113((FT113CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT114:
				setFT114((FT114CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT115:
				setFT115((FT115CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT116:
				setFT116((FT116CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT117:
				setFT117((FT117CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT118:
				setFT118((FT118CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT119:
				getFT119().clear();
				getFT119().addAll((Collection<? extends FT119CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT120:
				getFT120().clear();
				getFT120().addAll((Collection<? extends FT120CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT121:
				getFT121().clear();
				getFT121().addAll((Collection<? extends FT121CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT122:
				setFT122((FT122CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT123:
				setFT123((FT123CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT124:
				getFT124().clear();
				getFT124().addAll((Collection<? extends FT124CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT125:
				setFT125((FT125CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT126:
				getFT126().clear();
				getFT126().addAll((Collection<? extends FT126CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT127:
				setFT127((FT127CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT128:
				setFT128((FT128CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT129:
				setFT129((FT129CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT130:
				setFT130((FT130CONTENT)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__FT131:
				getFT131().clear();
				getFT131().addAll((Collection<? extends FT131CONTENT>)newValue);
				return;
			case V2xmlPackage.FT1CONTENT__ANY:
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
			case V2xmlPackage.FT1CONTENT__FT11:
				setFT11((FT11CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT12:
				setFT12((FT12CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT13:
				setFT13((FT13CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT14:
				setFT14((FT14CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT15:
				setFT15((FT15CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT16:
				setFT16((FT16CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT17:
				setFT17((FT17CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT18:
				setFT18((FT18CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT19:
				setFT19((FT19CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT110:
				setFT110((FT110CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT111:
				setFT111((FT111CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT112:
				setFT112((FT112CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT113:
				setFT113((FT113CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT114:
				setFT114((FT114CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT115:
				setFT115((FT115CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT116:
				setFT116((FT116CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT117:
				setFT117((FT117CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT118:
				setFT118((FT118CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT119:
				getFT119().clear();
				return;
			case V2xmlPackage.FT1CONTENT__FT120:
				getFT120().clear();
				return;
			case V2xmlPackage.FT1CONTENT__FT121:
				getFT121().clear();
				return;
			case V2xmlPackage.FT1CONTENT__FT122:
				setFT122((FT122CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT123:
				setFT123((FT123CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT124:
				getFT124().clear();
				return;
			case V2xmlPackage.FT1CONTENT__FT125:
				setFT125((FT125CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT126:
				getFT126().clear();
				return;
			case V2xmlPackage.FT1CONTENT__FT127:
				setFT127((FT127CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT128:
				setFT128((FT128CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT129:
				setFT129((FT129CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT130:
				setFT130((FT130CONTENT)null);
				return;
			case V2xmlPackage.FT1CONTENT__FT131:
				getFT131().clear();
				return;
			case V2xmlPackage.FT1CONTENT__ANY:
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
			case V2xmlPackage.FT1CONTENT__FT11:
				return fT11 != null;
			case V2xmlPackage.FT1CONTENT__FT12:
				return fT12 != null;
			case V2xmlPackage.FT1CONTENT__FT13:
				return fT13 != null;
			case V2xmlPackage.FT1CONTENT__FT14:
				return fT14 != null;
			case V2xmlPackage.FT1CONTENT__FT15:
				return fT15 != null;
			case V2xmlPackage.FT1CONTENT__FT16:
				return fT16 != null;
			case V2xmlPackage.FT1CONTENT__FT17:
				return fT17 != null;
			case V2xmlPackage.FT1CONTENT__FT18:
				return fT18 != null;
			case V2xmlPackage.FT1CONTENT__FT19:
				return fT19 != null;
			case V2xmlPackage.FT1CONTENT__FT110:
				return fT110 != null;
			case V2xmlPackage.FT1CONTENT__FT111:
				return fT111 != null;
			case V2xmlPackage.FT1CONTENT__FT112:
				return fT112 != null;
			case V2xmlPackage.FT1CONTENT__FT113:
				return fT113 != null;
			case V2xmlPackage.FT1CONTENT__FT114:
				return fT114 != null;
			case V2xmlPackage.FT1CONTENT__FT115:
				return fT115 != null;
			case V2xmlPackage.FT1CONTENT__FT116:
				return fT116 != null;
			case V2xmlPackage.FT1CONTENT__FT117:
				return fT117 != null;
			case V2xmlPackage.FT1CONTENT__FT118:
				return fT118 != null;
			case V2xmlPackage.FT1CONTENT__FT119:
				return fT119 != null && !fT119.isEmpty();
			case V2xmlPackage.FT1CONTENT__FT120:
				return fT120 != null && !fT120.isEmpty();
			case V2xmlPackage.FT1CONTENT__FT121:
				return fT121 != null && !fT121.isEmpty();
			case V2xmlPackage.FT1CONTENT__FT122:
				return fT122 != null;
			case V2xmlPackage.FT1CONTENT__FT123:
				return fT123 != null;
			case V2xmlPackage.FT1CONTENT__FT124:
				return fT124 != null && !fT124.isEmpty();
			case V2xmlPackage.FT1CONTENT__FT125:
				return fT125 != null;
			case V2xmlPackage.FT1CONTENT__FT126:
				return fT126 != null && !fT126.isEmpty();
			case V2xmlPackage.FT1CONTENT__FT127:
				return fT127 != null;
			case V2xmlPackage.FT1CONTENT__FT128:
				return fT128 != null;
			case V2xmlPackage.FT1CONTENT__FT129:
				return fT129 != null;
			case V2xmlPackage.FT1CONTENT__FT130:
				return fT130 != null;
			case V2xmlPackage.FT1CONTENT__FT131:
				return fT131 != null && !fT131.isEmpty();
			case V2xmlPackage.FT1CONTENT__ANY:
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

} //FT1CONTENTImpl
