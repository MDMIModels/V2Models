/**
 */
package org.hl7.v2xml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PD1CONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD11 <em>PD11</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD12 <em>PD12</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD13 <em>PD13</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD14 <em>PD14</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD15 <em>PD15</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD16 <em>PD16</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD17 <em>PD17</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD18 <em>PD18</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD19 <em>PD19</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD110 <em>PD110</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD111 <em>PD111</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD112 <em>PD112</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD113 <em>PD113</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD114 <em>PD114</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD115 <em>PD115</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD116 <em>PD116</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD117 <em>PD117</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD118 <em>PD118</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD119 <em>PD119</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD120 <em>PD120</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getPD121 <em>PD121</em>}</li>
 *   <li>{@link org.hl7.v2xml.PD1CONTENT#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT()
 * @model extendedMetaData="name='PD1.CONTENT' kind='elementOnly'"
 * @generated
 */
public interface PD1CONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>PD11</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD11CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD11</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD11</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD11()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.1' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD11CONTENT> getPD11();

	/**
	 * Returns the value of the '<em><b>PD12</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD12</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD12</em>' containment reference.
	 * @see #setPD12(PD12CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD12()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.2' namespace='##targetNamespace'"
	 * @generated
	 */
	PD12CONTENT getPD12();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD12 <em>PD12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD12</em>' containment reference.
	 * @see #getPD12()
	 * @generated
	 */
	void setPD12(PD12CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD13</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD13CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD13</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD13</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD13()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.3' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD13CONTENT> getPD13();

	/**
	 * Returns the value of the '<em><b>PD14</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD14CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD14</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD14</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD14()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.4' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD14CONTENT> getPD14();

	/**
	 * Returns the value of the '<em><b>PD15</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD15</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD15</em>' containment reference.
	 * @see #setPD15(PD15CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD15()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.5' namespace='##targetNamespace'"
	 * @generated
	 */
	PD15CONTENT getPD15();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD15 <em>PD15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD15</em>' containment reference.
	 * @see #getPD15()
	 * @generated
	 */
	void setPD15(PD15CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD16</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD16</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD16</em>' containment reference.
	 * @see #setPD16(PD16CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD16()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.6' namespace='##targetNamespace'"
	 * @generated
	 */
	PD16CONTENT getPD16();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD16 <em>PD16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD16</em>' containment reference.
	 * @see #getPD16()
	 * @generated
	 */
	void setPD16(PD16CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD17</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD17</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD17</em>' containment reference.
	 * @see #setPD17(PD17CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD17()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.7' namespace='##targetNamespace'"
	 * @generated
	 */
	PD17CONTENT getPD17();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD17 <em>PD17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD17</em>' containment reference.
	 * @see #getPD17()
	 * @generated
	 */
	void setPD17(PD17CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD18</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD18</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD18</em>' containment reference.
	 * @see #setPD18(PD18CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD18()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.8' namespace='##targetNamespace'"
	 * @generated
	 */
	PD18CONTENT getPD18();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD18 <em>PD18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD18</em>' containment reference.
	 * @see #getPD18()
	 * @generated
	 */
	void setPD18(PD18CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD19</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD19</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD19</em>' containment reference.
	 * @see #setPD19(PD19CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD19()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.9' namespace='##targetNamespace'"
	 * @generated
	 */
	PD19CONTENT getPD19();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD19 <em>PD19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD19</em>' containment reference.
	 * @see #getPD19()
	 * @generated
	 */
	void setPD19(PD19CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD110</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD110CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD110</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD110</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD110()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.10' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD110CONTENT> getPD110();

	/**
	 * Returns the value of the '<em><b>PD111</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD111</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD111</em>' containment reference.
	 * @see #setPD111(PD111CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD111()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.11' namespace='##targetNamespace'"
	 * @generated
	 */
	PD111CONTENT getPD111();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD111 <em>PD111</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD111</em>' containment reference.
	 * @see #getPD111()
	 * @generated
	 */
	void setPD111(PD111CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD112</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD112</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD112</em>' containment reference.
	 * @see #setPD112(PD112CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD112()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.12' namespace='##targetNamespace'"
	 * @generated
	 */
	PD112CONTENT getPD112();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD112 <em>PD112</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD112</em>' containment reference.
	 * @see #getPD112()
	 * @generated
	 */
	void setPD112(PD112CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD113</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD113</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD113</em>' containment reference.
	 * @see #setPD113(PD113CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD113()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.13' namespace='##targetNamespace'"
	 * @generated
	 */
	PD113CONTENT getPD113();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD113 <em>PD113</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD113</em>' containment reference.
	 * @see #getPD113()
	 * @generated
	 */
	void setPD113(PD113CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD114</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD114CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD114</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD114</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD114()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.14' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD114CONTENT> getPD114();

	/**
	 * Returns the value of the '<em><b>PD115</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.v2xml.PD115CONTENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD115</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD115</em>' containment reference list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD115()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.15' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PD115CONTENT> getPD115();

	/**
	 * Returns the value of the '<em><b>PD116</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD116</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD116</em>' containment reference.
	 * @see #setPD116(PD116CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD116()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.16' namespace='##targetNamespace'"
	 * @generated
	 */
	PD116CONTENT getPD116();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD116 <em>PD116</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD116</em>' containment reference.
	 * @see #getPD116()
	 * @generated
	 */
	void setPD116(PD116CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD117</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD117</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD117</em>' containment reference.
	 * @see #setPD117(PD117CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD117()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.17' namespace='##targetNamespace'"
	 * @generated
	 */
	PD117CONTENT getPD117();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD117 <em>PD117</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD117</em>' containment reference.
	 * @see #getPD117()
	 * @generated
	 */
	void setPD117(PD117CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD118</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD118</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD118</em>' containment reference.
	 * @see #setPD118(PD118CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD118()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.18' namespace='##targetNamespace'"
	 * @generated
	 */
	PD118CONTENT getPD118();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD118 <em>PD118</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD118</em>' containment reference.
	 * @see #getPD118()
	 * @generated
	 */
	void setPD118(PD118CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD119</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD119</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD119</em>' containment reference.
	 * @see #setPD119(PD119CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD119()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.19' namespace='##targetNamespace'"
	 * @generated
	 */
	PD119CONTENT getPD119();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD119 <em>PD119</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD119</em>' containment reference.
	 * @see #getPD119()
	 * @generated
	 */
	void setPD119(PD119CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD120</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD120</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD120</em>' containment reference.
	 * @see #setPD120(PD120CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD120()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.20' namespace='##targetNamespace'"
	 * @generated
	 */
	PD120CONTENT getPD120();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD120 <em>PD120</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD120</em>' containment reference.
	 * @see #getPD120()
	 * @generated
	 */
	void setPD120(PD120CONTENT value);

	/**
	 * Returns the value of the '<em><b>PD121</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PD121</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PD121</em>' containment reference.
	 * @see #setPD121(PD121CONTENT)
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_PD121()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PD1.21' namespace='##targetNamespace'"
	 * @generated
	 */
	PD121CONTENT getPD121();

	/**
	 * Sets the value of the '{@link org.hl7.v2xml.PD1CONTENT#getPD121 <em>PD121</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PD121</em>' containment reference.
	 * @see #getPD121()
	 * @generated
	 */
	void setPD121(PD121CONTENT value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.hl7.v2xml.V2xmlPackage#getPD1CONTENT_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':21' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // PD1CONTENT
