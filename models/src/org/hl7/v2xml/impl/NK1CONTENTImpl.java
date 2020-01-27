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

import org.hl7.v2xml.NK110CONTENT;
import org.hl7.v2xml.NK111CONTENT;
import org.hl7.v2xml.NK112CONTENT;
import org.hl7.v2xml.NK113CONTENT;
import org.hl7.v2xml.NK114CONTENT;
import org.hl7.v2xml.NK115CONTENT;
import org.hl7.v2xml.NK116CONTENT;
import org.hl7.v2xml.NK117CONTENT;
import org.hl7.v2xml.NK118CONTENT;
import org.hl7.v2xml.NK119CONTENT;
import org.hl7.v2xml.NK11CONTENT;
import org.hl7.v2xml.NK120CONTENT;
import org.hl7.v2xml.NK121CONTENT;
import org.hl7.v2xml.NK122CONTENT;
import org.hl7.v2xml.NK123CONTENT;
import org.hl7.v2xml.NK124CONTENT;
import org.hl7.v2xml.NK125CONTENT;
import org.hl7.v2xml.NK126CONTENT;
import org.hl7.v2xml.NK127CONTENT;
import org.hl7.v2xml.NK128CONTENT;
import org.hl7.v2xml.NK129CONTENT;
import org.hl7.v2xml.NK12CONTENT;
import org.hl7.v2xml.NK130CONTENT;
import org.hl7.v2xml.NK131CONTENT;
import org.hl7.v2xml.NK132CONTENT;
import org.hl7.v2xml.NK133CONTENT;
import org.hl7.v2xml.NK134CONTENT;
import org.hl7.v2xml.NK135CONTENT;
import org.hl7.v2xml.NK136CONTENT;
import org.hl7.v2xml.NK137CONTENT;
import org.hl7.v2xml.NK138CONTENT;
import org.hl7.v2xml.NK139CONTENT;
import org.hl7.v2xml.NK13CONTENT;
import org.hl7.v2xml.NK14CONTENT;
import org.hl7.v2xml.NK15CONTENT;
import org.hl7.v2xml.NK16CONTENT;
import org.hl7.v2xml.NK17CONTENT;
import org.hl7.v2xml.NK18CONTENT;
import org.hl7.v2xml.NK19CONTENT;
import org.hl7.v2xml.NK1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>NK1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK11 <em>NK11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK12 <em>NK12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK13 <em>NK13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK14 <em>NK14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK15 <em>NK15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK16 <em>NK16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK17 <em>NK17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK18 <em>NK18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK19 <em>NK19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK110 <em>NK110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK111 <em>NK111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK112 <em>NK112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK113 <em>NK113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK114 <em>NK114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK115 <em>NK115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK116 <em>NK116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK117 <em>NK117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK118 <em>NK118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK119 <em>NK119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK120 <em>NK120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK121 <em>NK121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK122 <em>NK122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK123 <em>NK123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK124 <em>NK124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK125 <em>NK125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK126 <em>NK126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK127 <em>NK127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK128 <em>NK128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK129 <em>NK129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK130 <em>NK130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK131 <em>NK131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK132 <em>NK132</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK133 <em>NK133</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK134 <em>NK134</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK135 <em>NK135</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK136 <em>NK136</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK137 <em>NK137</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK138 <em>NK138</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getNK139 <em>NK139</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.NK1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NK1CONTENTImpl extends EObjectImpl implements NK1CONTENT {
	/**
	 * The cached value of the '{@link #getNK11() <em>NK11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK11()
	 * @generated
	 * @ordered
	 */
	protected NK11CONTENT nK11;

	/**
	 * The cached value of the '{@link #getNK12() <em>NK12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK12()
	 * @generated
	 * @ordered
	 */
	protected EList<NK12CONTENT> nK12;

	/**
	 * The cached value of the '{@link #getNK13() <em>NK13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK13()
	 * @generated
	 * @ordered
	 */
	protected NK13CONTENT nK13;

	/**
	 * The cached value of the '{@link #getNK14() <em>NK14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK14()
	 * @generated
	 * @ordered
	 */
	protected EList<NK14CONTENT> nK14;

	/**
	 * The cached value of the '{@link #getNK15() <em>NK15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK15()
	 * @generated
	 * @ordered
	 */
	protected EList<NK15CONTENT> nK15;

	/**
	 * The cached value of the '{@link #getNK16() <em>NK16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK16()
	 * @generated
	 * @ordered
	 */
	protected EList<NK16CONTENT> nK16;

	/**
	 * The cached value of the '{@link #getNK17() <em>NK17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK17()
	 * @generated
	 * @ordered
	 */
	protected NK17CONTENT nK17;

	/**
	 * The cached value of the '{@link #getNK18() <em>NK18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK18()
	 * @generated
	 * @ordered
	 */
	protected NK18CONTENT nK18;

	/**
	 * The cached value of the '{@link #getNK19() <em>NK19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK19()
	 * @generated
	 * @ordered
	 */
	protected NK19CONTENT nK19;

	/**
	 * The cached value of the '{@link #getNK110() <em>NK110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK110()
	 * @generated
	 * @ordered
	 */
	protected NK110CONTENT nK110;

	/**
	 * The cached value of the '{@link #getNK111() <em>NK111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK111()
	 * @generated
	 * @ordered
	 */
	protected NK111CONTENT nK111;

	/**
	 * The cached value of the '{@link #getNK112() <em>NK112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK112()
	 * @generated
	 * @ordered
	 */
	protected NK112CONTENT nK112;

	/**
	 * The cached value of the '{@link #getNK113() <em>NK113</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK113()
	 * @generated
	 * @ordered
	 */
	protected EList<NK113CONTENT> nK113;

	/**
	 * The cached value of the '{@link #getNK114() <em>NK114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK114()
	 * @generated
	 * @ordered
	 */
	protected NK114CONTENT nK114;

	/**
	 * The cached value of the '{@link #getNK115() <em>NK115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK115()
	 * @generated
	 * @ordered
	 */
	protected NK115CONTENT nK115;

	/**
	 * The cached value of the '{@link #getNK116() <em>NK116</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK116()
	 * @generated
	 * @ordered
	 */
	protected NK116CONTENT nK116;

	/**
	 * The cached value of the '{@link #getNK117() <em>NK117</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK117()
	 * @generated
	 * @ordered
	 */
	protected EList<NK117CONTENT> nK117;

	/**
	 * The cached value of the '{@link #getNK118() <em>NK118</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK118()
	 * @generated
	 * @ordered
	 */
	protected EList<NK118CONTENT> nK118;

	/**
	 * The cached value of the '{@link #getNK119() <em>NK119</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK119()
	 * @generated
	 * @ordered
	 */
	protected EList<NK119CONTENT> nK119;

	/**
	 * The cached value of the '{@link #getNK120() <em>NK120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK120()
	 * @generated
	 * @ordered
	 */
	protected NK120CONTENT nK120;

	/**
	 * The cached value of the '{@link #getNK121() <em>NK121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK121()
	 * @generated
	 * @ordered
	 */
	protected NK121CONTENT nK121;

	/**
	 * The cached value of the '{@link #getNK122() <em>NK122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK122()
	 * @generated
	 * @ordered
	 */
	protected NK122CONTENT nK122;

	/**
	 * The cached value of the '{@link #getNK123() <em>NK123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK123()
	 * @generated
	 * @ordered
	 */
	protected NK123CONTENT nK123;

	/**
	 * The cached value of the '{@link #getNK124() <em>NK124</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK124()
	 * @generated
	 * @ordered
	 */
	protected NK124CONTENT nK124;

	/**
	 * The cached value of the '{@link #getNK125() <em>NK125</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK125()
	 * @generated
	 * @ordered
	 */
	protected NK125CONTENT nK125;

	/**
	 * The cached value of the '{@link #getNK126() <em>NK126</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK126()
	 * @generated
	 * @ordered
	 */
	protected EList<NK126CONTENT> nK126;

	/**
	 * The cached value of the '{@link #getNK127() <em>NK127</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK127()
	 * @generated
	 * @ordered
	 */
	protected NK127CONTENT nK127;

	/**
	 * The cached value of the '{@link #getNK128() <em>NK128</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK128()
	 * @generated
	 * @ordered
	 */
	protected EList<NK128CONTENT> nK128;

	/**
	 * The cached value of the '{@link #getNK129() <em>NK129</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK129()
	 * @generated
	 * @ordered
	 */
	protected EList<NK129CONTENT> nK129;

	/**
	 * The cached value of the '{@link #getNK130() <em>NK130</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK130()
	 * @generated
	 * @ordered
	 */
	protected EList<NK130CONTENT> nK130;

	/**
	 * The cached value of the '{@link #getNK131() <em>NK131</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK131()
	 * @generated
	 * @ordered
	 */
	protected EList<NK131CONTENT> nK131;

	/**
	 * The cached value of the '{@link #getNK132() <em>NK132</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK132()
	 * @generated
	 * @ordered
	 */
	protected EList<NK132CONTENT> nK132;

	/**
	 * The cached value of the '{@link #getNK133() <em>NK133</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK133()
	 * @generated
	 * @ordered
	 */
	protected EList<NK133CONTENT> nK133;

	/**
	 * The cached value of the '{@link #getNK134() <em>NK134</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK134()
	 * @generated
	 * @ordered
	 */
	protected NK134CONTENT nK134;

	/**
	 * The cached value of the '{@link #getNK135() <em>NK135</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK135()
	 * @generated
	 * @ordered
	 */
	protected EList<NK135CONTENT> nK135;

	/**
	 * The cached value of the '{@link #getNK136() <em>NK136</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK136()
	 * @generated
	 * @ordered
	 */
	protected NK136CONTENT nK136;

	/**
	 * The cached value of the '{@link #getNK137() <em>NK137</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK137()
	 * @generated
	 * @ordered
	 */
	protected NK137CONTENT nK137;

	/**
	 * The cached value of the '{@link #getNK138() <em>NK138</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK138()
	 * @generated
	 * @ordered
	 */
	protected NK138CONTENT nK138;

	/**
	 * The cached value of the '{@link #getNK139() <em>NK139</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNK139()
	 * @generated
	 * @ordered
	 */
	protected NK139CONTENT nK139;

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
	protected NK1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getNK1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK11CONTENT getNK11() {
		return nK11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK11(NK11CONTENT newNK11, NotificationChain msgs) {
		NK11CONTENT oldNK11 = nK11;
		nK11 = newNK11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK11, oldNK11, newNK11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK11(NK11CONTENT newNK11) {
		if (newNK11 != nK11) {
			NotificationChain msgs = null;
			if (nK11 != null)
				msgs = ((InternalEObject)nK11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK11, null, msgs);
			if (newNK11 != null)
				msgs = ((InternalEObject)newNK11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK11, null, msgs);
			msgs = basicSetNK11(newNK11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK11, newNK11, newNK11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK12CONTENT> getNK12() {
		if (nK12 == null) {
			nK12 = new EObjectContainmentEList<NK12CONTENT>(NK12CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK12);
		}
		return nK12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK13CONTENT getNK13() {
		return nK13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK13(NK13CONTENT newNK13, NotificationChain msgs) {
		NK13CONTENT oldNK13 = nK13;
		nK13 = newNK13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK13, oldNK13, newNK13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK13(NK13CONTENT newNK13) {
		if (newNK13 != nK13) {
			NotificationChain msgs = null;
			if (nK13 != null)
				msgs = ((InternalEObject)nK13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK13, null, msgs);
			if (newNK13 != null)
				msgs = ((InternalEObject)newNK13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK13, null, msgs);
			msgs = basicSetNK13(newNK13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK13, newNK13, newNK13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK14CONTENT> getNK14() {
		if (nK14 == null) {
			nK14 = new EObjectContainmentEList<NK14CONTENT>(NK14CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK14);
		}
		return nK14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK15CONTENT> getNK15() {
		if (nK15 == null) {
			nK15 = new EObjectContainmentEList<NK15CONTENT>(NK15CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK15);
		}
		return nK15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK16CONTENT> getNK16() {
		if (nK16 == null) {
			nK16 = new EObjectContainmentEList<NK16CONTENT>(NK16CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK16);
		}
		return nK16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK17CONTENT getNK17() {
		return nK17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK17(NK17CONTENT newNK17, NotificationChain msgs) {
		NK17CONTENT oldNK17 = nK17;
		nK17 = newNK17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK17, oldNK17, newNK17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK17(NK17CONTENT newNK17) {
		if (newNK17 != nK17) {
			NotificationChain msgs = null;
			if (nK17 != null)
				msgs = ((InternalEObject)nK17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK17, null, msgs);
			if (newNK17 != null)
				msgs = ((InternalEObject)newNK17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK17, null, msgs);
			msgs = basicSetNK17(newNK17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK17, newNK17, newNK17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK18CONTENT getNK18() {
		return nK18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK18(NK18CONTENT newNK18, NotificationChain msgs) {
		NK18CONTENT oldNK18 = nK18;
		nK18 = newNK18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK18, oldNK18, newNK18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK18(NK18CONTENT newNK18) {
		if (newNK18 != nK18) {
			NotificationChain msgs = null;
			if (nK18 != null)
				msgs = ((InternalEObject)nK18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK18, null, msgs);
			if (newNK18 != null)
				msgs = ((InternalEObject)newNK18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK18, null, msgs);
			msgs = basicSetNK18(newNK18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK18, newNK18, newNK18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK19CONTENT getNK19() {
		return nK19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK19(NK19CONTENT newNK19, NotificationChain msgs) {
		NK19CONTENT oldNK19 = nK19;
		nK19 = newNK19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK19, oldNK19, newNK19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK19(NK19CONTENT newNK19) {
		if (newNK19 != nK19) {
			NotificationChain msgs = null;
			if (nK19 != null)
				msgs = ((InternalEObject)nK19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK19, null, msgs);
			if (newNK19 != null)
				msgs = ((InternalEObject)newNK19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK19, null, msgs);
			msgs = basicSetNK19(newNK19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK19, newNK19, newNK19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK110CONTENT getNK110() {
		return nK110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK110(NK110CONTENT newNK110, NotificationChain msgs) {
		NK110CONTENT oldNK110 = nK110;
		nK110 = newNK110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK110, oldNK110, newNK110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK110(NK110CONTENT newNK110) {
		if (newNK110 != nK110) {
			NotificationChain msgs = null;
			if (nK110 != null)
				msgs = ((InternalEObject)nK110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK110, null, msgs);
			if (newNK110 != null)
				msgs = ((InternalEObject)newNK110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK110, null, msgs);
			msgs = basicSetNK110(newNK110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK110, newNK110, newNK110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK111CONTENT getNK111() {
		return nK111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK111(NK111CONTENT newNK111, NotificationChain msgs) {
		NK111CONTENT oldNK111 = nK111;
		nK111 = newNK111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK111, oldNK111, newNK111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK111(NK111CONTENT newNK111) {
		if (newNK111 != nK111) {
			NotificationChain msgs = null;
			if (nK111 != null)
				msgs = ((InternalEObject)nK111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK111, null, msgs);
			if (newNK111 != null)
				msgs = ((InternalEObject)newNK111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK111, null, msgs);
			msgs = basicSetNK111(newNK111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK111, newNK111, newNK111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK112CONTENT getNK112() {
		return nK112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK112(NK112CONTENT newNK112, NotificationChain msgs) {
		NK112CONTENT oldNK112 = nK112;
		nK112 = newNK112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK112, oldNK112, newNK112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK112(NK112CONTENT newNK112) {
		if (newNK112 != nK112) {
			NotificationChain msgs = null;
			if (nK112 != null)
				msgs = ((InternalEObject)nK112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK112, null, msgs);
			if (newNK112 != null)
				msgs = ((InternalEObject)newNK112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK112, null, msgs);
			msgs = basicSetNK112(newNK112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK112, newNK112, newNK112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK113CONTENT> getNK113() {
		if (nK113 == null) {
			nK113 = new EObjectContainmentEList<NK113CONTENT>(NK113CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK113);
		}
		return nK113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK114CONTENT getNK114() {
		return nK114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK114(NK114CONTENT newNK114, NotificationChain msgs) {
		NK114CONTENT oldNK114 = nK114;
		nK114 = newNK114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK114, oldNK114, newNK114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK114(NK114CONTENT newNK114) {
		if (newNK114 != nK114) {
			NotificationChain msgs = null;
			if (nK114 != null)
				msgs = ((InternalEObject)nK114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK114, null, msgs);
			if (newNK114 != null)
				msgs = ((InternalEObject)newNK114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK114, null, msgs);
			msgs = basicSetNK114(newNK114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK114, newNK114, newNK114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK115CONTENT getNK115() {
		return nK115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK115(NK115CONTENT newNK115, NotificationChain msgs) {
		NK115CONTENT oldNK115 = nK115;
		nK115 = newNK115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK115, oldNK115, newNK115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK115(NK115CONTENT newNK115) {
		if (newNK115 != nK115) {
			NotificationChain msgs = null;
			if (nK115 != null)
				msgs = ((InternalEObject)nK115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK115, null, msgs);
			if (newNK115 != null)
				msgs = ((InternalEObject)newNK115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK115, null, msgs);
			msgs = basicSetNK115(newNK115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK115, newNK115, newNK115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK116CONTENT getNK116() {
		return nK116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK116(NK116CONTENT newNK116, NotificationChain msgs) {
		NK116CONTENT oldNK116 = nK116;
		nK116 = newNK116;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK116, oldNK116, newNK116);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK116(NK116CONTENT newNK116) {
		if (newNK116 != nK116) {
			NotificationChain msgs = null;
			if (nK116 != null)
				msgs = ((InternalEObject)nK116).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK116, null, msgs);
			if (newNK116 != null)
				msgs = ((InternalEObject)newNK116).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK116, null, msgs);
			msgs = basicSetNK116(newNK116, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK116, newNK116, newNK116));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK117CONTENT> getNK117() {
		if (nK117 == null) {
			nK117 = new EObjectContainmentEList<NK117CONTENT>(NK117CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK117);
		}
		return nK117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK118CONTENT> getNK118() {
		if (nK118 == null) {
			nK118 = new EObjectContainmentEList<NK118CONTENT>(NK118CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK118);
		}
		return nK118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK119CONTENT> getNK119() {
		if (nK119 == null) {
			nK119 = new EObjectContainmentEList<NK119CONTENT>(NK119CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK119);
		}
		return nK119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK120CONTENT getNK120() {
		return nK120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK120(NK120CONTENT newNK120, NotificationChain msgs) {
		NK120CONTENT oldNK120 = nK120;
		nK120 = newNK120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK120, oldNK120, newNK120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK120(NK120CONTENT newNK120) {
		if (newNK120 != nK120) {
			NotificationChain msgs = null;
			if (nK120 != null)
				msgs = ((InternalEObject)nK120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK120, null, msgs);
			if (newNK120 != null)
				msgs = ((InternalEObject)newNK120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK120, null, msgs);
			msgs = basicSetNK120(newNK120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK120, newNK120, newNK120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK121CONTENT getNK121() {
		return nK121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK121(NK121CONTENT newNK121, NotificationChain msgs) {
		NK121CONTENT oldNK121 = nK121;
		nK121 = newNK121;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK121, oldNK121, newNK121);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK121(NK121CONTENT newNK121) {
		if (newNK121 != nK121) {
			NotificationChain msgs = null;
			if (nK121 != null)
				msgs = ((InternalEObject)nK121).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK121, null, msgs);
			if (newNK121 != null)
				msgs = ((InternalEObject)newNK121).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK121, null, msgs);
			msgs = basicSetNK121(newNK121, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK121, newNK121, newNK121));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK122CONTENT getNK122() {
		return nK122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK122(NK122CONTENT newNK122, NotificationChain msgs) {
		NK122CONTENT oldNK122 = nK122;
		nK122 = newNK122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK122, oldNK122, newNK122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK122(NK122CONTENT newNK122) {
		if (newNK122 != nK122) {
			NotificationChain msgs = null;
			if (nK122 != null)
				msgs = ((InternalEObject)nK122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK122, null, msgs);
			if (newNK122 != null)
				msgs = ((InternalEObject)newNK122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK122, null, msgs);
			msgs = basicSetNK122(newNK122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK122, newNK122, newNK122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK123CONTENT getNK123() {
		return nK123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK123(NK123CONTENT newNK123, NotificationChain msgs) {
		NK123CONTENT oldNK123 = nK123;
		nK123 = newNK123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK123, oldNK123, newNK123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK123(NK123CONTENT newNK123) {
		if (newNK123 != nK123) {
			NotificationChain msgs = null;
			if (nK123 != null)
				msgs = ((InternalEObject)nK123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK123, null, msgs);
			if (newNK123 != null)
				msgs = ((InternalEObject)newNK123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK123, null, msgs);
			msgs = basicSetNK123(newNK123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK123, newNK123, newNK123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK124CONTENT getNK124() {
		return nK124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK124(NK124CONTENT newNK124, NotificationChain msgs) {
		NK124CONTENT oldNK124 = nK124;
		nK124 = newNK124;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK124, oldNK124, newNK124);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK124(NK124CONTENT newNK124) {
		if (newNK124 != nK124) {
			NotificationChain msgs = null;
			if (nK124 != null)
				msgs = ((InternalEObject)nK124).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK124, null, msgs);
			if (newNK124 != null)
				msgs = ((InternalEObject)newNK124).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK124, null, msgs);
			msgs = basicSetNK124(newNK124, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK124, newNK124, newNK124));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK125CONTENT getNK125() {
		return nK125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK125(NK125CONTENT newNK125, NotificationChain msgs) {
		NK125CONTENT oldNK125 = nK125;
		nK125 = newNK125;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK125, oldNK125, newNK125);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK125(NK125CONTENT newNK125) {
		if (newNK125 != nK125) {
			NotificationChain msgs = null;
			if (nK125 != null)
				msgs = ((InternalEObject)nK125).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK125, null, msgs);
			if (newNK125 != null)
				msgs = ((InternalEObject)newNK125).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK125, null, msgs);
			msgs = basicSetNK125(newNK125, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK125, newNK125, newNK125));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK126CONTENT> getNK126() {
		if (nK126 == null) {
			nK126 = new EObjectContainmentEList<NK126CONTENT>(NK126CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK126);
		}
		return nK126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK127CONTENT getNK127() {
		return nK127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK127(NK127CONTENT newNK127, NotificationChain msgs) {
		NK127CONTENT oldNK127 = nK127;
		nK127 = newNK127;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK127, oldNK127, newNK127);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK127(NK127CONTENT newNK127) {
		if (newNK127 != nK127) {
			NotificationChain msgs = null;
			if (nK127 != null)
				msgs = ((InternalEObject)nK127).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK127, null, msgs);
			if (newNK127 != null)
				msgs = ((InternalEObject)newNK127).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK127, null, msgs);
			msgs = basicSetNK127(newNK127, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK127, newNK127, newNK127));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK128CONTENT> getNK128() {
		if (nK128 == null) {
			nK128 = new EObjectContainmentEList<NK128CONTENT>(NK128CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK128);
		}
		return nK128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK129CONTENT> getNK129() {
		if (nK129 == null) {
			nK129 = new EObjectContainmentEList<NK129CONTENT>(NK129CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK129);
		}
		return nK129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK130CONTENT> getNK130() {
		if (nK130 == null) {
			nK130 = new EObjectContainmentEList<NK130CONTENT>(NK130CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK130);
		}
		return nK130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK131CONTENT> getNK131() {
		if (nK131 == null) {
			nK131 = new EObjectContainmentEList<NK131CONTENT>(NK131CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK131);
		}
		return nK131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK132CONTENT> getNK132() {
		if (nK132 == null) {
			nK132 = new EObjectContainmentEList<NK132CONTENT>(NK132CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK132);
		}
		return nK132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK133CONTENT> getNK133() {
		if (nK133 == null) {
			nK133 = new EObjectContainmentEList<NK133CONTENT>(NK133CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK133);
		}
		return nK133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK134CONTENT getNK134() {
		return nK134;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK134(NK134CONTENT newNK134, NotificationChain msgs) {
		NK134CONTENT oldNK134 = nK134;
		nK134 = newNK134;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK134, oldNK134, newNK134);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK134(NK134CONTENT newNK134) {
		if (newNK134 != nK134) {
			NotificationChain msgs = null;
			if (nK134 != null)
				msgs = ((InternalEObject)nK134).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK134, null, msgs);
			if (newNK134 != null)
				msgs = ((InternalEObject)newNK134).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK134, null, msgs);
			msgs = basicSetNK134(newNK134, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK134, newNK134, newNK134));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NK135CONTENT> getNK135() {
		if (nK135 == null) {
			nK135 = new EObjectContainmentEList<NK135CONTENT>(NK135CONTENT.class, this, V2xmlPackage.NK1CONTENT__NK135);
		}
		return nK135;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK136CONTENT getNK136() {
		return nK136;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK136(NK136CONTENT newNK136, NotificationChain msgs) {
		NK136CONTENT oldNK136 = nK136;
		nK136 = newNK136;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK136, oldNK136, newNK136);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK136(NK136CONTENT newNK136) {
		if (newNK136 != nK136) {
			NotificationChain msgs = null;
			if (nK136 != null)
				msgs = ((InternalEObject)nK136).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK136, null, msgs);
			if (newNK136 != null)
				msgs = ((InternalEObject)newNK136).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK136, null, msgs);
			msgs = basicSetNK136(newNK136, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK136, newNK136, newNK136));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK137CONTENT getNK137() {
		return nK137;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK137(NK137CONTENT newNK137, NotificationChain msgs) {
		NK137CONTENT oldNK137 = nK137;
		nK137 = newNK137;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK137, oldNK137, newNK137);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK137(NK137CONTENT newNK137) {
		if (newNK137 != nK137) {
			NotificationChain msgs = null;
			if (nK137 != null)
				msgs = ((InternalEObject)nK137).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK137, null, msgs);
			if (newNK137 != null)
				msgs = ((InternalEObject)newNK137).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK137, null, msgs);
			msgs = basicSetNK137(newNK137, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK137, newNK137, newNK137));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK138CONTENT getNK138() {
		return nK138;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK138(NK138CONTENT newNK138, NotificationChain msgs) {
		NK138CONTENT oldNK138 = nK138;
		nK138 = newNK138;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK138, oldNK138, newNK138);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK138(NK138CONTENT newNK138) {
		if (newNK138 != nK138) {
			NotificationChain msgs = null;
			if (nK138 != null)
				msgs = ((InternalEObject)nK138).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK138, null, msgs);
			if (newNK138 != null)
				msgs = ((InternalEObject)newNK138).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK138, null, msgs);
			msgs = basicSetNK138(newNK138, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK138, newNK138, newNK138));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NK139CONTENT getNK139() {
		return nK139;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNK139(NK139CONTENT newNK139, NotificationChain msgs) {
		NK139CONTENT oldNK139 = nK139;
		nK139 = newNK139;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK139, oldNK139, newNK139);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNK139(NK139CONTENT newNK139) {
		if (newNK139 != nK139) {
			NotificationChain msgs = null;
			if (nK139 != null)
				msgs = ((InternalEObject)nK139).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK139, null, msgs);
			if (newNK139 != null)
				msgs = ((InternalEObject)newNK139).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.NK1CONTENT__NK139, null, msgs);
			msgs = basicSetNK139(newNK139, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.NK1CONTENT__NK139, newNK139, newNK139));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.NK1CONTENT__ANY);
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
			case V2xmlPackage.NK1CONTENT__NK11:
				return basicSetNK11(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK12:
				return ((InternalEList<?>)getNK12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK13:
				return basicSetNK13(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK14:
				return ((InternalEList<?>)getNK14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK15:
				return ((InternalEList<?>)getNK15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK16:
				return ((InternalEList<?>)getNK16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK17:
				return basicSetNK17(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK18:
				return basicSetNK18(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK19:
				return basicSetNK19(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK110:
				return basicSetNK110(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK111:
				return basicSetNK111(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK112:
				return basicSetNK112(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK113:
				return ((InternalEList<?>)getNK113()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK114:
				return basicSetNK114(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK115:
				return basicSetNK115(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK116:
				return basicSetNK116(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK117:
				return ((InternalEList<?>)getNK117()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK118:
				return ((InternalEList<?>)getNK118()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK119:
				return ((InternalEList<?>)getNK119()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK120:
				return basicSetNK120(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK121:
				return basicSetNK121(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK122:
				return basicSetNK122(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK123:
				return basicSetNK123(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK124:
				return basicSetNK124(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK125:
				return basicSetNK125(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK126:
				return ((InternalEList<?>)getNK126()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK127:
				return basicSetNK127(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK128:
				return ((InternalEList<?>)getNK128()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK129:
				return ((InternalEList<?>)getNK129()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK130:
				return ((InternalEList<?>)getNK130()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK131:
				return ((InternalEList<?>)getNK131()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK132:
				return ((InternalEList<?>)getNK132()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK133:
				return ((InternalEList<?>)getNK133()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK134:
				return basicSetNK134(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK135:
				return ((InternalEList<?>)getNK135()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.NK1CONTENT__NK136:
				return basicSetNK136(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK137:
				return basicSetNK137(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK138:
				return basicSetNK138(null, msgs);
			case V2xmlPackage.NK1CONTENT__NK139:
				return basicSetNK139(null, msgs);
			case V2xmlPackage.NK1CONTENT__ANY:
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
			case V2xmlPackage.NK1CONTENT__NK11:
				return getNK11();
			case V2xmlPackage.NK1CONTENT__NK12:
				return getNK12();
			case V2xmlPackage.NK1CONTENT__NK13:
				return getNK13();
			case V2xmlPackage.NK1CONTENT__NK14:
				return getNK14();
			case V2xmlPackage.NK1CONTENT__NK15:
				return getNK15();
			case V2xmlPackage.NK1CONTENT__NK16:
				return getNK16();
			case V2xmlPackage.NK1CONTENT__NK17:
				return getNK17();
			case V2xmlPackage.NK1CONTENT__NK18:
				return getNK18();
			case V2xmlPackage.NK1CONTENT__NK19:
				return getNK19();
			case V2xmlPackage.NK1CONTENT__NK110:
				return getNK110();
			case V2xmlPackage.NK1CONTENT__NK111:
				return getNK111();
			case V2xmlPackage.NK1CONTENT__NK112:
				return getNK112();
			case V2xmlPackage.NK1CONTENT__NK113:
				return getNK113();
			case V2xmlPackage.NK1CONTENT__NK114:
				return getNK114();
			case V2xmlPackage.NK1CONTENT__NK115:
				return getNK115();
			case V2xmlPackage.NK1CONTENT__NK116:
				return getNK116();
			case V2xmlPackage.NK1CONTENT__NK117:
				return getNK117();
			case V2xmlPackage.NK1CONTENT__NK118:
				return getNK118();
			case V2xmlPackage.NK1CONTENT__NK119:
				return getNK119();
			case V2xmlPackage.NK1CONTENT__NK120:
				return getNK120();
			case V2xmlPackage.NK1CONTENT__NK121:
				return getNK121();
			case V2xmlPackage.NK1CONTENT__NK122:
				return getNK122();
			case V2xmlPackage.NK1CONTENT__NK123:
				return getNK123();
			case V2xmlPackage.NK1CONTENT__NK124:
				return getNK124();
			case V2xmlPackage.NK1CONTENT__NK125:
				return getNK125();
			case V2xmlPackage.NK1CONTENT__NK126:
				return getNK126();
			case V2xmlPackage.NK1CONTENT__NK127:
				return getNK127();
			case V2xmlPackage.NK1CONTENT__NK128:
				return getNK128();
			case V2xmlPackage.NK1CONTENT__NK129:
				return getNK129();
			case V2xmlPackage.NK1CONTENT__NK130:
				return getNK130();
			case V2xmlPackage.NK1CONTENT__NK131:
				return getNK131();
			case V2xmlPackage.NK1CONTENT__NK132:
				return getNK132();
			case V2xmlPackage.NK1CONTENT__NK133:
				return getNK133();
			case V2xmlPackage.NK1CONTENT__NK134:
				return getNK134();
			case V2xmlPackage.NK1CONTENT__NK135:
				return getNK135();
			case V2xmlPackage.NK1CONTENT__NK136:
				return getNK136();
			case V2xmlPackage.NK1CONTENT__NK137:
				return getNK137();
			case V2xmlPackage.NK1CONTENT__NK138:
				return getNK138();
			case V2xmlPackage.NK1CONTENT__NK139:
				return getNK139();
			case V2xmlPackage.NK1CONTENT__ANY:
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
			case V2xmlPackage.NK1CONTENT__NK11:
				setNK11((NK11CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK12:
				getNK12().clear();
				getNK12().addAll((Collection<? extends NK12CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK13:
				setNK13((NK13CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK14:
				getNK14().clear();
				getNK14().addAll((Collection<? extends NK14CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK15:
				getNK15().clear();
				getNK15().addAll((Collection<? extends NK15CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK16:
				getNK16().clear();
				getNK16().addAll((Collection<? extends NK16CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK17:
				setNK17((NK17CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK18:
				setNK18((NK18CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK19:
				setNK19((NK19CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK110:
				setNK110((NK110CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK111:
				setNK111((NK111CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK112:
				setNK112((NK112CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK113:
				getNK113().clear();
				getNK113().addAll((Collection<? extends NK113CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK114:
				setNK114((NK114CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK115:
				setNK115((NK115CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK116:
				setNK116((NK116CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK117:
				getNK117().clear();
				getNK117().addAll((Collection<? extends NK117CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK118:
				getNK118().clear();
				getNK118().addAll((Collection<? extends NK118CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK119:
				getNK119().clear();
				getNK119().addAll((Collection<? extends NK119CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK120:
				setNK120((NK120CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK121:
				setNK121((NK121CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK122:
				setNK122((NK122CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK123:
				setNK123((NK123CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK124:
				setNK124((NK124CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK125:
				setNK125((NK125CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK126:
				getNK126().clear();
				getNK126().addAll((Collection<? extends NK126CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK127:
				setNK127((NK127CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK128:
				getNK128().clear();
				getNK128().addAll((Collection<? extends NK128CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK129:
				getNK129().clear();
				getNK129().addAll((Collection<? extends NK129CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK130:
				getNK130().clear();
				getNK130().addAll((Collection<? extends NK130CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK131:
				getNK131().clear();
				getNK131().addAll((Collection<? extends NK131CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK132:
				getNK132().clear();
				getNK132().addAll((Collection<? extends NK132CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK133:
				getNK133().clear();
				getNK133().addAll((Collection<? extends NK133CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK134:
				setNK134((NK134CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK135:
				getNK135().clear();
				getNK135().addAll((Collection<? extends NK135CONTENT>)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK136:
				setNK136((NK136CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK137:
				setNK137((NK137CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK138:
				setNK138((NK138CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__NK139:
				setNK139((NK139CONTENT)newValue);
				return;
			case V2xmlPackage.NK1CONTENT__ANY:
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
			case V2xmlPackage.NK1CONTENT__NK11:
				setNK11((NK11CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK12:
				getNK12().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK13:
				setNK13((NK13CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK14:
				getNK14().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK15:
				getNK15().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK16:
				getNK16().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK17:
				setNK17((NK17CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK18:
				setNK18((NK18CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK19:
				setNK19((NK19CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK110:
				setNK110((NK110CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK111:
				setNK111((NK111CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK112:
				setNK112((NK112CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK113:
				getNK113().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK114:
				setNK114((NK114CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK115:
				setNK115((NK115CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK116:
				setNK116((NK116CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK117:
				getNK117().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK118:
				getNK118().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK119:
				getNK119().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK120:
				setNK120((NK120CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK121:
				setNK121((NK121CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK122:
				setNK122((NK122CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK123:
				setNK123((NK123CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK124:
				setNK124((NK124CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK125:
				setNK125((NK125CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK126:
				getNK126().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK127:
				setNK127((NK127CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK128:
				getNK128().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK129:
				getNK129().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK130:
				getNK130().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK131:
				getNK131().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK132:
				getNK132().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK133:
				getNK133().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK134:
				setNK134((NK134CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK135:
				getNK135().clear();
				return;
			case V2xmlPackage.NK1CONTENT__NK136:
				setNK136((NK136CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK137:
				setNK137((NK137CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK138:
				setNK138((NK138CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__NK139:
				setNK139((NK139CONTENT)null);
				return;
			case V2xmlPackage.NK1CONTENT__ANY:
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
			case V2xmlPackage.NK1CONTENT__NK11:
				return nK11 != null;
			case V2xmlPackage.NK1CONTENT__NK12:
				return nK12 != null && !nK12.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK13:
				return nK13 != null;
			case V2xmlPackage.NK1CONTENT__NK14:
				return nK14 != null && !nK14.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK15:
				return nK15 != null && !nK15.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK16:
				return nK16 != null && !nK16.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK17:
				return nK17 != null;
			case V2xmlPackage.NK1CONTENT__NK18:
				return nK18 != null;
			case V2xmlPackage.NK1CONTENT__NK19:
				return nK19 != null;
			case V2xmlPackage.NK1CONTENT__NK110:
				return nK110 != null;
			case V2xmlPackage.NK1CONTENT__NK111:
				return nK111 != null;
			case V2xmlPackage.NK1CONTENT__NK112:
				return nK112 != null;
			case V2xmlPackage.NK1CONTENT__NK113:
				return nK113 != null && !nK113.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK114:
				return nK114 != null;
			case V2xmlPackage.NK1CONTENT__NK115:
				return nK115 != null;
			case V2xmlPackage.NK1CONTENT__NK116:
				return nK116 != null;
			case V2xmlPackage.NK1CONTENT__NK117:
				return nK117 != null && !nK117.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK118:
				return nK118 != null && !nK118.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK119:
				return nK119 != null && !nK119.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK120:
				return nK120 != null;
			case V2xmlPackage.NK1CONTENT__NK121:
				return nK121 != null;
			case V2xmlPackage.NK1CONTENT__NK122:
				return nK122 != null;
			case V2xmlPackage.NK1CONTENT__NK123:
				return nK123 != null;
			case V2xmlPackage.NK1CONTENT__NK124:
				return nK124 != null;
			case V2xmlPackage.NK1CONTENT__NK125:
				return nK125 != null;
			case V2xmlPackage.NK1CONTENT__NK126:
				return nK126 != null && !nK126.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK127:
				return nK127 != null;
			case V2xmlPackage.NK1CONTENT__NK128:
				return nK128 != null && !nK128.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK129:
				return nK129 != null && !nK129.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK130:
				return nK130 != null && !nK130.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK131:
				return nK131 != null && !nK131.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK132:
				return nK132 != null && !nK132.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK133:
				return nK133 != null && !nK133.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK134:
				return nK134 != null;
			case V2xmlPackage.NK1CONTENT__NK135:
				return nK135 != null && !nK135.isEmpty();
			case V2xmlPackage.NK1CONTENT__NK136:
				return nK136 != null;
			case V2xmlPackage.NK1CONTENT__NK137:
				return nK137 != null;
			case V2xmlPackage.NK1CONTENT__NK138:
				return nK138 != null;
			case V2xmlPackage.NK1CONTENT__NK139:
				return nK139 != null;
			case V2xmlPackage.NK1CONTENT__ANY:
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

} //NK1CONTENTImpl
