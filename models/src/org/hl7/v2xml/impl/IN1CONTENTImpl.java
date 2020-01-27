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

import org.hl7.v2xml.IN110CONTENT;
import org.hl7.v2xml.IN111CONTENT;
import org.hl7.v2xml.IN112CONTENT;
import org.hl7.v2xml.IN113CONTENT;
import org.hl7.v2xml.IN114CONTENT;
import org.hl7.v2xml.IN115CONTENT;
import org.hl7.v2xml.IN116CONTENT;
import org.hl7.v2xml.IN117CONTENT;
import org.hl7.v2xml.IN118CONTENT;
import org.hl7.v2xml.IN119CONTENT;
import org.hl7.v2xml.IN11CONTENT;
import org.hl7.v2xml.IN120CONTENT;
import org.hl7.v2xml.IN121CONTENT;
import org.hl7.v2xml.IN122CONTENT;
import org.hl7.v2xml.IN123CONTENT;
import org.hl7.v2xml.IN124CONTENT;
import org.hl7.v2xml.IN125CONTENT;
import org.hl7.v2xml.IN126CONTENT;
import org.hl7.v2xml.IN127CONTENT;
import org.hl7.v2xml.IN128CONTENT;
import org.hl7.v2xml.IN129CONTENT;
import org.hl7.v2xml.IN12CONTENT;
import org.hl7.v2xml.IN130CONTENT;
import org.hl7.v2xml.IN131CONTENT;
import org.hl7.v2xml.IN132CONTENT;
import org.hl7.v2xml.IN133CONTENT;
import org.hl7.v2xml.IN134CONTENT;
import org.hl7.v2xml.IN135CONTENT;
import org.hl7.v2xml.IN136CONTENT;
import org.hl7.v2xml.IN137CONTENT;
import org.hl7.v2xml.IN138CONTENT;
import org.hl7.v2xml.IN139CONTENT;
import org.hl7.v2xml.IN13CONTENT;
import org.hl7.v2xml.IN140CONTENT;
import org.hl7.v2xml.IN141CONTENT;
import org.hl7.v2xml.IN142CONTENT;
import org.hl7.v2xml.IN143CONTENT;
import org.hl7.v2xml.IN144CONTENT;
import org.hl7.v2xml.IN145CONTENT;
import org.hl7.v2xml.IN146CONTENT;
import org.hl7.v2xml.IN147CONTENT;
import org.hl7.v2xml.IN148CONTENT;
import org.hl7.v2xml.IN149CONTENT;
import org.hl7.v2xml.IN14CONTENT;
import org.hl7.v2xml.IN150CONTENT;
import org.hl7.v2xml.IN151CONTENT;
import org.hl7.v2xml.IN152CONTENT;
import org.hl7.v2xml.IN153CONTENT;
import org.hl7.v2xml.IN15CONTENT;
import org.hl7.v2xml.IN16CONTENT;
import org.hl7.v2xml.IN17CONTENT;
import org.hl7.v2xml.IN18CONTENT;
import org.hl7.v2xml.IN19CONTENT;
import org.hl7.v2xml.IN1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IN1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN11 <em>IN11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN12 <em>IN12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN13 <em>IN13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN14 <em>IN14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN15 <em>IN15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN16 <em>IN16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN17 <em>IN17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN18 <em>IN18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN19 <em>IN19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN110 <em>IN110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN111 <em>IN111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN112 <em>IN112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN113 <em>IN113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN114 <em>IN114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN115 <em>IN115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN116 <em>IN116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN117 <em>IN117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN118 <em>IN118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN119 <em>IN119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN120 <em>IN120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN121 <em>IN121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN122 <em>IN122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN123 <em>IN123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN124 <em>IN124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN125 <em>IN125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN126 <em>IN126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN127 <em>IN127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN128 <em>IN128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN129 <em>IN129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN130 <em>IN130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN131 <em>IN131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN132 <em>IN132</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN133 <em>IN133</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN134 <em>IN134</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN135 <em>IN135</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN136 <em>IN136</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN137 <em>IN137</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN138 <em>IN138</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN139 <em>IN139</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN140 <em>IN140</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN141 <em>IN141</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN142 <em>IN142</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN143 <em>IN143</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN144 <em>IN144</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN145 <em>IN145</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN146 <em>IN146</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN147 <em>IN147</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN148 <em>IN148</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN149 <em>IN149</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN150 <em>IN150</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN151 <em>IN151</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN152 <em>IN152</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getIN153 <em>IN153</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IN1CONTENTImpl extends EObjectImpl implements IN1CONTENT {
	/**
	 * The cached value of the '{@link #getIN11() <em>IN11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN11()
	 * @generated
	 * @ordered
	 */
	protected IN11CONTENT iN11;

	/**
	 * The cached value of the '{@link #getIN12() <em>IN12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN12()
	 * @generated
	 * @ordered
	 */
	protected IN12CONTENT iN12;

	/**
	 * The cached value of the '{@link #getIN13() <em>IN13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN13()
	 * @generated
	 * @ordered
	 */
	protected EList<IN13CONTENT> iN13;

	/**
	 * The cached value of the '{@link #getIN14() <em>IN14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN14()
	 * @generated
	 * @ordered
	 */
	protected EList<IN14CONTENT> iN14;

	/**
	 * The cached value of the '{@link #getIN15() <em>IN15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN15()
	 * @generated
	 * @ordered
	 */
	protected EList<IN15CONTENT> iN15;

	/**
	 * The cached value of the '{@link #getIN16() <em>IN16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN16()
	 * @generated
	 * @ordered
	 */
	protected EList<IN16CONTENT> iN16;

	/**
	 * The cached value of the '{@link #getIN17() <em>IN17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN17()
	 * @generated
	 * @ordered
	 */
	protected EList<IN17CONTENT> iN17;

	/**
	 * The cached value of the '{@link #getIN18() <em>IN18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN18()
	 * @generated
	 * @ordered
	 */
	protected IN18CONTENT iN18;

	/**
	 * The cached value of the '{@link #getIN19() <em>IN19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN19()
	 * @generated
	 * @ordered
	 */
	protected EList<IN19CONTENT> iN19;

	/**
	 * The cached value of the '{@link #getIN110() <em>IN110</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN110()
	 * @generated
	 * @ordered
	 */
	protected EList<IN110CONTENT> iN110;

	/**
	 * The cached value of the '{@link #getIN111() <em>IN111</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN111()
	 * @generated
	 * @ordered
	 */
	protected EList<IN111CONTENT> iN111;

	/**
	 * The cached value of the '{@link #getIN112() <em>IN112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN112()
	 * @generated
	 * @ordered
	 */
	protected IN112CONTENT iN112;

	/**
	 * The cached value of the '{@link #getIN113() <em>IN113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN113()
	 * @generated
	 * @ordered
	 */
	protected IN113CONTENT iN113;

	/**
	 * The cached value of the '{@link #getIN114() <em>IN114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN114()
	 * @generated
	 * @ordered
	 */
	protected IN114CONTENT iN114;

	/**
	 * The cached value of the '{@link #getIN115() <em>IN115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN115()
	 * @generated
	 * @ordered
	 */
	protected IN115CONTENT iN115;

	/**
	 * The cached value of the '{@link #getIN116() <em>IN116</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN116()
	 * @generated
	 * @ordered
	 */
	protected EList<IN116CONTENT> iN116;

	/**
	 * The cached value of the '{@link #getIN117() <em>IN117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN117()
	 * @generated
	 * @ordered
	 */
	protected IN117CONTENT iN117;

	/**
	 * The cached value of the '{@link #getIN118() <em>IN118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN118()
	 * @generated
	 * @ordered
	 */
	protected IN118CONTENT iN118;

	/**
	 * The cached value of the '{@link #getIN119() <em>IN119</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN119()
	 * @generated
	 * @ordered
	 */
	protected EList<IN119CONTENT> iN119;

	/**
	 * The cached value of the '{@link #getIN120() <em>IN120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN120()
	 * @generated
	 * @ordered
	 */
	protected IN120CONTENT iN120;

	/**
	 * The cached value of the '{@link #getIN121() <em>IN121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN121()
	 * @generated
	 * @ordered
	 */
	protected IN121CONTENT iN121;

	/**
	 * The cached value of the '{@link #getIN122() <em>IN122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN122()
	 * @generated
	 * @ordered
	 */
	protected IN122CONTENT iN122;

	/**
	 * The cached value of the '{@link #getIN123() <em>IN123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN123()
	 * @generated
	 * @ordered
	 */
	protected IN123CONTENT iN123;

	/**
	 * The cached value of the '{@link #getIN124() <em>IN124</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN124()
	 * @generated
	 * @ordered
	 */
	protected IN124CONTENT iN124;

	/**
	 * The cached value of the '{@link #getIN125() <em>IN125</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN125()
	 * @generated
	 * @ordered
	 */
	protected IN125CONTENT iN125;

	/**
	 * The cached value of the '{@link #getIN126() <em>IN126</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN126()
	 * @generated
	 * @ordered
	 */
	protected IN126CONTENT iN126;

	/**
	 * The cached value of the '{@link #getIN127() <em>IN127</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN127()
	 * @generated
	 * @ordered
	 */
	protected IN127CONTENT iN127;

	/**
	 * The cached value of the '{@link #getIN128() <em>IN128</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN128()
	 * @generated
	 * @ordered
	 */
	protected IN128CONTENT iN128;

	/**
	 * The cached value of the '{@link #getIN129() <em>IN129</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN129()
	 * @generated
	 * @ordered
	 */
	protected IN129CONTENT iN129;

	/**
	 * The cached value of the '{@link #getIN130() <em>IN130</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN130()
	 * @generated
	 * @ordered
	 */
	protected EList<IN130CONTENT> iN130;

	/**
	 * The cached value of the '{@link #getIN131() <em>IN131</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN131()
	 * @generated
	 * @ordered
	 */
	protected IN131CONTENT iN131;

	/**
	 * The cached value of the '{@link #getIN132() <em>IN132</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN132()
	 * @generated
	 * @ordered
	 */
	protected IN132CONTENT iN132;

	/**
	 * The cached value of the '{@link #getIN133() <em>IN133</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN133()
	 * @generated
	 * @ordered
	 */
	protected IN133CONTENT iN133;

	/**
	 * The cached value of the '{@link #getIN134() <em>IN134</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN134()
	 * @generated
	 * @ordered
	 */
	protected IN134CONTENT iN134;

	/**
	 * The cached value of the '{@link #getIN135() <em>IN135</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN135()
	 * @generated
	 * @ordered
	 */
	protected IN135CONTENT iN135;

	/**
	 * The cached value of the '{@link #getIN136() <em>IN136</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN136()
	 * @generated
	 * @ordered
	 */
	protected IN136CONTENT iN136;

	/**
	 * The cached value of the '{@link #getIN137() <em>IN137</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN137()
	 * @generated
	 * @ordered
	 */
	protected IN137CONTENT iN137;

	/**
	 * The cached value of the '{@link #getIN138() <em>IN138</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN138()
	 * @generated
	 * @ordered
	 */
	protected IN138CONTENT iN138;

	/**
	 * The cached value of the '{@link #getIN139() <em>IN139</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN139()
	 * @generated
	 * @ordered
	 */
	protected IN139CONTENT iN139;

	/**
	 * The cached value of the '{@link #getIN140() <em>IN140</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN140()
	 * @generated
	 * @ordered
	 */
	protected IN140CONTENT iN140;

	/**
	 * The cached value of the '{@link #getIN141() <em>IN141</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN141()
	 * @generated
	 * @ordered
	 */
	protected IN141CONTENT iN141;

	/**
	 * The cached value of the '{@link #getIN142() <em>IN142</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN142()
	 * @generated
	 * @ordered
	 */
	protected IN142CONTENT iN142;

	/**
	 * The cached value of the '{@link #getIN143() <em>IN143</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN143()
	 * @generated
	 * @ordered
	 */
	protected IN143CONTENT iN143;

	/**
	 * The cached value of the '{@link #getIN144() <em>IN144</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN144()
	 * @generated
	 * @ordered
	 */
	protected EList<IN144CONTENT> iN144;

	/**
	 * The cached value of the '{@link #getIN145() <em>IN145</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN145()
	 * @generated
	 * @ordered
	 */
	protected IN145CONTENT iN145;

	/**
	 * The cached value of the '{@link #getIN146() <em>IN146</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN146()
	 * @generated
	 * @ordered
	 */
	protected IN146CONTENT iN146;

	/**
	 * The cached value of the '{@link #getIN147() <em>IN147</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN147()
	 * @generated
	 * @ordered
	 */
	protected IN147CONTENT iN147;

	/**
	 * The cached value of the '{@link #getIN148() <em>IN148</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN148()
	 * @generated
	 * @ordered
	 */
	protected IN148CONTENT iN148;

	/**
	 * The cached value of the '{@link #getIN149() <em>IN149</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN149()
	 * @generated
	 * @ordered
	 */
	protected EList<IN149CONTENT> iN149;

	/**
	 * The cached value of the '{@link #getIN150() <em>IN150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN150()
	 * @generated
	 * @ordered
	 */
	protected IN150CONTENT iN150;

	/**
	 * The cached value of the '{@link #getIN151() <em>IN151</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN151()
	 * @generated
	 * @ordered
	 */
	protected IN151CONTENT iN151;

	/**
	 * The cached value of the '{@link #getIN152() <em>IN152</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN152()
	 * @generated
	 * @ordered
	 */
	protected IN152CONTENT iN152;

	/**
	 * The cached value of the '{@link #getIN153() <em>IN153</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN153()
	 * @generated
	 * @ordered
	 */
	protected IN153CONTENT iN153;

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
	protected IN1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIN1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN11CONTENT getIN11() {
		return iN11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN11(IN11CONTENT newIN11, NotificationChain msgs) {
		IN11CONTENT oldIN11 = iN11;
		iN11 = newIN11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN11, oldIN11, newIN11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN11(IN11CONTENT newIN11) {
		if (newIN11 != iN11) {
			NotificationChain msgs = null;
			if (iN11 != null)
				msgs = ((InternalEObject)iN11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN11, null, msgs);
			if (newIN11 != null)
				msgs = ((InternalEObject)newIN11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN11, null, msgs);
			msgs = basicSetIN11(newIN11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN11, newIN11, newIN11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN12CONTENT getIN12() {
		return iN12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN12(IN12CONTENT newIN12, NotificationChain msgs) {
		IN12CONTENT oldIN12 = iN12;
		iN12 = newIN12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN12, oldIN12, newIN12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN12(IN12CONTENT newIN12) {
		if (newIN12 != iN12) {
			NotificationChain msgs = null;
			if (iN12 != null)
				msgs = ((InternalEObject)iN12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN12, null, msgs);
			if (newIN12 != null)
				msgs = ((InternalEObject)newIN12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN12, null, msgs);
			msgs = basicSetIN12(newIN12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN12, newIN12, newIN12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN13CONTENT> getIN13() {
		if (iN13 == null) {
			iN13 = new EObjectContainmentEList<IN13CONTENT>(IN13CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN13);
		}
		return iN13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN14CONTENT> getIN14() {
		if (iN14 == null) {
			iN14 = new EObjectContainmentEList<IN14CONTENT>(IN14CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN14);
		}
		return iN14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN15CONTENT> getIN15() {
		if (iN15 == null) {
			iN15 = new EObjectContainmentEList<IN15CONTENT>(IN15CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN15);
		}
		return iN15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN16CONTENT> getIN16() {
		if (iN16 == null) {
			iN16 = new EObjectContainmentEList<IN16CONTENT>(IN16CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN16);
		}
		return iN16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN17CONTENT> getIN17() {
		if (iN17 == null) {
			iN17 = new EObjectContainmentEList<IN17CONTENT>(IN17CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN17);
		}
		return iN17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN18CONTENT getIN18() {
		return iN18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN18(IN18CONTENT newIN18, NotificationChain msgs) {
		IN18CONTENT oldIN18 = iN18;
		iN18 = newIN18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN18, oldIN18, newIN18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN18(IN18CONTENT newIN18) {
		if (newIN18 != iN18) {
			NotificationChain msgs = null;
			if (iN18 != null)
				msgs = ((InternalEObject)iN18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN18, null, msgs);
			if (newIN18 != null)
				msgs = ((InternalEObject)newIN18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN18, null, msgs);
			msgs = basicSetIN18(newIN18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN18, newIN18, newIN18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN19CONTENT> getIN19() {
		if (iN19 == null) {
			iN19 = new EObjectContainmentEList<IN19CONTENT>(IN19CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN19);
		}
		return iN19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN110CONTENT> getIN110() {
		if (iN110 == null) {
			iN110 = new EObjectContainmentEList<IN110CONTENT>(IN110CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN110);
		}
		return iN110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN111CONTENT> getIN111() {
		if (iN111 == null) {
			iN111 = new EObjectContainmentEList<IN111CONTENT>(IN111CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN111);
		}
		return iN111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN112CONTENT getIN112() {
		return iN112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN112(IN112CONTENT newIN112, NotificationChain msgs) {
		IN112CONTENT oldIN112 = iN112;
		iN112 = newIN112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN112, oldIN112, newIN112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN112(IN112CONTENT newIN112) {
		if (newIN112 != iN112) {
			NotificationChain msgs = null;
			if (iN112 != null)
				msgs = ((InternalEObject)iN112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN112, null, msgs);
			if (newIN112 != null)
				msgs = ((InternalEObject)newIN112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN112, null, msgs);
			msgs = basicSetIN112(newIN112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN112, newIN112, newIN112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN113CONTENT getIN113() {
		return iN113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN113(IN113CONTENT newIN113, NotificationChain msgs) {
		IN113CONTENT oldIN113 = iN113;
		iN113 = newIN113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN113, oldIN113, newIN113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN113(IN113CONTENT newIN113) {
		if (newIN113 != iN113) {
			NotificationChain msgs = null;
			if (iN113 != null)
				msgs = ((InternalEObject)iN113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN113, null, msgs);
			if (newIN113 != null)
				msgs = ((InternalEObject)newIN113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN113, null, msgs);
			msgs = basicSetIN113(newIN113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN113, newIN113, newIN113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN114CONTENT getIN114() {
		return iN114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN114(IN114CONTENT newIN114, NotificationChain msgs) {
		IN114CONTENT oldIN114 = iN114;
		iN114 = newIN114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN114, oldIN114, newIN114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN114(IN114CONTENT newIN114) {
		if (newIN114 != iN114) {
			NotificationChain msgs = null;
			if (iN114 != null)
				msgs = ((InternalEObject)iN114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN114, null, msgs);
			if (newIN114 != null)
				msgs = ((InternalEObject)newIN114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN114, null, msgs);
			msgs = basicSetIN114(newIN114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN114, newIN114, newIN114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN115CONTENT getIN115() {
		return iN115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN115(IN115CONTENT newIN115, NotificationChain msgs) {
		IN115CONTENT oldIN115 = iN115;
		iN115 = newIN115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN115, oldIN115, newIN115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN115(IN115CONTENT newIN115) {
		if (newIN115 != iN115) {
			NotificationChain msgs = null;
			if (iN115 != null)
				msgs = ((InternalEObject)iN115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN115, null, msgs);
			if (newIN115 != null)
				msgs = ((InternalEObject)newIN115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN115, null, msgs);
			msgs = basicSetIN115(newIN115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN115, newIN115, newIN115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN116CONTENT> getIN116() {
		if (iN116 == null) {
			iN116 = new EObjectContainmentEList<IN116CONTENT>(IN116CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN116);
		}
		return iN116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN117CONTENT getIN117() {
		return iN117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN117(IN117CONTENT newIN117, NotificationChain msgs) {
		IN117CONTENT oldIN117 = iN117;
		iN117 = newIN117;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN117, oldIN117, newIN117);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN117(IN117CONTENT newIN117) {
		if (newIN117 != iN117) {
			NotificationChain msgs = null;
			if (iN117 != null)
				msgs = ((InternalEObject)iN117).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN117, null, msgs);
			if (newIN117 != null)
				msgs = ((InternalEObject)newIN117).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN117, null, msgs);
			msgs = basicSetIN117(newIN117, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN117, newIN117, newIN117));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN118CONTENT getIN118() {
		return iN118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN118(IN118CONTENT newIN118, NotificationChain msgs) {
		IN118CONTENT oldIN118 = iN118;
		iN118 = newIN118;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN118, oldIN118, newIN118);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN118(IN118CONTENT newIN118) {
		if (newIN118 != iN118) {
			NotificationChain msgs = null;
			if (iN118 != null)
				msgs = ((InternalEObject)iN118).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN118, null, msgs);
			if (newIN118 != null)
				msgs = ((InternalEObject)newIN118).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN118, null, msgs);
			msgs = basicSetIN118(newIN118, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN118, newIN118, newIN118));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN119CONTENT> getIN119() {
		if (iN119 == null) {
			iN119 = new EObjectContainmentEList<IN119CONTENT>(IN119CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN119);
		}
		return iN119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN120CONTENT getIN120() {
		return iN120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN120(IN120CONTENT newIN120, NotificationChain msgs) {
		IN120CONTENT oldIN120 = iN120;
		iN120 = newIN120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN120, oldIN120, newIN120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN120(IN120CONTENT newIN120) {
		if (newIN120 != iN120) {
			NotificationChain msgs = null;
			if (iN120 != null)
				msgs = ((InternalEObject)iN120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN120, null, msgs);
			if (newIN120 != null)
				msgs = ((InternalEObject)newIN120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN120, null, msgs);
			msgs = basicSetIN120(newIN120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN120, newIN120, newIN120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN121CONTENT getIN121() {
		return iN121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN121(IN121CONTENT newIN121, NotificationChain msgs) {
		IN121CONTENT oldIN121 = iN121;
		iN121 = newIN121;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN121, oldIN121, newIN121);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN121(IN121CONTENT newIN121) {
		if (newIN121 != iN121) {
			NotificationChain msgs = null;
			if (iN121 != null)
				msgs = ((InternalEObject)iN121).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN121, null, msgs);
			if (newIN121 != null)
				msgs = ((InternalEObject)newIN121).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN121, null, msgs);
			msgs = basicSetIN121(newIN121, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN121, newIN121, newIN121));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN122CONTENT getIN122() {
		return iN122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN122(IN122CONTENT newIN122, NotificationChain msgs) {
		IN122CONTENT oldIN122 = iN122;
		iN122 = newIN122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN122, oldIN122, newIN122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN122(IN122CONTENT newIN122) {
		if (newIN122 != iN122) {
			NotificationChain msgs = null;
			if (iN122 != null)
				msgs = ((InternalEObject)iN122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN122, null, msgs);
			if (newIN122 != null)
				msgs = ((InternalEObject)newIN122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN122, null, msgs);
			msgs = basicSetIN122(newIN122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN122, newIN122, newIN122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN123CONTENT getIN123() {
		return iN123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN123(IN123CONTENT newIN123, NotificationChain msgs) {
		IN123CONTENT oldIN123 = iN123;
		iN123 = newIN123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN123, oldIN123, newIN123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN123(IN123CONTENT newIN123) {
		if (newIN123 != iN123) {
			NotificationChain msgs = null;
			if (iN123 != null)
				msgs = ((InternalEObject)iN123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN123, null, msgs);
			if (newIN123 != null)
				msgs = ((InternalEObject)newIN123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN123, null, msgs);
			msgs = basicSetIN123(newIN123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN123, newIN123, newIN123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN124CONTENT getIN124() {
		return iN124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN124(IN124CONTENT newIN124, NotificationChain msgs) {
		IN124CONTENT oldIN124 = iN124;
		iN124 = newIN124;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN124, oldIN124, newIN124);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN124(IN124CONTENT newIN124) {
		if (newIN124 != iN124) {
			NotificationChain msgs = null;
			if (iN124 != null)
				msgs = ((InternalEObject)iN124).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN124, null, msgs);
			if (newIN124 != null)
				msgs = ((InternalEObject)newIN124).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN124, null, msgs);
			msgs = basicSetIN124(newIN124, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN124, newIN124, newIN124));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN125CONTENT getIN125() {
		return iN125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN125(IN125CONTENT newIN125, NotificationChain msgs) {
		IN125CONTENT oldIN125 = iN125;
		iN125 = newIN125;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN125, oldIN125, newIN125);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN125(IN125CONTENT newIN125) {
		if (newIN125 != iN125) {
			NotificationChain msgs = null;
			if (iN125 != null)
				msgs = ((InternalEObject)iN125).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN125, null, msgs);
			if (newIN125 != null)
				msgs = ((InternalEObject)newIN125).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN125, null, msgs);
			msgs = basicSetIN125(newIN125, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN125, newIN125, newIN125));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN126CONTENT getIN126() {
		return iN126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN126(IN126CONTENT newIN126, NotificationChain msgs) {
		IN126CONTENT oldIN126 = iN126;
		iN126 = newIN126;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN126, oldIN126, newIN126);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN126(IN126CONTENT newIN126) {
		if (newIN126 != iN126) {
			NotificationChain msgs = null;
			if (iN126 != null)
				msgs = ((InternalEObject)iN126).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN126, null, msgs);
			if (newIN126 != null)
				msgs = ((InternalEObject)newIN126).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN126, null, msgs);
			msgs = basicSetIN126(newIN126, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN126, newIN126, newIN126));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN127CONTENT getIN127() {
		return iN127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN127(IN127CONTENT newIN127, NotificationChain msgs) {
		IN127CONTENT oldIN127 = iN127;
		iN127 = newIN127;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN127, oldIN127, newIN127);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN127(IN127CONTENT newIN127) {
		if (newIN127 != iN127) {
			NotificationChain msgs = null;
			if (iN127 != null)
				msgs = ((InternalEObject)iN127).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN127, null, msgs);
			if (newIN127 != null)
				msgs = ((InternalEObject)newIN127).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN127, null, msgs);
			msgs = basicSetIN127(newIN127, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN127, newIN127, newIN127));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN128CONTENT getIN128() {
		return iN128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN128(IN128CONTENT newIN128, NotificationChain msgs) {
		IN128CONTENT oldIN128 = iN128;
		iN128 = newIN128;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN128, oldIN128, newIN128);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN128(IN128CONTENT newIN128) {
		if (newIN128 != iN128) {
			NotificationChain msgs = null;
			if (iN128 != null)
				msgs = ((InternalEObject)iN128).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN128, null, msgs);
			if (newIN128 != null)
				msgs = ((InternalEObject)newIN128).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN128, null, msgs);
			msgs = basicSetIN128(newIN128, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN128, newIN128, newIN128));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN129CONTENT getIN129() {
		return iN129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN129(IN129CONTENT newIN129, NotificationChain msgs) {
		IN129CONTENT oldIN129 = iN129;
		iN129 = newIN129;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN129, oldIN129, newIN129);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN129(IN129CONTENT newIN129) {
		if (newIN129 != iN129) {
			NotificationChain msgs = null;
			if (iN129 != null)
				msgs = ((InternalEObject)iN129).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN129, null, msgs);
			if (newIN129 != null)
				msgs = ((InternalEObject)newIN129).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN129, null, msgs);
			msgs = basicSetIN129(newIN129, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN129, newIN129, newIN129));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN130CONTENT> getIN130() {
		if (iN130 == null) {
			iN130 = new EObjectContainmentEList<IN130CONTENT>(IN130CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN130);
		}
		return iN130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN131CONTENT getIN131() {
		return iN131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN131(IN131CONTENT newIN131, NotificationChain msgs) {
		IN131CONTENT oldIN131 = iN131;
		iN131 = newIN131;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN131, oldIN131, newIN131);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN131(IN131CONTENT newIN131) {
		if (newIN131 != iN131) {
			NotificationChain msgs = null;
			if (iN131 != null)
				msgs = ((InternalEObject)iN131).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN131, null, msgs);
			if (newIN131 != null)
				msgs = ((InternalEObject)newIN131).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN131, null, msgs);
			msgs = basicSetIN131(newIN131, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN131, newIN131, newIN131));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN132CONTENT getIN132() {
		return iN132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN132(IN132CONTENT newIN132, NotificationChain msgs) {
		IN132CONTENT oldIN132 = iN132;
		iN132 = newIN132;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN132, oldIN132, newIN132);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN132(IN132CONTENT newIN132) {
		if (newIN132 != iN132) {
			NotificationChain msgs = null;
			if (iN132 != null)
				msgs = ((InternalEObject)iN132).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN132, null, msgs);
			if (newIN132 != null)
				msgs = ((InternalEObject)newIN132).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN132, null, msgs);
			msgs = basicSetIN132(newIN132, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN132, newIN132, newIN132));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN133CONTENT getIN133() {
		return iN133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN133(IN133CONTENT newIN133, NotificationChain msgs) {
		IN133CONTENT oldIN133 = iN133;
		iN133 = newIN133;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN133, oldIN133, newIN133);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN133(IN133CONTENT newIN133) {
		if (newIN133 != iN133) {
			NotificationChain msgs = null;
			if (iN133 != null)
				msgs = ((InternalEObject)iN133).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN133, null, msgs);
			if (newIN133 != null)
				msgs = ((InternalEObject)newIN133).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN133, null, msgs);
			msgs = basicSetIN133(newIN133, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN133, newIN133, newIN133));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN134CONTENT getIN134() {
		return iN134;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN134(IN134CONTENT newIN134, NotificationChain msgs) {
		IN134CONTENT oldIN134 = iN134;
		iN134 = newIN134;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN134, oldIN134, newIN134);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN134(IN134CONTENT newIN134) {
		if (newIN134 != iN134) {
			NotificationChain msgs = null;
			if (iN134 != null)
				msgs = ((InternalEObject)iN134).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN134, null, msgs);
			if (newIN134 != null)
				msgs = ((InternalEObject)newIN134).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN134, null, msgs);
			msgs = basicSetIN134(newIN134, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN134, newIN134, newIN134));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN135CONTENT getIN135() {
		return iN135;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN135(IN135CONTENT newIN135, NotificationChain msgs) {
		IN135CONTENT oldIN135 = iN135;
		iN135 = newIN135;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN135, oldIN135, newIN135);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN135(IN135CONTENT newIN135) {
		if (newIN135 != iN135) {
			NotificationChain msgs = null;
			if (iN135 != null)
				msgs = ((InternalEObject)iN135).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN135, null, msgs);
			if (newIN135 != null)
				msgs = ((InternalEObject)newIN135).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN135, null, msgs);
			msgs = basicSetIN135(newIN135, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN135, newIN135, newIN135));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN136CONTENT getIN136() {
		return iN136;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN136(IN136CONTENT newIN136, NotificationChain msgs) {
		IN136CONTENT oldIN136 = iN136;
		iN136 = newIN136;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN136, oldIN136, newIN136);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN136(IN136CONTENT newIN136) {
		if (newIN136 != iN136) {
			NotificationChain msgs = null;
			if (iN136 != null)
				msgs = ((InternalEObject)iN136).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN136, null, msgs);
			if (newIN136 != null)
				msgs = ((InternalEObject)newIN136).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN136, null, msgs);
			msgs = basicSetIN136(newIN136, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN136, newIN136, newIN136));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN137CONTENT getIN137() {
		return iN137;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN137(IN137CONTENT newIN137, NotificationChain msgs) {
		IN137CONTENT oldIN137 = iN137;
		iN137 = newIN137;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN137, oldIN137, newIN137);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN137(IN137CONTENT newIN137) {
		if (newIN137 != iN137) {
			NotificationChain msgs = null;
			if (iN137 != null)
				msgs = ((InternalEObject)iN137).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN137, null, msgs);
			if (newIN137 != null)
				msgs = ((InternalEObject)newIN137).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN137, null, msgs);
			msgs = basicSetIN137(newIN137, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN137, newIN137, newIN137));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN138CONTENT getIN138() {
		return iN138;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN138(IN138CONTENT newIN138, NotificationChain msgs) {
		IN138CONTENT oldIN138 = iN138;
		iN138 = newIN138;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN138, oldIN138, newIN138);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN138(IN138CONTENT newIN138) {
		if (newIN138 != iN138) {
			NotificationChain msgs = null;
			if (iN138 != null)
				msgs = ((InternalEObject)iN138).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN138, null, msgs);
			if (newIN138 != null)
				msgs = ((InternalEObject)newIN138).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN138, null, msgs);
			msgs = basicSetIN138(newIN138, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN138, newIN138, newIN138));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN139CONTENT getIN139() {
		return iN139;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN139(IN139CONTENT newIN139, NotificationChain msgs) {
		IN139CONTENT oldIN139 = iN139;
		iN139 = newIN139;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN139, oldIN139, newIN139);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN139(IN139CONTENT newIN139) {
		if (newIN139 != iN139) {
			NotificationChain msgs = null;
			if (iN139 != null)
				msgs = ((InternalEObject)iN139).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN139, null, msgs);
			if (newIN139 != null)
				msgs = ((InternalEObject)newIN139).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN139, null, msgs);
			msgs = basicSetIN139(newIN139, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN139, newIN139, newIN139));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN140CONTENT getIN140() {
		return iN140;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN140(IN140CONTENT newIN140, NotificationChain msgs) {
		IN140CONTENT oldIN140 = iN140;
		iN140 = newIN140;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN140, oldIN140, newIN140);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN140(IN140CONTENT newIN140) {
		if (newIN140 != iN140) {
			NotificationChain msgs = null;
			if (iN140 != null)
				msgs = ((InternalEObject)iN140).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN140, null, msgs);
			if (newIN140 != null)
				msgs = ((InternalEObject)newIN140).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN140, null, msgs);
			msgs = basicSetIN140(newIN140, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN140, newIN140, newIN140));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN141CONTENT getIN141() {
		return iN141;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN141(IN141CONTENT newIN141, NotificationChain msgs) {
		IN141CONTENT oldIN141 = iN141;
		iN141 = newIN141;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN141, oldIN141, newIN141);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN141(IN141CONTENT newIN141) {
		if (newIN141 != iN141) {
			NotificationChain msgs = null;
			if (iN141 != null)
				msgs = ((InternalEObject)iN141).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN141, null, msgs);
			if (newIN141 != null)
				msgs = ((InternalEObject)newIN141).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN141, null, msgs);
			msgs = basicSetIN141(newIN141, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN141, newIN141, newIN141));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN142CONTENT getIN142() {
		return iN142;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN142(IN142CONTENT newIN142, NotificationChain msgs) {
		IN142CONTENT oldIN142 = iN142;
		iN142 = newIN142;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN142, oldIN142, newIN142);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN142(IN142CONTENT newIN142) {
		if (newIN142 != iN142) {
			NotificationChain msgs = null;
			if (iN142 != null)
				msgs = ((InternalEObject)iN142).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN142, null, msgs);
			if (newIN142 != null)
				msgs = ((InternalEObject)newIN142).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN142, null, msgs);
			msgs = basicSetIN142(newIN142, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN142, newIN142, newIN142));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN143CONTENT getIN143() {
		return iN143;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN143(IN143CONTENT newIN143, NotificationChain msgs) {
		IN143CONTENT oldIN143 = iN143;
		iN143 = newIN143;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN143, oldIN143, newIN143);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN143(IN143CONTENT newIN143) {
		if (newIN143 != iN143) {
			NotificationChain msgs = null;
			if (iN143 != null)
				msgs = ((InternalEObject)iN143).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN143, null, msgs);
			if (newIN143 != null)
				msgs = ((InternalEObject)newIN143).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN143, null, msgs);
			msgs = basicSetIN143(newIN143, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN143, newIN143, newIN143));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN144CONTENT> getIN144() {
		if (iN144 == null) {
			iN144 = new EObjectContainmentEList<IN144CONTENT>(IN144CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN144);
		}
		return iN144;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN145CONTENT getIN145() {
		return iN145;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN145(IN145CONTENT newIN145, NotificationChain msgs) {
		IN145CONTENT oldIN145 = iN145;
		iN145 = newIN145;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN145, oldIN145, newIN145);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN145(IN145CONTENT newIN145) {
		if (newIN145 != iN145) {
			NotificationChain msgs = null;
			if (iN145 != null)
				msgs = ((InternalEObject)iN145).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN145, null, msgs);
			if (newIN145 != null)
				msgs = ((InternalEObject)newIN145).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN145, null, msgs);
			msgs = basicSetIN145(newIN145, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN145, newIN145, newIN145));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN146CONTENT getIN146() {
		return iN146;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN146(IN146CONTENT newIN146, NotificationChain msgs) {
		IN146CONTENT oldIN146 = iN146;
		iN146 = newIN146;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN146, oldIN146, newIN146);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN146(IN146CONTENT newIN146) {
		if (newIN146 != iN146) {
			NotificationChain msgs = null;
			if (iN146 != null)
				msgs = ((InternalEObject)iN146).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN146, null, msgs);
			if (newIN146 != null)
				msgs = ((InternalEObject)newIN146).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN146, null, msgs);
			msgs = basicSetIN146(newIN146, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN146, newIN146, newIN146));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN147CONTENT getIN147() {
		return iN147;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN147(IN147CONTENT newIN147, NotificationChain msgs) {
		IN147CONTENT oldIN147 = iN147;
		iN147 = newIN147;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN147, oldIN147, newIN147);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN147(IN147CONTENT newIN147) {
		if (newIN147 != iN147) {
			NotificationChain msgs = null;
			if (iN147 != null)
				msgs = ((InternalEObject)iN147).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN147, null, msgs);
			if (newIN147 != null)
				msgs = ((InternalEObject)newIN147).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN147, null, msgs);
			msgs = basicSetIN147(newIN147, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN147, newIN147, newIN147));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN148CONTENT getIN148() {
		return iN148;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN148(IN148CONTENT newIN148, NotificationChain msgs) {
		IN148CONTENT oldIN148 = iN148;
		iN148 = newIN148;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN148, oldIN148, newIN148);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN148(IN148CONTENT newIN148) {
		if (newIN148 != iN148) {
			NotificationChain msgs = null;
			if (iN148 != null)
				msgs = ((InternalEObject)iN148).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN148, null, msgs);
			if (newIN148 != null)
				msgs = ((InternalEObject)newIN148).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN148, null, msgs);
			msgs = basicSetIN148(newIN148, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN148, newIN148, newIN148));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN149CONTENT> getIN149() {
		if (iN149 == null) {
			iN149 = new EObjectContainmentEList<IN149CONTENT>(IN149CONTENT.class, this, V2xmlPackage.IN1CONTENT__IN149);
		}
		return iN149;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN150CONTENT getIN150() {
		return iN150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN150(IN150CONTENT newIN150, NotificationChain msgs) {
		IN150CONTENT oldIN150 = iN150;
		iN150 = newIN150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN150, oldIN150, newIN150);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN150(IN150CONTENT newIN150) {
		if (newIN150 != iN150) {
			NotificationChain msgs = null;
			if (iN150 != null)
				msgs = ((InternalEObject)iN150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN150, null, msgs);
			if (newIN150 != null)
				msgs = ((InternalEObject)newIN150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN150, null, msgs);
			msgs = basicSetIN150(newIN150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN150, newIN150, newIN150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN151CONTENT getIN151() {
		return iN151;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN151(IN151CONTENT newIN151, NotificationChain msgs) {
		IN151CONTENT oldIN151 = iN151;
		iN151 = newIN151;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN151, oldIN151, newIN151);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN151(IN151CONTENT newIN151) {
		if (newIN151 != iN151) {
			NotificationChain msgs = null;
			if (iN151 != null)
				msgs = ((InternalEObject)iN151).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN151, null, msgs);
			if (newIN151 != null)
				msgs = ((InternalEObject)newIN151).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN151, null, msgs);
			msgs = basicSetIN151(newIN151, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN151, newIN151, newIN151));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN152CONTENT getIN152() {
		return iN152;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN152(IN152CONTENT newIN152, NotificationChain msgs) {
		IN152CONTENT oldIN152 = iN152;
		iN152 = newIN152;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN152, oldIN152, newIN152);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN152(IN152CONTENT newIN152) {
		if (newIN152 != iN152) {
			NotificationChain msgs = null;
			if (iN152 != null)
				msgs = ((InternalEObject)iN152).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN152, null, msgs);
			if (newIN152 != null)
				msgs = ((InternalEObject)newIN152).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN152, null, msgs);
			msgs = basicSetIN152(newIN152, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN152, newIN152, newIN152));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN153CONTENT getIN153() {
		return iN153;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN153(IN153CONTENT newIN153, NotificationChain msgs) {
		IN153CONTENT oldIN153 = iN153;
		iN153 = newIN153;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN153, oldIN153, newIN153);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN153(IN153CONTENT newIN153) {
		if (newIN153 != iN153) {
			NotificationChain msgs = null;
			if (iN153 != null)
				msgs = ((InternalEObject)iN153).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN153, null, msgs);
			if (newIN153 != null)
				msgs = ((InternalEObject)newIN153).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN1CONTENT__IN153, null, msgs);
			msgs = basicSetIN153(newIN153, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN1CONTENT__IN153, newIN153, newIN153));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IN1CONTENT__ANY);
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
			case V2xmlPackage.IN1CONTENT__IN11:
				return basicSetIN11(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN12:
				return basicSetIN12(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN13:
				return ((InternalEList<?>)getIN13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN14:
				return ((InternalEList<?>)getIN14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN15:
				return ((InternalEList<?>)getIN15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN16:
				return ((InternalEList<?>)getIN16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN17:
				return ((InternalEList<?>)getIN17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN18:
				return basicSetIN18(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN19:
				return ((InternalEList<?>)getIN19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN110:
				return ((InternalEList<?>)getIN110()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN111:
				return ((InternalEList<?>)getIN111()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN112:
				return basicSetIN112(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN113:
				return basicSetIN113(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN114:
				return basicSetIN114(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN115:
				return basicSetIN115(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN116:
				return ((InternalEList<?>)getIN116()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN117:
				return basicSetIN117(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN118:
				return basicSetIN118(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN119:
				return ((InternalEList<?>)getIN119()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN120:
				return basicSetIN120(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN121:
				return basicSetIN121(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN122:
				return basicSetIN122(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN123:
				return basicSetIN123(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN124:
				return basicSetIN124(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN125:
				return basicSetIN125(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN126:
				return basicSetIN126(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN127:
				return basicSetIN127(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN128:
				return basicSetIN128(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN129:
				return basicSetIN129(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN130:
				return ((InternalEList<?>)getIN130()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN131:
				return basicSetIN131(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN132:
				return basicSetIN132(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN133:
				return basicSetIN133(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN134:
				return basicSetIN134(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN135:
				return basicSetIN135(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN136:
				return basicSetIN136(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN137:
				return basicSetIN137(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN138:
				return basicSetIN138(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN139:
				return basicSetIN139(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN140:
				return basicSetIN140(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN141:
				return basicSetIN141(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN142:
				return basicSetIN142(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN143:
				return basicSetIN143(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN144:
				return ((InternalEList<?>)getIN144()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN145:
				return basicSetIN145(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN146:
				return basicSetIN146(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN147:
				return basicSetIN147(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN148:
				return basicSetIN148(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN149:
				return ((InternalEList<?>)getIN149()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN1CONTENT__IN150:
				return basicSetIN150(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN151:
				return basicSetIN151(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN152:
				return basicSetIN152(null, msgs);
			case V2xmlPackage.IN1CONTENT__IN153:
				return basicSetIN153(null, msgs);
			case V2xmlPackage.IN1CONTENT__ANY:
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
			case V2xmlPackage.IN1CONTENT__IN11:
				return getIN11();
			case V2xmlPackage.IN1CONTENT__IN12:
				return getIN12();
			case V2xmlPackage.IN1CONTENT__IN13:
				return getIN13();
			case V2xmlPackage.IN1CONTENT__IN14:
				return getIN14();
			case V2xmlPackage.IN1CONTENT__IN15:
				return getIN15();
			case V2xmlPackage.IN1CONTENT__IN16:
				return getIN16();
			case V2xmlPackage.IN1CONTENT__IN17:
				return getIN17();
			case V2xmlPackage.IN1CONTENT__IN18:
				return getIN18();
			case V2xmlPackage.IN1CONTENT__IN19:
				return getIN19();
			case V2xmlPackage.IN1CONTENT__IN110:
				return getIN110();
			case V2xmlPackage.IN1CONTENT__IN111:
				return getIN111();
			case V2xmlPackage.IN1CONTENT__IN112:
				return getIN112();
			case V2xmlPackage.IN1CONTENT__IN113:
				return getIN113();
			case V2xmlPackage.IN1CONTENT__IN114:
				return getIN114();
			case V2xmlPackage.IN1CONTENT__IN115:
				return getIN115();
			case V2xmlPackage.IN1CONTENT__IN116:
				return getIN116();
			case V2xmlPackage.IN1CONTENT__IN117:
				return getIN117();
			case V2xmlPackage.IN1CONTENT__IN118:
				return getIN118();
			case V2xmlPackage.IN1CONTENT__IN119:
				return getIN119();
			case V2xmlPackage.IN1CONTENT__IN120:
				return getIN120();
			case V2xmlPackage.IN1CONTENT__IN121:
				return getIN121();
			case V2xmlPackage.IN1CONTENT__IN122:
				return getIN122();
			case V2xmlPackage.IN1CONTENT__IN123:
				return getIN123();
			case V2xmlPackage.IN1CONTENT__IN124:
				return getIN124();
			case V2xmlPackage.IN1CONTENT__IN125:
				return getIN125();
			case V2xmlPackage.IN1CONTENT__IN126:
				return getIN126();
			case V2xmlPackage.IN1CONTENT__IN127:
				return getIN127();
			case V2xmlPackage.IN1CONTENT__IN128:
				return getIN128();
			case V2xmlPackage.IN1CONTENT__IN129:
				return getIN129();
			case V2xmlPackage.IN1CONTENT__IN130:
				return getIN130();
			case V2xmlPackage.IN1CONTENT__IN131:
				return getIN131();
			case V2xmlPackage.IN1CONTENT__IN132:
				return getIN132();
			case V2xmlPackage.IN1CONTENT__IN133:
				return getIN133();
			case V2xmlPackage.IN1CONTENT__IN134:
				return getIN134();
			case V2xmlPackage.IN1CONTENT__IN135:
				return getIN135();
			case V2xmlPackage.IN1CONTENT__IN136:
				return getIN136();
			case V2xmlPackage.IN1CONTENT__IN137:
				return getIN137();
			case V2xmlPackage.IN1CONTENT__IN138:
				return getIN138();
			case V2xmlPackage.IN1CONTENT__IN139:
				return getIN139();
			case V2xmlPackage.IN1CONTENT__IN140:
				return getIN140();
			case V2xmlPackage.IN1CONTENT__IN141:
				return getIN141();
			case V2xmlPackage.IN1CONTENT__IN142:
				return getIN142();
			case V2xmlPackage.IN1CONTENT__IN143:
				return getIN143();
			case V2xmlPackage.IN1CONTENT__IN144:
				return getIN144();
			case V2xmlPackage.IN1CONTENT__IN145:
				return getIN145();
			case V2xmlPackage.IN1CONTENT__IN146:
				return getIN146();
			case V2xmlPackage.IN1CONTENT__IN147:
				return getIN147();
			case V2xmlPackage.IN1CONTENT__IN148:
				return getIN148();
			case V2xmlPackage.IN1CONTENT__IN149:
				return getIN149();
			case V2xmlPackage.IN1CONTENT__IN150:
				return getIN150();
			case V2xmlPackage.IN1CONTENT__IN151:
				return getIN151();
			case V2xmlPackage.IN1CONTENT__IN152:
				return getIN152();
			case V2xmlPackage.IN1CONTENT__IN153:
				return getIN153();
			case V2xmlPackage.IN1CONTENT__ANY:
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
			case V2xmlPackage.IN1CONTENT__IN11:
				setIN11((IN11CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN12:
				setIN12((IN12CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN13:
				getIN13().clear();
				getIN13().addAll((Collection<? extends IN13CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN14:
				getIN14().clear();
				getIN14().addAll((Collection<? extends IN14CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN15:
				getIN15().clear();
				getIN15().addAll((Collection<? extends IN15CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN16:
				getIN16().clear();
				getIN16().addAll((Collection<? extends IN16CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN17:
				getIN17().clear();
				getIN17().addAll((Collection<? extends IN17CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN18:
				setIN18((IN18CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN19:
				getIN19().clear();
				getIN19().addAll((Collection<? extends IN19CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN110:
				getIN110().clear();
				getIN110().addAll((Collection<? extends IN110CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN111:
				getIN111().clear();
				getIN111().addAll((Collection<? extends IN111CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN112:
				setIN112((IN112CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN113:
				setIN113((IN113CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN114:
				setIN114((IN114CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN115:
				setIN115((IN115CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN116:
				getIN116().clear();
				getIN116().addAll((Collection<? extends IN116CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN117:
				setIN117((IN117CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN118:
				setIN118((IN118CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN119:
				getIN119().clear();
				getIN119().addAll((Collection<? extends IN119CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN120:
				setIN120((IN120CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN121:
				setIN121((IN121CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN122:
				setIN122((IN122CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN123:
				setIN123((IN123CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN124:
				setIN124((IN124CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN125:
				setIN125((IN125CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN126:
				setIN126((IN126CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN127:
				setIN127((IN127CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN128:
				setIN128((IN128CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN129:
				setIN129((IN129CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN130:
				getIN130().clear();
				getIN130().addAll((Collection<? extends IN130CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN131:
				setIN131((IN131CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN132:
				setIN132((IN132CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN133:
				setIN133((IN133CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN134:
				setIN134((IN134CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN135:
				setIN135((IN135CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN136:
				setIN136((IN136CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN137:
				setIN137((IN137CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN138:
				setIN138((IN138CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN139:
				setIN139((IN139CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN140:
				setIN140((IN140CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN141:
				setIN141((IN141CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN142:
				setIN142((IN142CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN143:
				setIN143((IN143CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN144:
				getIN144().clear();
				getIN144().addAll((Collection<? extends IN144CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN145:
				setIN145((IN145CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN146:
				setIN146((IN146CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN147:
				setIN147((IN147CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN148:
				setIN148((IN148CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN149:
				getIN149().clear();
				getIN149().addAll((Collection<? extends IN149CONTENT>)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN150:
				setIN150((IN150CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN151:
				setIN151((IN151CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN152:
				setIN152((IN152CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__IN153:
				setIN153((IN153CONTENT)newValue);
				return;
			case V2xmlPackage.IN1CONTENT__ANY:
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
			case V2xmlPackage.IN1CONTENT__IN11:
				setIN11((IN11CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN12:
				setIN12((IN12CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN13:
				getIN13().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN14:
				getIN14().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN15:
				getIN15().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN16:
				getIN16().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN17:
				getIN17().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN18:
				setIN18((IN18CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN19:
				getIN19().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN110:
				getIN110().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN111:
				getIN111().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN112:
				setIN112((IN112CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN113:
				setIN113((IN113CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN114:
				setIN114((IN114CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN115:
				setIN115((IN115CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN116:
				getIN116().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN117:
				setIN117((IN117CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN118:
				setIN118((IN118CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN119:
				getIN119().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN120:
				setIN120((IN120CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN121:
				setIN121((IN121CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN122:
				setIN122((IN122CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN123:
				setIN123((IN123CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN124:
				setIN124((IN124CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN125:
				setIN125((IN125CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN126:
				setIN126((IN126CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN127:
				setIN127((IN127CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN128:
				setIN128((IN128CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN129:
				setIN129((IN129CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN130:
				getIN130().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN131:
				setIN131((IN131CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN132:
				setIN132((IN132CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN133:
				setIN133((IN133CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN134:
				setIN134((IN134CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN135:
				setIN135((IN135CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN136:
				setIN136((IN136CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN137:
				setIN137((IN137CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN138:
				setIN138((IN138CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN139:
				setIN139((IN139CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN140:
				setIN140((IN140CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN141:
				setIN141((IN141CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN142:
				setIN142((IN142CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN143:
				setIN143((IN143CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN144:
				getIN144().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN145:
				setIN145((IN145CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN146:
				setIN146((IN146CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN147:
				setIN147((IN147CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN148:
				setIN148((IN148CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN149:
				getIN149().clear();
				return;
			case V2xmlPackage.IN1CONTENT__IN150:
				setIN150((IN150CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN151:
				setIN151((IN151CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN152:
				setIN152((IN152CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__IN153:
				setIN153((IN153CONTENT)null);
				return;
			case V2xmlPackage.IN1CONTENT__ANY:
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
			case V2xmlPackage.IN1CONTENT__IN11:
				return iN11 != null;
			case V2xmlPackage.IN1CONTENT__IN12:
				return iN12 != null;
			case V2xmlPackage.IN1CONTENT__IN13:
				return iN13 != null && !iN13.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN14:
				return iN14 != null && !iN14.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN15:
				return iN15 != null && !iN15.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN16:
				return iN16 != null && !iN16.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN17:
				return iN17 != null && !iN17.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN18:
				return iN18 != null;
			case V2xmlPackage.IN1CONTENT__IN19:
				return iN19 != null && !iN19.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN110:
				return iN110 != null && !iN110.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN111:
				return iN111 != null && !iN111.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN112:
				return iN112 != null;
			case V2xmlPackage.IN1CONTENT__IN113:
				return iN113 != null;
			case V2xmlPackage.IN1CONTENT__IN114:
				return iN114 != null;
			case V2xmlPackage.IN1CONTENT__IN115:
				return iN115 != null;
			case V2xmlPackage.IN1CONTENT__IN116:
				return iN116 != null && !iN116.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN117:
				return iN117 != null;
			case V2xmlPackage.IN1CONTENT__IN118:
				return iN118 != null;
			case V2xmlPackage.IN1CONTENT__IN119:
				return iN119 != null && !iN119.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN120:
				return iN120 != null;
			case V2xmlPackage.IN1CONTENT__IN121:
				return iN121 != null;
			case V2xmlPackage.IN1CONTENT__IN122:
				return iN122 != null;
			case V2xmlPackage.IN1CONTENT__IN123:
				return iN123 != null;
			case V2xmlPackage.IN1CONTENT__IN124:
				return iN124 != null;
			case V2xmlPackage.IN1CONTENT__IN125:
				return iN125 != null;
			case V2xmlPackage.IN1CONTENT__IN126:
				return iN126 != null;
			case V2xmlPackage.IN1CONTENT__IN127:
				return iN127 != null;
			case V2xmlPackage.IN1CONTENT__IN128:
				return iN128 != null;
			case V2xmlPackage.IN1CONTENT__IN129:
				return iN129 != null;
			case V2xmlPackage.IN1CONTENT__IN130:
				return iN130 != null && !iN130.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN131:
				return iN131 != null;
			case V2xmlPackage.IN1CONTENT__IN132:
				return iN132 != null;
			case V2xmlPackage.IN1CONTENT__IN133:
				return iN133 != null;
			case V2xmlPackage.IN1CONTENT__IN134:
				return iN134 != null;
			case V2xmlPackage.IN1CONTENT__IN135:
				return iN135 != null;
			case V2xmlPackage.IN1CONTENT__IN136:
				return iN136 != null;
			case V2xmlPackage.IN1CONTENT__IN137:
				return iN137 != null;
			case V2xmlPackage.IN1CONTENT__IN138:
				return iN138 != null;
			case V2xmlPackage.IN1CONTENT__IN139:
				return iN139 != null;
			case V2xmlPackage.IN1CONTENT__IN140:
				return iN140 != null;
			case V2xmlPackage.IN1CONTENT__IN141:
				return iN141 != null;
			case V2xmlPackage.IN1CONTENT__IN142:
				return iN142 != null;
			case V2xmlPackage.IN1CONTENT__IN143:
				return iN143 != null;
			case V2xmlPackage.IN1CONTENT__IN144:
				return iN144 != null && !iN144.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN145:
				return iN145 != null;
			case V2xmlPackage.IN1CONTENT__IN146:
				return iN146 != null;
			case V2xmlPackage.IN1CONTENT__IN147:
				return iN147 != null;
			case V2xmlPackage.IN1CONTENT__IN148:
				return iN148 != null;
			case V2xmlPackage.IN1CONTENT__IN149:
				return iN149 != null && !iN149.isEmpty();
			case V2xmlPackage.IN1CONTENT__IN150:
				return iN150 != null;
			case V2xmlPackage.IN1CONTENT__IN151:
				return iN151 != null;
			case V2xmlPackage.IN1CONTENT__IN152:
				return iN152 != null;
			case V2xmlPackage.IN1CONTENT__IN153:
				return iN153 != null;
			case V2xmlPackage.IN1CONTENT__ANY:
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

} //IN1CONTENTImpl
