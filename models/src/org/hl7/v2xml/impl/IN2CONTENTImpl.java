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

import org.hl7.v2xml.IN210CONTENT;
import org.hl7.v2xml.IN211CONTENT;
import org.hl7.v2xml.IN212CONTENT;
import org.hl7.v2xml.IN213CONTENT;
import org.hl7.v2xml.IN214CONTENT;
import org.hl7.v2xml.IN215CONTENT;
import org.hl7.v2xml.IN216CONTENT;
import org.hl7.v2xml.IN217CONTENT;
import org.hl7.v2xml.IN218CONTENT;
import org.hl7.v2xml.IN219CONTENT;
import org.hl7.v2xml.IN21CONTENT;
import org.hl7.v2xml.IN220CONTENT;
import org.hl7.v2xml.IN221CONTENT;
import org.hl7.v2xml.IN222CONTENT;
import org.hl7.v2xml.IN223CONTENT;
import org.hl7.v2xml.IN224CONTENT;
import org.hl7.v2xml.IN225CONTENT;
import org.hl7.v2xml.IN226CONTENT;
import org.hl7.v2xml.IN227CONTENT;
import org.hl7.v2xml.IN228CONTENT;
import org.hl7.v2xml.IN229CONTENT;
import org.hl7.v2xml.IN22CONTENT;
import org.hl7.v2xml.IN230CONTENT;
import org.hl7.v2xml.IN231CONTENT;
import org.hl7.v2xml.IN232CONTENT;
import org.hl7.v2xml.IN233CONTENT;
import org.hl7.v2xml.IN234CONTENT;
import org.hl7.v2xml.IN235CONTENT;
import org.hl7.v2xml.IN236CONTENT;
import org.hl7.v2xml.IN237CONTENT;
import org.hl7.v2xml.IN238CONTENT;
import org.hl7.v2xml.IN239CONTENT;
import org.hl7.v2xml.IN23CONTENT;
import org.hl7.v2xml.IN240CONTENT;
import org.hl7.v2xml.IN241CONTENT;
import org.hl7.v2xml.IN242CONTENT;
import org.hl7.v2xml.IN243CONTENT;
import org.hl7.v2xml.IN244CONTENT;
import org.hl7.v2xml.IN245CONTENT;
import org.hl7.v2xml.IN246CONTENT;
import org.hl7.v2xml.IN247CONTENT;
import org.hl7.v2xml.IN248CONTENT;
import org.hl7.v2xml.IN249CONTENT;
import org.hl7.v2xml.IN24CONTENT;
import org.hl7.v2xml.IN250CONTENT;
import org.hl7.v2xml.IN251CONTENT;
import org.hl7.v2xml.IN252CONTENT;
import org.hl7.v2xml.IN253CONTENT;
import org.hl7.v2xml.IN254CONTENT;
import org.hl7.v2xml.IN255CONTENT;
import org.hl7.v2xml.IN256CONTENT;
import org.hl7.v2xml.IN257CONTENT;
import org.hl7.v2xml.IN258CONTENT;
import org.hl7.v2xml.IN259CONTENT;
import org.hl7.v2xml.IN25CONTENT;
import org.hl7.v2xml.IN260CONTENT;
import org.hl7.v2xml.IN261CONTENT;
import org.hl7.v2xml.IN262CONTENT;
import org.hl7.v2xml.IN263CONTENT;
import org.hl7.v2xml.IN264CONTENT;
import org.hl7.v2xml.IN265CONTENT;
import org.hl7.v2xml.IN266CONTENT;
import org.hl7.v2xml.IN267CONTENT;
import org.hl7.v2xml.IN268CONTENT;
import org.hl7.v2xml.IN269CONTENT;
import org.hl7.v2xml.IN26CONTENT;
import org.hl7.v2xml.IN270CONTENT;
import org.hl7.v2xml.IN271CONTENT;
import org.hl7.v2xml.IN272CONTENT;
import org.hl7.v2xml.IN27CONTENT;
import org.hl7.v2xml.IN28CONTENT;
import org.hl7.v2xml.IN29CONTENT;
import org.hl7.v2xml.IN2CONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IN2CONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN21 <em>IN21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN22 <em>IN22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN23 <em>IN23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN24 <em>IN24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN25 <em>IN25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN26 <em>IN26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN27 <em>IN27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN28 <em>IN28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN29 <em>IN29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN210 <em>IN210</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN211 <em>IN211</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN212 <em>IN212</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN213 <em>IN213</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN214 <em>IN214</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN215 <em>IN215</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN216 <em>IN216</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN217 <em>IN217</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN218 <em>IN218</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN219 <em>IN219</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN220 <em>IN220</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN221 <em>IN221</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN222 <em>IN222</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN223 <em>IN223</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN224 <em>IN224</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN225 <em>IN225</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN226 <em>IN226</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN227 <em>IN227</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN228 <em>IN228</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN229 <em>IN229</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN230 <em>IN230</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN231 <em>IN231</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN232 <em>IN232</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN233 <em>IN233</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN234 <em>IN234</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN235 <em>IN235</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN236 <em>IN236</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN237 <em>IN237</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN238 <em>IN238</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN239 <em>IN239</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN240 <em>IN240</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN241 <em>IN241</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN242 <em>IN242</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN243 <em>IN243</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN244 <em>IN244</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN245 <em>IN245</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN246 <em>IN246</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN247 <em>IN247</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN248 <em>IN248</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN249 <em>IN249</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN250 <em>IN250</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN251 <em>IN251</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN252 <em>IN252</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN253 <em>IN253</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN254 <em>IN254</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN255 <em>IN255</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN256 <em>IN256</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN257 <em>IN257</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN258 <em>IN258</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN259 <em>IN259</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN260 <em>IN260</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN261 <em>IN261</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN262 <em>IN262</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN263 <em>IN263</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN264 <em>IN264</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN265 <em>IN265</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN266 <em>IN266</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN267 <em>IN267</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN268 <em>IN268</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN269 <em>IN269</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN270 <em>IN270</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN271 <em>IN271</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getIN272 <em>IN272</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.IN2CONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IN2CONTENTImpl extends EObjectImpl implements IN2CONTENT {
	/**
	 * The cached value of the '{@link #getIN21() <em>IN21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN21()
	 * @generated
	 * @ordered
	 */
	protected EList<IN21CONTENT> iN21;

	/**
	 * The cached value of the '{@link #getIN22() <em>IN22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN22()
	 * @generated
	 * @ordered
	 */
	protected IN22CONTENT iN22;

	/**
	 * The cached value of the '{@link #getIN23() <em>IN23</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN23()
	 * @generated
	 * @ordered
	 */
	protected EList<IN23CONTENT> iN23;

	/**
	 * The cached value of the '{@link #getIN24() <em>IN24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN24()
	 * @generated
	 * @ordered
	 */
	protected IN24CONTENT iN24;

	/**
	 * The cached value of the '{@link #getIN25() <em>IN25</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN25()
	 * @generated
	 * @ordered
	 */
	protected EList<IN25CONTENT> iN25;

	/**
	 * The cached value of the '{@link #getIN26() <em>IN26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN26()
	 * @generated
	 * @ordered
	 */
	protected IN26CONTENT iN26;

	/**
	 * The cached value of the '{@link #getIN27() <em>IN27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN27()
	 * @generated
	 * @ordered
	 */
	protected EList<IN27CONTENT> iN27;

	/**
	 * The cached value of the '{@link #getIN28() <em>IN28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN28()
	 * @generated
	 * @ordered
	 */
	protected IN28CONTENT iN28;

	/**
	 * The cached value of the '{@link #getIN29() <em>IN29</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN29()
	 * @generated
	 * @ordered
	 */
	protected EList<IN29CONTENT> iN29;

	/**
	 * The cached value of the '{@link #getIN210() <em>IN210</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN210()
	 * @generated
	 * @ordered
	 */
	protected IN210CONTENT iN210;

	/**
	 * The cached value of the '{@link #getIN211() <em>IN211</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN211()
	 * @generated
	 * @ordered
	 */
	protected IN211CONTENT iN211;

	/**
	 * The cached value of the '{@link #getIN212() <em>IN212</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN212()
	 * @generated
	 * @ordered
	 */
	protected IN212CONTENT iN212;

	/**
	 * The cached value of the '{@link #getIN213() <em>IN213</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN213()
	 * @generated
	 * @ordered
	 */
	protected IN213CONTENT iN213;

	/**
	 * The cached value of the '{@link #getIN214() <em>IN214</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN214()
	 * @generated
	 * @ordered
	 */
	protected IN214CONTENT iN214;

	/**
	 * The cached value of the '{@link #getIN215() <em>IN215</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN215()
	 * @generated
	 * @ordered
	 */
	protected IN215CONTENT iN215;

	/**
	 * The cached value of the '{@link #getIN216() <em>IN216</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN216()
	 * @generated
	 * @ordered
	 */
	protected IN216CONTENT iN216;

	/**
	 * The cached value of the '{@link #getIN217() <em>IN217</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN217()
	 * @generated
	 * @ordered
	 */
	protected IN217CONTENT iN217;

	/**
	 * The cached value of the '{@link #getIN218() <em>IN218</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN218()
	 * @generated
	 * @ordered
	 */
	protected IN218CONTENT iN218;

	/**
	 * The cached value of the '{@link #getIN219() <em>IN219</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN219()
	 * @generated
	 * @ordered
	 */
	protected IN219CONTENT iN219;

	/**
	 * The cached value of the '{@link #getIN220() <em>IN220</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN220()
	 * @generated
	 * @ordered
	 */
	protected IN220CONTENT iN220;

	/**
	 * The cached value of the '{@link #getIN221() <em>IN221</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN221()
	 * @generated
	 * @ordered
	 */
	protected IN221CONTENT iN221;

	/**
	 * The cached value of the '{@link #getIN222() <em>IN222</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN222()
	 * @generated
	 * @ordered
	 */
	protected EList<IN222CONTENT> iN222;

	/**
	 * The cached value of the '{@link #getIN223() <em>IN223</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN223()
	 * @generated
	 * @ordered
	 */
	protected IN223CONTENT iN223;

	/**
	 * The cached value of the '{@link #getIN224() <em>IN224</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN224()
	 * @generated
	 * @ordered
	 */
	protected EList<IN224CONTENT> iN224;

	/**
	 * The cached value of the '{@link #getIN225() <em>IN225</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN225()
	 * @generated
	 * @ordered
	 */
	protected EList<IN225CONTENT> iN225;

	/**
	 * The cached value of the '{@link #getIN226() <em>IN226</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN226()
	 * @generated
	 * @ordered
	 */
	protected EList<IN226CONTENT> iN226;

	/**
	 * The cached value of the '{@link #getIN227() <em>IN227</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN227()
	 * @generated
	 * @ordered
	 */
	protected IN227CONTENT iN227;

	/**
	 * The cached value of the '{@link #getIN228() <em>IN228</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN228()
	 * @generated
	 * @ordered
	 */
	protected EList<IN228CONTENT> iN228;

	/**
	 * The cached value of the '{@link #getIN229() <em>IN229</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN229()
	 * @generated
	 * @ordered
	 */
	protected EList<IN229CONTENT> iN229;

	/**
	 * The cached value of the '{@link #getIN230() <em>IN230</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN230()
	 * @generated
	 * @ordered
	 */
	protected IN230CONTENT iN230;

	/**
	 * The cached value of the '{@link #getIN231() <em>IN231</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN231()
	 * @generated
	 * @ordered
	 */
	protected IN231CONTENT iN231;

	/**
	 * The cached value of the '{@link #getIN232() <em>IN232</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN232()
	 * @generated
	 * @ordered
	 */
	protected EList<IN232CONTENT> iN232;

	/**
	 * The cached value of the '{@link #getIN233() <em>IN233</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN233()
	 * @generated
	 * @ordered
	 */
	protected EList<IN233CONTENT> iN233;

	/**
	 * The cached value of the '{@link #getIN234() <em>IN234</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN234()
	 * @generated
	 * @ordered
	 */
	protected IN234CONTENT iN234;

	/**
	 * The cached value of the '{@link #getIN235() <em>IN235</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN235()
	 * @generated
	 * @ordered
	 */
	protected IN235CONTENT iN235;

	/**
	 * The cached value of the '{@link #getIN236() <em>IN236</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN236()
	 * @generated
	 * @ordered
	 */
	protected IN236CONTENT iN236;

	/**
	 * The cached value of the '{@link #getIN237() <em>IN237</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN237()
	 * @generated
	 * @ordered
	 */
	protected IN237CONTENT iN237;

	/**
	 * The cached value of the '{@link #getIN238() <em>IN238</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN238()
	 * @generated
	 * @ordered
	 */
	protected IN238CONTENT iN238;

	/**
	 * The cached value of the '{@link #getIN239() <em>IN239</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN239()
	 * @generated
	 * @ordered
	 */
	protected IN239CONTENT iN239;

	/**
	 * The cached value of the '{@link #getIN240() <em>IN240</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN240()
	 * @generated
	 * @ordered
	 */
	protected EList<IN240CONTENT> iN240;

	/**
	 * The cached value of the '{@link #getIN241() <em>IN241</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN241()
	 * @generated
	 * @ordered
	 */
	protected IN241CONTENT iN241;

	/**
	 * The cached value of the '{@link #getIN242() <em>IN242</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN242()
	 * @generated
	 * @ordered
	 */
	protected EList<IN242CONTENT> iN242;

	/**
	 * The cached value of the '{@link #getIN243() <em>IN243</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN243()
	 * @generated
	 * @ordered
	 */
	protected EList<IN243CONTENT> iN243;

	/**
	 * The cached value of the '{@link #getIN244() <em>IN244</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN244()
	 * @generated
	 * @ordered
	 */
	protected IN244CONTENT iN244;

	/**
	 * The cached value of the '{@link #getIN245() <em>IN245</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN245()
	 * @generated
	 * @ordered
	 */
	protected IN245CONTENT iN245;

	/**
	 * The cached value of the '{@link #getIN246() <em>IN246</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN246()
	 * @generated
	 * @ordered
	 */
	protected IN246CONTENT iN246;

	/**
	 * The cached value of the '{@link #getIN247() <em>IN247</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN247()
	 * @generated
	 * @ordered
	 */
	protected IN247CONTENT iN247;

	/**
	 * The cached value of the '{@link #getIN248() <em>IN248</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN248()
	 * @generated
	 * @ordered
	 */
	protected IN248CONTENT iN248;

	/**
	 * The cached value of the '{@link #getIN249() <em>IN249</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN249()
	 * @generated
	 * @ordered
	 */
	protected EList<IN249CONTENT> iN249;

	/**
	 * The cached value of the '{@link #getIN250() <em>IN250</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN250()
	 * @generated
	 * @ordered
	 */
	protected EList<IN250CONTENT> iN250;

	/**
	 * The cached value of the '{@link #getIN251() <em>IN251</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN251()
	 * @generated
	 * @ordered
	 */
	protected IN251CONTENT iN251;

	/**
	 * The cached value of the '{@link #getIN252() <em>IN252</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN252()
	 * @generated
	 * @ordered
	 */
	protected EList<IN252CONTENT> iN252;

	/**
	 * The cached value of the '{@link #getIN253() <em>IN253</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN253()
	 * @generated
	 * @ordered
	 */
	protected EList<IN253CONTENT> iN253;

	/**
	 * The cached value of the '{@link #getIN254() <em>IN254</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN254()
	 * @generated
	 * @ordered
	 */
	protected EList<IN254CONTENT> iN254;

	/**
	 * The cached value of the '{@link #getIN255() <em>IN255</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN255()
	 * @generated
	 * @ordered
	 */
	protected IN255CONTENT iN255;

	/**
	 * The cached value of the '{@link #getIN256() <em>IN256</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN256()
	 * @generated
	 * @ordered
	 */
	protected EList<IN256CONTENT> iN256;

	/**
	 * The cached value of the '{@link #getIN257() <em>IN257</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN257()
	 * @generated
	 * @ordered
	 */
	protected IN257CONTENT iN257;

	/**
	 * The cached value of the '{@link #getIN258() <em>IN258</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN258()
	 * @generated
	 * @ordered
	 */
	protected IN258CONTENT iN258;

	/**
	 * The cached value of the '{@link #getIN259() <em>IN259</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN259()
	 * @generated
	 * @ordered
	 */
	protected IN259CONTENT iN259;

	/**
	 * The cached value of the '{@link #getIN260() <em>IN260</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN260()
	 * @generated
	 * @ordered
	 */
	protected IN260CONTENT iN260;

	/**
	 * The cached value of the '{@link #getIN261() <em>IN261</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN261()
	 * @generated
	 * @ordered
	 */
	protected IN261CONTENT iN261;

	/**
	 * The cached value of the '{@link #getIN262() <em>IN262</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN262()
	 * @generated
	 * @ordered
	 */
	protected IN262CONTENT iN262;

	/**
	 * The cached value of the '{@link #getIN263() <em>IN263</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN263()
	 * @generated
	 * @ordered
	 */
	protected EList<IN263CONTENT> iN263;

	/**
	 * The cached value of the '{@link #getIN264() <em>IN264</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN264()
	 * @generated
	 * @ordered
	 */
	protected EList<IN264CONTENT> iN264;

	/**
	 * The cached value of the '{@link #getIN265() <em>IN265</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN265()
	 * @generated
	 * @ordered
	 */
	protected IN265CONTENT iN265;

	/**
	 * The cached value of the '{@link #getIN266() <em>IN266</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN266()
	 * @generated
	 * @ordered
	 */
	protected IN266CONTENT iN266;

	/**
	 * The cached value of the '{@link #getIN267() <em>IN267</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN267()
	 * @generated
	 * @ordered
	 */
	protected IN267CONTENT iN267;

	/**
	 * The cached value of the '{@link #getIN268() <em>IN268</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN268()
	 * @generated
	 * @ordered
	 */
	protected IN268CONTENT iN268;

	/**
	 * The cached value of the '{@link #getIN269() <em>IN269</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN269()
	 * @generated
	 * @ordered
	 */
	protected EList<IN269CONTENT> iN269;

	/**
	 * The cached value of the '{@link #getIN270() <em>IN270</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN270()
	 * @generated
	 * @ordered
	 */
	protected EList<IN270CONTENT> iN270;

	/**
	 * The cached value of the '{@link #getIN271() <em>IN271</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN271()
	 * @generated
	 * @ordered
	 */
	protected EList<IN271CONTENT> iN271;

	/**
	 * The cached value of the '{@link #getIN272() <em>IN272</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIN272()
	 * @generated
	 * @ordered
	 */
	protected IN272CONTENT iN272;

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
	protected IN2CONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getIN2CONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN21CONTENT> getIN21() {
		if (iN21 == null) {
			iN21 = new EObjectContainmentEList<IN21CONTENT>(IN21CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN21);
		}
		return iN21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN22CONTENT getIN22() {
		return iN22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN22(IN22CONTENT newIN22, NotificationChain msgs) {
		IN22CONTENT oldIN22 = iN22;
		iN22 = newIN22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN22, oldIN22, newIN22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN22(IN22CONTENT newIN22) {
		if (newIN22 != iN22) {
			NotificationChain msgs = null;
			if (iN22 != null)
				msgs = ((InternalEObject)iN22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN22, null, msgs);
			if (newIN22 != null)
				msgs = ((InternalEObject)newIN22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN22, null, msgs);
			msgs = basicSetIN22(newIN22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN22, newIN22, newIN22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN23CONTENT> getIN23() {
		if (iN23 == null) {
			iN23 = new EObjectContainmentEList<IN23CONTENT>(IN23CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN23);
		}
		return iN23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN24CONTENT getIN24() {
		return iN24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN24(IN24CONTENT newIN24, NotificationChain msgs) {
		IN24CONTENT oldIN24 = iN24;
		iN24 = newIN24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN24, oldIN24, newIN24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN24(IN24CONTENT newIN24) {
		if (newIN24 != iN24) {
			NotificationChain msgs = null;
			if (iN24 != null)
				msgs = ((InternalEObject)iN24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN24, null, msgs);
			if (newIN24 != null)
				msgs = ((InternalEObject)newIN24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN24, null, msgs);
			msgs = basicSetIN24(newIN24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN24, newIN24, newIN24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN25CONTENT> getIN25() {
		if (iN25 == null) {
			iN25 = new EObjectContainmentEList<IN25CONTENT>(IN25CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN25);
		}
		return iN25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN26CONTENT getIN26() {
		return iN26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN26(IN26CONTENT newIN26, NotificationChain msgs) {
		IN26CONTENT oldIN26 = iN26;
		iN26 = newIN26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN26, oldIN26, newIN26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN26(IN26CONTENT newIN26) {
		if (newIN26 != iN26) {
			NotificationChain msgs = null;
			if (iN26 != null)
				msgs = ((InternalEObject)iN26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN26, null, msgs);
			if (newIN26 != null)
				msgs = ((InternalEObject)newIN26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN26, null, msgs);
			msgs = basicSetIN26(newIN26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN26, newIN26, newIN26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN27CONTENT> getIN27() {
		if (iN27 == null) {
			iN27 = new EObjectContainmentEList<IN27CONTENT>(IN27CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN27);
		}
		return iN27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN28CONTENT getIN28() {
		return iN28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN28(IN28CONTENT newIN28, NotificationChain msgs) {
		IN28CONTENT oldIN28 = iN28;
		iN28 = newIN28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN28, oldIN28, newIN28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN28(IN28CONTENT newIN28) {
		if (newIN28 != iN28) {
			NotificationChain msgs = null;
			if (iN28 != null)
				msgs = ((InternalEObject)iN28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN28, null, msgs);
			if (newIN28 != null)
				msgs = ((InternalEObject)newIN28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN28, null, msgs);
			msgs = basicSetIN28(newIN28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN28, newIN28, newIN28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN29CONTENT> getIN29() {
		if (iN29 == null) {
			iN29 = new EObjectContainmentEList<IN29CONTENT>(IN29CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN29);
		}
		return iN29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN210CONTENT getIN210() {
		return iN210;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN210(IN210CONTENT newIN210, NotificationChain msgs) {
		IN210CONTENT oldIN210 = iN210;
		iN210 = newIN210;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN210, oldIN210, newIN210);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN210(IN210CONTENT newIN210) {
		if (newIN210 != iN210) {
			NotificationChain msgs = null;
			if (iN210 != null)
				msgs = ((InternalEObject)iN210).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN210, null, msgs);
			if (newIN210 != null)
				msgs = ((InternalEObject)newIN210).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN210, null, msgs);
			msgs = basicSetIN210(newIN210, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN210, newIN210, newIN210));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN211CONTENT getIN211() {
		return iN211;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN211(IN211CONTENT newIN211, NotificationChain msgs) {
		IN211CONTENT oldIN211 = iN211;
		iN211 = newIN211;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN211, oldIN211, newIN211);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN211(IN211CONTENT newIN211) {
		if (newIN211 != iN211) {
			NotificationChain msgs = null;
			if (iN211 != null)
				msgs = ((InternalEObject)iN211).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN211, null, msgs);
			if (newIN211 != null)
				msgs = ((InternalEObject)newIN211).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN211, null, msgs);
			msgs = basicSetIN211(newIN211, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN211, newIN211, newIN211));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN212CONTENT getIN212() {
		return iN212;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN212(IN212CONTENT newIN212, NotificationChain msgs) {
		IN212CONTENT oldIN212 = iN212;
		iN212 = newIN212;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN212, oldIN212, newIN212);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN212(IN212CONTENT newIN212) {
		if (newIN212 != iN212) {
			NotificationChain msgs = null;
			if (iN212 != null)
				msgs = ((InternalEObject)iN212).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN212, null, msgs);
			if (newIN212 != null)
				msgs = ((InternalEObject)newIN212).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN212, null, msgs);
			msgs = basicSetIN212(newIN212, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN212, newIN212, newIN212));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN213CONTENT getIN213() {
		return iN213;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN213(IN213CONTENT newIN213, NotificationChain msgs) {
		IN213CONTENT oldIN213 = iN213;
		iN213 = newIN213;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN213, oldIN213, newIN213);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN213(IN213CONTENT newIN213) {
		if (newIN213 != iN213) {
			NotificationChain msgs = null;
			if (iN213 != null)
				msgs = ((InternalEObject)iN213).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN213, null, msgs);
			if (newIN213 != null)
				msgs = ((InternalEObject)newIN213).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN213, null, msgs);
			msgs = basicSetIN213(newIN213, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN213, newIN213, newIN213));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN214CONTENT getIN214() {
		return iN214;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN214(IN214CONTENT newIN214, NotificationChain msgs) {
		IN214CONTENT oldIN214 = iN214;
		iN214 = newIN214;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN214, oldIN214, newIN214);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN214(IN214CONTENT newIN214) {
		if (newIN214 != iN214) {
			NotificationChain msgs = null;
			if (iN214 != null)
				msgs = ((InternalEObject)iN214).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN214, null, msgs);
			if (newIN214 != null)
				msgs = ((InternalEObject)newIN214).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN214, null, msgs);
			msgs = basicSetIN214(newIN214, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN214, newIN214, newIN214));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN215CONTENT getIN215() {
		return iN215;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN215(IN215CONTENT newIN215, NotificationChain msgs) {
		IN215CONTENT oldIN215 = iN215;
		iN215 = newIN215;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN215, oldIN215, newIN215);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN215(IN215CONTENT newIN215) {
		if (newIN215 != iN215) {
			NotificationChain msgs = null;
			if (iN215 != null)
				msgs = ((InternalEObject)iN215).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN215, null, msgs);
			if (newIN215 != null)
				msgs = ((InternalEObject)newIN215).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN215, null, msgs);
			msgs = basicSetIN215(newIN215, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN215, newIN215, newIN215));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN216CONTENT getIN216() {
		return iN216;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN216(IN216CONTENT newIN216, NotificationChain msgs) {
		IN216CONTENT oldIN216 = iN216;
		iN216 = newIN216;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN216, oldIN216, newIN216);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN216(IN216CONTENT newIN216) {
		if (newIN216 != iN216) {
			NotificationChain msgs = null;
			if (iN216 != null)
				msgs = ((InternalEObject)iN216).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN216, null, msgs);
			if (newIN216 != null)
				msgs = ((InternalEObject)newIN216).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN216, null, msgs);
			msgs = basicSetIN216(newIN216, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN216, newIN216, newIN216));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN217CONTENT getIN217() {
		return iN217;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN217(IN217CONTENT newIN217, NotificationChain msgs) {
		IN217CONTENT oldIN217 = iN217;
		iN217 = newIN217;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN217, oldIN217, newIN217);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN217(IN217CONTENT newIN217) {
		if (newIN217 != iN217) {
			NotificationChain msgs = null;
			if (iN217 != null)
				msgs = ((InternalEObject)iN217).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN217, null, msgs);
			if (newIN217 != null)
				msgs = ((InternalEObject)newIN217).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN217, null, msgs);
			msgs = basicSetIN217(newIN217, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN217, newIN217, newIN217));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN218CONTENT getIN218() {
		return iN218;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN218(IN218CONTENT newIN218, NotificationChain msgs) {
		IN218CONTENT oldIN218 = iN218;
		iN218 = newIN218;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN218, oldIN218, newIN218);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN218(IN218CONTENT newIN218) {
		if (newIN218 != iN218) {
			NotificationChain msgs = null;
			if (iN218 != null)
				msgs = ((InternalEObject)iN218).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN218, null, msgs);
			if (newIN218 != null)
				msgs = ((InternalEObject)newIN218).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN218, null, msgs);
			msgs = basicSetIN218(newIN218, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN218, newIN218, newIN218));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN219CONTENT getIN219() {
		return iN219;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN219(IN219CONTENT newIN219, NotificationChain msgs) {
		IN219CONTENT oldIN219 = iN219;
		iN219 = newIN219;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN219, oldIN219, newIN219);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN219(IN219CONTENT newIN219) {
		if (newIN219 != iN219) {
			NotificationChain msgs = null;
			if (iN219 != null)
				msgs = ((InternalEObject)iN219).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN219, null, msgs);
			if (newIN219 != null)
				msgs = ((InternalEObject)newIN219).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN219, null, msgs);
			msgs = basicSetIN219(newIN219, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN219, newIN219, newIN219));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN220CONTENT getIN220() {
		return iN220;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN220(IN220CONTENT newIN220, NotificationChain msgs) {
		IN220CONTENT oldIN220 = iN220;
		iN220 = newIN220;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN220, oldIN220, newIN220);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN220(IN220CONTENT newIN220) {
		if (newIN220 != iN220) {
			NotificationChain msgs = null;
			if (iN220 != null)
				msgs = ((InternalEObject)iN220).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN220, null, msgs);
			if (newIN220 != null)
				msgs = ((InternalEObject)newIN220).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN220, null, msgs);
			msgs = basicSetIN220(newIN220, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN220, newIN220, newIN220));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN221CONTENT getIN221() {
		return iN221;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN221(IN221CONTENT newIN221, NotificationChain msgs) {
		IN221CONTENT oldIN221 = iN221;
		iN221 = newIN221;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN221, oldIN221, newIN221);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN221(IN221CONTENT newIN221) {
		if (newIN221 != iN221) {
			NotificationChain msgs = null;
			if (iN221 != null)
				msgs = ((InternalEObject)iN221).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN221, null, msgs);
			if (newIN221 != null)
				msgs = ((InternalEObject)newIN221).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN221, null, msgs);
			msgs = basicSetIN221(newIN221, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN221, newIN221, newIN221));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN222CONTENT> getIN222() {
		if (iN222 == null) {
			iN222 = new EObjectContainmentEList<IN222CONTENT>(IN222CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN222);
		}
		return iN222;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN223CONTENT getIN223() {
		return iN223;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN223(IN223CONTENT newIN223, NotificationChain msgs) {
		IN223CONTENT oldIN223 = iN223;
		iN223 = newIN223;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN223, oldIN223, newIN223);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN223(IN223CONTENT newIN223) {
		if (newIN223 != iN223) {
			NotificationChain msgs = null;
			if (iN223 != null)
				msgs = ((InternalEObject)iN223).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN223, null, msgs);
			if (newIN223 != null)
				msgs = ((InternalEObject)newIN223).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN223, null, msgs);
			msgs = basicSetIN223(newIN223, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN223, newIN223, newIN223));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN224CONTENT> getIN224() {
		if (iN224 == null) {
			iN224 = new EObjectContainmentEList<IN224CONTENT>(IN224CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN224);
		}
		return iN224;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN225CONTENT> getIN225() {
		if (iN225 == null) {
			iN225 = new EObjectContainmentEList<IN225CONTENT>(IN225CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN225);
		}
		return iN225;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN226CONTENT> getIN226() {
		if (iN226 == null) {
			iN226 = new EObjectContainmentEList<IN226CONTENT>(IN226CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN226);
		}
		return iN226;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN227CONTENT getIN227() {
		return iN227;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN227(IN227CONTENT newIN227, NotificationChain msgs) {
		IN227CONTENT oldIN227 = iN227;
		iN227 = newIN227;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN227, oldIN227, newIN227);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN227(IN227CONTENT newIN227) {
		if (newIN227 != iN227) {
			NotificationChain msgs = null;
			if (iN227 != null)
				msgs = ((InternalEObject)iN227).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN227, null, msgs);
			if (newIN227 != null)
				msgs = ((InternalEObject)newIN227).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN227, null, msgs);
			msgs = basicSetIN227(newIN227, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN227, newIN227, newIN227));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN228CONTENT> getIN228() {
		if (iN228 == null) {
			iN228 = new EObjectContainmentEList<IN228CONTENT>(IN228CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN228);
		}
		return iN228;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN229CONTENT> getIN229() {
		if (iN229 == null) {
			iN229 = new EObjectContainmentEList<IN229CONTENT>(IN229CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN229);
		}
		return iN229;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN230CONTENT getIN230() {
		return iN230;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN230(IN230CONTENT newIN230, NotificationChain msgs) {
		IN230CONTENT oldIN230 = iN230;
		iN230 = newIN230;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN230, oldIN230, newIN230);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN230(IN230CONTENT newIN230) {
		if (newIN230 != iN230) {
			NotificationChain msgs = null;
			if (iN230 != null)
				msgs = ((InternalEObject)iN230).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN230, null, msgs);
			if (newIN230 != null)
				msgs = ((InternalEObject)newIN230).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN230, null, msgs);
			msgs = basicSetIN230(newIN230, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN230, newIN230, newIN230));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN231CONTENT getIN231() {
		return iN231;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN231(IN231CONTENT newIN231, NotificationChain msgs) {
		IN231CONTENT oldIN231 = iN231;
		iN231 = newIN231;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN231, oldIN231, newIN231);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN231(IN231CONTENT newIN231) {
		if (newIN231 != iN231) {
			NotificationChain msgs = null;
			if (iN231 != null)
				msgs = ((InternalEObject)iN231).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN231, null, msgs);
			if (newIN231 != null)
				msgs = ((InternalEObject)newIN231).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN231, null, msgs);
			msgs = basicSetIN231(newIN231, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN231, newIN231, newIN231));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN232CONTENT> getIN232() {
		if (iN232 == null) {
			iN232 = new EObjectContainmentEList<IN232CONTENT>(IN232CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN232);
		}
		return iN232;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN233CONTENT> getIN233() {
		if (iN233 == null) {
			iN233 = new EObjectContainmentEList<IN233CONTENT>(IN233CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN233);
		}
		return iN233;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN234CONTENT getIN234() {
		return iN234;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN234(IN234CONTENT newIN234, NotificationChain msgs) {
		IN234CONTENT oldIN234 = iN234;
		iN234 = newIN234;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN234, oldIN234, newIN234);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN234(IN234CONTENT newIN234) {
		if (newIN234 != iN234) {
			NotificationChain msgs = null;
			if (iN234 != null)
				msgs = ((InternalEObject)iN234).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN234, null, msgs);
			if (newIN234 != null)
				msgs = ((InternalEObject)newIN234).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN234, null, msgs);
			msgs = basicSetIN234(newIN234, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN234, newIN234, newIN234));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN235CONTENT getIN235() {
		return iN235;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN235(IN235CONTENT newIN235, NotificationChain msgs) {
		IN235CONTENT oldIN235 = iN235;
		iN235 = newIN235;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN235, oldIN235, newIN235);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN235(IN235CONTENT newIN235) {
		if (newIN235 != iN235) {
			NotificationChain msgs = null;
			if (iN235 != null)
				msgs = ((InternalEObject)iN235).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN235, null, msgs);
			if (newIN235 != null)
				msgs = ((InternalEObject)newIN235).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN235, null, msgs);
			msgs = basicSetIN235(newIN235, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN235, newIN235, newIN235));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN236CONTENT getIN236() {
		return iN236;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN236(IN236CONTENT newIN236, NotificationChain msgs) {
		IN236CONTENT oldIN236 = iN236;
		iN236 = newIN236;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN236, oldIN236, newIN236);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN236(IN236CONTENT newIN236) {
		if (newIN236 != iN236) {
			NotificationChain msgs = null;
			if (iN236 != null)
				msgs = ((InternalEObject)iN236).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN236, null, msgs);
			if (newIN236 != null)
				msgs = ((InternalEObject)newIN236).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN236, null, msgs);
			msgs = basicSetIN236(newIN236, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN236, newIN236, newIN236));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN237CONTENT getIN237() {
		return iN237;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN237(IN237CONTENT newIN237, NotificationChain msgs) {
		IN237CONTENT oldIN237 = iN237;
		iN237 = newIN237;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN237, oldIN237, newIN237);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN237(IN237CONTENT newIN237) {
		if (newIN237 != iN237) {
			NotificationChain msgs = null;
			if (iN237 != null)
				msgs = ((InternalEObject)iN237).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN237, null, msgs);
			if (newIN237 != null)
				msgs = ((InternalEObject)newIN237).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN237, null, msgs);
			msgs = basicSetIN237(newIN237, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN237, newIN237, newIN237));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN238CONTENT getIN238() {
		return iN238;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN238(IN238CONTENT newIN238, NotificationChain msgs) {
		IN238CONTENT oldIN238 = iN238;
		iN238 = newIN238;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN238, oldIN238, newIN238);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN238(IN238CONTENT newIN238) {
		if (newIN238 != iN238) {
			NotificationChain msgs = null;
			if (iN238 != null)
				msgs = ((InternalEObject)iN238).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN238, null, msgs);
			if (newIN238 != null)
				msgs = ((InternalEObject)newIN238).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN238, null, msgs);
			msgs = basicSetIN238(newIN238, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN238, newIN238, newIN238));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN239CONTENT getIN239() {
		return iN239;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN239(IN239CONTENT newIN239, NotificationChain msgs) {
		IN239CONTENT oldIN239 = iN239;
		iN239 = newIN239;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN239, oldIN239, newIN239);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN239(IN239CONTENT newIN239) {
		if (newIN239 != iN239) {
			NotificationChain msgs = null;
			if (iN239 != null)
				msgs = ((InternalEObject)iN239).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN239, null, msgs);
			if (newIN239 != null)
				msgs = ((InternalEObject)newIN239).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN239, null, msgs);
			msgs = basicSetIN239(newIN239, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN239, newIN239, newIN239));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN240CONTENT> getIN240() {
		if (iN240 == null) {
			iN240 = new EObjectContainmentEList<IN240CONTENT>(IN240CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN240);
		}
		return iN240;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN241CONTENT getIN241() {
		return iN241;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN241(IN241CONTENT newIN241, NotificationChain msgs) {
		IN241CONTENT oldIN241 = iN241;
		iN241 = newIN241;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN241, oldIN241, newIN241);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN241(IN241CONTENT newIN241) {
		if (newIN241 != iN241) {
			NotificationChain msgs = null;
			if (iN241 != null)
				msgs = ((InternalEObject)iN241).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN241, null, msgs);
			if (newIN241 != null)
				msgs = ((InternalEObject)newIN241).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN241, null, msgs);
			msgs = basicSetIN241(newIN241, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN241, newIN241, newIN241));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN242CONTENT> getIN242() {
		if (iN242 == null) {
			iN242 = new EObjectContainmentEList<IN242CONTENT>(IN242CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN242);
		}
		return iN242;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN243CONTENT> getIN243() {
		if (iN243 == null) {
			iN243 = new EObjectContainmentEList<IN243CONTENT>(IN243CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN243);
		}
		return iN243;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN244CONTENT getIN244() {
		return iN244;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN244(IN244CONTENT newIN244, NotificationChain msgs) {
		IN244CONTENT oldIN244 = iN244;
		iN244 = newIN244;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN244, oldIN244, newIN244);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN244(IN244CONTENT newIN244) {
		if (newIN244 != iN244) {
			NotificationChain msgs = null;
			if (iN244 != null)
				msgs = ((InternalEObject)iN244).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN244, null, msgs);
			if (newIN244 != null)
				msgs = ((InternalEObject)newIN244).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN244, null, msgs);
			msgs = basicSetIN244(newIN244, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN244, newIN244, newIN244));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN245CONTENT getIN245() {
		return iN245;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN245(IN245CONTENT newIN245, NotificationChain msgs) {
		IN245CONTENT oldIN245 = iN245;
		iN245 = newIN245;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN245, oldIN245, newIN245);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN245(IN245CONTENT newIN245) {
		if (newIN245 != iN245) {
			NotificationChain msgs = null;
			if (iN245 != null)
				msgs = ((InternalEObject)iN245).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN245, null, msgs);
			if (newIN245 != null)
				msgs = ((InternalEObject)newIN245).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN245, null, msgs);
			msgs = basicSetIN245(newIN245, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN245, newIN245, newIN245));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN246CONTENT getIN246() {
		return iN246;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN246(IN246CONTENT newIN246, NotificationChain msgs) {
		IN246CONTENT oldIN246 = iN246;
		iN246 = newIN246;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN246, oldIN246, newIN246);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN246(IN246CONTENT newIN246) {
		if (newIN246 != iN246) {
			NotificationChain msgs = null;
			if (iN246 != null)
				msgs = ((InternalEObject)iN246).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN246, null, msgs);
			if (newIN246 != null)
				msgs = ((InternalEObject)newIN246).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN246, null, msgs);
			msgs = basicSetIN246(newIN246, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN246, newIN246, newIN246));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN247CONTENT getIN247() {
		return iN247;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN247(IN247CONTENT newIN247, NotificationChain msgs) {
		IN247CONTENT oldIN247 = iN247;
		iN247 = newIN247;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN247, oldIN247, newIN247);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN247(IN247CONTENT newIN247) {
		if (newIN247 != iN247) {
			NotificationChain msgs = null;
			if (iN247 != null)
				msgs = ((InternalEObject)iN247).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN247, null, msgs);
			if (newIN247 != null)
				msgs = ((InternalEObject)newIN247).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN247, null, msgs);
			msgs = basicSetIN247(newIN247, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN247, newIN247, newIN247));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN248CONTENT getIN248() {
		return iN248;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN248(IN248CONTENT newIN248, NotificationChain msgs) {
		IN248CONTENT oldIN248 = iN248;
		iN248 = newIN248;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN248, oldIN248, newIN248);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN248(IN248CONTENT newIN248) {
		if (newIN248 != iN248) {
			NotificationChain msgs = null;
			if (iN248 != null)
				msgs = ((InternalEObject)iN248).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN248, null, msgs);
			if (newIN248 != null)
				msgs = ((InternalEObject)newIN248).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN248, null, msgs);
			msgs = basicSetIN248(newIN248, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN248, newIN248, newIN248));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN249CONTENT> getIN249() {
		if (iN249 == null) {
			iN249 = new EObjectContainmentEList<IN249CONTENT>(IN249CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN249);
		}
		return iN249;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN250CONTENT> getIN250() {
		if (iN250 == null) {
			iN250 = new EObjectContainmentEList<IN250CONTENT>(IN250CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN250);
		}
		return iN250;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN251CONTENT getIN251() {
		return iN251;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN251(IN251CONTENT newIN251, NotificationChain msgs) {
		IN251CONTENT oldIN251 = iN251;
		iN251 = newIN251;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN251, oldIN251, newIN251);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN251(IN251CONTENT newIN251) {
		if (newIN251 != iN251) {
			NotificationChain msgs = null;
			if (iN251 != null)
				msgs = ((InternalEObject)iN251).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN251, null, msgs);
			if (newIN251 != null)
				msgs = ((InternalEObject)newIN251).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN251, null, msgs);
			msgs = basicSetIN251(newIN251, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN251, newIN251, newIN251));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN252CONTENT> getIN252() {
		if (iN252 == null) {
			iN252 = new EObjectContainmentEList<IN252CONTENT>(IN252CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN252);
		}
		return iN252;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN253CONTENT> getIN253() {
		if (iN253 == null) {
			iN253 = new EObjectContainmentEList<IN253CONTENT>(IN253CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN253);
		}
		return iN253;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN254CONTENT> getIN254() {
		if (iN254 == null) {
			iN254 = new EObjectContainmentEList<IN254CONTENT>(IN254CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN254);
		}
		return iN254;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN255CONTENT getIN255() {
		return iN255;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN255(IN255CONTENT newIN255, NotificationChain msgs) {
		IN255CONTENT oldIN255 = iN255;
		iN255 = newIN255;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN255, oldIN255, newIN255);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN255(IN255CONTENT newIN255) {
		if (newIN255 != iN255) {
			NotificationChain msgs = null;
			if (iN255 != null)
				msgs = ((InternalEObject)iN255).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN255, null, msgs);
			if (newIN255 != null)
				msgs = ((InternalEObject)newIN255).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN255, null, msgs);
			msgs = basicSetIN255(newIN255, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN255, newIN255, newIN255));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN256CONTENT> getIN256() {
		if (iN256 == null) {
			iN256 = new EObjectContainmentEList<IN256CONTENT>(IN256CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN256);
		}
		return iN256;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN257CONTENT getIN257() {
		return iN257;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN257(IN257CONTENT newIN257, NotificationChain msgs) {
		IN257CONTENT oldIN257 = iN257;
		iN257 = newIN257;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN257, oldIN257, newIN257);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN257(IN257CONTENT newIN257) {
		if (newIN257 != iN257) {
			NotificationChain msgs = null;
			if (iN257 != null)
				msgs = ((InternalEObject)iN257).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN257, null, msgs);
			if (newIN257 != null)
				msgs = ((InternalEObject)newIN257).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN257, null, msgs);
			msgs = basicSetIN257(newIN257, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN257, newIN257, newIN257));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN258CONTENT getIN258() {
		return iN258;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN258(IN258CONTENT newIN258, NotificationChain msgs) {
		IN258CONTENT oldIN258 = iN258;
		iN258 = newIN258;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN258, oldIN258, newIN258);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN258(IN258CONTENT newIN258) {
		if (newIN258 != iN258) {
			NotificationChain msgs = null;
			if (iN258 != null)
				msgs = ((InternalEObject)iN258).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN258, null, msgs);
			if (newIN258 != null)
				msgs = ((InternalEObject)newIN258).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN258, null, msgs);
			msgs = basicSetIN258(newIN258, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN258, newIN258, newIN258));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN259CONTENT getIN259() {
		return iN259;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN259(IN259CONTENT newIN259, NotificationChain msgs) {
		IN259CONTENT oldIN259 = iN259;
		iN259 = newIN259;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN259, oldIN259, newIN259);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN259(IN259CONTENT newIN259) {
		if (newIN259 != iN259) {
			NotificationChain msgs = null;
			if (iN259 != null)
				msgs = ((InternalEObject)iN259).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN259, null, msgs);
			if (newIN259 != null)
				msgs = ((InternalEObject)newIN259).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN259, null, msgs);
			msgs = basicSetIN259(newIN259, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN259, newIN259, newIN259));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN260CONTENT getIN260() {
		return iN260;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN260(IN260CONTENT newIN260, NotificationChain msgs) {
		IN260CONTENT oldIN260 = iN260;
		iN260 = newIN260;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN260, oldIN260, newIN260);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN260(IN260CONTENT newIN260) {
		if (newIN260 != iN260) {
			NotificationChain msgs = null;
			if (iN260 != null)
				msgs = ((InternalEObject)iN260).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN260, null, msgs);
			if (newIN260 != null)
				msgs = ((InternalEObject)newIN260).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN260, null, msgs);
			msgs = basicSetIN260(newIN260, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN260, newIN260, newIN260));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN261CONTENT getIN261() {
		return iN261;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN261(IN261CONTENT newIN261, NotificationChain msgs) {
		IN261CONTENT oldIN261 = iN261;
		iN261 = newIN261;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN261, oldIN261, newIN261);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN261(IN261CONTENT newIN261) {
		if (newIN261 != iN261) {
			NotificationChain msgs = null;
			if (iN261 != null)
				msgs = ((InternalEObject)iN261).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN261, null, msgs);
			if (newIN261 != null)
				msgs = ((InternalEObject)newIN261).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN261, null, msgs);
			msgs = basicSetIN261(newIN261, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN261, newIN261, newIN261));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN262CONTENT getIN262() {
		return iN262;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN262(IN262CONTENT newIN262, NotificationChain msgs) {
		IN262CONTENT oldIN262 = iN262;
		iN262 = newIN262;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN262, oldIN262, newIN262);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN262(IN262CONTENT newIN262) {
		if (newIN262 != iN262) {
			NotificationChain msgs = null;
			if (iN262 != null)
				msgs = ((InternalEObject)iN262).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN262, null, msgs);
			if (newIN262 != null)
				msgs = ((InternalEObject)newIN262).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN262, null, msgs);
			msgs = basicSetIN262(newIN262, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN262, newIN262, newIN262));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN263CONTENT> getIN263() {
		if (iN263 == null) {
			iN263 = new EObjectContainmentEList<IN263CONTENT>(IN263CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN263);
		}
		return iN263;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN264CONTENT> getIN264() {
		if (iN264 == null) {
			iN264 = new EObjectContainmentEList<IN264CONTENT>(IN264CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN264);
		}
		return iN264;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN265CONTENT getIN265() {
		return iN265;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN265(IN265CONTENT newIN265, NotificationChain msgs) {
		IN265CONTENT oldIN265 = iN265;
		iN265 = newIN265;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN265, oldIN265, newIN265);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN265(IN265CONTENT newIN265) {
		if (newIN265 != iN265) {
			NotificationChain msgs = null;
			if (iN265 != null)
				msgs = ((InternalEObject)iN265).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN265, null, msgs);
			if (newIN265 != null)
				msgs = ((InternalEObject)newIN265).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN265, null, msgs);
			msgs = basicSetIN265(newIN265, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN265, newIN265, newIN265));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN266CONTENT getIN266() {
		return iN266;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN266(IN266CONTENT newIN266, NotificationChain msgs) {
		IN266CONTENT oldIN266 = iN266;
		iN266 = newIN266;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN266, oldIN266, newIN266);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN266(IN266CONTENT newIN266) {
		if (newIN266 != iN266) {
			NotificationChain msgs = null;
			if (iN266 != null)
				msgs = ((InternalEObject)iN266).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN266, null, msgs);
			if (newIN266 != null)
				msgs = ((InternalEObject)newIN266).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN266, null, msgs);
			msgs = basicSetIN266(newIN266, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN266, newIN266, newIN266));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN267CONTENT getIN267() {
		return iN267;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN267(IN267CONTENT newIN267, NotificationChain msgs) {
		IN267CONTENT oldIN267 = iN267;
		iN267 = newIN267;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN267, oldIN267, newIN267);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN267(IN267CONTENT newIN267) {
		if (newIN267 != iN267) {
			NotificationChain msgs = null;
			if (iN267 != null)
				msgs = ((InternalEObject)iN267).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN267, null, msgs);
			if (newIN267 != null)
				msgs = ((InternalEObject)newIN267).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN267, null, msgs);
			msgs = basicSetIN267(newIN267, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN267, newIN267, newIN267));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN268CONTENT getIN268() {
		return iN268;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN268(IN268CONTENT newIN268, NotificationChain msgs) {
		IN268CONTENT oldIN268 = iN268;
		iN268 = newIN268;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN268, oldIN268, newIN268);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN268(IN268CONTENT newIN268) {
		if (newIN268 != iN268) {
			NotificationChain msgs = null;
			if (iN268 != null)
				msgs = ((InternalEObject)iN268).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN268, null, msgs);
			if (newIN268 != null)
				msgs = ((InternalEObject)newIN268).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN268, null, msgs);
			msgs = basicSetIN268(newIN268, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN268, newIN268, newIN268));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN269CONTENT> getIN269() {
		if (iN269 == null) {
			iN269 = new EObjectContainmentEList<IN269CONTENT>(IN269CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN269);
		}
		return iN269;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN270CONTENT> getIN270() {
		if (iN270 == null) {
			iN270 = new EObjectContainmentEList<IN270CONTENT>(IN270CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN270);
		}
		return iN270;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IN271CONTENT> getIN271() {
		if (iN271 == null) {
			iN271 = new EObjectContainmentEList<IN271CONTENT>(IN271CONTENT.class, this, V2xmlPackage.IN2CONTENT__IN271);
		}
		return iN271;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IN272CONTENT getIN272() {
		return iN272;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIN272(IN272CONTENT newIN272, NotificationChain msgs) {
		IN272CONTENT oldIN272 = iN272;
		iN272 = newIN272;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN272, oldIN272, newIN272);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIN272(IN272CONTENT newIN272) {
		if (newIN272 != iN272) {
			NotificationChain msgs = null;
			if (iN272 != null)
				msgs = ((InternalEObject)iN272).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN272, null, msgs);
			if (newIN272 != null)
				msgs = ((InternalEObject)newIN272).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.IN2CONTENT__IN272, null, msgs);
			msgs = basicSetIN272(newIN272, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.IN2CONTENT__IN272, newIN272, newIN272));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.IN2CONTENT__ANY);
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
			case V2xmlPackage.IN2CONTENT__IN21:
				return ((InternalEList<?>)getIN21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN22:
				return basicSetIN22(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN23:
				return ((InternalEList<?>)getIN23()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN24:
				return basicSetIN24(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN25:
				return ((InternalEList<?>)getIN25()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN26:
				return basicSetIN26(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN27:
				return ((InternalEList<?>)getIN27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN28:
				return basicSetIN28(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN29:
				return ((InternalEList<?>)getIN29()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN210:
				return basicSetIN210(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN211:
				return basicSetIN211(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN212:
				return basicSetIN212(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN213:
				return basicSetIN213(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN214:
				return basicSetIN214(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN215:
				return basicSetIN215(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN216:
				return basicSetIN216(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN217:
				return basicSetIN217(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN218:
				return basicSetIN218(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN219:
				return basicSetIN219(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN220:
				return basicSetIN220(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN221:
				return basicSetIN221(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN222:
				return ((InternalEList<?>)getIN222()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN223:
				return basicSetIN223(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN224:
				return ((InternalEList<?>)getIN224()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN225:
				return ((InternalEList<?>)getIN225()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN226:
				return ((InternalEList<?>)getIN226()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN227:
				return basicSetIN227(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN228:
				return ((InternalEList<?>)getIN228()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN229:
				return ((InternalEList<?>)getIN229()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN230:
				return basicSetIN230(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN231:
				return basicSetIN231(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN232:
				return ((InternalEList<?>)getIN232()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN233:
				return ((InternalEList<?>)getIN233()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN234:
				return basicSetIN234(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN235:
				return basicSetIN235(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN236:
				return basicSetIN236(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN237:
				return basicSetIN237(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN238:
				return basicSetIN238(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN239:
				return basicSetIN239(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN240:
				return ((InternalEList<?>)getIN240()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN241:
				return basicSetIN241(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN242:
				return ((InternalEList<?>)getIN242()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN243:
				return ((InternalEList<?>)getIN243()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN244:
				return basicSetIN244(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN245:
				return basicSetIN245(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN246:
				return basicSetIN246(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN247:
				return basicSetIN247(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN248:
				return basicSetIN248(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN249:
				return ((InternalEList<?>)getIN249()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN250:
				return ((InternalEList<?>)getIN250()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN251:
				return basicSetIN251(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN252:
				return ((InternalEList<?>)getIN252()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN253:
				return ((InternalEList<?>)getIN253()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN254:
				return ((InternalEList<?>)getIN254()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN255:
				return basicSetIN255(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN256:
				return ((InternalEList<?>)getIN256()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN257:
				return basicSetIN257(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN258:
				return basicSetIN258(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN259:
				return basicSetIN259(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN260:
				return basicSetIN260(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN261:
				return basicSetIN261(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN262:
				return basicSetIN262(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN263:
				return ((InternalEList<?>)getIN263()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN264:
				return ((InternalEList<?>)getIN264()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN265:
				return basicSetIN265(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN266:
				return basicSetIN266(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN267:
				return basicSetIN267(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN268:
				return basicSetIN268(null, msgs);
			case V2xmlPackage.IN2CONTENT__IN269:
				return ((InternalEList<?>)getIN269()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN270:
				return ((InternalEList<?>)getIN270()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN271:
				return ((InternalEList<?>)getIN271()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.IN2CONTENT__IN272:
				return basicSetIN272(null, msgs);
			case V2xmlPackage.IN2CONTENT__ANY:
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
			case V2xmlPackage.IN2CONTENT__IN21:
				return getIN21();
			case V2xmlPackage.IN2CONTENT__IN22:
				return getIN22();
			case V2xmlPackage.IN2CONTENT__IN23:
				return getIN23();
			case V2xmlPackage.IN2CONTENT__IN24:
				return getIN24();
			case V2xmlPackage.IN2CONTENT__IN25:
				return getIN25();
			case V2xmlPackage.IN2CONTENT__IN26:
				return getIN26();
			case V2xmlPackage.IN2CONTENT__IN27:
				return getIN27();
			case V2xmlPackage.IN2CONTENT__IN28:
				return getIN28();
			case V2xmlPackage.IN2CONTENT__IN29:
				return getIN29();
			case V2xmlPackage.IN2CONTENT__IN210:
				return getIN210();
			case V2xmlPackage.IN2CONTENT__IN211:
				return getIN211();
			case V2xmlPackage.IN2CONTENT__IN212:
				return getIN212();
			case V2xmlPackage.IN2CONTENT__IN213:
				return getIN213();
			case V2xmlPackage.IN2CONTENT__IN214:
				return getIN214();
			case V2xmlPackage.IN2CONTENT__IN215:
				return getIN215();
			case V2xmlPackage.IN2CONTENT__IN216:
				return getIN216();
			case V2xmlPackage.IN2CONTENT__IN217:
				return getIN217();
			case V2xmlPackage.IN2CONTENT__IN218:
				return getIN218();
			case V2xmlPackage.IN2CONTENT__IN219:
				return getIN219();
			case V2xmlPackage.IN2CONTENT__IN220:
				return getIN220();
			case V2xmlPackage.IN2CONTENT__IN221:
				return getIN221();
			case V2xmlPackage.IN2CONTENT__IN222:
				return getIN222();
			case V2xmlPackage.IN2CONTENT__IN223:
				return getIN223();
			case V2xmlPackage.IN2CONTENT__IN224:
				return getIN224();
			case V2xmlPackage.IN2CONTENT__IN225:
				return getIN225();
			case V2xmlPackage.IN2CONTENT__IN226:
				return getIN226();
			case V2xmlPackage.IN2CONTENT__IN227:
				return getIN227();
			case V2xmlPackage.IN2CONTENT__IN228:
				return getIN228();
			case V2xmlPackage.IN2CONTENT__IN229:
				return getIN229();
			case V2xmlPackage.IN2CONTENT__IN230:
				return getIN230();
			case V2xmlPackage.IN2CONTENT__IN231:
				return getIN231();
			case V2xmlPackage.IN2CONTENT__IN232:
				return getIN232();
			case V2xmlPackage.IN2CONTENT__IN233:
				return getIN233();
			case V2xmlPackage.IN2CONTENT__IN234:
				return getIN234();
			case V2xmlPackage.IN2CONTENT__IN235:
				return getIN235();
			case V2xmlPackage.IN2CONTENT__IN236:
				return getIN236();
			case V2xmlPackage.IN2CONTENT__IN237:
				return getIN237();
			case V2xmlPackage.IN2CONTENT__IN238:
				return getIN238();
			case V2xmlPackage.IN2CONTENT__IN239:
				return getIN239();
			case V2xmlPackage.IN2CONTENT__IN240:
				return getIN240();
			case V2xmlPackage.IN2CONTENT__IN241:
				return getIN241();
			case V2xmlPackage.IN2CONTENT__IN242:
				return getIN242();
			case V2xmlPackage.IN2CONTENT__IN243:
				return getIN243();
			case V2xmlPackage.IN2CONTENT__IN244:
				return getIN244();
			case V2xmlPackage.IN2CONTENT__IN245:
				return getIN245();
			case V2xmlPackage.IN2CONTENT__IN246:
				return getIN246();
			case V2xmlPackage.IN2CONTENT__IN247:
				return getIN247();
			case V2xmlPackage.IN2CONTENT__IN248:
				return getIN248();
			case V2xmlPackage.IN2CONTENT__IN249:
				return getIN249();
			case V2xmlPackage.IN2CONTENT__IN250:
				return getIN250();
			case V2xmlPackage.IN2CONTENT__IN251:
				return getIN251();
			case V2xmlPackage.IN2CONTENT__IN252:
				return getIN252();
			case V2xmlPackage.IN2CONTENT__IN253:
				return getIN253();
			case V2xmlPackage.IN2CONTENT__IN254:
				return getIN254();
			case V2xmlPackage.IN2CONTENT__IN255:
				return getIN255();
			case V2xmlPackage.IN2CONTENT__IN256:
				return getIN256();
			case V2xmlPackage.IN2CONTENT__IN257:
				return getIN257();
			case V2xmlPackage.IN2CONTENT__IN258:
				return getIN258();
			case V2xmlPackage.IN2CONTENT__IN259:
				return getIN259();
			case V2xmlPackage.IN2CONTENT__IN260:
				return getIN260();
			case V2xmlPackage.IN2CONTENT__IN261:
				return getIN261();
			case V2xmlPackage.IN2CONTENT__IN262:
				return getIN262();
			case V2xmlPackage.IN2CONTENT__IN263:
				return getIN263();
			case V2xmlPackage.IN2CONTENT__IN264:
				return getIN264();
			case V2xmlPackage.IN2CONTENT__IN265:
				return getIN265();
			case V2xmlPackage.IN2CONTENT__IN266:
				return getIN266();
			case V2xmlPackage.IN2CONTENT__IN267:
				return getIN267();
			case V2xmlPackage.IN2CONTENT__IN268:
				return getIN268();
			case V2xmlPackage.IN2CONTENT__IN269:
				return getIN269();
			case V2xmlPackage.IN2CONTENT__IN270:
				return getIN270();
			case V2xmlPackage.IN2CONTENT__IN271:
				return getIN271();
			case V2xmlPackage.IN2CONTENT__IN272:
				return getIN272();
			case V2xmlPackage.IN2CONTENT__ANY:
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
			case V2xmlPackage.IN2CONTENT__IN21:
				getIN21().clear();
				getIN21().addAll((Collection<? extends IN21CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN22:
				setIN22((IN22CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN23:
				getIN23().clear();
				getIN23().addAll((Collection<? extends IN23CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN24:
				setIN24((IN24CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN25:
				getIN25().clear();
				getIN25().addAll((Collection<? extends IN25CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN26:
				setIN26((IN26CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN27:
				getIN27().clear();
				getIN27().addAll((Collection<? extends IN27CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN28:
				setIN28((IN28CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN29:
				getIN29().clear();
				getIN29().addAll((Collection<? extends IN29CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN210:
				setIN210((IN210CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN211:
				setIN211((IN211CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN212:
				setIN212((IN212CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN213:
				setIN213((IN213CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN214:
				setIN214((IN214CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN215:
				setIN215((IN215CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN216:
				setIN216((IN216CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN217:
				setIN217((IN217CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN218:
				setIN218((IN218CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN219:
				setIN219((IN219CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN220:
				setIN220((IN220CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN221:
				setIN221((IN221CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN222:
				getIN222().clear();
				getIN222().addAll((Collection<? extends IN222CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN223:
				setIN223((IN223CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN224:
				getIN224().clear();
				getIN224().addAll((Collection<? extends IN224CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN225:
				getIN225().clear();
				getIN225().addAll((Collection<? extends IN225CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN226:
				getIN226().clear();
				getIN226().addAll((Collection<? extends IN226CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN227:
				setIN227((IN227CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN228:
				getIN228().clear();
				getIN228().addAll((Collection<? extends IN228CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN229:
				getIN229().clear();
				getIN229().addAll((Collection<? extends IN229CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN230:
				setIN230((IN230CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN231:
				setIN231((IN231CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN232:
				getIN232().clear();
				getIN232().addAll((Collection<? extends IN232CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN233:
				getIN233().clear();
				getIN233().addAll((Collection<? extends IN233CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN234:
				setIN234((IN234CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN235:
				setIN235((IN235CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN236:
				setIN236((IN236CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN237:
				setIN237((IN237CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN238:
				setIN238((IN238CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN239:
				setIN239((IN239CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN240:
				getIN240().clear();
				getIN240().addAll((Collection<? extends IN240CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN241:
				setIN241((IN241CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN242:
				getIN242().clear();
				getIN242().addAll((Collection<? extends IN242CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN243:
				getIN243().clear();
				getIN243().addAll((Collection<? extends IN243CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN244:
				setIN244((IN244CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN245:
				setIN245((IN245CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN246:
				setIN246((IN246CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN247:
				setIN247((IN247CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN248:
				setIN248((IN248CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN249:
				getIN249().clear();
				getIN249().addAll((Collection<? extends IN249CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN250:
				getIN250().clear();
				getIN250().addAll((Collection<? extends IN250CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN251:
				setIN251((IN251CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN252:
				getIN252().clear();
				getIN252().addAll((Collection<? extends IN252CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN253:
				getIN253().clear();
				getIN253().addAll((Collection<? extends IN253CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN254:
				getIN254().clear();
				getIN254().addAll((Collection<? extends IN254CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN255:
				setIN255((IN255CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN256:
				getIN256().clear();
				getIN256().addAll((Collection<? extends IN256CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN257:
				setIN257((IN257CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN258:
				setIN258((IN258CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN259:
				setIN259((IN259CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN260:
				setIN260((IN260CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN261:
				setIN261((IN261CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN262:
				setIN262((IN262CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN263:
				getIN263().clear();
				getIN263().addAll((Collection<? extends IN263CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN264:
				getIN264().clear();
				getIN264().addAll((Collection<? extends IN264CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN265:
				setIN265((IN265CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN266:
				setIN266((IN266CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN267:
				setIN267((IN267CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN268:
				setIN268((IN268CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN269:
				getIN269().clear();
				getIN269().addAll((Collection<? extends IN269CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN270:
				getIN270().clear();
				getIN270().addAll((Collection<? extends IN270CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN271:
				getIN271().clear();
				getIN271().addAll((Collection<? extends IN271CONTENT>)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__IN272:
				setIN272((IN272CONTENT)newValue);
				return;
			case V2xmlPackage.IN2CONTENT__ANY:
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
			case V2xmlPackage.IN2CONTENT__IN21:
				getIN21().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN22:
				setIN22((IN22CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN23:
				getIN23().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN24:
				setIN24((IN24CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN25:
				getIN25().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN26:
				setIN26((IN26CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN27:
				getIN27().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN28:
				setIN28((IN28CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN29:
				getIN29().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN210:
				setIN210((IN210CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN211:
				setIN211((IN211CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN212:
				setIN212((IN212CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN213:
				setIN213((IN213CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN214:
				setIN214((IN214CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN215:
				setIN215((IN215CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN216:
				setIN216((IN216CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN217:
				setIN217((IN217CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN218:
				setIN218((IN218CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN219:
				setIN219((IN219CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN220:
				setIN220((IN220CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN221:
				setIN221((IN221CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN222:
				getIN222().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN223:
				setIN223((IN223CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN224:
				getIN224().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN225:
				getIN225().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN226:
				getIN226().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN227:
				setIN227((IN227CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN228:
				getIN228().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN229:
				getIN229().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN230:
				setIN230((IN230CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN231:
				setIN231((IN231CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN232:
				getIN232().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN233:
				getIN233().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN234:
				setIN234((IN234CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN235:
				setIN235((IN235CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN236:
				setIN236((IN236CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN237:
				setIN237((IN237CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN238:
				setIN238((IN238CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN239:
				setIN239((IN239CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN240:
				getIN240().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN241:
				setIN241((IN241CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN242:
				getIN242().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN243:
				getIN243().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN244:
				setIN244((IN244CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN245:
				setIN245((IN245CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN246:
				setIN246((IN246CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN247:
				setIN247((IN247CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN248:
				setIN248((IN248CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN249:
				getIN249().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN250:
				getIN250().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN251:
				setIN251((IN251CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN252:
				getIN252().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN253:
				getIN253().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN254:
				getIN254().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN255:
				setIN255((IN255CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN256:
				getIN256().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN257:
				setIN257((IN257CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN258:
				setIN258((IN258CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN259:
				setIN259((IN259CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN260:
				setIN260((IN260CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN261:
				setIN261((IN261CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN262:
				setIN262((IN262CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN263:
				getIN263().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN264:
				getIN264().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN265:
				setIN265((IN265CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN266:
				setIN266((IN266CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN267:
				setIN267((IN267CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN268:
				setIN268((IN268CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__IN269:
				getIN269().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN270:
				getIN270().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN271:
				getIN271().clear();
				return;
			case V2xmlPackage.IN2CONTENT__IN272:
				setIN272((IN272CONTENT)null);
				return;
			case V2xmlPackage.IN2CONTENT__ANY:
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
			case V2xmlPackage.IN2CONTENT__IN21:
				return iN21 != null && !iN21.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN22:
				return iN22 != null;
			case V2xmlPackage.IN2CONTENT__IN23:
				return iN23 != null && !iN23.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN24:
				return iN24 != null;
			case V2xmlPackage.IN2CONTENT__IN25:
				return iN25 != null && !iN25.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN26:
				return iN26 != null;
			case V2xmlPackage.IN2CONTENT__IN27:
				return iN27 != null && !iN27.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN28:
				return iN28 != null;
			case V2xmlPackage.IN2CONTENT__IN29:
				return iN29 != null && !iN29.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN210:
				return iN210 != null;
			case V2xmlPackage.IN2CONTENT__IN211:
				return iN211 != null;
			case V2xmlPackage.IN2CONTENT__IN212:
				return iN212 != null;
			case V2xmlPackage.IN2CONTENT__IN213:
				return iN213 != null;
			case V2xmlPackage.IN2CONTENT__IN214:
				return iN214 != null;
			case V2xmlPackage.IN2CONTENT__IN215:
				return iN215 != null;
			case V2xmlPackage.IN2CONTENT__IN216:
				return iN216 != null;
			case V2xmlPackage.IN2CONTENT__IN217:
				return iN217 != null;
			case V2xmlPackage.IN2CONTENT__IN218:
				return iN218 != null;
			case V2xmlPackage.IN2CONTENT__IN219:
				return iN219 != null;
			case V2xmlPackage.IN2CONTENT__IN220:
				return iN220 != null;
			case V2xmlPackage.IN2CONTENT__IN221:
				return iN221 != null;
			case V2xmlPackage.IN2CONTENT__IN222:
				return iN222 != null && !iN222.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN223:
				return iN223 != null;
			case V2xmlPackage.IN2CONTENT__IN224:
				return iN224 != null && !iN224.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN225:
				return iN225 != null && !iN225.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN226:
				return iN226 != null && !iN226.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN227:
				return iN227 != null;
			case V2xmlPackage.IN2CONTENT__IN228:
				return iN228 != null && !iN228.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN229:
				return iN229 != null && !iN229.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN230:
				return iN230 != null;
			case V2xmlPackage.IN2CONTENT__IN231:
				return iN231 != null;
			case V2xmlPackage.IN2CONTENT__IN232:
				return iN232 != null && !iN232.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN233:
				return iN233 != null && !iN233.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN234:
				return iN234 != null;
			case V2xmlPackage.IN2CONTENT__IN235:
				return iN235 != null;
			case V2xmlPackage.IN2CONTENT__IN236:
				return iN236 != null;
			case V2xmlPackage.IN2CONTENT__IN237:
				return iN237 != null;
			case V2xmlPackage.IN2CONTENT__IN238:
				return iN238 != null;
			case V2xmlPackage.IN2CONTENT__IN239:
				return iN239 != null;
			case V2xmlPackage.IN2CONTENT__IN240:
				return iN240 != null && !iN240.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN241:
				return iN241 != null;
			case V2xmlPackage.IN2CONTENT__IN242:
				return iN242 != null && !iN242.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN243:
				return iN243 != null && !iN243.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN244:
				return iN244 != null;
			case V2xmlPackage.IN2CONTENT__IN245:
				return iN245 != null;
			case V2xmlPackage.IN2CONTENT__IN246:
				return iN246 != null;
			case V2xmlPackage.IN2CONTENT__IN247:
				return iN247 != null;
			case V2xmlPackage.IN2CONTENT__IN248:
				return iN248 != null;
			case V2xmlPackage.IN2CONTENT__IN249:
				return iN249 != null && !iN249.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN250:
				return iN250 != null && !iN250.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN251:
				return iN251 != null;
			case V2xmlPackage.IN2CONTENT__IN252:
				return iN252 != null && !iN252.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN253:
				return iN253 != null && !iN253.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN254:
				return iN254 != null && !iN254.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN255:
				return iN255 != null;
			case V2xmlPackage.IN2CONTENT__IN256:
				return iN256 != null && !iN256.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN257:
				return iN257 != null;
			case V2xmlPackage.IN2CONTENT__IN258:
				return iN258 != null;
			case V2xmlPackage.IN2CONTENT__IN259:
				return iN259 != null;
			case V2xmlPackage.IN2CONTENT__IN260:
				return iN260 != null;
			case V2xmlPackage.IN2CONTENT__IN261:
				return iN261 != null;
			case V2xmlPackage.IN2CONTENT__IN262:
				return iN262 != null;
			case V2xmlPackage.IN2CONTENT__IN263:
				return iN263 != null && !iN263.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN264:
				return iN264 != null && !iN264.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN265:
				return iN265 != null;
			case V2xmlPackage.IN2CONTENT__IN266:
				return iN266 != null;
			case V2xmlPackage.IN2CONTENT__IN267:
				return iN267 != null;
			case V2xmlPackage.IN2CONTENT__IN268:
				return iN268 != null;
			case V2xmlPackage.IN2CONTENT__IN269:
				return iN269 != null && !iN269.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN270:
				return iN270 != null && !iN270.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN271:
				return iN271 != null && !iN271.isEmpty();
			case V2xmlPackage.IN2CONTENT__IN272:
				return iN272 != null;
			case V2xmlPackage.IN2CONTENT__ANY:
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

} //IN2CONTENTImpl
