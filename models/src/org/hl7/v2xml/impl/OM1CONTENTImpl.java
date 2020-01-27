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

import org.hl7.v2xml.OM110CONTENT;
import org.hl7.v2xml.OM111CONTENT;
import org.hl7.v2xml.OM112CONTENT;
import org.hl7.v2xml.OM113CONTENT;
import org.hl7.v2xml.OM114CONTENT;
import org.hl7.v2xml.OM115CONTENT;
import org.hl7.v2xml.OM116CONTENT;
import org.hl7.v2xml.OM117CONTENT;
import org.hl7.v2xml.OM118CONTENT;
import org.hl7.v2xml.OM119CONTENT;
import org.hl7.v2xml.OM11CONTENT;
import org.hl7.v2xml.OM120CONTENT;
import org.hl7.v2xml.OM121CONTENT;
import org.hl7.v2xml.OM122CONTENT;
import org.hl7.v2xml.OM123CONTENT;
import org.hl7.v2xml.OM124CONTENT;
import org.hl7.v2xml.OM125CONTENT;
import org.hl7.v2xml.OM126CONTENT;
import org.hl7.v2xml.OM127CONTENT;
import org.hl7.v2xml.OM128CONTENT;
import org.hl7.v2xml.OM129CONTENT;
import org.hl7.v2xml.OM12CONTENT;
import org.hl7.v2xml.OM130CONTENT;
import org.hl7.v2xml.OM131CONTENT;
import org.hl7.v2xml.OM132CONTENT;
import org.hl7.v2xml.OM133CONTENT;
import org.hl7.v2xml.OM134CONTENT;
import org.hl7.v2xml.OM135CONTENT;
import org.hl7.v2xml.OM136CONTENT;
import org.hl7.v2xml.OM137CONTENT;
import org.hl7.v2xml.OM138CONTENT;
import org.hl7.v2xml.OM139CONTENT;
import org.hl7.v2xml.OM13CONTENT;
import org.hl7.v2xml.OM140CONTENT;
import org.hl7.v2xml.OM141CONTENT;
import org.hl7.v2xml.OM142CONTENT;
import org.hl7.v2xml.OM143CONTENT;
import org.hl7.v2xml.OM144CONTENT;
import org.hl7.v2xml.OM145CONTENT;
import org.hl7.v2xml.OM146CONTENT;
import org.hl7.v2xml.OM147CONTENT;
import org.hl7.v2xml.OM14CONTENT;
import org.hl7.v2xml.OM15CONTENT;
import org.hl7.v2xml.OM16CONTENT;
import org.hl7.v2xml.OM17CONTENT;
import org.hl7.v2xml.OM18CONTENT;
import org.hl7.v2xml.OM19CONTENT;
import org.hl7.v2xml.OM1CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OM1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM11 <em>OM11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM12 <em>OM12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM13 <em>OM13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM14 <em>OM14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM15 <em>OM15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM16 <em>OM16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM17 <em>OM17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM18 <em>OM18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM19 <em>OM19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM110 <em>OM110</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM111 <em>OM111</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM112 <em>OM112</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM113 <em>OM113</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM114 <em>OM114</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM115 <em>OM115</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM116 <em>OM116</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM117 <em>OM117</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM118 <em>OM118</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM119 <em>OM119</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM120 <em>OM120</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM121 <em>OM121</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM122 <em>OM122</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM123 <em>OM123</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM124 <em>OM124</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM125 <em>OM125</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM126 <em>OM126</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM127 <em>OM127</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM128 <em>OM128</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM129 <em>OM129</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM130 <em>OM130</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM131 <em>OM131</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM132 <em>OM132</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM133 <em>OM133</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM134 <em>OM134</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM135 <em>OM135</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM136 <em>OM136</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM137 <em>OM137</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM138 <em>OM138</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM139 <em>OM139</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM140 <em>OM140</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM141 <em>OM141</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM142 <em>OM142</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM143 <em>OM143</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM144 <em>OM144</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM145 <em>OM145</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM146 <em>OM146</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getOM147 <em>OM147</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.OM1CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OM1CONTENTImpl extends EObjectImpl implements OM1CONTENT {
	/**
	 * The cached value of the '{@link #getOM11() <em>OM11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM11()
	 * @generated
	 * @ordered
	 */
	protected OM11CONTENT oM11;

	/**
	 * The cached value of the '{@link #getOM12() <em>OM12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM12()
	 * @generated
	 * @ordered
	 */
	protected OM12CONTENT oM12;

	/**
	 * The cached value of the '{@link #getOM13() <em>OM13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM13()
	 * @generated
	 * @ordered
	 */
	protected EList<OM13CONTENT> oM13;

	/**
	 * The cached value of the '{@link #getOM14() <em>OM14</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM14()
	 * @generated
	 * @ordered
	 */
	protected OM14CONTENT oM14;

	/**
	 * The cached value of the '{@link #getOM15() <em>OM15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM15()
	 * @generated
	 * @ordered
	 */
	protected OM15CONTENT oM15;

	/**
	 * The cached value of the '{@link #getOM16() <em>OM16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM16()
	 * @generated
	 * @ordered
	 */
	protected OM16CONTENT oM16;

	/**
	 * The cached value of the '{@link #getOM17() <em>OM17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM17()
	 * @generated
	 * @ordered
	 */
	protected OM17CONTENT oM17;

	/**
	 * The cached value of the '{@link #getOM18() <em>OM18</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM18()
	 * @generated
	 * @ordered
	 */
	protected EList<OM18CONTENT> oM18;

	/**
	 * The cached value of the '{@link #getOM19() <em>OM19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM19()
	 * @generated
	 * @ordered
	 */
	protected OM19CONTENT oM19;

	/**
	 * The cached value of the '{@link #getOM110() <em>OM110</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM110()
	 * @generated
	 * @ordered
	 */
	protected OM110CONTENT oM110;

	/**
	 * The cached value of the '{@link #getOM111() <em>OM111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM111()
	 * @generated
	 * @ordered
	 */
	protected OM111CONTENT oM111;

	/**
	 * The cached value of the '{@link #getOM112() <em>OM112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM112()
	 * @generated
	 * @ordered
	 */
	protected OM112CONTENT oM112;

	/**
	 * The cached value of the '{@link #getOM113() <em>OM113</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM113()
	 * @generated
	 * @ordered
	 */
	protected EList<OM113CONTENT> oM113;

	/**
	 * The cached value of the '{@link #getOM114() <em>OM114</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM114()
	 * @generated
	 * @ordered
	 */
	protected EList<OM114CONTENT> oM114;

	/**
	 * The cached value of the '{@link #getOM115() <em>OM115</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM115()
	 * @generated
	 * @ordered
	 */
	protected OM115CONTENT oM115;

	/**
	 * The cached value of the '{@link #getOM116() <em>OM116</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM116()
	 * @generated
	 * @ordered
	 */
	protected EList<OM116CONTENT> oM116;

	/**
	 * The cached value of the '{@link #getOM117() <em>OM117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM117()
	 * @generated
	 * @ordered
	 */
	protected OM117CONTENT oM117;

	/**
	 * The cached value of the '{@link #getOM118() <em>OM118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM118()
	 * @generated
	 * @ordered
	 */
	protected OM118CONTENT oM118;

	/**
	 * The cached value of the '{@link #getOM119() <em>OM119</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM119()
	 * @generated
	 * @ordered
	 */
	protected OM119CONTENT oM119;

	/**
	 * The cached value of the '{@link #getOM120() <em>OM120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM120()
	 * @generated
	 * @ordered
	 */
	protected OM120CONTENT oM120;

	/**
	 * The cached value of the '{@link #getOM121() <em>OM121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM121()
	 * @generated
	 * @ordered
	 */
	protected OM121CONTENT oM121;

	/**
	 * The cached value of the '{@link #getOM122() <em>OM122</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM122()
	 * @generated
	 * @ordered
	 */
	protected OM122CONTENT oM122;

	/**
	 * The cached value of the '{@link #getOM123() <em>OM123</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM123()
	 * @generated
	 * @ordered
	 */
	protected OM123CONTENT oM123;

	/**
	 * The cached value of the '{@link #getOM124() <em>OM124</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM124()
	 * @generated
	 * @ordered
	 */
	protected OM124CONTENT oM124;

	/**
	 * The cached value of the '{@link #getOM125() <em>OM125</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM125()
	 * @generated
	 * @ordered
	 */
	protected EList<OM125CONTENT> oM125;

	/**
	 * The cached value of the '{@link #getOM126() <em>OM126</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM126()
	 * @generated
	 * @ordered
	 */
	protected OM126CONTENT oM126;

	/**
	 * The cached value of the '{@link #getOM127() <em>OM127</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM127()
	 * @generated
	 * @ordered
	 */
	protected EList<OM127CONTENT> oM127;

	/**
	 * The cached value of the '{@link #getOM128() <em>OM128</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM128()
	 * @generated
	 * @ordered
	 */
	protected EList<OM128CONTENT> oM128;

	/**
	 * The cached value of the '{@link #getOM129() <em>OM129</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM129()
	 * @generated
	 * @ordered
	 */
	protected OM129CONTENT oM129;

	/**
	 * The cached value of the '{@link #getOM130() <em>OM130</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM130()
	 * @generated
	 * @ordered
	 */
	protected OM130CONTENT oM130;

	/**
	 * The cached value of the '{@link #getOM131() <em>OM131</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM131()
	 * @generated
	 * @ordered
	 */
	protected OM131CONTENT oM131;

	/**
	 * The cached value of the '{@link #getOM132() <em>OM132</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM132()
	 * @generated
	 * @ordered
	 */
	protected OM132CONTENT oM132;

	/**
	 * The cached value of the '{@link #getOM133() <em>OM133</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM133()
	 * @generated
	 * @ordered
	 */
	protected OM133CONTENT oM133;

	/**
	 * The cached value of the '{@link #getOM134() <em>OM134</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM134()
	 * @generated
	 * @ordered
	 */
	protected EList<OM134CONTENT> oM134;

	/**
	 * The cached value of the '{@link #getOM135() <em>OM135</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM135()
	 * @generated
	 * @ordered
	 */
	protected OM135CONTENT oM135;

	/**
	 * The cached value of the '{@link #getOM136() <em>OM136</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM136()
	 * @generated
	 * @ordered
	 */
	protected OM136CONTENT oM136;

	/**
	 * The cached value of the '{@link #getOM137() <em>OM137</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM137()
	 * @generated
	 * @ordered
	 */
	protected OM137CONTENT oM137;

	/**
	 * The cached value of the '{@link #getOM138() <em>OM138</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM138()
	 * @generated
	 * @ordered
	 */
	protected OM138CONTENT oM138;

	/**
	 * The cached value of the '{@link #getOM139() <em>OM139</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM139()
	 * @generated
	 * @ordered
	 */
	protected OM139CONTENT oM139;

	/**
	 * The cached value of the '{@link #getOM140() <em>OM140</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM140()
	 * @generated
	 * @ordered
	 */
	protected EList<OM140CONTENT> oM140;

	/**
	 * The cached value of the '{@link #getOM141() <em>OM141</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM141()
	 * @generated
	 * @ordered
	 */
	protected OM141CONTENT oM141;

	/**
	 * The cached value of the '{@link #getOM142() <em>OM142</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM142()
	 * @generated
	 * @ordered
	 */
	protected OM142CONTENT oM142;

	/**
	 * The cached value of the '{@link #getOM143() <em>OM143</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM143()
	 * @generated
	 * @ordered
	 */
	protected OM143CONTENT oM143;

	/**
	 * The cached value of the '{@link #getOM144() <em>OM144</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM144()
	 * @generated
	 * @ordered
	 */
	protected OM144CONTENT oM144;

	/**
	 * The cached value of the '{@link #getOM145() <em>OM145</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM145()
	 * @generated
	 * @ordered
	 */
	protected OM145CONTENT oM145;

	/**
	 * The cached value of the '{@link #getOM146() <em>OM146</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM146()
	 * @generated
	 * @ordered
	 */
	protected OM146CONTENT oM146;

	/**
	 * The cached value of the '{@link #getOM147() <em>OM147</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOM147()
	 * @generated
	 * @ordered
	 */
	protected OM147CONTENT oM147;

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
	protected OM1CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getOM1CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM11CONTENT getOM11() {
		return oM11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM11(OM11CONTENT newOM11, NotificationChain msgs) {
		OM11CONTENT oldOM11 = oM11;
		oM11 = newOM11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM11, oldOM11, newOM11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM11(OM11CONTENT newOM11) {
		if (newOM11 != oM11) {
			NotificationChain msgs = null;
			if (oM11 != null)
				msgs = ((InternalEObject)oM11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM11, null, msgs);
			if (newOM11 != null)
				msgs = ((InternalEObject)newOM11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM11, null, msgs);
			msgs = basicSetOM11(newOM11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM11, newOM11, newOM11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM12CONTENT getOM12() {
		return oM12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM12(OM12CONTENT newOM12, NotificationChain msgs) {
		OM12CONTENT oldOM12 = oM12;
		oM12 = newOM12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM12, oldOM12, newOM12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM12(OM12CONTENT newOM12) {
		if (newOM12 != oM12) {
			NotificationChain msgs = null;
			if (oM12 != null)
				msgs = ((InternalEObject)oM12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM12, null, msgs);
			if (newOM12 != null)
				msgs = ((InternalEObject)newOM12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM12, null, msgs);
			msgs = basicSetOM12(newOM12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM12, newOM12, newOM12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM13CONTENT> getOM13() {
		if (oM13 == null) {
			oM13 = new EObjectContainmentEList<OM13CONTENT>(OM13CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM13);
		}
		return oM13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM14CONTENT getOM14() {
		return oM14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM14(OM14CONTENT newOM14, NotificationChain msgs) {
		OM14CONTENT oldOM14 = oM14;
		oM14 = newOM14;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM14, oldOM14, newOM14);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM14(OM14CONTENT newOM14) {
		if (newOM14 != oM14) {
			NotificationChain msgs = null;
			if (oM14 != null)
				msgs = ((InternalEObject)oM14).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM14, null, msgs);
			if (newOM14 != null)
				msgs = ((InternalEObject)newOM14).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM14, null, msgs);
			msgs = basicSetOM14(newOM14, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM14, newOM14, newOM14));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM15CONTENT getOM15() {
		return oM15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM15(OM15CONTENT newOM15, NotificationChain msgs) {
		OM15CONTENT oldOM15 = oM15;
		oM15 = newOM15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM15, oldOM15, newOM15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM15(OM15CONTENT newOM15) {
		if (newOM15 != oM15) {
			NotificationChain msgs = null;
			if (oM15 != null)
				msgs = ((InternalEObject)oM15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM15, null, msgs);
			if (newOM15 != null)
				msgs = ((InternalEObject)newOM15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM15, null, msgs);
			msgs = basicSetOM15(newOM15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM15, newOM15, newOM15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM16CONTENT getOM16() {
		return oM16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM16(OM16CONTENT newOM16, NotificationChain msgs) {
		OM16CONTENT oldOM16 = oM16;
		oM16 = newOM16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM16, oldOM16, newOM16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM16(OM16CONTENT newOM16) {
		if (newOM16 != oM16) {
			NotificationChain msgs = null;
			if (oM16 != null)
				msgs = ((InternalEObject)oM16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM16, null, msgs);
			if (newOM16 != null)
				msgs = ((InternalEObject)newOM16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM16, null, msgs);
			msgs = basicSetOM16(newOM16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM16, newOM16, newOM16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM17CONTENT getOM17() {
		return oM17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM17(OM17CONTENT newOM17, NotificationChain msgs) {
		OM17CONTENT oldOM17 = oM17;
		oM17 = newOM17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM17, oldOM17, newOM17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM17(OM17CONTENT newOM17) {
		if (newOM17 != oM17) {
			NotificationChain msgs = null;
			if (oM17 != null)
				msgs = ((InternalEObject)oM17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM17, null, msgs);
			if (newOM17 != null)
				msgs = ((InternalEObject)newOM17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM17, null, msgs);
			msgs = basicSetOM17(newOM17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM17, newOM17, newOM17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM18CONTENT> getOM18() {
		if (oM18 == null) {
			oM18 = new EObjectContainmentEList<OM18CONTENT>(OM18CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM18);
		}
		return oM18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM19CONTENT getOM19() {
		return oM19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM19(OM19CONTENT newOM19, NotificationChain msgs) {
		OM19CONTENT oldOM19 = oM19;
		oM19 = newOM19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM19, oldOM19, newOM19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM19(OM19CONTENT newOM19) {
		if (newOM19 != oM19) {
			NotificationChain msgs = null;
			if (oM19 != null)
				msgs = ((InternalEObject)oM19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM19, null, msgs);
			if (newOM19 != null)
				msgs = ((InternalEObject)newOM19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM19, null, msgs);
			msgs = basicSetOM19(newOM19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM19, newOM19, newOM19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM110CONTENT getOM110() {
		return oM110;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM110(OM110CONTENT newOM110, NotificationChain msgs) {
		OM110CONTENT oldOM110 = oM110;
		oM110 = newOM110;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM110, oldOM110, newOM110);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM110(OM110CONTENT newOM110) {
		if (newOM110 != oM110) {
			NotificationChain msgs = null;
			if (oM110 != null)
				msgs = ((InternalEObject)oM110).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM110, null, msgs);
			if (newOM110 != null)
				msgs = ((InternalEObject)newOM110).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM110, null, msgs);
			msgs = basicSetOM110(newOM110, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM110, newOM110, newOM110));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM111CONTENT getOM111() {
		return oM111;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM111(OM111CONTENT newOM111, NotificationChain msgs) {
		OM111CONTENT oldOM111 = oM111;
		oM111 = newOM111;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM111, oldOM111, newOM111);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM111(OM111CONTENT newOM111) {
		if (newOM111 != oM111) {
			NotificationChain msgs = null;
			if (oM111 != null)
				msgs = ((InternalEObject)oM111).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM111, null, msgs);
			if (newOM111 != null)
				msgs = ((InternalEObject)newOM111).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM111, null, msgs);
			msgs = basicSetOM111(newOM111, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM111, newOM111, newOM111));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM112CONTENT getOM112() {
		return oM112;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM112(OM112CONTENT newOM112, NotificationChain msgs) {
		OM112CONTENT oldOM112 = oM112;
		oM112 = newOM112;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM112, oldOM112, newOM112);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM112(OM112CONTENT newOM112) {
		if (newOM112 != oM112) {
			NotificationChain msgs = null;
			if (oM112 != null)
				msgs = ((InternalEObject)oM112).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM112, null, msgs);
			if (newOM112 != null)
				msgs = ((InternalEObject)newOM112).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM112, null, msgs);
			msgs = basicSetOM112(newOM112, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM112, newOM112, newOM112));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM113CONTENT> getOM113() {
		if (oM113 == null) {
			oM113 = new EObjectContainmentEList<OM113CONTENT>(OM113CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM113);
		}
		return oM113;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM114CONTENT> getOM114() {
		if (oM114 == null) {
			oM114 = new EObjectContainmentEList<OM114CONTENT>(OM114CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM114);
		}
		return oM114;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM115CONTENT getOM115() {
		return oM115;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM115(OM115CONTENT newOM115, NotificationChain msgs) {
		OM115CONTENT oldOM115 = oM115;
		oM115 = newOM115;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM115, oldOM115, newOM115);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM115(OM115CONTENT newOM115) {
		if (newOM115 != oM115) {
			NotificationChain msgs = null;
			if (oM115 != null)
				msgs = ((InternalEObject)oM115).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM115, null, msgs);
			if (newOM115 != null)
				msgs = ((InternalEObject)newOM115).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM115, null, msgs);
			msgs = basicSetOM115(newOM115, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM115, newOM115, newOM115));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM116CONTENT> getOM116() {
		if (oM116 == null) {
			oM116 = new EObjectContainmentEList<OM116CONTENT>(OM116CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM116);
		}
		return oM116;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM117CONTENT getOM117() {
		return oM117;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM117(OM117CONTENT newOM117, NotificationChain msgs) {
		OM117CONTENT oldOM117 = oM117;
		oM117 = newOM117;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM117, oldOM117, newOM117);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM117(OM117CONTENT newOM117) {
		if (newOM117 != oM117) {
			NotificationChain msgs = null;
			if (oM117 != null)
				msgs = ((InternalEObject)oM117).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM117, null, msgs);
			if (newOM117 != null)
				msgs = ((InternalEObject)newOM117).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM117, null, msgs);
			msgs = basicSetOM117(newOM117, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM117, newOM117, newOM117));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM118CONTENT getOM118() {
		return oM118;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM118(OM118CONTENT newOM118, NotificationChain msgs) {
		OM118CONTENT oldOM118 = oM118;
		oM118 = newOM118;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM118, oldOM118, newOM118);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM118(OM118CONTENT newOM118) {
		if (newOM118 != oM118) {
			NotificationChain msgs = null;
			if (oM118 != null)
				msgs = ((InternalEObject)oM118).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM118, null, msgs);
			if (newOM118 != null)
				msgs = ((InternalEObject)newOM118).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM118, null, msgs);
			msgs = basicSetOM118(newOM118, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM118, newOM118, newOM118));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM119CONTENT getOM119() {
		return oM119;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM119(OM119CONTENT newOM119, NotificationChain msgs) {
		OM119CONTENT oldOM119 = oM119;
		oM119 = newOM119;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM119, oldOM119, newOM119);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM119(OM119CONTENT newOM119) {
		if (newOM119 != oM119) {
			NotificationChain msgs = null;
			if (oM119 != null)
				msgs = ((InternalEObject)oM119).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM119, null, msgs);
			if (newOM119 != null)
				msgs = ((InternalEObject)newOM119).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM119, null, msgs);
			msgs = basicSetOM119(newOM119, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM119, newOM119, newOM119));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM120CONTENT getOM120() {
		return oM120;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM120(OM120CONTENT newOM120, NotificationChain msgs) {
		OM120CONTENT oldOM120 = oM120;
		oM120 = newOM120;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM120, oldOM120, newOM120);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM120(OM120CONTENT newOM120) {
		if (newOM120 != oM120) {
			NotificationChain msgs = null;
			if (oM120 != null)
				msgs = ((InternalEObject)oM120).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM120, null, msgs);
			if (newOM120 != null)
				msgs = ((InternalEObject)newOM120).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM120, null, msgs);
			msgs = basicSetOM120(newOM120, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM120, newOM120, newOM120));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM121CONTENT getOM121() {
		return oM121;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM121(OM121CONTENT newOM121, NotificationChain msgs) {
		OM121CONTENT oldOM121 = oM121;
		oM121 = newOM121;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM121, oldOM121, newOM121);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM121(OM121CONTENT newOM121) {
		if (newOM121 != oM121) {
			NotificationChain msgs = null;
			if (oM121 != null)
				msgs = ((InternalEObject)oM121).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM121, null, msgs);
			if (newOM121 != null)
				msgs = ((InternalEObject)newOM121).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM121, null, msgs);
			msgs = basicSetOM121(newOM121, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM121, newOM121, newOM121));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM122CONTENT getOM122() {
		return oM122;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM122(OM122CONTENT newOM122, NotificationChain msgs) {
		OM122CONTENT oldOM122 = oM122;
		oM122 = newOM122;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM122, oldOM122, newOM122);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM122(OM122CONTENT newOM122) {
		if (newOM122 != oM122) {
			NotificationChain msgs = null;
			if (oM122 != null)
				msgs = ((InternalEObject)oM122).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM122, null, msgs);
			if (newOM122 != null)
				msgs = ((InternalEObject)newOM122).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM122, null, msgs);
			msgs = basicSetOM122(newOM122, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM122, newOM122, newOM122));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM123CONTENT getOM123() {
		return oM123;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM123(OM123CONTENT newOM123, NotificationChain msgs) {
		OM123CONTENT oldOM123 = oM123;
		oM123 = newOM123;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM123, oldOM123, newOM123);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM123(OM123CONTENT newOM123) {
		if (newOM123 != oM123) {
			NotificationChain msgs = null;
			if (oM123 != null)
				msgs = ((InternalEObject)oM123).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM123, null, msgs);
			if (newOM123 != null)
				msgs = ((InternalEObject)newOM123).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM123, null, msgs);
			msgs = basicSetOM123(newOM123, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM123, newOM123, newOM123));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM124CONTENT getOM124() {
		return oM124;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM124(OM124CONTENT newOM124, NotificationChain msgs) {
		OM124CONTENT oldOM124 = oM124;
		oM124 = newOM124;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM124, oldOM124, newOM124);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM124(OM124CONTENT newOM124) {
		if (newOM124 != oM124) {
			NotificationChain msgs = null;
			if (oM124 != null)
				msgs = ((InternalEObject)oM124).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM124, null, msgs);
			if (newOM124 != null)
				msgs = ((InternalEObject)newOM124).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM124, null, msgs);
			msgs = basicSetOM124(newOM124, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM124, newOM124, newOM124));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM125CONTENT> getOM125() {
		if (oM125 == null) {
			oM125 = new EObjectContainmentEList<OM125CONTENT>(OM125CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM125);
		}
		return oM125;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM126CONTENT getOM126() {
		return oM126;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM126(OM126CONTENT newOM126, NotificationChain msgs) {
		OM126CONTENT oldOM126 = oM126;
		oM126 = newOM126;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM126, oldOM126, newOM126);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM126(OM126CONTENT newOM126) {
		if (newOM126 != oM126) {
			NotificationChain msgs = null;
			if (oM126 != null)
				msgs = ((InternalEObject)oM126).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM126, null, msgs);
			if (newOM126 != null)
				msgs = ((InternalEObject)newOM126).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM126, null, msgs);
			msgs = basicSetOM126(newOM126, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM126, newOM126, newOM126));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM127CONTENT> getOM127() {
		if (oM127 == null) {
			oM127 = new EObjectContainmentEList<OM127CONTENT>(OM127CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM127);
		}
		return oM127;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM128CONTENT> getOM128() {
		if (oM128 == null) {
			oM128 = new EObjectContainmentEList<OM128CONTENT>(OM128CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM128);
		}
		return oM128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM129CONTENT getOM129() {
		return oM129;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM129(OM129CONTENT newOM129, NotificationChain msgs) {
		OM129CONTENT oldOM129 = oM129;
		oM129 = newOM129;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM129, oldOM129, newOM129);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM129(OM129CONTENT newOM129) {
		if (newOM129 != oM129) {
			NotificationChain msgs = null;
			if (oM129 != null)
				msgs = ((InternalEObject)oM129).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM129, null, msgs);
			if (newOM129 != null)
				msgs = ((InternalEObject)newOM129).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM129, null, msgs);
			msgs = basicSetOM129(newOM129, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM129, newOM129, newOM129));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM130CONTENT getOM130() {
		return oM130;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM130(OM130CONTENT newOM130, NotificationChain msgs) {
		OM130CONTENT oldOM130 = oM130;
		oM130 = newOM130;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM130, oldOM130, newOM130);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM130(OM130CONTENT newOM130) {
		if (newOM130 != oM130) {
			NotificationChain msgs = null;
			if (oM130 != null)
				msgs = ((InternalEObject)oM130).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM130, null, msgs);
			if (newOM130 != null)
				msgs = ((InternalEObject)newOM130).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM130, null, msgs);
			msgs = basicSetOM130(newOM130, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM130, newOM130, newOM130));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM131CONTENT getOM131() {
		return oM131;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM131(OM131CONTENT newOM131, NotificationChain msgs) {
		OM131CONTENT oldOM131 = oM131;
		oM131 = newOM131;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM131, oldOM131, newOM131);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM131(OM131CONTENT newOM131) {
		if (newOM131 != oM131) {
			NotificationChain msgs = null;
			if (oM131 != null)
				msgs = ((InternalEObject)oM131).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM131, null, msgs);
			if (newOM131 != null)
				msgs = ((InternalEObject)newOM131).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM131, null, msgs);
			msgs = basicSetOM131(newOM131, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM131, newOM131, newOM131));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM132CONTENT getOM132() {
		return oM132;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM132(OM132CONTENT newOM132, NotificationChain msgs) {
		OM132CONTENT oldOM132 = oM132;
		oM132 = newOM132;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM132, oldOM132, newOM132);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM132(OM132CONTENT newOM132) {
		if (newOM132 != oM132) {
			NotificationChain msgs = null;
			if (oM132 != null)
				msgs = ((InternalEObject)oM132).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM132, null, msgs);
			if (newOM132 != null)
				msgs = ((InternalEObject)newOM132).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM132, null, msgs);
			msgs = basicSetOM132(newOM132, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM132, newOM132, newOM132));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM133CONTENT getOM133() {
		return oM133;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM133(OM133CONTENT newOM133, NotificationChain msgs) {
		OM133CONTENT oldOM133 = oM133;
		oM133 = newOM133;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM133, oldOM133, newOM133);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM133(OM133CONTENT newOM133) {
		if (newOM133 != oM133) {
			NotificationChain msgs = null;
			if (oM133 != null)
				msgs = ((InternalEObject)oM133).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM133, null, msgs);
			if (newOM133 != null)
				msgs = ((InternalEObject)newOM133).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM133, null, msgs);
			msgs = basicSetOM133(newOM133, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM133, newOM133, newOM133));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM134CONTENT> getOM134() {
		if (oM134 == null) {
			oM134 = new EObjectContainmentEList<OM134CONTENT>(OM134CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM134);
		}
		return oM134;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM135CONTENT getOM135() {
		return oM135;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM135(OM135CONTENT newOM135, NotificationChain msgs) {
		OM135CONTENT oldOM135 = oM135;
		oM135 = newOM135;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM135, oldOM135, newOM135);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM135(OM135CONTENT newOM135) {
		if (newOM135 != oM135) {
			NotificationChain msgs = null;
			if (oM135 != null)
				msgs = ((InternalEObject)oM135).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM135, null, msgs);
			if (newOM135 != null)
				msgs = ((InternalEObject)newOM135).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM135, null, msgs);
			msgs = basicSetOM135(newOM135, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM135, newOM135, newOM135));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM136CONTENT getOM136() {
		return oM136;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM136(OM136CONTENT newOM136, NotificationChain msgs) {
		OM136CONTENT oldOM136 = oM136;
		oM136 = newOM136;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM136, oldOM136, newOM136);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM136(OM136CONTENT newOM136) {
		if (newOM136 != oM136) {
			NotificationChain msgs = null;
			if (oM136 != null)
				msgs = ((InternalEObject)oM136).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM136, null, msgs);
			if (newOM136 != null)
				msgs = ((InternalEObject)newOM136).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM136, null, msgs);
			msgs = basicSetOM136(newOM136, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM136, newOM136, newOM136));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM137CONTENT getOM137() {
		return oM137;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM137(OM137CONTENT newOM137, NotificationChain msgs) {
		OM137CONTENT oldOM137 = oM137;
		oM137 = newOM137;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM137, oldOM137, newOM137);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM137(OM137CONTENT newOM137) {
		if (newOM137 != oM137) {
			NotificationChain msgs = null;
			if (oM137 != null)
				msgs = ((InternalEObject)oM137).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM137, null, msgs);
			if (newOM137 != null)
				msgs = ((InternalEObject)newOM137).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM137, null, msgs);
			msgs = basicSetOM137(newOM137, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM137, newOM137, newOM137));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM138CONTENT getOM138() {
		return oM138;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM138(OM138CONTENT newOM138, NotificationChain msgs) {
		OM138CONTENT oldOM138 = oM138;
		oM138 = newOM138;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM138, oldOM138, newOM138);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM138(OM138CONTENT newOM138) {
		if (newOM138 != oM138) {
			NotificationChain msgs = null;
			if (oM138 != null)
				msgs = ((InternalEObject)oM138).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM138, null, msgs);
			if (newOM138 != null)
				msgs = ((InternalEObject)newOM138).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM138, null, msgs);
			msgs = basicSetOM138(newOM138, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM138, newOM138, newOM138));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM139CONTENT getOM139() {
		return oM139;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM139(OM139CONTENT newOM139, NotificationChain msgs) {
		OM139CONTENT oldOM139 = oM139;
		oM139 = newOM139;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM139, oldOM139, newOM139);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM139(OM139CONTENT newOM139) {
		if (newOM139 != oM139) {
			NotificationChain msgs = null;
			if (oM139 != null)
				msgs = ((InternalEObject)oM139).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM139, null, msgs);
			if (newOM139 != null)
				msgs = ((InternalEObject)newOM139).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM139, null, msgs);
			msgs = basicSetOM139(newOM139, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM139, newOM139, newOM139));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OM140CONTENT> getOM140() {
		if (oM140 == null) {
			oM140 = new EObjectContainmentEList<OM140CONTENT>(OM140CONTENT.class, this, V2xmlPackage.OM1CONTENT__OM140);
		}
		return oM140;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM141CONTENT getOM141() {
		return oM141;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM141(OM141CONTENT newOM141, NotificationChain msgs) {
		OM141CONTENT oldOM141 = oM141;
		oM141 = newOM141;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM141, oldOM141, newOM141);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM141(OM141CONTENT newOM141) {
		if (newOM141 != oM141) {
			NotificationChain msgs = null;
			if (oM141 != null)
				msgs = ((InternalEObject)oM141).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM141, null, msgs);
			if (newOM141 != null)
				msgs = ((InternalEObject)newOM141).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM141, null, msgs);
			msgs = basicSetOM141(newOM141, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM141, newOM141, newOM141));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM142CONTENT getOM142() {
		return oM142;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM142(OM142CONTENT newOM142, NotificationChain msgs) {
		OM142CONTENT oldOM142 = oM142;
		oM142 = newOM142;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM142, oldOM142, newOM142);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM142(OM142CONTENT newOM142) {
		if (newOM142 != oM142) {
			NotificationChain msgs = null;
			if (oM142 != null)
				msgs = ((InternalEObject)oM142).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM142, null, msgs);
			if (newOM142 != null)
				msgs = ((InternalEObject)newOM142).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM142, null, msgs);
			msgs = basicSetOM142(newOM142, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM142, newOM142, newOM142));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM143CONTENT getOM143() {
		return oM143;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM143(OM143CONTENT newOM143, NotificationChain msgs) {
		OM143CONTENT oldOM143 = oM143;
		oM143 = newOM143;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM143, oldOM143, newOM143);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM143(OM143CONTENT newOM143) {
		if (newOM143 != oM143) {
			NotificationChain msgs = null;
			if (oM143 != null)
				msgs = ((InternalEObject)oM143).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM143, null, msgs);
			if (newOM143 != null)
				msgs = ((InternalEObject)newOM143).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM143, null, msgs);
			msgs = basicSetOM143(newOM143, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM143, newOM143, newOM143));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM144CONTENT getOM144() {
		return oM144;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM144(OM144CONTENT newOM144, NotificationChain msgs) {
		OM144CONTENT oldOM144 = oM144;
		oM144 = newOM144;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM144, oldOM144, newOM144);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM144(OM144CONTENT newOM144) {
		if (newOM144 != oM144) {
			NotificationChain msgs = null;
			if (oM144 != null)
				msgs = ((InternalEObject)oM144).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM144, null, msgs);
			if (newOM144 != null)
				msgs = ((InternalEObject)newOM144).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM144, null, msgs);
			msgs = basicSetOM144(newOM144, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM144, newOM144, newOM144));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM145CONTENT getOM145() {
		return oM145;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM145(OM145CONTENT newOM145, NotificationChain msgs) {
		OM145CONTENT oldOM145 = oM145;
		oM145 = newOM145;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM145, oldOM145, newOM145);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM145(OM145CONTENT newOM145) {
		if (newOM145 != oM145) {
			NotificationChain msgs = null;
			if (oM145 != null)
				msgs = ((InternalEObject)oM145).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM145, null, msgs);
			if (newOM145 != null)
				msgs = ((InternalEObject)newOM145).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM145, null, msgs);
			msgs = basicSetOM145(newOM145, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM145, newOM145, newOM145));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM146CONTENT getOM146() {
		return oM146;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM146(OM146CONTENT newOM146, NotificationChain msgs) {
		OM146CONTENT oldOM146 = oM146;
		oM146 = newOM146;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM146, oldOM146, newOM146);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM146(OM146CONTENT newOM146) {
		if (newOM146 != oM146) {
			NotificationChain msgs = null;
			if (oM146 != null)
				msgs = ((InternalEObject)oM146).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM146, null, msgs);
			if (newOM146 != null)
				msgs = ((InternalEObject)newOM146).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM146, null, msgs);
			msgs = basicSetOM146(newOM146, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM146, newOM146, newOM146));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OM147CONTENT getOM147() {
		return oM147;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOM147(OM147CONTENT newOM147, NotificationChain msgs) {
		OM147CONTENT oldOM147 = oM147;
		oM147 = newOM147;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM147, oldOM147, newOM147);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOM147(OM147CONTENT newOM147) {
		if (newOM147 != oM147) {
			NotificationChain msgs = null;
			if (oM147 != null)
				msgs = ((InternalEObject)oM147).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM147, null, msgs);
			if (newOM147 != null)
				msgs = ((InternalEObject)newOM147).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.OM1CONTENT__OM147, null, msgs);
			msgs = basicSetOM147(newOM147, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.OM1CONTENT__OM147, newOM147, newOM147));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.OM1CONTENT__ANY);
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
			case V2xmlPackage.OM1CONTENT__OM11:
				return basicSetOM11(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM12:
				return basicSetOM12(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM13:
				return ((InternalEList<?>)getOM13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM14:
				return basicSetOM14(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM15:
				return basicSetOM15(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM16:
				return basicSetOM16(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM17:
				return basicSetOM17(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM18:
				return ((InternalEList<?>)getOM18()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM19:
				return basicSetOM19(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM110:
				return basicSetOM110(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM111:
				return basicSetOM111(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM112:
				return basicSetOM112(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM113:
				return ((InternalEList<?>)getOM113()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM114:
				return ((InternalEList<?>)getOM114()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM115:
				return basicSetOM115(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM116:
				return ((InternalEList<?>)getOM116()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM117:
				return basicSetOM117(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM118:
				return basicSetOM118(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM119:
				return basicSetOM119(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM120:
				return basicSetOM120(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM121:
				return basicSetOM121(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM122:
				return basicSetOM122(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM123:
				return basicSetOM123(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM124:
				return basicSetOM124(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM125:
				return ((InternalEList<?>)getOM125()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM126:
				return basicSetOM126(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM127:
				return ((InternalEList<?>)getOM127()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM128:
				return ((InternalEList<?>)getOM128()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM129:
				return basicSetOM129(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM130:
				return basicSetOM130(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM131:
				return basicSetOM131(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM132:
				return basicSetOM132(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM133:
				return basicSetOM133(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM134:
				return ((InternalEList<?>)getOM134()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM135:
				return basicSetOM135(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM136:
				return basicSetOM136(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM137:
				return basicSetOM137(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM138:
				return basicSetOM138(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM139:
				return basicSetOM139(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM140:
				return ((InternalEList<?>)getOM140()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.OM1CONTENT__OM141:
				return basicSetOM141(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM142:
				return basicSetOM142(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM143:
				return basicSetOM143(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM144:
				return basicSetOM144(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM145:
				return basicSetOM145(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM146:
				return basicSetOM146(null, msgs);
			case V2xmlPackage.OM1CONTENT__OM147:
				return basicSetOM147(null, msgs);
			case V2xmlPackage.OM1CONTENT__ANY:
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
			case V2xmlPackage.OM1CONTENT__OM11:
				return getOM11();
			case V2xmlPackage.OM1CONTENT__OM12:
				return getOM12();
			case V2xmlPackage.OM1CONTENT__OM13:
				return getOM13();
			case V2xmlPackage.OM1CONTENT__OM14:
				return getOM14();
			case V2xmlPackage.OM1CONTENT__OM15:
				return getOM15();
			case V2xmlPackage.OM1CONTENT__OM16:
				return getOM16();
			case V2xmlPackage.OM1CONTENT__OM17:
				return getOM17();
			case V2xmlPackage.OM1CONTENT__OM18:
				return getOM18();
			case V2xmlPackage.OM1CONTENT__OM19:
				return getOM19();
			case V2xmlPackage.OM1CONTENT__OM110:
				return getOM110();
			case V2xmlPackage.OM1CONTENT__OM111:
				return getOM111();
			case V2xmlPackage.OM1CONTENT__OM112:
				return getOM112();
			case V2xmlPackage.OM1CONTENT__OM113:
				return getOM113();
			case V2xmlPackage.OM1CONTENT__OM114:
				return getOM114();
			case V2xmlPackage.OM1CONTENT__OM115:
				return getOM115();
			case V2xmlPackage.OM1CONTENT__OM116:
				return getOM116();
			case V2xmlPackage.OM1CONTENT__OM117:
				return getOM117();
			case V2xmlPackage.OM1CONTENT__OM118:
				return getOM118();
			case V2xmlPackage.OM1CONTENT__OM119:
				return getOM119();
			case V2xmlPackage.OM1CONTENT__OM120:
				return getOM120();
			case V2xmlPackage.OM1CONTENT__OM121:
				return getOM121();
			case V2xmlPackage.OM1CONTENT__OM122:
				return getOM122();
			case V2xmlPackage.OM1CONTENT__OM123:
				return getOM123();
			case V2xmlPackage.OM1CONTENT__OM124:
				return getOM124();
			case V2xmlPackage.OM1CONTENT__OM125:
				return getOM125();
			case V2xmlPackage.OM1CONTENT__OM126:
				return getOM126();
			case V2xmlPackage.OM1CONTENT__OM127:
				return getOM127();
			case V2xmlPackage.OM1CONTENT__OM128:
				return getOM128();
			case V2xmlPackage.OM1CONTENT__OM129:
				return getOM129();
			case V2xmlPackage.OM1CONTENT__OM130:
				return getOM130();
			case V2xmlPackage.OM1CONTENT__OM131:
				return getOM131();
			case V2xmlPackage.OM1CONTENT__OM132:
				return getOM132();
			case V2xmlPackage.OM1CONTENT__OM133:
				return getOM133();
			case V2xmlPackage.OM1CONTENT__OM134:
				return getOM134();
			case V2xmlPackage.OM1CONTENT__OM135:
				return getOM135();
			case V2xmlPackage.OM1CONTENT__OM136:
				return getOM136();
			case V2xmlPackage.OM1CONTENT__OM137:
				return getOM137();
			case V2xmlPackage.OM1CONTENT__OM138:
				return getOM138();
			case V2xmlPackage.OM1CONTENT__OM139:
				return getOM139();
			case V2xmlPackage.OM1CONTENT__OM140:
				return getOM140();
			case V2xmlPackage.OM1CONTENT__OM141:
				return getOM141();
			case V2xmlPackage.OM1CONTENT__OM142:
				return getOM142();
			case V2xmlPackage.OM1CONTENT__OM143:
				return getOM143();
			case V2xmlPackage.OM1CONTENT__OM144:
				return getOM144();
			case V2xmlPackage.OM1CONTENT__OM145:
				return getOM145();
			case V2xmlPackage.OM1CONTENT__OM146:
				return getOM146();
			case V2xmlPackage.OM1CONTENT__OM147:
				return getOM147();
			case V2xmlPackage.OM1CONTENT__ANY:
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
			case V2xmlPackage.OM1CONTENT__OM11:
				setOM11((OM11CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM12:
				setOM12((OM12CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM13:
				getOM13().clear();
				getOM13().addAll((Collection<? extends OM13CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM14:
				setOM14((OM14CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM15:
				setOM15((OM15CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM16:
				setOM16((OM16CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM17:
				setOM17((OM17CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM18:
				getOM18().clear();
				getOM18().addAll((Collection<? extends OM18CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM19:
				setOM19((OM19CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM110:
				setOM110((OM110CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM111:
				setOM111((OM111CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM112:
				setOM112((OM112CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM113:
				getOM113().clear();
				getOM113().addAll((Collection<? extends OM113CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM114:
				getOM114().clear();
				getOM114().addAll((Collection<? extends OM114CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM115:
				setOM115((OM115CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM116:
				getOM116().clear();
				getOM116().addAll((Collection<? extends OM116CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM117:
				setOM117((OM117CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM118:
				setOM118((OM118CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM119:
				setOM119((OM119CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM120:
				setOM120((OM120CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM121:
				setOM121((OM121CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM122:
				setOM122((OM122CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM123:
				setOM123((OM123CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM124:
				setOM124((OM124CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM125:
				getOM125().clear();
				getOM125().addAll((Collection<? extends OM125CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM126:
				setOM126((OM126CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM127:
				getOM127().clear();
				getOM127().addAll((Collection<? extends OM127CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM128:
				getOM128().clear();
				getOM128().addAll((Collection<? extends OM128CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM129:
				setOM129((OM129CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM130:
				setOM130((OM130CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM131:
				setOM131((OM131CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM132:
				setOM132((OM132CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM133:
				setOM133((OM133CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM134:
				getOM134().clear();
				getOM134().addAll((Collection<? extends OM134CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM135:
				setOM135((OM135CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM136:
				setOM136((OM136CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM137:
				setOM137((OM137CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM138:
				setOM138((OM138CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM139:
				setOM139((OM139CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM140:
				getOM140().clear();
				getOM140().addAll((Collection<? extends OM140CONTENT>)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM141:
				setOM141((OM141CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM142:
				setOM142((OM142CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM143:
				setOM143((OM143CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM144:
				setOM144((OM144CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM145:
				setOM145((OM145CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM146:
				setOM146((OM146CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__OM147:
				setOM147((OM147CONTENT)newValue);
				return;
			case V2xmlPackage.OM1CONTENT__ANY:
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
			case V2xmlPackage.OM1CONTENT__OM11:
				setOM11((OM11CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM12:
				setOM12((OM12CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM13:
				getOM13().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM14:
				setOM14((OM14CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM15:
				setOM15((OM15CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM16:
				setOM16((OM16CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM17:
				setOM17((OM17CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM18:
				getOM18().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM19:
				setOM19((OM19CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM110:
				setOM110((OM110CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM111:
				setOM111((OM111CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM112:
				setOM112((OM112CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM113:
				getOM113().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM114:
				getOM114().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM115:
				setOM115((OM115CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM116:
				getOM116().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM117:
				setOM117((OM117CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM118:
				setOM118((OM118CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM119:
				setOM119((OM119CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM120:
				setOM120((OM120CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM121:
				setOM121((OM121CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM122:
				setOM122((OM122CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM123:
				setOM123((OM123CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM124:
				setOM124((OM124CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM125:
				getOM125().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM126:
				setOM126((OM126CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM127:
				getOM127().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM128:
				getOM128().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM129:
				setOM129((OM129CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM130:
				setOM130((OM130CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM131:
				setOM131((OM131CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM132:
				setOM132((OM132CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM133:
				setOM133((OM133CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM134:
				getOM134().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM135:
				setOM135((OM135CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM136:
				setOM136((OM136CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM137:
				setOM137((OM137CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM138:
				setOM138((OM138CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM139:
				setOM139((OM139CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM140:
				getOM140().clear();
				return;
			case V2xmlPackage.OM1CONTENT__OM141:
				setOM141((OM141CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM142:
				setOM142((OM142CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM143:
				setOM143((OM143CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM144:
				setOM144((OM144CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM145:
				setOM145((OM145CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM146:
				setOM146((OM146CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__OM147:
				setOM147((OM147CONTENT)null);
				return;
			case V2xmlPackage.OM1CONTENT__ANY:
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
			case V2xmlPackage.OM1CONTENT__OM11:
				return oM11 != null;
			case V2xmlPackage.OM1CONTENT__OM12:
				return oM12 != null;
			case V2xmlPackage.OM1CONTENT__OM13:
				return oM13 != null && !oM13.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM14:
				return oM14 != null;
			case V2xmlPackage.OM1CONTENT__OM15:
				return oM15 != null;
			case V2xmlPackage.OM1CONTENT__OM16:
				return oM16 != null;
			case V2xmlPackage.OM1CONTENT__OM17:
				return oM17 != null;
			case V2xmlPackage.OM1CONTENT__OM18:
				return oM18 != null && !oM18.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM19:
				return oM19 != null;
			case V2xmlPackage.OM1CONTENT__OM110:
				return oM110 != null;
			case V2xmlPackage.OM1CONTENT__OM111:
				return oM111 != null;
			case V2xmlPackage.OM1CONTENT__OM112:
				return oM112 != null;
			case V2xmlPackage.OM1CONTENT__OM113:
				return oM113 != null && !oM113.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM114:
				return oM114 != null && !oM114.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM115:
				return oM115 != null;
			case V2xmlPackage.OM1CONTENT__OM116:
				return oM116 != null && !oM116.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM117:
				return oM117 != null;
			case V2xmlPackage.OM1CONTENT__OM118:
				return oM118 != null;
			case V2xmlPackage.OM1CONTENT__OM119:
				return oM119 != null;
			case V2xmlPackage.OM1CONTENT__OM120:
				return oM120 != null;
			case V2xmlPackage.OM1CONTENT__OM121:
				return oM121 != null;
			case V2xmlPackage.OM1CONTENT__OM122:
				return oM122 != null;
			case V2xmlPackage.OM1CONTENT__OM123:
				return oM123 != null;
			case V2xmlPackage.OM1CONTENT__OM124:
				return oM124 != null;
			case V2xmlPackage.OM1CONTENT__OM125:
				return oM125 != null && !oM125.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM126:
				return oM126 != null;
			case V2xmlPackage.OM1CONTENT__OM127:
				return oM127 != null && !oM127.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM128:
				return oM128 != null && !oM128.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM129:
				return oM129 != null;
			case V2xmlPackage.OM1CONTENT__OM130:
				return oM130 != null;
			case V2xmlPackage.OM1CONTENT__OM131:
				return oM131 != null;
			case V2xmlPackage.OM1CONTENT__OM132:
				return oM132 != null;
			case V2xmlPackage.OM1CONTENT__OM133:
				return oM133 != null;
			case V2xmlPackage.OM1CONTENT__OM134:
				return oM134 != null && !oM134.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM135:
				return oM135 != null;
			case V2xmlPackage.OM1CONTENT__OM136:
				return oM136 != null;
			case V2xmlPackage.OM1CONTENT__OM137:
				return oM137 != null;
			case V2xmlPackage.OM1CONTENT__OM138:
				return oM138 != null;
			case V2xmlPackage.OM1CONTENT__OM139:
				return oM139 != null;
			case V2xmlPackage.OM1CONTENT__OM140:
				return oM140 != null && !oM140.isEmpty();
			case V2xmlPackage.OM1CONTENT__OM141:
				return oM141 != null;
			case V2xmlPackage.OM1CONTENT__OM142:
				return oM142 != null;
			case V2xmlPackage.OM1CONTENT__OM143:
				return oM143 != null;
			case V2xmlPackage.OM1CONTENT__OM144:
				return oM144 != null;
			case V2xmlPackage.OM1CONTENT__OM145:
				return oM145 != null;
			case V2xmlPackage.OM1CONTENT__OM146:
				return oM146 != null;
			case V2xmlPackage.OM1CONTENT__OM147:
				return oM147 != null;
			case V2xmlPackage.OM1CONTENT__ANY:
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

} //OM1CONTENTImpl
