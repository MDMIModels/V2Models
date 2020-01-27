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

import org.hl7.v2xml.GT110CONTENT;
import org.hl7.v2xml.GT111CONTENT;
import org.hl7.v2xml.GT112CONTENT;
import org.hl7.v2xml.GT113CONTENT;
import org.hl7.v2xml.GT114CONTENT;
import org.hl7.v2xml.GT115CONTENT;
import org.hl7.v2xml.GT116CONTENT;
import org.hl7.v2xml.GT117CONTENT;
import org.hl7.v2xml.GT118CONTENT;
import org.hl7.v2xml.GT119CONTENT;
import org.hl7.v2xml.GT11CONTENT;
import org.hl7.v2xml.GT120CONTENT;
import org.hl7.v2xml.GT121CONTENT;
import org.hl7.v2xml.GT122CONTENT;
import org.hl7.v2xml.GT123CONTENT;
import org.hl7.v2xml.GT124CONTENT;
import org.hl7.v2xml.GT125CONTENT;
import org.hl7.v2xml.GT126CONTENT;
import org.hl7.v2xml.GT127CONTENT;
import org.hl7.v2xml.GT128CONTENT;
import org.hl7.v2xml.GT129CONTENT;
import org.hl7.v2xml.GT12CONTENT;
import org.hl7.v2xml.GT130CONTENT;
import org.hl7.v2xml.GT131CONTENT;
import org.hl7.v2xml.GT132CONTENT;
import org.hl7.v2xml.GT133CONTENT;
import org.hl7.v2xml.GT134CONTENT;
import org.hl7.v2xml.GT135CONTENT;
import org.hl7.v2xml.GT136CONTENT;
import org.hl7.v2xml.GT137CONTENT;
import org.hl7.v2xml.GT138CONTENT;
import org.hl7.v2xml.GT139CONTENT;
import org.hl7.v2xml.GT13CONTENT;
import org.hl7.v2xml.GT140CONTENT;
import org.hl7.v2xml.GT141CONTENT;
import org.hl7.v2xml.GT142CONTENT;
import org.hl7.v2xml.GT143CONTENT;
import org.hl7.v2xml.GT144CONTENT;
import org.hl7.v2xml.GT145CONTENT;
import org.hl7.v2xml.GT146CONTENT;
import org.hl7.v2xml.GT147CONTENT;
import org.hl7.v2xml.GT148CONTENT;
import org.hl7.v2xml.GT149CONTENT;
import org.hl7.v2xml.GT14CONTENT;
import org.hl7.v2xml.GT150CONTENT;
import org.hl7.v2xml.GT151CONTENT;
import org.hl7.v2xml.GT152CONTENT;
import org.hl7.v2xml.GT153CONTENT;
import org.hl7.v2xml.GT154CONTENT;
import org.hl7.v2xml.GT155CONTENT;
import org.hl7.v2xml.GT156CONTENT;
import org.hl7.v2xml.GT157CONTENT;
import org.hl7.v2xml.GT15CONTENT;
import org.hl7.v2xml.GT16CONTENT;
import org.hl7.v2xml.GT17CONTENT;
import org.hl7.v2xml.GT18CONTENT;
import org.hl7.v2xml.GT19CONTENT;
import org.hl7.v2xml.GT1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GT1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT11 <em>GT11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT12 <em>GT12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT13 <em>GT13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT14 <em>GT14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT15 <em>GT15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT16 <em>GT16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT17 <em>GT17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT18 <em>GT18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT19 <em>GT19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT110 <em>GT110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT111 <em>GT111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT112 <em>GT112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT113 <em>GT113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT114 <em>GT114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT115 <em>GT115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT116 <em>GT116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT117 <em>GT117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT118 <em>GT118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT119 <em>GT119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT120 <em>GT120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT121 <em>GT121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT122 <em>GT122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT123 <em>GT123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT124 <em>GT124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT125 <em>GT125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT126 <em>GT126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT127 <em>GT127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT128 <em>GT128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT129 <em>GT129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT130 <em>GT130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT131 <em>GT131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT132 <em>GT132</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT133 <em>GT133</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT134 <em>GT134</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT135 <em>GT135</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT136 <em>GT136</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT137 <em>GT137</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT138 <em>GT138</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT139 <em>GT139</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT140 <em>GT140</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT141 <em>GT141</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT142 <em>GT142</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT143 <em>GT143</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT144 <em>GT144</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT145 <em>GT145</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT146 <em>GT146</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT147 <em>GT147</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT148 <em>GT148</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT149 <em>GT149</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT150 <em>GT150</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT151 <em>GT151</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT152 <em>GT152</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT153 <em>GT153</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT154 <em>GT154</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT155 <em>GT155</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT156 <em>GT156</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getGT157 <em>GT157</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.GT1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GT1CONTENTImpl extends EObjectImpl implements GT1CONTENT {
	/**
	 * The cached value of the '{@link #getGT11() <em>GT11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT11()
	 * @generated
	 * @ordered
	 */
	protected GT11CONTENT gT11;

	/**
	 * The cached value of the '{@link #getGT12() <em>GT12</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT12()
	 * @generated
	 * @ordered
	 */
	protected EList<GT12CONTENT> gT12;

	/**
	 * The cached value of the '{@link #getGT13() <em>GT13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT13()
	 * @generated
	 * @ordered
	 */
	protected EList<GT13CONTENT> gT13;

	/**
	 * The cached value of the '{@link #getGT14() <em>GT14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT14()
	 * @generated
	 * @ordered
	 */
	protected EList<GT14CONTENT> gT14;

	/**
	 * The cached value of the '{@link #getGT15() <em>GT15</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT15()
	 * @generated
	 * @ordered
	 */
	protected EList<GT15CONTENT> gT15;

	/**
	 * The cached value of the '{@link #getGT16() <em>GT16</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT16()
	 * @generated
	 * @ordered
	 */
	protected EList<GT16CONTENT> gT16;

	/**
	 * The cached value of the '{@link #getGT17() <em>GT17</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT17()
	 * @generated
	 * @ordered
	 */
	protected EList<GT17CONTENT> gT17;

	/**
	 * The cached value of the '{@link #getGT18() <em>GT18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT18()
	 * @generated
	 * @ordered
	 */
	protected GT18CONTENT gT18;

	/**
	 * The cached value of the '{@link #getGT19() <em>GT19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT19()
	 * @generated
	 * @ordered
	 */
	protected GT19CONTENT gT19;

	/**
	 * The cached value of the '{@link #getGT110() <em>GT110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT110()
	 * @generated
	 * @ordered
	 */
	protected GT110CONTENT gT110;

	/**
	 * The cached value of the '{@link #getGT111() <em>GT111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT111()
	 * @generated
	 * @ordered
	 */
	protected GT111CONTENT gT111;

	/**
	 * The cached value of the '{@link #getGT112() <em>GT112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT112()
	 * @generated
	 * @ordered
	 */
	protected GT112CONTENT gT112;

	/**
	 * The cached value of the '{@link #getGT113() <em>GT113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT113()
	 * @generated
	 * @ordered
	 */
	protected GT113CONTENT gT113;

	/**
	 * The cached value of the '{@link #getGT114() <em>GT114</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT114()
	 * @generated
	 * @ordered
	 */
	protected GT114CONTENT gT114;

	/**
	 * The cached value of the '{@link #getGT115() <em>GT115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT115()
	 * @generated
	 * @ordered
	 */
	protected GT115CONTENT gT115;

	/**
	 * The cached value of the '{@link #getGT116() <em>GT116</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT116()
	 * @generated
	 * @ordered
	 */
	protected EList<GT116CONTENT> gT116;

	/**
	 * The cached value of the '{@link #getGT117() <em>GT117</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT117()
	 * @generated
	 * @ordered
	 */
	protected EList<GT117CONTENT> gT117;

	/**
	 * The cached value of the '{@link #getGT118() <em>GT118</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT118()
	 * @generated
	 * @ordered
	 */
	protected EList<GT118CONTENT> gT118;

	/**
	 * The cached value of the '{@link #getGT119() <em>GT119</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT119()
	 * @generated
	 * @ordered
	 */
	protected EList<GT119CONTENT> gT119;

	/**
	 * The cached value of the '{@link #getGT120() <em>GT120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT120()
	 * @generated
	 * @ordered
	 */
	protected GT120CONTENT gT120;

	/**
	 * The cached value of the '{@link #getGT121() <em>GT121</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT121()
	 * @generated
	 * @ordered
	 */
	protected EList<GT121CONTENT> gT121;

	/**
	 * The cached value of the '{@link #getGT122() <em>GT122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT122()
	 * @generated
	 * @ordered
	 */
	protected GT122CONTENT gT122;

	/**
	 * The cached value of the '{@link #getGT123() <em>GT123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT123()
	 * @generated
	 * @ordered
	 */
	protected GT123CONTENT gT123;

	/**
	 * The cached value of the '{@link #getGT124() <em>GT124</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT124()
	 * @generated
	 * @ordered
	 */
	protected GT124CONTENT gT124;

	/**
	 * The cached value of the '{@link #getGT125() <em>GT125</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT125()
	 * @generated
	 * @ordered
	 */
	protected GT125CONTENT gT125;

	/**
	 * The cached value of the '{@link #getGT126() <em>GT126</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT126()
	 * @generated
	 * @ordered
	 */
	protected GT126CONTENT gT126;

	/**
	 * The cached value of the '{@link #getGT127() <em>GT127</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT127()
	 * @generated
	 * @ordered
	 */
	protected GT127CONTENT gT127;

	/**
	 * The cached value of the '{@link #getGT128() <em>GT128</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT128()
	 * @generated
	 * @ordered
	 */
	protected GT128CONTENT gT128;

	/**
	 * The cached value of the '{@link #getGT129() <em>GT129</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT129()
	 * @generated
	 * @ordered
	 */
	protected EList<GT129CONTENT> gT129;

	/**
	 * The cached value of the '{@link #getGT130() <em>GT130</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT130()
	 * @generated
	 * @ordered
	 */
	protected GT130CONTENT gT130;

	/**
	 * The cached value of the '{@link #getGT131() <em>GT131</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT131()
	 * @generated
	 * @ordered
	 */
	protected GT131CONTENT gT131;

	/**
	 * The cached value of the '{@link #getGT132() <em>GT132</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT132()
	 * @generated
	 * @ordered
	 */
	protected GT132CONTENT gT132;

	/**
	 * The cached value of the '{@link #getGT133() <em>GT133</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT133()
	 * @generated
	 * @ordered
	 */
	protected GT133CONTENT gT133;

	/**
	 * The cached value of the '{@link #getGT134() <em>GT134</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT134()
	 * @generated
	 * @ordered
	 */
	protected EList<GT134CONTENT> gT134;

	/**
	 * The cached value of the '{@link #getGT135() <em>GT135</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT135()
	 * @generated
	 * @ordered
	 */
	protected EList<GT135CONTENT> gT135;

	/**
	 * The cached value of the '{@link #getGT136() <em>GT136</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT136()
	 * @generated
	 * @ordered
	 */
	protected GT136CONTENT gT136;

	/**
	 * The cached value of the '{@link #getGT137() <em>GT137</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT137()
	 * @generated
	 * @ordered
	 */
	protected GT137CONTENT gT137;

	/**
	 * The cached value of the '{@link #getGT138() <em>GT138</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT138()
	 * @generated
	 * @ordered
	 */
	protected GT138CONTENT gT138;

	/**
	 * The cached value of the '{@link #getGT139() <em>GT139</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT139()
	 * @generated
	 * @ordered
	 */
	protected GT139CONTENT gT139;

	/**
	 * The cached value of the '{@link #getGT140() <em>GT140</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT140()
	 * @generated
	 * @ordered
	 */
	protected GT140CONTENT gT140;

	/**
	 * The cached value of the '{@link #getGT141() <em>GT141</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT141()
	 * @generated
	 * @ordered
	 */
	protected GT141CONTENT gT141;

	/**
	 * The cached value of the '{@link #getGT142() <em>GT142</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT142()
	 * @generated
	 * @ordered
	 */
	protected EList<GT142CONTENT> gT142;

	/**
	 * The cached value of the '{@link #getGT143() <em>GT143</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT143()
	 * @generated
	 * @ordered
	 */
	protected GT143CONTENT gT143;

	/**
	 * The cached value of the '{@link #getGT144() <em>GT144</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT144()
	 * @generated
	 * @ordered
	 */
	protected EList<GT144CONTENT> gT144;

	/**
	 * The cached value of the '{@link #getGT145() <em>GT145</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT145()
	 * @generated
	 * @ordered
	 */
	protected EList<GT145CONTENT> gT145;

	/**
	 * The cached value of the '{@link #getGT146() <em>GT146</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT146()
	 * @generated
	 * @ordered
	 */
	protected EList<GT146CONTENT> gT146;

	/**
	 * The cached value of the '{@link #getGT147() <em>GT147</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT147()
	 * @generated
	 * @ordered
	 */
	protected GT147CONTENT gT147;

	/**
	 * The cached value of the '{@link #getGT148() <em>GT148</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT148()
	 * @generated
	 * @ordered
	 */
	protected GT148CONTENT gT148;

	/**
	 * The cached value of the '{@link #getGT149() <em>GT149</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT149()
	 * @generated
	 * @ordered
	 */
	protected GT149CONTENT gT149;

	/**
	 * The cached value of the '{@link #getGT150() <em>GT150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT150()
	 * @generated
	 * @ordered
	 */
	protected GT150CONTENT gT150;

	/**
	 * The cached value of the '{@link #getGT151() <em>GT151</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT151()
	 * @generated
	 * @ordered
	 */
	protected EList<GT151CONTENT> gT151;

	/**
	 * The cached value of the '{@link #getGT152() <em>GT152</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT152()
	 * @generated
	 * @ordered
	 */
	protected GT152CONTENT gT152;

	/**
	 * The cached value of the '{@link #getGT153() <em>GT153</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT153()
	 * @generated
	 * @ordered
	 */
	protected GT153CONTENT gT153;

	/**
	 * The cached value of the '{@link #getGT154() <em>GT154</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT154()
	 * @generated
	 * @ordered
	 */
	protected GT154CONTENT gT154;

	/**
	 * The cached value of the '{@link #getGT155() <em>GT155</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT155()
	 * @generated
	 * @ordered
	 */
	protected EList<GT155CONTENT> gT155;

	/**
	 * The cached value of the '{@link #getGT156() <em>GT156</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT156()
	 * @generated
	 * @ordered
	 */
	protected GT156CONTENT gT156;

	/**
	 * The cached value of the '{@link #getGT157() <em>GT157</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGT157()
	 * @generated
	 * @ordered
	 */
	protected GT157CONTENT gT157;

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
	protected GT1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getGT1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT11CONTENT getGT11() {
		return gT11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT11(GT11CONTENT newGT11, NotificationChain msgs) {
		GT11CONTENT oldGT11 = gT11;
		gT11 = newGT11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT11, oldGT11, newGT11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT11(GT11CONTENT newGT11) {
		if (newGT11 != gT11) {
			NotificationChain msgs = null;
			if (gT11 != null)
				msgs = ((InternalEObject)gT11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT11, null, msgs);
			if (newGT11 != null)
				msgs = ((InternalEObject)newGT11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT11, null, msgs);
			msgs = basicSetGT11(newGT11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT11, newGT11, newGT11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT12CONTENT> getGT12() {
		if (gT12 == null) {
			gT12 = new EObjectContainmentEList<GT12CONTENT>(GT12CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT12);
		}
		return gT12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT13CONTENT> getGT13() {
		if (gT13 == null) {
			gT13 = new EObjectContainmentEList<GT13CONTENT>(GT13CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT13);
		}
		return gT13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT14CONTENT> getGT14() {
		if (gT14 == null) {
			gT14 = new EObjectContainmentEList<GT14CONTENT>(GT14CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT14);
		}
		return gT14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT15CONTENT> getGT15() {
		if (gT15 == null) {
			gT15 = new EObjectContainmentEList<GT15CONTENT>(GT15CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT15);
		}
		return gT15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT16CONTENT> getGT16() {
		if (gT16 == null) {
			gT16 = new EObjectContainmentEList<GT16CONTENT>(GT16CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT16);
		}
		return gT16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT17CONTENT> getGT17() {
		if (gT17 == null) {
			gT17 = new EObjectContainmentEList<GT17CONTENT>(GT17CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT17);
		}
		return gT17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT18CONTENT getGT18() {
		return gT18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT18(GT18CONTENT newGT18, NotificationChain msgs) {
		GT18CONTENT oldGT18 = gT18;
		gT18 = newGT18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT18, oldGT18, newGT18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT18(GT18CONTENT newGT18) {
		if (newGT18 != gT18) {
			NotificationChain msgs = null;
			if (gT18 != null)
				msgs = ((InternalEObject)gT18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT18, null, msgs);
			if (newGT18 != null)
				msgs = ((InternalEObject)newGT18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT18, null, msgs);
			msgs = basicSetGT18(newGT18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT18, newGT18, newGT18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT19CONTENT getGT19() {
		return gT19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT19(GT19CONTENT newGT19, NotificationChain msgs) {
		GT19CONTENT oldGT19 = gT19;
		gT19 = newGT19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT19, oldGT19, newGT19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT19(GT19CONTENT newGT19) {
		if (newGT19 != gT19) {
			NotificationChain msgs = null;
			if (gT19 != null)
				msgs = ((InternalEObject)gT19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT19, null, msgs);
			if (newGT19 != null)
				msgs = ((InternalEObject)newGT19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT19, null, msgs);
			msgs = basicSetGT19(newGT19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT19, newGT19, newGT19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT110CONTENT getGT110() {
		return gT110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT110(GT110CONTENT newGT110, NotificationChain msgs) {
		GT110CONTENT oldGT110 = gT110;
		gT110 = newGT110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT110, oldGT110, newGT110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT110(GT110CONTENT newGT110) {
		if (newGT110 != gT110) {
			NotificationChain msgs = null;
			if (gT110 != null)
				msgs = ((InternalEObject)gT110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT110, null, msgs);
			if (newGT110 != null)
				msgs = ((InternalEObject)newGT110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT110, null, msgs);
			msgs = basicSetGT110(newGT110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT110, newGT110, newGT110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT111CONTENT getGT111() {
		return gT111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT111(GT111CONTENT newGT111, NotificationChain msgs) {
		GT111CONTENT oldGT111 = gT111;
		gT111 = newGT111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT111, oldGT111, newGT111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT111(GT111CONTENT newGT111) {
		if (newGT111 != gT111) {
			NotificationChain msgs = null;
			if (gT111 != null)
				msgs = ((InternalEObject)gT111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT111, null, msgs);
			if (newGT111 != null)
				msgs = ((InternalEObject)newGT111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT111, null, msgs);
			msgs = basicSetGT111(newGT111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT111, newGT111, newGT111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT112CONTENT getGT112() {
		return gT112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT112(GT112CONTENT newGT112, NotificationChain msgs) {
		GT112CONTENT oldGT112 = gT112;
		gT112 = newGT112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT112, oldGT112, newGT112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT112(GT112CONTENT newGT112) {
		if (newGT112 != gT112) {
			NotificationChain msgs = null;
			if (gT112 != null)
				msgs = ((InternalEObject)gT112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT112, null, msgs);
			if (newGT112 != null)
				msgs = ((InternalEObject)newGT112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT112, null, msgs);
			msgs = basicSetGT112(newGT112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT112, newGT112, newGT112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT113CONTENT getGT113() {
		return gT113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT113(GT113CONTENT newGT113, NotificationChain msgs) {
		GT113CONTENT oldGT113 = gT113;
		gT113 = newGT113;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT113, oldGT113, newGT113);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT113(GT113CONTENT newGT113) {
		if (newGT113 != gT113) {
			NotificationChain msgs = null;
			if (gT113 != null)
				msgs = ((InternalEObject)gT113).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT113, null, msgs);
			if (newGT113 != null)
				msgs = ((InternalEObject)newGT113).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT113, null, msgs);
			msgs = basicSetGT113(newGT113, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT113, newGT113, newGT113));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT114CONTENT getGT114() {
		return gT114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT114(GT114CONTENT newGT114, NotificationChain msgs) {
		GT114CONTENT oldGT114 = gT114;
		gT114 = newGT114;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT114, oldGT114, newGT114);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT114(GT114CONTENT newGT114) {
		if (newGT114 != gT114) {
			NotificationChain msgs = null;
			if (gT114 != null)
				msgs = ((InternalEObject)gT114).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT114, null, msgs);
			if (newGT114 != null)
				msgs = ((InternalEObject)newGT114).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT114, null, msgs);
			msgs = basicSetGT114(newGT114, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT114, newGT114, newGT114));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT115CONTENT getGT115() {
		return gT115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT115(GT115CONTENT newGT115, NotificationChain msgs) {
		GT115CONTENT oldGT115 = gT115;
		gT115 = newGT115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT115, oldGT115, newGT115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT115(GT115CONTENT newGT115) {
		if (newGT115 != gT115) {
			NotificationChain msgs = null;
			if (gT115 != null)
				msgs = ((InternalEObject)gT115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT115, null, msgs);
			if (newGT115 != null)
				msgs = ((InternalEObject)newGT115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT115, null, msgs);
			msgs = basicSetGT115(newGT115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT115, newGT115, newGT115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT116CONTENT> getGT116() {
		if (gT116 == null) {
			gT116 = new EObjectContainmentEList<GT116CONTENT>(GT116CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT116);
		}
		return gT116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT117CONTENT> getGT117() {
		if (gT117 == null) {
			gT117 = new EObjectContainmentEList<GT117CONTENT>(GT117CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT117);
		}
		return gT117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT118CONTENT> getGT118() {
		if (gT118 == null) {
			gT118 = new EObjectContainmentEList<GT118CONTENT>(GT118CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT118);
		}
		return gT118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT119CONTENT> getGT119() {
		if (gT119 == null) {
			gT119 = new EObjectContainmentEList<GT119CONTENT>(GT119CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT119);
		}
		return gT119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT120CONTENT getGT120() {
		return gT120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT120(GT120CONTENT newGT120, NotificationChain msgs) {
		GT120CONTENT oldGT120 = gT120;
		gT120 = newGT120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT120, oldGT120, newGT120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT120(GT120CONTENT newGT120) {
		if (newGT120 != gT120) {
			NotificationChain msgs = null;
			if (gT120 != null)
				msgs = ((InternalEObject)gT120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT120, null, msgs);
			if (newGT120 != null)
				msgs = ((InternalEObject)newGT120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT120, null, msgs);
			msgs = basicSetGT120(newGT120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT120, newGT120, newGT120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT121CONTENT> getGT121() {
		if (gT121 == null) {
			gT121 = new EObjectContainmentEList<GT121CONTENT>(GT121CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT121);
		}
		return gT121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT122CONTENT getGT122() {
		return gT122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT122(GT122CONTENT newGT122, NotificationChain msgs) {
		GT122CONTENT oldGT122 = gT122;
		gT122 = newGT122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT122, oldGT122, newGT122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT122(GT122CONTENT newGT122) {
		if (newGT122 != gT122) {
			NotificationChain msgs = null;
			if (gT122 != null)
				msgs = ((InternalEObject)gT122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT122, null, msgs);
			if (newGT122 != null)
				msgs = ((InternalEObject)newGT122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT122, null, msgs);
			msgs = basicSetGT122(newGT122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT122, newGT122, newGT122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT123CONTENT getGT123() {
		return gT123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT123(GT123CONTENT newGT123, NotificationChain msgs) {
		GT123CONTENT oldGT123 = gT123;
		gT123 = newGT123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT123, oldGT123, newGT123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT123(GT123CONTENT newGT123) {
		if (newGT123 != gT123) {
			NotificationChain msgs = null;
			if (gT123 != null)
				msgs = ((InternalEObject)gT123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT123, null, msgs);
			if (newGT123 != null)
				msgs = ((InternalEObject)newGT123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT123, null, msgs);
			msgs = basicSetGT123(newGT123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT123, newGT123, newGT123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT124CONTENT getGT124() {
		return gT124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT124(GT124CONTENT newGT124, NotificationChain msgs) {
		GT124CONTENT oldGT124 = gT124;
		gT124 = newGT124;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT124, oldGT124, newGT124);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT124(GT124CONTENT newGT124) {
		if (newGT124 != gT124) {
			NotificationChain msgs = null;
			if (gT124 != null)
				msgs = ((InternalEObject)gT124).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT124, null, msgs);
			if (newGT124 != null)
				msgs = ((InternalEObject)newGT124).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT124, null, msgs);
			msgs = basicSetGT124(newGT124, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT124, newGT124, newGT124));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT125CONTENT getGT125() {
		return gT125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT125(GT125CONTENT newGT125, NotificationChain msgs) {
		GT125CONTENT oldGT125 = gT125;
		gT125 = newGT125;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT125, oldGT125, newGT125);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT125(GT125CONTENT newGT125) {
		if (newGT125 != gT125) {
			NotificationChain msgs = null;
			if (gT125 != null)
				msgs = ((InternalEObject)gT125).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT125, null, msgs);
			if (newGT125 != null)
				msgs = ((InternalEObject)newGT125).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT125, null, msgs);
			msgs = basicSetGT125(newGT125, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT125, newGT125, newGT125));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT126CONTENT getGT126() {
		return gT126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT126(GT126CONTENT newGT126, NotificationChain msgs) {
		GT126CONTENT oldGT126 = gT126;
		gT126 = newGT126;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT126, oldGT126, newGT126);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT126(GT126CONTENT newGT126) {
		if (newGT126 != gT126) {
			NotificationChain msgs = null;
			if (gT126 != null)
				msgs = ((InternalEObject)gT126).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT126, null, msgs);
			if (newGT126 != null)
				msgs = ((InternalEObject)newGT126).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT126, null, msgs);
			msgs = basicSetGT126(newGT126, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT126, newGT126, newGT126));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT127CONTENT getGT127() {
		return gT127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT127(GT127CONTENT newGT127, NotificationChain msgs) {
		GT127CONTENT oldGT127 = gT127;
		gT127 = newGT127;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT127, oldGT127, newGT127);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT127(GT127CONTENT newGT127) {
		if (newGT127 != gT127) {
			NotificationChain msgs = null;
			if (gT127 != null)
				msgs = ((InternalEObject)gT127).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT127, null, msgs);
			if (newGT127 != null)
				msgs = ((InternalEObject)newGT127).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT127, null, msgs);
			msgs = basicSetGT127(newGT127, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT127, newGT127, newGT127));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT128CONTENT getGT128() {
		return gT128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT128(GT128CONTENT newGT128, NotificationChain msgs) {
		GT128CONTENT oldGT128 = gT128;
		gT128 = newGT128;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT128, oldGT128, newGT128);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT128(GT128CONTENT newGT128) {
		if (newGT128 != gT128) {
			NotificationChain msgs = null;
			if (gT128 != null)
				msgs = ((InternalEObject)gT128).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT128, null, msgs);
			if (newGT128 != null)
				msgs = ((InternalEObject)newGT128).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT128, null, msgs);
			msgs = basicSetGT128(newGT128, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT128, newGT128, newGT128));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT129CONTENT> getGT129() {
		if (gT129 == null) {
			gT129 = new EObjectContainmentEList<GT129CONTENT>(GT129CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT129);
		}
		return gT129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT130CONTENT getGT130() {
		return gT130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT130(GT130CONTENT newGT130, NotificationChain msgs) {
		GT130CONTENT oldGT130 = gT130;
		gT130 = newGT130;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT130, oldGT130, newGT130);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT130(GT130CONTENT newGT130) {
		if (newGT130 != gT130) {
			NotificationChain msgs = null;
			if (gT130 != null)
				msgs = ((InternalEObject)gT130).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT130, null, msgs);
			if (newGT130 != null)
				msgs = ((InternalEObject)newGT130).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT130, null, msgs);
			msgs = basicSetGT130(newGT130, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT130, newGT130, newGT130));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT131CONTENT getGT131() {
		return gT131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT131(GT131CONTENT newGT131, NotificationChain msgs) {
		GT131CONTENT oldGT131 = gT131;
		gT131 = newGT131;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT131, oldGT131, newGT131);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT131(GT131CONTENT newGT131) {
		if (newGT131 != gT131) {
			NotificationChain msgs = null;
			if (gT131 != null)
				msgs = ((InternalEObject)gT131).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT131, null, msgs);
			if (newGT131 != null)
				msgs = ((InternalEObject)newGT131).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT131, null, msgs);
			msgs = basicSetGT131(newGT131, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT131, newGT131, newGT131));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT132CONTENT getGT132() {
		return gT132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT132(GT132CONTENT newGT132, NotificationChain msgs) {
		GT132CONTENT oldGT132 = gT132;
		gT132 = newGT132;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT132, oldGT132, newGT132);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT132(GT132CONTENT newGT132) {
		if (newGT132 != gT132) {
			NotificationChain msgs = null;
			if (gT132 != null)
				msgs = ((InternalEObject)gT132).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT132, null, msgs);
			if (newGT132 != null)
				msgs = ((InternalEObject)newGT132).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT132, null, msgs);
			msgs = basicSetGT132(newGT132, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT132, newGT132, newGT132));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT133CONTENT getGT133() {
		return gT133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT133(GT133CONTENT newGT133, NotificationChain msgs) {
		GT133CONTENT oldGT133 = gT133;
		gT133 = newGT133;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT133, oldGT133, newGT133);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT133(GT133CONTENT newGT133) {
		if (newGT133 != gT133) {
			NotificationChain msgs = null;
			if (gT133 != null)
				msgs = ((InternalEObject)gT133).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT133, null, msgs);
			if (newGT133 != null)
				msgs = ((InternalEObject)newGT133).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT133, null, msgs);
			msgs = basicSetGT133(newGT133, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT133, newGT133, newGT133));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT134CONTENT> getGT134() {
		if (gT134 == null) {
			gT134 = new EObjectContainmentEList<GT134CONTENT>(GT134CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT134);
		}
		return gT134;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT135CONTENT> getGT135() {
		if (gT135 == null) {
			gT135 = new EObjectContainmentEList<GT135CONTENT>(GT135CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT135);
		}
		return gT135;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT136CONTENT getGT136() {
		return gT136;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT136(GT136CONTENT newGT136, NotificationChain msgs) {
		GT136CONTENT oldGT136 = gT136;
		gT136 = newGT136;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT136, oldGT136, newGT136);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT136(GT136CONTENT newGT136) {
		if (newGT136 != gT136) {
			NotificationChain msgs = null;
			if (gT136 != null)
				msgs = ((InternalEObject)gT136).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT136, null, msgs);
			if (newGT136 != null)
				msgs = ((InternalEObject)newGT136).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT136, null, msgs);
			msgs = basicSetGT136(newGT136, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT136, newGT136, newGT136));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT137CONTENT getGT137() {
		return gT137;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT137(GT137CONTENT newGT137, NotificationChain msgs) {
		GT137CONTENT oldGT137 = gT137;
		gT137 = newGT137;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT137, oldGT137, newGT137);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT137(GT137CONTENT newGT137) {
		if (newGT137 != gT137) {
			NotificationChain msgs = null;
			if (gT137 != null)
				msgs = ((InternalEObject)gT137).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT137, null, msgs);
			if (newGT137 != null)
				msgs = ((InternalEObject)newGT137).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT137, null, msgs);
			msgs = basicSetGT137(newGT137, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT137, newGT137, newGT137));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT138CONTENT getGT138() {
		return gT138;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT138(GT138CONTENT newGT138, NotificationChain msgs) {
		GT138CONTENT oldGT138 = gT138;
		gT138 = newGT138;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT138, oldGT138, newGT138);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT138(GT138CONTENT newGT138) {
		if (newGT138 != gT138) {
			NotificationChain msgs = null;
			if (gT138 != null)
				msgs = ((InternalEObject)gT138).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT138, null, msgs);
			if (newGT138 != null)
				msgs = ((InternalEObject)newGT138).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT138, null, msgs);
			msgs = basicSetGT138(newGT138, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT138, newGT138, newGT138));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT139CONTENT getGT139() {
		return gT139;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT139(GT139CONTENT newGT139, NotificationChain msgs) {
		GT139CONTENT oldGT139 = gT139;
		gT139 = newGT139;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT139, oldGT139, newGT139);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT139(GT139CONTENT newGT139) {
		if (newGT139 != gT139) {
			NotificationChain msgs = null;
			if (gT139 != null)
				msgs = ((InternalEObject)gT139).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT139, null, msgs);
			if (newGT139 != null)
				msgs = ((InternalEObject)newGT139).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT139, null, msgs);
			msgs = basicSetGT139(newGT139, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT139, newGT139, newGT139));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT140CONTENT getGT140() {
		return gT140;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT140(GT140CONTENT newGT140, NotificationChain msgs) {
		GT140CONTENT oldGT140 = gT140;
		gT140 = newGT140;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT140, oldGT140, newGT140);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT140(GT140CONTENT newGT140) {
		if (newGT140 != gT140) {
			NotificationChain msgs = null;
			if (gT140 != null)
				msgs = ((InternalEObject)gT140).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT140, null, msgs);
			if (newGT140 != null)
				msgs = ((InternalEObject)newGT140).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT140, null, msgs);
			msgs = basicSetGT140(newGT140, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT140, newGT140, newGT140));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT141CONTENT getGT141() {
		return gT141;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT141(GT141CONTENT newGT141, NotificationChain msgs) {
		GT141CONTENT oldGT141 = gT141;
		gT141 = newGT141;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT141, oldGT141, newGT141);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT141(GT141CONTENT newGT141) {
		if (newGT141 != gT141) {
			NotificationChain msgs = null;
			if (gT141 != null)
				msgs = ((InternalEObject)gT141).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT141, null, msgs);
			if (newGT141 != null)
				msgs = ((InternalEObject)newGT141).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT141, null, msgs);
			msgs = basicSetGT141(newGT141, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT141, newGT141, newGT141));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT142CONTENT> getGT142() {
		if (gT142 == null) {
			gT142 = new EObjectContainmentEList<GT142CONTENT>(GT142CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT142);
		}
		return gT142;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT143CONTENT getGT143() {
		return gT143;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT143(GT143CONTENT newGT143, NotificationChain msgs) {
		GT143CONTENT oldGT143 = gT143;
		gT143 = newGT143;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT143, oldGT143, newGT143);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT143(GT143CONTENT newGT143) {
		if (newGT143 != gT143) {
			NotificationChain msgs = null;
			if (gT143 != null)
				msgs = ((InternalEObject)gT143).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT143, null, msgs);
			if (newGT143 != null)
				msgs = ((InternalEObject)newGT143).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT143, null, msgs);
			msgs = basicSetGT143(newGT143, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT143, newGT143, newGT143));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT144CONTENT> getGT144() {
		if (gT144 == null) {
			gT144 = new EObjectContainmentEList<GT144CONTENT>(GT144CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT144);
		}
		return gT144;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT145CONTENT> getGT145() {
		if (gT145 == null) {
			gT145 = new EObjectContainmentEList<GT145CONTENT>(GT145CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT145);
		}
		return gT145;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT146CONTENT> getGT146() {
		if (gT146 == null) {
			gT146 = new EObjectContainmentEList<GT146CONTENT>(GT146CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT146);
		}
		return gT146;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT147CONTENT getGT147() {
		return gT147;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT147(GT147CONTENT newGT147, NotificationChain msgs) {
		GT147CONTENT oldGT147 = gT147;
		gT147 = newGT147;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT147, oldGT147, newGT147);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT147(GT147CONTENT newGT147) {
		if (newGT147 != gT147) {
			NotificationChain msgs = null;
			if (gT147 != null)
				msgs = ((InternalEObject)gT147).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT147, null, msgs);
			if (newGT147 != null)
				msgs = ((InternalEObject)newGT147).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT147, null, msgs);
			msgs = basicSetGT147(newGT147, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT147, newGT147, newGT147));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT148CONTENT getGT148() {
		return gT148;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT148(GT148CONTENT newGT148, NotificationChain msgs) {
		GT148CONTENT oldGT148 = gT148;
		gT148 = newGT148;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT148, oldGT148, newGT148);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT148(GT148CONTENT newGT148) {
		if (newGT148 != gT148) {
			NotificationChain msgs = null;
			if (gT148 != null)
				msgs = ((InternalEObject)gT148).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT148, null, msgs);
			if (newGT148 != null)
				msgs = ((InternalEObject)newGT148).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT148, null, msgs);
			msgs = basicSetGT148(newGT148, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT148, newGT148, newGT148));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT149CONTENT getGT149() {
		return gT149;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT149(GT149CONTENT newGT149, NotificationChain msgs) {
		GT149CONTENT oldGT149 = gT149;
		gT149 = newGT149;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT149, oldGT149, newGT149);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT149(GT149CONTENT newGT149) {
		if (newGT149 != gT149) {
			NotificationChain msgs = null;
			if (gT149 != null)
				msgs = ((InternalEObject)gT149).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT149, null, msgs);
			if (newGT149 != null)
				msgs = ((InternalEObject)newGT149).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT149, null, msgs);
			msgs = basicSetGT149(newGT149, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT149, newGT149, newGT149));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT150CONTENT getGT150() {
		return gT150;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT150(GT150CONTENT newGT150, NotificationChain msgs) {
		GT150CONTENT oldGT150 = gT150;
		gT150 = newGT150;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT150, oldGT150, newGT150);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT150(GT150CONTENT newGT150) {
		if (newGT150 != gT150) {
			NotificationChain msgs = null;
			if (gT150 != null)
				msgs = ((InternalEObject)gT150).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT150, null, msgs);
			if (newGT150 != null)
				msgs = ((InternalEObject)newGT150).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT150, null, msgs);
			msgs = basicSetGT150(newGT150, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT150, newGT150, newGT150));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT151CONTENT> getGT151() {
		if (gT151 == null) {
			gT151 = new EObjectContainmentEList<GT151CONTENT>(GT151CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT151);
		}
		return gT151;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT152CONTENT getGT152() {
		return gT152;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT152(GT152CONTENT newGT152, NotificationChain msgs) {
		GT152CONTENT oldGT152 = gT152;
		gT152 = newGT152;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT152, oldGT152, newGT152);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT152(GT152CONTENT newGT152) {
		if (newGT152 != gT152) {
			NotificationChain msgs = null;
			if (gT152 != null)
				msgs = ((InternalEObject)gT152).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT152, null, msgs);
			if (newGT152 != null)
				msgs = ((InternalEObject)newGT152).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT152, null, msgs);
			msgs = basicSetGT152(newGT152, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT152, newGT152, newGT152));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT153CONTENT getGT153() {
		return gT153;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT153(GT153CONTENT newGT153, NotificationChain msgs) {
		GT153CONTENT oldGT153 = gT153;
		gT153 = newGT153;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT153, oldGT153, newGT153);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT153(GT153CONTENT newGT153) {
		if (newGT153 != gT153) {
			NotificationChain msgs = null;
			if (gT153 != null)
				msgs = ((InternalEObject)gT153).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT153, null, msgs);
			if (newGT153 != null)
				msgs = ((InternalEObject)newGT153).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT153, null, msgs);
			msgs = basicSetGT153(newGT153, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT153, newGT153, newGT153));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT154CONTENT getGT154() {
		return gT154;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT154(GT154CONTENT newGT154, NotificationChain msgs) {
		GT154CONTENT oldGT154 = gT154;
		gT154 = newGT154;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT154, oldGT154, newGT154);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT154(GT154CONTENT newGT154) {
		if (newGT154 != gT154) {
			NotificationChain msgs = null;
			if (gT154 != null)
				msgs = ((InternalEObject)gT154).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT154, null, msgs);
			if (newGT154 != null)
				msgs = ((InternalEObject)newGT154).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT154, null, msgs);
			msgs = basicSetGT154(newGT154, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT154, newGT154, newGT154));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GT155CONTENT> getGT155() {
		if (gT155 == null) {
			gT155 = new EObjectContainmentEList<GT155CONTENT>(GT155CONTENT.class, this, V2xmlPackage.GT1CONTENT__GT155);
		}
		return gT155;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT156CONTENT getGT156() {
		return gT156;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT156(GT156CONTENT newGT156, NotificationChain msgs) {
		GT156CONTENT oldGT156 = gT156;
		gT156 = newGT156;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT156, oldGT156, newGT156);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT156(GT156CONTENT newGT156) {
		if (newGT156 != gT156) {
			NotificationChain msgs = null;
			if (gT156 != null)
				msgs = ((InternalEObject)gT156).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT156, null, msgs);
			if (newGT156 != null)
				msgs = ((InternalEObject)newGT156).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT156, null, msgs);
			msgs = basicSetGT156(newGT156, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT156, newGT156, newGT156));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GT157CONTENT getGT157() {
		return gT157;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGT157(GT157CONTENT newGT157, NotificationChain msgs) {
		GT157CONTENT oldGT157 = gT157;
		gT157 = newGT157;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT157, oldGT157, newGT157);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGT157(GT157CONTENT newGT157) {
		if (newGT157 != gT157) {
			NotificationChain msgs = null;
			if (gT157 != null)
				msgs = ((InternalEObject)gT157).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT157, null, msgs);
			if (newGT157 != null)
				msgs = ((InternalEObject)newGT157).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.GT1CONTENT__GT157, null, msgs);
			msgs = basicSetGT157(newGT157, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.GT1CONTENT__GT157, newGT157, newGT157));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.GT1CONTENT__ANY);
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
			case V2xmlPackage.GT1CONTENT__GT11:
				return basicSetGT11(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT12:
				return ((InternalEList<?>)getGT12()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT13:
				return ((InternalEList<?>)getGT13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT14:
				return ((InternalEList<?>)getGT14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT15:
				return ((InternalEList<?>)getGT15()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT16:
				return ((InternalEList<?>)getGT16()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT17:
				return ((InternalEList<?>)getGT17()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT18:
				return basicSetGT18(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT19:
				return basicSetGT19(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT110:
				return basicSetGT110(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT111:
				return basicSetGT111(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT112:
				return basicSetGT112(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT113:
				return basicSetGT113(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT114:
				return basicSetGT114(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT115:
				return basicSetGT115(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT116:
				return ((InternalEList<?>)getGT116()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT117:
				return ((InternalEList<?>)getGT117()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT118:
				return ((InternalEList<?>)getGT118()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT119:
				return ((InternalEList<?>)getGT119()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT120:
				return basicSetGT120(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT121:
				return ((InternalEList<?>)getGT121()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT122:
				return basicSetGT122(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT123:
				return basicSetGT123(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT124:
				return basicSetGT124(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT125:
				return basicSetGT125(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT126:
				return basicSetGT126(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT127:
				return basicSetGT127(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT128:
				return basicSetGT128(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT129:
				return ((InternalEList<?>)getGT129()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT130:
				return basicSetGT130(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT131:
				return basicSetGT131(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT132:
				return basicSetGT132(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT133:
				return basicSetGT133(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT134:
				return ((InternalEList<?>)getGT134()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT135:
				return ((InternalEList<?>)getGT135()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT136:
				return basicSetGT136(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT137:
				return basicSetGT137(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT138:
				return basicSetGT138(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT139:
				return basicSetGT139(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT140:
				return basicSetGT140(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT141:
				return basicSetGT141(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT142:
				return ((InternalEList<?>)getGT142()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT143:
				return basicSetGT143(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT144:
				return ((InternalEList<?>)getGT144()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT145:
				return ((InternalEList<?>)getGT145()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT146:
				return ((InternalEList<?>)getGT146()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT147:
				return basicSetGT147(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT148:
				return basicSetGT148(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT149:
				return basicSetGT149(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT150:
				return basicSetGT150(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT151:
				return ((InternalEList<?>)getGT151()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT152:
				return basicSetGT152(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT153:
				return basicSetGT153(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT154:
				return basicSetGT154(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT155:
				return ((InternalEList<?>)getGT155()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.GT1CONTENT__GT156:
				return basicSetGT156(null, msgs);
			case V2xmlPackage.GT1CONTENT__GT157:
				return basicSetGT157(null, msgs);
			case V2xmlPackage.GT1CONTENT__ANY:
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
			case V2xmlPackage.GT1CONTENT__GT11:
				return getGT11();
			case V2xmlPackage.GT1CONTENT__GT12:
				return getGT12();
			case V2xmlPackage.GT1CONTENT__GT13:
				return getGT13();
			case V2xmlPackage.GT1CONTENT__GT14:
				return getGT14();
			case V2xmlPackage.GT1CONTENT__GT15:
				return getGT15();
			case V2xmlPackage.GT1CONTENT__GT16:
				return getGT16();
			case V2xmlPackage.GT1CONTENT__GT17:
				return getGT17();
			case V2xmlPackage.GT1CONTENT__GT18:
				return getGT18();
			case V2xmlPackage.GT1CONTENT__GT19:
				return getGT19();
			case V2xmlPackage.GT1CONTENT__GT110:
				return getGT110();
			case V2xmlPackage.GT1CONTENT__GT111:
				return getGT111();
			case V2xmlPackage.GT1CONTENT__GT112:
				return getGT112();
			case V2xmlPackage.GT1CONTENT__GT113:
				return getGT113();
			case V2xmlPackage.GT1CONTENT__GT114:
				return getGT114();
			case V2xmlPackage.GT1CONTENT__GT115:
				return getGT115();
			case V2xmlPackage.GT1CONTENT__GT116:
				return getGT116();
			case V2xmlPackage.GT1CONTENT__GT117:
				return getGT117();
			case V2xmlPackage.GT1CONTENT__GT118:
				return getGT118();
			case V2xmlPackage.GT1CONTENT__GT119:
				return getGT119();
			case V2xmlPackage.GT1CONTENT__GT120:
				return getGT120();
			case V2xmlPackage.GT1CONTENT__GT121:
				return getGT121();
			case V2xmlPackage.GT1CONTENT__GT122:
				return getGT122();
			case V2xmlPackage.GT1CONTENT__GT123:
				return getGT123();
			case V2xmlPackage.GT1CONTENT__GT124:
				return getGT124();
			case V2xmlPackage.GT1CONTENT__GT125:
				return getGT125();
			case V2xmlPackage.GT1CONTENT__GT126:
				return getGT126();
			case V2xmlPackage.GT1CONTENT__GT127:
				return getGT127();
			case V2xmlPackage.GT1CONTENT__GT128:
				return getGT128();
			case V2xmlPackage.GT1CONTENT__GT129:
				return getGT129();
			case V2xmlPackage.GT1CONTENT__GT130:
				return getGT130();
			case V2xmlPackage.GT1CONTENT__GT131:
				return getGT131();
			case V2xmlPackage.GT1CONTENT__GT132:
				return getGT132();
			case V2xmlPackage.GT1CONTENT__GT133:
				return getGT133();
			case V2xmlPackage.GT1CONTENT__GT134:
				return getGT134();
			case V2xmlPackage.GT1CONTENT__GT135:
				return getGT135();
			case V2xmlPackage.GT1CONTENT__GT136:
				return getGT136();
			case V2xmlPackage.GT1CONTENT__GT137:
				return getGT137();
			case V2xmlPackage.GT1CONTENT__GT138:
				return getGT138();
			case V2xmlPackage.GT1CONTENT__GT139:
				return getGT139();
			case V2xmlPackage.GT1CONTENT__GT140:
				return getGT140();
			case V2xmlPackage.GT1CONTENT__GT141:
				return getGT141();
			case V2xmlPackage.GT1CONTENT__GT142:
				return getGT142();
			case V2xmlPackage.GT1CONTENT__GT143:
				return getGT143();
			case V2xmlPackage.GT1CONTENT__GT144:
				return getGT144();
			case V2xmlPackage.GT1CONTENT__GT145:
				return getGT145();
			case V2xmlPackage.GT1CONTENT__GT146:
				return getGT146();
			case V2xmlPackage.GT1CONTENT__GT147:
				return getGT147();
			case V2xmlPackage.GT1CONTENT__GT148:
				return getGT148();
			case V2xmlPackage.GT1CONTENT__GT149:
				return getGT149();
			case V2xmlPackage.GT1CONTENT__GT150:
				return getGT150();
			case V2xmlPackage.GT1CONTENT__GT151:
				return getGT151();
			case V2xmlPackage.GT1CONTENT__GT152:
				return getGT152();
			case V2xmlPackage.GT1CONTENT__GT153:
				return getGT153();
			case V2xmlPackage.GT1CONTENT__GT154:
				return getGT154();
			case V2xmlPackage.GT1CONTENT__GT155:
				return getGT155();
			case V2xmlPackage.GT1CONTENT__GT156:
				return getGT156();
			case V2xmlPackage.GT1CONTENT__GT157:
				return getGT157();
			case V2xmlPackage.GT1CONTENT__ANY:
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
			case V2xmlPackage.GT1CONTENT__GT11:
				setGT11((GT11CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT12:
				getGT12().clear();
				getGT12().addAll((Collection<? extends GT12CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT13:
				getGT13().clear();
				getGT13().addAll((Collection<? extends GT13CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT14:
				getGT14().clear();
				getGT14().addAll((Collection<? extends GT14CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT15:
				getGT15().clear();
				getGT15().addAll((Collection<? extends GT15CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT16:
				getGT16().clear();
				getGT16().addAll((Collection<? extends GT16CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT17:
				getGT17().clear();
				getGT17().addAll((Collection<? extends GT17CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT18:
				setGT18((GT18CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT19:
				setGT19((GT19CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT110:
				setGT110((GT110CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT111:
				setGT111((GT111CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT112:
				setGT112((GT112CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT113:
				setGT113((GT113CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT114:
				setGT114((GT114CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT115:
				setGT115((GT115CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT116:
				getGT116().clear();
				getGT116().addAll((Collection<? extends GT116CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT117:
				getGT117().clear();
				getGT117().addAll((Collection<? extends GT117CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT118:
				getGT118().clear();
				getGT118().addAll((Collection<? extends GT118CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT119:
				getGT119().clear();
				getGT119().addAll((Collection<? extends GT119CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT120:
				setGT120((GT120CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT121:
				getGT121().clear();
				getGT121().addAll((Collection<? extends GT121CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT122:
				setGT122((GT122CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT123:
				setGT123((GT123CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT124:
				setGT124((GT124CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT125:
				setGT125((GT125CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT126:
				setGT126((GT126CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT127:
				setGT127((GT127CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT128:
				setGT128((GT128CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT129:
				getGT129().clear();
				getGT129().addAll((Collection<? extends GT129CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT130:
				setGT130((GT130CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT131:
				setGT131((GT131CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT132:
				setGT132((GT132CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT133:
				setGT133((GT133CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT134:
				getGT134().clear();
				getGT134().addAll((Collection<? extends GT134CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT135:
				getGT135().clear();
				getGT135().addAll((Collection<? extends GT135CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT136:
				setGT136((GT136CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT137:
				setGT137((GT137CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT138:
				setGT138((GT138CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT139:
				setGT139((GT139CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT140:
				setGT140((GT140CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT141:
				setGT141((GT141CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT142:
				getGT142().clear();
				getGT142().addAll((Collection<? extends GT142CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT143:
				setGT143((GT143CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT144:
				getGT144().clear();
				getGT144().addAll((Collection<? extends GT144CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT145:
				getGT145().clear();
				getGT145().addAll((Collection<? extends GT145CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT146:
				getGT146().clear();
				getGT146().addAll((Collection<? extends GT146CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT147:
				setGT147((GT147CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT148:
				setGT148((GT148CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT149:
				setGT149((GT149CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT150:
				setGT150((GT150CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT151:
				getGT151().clear();
				getGT151().addAll((Collection<? extends GT151CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT152:
				setGT152((GT152CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT153:
				setGT153((GT153CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT154:
				setGT154((GT154CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT155:
				getGT155().clear();
				getGT155().addAll((Collection<? extends GT155CONTENT>)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT156:
				setGT156((GT156CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__GT157:
				setGT157((GT157CONTENT)newValue);
				return;
			case V2xmlPackage.GT1CONTENT__ANY:
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
			case V2xmlPackage.GT1CONTENT__GT11:
				setGT11((GT11CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT12:
				getGT12().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT13:
				getGT13().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT14:
				getGT14().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT15:
				getGT15().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT16:
				getGT16().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT17:
				getGT17().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT18:
				setGT18((GT18CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT19:
				setGT19((GT19CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT110:
				setGT110((GT110CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT111:
				setGT111((GT111CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT112:
				setGT112((GT112CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT113:
				setGT113((GT113CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT114:
				setGT114((GT114CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT115:
				setGT115((GT115CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT116:
				getGT116().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT117:
				getGT117().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT118:
				getGT118().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT119:
				getGT119().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT120:
				setGT120((GT120CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT121:
				getGT121().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT122:
				setGT122((GT122CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT123:
				setGT123((GT123CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT124:
				setGT124((GT124CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT125:
				setGT125((GT125CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT126:
				setGT126((GT126CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT127:
				setGT127((GT127CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT128:
				setGT128((GT128CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT129:
				getGT129().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT130:
				setGT130((GT130CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT131:
				setGT131((GT131CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT132:
				setGT132((GT132CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT133:
				setGT133((GT133CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT134:
				getGT134().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT135:
				getGT135().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT136:
				setGT136((GT136CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT137:
				setGT137((GT137CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT138:
				setGT138((GT138CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT139:
				setGT139((GT139CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT140:
				setGT140((GT140CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT141:
				setGT141((GT141CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT142:
				getGT142().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT143:
				setGT143((GT143CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT144:
				getGT144().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT145:
				getGT145().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT146:
				getGT146().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT147:
				setGT147((GT147CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT148:
				setGT148((GT148CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT149:
				setGT149((GT149CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT150:
				setGT150((GT150CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT151:
				getGT151().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT152:
				setGT152((GT152CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT153:
				setGT153((GT153CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT154:
				setGT154((GT154CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT155:
				getGT155().clear();
				return;
			case V2xmlPackage.GT1CONTENT__GT156:
				setGT156((GT156CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__GT157:
				setGT157((GT157CONTENT)null);
				return;
			case V2xmlPackage.GT1CONTENT__ANY:
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
			case V2xmlPackage.GT1CONTENT__GT11:
				return gT11 != null;
			case V2xmlPackage.GT1CONTENT__GT12:
				return gT12 != null && !gT12.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT13:
				return gT13 != null && !gT13.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT14:
				return gT14 != null && !gT14.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT15:
				return gT15 != null && !gT15.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT16:
				return gT16 != null && !gT16.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT17:
				return gT17 != null && !gT17.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT18:
				return gT18 != null;
			case V2xmlPackage.GT1CONTENT__GT19:
				return gT19 != null;
			case V2xmlPackage.GT1CONTENT__GT110:
				return gT110 != null;
			case V2xmlPackage.GT1CONTENT__GT111:
				return gT111 != null;
			case V2xmlPackage.GT1CONTENT__GT112:
				return gT112 != null;
			case V2xmlPackage.GT1CONTENT__GT113:
				return gT113 != null;
			case V2xmlPackage.GT1CONTENT__GT114:
				return gT114 != null;
			case V2xmlPackage.GT1CONTENT__GT115:
				return gT115 != null;
			case V2xmlPackage.GT1CONTENT__GT116:
				return gT116 != null && !gT116.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT117:
				return gT117 != null && !gT117.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT118:
				return gT118 != null && !gT118.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT119:
				return gT119 != null && !gT119.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT120:
				return gT120 != null;
			case V2xmlPackage.GT1CONTENT__GT121:
				return gT121 != null && !gT121.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT122:
				return gT122 != null;
			case V2xmlPackage.GT1CONTENT__GT123:
				return gT123 != null;
			case V2xmlPackage.GT1CONTENT__GT124:
				return gT124 != null;
			case V2xmlPackage.GT1CONTENT__GT125:
				return gT125 != null;
			case V2xmlPackage.GT1CONTENT__GT126:
				return gT126 != null;
			case V2xmlPackage.GT1CONTENT__GT127:
				return gT127 != null;
			case V2xmlPackage.GT1CONTENT__GT128:
				return gT128 != null;
			case V2xmlPackage.GT1CONTENT__GT129:
				return gT129 != null && !gT129.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT130:
				return gT130 != null;
			case V2xmlPackage.GT1CONTENT__GT131:
				return gT131 != null;
			case V2xmlPackage.GT1CONTENT__GT132:
				return gT132 != null;
			case V2xmlPackage.GT1CONTENT__GT133:
				return gT133 != null;
			case V2xmlPackage.GT1CONTENT__GT134:
				return gT134 != null && !gT134.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT135:
				return gT135 != null && !gT135.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT136:
				return gT136 != null;
			case V2xmlPackage.GT1CONTENT__GT137:
				return gT137 != null;
			case V2xmlPackage.GT1CONTENT__GT138:
				return gT138 != null;
			case V2xmlPackage.GT1CONTENT__GT139:
				return gT139 != null;
			case V2xmlPackage.GT1CONTENT__GT140:
				return gT140 != null;
			case V2xmlPackage.GT1CONTENT__GT141:
				return gT141 != null;
			case V2xmlPackage.GT1CONTENT__GT142:
				return gT142 != null && !gT142.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT143:
				return gT143 != null;
			case V2xmlPackage.GT1CONTENT__GT144:
				return gT144 != null && !gT144.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT145:
				return gT145 != null && !gT145.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT146:
				return gT146 != null && !gT146.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT147:
				return gT147 != null;
			case V2xmlPackage.GT1CONTENT__GT148:
				return gT148 != null;
			case V2xmlPackage.GT1CONTENT__GT149:
				return gT149 != null;
			case V2xmlPackage.GT1CONTENT__GT150:
				return gT150 != null;
			case V2xmlPackage.GT1CONTENT__GT151:
				return gT151 != null && !gT151.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT152:
				return gT152 != null;
			case V2xmlPackage.GT1CONTENT__GT153:
				return gT153 != null;
			case V2xmlPackage.GT1CONTENT__GT154:
				return gT154 != null;
			case V2xmlPackage.GT1CONTENT__GT155:
				return gT155 != null && !gT155.isEmpty();
			case V2xmlPackage.GT1CONTENT__GT156:
				return gT156 != null;
			case V2xmlPackage.GT1CONTENT__GT157:
				return gT157 != null;
			case V2xmlPackage.GT1CONTENT__ANY:
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

} //GT1CONTENTImpl
