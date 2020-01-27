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

import org.hl7.v2xml.PV110CONTENT;
import org.hl7.v2xml.PV111CONTENT;
import org.hl7.v2xml.PV112CONTENT;
import org.hl7.v2xml.PV113CONTENT;
import org.hl7.v2xml.PV114CONTENT;
import org.hl7.v2xml.PV115CONTENT;
import org.hl7.v2xml.PV116CONTENT;
import org.hl7.v2xml.PV117CONTENT;
import org.hl7.v2xml.PV118CONTENT;
import org.hl7.v2xml.PV119CONTENT;
import org.hl7.v2xml.PV11CONTENT;
import org.hl7.v2xml.PV120CONTENT;
import org.hl7.v2xml.PV121CONTENT;
import org.hl7.v2xml.PV122CONTENT;
import org.hl7.v2xml.PV123CONTENT;
import org.hl7.v2xml.PV124CONTENT;
import org.hl7.v2xml.PV125CONTENT;
import org.hl7.v2xml.PV126CONTENT;
import org.hl7.v2xml.PV127CONTENT;
import org.hl7.v2xml.PV128CONTENT;
import org.hl7.v2xml.PV129CONTENT;
import org.hl7.v2xml.PV12CONTENT;
import org.hl7.v2xml.PV130CONTENT;
import org.hl7.v2xml.PV131CONTENT;
import org.hl7.v2xml.PV132CONTENT;
import org.hl7.v2xml.PV133CONTENT;
import org.hl7.v2xml.PV134CONTENT;
import org.hl7.v2xml.PV135CONTENT;
import org.hl7.v2xml.PV136CONTENT;
import org.hl7.v2xml.PV137CONTENT;
import org.hl7.v2xml.PV138CONTENT;
import org.hl7.v2xml.PV139CONTENT;
import org.hl7.v2xml.PV13CONTENT;
import org.hl7.v2xml.PV140CONTENT;
import org.hl7.v2xml.PV141CONTENT;
import org.hl7.v2xml.PV142CONTENT;
import org.hl7.v2xml.PV143CONTENT;
import org.hl7.v2xml.PV144CONTENT;
import org.hl7.v2xml.PV145CONTENT;
import org.hl7.v2xml.PV146CONTENT;
import org.hl7.v2xml.PV147CONTENT;
import org.hl7.v2xml.PV148CONTENT;
import org.hl7.v2xml.PV149CONTENT;
import org.hl7.v2xml.PV14CONTENT;
import org.hl7.v2xml.PV150CONTENT;
import org.hl7.v2xml.PV151CONTENT;
import org.hl7.v2xml.PV152CONTENT;
import org.hl7.v2xml.PV15CONTENT;
import org.hl7.v2xml.PV16CONTENT;
import org.hl7.v2xml.PV17CONTENT;
import org.hl7.v2xml.PV18CONTENT;
import org.hl7.v2xml.PV19CONTENT;
import org.hl7.v2xml.PV1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PV1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV11 <em>PV11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV12 <em>PV12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV13 <em>PV13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV14 <em>PV14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV15 <em>PV15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV16 <em>PV16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV17 <em>PV17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV18 <em>PV18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV19 <em>PV19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV110 <em>PV110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV111 <em>PV111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV112 <em>PV112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV113 <em>PV113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV114 <em>PV114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV115 <em>PV115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV116 <em>PV116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV117 <em>PV117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV118 <em>PV118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV119 <em>PV119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV120 <em>PV120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV121 <em>PV121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV122 <em>PV122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV123 <em>PV123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV124 <em>PV124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV125 <em>PV125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV126 <em>PV126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV127 <em>PV127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV128 <em>PV128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV129 <em>PV129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV130 <em>PV130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV131 <em>PV131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV132 <em>PV132</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV133 <em>PV133</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV134 <em>PV134</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV135 <em>PV135</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV136 <em>PV136</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV137 <em>PV137</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV138 <em>PV138</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV139 <em>PV139</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV140 <em>PV140</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV141 <em>PV141</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV142 <em>PV142</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV143 <em>PV143</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV144 <em>PV144</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV145 <em>PV145</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV146 <em>PV146</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV147 <em>PV147</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV148 <em>PV148</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV149 <em>PV149</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV150 <em>PV150</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV151 <em>PV151</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getPV152 <em>PV152</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PV1CONTENTImpl extends EObjectImpl implements PV1CONTENT {
	/**
	 * The cached value of the '{@link #getPV11() <em>PV11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV11()
	 * @generated
	 * @ordered
	 */
	protected PV11CONTENT pV11;

	/**
	 * The cached value of the '{@link #getPV12() <em>PV12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV12()
	 * @generated
	 * @ordered
	 */
	protected PV12CONTENT pV12;

	/**
	 * The cached value of the '{@link #getPV13() <em>PV13</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV13()
	 * @generated
	 * @ordered
	 */
	protected PV13CONTENT pV13;

	/**
	 * The cached value of the '{@link #getPV14() <em>PV14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV14()
	 * @generated
	 * @ordered
	 */
	protected PV14CONTENT pV14;

	/**
	 * The cached value of the '{@link #getPV15() <em>PV15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV15()
	 * @generated
	 * @ordered
	 */
	protected PV15CONTENT pV15;

	/**
	 * The cached value of the '{@link #getPV16() <em>PV16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV16()
	 * @generated
	 * @ordered
	 */
	protected PV16CONTENT pV16;

	/**
	 * The cached value of the '{@link #getPV17() <em>PV17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV17()
	 * @generated
	 * @ordered
	 */
	protected EList<PV17CONTENT> pV17;

	/**
	 * The cached value of the '{@link #getPV18() <em>PV18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV18()
	 * @generated
	 * @ordered
	 */
	protected EList<PV18CONTENT> pV18;

	/**
	 * The cached value of the '{@link #getPV19() <em>PV19</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV19()
	 * @generated
	 * @ordered
	 */
	protected EList<PV19CONTENT> pV19;

	/**
	 * The cached value of the '{@link #getPV110() <em>PV110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV110()
	 * @generated
	 * @ordered
	 */
	protected PV110CONTENT pV110;

	/**
	 * The cached value of the '{@link #getPV111() <em>PV111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV111()
	 * @generated
	 * @ordered
	 */
	protected PV111CONTENT pV111;

	/**
	 * The cached value of the '{@link #getPV112() <em>PV112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV112()
	 * @generated
	 * @ordered
	 */
	protected PV112CONTENT pV112;

	/**
	 * The cached value of the '{@link #getPV113() <em>PV113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV113()
	 * @generated
	 * @ordered
	 */
	protected PV113CONTENT pV113;

	/**
	 * The cached value of the '{@link #getPV114() <em>PV114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV114()
	 * @generated
	 * @ordered
	 */
	protected PV114CONTENT pV114;

	/**
	 * The cached value of the '{@link #getPV115() <em>PV115</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV115()
	 * @generated
	 * @ordered
	 */
	protected EList<PV115CONTENT> pV115;

	/**
	 * The cached value of the '{@link #getPV116() <em>PV116</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV116()
	 * @generated
	 * @ordered
	 */
	protected PV116CONTENT pV116;

	/**
	 * The cached value of the '{@link #getPV117() <em>PV117</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV117()
	 * @generated
	 * @ordered
	 */
	protected EList<PV117CONTENT> pV117;

	/**
	 * The cached value of the '{@link #getPV118() <em>PV118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV118()
	 * @generated
	 * @ordered
	 */
	protected PV118CONTENT pV118;

	/**
	 * The cached value of the '{@link #getPV119() <em>PV119</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV119()
	 * @generated
	 * @ordered
	 */
	protected PV119CONTENT pV119;

	/**
	 * The cached value of the '{@link #getPV120() <em>PV120</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV120()
	 * @generated
	 * @ordered
	 */
	protected EList<PV120CONTENT> pV120;

	/**
	 * The cached value of the '{@link #getPV121() <em>PV121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV121()
	 * @generated
	 * @ordered
	 */
	protected PV121CONTENT pV121;

	/**
	 * The cached value of the '{@link #getPV122() <em>PV122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV122()
	 * @generated
	 * @ordered
	 */
	protected PV122CONTENT pV122;

	/**
	 * The cached value of the '{@link #getPV123() <em>PV123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV123()
	 * @generated
	 * @ordered
	 */
	protected PV123CONTENT pV123;

	/**
	 * The cached value of the '{@link #getPV124() <em>PV124</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV124()
	 * @generated
	 * @ordered
	 */
	protected EList<PV124CONTENT> pV124;

	/**
	 * The cached value of the '{@link #getPV125() <em>PV125</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV125()
	 * @generated
	 * @ordered
	 */
	protected EList<PV125CONTENT> pV125;

	/**
	 * The cached value of the '{@link #getPV126() <em>PV126</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV126()
	 * @generated
	 * @ordered
	 */
	protected EList<PV126CONTENT> pV126;

	/**
	 * The cached value of the '{@link #getPV127() <em>PV127</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV127()
	 * @generated
	 * @ordered
	 */
	protected EList<PV127CONTENT> pV127;

	/**
	 * The cached value of the '{@link #getPV128() <em>PV128</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV128()
	 * @generated
	 * @ordered
	 */
	protected PV128CONTENT pV128;

	/**
	 * The cached value of the '{@link #getPV129() <em>PV129</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV129()
	 * @generated
	 * @ordered
	 */
	protected PV129CONTENT pV129;

	/**
	 * The cached value of the '{@link #getPV130() <em>PV130</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV130()
	 * @generated
	 * @ordered
	 */
	protected PV130CONTENT pV130;

	/**
	 * The cached value of the '{@link #getPV131() <em>PV131</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV131()
	 * @generated
	 * @ordered
	 */
	protected PV131CONTENT pV131;

	/**
	 * The cached value of the '{@link #getPV132() <em>PV132</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV132()
	 * @generated
	 * @ordered
	 */
	protected PV132CONTENT pV132;

	/**
	 * The cached value of the '{@link #getPV133() <em>PV133</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV133()
	 * @generated
	 * @ordered
	 */
	protected PV133CONTENT pV133;

	/**
	 * The cached value of the '{@link #getPV134() <em>PV134</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV134()
	 * @generated
	 * @ordered
	 */
	protected PV134CONTENT pV134;

	/**
	 * The cached value of the '{@link #getPV135() <em>PV135</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV135()
	 * @generated
	 * @ordered
	 */
	protected PV135CONTENT pV135;

	/**
	 * The cached value of the '{@link #getPV136() <em>PV136</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV136()
	 * @generated
	 * @ordered
	 */
	protected PV136CONTENT pV136;

	/**
	 * The cached value of the '{@link #getPV137() <em>PV137</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV137()
	 * @generated
	 * @ordered
	 */
	protected PV137CONTENT pV137;

	/**
	 * The cached value of the '{@link #getPV138() <em>PV138</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV138()
	 * @generated
	 * @ordered
	 */
	protected PV138CONTENT pV138;

	/**
	 * The cached value of the '{@link #getPV139() <em>PV139</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV139()
	 * @generated
	 * @ordered
	 */
	protected PV139CONTENT pV139;

	/**
	 * The cached value of the '{@link #getPV140() <em>PV140</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV140()
	 * @generated
	 * @ordered
	 */
	protected PV140CONTENT pV140;

	/**
	 * The cached value of the '{@link #getPV141() <em>PV141</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV141()
	 * @generated
	 * @ordered
	 */
	protected PV141CONTENT pV141;

	/**
	 * The cached value of the '{@link #getPV142() <em>PV142</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV142()
	 * @generated
	 * @ordered
	 */
	protected PV142CONTENT pV142;

	/**
	 * The cached value of the '{@link #getPV143() <em>PV143</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV143()
	 * @generated
	 * @ordered
	 */
	protected PV143CONTENT pV143;

	/**
	 * The cached value of the '{@link #getPV144() <em>PV144</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV144()
	 * @generated
	 * @ordered
	 */
	protected PV144CONTENT pV144;

	/**
	 * The cached value of the '{@link #getPV145() <em>PV145</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV145()
	 * @generated
	 * @ordered
	 */
	protected EList<PV145CONTENT> pV145;

	/**
	 * The cached value of the '{@link #getPV146() <em>PV146</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV146()
	 * @generated
	 * @ordered
	 */
	protected PV146CONTENT pV146;

	/**
	 * The cached value of the '{@link #getPV147() <em>PV147</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV147()
	 * @generated
	 * @ordered
	 */
	protected PV147CONTENT pV147;

	/**
	 * The cached value of the '{@link #getPV148() <em>PV148</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV148()
	 * @generated
	 * @ordered
	 */
	protected PV148CONTENT pV148;

	/**
	 * The cached value of the '{@link #getPV149() <em>PV149</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV149()
	 * @generated
	 * @ordered
	 */
	protected PV149CONTENT pV149;

	/**
	 * The cached value of the '{@link #getPV150() <em>PV150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV150()
	 * @generated
	 * @ordered
	 */
	protected PV150CONTENT pV150;

	/**
	 * The cached value of the '{@link #getPV151() <em>PV151</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV151()
	 * @generated
	 * @ordered
	 */
	protected PV151CONTENT pV151;

	/**
	 * The cached value of the '{@link #getPV152() <em>PV152</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV152()
	 * @generated
	 * @ordered
	 */
	protected EList<PV152CONTENT> pV152;

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
	protected PV1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPV1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV11CONTENT getPV11() {
		return pV11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV11(PV11CONTENT newPV11, NotificationChain msgs) {
		PV11CONTENT oldPV11 = pV11;
		pV11 = newPV11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV11, oldPV11, newPV11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV11(PV11CONTENT newPV11) {
		if (newPV11 != pV11) {
			NotificationChain msgs = null;
			if (pV11 != null)
				msgs = ((InternalEObject)pV11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV11, null, msgs);
			if (newPV11 != null)
				msgs = ((InternalEObject)newPV11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV11, null, msgs);
			msgs = basicSetPV11(newPV11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV11, newPV11, newPV11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV12CONTENT getPV12() {
		return pV12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV12(PV12CONTENT newPV12, NotificationChain msgs) {
		PV12CONTENT oldPV12 = pV12;
		pV12 = newPV12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV12, oldPV12, newPV12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV12(PV12CONTENT newPV12) {
		if (newPV12 != pV12) {
			NotificationChain msgs = null;
			if (pV12 != null)
				msgs = ((InternalEObject)pV12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV12, null, msgs);
			if (newPV12 != null)
				msgs = ((InternalEObject)newPV12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV12, null, msgs);
			msgs = basicSetPV12(newPV12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV12, newPV12, newPV12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV13CONTENT getPV13() {
		return pV13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV13(PV13CONTENT newPV13, NotificationChain msgs) {
		PV13CONTENT oldPV13 = pV13;
		pV13 = newPV13;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV13, oldPV13, newPV13);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV13(PV13CONTENT newPV13) {
		if (newPV13 != pV13) {
			NotificationChain msgs = null;
			if (pV13 != null)
				msgs = ((InternalEObject)pV13).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV13, null, msgs);
			if (newPV13 != null)
				msgs = ((InternalEObject)newPV13).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV13, null, msgs);
			msgs = basicSetPV13(newPV13, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV13, newPV13, newPV13));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV14CONTENT getPV14() {
		return pV14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV14(PV14CONTENT newPV14, NotificationChain msgs) {
		PV14CONTENT oldPV14 = pV14;
		pV14 = newPV14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV14, oldPV14, newPV14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV14(PV14CONTENT newPV14) {
		if (newPV14 != pV14) {
			NotificationChain msgs = null;
			if (pV14 != null)
				msgs = ((InternalEObject)pV14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV14, null, msgs);
			if (newPV14 != null)
				msgs = ((InternalEObject)newPV14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV14, null, msgs);
			msgs = basicSetPV14(newPV14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV14, newPV14, newPV14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV15CONTENT getPV15() {
		return pV15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV15(PV15CONTENT newPV15, NotificationChain msgs) {
		PV15CONTENT oldPV15 = pV15;
		pV15 = newPV15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV15, oldPV15, newPV15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV15(PV15CONTENT newPV15) {
		if (newPV15 != pV15) {
			NotificationChain msgs = null;
			if (pV15 != null)
				msgs = ((InternalEObject)pV15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV15, null, msgs);
			if (newPV15 != null)
				msgs = ((InternalEObject)newPV15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV15, null, msgs);
			msgs = basicSetPV15(newPV15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV15, newPV15, newPV15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV16CONTENT getPV16() {
		return pV16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV16(PV16CONTENT newPV16, NotificationChain msgs) {
		PV16CONTENT oldPV16 = pV16;
		pV16 = newPV16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV16, oldPV16, newPV16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV16(PV16CONTENT newPV16) {
		if (newPV16 != pV16) {
			NotificationChain msgs = null;
			if (pV16 != null)
				msgs = ((InternalEObject)pV16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV16, null, msgs);
			if (newPV16 != null)
				msgs = ((InternalEObject)newPV16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV16, null, msgs);
			msgs = basicSetPV16(newPV16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV16, newPV16, newPV16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV17CONTENT> getPV17() {
		if (pV17 == null) {
			pV17 = new EObjectContainmentEList<PV17CONTENT>(PV17CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV17);
		}
		return pV17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV18CONTENT> getPV18() {
		if (pV18 == null) {
			pV18 = new EObjectContainmentEList<PV18CONTENT>(PV18CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV18);
		}
		return pV18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV19CONTENT> getPV19() {
		if (pV19 == null) {
			pV19 = new EObjectContainmentEList<PV19CONTENT>(PV19CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV19);
		}
		return pV19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV110CONTENT getPV110() {
		return pV110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV110(PV110CONTENT newPV110, NotificationChain msgs) {
		PV110CONTENT oldPV110 = pV110;
		pV110 = newPV110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV110, oldPV110, newPV110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV110(PV110CONTENT newPV110) {
		if (newPV110 != pV110) {
			NotificationChain msgs = null;
			if (pV110 != null)
				msgs = ((InternalEObject)pV110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV110, null, msgs);
			if (newPV110 != null)
				msgs = ((InternalEObject)newPV110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV110, null, msgs);
			msgs = basicSetPV110(newPV110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV110, newPV110, newPV110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV111CONTENT getPV111() {
		return pV111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV111(PV111CONTENT newPV111, NotificationChain msgs) {
		PV111CONTENT oldPV111 = pV111;
		pV111 = newPV111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV111, oldPV111, newPV111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV111(PV111CONTENT newPV111) {
		if (newPV111 != pV111) {
			NotificationChain msgs = null;
			if (pV111 != null)
				msgs = ((InternalEObject)pV111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV111, null, msgs);
			if (newPV111 != null)
				msgs = ((InternalEObject)newPV111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV111, null, msgs);
			msgs = basicSetPV111(newPV111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV111, newPV111, newPV111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV112CONTENT getPV112() {
		return pV112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV112(PV112CONTENT newPV112, NotificationChain msgs) {
		PV112CONTENT oldPV112 = pV112;
		pV112 = newPV112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV112, oldPV112, newPV112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV112(PV112CONTENT newPV112) {
		if (newPV112 != pV112) {
			NotificationChain msgs = null;
			if (pV112 != null)
				msgs = ((InternalEObject)pV112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV112, null, msgs);
			if (newPV112 != null)
				msgs = ((InternalEObject)newPV112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV112, null, msgs);
			msgs = basicSetPV112(newPV112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV112, newPV112, newPV112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV113CONTENT getPV113() {
		return pV113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV113(PV113CONTENT newPV113, NotificationChain msgs) {
		PV113CONTENT oldPV113 = pV113;
		pV113 = newPV113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV113, oldPV113, newPV113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV113(PV113CONTENT newPV113) {
		if (newPV113 != pV113) {
			NotificationChain msgs = null;
			if (pV113 != null)
				msgs = ((InternalEObject)pV113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV113, null, msgs);
			if (newPV113 != null)
				msgs = ((InternalEObject)newPV113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV113, null, msgs);
			msgs = basicSetPV113(newPV113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV113, newPV113, newPV113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV114CONTENT getPV114() {
		return pV114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV114(PV114CONTENT newPV114, NotificationChain msgs) {
		PV114CONTENT oldPV114 = pV114;
		pV114 = newPV114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV114, oldPV114, newPV114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV114(PV114CONTENT newPV114) {
		if (newPV114 != pV114) {
			NotificationChain msgs = null;
			if (pV114 != null)
				msgs = ((InternalEObject)pV114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV114, null, msgs);
			if (newPV114 != null)
				msgs = ((InternalEObject)newPV114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV114, null, msgs);
			msgs = basicSetPV114(newPV114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV114, newPV114, newPV114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV115CONTENT> getPV115() {
		if (pV115 == null) {
			pV115 = new EObjectContainmentEList<PV115CONTENT>(PV115CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV115);
		}
		return pV115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV116CONTENT getPV116() {
		return pV116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV116(PV116CONTENT newPV116, NotificationChain msgs) {
		PV116CONTENT oldPV116 = pV116;
		pV116 = newPV116;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV116, oldPV116, newPV116);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV116(PV116CONTENT newPV116) {
		if (newPV116 != pV116) {
			NotificationChain msgs = null;
			if (pV116 != null)
				msgs = ((InternalEObject)pV116).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV116, null, msgs);
			if (newPV116 != null)
				msgs = ((InternalEObject)newPV116).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV116, null, msgs);
			msgs = basicSetPV116(newPV116, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV116, newPV116, newPV116));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV117CONTENT> getPV117() {
		if (pV117 == null) {
			pV117 = new EObjectContainmentEList<PV117CONTENT>(PV117CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV117);
		}
		return pV117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV118CONTENT getPV118() {
		return pV118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV118(PV118CONTENT newPV118, NotificationChain msgs) {
		PV118CONTENT oldPV118 = pV118;
		pV118 = newPV118;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV118, oldPV118, newPV118);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV118(PV118CONTENT newPV118) {
		if (newPV118 != pV118) {
			NotificationChain msgs = null;
			if (pV118 != null)
				msgs = ((InternalEObject)pV118).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV118, null, msgs);
			if (newPV118 != null)
				msgs = ((InternalEObject)newPV118).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV118, null, msgs);
			msgs = basicSetPV118(newPV118, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV118, newPV118, newPV118));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV119CONTENT getPV119() {
		return pV119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV119(PV119CONTENT newPV119, NotificationChain msgs) {
		PV119CONTENT oldPV119 = pV119;
		pV119 = newPV119;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV119, oldPV119, newPV119);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV119(PV119CONTENT newPV119) {
		if (newPV119 != pV119) {
			NotificationChain msgs = null;
			if (pV119 != null)
				msgs = ((InternalEObject)pV119).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV119, null, msgs);
			if (newPV119 != null)
				msgs = ((InternalEObject)newPV119).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV119, null, msgs);
			msgs = basicSetPV119(newPV119, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV119, newPV119, newPV119));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV120CONTENT> getPV120() {
		if (pV120 == null) {
			pV120 = new EObjectContainmentEList<PV120CONTENT>(PV120CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV120);
		}
		return pV120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV121CONTENT getPV121() {
		return pV121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV121(PV121CONTENT newPV121, NotificationChain msgs) {
		PV121CONTENT oldPV121 = pV121;
		pV121 = newPV121;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV121, oldPV121, newPV121);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV121(PV121CONTENT newPV121) {
		if (newPV121 != pV121) {
			NotificationChain msgs = null;
			if (pV121 != null)
				msgs = ((InternalEObject)pV121).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV121, null, msgs);
			if (newPV121 != null)
				msgs = ((InternalEObject)newPV121).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV121, null, msgs);
			msgs = basicSetPV121(newPV121, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV121, newPV121, newPV121));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV122CONTENT getPV122() {
		return pV122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV122(PV122CONTENT newPV122, NotificationChain msgs) {
		PV122CONTENT oldPV122 = pV122;
		pV122 = newPV122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV122, oldPV122, newPV122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV122(PV122CONTENT newPV122) {
		if (newPV122 != pV122) {
			NotificationChain msgs = null;
			if (pV122 != null)
				msgs = ((InternalEObject)pV122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV122, null, msgs);
			if (newPV122 != null)
				msgs = ((InternalEObject)newPV122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV122, null, msgs);
			msgs = basicSetPV122(newPV122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV122, newPV122, newPV122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV123CONTENT getPV123() {
		return pV123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV123(PV123CONTENT newPV123, NotificationChain msgs) {
		PV123CONTENT oldPV123 = pV123;
		pV123 = newPV123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV123, oldPV123, newPV123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV123(PV123CONTENT newPV123) {
		if (newPV123 != pV123) {
			NotificationChain msgs = null;
			if (pV123 != null)
				msgs = ((InternalEObject)pV123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV123, null, msgs);
			if (newPV123 != null)
				msgs = ((InternalEObject)newPV123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV123, null, msgs);
			msgs = basicSetPV123(newPV123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV123, newPV123, newPV123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV124CONTENT> getPV124() {
		if (pV124 == null) {
			pV124 = new EObjectContainmentEList<PV124CONTENT>(PV124CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV124);
		}
		return pV124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV125CONTENT> getPV125() {
		if (pV125 == null) {
			pV125 = new EObjectContainmentEList<PV125CONTENT>(PV125CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV125);
		}
		return pV125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV126CONTENT> getPV126() {
		if (pV126 == null) {
			pV126 = new EObjectContainmentEList<PV126CONTENT>(PV126CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV126);
		}
		return pV126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV127CONTENT> getPV127() {
		if (pV127 == null) {
			pV127 = new EObjectContainmentEList<PV127CONTENT>(PV127CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV127);
		}
		return pV127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV128CONTENT getPV128() {
		return pV128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV128(PV128CONTENT newPV128, NotificationChain msgs) {
		PV128CONTENT oldPV128 = pV128;
		pV128 = newPV128;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV128, oldPV128, newPV128);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV128(PV128CONTENT newPV128) {
		if (newPV128 != pV128) {
			NotificationChain msgs = null;
			if (pV128 != null)
				msgs = ((InternalEObject)pV128).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV128, null, msgs);
			if (newPV128 != null)
				msgs = ((InternalEObject)newPV128).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV128, null, msgs);
			msgs = basicSetPV128(newPV128, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV128, newPV128, newPV128));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV129CONTENT getPV129() {
		return pV129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV129(PV129CONTENT newPV129, NotificationChain msgs) {
		PV129CONTENT oldPV129 = pV129;
		pV129 = newPV129;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV129, oldPV129, newPV129);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV129(PV129CONTENT newPV129) {
		if (newPV129 != pV129) {
			NotificationChain msgs = null;
			if (pV129 != null)
				msgs = ((InternalEObject)pV129).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV129, null, msgs);
			if (newPV129 != null)
				msgs = ((InternalEObject)newPV129).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV129, null, msgs);
			msgs = basicSetPV129(newPV129, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV129, newPV129, newPV129));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV130CONTENT getPV130() {
		return pV130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV130(PV130CONTENT newPV130, NotificationChain msgs) {
		PV130CONTENT oldPV130 = pV130;
		pV130 = newPV130;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV130, oldPV130, newPV130);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV130(PV130CONTENT newPV130) {
		if (newPV130 != pV130) {
			NotificationChain msgs = null;
			if (pV130 != null)
				msgs = ((InternalEObject)pV130).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV130, null, msgs);
			if (newPV130 != null)
				msgs = ((InternalEObject)newPV130).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV130, null, msgs);
			msgs = basicSetPV130(newPV130, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV130, newPV130, newPV130));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV131CONTENT getPV131() {
		return pV131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV131(PV131CONTENT newPV131, NotificationChain msgs) {
		PV131CONTENT oldPV131 = pV131;
		pV131 = newPV131;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV131, oldPV131, newPV131);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV131(PV131CONTENT newPV131) {
		if (newPV131 != pV131) {
			NotificationChain msgs = null;
			if (pV131 != null)
				msgs = ((InternalEObject)pV131).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV131, null, msgs);
			if (newPV131 != null)
				msgs = ((InternalEObject)newPV131).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV131, null, msgs);
			msgs = basicSetPV131(newPV131, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV131, newPV131, newPV131));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV132CONTENT getPV132() {
		return pV132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV132(PV132CONTENT newPV132, NotificationChain msgs) {
		PV132CONTENT oldPV132 = pV132;
		pV132 = newPV132;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV132, oldPV132, newPV132);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV132(PV132CONTENT newPV132) {
		if (newPV132 != pV132) {
			NotificationChain msgs = null;
			if (pV132 != null)
				msgs = ((InternalEObject)pV132).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV132, null, msgs);
			if (newPV132 != null)
				msgs = ((InternalEObject)newPV132).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV132, null, msgs);
			msgs = basicSetPV132(newPV132, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV132, newPV132, newPV132));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV133CONTENT getPV133() {
		return pV133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV133(PV133CONTENT newPV133, NotificationChain msgs) {
		PV133CONTENT oldPV133 = pV133;
		pV133 = newPV133;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV133, oldPV133, newPV133);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV133(PV133CONTENT newPV133) {
		if (newPV133 != pV133) {
			NotificationChain msgs = null;
			if (pV133 != null)
				msgs = ((InternalEObject)pV133).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV133, null, msgs);
			if (newPV133 != null)
				msgs = ((InternalEObject)newPV133).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV133, null, msgs);
			msgs = basicSetPV133(newPV133, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV133, newPV133, newPV133));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV134CONTENT getPV134() {
		return pV134;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV134(PV134CONTENT newPV134, NotificationChain msgs) {
		PV134CONTENT oldPV134 = pV134;
		pV134 = newPV134;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV134, oldPV134, newPV134);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV134(PV134CONTENT newPV134) {
		if (newPV134 != pV134) {
			NotificationChain msgs = null;
			if (pV134 != null)
				msgs = ((InternalEObject)pV134).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV134, null, msgs);
			if (newPV134 != null)
				msgs = ((InternalEObject)newPV134).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV134, null, msgs);
			msgs = basicSetPV134(newPV134, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV134, newPV134, newPV134));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV135CONTENT getPV135() {
		return pV135;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV135(PV135CONTENT newPV135, NotificationChain msgs) {
		PV135CONTENT oldPV135 = pV135;
		pV135 = newPV135;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV135, oldPV135, newPV135);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV135(PV135CONTENT newPV135) {
		if (newPV135 != pV135) {
			NotificationChain msgs = null;
			if (pV135 != null)
				msgs = ((InternalEObject)pV135).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV135, null, msgs);
			if (newPV135 != null)
				msgs = ((InternalEObject)newPV135).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV135, null, msgs);
			msgs = basicSetPV135(newPV135, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV135, newPV135, newPV135));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV136CONTENT getPV136() {
		return pV136;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV136(PV136CONTENT newPV136, NotificationChain msgs) {
		PV136CONTENT oldPV136 = pV136;
		pV136 = newPV136;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV136, oldPV136, newPV136);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV136(PV136CONTENT newPV136) {
		if (newPV136 != pV136) {
			NotificationChain msgs = null;
			if (pV136 != null)
				msgs = ((InternalEObject)pV136).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV136, null, msgs);
			if (newPV136 != null)
				msgs = ((InternalEObject)newPV136).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV136, null, msgs);
			msgs = basicSetPV136(newPV136, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV136, newPV136, newPV136));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV137CONTENT getPV137() {
		return pV137;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV137(PV137CONTENT newPV137, NotificationChain msgs) {
		PV137CONTENT oldPV137 = pV137;
		pV137 = newPV137;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV137, oldPV137, newPV137);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV137(PV137CONTENT newPV137) {
		if (newPV137 != pV137) {
			NotificationChain msgs = null;
			if (pV137 != null)
				msgs = ((InternalEObject)pV137).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV137, null, msgs);
			if (newPV137 != null)
				msgs = ((InternalEObject)newPV137).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV137, null, msgs);
			msgs = basicSetPV137(newPV137, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV137, newPV137, newPV137));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV138CONTENT getPV138() {
		return pV138;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV138(PV138CONTENT newPV138, NotificationChain msgs) {
		PV138CONTENT oldPV138 = pV138;
		pV138 = newPV138;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV138, oldPV138, newPV138);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV138(PV138CONTENT newPV138) {
		if (newPV138 != pV138) {
			NotificationChain msgs = null;
			if (pV138 != null)
				msgs = ((InternalEObject)pV138).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV138, null, msgs);
			if (newPV138 != null)
				msgs = ((InternalEObject)newPV138).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV138, null, msgs);
			msgs = basicSetPV138(newPV138, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV138, newPV138, newPV138));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV139CONTENT getPV139() {
		return pV139;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV139(PV139CONTENT newPV139, NotificationChain msgs) {
		PV139CONTENT oldPV139 = pV139;
		pV139 = newPV139;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV139, oldPV139, newPV139);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV139(PV139CONTENT newPV139) {
		if (newPV139 != pV139) {
			NotificationChain msgs = null;
			if (pV139 != null)
				msgs = ((InternalEObject)pV139).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV139, null, msgs);
			if (newPV139 != null)
				msgs = ((InternalEObject)newPV139).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV139, null, msgs);
			msgs = basicSetPV139(newPV139, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV139, newPV139, newPV139));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV140CONTENT getPV140() {
		return pV140;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV140(PV140CONTENT newPV140, NotificationChain msgs) {
		PV140CONTENT oldPV140 = pV140;
		pV140 = newPV140;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV140, oldPV140, newPV140);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV140(PV140CONTENT newPV140) {
		if (newPV140 != pV140) {
			NotificationChain msgs = null;
			if (pV140 != null)
				msgs = ((InternalEObject)pV140).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV140, null, msgs);
			if (newPV140 != null)
				msgs = ((InternalEObject)newPV140).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV140, null, msgs);
			msgs = basicSetPV140(newPV140, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV140, newPV140, newPV140));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV141CONTENT getPV141() {
		return pV141;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV141(PV141CONTENT newPV141, NotificationChain msgs) {
		PV141CONTENT oldPV141 = pV141;
		pV141 = newPV141;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV141, oldPV141, newPV141);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV141(PV141CONTENT newPV141) {
		if (newPV141 != pV141) {
			NotificationChain msgs = null;
			if (pV141 != null)
				msgs = ((InternalEObject)pV141).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV141, null, msgs);
			if (newPV141 != null)
				msgs = ((InternalEObject)newPV141).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV141, null, msgs);
			msgs = basicSetPV141(newPV141, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV141, newPV141, newPV141));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV142CONTENT getPV142() {
		return pV142;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV142(PV142CONTENT newPV142, NotificationChain msgs) {
		PV142CONTENT oldPV142 = pV142;
		pV142 = newPV142;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV142, oldPV142, newPV142);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV142(PV142CONTENT newPV142) {
		if (newPV142 != pV142) {
			NotificationChain msgs = null;
			if (pV142 != null)
				msgs = ((InternalEObject)pV142).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV142, null, msgs);
			if (newPV142 != null)
				msgs = ((InternalEObject)newPV142).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV142, null, msgs);
			msgs = basicSetPV142(newPV142, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV142, newPV142, newPV142));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV143CONTENT getPV143() {
		return pV143;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV143(PV143CONTENT newPV143, NotificationChain msgs) {
		PV143CONTENT oldPV143 = pV143;
		pV143 = newPV143;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV143, oldPV143, newPV143);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV143(PV143CONTENT newPV143) {
		if (newPV143 != pV143) {
			NotificationChain msgs = null;
			if (pV143 != null)
				msgs = ((InternalEObject)pV143).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV143, null, msgs);
			if (newPV143 != null)
				msgs = ((InternalEObject)newPV143).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV143, null, msgs);
			msgs = basicSetPV143(newPV143, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV143, newPV143, newPV143));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV144CONTENT getPV144() {
		return pV144;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV144(PV144CONTENT newPV144, NotificationChain msgs) {
		PV144CONTENT oldPV144 = pV144;
		pV144 = newPV144;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV144, oldPV144, newPV144);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV144(PV144CONTENT newPV144) {
		if (newPV144 != pV144) {
			NotificationChain msgs = null;
			if (pV144 != null)
				msgs = ((InternalEObject)pV144).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV144, null, msgs);
			if (newPV144 != null)
				msgs = ((InternalEObject)newPV144).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV144, null, msgs);
			msgs = basicSetPV144(newPV144, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV144, newPV144, newPV144));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV145CONTENT> getPV145() {
		if (pV145 == null) {
			pV145 = new EObjectContainmentEList<PV145CONTENT>(PV145CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV145);
		}
		return pV145;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV146CONTENT getPV146() {
		return pV146;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV146(PV146CONTENT newPV146, NotificationChain msgs) {
		PV146CONTENT oldPV146 = pV146;
		pV146 = newPV146;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV146, oldPV146, newPV146);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV146(PV146CONTENT newPV146) {
		if (newPV146 != pV146) {
			NotificationChain msgs = null;
			if (pV146 != null)
				msgs = ((InternalEObject)pV146).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV146, null, msgs);
			if (newPV146 != null)
				msgs = ((InternalEObject)newPV146).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV146, null, msgs);
			msgs = basicSetPV146(newPV146, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV146, newPV146, newPV146));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV147CONTENT getPV147() {
		return pV147;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV147(PV147CONTENT newPV147, NotificationChain msgs) {
		PV147CONTENT oldPV147 = pV147;
		pV147 = newPV147;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV147, oldPV147, newPV147);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV147(PV147CONTENT newPV147) {
		if (newPV147 != pV147) {
			NotificationChain msgs = null;
			if (pV147 != null)
				msgs = ((InternalEObject)pV147).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV147, null, msgs);
			if (newPV147 != null)
				msgs = ((InternalEObject)newPV147).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV147, null, msgs);
			msgs = basicSetPV147(newPV147, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV147, newPV147, newPV147));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV148CONTENT getPV148() {
		return pV148;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV148(PV148CONTENT newPV148, NotificationChain msgs) {
		PV148CONTENT oldPV148 = pV148;
		pV148 = newPV148;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV148, oldPV148, newPV148);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV148(PV148CONTENT newPV148) {
		if (newPV148 != pV148) {
			NotificationChain msgs = null;
			if (pV148 != null)
				msgs = ((InternalEObject)pV148).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV148, null, msgs);
			if (newPV148 != null)
				msgs = ((InternalEObject)newPV148).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV148, null, msgs);
			msgs = basicSetPV148(newPV148, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV148, newPV148, newPV148));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV149CONTENT getPV149() {
		return pV149;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV149(PV149CONTENT newPV149, NotificationChain msgs) {
		PV149CONTENT oldPV149 = pV149;
		pV149 = newPV149;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV149, oldPV149, newPV149);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV149(PV149CONTENT newPV149) {
		if (newPV149 != pV149) {
			NotificationChain msgs = null;
			if (pV149 != null)
				msgs = ((InternalEObject)pV149).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV149, null, msgs);
			if (newPV149 != null)
				msgs = ((InternalEObject)newPV149).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV149, null, msgs);
			msgs = basicSetPV149(newPV149, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV149, newPV149, newPV149));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV150CONTENT getPV150() {
		return pV150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV150(PV150CONTENT newPV150, NotificationChain msgs) {
		PV150CONTENT oldPV150 = pV150;
		pV150 = newPV150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV150, oldPV150, newPV150);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV150(PV150CONTENT newPV150) {
		if (newPV150 != pV150) {
			NotificationChain msgs = null;
			if (pV150 != null)
				msgs = ((InternalEObject)pV150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV150, null, msgs);
			if (newPV150 != null)
				msgs = ((InternalEObject)newPV150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV150, null, msgs);
			msgs = basicSetPV150(newPV150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV150, newPV150, newPV150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV151CONTENT getPV151() {
		return pV151;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV151(PV151CONTENT newPV151, NotificationChain msgs) {
		PV151CONTENT oldPV151 = pV151;
		pV151 = newPV151;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV151, oldPV151, newPV151);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV151(PV151CONTENT newPV151) {
		if (newPV151 != pV151) {
			NotificationChain msgs = null;
			if (pV151 != null)
				msgs = ((InternalEObject)pV151).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV151, null, msgs);
			if (newPV151 != null)
				msgs = ((InternalEObject)newPV151).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV1CONTENT__PV151, null, msgs);
			msgs = basicSetPV151(newPV151, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV1CONTENT__PV151, newPV151, newPV151));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV152CONTENT> getPV152() {
		if (pV152 == null) {
			pV152 = new EObjectContainmentEList<PV152CONTENT>(PV152CONTENT.class, this, V2xmlPackage.PV1CONTENT__PV152);
		}
		return pV152;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PV1CONTENT__ANY);
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
			case V2xmlPackage.PV1CONTENT__PV11:
				return basicSetPV11(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV12:
				return basicSetPV12(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV13:
				return basicSetPV13(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV14:
				return basicSetPV14(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV15:
				return basicSetPV15(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV16:
				return basicSetPV16(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV17:
				return ((InternalEList<?>)getPV17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV18:
				return ((InternalEList<?>)getPV18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV19:
				return ((InternalEList<?>)getPV19()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV110:
				return basicSetPV110(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV111:
				return basicSetPV111(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV112:
				return basicSetPV112(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV113:
				return basicSetPV113(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV114:
				return basicSetPV114(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV115:
				return ((InternalEList<?>)getPV115()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV116:
				return basicSetPV116(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV117:
				return ((InternalEList<?>)getPV117()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV118:
				return basicSetPV118(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV119:
				return basicSetPV119(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV120:
				return ((InternalEList<?>)getPV120()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV121:
				return basicSetPV121(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV122:
				return basicSetPV122(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV123:
				return basicSetPV123(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV124:
				return ((InternalEList<?>)getPV124()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV125:
				return ((InternalEList<?>)getPV125()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV126:
				return ((InternalEList<?>)getPV126()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV127:
				return ((InternalEList<?>)getPV127()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV128:
				return basicSetPV128(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV129:
				return basicSetPV129(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV130:
				return basicSetPV130(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV131:
				return basicSetPV131(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV132:
				return basicSetPV132(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV133:
				return basicSetPV133(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV134:
				return basicSetPV134(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV135:
				return basicSetPV135(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV136:
				return basicSetPV136(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV137:
				return basicSetPV137(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV138:
				return basicSetPV138(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV139:
				return basicSetPV139(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV140:
				return basicSetPV140(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV141:
				return basicSetPV141(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV142:
				return basicSetPV142(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV143:
				return basicSetPV143(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV144:
				return basicSetPV144(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV145:
				return ((InternalEList<?>)getPV145()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__PV146:
				return basicSetPV146(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV147:
				return basicSetPV147(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV148:
				return basicSetPV148(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV149:
				return basicSetPV149(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV150:
				return basicSetPV150(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV151:
				return basicSetPV151(null, msgs);
			case V2xmlPackage.PV1CONTENT__PV152:
				return ((InternalEList<?>)getPV152()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV1CONTENT__ANY:
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
			case V2xmlPackage.PV1CONTENT__PV11:
				return getPV11();
			case V2xmlPackage.PV1CONTENT__PV12:
				return getPV12();
			case V2xmlPackage.PV1CONTENT__PV13:
				return getPV13();
			case V2xmlPackage.PV1CONTENT__PV14:
				return getPV14();
			case V2xmlPackage.PV1CONTENT__PV15:
				return getPV15();
			case V2xmlPackage.PV1CONTENT__PV16:
				return getPV16();
			case V2xmlPackage.PV1CONTENT__PV17:
				return getPV17();
			case V2xmlPackage.PV1CONTENT__PV18:
				return getPV18();
			case V2xmlPackage.PV1CONTENT__PV19:
				return getPV19();
			case V2xmlPackage.PV1CONTENT__PV110:
				return getPV110();
			case V2xmlPackage.PV1CONTENT__PV111:
				return getPV111();
			case V2xmlPackage.PV1CONTENT__PV112:
				return getPV112();
			case V2xmlPackage.PV1CONTENT__PV113:
				return getPV113();
			case V2xmlPackage.PV1CONTENT__PV114:
				return getPV114();
			case V2xmlPackage.PV1CONTENT__PV115:
				return getPV115();
			case V2xmlPackage.PV1CONTENT__PV116:
				return getPV116();
			case V2xmlPackage.PV1CONTENT__PV117:
				return getPV117();
			case V2xmlPackage.PV1CONTENT__PV118:
				return getPV118();
			case V2xmlPackage.PV1CONTENT__PV119:
				return getPV119();
			case V2xmlPackage.PV1CONTENT__PV120:
				return getPV120();
			case V2xmlPackage.PV1CONTENT__PV121:
				return getPV121();
			case V2xmlPackage.PV1CONTENT__PV122:
				return getPV122();
			case V2xmlPackage.PV1CONTENT__PV123:
				return getPV123();
			case V2xmlPackage.PV1CONTENT__PV124:
				return getPV124();
			case V2xmlPackage.PV1CONTENT__PV125:
				return getPV125();
			case V2xmlPackage.PV1CONTENT__PV126:
				return getPV126();
			case V2xmlPackage.PV1CONTENT__PV127:
				return getPV127();
			case V2xmlPackage.PV1CONTENT__PV128:
				return getPV128();
			case V2xmlPackage.PV1CONTENT__PV129:
				return getPV129();
			case V2xmlPackage.PV1CONTENT__PV130:
				return getPV130();
			case V2xmlPackage.PV1CONTENT__PV131:
				return getPV131();
			case V2xmlPackage.PV1CONTENT__PV132:
				return getPV132();
			case V2xmlPackage.PV1CONTENT__PV133:
				return getPV133();
			case V2xmlPackage.PV1CONTENT__PV134:
				return getPV134();
			case V2xmlPackage.PV1CONTENT__PV135:
				return getPV135();
			case V2xmlPackage.PV1CONTENT__PV136:
				return getPV136();
			case V2xmlPackage.PV1CONTENT__PV137:
				return getPV137();
			case V2xmlPackage.PV1CONTENT__PV138:
				return getPV138();
			case V2xmlPackage.PV1CONTENT__PV139:
				return getPV139();
			case V2xmlPackage.PV1CONTENT__PV140:
				return getPV140();
			case V2xmlPackage.PV1CONTENT__PV141:
				return getPV141();
			case V2xmlPackage.PV1CONTENT__PV142:
				return getPV142();
			case V2xmlPackage.PV1CONTENT__PV143:
				return getPV143();
			case V2xmlPackage.PV1CONTENT__PV144:
				return getPV144();
			case V2xmlPackage.PV1CONTENT__PV145:
				return getPV145();
			case V2xmlPackage.PV1CONTENT__PV146:
				return getPV146();
			case V2xmlPackage.PV1CONTENT__PV147:
				return getPV147();
			case V2xmlPackage.PV1CONTENT__PV148:
				return getPV148();
			case V2xmlPackage.PV1CONTENT__PV149:
				return getPV149();
			case V2xmlPackage.PV1CONTENT__PV150:
				return getPV150();
			case V2xmlPackage.PV1CONTENT__PV151:
				return getPV151();
			case V2xmlPackage.PV1CONTENT__PV152:
				return getPV152();
			case V2xmlPackage.PV1CONTENT__ANY:
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
			case V2xmlPackage.PV1CONTENT__PV11:
				setPV11((PV11CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV12:
				setPV12((PV12CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV13:
				setPV13((PV13CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV14:
				setPV14((PV14CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV15:
				setPV15((PV15CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV16:
				setPV16((PV16CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV17:
				getPV17().clear();
				getPV17().addAll((Collection<? extends PV17CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV18:
				getPV18().clear();
				getPV18().addAll((Collection<? extends PV18CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV19:
				getPV19().clear();
				getPV19().addAll((Collection<? extends PV19CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV110:
				setPV110((PV110CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV111:
				setPV111((PV111CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV112:
				setPV112((PV112CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV113:
				setPV113((PV113CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV114:
				setPV114((PV114CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV115:
				getPV115().clear();
				getPV115().addAll((Collection<? extends PV115CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV116:
				setPV116((PV116CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV117:
				getPV117().clear();
				getPV117().addAll((Collection<? extends PV117CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV118:
				setPV118((PV118CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV119:
				setPV119((PV119CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV120:
				getPV120().clear();
				getPV120().addAll((Collection<? extends PV120CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV121:
				setPV121((PV121CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV122:
				setPV122((PV122CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV123:
				setPV123((PV123CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV124:
				getPV124().clear();
				getPV124().addAll((Collection<? extends PV124CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV125:
				getPV125().clear();
				getPV125().addAll((Collection<? extends PV125CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV126:
				getPV126().clear();
				getPV126().addAll((Collection<? extends PV126CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV127:
				getPV127().clear();
				getPV127().addAll((Collection<? extends PV127CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV128:
				setPV128((PV128CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV129:
				setPV129((PV129CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV130:
				setPV130((PV130CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV131:
				setPV131((PV131CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV132:
				setPV132((PV132CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV133:
				setPV133((PV133CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV134:
				setPV134((PV134CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV135:
				setPV135((PV135CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV136:
				setPV136((PV136CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV137:
				setPV137((PV137CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV138:
				setPV138((PV138CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV139:
				setPV139((PV139CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV140:
				setPV140((PV140CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV141:
				setPV141((PV141CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV142:
				setPV142((PV142CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV143:
				setPV143((PV143CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV144:
				setPV144((PV144CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV145:
				getPV145().clear();
				getPV145().addAll((Collection<? extends PV145CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV146:
				setPV146((PV146CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV147:
				setPV147((PV147CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV148:
				setPV148((PV148CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV149:
				setPV149((PV149CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV150:
				setPV150((PV150CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV151:
				setPV151((PV151CONTENT)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__PV152:
				getPV152().clear();
				getPV152().addAll((Collection<? extends PV152CONTENT>)newValue);
				return;
			case V2xmlPackage.PV1CONTENT__ANY:
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
			case V2xmlPackage.PV1CONTENT__PV11:
				setPV11((PV11CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV12:
				setPV12((PV12CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV13:
				setPV13((PV13CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV14:
				setPV14((PV14CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV15:
				setPV15((PV15CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV16:
				setPV16((PV16CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV17:
				getPV17().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV18:
				getPV18().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV19:
				getPV19().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV110:
				setPV110((PV110CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV111:
				setPV111((PV111CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV112:
				setPV112((PV112CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV113:
				setPV113((PV113CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV114:
				setPV114((PV114CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV115:
				getPV115().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV116:
				setPV116((PV116CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV117:
				getPV117().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV118:
				setPV118((PV118CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV119:
				setPV119((PV119CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV120:
				getPV120().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV121:
				setPV121((PV121CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV122:
				setPV122((PV122CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV123:
				setPV123((PV123CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV124:
				getPV124().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV125:
				getPV125().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV126:
				getPV126().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV127:
				getPV127().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV128:
				setPV128((PV128CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV129:
				setPV129((PV129CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV130:
				setPV130((PV130CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV131:
				setPV131((PV131CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV132:
				setPV132((PV132CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV133:
				setPV133((PV133CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV134:
				setPV134((PV134CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV135:
				setPV135((PV135CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV136:
				setPV136((PV136CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV137:
				setPV137((PV137CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV138:
				setPV138((PV138CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV139:
				setPV139((PV139CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV140:
				setPV140((PV140CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV141:
				setPV141((PV141CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV142:
				setPV142((PV142CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV143:
				setPV143((PV143CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV144:
				setPV144((PV144CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV145:
				getPV145().clear();
				return;
			case V2xmlPackage.PV1CONTENT__PV146:
				setPV146((PV146CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV147:
				setPV147((PV147CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV148:
				setPV148((PV148CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV149:
				setPV149((PV149CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV150:
				setPV150((PV150CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV151:
				setPV151((PV151CONTENT)null);
				return;
			case V2xmlPackage.PV1CONTENT__PV152:
				getPV152().clear();
				return;
			case V2xmlPackage.PV1CONTENT__ANY:
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
			case V2xmlPackage.PV1CONTENT__PV11:
				return pV11 != null;
			case V2xmlPackage.PV1CONTENT__PV12:
				return pV12 != null;
			case V2xmlPackage.PV1CONTENT__PV13:
				return pV13 != null;
			case V2xmlPackage.PV1CONTENT__PV14:
				return pV14 != null;
			case V2xmlPackage.PV1CONTENT__PV15:
				return pV15 != null;
			case V2xmlPackage.PV1CONTENT__PV16:
				return pV16 != null;
			case V2xmlPackage.PV1CONTENT__PV17:
				return pV17 != null && !pV17.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV18:
				return pV18 != null && !pV18.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV19:
				return pV19 != null && !pV19.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV110:
				return pV110 != null;
			case V2xmlPackage.PV1CONTENT__PV111:
				return pV111 != null;
			case V2xmlPackage.PV1CONTENT__PV112:
				return pV112 != null;
			case V2xmlPackage.PV1CONTENT__PV113:
				return pV113 != null;
			case V2xmlPackage.PV1CONTENT__PV114:
				return pV114 != null;
			case V2xmlPackage.PV1CONTENT__PV115:
				return pV115 != null && !pV115.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV116:
				return pV116 != null;
			case V2xmlPackage.PV1CONTENT__PV117:
				return pV117 != null && !pV117.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV118:
				return pV118 != null;
			case V2xmlPackage.PV1CONTENT__PV119:
				return pV119 != null;
			case V2xmlPackage.PV1CONTENT__PV120:
				return pV120 != null && !pV120.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV121:
				return pV121 != null;
			case V2xmlPackage.PV1CONTENT__PV122:
				return pV122 != null;
			case V2xmlPackage.PV1CONTENT__PV123:
				return pV123 != null;
			case V2xmlPackage.PV1CONTENT__PV124:
				return pV124 != null && !pV124.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV125:
				return pV125 != null && !pV125.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV126:
				return pV126 != null && !pV126.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV127:
				return pV127 != null && !pV127.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV128:
				return pV128 != null;
			case V2xmlPackage.PV1CONTENT__PV129:
				return pV129 != null;
			case V2xmlPackage.PV1CONTENT__PV130:
				return pV130 != null;
			case V2xmlPackage.PV1CONTENT__PV131:
				return pV131 != null;
			case V2xmlPackage.PV1CONTENT__PV132:
				return pV132 != null;
			case V2xmlPackage.PV1CONTENT__PV133:
				return pV133 != null;
			case V2xmlPackage.PV1CONTENT__PV134:
				return pV134 != null;
			case V2xmlPackage.PV1CONTENT__PV135:
				return pV135 != null;
			case V2xmlPackage.PV1CONTENT__PV136:
				return pV136 != null;
			case V2xmlPackage.PV1CONTENT__PV137:
				return pV137 != null;
			case V2xmlPackage.PV1CONTENT__PV138:
				return pV138 != null;
			case V2xmlPackage.PV1CONTENT__PV139:
				return pV139 != null;
			case V2xmlPackage.PV1CONTENT__PV140:
				return pV140 != null;
			case V2xmlPackage.PV1CONTENT__PV141:
				return pV141 != null;
			case V2xmlPackage.PV1CONTENT__PV142:
				return pV142 != null;
			case V2xmlPackage.PV1CONTENT__PV143:
				return pV143 != null;
			case V2xmlPackage.PV1CONTENT__PV144:
				return pV144 != null;
			case V2xmlPackage.PV1CONTENT__PV145:
				return pV145 != null && !pV145.isEmpty();
			case V2xmlPackage.PV1CONTENT__PV146:
				return pV146 != null;
			case V2xmlPackage.PV1CONTENT__PV147:
				return pV147 != null;
			case V2xmlPackage.PV1CONTENT__PV148:
				return pV148 != null;
			case V2xmlPackage.PV1CONTENT__PV149:
				return pV149 != null;
			case V2xmlPackage.PV1CONTENT__PV150:
				return pV150 != null;
			case V2xmlPackage.PV1CONTENT__PV151:
				return pV151 != null;
			case V2xmlPackage.PV1CONTENT__PV152:
				return pV152 != null && !pV152.isEmpty();
			case V2xmlPackage.PV1CONTENT__ANY:
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

} //PV1CONTENTImpl
