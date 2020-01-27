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

import org.hl7.v2xml.RXE10CONTENT;
import org.hl7.v2xml.RXE11CONTENT;
import org.hl7.v2xml.RXE12CONTENT;
import org.hl7.v2xml.RXE13CONTENT;
import org.hl7.v2xml.RXE14CONTENT;
import org.hl7.v2xml.RXE15CONTENT;
import org.hl7.v2xml.RXE16CONTENT;
import org.hl7.v2xml.RXE17CONTENT;
import org.hl7.v2xml.RXE18CONTENT;
import org.hl7.v2xml.RXE19CONTENT;
import org.hl7.v2xml.RXE1CONTENT;
import org.hl7.v2xml.RXE20CONTENT;
import org.hl7.v2xml.RXE21CONTENT;
import org.hl7.v2xml.RXE22CONTENT;
import org.hl7.v2xml.RXE23CONTENT;
import org.hl7.v2xml.RXE24CONTENT;
import org.hl7.v2xml.RXE25CONTENT;
import org.hl7.v2xml.RXE26CONTENT;
import org.hl7.v2xml.RXE27CONTENT;
import org.hl7.v2xml.RXE28CONTENT;
import org.hl7.v2xml.RXE29CONTENT;
import org.hl7.v2xml.RXE2CONTENT;
import org.hl7.v2xml.RXE30CONTENT;
import org.hl7.v2xml.RXE31CONTENT;
import org.hl7.v2xml.RXE32CONTENT;
import org.hl7.v2xml.RXE33CONTENT;
import org.hl7.v2xml.RXE34CONTENT;
import org.hl7.v2xml.RXE35CONTENT;
import org.hl7.v2xml.RXE36CONTENT;
import org.hl7.v2xml.RXE37CONTENT;
import org.hl7.v2xml.RXE38CONTENT;
import org.hl7.v2xml.RXE39CONTENT;
import org.hl7.v2xml.RXE3CONTENT;
import org.hl7.v2xml.RXE40CONTENT;
import org.hl7.v2xml.RXE41CONTENT;
import org.hl7.v2xml.RXE42CONTENT;
import org.hl7.v2xml.RXE43CONTENT;
import org.hl7.v2xml.RXE44CONTENT;
import org.hl7.v2xml.RXE4CONTENT;
import org.hl7.v2xml.RXE5CONTENT;
import org.hl7.v2xml.RXE6CONTENT;
import org.hl7.v2xml.RXE7CONTENT;
import org.hl7.v2xml.RXE8CONTENT;
import org.hl7.v2xml.RXE9CONTENT;
import org.hl7.v2xml.RXECONTENT;
import org.hl7.v2xml.V2xmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RXECONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE1 <em>RXE1</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE2 <em>RXE2</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE3 <em>RXE3</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE4 <em>RXE4</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE5 <em>RXE5</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE6 <em>RXE6</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE7 <em>RXE7</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE8 <em>RXE8</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE9 <em>RXE9</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE10 <em>RXE10</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE11 <em>RXE11</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE12 <em>RXE12</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE13 <em>RXE13</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE14 <em>RXE14</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE15 <em>RXE15</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE16 <em>RXE16</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE17 <em>RXE17</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE18 <em>RXE18</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE19 <em>RXE19</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE20 <em>RXE20</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE21 <em>RXE21</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE22 <em>RXE22</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE23 <em>RXE23</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE24 <em>RXE24</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE25 <em>RXE25</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE26 <em>RXE26</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE27 <em>RXE27</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE28 <em>RXE28</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE29 <em>RXE29</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE30 <em>RXE30</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE31 <em>RXE31</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE32 <em>RXE32</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE33 <em>RXE33</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE34 <em>RXE34</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE35 <em>RXE35</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE36 <em>RXE36</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE37 <em>RXE37</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE38 <em>RXE38</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE39 <em>RXE39</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE40 <em>RXE40</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE41 <em>RXE41</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE42 <em>RXE42</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE43 <em>RXE43</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getRXE44 <em>RXE44</em>}</li>
 *   <li>{@link org.hl7.v2xml.impl.RXECONTENTImpl#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RXECONTENTImpl extends EObjectImpl implements RXECONTENT {
	/**
	 * The cached value of the '{@link #getRXE1() <em>RXE1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE1()
	 * @generated
	 * @ordered
	 */
	protected RXE1CONTENT rXE1;

	/**
	 * The cached value of the '{@link #getRXE2() <em>RXE2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE2()
	 * @generated
	 * @ordered
	 */
	protected RXE2CONTENT rXE2;

	/**
	 * The cached value of the '{@link #getRXE3() <em>RXE3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE3()
	 * @generated
	 * @ordered
	 */
	protected RXE3CONTENT rXE3;

	/**
	 * The cached value of the '{@link #getRXE4() <em>RXE4</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE4()
	 * @generated
	 * @ordered
	 */
	protected RXE4CONTENT rXE4;

	/**
	 * The cached value of the '{@link #getRXE5() <em>RXE5</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE5()
	 * @generated
	 * @ordered
	 */
	protected RXE5CONTENT rXE5;

	/**
	 * The cached value of the '{@link #getRXE6() <em>RXE6</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE6()
	 * @generated
	 * @ordered
	 */
	protected RXE6CONTENT rXE6;

	/**
	 * The cached value of the '{@link #getRXE7() <em>RXE7</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE7()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE7CONTENT> rXE7;

	/**
	 * The cached value of the '{@link #getRXE8() <em>RXE8</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE8()
	 * @generated
	 * @ordered
	 */
	protected RXE8CONTENT rXE8;

	/**
	 * The cached value of the '{@link #getRXE9() <em>RXE9</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE9()
	 * @generated
	 * @ordered
	 */
	protected RXE9CONTENT rXE9;

	/**
	 * The cached value of the '{@link #getRXE10() <em>RXE10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE10()
	 * @generated
	 * @ordered
	 */
	protected RXE10CONTENT rXE10;

	/**
	 * The cached value of the '{@link #getRXE11() <em>RXE11</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE11()
	 * @generated
	 * @ordered
	 */
	protected RXE11CONTENT rXE11;

	/**
	 * The cached value of the '{@link #getRXE12() <em>RXE12</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE12()
	 * @generated
	 * @ordered
	 */
	protected RXE12CONTENT rXE12;

	/**
	 * The cached value of the '{@link #getRXE13() <em>RXE13</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE13()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE13CONTENT> rXE13;

	/**
	 * The cached value of the '{@link #getRXE14() <em>RXE14</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE14()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE14CONTENT> rXE14;

	/**
	 * The cached value of the '{@link #getRXE15() <em>RXE15</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE15()
	 * @generated
	 * @ordered
	 */
	protected RXE15CONTENT rXE15;

	/**
	 * The cached value of the '{@link #getRXE16() <em>RXE16</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE16()
	 * @generated
	 * @ordered
	 */
	protected RXE16CONTENT rXE16;

	/**
	 * The cached value of the '{@link #getRXE17() <em>RXE17</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE17()
	 * @generated
	 * @ordered
	 */
	protected RXE17CONTENT rXE17;

	/**
	 * The cached value of the '{@link #getRXE18() <em>RXE18</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE18()
	 * @generated
	 * @ordered
	 */
	protected RXE18CONTENT rXE18;

	/**
	 * The cached value of the '{@link #getRXE19() <em>RXE19</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE19()
	 * @generated
	 * @ordered
	 */
	protected RXE19CONTENT rXE19;

	/**
	 * The cached value of the '{@link #getRXE20() <em>RXE20</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE20()
	 * @generated
	 * @ordered
	 */
	protected RXE20CONTENT rXE20;

	/**
	 * The cached value of the '{@link #getRXE21() <em>RXE21</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE21()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE21CONTENT> rXE21;

	/**
	 * The cached value of the '{@link #getRXE22() <em>RXE22</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE22()
	 * @generated
	 * @ordered
	 */
	protected RXE22CONTENT rXE22;

	/**
	 * The cached value of the '{@link #getRXE23() <em>RXE23</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE23()
	 * @generated
	 * @ordered
	 */
	protected RXE23CONTENT rXE23;

	/**
	 * The cached value of the '{@link #getRXE24() <em>RXE24</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE24()
	 * @generated
	 * @ordered
	 */
	protected RXE24CONTENT rXE24;

	/**
	 * The cached value of the '{@link #getRXE25() <em>RXE25</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE25()
	 * @generated
	 * @ordered
	 */
	protected RXE25CONTENT rXE25;

	/**
	 * The cached value of the '{@link #getRXE26() <em>RXE26</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE26()
	 * @generated
	 * @ordered
	 */
	protected RXE26CONTENT rXE26;

	/**
	 * The cached value of the '{@link #getRXE27() <em>RXE27</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE27()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE27CONTENT> rXE27;

	/**
	 * The cached value of the '{@link #getRXE28() <em>RXE28</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE28()
	 * @generated
	 * @ordered
	 */
	protected RXE28CONTENT rXE28;

	/**
	 * The cached value of the '{@link #getRXE29() <em>RXE29</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE29()
	 * @generated
	 * @ordered
	 */
	protected RXE29CONTENT rXE29;

	/**
	 * The cached value of the '{@link #getRXE30() <em>RXE30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE30()
	 * @generated
	 * @ordered
	 */
	protected RXE30CONTENT rXE30;

	/**
	 * The cached value of the '{@link #getRXE31() <em>RXE31</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE31()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE31CONTENT> rXE31;

	/**
	 * The cached value of the '{@link #getRXE32() <em>RXE32</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE32()
	 * @generated
	 * @ordered
	 */
	protected RXE32CONTENT rXE32;

	/**
	 * The cached value of the '{@link #getRXE33() <em>RXE33</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE33()
	 * @generated
	 * @ordered
	 */
	protected RXE33CONTENT rXE33;

	/**
	 * The cached value of the '{@link #getRXE34() <em>RXE34</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE34()
	 * @generated
	 * @ordered
	 */
	protected RXE34CONTENT rXE34;

	/**
	 * The cached value of the '{@link #getRXE35() <em>RXE35</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE35()
	 * @generated
	 * @ordered
	 */
	protected RXE35CONTENT rXE35;

	/**
	 * The cached value of the '{@link #getRXE36() <em>RXE36</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE36()
	 * @generated
	 * @ordered
	 */
	protected RXE36CONTENT rXE36;

	/**
	 * The cached value of the '{@link #getRXE37() <em>RXE37</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE37()
	 * @generated
	 * @ordered
	 */
	protected EList<RXE37CONTENT> rXE37;

	/**
	 * The cached value of the '{@link #getRXE38() <em>RXE38</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE38()
	 * @generated
	 * @ordered
	 */
	protected RXE38CONTENT rXE38;

	/**
	 * The cached value of the '{@link #getRXE39() <em>RXE39</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE39()
	 * @generated
	 * @ordered
	 */
	protected RXE39CONTENT rXE39;

	/**
	 * The cached value of the '{@link #getRXE40() <em>RXE40</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE40()
	 * @generated
	 * @ordered
	 */
	protected RXE40CONTENT rXE40;

	/**
	 * The cached value of the '{@link #getRXE41() <em>RXE41</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE41()
	 * @generated
	 * @ordered
	 */
	protected RXE41CONTENT rXE41;

	/**
	 * The cached value of the '{@link #getRXE42() <em>RXE42</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE42()
	 * @generated
	 * @ordered
	 */
	protected RXE42CONTENT rXE42;

	/**
	 * The cached value of the '{@link #getRXE43() <em>RXE43</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE43()
	 * @generated
	 * @ordered
	 */
	protected RXE43CONTENT rXE43;

	/**
	 * The cached value of the '{@link #getRXE44() <em>RXE44</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRXE44()
	 * @generated
	 * @ordered
	 */
	protected RXE44CONTENT rXE44;

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
	protected RXECONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return V2xmlPackage.eINSTANCE.getRXECONTENT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE1CONTENT getRXE1() {
		return rXE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE1(RXE1CONTENT newRXE1, NotificationChain msgs) {
		RXE1CONTENT oldRXE1 = rXE1;
		rXE1 = newRXE1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE1, oldRXE1, newRXE1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE1(RXE1CONTENT newRXE1) {
		if (newRXE1 != rXE1) {
			NotificationChain msgs = null;
			if (rXE1 != null)
				msgs = ((InternalEObject)rXE1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE1, null, msgs);
			if (newRXE1 != null)
				msgs = ((InternalEObject)newRXE1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE1, null, msgs);
			msgs = basicSetRXE1(newRXE1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE1, newRXE1, newRXE1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE2CONTENT getRXE2() {
		return rXE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE2(RXE2CONTENT newRXE2, NotificationChain msgs) {
		RXE2CONTENT oldRXE2 = rXE2;
		rXE2 = newRXE2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE2, oldRXE2, newRXE2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE2(RXE2CONTENT newRXE2) {
		if (newRXE2 != rXE2) {
			NotificationChain msgs = null;
			if (rXE2 != null)
				msgs = ((InternalEObject)rXE2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE2, null, msgs);
			if (newRXE2 != null)
				msgs = ((InternalEObject)newRXE2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE2, null, msgs);
			msgs = basicSetRXE2(newRXE2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE2, newRXE2, newRXE2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE3CONTENT getRXE3() {
		return rXE3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE3(RXE3CONTENT newRXE3, NotificationChain msgs) {
		RXE3CONTENT oldRXE3 = rXE3;
		rXE3 = newRXE3;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE3, oldRXE3, newRXE3);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE3(RXE3CONTENT newRXE3) {
		if (newRXE3 != rXE3) {
			NotificationChain msgs = null;
			if (rXE3 != null)
				msgs = ((InternalEObject)rXE3).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE3, null, msgs);
			if (newRXE3 != null)
				msgs = ((InternalEObject)newRXE3).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE3, null, msgs);
			msgs = basicSetRXE3(newRXE3, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE3, newRXE3, newRXE3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE4CONTENT getRXE4() {
		return rXE4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE4(RXE4CONTENT newRXE4, NotificationChain msgs) {
		RXE4CONTENT oldRXE4 = rXE4;
		rXE4 = newRXE4;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE4, oldRXE4, newRXE4);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE4(RXE4CONTENT newRXE4) {
		if (newRXE4 != rXE4) {
			NotificationChain msgs = null;
			if (rXE4 != null)
				msgs = ((InternalEObject)rXE4).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE4, null, msgs);
			if (newRXE4 != null)
				msgs = ((InternalEObject)newRXE4).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE4, null, msgs);
			msgs = basicSetRXE4(newRXE4, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE4, newRXE4, newRXE4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE5CONTENT getRXE5() {
		return rXE5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE5(RXE5CONTENT newRXE5, NotificationChain msgs) {
		RXE5CONTENT oldRXE5 = rXE5;
		rXE5 = newRXE5;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE5, oldRXE5, newRXE5);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE5(RXE5CONTENT newRXE5) {
		if (newRXE5 != rXE5) {
			NotificationChain msgs = null;
			if (rXE5 != null)
				msgs = ((InternalEObject)rXE5).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE5, null, msgs);
			if (newRXE5 != null)
				msgs = ((InternalEObject)newRXE5).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE5, null, msgs);
			msgs = basicSetRXE5(newRXE5, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE5, newRXE5, newRXE5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE6CONTENT getRXE6() {
		return rXE6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE6(RXE6CONTENT newRXE6, NotificationChain msgs) {
		RXE6CONTENT oldRXE6 = rXE6;
		rXE6 = newRXE6;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE6, oldRXE6, newRXE6);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE6(RXE6CONTENT newRXE6) {
		if (newRXE6 != rXE6) {
			NotificationChain msgs = null;
			if (rXE6 != null)
				msgs = ((InternalEObject)rXE6).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE6, null, msgs);
			if (newRXE6 != null)
				msgs = ((InternalEObject)newRXE6).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE6, null, msgs);
			msgs = basicSetRXE6(newRXE6, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE6, newRXE6, newRXE6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE7CONTENT> getRXE7() {
		if (rXE7 == null) {
			rXE7 = new EObjectContainmentEList<RXE7CONTENT>(RXE7CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE7);
		}
		return rXE7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE8CONTENT getRXE8() {
		return rXE8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE8(RXE8CONTENT newRXE8, NotificationChain msgs) {
		RXE8CONTENT oldRXE8 = rXE8;
		rXE8 = newRXE8;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE8, oldRXE8, newRXE8);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE8(RXE8CONTENT newRXE8) {
		if (newRXE8 != rXE8) {
			NotificationChain msgs = null;
			if (rXE8 != null)
				msgs = ((InternalEObject)rXE8).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE8, null, msgs);
			if (newRXE8 != null)
				msgs = ((InternalEObject)newRXE8).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE8, null, msgs);
			msgs = basicSetRXE8(newRXE8, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE8, newRXE8, newRXE8));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE9CONTENT getRXE9() {
		return rXE9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE9(RXE9CONTENT newRXE9, NotificationChain msgs) {
		RXE9CONTENT oldRXE9 = rXE9;
		rXE9 = newRXE9;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE9, oldRXE9, newRXE9);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE9(RXE9CONTENT newRXE9) {
		if (newRXE9 != rXE9) {
			NotificationChain msgs = null;
			if (rXE9 != null)
				msgs = ((InternalEObject)rXE9).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE9, null, msgs);
			if (newRXE9 != null)
				msgs = ((InternalEObject)newRXE9).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE9, null, msgs);
			msgs = basicSetRXE9(newRXE9, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE9, newRXE9, newRXE9));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE10CONTENT getRXE10() {
		return rXE10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE10(RXE10CONTENT newRXE10, NotificationChain msgs) {
		RXE10CONTENT oldRXE10 = rXE10;
		rXE10 = newRXE10;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE10, oldRXE10, newRXE10);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE10(RXE10CONTENT newRXE10) {
		if (newRXE10 != rXE10) {
			NotificationChain msgs = null;
			if (rXE10 != null)
				msgs = ((InternalEObject)rXE10).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE10, null, msgs);
			if (newRXE10 != null)
				msgs = ((InternalEObject)newRXE10).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE10, null, msgs);
			msgs = basicSetRXE10(newRXE10, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE10, newRXE10, newRXE10));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE11CONTENT getRXE11() {
		return rXE11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE11(RXE11CONTENT newRXE11, NotificationChain msgs) {
		RXE11CONTENT oldRXE11 = rXE11;
		rXE11 = newRXE11;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE11, oldRXE11, newRXE11);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE11(RXE11CONTENT newRXE11) {
		if (newRXE11 != rXE11) {
			NotificationChain msgs = null;
			if (rXE11 != null)
				msgs = ((InternalEObject)rXE11).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE11, null, msgs);
			if (newRXE11 != null)
				msgs = ((InternalEObject)newRXE11).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE11, null, msgs);
			msgs = basicSetRXE11(newRXE11, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE11, newRXE11, newRXE11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE12CONTENT getRXE12() {
		return rXE12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE12(RXE12CONTENT newRXE12, NotificationChain msgs) {
		RXE12CONTENT oldRXE12 = rXE12;
		rXE12 = newRXE12;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE12, oldRXE12, newRXE12);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE12(RXE12CONTENT newRXE12) {
		if (newRXE12 != rXE12) {
			NotificationChain msgs = null;
			if (rXE12 != null)
				msgs = ((InternalEObject)rXE12).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE12, null, msgs);
			if (newRXE12 != null)
				msgs = ((InternalEObject)newRXE12).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE12, null, msgs);
			msgs = basicSetRXE12(newRXE12, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE12, newRXE12, newRXE12));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE13CONTENT> getRXE13() {
		if (rXE13 == null) {
			rXE13 = new EObjectContainmentEList<RXE13CONTENT>(RXE13CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE13);
		}
		return rXE13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE14CONTENT> getRXE14() {
		if (rXE14 == null) {
			rXE14 = new EObjectContainmentEList<RXE14CONTENT>(RXE14CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE14);
		}
		return rXE14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE15CONTENT getRXE15() {
		return rXE15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE15(RXE15CONTENT newRXE15, NotificationChain msgs) {
		RXE15CONTENT oldRXE15 = rXE15;
		rXE15 = newRXE15;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE15, oldRXE15, newRXE15);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE15(RXE15CONTENT newRXE15) {
		if (newRXE15 != rXE15) {
			NotificationChain msgs = null;
			if (rXE15 != null)
				msgs = ((InternalEObject)rXE15).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE15, null, msgs);
			if (newRXE15 != null)
				msgs = ((InternalEObject)newRXE15).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE15, null, msgs);
			msgs = basicSetRXE15(newRXE15, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE15, newRXE15, newRXE15));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE16CONTENT getRXE16() {
		return rXE16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE16(RXE16CONTENT newRXE16, NotificationChain msgs) {
		RXE16CONTENT oldRXE16 = rXE16;
		rXE16 = newRXE16;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE16, oldRXE16, newRXE16);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE16(RXE16CONTENT newRXE16) {
		if (newRXE16 != rXE16) {
			NotificationChain msgs = null;
			if (rXE16 != null)
				msgs = ((InternalEObject)rXE16).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE16, null, msgs);
			if (newRXE16 != null)
				msgs = ((InternalEObject)newRXE16).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE16, null, msgs);
			msgs = basicSetRXE16(newRXE16, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE16, newRXE16, newRXE16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE17CONTENT getRXE17() {
		return rXE17;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE17(RXE17CONTENT newRXE17, NotificationChain msgs) {
		RXE17CONTENT oldRXE17 = rXE17;
		rXE17 = newRXE17;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE17, oldRXE17, newRXE17);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE17(RXE17CONTENT newRXE17) {
		if (newRXE17 != rXE17) {
			NotificationChain msgs = null;
			if (rXE17 != null)
				msgs = ((InternalEObject)rXE17).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE17, null, msgs);
			if (newRXE17 != null)
				msgs = ((InternalEObject)newRXE17).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE17, null, msgs);
			msgs = basicSetRXE17(newRXE17, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE17, newRXE17, newRXE17));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE18CONTENT getRXE18() {
		return rXE18;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE18(RXE18CONTENT newRXE18, NotificationChain msgs) {
		RXE18CONTENT oldRXE18 = rXE18;
		rXE18 = newRXE18;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE18, oldRXE18, newRXE18);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE18(RXE18CONTENT newRXE18) {
		if (newRXE18 != rXE18) {
			NotificationChain msgs = null;
			if (rXE18 != null)
				msgs = ((InternalEObject)rXE18).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE18, null, msgs);
			if (newRXE18 != null)
				msgs = ((InternalEObject)newRXE18).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE18, null, msgs);
			msgs = basicSetRXE18(newRXE18, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE18, newRXE18, newRXE18));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE19CONTENT getRXE19() {
		return rXE19;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE19(RXE19CONTENT newRXE19, NotificationChain msgs) {
		RXE19CONTENT oldRXE19 = rXE19;
		rXE19 = newRXE19;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE19, oldRXE19, newRXE19);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE19(RXE19CONTENT newRXE19) {
		if (newRXE19 != rXE19) {
			NotificationChain msgs = null;
			if (rXE19 != null)
				msgs = ((InternalEObject)rXE19).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE19, null, msgs);
			if (newRXE19 != null)
				msgs = ((InternalEObject)newRXE19).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE19, null, msgs);
			msgs = basicSetRXE19(newRXE19, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE19, newRXE19, newRXE19));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE20CONTENT getRXE20() {
		return rXE20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE20(RXE20CONTENT newRXE20, NotificationChain msgs) {
		RXE20CONTENT oldRXE20 = rXE20;
		rXE20 = newRXE20;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE20, oldRXE20, newRXE20);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE20(RXE20CONTENT newRXE20) {
		if (newRXE20 != rXE20) {
			NotificationChain msgs = null;
			if (rXE20 != null)
				msgs = ((InternalEObject)rXE20).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE20, null, msgs);
			if (newRXE20 != null)
				msgs = ((InternalEObject)newRXE20).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE20, null, msgs);
			msgs = basicSetRXE20(newRXE20, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE20, newRXE20, newRXE20));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE21CONTENT> getRXE21() {
		if (rXE21 == null) {
			rXE21 = new EObjectContainmentEList<RXE21CONTENT>(RXE21CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE21);
		}
		return rXE21;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE22CONTENT getRXE22() {
		return rXE22;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE22(RXE22CONTENT newRXE22, NotificationChain msgs) {
		RXE22CONTENT oldRXE22 = rXE22;
		rXE22 = newRXE22;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE22, oldRXE22, newRXE22);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE22(RXE22CONTENT newRXE22) {
		if (newRXE22 != rXE22) {
			NotificationChain msgs = null;
			if (rXE22 != null)
				msgs = ((InternalEObject)rXE22).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE22, null, msgs);
			if (newRXE22 != null)
				msgs = ((InternalEObject)newRXE22).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE22, null, msgs);
			msgs = basicSetRXE22(newRXE22, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE22, newRXE22, newRXE22));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE23CONTENT getRXE23() {
		return rXE23;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE23(RXE23CONTENT newRXE23, NotificationChain msgs) {
		RXE23CONTENT oldRXE23 = rXE23;
		rXE23 = newRXE23;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE23, oldRXE23, newRXE23);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE23(RXE23CONTENT newRXE23) {
		if (newRXE23 != rXE23) {
			NotificationChain msgs = null;
			if (rXE23 != null)
				msgs = ((InternalEObject)rXE23).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE23, null, msgs);
			if (newRXE23 != null)
				msgs = ((InternalEObject)newRXE23).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE23, null, msgs);
			msgs = basicSetRXE23(newRXE23, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE23, newRXE23, newRXE23));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE24CONTENT getRXE24() {
		return rXE24;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE24(RXE24CONTENT newRXE24, NotificationChain msgs) {
		RXE24CONTENT oldRXE24 = rXE24;
		rXE24 = newRXE24;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE24, oldRXE24, newRXE24);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE24(RXE24CONTENT newRXE24) {
		if (newRXE24 != rXE24) {
			NotificationChain msgs = null;
			if (rXE24 != null)
				msgs = ((InternalEObject)rXE24).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE24, null, msgs);
			if (newRXE24 != null)
				msgs = ((InternalEObject)newRXE24).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE24, null, msgs);
			msgs = basicSetRXE24(newRXE24, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE24, newRXE24, newRXE24));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE25CONTENT getRXE25() {
		return rXE25;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE25(RXE25CONTENT newRXE25, NotificationChain msgs) {
		RXE25CONTENT oldRXE25 = rXE25;
		rXE25 = newRXE25;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE25, oldRXE25, newRXE25);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE25(RXE25CONTENT newRXE25) {
		if (newRXE25 != rXE25) {
			NotificationChain msgs = null;
			if (rXE25 != null)
				msgs = ((InternalEObject)rXE25).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE25, null, msgs);
			if (newRXE25 != null)
				msgs = ((InternalEObject)newRXE25).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE25, null, msgs);
			msgs = basicSetRXE25(newRXE25, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE25, newRXE25, newRXE25));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE26CONTENT getRXE26() {
		return rXE26;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE26(RXE26CONTENT newRXE26, NotificationChain msgs) {
		RXE26CONTENT oldRXE26 = rXE26;
		rXE26 = newRXE26;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE26, oldRXE26, newRXE26);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE26(RXE26CONTENT newRXE26) {
		if (newRXE26 != rXE26) {
			NotificationChain msgs = null;
			if (rXE26 != null)
				msgs = ((InternalEObject)rXE26).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE26, null, msgs);
			if (newRXE26 != null)
				msgs = ((InternalEObject)newRXE26).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE26, null, msgs);
			msgs = basicSetRXE26(newRXE26, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE26, newRXE26, newRXE26));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE27CONTENT> getRXE27() {
		if (rXE27 == null) {
			rXE27 = new EObjectContainmentEList<RXE27CONTENT>(RXE27CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE27);
		}
		return rXE27;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE28CONTENT getRXE28() {
		return rXE28;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE28(RXE28CONTENT newRXE28, NotificationChain msgs) {
		RXE28CONTENT oldRXE28 = rXE28;
		rXE28 = newRXE28;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE28, oldRXE28, newRXE28);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE28(RXE28CONTENT newRXE28) {
		if (newRXE28 != rXE28) {
			NotificationChain msgs = null;
			if (rXE28 != null)
				msgs = ((InternalEObject)rXE28).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE28, null, msgs);
			if (newRXE28 != null)
				msgs = ((InternalEObject)newRXE28).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE28, null, msgs);
			msgs = basicSetRXE28(newRXE28, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE28, newRXE28, newRXE28));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE29CONTENT getRXE29() {
		return rXE29;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE29(RXE29CONTENT newRXE29, NotificationChain msgs) {
		RXE29CONTENT oldRXE29 = rXE29;
		rXE29 = newRXE29;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE29, oldRXE29, newRXE29);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE29(RXE29CONTENT newRXE29) {
		if (newRXE29 != rXE29) {
			NotificationChain msgs = null;
			if (rXE29 != null)
				msgs = ((InternalEObject)rXE29).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE29, null, msgs);
			if (newRXE29 != null)
				msgs = ((InternalEObject)newRXE29).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE29, null, msgs);
			msgs = basicSetRXE29(newRXE29, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE29, newRXE29, newRXE29));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE30CONTENT getRXE30() {
		return rXE30;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE30(RXE30CONTENT newRXE30, NotificationChain msgs) {
		RXE30CONTENT oldRXE30 = rXE30;
		rXE30 = newRXE30;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE30, oldRXE30, newRXE30);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE30(RXE30CONTENT newRXE30) {
		if (newRXE30 != rXE30) {
			NotificationChain msgs = null;
			if (rXE30 != null)
				msgs = ((InternalEObject)rXE30).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE30, null, msgs);
			if (newRXE30 != null)
				msgs = ((InternalEObject)newRXE30).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE30, null, msgs);
			msgs = basicSetRXE30(newRXE30, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE30, newRXE30, newRXE30));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE31CONTENT> getRXE31() {
		if (rXE31 == null) {
			rXE31 = new EObjectContainmentEList<RXE31CONTENT>(RXE31CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE31);
		}
		return rXE31;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE32CONTENT getRXE32() {
		return rXE32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE32(RXE32CONTENT newRXE32, NotificationChain msgs) {
		RXE32CONTENT oldRXE32 = rXE32;
		rXE32 = newRXE32;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE32, oldRXE32, newRXE32);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE32(RXE32CONTENT newRXE32) {
		if (newRXE32 != rXE32) {
			NotificationChain msgs = null;
			if (rXE32 != null)
				msgs = ((InternalEObject)rXE32).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE32, null, msgs);
			if (newRXE32 != null)
				msgs = ((InternalEObject)newRXE32).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE32, null, msgs);
			msgs = basicSetRXE32(newRXE32, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE32, newRXE32, newRXE32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE33CONTENT getRXE33() {
		return rXE33;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE33(RXE33CONTENT newRXE33, NotificationChain msgs) {
		RXE33CONTENT oldRXE33 = rXE33;
		rXE33 = newRXE33;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE33, oldRXE33, newRXE33);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE33(RXE33CONTENT newRXE33) {
		if (newRXE33 != rXE33) {
			NotificationChain msgs = null;
			if (rXE33 != null)
				msgs = ((InternalEObject)rXE33).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE33, null, msgs);
			if (newRXE33 != null)
				msgs = ((InternalEObject)newRXE33).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE33, null, msgs);
			msgs = basicSetRXE33(newRXE33, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE33, newRXE33, newRXE33));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE34CONTENT getRXE34() {
		return rXE34;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE34(RXE34CONTENT newRXE34, NotificationChain msgs) {
		RXE34CONTENT oldRXE34 = rXE34;
		rXE34 = newRXE34;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE34, oldRXE34, newRXE34);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE34(RXE34CONTENT newRXE34) {
		if (newRXE34 != rXE34) {
			NotificationChain msgs = null;
			if (rXE34 != null)
				msgs = ((InternalEObject)rXE34).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE34, null, msgs);
			if (newRXE34 != null)
				msgs = ((InternalEObject)newRXE34).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE34, null, msgs);
			msgs = basicSetRXE34(newRXE34, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE34, newRXE34, newRXE34));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE35CONTENT getRXE35() {
		return rXE35;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE35(RXE35CONTENT newRXE35, NotificationChain msgs) {
		RXE35CONTENT oldRXE35 = rXE35;
		rXE35 = newRXE35;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE35, oldRXE35, newRXE35);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE35(RXE35CONTENT newRXE35) {
		if (newRXE35 != rXE35) {
			NotificationChain msgs = null;
			if (rXE35 != null)
				msgs = ((InternalEObject)rXE35).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE35, null, msgs);
			if (newRXE35 != null)
				msgs = ((InternalEObject)newRXE35).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE35, null, msgs);
			msgs = basicSetRXE35(newRXE35, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE35, newRXE35, newRXE35));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE36CONTENT getRXE36() {
		return rXE36;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE36(RXE36CONTENT newRXE36, NotificationChain msgs) {
		RXE36CONTENT oldRXE36 = rXE36;
		rXE36 = newRXE36;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE36, oldRXE36, newRXE36);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE36(RXE36CONTENT newRXE36) {
		if (newRXE36 != rXE36) {
			NotificationChain msgs = null;
			if (rXE36 != null)
				msgs = ((InternalEObject)rXE36).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE36, null, msgs);
			if (newRXE36 != null)
				msgs = ((InternalEObject)newRXE36).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE36, null, msgs);
			msgs = basicSetRXE36(newRXE36, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE36, newRXE36, newRXE36));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RXE37CONTENT> getRXE37() {
		if (rXE37 == null) {
			rXE37 = new EObjectContainmentEList<RXE37CONTENT>(RXE37CONTENT.class, this, V2xmlPackage.RXECONTENT__RXE37);
		}
		return rXE37;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE38CONTENT getRXE38() {
		return rXE38;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE38(RXE38CONTENT newRXE38, NotificationChain msgs) {
		RXE38CONTENT oldRXE38 = rXE38;
		rXE38 = newRXE38;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE38, oldRXE38, newRXE38);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE38(RXE38CONTENT newRXE38) {
		if (newRXE38 != rXE38) {
			NotificationChain msgs = null;
			if (rXE38 != null)
				msgs = ((InternalEObject)rXE38).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE38, null, msgs);
			if (newRXE38 != null)
				msgs = ((InternalEObject)newRXE38).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE38, null, msgs);
			msgs = basicSetRXE38(newRXE38, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE38, newRXE38, newRXE38));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE39CONTENT getRXE39() {
		return rXE39;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE39(RXE39CONTENT newRXE39, NotificationChain msgs) {
		RXE39CONTENT oldRXE39 = rXE39;
		rXE39 = newRXE39;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE39, oldRXE39, newRXE39);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE39(RXE39CONTENT newRXE39) {
		if (newRXE39 != rXE39) {
			NotificationChain msgs = null;
			if (rXE39 != null)
				msgs = ((InternalEObject)rXE39).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE39, null, msgs);
			if (newRXE39 != null)
				msgs = ((InternalEObject)newRXE39).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE39, null, msgs);
			msgs = basicSetRXE39(newRXE39, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE39, newRXE39, newRXE39));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE40CONTENT getRXE40() {
		return rXE40;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE40(RXE40CONTENT newRXE40, NotificationChain msgs) {
		RXE40CONTENT oldRXE40 = rXE40;
		rXE40 = newRXE40;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE40, oldRXE40, newRXE40);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE40(RXE40CONTENT newRXE40) {
		if (newRXE40 != rXE40) {
			NotificationChain msgs = null;
			if (rXE40 != null)
				msgs = ((InternalEObject)rXE40).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE40, null, msgs);
			if (newRXE40 != null)
				msgs = ((InternalEObject)newRXE40).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE40, null, msgs);
			msgs = basicSetRXE40(newRXE40, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE40, newRXE40, newRXE40));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE41CONTENT getRXE41() {
		return rXE41;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE41(RXE41CONTENT newRXE41, NotificationChain msgs) {
		RXE41CONTENT oldRXE41 = rXE41;
		rXE41 = newRXE41;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE41, oldRXE41, newRXE41);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE41(RXE41CONTENT newRXE41) {
		if (newRXE41 != rXE41) {
			NotificationChain msgs = null;
			if (rXE41 != null)
				msgs = ((InternalEObject)rXE41).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE41, null, msgs);
			if (newRXE41 != null)
				msgs = ((InternalEObject)newRXE41).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE41, null, msgs);
			msgs = basicSetRXE41(newRXE41, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE41, newRXE41, newRXE41));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE42CONTENT getRXE42() {
		return rXE42;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE42(RXE42CONTENT newRXE42, NotificationChain msgs) {
		RXE42CONTENT oldRXE42 = rXE42;
		rXE42 = newRXE42;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE42, oldRXE42, newRXE42);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE42(RXE42CONTENT newRXE42) {
		if (newRXE42 != rXE42) {
			NotificationChain msgs = null;
			if (rXE42 != null)
				msgs = ((InternalEObject)rXE42).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE42, null, msgs);
			if (newRXE42 != null)
				msgs = ((InternalEObject)newRXE42).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE42, null, msgs);
			msgs = basicSetRXE42(newRXE42, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE42, newRXE42, newRXE42));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE43CONTENT getRXE43() {
		return rXE43;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE43(RXE43CONTENT newRXE43, NotificationChain msgs) {
		RXE43CONTENT oldRXE43 = rXE43;
		rXE43 = newRXE43;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE43, oldRXE43, newRXE43);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE43(RXE43CONTENT newRXE43) {
		if (newRXE43 != rXE43) {
			NotificationChain msgs = null;
			if (rXE43 != null)
				msgs = ((InternalEObject)rXE43).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE43, null, msgs);
			if (newRXE43 != null)
				msgs = ((InternalEObject)newRXE43).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE43, null, msgs);
			msgs = basicSetRXE43(newRXE43, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE43, newRXE43, newRXE43));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RXE44CONTENT getRXE44() {
		return rXE44;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRXE44(RXE44CONTENT newRXE44, NotificationChain msgs) {
		RXE44CONTENT oldRXE44 = rXE44;
		rXE44 = newRXE44;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE44, oldRXE44, newRXE44);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRXE44(RXE44CONTENT newRXE44) {
		if (newRXE44 != rXE44) {
			NotificationChain msgs = null;
			if (rXE44 != null)
				msgs = ((InternalEObject)rXE44).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE44, null, msgs);
			if (newRXE44 != null)
				msgs = ((InternalEObject)newRXE44).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - V2xmlPackage.RXECONTENT__RXE44, null, msgs);
			msgs = basicSetRXE44(newRXE44, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, V2xmlPackage.RXECONTENT__RXE44, newRXE44, newRXE44));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, V2xmlPackage.RXECONTENT__ANY);
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
			case V2xmlPackage.RXECONTENT__RXE1:
				return basicSetRXE1(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE2:
				return basicSetRXE2(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE3:
				return basicSetRXE3(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE4:
				return basicSetRXE4(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE5:
				return basicSetRXE5(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE6:
				return basicSetRXE6(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE7:
				return ((InternalEList<?>)getRXE7()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE8:
				return basicSetRXE8(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE9:
				return basicSetRXE9(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE10:
				return basicSetRXE10(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE11:
				return basicSetRXE11(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE12:
				return basicSetRXE12(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE13:
				return ((InternalEList<?>)getRXE13()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE14:
				return ((InternalEList<?>)getRXE14()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE15:
				return basicSetRXE15(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE16:
				return basicSetRXE16(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE17:
				return basicSetRXE17(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE18:
				return basicSetRXE18(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE19:
				return basicSetRXE19(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE20:
				return basicSetRXE20(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE21:
				return ((InternalEList<?>)getRXE21()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE22:
				return basicSetRXE22(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE23:
				return basicSetRXE23(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE24:
				return basicSetRXE24(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE25:
				return basicSetRXE25(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE26:
				return basicSetRXE26(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE27:
				return ((InternalEList<?>)getRXE27()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE28:
				return basicSetRXE28(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE29:
				return basicSetRXE29(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE30:
				return basicSetRXE30(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE31:
				return ((InternalEList<?>)getRXE31()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE32:
				return basicSetRXE32(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE33:
				return basicSetRXE33(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE34:
				return basicSetRXE34(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE35:
				return basicSetRXE35(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE36:
				return basicSetRXE36(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE37:
				return ((InternalEList<?>)getRXE37()).basicRemove(otherEnd, msgs);
			case V2xmlPackage.RXECONTENT__RXE38:
				return basicSetRXE38(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE39:
				return basicSetRXE39(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE40:
				return basicSetRXE40(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE41:
				return basicSetRXE41(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE42:
				return basicSetRXE42(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE43:
				return basicSetRXE43(null, msgs);
			case V2xmlPackage.RXECONTENT__RXE44:
				return basicSetRXE44(null, msgs);
			case V2xmlPackage.RXECONTENT__ANY:
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
			case V2xmlPackage.RXECONTENT__RXE1:
				return getRXE1();
			case V2xmlPackage.RXECONTENT__RXE2:
				return getRXE2();
			case V2xmlPackage.RXECONTENT__RXE3:
				return getRXE3();
			case V2xmlPackage.RXECONTENT__RXE4:
				return getRXE4();
			case V2xmlPackage.RXECONTENT__RXE5:
				return getRXE5();
			case V2xmlPackage.RXECONTENT__RXE6:
				return getRXE6();
			case V2xmlPackage.RXECONTENT__RXE7:
				return getRXE7();
			case V2xmlPackage.RXECONTENT__RXE8:
				return getRXE8();
			case V2xmlPackage.RXECONTENT__RXE9:
				return getRXE9();
			case V2xmlPackage.RXECONTENT__RXE10:
				return getRXE10();
			case V2xmlPackage.RXECONTENT__RXE11:
				return getRXE11();
			case V2xmlPackage.RXECONTENT__RXE12:
				return getRXE12();
			case V2xmlPackage.RXECONTENT__RXE13:
				return getRXE13();
			case V2xmlPackage.RXECONTENT__RXE14:
				return getRXE14();
			case V2xmlPackage.RXECONTENT__RXE15:
				return getRXE15();
			case V2xmlPackage.RXECONTENT__RXE16:
				return getRXE16();
			case V2xmlPackage.RXECONTENT__RXE17:
				return getRXE17();
			case V2xmlPackage.RXECONTENT__RXE18:
				return getRXE18();
			case V2xmlPackage.RXECONTENT__RXE19:
				return getRXE19();
			case V2xmlPackage.RXECONTENT__RXE20:
				return getRXE20();
			case V2xmlPackage.RXECONTENT__RXE21:
				return getRXE21();
			case V2xmlPackage.RXECONTENT__RXE22:
				return getRXE22();
			case V2xmlPackage.RXECONTENT__RXE23:
				return getRXE23();
			case V2xmlPackage.RXECONTENT__RXE24:
				return getRXE24();
			case V2xmlPackage.RXECONTENT__RXE25:
				return getRXE25();
			case V2xmlPackage.RXECONTENT__RXE26:
				return getRXE26();
			case V2xmlPackage.RXECONTENT__RXE27:
				return getRXE27();
			case V2xmlPackage.RXECONTENT__RXE28:
				return getRXE28();
			case V2xmlPackage.RXECONTENT__RXE29:
				return getRXE29();
			case V2xmlPackage.RXECONTENT__RXE30:
				return getRXE30();
			case V2xmlPackage.RXECONTENT__RXE31:
				return getRXE31();
			case V2xmlPackage.RXECONTENT__RXE32:
				return getRXE32();
			case V2xmlPackage.RXECONTENT__RXE33:
				return getRXE33();
			case V2xmlPackage.RXECONTENT__RXE34:
				return getRXE34();
			case V2xmlPackage.RXECONTENT__RXE35:
				return getRXE35();
			case V2xmlPackage.RXECONTENT__RXE36:
				return getRXE36();
			case V2xmlPackage.RXECONTENT__RXE37:
				return getRXE37();
			case V2xmlPackage.RXECONTENT__RXE38:
				return getRXE38();
			case V2xmlPackage.RXECONTENT__RXE39:
				return getRXE39();
			case V2xmlPackage.RXECONTENT__RXE40:
				return getRXE40();
			case V2xmlPackage.RXECONTENT__RXE41:
				return getRXE41();
			case V2xmlPackage.RXECONTENT__RXE42:
				return getRXE42();
			case V2xmlPackage.RXECONTENT__RXE43:
				return getRXE43();
			case V2xmlPackage.RXECONTENT__RXE44:
				return getRXE44();
			case V2xmlPackage.RXECONTENT__ANY:
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
			case V2xmlPackage.RXECONTENT__RXE1:
				setRXE1((RXE1CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE2:
				setRXE2((RXE2CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE3:
				setRXE3((RXE3CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE4:
				setRXE4((RXE4CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE5:
				setRXE5((RXE5CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE6:
				setRXE6((RXE6CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE7:
				getRXE7().clear();
				getRXE7().addAll((Collection<? extends RXE7CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE8:
				setRXE8((RXE8CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE9:
				setRXE9((RXE9CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE10:
				setRXE10((RXE10CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE11:
				setRXE11((RXE11CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE12:
				setRXE12((RXE12CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE13:
				getRXE13().clear();
				getRXE13().addAll((Collection<? extends RXE13CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE14:
				getRXE14().clear();
				getRXE14().addAll((Collection<? extends RXE14CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE15:
				setRXE15((RXE15CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE16:
				setRXE16((RXE16CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE17:
				setRXE17((RXE17CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE18:
				setRXE18((RXE18CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE19:
				setRXE19((RXE19CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE20:
				setRXE20((RXE20CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE21:
				getRXE21().clear();
				getRXE21().addAll((Collection<? extends RXE21CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE22:
				setRXE22((RXE22CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE23:
				setRXE23((RXE23CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE24:
				setRXE24((RXE24CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE25:
				setRXE25((RXE25CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE26:
				setRXE26((RXE26CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE27:
				getRXE27().clear();
				getRXE27().addAll((Collection<? extends RXE27CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE28:
				setRXE28((RXE28CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE29:
				setRXE29((RXE29CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE30:
				setRXE30((RXE30CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE31:
				getRXE31().clear();
				getRXE31().addAll((Collection<? extends RXE31CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE32:
				setRXE32((RXE32CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE33:
				setRXE33((RXE33CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE34:
				setRXE34((RXE34CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE35:
				setRXE35((RXE35CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE36:
				setRXE36((RXE36CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE37:
				getRXE37().clear();
				getRXE37().addAll((Collection<? extends RXE37CONTENT>)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE38:
				setRXE38((RXE38CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE39:
				setRXE39((RXE39CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE40:
				setRXE40((RXE40CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE41:
				setRXE41((RXE41CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE42:
				setRXE42((RXE42CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE43:
				setRXE43((RXE43CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__RXE44:
				setRXE44((RXE44CONTENT)newValue);
				return;
			case V2xmlPackage.RXECONTENT__ANY:
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
			case V2xmlPackage.RXECONTENT__RXE1:
				setRXE1((RXE1CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE2:
				setRXE2((RXE2CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE3:
				setRXE3((RXE3CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE4:
				setRXE4((RXE4CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE5:
				setRXE5((RXE5CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE6:
				setRXE6((RXE6CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE7:
				getRXE7().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE8:
				setRXE8((RXE8CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE9:
				setRXE9((RXE9CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE10:
				setRXE10((RXE10CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE11:
				setRXE11((RXE11CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE12:
				setRXE12((RXE12CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE13:
				getRXE13().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE14:
				getRXE14().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE15:
				setRXE15((RXE15CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE16:
				setRXE16((RXE16CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE17:
				setRXE17((RXE17CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE18:
				setRXE18((RXE18CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE19:
				setRXE19((RXE19CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE20:
				setRXE20((RXE20CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE21:
				getRXE21().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE22:
				setRXE22((RXE22CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE23:
				setRXE23((RXE23CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE24:
				setRXE24((RXE24CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE25:
				setRXE25((RXE25CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE26:
				setRXE26((RXE26CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE27:
				getRXE27().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE28:
				setRXE28((RXE28CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE29:
				setRXE29((RXE29CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE30:
				setRXE30((RXE30CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE31:
				getRXE31().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE32:
				setRXE32((RXE32CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE33:
				setRXE33((RXE33CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE34:
				setRXE34((RXE34CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE35:
				setRXE35((RXE35CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE36:
				setRXE36((RXE36CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE37:
				getRXE37().clear();
				return;
			case V2xmlPackage.RXECONTENT__RXE38:
				setRXE38((RXE38CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE39:
				setRXE39((RXE39CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE40:
				setRXE40((RXE40CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE41:
				setRXE41((RXE41CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE42:
				setRXE42((RXE42CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE43:
				setRXE43((RXE43CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__RXE44:
				setRXE44((RXE44CONTENT)null);
				return;
			case V2xmlPackage.RXECONTENT__ANY:
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
			case V2xmlPackage.RXECONTENT__RXE1:
				return rXE1 != null;
			case V2xmlPackage.RXECONTENT__RXE2:
				return rXE2 != null;
			case V2xmlPackage.RXECONTENT__RXE3:
				return rXE3 != null;
			case V2xmlPackage.RXECONTENT__RXE4:
				return rXE4 != null;
			case V2xmlPackage.RXECONTENT__RXE5:
				return rXE5 != null;
			case V2xmlPackage.RXECONTENT__RXE6:
				return rXE6 != null;
			case V2xmlPackage.RXECONTENT__RXE7:
				return rXE7 != null && !rXE7.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE8:
				return rXE8 != null;
			case V2xmlPackage.RXECONTENT__RXE9:
				return rXE9 != null;
			case V2xmlPackage.RXECONTENT__RXE10:
				return rXE10 != null;
			case V2xmlPackage.RXECONTENT__RXE11:
				return rXE11 != null;
			case V2xmlPackage.RXECONTENT__RXE12:
				return rXE12 != null;
			case V2xmlPackage.RXECONTENT__RXE13:
				return rXE13 != null && !rXE13.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE14:
				return rXE14 != null && !rXE14.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE15:
				return rXE15 != null;
			case V2xmlPackage.RXECONTENT__RXE16:
				return rXE16 != null;
			case V2xmlPackage.RXECONTENT__RXE17:
				return rXE17 != null;
			case V2xmlPackage.RXECONTENT__RXE18:
				return rXE18 != null;
			case V2xmlPackage.RXECONTENT__RXE19:
				return rXE19 != null;
			case V2xmlPackage.RXECONTENT__RXE20:
				return rXE20 != null;
			case V2xmlPackage.RXECONTENT__RXE21:
				return rXE21 != null && !rXE21.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE22:
				return rXE22 != null;
			case V2xmlPackage.RXECONTENT__RXE23:
				return rXE23 != null;
			case V2xmlPackage.RXECONTENT__RXE24:
				return rXE24 != null;
			case V2xmlPackage.RXECONTENT__RXE25:
				return rXE25 != null;
			case V2xmlPackage.RXECONTENT__RXE26:
				return rXE26 != null;
			case V2xmlPackage.RXECONTENT__RXE27:
				return rXE27 != null && !rXE27.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE28:
				return rXE28 != null;
			case V2xmlPackage.RXECONTENT__RXE29:
				return rXE29 != null;
			case V2xmlPackage.RXECONTENT__RXE30:
				return rXE30 != null;
			case V2xmlPackage.RXECONTENT__RXE31:
				return rXE31 != null && !rXE31.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE32:
				return rXE32 != null;
			case V2xmlPackage.RXECONTENT__RXE33:
				return rXE33 != null;
			case V2xmlPackage.RXECONTENT__RXE34:
				return rXE34 != null;
			case V2xmlPackage.RXECONTENT__RXE35:
				return rXE35 != null;
			case V2xmlPackage.RXECONTENT__RXE36:
				return rXE36 != null;
			case V2xmlPackage.RXECONTENT__RXE37:
				return rXE37 != null && !rXE37.isEmpty();
			case V2xmlPackage.RXECONTENT__RXE38:
				return rXE38 != null;
			case V2xmlPackage.RXECONTENT__RXE39:
				return rXE39 != null;
			case V2xmlPackage.RXECONTENT__RXE40:
				return rXE40 != null;
			case V2xmlPackage.RXECONTENT__RXE41:
				return rXE41 != null;
			case V2xmlPackage.RXECONTENT__RXE42:
				return rXE42 != null;
			case V2xmlPackage.RXECONTENT__RXE43:
				return rXE43 != null;
			case V2xmlPackage.RXECONTENT__RXE44:
				return rXE44 != null;
			case V2xmlPackage.RXECONTENT__ANY:
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

} //RXECONTENTImpl
