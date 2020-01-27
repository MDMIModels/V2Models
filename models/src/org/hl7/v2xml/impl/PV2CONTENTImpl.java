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

import org.hl7.v2xml.PV210CONTENT;
import org.hl7.v2xml.PV211CONTENT;
import org.hl7.v2xml.PV212CONTENT;
import org.hl7.v2xml.PV213CONTENT;
import org.hl7.v2xml.PV214CONTENT;
import org.hl7.v2xml.PV215CONTENT;
import org.hl7.v2xml.PV216CONTENT;
import org.hl7.v2xml.PV217CONTENT;
import org.hl7.v2xml.PV218CONTENT;
import org.hl7.v2xml.PV219CONTENT;
import org.hl7.v2xml.PV21CONTENT;
import org.hl7.v2xml.PV220CONTENT;
import org.hl7.v2xml.PV221CONTENT;
import org.hl7.v2xml.PV222CONTENT;
import org.hl7.v2xml.PV223CONTENT;
import org.hl7.v2xml.PV224CONTENT;
import org.hl7.v2xml.PV225CONTENT;
import org.hl7.v2xml.PV226CONTENT;
import org.hl7.v2xml.PV227CONTENT;
import org.hl7.v2xml.PV228CONTENT;
import org.hl7.v2xml.PV229CONTENT;
import org.hl7.v2xml.PV22CONTENT;
import org.hl7.v2xml.PV230CONTENT;
import org.hl7.v2xml.PV231CONTENT;
import org.hl7.v2xml.PV232CONTENT;
import org.hl7.v2xml.PV233CONTENT;
import org.hl7.v2xml.PV234CONTENT;
import org.hl7.v2xml.PV235CONTENT;
import org.hl7.v2xml.PV236CONTENT;
import org.hl7.v2xml.PV237CONTENT;
import org.hl7.v2xml.PV238CONTENT;
import org.hl7.v2xml.PV239CONTENT;
import org.hl7.v2xml.PV23CONTENT;
import org.hl7.v2xml.PV240CONTENT;
import org.hl7.v2xml.PV241CONTENT;
import org.hl7.v2xml.PV242CONTENT;
import org.hl7.v2xml.PV243CONTENT;
import org.hl7.v2xml.PV244CONTENT;
import org.hl7.v2xml.PV245CONTENT;
import org.hl7.v2xml.PV246CONTENT;
import org.hl7.v2xml.PV247CONTENT;
import org.hl7.v2xml.PV248CONTENT;
import org.hl7.v2xml.PV249CONTENT;
import org.hl7.v2xml.PV24CONTENT;
import org.hl7.v2xml.PV25CONTENT;
import org.hl7.v2xml.PV26CONTENT;
import org.hl7.v2xml.PV27CONTENT;
import org.hl7.v2xml.PV28CONTENT;
import org.hl7.v2xml.PV29CONTENT;
import org.hl7.v2xml.PV2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PV2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV21 <em>PV21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV22 <em>PV22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV23 <em>PV23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV24 <em>PV24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV25 <em>PV25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV26 <em>PV26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV27 <em>PV27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV28 <em>PV28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV29 <em>PV29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV210 <em>PV210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV211 <em>PV211</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV212 <em>PV212</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV213 <em>PV213</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV214 <em>PV214</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV215 <em>PV215</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV216 <em>PV216</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV217 <em>PV217</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV218 <em>PV218</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV219 <em>PV219</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV220 <em>PV220</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV221 <em>PV221</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV222 <em>PV222</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV223 <em>PV223</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV224 <em>PV224</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV225 <em>PV225</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV226 <em>PV226</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV227 <em>PV227</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV228 <em>PV228</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV229 <em>PV229</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV230 <em>PV230</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV231 <em>PV231</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV232 <em>PV232</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV233 <em>PV233</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV234 <em>PV234</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV235 <em>PV235</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV236 <em>PV236</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV237 <em>PV237</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV238 <em>PV238</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV239 <em>PV239</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV240 <em>PV240</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV241 <em>PV241</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV242 <em>PV242</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV243 <em>PV243</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV244 <em>PV244</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV245 <em>PV245</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV246 <em>PV246</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV247 <em>PV247</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV248 <em>PV248</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getPV249 <em>PV249</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.PV2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PV2CONTENTImpl extends EObjectImpl implements PV2CONTENT {
	/**
	 * The cached value of the '{@link #getPV21() <em>PV21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV21()
	 * @generated
	 * @ordered
	 */
	protected PV21CONTENT pV21;

	/**
	 * The cached value of the '{@link #getPV22() <em>PV22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV22()
	 * @generated
	 * @ordered
	 */
	protected PV22CONTENT pV22;

	/**
	 * The cached value of the '{@link #getPV23() <em>PV23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV23()
	 * @generated
	 * @ordered
	 */
	protected PV23CONTENT pV23;

	/**
	 * The cached value of the '{@link #getPV24() <em>PV24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV24()
	 * @generated
	 * @ordered
	 */
	protected PV24CONTENT pV24;

	/**
	 * The cached value of the '{@link #getPV25() <em>PV25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV25()
	 * @generated
	 * @ordered
	 */
	protected EList<PV25CONTENT> pV25;

	/**
	 * The cached value of the '{@link #getPV26() <em>PV26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV26()
	 * @generated
	 * @ordered
	 */
	protected PV26CONTENT pV26;

	/**
	 * The cached value of the '{@link #getPV27() <em>PV27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV27()
	 * @generated
	 * @ordered
	 */
	protected EList<PV27CONTENT> pV27;

	/**
	 * The cached value of the '{@link #getPV28() <em>PV28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV28()
	 * @generated
	 * @ordered
	 */
	protected PV28CONTENT pV28;

	/**
	 * The cached value of the '{@link #getPV29() <em>PV29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV29()
	 * @generated
	 * @ordered
	 */
	protected PV29CONTENT pV29;

	/**
	 * The cached value of the '{@link #getPV210() <em>PV210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV210()
	 * @generated
	 * @ordered
	 */
	protected PV210CONTENT pV210;

	/**
	 * The cached value of the '{@link #getPV211() <em>PV211</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV211()
	 * @generated
	 * @ordered
	 */
	protected PV211CONTENT pV211;

	/**
	 * The cached value of the '{@link #getPV212() <em>PV212</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV212()
	 * @generated
	 * @ordered
	 */
	protected PV212CONTENT pV212;

	/**
	 * The cached value of the '{@link #getPV213() <em>PV213</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV213()
	 * @generated
	 * @ordered
	 */
	protected EList<PV213CONTENT> pV213;

	/**
	 * The cached value of the '{@link #getPV214() <em>PV214</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV214()
	 * @generated
	 * @ordered
	 */
	protected PV214CONTENT pV214;

	/**
	 * The cached value of the '{@link #getPV215() <em>PV215</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV215()
	 * @generated
	 * @ordered
	 */
	protected PV215CONTENT pV215;

	/**
	 * The cached value of the '{@link #getPV216() <em>PV216</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV216()
	 * @generated
	 * @ordered
	 */
	protected PV216CONTENT pV216;

	/**
	 * The cached value of the '{@link #getPV217() <em>PV217</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV217()
	 * @generated
	 * @ordered
	 */
	protected PV217CONTENT pV217;

	/**
	 * The cached value of the '{@link #getPV218() <em>PV218</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV218()
	 * @generated
	 * @ordered
	 */
	protected PV218CONTENT pV218;

	/**
	 * The cached value of the '{@link #getPV219() <em>PV219</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV219()
	 * @generated
	 * @ordered
	 */
	protected PV219CONTENT pV219;

	/**
	 * The cached value of the '{@link #getPV220() <em>PV220</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV220()
	 * @generated
	 * @ordered
	 */
	protected PV220CONTENT pV220;

	/**
	 * The cached value of the '{@link #getPV221() <em>PV221</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV221()
	 * @generated
	 * @ordered
	 */
	protected PV221CONTENT pV221;

	/**
	 * The cached value of the '{@link #getPV222() <em>PV222</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV222()
	 * @generated
	 * @ordered
	 */
	protected PV222CONTENT pV222;

	/**
	 * The cached value of the '{@link #getPV223() <em>PV223</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV223()
	 * @generated
	 * @ordered
	 */
	protected EList<PV223CONTENT> pV223;

	/**
	 * The cached value of the '{@link #getPV224() <em>PV224</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV224()
	 * @generated
	 * @ordered
	 */
	protected PV224CONTENT pV224;

	/**
	 * The cached value of the '{@link #getPV225() <em>PV225</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV225()
	 * @generated
	 * @ordered
	 */
	protected PV225CONTENT pV225;

	/**
	 * The cached value of the '{@link #getPV226() <em>PV226</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV226()
	 * @generated
	 * @ordered
	 */
	protected PV226CONTENT pV226;

	/**
	 * The cached value of the '{@link #getPV227() <em>PV227</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV227()
	 * @generated
	 * @ordered
	 */
	protected PV227CONTENT pV227;

	/**
	 * The cached value of the '{@link #getPV228() <em>PV228</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV228()
	 * @generated
	 * @ordered
	 */
	protected PV228CONTENT pV228;

	/**
	 * The cached value of the '{@link #getPV229() <em>PV229</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV229()
	 * @generated
	 * @ordered
	 */
	protected PV229CONTENT pV229;

	/**
	 * The cached value of the '{@link #getPV230() <em>PV230</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV230()
	 * @generated
	 * @ordered
	 */
	protected PV230CONTENT pV230;

	/**
	 * The cached value of the '{@link #getPV231() <em>PV231</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV231()
	 * @generated
	 * @ordered
	 */
	protected PV231CONTENT pV231;

	/**
	 * The cached value of the '{@link #getPV232() <em>PV232</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV232()
	 * @generated
	 * @ordered
	 */
	protected PV232CONTENT pV232;

	/**
	 * The cached value of the '{@link #getPV233() <em>PV233</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV233()
	 * @generated
	 * @ordered
	 */
	protected PV233CONTENT pV233;

	/**
	 * The cached value of the '{@link #getPV234() <em>PV234</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV234()
	 * @generated
	 * @ordered
	 */
	protected PV234CONTENT pV234;

	/**
	 * The cached value of the '{@link #getPV235() <em>PV235</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV235()
	 * @generated
	 * @ordered
	 */
	protected PV235CONTENT pV235;

	/**
	 * The cached value of the '{@link #getPV236() <em>PV236</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV236()
	 * @generated
	 * @ordered
	 */
	protected PV236CONTENT pV236;

	/**
	 * The cached value of the '{@link #getPV237() <em>PV237</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV237()
	 * @generated
	 * @ordered
	 */
	protected PV237CONTENT pV237;

	/**
	 * The cached value of the '{@link #getPV238() <em>PV238</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV238()
	 * @generated
	 * @ordered
	 */
	protected PV238CONTENT pV238;

	/**
	 * The cached value of the '{@link #getPV239() <em>PV239</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV239()
	 * @generated
	 * @ordered
	 */
	protected EList<PV239CONTENT> pV239;

	/**
	 * The cached value of the '{@link #getPV240() <em>PV240</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV240()
	 * @generated
	 * @ordered
	 */
	protected PV240CONTENT pV240;

	/**
	 * The cached value of the '{@link #getPV241() <em>PV241</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV241()
	 * @generated
	 * @ordered
	 */
	protected EList<PV241CONTENT> pV241;

	/**
	 * The cached value of the '{@link #getPV242() <em>PV242</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV242()
	 * @generated
	 * @ordered
	 */
	protected PV242CONTENT pV242;

	/**
	 * The cached value of the '{@link #getPV243() <em>PV243</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV243()
	 * @generated
	 * @ordered
	 */
	protected PV243CONTENT pV243;

	/**
	 * The cached value of the '{@link #getPV244() <em>PV244</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV244()
	 * @generated
	 * @ordered
	 */
	protected PV244CONTENT pV244;

	/**
	 * The cached value of the '{@link #getPV245() <em>PV245</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV245()
	 * @generated
	 * @ordered
	 */
	protected EList<PV245CONTENT> pV245;

	/**
	 * The cached value of the '{@link #getPV246() <em>PV246</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV246()
	 * @generated
	 * @ordered
	 */
	protected PV246CONTENT pV246;

	/**
	 * The cached value of the '{@link #getPV247() <em>PV247</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV247()
	 * @generated
	 * @ordered
	 */
	protected PV247CONTENT pV247;

	/**
	 * The cached value of the '{@link #getPV248() <em>PV248</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV248()
	 * @generated
	 * @ordered
	 */
	protected PV248CONTENT pV248;

	/**
	 * The cached value of the '{@link #getPV249() <em>PV249</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPV249()
	 * @generated
	 * @ordered
	 */
	protected EList<PV249CONTENT> pV249;

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
	protected PV2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getPV2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV21CONTENT getPV21() {
		return pV21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV21(PV21CONTENT newPV21, NotificationChain msgs) {
		PV21CONTENT oldPV21 = pV21;
		pV21 = newPV21;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV21, oldPV21, newPV21);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV21(PV21CONTENT newPV21) {
		if (newPV21 != pV21) {
			NotificationChain msgs = null;
			if (pV21 != null)
				msgs = ((InternalEObject)pV21).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV21, null, msgs);
			if (newPV21 != null)
				msgs = ((InternalEObject)newPV21).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV21, null, msgs);
			msgs = basicSetPV21(newPV21, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV21, newPV21, newPV21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV22CONTENT getPV22() {
		return pV22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV22(PV22CONTENT newPV22, NotificationChain msgs) {
		PV22CONTENT oldPV22 = pV22;
		pV22 = newPV22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV22, oldPV22, newPV22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV22(PV22CONTENT newPV22) {
		if (newPV22 != pV22) {
			NotificationChain msgs = null;
			if (pV22 != null)
				msgs = ((InternalEObject)pV22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV22, null, msgs);
			if (newPV22 != null)
				msgs = ((InternalEObject)newPV22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV22, null, msgs);
			msgs = basicSetPV22(newPV22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV22, newPV22, newPV22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV23CONTENT getPV23() {
		return pV23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV23(PV23CONTENT newPV23, NotificationChain msgs) {
		PV23CONTENT oldPV23 = pV23;
		pV23 = newPV23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV23, oldPV23, newPV23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV23(PV23CONTENT newPV23) {
		if (newPV23 != pV23) {
			NotificationChain msgs = null;
			if (pV23 != null)
				msgs = ((InternalEObject)pV23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV23, null, msgs);
			if (newPV23 != null)
				msgs = ((InternalEObject)newPV23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV23, null, msgs);
			msgs = basicSetPV23(newPV23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV23, newPV23, newPV23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV24CONTENT getPV24() {
		return pV24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV24(PV24CONTENT newPV24, NotificationChain msgs) {
		PV24CONTENT oldPV24 = pV24;
		pV24 = newPV24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV24, oldPV24, newPV24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV24(PV24CONTENT newPV24) {
		if (newPV24 != pV24) {
			NotificationChain msgs = null;
			if (pV24 != null)
				msgs = ((InternalEObject)pV24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV24, null, msgs);
			if (newPV24 != null)
				msgs = ((InternalEObject)newPV24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV24, null, msgs);
			msgs = basicSetPV24(newPV24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV24, newPV24, newPV24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV25CONTENT> getPV25() {
		if (pV25 == null) {
			pV25 = new EObjectContainmentEList<PV25CONTENT>(PV25CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV25);
		}
		return pV25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV26CONTENT getPV26() {
		return pV26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV26(PV26CONTENT newPV26, NotificationChain msgs) {
		PV26CONTENT oldPV26 = pV26;
		pV26 = newPV26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV26, oldPV26, newPV26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV26(PV26CONTENT newPV26) {
		if (newPV26 != pV26) {
			NotificationChain msgs = null;
			if (pV26 != null)
				msgs = ((InternalEObject)pV26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV26, null, msgs);
			if (newPV26 != null)
				msgs = ((InternalEObject)newPV26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV26, null, msgs);
			msgs = basicSetPV26(newPV26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV26, newPV26, newPV26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV27CONTENT> getPV27() {
		if (pV27 == null) {
			pV27 = new EObjectContainmentEList<PV27CONTENT>(PV27CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV27);
		}
		return pV27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV28CONTENT getPV28() {
		return pV28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV28(PV28CONTENT newPV28, NotificationChain msgs) {
		PV28CONTENT oldPV28 = pV28;
		pV28 = newPV28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV28, oldPV28, newPV28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV28(PV28CONTENT newPV28) {
		if (newPV28 != pV28) {
			NotificationChain msgs = null;
			if (pV28 != null)
				msgs = ((InternalEObject)pV28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV28, null, msgs);
			if (newPV28 != null)
				msgs = ((InternalEObject)newPV28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV28, null, msgs);
			msgs = basicSetPV28(newPV28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV28, newPV28, newPV28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV29CONTENT getPV29() {
		return pV29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV29(PV29CONTENT newPV29, NotificationChain msgs) {
		PV29CONTENT oldPV29 = pV29;
		pV29 = newPV29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV29, oldPV29, newPV29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV29(PV29CONTENT newPV29) {
		if (newPV29 != pV29) {
			NotificationChain msgs = null;
			if (pV29 != null)
				msgs = ((InternalEObject)pV29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV29, null, msgs);
			if (newPV29 != null)
				msgs = ((InternalEObject)newPV29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV29, null, msgs);
			msgs = basicSetPV29(newPV29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV29, newPV29, newPV29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV210CONTENT getPV210() {
		return pV210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV210(PV210CONTENT newPV210, NotificationChain msgs) {
		PV210CONTENT oldPV210 = pV210;
		pV210 = newPV210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV210, oldPV210, newPV210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV210(PV210CONTENT newPV210) {
		if (newPV210 != pV210) {
			NotificationChain msgs = null;
			if (pV210 != null)
				msgs = ((InternalEObject)pV210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV210, null, msgs);
			if (newPV210 != null)
				msgs = ((InternalEObject)newPV210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV210, null, msgs);
			msgs = basicSetPV210(newPV210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV210, newPV210, newPV210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV211CONTENT getPV211() {
		return pV211;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV211(PV211CONTENT newPV211, NotificationChain msgs) {
		PV211CONTENT oldPV211 = pV211;
		pV211 = newPV211;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV211, oldPV211, newPV211);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV211(PV211CONTENT newPV211) {
		if (newPV211 != pV211) {
			NotificationChain msgs = null;
			if (pV211 != null)
				msgs = ((InternalEObject)pV211).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV211, null, msgs);
			if (newPV211 != null)
				msgs = ((InternalEObject)newPV211).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV211, null, msgs);
			msgs = basicSetPV211(newPV211, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV211, newPV211, newPV211));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV212CONTENT getPV212() {
		return pV212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV212(PV212CONTENT newPV212, NotificationChain msgs) {
		PV212CONTENT oldPV212 = pV212;
		pV212 = newPV212;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV212, oldPV212, newPV212);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV212(PV212CONTENT newPV212) {
		if (newPV212 != pV212) {
			NotificationChain msgs = null;
			if (pV212 != null)
				msgs = ((InternalEObject)pV212).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV212, null, msgs);
			if (newPV212 != null)
				msgs = ((InternalEObject)newPV212).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV212, null, msgs);
			msgs = basicSetPV212(newPV212, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV212, newPV212, newPV212));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV213CONTENT> getPV213() {
		if (pV213 == null) {
			pV213 = new EObjectContainmentEList<PV213CONTENT>(PV213CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV213);
		}
		return pV213;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV214CONTENT getPV214() {
		return pV214;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV214(PV214CONTENT newPV214, NotificationChain msgs) {
		PV214CONTENT oldPV214 = pV214;
		pV214 = newPV214;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV214, oldPV214, newPV214);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV214(PV214CONTENT newPV214) {
		if (newPV214 != pV214) {
			NotificationChain msgs = null;
			if (pV214 != null)
				msgs = ((InternalEObject)pV214).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV214, null, msgs);
			if (newPV214 != null)
				msgs = ((InternalEObject)newPV214).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV214, null, msgs);
			msgs = basicSetPV214(newPV214, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV214, newPV214, newPV214));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV215CONTENT getPV215() {
		return pV215;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV215(PV215CONTENT newPV215, NotificationChain msgs) {
		PV215CONTENT oldPV215 = pV215;
		pV215 = newPV215;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV215, oldPV215, newPV215);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV215(PV215CONTENT newPV215) {
		if (newPV215 != pV215) {
			NotificationChain msgs = null;
			if (pV215 != null)
				msgs = ((InternalEObject)pV215).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV215, null, msgs);
			if (newPV215 != null)
				msgs = ((InternalEObject)newPV215).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV215, null, msgs);
			msgs = basicSetPV215(newPV215, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV215, newPV215, newPV215));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV216CONTENT getPV216() {
		return pV216;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV216(PV216CONTENT newPV216, NotificationChain msgs) {
		PV216CONTENT oldPV216 = pV216;
		pV216 = newPV216;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV216, oldPV216, newPV216);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV216(PV216CONTENT newPV216) {
		if (newPV216 != pV216) {
			NotificationChain msgs = null;
			if (pV216 != null)
				msgs = ((InternalEObject)pV216).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV216, null, msgs);
			if (newPV216 != null)
				msgs = ((InternalEObject)newPV216).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV216, null, msgs);
			msgs = basicSetPV216(newPV216, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV216, newPV216, newPV216));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV217CONTENT getPV217() {
		return pV217;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV217(PV217CONTENT newPV217, NotificationChain msgs) {
		PV217CONTENT oldPV217 = pV217;
		pV217 = newPV217;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV217, oldPV217, newPV217);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV217(PV217CONTENT newPV217) {
		if (newPV217 != pV217) {
			NotificationChain msgs = null;
			if (pV217 != null)
				msgs = ((InternalEObject)pV217).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV217, null, msgs);
			if (newPV217 != null)
				msgs = ((InternalEObject)newPV217).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV217, null, msgs);
			msgs = basicSetPV217(newPV217, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV217, newPV217, newPV217));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV218CONTENT getPV218() {
		return pV218;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV218(PV218CONTENT newPV218, NotificationChain msgs) {
		PV218CONTENT oldPV218 = pV218;
		pV218 = newPV218;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV218, oldPV218, newPV218);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV218(PV218CONTENT newPV218) {
		if (newPV218 != pV218) {
			NotificationChain msgs = null;
			if (pV218 != null)
				msgs = ((InternalEObject)pV218).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV218, null, msgs);
			if (newPV218 != null)
				msgs = ((InternalEObject)newPV218).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV218, null, msgs);
			msgs = basicSetPV218(newPV218, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV218, newPV218, newPV218));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV219CONTENT getPV219() {
		return pV219;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV219(PV219CONTENT newPV219, NotificationChain msgs) {
		PV219CONTENT oldPV219 = pV219;
		pV219 = newPV219;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV219, oldPV219, newPV219);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV219(PV219CONTENT newPV219) {
		if (newPV219 != pV219) {
			NotificationChain msgs = null;
			if (pV219 != null)
				msgs = ((InternalEObject)pV219).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV219, null, msgs);
			if (newPV219 != null)
				msgs = ((InternalEObject)newPV219).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV219, null, msgs);
			msgs = basicSetPV219(newPV219, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV219, newPV219, newPV219));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV220CONTENT getPV220() {
		return pV220;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV220(PV220CONTENT newPV220, NotificationChain msgs) {
		PV220CONTENT oldPV220 = pV220;
		pV220 = newPV220;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV220, oldPV220, newPV220);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV220(PV220CONTENT newPV220) {
		if (newPV220 != pV220) {
			NotificationChain msgs = null;
			if (pV220 != null)
				msgs = ((InternalEObject)pV220).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV220, null, msgs);
			if (newPV220 != null)
				msgs = ((InternalEObject)newPV220).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV220, null, msgs);
			msgs = basicSetPV220(newPV220, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV220, newPV220, newPV220));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV221CONTENT getPV221() {
		return pV221;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV221(PV221CONTENT newPV221, NotificationChain msgs) {
		PV221CONTENT oldPV221 = pV221;
		pV221 = newPV221;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV221, oldPV221, newPV221);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV221(PV221CONTENT newPV221) {
		if (newPV221 != pV221) {
			NotificationChain msgs = null;
			if (pV221 != null)
				msgs = ((InternalEObject)pV221).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV221, null, msgs);
			if (newPV221 != null)
				msgs = ((InternalEObject)newPV221).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV221, null, msgs);
			msgs = basicSetPV221(newPV221, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV221, newPV221, newPV221));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV222CONTENT getPV222() {
		return pV222;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV222(PV222CONTENT newPV222, NotificationChain msgs) {
		PV222CONTENT oldPV222 = pV222;
		pV222 = newPV222;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV222, oldPV222, newPV222);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV222(PV222CONTENT newPV222) {
		if (newPV222 != pV222) {
			NotificationChain msgs = null;
			if (pV222 != null)
				msgs = ((InternalEObject)pV222).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV222, null, msgs);
			if (newPV222 != null)
				msgs = ((InternalEObject)newPV222).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV222, null, msgs);
			msgs = basicSetPV222(newPV222, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV222, newPV222, newPV222));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV223CONTENT> getPV223() {
		if (pV223 == null) {
			pV223 = new EObjectContainmentEList<PV223CONTENT>(PV223CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV223);
		}
		return pV223;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV224CONTENT getPV224() {
		return pV224;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV224(PV224CONTENT newPV224, NotificationChain msgs) {
		PV224CONTENT oldPV224 = pV224;
		pV224 = newPV224;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV224, oldPV224, newPV224);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV224(PV224CONTENT newPV224) {
		if (newPV224 != pV224) {
			NotificationChain msgs = null;
			if (pV224 != null)
				msgs = ((InternalEObject)pV224).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV224, null, msgs);
			if (newPV224 != null)
				msgs = ((InternalEObject)newPV224).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV224, null, msgs);
			msgs = basicSetPV224(newPV224, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV224, newPV224, newPV224));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV225CONTENT getPV225() {
		return pV225;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV225(PV225CONTENT newPV225, NotificationChain msgs) {
		PV225CONTENT oldPV225 = pV225;
		pV225 = newPV225;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV225, oldPV225, newPV225);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV225(PV225CONTENT newPV225) {
		if (newPV225 != pV225) {
			NotificationChain msgs = null;
			if (pV225 != null)
				msgs = ((InternalEObject)pV225).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV225, null, msgs);
			if (newPV225 != null)
				msgs = ((InternalEObject)newPV225).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV225, null, msgs);
			msgs = basicSetPV225(newPV225, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV225, newPV225, newPV225));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV226CONTENT getPV226() {
		return pV226;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV226(PV226CONTENT newPV226, NotificationChain msgs) {
		PV226CONTENT oldPV226 = pV226;
		pV226 = newPV226;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV226, oldPV226, newPV226);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV226(PV226CONTENT newPV226) {
		if (newPV226 != pV226) {
			NotificationChain msgs = null;
			if (pV226 != null)
				msgs = ((InternalEObject)pV226).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV226, null, msgs);
			if (newPV226 != null)
				msgs = ((InternalEObject)newPV226).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV226, null, msgs);
			msgs = basicSetPV226(newPV226, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV226, newPV226, newPV226));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV227CONTENT getPV227() {
		return pV227;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV227(PV227CONTENT newPV227, NotificationChain msgs) {
		PV227CONTENT oldPV227 = pV227;
		pV227 = newPV227;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV227, oldPV227, newPV227);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV227(PV227CONTENT newPV227) {
		if (newPV227 != pV227) {
			NotificationChain msgs = null;
			if (pV227 != null)
				msgs = ((InternalEObject)pV227).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV227, null, msgs);
			if (newPV227 != null)
				msgs = ((InternalEObject)newPV227).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV227, null, msgs);
			msgs = basicSetPV227(newPV227, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV227, newPV227, newPV227));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV228CONTENT getPV228() {
		return pV228;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV228(PV228CONTENT newPV228, NotificationChain msgs) {
		PV228CONTENT oldPV228 = pV228;
		pV228 = newPV228;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV228, oldPV228, newPV228);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV228(PV228CONTENT newPV228) {
		if (newPV228 != pV228) {
			NotificationChain msgs = null;
			if (pV228 != null)
				msgs = ((InternalEObject)pV228).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV228, null, msgs);
			if (newPV228 != null)
				msgs = ((InternalEObject)newPV228).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV228, null, msgs);
			msgs = basicSetPV228(newPV228, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV228, newPV228, newPV228));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV229CONTENT getPV229() {
		return pV229;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV229(PV229CONTENT newPV229, NotificationChain msgs) {
		PV229CONTENT oldPV229 = pV229;
		pV229 = newPV229;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV229, oldPV229, newPV229);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV229(PV229CONTENT newPV229) {
		if (newPV229 != pV229) {
			NotificationChain msgs = null;
			if (pV229 != null)
				msgs = ((InternalEObject)pV229).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV229, null, msgs);
			if (newPV229 != null)
				msgs = ((InternalEObject)newPV229).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV229, null, msgs);
			msgs = basicSetPV229(newPV229, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV229, newPV229, newPV229));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV230CONTENT getPV230() {
		return pV230;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV230(PV230CONTENT newPV230, NotificationChain msgs) {
		PV230CONTENT oldPV230 = pV230;
		pV230 = newPV230;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV230, oldPV230, newPV230);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV230(PV230CONTENT newPV230) {
		if (newPV230 != pV230) {
			NotificationChain msgs = null;
			if (pV230 != null)
				msgs = ((InternalEObject)pV230).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV230, null, msgs);
			if (newPV230 != null)
				msgs = ((InternalEObject)newPV230).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV230, null, msgs);
			msgs = basicSetPV230(newPV230, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV230, newPV230, newPV230));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV231CONTENT getPV231() {
		return pV231;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV231(PV231CONTENT newPV231, NotificationChain msgs) {
		PV231CONTENT oldPV231 = pV231;
		pV231 = newPV231;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV231, oldPV231, newPV231);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV231(PV231CONTENT newPV231) {
		if (newPV231 != pV231) {
			NotificationChain msgs = null;
			if (pV231 != null)
				msgs = ((InternalEObject)pV231).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV231, null, msgs);
			if (newPV231 != null)
				msgs = ((InternalEObject)newPV231).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV231, null, msgs);
			msgs = basicSetPV231(newPV231, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV231, newPV231, newPV231));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV232CONTENT getPV232() {
		return pV232;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV232(PV232CONTENT newPV232, NotificationChain msgs) {
		PV232CONTENT oldPV232 = pV232;
		pV232 = newPV232;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV232, oldPV232, newPV232);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV232(PV232CONTENT newPV232) {
		if (newPV232 != pV232) {
			NotificationChain msgs = null;
			if (pV232 != null)
				msgs = ((InternalEObject)pV232).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV232, null, msgs);
			if (newPV232 != null)
				msgs = ((InternalEObject)newPV232).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV232, null, msgs);
			msgs = basicSetPV232(newPV232, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV232, newPV232, newPV232));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV233CONTENT getPV233() {
		return pV233;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV233(PV233CONTENT newPV233, NotificationChain msgs) {
		PV233CONTENT oldPV233 = pV233;
		pV233 = newPV233;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV233, oldPV233, newPV233);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV233(PV233CONTENT newPV233) {
		if (newPV233 != pV233) {
			NotificationChain msgs = null;
			if (pV233 != null)
				msgs = ((InternalEObject)pV233).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV233, null, msgs);
			if (newPV233 != null)
				msgs = ((InternalEObject)newPV233).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV233, null, msgs);
			msgs = basicSetPV233(newPV233, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV233, newPV233, newPV233));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV234CONTENT getPV234() {
		return pV234;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV234(PV234CONTENT newPV234, NotificationChain msgs) {
		PV234CONTENT oldPV234 = pV234;
		pV234 = newPV234;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV234, oldPV234, newPV234);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV234(PV234CONTENT newPV234) {
		if (newPV234 != pV234) {
			NotificationChain msgs = null;
			if (pV234 != null)
				msgs = ((InternalEObject)pV234).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV234, null, msgs);
			if (newPV234 != null)
				msgs = ((InternalEObject)newPV234).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV234, null, msgs);
			msgs = basicSetPV234(newPV234, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV234, newPV234, newPV234));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV235CONTENT getPV235() {
		return pV235;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV235(PV235CONTENT newPV235, NotificationChain msgs) {
		PV235CONTENT oldPV235 = pV235;
		pV235 = newPV235;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV235, oldPV235, newPV235);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV235(PV235CONTENT newPV235) {
		if (newPV235 != pV235) {
			NotificationChain msgs = null;
			if (pV235 != null)
				msgs = ((InternalEObject)pV235).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV235, null, msgs);
			if (newPV235 != null)
				msgs = ((InternalEObject)newPV235).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV235, null, msgs);
			msgs = basicSetPV235(newPV235, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV235, newPV235, newPV235));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV236CONTENT getPV236() {
		return pV236;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV236(PV236CONTENT newPV236, NotificationChain msgs) {
		PV236CONTENT oldPV236 = pV236;
		pV236 = newPV236;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV236, oldPV236, newPV236);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV236(PV236CONTENT newPV236) {
		if (newPV236 != pV236) {
			NotificationChain msgs = null;
			if (pV236 != null)
				msgs = ((InternalEObject)pV236).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV236, null, msgs);
			if (newPV236 != null)
				msgs = ((InternalEObject)newPV236).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV236, null, msgs);
			msgs = basicSetPV236(newPV236, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV236, newPV236, newPV236));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV237CONTENT getPV237() {
		return pV237;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV237(PV237CONTENT newPV237, NotificationChain msgs) {
		PV237CONTENT oldPV237 = pV237;
		pV237 = newPV237;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV237, oldPV237, newPV237);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV237(PV237CONTENT newPV237) {
		if (newPV237 != pV237) {
			NotificationChain msgs = null;
			if (pV237 != null)
				msgs = ((InternalEObject)pV237).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV237, null, msgs);
			if (newPV237 != null)
				msgs = ((InternalEObject)newPV237).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV237, null, msgs);
			msgs = basicSetPV237(newPV237, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV237, newPV237, newPV237));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV238CONTENT getPV238() {
		return pV238;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV238(PV238CONTENT newPV238, NotificationChain msgs) {
		PV238CONTENT oldPV238 = pV238;
		pV238 = newPV238;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV238, oldPV238, newPV238);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV238(PV238CONTENT newPV238) {
		if (newPV238 != pV238) {
			NotificationChain msgs = null;
			if (pV238 != null)
				msgs = ((InternalEObject)pV238).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV238, null, msgs);
			if (newPV238 != null)
				msgs = ((InternalEObject)newPV238).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV238, null, msgs);
			msgs = basicSetPV238(newPV238, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV238, newPV238, newPV238));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV239CONTENT> getPV239() {
		if (pV239 == null) {
			pV239 = new EObjectContainmentEList<PV239CONTENT>(PV239CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV239);
		}
		return pV239;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV240CONTENT getPV240() {
		return pV240;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV240(PV240CONTENT newPV240, NotificationChain msgs) {
		PV240CONTENT oldPV240 = pV240;
		pV240 = newPV240;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV240, oldPV240, newPV240);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV240(PV240CONTENT newPV240) {
		if (newPV240 != pV240) {
			NotificationChain msgs = null;
			if (pV240 != null)
				msgs = ((InternalEObject)pV240).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV240, null, msgs);
			if (newPV240 != null)
				msgs = ((InternalEObject)newPV240).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV240, null, msgs);
			msgs = basicSetPV240(newPV240, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV240, newPV240, newPV240));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV241CONTENT> getPV241() {
		if (pV241 == null) {
			pV241 = new EObjectContainmentEList<PV241CONTENT>(PV241CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV241);
		}
		return pV241;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV242CONTENT getPV242() {
		return pV242;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV242(PV242CONTENT newPV242, NotificationChain msgs) {
		PV242CONTENT oldPV242 = pV242;
		pV242 = newPV242;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV242, oldPV242, newPV242);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV242(PV242CONTENT newPV242) {
		if (newPV242 != pV242) {
			NotificationChain msgs = null;
			if (pV242 != null)
				msgs = ((InternalEObject)pV242).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV242, null, msgs);
			if (newPV242 != null)
				msgs = ((InternalEObject)newPV242).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV242, null, msgs);
			msgs = basicSetPV242(newPV242, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV242, newPV242, newPV242));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV243CONTENT getPV243() {
		return pV243;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV243(PV243CONTENT newPV243, NotificationChain msgs) {
		PV243CONTENT oldPV243 = pV243;
		pV243 = newPV243;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV243, oldPV243, newPV243);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV243(PV243CONTENT newPV243) {
		if (newPV243 != pV243) {
			NotificationChain msgs = null;
			if (pV243 != null)
				msgs = ((InternalEObject)pV243).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV243, null, msgs);
			if (newPV243 != null)
				msgs = ((InternalEObject)newPV243).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV243, null, msgs);
			msgs = basicSetPV243(newPV243, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV243, newPV243, newPV243));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV244CONTENT getPV244() {
		return pV244;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV244(PV244CONTENT newPV244, NotificationChain msgs) {
		PV244CONTENT oldPV244 = pV244;
		pV244 = newPV244;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV244, oldPV244, newPV244);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV244(PV244CONTENT newPV244) {
		if (newPV244 != pV244) {
			NotificationChain msgs = null;
			if (pV244 != null)
				msgs = ((InternalEObject)pV244).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV244, null, msgs);
			if (newPV244 != null)
				msgs = ((InternalEObject)newPV244).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV244, null, msgs);
			msgs = basicSetPV244(newPV244, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV244, newPV244, newPV244));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV245CONTENT> getPV245() {
		if (pV245 == null) {
			pV245 = new EObjectContainmentEList<PV245CONTENT>(PV245CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV245);
		}
		return pV245;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV246CONTENT getPV246() {
		return pV246;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV246(PV246CONTENT newPV246, NotificationChain msgs) {
		PV246CONTENT oldPV246 = pV246;
		pV246 = newPV246;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV246, oldPV246, newPV246);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV246(PV246CONTENT newPV246) {
		if (newPV246 != pV246) {
			NotificationChain msgs = null;
			if (pV246 != null)
				msgs = ((InternalEObject)pV246).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV246, null, msgs);
			if (newPV246 != null)
				msgs = ((InternalEObject)newPV246).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV246, null, msgs);
			msgs = basicSetPV246(newPV246, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV246, newPV246, newPV246));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV247CONTENT getPV247() {
		return pV247;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV247(PV247CONTENT newPV247, NotificationChain msgs) {
		PV247CONTENT oldPV247 = pV247;
		pV247 = newPV247;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV247, oldPV247, newPV247);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV247(PV247CONTENT newPV247) {
		if (newPV247 != pV247) {
			NotificationChain msgs = null;
			if (pV247 != null)
				msgs = ((InternalEObject)pV247).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV247, null, msgs);
			if (newPV247 != null)
				msgs = ((InternalEObject)newPV247).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV247, null, msgs);
			msgs = basicSetPV247(newPV247, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV247, newPV247, newPV247));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PV248CONTENT getPV248() {
		return pV248;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPV248(PV248CONTENT newPV248, NotificationChain msgs) {
		PV248CONTENT oldPV248 = pV248;
		pV248 = newPV248;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV248, oldPV248, newPV248);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPV248(PV248CONTENT newPV248) {
		if (newPV248 != pV248) {
			NotificationChain msgs = null;
			if (pV248 != null)
				msgs = ((InternalEObject)pV248).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV248, null, msgs);
			if (newPV248 != null)
				msgs = ((InternalEObject)newPV248).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.PV2CONTENT__PV248, null, msgs);
			msgs = basicSetPV248(newPV248, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.PV2CONTENT__PV248, newPV248, newPV248));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PV249CONTENT> getPV249() {
		if (pV249 == null) {
			pV249 = new EObjectContainmentEList<PV249CONTENT>(PV249CONTENT.class, this, V2xmlPackage.PV2CONTENT__PV249);
		}
		return pV249;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.PV2CONTENT__ANY);
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
			case V2xmlPackage.PV2CONTENT__PV21:
				return basicSetPV21(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV22:
				return basicSetPV22(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV23:
				return basicSetPV23(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV24:
				return basicSetPV24(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV25:
				return ((InternalEList<?>)getPV25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV26:
				return basicSetPV26(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV27:
				return ((InternalEList<?>)getPV27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV28:
				return basicSetPV28(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV29:
				return basicSetPV29(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV210:
				return basicSetPV210(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV211:
				return basicSetPV211(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV212:
				return basicSetPV212(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV213:
				return ((InternalEList<?>)getPV213()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV214:
				return basicSetPV214(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV215:
				return basicSetPV215(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV216:
				return basicSetPV216(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV217:
				return basicSetPV217(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV218:
				return basicSetPV218(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV219:
				return basicSetPV219(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV220:
				return basicSetPV220(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV221:
				return basicSetPV221(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV222:
				return basicSetPV222(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV223:
				return ((InternalEList<?>)getPV223()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV224:
				return basicSetPV224(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV225:
				return basicSetPV225(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV226:
				return basicSetPV226(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV227:
				return basicSetPV227(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV228:
				return basicSetPV228(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV229:
				return basicSetPV229(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV230:
				return basicSetPV230(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV231:
				return basicSetPV231(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV232:
				return basicSetPV232(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV233:
				return basicSetPV233(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV234:
				return basicSetPV234(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV235:
				return basicSetPV235(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV236:
				return basicSetPV236(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV237:
				return basicSetPV237(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV238:
				return basicSetPV238(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV239:
				return ((InternalEList<?>)getPV239()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV240:
				return basicSetPV240(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV241:
				return ((InternalEList<?>)getPV241()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV242:
				return basicSetPV242(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV243:
				return basicSetPV243(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV244:
				return basicSetPV244(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV245:
				return ((InternalEList<?>)getPV245()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__PV246:
				return basicSetPV246(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV247:
				return basicSetPV247(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV248:
				return basicSetPV248(null, msgs);
			case V2xmlPackage.PV2CONTENT__PV249:
				return ((InternalEList<?>)getPV249()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.PV2CONTENT__ANY:
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
			case V2xmlPackage.PV2CONTENT__PV21:
				return getPV21();
			case V2xmlPackage.PV2CONTENT__PV22:
				return getPV22();
			case V2xmlPackage.PV2CONTENT__PV23:
				return getPV23();
			case V2xmlPackage.PV2CONTENT__PV24:
				return getPV24();
			case V2xmlPackage.PV2CONTENT__PV25:
				return getPV25();
			case V2xmlPackage.PV2CONTENT__PV26:
				return getPV26();
			case V2xmlPackage.PV2CONTENT__PV27:
				return getPV27();
			case V2xmlPackage.PV2CONTENT__PV28:
				return getPV28();
			case V2xmlPackage.PV2CONTENT__PV29:
				return getPV29();
			case V2xmlPackage.PV2CONTENT__PV210:
				return getPV210();
			case V2xmlPackage.PV2CONTENT__PV211:
				return getPV211();
			case V2xmlPackage.PV2CONTENT__PV212:
				return getPV212();
			case V2xmlPackage.PV2CONTENT__PV213:
				return getPV213();
			case V2xmlPackage.PV2CONTENT__PV214:
				return getPV214();
			case V2xmlPackage.PV2CONTENT__PV215:
				return getPV215();
			case V2xmlPackage.PV2CONTENT__PV216:
				return getPV216();
			case V2xmlPackage.PV2CONTENT__PV217:
				return getPV217();
			case V2xmlPackage.PV2CONTENT__PV218:
				return getPV218();
			case V2xmlPackage.PV2CONTENT__PV219:
				return getPV219();
			case V2xmlPackage.PV2CONTENT__PV220:
				return getPV220();
			case V2xmlPackage.PV2CONTENT__PV221:
				return getPV221();
			case V2xmlPackage.PV2CONTENT__PV222:
				return getPV222();
			case V2xmlPackage.PV2CONTENT__PV223:
				return getPV223();
			case V2xmlPackage.PV2CONTENT__PV224:
				return getPV224();
			case V2xmlPackage.PV2CONTENT__PV225:
				return getPV225();
			case V2xmlPackage.PV2CONTENT__PV226:
				return getPV226();
			case V2xmlPackage.PV2CONTENT__PV227:
				return getPV227();
			case V2xmlPackage.PV2CONTENT__PV228:
				return getPV228();
			case V2xmlPackage.PV2CONTENT__PV229:
				return getPV229();
			case V2xmlPackage.PV2CONTENT__PV230:
				return getPV230();
			case V2xmlPackage.PV2CONTENT__PV231:
				return getPV231();
			case V2xmlPackage.PV2CONTENT__PV232:
				return getPV232();
			case V2xmlPackage.PV2CONTENT__PV233:
				return getPV233();
			case V2xmlPackage.PV2CONTENT__PV234:
				return getPV234();
			case V2xmlPackage.PV2CONTENT__PV235:
				return getPV235();
			case V2xmlPackage.PV2CONTENT__PV236:
				return getPV236();
			case V2xmlPackage.PV2CONTENT__PV237:
				return getPV237();
			case V2xmlPackage.PV2CONTENT__PV238:
				return getPV238();
			case V2xmlPackage.PV2CONTENT__PV239:
				return getPV239();
			case V2xmlPackage.PV2CONTENT__PV240:
				return getPV240();
			case V2xmlPackage.PV2CONTENT__PV241:
				return getPV241();
			case V2xmlPackage.PV2CONTENT__PV242:
				return getPV242();
			case V2xmlPackage.PV2CONTENT__PV243:
				return getPV243();
			case V2xmlPackage.PV2CONTENT__PV244:
				return getPV244();
			case V2xmlPackage.PV2CONTENT__PV245:
				return getPV245();
			case V2xmlPackage.PV2CONTENT__PV246:
				return getPV246();
			case V2xmlPackage.PV2CONTENT__PV247:
				return getPV247();
			case V2xmlPackage.PV2CONTENT__PV248:
				return getPV248();
			case V2xmlPackage.PV2CONTENT__PV249:
				return getPV249();
			case V2xmlPackage.PV2CONTENT__ANY:
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
			case V2xmlPackage.PV2CONTENT__PV21:
				setPV21((PV21CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV22:
				setPV22((PV22CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV23:
				setPV23((PV23CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV24:
				setPV24((PV24CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV25:
				getPV25().clear();
				getPV25().addAll((Collection<? extends PV25CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV26:
				setPV26((PV26CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV27:
				getPV27().clear();
				getPV27().addAll((Collection<? extends PV27CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV28:
				setPV28((PV28CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV29:
				setPV29((PV29CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV210:
				setPV210((PV210CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV211:
				setPV211((PV211CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV212:
				setPV212((PV212CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV213:
				getPV213().clear();
				getPV213().addAll((Collection<? extends PV213CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV214:
				setPV214((PV214CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV215:
				setPV215((PV215CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV216:
				setPV216((PV216CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV217:
				setPV217((PV217CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV218:
				setPV218((PV218CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV219:
				setPV219((PV219CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV220:
				setPV220((PV220CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV221:
				setPV221((PV221CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV222:
				setPV222((PV222CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV223:
				getPV223().clear();
				getPV223().addAll((Collection<? extends PV223CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV224:
				setPV224((PV224CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV225:
				setPV225((PV225CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV226:
				setPV226((PV226CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV227:
				setPV227((PV227CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV228:
				setPV228((PV228CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV229:
				setPV229((PV229CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV230:
				setPV230((PV230CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV231:
				setPV231((PV231CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV232:
				setPV232((PV232CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV233:
				setPV233((PV233CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV234:
				setPV234((PV234CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV235:
				setPV235((PV235CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV236:
				setPV236((PV236CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV237:
				setPV237((PV237CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV238:
				setPV238((PV238CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV239:
				getPV239().clear();
				getPV239().addAll((Collection<? extends PV239CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV240:
				setPV240((PV240CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV241:
				getPV241().clear();
				getPV241().addAll((Collection<? extends PV241CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV242:
				setPV242((PV242CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV243:
				setPV243((PV243CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV244:
				setPV244((PV244CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV245:
				getPV245().clear();
				getPV245().addAll((Collection<? extends PV245CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV246:
				setPV246((PV246CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV247:
				setPV247((PV247CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV248:
				setPV248((PV248CONTENT)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__PV249:
				getPV249().clear();
				getPV249().addAll((Collection<? extends PV249CONTENT>)newValue);
				return;
			case V2xmlPackage.PV2CONTENT__ANY:
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
			case V2xmlPackage.PV2CONTENT__PV21:
				setPV21((PV21CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV22:
				setPV22((PV22CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV23:
				setPV23((PV23CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV24:
				setPV24((PV24CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV25:
				getPV25().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV26:
				setPV26((PV26CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV27:
				getPV27().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV28:
				setPV28((PV28CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV29:
				setPV29((PV29CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV210:
				setPV210((PV210CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV211:
				setPV211((PV211CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV212:
				setPV212((PV212CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV213:
				getPV213().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV214:
				setPV214((PV214CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV215:
				setPV215((PV215CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV216:
				setPV216((PV216CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV217:
				setPV217((PV217CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV218:
				setPV218((PV218CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV219:
				setPV219((PV219CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV220:
				setPV220((PV220CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV221:
				setPV221((PV221CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV222:
				setPV222((PV222CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV223:
				getPV223().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV224:
				setPV224((PV224CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV225:
				setPV225((PV225CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV226:
				setPV226((PV226CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV227:
				setPV227((PV227CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV228:
				setPV228((PV228CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV229:
				setPV229((PV229CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV230:
				setPV230((PV230CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV231:
				setPV231((PV231CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV232:
				setPV232((PV232CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV233:
				setPV233((PV233CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV234:
				setPV234((PV234CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV235:
				setPV235((PV235CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV236:
				setPV236((PV236CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV237:
				setPV237((PV237CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV238:
				setPV238((PV238CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV239:
				getPV239().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV240:
				setPV240((PV240CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV241:
				getPV241().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV242:
				setPV242((PV242CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV243:
				setPV243((PV243CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV244:
				setPV244((PV244CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV245:
				getPV245().clear();
				return;
			case V2xmlPackage.PV2CONTENT__PV246:
				setPV246((PV246CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV247:
				setPV247((PV247CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV248:
				setPV248((PV248CONTENT)null);
				return;
			case V2xmlPackage.PV2CONTENT__PV249:
				getPV249().clear();
				return;
			case V2xmlPackage.PV2CONTENT__ANY:
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
			case V2xmlPackage.PV2CONTENT__PV21:
				return pV21 != null;
			case V2xmlPackage.PV2CONTENT__PV22:
				return pV22 != null;
			case V2xmlPackage.PV2CONTENT__PV23:
				return pV23 != null;
			case V2xmlPackage.PV2CONTENT__PV24:
				return pV24 != null;
			case V2xmlPackage.PV2CONTENT__PV25:
				return pV25 != null && !pV25.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV26:
				return pV26 != null;
			case V2xmlPackage.PV2CONTENT__PV27:
				return pV27 != null && !pV27.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV28:
				return pV28 != null;
			case V2xmlPackage.PV2CONTENT__PV29:
				return pV29 != null;
			case V2xmlPackage.PV2CONTENT__PV210:
				return pV210 != null;
			case V2xmlPackage.PV2CONTENT__PV211:
				return pV211 != null;
			case V2xmlPackage.PV2CONTENT__PV212:
				return pV212 != null;
			case V2xmlPackage.PV2CONTENT__PV213:
				return pV213 != null && !pV213.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV214:
				return pV214 != null;
			case V2xmlPackage.PV2CONTENT__PV215:
				return pV215 != null;
			case V2xmlPackage.PV2CONTENT__PV216:
				return pV216 != null;
			case V2xmlPackage.PV2CONTENT__PV217:
				return pV217 != null;
			case V2xmlPackage.PV2CONTENT__PV218:
				return pV218 != null;
			case V2xmlPackage.PV2CONTENT__PV219:
				return pV219 != null;
			case V2xmlPackage.PV2CONTENT__PV220:
				return pV220 != null;
			case V2xmlPackage.PV2CONTENT__PV221:
				return pV221 != null;
			case V2xmlPackage.PV2CONTENT__PV222:
				return pV222 != null;
			case V2xmlPackage.PV2CONTENT__PV223:
				return pV223 != null && !pV223.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV224:
				return pV224 != null;
			case V2xmlPackage.PV2CONTENT__PV225:
				return pV225 != null;
			case V2xmlPackage.PV2CONTENT__PV226:
				return pV226 != null;
			case V2xmlPackage.PV2CONTENT__PV227:
				return pV227 != null;
			case V2xmlPackage.PV2CONTENT__PV228:
				return pV228 != null;
			case V2xmlPackage.PV2CONTENT__PV229:
				return pV229 != null;
			case V2xmlPackage.PV2CONTENT__PV230:
				return pV230 != null;
			case V2xmlPackage.PV2CONTENT__PV231:
				return pV231 != null;
			case V2xmlPackage.PV2CONTENT__PV232:
				return pV232 != null;
			case V2xmlPackage.PV2CONTENT__PV233:
				return pV233 != null;
			case V2xmlPackage.PV2CONTENT__PV234:
				return pV234 != null;
			case V2xmlPackage.PV2CONTENT__PV235:
				return pV235 != null;
			case V2xmlPackage.PV2CONTENT__PV236:
				return pV236 != null;
			case V2xmlPackage.PV2CONTENT__PV237:
				return pV237 != null;
			case V2xmlPackage.PV2CONTENT__PV238:
				return pV238 != null;
			case V2xmlPackage.PV2CONTENT__PV239:
				return pV239 != null && !pV239.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV240:
				return pV240 != null;
			case V2xmlPackage.PV2CONTENT__PV241:
				return pV241 != null && !pV241.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV242:
				return pV242 != null;
			case V2xmlPackage.PV2CONTENT__PV243:
				return pV243 != null;
			case V2xmlPackage.PV2CONTENT__PV244:
				return pV244 != null;
			case V2xmlPackage.PV2CONTENT__PV245:
				return pV245 != null && !pV245.isEmpty();
			case V2xmlPackage.PV2CONTENT__PV246:
				return pV246 != null;
			case V2xmlPackage.PV2CONTENT__PV247:
				return pV247 != null;
			case V2xmlPackage.PV2CONTENT__PV248:
				return pV248 != null;
			case V2xmlPackage.PV2CONTENT__PV249:
				return pV249 != null && !pV249.isEmpty();
			case V2xmlPackage.PV2CONTENT__ANY:
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

} //PV2CONTENTImpl
